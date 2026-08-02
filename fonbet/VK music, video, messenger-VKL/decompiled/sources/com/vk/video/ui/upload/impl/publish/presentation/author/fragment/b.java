package com.vk.video.ui.upload.impl.publish.presentation.author.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.a;
import com.ironsource.X3;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorResult;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ac5;
import xsna.b6l;
import xsna.b85;
import xsna.bn50;
import xsna.cpo;
import xsna.dw20;
import xsna.epx;
import xsna.f870;
import xsna.fpf0;
import xsna.g0t;
import xsna.go1;
import xsna.h75;
import xsna.h7u0;
import xsna.hb;
import xsna.izs;
import xsna.jmu0;
import xsna.lj50;
import xsna.m0q0;
import xsna.maz;
import xsna.msy;
import xsna.npi;
import xsna.nw20;
import xsna.nwy;
import xsna.obi;
import xsna.qcy;
import xsna.r37;
import xsna.s3q0;
import xsna.spj;
import xsna.tzp0;
import xsna.u1h0;
import xsna.wcy;
import xsna.wpi;
import xsna.xas0;
import xsna.xwk;
import xsna.xy;
import xsna.xzs;
import xsna.yb5;
import xsna.yfb;
import xsna.yg;
import xsna.yzs;
import xsna.z37;
import xsna.zb5;

/* compiled from: AuthorModal.kt */
/* loaded from: classes7.dex */
public final class b extends jmu0 implements m0q0 {
    public static final /* synthetic */ qcy<Object>[] j1;
    public final Object h1 = msy.a(LazyThreadSafetyMode.NONE, new yg(this, 8));
    public final u1h0 i1;

    /* compiled from: AuthorModal.kt */
    public static final class a extends wpi {
        public final AuthorArguments g;

        public a(Context context, AuthorArguments authorArguments) {
            super(context, new tzp0.c.a(new com.vk.video.ui.upload.impl.publish.presentation.author.fragment.a(), false));
            this.g = authorArguments;
            cpo cpoVar = new cpo(false, 0, 7);
            cpoVar.d = 1.0f;
            c(cpoVar);
            t();
            I(true);
            w0(context.getString(R.string.author_bottom_sheet_title));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            bVar.setArguments(yfb.b(new Pair("arguments", this.g)));
            return bVar;
        }
    }

    /* compiled from: AuthorModal.kt */
    /* renamed from: com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2000b implements xy, g0t {
        public final /* synthetic */ bn50<AuthorState, AuthorState, h75, b85> b;

        public C2000b(bn50<AuthorState, AuthorState, h75, b85> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((h75) lj50Var);
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

    /* compiled from: AuthorModal.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModal$ThemedContent$2$1", f = "AuthorModal.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<h75>, b85, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<h75> z37Var, b85 b85Var, spj<? super s3q0> spjVar) {
            c cVar = b.this.new c(spjVar);
            cVar.L$0 = b85Var;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            b85 b85Var = (b85) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b bVar = b.this;
            qcy<Object>[] qcyVarArr = b.j1;
            bVar.getClass();
            if (b85Var instanceof b85.a) {
                bVar.fo(new AuthorResult.Picked(((b85.a) b85Var).a));
                bVar.dismiss();
            } else if (b85Var instanceof b85.b) {
                bVar.fo(AuthorResult.CreatingNewChannel.b);
                bVar.dismiss();
                maz.c(xwk.d().e(), bVar.requireContext(), f870.v(InternalVkMiniApps.COMMUNITY_CREATE.h()), LaunchContext.A, null, null, 24);
            } else if (b85Var instanceof b85.d) {
                bVar.fo(AuthorResult.CreatingNewChannel.b);
                bVar.dismiss();
                Context requireContext = bVar.requireContext();
                while (true) {
                    z = requireContext instanceof AppCompatActivity;
                    if (z || !(requireContext instanceof ContextWrapper)) {
                        break;
                    }
                    requireContext = ((ContextWrapper) requireContext).getBaseContext();
                }
                if (((AppCompatActivity) (z ? (Activity) requireContext : null)) != null) {
                    nwy nwyVar = ((AuthorModalInternalComponent) bVar.h1.getValue()).h;
                    qcy<Object> qcyVar = AuthorModalInternalComponent.j[4];
                    ((xas0) nwyVar.c()).getClass();
                }
            } else {
                if (!(b85Var instanceof b85.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i = h7u0.p;
                h7u0.a c = h7u0.b.c(bVar.requireContext());
                c.g0(R.string.author_change_confirmation_dialog_title);
                c.U(R.string.author_change_confirmation_dialog_message);
                int i2 = 0;
                c.c0(R.string.author_change_confirmation_dialog_button_change, new yb5(bVar, i2));
                c.W(R.string.author_change_confirmation_dialog_button_cancel, new zb5(bVar, i2));
                c.a.n = new ac5(bVar, 0);
                c.m();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        j1 = new qcy[]{propertyReference1Impl};
    }

    public b() {
        go1 go1Var = new go1(this, 9);
        int i = wcy.c;
        this.i1 = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(AuthorState.class)), wcy.a.a(fpf0.d(AuthorState.class)), wcy.a.a(fpf0.d(h75.class)), wcy.a.a(fpf0.d(b85.class))).toString(), this, this, go1Var);
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-179925522);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-179925522, 8, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModal.ThemedContent (AuthorModal.kt:57)");
        }
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new hb(this, 7);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new c(null);
            aVar.R(x2);
        }
        r37.a(izsVar, (yzs) x2, obi.a, aVar, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final bn50<AuthorState, AuthorState, h75, b85> eo() {
        qcy<Object> qcyVar = j1[0];
        return (bn50) this.i1.getValue();
    }

    public final void fo(AuthorResult authorResult) {
        getParentFragmentManager().k0(yfb.b(new Pair("AuthorResult.MODAL_KEY_RESULT", authorResult)), "AuthorResult.MODAL_RESULT_REQUEST_KEY");
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
