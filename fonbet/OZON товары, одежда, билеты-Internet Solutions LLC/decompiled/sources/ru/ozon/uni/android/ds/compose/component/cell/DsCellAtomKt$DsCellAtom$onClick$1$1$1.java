package ru.ozon.uni.android.ds.compose.component.cell;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsCellAtomKt$DsCellAtom$onClick$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ControlState<Object> $endControlState;
    final /* synthetic */ Function0<Unit> $it;
    final /* synthetic */ Function0<Unit> $onEndClick;
    final /* synthetic */ Function0<Unit> $onStartClick;
    final /* synthetic */ ControlState<Object> $startControlState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellAtomKt$DsCellAtom$onClick$1$1$1(Function0<Unit> function0, Function0<Unit> function02, ControlState<? extends Object> controlState, ControlState<? extends Object> controlState2, Function0<Unit> function03) {
        super(0);
        this.$onStartClick = function0;
        this.$onEndClick = function02;
        this.$startControlState = controlState;
        this.$endControlState = controlState2;
        this.$it = function03;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$onStartClick == null && this.$onEndClick == null) {
            ControlState<Object> controlState = this.$startControlState;
            if (controlState != null) {
                controlState.toggle();
            }
            ControlState<Object> controlState2 = this.$endControlState;
            if (controlState2 != null) {
                controlState2.toggle();
            }
        }
        this.$it.invoke();
    }
}
