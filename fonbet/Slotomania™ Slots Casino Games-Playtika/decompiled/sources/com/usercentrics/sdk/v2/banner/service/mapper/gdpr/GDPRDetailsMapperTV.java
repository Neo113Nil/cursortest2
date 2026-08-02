package com.usercentrics.sdk.v2.banner.service.mapper.gdpr;

import androidx.core.app.NotificationCompat;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerDetailsEntry;
import com.usercentrics.sdk.models.settings.PredefinedUIServiceLabels;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GDPRDetailsMapperTV.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u001c\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0019\"\b\b\u0000\u0010\u001b*\u00020\u001c*\b\u0012\u0004\u0012\u0002H\u001b0\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/mapper/gdpr/GDPRDetailsMapperTV;", "", "settings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "labels", "Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceLabels;", "(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceLabels;)V", "getCookiePolicy", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry;", NotificationCompat.CATEGORY_SERVICE, "Lcom/usercentrics/sdk/models/settings/LegacyService;", "getDataCollected", "getDataProcessingAgreement", "getDataPurposes", "getDataRecipients", "getLegalBasis", "getOptOutLink", "getPrivacyPolicy", "getProcessingCompany", "getProcessingLocation", "getRetentionPeriod", "getServiceDescription", "getTechnologiesUsed", "getThirdPartyCountriesDistribution", "map", "", "filterNotBlank", "T", "", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GDPRDetailsMapperTV {
    private final PredefinedUIServiceLabels labels;
    private final UsercentricsSettings settings;

    public GDPRDetailsMapperTV(UsercentricsSettings settings, PredefinedUIServiceLabels labels) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.settings = settings;
        this.labels = labels;
    }

    public final List<PredefinedTVSecondLayerDetailsEntry> map(LegacyService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        return CollectionsKt.listOfNotNull((Object[]) new PredefinedTVSecondLayerDetailsEntry[]{getServiceDescription(service), getProcessingCompany(service), getDataPurposes(service), getTechnologiesUsed(service), getDataCollected(service), getLegalBasis(service), getProcessingLocation(service), getRetentionPeriod(service), getThirdPartyCountriesDistribution(service), getDataRecipients(service), getPrivacyPolicy(service), getCookiePolicy(service), getOptOutLink(service), getDataProcessingAgreement(service)});
    }

    private final PredefinedTVSecondLayerDetailsEntry getServiceDescription(LegacyService service) {
        if (StringsKt.isBlank(service.getServiceDescription())) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getDescriptionTitle(), service.getServiceDescription());
    }

    private final PredefinedTVSecondLayerDetailsEntry getProcessingCompany(LegacyService service) {
        StringBuilder sb = new StringBuilder();
        String name = service.getProcessingCompany().getName();
        if (!StringsKt.isBlank(name)) {
            sb.append(name);
        }
        String address = service.getProcessingCompany().getAddress();
        if (!StringsKt.isBlank(address)) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(address);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        if (StringsKt.isBlank(sb2)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getProcessingCompanyTitle(), sb2);
    }

    private final PredefinedTVSecondLayerDetailsEntry getDataPurposes(LegacyService service) {
        List filterNotBlank = filterNotBlank(service.getDataPurposes());
        if (filterNotBlank.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getDataPurposes().getTitle(), PredefinedTVSecondLayerDetailsEntry.INSTANCE.mapContent$usercentrics_release(filterNotBlank, this.labels.getDataPurposes().getTitleDescription()));
    }

    private final PredefinedTVSecondLayerDetailsEntry getTechnologiesUsed(LegacyService service) {
        List filterNotBlank = filterNotBlank(service.getTechnologiesUsed());
        if (filterNotBlank.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getTechnologiesUsed().getTitle(), PredefinedTVSecondLayerDetailsEntry.INSTANCE.mapContent$usercentrics_release(filterNotBlank, this.labels.getTechnologiesUsed().getTitleDescription()));
    }

    private final PredefinedTVSecondLayerDetailsEntry getDataCollected(LegacyService service) {
        List filterNotBlank = filterNotBlank(service.getDataCollected());
        if (filterNotBlank.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getDataCollected().getTitle(), PredefinedTVSecondLayerDetailsEntry.INSTANCE.mapContent$usercentrics_release(filterNotBlank, this.labels.getDataCollected().getTitleDescription()));
    }

    private final PredefinedTVSecondLayerDetailsEntry getLegalBasis(LegacyService service) {
        List filterNotBlank = filterNotBlank(service.getLegalBasis());
        if (filterNotBlank.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getLegalBasis().getTitle(), PredefinedTVSecondLayerDetailsEntry.INSTANCE.mapContent$usercentrics_release(filterNotBlank, this.labels.getLegalBasis().getTitleDescription()));
    }

    private final PredefinedTVSecondLayerDetailsEntry getProcessingLocation(LegacyService service) {
        String processingLocation = service.getDataDistribution().getProcessingLocation();
        if (StringsKt.isBlank(processingLocation)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getDataDistribution().getProcessingLocationTitle(), processingLocation);
    }

    private final PredefinedTVSecondLayerDetailsEntry getRetentionPeriod(LegacyService service) {
        if (StringsKt.isBlank(service.getRetentionPeriodDescription())) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getRetentionPeriodTitle(), service.getRetentionPeriodDescription());
    }

    private final PredefinedTVSecondLayerDetailsEntry getThirdPartyCountriesDistribution(LegacyService service) {
        String thirdPartyCountries = service.getDataDistribution().getThirdPartyCountries();
        if (StringsKt.isBlank(thirdPartyCountries)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getDataDistribution().getThirdPartyCountriesTitle(), PredefinedTVSecondLayerDetailsEntry.INSTANCE.mapContent$usercentrics_release(CollectionsKt.listOf(thirdPartyCountries), this.labels.getDataDistribution().getThirdPartyCountriesDescription()));
    }

    private final PredefinedTVSecondLayerDetailsEntry getDataRecipients(LegacyService service) {
        List filterNotBlank = filterNotBlank(service.getDataRecipients());
        if (filterNotBlank.isEmpty()) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.TitleContent(this.labels.getDataRecipientsTitle(), PredefinedTVSecondLayerDetailsEntry.Companion.mapContent$usercentrics_release$default(PredefinedTVSecondLayerDetailsEntry.INSTANCE, filterNotBlank, null, 2, null));
    }

    private final PredefinedTVSecondLayerDetailsEntry getPrivacyPolicy(LegacyService service) {
        String privacyPolicy = service.getUrls().getPrivacyPolicy();
        if (StringsKt.isBlank(privacyPolicy)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.Link(this.settings.getLabels().getPrivacyPolicyLinkText(), this.labels.getUrls().getPrivacyPolicyTitle(), privacyPolicy);
    }

    private final PredefinedTVSecondLayerDetailsEntry getCookiePolicy(LegacyService service) {
        String cookiePolicy = service.getUrls().getCookiePolicy();
        if (StringsKt.isBlank(cookiePolicy)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.Link(this.settings.getLabels().getCookiePolicyLinkText(), this.labels.getUrls().getCookiePolicyTitle(), cookiePolicy);
    }

    private final PredefinedTVSecondLayerDetailsEntry getOptOutLink(LegacyService service) {
        String optOut = service.getUrls().getOptOut();
        if (StringsKt.isBlank(optOut)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.Link(this.settings.getLabels().getFurtherInformationOptOut(), this.labels.getUrls().getOptOutTitle(), optOut);
    }

    private final PredefinedTVSecondLayerDetailsEntry getDataProcessingAgreement(LegacyService service) {
        String dataProcessingAgreement = service.getUrls().getDataProcessingAgreement();
        if (StringsKt.isBlank(dataProcessingAgreement)) {
            return null;
        }
        return new PredefinedTVSecondLayerDetailsEntry.Link(this.settings.getLabels().getLinkToDpaInfo(), dataProcessingAgreement, dataProcessingAgreement);
    }

    private final <T extends CharSequence> List<T> filterNotBlank(Iterable<? extends T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!StringsKt.isBlank(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
