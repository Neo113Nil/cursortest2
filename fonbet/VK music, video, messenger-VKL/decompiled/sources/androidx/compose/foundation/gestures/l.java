package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.gestures.e;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ahh0;
import xsna.azl;
import xsna.b6l;
import xsna.bdy;
import xsna.bip0;
import xsna.ck;
import xsna.cxr;
import xsna.dc30;
import xsna.dhh0;
import xsna.dxr;
import xsna.e160;
import xsna.e490;
import xsna.ed8;
import xsna.ehh0;
import xsna.epx;
import xsna.fd8;
import xsna.fgi0;
import xsna.fhh0;
import xsna.hlk0;
import xsna.in60;
import xsna.itl;
import xsna.j670;
import xsna.j6e0;
import xsna.jhh0;
import xsna.jmr0;
import xsna.jtl;
import xsna.k160;
import xsna.khh0;
import xsna.kmb0;
import xsna.lgj;
import xsna.lva0;
import xsna.m7l;
import xsna.myc0;
import xsna.n160;
import xsna.ndy;
import xsna.oot;
import xsna.p62;
import xsna.plb0;
import xsna.qcy;
import xsna.qgi0;
import xsna.s3q0;
import xsna.sg50;
import xsna.spj;
import xsna.tgi0;
import xsna.tpr;
import xsna.u05;
import xsna.wfi0;
import xsna.wzs;
import xsna.x1o0;
import xsna.xb30;
import xsna.xlb0;
import xsna.yhp0;
import xsna.yvj;
import xsna.zel;
import xsna.zhh0;
import xsna.zq70;

/* compiled from: Scrollable.kt */
/* loaded from: classes11.dex */
public final class l extends e implements ndy, fgi0 {
    public e490 K;
    public tpr L;
    public final e160 M;
    public final zel N;
    public final zhh0 O;
    public final dhh0 P;
    public final cxr Q;
    public final lgj R;
    public u05 S;
    public jhh0 T;
    public xb30 U;
    public yhp0 V;

