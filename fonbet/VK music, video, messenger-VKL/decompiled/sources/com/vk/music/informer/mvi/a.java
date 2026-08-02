package com.vk.music.informer.mvi;

import android.content.Context;
import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.music.informer.mvi.e;
import com.vk.music.player.api.BottomPlayerAppearance;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.anp;
import xsna.ao50;
import xsna.b40;
import xsna.b6l;
import xsna.bap;
import xsna.dtp0;
import xsna.f5z;
import xsna.fm50;
import xsna.i6v0;
import xsna.ip6;
import xsna.izs;
import xsna.jq2;
import xsna.kai;
import xsna.luo;
import xsna.lx40;
import xsna.mm2;
import xsna.n0u0;
import xsna.nkk;
import xsna.rpp;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MusicPlayerInformerContentView.kt */
/* loaded from: classes3.dex */
public final class a extends i6v0<MusicPlayerInformerViewState, e> {
    public final BottomPlayerAppearance f;

    /* compiled from: MusicPlayerInformerContentView.kt */
    @b6l(c = "com.vk.music.informer.mvi.MusicPlayerInformerContentView$ThemedContent$1$informerItem$1$1", f = "MusicPlayerInformerContentView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.music.informer.mvi.a$a, reason: collision with other inner class name */
    public static final class C1324a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<e, s3q0> $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1324a(izs<? super e, s3q0> izsVar, spj<? super C1324a> spjVar) {
            super(2, spjVar);
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new C1324a(this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((C1324a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(new e.a(true));
            return s3q0.a;
        }
    }

    public a(f5z f5zVar, Context context, BottomPlayerAppearance bottomPlayerAppearance) {
        super(context, f5zVar);
        this.f = bottomPlayerAppearance;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((MusicPlayerInformerViewState) ao50Var, izsVar, aVar, 512);
    }

    public final void h(MusicPlayerInformerViewState musicPlayerInformerViewState, izs<? super e, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1724447016);
        int i2 = (M.J(musicPlayerInformerViewState) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1724447016, i2, -1, "com.vk.music.informer.mvi.MusicPlayerInformerContentView.ThemedContent (MusicPlayerInformerContentView.kt:37)");
            }
            fm50 fm50Var = (fm50) d(MusicPlayerInformerViewState.c.a, (n0u0[]) Arrays.copyOf(new n0u0[]{musicPlayerInformerViewState.a, musicPlayerInformerViewState.b}, 2), M, (((((i2 << 3) & 7168) | 4102) >> 3) & 896) | 6).getValue();
            boolean z = fm50Var instanceof MusicPlayerInformerViewState.b;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            MusicPlayerInformerViewState.b bVar = null;
            if (z) {
                M.K(1782295918);
                s3q0 s3q0Var = s3q0.a;
                boolean z2 = (i2 & 112) == 32;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new C1324a(izsVar, null);
                    M.R(x);
                }
                bap.g(s3q0Var, (wzs) x, M, 6);
                bVar = (MusicPlayerInformerViewState.b) fm50Var;
                M.j();
            } else {
                M.K(1782475532);
                M.j();
                izsVar.invoke(new e.a(false));
            }
            boolean z3 = bVar != null;
            nkk nkkVar = luo.a;
            dtp0 d = jq2.d(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, nkkVar, 2);
            Object x2 = M.x();
            int i4 = 27;
            if (x2 == c0012a) {
                x2 = new b40(i4);
                M.R(x2);
            }
            rpp b = anp.l(d, (izs) x2).b(anp.e(jq2.d(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, nkkVar, 2), 2));
            dtp0 d2 = jq2.d(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, nkkVar, 2);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new b40(i4);
                M.R(x3);
            }
            mm2.f(z3, null, b, anp.o(d2, (izs) x3).b(anp.f(jq2.d(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, nkkVar, 2), 2)), null, kai.c(1305379179, new lx40(bVar, izsVar, i3, this), M), M, 196608, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ip6(i, 3, this, musicPlayerInformerViewState, izsVar);
        }
    }
}
