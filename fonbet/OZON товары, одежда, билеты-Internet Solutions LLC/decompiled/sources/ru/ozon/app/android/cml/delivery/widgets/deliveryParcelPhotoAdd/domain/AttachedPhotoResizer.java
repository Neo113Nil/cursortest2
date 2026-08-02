package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import We.C;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.image.ImageResizer;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhotoResizer;", "", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "<init>", "(Lru/ozon/app/android/platform/image/ImageResizer;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "photo", "resize", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttachedPhotoResizer {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final C IMAGE_MEDIA_TYPE;

    @NotNull
    private final ImageResizer imageResizer;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhotoResizer$Companion;", "", "<init>", "()V", "LWe/C;", "IMAGE_MEDIA_TYPE", "LWe/C;", "getIMAGE_MEDIA_TYPE", "()LWe/C;", "", "ATTACH_IMAGE_SIZE_LIMIT", "F", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C getIMAGE_MEDIA_TYPE() {
            return AttachedPhotoResizer.IMAGE_MEDIA_TYPE;
        }

        private Companion() {
        }
    }

    static {
        C.f33536g.getClass();
        IMAGE_MEDIA_TYPE = C.a.b("image/jpeg");
    }

    public AttachedPhotoResizer(@NotNull ImageResizer imageResizer) {
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        this.imageResizer = imageResizer;
    }

    public final Object resize(@NotNull AttachedPhoto attachedPhoto, @NotNull d<? super AttachedPhoto> dVar) {
        return C10727i.f(C10720e0.a(), new AttachedPhotoResizer$resize$2(this, attachedPhoto, null), dVar);
    }
}
