package com.vk.messagetemplates.impl.keyboard;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverScopedComponent;
import com.vk.im.ui.views.RichEditText;
import com.vk.messagetemplates.impl.details.TemplateDetailsFragment;
import com.vk.messagetemplates.impl.keyboard.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b25;
import xsna.b6l;
import xsna.b9o0;
import xsna.bn50;
import xsna.ck3;
import xsna.cn50;
import xsna.epx;
import xsna.ezv;
import xsna.fo6;
import xsna.fpf0;
import xsna.g0t;
import xsna.h03;
import xsna.hz7;
import xsna.izs;
import xsna.j9o0;
import xsna.jai;
import xsna.kai;
import xsna.kz30;
import xsna.l7m;
import xsna.lj50;
import xsna.m7m;
import xsna.mjg;
import xsna.mut0;
import xsna.onb;
import xsna.r37;
import xsna.s3q0;
import xsna.spj;
import xsna.svj;
import xsna.up2;
import xsna.w2a0;
import xsna.wb0;
import xsna.xla;
import xsna.xq;
import xsna.xy;
import xsna.xzs;
import xsna.xzv;
import xsna.yzs;
import xsna.z37;
import xsna.zzs;

/* compiled from: TemplatesKeyboardFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class b implements com.vk.messagetemplates.api.a {

    /* compiled from: TemplatesKeyboardFactoryImpl.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<TemplatesKeyboardState, TemplatesKeyboardState, j9o0, com.vk.messagetemplates.impl.keyboard.a> b;

        public a(bn50<TemplatesKeyboardState, TemplatesKeyboardState, j9o0, com.vk.messagetemplates.impl.keyboard.a> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((j9o0) lj50Var);
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

    /* compiled from: TemplatesKeyboardFactoryImpl.kt */
    @b6l(c = "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardFactoryImpl$ScreenContent$2$1", f = "TemplatesKeyboardFactoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.messagetemplates.impl.keyboard.b$b, reason: collision with other inner class name */
    public static final class C1274b extends SuspendLambda implements yzs<z37<j9o0>, com.vk.messagetemplates.impl.keyboard.a, spj<? super s3q0>, Object> {
        final /* synthetic */ ck3 $ownerWrapper;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1274b(ck3 ck3Var, b bVar, spj<? super C1274b> spjVar) {
            super(3, spjVar);
            this.$ownerWrapper = ck3Var;
            this.this$0 = bVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<j9o0> z37Var, com.vk.messagetemplates.impl.keyboard.a aVar, spj<? super s3q0> spjVar) {
            C1274b c1274b = new C1274b(this.$ownerWrapper, this.this$0, spjVar);
            c1274b.L$0 = aVar;
            return c1274b.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.messagetemplates.impl.keyboard.a aVar = (com.vk.messagetemplates.impl.keyboard.a) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (aVar instanceof a.c) {
                xla xlaVar = this.$ownerWrapper.b;
                String str = ((a.c) aVar).a;
                RichEditText richEditText = ((kz30) xlaVar.b).B;
                (richEditText != null ? richEditText : null).setText(str);
            } else if (aVar instanceof a.b) {
                b bVar = this.this$0;
                ck3 ck3Var = this.$ownerWrapper;
                ComponentActivity componentActivity = ck3Var.a;
                long j = ck3Var.c.a;
                Integer num = ((a.b) aVar).a;
                bVar.getClass();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(j);
                TemplateDetailsFragment.a aVar2 = new TemplateDetailsFragment.a(TemplateDetailsFragment.class, null, null);
                Bundle bundle = aVar2.j;
                bundle.putParcelable("group_id", b);
                if (num != null) {
                    bundle.putInt("id", num.intValue());
                }
                aVar2.k(componentActivity);
            } else {
                if (!(aVar instanceof a.C1273a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h03.b(((a.C1273a) aVar).a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: TemplatesKeyboardFactoryImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<j9o0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(j9o0 j9o0Var) {
            ((bn50) this.receiver).b(j9o0Var);
            return s3q0.a;
        }
    }

    @Override // com.vk.messagetemplates.api.a
    public final View a(int i, ComponentActivity componentActivity, xla xlaVar, b9o0 b9o0Var) {
        ComposeView composeView = new ComposeView(componentActivity, null, 6);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ck3 ck3Var = new ck3(i, componentActivity, xlaVar, b9o0Var);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(-226710512, new hz7(6, this, ck3Var), true));
        return composeView;
    }

    public final void b(final ck3 ck3Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        final b9o0 b9o0Var = ck3Var.c;
        androidx.compose.runtime.a M = aVar.M(692067183);
        int i2 = (M.J(ck3Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(692067183, i2, -1, "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardFactoryImpl.ScreenContent (TemplatesKeyboardFactoryImpl.kt:62)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                l7m a2 = m7m.a(ck3Var.a);
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(b9o0Var.a);
                final ezv g = ((ImCmdCoroutinesExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) a2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), b, a2).a(fpf0.a(ImCmdCoroutinesExecutorScopedComponent.class))).g();
                final xzv l = ((ImCoroutinesEventObserverScopedComponent) xq.f((ImFeatureScopeProviderComponent) a2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), b, a2).a(fpf0.a(ImCoroutinesEventObserverScopedComponent.class))).l();
                final mjg w7 = ((ImCommonCommandsFactoryComponent) a2.mo408a(fpf0.a(ImCommonCommandsFactoryComponent.class))).w7();
                final b25 s = ((AuthBridgeComponent) a2.a(fpf0.a(AuthBridgeComponent.class))).s();
                cn50 cn50Var = new cn50(up2.d(new w2a0(13), new wb0() { // from class: xsna.l9o0
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new com.vk.messagetemplates.impl.keyboard.d(sj50Var, b9o0.this, g, l, w7, s);
                    }
                }, svj.b));
                M.R(cn50Var);
                x = cn50Var;
            }
            final bn50 bn50Var = (bn50) x;
            int i3 = i2 & 14;
            boolean y = M.y(bn50Var) | (i3 == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new fo6(25, bn50Var, ck3Var);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new C1274b(ck3Var, this, null);
                M.R(x3);
            }
            aVar2 = M;
            r37.a(izsVar, (yzs) x3, kai.c(1679753144, new zzs() { // from class: xsna.k9o0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    com.vk.messagetemplates.impl.keyboard.h hVar = (com.vk.messagetemplates.impl.keyboard.h) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= aVar3.J(hVar) ? 32 : 16;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 145) != 144)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1679753144, intValue, -1, "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardFactoryImpl.ScreenContent.<anonymous> (TemplatesKeyboardFactoryImpl.kt:72)");
                        }
                        rrv0.d(null, null, null, null, kai.c(524214813, new opq(hVar, bn50.this, ck3Var, 7), aVar3), aVar3, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new onb(this, ck3Var, i, 7);
        }
    }
}
