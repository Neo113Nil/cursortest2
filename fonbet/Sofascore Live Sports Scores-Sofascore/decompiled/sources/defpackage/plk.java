package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class plk implements ComponentCallbacks2 {
    public static final plk a = new plk();
    public static final mqi b = ypa.b(ptj.r);
    public static final mqi c = ypa.b(ptj.s);
    public static final g62 d = ml4.f(1, a62.c, tyd.v);
    public static final tdj e = tdj.l;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ExoPlayer exoPlayer;
        for (int i = 0; i < 2; i++) {
            g62 g62Var = d;
            if (!((g62Var.A() || g62Var.w()) ? false : !g62Var.A()) && (exoPlayer = (ExoPlayer) go2.a(g62Var.o())) != null) {
                ((vg6) exoPlayer).release();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        onLowMemory();
    }
}
