package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Am.C2438a;
import B0.C2454a;
import De.C2859b;
import G.g;
import I0.C3173b;
import K00.b;
import N3.C3660k;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002NOB\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b4\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b8\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010!R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bD\u0010!R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010H\u001a\u0004\bI\u0010JR\u001f\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "subscribeButton", "subscriptionCompletedButton", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "emailSubscriptionControlSettings", "notificationSubscriptionControlSettings", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "subscriptionCompletedNotification", "", "backgroundColor", "borderColor", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "layoutMargins", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "dialog", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscriptionCompletedButton", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getEmailSubscriptionControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getNotificationSubscriptionControlSettings", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSubscriptionCompletedNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "getLayoutMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "getDialog", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Margins", "RationaleDialog", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionBannerVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String borderColor;
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final RationaleDialog dialog;

    @NotNull
    private final CommonControlSettings emailSubscriptionControlSettings;
    private final long id;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final Margins layoutMargins;

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
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "", "", "top", "bottom", "horizontal", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getHorizontal", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Margins {
        private final int bottom;
        private final int horizontal;
        private final int top;

        public Margins(int i11, int i12, int i13) {
            this.top = i11;
            this.bottom = i12;
            this.horizontal = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Margins)) {
                return false;
            }
            Margins margins = (Margins) other;
            return this.top == margins.top && this.bottom == margins.bottom && this.horizontal == margins.horizontal;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.horizontal) + C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.horizontal, ")", C2438a.a("Margins(top=", this.top, ", bottom=", ", horizontal=", this.bottom));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "positiveButton", "negativeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessage", "getPositiveButton", "getNegativeButton", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RationaleDialog {

        @NotNull
        private final String message;

        @NotNull
        private final String negativeButton;

        @NotNull
        private final String positiveButton;

        @NotNull
        private final String title;

        public RationaleDialog(@NotNull String title, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            this.title = title;
            this.message = message;
            this.positiveButton = positiveButton;
            this.negativeButton = negativeButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RationaleDialog)) {
                return false;
            }
            RationaleDialog rationaleDialog = (RationaleDialog) other;
            return Intrinsics.d(this.title, rationaleDialog.title) && Intrinsics.d(this.message, rationaleDialog.message) && Intrinsics.d(this.positiveButton, rationaleDialog.positiveButton) && Intrinsics.d(this.negativeButton, rationaleDialog.negativeButton);
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
            return C3173b.c(C3660k.d("RationaleDialog(title=", str, ", message=", str2, ", positiveButton="), this.positiveButton, ", negativeButton=", this.negativeButton, ")");
        }
    }

    public NotificationSubscriptionBannerVO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO subscriptionCompletedButton, @NotNull CommonControlSettings emailSubscriptionControlSettings, @NotNull CommonControlSettings notificationSubscriptionControlSettings, @NotNull ImageDTO image, IconButtonV3DTO iconButtonV3DTO, @NotNull NotificationDTO subscriptionCompletedNotification, @NotNull String backgroundColor, @NotNull String borderColor, @NotNull Margins layoutMargins, @NotNull RationaleDialog dialog, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(subscriptionCompletedButton, "subscriptionCompletedButton");
        Intrinsics.checkNotNullParameter(emailSubscriptionControlSettings, "emailSubscriptionControlSettings");
        Intrinsics.checkNotNullParameter(notificationSubscriptionControlSettings, "notificationSubscriptionControlSettings");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(subscriptionCompletedNotification, "subscriptionCompletedNotification");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(layoutMargins, "layoutMargins");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.subscribeButton = subscribeButton;
        this.subscriptionCompletedButton = subscriptionCompletedButton;
        this.emailSubscriptionControlSettings = emailSubscriptionControlSettings;
        this.notificationSubscriptionControlSettings = notificationSubscriptionControlSettings;
        this.image = image;
        this.closeButton = iconButtonV3DTO;
        this.subscriptionCompletedNotification = subscriptionCompletedNotification;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.layoutMargins = layoutMargins;
        this.dialog = dialog;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSubscriptionBannerVO)) {
            return false;
        }
        NotificationSubscriptionBannerVO notificationSubscriptionBannerVO = (NotificationSubscriptionBannerVO) other;
        return this.id == notificationSubscriptionBannerVO.id && Intrinsics.d(this.title, notificationSubscriptionBannerVO.title) && Intrinsics.d(this.subtitle, notificationSubscriptionBannerVO.subtitle) && Intrinsics.d(this.subscribeButton, notificationSubscriptionBannerVO.subscribeButton) && Intrinsics.d(this.subscriptionCompletedButton, notificationSubscriptionBannerVO.subscriptionCompletedButton) && Intrinsics.d(this.emailSubscriptionControlSettings, notificationSubscriptionBannerVO.emailSubscriptionControlSettings) && Intrinsics.d(this.notificationSubscriptionControlSettings, notificationSubscriptionBannerVO.notificationSubscriptionControlSettings) && Intrinsics.d(this.image, notificationSubscriptionBannerVO.image) && Intrinsics.d(this.closeButton, notificationSubscriptionBannerVO.closeButton) && Intrinsics.d(this.subscriptionCompletedNotification, notificationSubscriptionBannerVO.subscriptionCompletedNotification) && Intrinsics.d(this.backgroundColor, notificationSubscriptionBannerVO.backgroundColor) && Intrinsics.d(this.borderColor, notificationSubscriptionBannerVO.borderColor) && Intrinsics.d(this.layoutMargins, notificationSubscriptionBannerVO.layoutMargins) && Intrinsics.d(this.dialog, notificationSubscriptionBannerVO.dialog) && Intrinsics.d(this.viewEvent, notificationSubscriptionBannerVO.viewEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getBorderColor() {
        return this.borderColor;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final RationaleDialog getDialog() {
        return this.dialog;
    }

    @NotNull
    public final CommonControlSettings getEmailSubscriptionControlSettings() {
        return this.emailSubscriptionControlSettings;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final Margins getLayoutMargins() {
        return this.layoutMargins;
    }

    @NotNull
    public final CommonControlSettings getNotificationSubscriptionControlSettings() {
        return this.notificationSubscriptionControlSettings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = a.b(this.image, Bi.a.a(this.notificationSubscriptionControlSettings, Bi.a.a(this.emailSubscriptionControlSettings, C2859b.c(this.subscriptionCompletedButton, C2859b.c(this.subscribeButton, Ns.b.a(this.subtitle, Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31), 31), 31);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode = (this.dialog.hashCode() + ((this.layoutMargins.hashCode() + g.a(g.a((this.subscriptionCompletedNotification.hashCode() + ((b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31, 31, this.backgroundColor), 31, this.borderColor)) * 31)) * 31;
        t tVar = this.viewEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
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
        Margins margins = this.layoutMargins;
        RationaleDialog rationaleDialog = this.dialog;
        t tVar = this.viewEvent;
        StringBuilder b11 = TY.a.b("NotificationSubscriptionBannerVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", subscribeButton=");
        b11.append(buttonV3DTO);
        b11.append(", subscriptionCompletedButton=");
        b11.append(buttonV3DTO2);
        b11.append(", emailSubscriptionControlSettings=");
        b11.append(commonControlSettings);
        b11.append(", notificationSubscriptionControlSettings=");
        b11.append(commonControlSettings2);
        b11.append(", image=");
        b11.append(imageDTO);
        b11.append(", closeButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", subscriptionCompletedNotification=");
        b11.append(notificationDTO);
        a.h(b11, ", backgroundColor=", str, ", borderColor=", str2);
        b11.append(", layoutMargins=");
        b11.append(margins);
        b11.append(", dialog=");
        b11.append(rationaleDialog);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
