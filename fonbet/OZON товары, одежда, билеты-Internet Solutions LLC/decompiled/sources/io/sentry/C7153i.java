package io.sentry;

import io.sentry.C7209u1;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7191g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7153i implements U {

    /* renamed from: a, reason: collision with root package name */
    private final C7209u1 f67974a;

    /* renamed from: b, reason: collision with root package name */
    private final U f67975b;

    /* renamed from: c, reason: collision with root package name */
    private final U f67976c;

    /* renamed from: io.sentry.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67977a;

        static {
            int[] iArr = new int[EnumC7225y1.values().length];
            f67977a = iArr;
            try {
                iArr[EnumC7225y1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67977a[EnumC7225y1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67977a[EnumC7225y1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67977a[EnumC7225y1.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C7153i(@NotNull U u11, @NotNull U u12, @NotNull C7209u1 c7209u1) {
        this.f67974a = c7209u1;
        this.f67975b = u11;
        this.f67976c = u12;
    }

    @Override // io.sentry.U
    @NotNull
    public final Y A() {
        Y A11 = this.f67976c.A();
        if (!(A11 instanceof R0)) {
            return A11;
        }
        Y A12 = this.f67975b.A();
        return !(A12 instanceof R0) ? A12 : this.f67974a.A();
    }

    @Override // io.sentry.U
    @NotNull
    public final List<InterfaceC7227z> B() {
        return com.google.common.primitives.f.b((CopyOnWriteArrayList) E());
    }

    @Override // io.sentry.U
    public final void C(@NotNull C7175n1 c7175n1) {
        e(null).C(c7175n1);
    }

    @Override // io.sentry.U
    public final void D(@NotNull W2 w22) {
        this.f67974a.D(w22);
    }

    @Override // io.sentry.U
    @NotNull
    public final List<io.sentry.internal.eventprocessor.a> E() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f67974a.E());
        copyOnWriteArrayList.addAll(this.f67975b.E());
        copyOnWriteArrayList.addAll(this.f67976c.E());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.U
    @NotNull
    public final List<String> F() {
        List<String> F11 = this.f67976c.F();
        if (!F11.isEmpty()) {
            return F11;
        }
        List<String> F12 = this.f67975b.F();
        return !F12.isEmpty() ? F12 : this.f67974a.F();
    }

    @Override // io.sentry.U
    public final String G() {
        String G11 = this.f67976c.G();
        if (G11 != null) {
            return G11;
        }
        String G12 = this.f67975b.G();
        return G12 != null ? G12 : this.f67974a.G();
    }

    @Override // io.sentry.U
    @NotNull
    public final C7175n1 H() {
        return e(null).H();
    }

    @Override // io.sentry.U
    public final void I(@NotNull C7125b c7125b) {
        e(null).I(c7125b);
    }

    @Override // io.sentry.U
    @NotNull
    public final List<C7125b> J() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f67974a.J());
        copyOnWriteArrayList.addAll(this.f67975b.J());
        copyOnWriteArrayList.addAll(this.f67976c.J());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.U
    @NotNull
    public final C7175n1 K(C7209u1.a aVar) {
        return e(null).K(aVar);
    }

    @Override // io.sentry.U
    public final void L(C7209u1.c cVar) {
        e(null).L(cVar);
    }

    @Override // io.sentry.U
    public final void M(@NotNull io.sentry.protocol.t tVar) {
        this.f67974a.getClass();
        this.f67975b.M(tVar);
        this.f67976c.M(tVar);
    }

    @Override // io.sentry.U
    public final String a() {
        String a11 = this.f67976c.a();
        if (a11 != null) {
            return a11;
        }
        String a12 = this.f67975b.a();
        return a12 != null ? a12 : this.f67974a.a();
    }

    public final void b(@NotNull C7230z2 c7230z2) {
        this.f67974a.b(c7230z2);
    }

    @Override // io.sentry.U
    public final void c(String str, String str2) {
        e(null).c(str, str2);
    }

    @Override // io.sentry.U
    public final void clear() {
        e(null).clear();
    }

    @Override // io.sentry.U
    public final void d(io.sentry.protocol.E e11) {
        e(null).d(e11);
    }

    final U e(EnumC7225y1 enumC7225y1) {
        C7209u1 c7209u1 = this.f67974a;
        if (enumC7225y1 != null) {
            int i11 = a.f67977a[enumC7225y1.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return c7209u1;
                    }
                    if (i11 == 4) {
                        return this;
                    }
                }
                return this.f67975b;
            }
            return this.f67976c;
        }
        int i12 = a.f67977a[c7209u1.getOptions().getDefaultScopeType().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return c7209u1;
                }
            }
            return this.f67975b;
        }
        return this.f67976c;
    }

    @Override // io.sentry.U
    public final void f(@NotNull C7141f c7141f) {
        e(null).f(c7141f);
    }

    @Override // io.sentry.U
    public final void g(@NotNull C7141f c7141f, E e11) {
        e(null).g(c7141f, e11);
    }

    @Override // io.sentry.U
    @NotNull
    public final Map<String, Object> getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f67974a.getExtras());
        concurrentHashMap.putAll(this.f67975b.getExtras());
        concurrentHashMap.putAll(this.f67976c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.U
    public final C7191g getFeatureFlags() {
        return w().getFeatureFlags();
    }

    @Override // io.sentry.U
    public final I2 getLevel() {
        I2 level = this.f67976c.getLevel();
        if (level != null) {
            return level;
        }
        I2 level2 = this.f67975b.getLevel();
        return level2 != null ? level2 : this.f67974a.getLevel();
    }

    @Override // io.sentry.U
    @NotNull
    public final W2 getOptions() {
        return this.f67974a.getOptions();
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.o getRequest() {
        io.sentry.protocol.o request = this.f67976c.getRequest();
        if (request != null) {
            return request;
        }
        io.sentry.protocol.o request2 = this.f67975b.getRequest();
        return request2 != null ? request2 : this.f67974a.getRequest();
    }

    @Override // io.sentry.U
    @NotNull
    public final Map<String, String> getTags() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f67974a.getTags());
        concurrentHashMap.putAll(this.f67975b.getTags());
        concurrentHashMap.putAll(this.f67976c.getTags());
        return concurrentHashMap;
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.E getUser() {
        io.sentry.protocol.E user = this.f67976c.getUser();
        if (user != null) {
            return user;
        }
        io.sentry.protocol.E user2 = this.f67975b.getUser();
        return user2 != null ? user2 : this.f67974a.getUser();
    }

    @Override // io.sentry.U
    public final InterfaceC7142f0 i() {
        InterfaceC7142f0 i11 = this.f67976c.i();
        if (i11 != null) {
            return i11;
        }
        InterfaceC7142f0 i12 = this.f67975b.i();
        return i12 != null ? i12 : this.f67974a.i();
    }

    @Override // io.sentry.U
    public final void j(io.sentry.protocol.o oVar) {
        e(null).j(oVar);
    }

    @Override // io.sentry.U
    public final void k(I2 i22) {
        e(null).k(i22);
    }

    @Override // io.sentry.U
    public final C7209u1.d l() {
        return e(null).l();
    }

    @Override // io.sentry.U
    public final InterfaceC7134d0 m() {
        InterfaceC7134d0 m11 = this.f67976c.m();
        if (m11 != null) {
            return m11;
        }
        InterfaceC7134d0 m12 = this.f67975b.m();
        return m12 != null ? m12 : this.f67974a.m();
    }

    @Override // io.sentry.U
    public final h3 n() {
        return e(null).n();
    }

    @Override // io.sentry.U
    public final void o(@NotNull io.sentry.protocol.t tVar) {
        e(null).o(tVar);
    }

    @Override // io.sentry.U
    public final void p(@NotNull String str) {
        e(null).p(str);
    }

    @Override // io.sentry.U
    @NotNull
    public final Queue<C7141f> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f67974a.q());
        arrayList.addAll(this.f67975b.q());
        U u11 = this.f67976c;
        arrayList.addAll(u11.q());
        Collections.sort(arrayList);
        Queue<C7141f> h11 = C7209u1.h(u11.getOptions().getMaxBreadcrumbs());
        h11.addAll(arrayList);
        return h11;
    }

    @Override // io.sentry.U
    public final h3 r(C7209u1.b bVar) {
        return e(null).r(bVar);
    }

    @Override // io.sentry.U
    @NotNull
    public final C7187c s() {
        C7209u1 c7209u1 = this.f67974a;
        return new C7149h(c7209u1.s(), this.f67975b.s(), this.f67976c.s(), c7209u1.getOptions().getDefaultScopeType());
    }

    @Override // io.sentry.U
    public final void setTag(String str, String str2) {
        e(null).setTag(str, str2);
    }

    @Override // io.sentry.U
    public final void t(InterfaceC7142f0 interfaceC7142f0) {
        e(null).t(interfaceC7142f0);
    }

    @Override // io.sentry.U
    public final void u(@NotNull ArrayList arrayList) {
        e(null).u(arrayList);
    }

    @Override // io.sentry.U
    public final void v() {
        e(null).v();
    }

    @Override // io.sentry.U
    @NotNull
    public final io.sentry.featureflags.b w() {
        C7209u1 c7209u1 = this.f67974a;
        return io.sentry.featureflags.a.b(c7209u1.getOptions(), c7209u1.w(), this.f67975b.w(), this.f67976c.w());
    }

    @Override // io.sentry.U
    public final h3 x() {
        h3 x11 = this.f67976c.x();
        if (x11 != null) {
            return x11;
        }
        h3 x12 = this.f67975b.x();
        return x12 != null ? x12 : this.f67974a.x();
    }

    @Override // io.sentry.U
    @NotNull
    public final io.sentry.protocol.t y() {
        io.sentry.protocol.t y11 = this.f67976c.y();
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        if (!tVar.equals(y11)) {
            return y11;
        }
        io.sentry.protocol.t y12 = this.f67975b.y();
        return !tVar.equals(y12) ? y12 : this.f67974a.y();
    }

    @Override // io.sentry.U
    public final void z(String str) {
        e(null).z(str);
    }

    @Override // io.sentry.U
    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final U m65clone() {
        return new C7153i(this.f67975b.m65clone(), this.f67976c.m65clone(), this.f67974a);
    }
}
