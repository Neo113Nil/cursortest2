package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"updateWithDTO", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "data", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlUploadPhotoUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AttachedPhoto updateWithDTO(AttachedPhoto attachedPhoto, AttachedPhotoDTO.Data data) {
        List<AttachedPhotoDTO.UploadedPhotoDTO> uploaded = data.getUploaded();
        AttachedPhotoDTO.UploadedPhotoDTO uploadedPhotoDTO = null;
        if (uploaded != null) {
            Iterator<T> it = uploaded.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((AttachedPhotoDTO.UploadedPhotoDTO) next).getPhotoKey(), attachedPhoto.getPhotoKey())) {
                    uploadedPhotoDTO = next;
                    break;
                }
            }
            uploadedPhotoDTO = uploadedPhotoDTO;
        }
        if (uploadedPhotoDTO == null) {
            return AttachedPhoto.copy$default(attachedPhoto, null, null, null, null, null, null, AttachedPhoto.Status.UPLOADING_ERROR, null, null, 441, null);
        }
        return AttachedPhoto.copy$default(attachedPhoto, null, uploadedPhotoDTO.getCdnUrl(), uploadedPhotoDTO.getPhotoId(), null, null, null, AttachedPhoto.Status.UPLOADED, null, null, 441, null);
    }
}
