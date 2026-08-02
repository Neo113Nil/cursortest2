package com.vk.video.ui.upload.impl.publish.presentation.description.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.ironsource.X3;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b1h;
import xsna.b6l;
import xsna.bn50;
import xsna.cn70;
import xsna.cpo;
import xsna.dw20;
import xsna.epx;
import xsna.fpf0;
import xsna.g0t;
import xsna.izs;
import xsna.jmu0;
import xsna.k1m;
import xsna.lj50;
import xsna.m0q0;
import xsna.m1k;
import xsna.msy;
import xsna.npi;
import xsna.nw20;
import xsna.qcy;
import xsna.r37;
import xsna.s3q0;
import xsna.spj;
import xsna.tzp0;
import xsna.u1h0;
import xsna.uoh;
import xsna.w1m;
import xsna.wcy;
import xsna.wpi;
import xsna.xy;
import xsna.xzs;
import xsna.yfb;
import xsna.yzs;
import xsna.z37;
import xsna.zei;

/* compiled from: DescriptionModal.kt */
/* loaded from: classes7.dex */
public final class b extends jmu0 implements m0q0 {
    public static final /* synthetic */ qcy<Object>[] j1;
    public final Object h1 = msy.a(LazyThreadSafetyMode.NONE, new b1h(this, 9));
    public final u1h0 i1;

    /* compiled from: DescriptionModal.kt */
    public static final class a extends wpi {
        public final DescriptionArguments g;

        public a(Context context, DescriptionArguments descriptionArguments) {
            super(context, new tzp0.c.a(new com.vk.video.ui.upload.impl.publish.presentation.description.fragment.a(), false));
            this.g = descriptionArguments;
            c(new cpo(false, 0, 7));
            q(false);
            B(cn70.c(12), true, false);
            I(true);
            F0(true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            bVar.setArguments(yfb.b(new Pair("arguments", this.g)));
            return bVar;
        }
    }

    /* compiled from: DescriptionModal.kt */
    /* renamed from: com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2001b implements xy, g0t {
        public final /* synthetic */ bn50<DescriptionState, DescriptionState, k1m, w1m> b;

        public C2001b(bn50<DescriptionState, DescriptionState, k1m, w1m> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((k1m) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: DescriptionModal.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModal$ThemedContent$2$1", f = "DescriptionModal.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<k1m>, w1m, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<k1m> z37Var, w1m w1mVar, spj<? super s3q0> spjVar) {
            c cVar = b.this.new c(spjVar);
            cVar.L$0 = w1mVar;
            return cVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w1m w1mVar = (w1m) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b bVar = b.this;
            qcy<Object>[] qcyVarArr = b.j1;
            bVar.getClass();
            if (w1mVar instanceof w1m.a) {
                bVar.getParentFragmentManager().k0(yfb.b(new Pair("DescriptionResult.MODAL_KEY_RESULT", new DescriptionResult(((w1m.a) w1mVar).a))), "DescriptionResult.MODAL_RESULT_REQUEST_KEY");
                bVar.dismiss();
            } else {
                if (!(w1mVar instanceof w1m.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.dismiss();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DescriptionModal.kt */
    public static final class d extends npi {
        @Override // xsna.npi, xsna.nw20, xsna.b33, xsna.y8i, android.app.Dialog
        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            super.setContentView(view, layoutParams);
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = this.i;
            if (modalBottomSheetBehavior != null) {
                modalBottomSheetBehavior.D = false;
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        j1 = new qcy[]{propertyReference1Impl};
    }

    public b() {
        m1k m1kVar = new m1k(this, 2);
        int i = wcy.c;
        this.i1 = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(DescriptionState.class)), wcy.a.a(fpf0.d(DescriptionState.class)), wcy.a.a(fpf0.d(k1m.class)), wcy.a.a(fpf0.d(w1m.class))).toString(), this, this, m1kVar);
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new d(context, i);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        eo().b(k1m.a.b);
        return true;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1415047161);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1415047161, 8, -1, "com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModal.ThemedContent (DescriptionModal.kt:51)");
        }
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new uoh(this, 5);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new c(null);
            aVar.R(x2);
        }
        r37.a(izsVar, (yzs) x2, zei.a, aVar, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final bn50<DescriptionState, DescriptionState, k1m, w1m> eo() {
        qcy<Object> qcyVar = j1[0];
        return (bn50) this.i1.getValue();
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
