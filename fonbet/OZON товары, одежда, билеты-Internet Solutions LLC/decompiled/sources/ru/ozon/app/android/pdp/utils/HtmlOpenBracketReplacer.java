package ru.ozon.app.android.pdp.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/utils/HtmlOpenBracketReplacer;", "", "<init>", "()V", "replaceNoHtmlOpenBrackets", "", "input", "Companion", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HtmlOpenBracketReplacer {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Regex aHrefTagRegex;

    @NotNull
    private static final Regex baseRegex;

    @NotNull
    private static final Regex htmlTagsRegex;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/utils/HtmlOpenBracketReplacer$Companion;", "", "<init>", "()V", "", "HTML_OPEN_BRACKET_CODE", "Ljava/lang/String;", "OPEN_BRACKET_STR", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Regex regex = new Regex("[^<>0123456789~!@#/$%^&*+-]+");
        baseRegex = regex;
        htmlTagsRegex = new Regex("<" + regex + ">|<\\\\/" + regex + ">");
        aHrefTagRegex = new Regex("<a href=\\\\\"(.*?)\">(.*?)<\\\\/a>");
    }

    public final String replaceNoHtmlOpenBrackets(String input) {
        int length;
        if (input == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = input.length();
        int i11 = 0;
        while (i11 < length2) {
            char charAt = input.charAt(i11);
            if (charAt == h.E("<")) {
                MatchResult b11 = htmlTagsRegex.b(i11, input);
                MatchResult b12 = aHrefTagRegex.b(i11, input);
                if (b12 != null && b12.d().getF71842a() == i11) {
                    sb2.append(b12.getValue());
                    length = b12.getValue().length();
                } else if (b11 == null || b11.d().getF71842a() != i11) {
                    sb2.append("&lt;");
                } else {
                    sb2.append(b11.getValue());
                    length = b11.getValue().length();
                }
                i11 += length;
            } else {
                sb2.append(charAt);
            }
            i11++;
        }
        return sb2.toString();
    }
}
