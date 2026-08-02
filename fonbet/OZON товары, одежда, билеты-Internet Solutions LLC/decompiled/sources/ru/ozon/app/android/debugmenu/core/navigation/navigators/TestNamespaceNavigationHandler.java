package ru.ozon.app.android.debugmenu.core.navigation.navigators;

import EZ.a;
import EZ.e;
import EZ.g;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.core.navigation.destinations.TestNamespaceDestination;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/debugmenu/core/navigation/navigators/TestNamespaceNavigationHandler;", "LEZ/a;", "Lru/ozon/app/android/debugmenu/core/navigation/destinations/TestNamespaceDestination;", "Lei0/b;", "ozonTracker", "<init>", "(Lei0/b;)V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "Lei0/b;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TestNamespaceNavigationHandler implements a<TestNamespaceDestination> {

    @NotNull
    private final InterfaceC6369b ozonTracker;

    public TestNamespaceNavigationHandler(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.ozonTracker = ozonTracker;
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<TestNamespaceDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        this.ozonTracker.b(response.b().getIsTest());
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<TestNamespaceDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigate(navigator, response);
    }
}
