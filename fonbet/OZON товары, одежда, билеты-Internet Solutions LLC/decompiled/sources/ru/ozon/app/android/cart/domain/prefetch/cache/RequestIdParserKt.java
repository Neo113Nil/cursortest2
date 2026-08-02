package ru.ozon.app.android.cart.domain.prefetch.cache;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "requestIdOrNull", "(Ljava/lang/String;)Ljava/lang/String;", "", "paramParts", "parseValue", "(Ljava/util/List;)Ljava/lang/String;", "delimiter", "substringAfterOrNull", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RequestIdParserKt {
    private static final String parseValue(List<String> list) {
        String substringAfterOrNull;
        String str = (String) C7714v.Q(1, list);
        if (str == null || (substringAfterOrNull = substringAfterOrNull(str, "=")) == null) {
            return null;
        }
        return h.B0(substringAfterOrNull, '\"');
    }

    public static final String requestIdOrNull(@NotNull String str) {
        List m11;
        Object Q11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterator it = h.m(str, new String[]{","}, 0, 6).iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            m11 = h.m((String) it.next(), new String[]{";"}, 0, 6);
            Q11 = C7714v.Q(0, m11);
        } while (((String) (Intrinsics.d((String) Q11, "RequestID") ? Q11 : null)) == null);
        return parseValue(m11);
    }

    private static final String substringAfterOrNull(String str, String str2) {
        int J11 = h.J(str, str2, 0, false, 6);
        if (J11 == -1) {
            return null;
        }
        String substring = str.substring(str2.length() + J11, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
