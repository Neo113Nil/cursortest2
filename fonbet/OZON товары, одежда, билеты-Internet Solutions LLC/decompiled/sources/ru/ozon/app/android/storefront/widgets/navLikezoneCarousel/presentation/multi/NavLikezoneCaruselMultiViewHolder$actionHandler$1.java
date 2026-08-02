package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi;

import Vg.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavLikezoneCaruselMultiViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ NavLikezoneCaruselMultiViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavLikezoneCaruselMultiViewHolder$actionHandler$1(NavLikezoneCaruselMultiViewHolder navLikezoneCaruselMultiViewHolder) {
        super(0);
        this.this$0 = navLikezoneCaruselMultiViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        c cVar;
        cVar = this.this$0.customActionHandlersStore;
        return cVar;
    }
}
