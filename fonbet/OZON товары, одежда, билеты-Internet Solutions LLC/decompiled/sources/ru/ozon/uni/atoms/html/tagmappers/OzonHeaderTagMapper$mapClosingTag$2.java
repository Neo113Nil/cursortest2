package ru.ozon.uni.atoms.html.tagmappers;

import android.text.Editable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.html.tagmappers.OzonHeaderTagMapper;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "Lru/ozon/uni/atoms/html/tagmappers/OzonHeaderTagMapper$NewLine;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OzonHeaderTagMapper$mapClosingTag$2 extends AbstractC7737t implements Function1<OzonHeaderTagMapper.NewLine, List<? extends Object>> {
    final /* synthetic */ Editable $output;
    final /* synthetic */ OzonHeaderTagMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonHeaderTagMapper$mapClosingTag$2(OzonHeaderTagMapper ozonHeaderTagMapper, Editable editable) {
        super(1);
        this.this$0 = ozonHeaderTagMapper;
        this.$output = editable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Object> invoke(OzonHeaderTagMapper.NewLine it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.appendNewLines(this.$output, it.getLineCount());
        return C7714v.a0(Unit.f71690a);
    }
}
