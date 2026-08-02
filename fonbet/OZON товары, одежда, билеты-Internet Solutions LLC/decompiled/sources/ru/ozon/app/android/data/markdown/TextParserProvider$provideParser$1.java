package ru.ozon.app.android.data.markdown;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TextParserProvider$provideParser$1 extends C7719a implements Function1<String, OzonSpannableString> {
    TextParserProvider$provideParser$1(Object obj) {
        super(1, obj, OzonHtmlParser.Companion.class, "parseHtml", "parseHtml(Ljava/lang/String;I)Lru/ozon/uni/atoms/utils/OzonSpannableString;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OzonSpannableString invoke(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return OzonHtmlParser.Companion.parseHtml$default((OzonHtmlParser.Companion) this.receiver, p02, 0, 2, null);
    }
}
