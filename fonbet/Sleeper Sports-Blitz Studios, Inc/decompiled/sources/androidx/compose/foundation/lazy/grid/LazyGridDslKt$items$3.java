package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.objectweb.asm.Opcodes;

/* compiled from: LazyGridDsl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$3 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, List<? extends T> list) {
        this.$span = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m1297boximpl(m1308invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m1308invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i)).getPackedValue();
    }
}
