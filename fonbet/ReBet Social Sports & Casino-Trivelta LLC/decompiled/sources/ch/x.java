package ch;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface x {

    public static final class a {
        public static void a(x xVar, Function2 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            for (Map.Entry entry : xVar.a()) {
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String b(x xVar, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            List c10 = xVar.c(name);
            if (c10 != null) {
                return (String) CollectionsKt.firstOrNull(c10);
            }
            return null;
        }
    }

    Set a();

    boolean b();

    List c(String str);

    void d(Function2 function2);

    String get(String str);

    boolean isEmpty();

    Set names();
}
