package ru.ozon.app.android.data.markdown;

import Ub.d;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/data/markdown/MarkDownParser;", "Lru/ozon/app/android/data/markdown/TextParser;", "LUb/d;", "markWon", "<init>", "(LUb/d;)V", "", "Landroid/text/SpannableString;", "replaceUrlSpansWithOzonUrlSpans", "(Ljava/lang/CharSequence;)Landroid/text/SpannableString;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "parse", "(Ljava/lang/String;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "LUb/d;", "getMarkWon", "()LUb/d;", "markdown_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarkDownParser implements TextParser {

    @NotNull
    private final d markWon;

    public MarkDownParser(@NotNull d markWon) {
        Intrinsics.checkNotNullParameter(markWon, "markWon");
        this.markWon = markWon;
    }

    private final SpannableString replaceUrlSpansWithOzonUrlSpans(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        Iterator a11 = C7721c.a(spannableString.getSpans(0, spannableString.length(), URLSpan.class));
        if (a11.hasNext()) {
            URLSpan uRLSpan = (URLSpan) a11.next();
            String url = uRLSpan.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            OzonUrlSpan ozonUrlSpan = new OzonUrlSpan(url, null, false, 6, null);
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(ozonUrlSpan, spanStart, spanEnd, 33);
        }
        return spannableString;
    }

    @Override // ru.ozon.app.android.data.markdown.TextParser
    @NotNull
    public OzonSpannableString parse(@NotNull String text) {
        OzonSpannableString ozonSpannableString;
        Intrinsics.checkNotNullParameter(text, "text");
        synchronized (this.markWon) {
            SpannableStringBuilder f7 = this.markWon.f(text);
            Intrinsics.checkNotNullExpressionValue(f7, "toMarkdown(...)");
            ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(replaceUrlSpansWithOzonUrlSpans(f7));
        }
        return ozonSpannableString;
    }
}
