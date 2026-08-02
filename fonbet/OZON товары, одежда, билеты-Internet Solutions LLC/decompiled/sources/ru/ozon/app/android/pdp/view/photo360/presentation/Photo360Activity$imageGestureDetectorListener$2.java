package ru.ozon.app.android.pdp.view.photo360.presentation;

import com.github.chrisbanes.photoview.PhotoView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpActivityPhoto360viewerBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360GestureDetectorListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Photo360Activity$imageGestureDetectorListener$2 extends AbstractC7737t implements Function0<Photo360GestureDetectorListener> {
    final /* synthetic */ Photo360Activity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360Activity$imageGestureDetectorListener$2(Photo360Activity photo360Activity) {
        super(0);
        this.this$0 = photo360Activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Photo360GestureDetectorListener invoke() {
        PdpActivityPhoto360viewerBinding binding;
        binding = this.this$0.getBinding();
        PhotoView imagePv = binding.imagePv;
        Intrinsics.checkNotNullExpressionValue(imagePv, "imagePv");
        return new Photo360GestureDetectorListener(imagePv);
    }
}
