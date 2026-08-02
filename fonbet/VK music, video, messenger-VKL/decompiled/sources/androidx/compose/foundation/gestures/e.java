package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragDetectionState;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.c4g0;
import xsna.cmb0;
import xsna.dot;
import xsna.epx;
import xsna.fa2;
import xsna.fdi;
import xsna.fho;
import xsna.idp0;
import xsna.itl;
import xsna.izs;
import xsna.j5g;
import xsna.jw5;
import xsna.kmb0;
import xsna.lgo;
import xsna.m200;
import xsna.muw;
import xsna.myc0;
import xsna.nm8;
import xsna.nuw;
import xsna.nvi;
import xsna.ogo;
import xsna.oot;
import xsna.ov70;
import xsna.ovi;
import xsna.plb0;
import xsna.pot;
import xsna.puw;
import xsna.qta;
import xsna.rut0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.spj;
import xsna.uvi;
import xsna.w0b;
import xsna.wlb0;
import xsna.wzs;
import xsna.xlb0;
import xsna.ytl;
import xsna.yvj;
import xsna.z2o0;
import xsna.zv70;
import xsna.zvj;

/* compiled from: Draggable.kt */
/* loaded from: classes11.dex */
public abstract class e extends ytl implements cmb0, puw, nvi, dot {
    public DragDetectionState.AwaitDown A;
    public DragDetectionState.c B;
    public DragDetectionState.b C;
    public DragDetectionState.a D;
    public DragDetectionState E;
    public com.vk.comments.impl.a F;
    public idp0 H;
    public IndirectPointerInputDragCycleDetector I;
    public Orientation r;
    public izs<? super kmb0, Boolean> s;
    public boolean t;
    public sg50 u;
    public oot v;
    public nm8 w;
    public ogo.b x;
    public boolean y;
    public boolean z;
    public long G = 9205357640488583168L;
    public long J = 0;