    /* compiled from: Scrollable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {394}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ d.C0006d $event;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d.C0006d c0006d, l lVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$event = c0006d;
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$event, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                d.C0006d c0006d = this.$event;
                float f = c0006d.b ? -1.0f : 1.0f;
                zhh0 zhh0Var = this.this$0.O;
                long f2 = jmr0.f(f, c0006d.a);
                this.label = 1;
                if (zhh0Var.b(f2, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Scrollable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {552}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $scrollAmount;
        int label;

        /* compiled from: Scrollable.kt */
        @b6l(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
            final /* synthetic */ long $scrollAmount;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$scrollAmount = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$scrollAmount, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
                return ((a) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((n160) this.L$0).b(this.$scrollAmount);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$scrollAmount = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return l.this.new b(this.$scrollAmount, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zhh0 zhh0Var = l.this.O;
                MutatePriority mutatePriority = MutatePriority.UserInput;
                a aVar = new a(this.$scrollAmount, null);
                this.label = 1;
                if (zhh0Var.f(mutatePriority, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [xsna.tpr] */
    public l(Orientation orientation, fd8 fd8Var, tpr tprVar, sg50 sg50Var, e490 e490Var, khh0 khh0Var, boolean z, boolean z2) {
        super(ahh0.a, z, sg50Var, orientation);
        this.K = e490Var;
        this.L = tprVar;
        e160 e160Var = new e160();
        this.M = e160Var;
        zel zelVar = new zel(new m7l(new hlk0(ahh0.d)));
        this.N = zelVar;
        e490 e490Var2 = this.K;
        ?? r1 = this.L;
        zhh0 zhh0Var = new zhh0(khh0Var, e490Var2, r1 == 0 ? zelVar : r1, orientation, z2, e160Var, this, new in60(this, 13));
        this.O = zhh0Var;
        dhh0 dhh0Var = new dhh0(zhh0Var, z);
        this.P = dhh0Var;
        dxr dxrVar = new dxr(null, 2, 10);
        i2(dxrVar);
        this.Q = dxrVar;
        lgj lgjVar = new lgj(orientation, zhh0Var, z2, fd8Var, new lva0(this, 13));
        i2(lgjVar);
        this.R = lgjVar;
        i2(new k160(dhh0Var, e160Var));
        ed8 ed8Var = new ed8();
        ed8Var.p = lgjVar;
        i2(ed8Var);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final boolean A2() {
        zhh0 zhh0Var = this.O;
        if (zhh0Var.a.a()) {
            return true;
        }
        e490 e490Var = zhh0Var.b;
        return e490Var != null ? e490Var.a() : false;
    }

    public final void D2(Orientation orientation, fd8 fd8Var, tpr tprVar, sg50 sg50Var, e490 e490Var, khh0 khh0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.t != z) {
            this.P.c = z;
            z3 = true;
        } else {
            z3 = false;
        }
        tpr tprVar2 = tprVar == null ? this.N : tprVar;
        zhh0 zhh0Var = this.O;
        if (!epx.f(zhh0Var.a, khh0Var)) {
            zhh0Var.a = khh0Var;
            z5 = true;
        }
        zhh0Var.b = e490Var;
        if (zhh0Var.d != orientation) {
            zhh0Var.d = orientation;
            z5 = true;
        }
        if (zhh0Var.e != z2) {
            zhh0Var.e = z2;
        } else {
            z4 = z5;
        }
        zhh0Var.c = tprVar2;
        zhh0Var.f = this.M;
        lgj lgjVar = this.R;
        lgjVar.p = orientation;
        lgjVar.r = z2;
        lgjVar.s = fd8Var;
        this.K = e490Var;
        this.L = tprVar;
        j6e0 j6e0Var = ahh0.a;
        Orientation orientation2 = zhh0Var.d;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        C2(j6e0Var, z, sg50Var, orientation3, z4);
        if (z3) {
            this.S = null;
            this.T = null;
            itl.f(this).R();
        }
    }

    @Override // androidx.compose.foundation.gestures.e, xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        int i;
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (this.s.invoke(new kmb0(list.get(i2).i)).booleanValue()) {
                super.H(plb0Var, pointerEventPass, j);
                break;
            }
            i2++;
        }
        if (this.v == null) {
            oot ootVar = new oot(this);
            i2(ootVar);
            this.v = ootVar;
        }
        if (this.t) {
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            zhh0 zhh0Var = this.O;
            if (pointerEventPass == pointerEventPass2 && plb0Var.f == 6) {
                if (this.U == null) {
                    this.U = new xb30(zhh0Var, new p62(ViewConfiguration.get(jtl.a(this).getContext())), new ehh0(2, this, l.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), itl.f(this).z);
                }
                xb30 xb30Var = this.U;
                if (xb30Var != null) {
                    yvj W1 = W1();
                    if (xb30Var.h == null) {
                        xb30Var.h = myc0.h(W1, null, null, new dc30(xb30Var, null), 3);
                    }
                }
            }
            xb30 xb30Var2 = this.U;
            if (xb30Var2 != null && plb0Var.f == 6) {
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (pointerEventPass == PointerEventPass.Initial && xb30Var2.d) {
                            xb30Var2.f(plb0Var, j);
                            j670.a(plb0Var);
                        }
                        if (pointerEventPass == PointerEventPass.Main && !xb30Var2.d && xb30Var2.f(plb0Var, j)) {
                            j670.a(plb0Var);
                        }
                    } else if (list.get(i3).c()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && ((i = plb0Var.f) == 10 || i == 11 || i == 12)) {
                if (this.V == null) {
                    this.V = new yhp0(zhh0Var, new fhh0(2, this, l.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4), itl.f(this).z);
                }
                yhp0 yhp0Var = this.V;
                if (yhp0Var != null) {
                    yvj W12 = W1();
                    if (yhp0Var.g == null) {
                        yhp0Var.g = myc0.h(W12, null, null, new bip0(yhp0Var, null), 3);
                    }
                }
            }
            yhp0 yhp0Var2 = this.V;
            if (yhp0Var2 != null) {
                int i4 = plb0Var.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    int size3 = list.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (list.get(i5).c()) {
                            return;
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Initial && yhp0Var2.d) {
                        yhp0Var2.d(plb0Var);
                        j670.a(plb0Var);
                    }
                    if (pointerEventPass == PointerEventPass.Main && !yhp0Var2.d && yhp0Var2.d(plb0Var)) {
                        j670.a(plb0Var);
                    }
                }
            }
        }
    }

    @Override // xsna.ndy
    public final boolean J1(KeyEvent keyEvent) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (!this.t) {
            return false;
        }
        if ((!bdy.a(zq70.u(keyEvent), bdy.D) && !bdy.a(x1o0.b(keyEvent.getKeyCode()), bdy.C)) || zq70.w(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        Orientation orientation = this.O.d;
        Orientation orientation2 = Orientation.Vertical;
        lgj lgjVar = this.R;
        if (orientation == orientation2) {
            int j2 = (int) (lgjVar.j2() & 4294967295L);
            float f = bdy.a(x1o0.b(keyEvent.getKeyCode()), bdy.C) ? j2 : -j2;
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits2 = Float.floatToRawIntBits(f);
        } else {
            int j22 = (int) (lgjVar.j2() >> 32);
            floatToRawIntBits = Float.floatToRawIntBits(bdy.a(x1o0.b(keyEvent.getKeyCode()), bdy.C) ? j22 : -j22);
            floatToRawIntBits2 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        myc0.h(W1(), null, null, new b((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), null), 3);
        return true;
    }

    @Override // xsna.ndy
    public final boolean T(KeyEvent keyEvent) {
        return false;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        if (this.o) {
            azl azlVar = itl.f(this).z;
            zel zelVar = this.N;
            zelVar.getClass();
            zelVar.a = new m7l(new hlk0(azlVar));
        }
        xb30 xb30Var = this.U;
        if (xb30Var != null) {
            xb30Var.c = itl.f(this).z;
        }
        yhp0 yhp0Var = this.V;
        if (yhp0Var != null) {
            yhp0Var.c = itl.f(this).z;
        }
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        if (this.t && (this.S == null || this.T == null)) {
            this.S = new u05(this, 9);
            this.T = new jhh0(this, null);
        }
        u05 u05Var = this.S;
        if (u05Var != null) {
            qcy<Object>[] qcyVarArr = qgi0.a;
            tgi0Var.a(wfi0.d, new ck(null, u05Var));
        }
        jhh0 jhh0Var = this.T;
        if (jhh0Var != null) {
            qcy<Object>[] qcyVarArr2 = qgi0.a;
            tgi0Var.a(wfi0.e, jhh0Var);
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public final Object p2(e.b.a aVar, e.b bVar) {
        MutatePriority mutatePriority = MutatePriority.UserInput;
        zhh0 zhh0Var = this.O;
        Object f = zhh0Var.f(mutatePriority, new k(null, aVar, zhh0Var), bVar);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : s3q0.a;
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        h1();
        if (this.o) {
            azl azlVar = itl.f(this).z;
            zel zelVar = this.N;
            zelVar.getClass();
            zelVar.a = new m7l(new hlk0(azlVar));
        }
        xb30 xb30Var = this.U;
        if (xb30Var != null) {
            xb30Var.c = itl.f(this).z;
        }
        yhp0 yhp0Var = this.V;
        if (yhp0Var != null) {
            yhp0Var.c = itl.f(this).z;
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void v2(d.C0006d c0006d) {
        myc0.h(this.M.c(), null, null, new a(c0006d, this, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void u2(long j) {
    }
}
