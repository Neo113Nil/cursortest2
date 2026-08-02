package ru.ozon.uni.atoms.utils;

import android.content.Context;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"applyFontFix", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "context", "Landroid/content/Context;", "font", "", "applyUnderlineFlag", "", "spannable", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonSpannableStringExtKt {
    @NotNull
    public static final OzonSpannableString applyFontFix(@NotNull OzonSpannableString ozonSpannableString, @NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ozonSpannableString.setSpan(new CustomTypefaceSpan(g.e(i11, context)), 0, ozonSpannableString.length(), 33);
        return ozonSpannableString;
    }

    public static /* synthetic */ OzonSpannableString applyFontFix$default(OzonSpannableString ozonSpannableString, Context context, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$font.onest_regular;
        }
        return applyFontFix(ozonSpannableString, context, i11);
    }

    public static final void applyUnderlineFlag(@NotNull OzonSpannableString spannable, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(context, "context");
        OzonUrlSpan[] ozonUrlSpanArr = (OzonUrlSpan[]) spannable.getSpans(0, spannable.length(), OzonUrlSpan.class);
        if (ozonUrlSpanArr != null) {
            for (OzonUrlSpan ozonUrlSpan : ozonUrlSpanArr) {
                int spanStart = spannable.getSpanStart(ozonUrlSpan);
                int spanEnd = spannable.getSpanEnd(ozonUrlSpan);
                Object copy$default = OzonUrlSpan.copy$default(ozonUrlSpan, null, null, UniGlobalConfigKt.getUnderlineLinksFlag(context), 3, null);
                spannable.removeSpan(ozonUrlSpan);
                spannable.setSpan(copy$default, spanStart, spanEnd, 33);
            }
        }
    }
}
