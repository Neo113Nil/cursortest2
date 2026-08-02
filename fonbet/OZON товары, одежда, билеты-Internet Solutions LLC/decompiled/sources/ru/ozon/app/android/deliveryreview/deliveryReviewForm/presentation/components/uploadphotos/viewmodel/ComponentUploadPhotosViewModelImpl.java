package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel;

import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReviewAttachmentsMapper;", "pickedImagesMapper", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "uploadImageUseCase", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReviewAttachmentsMapper;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModelImpl;", "init", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModelImpl;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReviewAttachmentsMapper;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "componentIdToViewModel", "Ljava/util/LinkedHashMap;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComponentUploadPhotosViewModelImpl extends w0 implements ComponentUploadPhotosViewModel {

    @NotNull
    private final LinkedHashMap<String, UploadPhotosViewModelImpl> componentIdToViewModel;

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final PickedAttachmentsMapper.ReviewAttachmentsMapper pickedImagesMapper;

    @NotNull
    private final UploadImageUseCase uploadImageUseCase;

    public ComponentUploadPhotosViewModelImpl(@NotNull PickedAttachmentsMapper.ReviewAttachmentsMapper pickedImagesMapper, @NotNull ImageResizer imageResizer, @NotNull UploadImageUseCase uploadImageUseCase) {
        Intrinsics.checkNotNullParameter(pickedImagesMapper, "pickedImagesMapper");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(uploadImageUseCase, "uploadImageUseCase");
        this.pickedImagesMapper = pickedImagesMapper;
        this.imageResizer = imageResizer;
        this.uploadImageUseCase = uploadImageUseCase;
        this.componentIdToViewModel = new LinkedHashMap<>();
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel
    @NotNull
    public UploadPhotosViewModelImpl init(@NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        ElementVO element = component.getElement();
        ElementVO.UploadPhotos uploadPhotos = element instanceof ElementVO.UploadPhotos ? (ElementVO.UploadPhotos) element : null;
        UploadPhotosViewModelImpl uploadPhotosViewModelImpl = new UploadPhotosViewModelImpl(this.pickedImagesMapper, this.imageResizer, this.uploadImageUseCase, uploadPhotos != null ? uploadPhotos.getLimit() : 0);
        this.componentIdToViewModel.put(component.getId(), uploadPhotosViewModelImpl);
        return uploadPhotosViewModelImpl;
    }
}
