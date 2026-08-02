package cg0;

import Cf0.J;
import Cf0.Q;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.E;
import We.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.EnumC8923f;
import pf0.m;

/* renamed from: cg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5829a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E.a f57171a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f57172b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57173c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57174d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57175e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57176f;

    /* renamed from: cg0.a$a, reason: collision with other inner class name */
    static final class C0867a extends AbstractC7737t implements Function0<Integer> {
        C0867a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(C5829a.a(C5829a.this));
        }
    }

    /* renamed from: cg0.a$b */
    static final class b extends AbstractC7737t implements Function0<q20.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f57178b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final q20.c invoke() {
            J j11 = m.f80514a;
            if (j11 != null) {
                return j11.f().c();
            }
            throw new RuntimeException("NetworkDi must be initialized.");
        }
    }

    /* renamed from: cg0.a$c */
    static final class c extends AbstractC7737t implements Function0<Integer> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(C5829a.this.f().size());
        }
    }

    /* renamed from: cg0.a$d */
    static final class d extends AbstractC7737t implements Function0<List<? extends Pair<? extends String, ? extends EnumC8923f>>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Pair<? extends String, ? extends EnumC8923f>> invoke() {
            C5829a c5829a = C5829a.this;
            ArrayList p02 = C7714v.p0(c5829a.f57171a.T(), c5829a.f57171a.S());
            ArrayList arrayList = new ArrayList();
            Iterator it = p02.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Q) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Q) it2.next()).a());
            }
            return arrayList2;
        }
    }

    public C5829a(@NotNull E.a okHttpBuilder, boolean z11) {
        Intrinsics.checkNotNullParameter(okHttpBuilder, "okHttpBuilder");
        this.f57171a = okHttpBuilder;
        this.f57172b = z11;
        this.f57173c = k.b(new d());
        this.f57174d = k.b(new c());
        this.f57175e = k.b(new C0867a());
        this.f57176f = k.b(b.f57178b);
    }

    public static final /* synthetic */ int a(C5829a c5829a) {
        return c5829a.e("brotli");
    }

    private final void d(String str) {
        if (e(str) >= ((Number) this.f57175e.getValue()).intValue()) {
            throw new Oi.a();
        }
    }

    private final int e(String str) {
        Iterator<Pair<String, EnumC8923f>> it = f().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (Intrinsics.d(it.next().e(), str)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<String, EnumC8923f>> f() {
        return (List) this.f57173c.getValue();
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (((q20.c) this.f57176f.getValue()) == q20.c.PROD_BUILDS_ALL_USERS) {
            return chain.proceed(chain.request());
        }
        List<Pair<String, EnumC8923f>> f7 = f();
        int i14 = 0;
        if ((f7 instanceof Collection) && f7.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it = f7.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (((Pair) it.next()).f() == EnumC8923f.PerformanceAppInterceptor && (i11 = i11 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        int e11 = e("mockServer");
        if (e11 != -1 && e11 - i11 != 0) {
            throw new Oi.a();
        }
        d("initAuth");
        d("autologinInterceptor");
        d("antibotInterceptor");
        List<Pair<String, EnumC8923f>> f11 = f();
        if ((f11 instanceof Collection) && f11.isEmpty()) {
            i12 = 0;
        } else {
            Iterator<T> it2 = f11.iterator();
            i12 = 0;
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                if (pair.f() == EnumC8923f.PerformanceNetworkInterceptor || pair.f() == EnumC8923f.OzonIdNetworkInterceptor) {
                    i12++;
                    if (i12 < 0) {
                        C7714v.N0();
                        throw null;
                    }
                }
            }
        }
        int e12 = e("extraHeaders");
        InterfaceC4008j interfaceC4008j = this.f57174d;
        int intValue = ((Number) interfaceC4008j.getValue()).intValue();
        boolean z11 = this.f57172b;
        if (e12 != intValue - (z11 ? i12 + 3 : i12 + 2)) {
            throw new Oi.a();
        }
        List<Pair<String, EnumC8923f>> f12 = f();
        if ((f12 instanceof Collection) && f12.isEmpty()) {
            i13 = 0;
        } else {
            Iterator<T> it3 = f12.iterator();
            i13 = 0;
            while (it3.hasNext()) {
                if (((Pair) it3.next()).f() == EnumC8923f.PerformanceNetworkInterceptor && (i13 = i13 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        if (e("antibotNetworkInterceptor") != ((Number) interfaceC4008j.getValue()).intValue() - (z11 ? i13 + 3 : i13 + 2)) {
            throw new Oi.a();
        }
        int e13 = e("requestPrepareTime");
        List<Pair<String, EnumC8923f>> f13 = f();
        if (!(f13 instanceof Collection) || !f13.isEmpty()) {
            Iterator<T> it4 = f13.iterator();
            while (it4.hasNext()) {
                if (((Pair) it4.next()).f() == EnumC8923f.PerformanceNetworkInterceptor && (i14 = i14 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        if (e13 != ((Number) interfaceC4008j.getValue()).intValue() - (z11 ? i14 + 2 : i14 - (-1))) {
            throw new Oi.a();
        }
        if (!z11 || e("cronet") == ((Number) interfaceC4008j.getValue()).intValue() - 1) {
            return chain.proceed(chain.request());
        }
        throw new Oi.a();
    }
}
