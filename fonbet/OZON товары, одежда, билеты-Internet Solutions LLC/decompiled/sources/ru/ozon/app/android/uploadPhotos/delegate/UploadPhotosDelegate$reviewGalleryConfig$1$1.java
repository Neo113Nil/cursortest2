package ru.ozon.app.android.uploadPhotos.delegate;

import Fi.e;
import Hi.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/android/gallery/media/view/GalleryActivity;", "activity", "LHi/k;", "media", "", "invoke", "(Lru/ozon/android/gallery/media/view/GalleryActivity;LHi/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class UploadPhotosDelegate$reviewGalleryConfig$1$1 extends AbstractC7737t implements Function2<GalleryActivity, k, Unit> {
    public static final UploadPhotosDelegate$reviewGalleryConfig$1$1 INSTANCE = new UploadPhotosDelegate$reviewGalleryConfig$1$1();

    UploadPhotosDelegate$reviewGalleryConfig$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(GalleryActivity galleryActivity, k kVar) {
        invoke2(galleryActivity, kVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryActivity activity, k media) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(media, "media");
        e.f(activity, media);
    }
}
