package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "activity", "Lru/ozon/android/gallery/media/view/GalleryActivity;", "invoke", "(Lru/ozon/android/gallery/media/view/GalleryActivity;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormCommentVH$openMediaPicker$config$1$1 extends AbstractC7737t implements Function1<GalleryActivity, Boolean> {
    final /* synthetic */ Function1<GalleryActivity, Unit> $cameraClickHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormCommentVH$openMediaPicker$config$1$1(Function1<? super GalleryActivity, Unit> function1) {
        super(1);
        this.$cameraClickHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(GalleryActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.$cameraClickHandler.invoke(activity);
        return Boolean.TRUE;
    }
}
