package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlUploadPhotoUseCaseImpl;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlUploadPhotoUseCase;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;", "cmlPhotoRepository", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "photo", "", "deliveryNumber", "postingNumber", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "photoKey", "", "cancelUpload", "(Ljava/lang/String;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lxe/B0;", "jobs", "Ljava/util/concurrent/ConcurrentHashMap;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlUploadPhotoUseCaseImpl implements CmlUploadPhotoUseCase {

    @NotNull
    private final CmlPhotoRepository cmlPhotoRepository;

    @NotNull
    private final ConcurrentHashMap<String, B0> jobs;

    public CmlUploadPhotoUseCaseImpl(@NotNull CmlPhotoRepository cmlPhotoRepository) {
        Intrinsics.checkNotNullParameter(cmlPhotoRepository, "cmlPhotoRepository");
        this.cmlPhotoRepository = cmlPhotoRepository;
        this.jobs = new ConcurrentHashMap<>();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCase
    public void cancelUpload(@NotNull String photoKey) {
        Intrinsics.checkNotNullParameter(photoKey, "photoKey");
        B0 b02 = this.jobs.get(photoKey);
        if (b02 != null) {
            b02.j(null);
        }
        this.jobs.remove(photoKey);
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCase
    public Object invoke(@NotNull AttachedPhoto attachedPhoto, String str, String str2, @NotNull d<? super AttachedPhoto> dVar) {
        return C10727i.f(C10720e0.a(), new CmlUploadPhotoUseCaseImpl$invoke$2(this, attachedPhoto, str, str2, null), dVar);
    }
}
