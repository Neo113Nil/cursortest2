package ru.ozon.app.android.storefront.widgets.helpCert.domain;

import Nh.a;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/domain/ActivateHelpCertActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "onSuccess", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "throwable", "onError", "(Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/Throwable;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showNotification", "(La00/f;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "showErrorNotification", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/B0;", "job", "Lxe/B0;", "Companion", "HelpCertActionResponse", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivateHelpCertActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 job;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/domain/ActivateHelpCertActionHandler$Companion;", "", "<init>", "()V", "CERTIFICATE_ID_KEY", "", "DEFAULT_NOTIFICATION_AUTO_HIDE_DELAY", "", "EXCEPTION_REQUEST", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/domain/ActivateHelpCertActionHandler$HelpCertActionResponse;", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class HelpCertActionResponse {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO notificationBar;

        public HelpCertActionResponse(@NotNull NotificationDTO notificationBar) {
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            this.notificationBar = notificationBar;
        }

        public static /* synthetic */ HelpCertActionResponse copy$default(HelpCertActionResponse helpCertActionResponse, NotificationDTO notificationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = helpCertActionResponse.notificationBar;
            }
            return helpCertActionResponse.copy(notificationDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        @NotNull
        public final HelpCertActionResponse copy(@NotNull NotificationDTO notificationBar) {
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            return new HelpCertActionResponse(notificationBar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HelpCertActionResponse) && Intrinsics.d(this.notificationBar, ((HelpCertActionResponse) other).notificationBar);
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
            return a.e("HelpCertActionResponse(notificationBar=", ")", this.notificationBar);
        }
    }

    public ActivateHelpCertActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "activateHelpCert";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(ComposerReferences refs, Throwable throwable) {
        showErrorNotification(refs);
        refs.getController().hideLoader();
        Lm0.a.f17149a.e(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(ComposerReferences refs, NotificationDTO notification) {
        if (notification == null) {
            onError(refs, new Throwable("Exception execution action activateHelpCert"));
        } else {
            showNotification(refs.getContainer(), notification);
            InterfaceC7851b.a.e(refs.getController(), null, null, null, 7);
        }
    }

    private final void showErrorNotification(ComposerReferences refs) {
        showNotification(refs.getContainer(), new NotificationDTO(StringProvider.getString(R$string.common_something_went_wrong_android), StringProvider.getString(R$string.common_try_again_android), null, null, null, null, 6, null, null, NotificationDTO.Preset.NEGATIVE, 444, null));
    }

    private final void showNotification(C4911f container, NotificationDTO notification) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = c11.getView()) == null) {
            rootView = ContextExtKt.getRootView(container.a());
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, container.i(), null, 8, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            B0 b02 = this.job;
            if (b02 != null) {
                b02.j(null);
            }
            this.job = C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new ActivateHelpCertActionHandler$processAction$1(handlerRefs, action, this, null), 3);
        }
    }
}
