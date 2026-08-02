package ru.ozon.app.android.cart.pixel.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.pixel.core.PixelConfig;
import ru.ozon.app.android.cart.pixel.presentation.PixelViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes11.dex */
public final class PixelModule_ProvidePixelWidgetFactory implements e<Widget2> {
    public static Widget2 providePixelWidget(PixelModule pixelModule, PixelConfig pixelConfig, PixelViewMapper pixelViewMapper) {
        Widget2 providePixelWidget = pixelModule.providePixelWidget(pixelConfig, pixelViewMapper);
        j.d(providePixelWidget);
        return providePixelWidget;
    }
}
