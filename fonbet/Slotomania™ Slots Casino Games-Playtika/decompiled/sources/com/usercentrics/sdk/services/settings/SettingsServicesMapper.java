package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.extensions.ArrayExtensionsKt;
import com.usercentrics.sdk.models.settings.LegacyBasicService;
import com.usercentrics.sdk.models.settings.LegacyConsent;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedUIDataDistribution;
import com.usercentrics.sdk.models.settings.PredefinedUIProcessingCompany;
import com.usercentrics.sdk.models.settings.PredefinedUIURLs;
import com.usercentrics.sdk.v2.settings.data.ConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.ServiceConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.SubConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SettingsServicesMapper.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J:\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0002J2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/usercentrics/sdk/services/settings/SettingsServicesMapper;", "Lcom/usercentrics/sdk/services/settings/ISettingsServiceMapper;", "idsGenerator", "Lcom/usercentrics/sdk/services/settings/IGeneratorIds;", "(Lcom/usercentrics/sdk/services/settings/IGeneratorIds;)V", "createUsercentricsService", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;", "serviceConsent", "Lcom/usercentrics/sdk/v2/settings/data/ConsentTemplate;", "findServicesFromAggregatorArray", "apiServices", "", "map", "Lcom/usercentrics/sdk/models/settings/LegacyService;", "apiSettings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "translations", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "mapBaseService", "Lcom/usercentrics/sdk/models/settings/LegacyBasicService;", "mapService", "serviceConsentTemplate", "Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;", "categoriesMap", "", "", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "mapSubServices", "apiSubServices", "Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate;", "resolveLegalBasisList", "apiService", "apiAggregatorService", "resolveStatus", "", "apiCategory", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SettingsServicesMapper implements ISettingsServiceMapper {
    private final IGeneratorIds idsGenerator;

    public SettingsServicesMapper(IGeneratorIds idsGenerator) {
        Intrinsics.checkNotNullParameter(idsGenerator, "idsGenerator");
        this.idsGenerator = idsGenerator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.usercentrics.sdk.services.settings.ISettingsServiceMapper
    public List<LegacyService> map(UsercentricsSettings apiSettings, List<UsercentricsService> apiServices, LegalBasisLocalization translations) {
        LinkedHashMap emptyMap;
        Intrinsics.checkNotNullParameter(apiSettings, "apiSettings");
        Intrinsics.checkNotNullParameter(apiServices, "apiServices");
        Intrinsics.checkNotNullParameter(translations, "translations");
        List<UsercentricsCategory> categories$usercentrics_release = apiSettings.getCategories$usercentrics_release();
        if (categories$usercentrics_release == null) {
            emptyMap = MapsKt.emptyMap();
        } else {
            List<UsercentricsCategory> list = categories$usercentrics_release;
            emptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                emptyMap.put(((UsercentricsCategory) obj).getCategorySlug(), obj);
            }
        }
        List<ServiceConsentTemplate> consentTemplates$usercentrics_release = apiSettings.getConsentTemplates$usercentrics_release();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(consentTemplates$usercentrics_release, 10));
        Iterator<T> it = consentTemplates$usercentrics_release.iterator();
        while (it.hasNext()) {
            arrayList.add(mapService((ServiceConsentTemplate) it.next(), apiServices, translations, emptyMap));
        }
        return ArrayExtensionsKt.sortedAlphaBy$default(arrayList, false, new Function1<LegacyService, String>() { // from class: com.usercentrics.sdk.services.settings.SettingsServicesMapper$map$apiSettingsMapped$2
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(LegacyService it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getName();
            }
        }, 1, null);
    }

    private final LegacyService mapService(ServiceConsentTemplate serviceConsentTemplate, List<UsercentricsService> apiServices, LegalBasisLocalization translations, Map<String, UsercentricsCategory> categoriesMap) {
        String str;
        UsercentricsCategory usercentricsCategory = categoriesMap.get(serviceConsentTemplate.getCategorySlug());
        LegacyBasicService mapBaseService = mapBaseService(serviceConsentTemplate, apiServices, translations);
        boolean resolveStatus = resolveStatus(serviceConsentTemplate, usercentricsCategory);
        String generateProcessorId = this.idsGenerator.generateProcessorId();
        List<String> dataCollected = mapBaseService.getDataCollected();
        PredefinedUIDataDistribution dataDistribution = mapBaseService.getDataDistribution();
        List<String> dataPurposes = mapBaseService.getDataPurposes();
        List<String> dataRecipients = mapBaseService.getDataRecipients();
        String serviceDescription = mapBaseService.getServiceDescription();
        String id = mapBaseService.getId();
        List<String> legalBasis = mapBaseService.getLegalBasis();
        String name = mapBaseService.getName();
        PredefinedUIProcessingCompany processingCompany = mapBaseService.getProcessingCompany();
        String retentionPeriodDescription = mapBaseService.getRetentionPeriodDescription();
        List<String> technologiesUsed = mapBaseService.getTechnologiesUsed();
        PredefinedUIURLs urls = mapBaseService.getUrls();
        String version = mapBaseService.getVersion();
        String categorySlug = serviceConsentTemplate.getCategorySlug();
        if (categorySlug == null) {
            categorySlug = "";
        }
        if (usercentricsCategory == null || (str = usercentricsCategory.getLabel()) == null) {
            str = "";
        }
        LegacyConsent legacyConsent = new LegacyConsent(CollectionsKt.emptyList(), resolveStatus);
        boolean isEssential = usercentricsCategory != null ? usercentricsCategory.isEssential() : false;
        Boolean disableLegalBasis = mapBaseService.getDisableLegalBasis();
        return new LegacyService(dataCollected, dataDistribution, dataPurposes, dataRecipients, serviceDescription, id, legalBasis, name, processingCompany, retentionPeriodDescription, technologiesUsed, urls, version, categorySlug, str, legacyConsent, isEssential, disableLegalBasis != null ? disableLegalBasis.booleanValue() : false, generateProcessorId, mapSubServices(serviceConsentTemplate.getSubConsents(), apiServices, translations), mapBaseService.getCookieMaxAgeSeconds(), mapBaseService.getUsesNonCookieAccess(), mapBaseService.getDeviceStorageDisclosureUrl(), mapBaseService.getDeviceStorage(), mapBaseService.isHidden(), serviceConsentTemplate.getDefaultConsentStatus());
    }

    private final LegacyBasicService mapBaseService(ConsentTemplate serviceConsent, List<UsercentricsService> apiServices, LegalBasisLocalization translations) {
        String str;
        boolean z;
        UsercentricsService findServicesFromAggregatorArray = findServicesFromAggregatorArray(serviceConsent, apiServices);
        List<String> dataCollectedList = findServicesFromAggregatorArray.getDataCollectedList();
        PredefinedUIDataDistribution predefinedUIDataDistribution = new PredefinedUIDataDistribution(findServicesFromAggregatorArray.getLocationOfProcessing(), findServicesFromAggregatorArray.getThirdCountryTransfer());
        List<String> dataPurposesList = findServicesFromAggregatorArray.getDataPurposesList();
        if (dataPurposesList.isEmpty()) {
            dataPurposesList = findServicesFromAggregatorArray.getDataPurposes();
        }
        List<String> list = dataPurposesList;
        List<String> dataRecipientsList = findServicesFromAggregatorArray.getDataRecipientsList();
        String descriptionOfService = findServicesFromAggregatorArray.getDescriptionOfService();
        String templateId = serviceConsent.getTemplateId();
        List<String> resolveLegalBasisList = resolveLegalBasisList(serviceConsent, findServicesFromAggregatorArray, translations);
        String dataProcessor = findServicesFromAggregatorArray.getDataProcessor();
        if (dataProcessor != null && !StringsKt.isBlank(dataProcessor)) {
            str = findServicesFromAggregatorArray.getDataProcessor();
        } else {
            str = "";
        }
        PredefinedUIProcessingCompany predefinedUIProcessingCompany = new PredefinedUIProcessingCompany(findServicesFromAggregatorArray.getAddressOfProcessingCompany(), findServicesFromAggregatorArray.getDataProtectionOfficer(), findServicesFromAggregatorArray.getNameOfProcessingCompany());
        String retentionPeriodDescription = findServicesFromAggregatorArray.getRetentionPeriodDescription();
        List<String> technologyUsed = findServicesFromAggregatorArray.getTechnologyUsed();
        PredefinedUIURLs predefinedUIURLs = new PredefinedUIURLs(findServicesFromAggregatorArray.getCookiePolicyURL(), findServicesFromAggregatorArray.getLinkToDpa(), findServicesFromAggregatorArray.getOptOutUrl(), findServicesFromAggregatorArray.getPrivacyPolicyURL());
        String version = serviceConsent.getVersion();
        if (serviceConsent instanceof ServiceConsentTemplate) {
            z = ((ServiceConsentTemplate) serviceConsent).getDisableLegalBasis();
        } else {
            z = false;
        }
        return new LegacyBasicService(dataCollectedList, predefinedUIDataDistribution, list, dataRecipientsList, descriptionOfService, templateId, resolveLegalBasisList, str, z, predefinedUIProcessingCompany, retentionPeriodDescription, technologyUsed, predefinedUIURLs, version, findServicesFromAggregatorArray.getCookieMaxAgeSeconds(), findServicesFromAggregatorArray.getUsesNonCookieAccess(), findServicesFromAggregatorArray.getDeviceStorageDisclosureUrl(), findServicesFromAggregatorArray.getDeviceStorage(), findServicesFromAggregatorArray.getDpsDisplayFormat(), findServicesFromAggregatorArray.isHidden());
    }

    private final UsercentricsService findServicesFromAggregatorArray(ConsentTemplate serviceConsent, List<UsercentricsService> apiServices) {
        Object obj;
        Iterator<T> it = apiServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            UsercentricsService usercentricsService = (UsercentricsService) obj;
            if (Intrinsics.areEqual(serviceConsent.getTemplateId(), usercentricsService.getTemplateId()) && Intrinsics.areEqual(serviceConsent.getVersion(), usercentricsService.getVersion())) {
                break;
            }
        }
        UsercentricsService usercentricsService2 = (UsercentricsService) obj;
        return usercentricsService2 == null ? createUsercentricsService(serviceConsent) : usercentricsService2;
    }

    private final UsercentricsService createUsercentricsService(ConsentTemplate serviceConsent) {
        String description = serviceConsent.getDescription();
        return new UsercentricsService(serviceConsent.getTemplateId(), serviceConsent.getVersion(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, serviceConsent.getCategorySlug(), null, null, null, null, null, null, null, null, description, null, null, null, null, null, serviceConsent.isHidden(), null, serviceConsent.isDeactivated(), null, null, false, -67108868, 30199, null);
    }

    private final boolean resolveStatus(ServiceConsentTemplate apiService, UsercentricsCategory apiCategory) {
        if (apiCategory != null && apiCategory.isEssential()) {
            return true;
        }
        Boolean defaultConsentStatus = apiService.getDefaultConsentStatus();
        if (defaultConsentStatus != null) {
            return defaultConsentStatus.booleanValue();
        }
        return false;
    }

    private final List<LegacyBasicService> mapSubServices(List<SubConsentTemplate> apiSubServices, List<UsercentricsService> apiServices, LegalBasisLocalization translations) {
        List<SubConsentTemplate> list = apiSubServices;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapBaseService((SubConsentTemplate) it.next(), apiServices, translations));
        }
        return arrayList;
    }

    private final List<String> resolveLegalBasisList(ConsentTemplate apiService, UsercentricsService apiAggregatorService, LegalBasisLocalization translations) {
        ServiceConsentTemplate serviceConsentTemplate;
        List<String> legalBasisList;
        String str;
        if ((apiService instanceof ServiceConsentTemplate) && (legalBasisList = (serviceConsentTemplate = (ServiceConsentTemplate) apiService).getLegalBasisList()) != null && (!legalBasisList.isEmpty())) {
            List<String> legalBasisList2 = serviceConsentTemplate.getLegalBasisList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legalBasisList2, 10));
            for (String str2 : legalBasisList2) {
                Map<String, String> data = translations.getData();
                if (data != null && (str = data.get(str2)) != null) {
                    str2 = str;
                }
                arrayList.add(str2);
            }
            return arrayList;
        }
        if (!apiAggregatorService.getLegalBasisList().isEmpty()) {
            return apiAggregatorService.getLegalBasisList();
        }
        return CollectionsKt.listOf(apiAggregatorService.getLegalGround());
    }
}
