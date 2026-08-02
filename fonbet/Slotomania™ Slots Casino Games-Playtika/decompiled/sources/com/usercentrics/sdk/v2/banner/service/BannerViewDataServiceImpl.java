package com.usercentrics.sdk.v2.banner.service;

import com.getcapacitor.PluginMethod;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.acm.service.AdditionalConsentModeService;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.models.gdpr.DefaultLabels;
import com.usercentrics.sdk.models.gdpr.DefaultUISettings;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedTVViewSettings;
import com.usercentrics.sdk.models.settings.PredefinedUICustomization;
import com.usercentrics.sdk.models.settings.PredefinedUIViewSettings;
import com.usercentrics.sdk.models.tcf.TCFLabels;
import com.usercentrics.sdk.models.tcf.TCFUISettings;
import com.usercentrics.sdk.services.ccpa.ICcpa;
import com.usercentrics.sdk.services.settings.ISettingsLegacy;
import com.usercentrics.sdk.services.tcf.TCFUseCase;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import com.usercentrics.sdk.v2.banner.model.PredefinedUIViewData;
import com.usercentrics.sdk.v2.banner.service.mapper.ccpa.CCPAViewSettingsMapper;
import com.usercentrics.sdk.v2.banner.service.mapper.gdpr.GDPRViewSettingsMapper;
import com.usercentrics.sdk.v2.banner.service.mapper.tcf.TCFViewSettingsMapper;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.settings.service.ISettingsService;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import com.usercentrics.sdk.v2.translation.service.ITranslationService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerViewDataServiceImpl.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016H\u0016J\u001c\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/BannerViewDataServiceImpl;", "Lcom/usercentrics/sdk/v2/banner/service/BannerViewDataService;", "settingsService", "Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;", "settingsLegacy", "Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;", "translationService", "Lcom/usercentrics/sdk/v2/translation/service/ITranslationService;", "tcfInstance", "Lcom/usercentrics/sdk/services/tcf/TCFUseCase;", "ccpaInstance", "Lcom/usercentrics/sdk/services/ccpa/ICcpa;", "additionalConsentModeService", "Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;", "variant", "Lcom/usercentrics/sdk/models/common/UsercentricsVariant;", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "(Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;Lcom/usercentrics/sdk/v2/translation/service/ITranslationService;Lcom/usercentrics/sdk/services/tcf/TCFUseCase;Lcom/usercentrics/sdk/services/ccpa/ICcpa;Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;Lcom/usercentrics/sdk/models/common/UsercentricsVariant;Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;)V", "buildTVViewSettings", "", PluginMethod.RETURN_CALLBACK, "Lkotlin/Function1;", "Lcom/usercentrics/sdk/models/settings/PredefinedTVViewSettings;", "buildViewData", "Lcom/usercentrics/sdk/v2/banner/model/PredefinedUIViewData;", "getCCPAMapper", "Lcom/usercentrics/sdk/v2/banner/service/mapper/ccpa/CCPAViewSettingsMapper;", "settingsLegacyData", "Lcom/usercentrics/sdk/models/settings/LegacyExtendedSettings;", "getCCPAOptedOut", "", "getGDPRMapper", "Lcom/usercentrics/sdk/v2/banner/service/mapper/gdpr/GDPRViewSettingsMapper;", "getTCFMapper", "Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/TCFViewSettingsMapper;", "tcfData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerViewDataServiceImpl implements BannerViewDataService {
    public static final boolean DEFAULT_CCPA_TOGGLE_VALUE = false;
    private final AdditionalConsentModeService additionalConsentModeService;
    private final ICcpa ccpaInstance;
    private final Dispatcher dispatcher;
    private final ISettingsLegacy settingsLegacy;
    private final ISettingsService settingsService;
    private final TCFUseCase tcfInstance;
    private final ITranslationService translationService;
    private final UsercentricsVariant variant;

    public BannerViewDataServiceImpl(ISettingsService settingsService, ISettingsLegacy settingsLegacy, ITranslationService translationService, TCFUseCase tcfInstance, ICcpa ccpaInstance, AdditionalConsentModeService additionalConsentModeService, UsercentricsVariant variant, Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(settingsService, "settingsService");
        Intrinsics.checkNotNullParameter(settingsLegacy, "settingsLegacy");
        Intrinsics.checkNotNullParameter(translationService, "translationService");
        Intrinsics.checkNotNullParameter(tcfInstance, "tcfInstance");
        Intrinsics.checkNotNullParameter(ccpaInstance, "ccpaInstance");
        Intrinsics.checkNotNullParameter(additionalConsentModeService, "additionalConsentModeService");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.settingsService = settingsService;
        this.settingsLegacy = settingsLegacy;
        this.translationService = translationService;
        this.tcfInstance = tcfInstance;
        this.ccpaInstance = ccpaInstance;
        this.additionalConsentModeService = additionalConsentModeService;
        this.variant = variant;
        this.dispatcher = dispatcher;
    }

    @Override // com.usercentrics.sdk.v2.banner.service.BannerViewDataService
    public void buildViewData(final Function1<? super PredefinedUIViewData, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final LegacyExtendedSettings settings = this.settingsLegacy.getSettings();
        this.dispatcher.dispatch(new BannerViewDataServiceImpl$buildViewData$1(this, settings, null)).onSuccess(new Function1<PredefinedUIViewSettings, Unit>() { // from class: com.usercentrics.sdk.v2.banner.service.BannerViewDataServiceImpl$buildViewData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PredefinedUIViewSettings predefinedUIViewSettings) {
                invoke2(predefinedUIViewSettings);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final PredefinedUIViewSettings it) {
                Dispatcher dispatcher;
                Intrinsics.checkNotNullParameter(it, "it");
                dispatcher = BannerViewDataServiceImpl.this.dispatcher;
                final Function1<PredefinedUIViewData, Unit> function1 = callback;
                final LegacyExtendedSettings legacyExtendedSettings = settings;
                final BannerViewDataServiceImpl bannerViewDataServiceImpl = BannerViewDataServiceImpl.this;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.v2.banner.service.BannerViewDataServiceImpl$buildViewData$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        UsercentricsVariant usercentricsVariant;
                        Function1<PredefinedUIViewData, Unit> function12 = function1;
                        String controllerId = legacyExtendedSettings.getControllerId();
                        usercentricsVariant = bannerViewDataServiceImpl.variant;
                        function12.invoke(new PredefinedUIViewData(controllerId, usercentricsVariant, it));
                    }
                });
            }
        });
    }

    @Override // com.usercentrics.sdk.v2.banner.service.BannerViewDataService
    public void buildTVViewSettings(final Function1<? super PredefinedTVViewSettings, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.dispatcher.dispatch(new BannerViewDataServiceImpl$buildTVViewSettings$1(this, this.settingsLegacy.getSettings(), null)).onSuccess(new Function1<PredefinedTVViewSettings, Unit>() { // from class: com.usercentrics.sdk.v2.banner.service.BannerViewDataServiceImpl$buildTVViewSettings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PredefinedTVViewSettings predefinedTVViewSettings) {
                invoke2(predefinedTVViewSettings);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final PredefinedTVViewSettings it) {
                Dispatcher dispatcher;
                Intrinsics.checkNotNullParameter(it, "it");
                dispatcher = BannerViewDataServiceImpl.this.dispatcher;
                final Function1<PredefinedTVViewSettings, Unit> function1 = callback;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.v2.banner.service.BannerViewDataServiceImpl$buildTVViewSettings$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(it);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GDPRViewSettingsMapper getGDPRMapper(LegacyExtendedSettings settingsLegacyData) {
        LegacyExtendedSettings settings = this.settingsLegacy.getSettings();
        NewSettingsData settings2 = this.settingsService.getSettings();
        Intrinsics.checkNotNull(settings2);
        UsercentricsSettings data = settings2.getData();
        DefaultUISettings ui = settingsLegacyData.getUi();
        Intrinsics.checkNotNull(ui);
        PredefinedUICustomization customization = ui.getCustomization();
        DefaultLabels labels = settingsLegacyData.getUi().getLabels();
        LegalBasisLocalization translations = this.translationService.getTranslations();
        Intrinsics.checkNotNull(translations);
        return new GDPRViewSettingsMapper(data, customization, labels, translations, settingsLegacyData.getControllerId(), settings.getCategories(), settings.getServices());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CCPAViewSettingsMapper getCCPAMapper(LegacyExtendedSettings settingsLegacyData) {
        LegacyExtendedSettings settings = this.settingsLegacy.getSettings();
        NewSettingsData settings2 = this.settingsService.getSettings();
        Intrinsics.checkNotNull(settings2);
        UsercentricsSettings data = settings2.getData();
        DefaultUISettings ui = settingsLegacyData.getUi();
        Intrinsics.checkNotNull(ui);
        PredefinedUICustomization customization = ui.getCustomization();
        DefaultLabels labels = settingsLegacyData.getUi().getLabels();
        String controllerId = settingsLegacyData.getControllerId();
        List<UsercentricsCategory> categories = settings.getCategories();
        List<LegacyService> services = settings.getServices();
        boolean cCPAOptedOut = getCCPAOptedOut();
        LegalBasisLocalization translations = this.translationService.getTranslations();
        Intrinsics.checkNotNull(translations);
        return new CCPAViewSettingsMapper(data, customization, labels, controllerId, categories, services, cCPAOptedOut, translations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TCFViewSettingsMapper getTCFMapper(LegacyExtendedSettings settingsLegacyData, TCFData tcfData) {
        LegacyExtendedSettings settings = this.settingsLegacy.getSettings();
        NewSettingsData settings2 = this.settingsService.getSettings();
        Intrinsics.checkNotNull(settings2);
        UsercentricsSettings data = settings2.getData();
        LegalBasisLocalization translations = this.translationService.getTranslations();
        Intrinsics.checkNotNull(translations);
        TCFUISettings tcfui = settingsLegacyData.getTcfui();
        Intrinsics.checkNotNull(tcfui);
        PredefinedUICustomization customization = tcfui.getCustomization();
        List<UsercentricsCategory> categories = settings.getCategories();
        List<LegacyService> services = settings.getServices();
        TCFLabels labels = settingsLegacyData.getTcfui().getLabels();
        String controllerId = settingsLegacyData.getControllerId();
        List<AdTechProvider> adTechProviderList = this.additionalConsentModeService.getAdTechProviderList();
        if (adTechProviderList == null) {
            adTechProviderList = CollectionsKt.emptyList();
        }
        return new TCFViewSettingsMapper(data, customization, labels, translations, tcfData, categories, services, controllerId, adTechProviderList);
    }

    private final boolean getCCPAOptedOut() {
        Boolean optedOut = this.ccpaInstance.getCCPAData().getOptedOut();
        if (optedOut != null) {
            return optedOut.booleanValue();
        }
        return false;
    }
}
