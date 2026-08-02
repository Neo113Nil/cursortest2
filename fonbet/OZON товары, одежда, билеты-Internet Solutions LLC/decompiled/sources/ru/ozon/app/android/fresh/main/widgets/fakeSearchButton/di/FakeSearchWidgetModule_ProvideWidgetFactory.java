package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data.FakeSearchConfig;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewMapper;

/* loaded from: classes6.dex */
public final class FakeSearchWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(FakeSearchWidgetModule fakeSearchWidgetModule, FakeSearchConfig fakeSearchConfig, FakeSearchViewMapper fakeSearchViewMapper) {
        Widget2 provideWidget = fakeSearchWidgetModule.provideWidget(fakeSearchConfig, fakeSearchViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
