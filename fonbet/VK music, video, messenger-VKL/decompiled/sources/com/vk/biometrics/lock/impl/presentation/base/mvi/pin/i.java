package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.f;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ao50;
import xsna.b6l;
import xsna.bap;
import xsna.c3j;
import xsna.d370;
import xsna.d77;
import xsna.epx;
import xsna.f1;
import xsna.f4z;
import xsna.f5z;
import xsna.gzs;
import xsna.i6v0;
import xsna.izs;
import xsna.jk50;
import xsna.k77;
import xsna.l77;
import xsna.m77;
import xsna.n0u0;
import xsna.n77;
import xsna.p57;
import xsna.p7u0;
import xsna.s3q0;
import xsna.spj;
import xsna.tc;
import xsna.wh50;
import xsna.wj50;
import xsna.wzs;
import xsna.x77;
import xsna.xla0;
import xsna.yc;
import xsna.yi1;
import xsna.yvj;

/* compiled from: BiometricsLockPinView.kt */
/* loaded from: classes15.dex */
public final class i extends i6v0<x77, com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a> {
    public final wj50<g> f;
    public final f.b.a g;

    /* compiled from: BiometricsLockPinView.kt */
    @b6l(c = "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinView$InitialScreen$1$1", f = "BiometricsLockPinView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ f.b.a $render;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.b.a aVar, i iVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$render = aVar;
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$render, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (epx.f(this.$render.b, c.e.a)) {
                f.b.a aVar = this.$render;
                if (aVar.c && aVar.a.d.a < 6) {
                    this.this$0.f.b(g.f.a);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: BiometricsLockPinView.kt */
    @b6l(c = "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinView$MainScreen$1$1", f = "BiometricsLockPinView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> $onAction;
        final /* synthetic */ d77 $passwordContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d77 d77Var, izs<? super com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$passwordContent = d77Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$passwordContent, this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$passwordContent.a.length() == 4 && epx.f(this.$passwordContent.c, new xla0.c())) {
                this.$onAction.invoke(a.c.b);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BiometricsLockPinView.kt */
    @b6l(c = "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinView$MainScreen$2$1", f = "BiometricsLockPinView.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> $onAction;
        final /* synthetic */ d77 $passwordContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(d77 d77Var, izs<? super com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> izsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$passwordContent = d77Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$passwordContent, this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (epx.f(this.$passwordContent.c, new xla0.d())) {
                this.$onAction.invoke(a.e.b);
            }
            if (epx.f(this.$passwordContent.c, new xla0.b())) {
                this.$onAction.invoke(a.d.b);
            }
            return s3q0.a;
        }
    }

    public i(f4z f4zVar, f.b.a aVar, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = f4zVar;
        this.g = aVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((x77) ao50Var, izsVar, aVar, 512);
    }

    public final void h(f.b.a aVar, izs<? super com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1215989603);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1215989603, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinView.InitialScreen (BiometricsLockPinView.kt:68)");
            }
            j.c(this.f, izsVar, aVar.a, aVar.b, aVar.c, false, false, M, i2 & 112, 96);
            com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar = aVar.b;
            boolean y = ((i2 & 14) == 4) | M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(aVar, this, null);
                M.R(x);
            }
            bap.g(cVar, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yi1(this, aVar, izsVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(f.a aVar, izs<? super com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> izsVar2;
        a.C0011a.C0012a c0012a;
        int i2;
        int i3;
        p57 p57Var;
        androidx.compose.runtime.a M = aVar2.M(160517554);
        int i4 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(160517554, i4, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinView.MainScreen (BiometricsLockPinView.kt:92)");
            }
            d77 d77Var = (d77) jk50.d(aVar.a, new d77(null, 31), M, 0).getValue();
            com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c) jk50.d(aVar.b, c.f.a, M, 48).getValue();
            boolean booleanValue = ((Boolean) jk50.d(aVar.c, Boolean.FALSE, M, 48).getValue()).booleanValue();
            p57 p57Var2 = (p57) jk50.d(aVar.d, new p57(false, false, false, false), M, 0).getValue();
            String str = d77Var.a;
            int i5 = i4 & 112;
            boolean J = (i5 == 32) | M.J(d77Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                x = new b(d77Var, izsVar, null);
                M.R(x);
            }
            bap.g(str, (wzs) x, M, 0);
            xla0 xla0Var = d77Var.c;
            boolean J2 = M.J(d77Var) | (i5 == 32);
            Object x2 = M.x();
            if (J2 || x2 == c0012a2) {
                x2 = new c(d77Var, izsVar, null);
                M.R(x2);
            }
            bap.g(xla0Var, (wzs) x2, M, 0);
            j.c(this.f, izsVar, d77Var, cVar, booleanValue, p57Var2.d, p57Var2.b, M, i5, 0);
            M = M;
            if (p57Var2.a) {
                M.K(1681619597);
                String N = d370.N(R.string.bl_too_many_attempts, 0, M);
                String N2 = d370.N(R.string.bl_reauth_required_msg, 0, M);
                String N3 = d370.N(R.string.bl_clearly, 0, M);
                Object x3 = M.x();
                if (x3 == c0012a2) {
                    x3 = new tc(3);
                    M.R(x3);
                }
                izs izsVar3 = (izs) x3;
                boolean y = M.y(this);
                Object x4 = M.x();
                if (y || x4 == c0012a2) {
                    x4 = new f1(this, 7);
                    M.R(x4);
                }
                c0012a = c0012a2;
                i2 = 1676216080;
                p57Var = p57Var2;
                i3 = i5;
                p7u0.e(N, N2, N3, izsVar3, (gzs) x4, null, null, null, null, null, null, null, null, M, 3072, 0, 8160);
                M = M;
            } else {
                c0012a = c0012a2;
                i2 = 1676216080;
                i3 = i5;
                p57Var = p57Var2;
                M.K(1676216080);
            }
            M.j();
            if (p57Var.c) {
                M.K(1682156455);
                String N4 = d370.N(R.string.bl_logout_title, 0, M);
                String N5 = d370.N(R.string.bl_logout_reset_password_description, 0, M);
                String N6 = d370.N(R.string.bl_logout, 0, M);
                String N7 = d370.N(R.string.bl_cancel, 0, M);
                boolean z = i3 == 32;
                Object x5 = M.x();
                a.C0011a.C0012a c0012a3 = c0012a;
                if (z || x5 == c0012a3) {
                    izsVar2 = izsVar;
                    x5 = new l77(izsVar2, 0);
                    M.R(x5);
                } else {
                    izsVar2 = izsVar;
                }
                izs izsVar4 = (izs) x5;
                boolean y2 = M.y(this);
                Object x6 = M.x();
                if (y2 || x6 == c0012a3) {
                    x6 = new yc(this, 10);
                    M.R(x6);
                }
                gzs gzsVar = (gzs) x6;
                boolean z2 = i3 == 32;
                Object x7 = M.x();
                if (z2 || x7 == c0012a3) {
                    x7 = new m77(izsVar2, 0);
                    M.R(x7);
                }
                c3j.a(N6, N7, null, N4, N5, false, izsVar4, gzsVar, (gzs) x7, M, 0, 36);
            } else {
                izsVar2 = izsVar;
                M.K(i2);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n77(this, aVar, izsVar2, i, 0);
        }
    }

    public final void j(x77 x77Var, izs<? super com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2120759140);
        int i2 = (M.J(x77Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2120759140, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinView.ThemedContent (BiometricsLockPinView.kt:54)");
            }
            wh50 d = d(f.b.a, new n0u0[]{x77Var.a}, M, (i2 & 896) | 6);
            if (((f) d.getValue()) instanceof f.a) {
                M.K(-566270734);
                i((f.a) ((f) d.getValue()), izsVar, M, i2 & 1008);
                M.j();
            } else {
                M.K(-566182136);
                h(this.g, izsVar, M, i2 & 1008);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k77(i, 0, this, x77Var, izsVar);
        }
    }
}
