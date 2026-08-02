package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes3.dex */
public final class f implements e {
    public static final int f = 8;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c a;
    public final CoroutineScope b;
    public final StateFlow<Boolean> c;
    public final MutableSharedFlow<Boolean> d;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> e;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$1", f = "VisibilityAwareVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Unit> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.b = z;
            aVar.c = z2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            boolean z2 = this.c;
            if (z && z2) {
                f.this.a.play();
            } else {
                f.this.a.pause();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$2", f = "VisibilityAwareVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, Boolean, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ boolean c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, boolean z, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> continuation) {
            b bVar = new b(continuation);
            bVar.b = aVar;
            bVar.c = z;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Boolean bool, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> continuation) {
            return a(aVar, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b, false, this.c, false, 5, null);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$3", f = "VisibilityAwareVideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation<? super Unit> continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
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
            f.this.e.setValue((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b);
            return Unit.INSTANCE;
        }
    }

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c basePlayer, Q viewVisibilityTracker) {
        Flow b2;
        Intrinsics.checkNotNullParameter(basePlayer, "basePlayer");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.a = basePlayer;
        CoroutineScope MainScope = CoroutineScopeKt.MainScope();
        this.b = MainScope;
        b2 = g.b(viewVisibilityTracker, basePlayer.N());
        StateFlow<Boolean> stateIn = FlowKt.stateIn(b2, MainScope, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
        this.c = stateIn;
        MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.d = MutableSharedFlow$default;
        this.e = StateFlowKt.MutableStateFlow(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a(basePlayer.isPlaying().getValue(), false, stateIn.getValue().booleanValue(), false, 5, null));
        FlowKt.launchIn(FlowKt.combine(stateIn, MutableSharedFlow$default, new a(null)), MainScope);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(basePlayer.isPlaying(), stateIn, new b(null)), new c(null)), MainScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public boolean C() {
        return this.a.C();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public View N() {
        return this.a.N();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public Object a(Continuation<? super Unit> continuation) {
        return this.a.a(continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void b(boolean z) {
        this.a.b(z);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.b, null, 1, null);
        this.a.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public StateFlow<l> f() {
        return this.a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public String m() {
        return this.a.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public StateFlow<i> o() {
        return this.a.o();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void pause() {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/f;->pause()V");
        VideoEventsManager.onPlayerStop(h.D, this, "exo-player");
        safedk_f_pause_1a63ef16ab77c86cd32efdbbd5391aeb();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void play() {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/f;->play()V");
        VideoEventsManager.onPlayerPlay(h.D, this, "exo-player");
        safedk_f_play_c383d149319f172edf2bd374d20697f2();
    }

    public void safedk_f_pause_1a63ef16ab77c86cd32efdbbd5391aeb() {
        this.d.tryEmit(Boolean.FALSE);
    }

    public void safedk_f_play_c383d149319f172edf2bd374d20697f2() {
        this.d.tryEmit(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void seekTo(long j) {
        this.a.seekTo(j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void a(String str) {
        this.a.a(str);
    }
}
