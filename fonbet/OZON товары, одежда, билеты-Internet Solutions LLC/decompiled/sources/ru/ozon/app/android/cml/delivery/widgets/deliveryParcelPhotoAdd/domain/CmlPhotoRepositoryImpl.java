package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.CmlUploadPhotoApi;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepositoryImpl;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepository;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/CmlUploadPhotoApi;", "cmlUploadPhotoApi", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/CmlUploadPhotoApi;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "photo", "", "deliveryNumber", "postingNumber", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO;", "uploadPhoto", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deletePhoto-sWrulAk", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deletePhoto", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/CmlUploadPhotoApi;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlPhotoRepositoryImpl implements CmlPhotoRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CmlUploadPhotoApi cmlUploadPhotoApi;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlPhotoRepositoryImpl$Companion;", "", "<init>", "()V", "PHOTO_KEY_PARAM", "", "DELIVERY_NUMBER_PARAM", "POSTING_NUMBER_PARAM", "FILE_PARAM", "PHOTO_ID_PARAM", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CmlPhotoRepositoryImpl(@NotNull CmlUploadPhotoApi cmlUploadPhotoApi, @NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(cmlUploadPhotoApi, "cmlUploadPhotoApi");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.cmlUploadPhotoApi = cmlUploadPhotoApi;
        this.actionV2Repository = actionV2Repository;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlPhotoRepository
    /* renamed from: deletePhoto-sWrulAk */
    public Object mo578deletePhotosWrulAk(@NotNull AttachedPhoto attachedPhoto, @NotNull d<? super AttachedPhotoDTO> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new CmlPhotoRepositoryImpl$deletePhoto$2(attachedPhoto, this, null), dVar);
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlPhotoRepository
    public Object uploadPhoto(@NotNull AttachedPhoto attachedPhoto, String str, String str2, @NotNull d<? super Result<AttachedPhotoDTO>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new CmlPhotoRepositoryImpl$uploadPhoto$$inlined$runCatchingWithDispatchers$default$1(this, null, attachedPhoto, str, str2), dVar);
    }
}
