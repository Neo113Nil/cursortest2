package p5;

import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.s;
import We.C;
import We.C4864f;
import We.G;
import We.InterfaceC4865g;
import We.L;
import We.M;
import android.net.Uri;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n5.EnumC8444d;
import n5.q;
import o5.InterfaceC8643a;
import org.jetbrains.annotations.NotNull;
import p5.h;
import sf.AbstractC9688n;
import sf.D;
import sf.F;
import sf.z;
import u5.C9964c;
import u5.C9965d;
import v5.C10239m;

/* loaded from: classes8.dex */
public final class j implements h {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C4864f f80226f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C4864f f80227g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f80228a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80229b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC4865g.a> f80230c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC8643a> f80231d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f80232e;

    public static final class a implements h.a<Uri> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC4008j<InterfaceC4865g.a> f80233a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC4008j<InterfaceC8643a> f80234b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f80235c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull InterfaceC4008j<? extends InterfaceC4865g.a> interfaceC4008j, @NotNull InterfaceC4008j<? extends InterfaceC8643a> interfaceC4008j2, boolean z11) {
            this.f80233a = interfaceC4008j;
            this.f80234b = interfaceC4008j2;
            this.f80235c = z11;
        }

        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            Uri uri = (Uri) obj;
            if (Intrinsics.d(uri.getScheme(), "http") || Intrinsics.d(uri.getScheme(), "https")) {
                return new j(uri.toString(), c10239m, this.f80233a, this.f80234b, this.f80235c);
            }
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        j f80236d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8643a.c f80237e;

        /* renamed from: f, reason: collision with root package name */
        Object f80238f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80239g;

        /* renamed from: i, reason: collision with root package name */
        int f80241i;

        b(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f80239g = obj;
            this.f80241i |= LinearLayoutManager.INVALID_OFFSET;
            return j.this.a(this);
        }
    }

    static {
        C4864f.a aVar = new C4864f.a();
        aVar.d();
        aVar.e();
        f80226f = aVar.a();
        C4864f.a aVar2 = new C4864f.a();
        aVar2.d();
        aVar2.f();
        f80227g = aVar2.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull String str, @NotNull C10239m c10239m, @NotNull InterfaceC4008j<? extends InterfaceC4865g.a> interfaceC4008j, @NotNull InterfaceC4008j<? extends InterfaceC8643a> interfaceC4008j2, boolean z11) {
        this.f80228a = str;
        this.f80229b = c10239m;
        this.f80230c = interfaceC4008j;
        this.f80231d = interfaceC4008j2;
        this.f80232e = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(G g10, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        L execute;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f80244f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f80244f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f80242d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f80244f;
                if (i11 != 0) {
                    s.b(obj);
                    int i13 = A5.k.f430d;
                    boolean d11 = Intrinsics.d(Looper.myLooper(), Looper.getMainLooper());
                    InterfaceC4008j<InterfaceC4865g.a> interfaceC4008j = this.f80230c;
                    if (d11) {
                        if (this.f80229b.j().a()) {
                            throw new NetworkOnMainThreadException();
                        }
                        execute = interfaceC4008j.getValue().a(g10).execute();
                        if (!execute.v() || execute.m() == 304) {
                            return execute;
                        }
                        M c11 = execute.c();
                        if (c11 != null) {
                            A5.k.a(c11);
                        }
                        throw new u5.e("HTTP " + execute.m() + ": " + execute.w());
                    }
                    InterfaceC4865g a11 = interfaceC4008j.getValue().a(g10);
                    kVar.f80244f = 1;
                    obj = A5.b.a(a11, kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                execute = (L) obj;
                if (execute.v()) {
                }
                return execute;
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f80242d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f80244f;
        if (i11 != 0) {
        }
        execute = (L) obj2;
        if (execute.v()) {
        }
        return execute;
    }

    private final AbstractC9688n d() {
        InterfaceC8643a value = this.f80231d.getValue();
        Intrinsics.f(value);
        return value.c();
    }

    public static String e(@NotNull String str, C c11) {
        String c12;
        String c13 = c11 != null ? c11.toString() : null;
        if ((c13 == null || kotlin.text.h.e0(c13, "text/plain", false)) && (c12 = A5.k.c(MimeTypeMap.getSingleton(), str)) != null) {
            return c12;
        }
        if (c13 != null) {
            return kotlin.text.h.l0(c13, ';');
        }
        return null;
    }

    private final G f() {
        G.a aVar = new G.a();
        aVar.k(this.f80228a);
        C10239m c10239m = this.f80229b;
        aVar.e(c10239m.i());
        for (Map.Entry<Class<?>, Object> entry : c10239m.o().a().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.g(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVar.i(key, entry.getValue());
        }
        boolean a11 = c10239m.h().a();
        boolean a12 = c10239m.j().a();
        if (!a12 && a11) {
            aVar.c(C4864f.f33718o);
        } else if (!a12 || a11) {
            if (!a12 && !a11) {
                aVar.c(f80227g);
            }
        } else if (c10239m.h().b()) {
            aVar.c(C4864f.f33717n);
        } else {
            aVar.c(f80226f);
        }
        return aVar.b();
    }

    private final C9964c g(InterfaceC8643a.c cVar) {
        Throwable th2;
        C9964c c9964c;
        try {
            sf.G d11 = z.d(d().k(cVar.getMetadata()));
            try {
                c9964c = new C9964c(d11);
                try {
                    d11.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    d11.close();
                } catch (Throwable th5) {
                    C4001c.a(th4, th5);
                }
                th2 = th4;
                c9964c = null;
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.f(c9964c);
            return c9964c;
        } catch (IOException unused) {
            return null;
        }
    }

    private final n5.m h(InterfaceC8643a.c cVar) {
        D data = cVar.getData();
        AbstractC9688n d11 = d();
        String g10 = this.f80229b.g();
        if (g10 == null) {
            g10 = this.f80228a;
        }
        return new n5.m(data, d11, g10, cVar);
    }

    private final InterfaceC8643a.c i(InterfaceC8643a.c cVar, G g10, L l11, C9964c c9964c) {
        InterfaceC8643a.b bVar;
        Throwable th2;
        Unit unit;
        Long l12;
        Unit unit2;
        C10239m c10239m = this.f80229b;
        Throwable th3 = null;
        if (c10239m.h().b() && (!this.f80232e || (!g10.b().h() && !l11.d().h() && !Intrinsics.d(l11.r().c("Vary"), "*")))) {
            if (cVar != null) {
                bVar = cVar.K1();
            } else {
                InterfaceC8643a value = this.f80231d.getValue();
                if (value != null) {
                    String g11 = c10239m.g();
                    if (g11 == null) {
                        g11 = this.f80228a;
                    }
                    bVar = value.a(g11);
                } else {
                    bVar = null;
                }
            }
            try {
                if (bVar != null) {
                    try {
                        if (l11.m() != 304 || c9964c == null) {
                            F c11 = z.c(d().j(bVar.getMetadata()));
                            try {
                                new C9964c(l11).g(c11);
                                unit = Unit.f71690a;
                                try {
                                    c11.close();
                                    th2 = null;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                }
                            } catch (Throwable th5) {
                                try {
                                    c11.close();
                                } catch (Throwable th6) {
                                    C4001c.a(th5, th6);
                                }
                                th2 = th5;
                                unit = null;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            Intrinsics.f(unit);
                            F c12 = z.c(d().j(bVar.getData()));
                            try {
                                M c13 = l11.c();
                                Intrinsics.f(c13);
                                l12 = Long.valueOf(c13.source().o1(c12));
                                try {
                                    c12.close();
                                } catch (Throwable th7) {
                                    th3 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    c12.close();
                                } catch (Throwable th9) {
                                    C4001c.a(th8, th9);
                                }
                                th3 = th8;
                                l12 = null;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                            Intrinsics.f(l12);
                        } else {
                            L.a aVar = new L.a(l11);
                            aVar.j(C9965d.a.a(c9964c.d(), l11.r()));
                            L c14 = aVar.c();
                            F c15 = z.c(d().j(bVar.getMetadata()));
                            try {
                                new C9964c(c14).g(c15);
                                unit2 = Unit.f71690a;
                                try {
                                    c15.close();
                                } catch (Throwable th10) {
                                    th3 = th10;
                                }
                            } catch (Throwable th11) {
                                try {
                                    c15.close();
                                } catch (Throwable th12) {
                                    C4001c.a(th11, th12);
                                }
                                th3 = th11;
                                unit2 = null;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                            Intrinsics.f(unit2);
                        }
                        InterfaceC8643a.c b11 = bVar.b();
                        A5.k.a(l11);
                        return b11;
                    } catch (Exception e11) {
                        int i11 = A5.k.f430d;
                        try {
                            bVar.a();
                        } catch (Exception unused) {
                        }
                        throw e11;
                    }
                }
            } catch (Throwable th13) {
                A5.k.a(l11);
                throw th13;
            }
        } else if (cVar != null) {
            A5.k.a(cVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01ba A[Catch: Exception -> 0x0159, TryCatch #3 {Exception -> 0x0159, blocks: (B:15:0x01b2, B:17:0x01ba, B:19:0x01dd, B:20:0x01e2, B:23:0x01e0, B:24:0x01e6, B:25:0x01eb, B:41:0x0138, B:44:0x0148, B:46:0x0154, B:47:0x015e, B:49:0x0168, B:51:0x0170, B:53:0x018e, B:54:0x0193, B:56:0x0191, B:57:0x0197), top: B:40:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e6 A[Catch: Exception -> 0x0159, TryCatch #3 {Exception -> 0x0159, blocks: (B:15:0x01b2, B:17:0x01ba, B:19:0x01dd, B:20:0x01e2, B:23:0x01e0, B:24:0x01e6, B:25:0x01eb, B:41:0x0138, B:44:0x0148, B:46:0x0154, B:47:0x015e, B:49:0x0168, B:51:0x0170, B:53:0x018e, B:54:0x0193, B:56:0x0191, B:57:0x0197), top: B:40:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f3 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:28:0x01ec, B:29:0x01ef, B:36:0x012e, B:38:0x01f3, B:39:0x01f8), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // p5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        b bVar;
        ?? r22;
        InterfaceC8643a.c cVar;
        InterfaceC8643a.c cVar2;
        C9965d a11;
        InterfaceC8643a.c cVar3;
        C9965d c9965d;
        j jVar;
        InterfaceC8643a value;
        M c11;
        L l11;
        Exception e11;
        j jVar2;
        M c12;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i11 = bVar.f80241i;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f80241i = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f80239g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    r22 = bVar.f80241i;
                    if (r22 != 0) {
                        s.b(obj);
                        C10239m c10239m = this.f80229b;
                        boolean a12 = c10239m.h().a();
                        String str = this.f80228a;
                        if (!a12 || (value = this.f80231d.getValue()) == null) {
                            cVar2 = null;
                        } else {
                            String g10 = c10239m.g();
                            if (g10 == null) {
                                g10 = str;
                            }
                            cVar2 = value.b(g10);
                        }
                        try {
                            if (cVar2 != null) {
                                Long c13 = d().g(cVar2.getMetadata()).c();
                                if (c13 != null && c13.longValue() == 0) {
                                    return new m(h(cVar2), e(str, null), EnumC8444d.DISK);
                                }
                                if (!this.f80232e) {
                                    n5.m h11 = h(cVar2);
                                    C9964c g11 = g(cVar2);
                                    return new m(h11, e(str, g11 != null ? g11.b() : null), EnumC8444d.DISK);
                                }
                                a11 = new C9965d.b(f(), g(cVar2)).a();
                                if (a11.b() == null && a11.a() != null) {
                                    return new m(h(cVar2), e(str, a11.a().b()), EnumC8444d.DISK);
                                }
                            } else {
                                a11 = new C9965d.b(f(), null).a();
                            }
                            G b11 = a11.b();
                            Intrinsics.f(b11);
                            bVar.f80236d = this;
                            bVar.f80237e = cVar2;
                            bVar.f80238f = a11;
                            bVar.f80241i = 1;
                            Object c14 = c(b11, bVar);
                            if (c14 != aVar) {
                                C9965d c9965d2 = a11;
                                cVar3 = cVar2;
                                obj = c14;
                                c9965d = c9965d2;
                                jVar = this;
                            }
                            return aVar;
                        } catch (Exception e12) {
                            cVar = cVar2;
                            e = e12;
                            if (cVar != null) {
                                A5.k.a(cVar);
                            }
                            throw e;
                        }
                    }
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l11 = (L) bVar.f80238f;
                        InterfaceC8643a.c cVar4 = bVar.f80237e;
                        jVar2 = bVar.f80236d;
                        try {
                            s.b(obj);
                            L l12 = (L) obj;
                            int i12 = A5.k.f430d;
                            c12 = l12.c();
                            if (c12 != null) {
                                throw new IllegalStateException("response body == null");
                            }
                            jVar2.getClass();
                            return new m(q.a(c12.source(), jVar2.f80229b.f()), e(jVar2.f80228a, c12.contentType()), l12.x() != null ? EnumC8444d.NETWORK : EnumC8444d.DISK);
                        } catch (Exception e13) {
                            e11 = e13;
                            A5.k.a(l11);
                            throw e11;
                        }
                    }
                    C9965d c9965d3 = (C9965d) bVar.f80238f;
                    cVar = bVar.f80237e;
                    jVar = bVar.f80236d;
                    try {
                        s.b(obj);
                        c9965d = c9965d3;
                        cVar3 = cVar;
                    } catch (Exception e14) {
                        e = e14;
                        if (cVar != null) {
                        }
                        throw e;
                    }
                    L l13 = (L) obj;
                    int i13 = A5.k.f430d;
                    c11 = l13.c();
                    if (c11 != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        InterfaceC8643a.c i14 = jVar.i(cVar3, c9965d.b(), l13, c9965d.a());
                        String str2 = jVar.f80228a;
                        if (i14 != null) {
                            n5.m h12 = jVar.h(i14);
                            C9964c g12 = jVar.g(i14);
                            return new m(h12, e(str2, g12 != null ? g12.b() : null), EnumC8444d.NETWORK);
                        }
                        if (c11.contentLength() > 0) {
                            return new m(q.a(c11.source(), jVar.f80229b.f()), e(str2, c11.contentType()), l13.x() != null ? EnumC8444d.NETWORK : EnumC8444d.DISK);
                        }
                        A5.k.a(l13);
                        G f7 = jVar.f();
                        bVar.f80236d = jVar;
                        bVar.f80237e = i14;
                        bVar.f80238f = l13;
                        bVar.f80241i = 2;
                        Object c15 = jVar.c(f7, bVar);
                        if (c15 != aVar) {
                            l11 = l13;
                            obj = c15;
                            jVar2 = jVar;
                            L l122 = (L) obj;
                            int i122 = A5.k.f430d;
                            c12 = l122.c();
                            if (c12 != null) {
                            }
                        }
                        return aVar;
                    } catch (Exception e15) {
                        l11 = l13;
                        e11 = e15;
                        A5.k.a(l11);
                        throw e11;
                    }
                }
            }
            if (r22 != 0) {
            }
            L l132 = (L) obj;
            int i132 = A5.k.f430d;
            c11 = l132.c();
            if (c11 != null) {
            }
        } catch (Exception e16) {
            e = e16;
            cVar = r22;
        }
        bVar = new b((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = bVar.f80239g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        r22 = bVar.f80241i;
    }
}