    /* compiled from: Draggable.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Draggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {IronSourceError.ERROR_CODE_INIT_FAILED, 510, 512, 519, 521, IronSourceError.ERROR_PLACEMENT_CAPPED}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: Draggable.kt */
        @b6l(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {515}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements wzs<izs<? super d.b, ? extends s3q0>, spj<? super s3q0>, Object> {
            final /* synthetic */ Ref$ObjectRef<d> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref$ObjectRef<d> ref$ObjectRef, e eVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$event = ref$ObjectRef;
                this.this$0 = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$event, this.this$0, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(izs<? super d.b, ? extends s3q0> izsVar, spj<? super s3q0> spjVar) {
                return ((a) create(izsVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:6:0x0057). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:5:0x0054). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                izs izsVar;
                d dVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    izsVar = (izs) this.L$0;
                    dVar = this.$event.element;
                    if (dVar instanceof d.C0006d) {
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref$ObjectRef<d> ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                izsVar = (izs) this.L$0;
                kotlin.a.a(obj);
                T t = (d) obj;
                ref$ObjectRef.element = t;
                dVar = this.$event.element;
                if (!(dVar instanceof d.C0006d) || (dVar instanceof d.a)) {
                    return s3q0.a;
                }
                t = 0;
                d.b bVar = dVar instanceof d.b ? (d.b) dVar : null;
                if (bVar != null) {
                    izsVar.invoke(bVar);
                }
                ref$ObjectRef = this.$event;
                nm8 nm8Var = this.this$0.w;
                if (nm8Var != null) {
                    this.L$0 = izsVar;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    obj = nm8Var.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    T t2 = (d) obj;
                }
                ref$ObjectRef.element = t2;
                dVar = this.$event.element;
                if (dVar instanceof d.C0006d) {
                }
                return s3q0.a;
            }
        }

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = e.this.new b(spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
        
            if (r7.p2(r4, r6) != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
        
            if (androidx.compose.foundation.gestures.e.l2(r7, r6) == r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
        
            if (androidx.compose.foundation.gestures.e.l2(r7, r6) != r0) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:30:0x00d1, B:27:0x00bd], limit reached: 56 */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008a -> B:8:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cc -> B:8:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d3 -> B:8:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e2 -> B:8:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f2 -> B:7:0x0025). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            Ref$ObjectRef ref$ObjectRef3;
            yvj yvjVar2;
            yvj yvjVar3;
            T t;
            T t2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.label) {
                case 0:
                    kotlin.a.a(obj);
                    yvjVar = (yvj) this.L$0;
                    if (zvj.f(yvjVar)) {
                        ref$ObjectRef = new Ref$ObjectRef();
                        nm8 nm8Var = e.this.w;
                        if (nm8Var != null) {
                            this.L$0 = yvjVar;
                            this.L$1 = ref$ObjectRef;
                            this.L$2 = ref$ObjectRef;
                            this.label = 1;
                            obj = nm8Var.a(this);
                            if (obj != coroutineSingletons) {
                                ref$ObjectRef2 = ref$ObjectRef;
                                t = (d) obj;
                                ref$ObjectRef.element = t;
                                t2 = ref$ObjectRef2.element;
                                if (t2 instanceof d.c) {
                                    this.L$0 = yvjVar;
                                    this.L$1 = ref$ObjectRef2;
                                    this.L$2 = null;
                                    this.label = 2;
                                    if (e.m2(e.this, (d.c) t2, this) != coroutineSingletons) {
                                        ref$ObjectRef3 = ref$ObjectRef2;
                                        yvjVar2 = yvjVar;
                                        e eVar = e.this;
                                        a aVar = new a(ref$ObjectRef3, eVar, null);
                                        this.L$0 = yvjVar2;
                                        this.L$1 = ref$ObjectRef3;
                                        this.label = 3;
                                        break;
                                    }
                                }
                                if (zvj.f(yvjVar)) {
                                    return s3q0.a;
                                }
                            }
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef;
                        t = 0;
                        ref$ObjectRef.element = t;
                        t2 = ref$ObjectRef2.element;
                        if (t2 instanceof d.c) {
                        }
                        if (zvj.f(yvjVar)) {
                        }
                    }
                case 1:
                    ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                    ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                    yvjVar = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    t = (d) obj;
                    ref$ObjectRef.element = t;
                    t2 = ref$ObjectRef2.element;
                    if (t2 instanceof d.c) {
                    }
                    if (zvj.f(yvjVar)) {
                    }
                    break;
                case 2:
                    ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                    yvjVar2 = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    e eVar2 = e.this;
                    a aVar2 = new a(ref$ObjectRef3, eVar2, null);
                    this.L$0 = yvjVar2;
                    this.L$1 = ref$ObjectRef3;
                    this.label = 3;
                    break;
                case 3:
                    ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                    yvjVar2 = (yvj) this.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (CancellationException unused) {
                        yvjVar3 = yvjVar2;
                        e eVar3 = e.this;
                        this.L$0 = yvjVar3;
                        this.L$1 = null;
                        this.label = 6;
                        break;
                    }
                    yvjVar = yvjVar2;
                    try {
                    } catch (CancellationException unused2) {
                        yvjVar3 = yvjVar;
                        e eVar32 = e.this;
                        this.L$0 = yvjVar3;
                        this.L$1 = null;
                        this.label = 6;
                    }
                    T t3 = ref$ObjectRef3.element;
                    if (t3 instanceof d.C0006d) {
                        this.L$0 = yvjVar;
                        this.L$1 = null;
                        this.label = 4;
                        if (e.n2(e.this, (d.C0006d) t3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (zvj.f(yvjVar)) {
                        }
                    } else {
                        if (t3 instanceof d.a) {
                            e eVar4 = e.this;
                            this.L$0 = yvjVar;
                            this.L$1 = null;
                            this.label = 5;
                            break;
                        }
                        if (zvj.f(yvjVar)) {
                        }
                    }
                    break;
                case 4:
                    yvjVar3 = (yvj) this.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (CancellationException unused3) {
                        e eVar322 = e.this;
                        this.L$0 = yvjVar3;
                        this.L$1 = null;
                        this.label = 6;
                        break;
                    }
                    yvjVar = yvjVar3;
                    if (zvj.f(yvjVar)) {
                    }
                    break;
                case 5:
                    yvjVar3 = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    yvjVar = yvjVar3;
                    if (zvj.f(yvjVar)) {
                    }
                    break;
                case 6:
                    yvjVar3 = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    yvjVar = yvjVar3;
                    if (zvj.f(yvjVar)) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public e(izs<? super kmb0, Boolean> izsVar, boolean z, sg50 sg50Var, Orientation orientation) {
        this.r = orientation;
        this.s = izsVar;
        this.t = z;
        this.u = sg50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l2(e eVar, ContinuationImpl continuationImpl) {
        f fVar;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof f) {
            fVar = (f) continuationImpl;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ogo.b bVar = eVar.x;
                    if (bVar != null) {
                        sg50 sg50Var = eVar.u;
                        if (sg50Var != null) {
                            ogo.a aVar = new ogo.a(bVar);
                            fVar.label = 1;
                            if (sg50Var.a(aVar, fVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    eVar.v2(new d.C0006d(0L, false));
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                eVar.x = null;
                eVar.v2(new d.C0006d(0L, false));
                return s3q0.a;
            }
        }
        fVar = new f(eVar, continuationImpl);
        Object obj2 = fVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.label;
        if (i != 0) {
        }
        eVar.x = null;
        eVar.v2(new d.C0006d(0L, false));
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r2.a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2(e eVar, d.c cVar, ContinuationImpl continuationImpl) {
        g gVar;
        int i;
        ogo.b bVar;
        sg50 sg50Var;
        d.c cVar2;
        ogo.b bVar2;
        eVar.getClass();
        if (continuationImpl instanceof g) {
            gVar = (g) continuationImpl;
            int i2 = gVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.label = i2 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ogo.b bVar3 = eVar.x;
                    if (bVar3 != null && (r2 = eVar.u) != null) {
                        ogo.a aVar = new ogo.a(bVar3);
                        gVar.L$0 = cVar;
                        gVar.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ogo.b) gVar.L$1;
                        cVar2 = (d.c) gVar.L$0;
                        kotlin.a.a(obj);
                        bVar = bVar2;
                        cVar = cVar2;
                        eVar.x = bVar;
                        eVar.u2(cVar.a);
                        return s3q0.a;
                    }
                    cVar = (d.c) gVar.L$0;
                    kotlin.a.a(obj);
                }
                bVar = new ogo.b();
                sg50Var = eVar.u;
                if (sg50Var != null) {
                    gVar.L$0 = cVar;
                    gVar.L$1 = bVar;
                    gVar.label = 2;
                    if (sg50Var.a(bVar, gVar) != coroutineSingletons) {
                        cVar2 = cVar;
                        bVar2 = bVar;
                        bVar = bVar2;
                        cVar = cVar2;
                    }
                    return coroutineSingletons;
                }
                eVar.x = bVar;
                eVar.u2(cVar.a);
                return s3q0.a;
            }
        }
        gVar = new g(eVar, continuationImpl);
        Object obj2 = gVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gVar.label;
        if (i != 0) {
        }
        bVar = new ogo.b();
        sg50Var = eVar.u;
        if (sg50Var != null) {
        }
        eVar.x = bVar;
        eVar.u2(cVar.a);
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n2(e eVar, d.C0006d c0006d, ContinuationImpl continuationImpl) {
        h hVar;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof h) {
            hVar = (h) continuationImpl;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ogo.b bVar = eVar.x;
                    if (bVar != null) {
                        sg50 sg50Var = eVar.u;
                        if (sg50Var != null) {
                            ogo.c cVar = new ogo.c(bVar);
                            hVar.L$0 = c0006d;
                            hVar.label = 1;
                            if (sg50Var.a(cVar, hVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    eVar.v2(c0006d);
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0006d = (d.C0006d) hVar.L$0;
                kotlin.a.a(obj);
                eVar.x = null;
                eVar.v2(c0006d);
                return s3q0.a;
            }
        }
        hVar = new h(eVar, continuationImpl);
        Object obj2 = hVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hVar.label;
        if (i != 0) {
        }
        eVar.x = null;
        eVar.v2(c0006d);
        return s3q0.a;
    }

    public static void s2(e eVar, xlb0 xlb0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        DragDetectionState.b bVar = eVar.C;
        if (bVar == null) {
            bVar = new DragDetectionState.b();
            bVar.a = null;
            bVar.b = Long.MAX_VALUE;
            bVar.c = false;
            eVar.C = bVar;
        }
        bVar.a = xlb0Var;
        bVar.b = j;
        idp0 idp0Var = eVar.H;
        if (idp0Var == null) {
            eVar.H = new idp0(eVar.r, 2);
        } else {
            idp0Var.a = eVar.r;
            idp0Var.b = j2;
        }
        bVar.c = false;
        eVar.E = bVar;
    }

    public abstract boolean A2();

    public final void B2() {
        this.y = true;
        if (this.w == null) {
            this.w = w0b.a(Integer.MAX_VALUE, null, null, 6);
        }
        myc0.h(W1(), null, null, new b(null), 3);
    }

    public final void C2(izs<? super kmb0, Boolean> izsVar, boolean z, sg50 sg50Var, Orientation orientation, boolean z2) {
        this.s = izsVar;
        boolean z3 = true;
        if (this.t != z) {
            this.t = z;
            if (!z) {
                o2();
                this.I = null;
            }
            z2 = true;
        }
        if (!epx.f(this.u, sg50Var)) {
            o2();
            this.u = sg50Var;
        }
        if (this.r != orientation) {
            this.r = orientation;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.z) {
                q2();
                if (this.y) {
                    w2().f(d.a.a);
                }
                this.F = null;
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.I;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.a();
                e eVar = indirectPointerInputDragCycleDetector.a;
                if (eVar.y) {
                    eVar.t2(d.a.a);
                }
                indirectPointerInputDragCycleDetector.g = null;
                zv70 zv70Var = indirectPointerInputDragCycleDetector.k;
                zv70Var.a = 0;
                zv70Var.b.b = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    @Override // xsna.puw
    public final void E1(fa2 fa2Var, PointerEventPass pointerEventPass) {
        Object obj;
        Object obj2;
        nuw nuwVar;
        nuw nuwVar2;
        nuw nuwVar3;
        int i = fa2Var.b;
        ArrayList arrayList = fa2Var.a;
        if (this.v == null) {
            oot ootVar = new oot(this);
            i2(ootVar);
            this.v = ootVar;
        }
        if (this.t) {
            if (this.I == null) {
                this.I = new IndirectPointerInputDragCycleDetector(this);
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.I;
            if (indirectPointerInputDragCycleDetector != null) {
                e eVar = indirectPointerInputDragCycleDetector.a;
                if (indirectPointerInputDragCycleDetector.f == null) {
                    IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown awaitDown = indirectPointerInputDragCycleDetector.b;
                    if (awaitDown == null) {
                        awaitDown = new IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown(0);
                        indirectPointerInputDragCycleDetector.b = awaitDown;
                    }
                    indirectPointerInputDragCycleDetector.f = awaitDown;
                }
                IndirectPointerInputDragCycleDetector.DragDetectionState dragDetectionState = indirectPointerInputDragCycleDetector.f;
                if (dragDetectionState == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                boolean z = true;
                if (dragDetectionState instanceof IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown) {
                    IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown awaitDown2 = (IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown) dragDetectionState;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!c4g0.h((nuw) arrayList.get(i2))) {
                            return;
                        }
                    }
                    nuw nuwVar4 = (nuw) j5g.Y(arrayList);
                    IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = IndirectPointerInputDragCycleDetector.a.$EnumSwitchMapping$0[awaitDown2.a.ordinal()] == 1 ? !eVar.A2() ? IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.No : awaitDown2.a;
                    awaitDown2.a = awaitTouchSlop;
                    if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                        nuwVar4.i = true;
                        awaitDown2.b = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (awaitTouchSlop == IndirectPointerInputDragCycleDetector.DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                            IndirectPointerInputDragCycleDetector.c(indirectPointerInputDragCycleDetector, nuwVar4, nuwVar4.a, 0L, 12);
                            return;
                        }
                        if (awaitDown2.b) {
                            indirectPointerInputDragCycleDetector.f(nuwVar4, nuwVar4, new muw(i), 0L);
                            indirectPointerInputDragCycleDetector.e(nuwVar4, new muw(i), 0L);
                            long j = nuwVar4.a;
                            IndirectPointerInputDragCycleDetector.DragDetectionState.c cVar = indirectPointerInputDragCycleDetector.c;
                            if (cVar == null) {
                                cVar = new IndirectPointerInputDragCycleDetector.DragDetectionState.c();
                                cVar.a = Long.MAX_VALUE;
                                indirectPointerInputDragCycleDetector.c = cVar;
                            }
                            cVar.a = j;
                            indirectPointerInputDragCycleDetector.f = cVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(dragDetectionState instanceof IndirectPointerInputDragCycleDetector.DragDetectionState.b)) {
                    if (dragDetectionState instanceof IndirectPointerInputDragCycleDetector.DragDetectionState.a) {
                        IndirectPointerInputDragCycleDetector.DragDetectionState.a aVar = (IndirectPointerInputDragCycleDetector.DragDetectionState.a) dragDetectionState;
                        if (pointerEventPass != PointerEventPass.Final) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            if (((nuw) arrayList.get(i3)).i) {
                                z = false;
                                break;
                            }
                            i3++;
                        }
                        int size3 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                break;
                            }
                            if (!((nuw) arrayList.get(i4)).d) {
                                i4++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    long e = ov70.e(c4g0.A((nuw) j5g.Y(arrayList), eVar.r, new muw(i)), c4g0.A(aVar.a, eVar.r, new muw(i)));
                                    nuw nuwVar5 = aVar.a;
                                    if (nuwVar5 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    IndirectPointerInputDragCycleDetector.c(indirectPointerInputDragCycleDetector, nuwVar5, aVar.b, e, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        indirectPointerInputDragCycleDetector.a();
                        return;
                    }
                    if (!(dragDetectionState instanceof IndirectPointerInputDragCycleDetector.DragDetectionState.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IndirectPointerInputDragCycleDetector.DragDetectionState.c cVar2 = (IndirectPointerInputDragCycleDetector.DragDetectionState.c) dragDetectionState;
                    if (pointerEventPass != PointerEventPass.Main) {
                        return;
                    }
                    long j2 = cVar2.a;
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i5);
                        if (wlb0.g(((nuw) obj).a, j2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    nuw nuwVar6 = (nuw) obj;
                    if (nuwVar6 == null) {
                        return;
                    }
                    if (!c4g0.g(nuwVar6)) {
                        if (nuwVar6.i) {
                            eVar.t2(d.a.a);
                            return;
                        } else {
                            if (ov70.d(c4g0.z(nuwVar6, eVar.r, new muw(i), true)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                return;
                            }
                            indirectPointerInputDragCycleDetector.e(nuwVar6, new muw(i), c4g0.z(nuwVar6, eVar.r, new muw(i), false));
                            nuwVar6.i = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i6);
                        if (((nuw) obj2).d) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    nuw nuwVar7 = (nuw) obj2;
                    if (nuwVar7 != null) {
                        cVar2.a = nuwVar7.a;
                        return;
                    }
                    if (nuwVar6.i || !c4g0.g(nuwVar6)) {
                        eVar.t2(d.a.a);
                    } else {
                        c4g0.a(indirectPointerInputDragCycleDetector.d(), nuwVar6, eVar.r, new muw(i), indirectPointerInputDragCycleDetector.j, indirectPointerInputDragCycleDetector.l);
                        float h = ((rut0) ovi.a(eVar, uvi.t)).h();
                        long d = indirectPointerInputDragCycleDetector.d().d(m200.b(h, h));
                        androidx.compose.ui.input.pointer.util.a aVar2 = (androidx.compose.ui.input.pointer.util.a) indirectPointerInputDragCycleDetector.d().b;
                        VelocityTracker1D velocityTracker1D = aVar2.a;
                        jw5.p(null, velocityTracker1D.d);
                        velocityTracker1D.e = 0;
                        VelocityTracker1D velocityTracker1D2 = aVar2.b;
                        jw5.p(null, velocityTracker1D2.d);
                        velocityTracker1D2.e = 0;
                        aVar2.c = 0L;
                        eVar.t2(new d.C0006d(fho.c(d), true));
                    }
                    indirectPointerInputDragCycleDetector.a();
                    return;
                }
                IndirectPointerInputDragCycleDetector.DragDetectionState.b bVar = (IndirectPointerInputDragCycleDetector.DragDetectionState.b) dragDetectionState;
                if (pointerEventPass == PointerEventPass.Initial) {
                    return;
                }
                int size6 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        nuwVar = null;
                        break;
                    }
                    ?? r10 = arrayList.get(i7);
                    if (wlb0.g(((nuw) r10).a, bVar.b)) {
                        nuwVar = r10;
                        break;
                    }
                    i7++;
                }
                nuw nuwVar8 = nuwVar;
                if (nuwVar8 == null) {
                    int size7 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            nuwVar3 = 0;
                            break;
                        }
                        nuwVar3 = arrayList.get(i8);
                        if (((nuw) nuwVar3).d) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    nuwVar8 = nuwVar3;
                    if (nuwVar8 == null) {
                        indirectPointerInputDragCycleDetector.a();
                        return;
                    }
                    bVar.b = nuwVar8.a;
                }
                nuw nuwVar9 = nuwVar8;
                if (pointerEventPass == PointerEventPass.Main) {
                    if (nuwVar9.i) {
                        nuw nuwVar10 = bVar.a;
                        if (nuwVar10 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j3 = bVar.b;
                        idp0 idp0Var = indirectPointerInputDragCycleDetector.i;
                        if (idp0Var == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        indirectPointerInputDragCycleDetector.b(nuwVar10, j3, idp0Var);
                    } else if (c4g0.g(nuwVar9)) {
                        int size8 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size8) {
                                nuwVar2 = null;
                                break;
                            }
                            ?? r6 = arrayList.get(i9);
                            if (((nuw) r6).d) {
                                nuwVar2 = r6;
                                break;
                            }
                            i9++;
                        }
                        nuw nuwVar11 = nuwVar2;
                        if (nuwVar11 == null) {
                            indirectPointerInputDragCycleDetector.a();
                        } else {
                            bVar.b = nuwVar11.a;
                        }
                    } else {
                        rut0 rut0Var = (rut0) ovi.a(eVar, uvi.t);
                        float f = lgo.a;
                        float e2 = rut0Var.e();
                        idp0 idp0Var2 = indirectPointerInputDragCycleDetector.i;
                        if (idp0Var2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long a2 = idp0Var2.a(c4g0.z(nuwVar9, eVar.r, new muw(i), true), e2, true);
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            nuwVar9.i = true;
                            indirectPointerInputDragCycleDetector.f(bVar.a, nuwVar9, new muw(i), a2);
                            indirectPointerInputDragCycleDetector.e(nuwVar9, new muw(i), a2);
                            long j4 = nuwVar9.a;
                            IndirectPointerInputDragCycleDetector.DragDetectionState.c cVar3 = indirectPointerInputDragCycleDetector.c;
                            if (cVar3 == null) {
                                cVar3 = new IndirectPointerInputDragCycleDetector.DragDetectionState.c();
                                cVar3.a = Long.MAX_VALUE;
                                indirectPointerInputDragCycleDetector.c = cVar3;
                            }
                            cVar3.a = j4;
                            indirectPointerInputDragCycleDetector.f = cVar3;
                        } else {
                            bVar.c = true;
                        }
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && bVar.c) {
                    if (!nuwVar9.i) {
                        bVar.c = false;
                        return;
                    }
                    nuw nuwVar12 = bVar.a;
                    if (nuwVar12 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j5 = bVar.b;
                    idp0 idp0Var3 = indirectPointerInputDragCycleDetector.i;
                    if (idp0Var3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    indirectPointerInputDragCycleDetector.b(nuwVar12, j5, idp0Var3);
                }
            }
        }
    }

    @Override // xsna.cmb0
    public void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        xlb0 xlb0Var;
        xlb0 xlb0Var2;
        xlb0 xlb0Var3;
        xlb0 xlb0Var4;
        xlb0 xlb0Var5;
        boolean z = true;
        this.z = true;
        if (this.v == null) {
            oot ootVar = new oot(this);
            i2(ootVar);
            this.v = ootVar;
        }
        if (this.t) {
            int i = 0;
            if (this.E == null) {
                DragDetectionState.AwaitDown awaitDown = this.A;
                if (awaitDown == null) {
                    awaitDown = new DragDetectionState.AwaitDown(0);
                    this.A = awaitDown;
                }
                this.E = awaitDown;
            }
            DragDetectionState dragDetectionState = this.E;
            if (dragDetectionState == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            if (dragDetectionState instanceof DragDetectionState.AwaitDown) {
                DragDetectionState.AwaitDown awaitDown2 = (DragDetectionState.AwaitDown) dragDetectionState;
                if (!plb0Var.a.isEmpty() && z2o0.f(plb0Var, false, false)) {
                    xlb0 xlb0Var6 = (xlb0) j5g.Y(plb0Var.a);
                    DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = a.$EnumSwitchMapping$0[awaitDown2.a.ordinal()] == 1 ? !A2() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No : awaitDown2.a;
                    awaitDown2.a = awaitTouchSlop;
                    if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                        xlb0Var6.a();
                        awaitDown2.b = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                            s2(this, xlb0Var6, xlb0Var6.a, 0L, 12);
                            return;
                        }
                        if (awaitDown2.b) {
                            z2(xlb0Var6, xlb0Var6, 0L);
                            y2(0L, xlb0Var6);
                            long j2 = xlb0Var6.a;
                            DragDetectionState.c cVar = this.B;
                            if (cVar == null) {
                                cVar = new DragDetectionState.c();
                                cVar.a = Long.MAX_VALUE;
                                this.B = cVar;
                            }
                            cVar.a = j2;
                            this.E = cVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(dragDetectionState instanceof DragDetectionState.b)) {
                if (dragDetectionState instanceof DragDetectionState.a) {
                    DragDetectionState.a aVar = (DragDetectionState.a) dragDetectionState;
                    if (pointerEventPass != PointerEventPass.Final) {
                        return;
                    }
                    List<xlb0> list = plb0Var.a;
                    List<xlb0> list2 = list;
                    int size = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (list.get(i2).c()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    int size2 = list2.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!list.get(i).d) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z) {
                                long e = ov70.e(((xlb0) j5g.Y(list)).c, aVar.a.c);
                                xlb0 xlb0Var7 = aVar.a;
                                if (xlb0Var7 == null) {
                                    throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                }
                                s2(this, xlb0Var7, aVar.b, e, 8);
                                return;
                            }
                            return;
                        }
                    }
                    q2();
                    return;
                }
                if (!(dragDetectionState instanceof DragDetectionState.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                DragDetectionState.c cVar2 = (DragDetectionState.c) dragDetectionState;
                if (pointerEventPass != PointerEventPass.Main) {
                    return;
                }
                long j3 = cVar2.a;
                List<xlb0> list3 = plb0Var.a;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        xlb0Var = null;
                        break;
                    }
                    xlb0Var = list3.get(i3);
                    if (wlb0.g(xlb0Var.a, j3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                xlb0 xlb0Var8 = xlb0Var;
                if (xlb0Var8 == null) {
                    return;
                }
                if (!fdi.o(xlb0Var8)) {
                    if (xlb0Var8.c()) {
                        w2().f(d.a.a);
                        return;
                    } else {
                        if (ov70.d(fdi.E(xlb0Var8, true)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return;
                        }
                        y2(fdi.E(xlb0Var8, false), xlb0Var8);
                        xlb0Var8.a();
                        return;
                    }
                }
                List<xlb0> list4 = plb0Var.a;
                int size4 = list4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        xlb0Var2 = null;
                        break;
                    }
                    xlb0Var2 = list4.get(i4);
                    if (xlb0Var2.d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                xlb0 xlb0Var9 = xlb0Var2;
                if (xlb0Var9 != null) {
                    cVar2.a = xlb0Var9.a;
                    return;
                }
                if (xlb0Var8.c() || !fdi.o(xlb0Var8)) {
                    w2().f(d.a.a);
                } else {
                    s200.q(x2(), xlb0Var8, 0L);
                    float h = ((rut0) ovi.a(this, uvi.t)).h();
                    long d = x2().d(m200.b(h, h));
                    androidx.compose.ui.input.pointer.util.a aVar2 = (androidx.compose.ui.input.pointer.util.a) x2().b;
                    VelocityTracker1D velocityTracker1D = aVar2.a;
                    jw5.p(null, velocityTracker1D.d);
                    velocityTracker1D.e = 0;
                    VelocityTracker1D velocityTracker1D2 = aVar2.b;
                    jw5.p(null, velocityTracker1D2.d);
                    velocityTracker1D2.e = 0;
                    aVar2.c = 0L;
                    w2().f(new d.C0006d(fho.c(d), false));
                    this.z = false;
                }
                q2();
                return;
            }
            DragDetectionState.b bVar = (DragDetectionState.b) dragDetectionState;
            if (pointerEventPass == PointerEventPass.Initial) {
                return;
            }
            List<xlb0> list5 = plb0Var.a;
            List<xlb0> list6 = list5;
            int size5 = list6.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    xlb0Var3 = null;
                    break;
                }
                xlb0 xlb0Var10 = list5.get(i5);
                if (wlb0.g(xlb0Var10.a, bVar.b)) {
                    xlb0Var3 = xlb0Var10;
                    break;
                }
                i5++;
            }
            xlb0 xlb0Var11 = xlb0Var3;
            if (xlb0Var11 == null) {
                int size6 = list6.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        xlb0Var5 = null;
                        break;
                    }
                    xlb0Var5 = list5.get(i6);
                    if (xlb0Var5.d) {
                        break;
                    } else {
                        i6++;
                    }
                }
                xlb0Var11 = xlb0Var5;
                if (xlb0Var11 == null) {
                    q2();
                    return;
                }
                bVar.b = xlb0Var11.a;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (xlb0Var11.c()) {
                    xlb0 xlb0Var12 = bVar.a;
                    if (xlb0Var12 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j4 = bVar.b;
                    idp0 idp0Var = this.H;
                    if (idp0Var == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    r2(xlb0Var12, j4, idp0Var);
                } else if (fdi.o(xlb0Var11)) {
                    int size7 = list6.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size7) {
                            xlb0Var4 = null;
                            break;
                        }
                        xlb0Var4 = list5.get(i7);
                        if (xlb0Var4.d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    xlb0 xlb0Var13 = xlb0Var4;
                    if (xlb0Var13 == null) {
                        q2();
                    } else {
                        bVar.b = xlb0Var13.a;
                    }
                } else {
                    float k = lgo.k((rut0) ovi.a(this, uvi.t), xlb0Var11.i);
                    idp0 idp0Var2 = this.H;
                    if (idp0Var2 == null) {
                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                    }
                    long a2 = idp0Var2.a(fdi.E(xlb0Var11, true), k, true);
                    if ((9223372034707292159L & a2) != 9205357640488583168L) {
                        boolean H1 = H1(xlb0Var11);
                        dot a3 = pot.a(this);
                        boolean z2 = a3 != null && a3.H1(xlb0Var11);
                        if (H1 || !z2) {
                            xlb0Var11.a();
                            z2(bVar.a, xlb0Var11, a2);
                            y2(a2, xlb0Var11);
                            long j5 = xlb0Var11.a;
                            DragDetectionState.c cVar3 = this.B;
                            if (cVar3 == null) {
                                cVar3 = new DragDetectionState.c();
                                cVar3.a = Long.MAX_VALUE;
                                this.B = cVar3;
                            }
                            cVar3.a = j5;
                            this.E = cVar3;
                        } else {
                            bVar.c = true;
                        }
                    } else {
                        bVar.c = true;
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Final && bVar.c) {
                if (!xlb0Var11.c()) {
                    bVar.c = false;
                    return;
                }
                xlb0 xlb0Var14 = bVar.a;
                if (xlb0Var14 == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long j6 = bVar.b;
                idp0 idp0Var3 = this.H;
                if (idp0Var3 == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                r2(xlb0Var14, j6, idp0Var3);
            }
        }
    }

    @Override // xsna.dot
    public final boolean H1(xlb0 xlb0Var) {
        if (fdi.m(xlb0Var)) {
            return this.t;
        }
        if (!fdi.o(xlb0Var)) {
            if (this.H == null) {
                this.H = new idp0(this.r, 2);
            }
            float e = ((rut0) ovi.a(this, uvi.t)).e();
            long E = fdi.E(xlb0Var, false);
            idp0 idp0Var = this.H;
            if (idp0Var == null) {
                throw new IllegalArgumentException("Touch slop detector not initialized.");
            }
            if (!ov70.c(idp0Var.a(E, e, false), 9205357640488583168L)) {
                long f = ov70.f(idp0Var.b, E);
                double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (f & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (f >> 32))))) * 180) / 3.141592653589793d;
                Orientation orientation = idp0Var.a;
                int i = orientation == null ? -1 : idp0.a.$EnumSwitchMapping$0[orientation.ordinal()];
                if (i == 1 ? atan2 < 30.0d : !(i != 2 || atan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.puw
    public final void J0() {
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.I;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.a();
            e eVar = indirectPointerInputDragCycleDetector.a;
            if (eVar.y) {
                eVar.t2(d.a.a);
            }
            indirectPointerInputDragCycleDetector.g = null;
            zv70 zv70Var = indirectPointerInputDragCycleDetector.k;
            zv70Var.a = 0;
            zv70Var.b.b = 0;
        }
    }

    @Override // xsna.dot
    public final boolean S0(nuw nuwVar) {
        return c4g0.h(nuwVar) && this.t;
    }

    @Override // xsna.q630.c
    public final void b2() {
        this.y = false;
        o2();
        this.J = 0L;
        oot ootVar = this.v;
        if (ootVar != null) {
            j2(ootVar);
        }
        this.v = null;
    }

    @Override // xsna.cmb0
    public final void h1() {
        if (this.z) {
            q2();
            if (this.y) {
                w2().f(d.a.a);
            }
            this.F = null;
        }
        this.z = false;
    }

    public final void o2() {
        ogo.b bVar = this.x;
        if (bVar != null) {
            sg50 sg50Var = this.u;
            if (sg50Var != null) {
                sg50Var.c(new ogo.a(bVar));
            }
            this.x = null;
        }
    }

    public abstract Object p2(b.a aVar, b bVar);

    public final void q2() {
        DragDetectionState.AwaitDown awaitDown = this.A;
        if (awaitDown == null) {
            awaitDown = new DragDetectionState.AwaitDown(0);
            this.A = awaitDown;
        }
        awaitDown.a = DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized;
        awaitDown.b = false;
        this.E = awaitDown;
    }

    public final void r2(xlb0 xlb0Var, long j, idp0 idp0Var) {
        DragDetectionState.a aVar = this.D;
        if (aVar == null) {
            aVar = new DragDetectionState.a();
            aVar.a = null;
            aVar.b = Long.MAX_VALUE;
            this.D = aVar;
        }
        aVar.a = xlb0Var;
        aVar.b = j;
        idp0Var.b = 0L;
        this.E = aVar;
    }

    public final void t2(d dVar) {
        if ((dVar instanceof d.c) && !this.y) {
            this.y = true;
            B2();
        }
        w2().f(dVar);
    }

    public abstract void u2(long j);

    public abstract void v2(d.C0006d c0006d);

    public final qta<d> w2() {
        nm8 nm8Var = this.w;
        if (nm8Var != null) {
            return nm8Var;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    public final com.vk.comments.impl.a x2() {
        com.vk.comments.impl.a aVar = this.F;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void y2(long j, xlb0 xlb0Var) {
        long k = itl.e(this.b).k(0L);
        if (!ov70.c(this.G, 9205357640488583168L) && !ov70.c(k, this.G)) {
            this.J = ov70.f(this.J, ov70.e(k, this.G));
        }
        this.G = k;
        s200.q(x2(), xlb0Var, this.J);
        w2().f(new d.b(j, false));
    }

    public final void z2(xlb0 xlb0Var, xlb0 xlb0Var2, long j) {
        if (this.F == null) {
            this.F = new com.vk.comments.impl.a();
        }
        s200.q(x2(), xlb0Var, 0L);
        long e = ov70.e(xlb0Var2.c, j);
        this.J = 0L;
        if (this.s.invoke(new kmb0(xlb0Var.i)).booleanValue()) {
            if (!this.y) {
                if (this.w == null) {
                    this.w = w0b.a(Integer.MAX_VALUE, null, null, 6);
                }
                B2();
            }
            this.G = itl.e(this).k(0L);
            w2().f(new d.c(e));
        }
    }
}
