package ru.ozon.uni.ozi.components.inputs;

import Z1.p;
import Z1.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/q;", "it", "", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SafeAreaInSheetOracleKt$safeAreaInSheetOracle$4 extends AbstractC7737t implements Function1<q, Unit> {
    final /* synthetic */ SafeAreaInSheetOracleState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SafeAreaInSheetOracleKt$safeAreaInSheetOracle$4(SafeAreaInSheetOracleState safeAreaInSheetOracleState) {
        super(1);
        this.$state = safeAreaInSheetOracleState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(q qVar) {
        m3096invokeozmzZPI(qVar.e());
        return Unit.f71690a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m3096invokeozmzZPI(long j11) {
        this.$state.setRect(p.a(0L, j11));
    }
}
