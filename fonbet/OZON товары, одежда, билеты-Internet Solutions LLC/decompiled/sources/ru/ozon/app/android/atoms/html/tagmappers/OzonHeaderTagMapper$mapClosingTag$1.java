package ru.ozon.app.android.atoms.html.tagmappers;

import android.graphics.Typeface;
import android.text.style.RelativeSizeSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.app.android.atoms.html.tagmappers.OzonHeaderTagMapper;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "Lru/ozon/app/android/atoms/html/tagmappers/OzonHeaderTagMapper$Heading;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OzonHeaderTagMapper$mapClosingTag$1 extends AbstractC7737t implements Function1<OzonHeaderTagMapper.Heading, List<? extends Object>> {
    final /* synthetic */ OzonHeaderTagMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonHeaderTagMapper$mapClosingTag$1(OzonHeaderTagMapper ozonHeaderTagMapper) {
        super(1);
        this.this$0 = ozonHeaderTagMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Object> invoke(OzonHeaderTagMapper.Heading it) {
        List list;
        Typeface typeface;
        Intrinsics.checkNotNullParameter(it, "it");
        list = this.this$0.headingSizes;
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(((Number) list.get(it.getLevel())).floatValue());
        typeface = this.this$0.typeface;
        return C7714v.b0(relativeSizeSpan, new CustomTypefaceSpan(typeface));
    }
}
