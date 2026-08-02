package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class q {
    public static final CoroutineContext a = com.moloco.sdk.internal.scheduling.b.a().getMain();

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ MutableState<Boolean> c;
        public final /* synthetic */ MutableState<Boolean> d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e e;
        public final /* synthetic */ State<Function1<Boolean, Unit>> f;
        public final /* synthetic */ State<Function1<Boolean, Unit>> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, State<? extends Function1<? super Boolean, Unit>> state, State<? extends Function1<? super Boolean, Unit>> state2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = mutableState;
            this.d = mutableState2;
            this.e = eVar;
            this.f = state;
            this.g = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation<? super Unit> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.g, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b;
            q.a(this.f).invoke(Boxing.boxBoolean(aVar.e()));
            this.c.setValue(Boxing.boxBoolean(aVar.e()));
            this.d.setValue(Boxing.boxBoolean(aVar.d()));
            q.b(this.g).invoke(Boxing.boxBoolean(aVar.f()));
            View N = this.e.N();
            if (N != null) {
                N.setKeepScreenOn(aVar.d());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$2", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ State<Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit>> state, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super Unit> continuation) {
            return ((b) create(iVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.c, continuation);
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
            q.c(this.c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$3", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ State<Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(State<? extends Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit>> state, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, Continuation<? super Unit> continuation) {
            return ((c) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.c, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            q.d(this.c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$2$1", f = "VastVideoPlayer.kt", i = {0, 1}, l = {114, 116}, m = "invokeSuspend", n = {ViewHierarchyConstants.VIEW_KEY, ViewHierarchyConstants.VIEW_KEY}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        
            if (r1.a(r7) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            View N;
            View view;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                N = this.c.N();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.c;
                if (N != null) {
                    N.setVisibility(4);
                }
                this.a = N;
                this.b = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    view = (View) this.a;
                    ResultKt.throwOnFailure(obj);
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    return Unit.INSTANCE;
                }
                View view2 = (View) this.a;
                ResultKt.throwOnFailure(obj);
                N = view2;
            }
            if (N != null) {
                N.setVisibility(0);
            }
            this.a = N;
            this.b = 2;
            if (DelayKt.delay(50L, this) != coroutine_suspended) {
                view = N;
                if (view != null) {
                }
                if (view != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1", f = "VastVideoPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ String c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> e;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ String c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> d;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = str;
                this.d = mVar;
                this.e = mVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.b;
                String str = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar = this.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar2 = this.e;
                eVar.a(str);
                eVar.seekTo(mVar.a().longValue());
                q.b(eVar, mVar2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = str;
            this.d = mVar;
            this.e = mVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = q.a;
                a aVar = new a(this.b, this.c, this.d, this.e, null);
                this.a = 1;
                if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1", f = "VastVideoPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = mVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                q.b(this.b, this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = q.a;
                a aVar = new a(this.b, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1", f = "VastVideoPlayer.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ boolean c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1$1", f = "VastVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.b(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = q.a;
                a aVar = new a(this.b, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
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

    public static final class h implements DisposableEffectResult {
        public final /* synthetic */ List a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ State c;

        public h(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, State state) {
            this.a = list;
            this.b = eVar;
            this.c = state;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
            }
            this.b.destroy();
            q.a(this.c).invoke(Boolean.FALSE);
        }
    }

    public static final Unit a(String str, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar2, boolean z2, Function1 function1, Function1 function12, Q q, Function1 function13, Function1 function14, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        a(str, z, mVar, mVar2, z2, function1, function12, q, function13, function14, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final MutableState b() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final MutableState c() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar) {
        if (mVar.a().booleanValue()) {
            eVar.play();
        } else {
            eVar.pause();
        }
    }

    public static final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit> c(State<? extends Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit>> state) {
        return (Function1) state.getValue();
    }

    public static final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> d(State<? extends Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String uri, final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> play, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> seekToMillis, final boolean z2, final Function1<? super Boolean, Unit> isPlaying, final Function1<? super Boolean, Unit> isVisible, final Q viewVisibilityTracker, final Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit> onProgressChanged, final Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> onError, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        boolean changed;
        Object rememberedValue;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar;
        Object rememberedValue2;
        Composer.Companion companion;
        Object rememberedValue3;
        Object rememberedValue4;
        boolean changedInstance;
        Object rememberedValue5;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar2;
        boolean changedInstance2;
        Object rememberedValue6;
        boolean changedInstance3;
        Object rememberedValue7;
        int i11;
        boolean z3;
        int i12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar3;
        boolean changedInstance4;
        Object rememberedValue8;
        boolean changedInstance5;
        Object rememberedValue9;
        final View N;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(play, "play");
        Intrinsics.checkNotNullParameter(seekToMillis, "seekToMillis");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(isVisible, "isVisible");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer startRestartGroup = composer.startRestartGroup(32444032);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(uri) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(play) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(seekToMillis) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(isPlaying) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i14 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(isVisible) ? 1048576 : 524288 : 1572864;
            if ((i3 & 128) == 0) {
                i5 = 12582912;
            } else {
                if ((12582912 & i) == 0) {
                    i5 = (16777216 & i) == 0 ? startRestartGroup.changed(viewVisibilityTracker) : startRestartGroup.changedInstance(viewVisibilityTracker) ? 8388608 : 4194304;
                }
                if ((i3 & 256) == 0) {
                    i13 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(onProgressChanged) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((i3 & 512) == 0) {
                        i6 = C.ENCODING_PCM_32BIT;
                    } else {
                        if ((805306368 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(onError) ? 536870912 : 268435456;
                        }
                        i7 = i4;
                        i8 = i3 & 1024;
                        if (i8 != 0) {
                            i10 = i2 | 6;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            if ((i2 & 6) != 0) {
                                i9 = i2;
                                if ((i7 & 306783379) != 306783378 && (i9 & 3) == 2 && startRestartGroup.getSkipping()) {
                                    startRestartGroup.skipToGroupEnd();
                                } else {
                                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(32444032, i7, i9, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayer (VastVideoPlayer.kt:48)");
                                    }
                                    Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    Lifecycle lifecycle = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                                    startRestartGroup.startReplaceableGroup(-794102752);
                                    changed = startRestartGroup.changed(context) | ((i7 & 112) != 32) | startRestartGroup.changed(lifecycle);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context, z, a.g.a.a(), lifecycle, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                                    startRestartGroup.endReplaceableGroup();
                                    Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return q.a();
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(773894976);
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (rememberedValue2 == companion.getEmpty()) {
                                        rememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope((CoroutineContext) function0.invoke(), startRestartGroup));
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                    startRestartGroup.endReplaceableGroup();
                                    final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i7 >> 15) & 14);
                                    final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i7 >> 18) & 14);
                                    Object[] objArr = new Object[0];
                                    startRestartGroup.startReplaceableGroup(-794070732);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == companion.getEmpty()) {
                                        rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return q.b();
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final MutableState mutableState = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
                                    Object[] objArr2 = new Object[0];
                                    startRestartGroup.startReplaceableGroup(-794067820);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == companion.getEmpty()) {
                                        rememberedValue4 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return q.c();
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final MutableState mutableState2 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
                                    final State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i7 >> 24) & 14);
                                    final State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i7 >> 27) & 14);
                                    startRestartGroup.startReplaceableGroup(-794060174);
                                    changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(rememberUpdatedState2) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberUpdatedState3) | startRestartGroup.changed(rememberUpdatedState4);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue5 == companion.getEmpty()) {
                                        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope, mutableState2, mutableState, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, (DisposableEffectScope) obj);
                                            }
                                        };
                                        fVar2 = fVar;
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    } else {
                                        fVar2 = fVar;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.DisposableEffect(fVar2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                                    Unit unit = Unit.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-794023404);
                                    changedInstance2 = startRestartGroup.changedInstance(fVar2);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                                        rememberedValue6 = new d(fVar2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
                                    startRestartGroup.startReplaceableGroup(-794011885);
                                    int i15 = i7 & 896;
                                    changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i7 & 14) != 4) | ((i7 & 7168) != 2048) | (i15 != 256);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (!changedInstance3 || rememberedValue7 == companion.getEmpty()) {
                                        i11 = i7;
                                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar4 = fVar2;
                                        z3 = false;
                                        i12 = 256;
                                        e eVar = new e(fVar4, uri, seekToMillis, play, null);
                                        fVar3 = fVar4;
                                        startRestartGroup.updateRememberedValue(eVar);
                                        rememberedValue7 = eVar;
                                    } else {
                                        i11 = i7;
                                        fVar3 = fVar2;
                                        z3 = false;
                                        i12 = 256;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    int i16 = i11 >> 3;
                                    startRestartGroup = startRestartGroup;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar5 = fVar3;
                                    EffectsKt.LaunchedEffect(fVar5, uri, seekToMillis, (Function2) rememberedValue7, startRestartGroup, ((i11 << 3) & 112) | (i16 & 896));
                                    startRestartGroup.startReplaceableGroup(-793995218);
                                    changedInstance4 = startRestartGroup.changedInstance(fVar5) | (i15 != i12 ? true : z3);
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (!changedInstance4 || rememberedValue8 == companion.getEmpty()) {
                                        rememberedValue8 = new f(fVar5, play, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(fVar5, play, (Function2) rememberedValue8, startRestartGroup, i16 & 112);
                                    Boolean valueOf = Boolean.valueOf(z2);
                                    startRestartGroup.startReplaceableGroup(-793989594);
                                    changedInstance5 = startRestartGroup.changedInstance(fVar5) | ((57344 & i11) != 16384 ? true : z3);
                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (!changedInstance5 || rememberedValue9 == companion.getEmpty()) {
                                        rememberedValue9 = new g(fVar5, z2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(fVar5, valueOf, (Function2) rememberedValue9, startRestartGroup, (i11 >> 9) & 112);
                                    N = fVar5.N();
                                    if (N != null) {
                                        modifier3 = modifier4;
                                    } else {
                                        startRestartGroup.startReplaceableGroup(-1928429689);
                                        boolean changedInstance6 = startRestartGroup.changedInstance(N);
                                        Object rememberedValue10 = startRestartGroup.rememberedValue();
                                        if (changedInstance6 || rememberedValue10 == companion.getEmpty()) {
                                            rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return q.a(N, (Context) obj);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue10);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        modifier3 = modifier4;
                                        AndroidView_androidKt.AndroidView((Function1) rememberedValue10, modifier3, null, startRestartGroup, (i9 << 3) & 112, 4);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    final Modifier modifier5 = modifier2;
                                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return q.a(uri, z, play, seekToMillis, z2, isPlaying, isVisible, viewVisibilityTracker, onProgressChanged, onError, modifier5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i2 | (startRestartGroup.changed(modifier2) ? 4 : 2);
                        }
                        i9 = i10;
                        if ((i7 & 306783379) != 306783378) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Context context2 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Lifecycle lifecycle2 = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                        startRestartGroup.startReplaceableGroup(-794102752);
                        changed = startRestartGroup.changed(context2) | ((i7 & 112) != 32) | startRestartGroup.changed(lifecycle2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context2, z, a.g.a.a(), lifecycle2, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        Function0 function02 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return q.a();
                            }
                        };
                        startRestartGroup.startReplaceableGroup(773894976);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue2 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        final State rememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i7 >> 15) & 14);
                        final State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i7 >> 18) & 14);
                        Object[] objArr3 = new Object[0];
                        startRestartGroup.startReplaceableGroup(-794070732);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState mutableState3 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
                        Object[] objArr22 = new Object[0];
                        startRestartGroup.startReplaceableGroup(-794067820);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState mutableState22 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
                        final State rememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i7 >> 24) & 14);
                        final State rememberUpdatedState42 = SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i7 >> 27) & 14);
                        startRestartGroup.startReplaceableGroup(-794060174);
                        changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState5) | startRestartGroup.changed(mutableState22) | startRestartGroup.changed(mutableState3) | startRestartGroup.changed(rememberUpdatedState22) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changed(rememberUpdatedState32) | startRestartGroup.changed(rememberUpdatedState42);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changedInstance) {
                        }
                        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope2, mutableState22, mutableState3, rememberUpdatedState5, rememberUpdatedState22, rememberUpdatedState32, rememberUpdatedState42, (DisposableEffectScope) obj);
                            }
                        };
                        fVar2 = fVar;
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(fVar2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                        Unit unit2 = Unit.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-794023404);
                        changedInstance2 = startRestartGroup.changedInstance(fVar2);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue6 = new d(fVar2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-794011885);
                        int i152 = i7 & 896;
                        changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i7 & 14) != 4) | ((i7 & 7168) != 2048) | (i152 != 256);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changedInstance3) {
                        }
                        i11 = i7;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar42 = fVar2;
                        z3 = false;
                        i12 = 256;
                        e eVar2 = new e(fVar42, uri, seekToMillis, play, null);
                        fVar3 = fVar42;
                        startRestartGroup.updateRememberedValue(eVar2);
                        rememberedValue7 = eVar2;
                        startRestartGroup.endReplaceableGroup();
                        int i162 = i11 >> 3;
                        startRestartGroup = startRestartGroup;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar52 = fVar3;
                        EffectsKt.LaunchedEffect(fVar52, uri, seekToMillis, (Function2) rememberedValue7, startRestartGroup, ((i11 << 3) & 112) | (i162 & 896));
                        startRestartGroup.startReplaceableGroup(-793995218);
                        changedInstance4 = startRestartGroup.changedInstance(fVar52) | (i152 != i12 ? true : z3);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changedInstance4) {
                        }
                        rememberedValue8 = new f(fVar52, play, null);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(fVar52, play, (Function2) rememberedValue8, startRestartGroup, i162 & 112);
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        startRestartGroup.startReplaceableGroup(-793989594);
                        changedInstance5 = startRestartGroup.changedInstance(fVar52) | ((57344 & i11) != 16384 ? true : z3);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (!changedInstance5) {
                        }
                        rememberedValue9 = new g(fVar52, z2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(fVar52, valueOf2, (Function2) rememberedValue9, startRestartGroup, (i11 >> 9) & 112);
                        N = fVar52.N();
                        if (N != null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i4 |= i6;
                    i7 = i4;
                    i8 = i3 & 1024;
                    if (i8 != 0) {
                    }
                    i9 = i10;
                    if ((i7 & 306783379) != 306783378) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Context context22 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Lifecycle lifecycle22 = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                    startRestartGroup.startReplaceableGroup(-794102752);
                    changed = startRestartGroup.changed(context22) | ((i7 & 112) != 32) | startRestartGroup.changed(lifecycle22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context22, z, a.g.a.a(), lifecycle22, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    Function0 function022 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.a();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue2 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    final State rememberUpdatedState52 = SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i7 >> 15) & 14);
                    final State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i7 >> 18) & 14);
                    Object[] objArr32 = new Object[0];
                    startRestartGroup.startReplaceableGroup(-794070732);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState mutableState32 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
                    Object[] objArr222 = new Object[0];
                    startRestartGroup.startReplaceableGroup(-794067820);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState mutableState222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
                    final State rememberUpdatedState322 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i7 >> 24) & 14);
                    final State rememberUpdatedState422 = SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i7 >> 27) & 14);
                    startRestartGroup.startReplaceableGroup(-794060174);
                    changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState52) | startRestartGroup.changed(mutableState222) | startRestartGroup.changed(mutableState32) | startRestartGroup.changed(rememberUpdatedState222) | startRestartGroup.changedInstance(coroutineScope22) | startRestartGroup.changed(rememberUpdatedState322) | startRestartGroup.changed(rememberUpdatedState422);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope22, mutableState222, mutableState32, rememberUpdatedState52, rememberUpdatedState222, rememberUpdatedState322, rememberUpdatedState422, (DisposableEffectScope) obj);
                        }
                    };
                    fVar2 = fVar;
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(fVar2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                    Unit unit22 = Unit.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-794023404);
                    changedInstance2 = startRestartGroup.changedInstance(fVar2);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue6 = new d(fVar2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-794011885);
                    int i1522 = i7 & 896;
                    changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i7 & 14) != 4) | ((i7 & 7168) != 2048) | (i1522 != 256);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance3) {
                    }
                    i11 = i7;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar422 = fVar2;
                    z3 = false;
                    i12 = 256;
                    e eVar22 = new e(fVar422, uri, seekToMillis, play, null);
                    fVar3 = fVar422;
                    startRestartGroup.updateRememberedValue(eVar22);
                    rememberedValue7 = eVar22;
                    startRestartGroup.endReplaceableGroup();
                    int i1622 = i11 >> 3;
                    startRestartGroup = startRestartGroup;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar522 = fVar3;
                    EffectsKt.LaunchedEffect(fVar522, uri, seekToMillis, (Function2) rememberedValue7, startRestartGroup, ((i11 << 3) & 112) | (i1622 & 896));
                    startRestartGroup.startReplaceableGroup(-793995218);
                    changedInstance4 = startRestartGroup.changedInstance(fVar522) | (i1522 != i12 ? true : z3);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue8 = new f(fVar522, play, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(fVar522, play, (Function2) rememberedValue8, startRestartGroup, i1622 & 112);
                    Boolean valueOf22 = Boolean.valueOf(z2);
                    startRestartGroup.startReplaceableGroup(-793989594);
                    changedInstance5 = startRestartGroup.changedInstance(fVar522) | ((57344 & i11) != 16384 ? true : z3);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changedInstance5) {
                    }
                    rememberedValue9 = new g(fVar522, z2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(fVar522, valueOf22, (Function2) rememberedValue9, startRestartGroup, (i11 >> 9) & 112);
                    N = fVar522.N();
                    if (N != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 |= i13;
                if ((i3 & 512) == 0) {
                }
                i4 |= i6;
                i7 = i4;
                i8 = i3 & 1024;
                if (i8 != 0) {
                }
                i9 = i10;
                if ((i7 & 306783379) != 306783378) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Context context222 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Lifecycle lifecycle222 = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                startRestartGroup.startReplaceableGroup(-794102752);
                changed = startRestartGroup.changed(context222) | ((i7 & 112) != 32) | startRestartGroup.changed(lifecycle222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context222, z, a.g.a.a(), lifecycle222, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                startRestartGroup.updateRememberedValue(rememberedValue);
                fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                Function0 function0222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.a();
                    }
                };
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue2 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                final State rememberUpdatedState522 = SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i7 >> 15) & 14);
                final State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i7 >> 18) & 14);
                Object[] objArr322 = new Object[0];
                startRestartGroup.startReplaceableGroup(-794070732);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState322 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr322, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
                Object[] objArr2222 = new Object[0];
                startRestartGroup.startReplaceableGroup(-794067820);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState2222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2222, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
                final State rememberUpdatedState3222 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i7 >> 24) & 14);
                final State rememberUpdatedState4222 = SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i7 >> 27) & 14);
                startRestartGroup.startReplaceableGroup(-794060174);
                changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState522) | startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(mutableState322) | startRestartGroup.changed(rememberUpdatedState2222) | startRestartGroup.changedInstance(coroutineScope222) | startRestartGroup.changed(rememberUpdatedState3222) | startRestartGroup.changed(rememberUpdatedState4222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope222, mutableState2222, mutableState322, rememberUpdatedState522, rememberUpdatedState2222, rememberUpdatedState3222, rememberUpdatedState4222, (DisposableEffectScope) obj);
                    }
                };
                fVar2 = fVar;
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(fVar2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                Unit unit222 = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(-794023404);
                changedInstance2 = startRestartGroup.changedInstance(fVar2);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue6 = new d(fVar2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-794011885);
                int i15222 = i7 & 896;
                changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i7 & 14) != 4) | ((i7 & 7168) != 2048) | (i15222 != 256);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance3) {
                }
                i11 = i7;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar4222 = fVar2;
                z3 = false;
                i12 = 256;
                e eVar222 = new e(fVar4222, uri, seekToMillis, play, null);
                fVar3 = fVar4222;
                startRestartGroup.updateRememberedValue(eVar222);
                rememberedValue7 = eVar222;
                startRestartGroup.endReplaceableGroup();
                int i16222 = i11 >> 3;
                startRestartGroup = startRestartGroup;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar5222 = fVar3;
                EffectsKt.LaunchedEffect(fVar5222, uri, seekToMillis, (Function2) rememberedValue7, startRestartGroup, ((i11 << 3) & 112) | (i16222 & 896));
                startRestartGroup.startReplaceableGroup(-793995218);
                changedInstance4 = startRestartGroup.changedInstance(fVar5222) | (i15222 != i12 ? true : z3);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue8 = new f(fVar5222, play, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(fVar5222, play, (Function2) rememberedValue8, startRestartGroup, i16222 & 112);
                Boolean valueOf222 = Boolean.valueOf(z2);
                startRestartGroup.startReplaceableGroup(-793989594);
                changedInstance5 = startRestartGroup.changedInstance(fVar5222) | ((57344 & i11) != 16384 ? true : z3);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changedInstance5) {
                }
                rememberedValue9 = new g(fVar5222, z2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(fVar5222, valueOf222, (Function2) rememberedValue9, startRestartGroup, (i11 >> 9) & 112);
                N = fVar5222.N();
                if (N != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 |= i5;
            if ((i3 & 256) == 0) {
            }
            i4 |= i13;
            if ((i3 & 512) == 0) {
            }
            i4 |= i6;
            i7 = i4;
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i9 = i10;
            if ((i7 & 306783379) != 306783378) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2222 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Lifecycle lifecycle2222 = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            startRestartGroup.startReplaceableGroup(-794102752);
            changed = startRestartGroup.changed(context2222) | ((i7 & 112) != 32) | startRestartGroup.changed(lifecycle2222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context2222, z, a.g.a.a(), lifecycle2222, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
            startRestartGroup.updateRememberedValue(rememberedValue);
            fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Function0 function02222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q.a();
                }
            };
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            final State rememberUpdatedState5222 = SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i7 >> 15) & 14);
            final State rememberUpdatedState22222 = SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i7 >> 18) & 14);
            Object[] objArr3222 = new Object[0];
            startRestartGroup.startReplaceableGroup(-794070732);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState3222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr3222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
            Object[] objArr22222 = new Object[0];
            startRestartGroup.startReplaceableGroup(-794067820);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState22222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr22222, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
            final State rememberUpdatedState32222 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i7 >> 24) & 14);
            final State rememberUpdatedState42222 = SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i7 >> 27) & 14);
            startRestartGroup.startReplaceableGroup(-794060174);
            changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState5222) | startRestartGroup.changed(mutableState22222) | startRestartGroup.changed(mutableState3222) | startRestartGroup.changed(rememberUpdatedState22222) | startRestartGroup.changedInstance(coroutineScope2222) | startRestartGroup.changed(rememberUpdatedState32222) | startRestartGroup.changed(rememberUpdatedState42222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope2222, mutableState22222, mutableState3222, rememberUpdatedState5222, rememberUpdatedState22222, rememberUpdatedState32222, rememberUpdatedState42222, (DisposableEffectScope) obj);
                }
            };
            fVar2 = fVar;
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(fVar2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
            Unit unit2222 = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(-794023404);
            changedInstance2 = startRestartGroup.changedInstance(fVar2);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue6 = new d(fVar2, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-794011885);
            int i152222 = i7 & 896;
            changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i7 & 14) != 4) | ((i7 & 7168) != 2048) | (i152222 != 256);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance3) {
            }
            i11 = i7;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar42222 = fVar2;
            z3 = false;
            i12 = 256;
            e eVar2222 = new e(fVar42222, uri, seekToMillis, play, null);
            fVar3 = fVar42222;
            startRestartGroup.updateRememberedValue(eVar2222);
            rememberedValue7 = eVar2222;
            startRestartGroup.endReplaceableGroup();
            int i162222 = i11 >> 3;
            startRestartGroup = startRestartGroup;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar52222 = fVar3;
            EffectsKt.LaunchedEffect(fVar52222, uri, seekToMillis, (Function2) rememberedValue7, startRestartGroup, ((i11 << 3) & 112) | (i162222 & 896));
            startRestartGroup.startReplaceableGroup(-793995218);
            changedInstance4 = startRestartGroup.changedInstance(fVar52222) | (i152222 != i12 ? true : z3);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue8 = new f(fVar52222, play, null);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(fVar52222, play, (Function2) rememberedValue8, startRestartGroup, i162222 & 112);
            Boolean valueOf2222 = Boolean.valueOf(z2);
            startRestartGroup.startReplaceableGroup(-793989594);
            changedInstance5 = startRestartGroup.changedInstance(fVar52222) | ((57344 & i11) != 16384 ? true : z3);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue9 = new g(fVar52222, z2, null);
            startRestartGroup.updateRememberedValue(rememberedValue9);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(fVar52222, valueOf2222, (Function2) rememberedValue9, startRestartGroup, (i11 >> 9) & 112);
            N = fVar52222.N();
            if (N != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 |= i14;
        if ((i3 & 128) == 0) {
        }
        i4 |= i5;
        if ((i3 & 256) == 0) {
        }
        i4 |= i13;
        if ((i3 & 512) == 0) {
        }
        i4 |= i6;
        i7 = i4;
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i9 = i10;
        if ((i7 & 306783379) != 306783378) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Context context22222 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Lifecycle lifecycle22222 = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        startRestartGroup.startReplaceableGroup(-794102752);
        changed = startRestartGroup.changed(context22222) | ((i7 & 112) != 32) | startRestartGroup.changed(lifecycle22222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context22222, z, a.g.a.a(), lifecycle22222, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
        startRestartGroup.updateRememberedValue(rememberedValue);
        fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Function0 function022222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.a();
            }
        };
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        final State rememberUpdatedState52222 = SnapshotStateKt.rememberUpdatedState(isPlaying, startRestartGroup, (i7 >> 15) & 14);
        final State rememberUpdatedState222222 = SnapshotStateKt.rememberUpdatedState(isVisible, startRestartGroup, (i7 >> 18) & 14);
        Object[] objArr32222 = new Object[0];
        startRestartGroup.startReplaceableGroup(-794070732);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState mutableState32222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr32222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
        Object[] objArr222222 = new Object[0];
        startRestartGroup.startReplaceableGroup(-794067820);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState mutableState222222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr222222, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
        final State rememberUpdatedState322222 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, startRestartGroup, (i7 >> 24) & 14);
        final State rememberUpdatedState422222 = SnapshotStateKt.rememberUpdatedState(onError, startRestartGroup, (i7 >> 27) & 14);
        startRestartGroup.startReplaceableGroup(-794060174);
        changedInstance = startRestartGroup.changedInstance(fVar) | startRestartGroup.changed(rememberUpdatedState52222) | startRestartGroup.changed(mutableState222222) | startRestartGroup.changed(mutableState32222) | startRestartGroup.changed(rememberUpdatedState222222) | startRestartGroup.changedInstance(coroutineScope22222) | startRestartGroup.changed(rememberUpdatedState322222) | startRestartGroup.changed(rememberUpdatedState422222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope22222, mutableState222222, mutableState32222, rememberUpdatedState52222, rememberUpdatedState222222, rememberUpdatedState322222, rememberUpdatedState422222, (DisposableEffectScope) obj);
            }
        };
        fVar2 = fVar;
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(fVar2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
        Unit unit22222 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(-794023404);
        changedInstance2 = startRestartGroup.changedInstance(fVar2);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue6 = new d(fVar2, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-794011885);
        int i1522222 = i7 & 896;
        changedInstance3 = startRestartGroup.changedInstance(fVar2) | ((i7 & 14) != 4) | ((i7 & 7168) != 2048) | (i1522222 != 256);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (changedInstance3) {
        }
        i11 = i7;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar422222 = fVar2;
        z3 = false;
        i12 = 256;
        e eVar22222 = new e(fVar422222, uri, seekToMillis, play, null);
        fVar3 = fVar422222;
        startRestartGroup.updateRememberedValue(eVar22222);
        rememberedValue7 = eVar22222;
        startRestartGroup.endReplaceableGroup();
        int i1622222 = i11 >> 3;
        startRestartGroup = startRestartGroup;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar522222 = fVar3;
        EffectsKt.LaunchedEffect(fVar522222, uri, seekToMillis, (Function2) rememberedValue7, startRestartGroup, ((i11 << 3) & 112) | (i1622222 & 896));
        startRestartGroup.startReplaceableGroup(-793995218);
        changedInstance4 = startRestartGroup.changedInstance(fVar522222) | (i1522222 != i12 ? true : z3);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue8 = new f(fVar522222, play, null);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(fVar522222, play, (Function2) rememberedValue8, startRestartGroup, i1622222 & 112);
        Boolean valueOf22222 = Boolean.valueOf(z2);
        startRestartGroup.startReplaceableGroup(-793989594);
        changedInstance5 = startRestartGroup.changedInstance(fVar522222) | ((57344 & i11) != 16384 ? true : z3);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue9 = new g(fVar522222, z2, null);
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(fVar522222, valueOf22222, (Function2) rememberedValue9, startRestartGroup, (i11 >> 9) & 112);
        N = fVar522222.N();
        if (N != null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Function1<Boolean, Unit> b(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }

    public static final CoroutineContext a() {
        return a;
    }

    public static final DisposableEffectResult a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, State state, State state2, State state3, State state4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new h(CollectionsKt.listOf((Object[]) new Job[]{FlowKt.launchIn(FlowKt.onEach(eVar.isPlaying(), new a(mutableState, mutableState2, eVar, state, state2, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(eVar.o(), new b(state3, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(eVar.f()), new c(state4, null)), coroutineScope)}), eVar, state);
    }

    public static final FrameLayout a(View view, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final Function1<Boolean, Unit> a(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }
}
