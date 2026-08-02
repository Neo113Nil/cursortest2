package ru.ozon.app.android.storefront.widgets.feedback.result.presentation;

import androidx.activity.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/C;", "", "invoke", "(Landroidx/activity/C;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ResultViewHolder$setupBackPress$1 extends AbstractC7737t implements Function1<C, Unit> {
    final /* synthetic */ ResultViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultViewHolder$setupBackPress$1(ResultViewHolder resultViewHolder) {
        super(1);
        this.this$0 = resultViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C c11) {
        invoke2(c11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C addCallback) {
        AtomAction atomAction;
        Function1 function1;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        atomAction = this.this$0.backAction;
        if (atomAction != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(atomAction);
        }
    }
}
