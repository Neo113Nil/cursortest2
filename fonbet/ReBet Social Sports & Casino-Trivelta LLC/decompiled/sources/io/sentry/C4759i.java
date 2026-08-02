package io.sentry;

import io.sentry.L1;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4806h;
import io.sentry.util.AbstractC4848f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4759i implements InterfaceC4730c0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4730c0 f52098a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4730c0 f52099b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4730c0 f52100c;

    /* renamed from: io.sentry.i$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$ScopeType;

        static {
            int[] iArr = new int[P1.values().length];
            $SwitchMap$io$sentry$ScopeType = iArr;
            try {
                iArr[P1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[P1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[P1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[P1.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C4759i(InterfaceC4730c0 interfaceC4730c0, InterfaceC4730c0 interfaceC4730c02, InterfaceC4730c0 interfaceC4730c03) {
        this.f52098a = interfaceC4730c0;
        this.f52099b = interfaceC4730c02;
        this.f52100c = interfaceC4730c03;
    }

    @Override // io.sentry.InterfaceC4730c0
    public List A() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f52098a.A());
        copyOnWriteArrayList.addAll(this.f52099b.A());
        copyOnWriteArrayList.addAll(this.f52100c.A());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.InterfaceC4730c0
    public C4802d B() {
        return new C4754h(this.f52098a.B(), this.f52099b.B(), this.f52100c.B(), i().getDefaultScopeType());
    }

    @Override // io.sentry.InterfaceC4730c0
    public void C(String str, Object obj) {
        m().C(str, obj);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void D(InterfaceC4790o0 interfaceC4790o0) {
        m().D(interfaceC4790o0);
    }

    @Override // io.sentry.InterfaceC4730c0
    public List E() {
        List E10 = this.f52100c.E();
        if (!E10.isEmpty()) {
            return E10;
        }
        List E11 = this.f52099b.E();
        return !E11.isEmpty() ? E11 : this.f52098a.E();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void F(String str, Object obj) {
        m().F(str, obj);
    }

    @Override // io.sentry.InterfaceC4730c0
    public String G() {
        String G10 = this.f52100c.G();
        if (G10 != null) {
            return G10;
        }
        String G11 = this.f52099b.G();
        return G11 != null ? G11 : this.f52098a.G();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void H() {
        m().H();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void I(String str) {
        m().I(str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.featureflags.b J() {
        return io.sentry.featureflags.a.c(i(), this.f52098a.J(), this.f52099b.J(), this.f52100c.J());
    }

    @Override // io.sentry.InterfaceC4730c0
    public void K(InterfaceC4755h0 interfaceC4755h0) {
        m().K(interfaceC4755h0);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void L(String str) {
        m().L(str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 M() {
        V3 M10 = this.f52100c.M();
        if (M10 != null) {
            return M10;
        }
        V3 M11 = this.f52099b.M();
        return M11 != null ? M11 : this.f52098a.M();
    }

    @Override // io.sentry.InterfaceC4730c0
    public EnumC4788n3 N() {
        EnumC4788n3 N10 = this.f52100c.N();
        if (N10 != null) {
            return N10;
        }
        EnumC4788n3 N11 = this.f52099b.N();
        return N11 != null ? N11 : this.f52098a.N();
    }

    @Override // io.sentry.InterfaceC4730c0
    public E1 O() {
        return m().O();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void P(String str) {
        m().P(str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4755h0 Q() {
        InterfaceC4755h0 Q10 = this.f52100c.Q();
        if (!(Q10 instanceof C4741e1)) {
            return Q10;
        }
        InterfaceC4755h0 Q11 = this.f52099b.Q();
        return !(Q11 instanceof C4741e1) ? Q11 : this.f52098a.Q();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void R(C4792o2 c4792o2) {
        m().R(c4792o2);
    }

    @Override // io.sentry.InterfaceC4730c0
    public List S() {
        List S10 = this.f52098a.S();
        List S11 = this.f52099b.S();
        List S12 = this.f52100c.S();
        boolean isEmpty = S10.isEmpty();
        boolean isEmpty2 = S11.isEmpty();
        boolean isEmpty3 = S12.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty3) {
            return (List) a(S10, S11, S12);
        }
        if (isEmpty2 && isEmpty3) {
            return S10;
        }
        if (isEmpty && isEmpty3) {
            return S11;
        }
        if (isEmpty && isEmpty2) {
            return S12;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(S10);
        copyOnWriteArrayList.addAll(S11);
        copyOnWriteArrayList.addAll(S12);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void T(C4733c3 c4733c3) {
        this.f52098a.T(c4733c3);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void U() {
        m().U();
    }

    @Override // io.sentry.InterfaceC4730c0
    public E1 V(L1.a aVar) {
        return m().V(aVar);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void W(L1.c cVar) {
        m().W(cVar);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void X(io.sentry.protocol.u uVar) {
        this.f52098a.X(uVar);
        this.f52099b.X(uVar);
        this.f52100c.X(uVar);
    }

    @Override // io.sentry.InterfaceC4730c0
    public List Y() {
        return AbstractC4848f.a(A());
    }

    @Override // io.sentry.InterfaceC4730c0
    public void Z(E1 e12) {
        m().Z(e12);
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        int i10 = a.$SwitchMap$io$sentry$ScopeType[i().getDefaultScopeType().ordinal()];
        return i10 != 2 ? i10 != 3 ? obj3 : obj : obj2;
    }

    @Override // io.sentry.InterfaceC4730c0
    public String b() {
        String b10 = this.f52100c.b();
        if (b10 != null) {
            return b10;
        }
        String b11 = this.f52099b.b();
        return b11 != null ? b11 : this.f52098a.b();
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.p c() {
        io.sentry.protocol.p c10 = this.f52100c.c();
        if (c10 != null) {
            return c10;
        }
        io.sentry.protocol.p c11 = this.f52099b.c();
        return c11 != null ? c11 : this.f52098a.c();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void clear() {
        m().clear();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void d(C4744f c4744f) {
        m().d(c4744f);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void e(String str, String str2) {
        m().e(str, str2);
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 endSession() {
        return m().endSession();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void f(String str, String str2) {
        m().f(str, str2);
    }

    @Override // io.sentry.InterfaceC4730c0
    public void g(C4744f c4744f, J j10) {
        m().g(c4744f, j10);
    }

    @Override // io.sentry.InterfaceC4730c0
    public Map getExtras() {
        Map extras = this.f52098a.getExtras();
        Map extras2 = this.f52099b.getExtras();
        Map extras3 = this.f52100c.getExtras();
        boolean isEmpty = extras.isEmpty();
        boolean isEmpty2 = extras2.isEmpty();
        boolean isEmpty3 = extras3.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty3) {
            return (Map) a(extras, extras2, extras3);
        }
        if (isEmpty2 && isEmpty3) {
            return extras;
        }
        if (isEmpty && isEmpty3) {
            return extras2;
        }
        if (isEmpty && isEmpty2) {
            return extras3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(extras);
        concurrentHashMap.putAll(extras2);
        concurrentHashMap.putAll(extras3);
        return concurrentHashMap;
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.F getUser() {
        io.sentry.protocol.F user = this.f52100c.getUser();
        if (user != null) {
            return user;
        }
        io.sentry.protocol.F user2 = this.f52099b.getUser();
        return user2 != null ? user2 : this.f52098a.getUser();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
        this.f52098a.h(th2, interfaceC4780m0, str);
    }

    @Override // io.sentry.InterfaceC4730c0
    public F3 i() {
        return this.f52098a.i();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void j(io.sentry.protocol.F f10) {
        m().j(f10);
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4790o0 k() {
        InterfaceC4790o0 k10 = this.f52100c.k();
        if (k10 != null) {
            return k10;
        }
        InterfaceC4790o0 k11 = this.f52099b.k();
        return k11 != null ? k11 : this.f52098a.k();
    }

    @Override // io.sentry.InterfaceC4730c0
    public C4806h l() {
        return J().l();
    }

    public final InterfaceC4730c0 m() {
        return n(null);
    }

    public InterfaceC4730c0 n(P1 p12) {
        if (p12 != null) {
            int i10 = a.$SwitchMap$io$sentry$ScopeType[p12.ordinal()];
            if (i10 == 1) {
                return this.f52100c;
            }
            if (i10 == 2) {
                return this.f52099b;
            }
            if (i10 == 3) {
                return this.f52098a;
            }
            if (i10 == 4) {
                return this;
            }
        }
        int i11 = a.$SwitchMap$io$sentry$ScopeType[i().getDefaultScopeType().ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? this.f52100c : this.f52098a : this.f52099b : this.f52100c;
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.u r() {
        io.sentry.protocol.u r10 = this.f52100c.r();
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        if (!uVar.equals(r10)) {
            return r10;
        }
        io.sentry.protocol.u r11 = this.f52099b.r();
        return !uVar.equals(r11) ? r11 : this.f52098a.r();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void s(io.sentry.protocol.u uVar) {
        m().s(uVar);
    }

    @Override // io.sentry.InterfaceC4730c0
    public L1.d t() {
        return m().t();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void u(F3 f32) {
        this.f52098a.u(f32);
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4780m0 v() {
        InterfaceC4780m0 v10 = this.f52100c.v();
        if (v10 != null) {
            return v10;
        }
        InterfaceC4780m0 v11 = this.f52099b.v();
        return v11 != null ? v11 : this.f52098a.v();
    }

    @Override // io.sentry.InterfaceC4730c0
    public Queue w() {
        Queue w10 = this.f52098a.w();
        Queue w11 = this.f52099b.w();
        Queue w12 = this.f52100c.w();
        boolean isEmpty = w10.isEmpty();
        boolean isEmpty2 = w11.isEmpty();
        boolean isEmpty3 = w12.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty3) {
            return (Queue) a(w10, w11, w12);
        }
        if (isEmpty2 && isEmpty3) {
            return w10;
        }
        if (isEmpty && isEmpty3) {
            return w11;
        }
        if (isEmpty && isEmpty2) {
            return w12;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(w10);
        arrayList.addAll(w11);
        arrayList.addAll(w12);
        Collections.sort(arrayList);
        Queue n10 = L1.n(this.f52100c.i().getMaxBreadcrumbs());
        n10.addAll(arrayList);
        return n10;
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 x(L1.b bVar) {
        return m().x(bVar);
    }

    @Override // io.sentry.InterfaceC4730c0
    public Map y() {
        Map y10 = this.f52098a.y();
        Map y11 = this.f52099b.y();
        Map y12 = this.f52100c.y();
        boolean isEmpty = y10.isEmpty();
        boolean isEmpty2 = y11.isEmpty();
        boolean isEmpty3 = y12.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty3) {
            return (Map) a(y10, y11, y12);
        }
        if (isEmpty2 && isEmpty3) {
            return y10;
        }
        if (isEmpty && isEmpty3) {
            return y11;
        }
        if (isEmpty && isEmpty2) {
            return y12;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(y10);
        concurrentHashMap.putAll(y11);
        concurrentHashMap.putAll(y12);
        return concurrentHashMap;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void z() {
        m().z();
    }

    @Override // io.sentry.InterfaceC4730c0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC4730c0 m142clone() {
        return new C4759i(this.f52098a, this.f52099b.m125clone(), this.f52100c.m125clone());
    }
}
