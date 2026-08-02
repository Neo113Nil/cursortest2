package ru.ozon.app.android.composer.navigator;

import GZ.g;
import GZ.l;
import LZ.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerDeeplinkBottomSheetDestination;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import uZ.C9992d;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/navigator/OzonComposerNavigator;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LGZ/g;", "screenRouter", "<init>", "(LGZ/g;)V", "", "popBackStack", "()V", "", "deeplink", "", "", "properties", "openDeeplink", "(Ljava/lang/String;Ljava/util/Map;)V", "fragmentTag", "", "targetRequestCode", "LuZ/d$b;", "navigationMode", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "openDeeplinkInBottomSheet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LuZ/d$b;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "openBottomSheet", "(Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/Integer;LuZ/d$b;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;)V", "LpZ/f;", "destination", "navigate", "(LpZ/f;Ljava/lang/Integer;)V", "LGZ/g;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonComposerNavigator implements ComposerNavigator {

    @NotNull
    private final g screenRouter;

    public OzonComposerNavigator(@NotNull g screenRouter) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.screenRouter = screenRouter;
    }

    @Override // ru.ozon.app.android.composer.ComposerNavigator
    public void navigate(@NotNull f destination, Integer targetRequestCode) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.screenRouter.c(new b(destination), Integer.valueOf(targetRequestCode != null ? targetRequestCode.intValue() : 0));
    }

    @Override // ru.ozon.app.android.composer.ComposerNavigator
    public void openBottomSheet(@NotNull String fragmentTag, @NotNull ComposerScreenConfig config, Integer targetRequestCode, @NotNull C9992d.b navigationMode, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode) {
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        this.screenRouter.c(new b(new BottomSheetComposerFragmentDestination(fragmentTag, config, navigationMode, overrideDisplayMode, null, null, 48, null)), Integer.valueOf(targetRequestCode != null ? targetRequestCode.intValue() : 0));
    }

    @Override // ru.ozon.app.android.composer.ComposerNavigator
    public void openDeeplink(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        g.a.a(this.screenRouter, deeplink, properties, null, 4);
    }

    @Override // ru.ozon.app.android.composer.ComposerNavigator
    public void openDeeplinkInBottomSheet(@NotNull String fragmentTag, @NotNull String deeplink, Integer targetRequestCode, @NotNull C9992d.b navigationMode, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode) {
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        this.screenRouter.c(new b(new ComposerDeeplinkBottomSheetDestination(fragmentTag, deeplink, overrideDisplayMode, navigationMode)), Integer.valueOf(targetRequestCode != null ? targetRequestCode.intValue() : 0));
    }

    @Override // ru.ozon.app.android.composer.ComposerNavigator
    public void popBackStack() {
        l.a(this.screenRouter);
    }
}
