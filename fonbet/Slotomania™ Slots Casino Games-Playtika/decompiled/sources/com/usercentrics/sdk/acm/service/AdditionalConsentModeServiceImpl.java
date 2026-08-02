package com.usercentrics.sdk.acm.service;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.AdditionalConsentModeData;
import com.usercentrics.sdk.acm.repository.AdditionalConsentModeRemoteRepository;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AdditionalConsentModeServiceImpl.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0016\u0010\u001b\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\nH\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0002J\u001c\u0010$\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0096@¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010(\u001a\u00020\u00172\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010+\u001a\u00020\u00172\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeServiceImpl;", "Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;", "remoteRepository", "Lcom/usercentrics/sdk/acm/repository/AdditionalConsentModeRemoteRepository;", "deviceStorage", "Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "(Lcom/usercentrics/sdk/acm/repository/AdditionalConsentModeRemoteRepository;Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;Lcom/usercentrics/sdk/log/UsercentricsLogger;)V", "acString", "", "getAcString", "()Ljava/lang/String;", "setAcString", "(Ljava/lang/String;)V", "adTechProviderList", "", "Lcom/usercentrics/sdk/AdTechProvider;", "getAdTechProviderList", "()Ljava/util/List;", "setAdTechProviderList", "(Ljava/util/List;)V", "acceptAll", "", "canSaveConsents", "", "denyAll", "didATPSChange", "selectedIds", "", "emptyData", "Lcom/usercentrics/sdk/AdditionalConsentModeData;", "encodeACString", "getConsentedIdsFromACString", "getData", "getStoredATPS", "load", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadACString", "reset", "save", "consentedIds", "storeACString", "updateAdTechProvidersWith", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdditionalConsentModeServiceImpl implements AdditionalConsentModeService {
    private static final String AC_STRING_VERSION = "2";
    private static final String LOAD_EMPTY_LIST = "Error: cannot load Google Additional Consent Mode without selecting any vendor on Admin Interface";
    private static final String SAVE_ERROR = "Error when saving user consents for Google Additional Consent Mode. Cause: missing Ad Tech Provider list.";
    private String acString;
    private List<AdTechProvider> adTechProviderList;
    private final DeviceStorage deviceStorage;
    private final UsercentricsLogger logger;
    private final AdditionalConsentModeRemoteRepository remoteRepository;

    public AdditionalConsentModeServiceImpl(AdditionalConsentModeRemoteRepository remoteRepository, DeviceStorage deviceStorage, UsercentricsLogger logger) {
        Intrinsics.checkNotNullParameter(remoteRepository, "remoteRepository");
        Intrinsics.checkNotNullParameter(deviceStorage, "deviceStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.remoteRepository = remoteRepository;
        this.deviceStorage = deviceStorage;
        this.logger = logger;
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public List<AdTechProvider> getAdTechProviderList() {
        return this.adTechProviderList;
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void setAdTechProviderList(List<AdTechProvider> list) {
        this.adTechProviderList = list;
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public String getAcString() {
        return this.acString;
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void setAcString(String str) {
        this.acString = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(List<Integer> list, Continuation<? super Unit> continuation) {
        AdditionalConsentModeServiceImpl$load$1 additionalConsentModeServiceImpl$load$1;
        int i;
        AdditionalConsentModeServiceImpl additionalConsentModeServiceImpl;
        if (continuation instanceof AdditionalConsentModeServiceImpl$load$1) {
            additionalConsentModeServiceImpl$load$1 = (AdditionalConsentModeServiceImpl$load$1) continuation;
            if ((additionalConsentModeServiceImpl$load$1.label & Integer.MIN_VALUE) != 0) {
                additionalConsentModeServiceImpl$load$1.label -= Integer.MIN_VALUE;
                Object obj = additionalConsentModeServiceImpl$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = additionalConsentModeServiceImpl$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        UsercentricsLogger.DefaultImpls.error$default(this.logger, LOAD_EMPTY_LIST, null, 2, null);
                        return Unit.INSTANCE;
                    }
                    UsercentricsLogger.DefaultImpls.debug$default(this.logger, "Loading Google Additional Consent Mode Providers " + list, null, 2, null);
                    loadACString();
                    List<Integer> consentedIdsFromACString = getConsentedIdsFromACString();
                    AdditionalConsentModeRemoteRepository additionalConsentModeRemoteRepository = this.remoteRepository;
                    additionalConsentModeServiceImpl$load$1.L$0 = this;
                    additionalConsentModeServiceImpl$load$1.label = 1;
                    obj = additionalConsentModeRemoteRepository.loadAdTechProviderList(list, consentedIdsFromACString, additionalConsentModeServiceImpl$load$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    additionalConsentModeServiceImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    additionalConsentModeServiceImpl = (AdditionalConsentModeServiceImpl) additionalConsentModeServiceImpl$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                additionalConsentModeServiceImpl.setAdTechProviderList((List) obj);
                return Unit.INSTANCE;
            }
        }
        additionalConsentModeServiceImpl$load$1 = new AdditionalConsentModeServiceImpl$load$1(this, continuation);
        Object obj2 = additionalConsentModeServiceImpl$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = additionalConsentModeServiceImpl$load$1.label;
        if (i != 0) {
        }
        additionalConsentModeServiceImpl.setAdTechProviderList((List) obj2);
        return Unit.INSTANCE;
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void save(String acString) {
        Intrinsics.checkNotNullParameter(acString, "acString");
        if (StringsKt.isBlank(acString)) {
            return;
        }
        storeACString(acString);
        List<AdTechProvider> adTechProviderList = getAdTechProviderList();
        if (adTechProviderList == null || adTechProviderList.isEmpty()) {
            return;
        }
        updateAdTechProvidersWith(getConsentedIdsFromACString());
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void save(List<Integer> consentedIds) {
        Intrinsics.checkNotNullParameter(consentedIds, "consentedIds");
        if (canSaveConsents()) {
            updateAdTechProvidersWith(consentedIds);
            storeACString(encodeACString());
        }
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void acceptAll() {
        if (canSaveConsents()) {
            List<AdTechProvider> adTechProviderList = getAdTechProviderList();
            Intrinsics.checkNotNull(adTechProviderList);
            List<AdTechProvider> list = adTechProviderList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AdTechProvider) it.next()).getId()));
            }
            save(arrayList);
        }
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void denyAll() {
        if (canSaveConsents()) {
            save(CollectionsKt.emptyList());
        }
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public AdditionalConsentModeData getData() {
        String acString = getAcString();
        String str = acString;
        if (str == null || StringsKt.isBlank(str)) {
            return emptyData();
        }
        List<AdTechProvider> adTechProviderList = getAdTechProviderList();
        List<AdTechProvider> list = adTechProviderList;
        if (list == null || list.isEmpty()) {
            return emptyData();
        }
        return new AdditionalConsentModeData(acString, adTechProviderList);
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public void reset() {
        ArrayList arrayList;
        List<AdTechProvider> adTechProviderList = getAdTechProviderList();
        if (adTechProviderList != null) {
            List<AdTechProvider> list = adTechProviderList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AdTechProvider.copy$default((AdTechProvider) it.next(), 0, null, null, false, 7, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        setAdTechProviderList(arrayList);
        setAcString(encodeACString());
    }

    @Override // com.usercentrics.sdk.acm.service.AdditionalConsentModeService
    public boolean didATPSChange(List<Integer> selectedIds) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        return !Intrinsics.areEqual(selectedIds, getStoredATPS());
    }

    private final List<Integer> getStoredATPS() {
        String acString = getAcString();
        if (acString == null) {
            acString = "";
        }
        List split$default = StringsKt.split$default((CharSequence) acString, new String[]{"2~", "dv.", ".", "~"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return CollectionsKt.sorted(arrayList);
    }

    private final void loadACString() {
        setAcString(this.deviceStorage.getACString());
    }

    private final String encodeACString() {
        List<AdTechProvider> adTechProviderList = getAdTechProviderList();
        List<AdTechProvider> list = adTechProviderList;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (AdTechProvider adTechProvider : adTechProviderList) {
            StringBuilder sb3 = adTechProvider.getConsent() ? sb : sb2;
            if (sb3.length() > 0) {
                sb3.append(".");
            }
            sb3.append(adTechProvider.getId());
        }
        return "2~" + ((Object) sb) + "~dv." + ((Object) sb2);
    }

    private final List<Integer> getConsentedIdsFromACString() {
        String acString = getAcString();
        List split$default = acString != null ? StringsKt.split$default((CharSequence) acString, new String[]{"~"}, false, 0, 6, (Object) null) : null;
        if (split$default == null || split$default.size() != 3) {
            return CollectionsKt.emptyList();
        }
        List list = CollectionsKt.toList(StringsKt.split$default((CharSequence) split$default.get(1), new String[]{"."}, false, 0, 6, (Object) null));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return arrayList;
    }

    private final void storeACString(String acString) {
        setAcString(acString);
        this.deviceStorage.saveACString(acString);
    }

    private final void updateAdTechProvidersWith(List<Integer> consentedIds) {
        ArrayList arrayList;
        List<AdTechProvider> adTechProviderList = getAdTechProviderList();
        if (adTechProviderList != null) {
            List<AdTechProvider> list = adTechProviderList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (AdTechProvider adTechProvider : list) {
                arrayList2.add(AdTechProvider.copy$default(adTechProvider, 0, null, null, consentedIds.contains(Integer.valueOf(adTechProvider.getId())), 7, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        setAdTechProviderList(arrayList);
    }

    private final boolean canSaveConsents() {
        if (getAdTechProviderList() != null && (!r0.isEmpty())) {
            return true;
        }
        UsercentricsLogger.DefaultImpls.error$default(this.logger, SAVE_ERROR, null, 2, null);
        return false;
    }

    private final AdditionalConsentModeData emptyData() {
        return new AdditionalConsentModeData("", CollectionsKt.emptyList());
    }
}
