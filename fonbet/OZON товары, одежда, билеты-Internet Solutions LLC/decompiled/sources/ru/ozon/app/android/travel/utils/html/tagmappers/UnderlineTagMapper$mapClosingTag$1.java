package ru.ozon.app.android.travel.utils.html.tagmappers;

import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.html.tagmappers.UnderlineTagMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/utils/html/tagmappers/UnderlineTagMapper$Underline;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UnderlineTagMapper$mapClosingTag$1 extends AbstractC7737t implements Function1<UnderlineTagMapper.Underline, Object> {
    public static final UnderlineTagMapper$mapClosingTag$1 INSTANCE = new UnderlineTagMapper$mapClosingTag$1();

    UnderlineTagMapper$mapClosingTag$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(UnderlineTagMapper.Underline it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new UnderlineSpan();
    }
}
