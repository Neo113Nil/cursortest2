package ru.ozon.uni.atoms.utils;

import android.text.style.ClickableSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"toOzonSpannableString", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "", "hasClickableSpan", "", "orEmpty", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonSpannableStringKt {
    public static final boolean hasClickableSpan(@NotNull OzonSpannableString ozonSpannableString) {
        Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
        Object[] spans = ozonSpannableString.getSpans(0, ozonSpannableString.length(), ClickableSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        return !(spans.length == 0);
    }

    @NotNull
    public static final OzonSpannableString orEmpty(OzonSpannableString ozonSpannableString) {
        return ozonSpannableString == null ? new OzonSpannableString() : ozonSpannableString;
    }

    @NotNull
    public static final OzonSpannableString toOzonSpannableString(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        OzonSpannableString ozonSpannableString = charSequence instanceof OzonSpannableString ? (OzonSpannableString) charSequence : null;
        return ozonSpannableString == null ? new OzonSpannableString(charSequence) : ozonSpannableString;
    }
}
