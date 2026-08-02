package ru.ozon.uni.android.uikitsdk.ext;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"uppercase", "", "saveSpans", "", "locale", "Ljava/util/Locale;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CharSequenceExtKt {
    @NotNull
    public static final CharSequence uppercase(@NotNull CharSequence charSequence, boolean z11, @NotNull Locale locale) {
        int i11;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!z11) {
            String upperCase = charSequence.toString().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            String upperCase2 = String.valueOf(charSequence.charAt(i12)).toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            arrayList.add(upperCase2);
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, charSequence.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C7714v.V(arrayList, "", null, null, null, 62));
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            Iterator it = C7714v.E0(arrayList, h.o(spanStart, spanned.getSpanEnd(obj))).iterator();
            int i13 = 0;
            while (it.hasNext()) {
                i13 += ((String) it.next()).length();
            }
            if (spanStart == 0) {
                i11 = 0;
            } else {
                Iterator it2 = C7714v.E0(arrayList, h.o(0, spanStart)).iterator();
                i11 = 0;
                while (it2.hasNext()) {
                    i11 += ((String) it2.next()).length();
                }
            }
            spannableStringBuilder.setSpan(obj, i11, i13 + i11, spanned.getSpanFlags(obj));
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ CharSequence uppercase$default(CharSequence charSequence, boolean z11, Locale locale, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            locale = Locale.getDefault();
        }
        return uppercase(charSequence, z11, locale);
    }
}
