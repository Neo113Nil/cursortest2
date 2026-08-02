package com.vk.profile.community.impl.ui.events;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.profile.community.impl.ui.events.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b6l;
import xsna.d0i;
import xsna.epx;
import xsna.fpf0;
import xsna.g0t;
import xsna.jai;
import xsna.lj50;
import xsna.m2h;
import xsna.msy;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.spj;
import xsna.t2h;
import xsna.xy;
import xsna.xzs;
import xsna.yqf;
import xsna.yzs;
import xsna.z37;
import xsna.zqf;

/* compiled from: CommunityEventsFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityEventsFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] P;
    public final nzw N = new nzw(fpf0.d(t2h.class).toString(), this, new yqf(this, 1));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new zqf(this, 2));

    /* compiled from: CommunityEventsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunityEventsFragment.kt */
    public static final /* synthetic */ class b implements xy, g0t {
        public final /* synthetic */ t2h b;

        public b(t2h t2hVar) {
            this.b = t2hVar;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((com.vk.profile.community.impl.ui.events.a) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, t2h.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: CommunityEventsFragment.kt */
    @b6l(c = "com.vk.profile.community.impl.ui.events.CommunityEventsFragment$onCreateView$1$1$2$1", f = "CommunityEventsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<com.vk.profile.community.impl.ui.events.a>, com.vk.profile.community.impl.ui.events.b, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<com.vk.profile.community.impl.ui.events.a> z37Var, com.vk.profile.community.impl.ui.events.b bVar, spj<? super s3q0> spjVar) {
            c cVar = CommunityEventsFragment.this.new c(spjVar);
            cVar.L$0 = bVar;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.profile.community.impl.ui.events.b bVar = (com.vk.profile.community.impl.ui.events.b) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (bVar instanceof b.C1565b) {
                ((d0i) CommunityEventsFragment.this.O.getValue()).d(CommunityEventsFragment.this.requireContext(), ((b.C1565b) bVar).a);
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CommunityEventsFragment.this.kn().onBackPressed();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunityEventsFragment.class, X3.i.U, "getStore()Lcom/vk/profile/community/impl/ui/events/CommunityEventsStore;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public final t2h eo() {
        qcy<Object> qcyVar = P[0];
        return (t2h) this.N.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-418387149, new m2h(this, 0), true));
        return composeView;
    }
}
