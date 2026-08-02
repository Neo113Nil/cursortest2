package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "photo", "", "deliveryNumber", "postingNumber", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO;", "uploadPhoto", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deletePhoto-sWrulAk", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deletePhoto", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CmlPhotoRepository {
    /* renamed from: deletePhoto-sWrulAk, reason: not valid java name */
    Object mo578deletePhotosWrulAk(@NotNull AttachedPhoto attachedPhoto, @NotNull d<? super AttachedPhotoDTO> dVar);

    Object uploadPhoto(@NotNull AttachedPhoto attachedPhoto, String str, String str2, @NotNull d<? super Result<AttachedPhotoDTO>> dVar);
}
