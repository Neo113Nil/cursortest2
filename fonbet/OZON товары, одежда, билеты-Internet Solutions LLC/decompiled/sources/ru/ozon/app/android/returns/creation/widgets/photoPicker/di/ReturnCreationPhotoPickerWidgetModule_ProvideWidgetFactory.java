package ru.ozon.app.android.returns.creation.widgets.photoPicker.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.core.ReturnCreationPhotoPickerConfig;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewMapper.PhotosWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.title.viewMapper.TitleWidgetViewMapper;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;

/* loaded from: classes7.dex */
public final class ReturnCreationPhotoPickerWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ReturnCreationPhotoPickerWidgetModule returnCreationPhotoPickerWidgetModule, ReturnCreationPhotoPickerConfig returnCreationPhotoPickerConfig, ItemWidgetViewMapper itemWidgetViewMapper, TitleWidgetViewMapper titleWidgetViewMapper, PhotosWidgetViewMapper photosWidgetViewMapper, ButtonsWidgetViewMapper buttonsWidgetViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, StickyBottomEarsWidgetMapper stickyBottomEarsWidgetMapper) {
        Widget2 provideWidget = returnCreationPhotoPickerWidgetModule.provideWidget(returnCreationPhotoPickerConfig, itemWidgetViewMapper, titleWidgetViewMapper, photosWidgetViewMapper, buttonsWidgetViewMapper, commonIslandSeparatorViewMapper2, stickyBottomEarsWidgetMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
