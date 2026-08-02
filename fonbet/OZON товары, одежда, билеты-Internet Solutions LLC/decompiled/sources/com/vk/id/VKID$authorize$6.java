package com.vk.id;

import Je.InterfaceC3394a;
import Sc.InterfaceC4008j;
import Sc.s;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.analytics.CustomAuthAnalytics;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthEventBridge;
import com.vk.id.internal.auth.AuthProvidersChooser;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.VKIDAuthProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;
import xe.E0;
import xe.I;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.VKID$authorize$6", f = "VKID.kt", l = {451, 482}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKID$authorize$6 extends j implements Function1<d<? super Unit>, Object> {
    final /* synthetic */ VKIDAuthCallback $callback;
    final /* synthetic */ VKIDAuthParams $params;
    Object L$0;
    int label;
    final /* synthetic */ VKID this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.VKID$authorize$6$2", f = "VKID.kt", l = {483}, m = "invokeSuspend")
    /* renamed from: com.vk.id.VKID$authorize$6$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ VKIDAuthParams $actualParams;
        final /* synthetic */ StatParams $statParams;
        int label;
        final /* synthetic */ VKID this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(VKID vkid, VKIDAuthParams vKIDAuthParams, StatParams statParams, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = vkid;
            this.$actualParams = vKIDAuthParams;
            this.$statParams = statParams;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$actualParams, this.$statParams, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC4008j interfaceC4008j;
            AuthOptionsCreator authOptionsCreator;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                interfaceC4008j = this.this$0.authProvidersChooser;
                AuthProvidersChooser authProvidersChooser = (AuthProvidersChooser) interfaceC4008j.getValue();
                VKIDAuthParams vKIDAuthParams = this.$actualParams;
                this.label = 1;
                obj = authProvidersChooser.chooseBest(vKIDAuthParams, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            authOptionsCreator = this.this$0.authOptionsCreator;
            ((VKIDAuthProvider) obj).auth(authOptionsCreator.create$vkid_release(this.$actualParams, this.$statParams));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKID$authorize$6(VKIDAuthParams vKIDAuthParams, VKID vkid, VKIDAuthCallback vKIDAuthCallback, d<? super VKID$authorize$6> dVar) {
        super(1, dVar);
        this.$params = vKIDAuthParams;
        this.this$0 = vkid;
        this.$callback = vKIDAuthCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(VKIDAuthParams vKIDAuthParams, VKID vkid, VKIDAuthParams.Builder builder) {
        VKIDAuthParams.Locale locale = vKIDAuthParams.getLocale();
        if (locale == null) {
            locale = VKIDAuthParams.Locale.INSTANCE.fromLocale(vkid.getInternalVKIDLocale().get());
        }
        builder.setLocale(locale);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new VKID$authorize$6(this.$params, this.this$0, this.$callback, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        if (xe.C10727i.f(r10, r1, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
    
        if (r10.a(r9) == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VKIDAuthParams newBuilder;
        InterfaceC3394a interfaceC3394a;
        AuthCallbacksHolder authCallbacksHolder;
        StatParams statParams;
        String str;
        String str2;
        VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final VKIDAuthParams vKIDAuthParams = this.$params;
            final VKID vkid = this.this$0;
            newBuilder = vKIDAuthParams.newBuilder(new Function1() { // from class: com.vk.id.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = VKID$authorize$6.invokeSuspend$lambda$0(VKIDAuthParams.this, vkid, (VKIDAuthParams.Builder) obj2);
                    return invokeSuspend$lambda$0;
                }
            });
            interfaceC3394a = this.this$0.requestMutex;
            this.L$0 = newBuilder;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            newBuilder = (VKIDAuthParams) this.L$0;
            s.b(obj);
        }
        final VKIDAuthParams vKIDAuthParams2 = newBuilder;
        final String str3 = "Authorize";
        this.this$0.getPerformanceTracker().startTracking("Authorize");
        authCallbacksHolder = this.this$0.authCallbacksHolder;
        authCallbacksHolder.add(this.$callback);
        final CoroutineContext context = getContext();
        if (vKIDAuthParams2.getInternalUse()) {
            Map<String, String> extraParams$vkid_release = vKIDAuthParams2.getExtraParams$vkid_release();
            String str4 = "";
            if (extraParams$vkid_release == null || (str = extraParams$vkid_release.get("flow_source")) == null) {
                str = "";
            }
            Map<String, String> extraParams$vkid_release2 = vKIDAuthParams2.getExtraParams$vkid_release();
            if (extraParams$vkid_release2 != null && (str2 = extraParams$vkid_release2.get("session_id")) != null) {
                str4 = str2;
            }
            statParams = new StatParams(str, str4);
        } else {
            statParams = CustomAuthAnalytics.INSTANCE.customAuthStart$vkid_release(vKIDAuthParams2);
        }
        final StatParams statParams2 = statParams;
        AuthEventBridge authEventBridge = AuthEventBridge.INSTANCE;
        final VKID vkid2 = this.this$0;
        authEventBridge.setListener$vkid_release(new AuthEventBridge.Listener() { // from class: com.vk.id.VKID$authorize$6.1
            @Override // com.vk.id.internal.auth.AuthEventBridge.Listener
            public void onAuthResult(AuthResult authResult) {
                Intrinsics.checkNotNullParameter(authResult, "authResult");
                C10727i.c(N.a(CoroutineContext.this.plus(E0.a())), null, null, new VKID$authorize$6$1$onAuthResult$1(vkid2, authResult, str3, vKIDAuthParams2, statParams2, null), 3);
            }
        });
        vKIDCoroutinesDispatchers = this.this$0.dispatchers;
        I io2 = vKIDCoroutinesDispatchers.getIo();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, vKIDAuthParams2, statParams2, null);
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return ((VKID$authorize$6) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
