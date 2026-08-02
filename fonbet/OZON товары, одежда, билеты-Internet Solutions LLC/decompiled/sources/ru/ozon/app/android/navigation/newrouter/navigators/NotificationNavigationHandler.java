package ru.ozon.app.android.navigation.newrouter.navigators;

import EZ.a;
import EZ.e;
import EZ.g;
import androidx.core.app.n;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.destinations.NotificationDestination;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/navigators/NotificationNavigationHandler;", "LEZ/a;", "Lru/ozon/app/android/navigation/newrouter/destinations/NotificationDestination;", "<init>", "()V", "Landroidx/fragment/app/r;", "activity", "destination", "", "navigateInternal", "(Landroidx/fragment/app/r;Lru/ozon/app/android/navigation/newrouter/destinations/NotificationDestination;)V", "LEZ/g;", "navigator", "LEZ/e;", "response", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationNavigationHandler implements a<NotificationDestination> {
    private final void navigateInternal(r activity, NotificationDestination destination) {
        n e11 = n.e(activity);
        Intrinsics.checkNotNullExpressionValue(e11, "from(...)");
        if (destination.getChannel() != null) {
            e11.c(destination.getChannel());
        }
        if (androidx.core.content.a.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
            String tag = destination.getTag();
            e11.j(destination.getNotification(), destination.getId(), tag);
        }
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<NotificationDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator.getActivity(), response.b());
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<NotificationDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator.getActivity(), response.b());
    }
}
