package wj;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.o;
import ld.C7924e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.harLogger.HttpArchive;

/* loaded from: classes10.dex */
public final class g {
    public static final void a(@NotNull StringBuilder sb2, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj instanceof String) {
            Fj.c.f("\"", b((String) obj), "\"", sb2);
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            sb2.append(obj.toString());
            return;
        }
        if (obj instanceof List) {
            sb2.append("[");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    a(sb2, next);
                    if (it.hasNext()) {
                        sb2.append(",");
                    }
                }
            }
            sb2.append("]");
            return;
        }
        if (obj instanceof Map) {
            sb2.append("{");
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object value = entry.getValue();
                if (value != null) {
                    Fj.c.f("\"", b(String.valueOf(entry.getKey())), "\":", sb2);
                    a(sb2, value);
                    if (it2.hasNext()) {
                        sb2.append(",");
                    }
                }
            }
            sb2.append("}");
            return;
        }
        sb2.append("{");
        Iterator it3 = C7924e.a(N.b(obj.getClass())).iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            V call = oVar.getGetter().call(obj);
            if (call != 0) {
                Fj.c.f("\"", oVar.getName(), "\":", sb2);
                a(sb2, call);
                if (it3.hasNext()) {
                    sb2.append(",");
                }
            }
        }
        sb2.append("}");
    }

    @NotNull
    public static final String b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        return kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(str, "\\", "\\\\", false), "\"", "\\\"", false), "\n", "\\n", false), "\r", "\\r", false), "\t", "\\t", false);
    }

    @NotNull
    public static final String c(@NotNull HttpArchive androidHttpArchive) {
        Intrinsics.checkNotNullParameter(androidHttpArchive, "androidHttpArchive");
        StringBuilder sb2 = new StringBuilder();
        a(sb2, androidHttpArchive);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
