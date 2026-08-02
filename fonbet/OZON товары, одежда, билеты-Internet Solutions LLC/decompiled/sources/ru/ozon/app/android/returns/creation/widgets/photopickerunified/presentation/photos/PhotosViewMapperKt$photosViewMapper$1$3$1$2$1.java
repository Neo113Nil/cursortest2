package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PhotosViewMapperKt$photosViewMapper$1$3$1$2$1 extends AbstractC7737t implements Function1<PhotoItem, Unit> {
    final /* synthetic */ PickerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotosViewMapperKt$photosViewMapper$1$3$1$2$1(PickerViewModel pickerViewModel) {
        super(1);
        this.$viewModel = pickerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PhotoItem photoItem) {
        invoke2(photoItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PhotoItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$viewModel.removePhoto(it);
    }
}
