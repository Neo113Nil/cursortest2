package ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/cell/CellView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyOzonBankPromoOverlayViewHolder$cellView$2 extends AbstractC7737t implements Function0<CellView> {
    final /* synthetic */ StickyOzonBankPromoOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyOzonBankPromoOverlayViewHolder$cellView$2(StickyOzonBankPromoOverlayViewHolder stickyOzonBankPromoOverlayViewHolder) {
        super(0);
        this.this$0 = stickyOzonBankPromoOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CellView invoke() {
        Context context;
        context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext(...)");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        StickyOzonBankPromoOverlayViewHolder stickyOzonBankPromoOverlayViewHolder = this.this$0;
        cellView.setId(R$id.stickyOzonBankPromoButton);
        cellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View view = stickyOzonBankPromoOverlayViewHolder.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(cellView);
        }
        return cellView;
    }
}
