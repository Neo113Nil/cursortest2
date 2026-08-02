package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import UZ.a;
import WZ.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUZ/a;", "<unused var>", "LWZ/g;", "params", "invoke", "(LUZ/a;LWZ/g;)LWZ/g;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductItemViewHolder$analyticsModifier$1 extends AbstractC7737t implements Function2<a, g, g> {
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemViewHolder$analyticsModifier$1(ProductItemViewHolder productItemViewHolder) {
        super(2);
        this.this$0 = productItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public final g invoke(a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        TextAtomV2View hideTitle = this.this$0.getBinding().hideTitle;
        Intrinsics.checkNotNullExpressionValue(hideTitle, "hideTitle");
        return g.a(params, U.i(new Pair("status", hideTitle.getVisibility() == 0 ? "visible" : FormPageDTO.Field.FIELD_TYPE_HIDDEN)), null, 2);
    }
}
