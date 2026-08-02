package ru.ozon.app.android.uikit.screenstate;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.html.OzonHtmlParser;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/text/Spanned;", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ScreenStateViewWidget$showState$3$1 extends AbstractC7737t implements Function1<String, Spanned> {
    public static final ScreenStateViewWidget$showState$3$1 INSTANCE = new ScreenStateViewWidget$showState$3$1();

    ScreenStateViewWidget$showState$3$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Spanned invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, it, 0, 2, null);
    }
}
