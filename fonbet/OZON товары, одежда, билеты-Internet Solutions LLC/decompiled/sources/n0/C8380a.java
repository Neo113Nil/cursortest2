package n0;

import S0.C3991w0;
import S0.n1;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C5236c1;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.C9140t;
import x1.C10638m;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8380a implements W {

    /* renamed from: a, reason: collision with root package name */
    private C7459e f76127a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8399t f76128b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f76129c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f76130d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f76131e;

    /* renamed from: f, reason: collision with root package name */
    private long f76132f;

    /* renamed from: g, reason: collision with root package name */
    private x1.w f76133g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f76134h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {533, 559}, m = "applyToFling-BMRW4eQ")
    /* renamed from: n0.a$a, reason: collision with other inner class name */
    static final class C1281a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C8380a f76135d;

        /* renamed from: e, reason: collision with root package name */
        long f76136e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76137f;

        /* renamed from: h, reason: collision with root package name */
        int f76139h;

        C1281a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f76137f = obj;
            this.f76139h |= LinearLayoutManager.INVALID_OFFSET;
            return C8380a.this.d(0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", l = {638}, m = "invokeSuspend")
    /* renamed from: n0.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76140d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f76141e;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", l = {639, 643}, m = "invokeSuspend")
        /* renamed from: n0.a$b$a, reason: collision with other inner class name */
        static final class C1282a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f76143d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f76144e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C8380a f76145f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1282a(C8380a c8380a, kotlin.coroutines.d<? super C1282a> dVar) {
                super(2, dVar);
                this.f76145f = c8380a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C1282a c1282a = new C1282a(this.f76145f, dVar);
                c1282a.f76144e = obj;
                return c1282a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1282a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
            
                if (r12 != r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
            
                if (r12 == r0) goto L16;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:6:0x005f). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC10628c interfaceC10628c;
                Object obj2;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f76143d;
                C8380a c8380a = this.f76145f;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    interfaceC10628c = (InterfaceC10628c) this.f76144e;
                    this.f76144e = interfaceC10628c;
                    this.f76143d = 1;
                    obj = C9115P.d(interfaceC10628c, null, this, 2);
                } else if (i11 == 1) {
                    interfaceC10628c = (InterfaceC10628c) this.f76144e;
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC10628c = (InterfaceC10628c) this.f76144e;
                    Sc.s.b(obj);
                    List<x1.x> b11 = ((C10638m) obj).b();
                    ArrayList arrayList = new ArrayList(b11.size());
                    int size = b11.size();
                    int i12 = 0;
                    for (int i13 = 0; i13 < size; i13++) {
                        x1.x xVar = b11.get(i13);
                        if (xVar.g()) {
                            arrayList.add(xVar);
                        }
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        if (i12 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i12);
                        if (x1.w.b(((x1.x) obj2).d(), c8380a.f76133g)) {
                            break;
                        }
                        i12++;
                    }
                    x1.x xVar2 = (x1.x) obj2;
                    if (xVar2 == null) {
                        xVar2 = (x1.x) C7714v.M(arrayList);
                    }
                    if (xVar2 != null) {
                        c8380a.f76133g = x1.w.a(xVar2.d());
                        c8380a.f76127a = C7459e.a(xVar2.f());
                    }
                    if (arrayList.isEmpty()) {
                        c8380a.f76133g = null;
                        return Unit.f71690a;
                    }
                    this.f76144e = interfaceC10628c;
                    this.f76143d = 2;
                    obj = interfaceC10628c.i0(EnumC10640o.Main, this);
                }
                x1.x xVar3 = (x1.x) obj;
                c8380a.f76133g = x1.w.a(xVar3.d());
                c8380a.f76127a = C7459e.a(xVar3.f());
                this.f76144e = interfaceC10628c;
                this.f76143d = 2;
                obj = interfaceC10628c.i0(EnumC10640o.Main, this);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = C8380a.this.new b(dVar);
            bVar.f76141e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76140d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f76141e;
                C1282a c1282a = new C1282a(C8380a.this, null);
                this.f76140d = 1;
                if (C9140t.b(f7, c1282a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C8380a(@NotNull Context context, @NotNull C8379U c8379u) {
        C8399t c8399t = new C8399t(context, C7811b0.i(c8379u.b()));
        this.f76128b = c8399t;
        Unit unit = Unit.f71690a;
        this.f76129c = n1.f(unit, n1.h());
        this.f76130d = true;
        this.f76132f = 0L;
        this.f76134h = x1.L.b(androidx.compose.ui.e.f40358c0, unit, new b(null)).l0(Build.VERSION.SDK_INT >= 31 ? new C8398s(this, c8399t, C5236c1.a()) : new C8396q(this, c8399t, c8379u, C5236c1.a()));
    }

    private final void h() {
        EdgeEffect edgeEffect;
        boolean z11;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        C8399t c8399t = this.f76128b;
        edgeEffect = c8399t.f76224d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = edgeEffect.isFinished();
        } else {
            z11 = false;
        }
        edgeEffect2 = c8399t.f76225e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 = edgeEffect2.isFinished() || z11;
        }
        edgeEffect3 = c8399t.f76226f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 = edgeEffect3.isFinished() || z11;
        }
        edgeEffect4 = c8399t.f76227g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z11 = edgeEffect4.isFinished() || z11;
        }
        if (z11) {
            k();
        }
    }

    private final float l(long j11) {
        float g10 = C7459e.g(i());
        float h11 = C7459e.h(j11) / C7464j.d(this.f76132f);
        EdgeEffect f7 = this.f76128b.f();
        float f11 = -h11;
        float f12 = 1 - g10;
        int i11 = Build.VERSION.SDK_INT;
        C8381b c8381b = C8381b.f76147a;
        if (i11 >= 31) {
            f11 = c8381b.c(f7, f11, f12);
        } else {
            f7.onPull(f11, f12);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c8381b.b(f7) : 0.0f) == 0.0f ? C7464j.d(this.f76132f) * (-f11) : C7459e.h(j11);
    }

    private final float m(long j11) {
        float h11 = C7459e.h(i());
        float g10 = C7459e.g(j11) / C7464j.f(this.f76132f);
        EdgeEffect h12 = this.f76128b.h();
        float f7 = 1 - h11;
        int i11 = Build.VERSION.SDK_INT;
        C8381b c8381b = C8381b.f76147a;
        if (i11 >= 31) {
            g10 = c8381b.c(h12, g10, f7);
        } else {
            h12.onPull(g10, f7);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c8381b.b(h12) : 0.0f) == 0.0f ? C7464j.f(this.f76132f) * g10 : C7459e.g(j11);
    }

    private final float n(long j11) {
        float h11 = C7459e.h(i());
        float g10 = C7459e.g(j11) / C7464j.f(this.f76132f);
        EdgeEffect j12 = this.f76128b.j();
        float f7 = -g10;
        int i11 = Build.VERSION.SDK_INT;
        C8381b c8381b = C8381b.f76147a;
        if (i11 >= 31) {
            f7 = c8381b.c(j12, f7, h11);
        } else {
            j12.onPull(f7, h11);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c8381b.b(j12) : 0.0f) == 0.0f ? C7464j.f(this.f76132f) * (-f7) : C7459e.g(j11);
    }

    private final float o(long j11) {
        float g10 = C7459e.g(i());
        float h11 = C7459e.h(j11) / C7464j.d(this.f76132f);
        EdgeEffect l11 = this.f76128b.l();
        int i11 = Build.VERSION.SDK_INT;
        C8381b c8381b = C8381b.f76147a;
        if (i11 >= 31) {
            h11 = c8381b.c(l11, h11, g10);
        } else {
            l11.onPull(h11, g10);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c8381b.b(l11) : 0.0f) == 0.0f ? C7464j.d(this.f76132f) * h11 : C7459e.h(j11);
    }

    @Override // n0.W
    public final boolean a() {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        C8399t c8399t = this.f76128b;
        edgeEffect = c8399t.f76224d;
        C8381b c8381b = C8381b.f76147a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c8381b.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        edgeEffect2 = c8399t.f76225e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c8381b.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        edgeEffect3 = c8399t.f76226f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c8381b.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        edgeEffect4 = c8399t.f76227g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c8381b.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // n0.W
    @NotNull
    public final androidx.compose.ui.e b() {
        return this.f76134h;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    @Override // n0.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j11, int i11, @NotNull Function1<? super C7459e, C7459e> function1) {
        float l11;
        float n11;
        long a11;
        boolean z11;
        boolean z12;
        EdgeEffect f7;
        EdgeEffect l12;
        EdgeEffect j12;
        boolean z13;
        boolean z14;
        if (C7464j.g(this.f76132f)) {
            return function1.invoke(C7459e.a(j11)).n();
        }
        boolean z15 = this.f76131e;
        boolean z16 = true;
        C8399t c8399t = this.f76128b;
        if (!z15) {
            if (c8399t.s()) {
                m(0L);
            }
            if (c8399t.v()) {
                n(0L);
            }
            if (c8399t.z()) {
                o(0L);
            }
            if (c8399t.p()) {
                l(0L);
            }
            this.f76131e = true;
        }
        if (C7459e.h(j11) != 0.0f) {
            if (c8399t.z()) {
                l11 = o(j11);
                if (!c8399t.z()) {
                    c8399t.l().onRelease();
                }
            } else if (c8399t.p()) {
                l11 = l(j11);
                if (!c8399t.p()) {
                    c8399t.f().onRelease();
                }
            }
            if (C7459e.g(j11) != 0.0f) {
                if (c8399t.s()) {
                    n11 = m(j11);
                    if (!c8399t.s()) {
                        c8399t.h().onRelease();
                    }
                } else if (c8399t.v()) {
                    n11 = n(j11);
                    if (!c8399t.v()) {
                        c8399t.j().onRelease();
                    }
                }
                a11 = P9.a.a(n11, l11);
                if (!C7459e.d(a11, 0L)) {
                    k();
                }
                long j13 = C7459e.j(j11, a11);
                long n12 = function1.invoke(C7459e.a(j13)).n();
                long j14 = C7459e.j(j13, n12);
                if (i11 == 1) {
                    if (C7459e.g(j14) > 0.5f) {
                        m(j14);
                    } else {
                        if (C7459e.g(j14) >= -0.5f) {
                            z13 = false;
                            if (C7459e.h(j14) <= 0.5f) {
                                o(j14);
                            } else if (C7459e.h(j14) < -0.5f) {
                                l(j14);
                            } else {
                                z14 = false;
                                if (!z13 || z14) {
                                    z11 = true;
                                    if (c8399t.q() || C7459e.g(j11) >= 0.0f) {
                                        z12 = false;
                                    } else {
                                        EdgeEffect h11 = c8399t.h();
                                        float g10 = C7459e.g(j11);
                                        if (h11 instanceof C8362C) {
                                            ((C8362C) h11).a(g10);
                                        } else {
                                            h11.onRelease();
                                        }
                                        z12 = !c8399t.q();
                                    }
                                    if (c8399t.t() && C7459e.g(j11) > 0.0f) {
                                        j12 = c8399t.j();
                                        float g11 = C7459e.g(j11);
                                        if (j12 instanceof C8362C) {
                                            j12.onRelease();
                                        } else {
                                            ((C8362C) j12).a(g11);
                                        }
                                        z12 = (z12 && c8399t.t()) ? false : true;
                                    }
                                    if (c8399t.x() && C7459e.h(j11) < 0.0f) {
                                        l12 = c8399t.l();
                                        float h12 = C7459e.h(j11);
                                        if (l12 instanceof C8362C) {
                                            l12.onRelease();
                                        } else {
                                            ((C8362C) l12).a(h12);
                                        }
                                        z12 = (z12 && c8399t.x()) ? false : true;
                                    }
                                    if (c8399t.n() && C7459e.h(j11) > 0.0f) {
                                        f7 = c8399t.f();
                                        float h13 = C7459e.h(j11);
                                        if (f7 instanceof C8362C) {
                                            f7.onRelease();
                                        } else {
                                            ((C8362C) f7).a(h13);
                                        }
                                        z12 = (z12 && c8399t.n()) ? false : true;
                                    }
                                    if (!z12 && !z11) {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        k();
                                    }
                                    return C7459e.k(a11, n12);
                                }
                            }
                            z14 = true;
                            if (!z13) {
                            }
                            z11 = true;
                            if (c8399t.q()) {
                            }
                            z12 = false;
                            if (c8399t.t()) {
                                j12 = c8399t.j();
                                float g112 = C7459e.g(j11);
                                if (j12 instanceof C8362C) {
                                }
                                if (z12) {
                                }
                            }
                            if (c8399t.x()) {
                                l12 = c8399t.l();
                                float h122 = C7459e.h(j11);
                                if (l12 instanceof C8362C) {
                                }
                                if (z12) {
                                }
                            }
                            if (c8399t.n()) {
                                f7 = c8399t.f();
                                float h132 = C7459e.h(j11);
                                if (f7 instanceof C8362C) {
                                }
                                if (z12) {
                                }
                            }
                            if (!z12) {
                                z16 = false;
                            }
                            if (z16) {
                            }
                            return C7459e.k(a11, n12);
                        }
                        n(j14);
                    }
                    z13 = true;
                    if (C7459e.h(j14) <= 0.5f) {
                    }
                    z14 = true;
                    if (!z13) {
                    }
                    z11 = true;
                    if (c8399t.q()) {
                    }
                    z12 = false;
                    if (c8399t.t()) {
                    }
                    if (c8399t.x()) {
                    }
                    if (c8399t.n()) {
                    }
                    if (!z12) {
                    }
                    if (z16) {
                    }
                    return C7459e.k(a11, n12);
                }
                z11 = false;
                if (c8399t.q()) {
                }
                z12 = false;
                if (c8399t.t()) {
                }
                if (c8399t.x()) {
                }
                if (c8399t.n()) {
                }
                if (!z12) {
                }
                if (z16) {
                }
                return C7459e.k(a11, n12);
            }
            n11 = 0.0f;
            a11 = P9.a.a(n11, l11);
            if (!C7459e.d(a11, 0L)) {
            }
            long j132 = C7459e.j(j11, a11);
            long n122 = function1.invoke(C7459e.a(j132)).n();
            long j142 = C7459e.j(j132, n122);
            if (i11 == 1) {
            }
            z11 = false;
            if (c8399t.q()) {
            }
            z12 = false;
            if (c8399t.t()) {
            }
            if (c8399t.x()) {
            }
            if (c8399t.n()) {
            }
            if (!z12) {
            }
            if (z16) {
            }
            return C7459e.k(a11, n122);
        }
        l11 = 0.0f;
        if (C7459e.g(j11) != 0.0f) {
        }
        n11 = 0.0f;
        a11 = P9.a.a(n11, l11);
        if (!C7459e.d(a11, 0L)) {
        }
        long j1322 = C7459e.j(j11, a11);
        long n1222 = function1.invoke(C7459e.a(j1322)).n();
        long j1422 = C7459e.j(j1322, n1222);
        if (i11 == 1) {
        }
        z11 = false;
        if (c8399t.q()) {
        }
        z12 = false;
        if (c8399t.t()) {
        }
        if (c8399t.x()) {
        }
        if (c8399t.n()) {
        }
        if (!z12) {
        }
        if (z16) {
        }
        return C7459e.k(a11, n1222);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0057, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // n0.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j11, @NotNull Function2<? super Z1.w, ? super kotlin.coroutines.d<? super Z1.w>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C1281a c1281a;
        int i11;
        float f7;
        float f11;
        long e11;
        C8380a c8380a;
        long e12;
        float c11;
        if (dVar instanceof C1281a) {
            c1281a = (C1281a) dVar;
            int i12 = c1281a.f76139h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1281a.f76139h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c1281a.f76137f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1281a.f76139h;
                if (i11 == 0) {
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e11 = c1281a.f76136e;
                    c8380a = c1281a.f76135d;
                    Sc.s.b(obj);
                    e12 = Z1.w.e(e11, ((Z1.w) obj).i());
                    c8380a.f76131e = false;
                    c11 = Z1.w.c(e12);
                    C8399t c8399t = c8380a.f76128b;
                    if (c11 <= 0.0f) {
                        EdgeEffect h11 = c8399t.h();
                        int c12 = C6915b.c(Z1.w.c(e12));
                        if (Build.VERSION.SDK_INT >= 31) {
                            h11.onAbsorb(c12);
                        } else if (h11.isFinished()) {
                            h11.onAbsorb(c12);
                        }
                    } else if (Z1.w.c(e12) < 0.0f) {
                        EdgeEffect j12 = c8399t.j();
                        int i13 = -C6915b.c(Z1.w.c(e12));
                        if (Build.VERSION.SDK_INT >= 31) {
                            j12.onAbsorb(i13);
                        } else if (j12.isFinished()) {
                            j12.onAbsorb(i13);
                        }
                    }
                    if (Z1.w.d(e12) <= 0.0f) {
                        EdgeEffect l11 = c8399t.l();
                        int c13 = C6915b.c(Z1.w.d(e12));
                        if (Build.VERSION.SDK_INT >= 31) {
                            l11.onAbsorb(c13);
                        } else if (l11.isFinished()) {
                            l11.onAbsorb(c13);
                        }
                    } else if (Z1.w.d(e12) < 0.0f) {
                        EdgeEffect f12 = c8399t.f();
                        int i14 = -C6915b.c(Z1.w.d(e12));
                        if (Build.VERSION.SDK_INT >= 31) {
                            f12.onAbsorb(i14);
                        } else if (f12.isFinished()) {
                            f12.onAbsorb(i14);
                        }
                    }
                    if (e12 != 0) {
                        c8380a.k();
                    }
                    c8380a.h();
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
                if (C7464j.g(this.f76132f)) {
                    Z1.w a11 = Z1.w.a(j11);
                    c1281a.f76139h = 1;
                } else {
                    float c14 = Z1.w.c(j11);
                    C8399t c8399t2 = this.f76128b;
                    if (c14 > 0.0f && c8399t2.s()) {
                        EdgeEffect h12 = c8399t2.h();
                        int c15 = C6915b.c(Z1.w.c(j11));
                        if (Build.VERSION.SDK_INT >= 31) {
                            h12.onAbsorb(c15);
                        } else if (h12.isFinished()) {
                            h12.onAbsorb(c15);
                        }
                        f7 = Z1.w.c(j11);
                    } else if (Z1.w.c(j11) >= 0.0f || !c8399t2.v()) {
                        f7 = 0.0f;
                    } else {
                        EdgeEffect j13 = c8399t2.j();
                        int i15 = -C6915b.c(Z1.w.c(j11));
                        if (Build.VERSION.SDK_INT >= 31) {
                            j13.onAbsorb(i15);
                        } else if (j13.isFinished()) {
                            j13.onAbsorb(i15);
                        }
                        f7 = Z1.w.c(j11);
                    }
                    if (Z1.w.d(j11) > 0.0f && c8399t2.z()) {
                        EdgeEffect l12 = c8399t2.l();
                        int c16 = C6915b.c(Z1.w.d(j11));
                        if (Build.VERSION.SDK_INT >= 31) {
                            l12.onAbsorb(c16);
                        } else if (l12.isFinished()) {
                            l12.onAbsorb(c16);
                        }
                        f11 = Z1.w.d(j11);
                    } else if (Z1.w.d(j11) >= 0.0f || !c8399t2.p()) {
                        f11 = 0.0f;
                    } else {
                        EdgeEffect f13 = c8399t2.f();
                        int i16 = -C6915b.c(Z1.w.d(j11));
                        if (Build.VERSION.SDK_INT >= 31) {
                            f13.onAbsorb(i16);
                        } else if (f13.isFinished()) {
                            f13.onAbsorb(i16);
                        }
                        f11 = Z1.w.d(j11);
                    }
                    long a12 = Fl0.b.a(f7, f11);
                    if (a12 != 0) {
                        k();
                    }
                    e11 = Z1.w.e(j11, a12);
                    Z1.w a13 = Z1.w.a(e11);
                    c1281a.f76135d = this;
                    c1281a.f76136e = e11;
                    c1281a.f76139h = 2;
                    obj = function2.invoke(a13, c1281a);
                    if (obj != aVar) {
                        c8380a = this;
                        e12 = Z1.w.e(e11, ((Z1.w) obj).i());
                        c8380a.f76131e = false;
                        c11 = Z1.w.c(e12);
                        C8399t c8399t3 = c8380a.f76128b;
                        if (c11 <= 0.0f) {
                        }
                        if (Z1.w.d(e12) <= 0.0f) {
                        }
                        if (e12 != 0) {
                        }
                        c8380a.h();
                        return Unit.f71690a;
                    }
                }
                return aVar;
            }
        }
        c1281a = new C1281a((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c1281a.f76137f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c1281a.f76139h;
        if (i11 == 0) {
        }
    }

    public final long i() {
        C7459e c7459e = this.f76127a;
        long n11 = c7459e != null ? c7459e.n() : C7465k.b(this.f76132f);
        return P9.a.a(C7459e.g(n11) / C7464j.f(this.f76132f), C7459e.h(n11) / C7464j.d(this.f76132f));
    }

    @NotNull
    public final C3991w0 j() {
        return this.f76129c;
    }

    public final void k() {
        if (this.f76130d) {
            this.f76129c.setValue(Unit.f71690a);
        }
    }

    public final void p(long j11) {
        boolean c11 = C7464j.c(this.f76132f, 0L);
        boolean c12 = C7464j.c(j11, this.f76132f);
        this.f76132f = j11;
        if (!c12) {
            this.f76128b.A(Z1.r.a(C6915b.c(C7464j.f(j11)), C6915b.c(C7464j.d(j11))));
        }
        if (c11 || c12) {
            return;
        }
        k();
        h();
    }
}
