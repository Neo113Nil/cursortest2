package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2PackshotBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvVideoBannerV2PackshotProductBinderNew$processShow$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvBannerVideoV2VO $item;
    final /* synthetic */ boolean $shouldBindImage;
    final /* synthetic */ AdvVideoBannerV2PackshotProductBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PackshotProductBinderNew$processShow$1(AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew, AdvBannerVideoV2VO advBannerVideoV2VO, boolean z11) {
        super(2);
        this.this$0 = advVideoBannerV2PackshotProductBinderNew;
        this.$item = advBannerVideoV2VO;
        this.$shouldBindImage = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r6.getVisibility() == 0) goto L15;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View it) {
        WidgetAdvVideoBannerV2PackshotBinding widgetAdvVideoBannerV2PackshotBinding;
        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(it, "it");
        widgetAdvVideoBannerV2PackshotBinding = this.this$0.binding;
        if (widgetAdvVideoBannerV2PackshotBinding == null) {
            return;
        }
        advVideoBannerV2ViewModelNew = this.this$0.viewModel;
        advVideoBannerV2ViewModelNew.trackPackshotView(this.$item);
        if (!this.$shouldBindImage) {
            LinearLayout packshotContainer = widgetAdvVideoBannerV2PackshotBinding.packshotContainer;
            Intrinsics.checkNotNullExpressionValue(packshotContainer, "packshotContainer");
        }
        Image packshotImage = widgetAdvVideoBannerV2PackshotBinding.packshotImage;
        Intrinsics.checkNotNullExpressionValue(packshotImage, "packshotImage");
        AdvBannerVideoV2VO.PackShotVO packshotVO = this.$item.getPackshotVO();
        ImageHolderKt.bindOrGone$default(packshotImage, packshotVO != null ? packshotVO.getImage() : null, null, 2, null);
        LinearLayout packshotContainer2 = widgetAdvVideoBannerV2PackshotBinding.packshotContainer;
        Intrinsics.checkNotNullExpressionValue(packshotContainer2, "packshotContainer");
        ViewExtKt.show(packshotContainer2);
    }
}
