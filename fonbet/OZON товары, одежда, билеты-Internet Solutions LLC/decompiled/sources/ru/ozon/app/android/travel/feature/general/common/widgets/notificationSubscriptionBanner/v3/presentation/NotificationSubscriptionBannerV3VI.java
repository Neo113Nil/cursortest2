package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Am.C2438a;
import B0.C2454a;
import De.C2859b;
import El.C2971a;
import G.g;
import I0.C3173b;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001:\u000234BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b/\u0010\"R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "Ll20/c;", "", "id", "", "isBackendSubscribed", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "content", "Lru/ozon/uni/atoms/af/AtomAction;", "alreadySubscribedAction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "subscriptionCompletedNotification", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "dialog", "forceShowWidget", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JZLru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;ZLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "getContent", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAlreadySubscribedAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSubscriptionCompletedNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "getDialog", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "getForceShowWidget", "LWZ/t;", "getViewEvent", "()LWZ/t;", "WidgetContent", "RationaleDialog", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionBannerV3VI implements c {
    private final AtomAction alreadySubscribedAction;

    @NotNull
    private final WidgetContent content;

    @NotNull
    private final RationaleDialog dialog;
    private final boolean forceShowWidget;
    private final long id;
    private final boolean isBackendSubscribed;
    private final NotificationDTO subscriptionCompletedNotification;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "positiveButton", "negativeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessage", "getPositiveButton", "getNegativeButton", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "subscribeButton", "subscriptionCompletedButton", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "rightImage", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;", "decoration", "", "onlyButtonViewState", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscriptionCompletedButton", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getRightImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;", "getDecoration", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;", "Z", "getOnlyButtonViewState", "()Z", "Decoration", "Margins", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetContent {
        public static final int $stable = ThemeImageV1VO.$stable | IconButtonV3DTO.$stable;
        private final IconButtonV3DTO closeButton;

        @NotNull
        private final Decoration decoration;
        private final boolean onlyButtonViewState;
        private final ImageDTO rightImage;

        @NotNull
        private final ButtonV3DTO subscribeButton;

        @NotNull
        private final ButtonV3DTO subscriptionCompletedButton;
        private final TextDTO subtitle;
        private final TextDTO title;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;", "", "", "backgroundColor", "borderColor", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "backgroundImage", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;", "layoutMargins", "", "isFullWidthButton", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;ZLru/ozon/uni/atoms/data/common/CornerRadius;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getBackgroundImage", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;", "getLayoutMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;", "Z", "()Z", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Decoration {
            public static final int $stable = ThemeImageV1VO.$stable;
            private final String backgroundColor;
            private final ThemeImageV1VO backgroundImage;
            private final String borderColor;
            private final CornerRadius cornerRadius;
            private final boolean isFullWidthButton;

            @NotNull
            private final Margins layoutMargins;

            public Decoration(String str, String str2, ThemeImageV1VO themeImageV1VO, @NotNull Margins layoutMargins, boolean z11, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(layoutMargins, "layoutMargins");
                this.backgroundColor = str;
                this.borderColor = str2;
                this.backgroundImage = themeImageV1VO;
                this.layoutMargins = layoutMargins;
                this.isFullWidthButton = z11;
                this.cornerRadius = cornerRadius;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Decoration)) {
                    return false;
                }
                Decoration decoration = (Decoration) other;
                return Intrinsics.d(this.backgroundColor, decoration.backgroundColor) && Intrinsics.d(this.borderColor, decoration.borderColor) && Intrinsics.d(this.backgroundImage, decoration.backgroundImage) && Intrinsics.d(this.layoutMargins, decoration.layoutMargins) && this.isFullWidthButton == decoration.isFullWidthButton && this.cornerRadius == decoration.cornerRadius;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final ThemeImageV1VO getBackgroundImage() {
                return this.backgroundImage;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final Margins getLayoutMargins() {
                return this.layoutMargins;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.borderColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                ThemeImageV1VO themeImageV1VO = this.backgroundImage;
                int a11 = C3532b.a((this.layoutMargins.hashCode() + ((hashCode2 + (themeImageV1VO == null ? 0 : themeImageV1VO.hashCode())) * 31)) * 31, 31, this.isFullWidthButton);
                CornerRadius cornerRadius = this.cornerRadius;
                return a11 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            /* renamed from: isFullWidthButton, reason: from getter */
            public final boolean getIsFullWidthButton() {
                return this.isFullWidthButton;
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                ThemeImageV1VO themeImageV1VO = this.backgroundImage;
                Margins margins = this.layoutMargins;
                boolean z11 = this.isFullWidthButton;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder d11 = C3660k.d("Decoration(backgroundColor=", str, ", borderColor=", str2, ", backgroundImage=");
                d11.append(themeImageV1VO);
                d11.append(", layoutMargins=");
                d11.append(margins);
                d11.append(", isFullWidthButton=");
                d11.append(z11);
                d11.append(", cornerRadius=");
                d11.append(cornerRadius);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;", "", "", "top", "bottom", "horizontal", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getHorizontal", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public final int getBottom() {
                return this.bottom;
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

        public WidgetContent(TextDTO textDTO, TextDTO textDTO2, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO subscriptionCompletedButton, ImageDTO imageDTO, IconButtonV3DTO iconButtonV3DTO, @NotNull Decoration decoration, boolean z11) {
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
            this.onlyButtonViewState = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetContent)) {
                return false;
            }
            WidgetContent widgetContent = (WidgetContent) other;
            return Intrinsics.d(this.title, widgetContent.title) && Intrinsics.d(this.subtitle, widgetContent.subtitle) && Intrinsics.d(this.subscribeButton, widgetContent.subscribeButton) && Intrinsics.d(this.subscriptionCompletedButton, widgetContent.subscriptionCompletedButton) && Intrinsics.d(this.rightImage, widgetContent.rightImage) && Intrinsics.d(this.closeButton, widgetContent.closeButton) && Intrinsics.d(this.decoration, widgetContent.decoration) && this.onlyButtonViewState == widgetContent.onlyButtonViewState;
        }

        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final Decoration getDecoration() {
            return this.decoration;
        }

        public final boolean getOnlyButtonViewState() {
            return this.onlyButtonViewState;
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
            return Boolean.hashCode(this.onlyButtonViewState) + ((this.decoration.hashCode() + ((hashCode2 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.subscribeButton;
            ButtonV3DTO buttonV3DTO2 = this.subscriptionCompletedButton;
            ImageDTO imageDTO = this.rightImage;
            IconButtonV3DTO iconButtonV3DTO = this.closeButton;
            Decoration decoration = this.decoration;
            boolean z11 = this.onlyButtonViewState;
            StringBuilder g10 = D3.g.g("WidgetContent(title=", textDTO, ", subtitle=", textDTO2, ", subscribeButton=");
            g10.append(buttonV3DTO);
            g10.append(", subscriptionCompletedButton=");
            g10.append(buttonV3DTO2);
            g10.append(", rightImage=");
            g10.append(imageDTO);
            g10.append(", closeButton=");
            g10.append(iconButtonV3DTO);
            g10.append(", decoration=");
            g10.append(decoration);
            g10.append(", onlyButtonViewState=");
            g10.append(z11);
            g10.append(")");
            return g10.toString();
        }
    }

    public NotificationSubscriptionBannerV3VI(long j11, boolean z11, @NotNull WidgetContent content, AtomAction atomAction, NotificationDTO notificationDTO, @NotNull RationaleDialog dialog, boolean z12, t tVar) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.id = j11;
        this.isBackendSubscribed = z11;
        this.content = content;
        this.alreadySubscribedAction = atomAction;
        this.subscriptionCompletedNotification = notificationDTO;
        this.dialog = dialog;
        this.forceShowWidget = z12;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSubscriptionBannerV3VI)) {
            return false;
        }
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI = (NotificationSubscriptionBannerV3VI) other;
        return this.id == notificationSubscriptionBannerV3VI.id && this.isBackendSubscribed == notificationSubscriptionBannerV3VI.isBackendSubscribed && Intrinsics.d(this.content, notificationSubscriptionBannerV3VI.content) && Intrinsics.d(this.alreadySubscribedAction, notificationSubscriptionBannerV3VI.alreadySubscribedAction) && Intrinsics.d(this.subscriptionCompletedNotification, notificationSubscriptionBannerV3VI.subscriptionCompletedNotification) && Intrinsics.d(this.dialog, notificationSubscriptionBannerV3VI.dialog) && this.forceShowWidget == notificationSubscriptionBannerV3VI.forceShowWidget && Intrinsics.d(this.viewEvent, notificationSubscriptionBannerV3VI.viewEvent);
    }

    public final AtomAction getAlreadySubscribedAction() {
        return this.alreadySubscribedAction;
    }

    @NotNull
    public final WidgetContent getContent() {
        return this.content;
    }

    @NotNull
    public final RationaleDialog getDialog() {
        return this.dialog;
    }

    public final boolean getForceShowWidget() {
        return this.forceShowWidget;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final NotificationDTO getSubscriptionCompletedNotification() {
        return this.subscriptionCompletedNotification;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.isBackendSubscribed)) * 31;
        AtomAction atomAction = this.alreadySubscribedAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        NotificationDTO notificationDTO = this.subscriptionCompletedNotification;
        int a11 = C3532b.a((this.dialog.hashCode() + ((hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31)) * 31, 31, this.forceShowWidget);
        t tVar = this.viewEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isBackendSubscribed, reason: from getter */
    public final boolean getIsBackendSubscribed() {
        return this.isBackendSubscribed;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isBackendSubscribed;
        WidgetContent widgetContent = this.content;
        AtomAction atomAction = this.alreadySubscribedAction;
        NotificationDTO notificationDTO = this.subscriptionCompletedNotification;
        RationaleDialog rationaleDialog = this.dialog;
        boolean z12 = this.forceShowWidget;
        t tVar = this.viewEvent;
        StringBuilder c11 = Bl.b.c(j11, "NotificationSubscriptionBannerV3VI(id=", ", isBackendSubscribed=", z11);
        c11.append(", content=");
        c11.append(widgetContent);
        c11.append(", alreadySubscribedAction=");
        c11.append(atomAction);
        c11.append(", subscriptionCompletedNotification=");
        c11.append(notificationDTO);
        c11.append(", dialog=");
        c11.append(rationaleDialog);
        C2971a.d(c11, ", forceShowWidget=", z12, ", viewEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
