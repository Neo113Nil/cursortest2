package ru.ozon.app.android.pdp.view.photo360.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet$PhotoData;", "invoke", "(Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet$PhotoData;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Photo360ImagesDataSet$loadImageOriginalSize$2$1 extends AbstractC7737t implements Function1<Photo360ImagesDataSet.PhotoData, Boolean> {
    final /* synthetic */ Photo360ImagesDataSet.PhotoData $oldPhotoData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ImagesDataSet$loadImageOriginalSize$2$1(Photo360ImagesDataSet.PhotoData photoData) {
        super(1);
        this.$oldPhotoData = photoData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Photo360ImagesDataSet.PhotoData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.getUrl(), this.$oldPhotoData.getUrl()));
    }
}
