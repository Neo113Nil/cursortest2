package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SkuScrollStateBinder$init$2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ SkuScrollStateBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuScrollStateBinder$init$2(SkuScrollStateBinder skuScrollStateBinder) {
        super(1);
        this.this$0 = skuScrollStateBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        View rootView;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((it instanceof AtomAction.Click) && Intrinsics.d(((AtomAction.Click) it).getId(), "badgeActionId")) {
            rootView = this.this$0.getRootView();
            rootView.performClick();
        }
    }
}
