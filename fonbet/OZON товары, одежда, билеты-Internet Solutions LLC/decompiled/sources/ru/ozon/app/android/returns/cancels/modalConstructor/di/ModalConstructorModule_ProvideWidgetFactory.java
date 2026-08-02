package ru.ozon.app.android.returns.cancels.modalConstructor.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.returns.cancels.modalConstructor.core.ModalConstructorConfig;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.button.ButtonViewMapper;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.image.ImageWrapperViewMapper;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.separator.ModalConstructSeparatorViewMapper;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.text.TextWrapperViewMapper;

/* loaded from: classes7.dex */
public final class ModalConstructorModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ModalConstructorModule modalConstructorModule, ModalConstructorConfig modalConstructorConfig, ButtonViewMapper buttonViewMapper, DisclaimerViewMapper disclaimerViewMapper, TextWrapperViewMapper textWrapperViewMapper, ImageWrapperViewMapper imageWrapperViewMapper, ModalConstructSeparatorViewMapper modalConstructSeparatorViewMapper, CellListV2ViewMapper cellListV2ViewMapper, HorizontalScrollImagesViewMapper horizontalScrollImagesViewMapper) {
        Widget2 provideWidget = modalConstructorModule.provideWidget(modalConstructorConfig, buttonViewMapper, disclaimerViewMapper, textWrapperViewMapper, imageWrapperViewMapper, modalConstructSeparatorViewMapper, cellListV2ViewMapper, horizontalScrollImagesViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
