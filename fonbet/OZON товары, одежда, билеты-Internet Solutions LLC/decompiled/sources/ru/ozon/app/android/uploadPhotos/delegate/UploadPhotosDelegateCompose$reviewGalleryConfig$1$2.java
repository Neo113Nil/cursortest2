package ru.ozon.app.android.uploadPhotos.delegate;

import Fi.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "activity", "Lru/ozon/android/gallery/media/view/GalleryActivity;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UploadPhotosDelegateCompose$reviewGalleryConfig$1$2 extends AbstractC7737t implements Function1<GalleryActivity, Unit> {
    public static final UploadPhotosDelegateCompose$reviewGalleryConfig$1$2 INSTANCE = new UploadPhotosDelegateCompose$reviewGalleryConfig$1$2();

    UploadPhotosDelegateCompose$reviewGalleryConfig$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryActivity galleryActivity) {
        invoke2(galleryActivity);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        e.d(activity);
    }
}
