package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateV2ButtonsVerticalViewDelegate$bind$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ EmptyStateV2ButtonsVerticalViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2ButtonsVerticalViewDelegate$bind$1(EmptyStateV2ButtonsVerticalViewDelegate emptyStateV2ButtonsVerticalViewDelegate) {
        super(1);
        this.this$0 = emptyStateV2ButtonsVerticalViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        EmptyStateV2ButtonsTimerSupport emptyStateV2ButtonsTimerSupport;
        Function1 function1;
        Intrinsics.checkNotNullParameter(action, "action");
        emptyStateV2ButtonsTimerSupport = this.this$0.timerSupport;
        emptyStateV2ButtonsTimerSupport.onAction(action);
        function1 = this.this$0.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }
}
