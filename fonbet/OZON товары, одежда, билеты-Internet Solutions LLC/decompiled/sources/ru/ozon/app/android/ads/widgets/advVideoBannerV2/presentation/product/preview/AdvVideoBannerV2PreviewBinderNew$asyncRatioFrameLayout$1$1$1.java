package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.VideobannerPreviewProductViewBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.ProductContentAdapter;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.VideoBannerProductItemDecorator;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "inflatedView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1$1$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvVideoBannerV2PreviewBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1$1$1(AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew) {
        super(2);
        this.this$0 = advVideoBannerV2PreviewBinderNew;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$0(AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew, View view) {
        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew;
        AdvBannerVideoV2VO.SmallPreviewProduct previewProduct;
        AtomAction action;
        Function1 function1;
        advVideoBannerV2ViewHolderNew = advVideoBannerV2PreviewBinderNew.widgetViewHolder;
        AdvBannerVideoV2VO boundData = advVideoBannerV2ViewHolderNew.getBoundData();
        if (boundData == null || (previewProduct = boundData.getPreviewProduct()) == null || (action = previewProduct.getAction()) == null) {
            return;
        }
        function1 = advVideoBannerV2PreviewBinderNew.actionHandler;
        function1.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew, View view) {
        VideobannerPreviewProductViewBinding videobannerPreviewProductViewBinding;
        LinearLayout linearLayout;
        videobannerPreviewProductViewBinding = advVideoBannerV2PreviewBinderNew.binding;
        if (videobannerPreviewProductViewBinding == null || (linearLayout = videobannerPreviewProductViewBinding.previewProductView) == null) {
            return;
        }
        linearLayout.callOnClick();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View inflatedView) {
        ProductContentAdapter productContentAdapter;
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(inflatedView, "inflatedView");
        AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew = this.this$0;
        VideobannerPreviewProductViewBinding bind = VideobannerPreviewProductViewBinding.bind(inflatedView);
        final AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew2 = this.this$0;
        RecyclerView recyclerView = bind.contentList;
        productContentAdapter = advVideoBannerV2PreviewBinderNew2.productContentAdapter;
        recyclerView.setAdapter(productContentAdapter);
        bind.contentList.addItemDecoration(new VideoBannerProductItemDecorator());
        bind.contentList.setItemAnimator(null);
        bind.previewProductView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1$1$1.invoke$lambda$2$lambda$0(AdvVideoBannerV2PreviewBinderNew.this, view);
            }
        });
        bind.contentList.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1$1$1.invoke$lambda$2$lambda$1(AdvVideoBannerV2PreviewBinderNew.this, view);
            }
        });
        advVideoBannerV2PreviewBinderNew.binding = bind;
    }
}
