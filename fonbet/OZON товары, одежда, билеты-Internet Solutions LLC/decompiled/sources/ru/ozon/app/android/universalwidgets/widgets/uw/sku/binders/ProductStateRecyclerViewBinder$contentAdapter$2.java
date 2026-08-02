package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.product.ViewExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductStateRecyclerViewBinder$contentAdapter$2 extends AbstractC7737t implements Function1<AtomItemViewHolder, Unit> {
    public static final ProductStateRecyclerViewBinder$contentAdapter$2 INSTANCE = new ProductStateRecyclerViewBinder$contentAdapter$2();

    ProductStateRecyclerViewBinder$contentAdapter$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomItemViewHolder atomItemViewHolder) {
        invoke2(atomItemViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomItemViewHolder AtomItemViewHolderDelegate) {
        Intrinsics.checkNotNullParameter(AtomItemViewHolderDelegate, "$this$AtomItemViewHolderDelegate");
        View itemView = AtomItemViewHolderDelegate.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtensionsKt.disableEmojiProcessingWithDescendants(itemView);
    }
}
