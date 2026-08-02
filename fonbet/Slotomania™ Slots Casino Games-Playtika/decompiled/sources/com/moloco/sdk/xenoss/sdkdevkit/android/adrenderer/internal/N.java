package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes8.dex */
public final class N extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> {
    public static final int p = 8;
    public final Context h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x j;
    public final r k;
    public final CoroutineScope l;
    public final L m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i n;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a o;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastBannerView$listenToPlayerEvents$1", f = "VastBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Unit> continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = N.this.new a(continuation);
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
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
            if (Intrinsics.areEqual(bVar, b.i.b)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = N.this.getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.a(true);
                }
            } else if (!Intrinsics.areEqual(bVar, b.j.b)) {
                if (Intrinsics.areEqual(bVar, b.c.b)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener2 = N.this.getAdShowListener();
                    if (adShowListener2 != null) {
                        adShowListener2.a(false);
                    }
                } else if (Intrinsics.areEqual(bVar, b.a.b)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener3 = N.this.getAdShowListener();
                    if (adShowListener3 != null) {
                        adShowListener3.b();
                    }
                } else if (bVar instanceof b.f) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener4 = N.this.getAdShowListener();
                    if (adShowListener4 != null) {
                        adShowListener4.a(((b.f) bVar).a());
                    }
                } else if (!Intrinsics.areEqual(bVar, b.g.b) && !Intrinsics.areEqual(bVar, b.C0345b.b) && !Intrinsics.areEqual(bVar, b.d.b) && !Intrinsics.areEqual(bVar, b.h.b) && !Intrinsics.areEqual(bVar, b.e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x options, r externalLinkHandler, CoroutineScope scope, L adLoader) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        this.h = context;
        this.i = customUserEventBuilderService;
        this.j = options;
        this.k = externalLinkHandler;
        this.l = scope;
        this.m = adLoader;
        setTag("MolocoVastBannerView");
        this.n = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.o;
        if (aVar != null) {
            aVar.destroy();
        }
        this.o = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d = getAdLoader().d();
        if (d instanceof v.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((v.a) d).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = getAdShowListener();
            if (adShowListener != null) {
                adShowListener.a(cVar);
                return;
            }
            return;
        }
        if (!(d instanceof v.b)) {
            throw new NoWhenBranchMatchedException();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((v.b) d).a(), this.k, this.h, this.i, this.j.i(), this.j.g(), this.j.h(), this.j.e(), this.j.f(), this.j.d(), this.j.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(false, false, false, false, null, null, null).a(this.k, null));
        this.o = a2;
        setAdView(this.j.j().invoke(this.h, a2));
        n();
        a2.d();
    }

    public final void n() {
        Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> a2;
        Flow onEach;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.o;
        if (aVar == null || (a2 = aVar.a()) == null || (onEach = FlowKt.onEach(a2, new a(null))) == null) {
            return;
        }
        FlowKt.launchIn(onEach, this.l);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public L getAdLoader() {
        return this.m;
    }
}
