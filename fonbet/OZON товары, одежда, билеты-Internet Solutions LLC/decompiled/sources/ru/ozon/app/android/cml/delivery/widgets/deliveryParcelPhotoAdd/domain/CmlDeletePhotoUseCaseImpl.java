package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlDeletePhotoUseCaseImpl;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlDeletePhotoUseCase;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;", "cmlPhotoRepository", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "photo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlDeletePhotoUseCaseImpl implements CmlDeletePhotoUseCase {

    @NotNull
    private final CmlPhotoRepository cmlPhotoRepository;

    public CmlDeletePhotoUseCaseImpl(@NotNull CmlPhotoRepository cmlPhotoRepository) {
        Intrinsics.checkNotNullParameter(cmlPhotoRepository, "cmlPhotoRepository");
        this.cmlPhotoRepository = cmlPhotoRepository;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlDeletePhotoUseCase
    public Object invoke(@NotNull AttachedPhoto attachedPhoto, @NotNull d<? super AttachedPhoto> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new CmlDeletePhotoUseCaseImpl$invoke$2(attachedPhoto, this, null), dVar);
    }
}
