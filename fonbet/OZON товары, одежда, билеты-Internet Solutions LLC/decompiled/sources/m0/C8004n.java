package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m0.V;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8004n {
    public static N a(D d11, EnumC7987e0 enumC7987e0, int i11) {
        if ((i11 & 2) != 0) {
            enumC7987e0 = EnumC7987e0.Restart;
        }
        return new N(d11, enumC7987e0, 0);
    }

    @NotNull
    public static final <T> V<T> b(@NotNull Function1<? super V.b<T>, Unit> function1) {
        V.b bVar = new V.b();
        function1.invoke(bVar);
        return new V<>(bVar);
    }

    public static C8011q0 c(float f7, Object obj, int i11) {
        float f11 = (i11 & 1) != 0 ? 1.0f : 0.6f;
        if ((i11 & 2) != 0) {
            f7 = 1500.0f;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return new C8011q0(f11, f7, obj);
    }

    public static T0 d(int i11, int i12, E e11, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 300;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            e11 = G.a();
        }
        return new T0(i11, i12, e11);
    }
}
