package l10;

import A00.a;
import H10.a;
import K10.a;
import K10.c;
import QZ.a;
import Sc.InterfaceC4008j;
import a00.C4906a;
import a00.C4908c;
import a00.C4910e;
import a00.C4911f;
import a20.C4922a;
import a20.C4925d;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c20.i;
import com.google.android.material.appbar.AppBarLayout;
import di0.C6201a;
import di0.C6203c;
import f00.InterfaceC6396b;
import i10.InterfaceC6995a;
import i10.k;
import j10.InterfaceC7238a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k10.EnumC7467b;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import l10.f;
import m10.C8042d;
import m20.InterfaceC8046a;
import n10.InterfaceC8418b;
import o10.C8630a;
import org.jetbrains.annotations.NotNull;
import p00.C8828d;
import q10.C8973a;
import r10.C9158a;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.view.ComposerNotificationController;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import ru.ozon.composer.ui.recycler.MetricsRecyclerView;
import ru.ozon.composer.ui.recycler.layout.ComposerGridLayoutManager;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import s10.InterfaceC9583b;
import t10.C9726a;
import v10.C10183a;
import w10.InterfaceC10409a;
import x10.C10644a;
import xe.C10727i;
import y00.AbstractC10819a;
import z10.C10974b;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: g0, reason: collision with root package name */
    @NotNull
    private static final Function1<i, Unit> f72379g0 = g.f72447b;

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f72380h0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.ui.widget.a f72381A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.ui.widget.f f72382B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final WZ.l f72383C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final W10.b f72384D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final InterfaceC7238a<ru.ozon.composer.ui.widget.l> f72385E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final Object f72386F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final Object f72387G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final Object f72388H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final C8042d f72389I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final Object f72390J;

    /* renamed from: K, reason: collision with root package name */
    private C9726a f72391K;

    /* renamed from: L, reason: collision with root package name */
    private Function1<? super AbstractC10819a.e, Unit> f72392L;

    /* renamed from: M, reason: collision with root package name */
    private Function0<Unit> f72393M;

    /* renamed from: N, reason: collision with root package name */
    private Function0<Unit> f72394N;

    /* renamed from: O, reason: collision with root package name */
    private Function0<Unit> f72395O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final Object f72396P;

    /* renamed from: Q, reason: collision with root package name */
    private C10.e f72397Q;

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private final C10.g f72398R;

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private final C10.a f72399S;

    /* renamed from: T, reason: collision with root package name */
    @NotNull
    private final C8630a f72400T;

    /* renamed from: U, reason: collision with root package name */
    @NotNull
    private final Object f72401U;

    /* renamed from: V, reason: collision with root package name */
    @NotNull
    private final Object f72402V;

    /* renamed from: W, reason: collision with root package name */
    @NotNull
    private final Object f72403W;

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private final Object f72404X;

    /* renamed from: Y, reason: collision with root package name */
    private X10.l f72405Y;

    /* renamed from: Z, reason: collision with root package name */
    private Parcelable f72406Z;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f72407a;

    /* renamed from: a0, reason: collision with root package name */
    private Function1<? super Boolean, Unit> f72408a0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4911f f72409b;

    /* renamed from: b0, reason: collision with root package name */
    private String f72410b0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a00.h f72411c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f72412c0;

    /* renamed from: d, reason: collision with root package name */
    private final l10.e f72413d;

    /* renamed from: d0, reason: collision with root package name */
    @NotNull
    private final HashMap<Class<? extends InterfaceC6995a>, L10.a<? extends InterfaceC6995a>> f72414d0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC9583b f72415e;

    /* renamed from: e0, reason: collision with root package name */
    @NotNull
    private final c20.i f72416e0;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l10.g f72417f;

    /* renamed from: f0, reason: collision with root package name */
    @NotNull
    private final Object f72418f0;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8418b f72419g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10409a f72420h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function1<i, Unit> f72421i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f72422j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f72423k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f72424l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ViewGroup f72425m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f72426n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.fragment.app.r f72427o;

    /* renamed from: p, reason: collision with root package name */
    private final SwipeRefreshLayout f72428p;

    /* renamed from: q, reason: collision with root package name */
    private final View f72429q;

    /* renamed from: r, reason: collision with root package name */
    private final ComposerListBehavior f72430r;

    /* renamed from: s, reason: collision with root package name */
    private final AppBarLayout f72431s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final LinearLayout f72432t;

    /* renamed from: u, reason: collision with root package name */
    private final ImageView f72433u;

    /* renamed from: v, reason: collision with root package name */
    private final PageIssueStateView f72434v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f72435w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f72436x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final QZ.a<ru.ozon.composer.ui.widget.l> f72437y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final InterfaceC7851b f72438z;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$10", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<a.C0216a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f72439d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = i.this.new a(dVar);
            aVar.f72439d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a.C0216a c0216a, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(a.C0216a.a(c0216a.b()), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            i.this.Y().setContentDescription(((a.C0216a) this.f72439d).b());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$5", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<H10.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f72441d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = i.this.new b(dVar);
            bVar.f72441d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(H10.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            H10.c cVar = (H10.c) this.f72441d;
            E10.a b11 = cVar.b();
            if (b11 != null) {
                i iVar = i.this;
                ((MetricsRecyclerView) iVar.e0()).j(b11);
                if ((b11.c() > 0.0f || b11.b() > 0.0f) && cVar.c()) {
                    ((MetricsRecyclerView) iVar.e0()).h();
                }
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$6", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<a.C0289a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f72443d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = i.this.new c(dVar);
            cVar.f72443d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a.C0289a c0289a, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(c0289a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            if (!((a.C0289a) this.f72443d).a()) {
                i iVar = i.this;
                C10.e eVar = iVar.f72397Q;
                if (eVar != null) {
                    iVar.e0().removeItemDecoration(eVar);
                }
                iVar.f72397Q = null;
                ComposerListBehavior composerListBehavior = iVar.f72430r;
                if (composerListBehavior != null) {
                    composerListBehavior.D(null);
                }
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$7", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<c.a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f72445d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = i.this.new d(dVar);
            dVar2.f72445d = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            c.a aVar2 = (c.a) this.f72445d;
            ComposerListBehavior composerListBehavior = i.this.f72430r;
            if (composerListBehavior != null) {
                composerListBehavior.G(aVar2.b(), aVar2.c());
            }
            return Unit.f71690a;
        }
    }

    /* synthetic */ class e extends C7719a implements Function2<I10.c, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(I10.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            ((C8630a) this.receiver).a(cVar.b());
            return Unit.f71690a;
        }
    }

    /* synthetic */ class f extends C7719a implements Function2<J10.a, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J10.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            ((u10.b) this.receiver).h(aVar.b());
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function1<i, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f72447b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            return Unit.f71690a;
        }
    }

    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72448a;

        static {
            int[] iArr = new int[f.EnumC1196f.values().length];
            try {
                iArr[f.EnumC1196f.ADDITIONAL_SPACER_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.EnumC1196f.FIRST_ROW_SPACER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.EnumC1196f.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72448a = iArr;
        }
    }

    /* renamed from: l10.i$i, reason: collision with other inner class name */
    public static final class C1197i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final HashSet f72449a;

        public C1197i() {
            this(null);
        }

        @NotNull
        public final Set<Integer> a() {
            return this.f72449a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1197i) && Intrinsics.d(this.f72449a, ((C1197i) obj).f72449a);
        }

        public final int hashCode() {
            return this.f72449a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "WidgetPreparedViewTag(preparedWidgets=" + this.f72449a + ")";
        }

        public C1197i(Object obj) {
            HashSet preparedWidgets = new HashSet();
            Intrinsics.checkNotNullParameter(preparedWidgets, "preparedWidgets");
            this.f72449a = preparedWidgets;
        }
    }

    static final class j extends AbstractC7737t implements Function0<ComposerGridLayoutManager> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComposerGridLayoutManager invoke() {
            i iVar = i.this;
            Context context = iVar.e0().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ComposerGridLayoutManager composerGridLayoutManager = new ComposerGridLayoutManager(context);
            composerGridLayoutManager.r(iVar);
            composerGridLayoutManager.n(new D10.a(iVar.I()));
            return composerGridLayoutManager;
        }
    }

    static final class k extends AbstractC7737t implements Function0<C9158a> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9158a invoke() {
            return i.this.f72415e.f();
        }
    }

    static final class l extends AbstractC7737t implements Function0<l10.t> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final l10.t invoke() {
            return new l10.t(i.this.Q().e());
        }
    }

    static final class m extends AbstractC7737t implements Function0<y10.i> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final y10.i invoke() {
            i iVar = i.this;
            return new y10.i(iVar, iVar.e0(), iVar.f72428p, new C10974b(iVar));
        }
    }

    static final class n extends AbstractC7737t implements Function0<c20.h> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c20.h invoke() {
            i iVar = i.this;
            return new c20.h(iVar, i.w(iVar), iVar.f72419g, iVar.f72416e0);
        }
    }

    static final class o extends AbstractC7737t implements Function0<M10.c> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final M10.c invoke() {
            i iVar = i.this;
            return new M10.c(i.q(iVar), iVar.M(), iVar.f72415e.d());
        }
    }

    static final class p extends AbstractC7737t implements Function0<R10.f> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final R10.f invoke() {
            i iVar = i.this;
            return new R10.g(iVar.Y(), iVar.f72417f, iVar.f72415e.e(), iVar.e0(), i.j(iVar), iVar.I(), K.a(iVar.Q().g()), iVar.f72430r, iVar.f72428p).a();
        }
    }

    static final class q extends AbstractC7737t implements Function0<S10.b> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final S10.b invoke() {
            return new S10.b(i.this.f72427o);
        }
    }

    static final class r extends AbstractC7737t implements Function0<ru.ozon.composer.ui.widget.l> {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.composer.ui.widget.l invoke() {
            return i.e(i.this);
        }
    }

    static final class s extends AbstractC7737t implements Function0<v> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v invoke() {
            i iVar = i.this;
            if (iVar.a0() instanceof v) {
                return (v) iVar.a0();
            }
            a00.h a02 = iVar.a0();
            return a02 instanceof C4906a ? new C7850a(iVar.f72427o) : a02 instanceof C4910e ? new l10.r(iVar.Q().j(), null, 6) : new l10.q(iVar);
        }
    }

    static final class t extends AbstractC7737t implements Function0<n20.k<? extends InterfaceC8046a<?, ? extends l20.c>>> {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> invoke() {
            return i.this.f72415e.getWidgetStore();
        }
    }

    static final class u extends AbstractC7737t implements Function0<X10.f> {
        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final X10.f invoke() {
            return i.this.f72415e.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [kotlin.coroutines.CoroutineContext, kotlin.coroutines.d, xe.O] */
    /* JADX WARN: Type inference failed for: r3v45 */
    public i(@NotNull View view, @NotNull C4911f ownerContainer, @NotNull a00.h viewModelOwner, l10.e eVar, @NotNull InterfaceC9583b component, @NotNull l10.g config, InterfaceC8418b interfaceC8418b, InterfaceC10409a interfaceC10409a, @NotNull Function1<? super i, Unit> initBlock) {
        ComposerListBehavior composerListBehavior;
        C10.e dVar;
        InterfaceC4008j interfaceC4008j;
        View view2;
        androidx.recyclerview.widget.g gVar;
        C10.g gVar2;
        ?? r32;
        ViewGroup l11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(viewModelOwner, "viewModelOwner");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(initBlock, "initBlock");
        this.f72407a = view;
        this.f72409b = ownerContainer;
        this.f72411c = viewModelOwner;
        this.f72413d = eVar;
        this.f72415e = component;
        this.f72417f = config;
        this.f72419g = interfaceC8418b;
        this.f72420h = interfaceC10409a;
        this.f72421i = initBlock;
        this.f72422j = Sc.k.b(new l());
        this.f72423k = Sc.k.b(new s());
        this.f72424l = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view;
        this.f72425m = viewGroup;
        View findViewById = view.findViewById(R.id.listRv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.g gVar3 = (androidx.recyclerview.widget.g) findViewById;
        this.f72426n = gVar3;
        androidx.fragment.app.r i11 = ownerContainer.i();
        this.f72427o = i11;
        SwipeRefreshLayout m11 = C10183a.m(view);
        this.f72428p = m11;
        C10183a.c(view);
        this.f72429q = C10183a.b(view);
        ComposerListBehavior g10 = C10183a.g(view);
        if (g10 != null) {
            g10.F(config.v());
            composerListBehavior = g10;
        } else {
            composerListBehavior = null;
        }
        this.f72430r = composerListBehavior;
        this.f72431s = C10183a.a(view);
        this.f72432t = C10183a.o(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.pageDebugInfoIv);
        this.f72433u = imageView;
        PageIssueStateView k11 = C10183a.k(view);
        if (k11 != null) {
            k11.o(config.u());
        } else {
            k11 = null;
        }
        this.f72434v = k11;
        this.f72435w = config.t();
        this.f72436x = config.e();
        this.f72437y = component.getComposer();
        this.f72438z = component.getComposerController();
        this.f72381A = component.g();
        this.f72382B = component.getViewedPond();
        WZ.l f7 = component.getComposerAnalytics().f();
        this.f72383C = f7;
        W10.b bVar = new W10.b(f7);
        this.f72384D = bVar;
        InterfaceC7238a<ru.ozon.composer.ui.widget.l> composerStore = component.getComposerStore();
        this.f72385E = composerStore;
        Sc.n nVar = Sc.n.NONE;
        this.f72386F = Sc.k.a(nVar, new k());
        InterfaceC4008j a11 = Sc.k.a(nVar, new u());
        this.f72387G = a11;
        InterfaceC4008j a12 = Sc.k.a(nVar, new t());
        this.f72388H = a12;
        C8042d a13 = component.b().a(this, bVar);
        this.f72389I = a13;
        InterfaceC4008j a14 = Sc.k.a(nVar, new j());
        this.f72390J = a14;
        this.f72396P = Sc.k.a(nVar, new r());
        int i12 = h.f72448a[config.m().ordinal()];
        if (i12 == 1) {
            dVar = new C10.d();
        } else if (i12 == 2) {
            dVar = new C10.c(a13);
        } else {
            if (i12 != 3) {
                throw new Sc.o();
            }
            dVar = null;
        }
        this.f72397Q = dVar;
        C10.g gVar4 = new C10.g(a13);
        this.f72398R = gVar4;
        this.f72399S = new C10.a(gVar3, (n20.k) a12.getValue());
        C8630a c8630a = new C8630a(viewGroup, (I10.c) composerStore.b().a(I10.c.class), this.f72397Q);
        this.f72400T = c8630a;
        InterfaceC4008j a15 = Sc.k.a(nVar, new q());
        this.f72401U = a15;
        InterfaceC4008j a16 = Sc.k.a(nVar, new m());
        this.f72402V = a16;
        this.f72403W = Sc.k.a(nVar, new o());
        this.f72404X = Sc.k.a(nVar, new p());
        PageIssueStateView pageIssueStateView = k11;
        u10.b bVar2 = new u10.b(view, config.r(), this.f72397Q, gVar4, composerListBehavior, config.i(), config.g());
        this.f72414d0 = new HashMap<>();
        Sg.a b11 = component.getComposerAnalytics().b();
        G00.a flag = G00.a.f9659a;
        Intrinsics.checkNotNullParameter(flag, "flag");
        flag.getClass();
        this.f72416e0 = i.a.a(b11, false);
        this.f72418f0 = Sc.k.a(nVar, new n());
        if (component.c().C()) {
            a.b.f23171a.getClass();
            a.b.a().a();
        } else {
            a.b.f23171a.getClass();
            a.b.a().disable();
        }
        a.b bVar3 = a.b.f23171a;
        C10644a checker = component.a();
        bVar3.getClass();
        Intrinsics.checkNotNullParameter(checker, "checker");
        a.b.b().b(checker);
        ownerContainer.b().e();
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        if (H00.b.c()) {
            ru.ozon.android.ozonLogger.core.h b12 = H00.b.b();
            Thread currentThread = Thread.currentThread();
            ComponentCallbacksC5392m c11 = ownerContainer.c();
            String tag = c11 != null ? c11.getTag() : null;
            b12.e(cVar, Pk0.g.c(currentThread, ": ", "onScreenCreated: [page=" + tag + ", container=" + this + ", lifecycleState=" + ownerContainer.g().getLifecycle().b() + "]"), "ComposerScreenUiContainer", null, Boolean.TRUE);
        }
        C10183a.e(view).setBackgroundColor(config.c());
        a13.m(new VL.b(this));
        gVar3.setLayoutManager((ComposerGridLayoutManager) a14.getValue());
        gVar3.setAdapter(a13);
        if (config.d() == f.e.REGULAR) {
            interfaceC4008j = a15;
        } else {
            interfaceC4008j = a15;
            new v10.g(gVar3, new l10.m(gVar3, this, new int[2], new kotlin.jvm.internal.K(), new kotlin.jvm.internal.K()));
        }
        if (!config.a()) {
            gVar3.setItemAnimator(null);
            gVar3.setLayoutAnimation(null);
        }
        if (config.b()) {
            view2 = view;
            gVar = gVar3;
            gVar2 = gVar4;
            X10.l lVar = new X10.l(i11, gVar, a13, (n20.k) a12.getValue(), ownerContainer.g(), config.w());
            X10.l.d(lVar);
            this.f72405Y = lVar;
        } else {
            view2 = view;
            gVar = gVar3;
            gVar2 = gVar4;
        }
        if (pageIssueStateView != null) {
            pageIssueStateView.l(new l10.j(this));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: l10.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    i.c(i.this);
                }
            });
        }
        if (config.s()) {
            C10.e eVar2 = this.f72397Q;
            if (eVar2 != null) {
                gVar.addItemDecoration(eVar2);
            }
            gVar.addItemDecoration(gVar2);
        }
        ComposerListBehavior g11 = C10183a.g(view2);
        if (g11 != null) {
            g11.A(config.h());
            g11.D(this.f72397Q);
            g11.y(gVar2);
        }
        bVar2.e();
        l10.u l12 = config.l();
        if (l12 != null) {
            ((S10.b) interfaceC4008j.getValue()).b(view2, l12);
        }
        l10.s f11 = config.f();
        if (f11 != null) {
            ((y10.i) a16.getValue()).h(f11);
        }
        if (config.k() && m11 != null) {
            m11.setEnabled(true);
            m11.setOnRefreshListener(new VL.a(this));
        }
        initBlock.invoke(this);
        this.f72412c0 = component.c().E(C8828d.f80010b);
        ((X10.f) a11.getValue()).a(this);
        if (interfaceC10409a != null) {
            interfaceC10409a.init(ownerContainer.g(), gVar);
        }
        L10.b.a(this, H10.c.class, new b(null));
        if (config.e()) {
            AppBarLayout a17 = C10183a.a(view2);
            if (a17 != null) {
                Intrinsics.checkNotNullParameter(a17, "<this>");
                a17.setTag(R.id.tag_skip_draw_in_composer_snapshot, Boolean.TRUE);
            }
            ViewGroup h11 = C10183a.h(view2);
            if (h11 != null) {
                Intrinsics.checkNotNullParameter(h11, "<this>");
                h11.setTag(R.id.tag_skip_draw_in_composer_snapshot, Boolean.TRUE);
            }
        }
        if (config.p() && (l11 = C10183a.l(view2)) != null) {
            l11.setElevation(0.0f);
        }
        L10.b.a(this, a.C0289a.class, new c(null));
        L10.b.a(this, c.a.class, new d(null));
        L10.b.a(this, I10.c.class, new e(2, c8630a, C8630a.class, "updateAppBarOverlapSize", "updateAppBarOverlapSize-NA0ATfU(I)V", 4));
        L10.b.a(this, J10.a.class, new f(2, bVar2, u10.b.class, "setInsets", "setInsets-vFeHFAg(Landroidx/core/view/WindowInsetsCompat;)V", 4));
        if (config.u()) {
            r32 = 0;
            L10.b.a(this, a.C0216a.class, new a(null));
        } else {
            r32 = 0;
        }
        C4908c g12 = ownerContainer.g();
        AbstractC5434v lifecycle = g12.getLifecycle();
        C10727i.c(K.a(g12), r32, r32, new l10.o(lifecycle, r32, this), 3);
        lifecycle.a(new l10.p(this, lifecycle));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Sc.j, java.lang.Object] */
    public static final void A(i iVar, i10.j jVar) {
        ((y10.i) iVar.f72402V.getValue()).i(jVar.b());
        ((y10.i) iVar.f72402V.getValue()).j(jVar.e());
        z00.f c11 = jVar.c();
        PageIssueStateView pageIssueStateView = iVar.f72434v;
        if (pageIssueStateView != null) {
            pageIssueStateView.q(c11);
        }
        R10.f fVar = (R10.f) iVar.f72404X.getValue();
        if (fVar != null) {
            fVar.a(c11);
        }
        boolean z11 = ((jVar.b().c() || jVar.e()) || (c11 != null)) ? false : true;
        ImageView imageView = iVar.f72433u;
        if (imageView != null) {
            imageView.setVisibility((z11 && iVar.f72412c0) ? 0 : 8);
        }
    }

    public static final void B(i iVar) {
        RecyclerView.o layoutManager = iVar.f72426n.getLayoutManager();
        iVar.f72406Z = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
    }

    public static final void C(i iVar, InterfaceC7238a interfaceC7238a) {
        iVar.getClass();
        i10.e d11 = interfaceC7238a.b().o().d();
        if (d11 == null) {
            return;
        }
        if (d11.g()) {
            interfaceC7238a.c(a.E.f189a);
        } else if (d11.h()) {
            interfaceC7238a.c(a.L.f200a);
        }
    }

    public static final void F(i iVar, AbstractC10819a.b bVar) {
        C9726a c9726a = iVar.f72391K;
        if (c9726a != null) {
            c9726a.process(bVar);
        }
    }

    public static final void G(i iVar, AbstractC10819a.c cVar) {
        C9726a c9726a = iVar.f72391K;
        if (c9726a != null) {
            c9726a.process(cVar);
        }
        iVar.f72385E.c(new a.D(cVar.c(), cVar.a()));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [Sc.j, java.lang.Object] */
    public static final void H(k.a aVar, i iVar) {
        iVar.getClass();
        String uuid = aVar.d();
        if (uuid != null) {
            C6201a beginTrace = C6203c.f61631a.beginTrace(uuid);
            C6201a.f(beginTrace, EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_END, 0L, false, 2);
            C6201a.f(beginTrace, EnumC7467b.LAYOUT_TIME_START, 0L, false, 2);
            InterfaceC8418b interfaceC8418b = iVar.f72419g;
            if (interfaceC8418b != null) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                interfaceC8418b.mo437onLayoutStartA3btV1Q(uuid);
            }
        }
        boolean andSet = aVar.e().getAndSet(true);
        if (andSet) {
            for (ru.ozon.composer.ui.widget.l lVar : aVar.a()) {
                View view = iVar.f72407a;
                Object tag = view.getTag(R.id.widget_tag_container);
                C1197i c1197i = tag instanceof C1197i ? (C1197i) tag : null;
                if (c1197i == null) {
                    c1197i = new C1197i(null);
                    view.setTag(R.id.widget_tag_container, c1197i);
                }
                int j11 = lVar.j();
                if (!((HashSet) c1197i.a()).contains(Integer.valueOf(j11))) {
                    iVar.f72415e.g().b(iVar, lVar);
                    c1197i.a().add(Integer.valueOf(j11));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (iVar.f72397Q instanceof C10.d) {
            arrayList.add((ru.ozon.composer.ui.widget.l) iVar.f72396P.getValue());
        }
        C7714v.p(aVar.a(), arrayList);
        ru.ozon.composer.ui.widget.l lVar2 = (ru.ozon.composer.ui.widget.l) aVar.c();
        if (lVar2 != null) {
            arrayList.add(lVar2);
        }
        iVar.f72410b0 = uuid;
        androidx.recyclerview.widget.g gVar = iVar.f72426n;
        if (gVar instanceof MetricsRecyclerView) {
            ((MetricsRecyclerView) gVar).i(uuid);
        }
        iVar.f72389I.p(arrayList, andSet, new l10.n(andSet, iVar, arrayList));
    }

    public static void a(i iVar) {
        iVar.f72438z.g();
    }

    public static void b(i iVar) {
        iVar.f72438z.f(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static void c(i iVar) {
        ((C9158a) iVar.f72386F.getValue()).a(iVar.f72409b.k());
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Sc.j, java.lang.Object] */
    public static final void d(i iVar, ArrayList arrayList) {
        C10.e eVar = iVar.f72397Q;
        androidx.recyclerview.widget.g gVar = iVar.f72426n;
        if (eVar != null) {
            gVar.removeItemDecoration(eVar);
        }
        C10.g gVar2 = iVar.f72398R;
        gVar.removeItemDecoration(gVar2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC8046a viewMapper = ((n20.k) iVar.f72388H.getValue()).getViewMapper(((ru.ozon.composer.ui.widget.l) it.next()).j());
            if (!(viewMapper instanceof ru.ozon.composer.ui.widget.g)) {
                viewMapper = null;
            }
            ru.ozon.composer.ui.widget.g gVar3 = (ru.ozon.composer.ui.widget.g) viewMapper;
            if (gVar3 != null) {
                Context context = gVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                List<RecyclerView.n> decorators = gVar3.getDecorators(context);
                if (decorators != null) {
                    for (RecyclerView.n nVar : decorators) {
                        Object b11 = C10.h.b(nVar);
                        if (!linkedHashMap.containsKey(C10.h.a(b11))) {
                            linkedHashMap.put(C10.h.a(b11), nVar);
                        }
                    }
                }
            }
        }
        int itemDecorationCount = gVar.getItemDecorationCount();
        for (int i11 = 0; i11 < itemDecorationCount; i11++) {
            RecyclerView.n itemDecorationAt = gVar.getItemDecorationAt(i11);
            Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
            linkedHashMap.remove(C10.h.a(C10.h.b(itemDecorationAt)));
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            gVar.addItemDecoration((RecyclerView.n) ((Map.Entry) it2.next()).getValue());
        }
        C10.e eVar2 = iVar.f72397Q;
        if (eVar2 != null) {
            gVar.addItemDecoration(eVar2);
        }
        gVar.addItemDecoration(gVar2);
    }

    public static final ru.ozon.composer.ui.widget.l e(i iVar) {
        T00.m mVar;
        I00.a<ru.ozon.composer.ui.widget.l> s11 = iVar.f72437y.s();
        mVar = C4925d.f36219a;
        return (ru.ozon.composer.ui.widget.l) s11.b(new T00.j(mVar, C4922a.f36216a));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final void f(i iVar) {
        iVar.f72416e0.clear();
        ((X10.f) iVar.f72387G.getValue()).onDestroy();
        iVar.f72426n.g();
        X10.l lVar = iVar.f72405Y;
        if (lVar != null) {
            lVar.c();
        }
        String uuid = iVar.f72410b0;
        if (uuid != null) {
            InterfaceC8418b interfaceC8418b = iVar.f72419g;
            if (interfaceC8418b != null) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                interfaceC8418b.mo436onDestroyA3btV1Q(uuid);
            }
            iVar.f72410b0 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final ComposerGridLayoutManager j(i iVar) {
        return (ComposerGridLayoutManager) iVar.f72390J.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final y10.i q(i iVar) {
        return (y10.i) iVar.f72402V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final c20.h r(i iVar) {
        return (c20.h) iVar.f72418f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final M10.c t(i iVar) {
        return (M10.c) iVar.f72403W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final n20.k w(i iVar) {
        return (n20.k) iVar.f72388H.getValue();
    }

    public static final void x(View view, i iVar) {
        iVar.getClass();
        if (view.getMeasuredHeight() != 0) {
            return;
        }
        View view2 = iVar.f72407a;
        view.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), LinearLayoutManager.INVALID_OFFSET));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final void y(i iVar, List list) {
        ((c20.h) iVar.f72418f0.getValue()).a(list);
        AppBarLayout appBarLayout = iVar.f72431s;
        if (appBarLayout != null) {
            if (appBarLayout.isAttachedToWindow()) {
                x(appBarLayout, iVar);
                iVar.f72400T.b();
            } else {
                appBarLayout.addOnAttachStateChangeListener(new l10.k(appBarLayout, iVar));
            }
        }
        LinearLayout linearLayout = iVar.f72432t;
        if (!linearLayout.isAttachedToWindow()) {
            linearLayout.addOnAttachStateChangeListener(new l10.l(linearLayout, iVar));
            return;
        }
        x(linearLayout, iVar);
        C10.e eVar = iVar.f72397Q;
        if (eVar != null) {
            eVar.g(linearLayout.getMeasuredHeight());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    public static final void z(i iVar, List list) {
        iVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c20.h) iVar.f72418f0.getValue()).c(((Number) it.next()).intValue());
        }
    }

    @NotNull
    public final C8042d I() {
        return this.f72389I;
    }

    @NotNull
    public final QZ.a<ru.ozon.composer.ui.widget.l> J() {
        return this.f72437y;
    }

    @NotNull
    public final l10.t K() {
        return (l10.t) this.f72422j.getValue();
    }

    public final Context L() {
        return this.f72424l;
    }

    @NotNull
    public final InterfaceC7851b M() {
        return this.f72438z;
    }

    public final boolean N() {
        return this.f72436x;
    }

    public final Function0<Unit> O() {
        return this.f72393M;
    }

    public final int P() {
        ComposerListBehavior composerListBehavior = this.f72430r;
        if (composerListBehavior != null) {
            return composerListBehavior.getF94802j();
        }
        return 0;
    }

    @NotNull
    public final C4911f Q() {
        return this.f72409b;
    }

    public final Function0<Unit> R() {
        return this.f72395O;
    }

    public final PageIssueStateView S() {
        return this.f72434v;
    }

    public final Function0<Unit> T() {
        return this.f72394N;
    }

    public final Function1<AbstractC10819a.e, Unit> U() {
        return this.f72392L;
    }

    public final l10.e V() {
        return this.f72413d;
    }

    @NotNull
    public final HashMap<Class<? extends InterfaceC6995a>, L10.a<? extends InterfaceC6995a>> W() {
        return this.f72414d0;
    }

    @NotNull
    public final WZ.l X() {
        return this.f72383C;
    }

    @NotNull
    public final View Y() {
        return this.f72407a;
    }

    @NotNull
    public final ViewGroup Z() {
        return this.f72425m;
    }

    @NotNull
    public final a00.h a0() {
        return this.f72411c;
    }

    @NotNull
    public final v b0() {
        return (v) this.f72423k.getValue();
    }

    @NotNull
    public final ru.ozon.composer.ui.widget.f c0() {
        return this.f72382B;
    }

    @NotNull
    public final ru.ozon.composer.ui.widget.a d0() {
        return this.f72381A;
    }

    @NotNull
    public final androidx.recyclerview.widget.g e0() {
        return this.f72426n;
    }

    @NotNull
    public final W10.b f0() {
        return this.f72384D;
    }

    public final boolean g0() {
        return this.f72435w;
    }

    public final void h0() {
        boolean z11;
        Parcelable parcelable = this.f72406Z;
        if (parcelable != null) {
            RecyclerView.o layoutManager = this.f72426n.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
            this.f72406Z = null;
            z11 = true;
        } else {
            z11 = false;
        }
        Function1<? super Boolean, Unit> function1 = this.f72408a0;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    public final void i0(int i11) {
        C8630a c8630a = this.f72400T;
        c8630a.a(i11);
        c8630a.b();
    }

    public final void j0(int i11) {
        View view;
        if (this.f72417f.d() == f.e.REGULAR && (view = this.f72429q) != null) {
            view.setTranslationY(-i11);
        }
    }

    public final void k0(int i11, int i12) {
        ComposerListBehavior composerListBehavior = this.f72430r;
        if (composerListBehavior != null) {
            composerListBehavior.z(i11, i12);
        }
    }

    public final void l0(ComposerNotificationController composerNotificationController) {
        InterfaceC6396b c11 = this.f72415e.c();
        C4911f c4911f = this.f72409b;
        this.f72391K = new C9726a(c11, c4911f, composerNotificationController, new C8973a(c4911f));
    }

    public final void m0(Function0<Unit> function0) {
        this.f72393M = function0;
    }

    public final void n0(int i11) {
        ComposerListBehavior composerListBehavior = this.f72430r;
        if (composerListBehavior != null) {
            composerListBehavior.B(i11);
        }
    }

    public final void o0(Function0<Unit> function0) {
        this.f72395O = function0;
    }

    public final void p0(Function0<Unit> function0) {
        this.f72394N = function0;
    }

    public final void q0(Function1<? super AbstractC10819a.e, Unit> function1) {
        this.f72392L = function1;
    }
}
