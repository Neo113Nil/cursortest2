package ru.ozon.uni.atoms.html.tagmappers;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.atoms.html.tagmappers.BoldTagMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/html/tagmappers/BoldTagMapper$Bold;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BoldTagMapper$mapClosingTag$1 extends AbstractC7737t implements Function1<BoldTagMapper.Bold, Object> {
    final /* synthetic */ BoldTagMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoldTagMapper$mapClosingTag$1(BoldTagMapper boldTagMapper) {
        super(1);
        this.this$0 = boldTagMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(BoldTagMapper.Bold it) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(it, "it");
        typeface = this.this$0.typeface;
        return new CustomTypefaceSpan(typeface);
    }
}
