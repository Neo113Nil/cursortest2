package ru.ozon.app.android.favorites.buttonStack.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackConfig;
import ru.ozon.app.android.favorites.buttonStack.presentation.ButtonStackViewMapper;
import ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/di/ButtonStackWidgetModule;", "", "<init>", "()V", "provideButtonStackWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackConfig;", "viewMapper", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackViewMapper;", "overlayStickyBannerViewMapper", "Lru/ozon/app/android/favorites/buttonStack/presentation/OverlayStickyBannerViewMapper;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonStackWidgetModule {

    @NotNull
    public static final ButtonStackWidgetModule INSTANCE = new ButtonStackWidgetModule();

    private ButtonStackWidgetModule() {
    }

    @NotNull
    public static final Widget2 provideButtonStackWidget(@NotNull ButtonStackConfig config, @NotNull ButtonStackViewMapper viewMapper, @NotNull OverlayStickyBannerViewMapper overlayStickyBannerViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(overlayStickyBannerViewMapper, "overlayStickyBannerViewMapper");
        return new Widget2("favorites", "buttonStack", config, new ViewMapper2[]{viewMapper, overlayStickyBannerViewMapper});
    }
}
