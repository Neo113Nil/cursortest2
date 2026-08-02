package ru.ozon.app.android.atoms.html.tagmappers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.html.spans.OzonUrlSpan;
import ru.ozon.app.android.atoms.html.tagmappers.OzonUrlTagMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/atoms/html/tagmappers/OzonUrlTagMapper$Href;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OzonUrlTagMapper$mapClosingTag$1 extends AbstractC7737t implements Function1<OzonUrlTagMapper.Href, Object> {
    public static final OzonUrlTagMapper$mapClosingTag$1 INSTANCE = new OzonUrlTagMapper$mapClosingTag$1();

    OzonUrlTagMapper$mapClosingTag$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(OzonUrlTagMapper.Href it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new OzonUrlSpan(it.getUrl(), null, false, 6, null);
    }
}
