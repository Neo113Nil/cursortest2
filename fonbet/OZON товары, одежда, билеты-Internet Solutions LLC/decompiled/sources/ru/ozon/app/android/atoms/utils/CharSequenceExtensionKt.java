package ru.ozon.app.android.atoms.utils;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\t*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Landroid/content/Context;", "context", "", "textSizeLimit", "", "expandText", "ellipsize", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Landroid/content/Context;ILjava/lang/String;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "", "color", "setColor", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "addUnderlineToClickableSpans", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CharSequenceExtensionKt {
    @NotNull
    public static final CharSequence addUnderlineToClickableSpans(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence instanceof Spannable)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        Spannable spannable = (Spannable) charSequence;
        Object[] spans = spannable.getSpans(0, charSequence.length(), ClickableSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            ClickableSpan clickableSpan = (ClickableSpan) obj;
            spannableString.setSpan(new UnderlineSpan(), spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan), 33);
        }
        return spannableString;
    }

    @NotNull
    public static final ru.ozon.uni.atoms.utils.OzonSpannableString ellipsize(@NotNull ru.ozon.uni.atoms.utils.OzonSpannableString ozonSpannableString, @NotNull Context context, int i11, @NotNull String expandText) {
        Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(expandText, "expandText");
        int length = ozonSpannableString.length();
        Spanned spanned = ozonSpannableString;
        if (length > i11) {
            SpannableStringBuilder append = new SpannableStringBuilder(ozonSpannableString.subSequence(0, i11)).append((CharSequence) "... ");
            ru.ozon.uni.atoms.utils.OzonSpannableString ozonSpannableString2 = new ru.ozon.uni.atoms.utils.OzonSpannableString(expandText);
            ozonSpannableString2.setSpan(new OzonClickableSpan(Integer.valueOf(StyleParser.INSTANCE.parseColor(context, StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY.getValue(), StyleParser.OzColor.OZ_COLOR_BLUE)), false, 2, null), 0, expandText.length(), 33);
            OzonSpannableStringExtKt.applyFontFix$default(ozonSpannableString2, context, 0, 2, null);
            spanned = append.append((CharSequence) ozonSpannableString2);
        }
        return ru.ozon.uni.atoms.utils.OzonSpannableStringKt.toOzonSpannableString(spanned);
    }

    @NotNull
    public static final CharSequence setColor(@NotNull CharSequence charSequence, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        ru.ozon.uni.atoms.utils.OzonSpannableString ozonSpannableString = charSequence instanceof ru.ozon.uni.atoms.utils.OzonSpannableString ? (ru.ozon.uni.atoms.utils.OzonSpannableString) charSequence : null;
        if (ozonSpannableString == null) {
            ozonSpannableString = new ru.ozon.uni.atoms.utils.OzonSpannableString(charSequence);
        }
        ozonSpannableString.setSpan(new ForegroundColorSpan(i11), 0, ozonSpannableString.length(), 33);
        return ozonSpannableString;
    }
}
