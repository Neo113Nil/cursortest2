package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.VideobannerPreviewProductViewBinding;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvVideoBannerV2PreviewBinderNew$processHide$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ Function2<Integer, Boolean, Unit> $containerCallback;
    final /* synthetic */ AdvVideoBannerV2PreviewBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdvVideoBannerV2PreviewBinderNew$processHide$1(AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew, Function2<? super Integer, ? super Boolean, Unit> function2) {
        super(2);
        this.this$0 = advVideoBannerV2PreviewBinderNew;
        this.$containerCallback = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View it) {
        VideobannerPreviewProductViewBinding videobannerPreviewProductViewBinding;
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(it, "it");
        videobannerPreviewProductViewBinding = this.this$0.binding;
        if (videobannerPreviewProductViewBinding == null) {
            return;
        }
        LinearLayout previewProductView = videobannerPreviewProductViewBinding.previewProductView;
        Intrinsics.checkNotNullExpressionValue(previewProductView, "previewProductView");
        ViewExtKt.gone(previewProductView);
        this.$containerCallback.invoke(0, Boolean.FALSE);
    }
}
