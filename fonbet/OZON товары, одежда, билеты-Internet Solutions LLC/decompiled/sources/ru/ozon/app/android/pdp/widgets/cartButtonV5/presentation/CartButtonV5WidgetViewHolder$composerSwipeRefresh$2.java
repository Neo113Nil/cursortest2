package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5WidgetViewHolder$composerSwipeRefresh$2 extends AbstractC7737t implements Function0<SwipeRefreshLayout> {
    final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5WidgetViewHolder$composerSwipeRefresh$2(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder) {
        super(0);
        this.this$0 = cartButtonV5WidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SwipeRefreshLayout invoke() {
        View view;
        ComponentCallbacksC5392m c11 = this.this$0.container.Q().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerSwipeRefresh(view);
    }
}
