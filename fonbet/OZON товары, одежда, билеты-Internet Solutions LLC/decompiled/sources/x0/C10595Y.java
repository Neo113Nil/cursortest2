package x0;

import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import b1.C5503f;
import b1.C5514q;
import b1.C5516s;
import b1.C5517t;
import b1.InterfaceC5512o;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10595Y {
    public static final void a(@NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(674185128);
        if ((i11 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            InterfaceC5512o interfaceC5512o = (InterfaceC5512o) u11.m(C5514q.b());
            Object[] objArr = {interfaceC5512o};
            C5517t a11 = C5516s.a(C10587P.f104693b, new C10588Q(interfaceC5512o));
            boolean F11 = u11.F(interfaceC5512o);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C10594X(interfaceC5512o);
                u11.x(C11);
            }
            C10586O c10586o = (C10586O) C5503f.c(objArr, a11, (Function0) C11, u11, 0, 4);
            C3996z.a(C5514q.b().c(c10586o), a1.c.c(1863926504, new C10592V(c10586o, c4912a), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C10593W(c4912a, i11));
        }
    }
}
