package ru.ozon.app.android.storefront.widgets.rateApp.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateAppViewHolder$view$2 extends AbstractC7737t implements Function0<LinearLayout> {
    final /* synthetic */ InterfaceC6068e<ViewGroup> $viewFactory;
    final /* synthetic */ RateAppViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateAppViewHolder$view$2(InterfaceC6068e<ViewGroup> interfaceC6068e, RateAppViewHolder rateAppViewHolder) {
        super(0);
        this.$viewFactory = interfaceC6068e;
        this.this$0 = rateAppViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        ViewGroup viewGroup;
        InterfaceC6068e<ViewGroup> interfaceC6068e = this.$viewFactory;
        viewGroup = this.this$0.parent;
        View create = interfaceC6068e.create(viewGroup);
        Intrinsics.g(create, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) create;
    }
}
