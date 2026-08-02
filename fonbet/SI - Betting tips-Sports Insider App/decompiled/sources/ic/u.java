package ic;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {
    public static o a(String string) {
        Intrinsics.checkNotNullParameter(string, "stringJson");
        tg.r rVar = e0.j;
        q deserializer = q.f11131c;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        ug.u f6 = ug.j.f(rVar, string);
        Object a7 = new ug.r(rVar, ug.w.f24323c, f6, deserializer.f23952b, null).a(deserializer);
        if (f6.e() == 10) {
            return (o) a7;
        }
        ug.u.m(f6, "Expected EOF after parsing, but had " + f6.f24320e.charAt(f6.f24316a - 1) + " instead", 0, null, 6);
        throw null;
    }

    @NotNull
    public final og.a serializer() {
        return p.f11130a;
    }
}
