package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2PackshotBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.general.PackshotContentItemDecorator;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.ProductContentAdapter;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "inflatedView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1$1$2 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvVideoBannerV2PackshotProductBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1$1$2(AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew) {
        super(2);
        this.this$0 = advVideoBannerV2PackshotProductBinderNew;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$0(AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew, View view) {
        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew;
        AdvBannerVideoV2VO.PackShotVO packshotVO;
        AtomAction action;
        Function1 function1;
        advVideoBannerV2ViewHolderNew = advVideoBannerV2PackshotProductBinderNew.widgetViewHolder;
        AdvBannerVideoV2VO boundData = advVideoBannerV2ViewHolderNew.getBoundData();
        if (boundData == null || (packshotVO = boundData.getPackshotVO()) == null || (action = packshotVO.getAction()) == null) {
            return;
        }
        function1 = advVideoBannerV2PackshotProductBinderNew.actionHandler;
        function1.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(WidgetAdvVideoBannerV2PackshotBinding widgetAdvVideoBannerV2PackshotBinding, View view) {
        widgetAdvVideoBannerV2PackshotBinding.packshotContainer.callOnClick();
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
        AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew = this.this$0;
        final WidgetAdvVideoBannerV2PackshotBinding bind = WidgetAdvVideoBannerV2PackshotBinding.bind(inflatedView);
        final AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew2 = this.this$0;
        bind.packshotContainer.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1$1$2.invoke$lambda$2$lambda$0(AdvVideoBannerV2PackshotProductBinderNew.this, view);
            }
        });
        bind.packshotContent.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1$1$2.invoke$lambda$2$lambda$1(WidgetAdvVideoBannerV2PackshotBinding.this, view);
            }
        });
        RecyclerView recyclerView = bind.packshotContent;
        productContentAdapter = advVideoBannerV2PackshotProductBinderNew2.adapter;
        recyclerView.setAdapter(productContentAdapter);
        bind.packshotContent.addItemDecoration(new PackshotContentItemDecorator());
        bind.packshotContent.setItemAnimator(null);
        advVideoBannerV2PackshotProductBinderNew.binding = bind;
    }
}
