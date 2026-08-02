package ru.ozon.app.android.returns.creation.widgets.methods.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.methods.core.ReturnCreationMethodsConfig;
import ru.ozon.app.android.returns.creation.widgets.methods.core.atom.AtomElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.dates.DatesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.images.ImagesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.textwithiconbutton.TextWithIconButtonElementViewMapper;

/* loaded from: classes7.dex */
public final class ReturnCreationMethodsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ReturnCreationMethodsWidgetModule returnCreationMethodsWidgetModule, ReturnCreationMethodsConfig returnCreationMethodsConfig, AtomElementViewMapper atomElementViewMapper, ImagesElementViewMapper imagesElementViewMapper, TextWithIconButtonElementViewMapper textWithIconButtonElementViewMapper, DatesElementViewMapper datesElementViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Widget2 provideWidget = returnCreationMethodsWidgetModule.provideWidget(returnCreationMethodsConfig, atomElementViewMapper, imagesElementViewMapper, textWithIconButtonElementViewMapper, datesElementViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideWidget);
        return provideWidget;
    }
}
