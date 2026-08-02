package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.data;

import B3.p;
import D3.g;
import De.C2859b;
import GR.b;
import I0.C3173b;
import N3.C3660k;
import Sh.a;
import T7.P;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003123BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003Jh\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO;", "", "subscriptionState", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$SubscriptionState;", "content", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;", "alreadySubscribedAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "subscriptionCompletedNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "rationaleDialog", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;", "forceShowWidget", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$SubscriptionState;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;Ljava/lang/Boolean;Ljava/util/Map;)V", "getSubscriptionState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$SubscriptionState;", "getContent", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;", "getAlreadySubscribedAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSubscriptionCompletedNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getRationaleDialog", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;", "getForceShowWidget", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$SubscriptionState;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO;", "equals", "other", "hashCode", "", "toString", "ContentDTO", "RationaleDialogDTO", "SubscriptionState", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionBannerV3DTO {
    public static final int $stable = 8;
    private final CommonControlSettings alreadySubscribedAction;

    @NotNull
    private final ContentDTO content;
    private final Boolean forceShowWidget;

    @NotNull
    private final RationaleDialogDTO rationaleDialog;
    private final NotificationDTO subscriptionCompletedNotification;

    @EnumNullFallback
    @NotNull
    private final SubscriptionState subscriptionState;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "subscribeButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "subscriptionCompletedButton", "rightImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "decoration", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscriptionCompletedButton", "getRightImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDecoration", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DecorationDTO", "MarginsDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ContentDTO {
        public static final int $stable = 8;
        private final IconButtonV3DTO closeButton;

        @NotNull
        private final DecorationDTO decoration;
        private final ImageDTO rightImage;

        @NotNull
        private final ButtonV3DTO subscribeButton;

        @NotNull
        private final ButtonV3DTO subscriptionCompletedButton;
        private final TextDTO subtitle;
        private final TextDTO title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;", "", "backgroundImage", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "backgroundColor", "", "borderColor", "isFullWidthButton", "", "layoutMargins", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getBackgroundImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLayoutMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;", "equals", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DecorationDTO {
            public static final int $stable = 8;
            private final String backgroundColor;
            private final ThemeImageV1DTO backgroundImage;
            private final String borderColor;
            private final CornerRadius cornerRadius;
            private final Boolean isFullWidthButton;
            private final MarginsDTO layoutMargins;

            public DecorationDTO(ThemeImageV1DTO themeImageV1DTO, String str, String str2, Boolean bool, MarginsDTO marginsDTO, CornerRadius cornerRadius) {
                this.backgroundImage = themeImageV1DTO;
                this.backgroundColor = str;
                this.borderColor = str2;
                this.isFullWidthButton = bool;
                this.layoutMargins = marginsDTO;
                this.cornerRadius = cornerRadius;
            }

            public static /* synthetic */ DecorationDTO copy$default(DecorationDTO decorationDTO, ThemeImageV1DTO themeImageV1DTO, String str, String str2, Boolean bool, MarginsDTO marginsDTO, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    themeImageV1DTO = decorationDTO.backgroundImage;
                }
                if ((i11 & 2) != 0) {
                    str = decorationDTO.backgroundColor;
                }
                if ((i11 & 4) != 0) {
                    str2 = decorationDTO.borderColor;
                }
                if ((i11 & 8) != 0) {
                    bool = decorationDTO.isFullWidthButton;
                }
                if ((i11 & 16) != 0) {
                    marginsDTO = decorationDTO.layoutMargins;
                }
                if ((i11 & 32) != 0) {
                    cornerRadius = decorationDTO.cornerRadius;
                }
                MarginsDTO marginsDTO2 = marginsDTO;
                CornerRadius cornerRadius2 = cornerRadius;
                return decorationDTO.copy(themeImageV1DTO, str, str2, bool, marginsDTO2, cornerRadius2);
            }

            /* renamed from: component1, reason: from getter */
            public final ThemeImageV1DTO getBackgroundImage() {
                return this.backgroundImage;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getBorderColor() {
                return this.borderColor;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsFullWidthButton() {
                return this.isFullWidthButton;
            }

            /* renamed from: component5, reason: from getter */
            public final MarginsDTO getLayoutMargins() {
                return this.layoutMargins;
            }

            /* renamed from: component6, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final DecorationDTO copy(ThemeImageV1DTO backgroundImage, String backgroundColor, String borderColor, Boolean isFullWidthButton, MarginsDTO layoutMargins, CornerRadius cornerRadius) {
                return new DecorationDTO(backgroundImage, backgroundColor, borderColor, isFullWidthButton, layoutMargins, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DecorationDTO)) {
                    return false;
                }
                DecorationDTO decorationDTO = (DecorationDTO) other;
                return Intrinsics.d(this.backgroundImage, decorationDTO.backgroundImage) && Intrinsics.d(this.backgroundColor, decorationDTO.backgroundColor) && Intrinsics.d(this.borderColor, decorationDTO.borderColor) && Intrinsics.d(this.isFullWidthButton, decorationDTO.isFullWidthButton) && Intrinsics.d(this.layoutMargins, decorationDTO.layoutMargins) && this.cornerRadius == decorationDTO.cornerRadius;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final ThemeImageV1DTO getBackgroundImage() {
                return this.backgroundImage;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final MarginsDTO getLayoutMargins() {
                return this.layoutMargins;
            }

            public int hashCode() {
                ThemeImageV1DTO themeImageV1DTO = this.backgroundImage;
                int hashCode = (themeImageV1DTO == null ? 0 : themeImageV1DTO.hashCode()) * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.borderColor;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.isFullWidthButton;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                MarginsDTO marginsDTO = this.layoutMargins;
                int hashCode5 = (hashCode4 + (marginsDTO == null ? 0 : marginsDTO.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                return hashCode5 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            public final Boolean isFullWidthButton() {
                return this.isFullWidthButton;
            }

            @NotNull
            public String toString() {
                ThemeImageV1DTO themeImageV1DTO = this.backgroundImage;
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                Boolean bool = this.isFullWidthButton;
                MarginsDTO marginsDTO = this.layoutMargins;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder sb2 = new StringBuilder("DecorationDTO(backgroundImage=");
                sb2.append(themeImageV1DTO);
                sb2.append(", backgroundColor=");
                sb2.append(str);
                sb2.append(", borderColor=");
                a.d(bool, str2, ", isFullWidthButton=", ", layoutMargins=", sb2);
                sb2.append(marginsDTO);
                sb2.append(", cornerRadius=");
                sb2.append(cornerRadius);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "horizontal", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getHorizontal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MarginsDTO {
            public static final int $stable = 0;

            @NotNull
            private final Paddings bottom;

            @NotNull
            private final Paddings horizontal;

            @NotNull
            private final Paddings top;

            public MarginsDTO() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ MarginsDTO copy$default(MarginsDTO marginsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = marginsDTO.top;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = marginsDTO.bottom;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = marginsDTO.horizontal;
                }
                return marginsDTO.copy(paddings, paddings2, paddings3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Paddings getTop() {
                return this.top;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Paddings getBottom() {
                return this.bottom;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            public final MarginsDTO copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal) {
                Intrinsics.checkNotNullParameter(top, "top");
                Intrinsics.checkNotNullParameter(bottom, "bottom");
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                return new MarginsDTO(top, bottom, horizontal);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarginsDTO)) {
                    return false;
                }
                MarginsDTO marginsDTO = (MarginsDTO) other;
                return this.top == marginsDTO.top && this.bottom == marginsDTO.bottom && this.horizontal == marginsDTO.horizontal;
            }

            @NotNull
            public final Paddings getBottom() {
                return this.bottom;
            }

            @NotNull
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            public final Paddings getTop() {
                return this.top;
            }

            public int hashCode() {
                return this.horizontal.hashCode() + b.b(this.bottom, this.top.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.top;
                Paddings paddings2 = this.bottom;
                return D40.b.b(p.b("MarginsDTO(top=", paddings, ", bottom=", paddings2, ", horizontal="), this.horizontal, ")");
            }

            public MarginsDTO(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal) {
                Intrinsics.checkNotNullParameter(top, "top");
                Intrinsics.checkNotNullParameter(bottom, "bottom");
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                this.top = top;
                this.bottom = bottom;
                this.horizontal = horizontal;
            }

            public /* synthetic */ MarginsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3);
            }
        }

        public ContentDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO subscriptionCompletedButton, ImageDTO imageDTO, IconButtonV3DTO iconButtonV3DTO, @NotNull DecorationDTO decoration) {
            Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
            Intrinsics.checkNotNullParameter(subscriptionCompletedButton, "subscriptionCompletedButton");
            Intrinsics.checkNotNullParameter(decoration, "decoration");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.subscribeButton = subscribeButton;
            this.subscriptionCompletedButton = subscriptionCompletedButton;
            this.rightImage = imageDTO;
            this.closeButton = iconButtonV3DTO;
            this.decoration = decoration;
        }

        public static /* synthetic */ ContentDTO copy$default(ContentDTO contentDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ImageDTO imageDTO, IconButtonV3DTO iconButtonV3DTO, DecorationDTO decorationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = contentDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = contentDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = contentDTO.subscribeButton;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO2 = contentDTO.subscriptionCompletedButton;
            }
            if ((i11 & 16) != 0) {
                imageDTO = contentDTO.rightImage;
            }
            if ((i11 & 32) != 0) {
                iconButtonV3DTO = contentDTO.closeButton;
            }
            if ((i11 & 64) != 0) {
                decorationDTO = contentDTO.decoration;
            }
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            DecorationDTO decorationDTO2 = decorationDTO;
            ImageDTO imageDTO2 = imageDTO;
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
            return contentDTO.copy(textDTO, textDTO2, buttonV3DTO3, buttonV3DTO2, imageDTO2, iconButtonV3DTO2, decorationDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getSubscribeButton() {
            return this.subscribeButton;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getSubscriptionCompletedButton() {
            return this.subscriptionCompletedButton;
        }

        /* renamed from: component5, reason: from getter */
        public final ImageDTO getRightImage() {
            return this.rightImage;
        }

        /* renamed from: component6, reason: from getter */
        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final DecorationDTO getDecoration() {
            return this.decoration;
        }

        @NotNull
        public final ContentDTO copy(TextDTO title, TextDTO subtitle, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO subscriptionCompletedButton, ImageDTO rightImage, IconButtonV3DTO closeButton, @NotNull DecorationDTO decoration) {
            Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
            Intrinsics.checkNotNullParameter(subscriptionCompletedButton, "subscriptionCompletedButton");
            Intrinsics.checkNotNullParameter(decoration, "decoration");
            return new ContentDTO(title, subtitle, subscribeButton, subscriptionCompletedButton, rightImage, closeButton, decoration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentDTO)) {
                return false;
            }
            ContentDTO contentDTO = (ContentDTO) other;
            return Intrinsics.d(this.title, contentDTO.title) && Intrinsics.d(this.subtitle, contentDTO.subtitle) && Intrinsics.d(this.subscribeButton, contentDTO.subscribeButton) && Intrinsics.d(this.subscriptionCompletedButton, contentDTO.subscriptionCompletedButton) && Intrinsics.d(this.rightImage, contentDTO.rightImage) && Intrinsics.d(this.closeButton, contentDTO.closeButton) && Intrinsics.d(this.decoration, contentDTO.decoration);
        }

        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final DecorationDTO getDecoration() {
            return this.decoration;
        }

        public final ImageDTO getRightImage() {
            return this.rightImage;
        }

        @NotNull
        public final ButtonV3DTO getSubscribeButton() {
            return this.subscribeButton;
        }

        @NotNull
        public final ButtonV3DTO getSubscriptionCompletedButton() {
            return this.subscriptionCompletedButton;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int c11 = C2859b.c(this.subscriptionCompletedButton, C2859b.c(this.subscribeButton, (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31), 31);
            ImageDTO imageDTO = this.rightImage;
            int hashCode2 = (c11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.closeButton;
            return this.decoration.hashCode() + ((hashCode2 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.subscribeButton;
            ButtonV3DTO buttonV3DTO2 = this.subscriptionCompletedButton;
            ImageDTO imageDTO = this.rightImage;
            IconButtonV3DTO iconButtonV3DTO = this.closeButton;
            DecorationDTO decorationDTO = this.decoration;
            StringBuilder g10 = g.g("ContentDTO(title=", textDTO, ", subtitle=", textDTO2, ", subscribeButton=");
            g10.append(buttonV3DTO);
            g10.append(", subscriptionCompletedButton=");
            g10.append(buttonV3DTO2);
            g10.append(", rightImage=");
            g10.append(imageDTO);
            g10.append(", closeButton=");
            g10.append(iconButtonV3DTO);
            g10.append(", decoration=");
            g10.append(decorationDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "message", "positiveButton", "negativeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getPositiveButton", "getNegativeButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RationaleDialogDTO {
        public static final int $stable = 0;

        @NotNull
        private final String message;

        @NotNull
        private final String negativeButton;

        @NotNull
        private final String positiveButton;

        @NotNull
        private final String title;

        public RationaleDialogDTO(@NotNull String title, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            this.title = title;
            this.message = message;
            this.positiveButton = positiveButton;
            this.negativeButton = negativeButton;
        }

        public static /* synthetic */ RationaleDialogDTO copy$default(RationaleDialogDTO rationaleDialogDTO, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = rationaleDialogDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = rationaleDialogDTO.message;
            }
            if ((i11 & 4) != 0) {
                str3 = rationaleDialogDTO.positiveButton;
            }
            if ((i11 & 8) != 0) {
                str4 = rationaleDialogDTO.negativeButton;
            }
            return rationaleDialogDTO.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getPositiveButton() {
            return this.positiveButton;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getNegativeButton() {
            return this.negativeButton;
        }

        @NotNull
        public final RationaleDialogDTO copy(@NotNull String title, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            return new RationaleDialogDTO(title, message, positiveButton, negativeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RationaleDialogDTO)) {
                return false;
            }
            RationaleDialogDTO rationaleDialogDTO = (RationaleDialogDTO) other;
            return Intrinsics.d(this.title, rationaleDialogDTO.title) && Intrinsics.d(this.message, rationaleDialogDTO.message) && Intrinsics.d(this.positiveButton, rationaleDialogDTO.positiveButton) && Intrinsics.d(this.negativeButton, rationaleDialogDTO.negativeButton);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getNegativeButton() {
            return this.negativeButton;
        }

        @NotNull
        public final String getPositiveButton() {
            return this.positiveButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.negativeButton.hashCode() + G.g.a(G.g.a(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButton);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            return C3173b.c(C3660k.d("RationaleDialogDTO(title=", str, ", message=", str2, ", positiveButton="), this.positiveButton, ", negativeButton=", this.negativeButton, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$SubscriptionState;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_INVALID", "STATE_UNSUBSCRIBED", "STATE_SUBSCRIBED", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SubscriptionState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ SubscriptionState[] $VALUES;

        @i(name = "STATE_INVALID")
        public static final SubscriptionState STATE_INVALID = new SubscriptionState("STATE_INVALID", 0);

        @i(name = "STATE_UNSUBSCRIBED")
        public static final SubscriptionState STATE_UNSUBSCRIBED = new SubscriptionState("STATE_UNSUBSCRIBED", 1);

        @i(name = "STATE_SUBSCRIBED")
        public static final SubscriptionState STATE_SUBSCRIBED = new SubscriptionState("STATE_SUBSCRIBED", 2);

        private static final /* synthetic */ SubscriptionState[] $values() {
            return new SubscriptionState[]{STATE_INVALID, STATE_UNSUBSCRIBED, STATE_SUBSCRIBED};
        }

        static {
            SubscriptionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private SubscriptionState(String str, int i11) {
        }

        public static SubscriptionState valueOf(String str) {
            return (SubscriptionState) Enum.valueOf(SubscriptionState.class, str);
        }

        public static SubscriptionState[] values() {
            return (SubscriptionState[]) $VALUES.clone();
        }
    }

    public NotificationSubscriptionBannerV3DTO(@NotNull SubscriptionState subscriptionState, @NotNull ContentDTO content, CommonControlSettings commonControlSettings, NotificationDTO notificationDTO, @NotNull RationaleDialogDTO rationaleDialog, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(rationaleDialog, "rationaleDialog");
        this.subscriptionState = subscriptionState;
        this.content = content;
        this.alreadySubscribedAction = commonControlSettings;
        this.subscriptionCompletedNotification = notificationDTO;
        this.rationaleDialog = rationaleDialog;
        this.forceShowWidget = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ NotificationSubscriptionBannerV3DTO copy$default(NotificationSubscriptionBannerV3DTO notificationSubscriptionBannerV3DTO, SubscriptionState subscriptionState, ContentDTO contentDTO, CommonControlSettings commonControlSettings, NotificationDTO notificationDTO, RationaleDialogDTO rationaleDialogDTO, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            subscriptionState = notificationSubscriptionBannerV3DTO.subscriptionState;
        }
        if ((i11 & 2) != 0) {
            contentDTO = notificationSubscriptionBannerV3DTO.content;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = notificationSubscriptionBannerV3DTO.alreadySubscribedAction;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = notificationSubscriptionBannerV3DTO.subscriptionCompletedNotification;
        }
        if ((i11 & 16) != 0) {
            rationaleDialogDTO = notificationSubscriptionBannerV3DTO.rationaleDialog;
        }
        if ((i11 & 32) != 0) {
            bool = notificationSubscriptionBannerV3DTO.forceShowWidget;
        }
        if ((i11 & 64) != 0) {
            map = notificationSubscriptionBannerV3DTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        RationaleDialogDTO rationaleDialogDTO2 = rationaleDialogDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return notificationSubscriptionBannerV3DTO.copy(subscriptionState, contentDTO, commonControlSettings2, notificationDTO, rationaleDialogDTO2, bool2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ContentDTO getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getAlreadySubscribedAction() {
        return this.alreadySubscribedAction;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getSubscriptionCompletedNotification() {
        return this.subscriptionCompletedNotification;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final RationaleDialogDTO getRationaleDialog() {
        return this.rationaleDialog;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getForceShowWidget() {
        return this.forceShowWidget;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final NotificationSubscriptionBannerV3DTO copy(@NotNull SubscriptionState subscriptionState, @NotNull ContentDTO content, CommonControlSettings alreadySubscribedAction, NotificationDTO subscriptionCompletedNotification, @NotNull RationaleDialogDTO rationaleDialog, Boolean forceShowWidget, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(rationaleDialog, "rationaleDialog");
        return new NotificationSubscriptionBannerV3DTO(subscriptionState, content, alreadySubscribedAction, subscriptionCompletedNotification, rationaleDialog, forceShowWidget, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSubscriptionBannerV3DTO)) {
            return false;
        }
        NotificationSubscriptionBannerV3DTO notificationSubscriptionBannerV3DTO = (NotificationSubscriptionBannerV3DTO) other;
        return this.subscriptionState == notificationSubscriptionBannerV3DTO.subscriptionState && Intrinsics.d(this.content, notificationSubscriptionBannerV3DTO.content) && Intrinsics.d(this.alreadySubscribedAction, notificationSubscriptionBannerV3DTO.alreadySubscribedAction) && Intrinsics.d(this.subscriptionCompletedNotification, notificationSubscriptionBannerV3DTO.subscriptionCompletedNotification) && Intrinsics.d(this.rationaleDialog, notificationSubscriptionBannerV3DTO.rationaleDialog) && Intrinsics.d(this.forceShowWidget, notificationSubscriptionBannerV3DTO.forceShowWidget) && Intrinsics.d(this.trackingInfo, notificationSubscriptionBannerV3DTO.trackingInfo);
    }

    public final CommonControlSettings getAlreadySubscribedAction() {
        return this.alreadySubscribedAction;
    }

    @NotNull
    public final ContentDTO getContent() {
        return this.content;
    }

    public final Boolean getForceShowWidget() {
        return this.forceShowWidget;
    }

    @NotNull
    public final RationaleDialogDTO getRationaleDialog() {
        return this.rationaleDialog;
    }

    public final NotificationDTO getSubscriptionCompletedNotification() {
        return this.subscriptionCompletedNotification;
    }

    @NotNull
    public final SubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + (this.subscriptionState.hashCode() * 31)) * 31;
        CommonControlSettings commonControlSettings = this.alreadySubscribedAction;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        NotificationDTO notificationDTO = this.subscriptionCompletedNotification;
        int hashCode3 = (this.rationaleDialog.hashCode() + ((hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31)) * 31;
        Boolean bool = this.forceShowWidget;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SubscriptionState subscriptionState = this.subscriptionState;
        ContentDTO contentDTO = this.content;
        CommonControlSettings commonControlSettings = this.alreadySubscribedAction;
        NotificationDTO notificationDTO = this.subscriptionCompletedNotification;
        RationaleDialogDTO rationaleDialogDTO = this.rationaleDialog;
        Boolean bool = this.forceShowWidget;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("NotificationSubscriptionBannerV3DTO(subscriptionState=");
        sb2.append(subscriptionState);
        sb2.append(", content=");
        sb2.append(contentDTO);
        sb2.append(", alreadySubscribedAction=");
        sb2.append(commonControlSettings);
        sb2.append(", subscriptionCompletedNotification=");
        sb2.append(notificationDTO);
        sb2.append(", rationaleDialog=");
        sb2.append(rationaleDialogDTO);
        sb2.append(", forceShowWidget=");
        sb2.append(bool);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
