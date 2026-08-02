package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.data;

import B3.p;
import De.C2859b;
import G.g;
import GR.b;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002JKB\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010A\u001a\u00020\u0017HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J«\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "subscribeButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "subscriptionCompletedButton", "emailSubscriptionControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "notificationSubscriptionControlSettings", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "subscriptionCompletedNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "backgroundColor", "", "borderColor", "layoutMargins", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;", "dialog", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscriptionCompletedButton", "getEmailSubscriptionControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getNotificationSubscriptionControlSettings", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSubscriptionCompletedNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getLayoutMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;", "getDialog", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginsDTO", "RationaleDialogDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionBannerDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final String borderColor;
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final RationaleDialogDTO dialog;

    @NotNull
    private final CommonControlSettings emailSubscriptionControlSettings;

    @NotNull
    private final ImageDTO image;
    private final MarginsDTO layoutMargins;

    @NotNull
    private final CommonControlSettings notificationSubscriptionControlSettings;

    @NotNull
    private final ButtonV3DTO subscribeButton;

    @NotNull
    private final ButtonV3DTO subscriptionCompletedButton;

    @NotNull
    private final NotificationDTO subscriptionCompletedNotification;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "horizontal", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getHorizontal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginsDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings horizontal;

        @EnumNullFallback
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
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings3);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "message", "positiveButton", "negativeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getPositiveButton", "getNegativeButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return this.negativeButton.hashCode() + g.a(g.a(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButton);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            return C3173b.c(C3660k.d("RationaleDialogDTO(title=", str, ", message=", str2, ", positiveButton="), this.positiveButton, ", negativeButton=", this.negativeButton, ")");
        }
    }

    public NotificationSubscriptionBannerDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO subscriptionCompletedButton, @NotNull CommonControlSettings emailSubscriptionControlSettings, @NotNull CommonControlSettings notificationSubscriptionControlSettings, @NotNull ImageDTO image, IconButtonV3DTO iconButtonV3DTO, @NotNull NotificationDTO subscriptionCompletedNotification, String str, String str2, MarginsDTO marginsDTO, @NotNull RationaleDialogDTO dialog, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(subscriptionCompletedButton, "subscriptionCompletedButton");
        Intrinsics.checkNotNullParameter(emailSubscriptionControlSettings, "emailSubscriptionControlSettings");
        Intrinsics.checkNotNullParameter(notificationSubscriptionControlSettings, "notificationSubscriptionControlSettings");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(subscriptionCompletedNotification, "subscriptionCompletedNotification");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.title = title;
        this.subtitle = subtitle;
        this.subscribeButton = subscribeButton;
        this.subscriptionCompletedButton = subscriptionCompletedButton;
        this.emailSubscriptionControlSettings = emailSubscriptionControlSettings;
        this.notificationSubscriptionControlSettings = notificationSubscriptionControlSettings;
        this.image = image;
        this.closeButton = iconButtonV3DTO;
        this.subscriptionCompletedNotification = subscriptionCompletedNotification;
        this.backgroundColor = str;
        this.borderColor = str2;
        this.layoutMargins = marginsDTO;
        this.dialog = dialog;
        this.trackingInfo = map;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component12, reason: from getter */
    public final MarginsDTO getLayoutMargins() {
        return this.layoutMargins;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final RationaleDialogDTO getDialog() {
        return this.dialog;
    }

    public final Map<String, TokenizedTrackingInfo> component14() {
        return this.trackingInfo;
    }

    @NotNull
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

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getEmailSubscriptionControlSettings() {
        return this.emailSubscriptionControlSettings;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getNotificationSubscriptionControlSettings() {
        return this.notificationSubscriptionControlSettings;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final NotificationDTO getSubscriptionCompletedNotification() {
        return this.subscriptionCompletedNotification;
    }

    @NotNull
    public final NotificationSubscriptionBannerDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO subscriptionCompletedButton, @NotNull CommonControlSettings emailSubscriptionControlSettings, @NotNull CommonControlSettings notificationSubscriptionControlSettings, @NotNull ImageDTO image, IconButtonV3DTO closeButton, @NotNull NotificationDTO subscriptionCompletedNotification, String backgroundColor, String borderColor, MarginsDTO layoutMargins, @NotNull RationaleDialogDTO dialog, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(subscriptionCompletedButton, "subscriptionCompletedButton");
        Intrinsics.checkNotNullParameter(emailSubscriptionControlSettings, "emailSubscriptionControlSettings");
        Intrinsics.checkNotNullParameter(notificationSubscriptionControlSettings, "notificationSubscriptionControlSettings");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(subscriptionCompletedNotification, "subscriptionCompletedNotification");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        return new NotificationSubscriptionBannerDTO(title, subtitle, subscribeButton, subscriptionCompletedButton, emailSubscriptionControlSettings, notificationSubscriptionControlSettings, image, closeButton, subscriptionCompletedNotification, backgroundColor, borderColor, layoutMargins, dialog, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSubscriptionBannerDTO)) {
            return false;
        }
        NotificationSubscriptionBannerDTO notificationSubscriptionBannerDTO = (NotificationSubscriptionBannerDTO) other;
        return Intrinsics.d(this.title, notificationSubscriptionBannerDTO.title) && Intrinsics.d(this.subtitle, notificationSubscriptionBannerDTO.subtitle) && Intrinsics.d(this.subscribeButton, notificationSubscriptionBannerDTO.subscribeButton) && Intrinsics.d(this.subscriptionCompletedButton, notificationSubscriptionBannerDTO.subscriptionCompletedButton) && Intrinsics.d(this.emailSubscriptionControlSettings, notificationSubscriptionBannerDTO.emailSubscriptionControlSettings) && Intrinsics.d(this.notificationSubscriptionControlSettings, notificationSubscriptionBannerDTO.notificationSubscriptionControlSettings) && Intrinsics.d(this.image, notificationSubscriptionBannerDTO.image) && Intrinsics.d(this.closeButton, notificationSubscriptionBannerDTO.closeButton) && Intrinsics.d(this.subscriptionCompletedNotification, notificationSubscriptionBannerDTO.subscriptionCompletedNotification) && Intrinsics.d(this.backgroundColor, notificationSubscriptionBannerDTO.backgroundColor) && Intrinsics.d(this.borderColor, notificationSubscriptionBannerDTO.borderColor) && Intrinsics.d(this.layoutMargins, notificationSubscriptionBannerDTO.layoutMargins) && Intrinsics.d(this.dialog, notificationSubscriptionBannerDTO.dialog) && Intrinsics.d(this.trackingInfo, notificationSubscriptionBannerDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final RationaleDialogDTO getDialog() {
        return this.dialog;
    }

    @NotNull
    public final CommonControlSettings getEmailSubscriptionControlSettings() {
        return this.emailSubscriptionControlSettings;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final MarginsDTO getLayoutMargins() {
        return this.layoutMargins;
    }

    @NotNull
    public final CommonControlSettings getNotificationSubscriptionControlSettings() {
        return this.notificationSubscriptionControlSettings;
    }

    @NotNull
    public final ButtonV3DTO getSubscribeButton() {
        return this.subscribeButton;
    }

    @NotNull
    public final ButtonV3DTO getSubscriptionCompletedButton() {
        return this.subscriptionCompletedButton;
    }

    @NotNull
    public final NotificationDTO getSubscriptionCompletedNotification() {
        return this.subscriptionCompletedNotification;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.image, Bi.a.a(this.notificationSubscriptionControlSettings, Bi.a.a(this.emailSubscriptionControlSettings, C2859b.c(this.subscriptionCompletedButton, C2859b.c(this.subscribeButton, Ns.b.a(this.subtitle, this.title.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode = (this.subscriptionCompletedNotification.hashCode() + ((b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borderColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarginsDTO marginsDTO = this.layoutMargins;
        int hashCode4 = (this.dialog.hashCode() + ((hashCode3 + (marginsDTO == null ? 0 : marginsDTO.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3DTO buttonV3DTO = this.subscribeButton;
        ButtonV3DTO buttonV3DTO2 = this.subscriptionCompletedButton;
        CommonControlSettings commonControlSettings = this.emailSubscriptionControlSettings;
        CommonControlSettings commonControlSettings2 = this.notificationSubscriptionControlSettings;
        ImageDTO imageDTO = this.image;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        NotificationDTO notificationDTO = this.subscriptionCompletedNotification;
        String str = this.backgroundColor;
        String str2 = this.borderColor;
        MarginsDTO marginsDTO = this.layoutMargins;
        RationaleDialogDTO rationaleDialogDTO = this.dialog;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("NotificationSubscriptionBannerDTO(title=", textDTO, ", subtitle=", textDTO2, ", subscribeButton=");
        g10.append(buttonV3DTO);
        g10.append(", subscriptionCompletedButton=");
        g10.append(buttonV3DTO2);
        g10.append(", emailSubscriptionControlSettings=");
        g10.append(commonControlSettings);
        g10.append(", notificationSubscriptionControlSettings=");
        g10.append(commonControlSettings2);
        g10.append(", image=");
        g10.append(imageDTO);
        g10.append(", closeButton=");
        g10.append(iconButtonV3DTO);
        g10.append(", subscriptionCompletedNotification=");
        g10.append(notificationDTO);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", borderColor=");
        g10.append(str2);
        g10.append(", layoutMargins=");
        g10.append(marginsDTO);
        g10.append(", dialog=");
        g10.append(rationaleDialogDTO);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
