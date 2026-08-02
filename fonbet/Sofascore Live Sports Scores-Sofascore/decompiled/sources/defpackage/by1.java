package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import android.media.session.MediaSession;
import android.view.SurfaceControl;
import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class by1 {
    public static /* synthetic */ BlendModeColorFilter a(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ HardwareRenderer b() {
        return new HardwareRenderer();
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* synthetic */ MediaSession e(Context context) {
        return new MediaSession(context, "CastMediaSession", null);
    }

    public static /* synthetic */ SurfaceControl.Transaction f() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }
}
