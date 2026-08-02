package ru.ozon.app.android.search.widgets.modalButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.modalButton.data.ModalButtonConfig;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonBurgerViewMapper;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonViewMapper;

/* loaded from: classes7.dex */
public final class ModalButtonDiModule_ProvideModalButtonWidgetFactory implements e<Widget2> {
    public static Widget2 provideModalButtonWidget(ModalButtonConfig modalButtonConfig, ModalButtonViewMapper modalButtonViewMapper, ModalButtonBurgerViewMapper modalButtonBurgerViewMapper) {
        Widget2 provideModalButtonWidget = ModalButtonDiModule.INSTANCE.provideModalButtonWidget(modalButtonConfig, modalButtonViewMapper, modalButtonBurgerViewMapper);
        j.d(provideModalButtonWidget);
        return provideModalButtonWidget;
    }
}
