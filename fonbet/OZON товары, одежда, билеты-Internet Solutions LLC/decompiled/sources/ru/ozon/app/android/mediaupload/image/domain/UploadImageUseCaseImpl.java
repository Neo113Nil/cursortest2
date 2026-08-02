package ru.ozon.app.android.mediaupload.image.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCaseImpl;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageRepository;", "uploadImageRepository", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImageFromDTOMapper;", "uploadedImageFromDTOMapper", "<init>", "(Lru/ozon/app/android/mediaupload/image/domain/UploadImageRepository;Lru/ozon/app/android/mediaupload/image/domain/UploadedImageFromDTOMapper;)V", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attachmentVO", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;", "invoke", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "imageId", "", "cancelUpload", "(J)V", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageRepository;", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImageFromDTOMapper;", "", "Lxe/B0;", "jobs", "Ljava/util/Map;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UploadImageUseCaseImpl implements UploadImageUseCase {

    @NotNull
    private final Map<Long, B0> jobs;

    @NotNull
    private final UploadImageRepository uploadImageRepository;

    @NotNull
    private final UploadedImageFromDTOMapper uploadedImageFromDTOMapper;

    public UploadImageUseCaseImpl(@NotNull UploadImageRepository uploadImageRepository, @NotNull UploadedImageFromDTOMapper uploadedImageFromDTOMapper) {
        Intrinsics.checkNotNullParameter(uploadImageRepository, "uploadImageRepository");
        Intrinsics.checkNotNullParameter(uploadedImageFromDTOMapper, "uploadedImageFromDTOMapper");
        this.uploadImageRepository = uploadImageRepository;
        this.uploadedImageFromDTOMapper = uploadedImageFromDTOMapper;
        this.jobs = new LinkedHashMap();
    }

    @Override // ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase
    public void cancelUpload(long imageId) {
        B0 b02 = this.jobs.get(Long.valueOf(imageId));
        if (b02 != null) {
            b02.j(null);
        }
    }

    @Override // ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase
    public Object invoke(@NotNull AttachmentVO.AttachedImageVO attachedImageVO, @NotNull d<? super UploadedImage> dVar) {
        return C10727i.f(C10720e0.a(), new UploadImageUseCaseImpl$invoke$2(this, attachedImageVO, null), dVar);
    }
}
