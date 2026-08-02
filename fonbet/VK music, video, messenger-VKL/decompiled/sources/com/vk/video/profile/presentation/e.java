package com.vk.video.profile.presentation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import com.vk.video.profile.presentation.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.ge00;
import xsna.gzs;
import xsna.ie00;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.xn50;
import xsna.yvj;

/* compiled from: VideoProfileFragmentOld.kt */
@b6l(c = "com.vk.video.profile.presentation.VideoProfileFragmentOld$handleProfileChangedResult$1", f = "VideoProfileFragmentOld.kt", l = {956}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ VideoProfileFragmentOld this$0;

    /* compiled from: WithLifecycleState.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ VideoProfileFragmentOld b;

        public a(VideoProfileFragmentOld videoProfileFragmentOld) {
            this.b = videoProfileFragmentOld;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            a.z zVar = a.z.b;
            VideoProfileFragmentOld videoProfileFragmentOld = this.b;
            videoProfileFragmentOld.getClass();
            xn50.a.c(videoProfileFragmentOld, zVar);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VideoProfileFragmentOld videoProfileFragmentOld, spj<? super e> spjVar) {
        super(2, spjVar);
        this.this$0 = videoProfileFragmentOld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            VideoProfileFragmentOld videoProfileFragmentOld = this.this$0;
            m lifecycle = videoProfileFragmentOld.o0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            bdn bdnVar = bdn.a;
            ge00 U = ie00.a.U();
            boolean S = U.S(getContext());
            if (!S) {
                Lifecycle.State state2 = lifecycle.d;
                if (state2 == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (state2.compareTo(state) >= 0) {
                    xn50.a.c(videoProfileFragmentOld, a.z.b);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            a aVar = new a(videoProfileFragmentOld);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.Z$0 = S;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            h0 h0Var = new h0(state, lifecycle, lq9Var, aVar);
            if (S) {
                U.P(EmptyCoroutineContext.b, new f0(lifecycle, h0Var));
            } else {
                lifecycle.addObserver(h0Var);
            }
            lq9Var.r(new g0(U, lifecycle, h0Var));
            if (lq9Var.n() == coroutineSingletons) {
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
