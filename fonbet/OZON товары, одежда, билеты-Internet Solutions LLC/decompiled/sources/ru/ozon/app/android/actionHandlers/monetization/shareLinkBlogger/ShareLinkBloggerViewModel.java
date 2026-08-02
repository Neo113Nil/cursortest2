package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import E0.C2942q;
import N3.C3660k;
import Nh.a;
import Sc.o;
import V.e;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 92\u00020\u0001:\u00049:;<B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001f\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0012028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "requestMinifyLink", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "showCurrentNotification", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "buildErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction;", "toShowNotificationAction", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "link", "buildShareText", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "toActionV2Request", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "onCleared", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent;", "intent", "obtainIntent", "(Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent;)V", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerState;", "readAndClearState", "()Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerState;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lxe/B0;", "currentJob", "Lxe/B0;", "LAe/x0;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "Lze/h;", "_action", "Lze/h;", "LAe/h;", "LAe/h;", "getAction", "()LAe/h;", "Companion", "ShareLinkBloggerState", "ShareLinkBloggerAction", "ShareLinkBloggerIntent", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareLinkBloggerViewModel extends w0 {

    @NotNull
    private final h<ShareLinkBloggerAction> _action;

    @NotNull
    private final x0<ShareLinkBloggerState> _state;

    @NotNull
    private final InterfaceC2395h<ShareLinkBloggerAction> action;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 currentJob;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final M0<ShareLinkBloggerState> state;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction;", "", "ShowShareSheet", "ShowNotification", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction$ShowNotification;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction$ShowShareSheet;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ShareLinkBloggerAction {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction$ShowNotification;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationBar", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification implements ShareLinkBloggerAction {

            @NotNull
            private final NotificationDTO notificationBar;

            public ShowNotification(@NotNull NotificationDTO notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                this.notificationBar = notificationBar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNotification) && Intrinsics.d(this.notificationBar, ((ShowNotification) other).notificationBar);
            }

            @NotNull
            public final NotificationDTO getNotificationBar() {
                return this.notificationBar;
            }

            public int hashCode() {
                return this.notificationBar.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("ShowNotification(notificationBar=", ")", this.notificationBar);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction$ShowShareSheet;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction;", "", "shareText", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShareText", "getTitle", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowShareSheet implements ShareLinkBloggerAction {

            @NotNull
            private final String shareText;
            private final String title;

            public ShowShareSheet(@NotNull String shareText, String str) {
                Intrinsics.checkNotNullParameter(shareText, "shareText");
                this.shareText = shareText;
                this.title = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowShareSheet)) {
                    return false;
                }
                ShowShareSheet showShareSheet = (ShowShareSheet) other;
                return Intrinsics.d(this.shareText, showShareSheet.shareText) && Intrinsics.d(this.title, showShareSheet.title);
            }

            @NotNull
            public final String getShareText() {
                return this.shareText;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.shareText.hashCode() * 31;
                String str = this.title;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("ShowShareSheet(shareText=", this.shareText, ", title=", this.title, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent;", "", "ShowCurrentNotification", "HandleClickAction", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent$HandleClickAction;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent$ShowCurrentNotification;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ShareLinkBloggerIntent {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent$HandleClickAction;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HandleClickAction implements ShareLinkBloggerIntent {

            @NotNull
            private final AtomAction.Click action;

            public HandleClickAction(@NotNull AtomAction.Click action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleClickAction) && Intrinsics.d(this.action, ((HandleClickAction) other).action);
            }

            @NotNull
            public final AtomAction.Click getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "HandleClickAction(action=" + this.action + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent$ShowCurrentNotification;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowCurrentNotification implements ShareLinkBloggerIntent {

            @NotNull
            public static final ShowCurrentNotification INSTANCE = new ShowCurrentNotification();

            private ShowCurrentNotification() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowCurrentNotification);
            }

            public int hashCode() {
                return -1136720565;
            }

            @NotNull
            public String toString() {
                return "ShowCurrentNotification";
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerState;", "", "", "shareText", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationBar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShareText", "getTitle", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShareLinkBloggerState {
        private final NotificationDTO notificationBar;

        @NotNull
        private final String shareText;
        private final String title;

        public ShareLinkBloggerState(@NotNull String shareText, String str, NotificationDTO notificationDTO) {
            Intrinsics.checkNotNullParameter(shareText, "shareText");
            this.shareText = shareText;
            this.title = str;
            this.notificationBar = notificationDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareLinkBloggerState)) {
                return false;
            }
            ShareLinkBloggerState shareLinkBloggerState = (ShareLinkBloggerState) other;
            return Intrinsics.d(this.shareText, shareLinkBloggerState.shareText) && Intrinsics.d(this.title, shareLinkBloggerState.title) && Intrinsics.d(this.notificationBar, shareLinkBloggerState.notificationBar);
        }

        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        @NotNull
        public final String getShareText() {
            return this.shareText;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.shareText.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NotificationDTO notificationDTO = this.notificationBar;
            return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.shareText;
            String str2 = this.title;
            NotificationDTO notificationDTO = this.notificationBar;
            StringBuilder d11 = C3660k.d("ShareLinkBloggerState(shareText=", str, ", title=", str2, ", notificationBar=");
            d11.append(notificationDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public ShareLinkBloggerViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.actionV2Repository = actionV2Repository;
        this.dispatcherProvider = dispatcherProvider;
        x0<ShareLinkBloggerState> a11 = O0.a(null);
        this._state = a11;
        this.state = C2399j.b(a11);
        C11115c a12 = k.a(-2, 6, null);
        this._action = a12;
        this.action = C2399j.H(a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO buildErrorNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), StringProvider.getString(ru.ozon.app.android.pdp.domain.actionHandlers.R$string.seller_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildShareText(String title, String link) {
        StringBuilder sb2 = new StringBuilder();
        if (title != null) {
            sb2.append(title);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        }
        return C2942q.c(sb2, link, "toString(...)");
    }

    private final void requestMinifyLink(AtomAction.Click action) {
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.currentJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ShareLinkBloggerViewModel$requestMinifyLink$1(this, action, null), 3);
    }

    private final void showCurrentNotification() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ShareLinkBloggerViewModel$showCurrentNotification$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request toActionV2Request(AtomAction.Click click) {
        String str;
        Map<String, String> params = click.getParams();
        if (params == null || (str = params.get("action")) == null) {
            str = "shareLinkBloggerPDP";
        }
        return new ActionV2Request(click.getParams(), str, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareLinkBloggerAction toShowNotificationAction(NotificationDTO notificationDTO) {
        return new ShareLinkBloggerAction.ShowNotification(notificationDTO);
    }

    @NotNull
    public final InterfaceC2395h<ShareLinkBloggerAction> getAction() {
        return this.action;
    }

    @NotNull
    public final M0<ShareLinkBloggerState> getState() {
        return this.state;
    }

    public final void obtainIntent(@NotNull ShareLinkBloggerIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof ShareLinkBloggerIntent.HandleClickAction) {
            requestMinifyLink(((ShareLinkBloggerIntent.HandleClickAction) intent).getAction());
        } else {
            if (!(intent instanceof ShareLinkBloggerIntent.ShowCurrentNotification)) {
                throw new o();
            }
            showCurrentNotification();
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        super.onCleared();
    }

    public final ShareLinkBloggerState readAndClearState() {
        ShareLinkBloggerState value;
        ShareLinkBloggerState shareLinkBloggerState;
        x0<ShareLinkBloggerState> x0Var = this._state;
        do {
            value = x0Var.getValue();
            shareLinkBloggerState = value;
        } while (!x0Var.b(value, null));
        return shareLinkBloggerState;
    }
}
