package com.vk.video.ad;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.VideoAdData;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.log.L;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.ad.a;
import com.vk.video.ad.data.VideoAdInfo;
import com.vk.video.ad.e;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ao50;
import xsna.b5z;
import xsna.bwt0;
import xsna.fcn;
import xsna.gm50;
import xsna.gqe0;
import xsna.gz80;
import xsna.io2;
import xsna.izs;
import xsna.kcj0;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.n9m0;
import xsna.oz50;
import xsna.p90;
import xsna.rrn0;
import xsna.s3q0;
import xsna.tn10;
import xsna.vk50;
import xsna.vm2;
import xsna.vpn0;
import xsna.vzr0;
import xsna.xm2;
import xsna.xn50;
import xsna.yg5;

/* compiled from: VideoAdDialog.kt */
/* loaded from: classes5.dex */
public final class VideoAdDialog extends MviImplFragment<com.vk.video.ad.b, g, com.vk.video.ad.a> implements fcn {
    public static final /* synthetic */ int W = 0;
    public e Q;
    public io2 R;
    public LifecycleHandler S;
    public final b T = new b();
    public final Object U;
    public final Object V;

    /* compiled from: VideoAdDialog.kt */
    public static final class a extends oz50 {
        public a(VideoAdData videoAdData) {
            super(VideoAdDialog.class, null, null);
            this.j.putParcelable("video_ad_data", videoAdData);
        }

        public final void y(FragmentActivity fragmentActivity, io2 io2Var) {
            if (p90.e(fragmentActivity)) {
                L.G("Can't create dialog, invalid activity");
                return;
            }
            VideoAdDialog videoAdDialog = (VideoAdDialog) f();
            videoAdDialog.R = io2Var;
            videoAdDialog.Td(fragmentActivity.getSupportFragmentManager(), "VideoAdDialog");
        }
    }

    /* compiled from: VideoAdDialog.kt */
    public static final class b extends b5z {
        public b() {
        }

        @Override // xsna.b5z
        public final void c(Activity activity) {
            a.f fVar = a.f.b;
            VideoAdDialog videoAdDialog = VideoAdDialog.this;
            videoAdDialog.getClass();
            xn50.a.c(videoAdDialog, fVar);
        }

        @Override // xsna.b5z
        public final void e(Activity activity) {
            a.h hVar = a.h.b;
            VideoAdDialog videoAdDialog = VideoAdDialog.this;
            videoAdDialog.getClass();
            xn50.a.c(videoAdDialog, hVar);
        }
    }

    /* compiled from: VideoAdDialog.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<com.vk.video.ad.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.video.ad.a aVar) {
            VideoAdDialog videoAdDialog = (VideoAdDialog) this.receiver;
            videoAdDialog.getClass();
            xn50.a.c(videoAdDialog, aVar);
            return s3q0.a;
        }
    }

    public VideoAdDialog() {
        rrn0 rrn0Var = new rrn0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, rrn0Var);
        this.V = msy.a(lazyThreadSafetyMode, new kcj0(this, 13));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Dialog dialog;
        Window window;
        WindowManager.LayoutParams attributes;
        this.Q = new e(getViewLifecycleOwner(), requireContext(), this.R, new c(1, this, VideoAdDialog.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        if (gz80.a(28) && (dialog = this.s) != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        e eVar = this.Q;
        if (eVar == null) {
            eVar = null;
        }
        return new mk50.c(eVar.h);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        g gVar = (g) ao50Var;
        e eVar = this.Q;
        if (eVar == null) {
            eVar = null;
        }
        eVar.getClass();
        gm50.a.b(eVar, gVar.a, new gqe0(eVar, 17));
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fcn
    public final void b(boolean z) {
        boolean z2 = getResources().getConfiguration().orientation == 1;
        e eVar = this.Q;
        if (eVar == null) {
            eVar = null;
        }
        xm2 xm2Var = eVar.t;
        e.a aVar = xm2Var.b;
        vpn0 vpn0Var = xm2Var.e;
        e.a aVar2 = xm2Var.b;
        io2 io2Var = xm2Var.a;
        if (io2Var == null || !(z2 || io2Var.f0())) {
            if (io2Var != null) {
                io2Var.J();
            }
            aVar2.a().b().setHasTransientState(true);
            vpn0Var.invoke();
            if (io2Var != null) {
                io2Var.C();
            }
            aVar2.a().b().setHasTransientState(false);
            xm2Var.f.invoke();
        } else {
            tn10 a2 = aVar.a();
            e eVar2 = e.this;
            final FrameLayout frameLayout = eVar2.p;
            final View view = eVar2.i;
            final int height = frameLayout.getHeight();
            a2.b().clearAnimation();
            if (io2Var != null) {
                io2Var.J();
            }
            aVar2.a().b().setHasTransientState(true);
            vpn0Var.invoke();
            xm2.a(a2, io2Var, true, z2 ? 0 : xm2Var.c).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(BaseAnimationDialog.a0);
            ofFloat.setInterpolator(BaseAnimationDialog.Z);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.sm2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    double d = floatValue;
                    if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE > d || d > 1.0d) {
                        return;
                    }
                    frameLayout.setTranslationY((1 - floatValue) * height);
                    view.setAlpha(floatValue);
                }
            });
            ofFloat.addListener(new vm2(xm2Var));
            ofFloat.start();
        }
        eVar.n.setVisibility(8);
        eVar.o.setVisibility(8);
        eVar.q.setVisibility(8);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        b(true);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e eVar = this.Q;
        if (eVar == null) {
            eVar = null;
        }
        VideoAdInfo videoAdInfo = new VideoAdInfo((yg5) this.V.getValue(), (VideoAdData) this.U.getValue(), configuration.orientation == 1);
        eVar.a(videoAdInfo);
        eVar.b(videoAdInfo.h());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        LifecycleHandler lifecycleHandler = this.S;
        if (lifecycleHandler != null) {
            lifecycleHandler.e(this.T);
        }
        this.S = null;
        e eVar = this.Q;
        if (eVar == null) {
            eVar = null;
        }
        yg5 yg5Var = (yg5) this.V.getValue();
        eVar.p.removeAllViews();
        eVar.o.clearAnimation();
        eVar.u.removeCallbacksAndMessages(null);
        yg5Var.T(eVar.r);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LifecycleHandler c2 = LifecycleHandler.c(kn());
        c2.a(this.T);
        this.S = c2;
        bwt0.H(view);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VideoAdDialog;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        boolean z = getResources().getConfiguration().orientation == 1;
        ?? r3 = this.V;
        yg5 yg5Var = (yg5) r3.getValue();
        ?? r5 = this.U;
        com.vk.video.ad.b bVar = new com.vk.video.ad.b(new d(new vzr0(new VideoAdInfo(yg5Var, (VideoAdData) r5.getValue(), z))), (yg5) r3.getValue(), ((VideoAdData) r5.getValue()).d);
        bVar.h.a(new n9m0(this, 12), this);
        return bVar;
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.nyr0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int i2 = VideoAdDialog.W;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                VideoAdDialog.this.b(true);
                return true;
            }
        });
        return yn;
    }
}
