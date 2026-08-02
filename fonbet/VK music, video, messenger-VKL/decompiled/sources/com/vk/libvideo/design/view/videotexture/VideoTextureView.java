package com.vk.libvideo.design.view.videotexture;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.di.DebugComponent;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.toggle.features.VideoFeatures;
import java.lang.ref.SoftReference;
import java.util.function.Consumer;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.f;
import one.video.transform.TransformController;
import xsna.an10;
import xsna.bd0;
import xsna.bpn0;
import xsna.ces0;
import xsna.cms0;
import xsna.d1u0;
import xsna.d810;
import xsna.deb0;
import xsna.e1u0;
import xsna.f1u0;
import xsna.fes0;
import xsna.fpf0;
import xsna.g1u0;
import xsna.gsq0;
import xsna.h1u0;
import xsna.hk0;
import xsna.izs;
import xsna.k5f0;
import xsna.k7m;
import xsna.l1u0;
import xsna.m7m;
import xsna.msy;
import xsna.ozl;
import xsna.pwh0;
import xsna.s3q0;
import xsna.sht0;
import xsna.tn10;
import xsna.ujt0;
import xsna.xk80;
import xsna.ye40;
import xsna.yn2;

/* compiled from: VideoTextureView.kt */
/* loaded from: classes2.dex */
public class VideoTextureView extends FrameLayout implements ujt0 {
    public static SoftReference<Bitmap> r;
    public static final Object s = msy.a(LazyThreadSafetyMode.NONE, new k5f0(13));
    public final boolean b;
    public final View c;
    public final DebugComponent d;
    public fes0 e;
    public ces0 f;
    public final d g;
    public OneVideoPlayer h;
    public final TransformController.ScaleType i;
    public final h1u0 j;
    public int k;
    public int l;
    public final l1u0 m;
    public final bpn0 n;
    public final c o;
    public izs<? super TransformController.ScaleType, s3q0> p;
    public final b q;

    /* compiled from: VideoTextureView.kt */
    public static final class a {

        /* compiled from: VideoTextureView.kt */
        /* renamed from: com.vk.libvideo.design.view.videotexture.VideoTextureView$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1236a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[VideoResizer.VideoFitType.values().length];
                try {
                    iArr[VideoResizer.VideoFitType.CROP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoResizer.VideoFitType.FIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[TransformController.ScaleType.values().length];
                try {
                    iArr2[TransformController.ScaleType.CROP.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[TransformController.ScaleType.FIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static VideoResizer.VideoFitType a(TransformController.ScaleType scaleType) {
            int i = C1236a.$EnumSwitchMapping$1[scaleType.ordinal()];
            if (i == 1) {
                return VideoResizer.VideoFitType.CROP;
            }
            if (i == 2) {
                return VideoResizer.VideoFitType.FIT;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: VideoTextureView.kt */
    public static final class b implements tn10 {
        public b() {
        }

        @Override // xsna.tn10
        public final View b() {
            return VideoTextureView.this;
        }

        @Override // xsna.tn10
        public final int getContentHeight() {
            return VideoTextureView.this.getVideoHeight();
        }

        @Override // xsna.tn10
        public final VideoResizer.VideoFitType getContentScaleType() {
            SoftReference<Bitmap> softReference = VideoTextureView.r;
            return a.a(VideoTextureView.this.getTransformController().e);
        }

        @Override // xsna.tn10
        public final int getContentWidth() {
            return VideoTextureView.this.getVideoWidth();
        }

        @Override // xsna.tn10
        public final void l(int i, int i2) {
            VideoTextureView videoTextureView = VideoTextureView.this;
            if ((videoTextureView.getVideoHeight() == i2 && videoTextureView.getVideoWidth() == i) || i == 0 || i2 == 0) {
                return;
            }
            videoTextureView.setVideoWidth(i);
            videoTextureView.setVideoHeight(i2);
        }

        @Override // xsna.tn10
        public final void setContentScaleType(VideoResizer.VideoFitType videoFitType) {
            TransformController.ScaleType scaleType;
            SoftReference<Bitmap> softReference = VideoTextureView.r;
            int i = a.C1236a.$EnumSwitchMapping$0[videoFitType.ordinal()];
            if (i == 1) {
                scaleType = TransformController.ScaleType.CROP;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scaleType = TransformController.ScaleType.FIT;
            }
            VideoTextureView.this.i(scaleType, false);
        }
    }

