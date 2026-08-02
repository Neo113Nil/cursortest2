package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickSize", "Landroid/util/Size;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV4UgcContainerView$bind$2 extends AbstractC7737t implements Function1<Size, Unit> {
    final /* synthetic */ GalleryV4UgcContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV4UgcContainerView$bind$2(GalleryV4UgcContainerView galleryV4UgcContainerView) {
        super(1);
        this.this$0 = galleryV4UgcContainerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
        invoke2(size);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Size clickSize) {
        Intrinsics.checkNotNullParameter(clickSize, "clickSize");
        if (this.this$0.getClickView().getHeight() == 0) {
            View clickView = this.this$0.getClickView();
            ViewGroup.LayoutParams layoutParams = clickView.getLayoutParams();
            int i11 = layoutParams.height;
            int i12 = layoutParams.width;
            layoutParams.width = clickSize.getWidth();
            int height = clickSize.getHeight();
            layoutParams.height = height;
            if (i11 == height && i12 == layoutParams.width) {
                return;
            }
            clickView.setLayoutParams(layoutParams);
        }
    }
}
