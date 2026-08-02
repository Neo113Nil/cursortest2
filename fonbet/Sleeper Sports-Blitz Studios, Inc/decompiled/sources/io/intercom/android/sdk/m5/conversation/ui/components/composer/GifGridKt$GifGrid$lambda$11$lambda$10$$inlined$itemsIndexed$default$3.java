package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3 implements Function1<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $span;

    public GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3(Function2 function2, List list) {
        this.$span = function2;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
