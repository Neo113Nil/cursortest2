package l30;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import ze.C;
import ze.C11112B;
import ze.w;

/* renamed from: l30.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7864b implements InterfaceC7863a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72655a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final w<Unit> f72656b;

    /* renamed from: c, reason: collision with root package name */
    private String f72657c;

    /* renamed from: d, reason: collision with root package name */
    private Long f72658d;

    /* renamed from: e, reason: collision with root package name */
    private String f72659e;

    /* renamed from: f, reason: collision with root package name */
    private String f72660f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private List<String> f72661g;

    /* renamed from: h, reason: collision with root package name */
    private int f72662h;

    /* renamed from: i, reason: collision with root package name */
    private int f72663i;

    /* renamed from: j, reason: collision with root package name */
    private C6788a f72664j;

    /* renamed from: k, reason: collision with root package name */
    private B0 f72665k;

    @e(c = "ru.ozon.fintech.analytic.domain.pageload.PageLoadDelayAnalyticInteractorImpl$webViewInvokeLoadUrl$1", f = "PageLoadDelayAnalyticInteractorImpl.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: l30.b$a */
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72666d;

        /* renamed from: l30.b$a$a, reason: collision with other inner class name */
        static final class C1211a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7864b f72668a;

            C1211a(C7864b c7864b) {
                this.f72668a = c7864b;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, d dVar) {
                C7864b.h(this.f72668a);
                return Unit.f71690a;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C7864b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72666d;
            if (i11 == 0) {
                s.b(obj);
                C7864b c7864b = C7864b.this;
                L80.a.a("PageLoadDelayAnalyticInteractorImpl", "webViewInvokeLoadUrl " + c7864b.f72657c + " starting job");
                InterfaceC2395h H11 = C2399j.H(c7864b.f72656b);
                C1211a c1211a = new C1211a(c7864b);
                this.f72666d = 1;
                if (H11.collect(c1211a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C7864b(@NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f72655a = analyticInteractor;
        this.f72656b = C11112B.c(1000L, 1000L, C.FIXED_PERIOD);
        this.f72661g = C7714v.b0("1", "2", "5", "10", "20", "30");
    }

    public static final void h(C7864b c7864b) {
        int i11;
        c7864b.f72663i++;
        String str = c7864b.f72660f;
        if (str == null) {
            str = c7864b.f72657c;
        }
        if (str == null) {
            c7864b.j();
            c7864b.i();
            return;
        }
        int size = c7864b.f72661g.size();
        int i12 = c7864b.f72662h;
        if (size > i12) {
            int i13 = c7864b.f72663i;
            try {
                i11 = Integer.parseInt(c7864b.f72661g.get(i12));
            } catch (Exception unused) {
                i11 = -1;
            }
            if (i13 == i11) {
                int i14 = c7864b.f72663i;
                InterfaceC6618a interfaceC6618a = c7864b.f72655a;
                interfaceC6618a.A1(i14, str);
                String str2 = c7864b.f72659e;
                long currentTimeMillis = System.currentTimeMillis();
                Long l11 = c7864b.f72658d;
                interfaceC6618a.q(currentTimeMillis - (l11 != null ? l11.longValue() : System.currentTimeMillis()), str2, str);
                c7864b.f72662h++;
            }
        }
    }

    private final void i() {
        B0 b02 = this.f72665k;
        if (b02 != null) {
            if (!((AbstractC10711a) b02).isActive()) {
                b02 = null;
            }
            if (b02 != null) {
                ((H0) b02).j(null);
            }
        }
    }

    private final void j() {
        this.f72657c = null;
        this.f72660f = null;
        this.f72659e = null;
        this.f72658d = null;
        this.f72662h = 0;
        this.f72663i = 0;
    }

    @Override // l30.InterfaceC7863a
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f72660f = url;
    }

    @Override // l30.InterfaceC7863a
    public final Long b() {
        return this.f72658d;
    }

    @Override // l30.InterfaceC7863a
    public final void c(@NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        j();
        this.f72657c = url;
        this.f72659e = str;
        this.f72658d = Long.valueOf(System.currentTimeMillis());
        B0 b02 = this.f72665k;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            B0 b03 = this.f72665k;
            B0 b04 = null;
            if (b03 != null) {
                ((H0) b03).j(null);
            }
            C6788a c6788a = this.f72664j;
            if (c6788a != null) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                b04 = C10727i.c(c6788a, He.b.f10879b, null, new a(null), 2);
            }
            this.f72665k = b04;
        }
    }

    @Override // l30.InterfaceC7863a
    public final void d(@NotNull C6788a scope, List list) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (list != null) {
            this.f72661g = list;
        }
        this.f72664j = scope;
    }

    @Override // l30.InterfaceC7863a
    public final void e(@NotNull String url, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("PageLoadDelayAnalyticInteractorImpl", "webPageFinished " + url);
        if (z11) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l11 = this.f72658d;
            this.f72655a.a1(currentTimeMillis - (l11 != null ? l11.longValue() : currentTimeMillis), url, str);
        }
        j();
        i();
    }

    @Override // l30.InterfaceC7863a
    public final void error(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("PageLoadDelayAnalyticInteractorImpl", "error " + url);
        j();
        i();
    }
}
