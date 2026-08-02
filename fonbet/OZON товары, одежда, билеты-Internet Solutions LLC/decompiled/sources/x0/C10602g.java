package x0;

import B0.C0;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import m0.C8000l;
import m0.C8006o;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9106G;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {174, 272}, m = "invokeSuspend")
/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10602g extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.I f104741d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.M f104742e;

    /* renamed from: f, reason: collision with root package name */
    kotlin.jvm.internal.K f104743f;

    /* renamed from: g, reason: collision with root package name */
    float f104744g;

    /* renamed from: h, reason: collision with root package name */
    float f104745h;

    /* renamed from: i, reason: collision with root package name */
    float f104746i;

    /* renamed from: j, reason: collision with root package name */
    int f104747j;

    /* renamed from: k, reason: collision with root package name */
    int f104748k;

    /* renamed from: l, reason: collision with root package name */
    private /* synthetic */ Object f104749l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f104750m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Z1.d f104751n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ InterfaceC10604i f104752o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ int f104753p;

    /* renamed from: x0.g$a */
    static final class a extends AbstractC7737t implements Function1<C8000l<Float, C8008p>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC10604i f104754b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f104755c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f104756d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f104757e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC9106G f104758f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.I f104759g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f104760h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f104761i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f104762j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f104763k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<C8006o<Float, C8008p>> f104764l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10604i interfaceC10604i, int i11, float f7, kotlin.jvm.internal.J j11, InterfaceC9106G interfaceC9106G, kotlin.jvm.internal.I i12, boolean z11, float f11, kotlin.jvm.internal.K k11, int i13, kotlin.jvm.internal.M m11) {
            super(1);
            this.f104754b = interfaceC10604i;
            this.f104755c = i11;
            this.f104756d = f7;
            this.f104757e = j11;
            this.f104758f = interfaceC9106G;
            this.f104759g = i12;
            this.f104760h = z11;
            this.f104761i = f11;
            this.f104762j = k11;
            this.f104763k = i13;
            this.f104764l = m11;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v24 float, still in use, count: 2, list:
              (r2v24 float) from 0x0029: PHI (r2v21 float) = (r2v6 float), (r2v24 float) binds: [B:39:0x0037, B:6:0x0026] A[DONT_GENERATE, DONT_INLINE]
              (r2v24 float) from 0x0024: CMP_L (r2v24 float), (r7v0 float) A[WRAPPED]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // kotlin.jvm.functions.Function1
        public final kotlin.Unit invoke(m0.C8000l<java.lang.Float, m0.C8008p> r11) {
            /*
                r10 = this;
                m0.l r11 = (m0.C8000l) r11
                x0.i r0 = r10.f104754b
                int r1 = r10.f104755c
                boolean r2 = x0.C10603h.e(r0, r1)
                kotlin.jvm.internal.I r3 = r10.f104759g
                int r4 = r10.f104763k
                r5 = 0
                boolean r6 = r10.f104760h
                if (r2 != 0) goto Lb2
                r2 = 0
                float r7 = r10.f104756d
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 <= 0) goto L2b
                java.lang.Object r2 = r11.e()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r8 <= 0) goto L29
                goto L39
            L29:
                r7 = r2
                goto L39
            L2b:
                java.lang.Object r2 = r11.e()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r8 >= 0) goto L29
            L39:
                kotlin.jvm.internal.J r2 = r10.f104757e
                float r8 = r2.f71784a
                float r7 = r7 - r8
                r0.G r8 = r10.f104758f
                float r8 = r8.a(r7)
                boolean r9 = x0.C10603h.e(r0, r1)
                if (r9 == 0) goto L4b
                goto Lb2
            L4b:
                boolean r9 = x0.C10602g.a(r6, r0, r1, r4)
                if (r9 != 0) goto Lb2
                int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r8 != 0) goto Lac
                float r8 = r2.f71784a
                float r8 = r8 + r7
                r2.f71784a = r8
                float r2 = r10.f104761i
                if (r6 == 0) goto L70
                java.lang.Object r7 = r11.e()
                java.lang.Number r7 = (java.lang.Number) r7
                float r7 = r7.floatValue()
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 <= 0) goto L82
                r11.a()
                goto L82
            L70:
                java.lang.Object r7 = r11.e()
                java.lang.Number r7 = (java.lang.Number) r7
                float r7 = r7.floatValue()
                float r2 = -r2
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 >= 0) goto L82
                r11.a()
            L82:
                kotlin.jvm.internal.K r2 = r10.f104762j
                r7 = 100
                r8 = 2
                if (r6 == 0) goto L9b
                int r2 = r2.f71785a
                if (r2 < r8) goto Lb2
                int r2 = r0.b()
                int r2 = r1 - r2
                if (r2 <= r7) goto Lb2
                int r2 = r1 + (-100)
                r0.c(r2, r5)
                goto Lb2
            L9b:
                int r2 = r2.f71785a
                if (r2 < r8) goto Lb2
                int r2 = r0.a()
                int r2 = r2 - r1
                if (r2 <= r7) goto Lb2
                int r2 = r1 + 100
                r0.c(r2, r5)
                goto Lb2
            Lac:
                r11.a()
                r3.f71783a = r5
                goto Lc7
            Lb2:
                boolean r2 = x0.C10602g.a(r6, r0, r1, r4)
                if (r2 == 0) goto Lc1
                r0.c(r1, r4)
                r3.f71783a = r5
                r11.a()
                goto Lc7
            Lc1:
                boolean r11 = x0.C10603h.e(r0, r1)
                if (r11 != 0) goto Lca
            Lc7:
                kotlin.Unit r11 = kotlin.Unit.f71690a
                return r11
            Lca:
                float r11 = r0.d(r1)
                int r11 = hd.C6915b.c(r11)
                x0.f r0 = new x0.f
                kotlin.jvm.internal.M<m0.o<java.lang.Float, m0.p>> r1 = r10.f104764l
                T r1 = r1.f71787a
                m0.o r1 = (m0.C8006o) r1
                r0.<init>(r11, r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.C10602g.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: x0.g$b */
    static final class b extends AbstractC7737t implements Function1<C8000l<Float, C8008p>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f104765b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f104766c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC9106G f104767d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f7, kotlin.jvm.internal.J j11, InterfaceC9106G interfaceC9106G) {
            super(1);
            this.f104765b = f7;
            this.f104766c = j11;
            this.f104767d = interfaceC9106G;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            if (r1 < r0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
        
            if (r1 > r0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            r0 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            r1 = r0;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Unit invoke(C8000l<Float, C8008p> c8000l) {
            float floatValue;
            C8000l<Float, C8008p> c8000l2 = c8000l;
            float f7 = this.f104765b;
            float f11 = 0.0f;
            if (f7 > 0.0f) {
                floatValue = c8000l2.e().floatValue();
            } else if (f7 < 0.0f) {
                floatValue = c8000l2.e().floatValue();
            }
            kotlin.jvm.internal.J j11 = this.f104766c;
            float f12 = f11 - j11.f71784a;
            if (f12 != this.f104767d.a(f12) || f11 != c8000l2.e().floatValue()) {
                c8000l2.a();
            }
            j11.f71784a += f12;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10602g(int i11, Z1.d dVar, InterfaceC10604i interfaceC10604i, int i12, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f104750m = i11;
        this.f104751n = dVar;
        this.f104752o = interfaceC10604i;
        this.f104753p = i12;
    }

    public static final boolean a(boolean z11, InterfaceC10604i interfaceC10604i, int i11, int i12) {
        if (z11) {
            if (interfaceC10604i.a() > i11) {
                return true;
            }
            return interfaceC10604i.a() == i11 && interfaceC10604i.f() > i12;
        }
        if (interfaceC10604i.a() < i11) {
            return true;
        }
        return interfaceC10604i.a() == i11 && interfaceC10604i.f() < i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C10602g c10602g = new C10602g(this.f104750m, this.f104751n, this.f104752o, this.f104753p, dVar);
        c10602g.f104749l = obj;
        return c10602g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10602g) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d0, code lost:
    
        if (m0.B0.g(r1, r1, null, !r12, r4, r30, 2) == r7) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[Catch: f -> 0x00cb, TryCatch #1 {f -> 0x00cb, blocks: (B:17:0x015d, B:19:0x00a6, B:21:0x00aa, B:23:0x00b0, B:25:0x00be, B:28:0x00d5, B:31:0x0104, B:34:0x0111, B:39:0x014e), top: B:16:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[Catch: f -> 0x00cb, TryCatch #1 {f -> 0x00cb, blocks: (B:17:0x015d, B:19:0x00a6, B:21:0x00aa, B:23:0x00b0, B:25:0x00be, B:28:0x00d5, B:31:0x0104, B:34:0x0111, B:39:0x014e), top: B:16:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, r0.G] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, m0.o] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, m0.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0156 -> B:16:0x015d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        float f7;
        float f11;
        float f12;
        kotlin.jvm.internal.I i11;
        kotlin.jvm.internal.M m11;
        float f13;
        InterfaceC9106G interfaceC9106G;
        kotlin.jvm.internal.K k11;
        float f14;
        float f15;
        int i12;
        float d11;
        float f16;
        C8006o c8006o;
        Float f17;
        kotlin.jvm.internal.I i13;
        boolean z11;
        a aVar;
        kotlin.jvm.internal.M m12;
        InterfaceC9106G interfaceC9106G2;
        float f18;
        float f19;
        Z1.d dVar = this.f104751n;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i14 = this.f104748k;
        int i15 = 30;
        float f21 = 0.0f;
        ?? r102 = 2;
        int i16 = this.f104753p;
        InterfaceC10604i interfaceC10604i = this.f104752o;
        int i17 = this.f104750m;
        boolean z12 = true;
        try {
        } catch (C10601f e11) {
            e = e11;
        }
        if (i14 == 0) {
            Sc.s.b(obj);
            InterfaceC9106G interfaceC9106G3 = (InterfaceC9106G) this.f104749l;
            if (i17 < 0.0f) {
                throw new IllegalArgumentException(P4.f.c("Index should be non-negative (", i17, ')').toString());
            }
            f7 = C10603h.f104769a;
            float v12 = dVar.v1(f7);
            f11 = C10603h.f104770b;
            float v13 = dVar.v1(f11);
            f12 = C10603h.f104771c;
            float v14 = dVar.v1(f12);
            i11 = new kotlin.jvm.internal.I();
            i11.f71783a = true;
            m11 = new kotlin.jvm.internal.M();
            m11.f71787a = C0.a(0.0f, 30, 0.0f);
            if (C10603h.e(interfaceC10604i, i17)) {
                throw new C10601f(C6915b.c(interfaceC10604i.d(i17)), (C8006o) m11.f71787a);
            }
            int i18 = i17 > interfaceC10604i.a() ? 1 : 0;
            kotlin.jvm.internal.K k12 = new kotlin.jvm.internal.K();
            k12.f71785a = 1;
            f13 = v13;
            interfaceC9106G = interfaceC9106G3;
            k11 = k12;
            f14 = v14;
            f15 = v12;
            i12 = i18;
            if (i11.f71783a) {
            }
            return Unit.f71690a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            interfaceC10604i.c(i17, i16);
            return Unit.f71690a;
        }
        int i19 = this.f104747j;
        float f22 = this.f104746i;
        float f23 = this.f104745h;
        float f24 = this.f104744g;
        kotlin.jvm.internal.K k13 = this.f104743f;
        kotlin.jvm.internal.M m13 = this.f104742e;
        kotlin.jvm.internal.I i21 = this.f104741d;
        InterfaceC9106G interfaceC9106G4 = (InterfaceC9106G) this.f104749l;
        Sc.s.b(obj);
        f13 = f23;
        kotlin.jvm.internal.K k14 = k13;
        m11 = m13;
        interfaceC9106G = interfaceC9106G4;
        i12 = i19;
        f15 = f24;
        i11 = i21;
        f14 = f22;
        try {
            k14.f71785a++;
            k11 = k14;
            i15 = 30;
            f21 = 0.0f;
            z12 = true;
        } catch (C10601f e12) {
            e = e12;
            r102 = interfaceC9106G;
            C8006o b11 = C0.b(e.b(), 0.0f, 0.0f, 30);
            float a11 = e.a() + i16;
            kotlin.jvm.internal.J j11 = new kotlin.jvm.internal.J();
            Float f25 = new Float(a11);
            if (((Number) b11.o()).floatValue() != 0.0f) {
            }
            b bVar = new b(a11, j11, r102);
            this.f104749l = r102;
            this.f104741d = null;
            this.f104742e = null;
            this.f104743f = null;
            this.f104748k = 2;
        }
        if (i11.f71783a && interfaceC10604i.getItemCount() > 0) {
            try {
                d11 = interfaceC10604i.d(i17) + i16;
                if (Math.abs(d11) >= f15) {
                    f16 = i12 != 0 ? f15 : -f15;
                } else {
                    f16 = Math.max(Math.abs(d11), f14);
                    if (i12 == 0) {
                        f16 = -f16;
                    }
                }
                m11.f71787a = C0.b((C8006o) m11.f71787a, f21, f21, i15);
                kotlin.jvm.internal.J j12 = new kotlin.jvm.internal.J();
                c8006o = (C8006o) m11.f71787a;
                f17 = new Float(f16);
                i13 = i11;
                z11 = ((Number) ((C8006o) m11.f71787a).o()).floatValue() != f21 ? false : z12;
                m12 = m11;
                aVar = new a(this.f104752o, this.f104750m, f16, j12, interfaceC9106G, i13, i12 == 0 ? z12 : false, f13, k11, this.f104753p, m12);
                this.f104749l = interfaceC9106G2;
                this.f104741d = i13;
                this.f104742e = m12;
                this.f104743f = k14;
                this.f104744g = f15;
                this.f104745h = f18;
                this.f104746i = f14;
                this.f104747j = i12;
                this.f104748k = 1;
                interfaceC9106G = interfaceC9106G2;
                f19 = f15;
            } catch (C10601f e13) {
                e = e13;
                interfaceC9106G = interfaceC9106G2;
                r102 = interfaceC9106G;
                C8006o b112 = C0.b(e.b(), 0.0f, 0.0f, 30);
                float a112 = e.a() + i16;
                kotlin.jvm.internal.J j112 = new kotlin.jvm.internal.J();
                Float f252 = new Float(a112);
                boolean z13 = ((Number) b112.o()).floatValue() != 0.0f;
                b bVar2 = new b(a112, j112, r102);
                this.f104749l = r102;
                this.f104741d = null;
                this.f104742e = null;
                this.f104743f = null;
                this.f104748k = 2;
            }
            interfaceC9106G2 = interfaceC9106G;
            f18 = f13;
            k14 = k11;
            if (B0.g(c8006o, f17, null, z11, aVar, this, 2) != aVar2) {
                return aVar2;
            }
            f13 = f18;
            m11 = m12;
            f15 = f19;
            i11 = i13;
            k14.f71785a++;
            k11 = k14;
            i15 = 30;
            f21 = 0.0f;
            z12 = true;
            if (i11.f71783a) {
                d11 = interfaceC10604i.d(i17) + i16;
                if (Math.abs(d11) >= f15) {
                }
                m11.f71787a = C0.b((C8006o) m11.f71787a, f21, f21, i15);
                kotlin.jvm.internal.J j122 = new kotlin.jvm.internal.J();
                c8006o = (C8006o) m11.f71787a;
                f17 = new Float(f16);
                i13 = i11;
                if (((Number) ((C8006o) m11.f71787a).o()).floatValue() != f21) {
                }
                m12 = m11;
                aVar = new a(this.f104752o, this.f104750m, f16, j122, interfaceC9106G, i13, i12 == 0 ? z12 : false, f13, k11, this.f104753p, m12);
                interfaceC9106G2 = interfaceC9106G;
                f18 = f13;
                k14 = k11;
                this.f104749l = interfaceC9106G2;
                this.f104741d = i13;
                this.f104742e = m12;
                this.f104743f = k14;
                this.f104744g = f15;
                this.f104745h = f18;
                this.f104746i = f14;
                this.f104747j = i12;
                this.f104748k = 1;
                interfaceC9106G = interfaceC9106G2;
                f19 = f15;
                if (B0.g(c8006o, f17, null, z11, aVar, this, 2) != aVar2) {
                }
            }
        }
        return Unit.f71690a;
    }
}
