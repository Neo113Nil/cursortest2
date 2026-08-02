package ru.ozon.uni.ozi.components.inputs;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import ru.ozon.uni.ozi.components.inputs.SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.uni.ozi.components.inputs.SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1", f = "SafeAreaInSheetOracle.kt", l = {78}, m = "emit")
/* loaded from: classes4.dex */
final class SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1(SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1.AnonymousClass1<? super T> anonymousClass1, d<? super SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.emit((Unit) null, (d<? super Unit>) this);
    }
}
