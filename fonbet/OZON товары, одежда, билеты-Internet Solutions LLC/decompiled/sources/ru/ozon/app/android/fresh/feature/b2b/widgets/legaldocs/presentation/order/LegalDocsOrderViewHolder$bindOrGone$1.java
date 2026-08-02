package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LegalDocsOrderViewHolder$bindOrGone$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ LegalDocsOrderVO.Status $status;
    final /* synthetic */ LegalDocsOrderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDocsOrderViewHolder$bindOrGone$1(LegalDocsOrderVO.Status status, LegalDocsOrderViewHolder legalDocsOrderViewHolder) {
        super(1);
        this.$status = status;
        this.this$0 = legalDocsOrderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        AtomAction action = this.$status.getAction();
        if (action != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
        }
    }
}
