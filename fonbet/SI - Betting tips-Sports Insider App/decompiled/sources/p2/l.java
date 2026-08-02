package p2;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l {
    public static final boolean a(String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i5 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i5 < current.length()) {
                    char charAt = current.charAt(i5);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i10++;
                    } else if (charAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                        break;
                    }
                    i5++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    return Intrinsics.areEqual(StringsKt.Z(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static final String b(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return t.b(CollectionsKt.J(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static final String c(Collection collection) {
        return t.b(CollectionsKt.J(collection, StringUtils.COMMA, null, null, null, 62)) + t.b(" }");
    }

    public static final String d(Collection collection) {
        return t.b(CollectionsKt.J(collection, StringUtils.COMMA, null, null, null, 62)) + t.b("},");
    }
}
