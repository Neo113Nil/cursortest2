package ru.ozon.app.android.core.navigation.navigators;

import EZ.e;
import EZ.g;
import EZ.i;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.core.navigation.destinations.RestartAppDestination;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/core/navigation/navigators/RestartAppNavigationHandler;", "LEZ/i;", "Lru/ozon/app/android/core/navigation/destinations/RestartAppDestination;", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "homeDestinationFactory", "<init>", "(Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;)V", "Landroidx/fragment/app/r;", "context", "", "navigateInternal", "(Landroidx/fragment/app/r;)V", "startHomeActivity", "LEZ/g;", "navigator", "LEZ/e;", "response", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestartAppNavigationHandler extends i<RestartAppDestination> {

    @NotNull
    private final HomeDestinationFactory homeDestinationFactory;

    public RestartAppNavigationHandler(@NotNull HomeDestinationFactory homeDestinationFactory) {
        Intrinsics.checkNotNullParameter(homeDestinationFactory, "homeDestinationFactory");
        this.homeDestinationFactory = homeDestinationFactory;
    }

    private final void navigateInternal(r context) {
        context.setResult(0);
        context.finishAffinity();
        startHomeActivity(context);
    }

    private final void startHomeActivity(r context) {
        String uri = LinkGenerator.INSTANCE.home().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        context.startActivity(this.homeDestinationFactory.createActivityDestination(context, uri).a());
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<RestartAppDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator.getActivity());
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<RestartAppDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator.getActivity());
    }
}