    public VideoTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static void f(VideoTextureView videoTextureView, final Bitmap bitmap, final izs izsVar, int i) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        Surface surface = videoTextureView.j.b;
        if (surface == null) {
            handler.post(new yn2(izsVar, 11));
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(videoTextureView.getWidth(), videoTextureView.getHeight(), Bitmap.Config.ARGB_8888);
        }
        PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.rjt0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i2) {
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                izs izsVar2 = izs.this;
                if (i2 == 0) {
                    izsVar2.invoke(bitmap);
                } else {
                    izsVar2.invoke(null);
                }
            }
        }, handler);
    }

    @Override // xsna.ujt0
    public final void a(ces0 ces0Var) {
        setVideoDebugInfo(ces0Var);
    }

    @Override // xsna.ujt0
    public final h1u0 b() {
        return this.j;
    }

    @Override // xsna.ujt0
    public final ces0 c() {
        return this.f;
    }

    @ozl
    public final void d(int i, int i2) {
        float f = i;
        float f2 = i2;
        float min = Math.min(getMeasuredWidth() / f, getMeasuredHeight() / f2);
        this.q.l(an10.b(f * min), an10.b(f2 * min));
        getTransformController().f(TransformController.ScaleType.FIT, false);
    }

    public final void e() {
        f(this, null, new ye40(26), 5);
    }

    public final boolean g() {
        return getTransformController().c().e.a > 1.0f;
    }

    public final fes0 getDebugView() {
        return this.e;
    }

    public final tn10 getMatrixProvider() {
        return this.q;
    }

    public final h1u0 getSurfaceHolder() {
        return this.j;
    }

    public final TransformController getTransformController() {
        return (TransformController) this.n.getValue();
    }

    public final ces0 getVideoDebugInfo() {
        return this.f;
    }

    public final int getVideoHeight() {
        return this.l;
    }

    public final int getVideoWidth() {
        return this.k;
    }

    public final void h() {
        getTransformController().f(getTransformController().e, false);
    }

    @ozl
    public final void i(TransformController.ScaleType scaleType, boolean z) {
        getTransformController().f(scaleType, z);
    }

    public final void j(izs izsVar, izs izsVar2, boolean z) {
        this.p = izsVar2;
        c cVar = this.o;
        if (!z) {
            getTransformController().f(getTransformController().e, false);
            getTransformController().d = null;
            getTransformController().b.remove(cVar);
        } else {
            getTransformController().d = new d810(izsVar);
            getTransformController().b.add(cVar);
            izsVar2.invoke(getTransformController().e);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        if (g()) {
            h();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (((Boolean) s.getValue()).booleanValue()) {
            return;
        }
        requestApplyInsets();
    }

    public final void setDebugView(fes0 fes0Var) {
        this.e = fes0Var;
    }

    @Override // xsna.ujt0
    public void setPlayer(OneVideoPlayer oneVideoPlayer) {
        one.video.player.tracks.c E;
        cms0 cms0Var;
        Size c2;
        Consumer<Size> consumer;
        OneVideoPlayer oneVideoPlayer2 = this.h;
        d dVar = this.g;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(dVar);
        }
        this.h = oneVideoPlayer;
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(dVar);
        }
        if (oneVideoPlayer != null && (E = oneVideoPlayer.E()) != null && (cms0Var = (cms0) E.c) != null && (c2 = cms0Var.c()) != null && (consumer = this.j.a) != null) {
            consumer.accept(c2);
        }
        getTransformController().e(oneVideoPlayer);
        this.c.setVisibility(oneVideoPlayer != null ? 0 : 8);
        DebugComponent debugComponent = this.d;
        if (!debugComponent.W2().f()) {
            fes0 fes0Var = this.e;
            if (fes0Var != null) {
                fes0Var.setPlayer(null);
                removeView(fes0Var.b());
            }
            this.e = null;
            return;
        }
        fes0 fes0Var2 = this.e;
        if (fes0Var2 == null || indexOfChild(fes0Var2.b()) == -1) {
            fes0 W0 = debugComponent.W0(getContext());
            W0.setPlayer(this.h);
            W0.setOnHideBtnClickListener(new bd0(this, 17));
            addView(W0.b(), -1, -2);
            this.e = W0;
        }
        fes0 fes0Var3 = this.e;
        if (fes0Var3 != null) {
            fes0Var3.setPlayer(oneVideoPlayer);
        }
        fes0 fes0Var4 = this.e;
        if (fes0Var4 != null) {
            fes0Var4.setVideoDebugInfo(this.f);
        }
    }

    public final void setVideoDebugInfo(ces0 ces0Var) {
        this.f = ces0Var;
        fes0 fes0Var = this.e;
        if (fes0Var != null) {
            fes0Var.setVideoDebugInfo(ces0Var);
        }
    }

    public final void setVideoHeight(int i) {
        this.l = i;
    }

    public final void setVideoWidth(int i) {
        this.k = i;
    }

    public /* synthetic */ VideoTextureView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VideoTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        View textureView;
        h1u0 h1u0Var;
        boolean a2 = com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW);
        this.b = a2;
        if (a2) {
            textureView = new SurfaceView(context);
        } else {
            textureView = new TextureView(context);
        }
        textureView.setVisibility(8);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        this.c = textureView;
        this.d = (DebugComponent) ((k7m) m7m.c(this)).a(fpf0.a(DebugComponent.class));
        this.f = ces0.g;
        this.g = new d();
        this.i = TransformController.ScaleType.CROP;
        if (a2) {
            SurfaceView surfaceView = (SurfaceView) textureView;
            h1u0Var = new h1u0(new d1u0(surfaceView));
            gsq0 gsq0Var = new gsq0(h1u0Var, 4);
            gsq0Var.invoke(surfaceView);
            surfaceView.addOnLayoutChangeListener(new e1u0(gsq0Var));
            surfaceView.getHolder().addCallback(new g1u0(h1u0Var));
        } else {
            TextureView textureView2 = (TextureView) textureView;
            h1u0Var = new h1u0(null);
            gsq0 gsq0Var2 = new gsq0(h1u0Var, 4);
            gsq0Var2.invoke(textureView2);
            textureView2.addOnLayoutChangeListener(new e1u0(gsq0Var2));
            textureView2.setSurfaceTextureListener(new f1u0(h1u0Var));
        }
        this.j = h1u0Var;
        this.m = new l1u0(textureView);
        this.n = new bpn0(new pwh0(this, 26));
        setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.o = new c();
        this.q = new b();
    }

    @ozl
    public static /* synthetic */ void getMatrixProvider$annotations() {
    }

    @ozl
    public static /* synthetic */ void getVideoHeight$annotations() {
    }

    @ozl
    public static /* synthetic */ void getVideoWidth$annotations() {
    }

    /* compiled from: VideoTextureView.kt */
    public static final class d implements f {
        public d() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            cms0 cms0Var;
            h1u0 surfaceHolder = VideoTextureView.this.getSurfaceHolder();
            Size c = (cVar == null || (cms0Var = (cms0) cVar.c) == null) ? null : cms0Var.c();
            Consumer<Size> consumer = surfaceHolder.a;
            if (consumer != null) {
                consumer.accept(c);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void d(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void f(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void h(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void j(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void l(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void p(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void r(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void s(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void v(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void i(OneVideoPlayer oneVideoPlayer, int i) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void k(OneVideoPlayer oneVideoPlayer, long j) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        }
    }

    /* compiled from: VideoTextureView.kt */
    public static final class c implements TransformController.a {
        public c() {
        }

        @Override // one.video.transform.TransformController.a
        public final void b(TransformController.ScaleType scaleType) {
            izs<? super TransformController.ScaleType, s3q0> izsVar = VideoTextureView.this.p;
            if (izsVar != null) {
                izsVar.invoke(scaleType);
            }
        }

        @Override // one.video.transform.TransformController.a
        public final void a(float f, float f2, float f3, float f4) {
        }
    }
}
