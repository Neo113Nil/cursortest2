package com.usercentrics.sdk.services.settings;

import com.android.volley.toolbox.HttpClientStack;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.gdpr.DefaultLabels;
import com.usercentrics.sdk.models.gdpr.DefaultUISettings;
import com.usercentrics.sdk.models.settings.GDPROptions;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedUIAriaLabels;
import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.models.settings.PredefinedUICustomization;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationColor;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationColorButton;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationColorToggles;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import com.usercentrics.sdk.models.settings.PredefinedUIDataDistributionTitle;
import com.usercentrics.sdk.models.settings.PredefinedUIDescriptionTitle;
import com.usercentrics.sdk.models.settings.PredefinedUIGeneralLabels;
import com.usercentrics.sdk.models.settings.PredefinedUILanguage;
import com.usercentrics.sdk.models.settings.PredefinedUILanguageSettings;
import com.usercentrics.sdk.models.settings.PredefinedUIServiceLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIURLsTitle;
import com.usercentrics.sdk.models.settings.SettingsVersion;
import com.usercentrics.sdk.models.settings.USAFrameworks;
import com.usercentrics.sdk.models.tcf.TCFLabels;
import com.usercentrics.sdk.models.tcf.TCFUISettings;
import com.usercentrics.sdk.ui.color.Color;
import com.usercentrics.sdk.ui.color.PredefinedUIColorMachine;
import com.usercentrics.sdk.ui.color.UsercentricsShadedColor;
import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import com.usercentrics.sdk.v2.settings.data.CustomizationColor;
import com.usercentrics.sdk.v2.settings.data.CustomizationFont;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCustomization;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import com.usercentrics.sdk.v2.translation.data.TranslationAriaLabels;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SettingsMapper.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/usercentrics/sdk/services/settings/SettingsMapper;", "Lcom/usercentrics/sdk/services/settings/ISettingsMapper;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "servicesMapper", "Lcom/usercentrics/sdk/services/settings/ISettingsServiceMapper;", "generatorIds", "Lcom/usercentrics/sdk/services/settings/IGeneratorIds;", "(Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/services/settings/ISettingsServiceMapper;Lcom/usercentrics/sdk/services/settings/IGeneratorIds;)V", "getValidControllerId", "", "controllerId", "map", "Lcom/usercentrics/sdk/models/settings/LegacyExtendedSettings;", "apiSettings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "apiServices", "", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;", "translations", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "mapCustomization", "Lcom/usercentrics/sdk/models/settings/PredefinedUICustomization;", "mapLanguage", "Lcom/usercentrics/sdk/models/settings/PredefinedUILanguageSettings;", "mapLegacyTCFUISettings", "Lcom/usercentrics/sdk/models/tcf/TCFUISettings;", "mapShowFirstLayerOnVersionChange", "", "showInitialViewForVersionChange", "mapUILabelsFromApiSettings", "Lcom/usercentrics/sdk/models/gdpr/DefaultLabels;", "mapUISettings", "Lcom/usercentrics/sdk/models/gdpr/DefaultUISettings;", "validateRawColor", "name", "rawValue", "defaultValue", "emptyToNull", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsMapper implements ISettingsMapper {
    private final IGeneratorIds generatorIds;
    private final UsercentricsLogger logger;
    private final ISettingsServiceMapper servicesMapper;

    public SettingsMapper(UsercentricsLogger logger, ISettingsServiceMapper servicesMapper, IGeneratorIds generatorIds) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(servicesMapper, "servicesMapper");
        Intrinsics.checkNotNullParameter(generatorIds, "generatorIds");
        this.logger = logger;
        this.servicesMapper = servicesMapper;
        this.generatorIds = generatorIds;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsMapper
    public LegacyExtendedSettings map(UsercentricsSettings apiSettings, List<UsercentricsService> apiServices, LegalBasisLocalization translations, String controllerId) {
        Intrinsics.checkNotNullParameter(apiSettings, "apiSettings");
        Intrinsics.checkNotNullParameter(apiServices, "apiServices");
        Intrinsics.checkNotNullParameter(translations, "translations");
        List<UsercentricsCategory> categories$usercentrics_release = apiSettings.getCategories$usercentrics_release();
        if (categories$usercentrics_release == null) {
            categories$usercentrics_release = CollectionsKt.emptyList();
        }
        List<UsercentricsCategory> list = categories$usercentrics_release;
        List<LegacyService> map = this.servicesMapper.map(apiSettings, apiServices, translations);
        GDPROptions gDPROptions = new GDPROptions(apiSettings.getDisplayOnlyForEU(), apiSettings.getReshowBanner());
        CCPASettings ccpa = apiSettings.getCcpa();
        String validControllerId = getValidControllerId(controllerId);
        String settingsId = apiSettings.getSettingsId();
        boolean tcf2Enabled = apiSettings.getTcf2Enabled();
        List<Integer> mapShowFirstLayerOnVersionChange = mapShowFirstLayerOnVersionChange(apiSettings.getShowInitialViewForVersionChange());
        TCFUISettings mapLegacyTCFUISettings = mapLegacyTCFUISettings(translations, apiSettings);
        DefaultUISettings mapUISettings = mapUISettings(apiSettings, translations);
        String version = apiSettings.getVersion();
        USAFrameworks framework = apiSettings.getFramework();
        return new LegacyExtendedSettings(list, map, gDPROptions, ccpa, validControllerId, settingsId, tcf2Enabled, mapShowFirstLayerOnVersionChange, mapLegacyTCFUISettings, mapUISettings, version, framework != null ? framework.name() : null, null, apiSettings.getRenewConsentsTimestamp(), 4096, null);
    }

    private final String getValidControllerId(String controllerId) {
        String str = controllerId;
        return (str == null || StringsKt.isBlank(str)) ? this.generatorIds.generateControllerId() : controllerId;
    }

    private final DefaultUISettings mapUISettings(UsercentricsSettings apiSettings, LegalBasisLocalization translations) {
        if (apiSettings.getTcf2Enabled()) {
            return null;
        }
        return new DefaultUISettings(mapCustomization(apiSettings), mapLanguage(apiSettings), mapUILabelsFromApiSettings(apiSettings, translations));
    }

    private final TCFUISettings mapLegacyTCFUISettings(LegalBasisLocalization translations, UsercentricsSettings apiSettings) {
        if (!apiSettings.getTcf2Enabled() || apiSettings.getTcf2() == null) {
            return null;
        }
        return new TCFUISettings(mapCustomization(apiSettings), mapLanguage(apiSettings), new TCFLabels(translations.getLabels$usercentrics_release().getVendorsOutsideEU(), mapUILabelsFromApiSettings(apiSettings, translations), new PredefinedUICookieInformationLabels(apiSettings.getLabels().getAnyDomain(), apiSettings.getLabels().getDay(), apiSettings.getLabels().getDays(), apiSettings.getLabels().getDomain(), apiSettings.getLabels().getDuration(), apiSettings.getLabels().getInformationLoadingNotPossible(), apiSettings.getLabels().getHour(), apiSettings.getLabels().getHours(), apiSettings.getLabels().getIdentifier(), apiSettings.getLabels().getLoadingStorageInformation(), apiSettings.getLabels().getMaximumAgeCookieStorage(), apiSettings.getLabels().getMinute(), apiSettings.getLabels().getMinutes(), apiSettings.getLabels().getMonth(), apiSettings.getLabels().getMonths(), apiSettings.getLabels().getMultipleDomains(), apiSettings.getLabels().getNo(), apiSettings.getLabels().getNonCookieStorage(), apiSettings.getLabels().getSecond(), apiSettings.getLabels().getSeconds(), apiSettings.getLabels().getSession(), apiSettings.getLabels().getStorageInformation(), apiSettings.getLabels().getDetailedStorageInformation(), apiSettings.getLabels().getTryAgain(), apiSettings.getLabels().getType(), apiSettings.getLabels().getYear(), apiSettings.getLabels().getYears(), apiSettings.getLabels().getYes(), apiSettings.getLabels().getStorageInformationDescription(), translations.getLabels$usercentrics_release().getCookieStorage(), translations.getLabels$usercentrics_release().getCookieRefresh(), apiSettings.getTcf2().getLabelsPurposes())), apiSettings.getTcf2().isAdditionalConsentModeEnabled$usercentrics_release(), apiSettings.getTcf2().getSelectedATPIds());
    }

    private final String validateRawColor(String name, String rawValue, String defaultValue) {
        if (Color.INSTANCE.isValid(rawValue)) {
            return rawValue;
        }
        UsercentricsLogger.DefaultImpls.warning$default(this.logger, "Configured color (" + rawValue + ") for '" + name + "' should be a valid hexadecimal, default color will be used " + defaultValue, null, 2, null);
        return defaultValue;
    }

    private final PredefinedUICustomization mapCustomization(UsercentricsSettings apiSettings) {
        Object m11180constructorimpl;
        String str;
        String str2;
        Integer borderRadiusLayer;
        CustomizationFont font;
        Integer size;
        CustomizationFont font2;
        String ccpaButtonTextColor;
        String acceptBtnText;
        Float overlayOpacity;
        Integer borderRadiusButton;
        UsercentricsCustomization customization = apiSettings.getCustomization();
        CustomizationColor color = customization != null ? customization.getColor() : null;
        String primary = color != null ? color.getPrimary() : null;
        if (primary == null) {
            primary = "";
        }
        String validateRawColor = validateRawColor("primary", primary, "#0045A5");
        UsercentricsShadedColor generateShadedColor = PredefinedUIColorMachine.INSTANCE.generateShadedColor(validateRawColor);
        String text = color != null ? color.getText() : null;
        if (text == null) {
            text = "";
        }
        UsercentricsShadedColor generateShadedColor2 = PredefinedUIColorMachine.INSTANCE.generateShadedColor(validateRawColor("text", text, "#303030"));
        String overlay = color != null ? color.getOverlay() : null;
        if (overlay == null) {
            overlay = "";
        }
        String validateRawColor2 = validateRawColor("overlay", overlay, PredefinedUICustomizationColor.defaultOverlayColor);
        int intValue = (customization == null || (borderRadiusButton = customization.getBorderRadiusButton()) == null) ? 4 : borderRadiusButton.intValue();
        try {
            Result.Companion companion = Result.INSTANCE;
            SettingsMapper settingsMapper = this;
            m11180constructorimpl = Result.m11180constructorimpl((customization == null || (overlayOpacity = customization.getOverlayOpacity()) == null) ? null : Double.valueOf(overlayOpacity.floatValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        Double d = (Double) m11180constructorimpl;
        double doubleValue = d != null ? d.doubleValue() : 1.0d;
        String layerBackground = color != null ? color.getLayerBackground() : null;
        if (layerBackground == null) {
            layerBackground = "";
        }
        String validateRawColor3 = validateRawColor("layerBackground", layerBackground, "#FFFFFF");
        String lightenColor = PredefinedUIColorMachine.INSTANCE.lightenColor(validateRawColor3, 0.05d);
        String tabsBorderColor = color != null ? color.getTabsBorderColor() : null;
        if (tabsBorderColor == null) {
            tabsBorderColor = "";
        }
        String validateRawColor4 = validateRawColor("tabsBorderColor", tabsBorderColor, PredefinedUICustomizationColor.defaultTabsBorderColor);
        String emptyToNull = emptyToNull(color != null ? color.getAcceptBtnBackground() : null);
        if (emptyToNull == null) {
            emptyToNull = "#0045A5";
        }
        if (color == null || (acceptBtnText = color.getAcceptBtnText()) == null || (str = emptyToNull(acceptBtnText)) == null) {
            str = "#FAFAFA";
        }
        PredefinedUICustomizationColorButton predefinedUICustomizationColorButton = new PredefinedUICustomizationColorButton(str, emptyToNull, intValue);
        String emptyToNull2 = emptyToNull(color != null ? color.getDenyBtnBackground() : null);
        String str3 = emptyToNull2 != null ? emptyToNull2 : "#0045A5";
        String emptyToNull3 = emptyToNull(color != null ? color.getDenyBtnText() : null);
        PredefinedUICustomizationColorButton predefinedUICustomizationColorButton2 = new PredefinedUICustomizationColorButton(emptyToNull3 != null ? emptyToNull3 : "#FAFAFA", str3, intValue);
        String emptyToNull4 = emptyToNull(color != null ? color.getSaveBtnBackground() : null);
        if (emptyToNull4 == null) {
            emptyToNull4 = "#F5F5F5";
        }
        String emptyToNull5 = emptyToNull(color != null ? color.getSaveBtnText() : null);
        if (emptyToNull5 == null) {
            emptyToNull5 = "#303030";
        }
        PredefinedUICustomizationColorButton predefinedUICustomizationColorButton3 = new PredefinedUICustomizationColorButton(emptyToNull5, emptyToNull4, intValue);
        String emptyToNull6 = emptyToNull(color != null ? color.getSaveBtnBackground() : null);
        if (emptyToNull6 == null) {
            emptyToNull6 = "#F5F5F5";
        }
        String emptyToNull7 = emptyToNull(color != null ? color.getSaveBtnText() : null);
        if (emptyToNull7 == null) {
            emptyToNull7 = "#303030";
        }
        PredefinedUICustomizationColorButton predefinedUICustomizationColorButton4 = new PredefinedUICustomizationColorButton(emptyToNull7, emptyToNull6, intValue);
        String emptyToNull8 = emptyToNull(color != null ? color.getCcpaButtonColor() : null);
        String str4 = emptyToNull8 != null ? emptyToNull8 : "#F5F5F5";
        if (color == null || (ccpaButtonTextColor = color.getCcpaButtonTextColor()) == null || (str2 = emptyToNull(ccpaButtonTextColor)) == null) {
            str2 = "#303030";
        }
        PredefinedUICustomizationColorButton predefinedUICustomizationColorButton5 = new PredefinedUICustomizationColorButton(str2, str4, intValue);
        String emptyToNull9 = emptyToNull(color != null ? color.getToggleActiveBackground() : null);
        if (emptyToNull9 == null) {
            emptyToNull9 = generateShadedColor.getColor80();
        }
        String str5 = emptyToNull9;
        String emptyToNull10 = emptyToNull(color != null ? color.getToggleInactiveBackground() : null);
        if (emptyToNull10 == null) {
            emptyToNull10 = generateShadedColor2.getColor80();
        }
        String str6 = emptyToNull10;
        String emptyToNull11 = emptyToNull(color != null ? color.getToggleDisabledBackground() : null);
        if (emptyToNull11 == null) {
            emptyToNull11 = generateShadedColor2.getColor16();
        }
        String str7 = emptyToNull11;
        String emptyToNull12 = emptyToNull(color != null ? color.getToggleActiveIcon() : null);
        String str8 = emptyToNull12 == null ? "#FFFFFF" : emptyToNull12;
        String emptyToNull13 = emptyToNull(color != null ? color.getToggleDisabledIcon() : null);
        String str9 = emptyToNull13 == null ? "#FFFFFF" : emptyToNull13;
        String emptyToNull14 = emptyToNull(color != null ? color.getToggleInactiveIcon() : null);
        PredefinedUICustomizationColorToggles predefinedUICustomizationColorToggles = new PredefinedUICustomizationColorToggles(str5, str6, str7, str8, emptyToNull14 == null ? "#FFFFFF" : emptyToNull14, str9);
        String emptyToNull15 = emptyToNull(color != null ? color.getLinkFont() : null);
        String str10 = emptyToNull15 == null ? "#303030" : emptyToNull15;
        String emptyToNull16 = emptyToNull(color != null ? color.getSecondLayerTab() : null);
        PredefinedUICustomizationColor predefinedUICustomizationColor = new PredefinedUICustomizationColor(generateShadedColor2, predefinedUICustomizationColorButton, predefinedUICustomizationColorButton2, predefinedUICustomizationColorButton3, predefinedUICustomizationColorButton5, predefinedUICustomizationColorButton4, predefinedUICustomizationColorToggles, validateRawColor3, lightenColor, str10, emptyToNull16 == null ? validateRawColor : emptyToNull16, validateRawColor2, doubleValue, validateRawColor4);
        String emptyToNull17 = emptyToNull((customization == null || (font2 = customization.getFont()) == null) ? null : font2.getFamily());
        return new PredefinedUICustomization(predefinedUICustomizationColor, new PredefinedUICustomizationFont(emptyToNull17 != null ? emptyToNull17 : "", (customization == null || (font = customization.getFont()) == null || (size = font.getSize()) == null) ? 14 : size.intValue()), customization != null ? customization.getLogoUrl() : null, (customization == null || (borderRadiusLayer = customization.getBorderRadiusLayer()) == null) ? 8 : borderRadiusLayer.intValue());
    }

    private final List<Integer> mapShowFirstLayerOnVersionChange(List<String> showInitialViewForVersionChange) {
        int ordinal;
        List<String> list = showInitialViewForVersionChange;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            String lowerCase = "MAJOR".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(str, lowerCase)) {
                ordinal = SettingsVersion.MAJOR.ordinal();
            } else {
                String lowerCase2 = "MINOR".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.areEqual(str, lowerCase2)) {
                    ordinal = SettingsVersion.MINOR.ordinal();
                } else {
                    String lowerCase3 = HttpClientStack.HttpPatch.METHOD_NAME.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    ordinal = Intrinsics.areEqual(str, lowerCase3) ? SettingsVersion.PATCH.ordinal() : -1;
                }
            }
            arrayList.add(Integer.valueOf(ordinal));
        }
        return arrayList;
    }

    private final PredefinedUILanguageSettings mapLanguage(UsercentricsSettings apiSettings) {
        List<String> languagesAvailable = apiSettings.getLanguagesAvailable();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(languagesAvailable, 10));
        Iterator<T> it = languagesAvailable.iterator();
        while (it.hasNext()) {
            arrayList.add(new PredefinedUILanguage((String) it.next()));
        }
        return new PredefinedUILanguageSettings(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.usercentrics.sdk.services.settings.SettingsMapper$mapLanguage$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((PredefinedUILanguage) t).getFullName(), ((PredefinedUILanguage) t2).getFullName());
            }
        }), new PredefinedUILanguage(apiSettings.getLanguage()));
    }

    private final DefaultLabels mapUILabelsFromApiSettings(UsercentricsSettings apiSettings, LegalBasisLocalization translations) {
        PredefinedUIGeneralLabels predefinedUIGeneralLabels = new PredefinedUIGeneralLabels(translations.getLabels$usercentrics_release().getControllerIdTitle(), apiSettings.getLabels().getDate(), apiSettings.getLabels().getDecision(), apiSettings.getLabels().getBtnBannerReadMore(), apiSettings.getLabels().getBtnMore(), apiSettings.getLabels().getBtnAcceptAll(), apiSettings.getLabels().getBtnDeny(), translations.getLabels$usercentrics_release().getCnilDenyLinkText());
        PredefinedUIServiceLabels predefinedUIServiceLabels = new PredefinedUIServiceLabels(new PredefinedUIDescriptionTitle(apiSettings.getLabels().getDataCollectedInfo(), apiSettings.getLabels().getDataCollectedList()), new PredefinedUIDataDistributionTitle(apiSettings.getLabels().getLocationOfProcessing(), apiSettings.getLabels().getTransferToThirdCountries(), apiSettings.getLabels().getTransferToThirdCountriesInfo()), new PredefinedUIDescriptionTitle(apiSettings.getLabels().getDataPurposesInfo(), apiSettings.getLabels().getDataPurposes()), apiSettings.getLabels().getDataRecipientsList(), apiSettings.getLabels().getDescriptionOfService(), new PredefinedUIDescriptionTitle(apiSettings.getLabels().getHistoryDescription(), apiSettings.getLabels().getHistory()), new PredefinedUIDescriptionTitle(apiSettings.getLabels().getLegalBasisInfo(), apiSettings.getLabels().getLegalBasisList()), apiSettings.getLabels().getProcessingCompanyTitle(), apiSettings.getLabels().getRetentionPeriod(), new PredefinedUIDescriptionTitle(apiSettings.getLabels().getTechnologiesUsedInfo(), apiSettings.getLabels().getTechnologiesUsed()), new PredefinedUIURLsTitle(apiSettings.getLabels().getCookiePolicyInfo(), apiSettings.getLabels().getLinkToDpaInfo(), apiSettings.getLabels().getOptOut(), apiSettings.getLabels().getPolicyOf()));
        TranslationAriaLabels labelsAria = translations.getLabelsAria();
        String acceptAllButton = labelsAria != null ? labelsAria.getAcceptAllButton() : null;
        TranslationAriaLabels labelsAria2 = translations.getLabelsAria();
        String ccpaButton = labelsAria2 != null ? labelsAria2.getCcpaButton() : null;
        TranslationAriaLabels labelsAria3 = translations.getLabelsAria();
        String ccpaMoreInformation = labelsAria3 != null ? labelsAria3.getCcpaMoreInformation() : null;
        TranslationAriaLabels labelsAria4 = translations.getLabelsAria();
        String closeButton = labelsAria4 != null ? labelsAria4.getCloseButton() : null;
        TranslationAriaLabels labelsAria5 = translations.getLabelsAria();
        String collapse = labelsAria5 != null ? labelsAria5.getCollapse() : null;
        TranslationAriaLabels labelsAria6 = translations.getLabelsAria();
        String cookiePolicyButton = labelsAria6 != null ? labelsAria6.getCookiePolicyButton() : null;
        TranslationAriaLabels labelsAria7 = translations.getLabelsAria();
        String copyControllerId = labelsAria7 != null ? labelsAria7.getCopyControllerId() : null;
        TranslationAriaLabels labelsAria8 = translations.getLabelsAria();
        String denyAllButton = labelsAria8 != null ? labelsAria8.getDenyAllButton() : null;
        TranslationAriaLabels labelsAria9 = translations.getLabelsAria();
        String expand = labelsAria9 != null ? labelsAria9.getExpand() : null;
        TranslationAriaLabels labelsAria10 = translations.getLabelsAria();
        String fullscreenButton = labelsAria10 != null ? labelsAria10.getFullscreenButton() : null;
        TranslationAriaLabels labelsAria11 = translations.getLabelsAria();
        String imprintButton = labelsAria11 != null ? labelsAria11.getImprintButton() : null;
        TranslationAriaLabels labelsAria12 = translations.getLabelsAria();
        String languageSelector = labelsAria12 != null ? labelsAria12.getLanguageSelector() : null;
        TranslationAriaLabels labelsAria13 = translations.getLabelsAria();
        String privacyButton = labelsAria13 != null ? labelsAria13.getPrivacyButton() : null;
        TranslationAriaLabels labelsAria14 = translations.getLabelsAria();
        String privacyPolicyButton = labelsAria14 != null ? labelsAria14.getPrivacyPolicyButton() : null;
        TranslationAriaLabels labelsAria15 = translations.getLabelsAria();
        String saveButton = labelsAria15 != null ? labelsAria15.getSaveButton() : null;
        TranslationAriaLabels labelsAria16 = translations.getLabelsAria();
        String serviceInCategoryDetails = labelsAria16 != null ? labelsAria16.getServiceInCategoryDetails() : null;
        TranslationAriaLabels labelsAria17 = translations.getLabelsAria();
        String servicesInCategory = labelsAria17 != null ? labelsAria17.getServicesInCategory() : null;
        TranslationAriaLabels labelsAria18 = translations.getLabelsAria();
        String tabButton = labelsAria18 != null ? labelsAria18.getTabButton() : null;
        TranslationAriaLabels labelsAria19 = translations.getLabelsAria();
        String usercentricsCMPButtons = labelsAria19 != null ? labelsAria19.getUsercentricsCMPButtons() : null;
        TranslationAriaLabels labelsAria20 = translations.getLabelsAria();
        String usercentricsCMPContent = labelsAria20 != null ? labelsAria20.getUsercentricsCMPContent() : null;
        TranslationAriaLabels labelsAria21 = translations.getLabelsAria();
        String usercentricsCMPHeader = labelsAria21 != null ? labelsAria21.getUsercentricsCMPHeader() : null;
        TranslationAriaLabels labelsAria22 = translations.getLabelsAria();
        String usercentricsCMPUI = labelsAria22 != null ? labelsAria22.getUsercentricsCMPUI() : null;
        TranslationAriaLabels labelsAria23 = translations.getLabelsAria();
        String usercentricsCard = labelsAria23 != null ? labelsAria23.getUsercentricsCard() : null;
        TranslationAriaLabels labelsAria24 = translations.getLabelsAria();
        String usercentricsList = labelsAria24 != null ? labelsAria24.getUsercentricsList() : null;
        TranslationAriaLabels labelsAria25 = translations.getLabelsAria();
        String vendorConsentToggle = labelsAria25 != null ? labelsAria25.getVendorConsentToggle() : null;
        TranslationAriaLabels labelsAria26 = translations.getLabelsAria();
        String vendorDetailedStorageInformation = labelsAria26 != null ? labelsAria26.getVendorDetailedStorageInformation() : null;
        TranslationAriaLabels labelsAria27 = translations.getLabelsAria();
        String vendorLegIntToggle = labelsAria27 != null ? labelsAria27.getVendorLegIntToggle() : null;
        UsercentricsCustomization customization = apiSettings.getCustomization();
        return new DefaultLabels(predefinedUIGeneralLabels, predefinedUIServiceLabels, new PredefinedUIAriaLabels(acceptAllButton, ccpaButton, ccpaMoreInformation, closeButton, collapse, cookiePolicyButton, copyControllerId, denyAllButton, expand, fullscreenButton, imprintButton, languageSelector, privacyButton, privacyPolicyButton, saveButton, serviceInCategoryDetails, servicesInCategory, tabButton, usercentricsCMPButtons, usercentricsCMPContent, usercentricsCMPHeader, usercentricsCMPUI, usercentricsCard, usercentricsList, vendorConsentToggle, vendorDetailedStorageInformation, vendorLegIntToggle, customization != null ? customization.getLogoAltTag() : null));
    }

    private final String emptyToNull(String str) {
        if (str == null || str.length() != 0) {
            return str;
        }
        return null;
    }
}
