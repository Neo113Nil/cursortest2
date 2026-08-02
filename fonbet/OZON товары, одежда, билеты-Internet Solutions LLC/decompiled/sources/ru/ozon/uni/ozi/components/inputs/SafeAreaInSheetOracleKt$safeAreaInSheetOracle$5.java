package ru.ozon.uni.ozi.components.inputs;

import B1.B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LB1/B;", "it", "", "invoke", "(LB1/B;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SafeAreaInSheetOracleKt$safeAreaInSheetOracle$5 extends AbstractC7737t implements Function1<B, Unit> {
    final /* synthetic */ SafeAreaInSheetOracleState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SafeAreaInSheetOracleKt$safeAreaInSheetOracle$5(SafeAreaInSheetOracleState safeAreaInSheetOracleState) {
        super(1);
        this.$state = safeAreaInSheetOracleState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(B b11) {
        invoke2(b11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$state.getPositionChangesFlow().tryEmit(Unit.f71690a);
    }
}
