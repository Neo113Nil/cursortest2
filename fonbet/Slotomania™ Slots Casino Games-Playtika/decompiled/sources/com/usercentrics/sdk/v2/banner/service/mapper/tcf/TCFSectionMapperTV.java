package com.usercentrics.sdk.v2.banner.service.mapper.tcf;

import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.CategoryProps;
import com.usercentrics.sdk.PurposeProps;
import com.usercentrics.sdk.SpecialFeatureProps;
import com.usercentrics.sdk.UsercentricsMaps;
import com.usercentrics.sdk.VendorProps;
import com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerCardEntry;
import com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerCardSection;
import com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerDetailsEntry;
import com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerSettingsContent;
import com.usercentrics.sdk.models.settings.PredefinedUIDecision;
import com.usercentrics.sdk.models.settings.PredefinedUIToggleSettings;
import com.usercentrics.sdk.models.settings.ServicesIdStrategy;
import com.usercentrics.sdk.models.tcf.TCFLabels;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.services.tcf.interfaces.TCFFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
import com.usercentrics.sdk.v2.banner.service.mapper.gdpr.GDPRSectionMapperTV;
import com.usercentrics.sdk.v2.settings.data.TCF2Settings;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TCFSectionMapperTV.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\u0010\u000fJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 J\n\u0010!\u001a\u0004\u0018\u00010\u0019H\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\n\u0010)\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020+H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0019H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/TCFSectionMapperTV;", "", "tcfData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "settings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "translations", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "labels", "Lcom/usercentrics/sdk/models/tcf/TCFLabels;", "categories", "", "Lcom/usercentrics/sdk/CategoryProps;", "adTechProviders", "Lcom/usercentrics/sdk/AdTechProvider;", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Lcom/usercentrics/sdk/models/tcf/TCFLabels;Ljava/util/List;Ljava/util/List;)V", "detailsLabel", "", "getDetailsLabel", "()Ljava/lang/String;", "tcf2", "Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "getTcf2", "()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "map", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerCardSection;", "mapEntriesWithIllustrations", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry;", "description", "illustrations", "numberOfVendors", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Ljava/util/List;", "tvAdTechProvidersSection", "tvFeaturesSection", "tvNonIABSection", "tvPurposeContent", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerSettingsContent;", "property", "Lcom/usercentrics/sdk/PurposeProps;", "tvPurposesSection", "tvSpecialFeaturesSection", "tvVendorContent", "Lcom/usercentrics/sdk/VendorProps;", "tvVendorsSection", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TCFSectionMapperTV {
    private final List<AdTechProvider> adTechProviders;
    private final List<CategoryProps> categories;
    private final TCFLabels labels;
    private final UsercentricsSettings settings;
    private final TCFData tcfData;
    private final LegalBasisLocalization translations;

    public TCFSectionMapperTV(TCFData tcfData, UsercentricsSettings settings, LegalBasisLocalization translations, TCFLabels labels, List<CategoryProps> categories, List<AdTechProvider> adTechProviders) {
        Intrinsics.checkNotNullParameter(tcfData, "tcfData");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(translations, "translations");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(adTechProviders, "adTechProviders");
        this.tcfData = tcfData;
        this.settings = settings;
        this.translations = translations;
        this.labels = labels;
        this.categories = categories;
        this.adTechProviders = adTechProviders;
    }

    private final String getDetailsLabel() {
        return this.translations.getLabels$usercentrics_release().getDetails();
    }

    private final TCF2Settings getTcf2() {
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        return tcf2;
    }

    public final List<PredefinedTVSecondLayerCardSection> map() {
        return CollectionsKt.listOfNotNull((Object[]) new PredefinedTVSecondLayerCardSection[]{tvPurposesSection(this.tcfData), tvFeaturesSection(), tvSpecialFeaturesSection(), tvNonIABSection(), tvVendorsSection(), tvAdTechProvidersSection()});
    }

    private final PredefinedTVSecondLayerCardSection tvPurposesSection(TCFData tcfData) {
        List<PurposeProps> mapPurposes = UsercentricsMaps.INSTANCE.mapPurposes(tcfData);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapPurposes, 10));
        for (PurposeProps purposeProps : mapPurposes) {
            arrayList.add(new PredefinedTVSecondLayerCardEntry("PurposesSection-" + purposeProps.getPurpose().getId(), purposeProps.getPurpose().getName(), null, purposeProps.getPurpose().getShowConsentToggle() ? new PredefinedUIToggleSettings(ServicesIdStrategy.INSTANCE.id(purposeProps.getPurpose()), this.settings.getLabels().getConsent(), "consent", true, purposeProps.getChecked(), null, CollectionsKt.emptyList()) : null, tvPurposeContent(purposeProps)));
        }
        ArrayList arrayList2 = arrayList;
        List<TCFSpecialPurpose> specialPurposes = tcfData.getSpecialPurposes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(specialPurposes, 10));
        for (TCFSpecialPurpose tCFSpecialPurpose : specialPurposes) {
            arrayList3.add(new PredefinedTVSecondLayerCardEntry("SpecialPurposesSection-" + tCFSpecialPurpose.getId(), tCFSpecialPurpose.getName(), null, null, new PredefinedTVSecondLayerSettingsContent.DetailsWithIllustrations(null, mapEntriesWithIllustrations$default(this, tCFSpecialPurpose.getPurposeDescription(), tCFSpecialPurpose.getIllustrations(), null, 4, null))));
        }
        List plus = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
        if (plus.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerCardSection(getTcf2().getLabelsPurposes(), plus);
    }

    private final PredefinedTVSecondLayerSettingsContent tvPurposeContent(PurposeProps property) {
        return new PredefinedTVSecondLayerSettingsContent.DetailsWithIllustrations(property.getPurpose().getShowLegitimateInterestToggle() ? new PredefinedUIToggleSettings(ServicesIdStrategy.INSTANCE.id(property.getPurpose()), getTcf2().getTogglesLegIntToggleLabel(), PredefinedUIDecision.LEGITIMATE_INTEREST_ID, true, property.getLegitimateInterestChecked(), null, CollectionsKt.emptyList()) : null, mapEntriesWithIllustrations(property.getPurpose().getPurposeDescription(), property.getPurpose().getIllustrations(), property.getPurpose().getNumberOfVendors()));
    }

    private final PredefinedTVSecondLayerCardSection tvFeaturesSection() {
        List<TCFFeature> features = this.tcfData.getFeatures();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
        for (TCFFeature tCFFeature : features) {
            arrayList.add(new PredefinedTVSecondLayerCardEntry("FeaturesSection-" + tCFFeature.getId(), tCFFeature.getName(), null, null, new PredefinedTVSecondLayerSettingsContent.DetailsWithIllustrations(null, mapEntriesWithIllustrations$default(this, tCFFeature.getPurposeDescription(), tCFFeature.getIllustrations(), null, 4, null))));
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerCardSection(getTcf2().getLabelsFeatures(), arrayList2);
    }

    private final PredefinedTVSecondLayerCardSection tvSpecialFeaturesSection() {
        TCFSectionMapperTV tCFSectionMapperTV = this;
        List<SpecialFeatureProps> mapSpecialFeatures = UsercentricsMaps.INSTANCE.mapSpecialFeatures(tCFSectionMapperTV.tcfData);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapSpecialFeatures, 10));
        for (SpecialFeatureProps specialFeatureProps : mapSpecialFeatures) {
            arrayList.add(new PredefinedTVSecondLayerCardEntry("SpecialFeaturesSection-" + specialFeatureProps.getSpecialFeature().getId(), specialFeatureProps.getSpecialFeature().getName(), null, new PredefinedUIToggleSettings(ServicesIdStrategy.INSTANCE.id(specialFeatureProps.getSpecialFeature()), tCFSectionMapperTV.settings.getLabels().getConsent(), "consent", true, specialFeatureProps.getChecked(), null, CollectionsKt.emptyList()), new PredefinedTVSecondLayerSettingsContent.DetailsWithIllustrations(null, mapEntriesWithIllustrations$default(tCFSectionMapperTV, specialFeatureProps.getSpecialFeature().getPurposeDescription(), specialFeatureProps.getSpecialFeature().getIllustrations(), null, 4, null))));
            tCFSectionMapperTV = this;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerCardSection(getTcf2().getVendorSpecialFeatures(), arrayList2);
    }

    static /* synthetic */ List mapEntriesWithIllustrations$default(TCFSectionMapperTV tCFSectionMapperTV, String str, List list, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return tCFSectionMapperTV.mapEntriesWithIllustrations(str, list, num);
    }

    private final List<PredefinedTVSecondLayerDetailsEntry> mapEntriesWithIllustrations(String description, List<String> illustrations, Integer numberOfVendors) {
        List<PredefinedTVSecondLayerDetailsEntry> mutableListOf = CollectionsKt.mutableListOf(new PredefinedTVSecondLayerDetailsEntry.TitleContent(getDetailsLabel(), description));
        if (!illustrations.isEmpty()) {
            TCF2Settings tcf2 = this.settings.getTcf2();
            Intrinsics.checkNotNull(tcf2);
            mutableListOf.add(new PredefinedTVSecondLayerDetailsEntry.TitleContent(tcf2.getExamplesLabel(), PredefinedTVSecondLayerDetailsEntry.INSTANCE.mapContentIllustrations$usercentrics_release(illustrations)));
        }
        if (numberOfVendors != null) {
            TCF2Settings tcf22 = this.settings.getTcf2();
            Intrinsics.checkNotNull(tcf22);
            mutableListOf.add(new PredefinedTVSecondLayerDetailsEntry.Text(tcf22.getTabsVendorsLabel() + ": " + numberOfVendors));
        }
        return mutableListOf;
    }

    private final PredefinedTVSecondLayerCardSection tvNonIABSection() {
        return new GDPRSectionMapperTV(getTcf2().getLabelsNonIabPurposes(), getTcf2().getLabelsNonIabVendors(), this.settings.getLabels().getConsent(), false, this.settings, this.labels.getNonTCFLabels().getService(), this.translations).map(this.categories);
    }

    private final PredefinedTVSecondLayerCardSection tvVendorsSection() {
        if (this.tcfData.getVendors().isEmpty()) {
            return null;
        }
        String labelsIabVendors = getTcf2().getLabelsIabVendors();
        List<VendorProps> mapVendors = UsercentricsMaps.INSTANCE.mapVendors(this.tcfData);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapVendors, 10));
        for (VendorProps vendorProps : mapVendors) {
            arrayList.add(new PredefinedTVSecondLayerCardEntry("VendorsSection-" + vendorProps.getVendor().getId(), vendorProps.getVendor().getName(), null, vendorProps.getVendor().getShowConsentToggle() ? new PredefinedUIToggleSettings(ServicesIdStrategy.INSTANCE.id(vendorProps.getVendor()), this.settings.getLabels().getConsent(), "consent", true, vendorProps.getChecked(), null, CollectionsKt.emptyList()) : null, tvVendorContent(vendorProps)));
        }
        return new PredefinedTVSecondLayerCardSection(labelsIabVendors, arrayList);
    }

    private final PredefinedTVSecondLayerSettingsContent tvVendorContent(VendorProps property) {
        return new PredefinedTVSecondLayerSettingsContent.DetailsWithVendors(getDetailsLabel(), property.getVendor().getShowLegitimateInterestToggle() ? new PredefinedUIToggleSettings(ServicesIdStrategy.INSTANCE.id(property.getVendor()), getTcf2().getTogglesLegIntToggleLabel(), PredefinedUIDecision.LEGITIMATE_INTEREST_ID, true, property.getLegitimateInterestChecked(), null, CollectionsKt.emptyList()) : null, new TCFDetailsMapperTV(this.settings, this.labels).map(property.getVendor()));
    }

    private final PredefinedTVSecondLayerCardSection tvAdTechProvidersSection() {
        if (this.adTechProviders.isEmpty()) {
            return null;
        }
        List<AdTechProvider> list = this.adTechProviders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AdTechProvider adTechProvider : list) {
            arrayList.add(new PredefinedTVSecondLayerCardEntry(ServicesIdStrategy.INSTANCE.id(adTechProvider), adTechProvider.getName(), "", new PredefinedUIToggleSettings(ServicesIdStrategy.INSTANCE.id(adTechProvider), adTechProvider.getName(), "consent", true, adTechProvider.getConsent(), null, CollectionsKt.emptyList()), new PredefinedTVSecondLayerSettingsContent.DetailsWithVendors("", null, CollectionsKt.listOf(new PredefinedTVSecondLayerDetailsEntry.Link(this.settings.getLabels().getPrivacyPolicyLinkText(), adTechProvider.getPrivacyPolicyUrl(), adTechProvider.getPrivacyPolicyUrl())))));
        }
        return new PredefinedTVSecondLayerCardSection("Google Ad Technology Providers (ATPs)", arrayList);
    }
}
