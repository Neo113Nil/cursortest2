package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.braze.Constants;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C2787a;
import com.moloco.sdk.internal.ortb.model.C2788b;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", Constants.BRAZE_PUSH_ACCENT_KEY, "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/m;", "c", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/m;", "storeInstallerImpl", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class VastActivity extends ComponentActivity {
    public static final String f = "VastActivity";
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a i;
    public static Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> j;
    public static Function0<Unit> k;
    public static Job l;
    public static y m;
    public static MetricsRecorder n;

    /* renamed from: a, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a ac;

    /* renamed from: b, reason: from kotlin metadata */
    public final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    /* renamed from: c, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m storeInstallerImpl;

    /* renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    public static final MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public static WeakReference<VastActivity> h = new WeakReference<>(null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2", f = "VastActivity.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        public static final class C0336a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a b;
            public final /* synthetic */ x c;
            public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> d;
            public final /* synthetic */ Context e;
            public final /* synthetic */ String f;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0337a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> c;
                public final /* synthetic */ Context d;
                public final /* synthetic */ x e;
                public final /* synthetic */ String f;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1", f = "VastActivity.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C0338a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> b;

                    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$1", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0339a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Unit>, Object> {
                        public int a;
                        public /* synthetic */ Object b;
                        public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0339a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Continuation<? super C0339a> continuation) {
                            super(2, continuation);
                            this.c = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Unit> continuation) {
                            return ((C0339a) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C0339a c0339a = new C0339a(this.c, continuation);
                            c0339a.b = obj;
                            return c0339a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.c.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b);
                            return Unit.INSTANCE;
                        }
                    }

                    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$2", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    public static final class b extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Boolean>, Object> {
                        public int a;
                        public /* synthetic */ Object b;

                        public b(Continuation<? super b> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Boolean> continuation) {
                            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            b bVar = new b(continuation);
                            bVar.b = obj;
                            return bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(VastActivity.INSTANCE.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0338a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Continuation<? super C0338a> continuation) {
                        super(2, continuation);
                        this.b = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0338a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0338a(this.b, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Flow onEach = FlowKt.onEach(VastActivity.g, new C0339a(this.b, null));
                            b bVar = new b(null);
                            this.a = 1;
                            if (FlowKt.firstOrNull(onEach, bVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$2", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ Context b;
                    public final /* synthetic */ x c;
                    public final /* synthetic */ String d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Context context, x xVar, String str, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.b = context;
                        this.c = xVar;
                        this.d = str;
                    }

                    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                        if (p1 == null) {
                            return;
                        }
                        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.D);
                        p0.startActivity(p1);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new b(this.b, this.c, this.d, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Boolean forceFullScreen;
                        String clickthroughUrl;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Context context = this.b;
                        Intent intent = new Intent(this.b, (Class<?>) VastActivity.class);
                        x xVar = this.c;
                        String str = this.d;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.g(intent, xVar.i());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, xVar.e());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, xVar.f());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, xVar.g());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, xVar.h());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent, xVar.d());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent, xVar.c());
                        C2787a a = xVar.a();
                        if (a != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, a.getEnabled());
                        }
                        C2787a a2 = xVar.a();
                        if (a2 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, a2.getUrl());
                        }
                        if (xVar.b() != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, true);
                        }
                        C2788b b = xVar.b();
                        if (b != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, b.getOnSkip());
                        }
                        C2788b b2 = xVar.b();
                        if (b2 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, b2.getEventLink());
                        }
                        C2788b b3 = xVar.b();
                        if (b3 != null && (clickthroughUrl = b3.getClickthroughUrl()) != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, clickthroughUrl);
                        }
                        C2788b b4 = xVar.b();
                        if (b4 != null && (forceFullScreen = b4.getForceFullScreen()) != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, forceFullScreen.booleanValue());
                        }
                        if (str != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, str);
                        }
                        intent.setFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0337a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Context context, x xVar, String str, Continuation<? super C0337a> continuation) {
                    super(2, continuation);
                    this.c = function1;
                    this.d = context;
                    this.e = xVar;
                    this.f = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
                    return ((C0337a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0337a c0337a = new C0337a(this.c, this.d, this.e, this.f, continuation);
                    c0337a.b = obj;
                    return c0337a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Job launch$default;
                    Job launch$default2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    Companion companion = VastActivity.INSTANCE;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0338a(this.c, null), 3, null);
                    VastActivity.l = launch$default;
                    launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(this.d, this.e, this.f, null), 3, null);
                    return launch$default2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0336a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, x xVar, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Context context, String str, Continuation<? super C0336a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = xVar;
                this.d = function1;
                this.e = context;
                this.f = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
                return ((C0336a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0336a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Companion companion = VastActivity.INSTANCE;
                        VastActivity.i = this.b;
                        VastActivity.j = this.c.j();
                        C0337a c0337a = new C0337a(this.d, this.e, this.c, this.f, null);
                        this.a = 1;
                        obj = CoroutineScopeKt.coroutineScope(c0337a, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (Job) obj;
                } finally {
                    Companion companion2 = VastActivity.INSTANCE;
                    VastActivity b = companion2.b();
                    if (b != null) {
                        b.finish();
                    }
                    VastActivity.k = null;
                    VastActivity.i = null;
                    VastActivity.n = null;
                    VastActivity.j = null;
                    companion2.a();
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final VastActivity b() {
            return (VastActivity) VastActivity.h.get();
        }

        public final void a(VastActivity vastActivity) {
            VastActivity.h = new WeakReference(vastActivity);
            if (vastActivity == null) {
                a();
            }
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Context context, x xVar, Function0<Unit> function0, y yVar, String str, MetricsRecorder metricsRecorder, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Continuation<? super Unit> continuation) {
            VastActivity.m = yVar;
            VastActivity.k = function0;
            VastActivity.n = metricsRecorder;
            Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new C0336a(aVar, xVar, function1, context, str, null), continuation);
            return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
        }

        public final void a() {
            Job job = VastActivity.l;
            if (job == null || !job.isActive()) {
                return;
            }
            Job job2 = VastActivity.l;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            VastActivity.l = null;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof b.f) || Intrinsics.areEqual(bVar, b.e.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onCreate$1", f = "VastActivity.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Unit> continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = VastActivity.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, VastActivity.f, "VastActivity received event: " + bVar2, null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = VastActivity.g;
                this.b = bVar2;
                this.a = 1;
                if (mutableSharedFlow.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                ResultKt.throwOnFailure(obj);
            }
            if (VastActivity.INSTANCE.a(bVar)) {
                VastActivity.this.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b;
        public final /* synthetic */ Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function2) {
            this.b = aVar;
            this.c = function2;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009520481, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:177)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(VastActivity.this, this.b, this.c, VastActivity.m, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.D, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g.a;
        gVar.a();
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                VastActivity.a(VastActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        r f2 = a.h.a.f();
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n(this, registerForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), gVar.b(), 0L, null, null, 112, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean f3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        boolean b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent2);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        boolean e2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent3);
        Intent intent4 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        boolean d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent4);
        Intent intent5 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
        String a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent5);
        Intent intent6 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(f3, b2, e2, d, a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent6), n);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar2 = this.storeInstallerImpl;
        if (mVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        } else {
            mVar = mVar2;
        }
        Intent intent7 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
        String j2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.j(intent7);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d();
        Intent intent8 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
        boolean f4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent8);
        Intent intent9 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(f4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.g(intent9));
        Intent intent10 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
        boolean b3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent10);
        Intent intent11 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
        boolean e3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent11);
        Intent intent12 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
        String c2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent12);
        Intent intent13 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
        String a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent13);
        Intent intent14 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l a3 = jVar.a(f2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(mVar, j2, dVar, bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(b3, e3, c2, a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent14)), n));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = i;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function2 = j;
        if (function2 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b4 = a.k.a.b();
        Intent intent15 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
        boolean o = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.o(intent15);
        Intent intent16 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
        Boolean m2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.m(intent16);
        Intent intent17 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
        int n2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.n(intent17);
        Intent intent18 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent18, "getIntent(...)");
        int k2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.k(intent18);
        Intent intent19 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent19, "getIntent(...)");
        int l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.l(intent19);
        Intent intent20 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent20, "getIntent(...)");
        boolean i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.i(intent20);
        Intent intent21 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent21, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, f2, this, b4, o, m2, n2, k2, l2, i2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.h(intent21), a3);
        this.ac = a4;
        INSTANCE.a(this);
        FlowKt.launchIn(FlowKt.onEach(a4.a(), new b(null)), this.scope);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1009520481, true, new c(a4, function2)), 1, null);
        a4.d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = k;
        if (function0 != null) {
            function0.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.ac;
        if (aVar != null) {
            aVar.destroy();
        }
        this.ac = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar = this.storeInstallerImpl;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        }
        mVar.cancel();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        INSTANCE.a((VastActivity) null);
    }

    public static final void a(VastActivity vastActivity, ActivityResult activityResult) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultCode=" + activityResult.getResultCode(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultData=" + activityResult.getData(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar = vastActivity.storeInstallerImpl;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        }
        mVar.a(activityResult.getResultCode());
    }
}
