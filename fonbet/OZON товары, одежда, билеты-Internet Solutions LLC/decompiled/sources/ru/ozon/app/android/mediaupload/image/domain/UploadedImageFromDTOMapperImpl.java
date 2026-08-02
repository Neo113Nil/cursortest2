package ru.ozon.app.android.mediaupload.image.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedImageDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, d2 = {"Lru/ozon/app/android/mediaupload/image/domain/UploadedImageFromDTOMapperImpl;", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImageFromDTOMapper;", "<init>", "()V", "invoke", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;", "dto", "Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UploadedImageFromDTOMapperImpl implements UploadedImageFromDTOMapper {
    @Override // ru.ozon.app.android.mediaupload.image.domain.UploadedImageFromDTOMapper
    @NotNull
    public UploadedImage invoke(@NotNull UploadedImageDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new UploadedImage(dto.getFilename(), dto.getBucket(), dto.getKey(), dto.getUrl(), dto.getWidth(), dto.getHeight());
    }
}
