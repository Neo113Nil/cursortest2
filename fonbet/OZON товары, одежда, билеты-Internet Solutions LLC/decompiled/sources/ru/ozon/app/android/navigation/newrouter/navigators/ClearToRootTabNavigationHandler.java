package ru.ozon.app.android.navigation.newrouter.navigators;

import EZ.e;
import EZ.g;
import EZ.i;
import NZ.f;
import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.destinations.tabs.switchs.ClearToRootTabDestination;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/navigators/ClearToRootTabNavigationHandler;", "LEZ/i;", "Lru/ozon/app/android/navigation/newrouter/destinations/tabs/switchs/ClearToRootTabDestination;", "<init>", "()V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClearToRootTabNavigationHandler extends i<ClearToRootTabDestination> {
    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<ClearToRootTabDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateForResult(navigator, response, 0);
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<ClearToRootTabDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        f fVar = navigator instanceof f ? (f) navigator : null;
        if (fVar != null && fVar.canHandleBackStack()) {
            fVar.safeTransaction(new ClearToRootTabNavigationHandler$navigateForResult$1(fVar, response, requestCode, this));
        }
    }
}
