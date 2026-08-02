package ru.ozon.app.android.navigation.newrouter.destinations.flashbar;

import EZ.a;
import EZ.e;
import EZ.g;
import EZ.i;
import android.view.ViewGroup;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarDestination;", "LpZ/f;", "", "deeplink", "Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "flashbarData", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;)V", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "getFlashbarData", "()Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "NavHandler", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlashbarDestination extends f {

    @NotNull
    private final String deeplink;

    @NotNull
    private final FlashbarData flashbarData;

    @NotNull
    private final d<? extends a<?>> navigator;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarDestination$NavHandler;", "LEZ/i;", "Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarDestination;", "<init>", "()V", "Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "Landroid/view/ViewGroup;", "rootView", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "buildFlashbar", "(Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;Landroid/view/ViewGroup;Landroidx/lifecycle/J;)Lru/ozon/uni/android/flashbar/main/Flashbar;", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavHandler extends i<FlashbarDestination> {
        private final Flashbar buildFlashbar(FlashbarData flashbarData, ViewGroup viewGroup, J j11) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(flashbarData.getMessage());
            String title = flashbarData.getTitle();
            return FlashbarFactory.create$default(flashbarFactory, viewGroup, title != null ? OzonSpannableStringKt.toOzonSpannableString(title) : null, ozonSpannableString, null, null, null, flashbarData.getIcon(), null, null, null, null, null, null, null, null, null, j11, 65464, null);
        }

        @Override // EZ.a
        public void navigate(@NotNull g navigator, @NotNull e<FlashbarDestination> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateForResult(navigator, response, 0);
        }

        @Override // EZ.a
        public void navigateForResult(@NotNull g navigator, @NotNull e<FlashbarDestination> response, int requestCode) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            String deeplink = response.b().getDeeplink();
            ViewGroup rootView = ContextExtKt.getRootView(navigator.getActivity());
            if (rootView == null) {
                i.openDeeplink$default(this, deeplink, requestCode, null, 4, null);
                return;
            }
            J a11 = C0.a(rootView);
            if (a11 == null) {
                i.openDeeplink$default(this, deeplink, requestCode, null, 4, null);
            } else {
                i.openDeeplink$default(this, deeplink, requestCode, null, 4, null);
                buildFlashbar(response.b().getFlashbarData(), rootView, a11).show();
            }
        }
    }

    public FlashbarDestination(@NotNull String deeplink, @NotNull FlashbarData flashbarData) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(flashbarData, "flashbarData");
        this.deeplink = deeplink;
        this.flashbarData = flashbarData;
        this.navigator = N.b(NavHandler.class);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final FlashbarData getFlashbarData() {
        return this.flashbarData;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }
}
