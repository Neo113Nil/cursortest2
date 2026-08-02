package ru.ozon.app.android.travel.actionhandler.utils;

import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$string;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u000f\u001a1\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0014\u001a)\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll10/t;", "", "showDefaultError", "(Ll10/t;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "(La00/f;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(La00/f;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "Landroidx/lifecycle/J;", "lifecycleOwner", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Landroidx/lifecycle/J;)V", "", "message", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "preset", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Landroidx/lifecycle/J;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;)V", "notificationDTO", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Landroidx/lifecycle/J;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "actionhandler_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationBarUtilsKt {
    public static final void showDefaultError(@NotNull t tVar) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        ComponentCallbacksC5392m b11 = tVar.b();
        NotificationLayoutManager notificationLayoutManager = null;
        if (b11 != null && (rootView = ContextExtKt.getRootView(b11)) != null) {
            notificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
        }
        showDefaultError(notificationLayoutManager, tVar.f());
    }

    public static final void showNotification(@NotNull C4911f c4911f, @NotNull NotificationDTO notification) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(notification, "notification");
        ComponentCallbacksC5392m c11 = c4911f.c();
        NotificationLayoutManager notificationLayoutManager = null;
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null) {
            notificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
        }
        showNotification(notificationLayoutManager, c4911f.g(), notification);
    }

    public static final void showDefaultError(@NotNull C4911f c4911f) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        ComponentCallbacksC5392m c11 = c4911f.c();
        NotificationLayoutManager notificationLayoutManager = null;
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null) {
            notificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
        }
        showDefaultError(notificationLayoutManager, c4911f.g());
    }

    private static final void showNotification(NotificationLayoutManager notificationLayoutManager, J j11, String str, NotificationDTO.Preset preset) {
        if (notificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, notificationLayoutManager, new NotificationDTO(str, null, null, null, null, null, 3, null, null, preset, 414, null), j11, null, 8, null).show();
    }

    private static final void showDefaultError(NotificationLayoutManager notificationLayoutManager, J j11) {
        showNotification(notificationLayoutManager, j11, StringProvider.getString(R$string.error_flashbar_universal_network_error), NotificationDTO.Preset.WARNING);
    }

    private static final void showNotification(NotificationLayoutManager notificationLayoutManager, J j11, NotificationDTO notificationDTO) {
        if (notificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, notificationLayoutManager, notificationDTO, j11, null, 8, null).show();
    }
}
