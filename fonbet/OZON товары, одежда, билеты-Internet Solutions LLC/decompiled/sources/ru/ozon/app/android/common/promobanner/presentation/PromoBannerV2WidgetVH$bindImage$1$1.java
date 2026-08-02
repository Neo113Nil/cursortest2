package ru.ozon.app.android.common.promobanner.presentation;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.ui.promobanner.databinding.WidgetPromoBannerV2Binding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PromoBannerV2WidgetVH$bindImage$1$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ WidgetPromoBannerV2Binding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoBannerV2WidgetVH$bindImage$1$1(WidgetPromoBannerV2Binding widgetPromoBannerV2Binding) {
        super(1);
        this.$this_with = widgetPromoBannerV2Binding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView rightIv = this.$this_with.rightIv;
        Intrinsics.checkNotNullExpressionValue(rightIv, "rightIv");
        final WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.$this_with;
        int i11 = Y.f42258g;
        if (!rightIv.isLaidOut() || rightIv.isLayoutRequested()) {
            rightIv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.common.promobanner.presentation.PromoBannerV2WidgetVH$bindImage$1$1$invoke$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    float height = WidgetPromoBannerV2Binding.this.rightIv.getHeight() / bitmap.getHeight();
                    ImageView imageView = WidgetPromoBannerV2Binding.this.rightIv;
                    Matrix matrix = new Matrix();
                    matrix.setScale(height, height);
                    imageView.setImageMatrix(matrix);
                    WidgetPromoBannerV2Binding.this.rightIv.setImageBitmap(bitmap);
                }
            });
            return;
        }
        float height = widgetPromoBannerV2Binding.rightIv.getHeight() / bitmap.getHeight();
        ImageView imageView = widgetPromoBannerV2Binding.rightIv;
        Matrix matrix = new Matrix();
        matrix.setScale(height, height);
        imageView.setImageMatrix(matrix);
        widgetPromoBannerV2Binding.rightIv.setImageBitmap(bitmap);
    }
}
