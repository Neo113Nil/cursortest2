package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddConfig;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ParcelPhotoAddModule_ProvideParcelPhotoAddWidgetFactory implements e<Widget2> {
    public static Widget2 provideParcelPhotoAddWidget(ParcelPhotoAddConfig parcelPhotoAddConfig, ParcelPhotoAddViewMapper parcelPhotoAddViewMapper) {
        Widget2 provideParcelPhotoAddWidget = ParcelPhotoAddModule.INSTANCE.provideParcelPhotoAddWidget(parcelPhotoAddConfig, parcelPhotoAddViewMapper);
        j.d(provideParcelPhotoAddWidget);
        return provideParcelPhotoAddWidget;
    }
}
