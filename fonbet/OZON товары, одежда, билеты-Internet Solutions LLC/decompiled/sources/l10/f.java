package l10;

import E10.c;
import QZ.a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import a00.C4911f;
import a20.C4924c;
import a20.C4925d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import ed.InterfaceC6346b;
import f00.InterfaceC6395a;
import f00.InterfaceC6396b;
import f20.C6407b;
import f20.C6408c;
import g20.d;
import i10.C6997c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import m20.InterfaceC8046a;
import n10.InterfaceC8418b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import s10.InterfaceC9582a;
import s10.InterfaceC9583b;
import w10.InterfaceC10409a;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final n20.i[] f72304c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f72305d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f72306a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9583b f72307b;

    public interface a {
        int get(@NotNull Context context);
    }

    @InterfaceC6346b
    private static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final int f72308a;

        private /* synthetic */ b(int i11) {
            this.f72308a = i11;
        }

        public static final /* synthetic */ b a(int i11) {
            return new b(i11);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f72308a == ((b) obj).f72308a;
            }
            return false;
        }

        @Override // l10.f.a
        public final int get(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return this.f72308a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72308a);
        }

        public final String toString() {
            return K00.b.e(this.f72308a, ")", new StringBuilder("BackgroundColorInt(value="));
        }
    }

    @InterfaceC6346b
    private static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final int f72309a;

        private /* synthetic */ c(int i11) {
            this.f72309a = i11;
        }

        public static final /* synthetic */ c a(int i11) {
            return new c(i11);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f72309a == ((c) obj).f72309a;
            }
            return false;
        }

        @Override // l10.f.a
        public final int get(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return androidx.core.content.a.getColor(context, this.f72309a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72309a);
        }

        public final String toString() {
            return K00.b.e(this.f72309a, ")", new StringBuilder("BackgroundColorResource(value="));
        }
    }

    public static final class d {

        /* renamed from: A, reason: collision with root package name */
        private boolean f72310A;

        /* renamed from: B, reason: collision with root package name */
        @NotNull
        private InterfaceC6396b f72311B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f72312C;

        /* renamed from: D, reason: collision with root package name */
        private E10.c f72313D;

        /* renamed from: E, reason: collision with root package name */
        private InterfaceC8418b f72314E;

        /* renamed from: F, reason: collision with root package name */
        private InterfaceC10409a f72315F;

        /* renamed from: G, reason: collision with root package name */
        @NotNull
        private final ArrayList f72316G;

        /* renamed from: H, reason: collision with root package name */
        @NotNull
        private final HashSet<QZ.g> f72317H;

        /* renamed from: I, reason: collision with root package name */
        private E00.a f72318I;

        /* renamed from: J, reason: collision with root package name */
        private C00.a f72319J;

        /* renamed from: K, reason: collision with root package name */
        private boolean f72320K;

        /* renamed from: L, reason: collision with root package name */
        private boolean f72321L;

        /* renamed from: M, reason: collision with root package name */
        @NotNull
        private a f72322M;

        /* renamed from: N, reason: collision with root package name */
        @NotNull
        private a f72323N;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4911f f72324a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a00.h f72325b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC4008j<C6997c<ru.ozon.composer.ui.widget.l>> f72326c;

        /* renamed from: d, reason: collision with root package name */
        private ComposerReferences f72327d;

        /* renamed from: e, reason: collision with root package name */
        private K00.a f72328e;

        /* renamed from: f, reason: collision with root package name */
        private RZ.a f72329f;

        /* renamed from: g, reason: collision with root package name */
        private n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f72330g;

        /* renamed from: h, reason: collision with root package name */
        private z00.h<ru.ozon.composer.ui.widget.l> f72331h;

        /* renamed from: i, reason: collision with root package name */
        private A00.b f72332i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private a f72333j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f72334k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f72335l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f72336m;

        /* renamed from: n, reason: collision with root package name */
        @NotNull
        private e f72337n;

        /* renamed from: o, reason: collision with root package name */
        private u f72338o;

        /* renamed from: p, reason: collision with root package name */
        private s f72339p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f72340q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f72341r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f72342s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f72343t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f72344u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f72345v;

        /* renamed from: w, reason: collision with root package name */
        @NotNull
        private EnumC1196f f72346w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f72347x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f72348y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f72349z;

        public d(@NotNull C4911f container, @NotNull a00.h viewModelOwnerProvider, @NotNull InterfaceC4008j<C6997c<ru.ozon.composer.ui.widget.l>> initialState) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            this.f72324a = container;
            this.f72325b = viewModelOwnerProvider;
            this.f72326c = initialState;
            this.f72333j = c.a(R$color.oz_semantic_bg_secondary);
            this.f72334k = true;
            this.f72335l = true;
            this.f72336m = true;
            this.f72337n = e.REGULAR;
            this.f72341r = true;
            this.f72346w = EnumC1196f.FIRST_ROW_SPACER;
            this.f72311B = InterfaceC6396b.a.a();
            this.f72316G = new ArrayList();
            this.f72317H = new HashSet<>();
            a aVar = this.f72333j;
            this.f72322M = aVar;
            this.f72323N = aVar;
        }

        public static void n0(d dVar, boolean z11, boolean z12, int i11) {
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            dVar.f72342s = z11;
            dVar.f72343t = z12;
        }

        public final Integer A() {
            return this.f72344u;
        }

        @NotNull
        public final a B() {
            return this.f72323N;
        }

        public final z00.h<ru.ozon.composer.ui.widget.l> C() {
            return this.f72331h;
        }

        public final E10.c D() {
            return this.f72313D;
        }

        @NotNull
        public final ArrayList E() {
            return this.f72316G;
        }

        public final l10.e F() {
            return this.f72327d;
        }

        public final InterfaceC8418b G() {
            return this.f72314E;
        }

        public final boolean H() {
            return this.f72340q;
        }

        @NotNull
        public final a I() {
            return this.f72322M;
        }

        public final boolean J() {
            return this.f72342s;
        }

        public final boolean K() {
            return this.f72341r;
        }

        public final u L() {
            return this.f72338o;
        }

        @NotNull
        public final EnumC1196f M() {
            return this.f72346w;
        }

        public final boolean N() {
            return this.f72343t;
        }

        @NotNull
        public final a00.h O() {
            return this.f72325b;
        }

        public final boolean P() {
            return this.f72321L;
        }

        @NotNull
        public final void Q(@NotNull InterfaceC10409a imagePrefetcher) {
            Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
            this.f72315F = imagePrefetcher;
        }

        @NotNull
        public final void R(@NotNull C00.a initialWidgetsProvider) {
            Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
            this.f72319J = initialWidgetsProvider;
        }

        @NotNull
        public final void S(boolean z11) {
            this.f72312C = z11;
        }

        public final boolean T() {
            return this.f72312C;
        }

        @InterfaceC3999a
        @NotNull
        public final void U(boolean z11) {
            this.f72346w = z11 ? EnumC1196f.ADDITIONAL_SPACER_ITEM : EnumC1196f.FIRST_ROW_SPACER;
        }

        @NotNull
        public final void V(boolean z11) {
            this.f72347x = z11;
        }

        public final boolean W() {
            return this.f72347x;
        }

        @NotNull
        public final void X(boolean z11) {
            this.f72348y = z11;
        }

        public final boolean Y() {
            return this.f72348y;
        }

        @NotNull
        public final void Z(boolean z11) {
            this.f72345v = z11;
        }

        @NotNull
        public final void a(@NotNull RZ.a analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            this.f72329f = analytics;
        }

        public final boolean a0() {
            return this.f72345v;
        }

        @NotNull
        public final void b(boolean z11) {
            this.f72334k = z11;
        }

        @NotNull
        public final void b0(boolean z11) {
            this.f72310A = z11;
        }

        @NotNull
        public final void c(int i11) {
            this.f72333j = c.a(i11);
        }

        public final boolean c0() {
            return this.f72310A;
        }

        @NotNull
        public final void d(int i11) {
            this.f72333j = b.a(i11);
        }

        @NotNull
        public final void d0(boolean z11) {
            this.f72349z = z11;
        }

        @NotNull
        public final f e() {
            RZ.a aVar = this.f72329f;
            if (aVar == null) {
                throw new IllegalArgumentException("analytics must not be null");
            }
            n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> kVar = this.f72330g;
            if (kVar == null) {
                throw new IllegalArgumentException("widget store must not be null");
            }
            K00.a aVar2 = this.f72328e;
            if (aVar2 != null) {
                return new f(this, aVar2, aVar, kVar);
            }
            throw new IllegalArgumentException("network must not be null");
        }

        public final boolean e0() {
            return this.f72349z;
        }

        @NotNull
        public final void f(@NotNull InterfaceC6395a debugFlagsManagerLibsApi) {
            Intrinsics.checkNotNullParameter(debugFlagsManagerLibsApi, "debugFlagsManagerLibsApi");
            if (debugFlagsManagerLibsApi instanceof InterfaceC6396b) {
                this.f72311B = (InterfaceC6396b) debugFlagsManagerLibsApi;
            }
        }

        @NotNull
        public final void f0(@NotNull s loaderConfig) {
            Intrinsics.checkNotNullParameter(loaderConfig, "loaderConfig");
            this.f72339p = loaderConfig;
        }

        @NotNull
        public final void g(@NotNull E00.a screenErrorStateFactory) {
            Intrinsics.checkNotNullParameter(screenErrorStateFactory, "screenErrorStateFactory");
            this.f72318I = screenErrorStateFactory;
        }

        @NotNull
        public final void g0(int i11) {
            this.f72344u = Integer.valueOf(i11);
        }

        @NotNull
        public final void h(@NotNull Set interceptors) {
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            HashSet<QZ.g> hashSet = this.f72317H;
            hashSet.clear();
            hashSet.addAll(interceptors);
        }

        @NotNull
        public final void h0(@NotNull K00.a network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.f72328e = network;
        }

        @NotNull
        public final void i(@NotNull e displayMode) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            this.f72337n = displayMode;
        }

        @NotNull
        public final void i0(@NotNull z00.h pageIssueFactory) {
            Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
            this.f72331h = pageIssueFactory;
        }

        @NotNull
        public final void j(@NotNull A00.b eventLoadingCallback) {
            Intrinsics.checkNotNullParameter(eventLoadingCallback, "eventLoadingCallback");
            this.f72332i = eventLoadingCallback;
        }

        @NotNull
        public final void j0(@NotNull E10.c prefetchManager) {
            Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
            this.f72313D = prefetchManager;
        }

        @NotNull
        public final void k(boolean z11) {
            this.f72320K = z11;
        }

        @InterfaceC3999a
        @NotNull
        public final void k0(@NotNull ComposerReferences references) {
            Intrinsics.checkNotNullParameter(references, "references");
            this.f72327d = references;
        }

        public final boolean l() {
            return this.f72334k;
        }

        @NotNull
        public final void l0(@NotNull InterfaceC8418b screenPerformanceController) {
            Intrinsics.checkNotNullParameter(screenPerformanceController, "screenPerformanceController");
            this.f72314E = screenPerformanceController;
        }

        public final boolean m() {
            return this.f72335l;
        }

        @NotNull
        public final void m0(boolean z11) {
            this.f72340q = z11;
        }

        public final boolean n() {
            return this.f72336m;
        }

        @NotNull
        public final a o() {
            return this.f72333j;
        }

        @NotNull
        public final void o0(boolean z11) {
            this.f72341r = z11;
        }

        @NotNull
        public final InterfaceC6396b p() {
            return this.f72311B;
        }

        @NotNull
        public final void p0(@NotNull u toolbarConfig) {
            Intrinsics.checkNotNullParameter(toolbarConfig, "toolbarConfig");
            this.f72338o = toolbarConfig;
        }

        public final E00.a q() {
            return this.f72318I;
        }

        @NotNull
        public final void q0(@NotNull n20.k widgetStore) {
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            this.f72330g = widgetStore;
        }

        @NotNull
        public final HashSet<QZ.g> r() {
            return this.f72317H;
        }

        @NotNull
        public final void r0(boolean z11) {
            this.f72321L = z11;
        }

        @NotNull
        public final C4911f s() {
            return this.f72324a;
        }

        @NotNull
        public final e t() {
            return this.f72337n;
        }

        public final A00.b u() {
            return this.f72332i;
        }

        public final boolean v() {
            return this.f72320K;
        }

        public final InterfaceC10409a w() {
            return this.f72315F;
        }

        @NotNull
        public final InterfaceC4008j<C6997c<ru.ozon.composer.ui.widget.l>> x() {
            return this.f72326c;
        }

        public final C00.a y() {
            return this.f72319J;
        }

        public final s z() {
            return this.f72339p;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e BOTTOM_SHEET_FULL;
        public static final e BOTTOM_SHEET_WRAP;
        public static final e REGULAR;

        static {
            e eVar = new e("REGULAR", 0);
            REGULAR = eVar;
            e eVar2 = new e("BOTTOM_SHEET_WRAP", 1);
            BOTTOM_SHEET_WRAP = eVar2;
            e eVar3 = new e("BOTTOM_SHEET_FULL", 2);
            BOTTOM_SHEET_FULL = eVar3;
            e[] eVarArr = {eVar, eVar2, eVar3};
            $VALUES = eVarArr;
            $ENTRIES = Xc.b.a(eVarArr);
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l10.f$f, reason: collision with other inner class name */
    public static final class EnumC1196f {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1196f[] $VALUES;
        public static final EnumC1196f ADDITIONAL_SPACER_ITEM;
        public static final EnumC1196f DISABLED;
        public static final EnumC1196f FIRST_ROW_SPACER;

        static {
            EnumC1196f enumC1196f = new EnumC1196f("ADDITIONAL_SPACER_ITEM", 0);
            ADDITIONAL_SPACER_ITEM = enumC1196f;
            EnumC1196f enumC1196f2 = new EnumC1196f("FIRST_ROW_SPACER", 1);
            FIRST_ROW_SPACER = enumC1196f2;
            EnumC1196f enumC1196f3 = new EnumC1196f("DISABLED", 2);
            DISABLED = enumC1196f3;
            EnumC1196f[] enumC1196fArr = {enumC1196f, enumC1196f2, enumC1196f3};
            $VALUES = enumC1196fArr;
            $ENTRIES = Xc.b.a(enumC1196fArr);
        }

        private EnumC1196f() {
            throw null;
        }

        public static EnumC1196f valueOf(String str) {
            return (EnumC1196f) Enum.valueOf(EnumC1196f.class, str);
        }

        public static EnumC1196f[] values() {
            return (EnumC1196f[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72350a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.BOTTOM_SHEET_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.BOTTOM_SHEET_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72350a = iArr;
        }
    }

    static final class h extends AbstractC7737t implements Function0<s10.c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K00.a f72351b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RZ.a f72352c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f72353d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f72354e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(K00.a aVar, RZ.a aVar2, n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> kVar, f fVar) {
            super(0);
            this.f72351b = aVar;
            this.f72352c = aVar2;
            this.f72353d = kVar;
            this.f72354e = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final s10.c invoke() {
            a.C0454a c0454a = new a.C0454a();
            f fVar = this.f72354e;
            c0454a.h(fVar.f72306a.x().getValue());
            c0454a.m(fVar.f72306a.E());
            E00.a q11 = fVar.f72306a.q();
            if (q11 != null) {
                c0454a.b(q11);
            }
            C00.a y11 = fVar.f72306a.y();
            if (y11 != null) {
                c0454a.c(y11);
            }
            Iterator<QZ.g> it = fVar.f72306a.r().iterator();
            while (it.hasNext()) {
                c0454a.d(it.next());
            }
            z00.h<ru.ozon.composer.ui.widget.l> C11 = fVar.f72306a.C();
            if (C11 != null) {
                c0454a.j(C11);
            }
            A00.b u11 = fVar.f72306a.u();
            if (u11 != null) {
                c0454a.g(u11);
            }
            InterfaceC8418b G11 = fVar.f72306a.G();
            if (G11 != null) {
                c0454a.k(G11);
            }
            Unit unit = Unit.f71690a;
            E10.c D11 = fVar.f72306a.D();
            if (D11 == null) {
                D11 = c.a.a();
            }
            return new s10.c(this.f72351b, this.f72352c, this.f72353d, c0454a, D11, fVar.f72306a.m() ? new X10.g(this.f72353d) : X10.h.f33992a, fVar.f72306a.M(), fVar.f72306a.p());
        }
    }

    static {
        int i11 = g20.d.f63722b;
        g20.c a11 = d.a.a(new Z10.b());
        int i12 = C6408c.f62494b;
        C6407b a12 = C6408c.a.a(new Y10.b());
        int i13 = C4925d.f36220b;
        InterfaceC8046a[] viewMapper = {new a20.f()};
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        f72304c = new n20.i[]{a11, a12, new C4924c(n20.j.b(), viewMapper)};
    }

    public f(d dVar, K00.a aVar, RZ.a aVar2, n20.k kVar) {
        this.f72306a = dVar;
        n20.l.a(kVar, f72304c);
        a00.h O11 = dVar.O();
        this.f72307b = ((s10.c) ((w0) a00.j.a(O11.a(), N.b(s10.c.class), new h(aVar, aVar2, kVar, this)).getValue())).d0();
    }

    @NotNull
    public final InterfaceC9582a b() {
        return this.f72307b;
    }

    @NotNull
    public final QZ.a<ru.ozon.composer.ui.widget.l> c() {
        return this.f72307b.getComposer();
    }

    @NotNull
    public final i d(@NotNull LayoutInflater inflater, ViewGroup viewGroup, @NotNull Function1<? super i, Unit> initBlock) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(initBlock, "initBlock");
        d dVar = this.f72306a;
        int i11 = g.f72350a[dVar.t().ordinal()];
        View inflate = inflater.inflate(i11 != 1 ? i11 != 2 ? R.layout.fragment_composer : R.layout.fragment_composer_full : R.layout.fragment_composer_wrap, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        if (dVar.t() == e.BOTTOM_SHEET_WRAP) {
            Integer A11 = dVar.A();
            inflate.setMinimumHeight(A11 != null ? A11.intValue() : UiExtKt.toPx(260));
        }
        C4911f s11 = dVar.s();
        a00.h O11 = dVar.O();
        l10.e F11 = dVar.F();
        InterfaceC9583b interfaceC9583b = this.f72307b;
        a o11 = dVar.o();
        Context context = inflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i12 = o11.get(context);
        EnumC1196f M11 = dVar.M();
        e t2 = dVar.t();
        u L11 = dVar.L();
        s z11 = dVar.z();
        boolean J11 = dVar.J();
        boolean N11 = dVar.N();
        boolean K11 = dVar.K();
        boolean l11 = dVar.l();
        boolean n11 = dVar.n();
        boolean a02 = dVar.a0();
        boolean W11 = dVar.W();
        boolean Y11 = dVar.Y();
        boolean e02 = dVar.e0();
        boolean c02 = dVar.c0();
        boolean T11 = dVar.T();
        boolean v11 = dVar.v();
        boolean P11 = dVar.P();
        boolean H11 = dVar.H();
        a I11 = dVar.I();
        Context context2 = inflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i13 = I11.get(context2);
        a B11 = dVar.B();
        Context context3 = inflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return new i(inflate, s11, O11, F11, interfaceC9583b, new l10.g(i12, M11, t2, L11, z11, J11, N11, false, K11, l11, n11, a02, W11, Y11, e02, c02, T11, v11, P11, H11, false, i13, B11.get(context3)), dVar.G(), dVar.w(), initBlock);
    }
}
