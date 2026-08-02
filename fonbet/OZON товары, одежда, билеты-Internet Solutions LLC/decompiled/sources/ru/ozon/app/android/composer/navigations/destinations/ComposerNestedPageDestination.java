package ru.ozon.app.android.composer.navigations.destinations;

import EZ.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.navigators.ComposerNestedPageNavigationHandler;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerNestedPageDestination;", "LpZ/f;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "deeplink", "fragmentTag", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "getFragmentTag", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "getOverrideDisplayMode", "()Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerNestedPageDestination extends f implements ComposerScreenContainer {

    @NotNull
    private final String deeplink;

    @NotNull
    private final String fragmentTag;

    @NotNull
    private final d<? extends a<?>> navigator;
    private final BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode;

    @NotNull
    private final ComposerScreenConfig screenConfig;

    public ComposerNestedPageDestination(@NotNull ComposerScreenConfig screenConfig, @NotNull String deeplink, @NotNull String fragmentTag, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        this.screenConfig = screenConfig;
        this.deeplink = deeplink;
        this.fragmentTag = fragmentTag;
        this.overrideDisplayMode = overrideDisplayMode;
        this.navigator = N.b(ComposerNestedPageNavigationHandler.class);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getFragmentTag() {
        return this.fragmentTag;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    public final BottomSheetComposerFragment.OverrideDisplayMode getOverrideDisplayMode() {
        return this.overrideDisplayMode;
    }

    @Override // ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer
    @NotNull
    public ComposerScreenConfig getScreenConfig() {
        return this.screenConfig;
    }
}
