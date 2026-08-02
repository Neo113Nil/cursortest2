package ru.ozon.app.android.account.orders.emptyscreen.copytext;

import EZ.a;
import EZ.e;
import EZ.g;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/copytext/CopyTextNavigationHandler;", "LEZ/a;", "Lru/ozon/app/android/account/orders/emptyscreen/copytext/CopyTextDestination;", "<init>", "()V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "showMessageAndCopyToClipboard", "(LEZ/g;LEZ/e;)V", "navigate", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CopyTextNavigationHandler implements a<CopyTextDestination> {
    private final void showMessageAndCopyToClipboard(g navigator, e<CopyTextDestination> response) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        Context applicationContext = navigator.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ClipboardWrapperKt.toClipboard$default(applicationContext, null, response.b().getClipboardText(), 1, null);
        List<ComponentCallbacksC5392m> r02 = navigator.getFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        ViewGroup rootView = ContextExtKt.getRootView((ComponentCallbacksC5392m) C7714v.M(r02));
        if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(response.b().getRestrictionMessage(), null, null, null, null, null, 3, null, null, response.b().getNotificationPreset(), 414, null), navigator.getLifecycleOwner(), null, 8, null).show();
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<CopyTextDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        showMessageAndCopyToClipboard(navigator, response);
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<CopyTextDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        showMessageAndCopyToClipboard(navigator, response);
    }
}
