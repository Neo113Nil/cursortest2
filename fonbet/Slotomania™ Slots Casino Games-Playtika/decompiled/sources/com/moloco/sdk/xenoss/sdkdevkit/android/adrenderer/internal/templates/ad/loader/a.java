package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes5.dex */
public final class a implements InterfaceC2819b {
    public static final C0308a f = new C0308a(null);
    public static final int g = 8;
    public static final String h = "WebViewAdLoad";
    public final String a;
    public final CoroutineScope b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b c;
    public final MutableStateFlow<Boolean> d;
    public final StateFlow<Boolean> e;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a$a, reason: collision with other inner class name */
    public static final class C0308a {
        public /* synthetic */ C0308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0308a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.WebViewAdLoad$load$1", f = "WebviewAdLoad.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC2819b.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, InterfaceC2819b.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a = a.this.a();
                String str = a.this.a;
                long j = this.c;
                this.a = 1;
                obj = a.a(str, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            v vVar = (v) obj;
            if (vVar instanceof v.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.h, "WebViewAdLoad: load success", null, false, 12, null);
                a.this.d.setValue(Boxing.boxBoolean(true));
                InterfaceC2819b.a aVar = this.d;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (!(vVar instanceof v.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.h, "WebViewAdLoad: load failure", null, false, 12, null);
                a.this.d.setValue(Boxing.boxBoolean(false));
                InterfaceC2819b.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.a((c) ((v.a) vVar).a());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public a(String adm, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b webView) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = adm;
        this.b = scope;
        this.c = webView;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.d = MutableStateFlow;
        this.e = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public StateFlow<Boolean> isLoaded() {
        return this.e;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC2819b
    public void a(long j, InterfaceC2819b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(j, aVar, null), 3, null);
    }
}
