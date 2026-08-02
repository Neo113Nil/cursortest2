package com.usercentrics.sdk.v2.ruleset.service;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import com.usercentrics.sdk.v2.location.service.ILocationService;
import com.usercentrics.sdk.v2.ruleset.data.GeoRule;
import com.usercentrics.sdk.v2.ruleset.data.RuleSet;
import com.usercentrics.sdk.v2.ruleset.data.SessionGeoRule;
import com.usercentrics.sdk.v2.ruleset.repository.IRuleSetRepository;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuleSetService.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0013j\b\u0012\u0004\u0012\u00020\u0010`\u00142\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/usercentrics/sdk/v2/ruleset/service/RuleSetService;", "Lcom/usercentrics/sdk/v2/ruleset/service/IRuleSetService;", "ruleSetRepository", "Lcom/usercentrics/sdk/v2/ruleset/repository/IRuleSetRepository;", "locationService", "Lcom/usercentrics/sdk/v2/location/service/ILocationService;", "(Lcom/usercentrics/sdk/v2/ruleset/repository/IRuleSetRepository;Lcom/usercentrics/sdk/v2/location/service/ILocationService;)V", "findRuleForLocation", "Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;", EtagCacheStorage.ruleSetDir, "Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;", FirebaseAnalytics.Param.LOCATION, "Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;", "getActiveSettingsId", "Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "populateAllSettingsIds", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RuleSetService implements IRuleSetService {
    private final ILocationService locationService;
    private final IRuleSetRepository ruleSetRepository;

    public RuleSetService(IRuleSetRepository ruleSetRepository, ILocationService locationService) {
        Intrinsics.checkNotNullParameter(ruleSetRepository, "ruleSetRepository");
        Intrinsics.checkNotNullParameter(locationService, "locationService");
        this.ruleSetRepository = ruleSetRepository;
        this.locationService = locationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.ruleset.service.IRuleSetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getActiveSettingsId(String str, Continuation<? super SessionGeoRule> continuation) {
        RuleSetService$getActiveSettingsId$1 ruleSetService$getActiveSettingsId$1;
        int i;
        boolean z;
        RuleSetService ruleSetService;
        UsercentricsLocation usercentricsLocation;
        GeoRule findRuleForLocation;
        String settingsId;
        boolean z2;
        if (continuation instanceof RuleSetService$getActiveSettingsId$1) {
            ruleSetService$getActiveSettingsId$1 = (RuleSetService$getActiveSettingsId$1) continuation;
            if ((ruleSetService$getActiveSettingsId$1.label & Integer.MIN_VALUE) != 0) {
                ruleSetService$getActiveSettingsId$1.label -= Integer.MIN_VALUE;
                Object obj = ruleSetService$getActiveSettingsId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ruleSetService$getActiveSettingsId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean loadLocation = this.locationService.loadLocation();
                    ruleSetService$getActiveSettingsId$1.L$0 = this;
                    ruleSetService$getActiveSettingsId$1.Z$0 = loadLocation;
                    ruleSetService$getActiveSettingsId$1.label = 1;
                    Object fetchRuleSet = this.ruleSetRepository.fetchRuleSet(str, !loadLocation, ruleSetService$getActiveSettingsId$1);
                    if (fetchRuleSet == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = fetchRuleSet;
                    z = loadLocation;
                    ruleSetService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = ruleSetService$getActiveSettingsId$1.Z$0;
                    ruleSetService = (RuleSetService) ruleSetService$getActiveSettingsId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Pair pair = (Pair) obj;
                usercentricsLocation = (UsercentricsLocation) pair.getSecond();
                if (usercentricsLocation.isEmpty()) {
                    if (!z) {
                        throw new UsercentricsException(ApiErrors.LOCATION_NOT_AVAILABLE, null, 2, null);
                    }
                    usercentricsLocation = ruleSetService.locationService.getLocation();
                }
                RuleSet ruleSet = (RuleSet) pair.getFirst();
                findRuleForLocation = ruleSetService.findRuleForLocation(ruleSet, usercentricsLocation);
                if (findRuleForLocation != null) {
                    z2 = ruleSet.getDefaultRule().getNoShow();
                    settingsId = ruleSet.getDefaultRule().getSettingsId();
                } else {
                    settingsId = findRuleForLocation.getSettingsId();
                    z2 = false;
                }
                return new SessionGeoRule(settingsId, z2, usercentricsLocation, ruleSetService.populateAllSettingsIds(ruleSet));
            }
        }
        ruleSetService$getActiveSettingsId$1 = new RuleSetService$getActiveSettingsId$1(this, continuation);
        Object obj2 = ruleSetService$getActiveSettingsId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ruleSetService$getActiveSettingsId$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        usercentricsLocation = (UsercentricsLocation) pair2.getSecond();
        if (usercentricsLocation.isEmpty()) {
        }
        RuleSet ruleSet2 = (RuleSet) pair2.getFirst();
        findRuleForLocation = ruleSetService.findRuleForLocation(ruleSet2, usercentricsLocation);
        if (findRuleForLocation != null) {
        }
        return new SessionGeoRule(settingsId, z2, usercentricsLocation, ruleSetService.populateAllSettingsIds(ruleSet2));
    }

    private final HashSet<String> populateAllSettingsIds(RuleSet ruleSet) {
        HashSet<String> hashSetOf = SetsKt.hashSetOf(ruleSet.getDefaultRule().getSettingsId());
        Iterator<T> it = ruleSet.getRules().iterator();
        while (it.hasNext()) {
            hashSetOf.add(((GeoRule) it.next()).getSettingsId());
        }
        return hashSetOf;
    }

    private final GeoRule findRuleForLocation(RuleSet ruleSet, UsercentricsLocation location) {
        Iterator<GeoRule> it = ruleSet.getRules().iterator();
        GeoRule geoRule = null;
        GeoRule geoRule2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GeoRule next = it.next();
            if (next.getLocations().contains(location.getRegionCode())) {
                geoRule = next;
                break;
            }
            if (next.getLocations().contains(location.getCountryCode())) {
                geoRule2 = next;
            }
        }
        return geoRule == null ? geoRule2 : geoRule;
    }
}
