package ru.ozon.app.android.search.widgets.commonTapTags;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/commonTapTags/SearchBarValueFormatter;", "", "<init>", "()V", "", "currentQuery", "suggestedTapTag", "concatenateWithSearchBarValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "lastWord", "(Ljava/lang/String;)Ljava/lang/String;", "", "charsCount", "removeCharsAtTheEnd", "(Ljava/lang/String;I)Ljava/lang/String;", "", "shouldOverrideExistingText", "formatSearchValueWithTapTags", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchBarValueFormatter {

    @NotNull
    public static final SearchBarValueFormatter INSTANCE = new SearchBarValueFormatter();

    private SearchBarValueFormatter() {
    }

    private final String concatenateWithSearchBarValue(String currentQuery, String suggestedTapTag) {
        return h.e0(suggestedTapTag, " ", false) ? d.e(currentQuery, suggestedTapTag) : d.e(removeCharsAtTheEnd(currentQuery, lastWord(currentQuery).length()), suggestedTapTag);
    }

    private final String lastWord(String str) {
        return h.k0(str, " ", str);
    }

    private final String removeCharsAtTheEnd(String str, int i11) {
        if (i11 > str.length()) {
            return "";
        }
        String substring = str.substring(0, str.length() - i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final String formatSearchValueWithTapTags(@NotNull String currentQuery, @NotNull String suggestedTapTag, boolean shouldOverrideExistingText) {
        Intrinsics.checkNotNullParameter(currentQuery, "currentQuery");
        Intrinsics.checkNotNullParameter(suggestedTapTag, "suggestedTapTag");
        return shouldOverrideExistingText ? suggestedTapTag : concatenateWithSearchBarValue(h.C0(currentQuery).toString(), suggestedTapTag);
    }
}
