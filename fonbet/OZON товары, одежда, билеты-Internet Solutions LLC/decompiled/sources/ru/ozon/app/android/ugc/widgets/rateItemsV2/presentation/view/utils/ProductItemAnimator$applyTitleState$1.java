package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductItemAnimator$applyTitleState$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ boolean $rated;
    final /* synthetic */ ProductItemAnimator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemAnimator$applyTitleState$1(ProductItemAnimator productItemAnimator, boolean z11) {
        super(1);
        this.this$0 = productItemAnimator;
        this.$rated = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextView textView;
        TextView textView2;
        View view;
        TextView textView3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textView = this.this$0.titleView;
        updateConstraints.o(textView.getId(), 7);
        if (this.$rated) {
            textView3 = this.this$0.titleView;
            ConstraintSetExtKt.endToEnd(updateConstraints, textView3.getId(), 0, Dimens.INSTANCE.getDP_16());
        } else {
            textView2 = this.this$0.titleView;
            int id2 = textView2.getId();
            view = this.this$0.hideButton;
            ConstraintSetExtKt.endToStart(updateConstraints, id2, view.getId(), 0);
        }
    }
}
