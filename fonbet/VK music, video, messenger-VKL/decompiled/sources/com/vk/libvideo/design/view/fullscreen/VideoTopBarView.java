package com.vk.libvideo.design.view.fullscreen;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vk.fullscreenvideo.design.view.top.a;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.avj0;
import xsna.b6l;
import xsna.bdn;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e43;
import xsna.etn;
import xsna.fnj;
import xsna.gsi0;
import xsna.hpj;
import xsna.iah0;
import xsna.ie00;
import xsna.izs;
import xsna.msy;
import xsna.myc0;
import xsna.q8p0;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.uho0;
import xsna.vhn0;
import xsna.whn0;
import xsna.wzs;
import xsna.y6c;
import xsna.yok0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: VideoTopBarView.kt */
/* loaded from: classes2.dex */
public final class VideoTopBarView extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public final Object b;
    public final Object c;
    public final boolean d;
    public final boolean e;
    public final ViewStub f;
    public izs<? super com.vk.fullscreenvideo.a, s3q0> g;
    public final etn h;
    public com.vk.fullscreenvideo.design.view.top.a i;
    public final hpj j;
    public final List<a.d> k;
    public yok0 l;

    /* compiled from: VideoTopBarView.kt */
    @b6l(c = "com.vk.libvideo.design.view.fullscreen.VideoTopBarView$setIsPlayNextEnabled$1", f = "VideoTopBarView.kt", l = {198}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$isEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return VideoTopBarView.this.new a(this.$isEnabled, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.fullscreenvideo.design.view.top.a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    com.vk.fullscreenvideo.design.view.top.a aVar2 = VideoTopBarView.this.i;
                    if (aVar2 != null) {
                        aVar2.d(true, this.$isEnabled);
                    }
                    this.label = 1;
                    if (qsl.b(800L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                if (aVar != null) {
                    aVar.d(false, this.$isEnabled);
                }
                return s3q0.a;
            } finally {
                aVar = VideoTopBarView.this.i;
                if (aVar != null) {
                    aVar.d(false, this.$isEnabled);
                }
            }
        }
    }

    public VideoTopBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.video.kidsprofile.restricteduseractions.a getRestrictedUserActionsRepository() {
        return (com.vk.video.kidsprofile.restricteduseractions.a) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getShouldShowFeedback() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(q8p0 q8p0Var) {
        int i;
        com.vk.fullscreenvideo.design.view.top.a aVar;
        boolean z;
        boolean z2;
        a.C1076a.C1077a c1077a;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        boolean z3 = q8p0Var.a;
        VideoFile videoFile = q8p0Var.c;
        boolean z4 = q8p0Var.b;
        if (this.d) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(context) && !z4) {
                i = iah0.a(4);
                setPadding(i, getPaddingTop(), i, getPaddingBottom());
                b(videoFile);
                aVar = this.i;
                if (aVar == null) {
                    boolean z5 = q8p0Var.a;
                    VideoFile videoFile2 = q8p0Var.c;
                    ControlsState.ScreenState screenState = z4 ? ControlsState.ScreenState.FULLSCREEN : ControlsState.ScreenState.DISCOVERY;
                    boolean shouldShowFeedback = getShouldShowFeedback();
                    boolean z6 = q8p0Var.g;
                    boolean z7 = q8p0Var.h;
                    boolean z8 = !z4 ? d.u().b : !z3 ? !d.w().b : !d.v().b;
                    boolean j = this.h.j(false, Boolean.valueOf(videoFile.T1()));
                    boolean z9 = z3 ? d.v().d : d.w().d;
                    boolean z10 = q8p0Var.e;
                    boolean z11 = q8p0Var.f;
                    ControlsState.CastStatus castStatus = q8p0Var.i;
                    getRestrictedUserActionsRepository().getClass();
                    String P = videoFile.P();
                    if (P == null) {
                        P = "";
                    }
                    boolean Cb = videoFile.Y().Cb();
                    DonutVideoUiModel donutVideoUiModel = q8p0Var.d;
                    if (donutVideoUiModel == null || (descriptionChip = donutVideoUiModel.c) == null) {
                        z = z10;
                        z2 = z11;
                        c1077a = null;
                    } else {
                        z = z10;
                        z2 = z11;
                        c1077a = new a.C1076a.C1077a(new y6c(descriptionChip, 18), descriptionChip.d);
                    }
                    aVar.setState(new a.C1076a(z5, screenState, videoFile2, shouldShowFeedback, new a.C1076a.b(P, Cb, c1077a), z6, z7, z8, this.e, j, z9, z, z2, this.d, castStatus));
                    return;
                }
                return;
            }
        }
        i = 0;
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
        b(videoFile);
        aVar = this.i;
        if (aVar == null) {
        }
    }

    public final void b(VideoFile videoFile) {
        ViewStub viewStub = this.f;
        if (bwt0.J(viewStub)) {
            return;
        }
        if (videoFile != null ? videoFile.T1() : false) {
            return;
        }
        if (this.h.j(iah0.r(getContext()), videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) || this.d) {
            viewStub.inflate();
        }
    }

    public final Rect getSettingsButtonBoundsInWindow() {
        com.vk.fullscreenvideo.design.view.top.a aVar = this.i;
        if (aVar != null) {
            return aVar.getSettingsButtonBoundsInWindow();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zvj.c(this.j, null);
    }

    public final void setAutoplayInactive(boolean z) {
        b(null);
        com.vk.fullscreenvideo.design.view.top.a aVar = this.i;
        if (aVar != null) {
            aVar.setIsAutoplayInactive(z);
        }
    }

    public final void setIsPlayNextEnabled(boolean z) {
        b(null);
        yok0 yok0Var = this.l;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.l = myc0.h(this.j, null, null, new a(z, null), 3);
    }

    public final void setScreenState(VideoMinimizableState videoMinimizableState) {
        com.vk.fullscreenvideo.design.view.top.a aVar;
        if (bwt0.J(this.f) && (aVar = this.i) != null) {
            aVar.setScreenState(videoMinimizableState instanceof VideoMinimizableState.Animating ? ControlsState.ScreenState.TRANSITION : videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? ControlsState.ScreenState.FULLSCREEN : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? !((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b ? ControlsState.ScreenState.FULLSCREEN : ControlsState.ScreenState.DISCOVERY : ControlsState.ScreenState.DISCOVERY);
        }
    }

    public final void setSmallScreenMode(boolean z) {
        b(null);
        com.vk.fullscreenvideo.design.view.top.a aVar = this.i;
        if (aVar != null) {
            aVar.setSmallScreenMode(z);
        }
    }

    public final void setViewClickListener$core_release(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar) {
        this.g = izsVar;
    }

    public VideoTopBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        uho0 uho0Var = new uho0(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, uho0Var);
        this.c = msy.a(lazyThreadSafetyMode, new avj0(this, 22));
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        b bVar = b.A;
        this.d = bVar.a(videoFeatures);
        VideoFeatures videoFeatures2 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_HORIZONTAL;
        videoFeatures2.getClass();
        this.e = bVar.a(videoFeatures2);
        this.h = gsi0.b();
        vhn0 a2 = whn0.a();
        bdn bdnVar = bdn.a;
        this.j = zvj.a(d.a.a(a2, ie00.a.U()));
        this.k = e43.l(a.d.h.a, a.d.i.a);
        dhr0.a.getClass();
        LayoutInflater.from(dhr0.t(context)).inflate(R.layout.video_fullscreen_top_view, (ViewGroup) this, true);
        ViewStub viewStub = (ViewStub) getRootView().findViewById(R.id.fullscreen_top_controls_stub);
        this.f = viewStub;
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: xsna.blt0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view) {
                com.vk.fullscreenvideo.design.view.top.a aVar;
                if (view instanceof com.vk.fullscreenvideo.design.view.top.a) {
                    int i2 = VideoTopBarView.m;
                    aVar = (com.vk.fullscreenvideo.design.view.top.a) view;
                } else {
                    aVar = null;
                }
                VideoTopBarView videoTopBarView = VideoTopBarView.this;
                videoTopBarView.i = aVar;
                if (aVar != null) {
                    aVar.setControls(videoTopBarView.k);
                }
                fxc0.B().u0().b(videoTopBarView.getContext());
                com.vk.fullscreenvideo.design.view.top.a aVar2 = videoTopBarView.i;
                if (aVar2 != null) {
                    aVar2.setOnClickAction(new e9i0(videoTopBarView, 26));
                }
            }
        });
    }
}
