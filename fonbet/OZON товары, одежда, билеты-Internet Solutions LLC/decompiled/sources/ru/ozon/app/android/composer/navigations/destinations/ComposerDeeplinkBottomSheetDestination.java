package ru.ozon.app.android.composer.navigations.destinations;

import EZ.a;
import EZ.e;
import EZ.g;
import EZ.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import uZ.C9992d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerDeeplinkBottomSheetDestination;", "LpZ/f;", "", "fragmentTag", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "LuZ/d$b;", "navigationMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;LuZ/d$b;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getFragmentTag", "getDeeplink", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "getOverrideDisplayMode", "()Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "LuZ/d$b;", "getNavigationMode", "()LuZ/d$b;", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "NavHandler", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerDeeplinkBottomSheetDestination extends f {

    @NotNull
    private final String deeplink;

    @NotNull
    private final String fragmentTag;

    @NotNull
    private final C9992d.b navigationMode;

    @NotNull
    private final d<? extends a<?>> navigator;
    private final BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerDeeplinkBottomSheetDestination$NavHandler;", "LEZ/i;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerDeeplinkBottomSheetDestination;", "<init>", "()V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "requestCode", "", "navigateInternal", "(LEZ/g;LEZ/e;I)V", "navigate", "(LEZ/g;LEZ/e;)V", "navigateForResult", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavHandler extends i<ComposerDeeplinkBottomSheetDestination> {
        private final void navigateInternal(g navigator, e<ComposerDeeplinkBottomSheetDestination> response, int requestCode) {
            ComposerDeeplinkBottomSheetDestination b11 = response.b();
            Object d11 = getOzonRouter().d(navigator.getActivity(), b11.getDeeplink());
            if (d11 != null && (d11 instanceof ComposerScreenContainer)) {
                redirect(response.e(new BottomSheetComposerFragmentDestination(b11.getFragmentTag(), ComposerScreenConfig.copy$default(((ComposerScreenContainer) d11).getScreenConfig(), null, null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777151, null), b11.getNavigationMode(), b11.getOverrideDisplayMode(), null, null, 48, null)), requestCode);
            }
        }

        @Override // EZ.a
        public void navigate(@NotNull g navigator, @NotNull e<ComposerDeeplinkBottomSheetDestination> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateInternal(navigator, response, 0);
        }

        @Override // EZ.a
        public void navigateForResult(@NotNull g navigator, @NotNull e<ComposerDeeplinkBottomSheetDestination> response, int requestCode) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateInternal(navigator, response, requestCode);
        }
    }

    public ComposerDeeplinkBottomSheetDestination(@NotNull String fragmentTag, @NotNull String deeplink, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, @NotNull C9992d.b navigationMode) {
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        this.fragmentTag = fragmentTag;
        this.deeplink = deeplink;
        this.overrideDisplayMode = overrideDisplayMode;
        this.navigationMode = navigationMode;
        this.navigator = N.b(NavHandler.class);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getFragmentTag() {
        return this.fragmentTag;
    }

    @NotNull
    public final C9992d.b getNavigationMode() {
        return this.navigationMode;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    public final BottomSheetComposerFragment.OverrideDisplayMode getOverrideDisplayMode() {
        return this.overrideDisplayMode;
    }

    @NotNull
    public String toString() {
        return V.e.a("BottomSheetComposerDeeplinkDestination(fragmentTag='", this.fragmentTag, "', deeplink='", this.deeplink, "')");
    }
}
