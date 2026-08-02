package com.usercentrics.sdk.services.dataFacade;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.ActualKt;
import com.usercentrics.sdk.acm.service.AdditionalConsentModeService;
import com.usercentrics.sdk.errors.NotReadyException;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.extensions.TimeExtensionsKt;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.models.dataFacade.MergedAndUpdatedServicesPair;
import com.usercentrics.sdk.models.dataFacade.MergedServicesSettings;
import com.usercentrics.sdk.models.settings.LegacyBasicService;
import com.usercentrics.sdk.models.settings.LegacyConsent;
import com.usercentrics.sdk.models.settings.LegacyConsentHistoryEntry;
import com.usercentrics.sdk.models.settings.LegacyDataKt;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedUIDataDistribution;
import com.usercentrics.sdk.models.settings.PredefinedUIProcessingCompany;
import com.usercentrics.sdk.models.settings.PredefinedUIURLs;
import com.usercentrics.sdk.models.settings.UsercentricsConsentAction;
import com.usercentrics.sdk.models.settings.UsercentricsConsentType;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentHistory;
import com.usercentrics.sdk.services.deviceStorage.models.StorageService;
import com.usercentrics.sdk.services.deviceStorage.models.StorageSettings;
import com.usercentrics.sdk.services.settings.ISettingsLegacy;
import com.usercentrics.sdk.services.tcf.TCFUseCase;
import com.usercentrics.sdk.v2.consent.data.ConsentStatus;
import com.usercentrics.sdk.v2.consent.data.ConsentStringObject;
import com.usercentrics.sdk.v2.consent.data.DataTransferObject;
import com.usercentrics.sdk.v2.consent.data.DataTransferObjectService;
import com.usercentrics.sdk.v2.consent.data.GetConsentsData;
import com.usercentrics.sdk.v2.consent.service.ConsentsService;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.settings.service.ISettingsService;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DataFacade.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J,\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010(\u001a\u00020)J\n\u0010*\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u0004\u0018\u00010)2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00100\u001a\u000201J\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0012H\u0002J&\u00105\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J:\u00107\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\b\u00108\u001a\u0004\u0018\u0001092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a0;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u001a0=R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/usercentrics/sdk/services/dataFacade/DataFacade;", "", "consentsService", "Lcom/usercentrics/sdk/v2/consent/service/ConsentsService;", "settingsInstance", "Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;", "settingsService", "Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;", "storageInstance", "Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;", "tcfInstance", "Lcom/usercentrics/sdk/services/tcf/TCFUseCase;", "additionalConsentModeService", "Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "(Lcom/usercentrics/sdk/v2/consent/service/ConsentsService;Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;Lcom/usercentrics/sdk/services/tcf/TCFUseCase;Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;Lcom/usercentrics/sdk/log/UsercentricsLogger;)V", "appendConsentsToHistory", "", "Lcom/usercentrics/sdk/models/settings/LegacyService;", "controllerId", "", "services", "dataTransferObject", "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;", "assertSettings", "", "settings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "ensureServicesHistorySize", "execute", MRAIDPresenter.CONSENT_ACTION, "Lcom/usercentrics/sdk/models/settings/UsercentricsConsentAction;", "consentType", "Lcom/usercentrics/sdk/models/settings/UsercentricsConsentType;", "getMergedAndUpdatedEssentialServices", "Lcom/usercentrics/sdk/models/dataFacade/MergedAndUpdatedServicesPair;", "storageSettings", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;", "getMergedAndUpdatedNonEssentialServices", "getMergedServicesAndSettingsFromStorage", "Lcom/usercentrics/sdk/models/dataFacade/MergedServicesSettings;", "getSettings", "mapConsentHistoryObject", "Lcom/usercentrics/sdk/models/settings/LegacyConsentHistoryEntry;", "serviceIndex", "", "mergeSettingsFromStorage", "shouldAcceptAllImplicitlyOnInit", "", "removeRestoredSessionEvents", "Lcom/usercentrics/sdk/v2/consent/data/ConsentStatus;", "consents", "restoreServicesConsents", "consentsWithoutRestoredSessions", "restoreUserSession", "activeVariant", "Lcom/usercentrics/sdk/models/common/UsercentricsVariant;", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "Lcom/usercentrics/sdk/errors/UsercentricsException;", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataFacade {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int maxStorageHistorySize;
    private final AdditionalConsentModeService additionalConsentModeService;
    private final ConsentsService consentsService;
    private final UsercentricsLogger logger;
    private final ISettingsLegacy settingsInstance;
    private final ISettingsService settingsService;
    private final DeviceStorage storageInstance;
    private final TCFUseCase tcfInstance;

    private final void assertSettings(UsercentricsSettings settings) {
    }

    public DataFacade(ConsentsService consentsService, ISettingsLegacy settingsInstance, ISettingsService settingsService, DeviceStorage storageInstance, TCFUseCase tcfInstance, AdditionalConsentModeService additionalConsentModeService, UsercentricsLogger logger) {
        Intrinsics.checkNotNullParameter(consentsService, "consentsService");
        Intrinsics.checkNotNullParameter(settingsInstance, "settingsInstance");
        Intrinsics.checkNotNullParameter(settingsService, "settingsService");
        Intrinsics.checkNotNullParameter(storageInstance, "storageInstance");
        Intrinsics.checkNotNullParameter(tcfInstance, "tcfInstance");
        Intrinsics.checkNotNullParameter(additionalConsentModeService, "additionalConsentModeService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.consentsService = consentsService;
        this.settingsInstance = settingsInstance;
        this.settingsService = settingsService;
        this.storageInstance = storageInstance;
        this.tcfInstance = tcfInstance;
        this.additionalConsentModeService = additionalConsentModeService;
        this.logger = logger;
    }

    /* compiled from: DataFacade.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/usercentrics/sdk/services/dataFacade/DataFacade$Companion;", "", "()V", "maxStorageHistorySize", "", "getMaxStorageHistorySize", "()I", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getMaxStorageHistorySize() {
            return DataFacade.maxStorageHistorySize;
        }
    }

    static {
        maxStorageHistorySize = ActualKt.isTVOS() ? 1 : 3;
    }

    private final UsercentricsSettings getSettings() {
        NewSettingsData settings = this.settingsService.getSettings();
        if (settings != null) {
            return settings.getData();
        }
        return null;
    }

    public final void execute(String controllerId, List<LegacyService> services, UsercentricsConsentAction consentAction, UsercentricsConsentType consentType) {
        LegacyExtendedSettings copy;
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(consentAction, "consentAction");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        UsercentricsSettings settings = getSettings();
        assertSettings(settings);
        if (settings == null) {
            return;
        }
        List<LegacyService> ensureServicesHistorySize = ensureServicesHistorySize(LegacyDataKt.updateServices(this.settingsInstance.getSettings().getServices(), appendConsentsToHistory(controllerId, services, DataTransferObject.Companion.create$default(DataTransferObject.INSTANCE, settings, this.settingsInstance.getSettings().getControllerId(), services, consentAction, consentType, null, 32, null))));
        copy = r7.copy((r29 & 1) != 0 ? r7.categories : null, (r29 & 2) != 0 ? r7.services : ensureServicesHistorySize, (r29 & 4) != 0 ? r7.gdpr : null, (r29 & 8) != 0 ? r7.ccpa : null, (r29 & 16) != 0 ? r7.controllerId : null, (r29 & 32) != 0 ? r7.id : null, (r29 & 64) != 0 ? r7.isTcfEnabled : false, (r29 & 128) != 0 ? r7.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? r7.tcfui : null, (r29 & 512) != 0 ? r7.ui : null, (r29 & 1024) != 0 ? r7.version : null, (r29 & 2048) != 0 ? r7.framework : null, (r29 & 4096) != 0 ? r7.restoredSessionLastInteractionTimestamp : null, (r29 & 8192) != 0 ? this.settingsInstance.getSettings().renewConsentsTimestampInSeconds : null);
        this.settingsInstance.setSettings(copy);
        this.storageInstance.saveSettings(this.settingsInstance.getSettings(), ensureServicesHistorySize);
        this.consentsService.saveConsentsState(consentAction);
        if (consentAction != UsercentricsConsentAction.INITIAL_PAGE_LOAD) {
            this.storageInstance.clearUserActionRequired();
        }
    }

    private final List<LegacyService> ensureServicesHistorySize(List<LegacyService> services) {
        List<LegacyService> list = services;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (LegacyService legacyService : list) {
            int size = legacyService.getConsent().getHistory().size();
            int i = maxStorageHistorySize;
            if (size > i) {
                legacyService = LegacyService.copy$default(legacyService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LegacyConsent.copy$default(legacyService.getConsent(), CollectionsKt.takeLast(legacyService.getConsent().getHistory(), i), false, 2, null), false, false, null, null, null, null, null, null, false, null, 67076095, null);
            }
            arrayList.add(legacyService);
        }
        return arrayList;
    }

    public final void restoreUserSession(final String controllerId, final UsercentricsVariant activeVariant, final Function0<Unit> onSuccess, final Function1<? super UsercentricsException, Unit> onError) {
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final UsercentricsSettings settings = getSettings();
        assertSettings(settings);
        if (settings == null) {
            onError.invoke(new NotReadyException());
        } else {
            this.consentsService.getRemoteUserConsents(controllerId, new Function1<GetConsentsData, Unit>() { // from class: com.usercentrics.sdk.services.dataFacade.DataFacade$restoreUserSession$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GetConsentsData getConsentsData) {
                    invoke2(getConsentsData);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GetConsentsData consentsData) {
                    List removeRestoredSessionEvents;
                    UsercentricsLogger usercentricsLogger;
                    ISettingsLegacy iSettingsLegacy;
                    UsercentricsLogger usercentricsLogger2;
                    TCFUseCase tCFUseCase;
                    AdditionalConsentModeService additionalConsentModeService;
                    Intrinsics.checkNotNullParameter(consentsData, "consentsData");
                    removeRestoredSessionEvents = DataFacade.this.removeRestoredSessionEvents(consentsData.getConsents());
                    if (!removeRestoredSessionEvents.isEmpty()) {
                        DataFacade.this.restoreServicesConsents(controllerId, removeRestoredSessionEvents, settings);
                    } else {
                        usercentricsLogger = DataFacade.this.logger;
                        UsercentricsLogger.DefaultImpls.debug$default(usercentricsLogger, "No services consents have been restored for " + controllerId, null, 2, null);
                    }
                    if (activeVariant == UsercentricsVariant.TCF) {
                        String acString = consentsData.getAcString();
                        iSettingsLegacy = DataFacade.this.settingsInstance;
                        if (iSettingsLegacy.isAdditionalConsentModeEnabled()) {
                            additionalConsentModeService = DataFacade.this.additionalConsentModeService;
                            additionalConsentModeService.save(acString);
                        }
                        ConsentStringObject consentStringObject = consentsData.getConsentStringObject();
                        if (consentStringObject != null) {
                            tCFUseCase = DataFacade.this.tcfInstance;
                            tCFUseCase.restore(consentStringObject.getString(), acString, consentStringObject.getTcfVendorsDisclosedMap());
                        } else {
                            usercentricsLogger2 = DataFacade.this.logger;
                            UsercentricsLogger.DefaultImpls.debug$default(usercentricsLogger2, "No consentString data, it is needed to restore the TCF session", null, 2, null);
                        }
                    }
                    onSuccess.invoke();
                }
            }, new Function1<UsercentricsException, Unit>() { // from class: com.usercentrics.sdk.services.dataFacade.DataFacade$restoreUserSession$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UsercentricsException usercentricsException) {
                    invoke2(usercentricsException);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(UsercentricsException it) {
                    UsercentricsLogger usercentricsLogger;
                    Intrinsics.checkNotNullParameter(it, "it");
                    usercentricsLogger = DataFacade.this.logger;
                    UsercentricsException usercentricsException = it;
                    usercentricsLogger.error("Failed while restoring user session", usercentricsException);
                    onError.invoke(new UsercentricsException(it.toString(), usercentricsException));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreServicesConsents(String controllerId, List<ConsentStatus> consentsWithoutRestoredSessions, UsercentricsSettings settings) {
        LegacyExtendedSettings copy;
        LegacyExtendedSettings legacyExtendedSettings;
        List<ConsentStatus> list;
        Iterator it;
        long j;
        UsercentricsConsentAction from$usercentrics_release;
        Iterator it2;
        Iterator it3;
        long j2;
        LegacyExtendedSettings legacyExtendedSettings2;
        List<ConsentStatus> list2;
        LegacyExtendedSettings settings2 = this.settingsInstance.getSettings();
        List mutableList = CollectionsKt.toMutableList((Collection) settings2.getServices());
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        List<ConsentStatus> list3 = consentsWithoutRestoredSessions;
        Iterator it4 = list3.iterator();
        long j3 = 0;
        while (it4.hasNext()) {
            ConsentStatus consentStatus = (ConsentStatus) it4.next();
            long secondsToMillis = TimeExtensionsKt.secondsToMillis(consentStatus.getTimestampInSeconds());
            if (arrayList2.contains(Long.valueOf(consentStatus.getTimestampInSeconds()))) {
                legacyExtendedSettings = settings2;
                list = list3;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list3) {
                    ConsentStatus consentStatus2 = (ConsentStatus) obj;
                    if (consentStatus.getTimestampInSeconds() == consentStatus2.getTimestampInSeconds()) {
                        legacyExtendedSettings2 = settings2;
                        String action = consentStatus2.getAction();
                        list2 = list3;
                        if (Intrinsics.areEqual(action, consentStatus.getAction())) {
                            arrayList3.add(obj);
                        }
                    } else {
                        legacyExtendedSettings2 = settings2;
                        list2 = list3;
                    }
                    list3 = list2;
                    settings2 = legacyExtendedSettings2;
                }
                legacyExtendedSettings = settings2;
                list = list3;
                ArrayList arrayList4 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        ConsentStatus consentStatus3 = (ConsentStatus) it5.next();
                        Iterator it6 = mutableList.iterator();
                        int i = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                it2 = it5;
                                it3 = it4;
                                i = -1;
                                break;
                            } else {
                                it2 = it5;
                                it3 = it4;
                                if (Intrinsics.areEqual(((LegacyService) it6.next()).getId(), consentStatus3.getConsentTemplateId())) {
                                    break;
                                }
                                i++;
                                it5 = it2;
                                it4 = it3;
                            }
                        }
                        int i2 = i;
                        if (i2 < 0) {
                            j2 = j3;
                        } else {
                            LegacyService legacyService = (LegacyService) mutableList.get(i2);
                            j2 = j3;
                            LegacyService legacyService2 = new LegacyService(legacyService.getDataCollected(), legacyService.getDataDistribution(), legacyService.getDataPurposes(), legacyService.getDataRecipients(), legacyService.getServiceDescription(), legacyService.getId(), legacyService.getLegalBasis(), legacyService.getName(), legacyService.getProcessingCompany(), legacyService.getRetentionPeriodDescription(), legacyService.getTechnologiesUsed(), legacyService.getUrls(), legacyService.getVersion(), legacyService.getCategorySlug(), legacyService.getCategoryLabel(), new LegacyConsent(CollectionsKt.takeLast(legacyService.getConsent().getHistory(), maxStorageHistorySize), consentStatus3.getConsentStatus()), legacyService.isEssential(), legacyService.getDisableLegalBasis(), legacyService.getProcessorId(), legacyService.getSubServices(), legacyService.getCookieMaxAgeSeconds(), legacyService.getUsesNonCookieAccess(), legacyService.getDeviceStorageDisclosureUrl(), legacyService.getDeviceStorage(), legacyService.isHidden(), legacyService.getDefaultConsentStatus());
                            linkedHashMap.put(legacyService.getId(), legacyService2);
                            mutableList.set(i2, legacyService2);
                            arrayList5.add(legacyService2);
                        }
                        it5 = it2;
                        it4 = it3;
                        j3 = j2;
                    }
                    it = it4;
                    j = j3;
                    arrayList2.add(Long.valueOf(consentStatus.getTimestampInSeconds()));
                    String action2 = consentStatus.getAction();
                    if (action2 != null && (from$usercentrics_release = UsercentricsConsentAction.INSTANCE.from$usercentrics_release(action2)) != null) {
                        arrayList.add(DataTransferObject.INSTANCE.create(settings, controllerId, arrayList5, from$usercentrics_release, from$usercentrics_release.getType(), Long.valueOf(secondsToMillis)));
                        if (secondsToMillis > j) {
                            j3 = secondsToMillis;
                            list3 = list;
                            settings2 = legacyExtendedSettings;
                            it4 = it;
                        }
                    }
                    j3 = j;
                    list3 = list;
                    settings2 = legacyExtendedSettings;
                    it4 = it;
                }
            }
            it = it4;
            j = j3;
            j3 = j;
            list3 = list;
            settings2 = legacyExtendedSettings;
            it4 = it;
        }
        LegacyExtendedSettings legacyExtendedSettings3 = settings2;
        long j4 = j3;
        List list4 = mutableList;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator it7 = list4.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            LegacyService legacyService3 = (LegacyService) it7.next();
            if (linkedHashMap.containsKey(legacyService3.getId())) {
                legacyService3 = LegacyService.copy$default(legacyService3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LegacyConsent.copy$default(legacyService3.getConsent(), CollectionsKt.emptyList(), false, 2, null), false, false, null, null, null, null, null, null, false, null, 67076095, null);
            }
            arrayList6.add(legacyService3);
        }
        ArrayList arrayList7 = arrayList6;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList7 = appendConsentsToHistory(controllerId, arrayList7, (DataTransferObject) it8.next());
        }
        String settingsVersion = consentsWithoutRestoredSessions.get(consentsWithoutRestoredSessions.size() - 1).getSettingsVersion();
        String version = settingsVersion.compareTo(legacyExtendedSettings3.getVersion()) <= 0 ? settingsVersion : legacyExtendedSettings3.getVersion();
        copy = legacyExtendedSettings3.copy((r29 & 1) != 0 ? legacyExtendedSettings3.categories : null, (r29 & 2) != 0 ? legacyExtendedSettings3.services : LegacyDataKt.updateServices(legacyExtendedSettings3.getServices(), arrayList7), (r29 & 4) != 0 ? legacyExtendedSettings3.gdpr : null, (r29 & 8) != 0 ? legacyExtendedSettings3.ccpa : null, (r29 & 16) != 0 ? legacyExtendedSettings3.controllerId : controllerId, (r29 & 32) != 0 ? legacyExtendedSettings3.id : null, (r29 & 64) != 0 ? legacyExtendedSettings3.isTcfEnabled : false, (r29 & 128) != 0 ? legacyExtendedSettings3.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? legacyExtendedSettings3.tcfui : null, (r29 & 512) != 0 ? legacyExtendedSettings3.ui : null, (r29 & 1024) != 0 ? legacyExtendedSettings3.version : version, (r29 & 2048) != 0 ? legacyExtendedSettings3.framework : null, (r29 & 4096) != 0 ? legacyExtendedSettings3.restoredSessionLastInteractionTimestamp : Intrinsics.areEqual(version, settingsVersion) ? Long.valueOf(j4) : null, (r29 & 8192) != 0 ? legacyExtendedSettings3.renewConsentsTimestampInSeconds : null);
        this.storageInstance.saveSettings(copy, arrayList7);
        this.settingsInstance.setSettings(copy);
    }

    public final MergedServicesSettings getMergedServicesAndSettingsFromStorage() {
        LegacyExtendedSettings copy;
        StorageSettings fetchSettings = this.storageInstance.fetchSettings();
        MergedAndUpdatedServicesPair mergedAndUpdatedEssentialServices = getMergedAndUpdatedEssentialServices(fetchSettings);
        MergedAndUpdatedServicesPair mergedAndUpdatedNonEssentialServices = getMergedAndUpdatedNonEssentialServices(fetchSettings);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mergedAndUpdatedEssentialServices.getMergedServices());
        arrayList.addAll(mergedAndUpdatedNonEssentialServices.getMergedServices());
        arrayList.addAll(mergedAndUpdatedNonEssentialServices.getUpdatedServices());
        LegacyExtendedSettings settings = this.settingsInstance.getSettings();
        String controllerId = fetchSettings.getControllerId();
        if (StringsKt.isBlank(controllerId)) {
            controllerId = settings.getControllerId();
        }
        copy = settings.copy((r29 & 1) != 0 ? settings.categories : null, (r29 & 2) != 0 ? settings.services : null, (r29 & 4) != 0 ? settings.gdpr : null, (r29 & 8) != 0 ? settings.ccpa : null, (r29 & 16) != 0 ? settings.controllerId : controllerId, (r29 & 32) != 0 ? settings.id : null, (r29 & 64) != 0 ? settings.isTcfEnabled : false, (r29 & 128) != 0 ? settings.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? settings.tcfui : null, (r29 & 512) != 0 ? settings.ui : null, (r29 & 1024) != 0 ? settings.version : null, (r29 & 2048) != 0 ? settings.framework : null, (r29 & 4096) != 0 ? settings.restoredSessionLastInteractionTimestamp : null, (r29 & 8192) != 0 ? settings.renewConsentsTimestampInSeconds : null);
        return new MergedServicesSettings(arrayList, copy, mergedAndUpdatedEssentialServices.getUpdatedServices(), mergedAndUpdatedNonEssentialServices.getUpdatedServices());
    }

    public final MergedServicesSettings mergeSettingsFromStorage(String controllerId, boolean shouldAcceptAllImplicitlyOnInit) {
        LegacyExtendedSettings copy;
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        UsercentricsSettings settings = getSettings();
        assertSettings(settings);
        if (settings == null) {
            return null;
        }
        MergedServicesSettings mergedServicesAndSettingsFromStorage = getMergedServicesAndSettingsFromStorage();
        List<LegacyService> mergedServices = mergedServicesAndSettingsFromStorage.getMergedServices();
        LegacyExtendedSettings mergedSettings = mergedServicesAndSettingsFromStorage.getMergedSettings();
        List<LegacyService> updatedEssentialServices = mergedServicesAndSettingsFromStorage.getUpdatedEssentialServices();
        List<LegacyService> updatedNonEssentialServices = mergedServicesAndSettingsFromStorage.getUpdatedNonEssentialServices();
        boolean isEmpty = updatedEssentialServices.isEmpty();
        List<LegacyService> appendConsentsToHistory = !isEmpty ? appendConsentsToHistory(controllerId, mergedServices, DataTransferObject.Companion.create$default(DataTransferObject.INSTANCE, settings, mergedSettings.getControllerId(), updatedEssentialServices, UsercentricsConsentAction.ESSENTIAL_CHANGE, UsercentricsConsentType.IMPLICIT, null, 32, null)) : mergedServices;
        if (!updatedNonEssentialServices.isEmpty() && !shouldAcceptAllImplicitlyOnInit) {
            appendConsentsToHistory = appendConsentsToHistory(controllerId, mergedServices, DataTransferObject.Companion.create$default(DataTransferObject.INSTANCE, settings, mergedSettings.getControllerId(), updatedNonEssentialServices, UsercentricsConsentAction.INITIAL_PAGE_LOAD, UsercentricsConsentType.IMPLICIT, null, 32, null));
        }
        copy = mergedSettings.copy((r29 & 1) != 0 ? mergedSettings.categories : null, (r29 & 2) != 0 ? mergedSettings.services : LegacyDataKt.updateServices(this.settingsInstance.getSettings().getServices(), appendConsentsToHistory), (r29 & 4) != 0 ? mergedSettings.gdpr : null, (r29 & 8) != 0 ? mergedSettings.ccpa : null, (r29 & 16) != 0 ? mergedSettings.controllerId : null, (r29 & 32) != 0 ? mergedSettings.id : null, (r29 & 64) != 0 ? mergedSettings.isTcfEnabled : false, (r29 & 128) != 0 ? mergedSettings.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? mergedSettings.tcfui : null, (r29 & 512) != 0 ? mergedSettings.ui : null, (r29 & 1024) != 0 ? mergedSettings.version : null, (r29 & 2048) != 0 ? mergedSettings.framework : null, (r29 & 4096) != 0 ? mergedSettings.restoredSessionLastInteractionTimestamp : null, (r29 & 8192) != 0 ? mergedSettings.renewConsentsTimestampInSeconds : null);
        this.settingsInstance.setSettings(copy);
        this.storageInstance.saveSettings(copy, appendConsentsToHistory);
        if (!isEmpty) {
            this.consentsService.saveConsentsState(UsercentricsConsentAction.ESSENTIAL_CHANGE);
        }
        return mergedServicesAndSettingsFromStorage;
    }

    private final MergedAndUpdatedServicesPair getMergedAndUpdatedEssentialServices(StorageSettings storageSettings) {
        Object obj;
        List<LegacyService> services = this.settingsInstance.getSettings().getServices();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : services) {
            if (((LegacyService) obj2).isEssential()) {
                arrayList.add(obj2);
            }
        }
        List<LegacyService> sortByName = LegacyDataKt.sortByName(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<LegacyService> list = sortByName;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (LegacyService legacyService : list) {
            Iterator<T> it = storageSettings.getServices().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((StorageService) obj).getId(), legacyService.getId())) {
                    break;
                }
            }
            StorageService storageService = (StorageService) obj;
            if (storageService != null) {
                List<String> dataCollected = legacyService.getDataCollected();
                PredefinedUIDataDistribution dataDistribution = legacyService.getDataDistribution();
                List<String> dataPurposes = legacyService.getDataPurposes();
                List<String> dataRecipients = legacyService.getDataRecipients();
                String serviceDescription = legacyService.getServiceDescription();
                String id = legacyService.getId();
                List<String> legalBasis = legacyService.getLegalBasis();
                String name = legacyService.getName();
                PredefinedUIProcessingCompany processingCompany = legacyService.getProcessingCompany();
                String retentionPeriodDescription = legacyService.getRetentionPeriodDescription();
                List<String> technologiesUsed = legacyService.getTechnologiesUsed();
                PredefinedUIURLs urls = legacyService.getUrls();
                String version = legacyService.getVersion();
                String categorySlug = legacyService.getCategorySlug();
                String categoryLabel = legacyService.getCategoryLabel();
                boolean isEssential = legacyService.isEssential();
                List<LegacyBasicService> subServices = legacyService.getSubServices();
                String processorId = storageService.getProcessorId();
                List<StorageConsentHistory> history = storageService.getHistory();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(history, 10));
                Iterator<T> it2 = history.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((StorageConsentHistory) it2.next()).toConsentHistory());
                }
                LegacyService legacyService2 = new LegacyService(dataCollected, dataDistribution, dataPurposes, dataRecipients, serviceDescription, id, legalBasis, name, processingCompany, retentionPeriodDescription, technologiesUsed, urls, version, categorySlug, categoryLabel, new LegacyConsent(CollectionsKt.takeLast(arrayList4, maxStorageHistorySize), true), isEssential, legacyService.getDisableLegalBasis(), processorId, subServices, legacyService.getCookieMaxAgeSeconds(), legacyService.getUsesNonCookieAccess(), legacyService.getDeviceStorageDisclosureUrl(), legacyService.getDeviceStorage(), legacyService.isHidden(), legacyService.getDefaultConsentStatus());
                if (!storageService.getStatus()) {
                    arrayList2.add(legacyService2);
                }
                legacyService = legacyService2;
            }
            arrayList3.add(legacyService);
        }
        return new MergedAndUpdatedServicesPair(arrayList3, arrayList2);
    }

    private final MergedAndUpdatedServicesPair getMergedAndUpdatedNonEssentialServices(StorageSettings storageSettings) {
        Object obj;
        List<LegacyService> services = this.settingsInstance.getSettings().getServices();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : services) {
            if (!((LegacyService) obj2).isEssential()) {
                arrayList.add(obj2);
            }
        }
        List<LegacyService> sortByName = LegacyDataKt.sortByName(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (LegacyService legacyService : sortByName) {
            Iterator<T> it = storageSettings.getServices().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((StorageService) obj).getId(), legacyService.getId())) {
                    break;
                }
            }
            StorageService storageService = (StorageService) obj;
            if (storageService == null) {
                arrayList3.add(legacyService);
            } else {
                List<String> dataCollected = legacyService.getDataCollected();
                PredefinedUIDataDistribution dataDistribution = legacyService.getDataDistribution();
                List<String> dataPurposes = legacyService.getDataPurposes();
                List<String> dataRecipients = legacyService.getDataRecipients();
                String serviceDescription = legacyService.getServiceDescription();
                String id = legacyService.getId();
                List<String> legalBasis = legacyService.getLegalBasis();
                String name = legacyService.getName();
                PredefinedUIProcessingCompany processingCompany = legacyService.getProcessingCompany();
                String retentionPeriodDescription = legacyService.getRetentionPeriodDescription();
                List<String> technologiesUsed = legacyService.getTechnologiesUsed();
                PredefinedUIURLs urls = legacyService.getUrls();
                String version = legacyService.getVersion();
                String categorySlug = legacyService.getCategorySlug();
                String categoryLabel = legacyService.getCategoryLabel();
                boolean isEssential = legacyService.isEssential();
                List<LegacyBasicService> subServices = legacyService.getSubServices();
                String processorId = storageService.getProcessorId();
                List<StorageConsentHistory> history = storageService.getHistory();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(history, 10));
                Iterator<T> it2 = history.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((StorageConsentHistory) it2.next()).toConsentHistory());
                }
                arrayList2.add(new LegacyService(dataCollected, dataDistribution, dataPurposes, dataRecipients, serviceDescription, id, legalBasis, name, processingCompany, retentionPeriodDescription, technologiesUsed, urls, version, categorySlug, categoryLabel, new LegacyConsent(CollectionsKt.takeLast(arrayList4, maxStorageHistorySize), storageService.getStatus()), isEssential, legacyService.getDisableLegalBasis(), processorId, subServices, legacyService.getCookieMaxAgeSeconds(), legacyService.getUsesNonCookieAccess(), legacyService.getDeviceStorageDisclosureUrl(), legacyService.getDeviceStorage(), legacyService.isHidden(), legacyService.getDefaultConsentStatus()));
            }
        }
        return new MergedAndUpdatedServicesPair(arrayList2, arrayList3);
    }

    private final List<LegacyService> appendConsentsToHistory(String controllerId, List<LegacyService> services, DataTransferObject dataTransferObject) {
        Object obj;
        List<LegacyService> list = services;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (LegacyService legacyService : list) {
            Iterator<DataTransferObjectService> it = dataTransferObject.getServices().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getId(), legacyService.getId())) {
                    break;
                }
                i++;
            }
            Iterator<T> it2 = this.storageInstance.fetchSettings().getServices().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((StorageService) obj).getId(), legacyService.getId())) {
                    break;
                }
            }
            StorageService storageService = (StorageService) obj;
            if (i > -1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(legacyService.getConsent().getHistory());
                arrayList2.add(mapConsentHistoryObject(dataTransferObject, i));
                LegacyConsentHistoryEntry legacyConsentHistoryEntry = (LegacyConsentHistoryEntry) arrayList2.get(CollectionsKt.getLastIndex(arrayList2));
                if (Intrinsics.areEqual(controllerId, this.storageInstance.getControllerId()) && storageService != null) {
                    if ((!storageService.getHistory().isEmpty() ? storageService.getHistory().get(CollectionsKt.getLastIndex(storageService.getHistory())).getTimestampInMillis() : 0L) >= legacyConsentHistoryEntry.getTimestampInMillis()) {
                        List<String> dataCollected = legacyService.getDataCollected();
                        PredefinedUIDataDistribution dataDistribution = legacyService.getDataDistribution();
                        List<String> dataPurposes = legacyService.getDataPurposes();
                        List<String> dataRecipients = legacyService.getDataRecipients();
                        String serviceDescription = legacyService.getServiceDescription();
                        String id = legacyService.getId();
                        List<String> legalBasis = legacyService.getLegalBasis();
                        String name = legacyService.getName();
                        PredefinedUIProcessingCompany processingCompany = legacyService.getProcessingCompany();
                        String retentionPeriodDescription = legacyService.getRetentionPeriodDescription();
                        List<String> technologiesUsed = legacyService.getTechnologiesUsed();
                        PredefinedUIURLs urls = legacyService.getUrls();
                        String version = legacyService.getVersion();
                        String categorySlug = legacyService.getCategorySlug();
                        String categoryLabel = legacyService.getCategoryLabel();
                        boolean isEssential = legacyService.isEssential();
                        String processorId = legacyService.getProcessorId();
                        List<LegacyBasicService> subServices = legacyService.getSubServices();
                        boolean status = storageService.getStatus();
                        List<StorageConsentHistory> history = storageService.getHistory();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(history, 10));
                        Iterator<T> it3 = history.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((StorageConsentHistory) it3.next()).toConsentHistory());
                        }
                        legacyService = new LegacyService(dataCollected, dataDistribution, dataPurposes, dataRecipients, serviceDescription, id, legalBasis, name, processingCompany, retentionPeriodDescription, technologiesUsed, urls, version, categorySlug, categoryLabel, new LegacyConsent(CollectionsKt.takeLast(arrayList3, maxStorageHistorySize), status), isEssential, legacyService.getDisableLegalBasis(), processorId, subServices, legacyService.getCookieMaxAgeSeconds(), legacyService.getUsesNonCookieAccess(), legacyService.getDeviceStorageDisclosureUrl(), legacyService.getDeviceStorage(), legacyService.isHidden(), legacyService.getDefaultConsentStatus());
                    }
                }
                legacyService = new LegacyService(legacyService.getDataCollected(), legacyService.getDataDistribution(), legacyService.getDataPurposes(), legacyService.getDataRecipients(), legacyService.getServiceDescription(), legacyService.getId(), legacyService.getLegalBasis(), legacyService.getName(), legacyService.getProcessingCompany(), legacyService.getRetentionPeriodDescription(), legacyService.getTechnologiesUsed(), legacyService.getUrls(), legacyService.getVersion(), legacyService.getCategorySlug(), legacyService.getCategoryLabel(), new LegacyConsent(CollectionsKt.takeLast(arrayList2, maxStorageHistorySize), legacyConsentHistoryEntry.getStatus()), legacyService.isEssential(), legacyService.getDisableLegalBasis(), legacyService.getProcessorId(), legacyService.getSubServices(), legacyService.getCookieMaxAgeSeconds(), legacyService.getUsesNonCookieAccess(), legacyService.getDeviceStorageDisclosureUrl(), legacyService.getDeviceStorage(), legacyService.isHidden(), legacyService.getDefaultConsentStatus());
            }
            arrayList.add(legacyService);
        }
        return arrayList;
    }

    private final LegacyConsentHistoryEntry mapConsentHistoryObject(DataTransferObject dataTransferObject, int serviceIndex) {
        return new LegacyConsentHistoryEntry(dataTransferObject.getConsent().getAction(), dataTransferObject.getServices().get(serviceIndex).getStatus(), dataTransferObject.getConsent().getType(), dataTransferObject.getSettings().getLanguage(), TimeExtensionsKt.secondsToMillis(dataTransferObject.getTimestampInSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ConsentStatus> removeRestoredSessionEvents(List<ConsentStatus> consents) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : consents) {
            if (!Intrinsics.areEqual(((ConsentStatus) obj).getAction(), UsercentricsConsentAction.SESSION_RESTORED.getText())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
