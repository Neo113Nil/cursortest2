package k30;

import B0.A0;
import C.C2702w;
import N3.C3660k;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {
    @NotNull
    public static final String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Number) {
            return ((Number) obj).toString();
        }
        if (!(obj instanceof String)) {
            if (!(obj instanceof List)) {
                if (!(obj instanceof Map)) {
                    return C2702w.c(obj, "\"", "\"");
                }
                Map map = (Map) obj;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return C7714v.V(map.entrySet(), null, "{", "}", new h(0), 25);
            }
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "<this>");
            int size = list.size();
            if (size == 0) {
                return "[]<0>";
            }
            if (size == 1) {
                return A0.b("[", a(C7714v.K(list)), "]<1>");
            }
            return K00.b.e(list.size(), ">", C3660k.d("[", a(C7714v.K(list)), ",...,", a(C7714v.X(list)), "]<"));
        }
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (length > 15) {
            return kotlin.text.h.q0(5, str) + "..." + kotlin.text.h.r0(5, str) + "<" + length + ">";
        }
        if (length <= 1) {
            if (length != 1) {
                return "";
            }
            return kotlin.text.h.E(str) + "<1>";
        }
        return kotlin.text.h.E(str) + kotlin.text.h.W(length - 2, "*") + kotlin.text.h.M(str) + "<" + length + ">";
    }
}
