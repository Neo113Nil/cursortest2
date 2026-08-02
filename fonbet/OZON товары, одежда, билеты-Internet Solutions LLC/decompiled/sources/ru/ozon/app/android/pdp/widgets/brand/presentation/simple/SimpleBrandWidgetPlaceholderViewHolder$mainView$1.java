package ru.ozon.app.android.pdp.widgets.brand.presentation.simple;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SimpleBrandWidgetPlaceholderViewHolder$mainView$1 extends AbstractC7737t implements Function0<FrameLayout> {
    final /* synthetic */ SimpleBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleBrandWidgetPlaceholderViewHolder$mainView$1(SimpleBrandWidgetPlaceholderViewHolder simpleBrandWidgetPlaceholderViewHolder) {
        super(0);
        this.this$0 = simpleBrandWidgetPlaceholderViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        return SimpleBrandViewHolder.INSTANCE.createView(this.this$0.getContext());
    }
}
