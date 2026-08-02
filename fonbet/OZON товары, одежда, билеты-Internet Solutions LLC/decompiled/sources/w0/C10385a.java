package w0;

import S0.C3991w0;
import androidx.compose.foundation.lazy.layout.o;
import c1.AbstractC5715f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import s0.C9561d;
import w0.O;
import x0.b0;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10385a implements InterfaceC10381H {

    /* renamed from: a, reason: collision with root package name */
    private int f103249a = -1;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0.b<o.b> f103250b = new U0.b<>(new o.b[16]);

    /* renamed from: c, reason: collision with root package name */
    private boolean f103251c;

    @Override // w0.InterfaceC10381H
    public final void a(@NotNull b0 b0Var, int i11) {
        for (int i12 = 0; i12 < 2; i12++) {
            b0Var.a(i11 + i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull O.c cVar, float f7, @NotNull InterfaceC10374A interfaceC10374A) {
        int i11;
        int index;
        int m11;
        int m12;
        C3991w0 c3991w0;
        int m13;
        boolean z11 = true;
        if (interfaceC10374A.g().isEmpty()) {
            return;
        }
        boolean z12 = f7 < 0.0f;
        if (z12) {
            InterfaceC10395k interfaceC10395k = (InterfaceC10395k) C7714v.X(interfaceC10374A.g());
            i11 = (interfaceC10374A.getOrientation() == EnumC9142v.Vertical ? interfaceC10395k.i() : interfaceC10395k.e()) + 1;
            index = ((InterfaceC10395k) C7714v.X(interfaceC10374A.g())).getIndex() + 1;
        } else {
            InterfaceC10395k interfaceC10395k2 = (InterfaceC10395k) C7714v.K(interfaceC10374A.g());
            i11 = (interfaceC10374A.getOrientation() == EnumC9142v.Vertical ? interfaceC10395k2.i() : interfaceC10395k2.e()) - 1;
            index = ((InterfaceC10395k) C7714v.K(interfaceC10374A.g())).getIndex() - 1;
        }
        if (index < 0 || index >= interfaceC10374A.d()) {
            return;
        }
        int i12 = this.f103249a;
        U0.b<o.b> bVar = this.f103250b;
        if (i11 != i12 && i11 >= 0) {
            if (this.f103251c != z12 && (m13 = bVar.m()) > 0) {
                o.b[] l11 = bVar.l();
                int i13 = 0;
                do {
                    l11[i13].cancel();
                    i13++;
                } while (i13 < m13);
            }
            this.f103251c = z12;
            this.f103249a = i11;
            bVar.h();
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            O o11 = O.this;
            AbstractC5715f a11 = AbstractC5715f.a.a();
            Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
            AbstractC5715f b11 = AbstractC5715f.a.b(a11);
            try {
                c3991w0 = o11.f103212c;
                List<Pair<Integer, Z1.b>> invoke = ((C10377D) c3991w0.getValue()).n().invoke(Integer.valueOf(i11));
                int size = invoke.size();
                int i14 = 0;
                while (i14 < size) {
                    Pair<Integer, Z1.b> pair = invoke.get(i14);
                    arrayList.add(o11.v().e(pair.e().intValue(), pair.f().p()));
                    i14++;
                    invoke = invoke;
                    z11 = z11;
                }
                Unit unit = Unit.f71690a;
                AbstractC5715f.a.d(a11, b11, h11);
                bVar.d(bVar.m(), arrayList);
            } catch (Throwable th2) {
                AbstractC5715f.a.d(a11, b11, h11);
                throw th2;
            }
        }
        if (!z12) {
            if (interfaceC10374A.f() - C9561d.a((InterfaceC10395k) C7714v.K(interfaceC10374A.g()), interfaceC10374A.getOrientation()) >= f7 || (m11 = bVar.m()) <= 0) {
                return;
            }
            o.b[] l12 = bVar.l();
            int i15 = 0;
            do {
                l12[i15].a();
                i15++;
            } while (i15 < m11);
            return;
        }
        InterfaceC10395k interfaceC10395k3 = (InterfaceC10395k) C7714v.X(interfaceC10374A.g());
        if (((C9561d.a(interfaceC10395k3, interfaceC10374A.getOrientation()) + ((int) (interfaceC10374A.getOrientation() == EnumC9142v.Vertical ? interfaceC10395k3.a() & 4294967295L : interfaceC10395k3.a() >> 32))) + interfaceC10374A.e()) - interfaceC10374A.h() >= (-f7) || (m12 = bVar.m()) <= 0) {
            return;
        }
        o.b[] l13 = bVar.l();
        int i16 = 0;
        do {
            l13[i16].a();
            i16++;
        } while (i16 < m12);
    }

    public final void c(@NotNull C10377D c10377d) {
        int i11;
        if (this.f103249a == -1 || c10377d.g().isEmpty()) {
            return;
        }
        if (this.f103251c) {
            InterfaceC10395k interfaceC10395k = (InterfaceC10395k) C7714v.X(c10377d.g());
            i11 = (c10377d.getOrientation() == EnumC9142v.Vertical ? interfaceC10395k.i() : interfaceC10395k.e()) + 1;
        } else {
            InterfaceC10395k interfaceC10395k2 = (InterfaceC10395k) C7714v.K(c10377d.g());
            i11 = (c10377d.getOrientation() == EnumC9142v.Vertical ? interfaceC10395k2.i() : interfaceC10395k2.e()) - 1;
        }
        if (this.f103249a != i11) {
            this.f103249a = -1;
            U0.b<o.b> bVar = this.f103250b;
            int m11 = bVar.m();
            if (m11 > 0) {
                o.b[] l11 = bVar.l();
                int i12 = 0;
                do {
                    l11[i12].cancel();
                    i12++;
                } while (i12 < m11);
            }
            bVar.h();
        }
    }
}
