package com.usercentrics.sdk.v2.banner.service.mapper.tcf;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.CategoryProps;
import com.usercentrics.sdk.PurposeProps;
import com.usercentrics.sdk.SpecialFeatureProps;
import com.usercentrics.sdk.SpecialPurposeProps;
import com.usercentrics.sdk.StackProps;
import com.usercentrics.sdk.UsercentricsAnalyticsEventType;
import com.usercentrics.sdk.UsercentricsMaps;
import com.usercentrics.sdk.extensions.ArrayExtensionsKt;
import com.usercentrics.sdk.models.settings.LegacyPoweredBy;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedTVActionButton;
import com.usercentrics.sdk.models.settings.PredefinedTVActionButtonType;
import com.usercentrics.sdk.models.settings.PredefinedTVFirstLayerSettings;
import com.usercentrics.sdk.models.settings.PredefinedUIButtonType;
import com.usercentrics.sdk.models.settings.PredefinedUICardContent;
import com.usercentrics.sdk.models.settings.PredefinedUICardUI;
import com.usercentrics.sdk.models.settings.PredefinedUICardUISection;
import com.usercentrics.sdk.models.settings.PredefinedUICustomization;
import com.usercentrics.sdk.models.settings.PredefinedUIDependantSwitchSettings;
import com.usercentrics.sdk.models.settings.PredefinedUIFirstLayerHeaderSettings;
import com.usercentrics.sdk.models.settings.PredefinedUIFooterButton;
import com.usercentrics.sdk.models.settings.PredefinedUIFooterEntry;
import com.usercentrics.sdk.models.settings.PredefinedUIFooterSettings;
import com.usercentrics.sdk.models.settings.PredefinedUIHeaderSettings;
import com.usercentrics.sdk.models.settings.PredefinedUILink;
import com.usercentrics.sdk.models.settings.PredefinedUILinkType;
import com.usercentrics.sdk.models.settings.PredefinedUISimpleCardContent;
import com.usercentrics.sdk.models.settings.PredefinedUISwitchSettingsUI;
import com.usercentrics.sdk.models.settings.TCFHolder;
import com.usercentrics.sdk.models.settings.UCUIFirstLayerSettings;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.v2.banner.service.mapper.FooterButtonLayoutMapper;
import com.usercentrics.sdk.v2.banner.service.mapper.PoweredByMapper;
import com.usercentrics.sdk.v2.settings.data.FirstLayer;
import com.usercentrics.sdk.v2.settings.data.FirstLayerCloseOption;
import com.usercentrics.sdk.v2.settings.data.FirstLayerLogoPosition;
import com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant;
import com.usercentrics.sdk.v2.settings.data.TCF2Settings;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCustomization;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TCFFirstLayerMapper.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\tH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\tH\u0002J\b\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\tH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020,J,\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020#0\tH\u0002J,\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020!0\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\tH\u0002J\u0006\u00103\u001a\u000204J\n\u00105\u001a\u0004\u0018\u00010\u001bH\u0002J\n\u00106\u001a\u0004\u0018\u000107H\u0002J\n\u00108\u001a\u0004\u0018\u00010\u001bH\u0002J\n\u00109\u001a\u0004\u0018\u00010\u001bH\u0002J\n\u0010:\u001a\u0004\u0018\u00010\u001bH\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\tH\u0002J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\tH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/TCFFirstLayerMapper;", "", "settings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "tcfData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "customization", "Lcom/usercentrics/sdk/models/settings/PredefinedUICustomization;", "categories", "", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "services", "Lcom/usercentrics/sdk/models/settings/LegacyService;", "(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/models/settings/PredefinedUICustomization;Ljava/util/List;Ljava/util/List;)V", "hasToggles", "", "hideLegitimateInterestToggles", "manageIsLink", "getManageIsLink", "()Z", "stacks", "Lcom/usercentrics/sdk/StackProps;", "getStacks", "()Ljava/util/List;", "stacks$delegate", "Lkotlin/Lazy;", "contentSettings", "Lcom/usercentrics/sdk/models/settings/PredefinedUICardUISection;", "contentTv", "", "dependantSwitchSettingsOf", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDependantSwitchSettings;", "purposeIds", "", "propsHolderList", "Lcom/usercentrics/sdk/models/settings/TCFHolder;", "footerSettings", "Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterSettings;", "headerLinks", "Lcom/usercentrics/sdk/models/settings/PredefinedUILink;", "headerMessage", "headerSettings", "Lcom/usercentrics/sdk/models/settings/PredefinedUIHeaderSettings;", "map", "Lcom/usercentrics/sdk/models/settings/UCUIFirstLayerSettings;", "mapCardsSectionFromTCFHolder", "sectionTitle", "purposesOrSpecialFeatures", "mapStackPropsToTCFHolder", "stackProps", "ids", "mapTV", "Lcom/usercentrics/sdk/models/settings/PredefinedTVFirstLayerSettings;", "nonIABPurposesCardsSection", "poweredBy", "Lcom/usercentrics/sdk/models/settings/PredefinedUIFooterEntry;", "purposesCardsSection", "specialFeaturesCardsSection", "specialPurposesCardsSection", "tvButtons", "Lcom/usercentrics/sdk/models/settings/PredefinedTVActionButton;", "tvLinks", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TCFFirstLayerMapper {
    private static final FirstLayerLogoPosition defaultLogoPosition = FirstLayerLogoPosition.LEFT;
    private final List<UsercentricsCategory> categories;
    private final PredefinedUICustomization customization;
    private final boolean hasToggles;
    private final boolean hideLegitimateInterestToggles;
    private final List<LegacyService> services;
    private final UsercentricsSettings settings;

    /* renamed from: stacks$delegate, reason: from kotlin metadata */
    private final Lazy stacks;
    private final TCFData tcfData;

    public TCFFirstLayerMapper(UsercentricsSettings settings, TCFData tcfData, PredefinedUICustomization customization, List<UsercentricsCategory> categories, List<LegacyService> services) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(tcfData, "tcfData");
        Intrinsics.checkNotNullParameter(customization, "customization");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(services, "services");
        this.settings = settings;
        this.tcfData = tcfData;
        this.customization = customization;
        this.categories = categories;
        this.services = services;
        Intrinsics.checkNotNull(settings.getTcf2());
        this.hasToggles = !r3.getFirstLayerHideToggles();
        TCF2Settings tcf2 = settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        this.hideLegitimateInterestToggles = tcf2.getHideLegitimateInterestToggles();
        this.stacks = LazyKt.lazy(new Function0<List<? extends StackProps>>() { // from class: com.usercentrics.sdk.v2.banner.service.mapper.tcf.TCFFirstLayerMapper$stacks$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends StackProps> invoke() {
                TCFData tCFData;
                UsercentricsMaps.Companion companion = UsercentricsMaps.INSTANCE;
                tCFData = TCFFirstLayerMapper.this.tcfData;
                return companion.mapStacks(tCFData);
            }
        });
    }

    /* renamed from: getManageIsLink, reason: from getter */
    private final boolean getHasToggles() {
        return this.hasToggles;
    }

    private final List<StackProps> getStacks() {
        return (List) this.stacks.getValue();
    }

    public final UCUIFirstLayerSettings map() {
        FirstLayerMobileVariant defaultLayout$usercentrics_release;
        TCF2Settings tcf2 = this.settings.getTcf2();
        if (tcf2 == null || (defaultLayout$usercentrics_release = tcf2.getFirstLayerMobileVariant()) == null) {
            defaultLayout$usercentrics_release = UCUIFirstLayerSettings.INSTANCE.getDefaultLayout$usercentrics_release();
        }
        return new UCUIFirstLayerSettings(defaultLayout$usercentrics_release, headerSettings(), footerSettings(), contentSettings());
    }

    public final PredefinedTVFirstLayerSettings mapTV() {
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        String firstLayerTitle = tcf2.getFirstLayerTitle();
        String contentTv = contentTv();
        UsercentricsCustomization customization = this.settings.getCustomization();
        return new PredefinedTVFirstLayerSettings(firstLayerTitle, contentTv, customization != null ? customization.getLogoUrl() : null, tvButtons(), tvLinks());
    }

    private final PredefinedUIHeaderSettings headerSettings() {
        FirstLayerLogoPosition firstLayerLogoPosition;
        FirstLayerCloseOption closeOption;
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        String firstLayerTitle = tcf2.getFirstLayerTitle();
        List<PredefinedUILink> headerLinks = headerLinks();
        String headerMessage = headerMessage();
        FirstLayer firstLayer = this.settings.getFirstLayer();
        if (firstLayer == null || (firstLayerLogoPosition = firstLayer.getLogoPosition()) == null) {
            firstLayerLogoPosition = defaultLogoPosition;
        }
        FirstLayerLogoPosition firstLayerLogoPosition2 = firstLayerLogoPosition;
        UsercentricsCustomization customization = this.settings.getCustomization();
        Boolean bool = null;
        String logoUrl = customization != null ? customization.getLogoUrl() : null;
        FirstLayer firstLayer2 = this.settings.getFirstLayer();
        if (firstLayer2 != null && (closeOption = firstLayer2.getCloseOption()) != null) {
            bool = Boolean.valueOf(closeOption.equals(FirstLayerCloseOption.ICON));
        }
        return new PredefinedUIFirstLayerHeaderSettings(firstLayerTitle, null, headerMessage, headerLinks, firstLayerLogoPosition2, logoUrl, null, null, bool, this.settings.getLabels().getBtnBannerReadMore());
    }

    private final String headerMessage() {
        String str;
        String obj;
        String emptyToNull;
        String obj2;
        String emptyToNull2;
        String obj3;
        String emptyToNull3;
        StringBuilder sb = new StringBuilder();
        int thirdPartyCount = this.tcfData.getThirdPartyCount();
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        String firstLayerDescription = tcf2.getFirstLayerDescription();
        if (firstLayerDescription != null && (obj3 = StringsKt.trim((CharSequence) firstLayerDescription).toString()) != null && (emptyToNull3 = ArrayExtensionsKt.emptyToNull(obj3)) != null) {
            sb.append(StringsKt.replace$default(emptyToNull3, "%VENDOR_COUNT%", String.valueOf(thirdPartyCount), false, 4, (Object) null));
        }
        String firstLayerAdditionalInfo = this.settings.getTcf2().getFirstLayerAdditionalInfo();
        if (firstLayerAdditionalInfo != null && (obj2 = StringsKt.trim((CharSequence) firstLayerAdditionalInfo).toString()) != null && (emptyToNull2 = ArrayExtensionsKt.emptyToNull(obj2)) != null) {
            if (sb.length() > 0) {
                sb.append(ServerSentEventKt.SPACE);
            }
            sb.append(emptyToNull2);
        }
        String appLayerNoteResurface = this.settings.getTcf2().getAppLayerNoteResurface();
        if (appLayerNoteResurface != null && (obj = StringsKt.trim((CharSequence) appLayerNoteResurface).toString()) != null && (emptyToNull = ArrayExtensionsKt.emptyToNull(obj)) != null) {
            if (sb.length() > 0) {
                sb.append(ServerSentEventKt.SPACE);
            }
            sb.append(emptyToNull);
        }
        String dataSharedOutsideEUText = this.settings.getTcf2().getDataSharedOutsideEUText();
        if (dataSharedOutsideEUText == null || (str = StringsKt.trim((CharSequence) dataSharedOutsideEUText).toString()) == null) {
            str = "";
        }
        if (this.settings.getTcf2().getShowDataSharedOutsideEUText() && !StringsKt.isBlank(str)) {
            if (sb.length() > 0) {
                sb.append("<br><br>");
            }
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final List<PredefinedUILink> headerLinks() {
        PredefinedUILink predefinedUILink;
        if (getHasToggles()) {
            PredefinedUILink.Companion companion = PredefinedUILink.INSTANCE;
            TCF2Settings tcf2 = this.settings.getTcf2();
            Intrinsics.checkNotNull(tcf2);
            predefinedUILink = companion.moreLink(tcf2.getLinksManageSettingsLabel());
        } else {
            predefinedUILink = null;
        }
        TCF2Settings tcf22 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf22);
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new PredefinedUILink[]{PredefinedUILink.INSTANCE.legalLinkUrl(this.settings.getLabels().getPrivacyPolicyLinkText(), this.settings.getPrivacyPolicyUrl(), UsercentricsAnalyticsEventType.PRIVACY_POLICY_LINK), PredefinedUILink.INSTANCE.legalLinkUrl(this.settings.getLabels().getImprintLinkText(), this.settings.getImprintUrl(), UsercentricsAnalyticsEventType.IMPRINT_LINK), predefinedUILink, new PredefinedUILink(tcf22.getLinksVendorListLinkLabel(), null, PredefinedUILinkType.VENDOR_LIST, UsercentricsAnalyticsEventType.MORE_INFORMATION_LINK)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (!((PredefinedUILink) obj).isEmpty$usercentrics_release()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final PredefinedUIFooterSettings footerSettings() {
        PredefinedUIFooterButton predefinedUIFooterButton;
        PredefinedUIFooterButton predefinedUIFooterButton2;
        PredefinedUIFooterButton predefinedUIFooterButton3;
        if (getHasToggles()) {
            predefinedUIFooterButton = null;
        } else {
            TCF2Settings tcf2 = this.settings.getTcf2();
            Intrinsics.checkNotNull(tcf2);
            predefinedUIFooterButton = new PredefinedUIFooterButton(tcf2.getLinksManageSettingsLabel(), PredefinedUIButtonType.MANAGE_SETTINGS, this.customization.getColor().getManageButton());
        }
        if (this.hasToggles) {
            TCF2Settings tcf22 = this.settings.getTcf2();
            Intrinsics.checkNotNull(tcf22);
            predefinedUIFooterButton2 = new PredefinedUIFooterButton(tcf22.getButtonsSaveLabel(), PredefinedUIButtonType.SAVE_SETTINGS, this.customization.getColor().getSaveButton());
        } else {
            predefinedUIFooterButton2 = null;
        }
        TCF2Settings tcf23 = this.settings.getTcf2();
        if (tcf23 != null ? Intrinsics.areEqual((Object) tcf23.getFirstLayerHideButtonDeny(), (Object) true) : false) {
            predefinedUIFooterButton3 = null;
        } else {
            TCF2Settings tcf24 = this.settings.getTcf2();
            Intrinsics.checkNotNull(tcf24);
            predefinedUIFooterButton3 = new PredefinedUIFooterButton(tcf24.getButtonsDenyAllLabel(), PredefinedUIButtonType.DENY_ALL, this.customization.getColor().getDenyAllButton());
        }
        FooterButtonLayoutMapper footerButtonLayoutMapper = new FooterButtonLayoutMapper(new PredefinedUIFooterButton(this.settings.getTcf2().getButtonsAcceptAllLabel(), PredefinedUIButtonType.ACCEPT_ALL, this.customization.getColor().getAcceptAllButton()), predefinedUIFooterButton3, predefinedUIFooterButton2, null, predefinedUIFooterButton, 8, null);
        return new PredefinedUIFooterSettings(poweredBy(), null, false, footerButtonLayoutMapper.mapButtons(), footerButtonLayoutMapper.mapButtonsLandscape(), 6, null);
    }

    private final List<PredefinedTVActionButton> tvButtons() {
        PredefinedTVActionButton predefinedTVActionButton;
        String str;
        String str2;
        String str3;
        String linksVendorListLinkLabel;
        TCF2Settings tcf2 = this.settings.getTcf2();
        String str4 = "";
        if (tcf2 != null ? Intrinsics.areEqual((Object) tcf2.getFirstLayerHideButtonDeny(), (Object) true) : false) {
            predefinedTVActionButton = null;
        } else {
            TCF2Settings tcf22 = this.settings.getTcf2();
            if (tcf22 == null || (str = tcf22.getButtonsDenyAllLabel()) == null) {
                str = "";
            }
            predefinedTVActionButton = new PredefinedTVActionButton(str, PredefinedTVActionButtonType.DenyAll.INSTANCE);
        }
        PredefinedTVActionButton[] predefinedTVActionButtonArr = new PredefinedTVActionButton[4];
        TCF2Settings tcf23 = this.settings.getTcf2();
        if (tcf23 == null || (str2 = tcf23.getButtonsAcceptAllLabel()) == null) {
            str2 = "";
        }
        predefinedTVActionButtonArr[0] = new PredefinedTVActionButton(str2, PredefinedTVActionButtonType.AcceptAll.INSTANCE);
        predefinedTVActionButtonArr[1] = predefinedTVActionButton;
        TCF2Settings tcf24 = this.settings.getTcf2();
        if (tcf24 == null || (str3 = tcf24.getLinksManageSettingsLabel()) == null) {
            str3 = "";
        }
        predefinedTVActionButtonArr[2] = new PredefinedTVActionButton(str3, new PredefinedTVActionButtonType.More(null, 1, null));
        TCF2Settings tcf25 = this.settings.getTcf2();
        if (tcf25 != null && (linksVendorListLinkLabel = tcf25.getLinksVendorListLinkLabel()) != null) {
            str4 = linksVendorListLinkLabel;
        }
        TCF2Settings tcf26 = this.settings.getTcf2();
        predefinedTVActionButtonArr[3] = new PredefinedTVActionButton(str4, new PredefinedTVActionButtonType.More(tcf26 != null ? tcf26.getLabelsIabVendors() : null));
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) predefinedTVActionButtonArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((PredefinedTVActionButton) obj).getLabel().length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<PredefinedTVActionButton> tvLinks() {
        PredefinedTVActionButton[] predefinedTVActionButtonArr = new PredefinedTVActionButton[2];
        String privacyPolicyUrl = this.settings.getPrivacyPolicyUrl();
        predefinedTVActionButtonArr[0] = privacyPolicyUrl != null ? new PredefinedTVActionButton(this.settings.getLabels().getPrivacyPolicyLinkText(), new PredefinedTVActionButtonType.Url(privacyPolicyUrl)) : null;
        String imprintUrl = this.settings.getImprintUrl();
        predefinedTVActionButtonArr[1] = imprintUrl != null ? new PredefinedTVActionButton(this.settings.getLabels().getImprintLinkText(), new PredefinedTVActionButtonType.Url(imprintUrl)) : null;
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) predefinedTVActionButtonArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((PredefinedTVActionButton) obj).getLabel().length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final PredefinedUIFooterEntry poweredBy() {
        return PoweredByMapper.INSTANCE.mapPoweredBy(new LegacyPoweredBy(this.settings.getEnablePoweredBy(), null, null, 6, null));
    }

    private final String contentTv() {
        StringBuilder sb = new StringBuilder();
        sb.append(headerMessage());
        contentTv$appendPredefinedUICardUISectionToMessageBuilder(sb, purposesCardsSection());
        contentTv$appendPredefinedUICardUISectionToMessageBuilder(sb, specialPurposesCardsSection());
        contentTv$appendPredefinedUICardUISectionToMessageBuilder(sb, specialFeaturesCardsSection());
        contentTv$appendPredefinedUICardUISectionToMessageBuilder(sb, nonIABPurposesCardsSection());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final void contentTv$appendPredefinedUICardUISectionToMessageBuilder(StringBuilder sb, PredefinedUICardUISection predefinedUICardUISection) {
        if (predefinedUICardUISection != null) {
            sb.append("<br><br>");
            sb.append(predefinedUICardUISection.getTitle() + ": " + CollectionsKt.joinToString$default(predefinedUICardUISection.getCards(), null, null, null, 0, null, new Function1<PredefinedUICardUI, CharSequence>() { // from class: com.usercentrics.sdk.v2.banner.service.mapper.tcf.TCFFirstLayerMapper$contentTv$appendPredefinedUICardUISectionToMessageBuilder$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(PredefinedUICardUI it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getTitle();
                }
            }, 31, null));
        }
    }

    private final List<PredefinedUICardUISection> contentSettings() {
        ArrayList arrayList = new ArrayList();
        PredefinedUICardUISection purposesCardsSection = purposesCardsSection();
        if (purposesCardsSection != null) {
            arrayList.add(purposesCardsSection);
        }
        PredefinedUICardUISection specialPurposesCardsSection = specialPurposesCardsSection();
        if (specialPurposesCardsSection != null) {
            arrayList.add(specialPurposesCardsSection);
        }
        PredefinedUICardUISection specialFeaturesCardsSection = specialFeaturesCardsSection();
        if (specialFeaturesCardsSection != null) {
            arrayList.add(specialFeaturesCardsSection);
        }
        PredefinedUICardUISection nonIABPurposesCardsSection = nonIABPurposesCardsSection();
        if (nonIABPurposesCardsSection != null) {
            arrayList.add(nonIABPurposesCardsSection);
        }
        return arrayList;
    }

    private final PredefinedUICardUISection purposesCardsSection() {
        if (this.tcfData.getPurposes().isEmpty()) {
            return null;
        }
        List<PurposeProps> mapPurposes = UsercentricsMaps.INSTANCE.mapPurposes(this.tcfData);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapPurposes, 10));
        Iterator<T> it = mapPurposes.iterator();
        while (it.hasNext()) {
            arrayList.add(new TCFHolder((PurposeProps) it.next(), this.hasToggles, this.hideLegitimateInterestToggles));
        }
        ArrayList arrayList2 = arrayList;
        List<StackProps> stacks = getStacks();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : stacks) {
            if (!((StackProps) obj).getStack().getPurposeIds().isEmpty()) {
                arrayList3.add(obj);
            }
        }
        ArrayList<StackProps> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (StackProps stackProps : arrayList4) {
            arrayList5.add(mapStackPropsToTCFHolder(stackProps, stackProps.getStack().getPurposeIds(), arrayList2));
        }
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        return mapCardsSectionFromTCFHolder(tcf2.getLabelsPurposes(), arrayList2, arrayList5);
    }

    private final PredefinedUICardUISection specialPurposesCardsSection() {
        if (this.tcfData.getSpecialPurposes().isEmpty()) {
            return null;
        }
        List<SpecialPurposeProps> mapSpecialPurposes = UsercentricsMaps.INSTANCE.mapSpecialPurposes(this.tcfData);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapSpecialPurposes, 10));
        Iterator<T> it = mapSpecialPurposes.iterator();
        while (it.hasNext()) {
            arrayList.add(new TCFHolder((SpecialPurposeProps) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        List<StackProps> stacks = getStacks();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : stacks) {
            if (!((StackProps) obj).getStack().getPurposeIds().isEmpty()) {
                arrayList3.add(obj);
            }
        }
        ArrayList<StackProps> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (StackProps stackProps : arrayList4) {
            arrayList5.add(mapStackPropsToTCFHolder(stackProps, stackProps.getStack().getPurposeIds(), arrayList2));
        }
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        return mapCardsSectionFromTCFHolder(tcf2.getVendorSpecialPurposes(), arrayList2, arrayList5);
    }

    private final PredefinedUICardUISection specialFeaturesCardsSection() {
        if (this.tcfData.getSpecialFeatures().isEmpty()) {
            return null;
        }
        List<SpecialFeatureProps> mapSpecialFeatures = UsercentricsMaps.INSTANCE.mapSpecialFeatures(this.tcfData);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapSpecialFeatures, 10));
        Iterator<T> it = mapSpecialFeatures.iterator();
        while (it.hasNext()) {
            arrayList.add(new TCFHolder((SpecialFeatureProps) it.next(), this.hasToggles));
        }
        ArrayList arrayList2 = arrayList;
        List<StackProps> stacks = getStacks();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : stacks) {
            if (!((StackProps) obj).getStack().getSpecialFeatureIds().isEmpty()) {
                arrayList3.add(obj);
            }
        }
        ArrayList<StackProps> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (StackProps stackProps : arrayList4) {
            arrayList5.add(mapStackPropsToTCFHolder(stackProps, stackProps.getStack().getSpecialFeatureIds(), arrayList2));
        }
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        return mapCardsSectionFromTCFHolder(tcf2.getVendorSpecialFeatures(), arrayList2, arrayList5);
    }

    private final PredefinedUICardUISection nonIABPurposesCardsSection() {
        PredefinedUICardUI predefinedUICardUI;
        TCF2Settings tcf2 = this.settings.getTcf2();
        Intrinsics.checkNotNull(tcf2);
        if (tcf2.getHideNonIabOnFirstLayer() || this.categories.isEmpty()) {
            return null;
        }
        List<CategoryProps> mapCategories = UsercentricsMaps.INSTANCE.mapCategories(this.categories, this.services);
        if (mapCategories.isEmpty()) {
            return null;
        }
        String labelsNonIabPurposes = this.settings.getTcf2().getLabelsNonIabPurposes();
        List<CategoryProps> list = mapCategories;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (CategoryProps categoryProps : list) {
            if (!this.hasToggles) {
                predefinedUICardUI = new PredefinedUICardUI(categoryProps, (PredefinedUISwitchSettingsUI) null, (PredefinedUICardContent) null, (String) null, (List) null, 16, (DefaultConstructorMarker) null);
            } else {
                predefinedUICardUI = new PredefinedUICardUI(categoryProps, (PredefinedUICardContent) null, (String) null);
            }
            arrayList.add(predefinedUICardUI);
        }
        return new PredefinedUICardUISection(labelsNonIabPurposes, arrayList, null, 4, null);
    }

    private final PredefinedUICardUISection mapCardsSectionFromTCFHolder(String sectionTitle, List<TCFHolder> purposesOrSpecialFeatures, List<TCFHolder> stacks) {
        List<TCFHolder> plus = CollectionsKt.plus((Collection) purposesOrSpecialFeatures, (Iterable) stacks);
        ArrayList arrayList = new ArrayList();
        for (TCFHolder tCFHolder : plus) {
            if (!tCFHolder.getIsPartOfASelectedStack()) {
                TCF2Settings tcf2 = this.settings.getTcf2();
                Intrinsics.checkNotNull(tcf2);
                arrayList.add(new PredefinedUICardUI(tCFHolder, tcf2.getFirstLayerShowDescriptions() ? new PredefinedUISimpleCardContent(null, null, tCFHolder.getContentDescription(), 3, null) : null, (List) null, 4, (DefaultConstructorMarker) null));
            }
        }
        return new PredefinedUICardUISection(sectionTitle, arrayList, null, 4, null);
    }

    private final TCFHolder mapStackPropsToTCFHolder(StackProps stackProps, List<Integer> ids, List<TCFHolder> propsHolderList) {
        return new TCFHolder(stackProps, this.hasToggles, dependantSwitchSettingsOf(ids, propsHolderList));
    }

    private final List<PredefinedUIDependantSwitchSettings> dependantSwitchSettingsOf(List<Integer> purposeIds, List<TCFHolder> propsHolderList) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : propsHolderList) {
            TCFHolder tCFHolder = (TCFHolder) obj;
            if (tCFHolder.getIsPartOfASelectedStack() && purposeIds.contains(Integer.valueOf(tCFHolder.getTcfId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList<TCFHolder> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (TCFHolder tCFHolder2 : arrayList2) {
            arrayList3.add(new PredefinedUIDependantSwitchSettings(tCFHolder2.getId(), new PredefinedUISwitchSettingsUI(tCFHolder2)));
        }
        return arrayList3;
    }
}
