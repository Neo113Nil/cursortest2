package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.utils;

import Xb.j;
import android.text.style.ForegroundColorSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/utils/FullTextUtils;", "", "<init>", "()V", "colorizeBoldParts", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "", "color", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullTextUtils {

    @NotNull
    public static final FullTextUtils INSTANCE = new FullTextUtils();

    private FullTextUtils() {
    }

    @NotNull
    public final OzonSpannableString colorizeBoldParts(@NotNull CharSequence charSequence, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        OzonSpannableString ozonSpannableString = new OzonSpannableString(charSequence);
        Object[] spans = ozonSpannableString.getSpans(0, ozonSpannableString.length(), j.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            j jVar = (j) obj;
            ozonSpannableString.setSpan(new ForegroundColorSpan(i11), ozonSpannableString.getSpanStart(jVar), ozonSpannableString.getSpanEnd(jVar), 33);
        }
        return ozonSpannableString;
    }
}
