package ru.ozon.app.android.travel.utils.html.tagmappers;

import android.text.style.AlignmentSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.html.tagmappers.OzonHeaderTagMapper;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "Lru/ozon/app/android/travel/utils/html/tagmappers/OzonHeaderTagMapper$Alignment;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OzonHeaderTagMapper$mapClosingTag$3 extends AbstractC7737t implements Function1<OzonHeaderTagMapper.Alignment, List<? extends Object>> {
    public static final OzonHeaderTagMapper$mapClosingTag$3 INSTANCE = new OzonHeaderTagMapper$mapClosingTag$3();

    OzonHeaderTagMapper$mapClosingTag$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Object> invoke(OzonHeaderTagMapper.Alignment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C7714v.a0(new AlignmentSpan.Standard(it.getAlignment()));
    }
}
