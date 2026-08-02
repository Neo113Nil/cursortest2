package ru.ozon.app.android.mediaupload.image.domain;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedImageDTO;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/mediaupload/image/domain/UploadImageRepository;", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attach", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "uploadImage", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface UploadImageRepository {
    Object uploadImage(@NotNull AttachmentVO.AttachedImageVO attachedImageVO, @NotNull d<? super Result<UploadedImageDTO>> dVar);
}
