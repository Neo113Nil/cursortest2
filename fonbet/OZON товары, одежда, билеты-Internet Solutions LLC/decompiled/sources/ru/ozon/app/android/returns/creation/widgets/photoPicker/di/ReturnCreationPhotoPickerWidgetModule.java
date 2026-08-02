package ru.ozon.app.android.returns.creation.widgets.photoPicker.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.core.ReturnCreationPhotoPickerConfig;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewMapper.PhotosWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.title.viewMapper.TitleWidgetViewMapper;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/core/ReturnCreationPhotoPickerConfig;", "itemWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/sticky/ItemWidgetViewMapper;", "titleWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/title/viewMapper/TitleWidgetViewMapper;", "photosWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewMapper/PhotosWidgetViewMapper;", "buttonsWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewMapper/ButtonsWidgetViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "stickyBottomEarsWidgetMapper", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewMapper/StickyBottomEarsWidgetMapper;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationPhotoPickerWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull ReturnCreationPhotoPickerConfig config, @NotNull ItemWidgetViewMapper itemWidgetViewMapper, @NotNull TitleWidgetViewMapper titleWidgetViewMapper, @NotNull PhotosWidgetViewMapper photosWidgetViewMapper, @NotNull ButtonsWidgetViewMapper buttonsWidgetViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper, @NotNull StickyBottomEarsWidgetMapper stickyBottomEarsWidgetMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(itemWidgetViewMapper, "itemWidgetViewMapper");
        Intrinsics.checkNotNullParameter(titleWidgetViewMapper, "titleWidgetViewMapper");
        Intrinsics.checkNotNullParameter(photosWidgetViewMapper, "photosWidgetViewMapper");
        Intrinsics.checkNotNullParameter(buttonsWidgetViewMapper, "buttonsWidgetViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(stickyBottomEarsWidgetMapper, "stickyBottomEarsWidgetMapper");
        return new Widget2("rms", "returnCreationPhotoPicker", config, new ViewMapper2[]{itemWidgetViewMapper, titleWidgetViewMapper, photosWidgetViewMapper, buttonsWidgetViewMapper, islandSeparatorViewMapper, stickyBottomEarsWidgetMapper});
    }
}
