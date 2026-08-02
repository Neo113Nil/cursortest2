package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderVH;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7HeaderWidgetPlaceholderVH$mainView$1 extends AbstractC7737t implements Function0<LinearLayout> {
    final /* synthetic */ FrameLayout $containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7HeaderWidgetPlaceholderVH$mainView$1(FrameLayout frameLayout) {
        super(0);
        this.$containerView = frameLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        SellerV7HeaderVH.Companion companion = SellerV7HeaderVH.INSTANCE;
        Context context = this.$containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.createView(context);
    }
}
