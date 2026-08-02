package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cartView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BaseDoubleCartV4BottomSheetViewHolder$bindBinder$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ DoubleCartView $this_bindBinder;
    final /* synthetic */ DoubleCartVO $vo;
    final /* synthetic */ BaseDoubleCartV4BottomSheetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4BottomSheetViewHolder$bindBinder$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ DoubleCartVO $vo;
        final /* synthetic */ BaseDoubleCartV4BottomSheetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DoubleCartVO doubleCartVO, BaseDoubleCartV4BottomSheetViewHolder baseDoubleCartV4BottomSheetViewHolder) {
            super(0);
            this.$vo = doubleCartVO;
            this.this$0 = baseDoubleCartV4BottomSheetViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String relatedProductsCurtain = this.$vo.getRelatedProductsCurtain();
            if (relatedProductsCurtain != null) {
                this.this$0.bottomSheetView.loadComposer(relatedProductsCurtain);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDoubleCartV4BottomSheetViewHolder$bindBinder$1(DoubleCartView doubleCartView, BaseDoubleCartV4BottomSheetViewHolder baseDoubleCartV4BottomSheetViewHolder, DoubleCartVO doubleCartVO) {
        super(1);
        this.$this_bindBinder = doubleCartView;
        this.this$0 = baseDoubleCartV4BottomSheetViewHolder;
        this.$vo = doubleCartVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View cartView) {
        Intrinsics.checkNotNullParameter(cartView, "cartView");
        this.$this_bindBinder.setOnAddToCartClickRelatedProducts(new AnonymousClass1(this.$vo, this.this$0));
        this.this$0.postBind(cartView, this.$vo.getCurtainTrackingInfoVO(), this.$vo.getRelatedProductsCurtain());
    }
}
