package io.ktor.http;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.ktor.http.Parameters;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: Query.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"", "query", "", "startIndex", "limit", "", "decode", "Lio/ktor/http/Parameters;", "parseQueryString", "(Ljava/lang/String;IIZ)Lio/ktor/http/Parameters;", "Lio/ktor/http/ParametersBuilder;", "", "parse", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/String;IIZ)V", "nameIndex", "equalIndex", "endIndex", "appendParam", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/String;IIIZ)V", TtmlNode.START, TtmlNode.END, "", "text", "trimEnd", "(IILjava/lang/CharSequence;)I", "trimStart", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QueryKt {
    public static /* synthetic */ Parameters parseQueryString$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1000;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        return parseQueryString(str, i, i2, z);
    }

    public static final Parameters parseQueryString(String query, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (i > StringsKt.getLastIndex(query)) {
            return Parameters.INSTANCE.getEmpty();
        }
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder ParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parse(ParametersBuilder$default, query, i, i2, z);
        return ParametersBuilder$default.build();
    }

    private static final void parse(ParametersBuilder parametersBuilder, String str, int i, int i2, boolean z) {
        int i3;
        int lastIndex = StringsKt.getLastIndex(str);
        int i4 = 0;
        int i5 = i;
        if (i <= lastIndex) {
            int i6 = i5;
            int i7 = 0;
            i3 = -1;
            while (i7 != i2) {
                char charAt = str.charAt(i6);
                if (charAt == '&') {
                    appendParam(parametersBuilder, str, i5, i3, i6, z);
                    i7++;
                    i5 = i6 + 1;
                    i3 = -1;
                } else if (charAt == '=' && i3 == -1) {
                    i3 = i6;
                }
                if (i6 != lastIndex) {
                    i6++;
                } else {
                    i4 = i7;
                }
            }
            return;
        }
        i3 = -1;
        if (i4 == i2) {
            return;
        }
        appendParam(parametersBuilder, str, i5, i3, str.length(), z);
    }

    private static final void appendParam(ParametersBuilder parametersBuilder, String str, int i, int i2, int i3, boolean z) {
        String substring;
        String substring2;
        String substring3;
        if (i2 == -1) {
            String str2 = str;
            int trimStart = trimStart(i, i3, str2);
            int trimEnd = trimEnd(trimStart, i3, str2);
            if (trimEnd > trimStart) {
                if (z) {
                    substring3 = CodecsKt.decodeURLQueryComponent$default(str, trimStart, trimEnd, false, null, 12, null);
                } else {
                    substring3 = str.substring(trimStart, trimEnd);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                }
                parametersBuilder.appendAll(substring3, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        String str3 = str;
        int trimStart2 = trimStart(i, i2, str3);
        int trimEnd2 = trimEnd(trimStart2, i2, str3);
        if (trimEnd2 > trimStart2) {
            if (z) {
                substring = CodecsKt.decodeURLQueryComponent$default(str, trimStart2, trimEnd2, false, null, 12, null);
            } else {
                substring = str.substring(trimStart2, trimEnd2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            }
            int trimStart3 = trimStart(i2 + 1, i3, str3);
            int trimEnd3 = trimEnd(trimStart3, i3, str3);
            if (z) {
                substring2 = CodecsKt.decodeURLQueryComponent$default(str, trimStart3, trimEnd3, true, null, 8, null);
            } else {
                substring2 = str.substring(trimStart3, trimEnd3);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            }
            parametersBuilder.append(substring, substring2);
        }
    }

    private static final int trimEnd(int i, int i2, CharSequence charSequence) {
        while (i2 > i && CharsKt.isWhitespace(charSequence.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    private static final int trimStart(int i, int i2, CharSequence charSequence) {
        while (i < i2 && CharsKt.isWhitespace(charSequence.charAt(i))) {
            i++;
        }
        return i;
    }
}
