package com.giphy.sdk.ui.views;

import O8.r;
import O8.t;
import P8.j;
import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.C1483w0;
import Ph.P;
import U8.c;
import W9.d;
import X9.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2102n0;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.views.GPHVideoControls;
import com.google.android.material.shape.i;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.a;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 X2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ7\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0011J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\fJ\u001d\u0010)\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0014¢\u0006\u0004\b+\u0010\fR\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010-R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010-R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010W\u001a\u0012\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\n0Rj\u0002`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lcom/giphy/sdk/ui/views/GPHVideoControls;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "v", "()V", "A", "", "pause", "H", "(Z)V", "u", "w", "o", "", ViewProps.POSITION, C5444x.f55808b, "(J)V", "C", ReactProgressBarViewManager.PROP_PROGRESS, "sound", "rewind", "forward", "E", "(ZZZZ)V", "delay", "p", "I", ViewProps.VISIBLE, "G", "s", "t", "Lkotlin/Function0;", ViewProps.ON_CLICK, "setPreviewMode", "(Lkotlin/jvm/functions/Function0;)V", "onAttachedToWindow", "a", "Z", "firstStart", com.google.crypto.tink.integration.android.b.f37029b, "previewMode", "LU8/b;", "c", "LU8/b;", "player", "Lcom/giphy/sdk/core/models/Media;", d.f13160a, "Lcom/giphy/sdk/core/models/Media;", "media", "Landroidx/core/view/n0;", e.f29601m, "Landroidx/core/view/n0;", "hideControlsAnimation", "f", "hideSeekOverlayAnimation", "", "g", "F", "lastTouchX", C4527h.f48087o, "isDoubleClickPossible", "LPh/C0;", i.f35755A, "LPh/C0;", "clickJob", "j", "Lcom/giphy/sdk/ui/views/GPHVideoPlayerView;", "k", "Lcom/giphy/sdk/ui/views/GPHVideoPlayerView;", "playerView", "LP8/j;", "l", "LP8/j;", "viewBinding", "Lkotlin/Function1;", "LU8/c;", "Lcom/giphy/sdk/ui/utils/GPHPlayerStateListener;", m.f13664a, "Lkotlin/jvm/functions/Function1;", "listener", "n", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GPHVideoControls extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean firstStart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean previewMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public U8.b player;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Media media;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public C2102n0 hideControlsAnimation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public C2102n0 hideSeekOverlayAnimation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float lastTouchX;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isDoubleClickPossible;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public C0 clickJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean pause;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public GPHVideoPlayerView playerView;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final j viewBinding;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Function1 listener;

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(U8.c playerState) {
            Intrinsics.checkNotNullParameter(playerState, "playerState");
            if (Intrinsics.areEqual(playerState, c.d.f12139a) ? true : Intrinsics.areEqual(playerState, c.a.f12136a) ? true : Intrinsics.areEqual(playerState, c.C0252c.f12138a)) {
                GPHVideoControls.this.viewBinding.f8913e.setVisibility(4);
                return;
            }
            if (!Intrinsics.areEqual(playerState, c.f.f12141a)) {
                if (playerState instanceof c.b) {
                    GPHVideoControls.this.G(((c.b) playerState).a());
                    return;
                }
                return;
            }
            GPHVideoControls.this.pause = false;
            GPHVideoControls.this.viewBinding.f8913e.setVisibility(0);
            if (!GPHVideoControls.this.firstStart) {
                GPHVideoControls.q(GPHVideoControls.this, 0L, 1, null);
            } else {
                GPHVideoControls.this.firstStart = false;
                GPHVideoControls.this.p(3000L);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U8.c) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f31805n;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return GPHVideoControls.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f31805n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31805n = 1;
                if (AbstractC1440a0.a(250L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GPHVideoControls.this.u();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GPHVideoControls(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void B(GPHVideoControls this$0, View view) {
        C0 d10;
        U8.b bVar;
        Media media;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        U8.b bVar2 = this$0.player;
        U8.b bVar3 = null;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar2 = null;
        }
        String id2 = bVar2.e().getId();
        Media media2 = this$0.media;
        if (media2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("media");
            media2 = null;
        }
        if (!Intrinsics.areEqual(id2, media2.getId())) {
            GPHVideoPlayerView gPHVideoPlayerView = this$0.playerView;
            if (gPHVideoPlayerView != null) {
                gPHVideoPlayerView.k();
            }
            this$0.pause = false;
            U8.b bVar4 = this$0.player;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                bVar = null;
            } else {
                bVar = bVar4;
            }
            Media media3 = this$0.media;
            if (media3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("media");
                media = null;
            } else {
                media = media3;
            }
            GPHVideoPlayerView gPHVideoPlayerView2 = this$0.playerView;
            U8.b bVar5 = this$0.player;
            if (bVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                bVar3 = bVar5;
            }
            U8.b.m(bVar, media, false, gPHVideoPlayerView2, Boolean.valueOf(bVar3.h()), 2, null);
            return;
        }
        if (this$0.pause) {
            this$0.v();
            return;
        }
        int width = this$0.getWidth() / 3;
        float f10 = this$0.lastTouchX;
        float f11 = width;
        if (f10 >= f11 && f10 <= this$0.getWidth() - width) {
            C0 c02 = this$0.clickJob;
            if (c02 != null) {
                C0.a.b(c02, null, 1, null);
            }
            this$0.clickJob = null;
            this$0.isDoubleClickPossible = false;
            this$0.u();
            return;
        }
        if (this$0.isDoubleClickPossible) {
            if (this$0.lastTouchX < f11) {
                this$0.w();
            } else {
                this$0.o();
            }
            C0 c03 = this$0.clickJob;
            if (c03 != null) {
                C0.a.b(c03, null, 1, null);
            }
            this$0.clickJob = null;
        } else {
            d10 = AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, this$0.new c(null), 2, null);
            this$0.clickJob = d10;
        }
        this$0.isDoubleClickPossible = !this$0.isDoubleClickPossible;
    }

    public static final void D(GPHVideoControls this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.viewBinding.f8915g.setVisibility(8);
    }

    public static /* synthetic */ void F(GPHVideoControls gPHVideoControls, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        gPHVideoControls.E(z10, z11, z12, z13);
    }

    public static final void g(GPHVideoControls this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        U8.b bVar = this$0.player;
        if (bVar != null) {
            U8.b bVar2 = null;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                bVar = null;
            }
            U8.b bVar3 = this$0.player;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                bVar2 = bVar3;
            }
            bVar.t(!bVar2.i());
            F(this$0, true, true, false, false, 12, null);
        }
    }

    public static /* synthetic */ void q(GPHVideoControls gPHVideoControls, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 2000;
        }
        gPHVideoControls.p(j10);
    }

    public static final void r(GPHVideoControls this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.viewBinding.f8911c.setVisibility(8);
    }

    public static final void y(Function0 onClick, View view) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    public static final boolean z(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void A() {
        setOnClickListener(new View.OnClickListener() { // from class: V8.I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GPHVideoControls.B(GPHVideoControls.this, view);
            }
        });
    }

    public final void C() {
        C2102n0 c2102n0 = this.hideSeekOverlayAnimation;
        if (c2102n0 != null) {
            c2102n0.c();
        }
        this.viewBinding.f8915g.setVisibility(0);
        this.viewBinding.f8915g.setAlpha(1.0f);
        C2102n0 i10 = AbstractC2082d0.f(this.viewBinding.f8915g).b(0.0f).m(new Runnable() { // from class: V8.K
            @Override // java.lang.Runnable
            public final void run() {
                GPHVideoControls.D(GPHVideoControls.this);
            }
        }).e(250L).i(1000L);
        this.hideSeekOverlayAnimation = i10;
        if (i10 != null) {
            i10.k();
        }
    }

    public final void E(boolean progress, boolean sound, boolean rewind, boolean forward) {
        a.a("showControls", new Object[0]);
        C2102n0 c2102n0 = this.hideControlsAnimation;
        if (c2102n0 != null) {
            c2102n0.c();
        }
        this.hideControlsAnimation = null;
        this.viewBinding.f8911c.setAlpha(1.0f);
        this.viewBinding.f8911c.setVisibility(0);
        this.viewBinding.f8916h.setVisibility(sound ? 0 : 8);
        this.viewBinding.f8913e.setVisibility(progress ? 0 : 8);
        this.viewBinding.f8914f.setVisibility(rewind ? 0 : 8);
        this.viewBinding.f8912d.setVisibility(forward ? 0 : 8);
        U8.b bVar = this.player;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar = null;
        }
        if (bVar.k()) {
            q(this, 0L, 1, null);
        }
    }

    public final void G(boolean visible) {
        this.viewBinding.f8910b.setImageResource(visible ? r.f8417e : r.f8416d);
    }

    public final void H(boolean pause) {
        U8.b bVar = this.player;
        if (bVar == null) {
            return;
        }
        if (pause) {
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                bVar = null;
            }
            bVar.o();
            return;
        }
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar = null;
        }
        bVar.p();
    }

    public final void I() {
        U8.b bVar = this.player;
        if (bVar != null) {
            ImageButton imageButton = this.viewBinding.f8916h;
            U8.b bVar2 = null;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                bVar = null;
            }
            imageButton.setImageResource(bVar.j() > 0.0f ? r.f8428p : r.f8423k);
            ImageButton imageButton2 = this.viewBinding.f8917i;
            U8.b bVar3 = this.player;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                bVar2 = bVar3;
            }
            imageButton2.setVisibility(bVar2.j() == 0.0f ? 0 : 8);
        }
    }

    public final void o() {
        this.viewBinding.f8912d.u();
        U8.b bVar = this.player;
        U8.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar = null;
        }
        long d10 = bVar.d();
        U8.b bVar3 = this.player;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            bVar2 = bVar3;
        }
        x(Math.min(d10, bVar2.c() + 5000));
        F(this, true, false, false, true, 6, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        I();
    }

    public final void p(long delay) {
        a.a("hideControls", new Object[0]);
        C2102n0 c2102n0 = this.hideControlsAnimation;
        if (c2102n0 != null) {
            c2102n0.c();
        }
        this.hideControlsAnimation = null;
        if (this.previewMode) {
            return;
        }
        C2102n0 i10 = AbstractC2082d0.f(this.viewBinding.f8911c).b(0.0f).m(new Runnable() { // from class: V8.J
            @Override // java.lang.Runnable
            public final void run() {
                GPHVideoControls.r(GPHVideoControls.this);
            }
        }).e(400L).i(delay);
        this.hideControlsAnimation = i10;
        if (i10 != null) {
            i10.k();
        }
    }

    public final void s() {
        this.pause = true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setPreviewMode(@NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.previewMode = true;
        setOnClickListener(new View.OnClickListener() { // from class: V8.F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GPHVideoControls.y(Function0.this, view);
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: V8.G
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z10;
                z10 = GPHVideoControls.z(view, motionEvent);
                return z10;
            }
        });
        F(this, false, true, false, false, 13, null);
    }

    public final void t() {
        this.pause = false;
    }

    public final void u() {
        this.isDoubleClickPossible = false;
        U8.b bVar = this.player;
        U8.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar = null;
        }
        U8.b bVar3 = this.player;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            bVar2 = bVar3;
        }
        bVar.u(bVar2.j() <= 0.0f ? 1.0f : 0.0f);
        F(this, true, true, false, false, 12, null);
    }

    public final void v() {
        this.pause = false;
        H(false);
        C0 c02 = this.clickJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.clickJob = null;
    }

    public final void w() {
        this.viewBinding.f8914f.u();
        U8.b bVar = this.player;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar = null;
        }
        x(Math.max(0L, bVar.c() - 5000));
        F(this, true, false, true, false, 10, null);
    }

    public final void x(long position) {
        U8.b bVar = this.player;
        U8.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar = null;
        }
        bVar.s(position);
        ProgressBar progressBar = this.viewBinding.f8913e;
        long j10 = 100;
        U8.b bVar3 = this.player;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            bVar3 = null;
        }
        long c10 = j10 * bVar3.c();
        U8.b bVar4 = this.player;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            bVar2 = bVar4;
        }
        progressBar.setProgress((int) (c10 / bVar2.d()));
        C();
    }

    public /* synthetic */ GPHVideoControls(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPHVideoControls(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pause = true;
        j a10 = j.a(View.inflate(context, t.f8545p, this));
        Intrinsics.checkNotNullExpressionValue(a10, "bind(\n            Constr…s\n            )\n        )");
        this.viewBinding = a10;
        this.listener = new b();
        A();
        a10.f8916h.setClickable(false);
        a10.f8917i.setClickable(false);
        a10.f8910b.setOnClickListener(new View.OnClickListener() { // from class: V8.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GPHVideoControls.g(GPHVideoControls.this, view);
            }
        });
    }
}
