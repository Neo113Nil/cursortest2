package ru.ozon.app.android.uploadPhotos.di.viewModelFactory;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/uploadPhotos/di/viewModelFactory/UploadPhotosViewModelFactory;", "Landroidx/lifecycle/z0$b;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "pickedImagesMapper", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "uploadImageUseCase", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadPhotosViewModelFactory implements z0.b {

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final PickedAttachmentsMapper pickedImagesMapper;

    @NotNull
    private final UploadImageUseCase uploadImageUseCase;

    public UploadPhotosViewModelFactory(@NotNull PickedAttachmentsMapper pickedImagesMapper, @NotNull ImageResizer imageResizer, @NotNull UploadImageUseCase uploadImageUseCase) {
        Intrinsics.checkNotNullParameter(pickedImagesMapper, "pickedImagesMapper");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(uploadImageUseCase, "uploadImageUseCase");
        this.pickedImagesMapper = pickedImagesMapper;
        this.imageResizer = imageResizer;
        this.uploadImageUseCase = uploadImageUseCase;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new UploadPhotosViewModelComposeImpl(this.pickedImagesMapper, this.imageResizer, this.uploadImageUseCase);
    }
}
