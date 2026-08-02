package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class vpk implements DisplayManager.DisplayListener {
    public final /* synthetic */ int a;
    public final Choreographer b;
    public final DisplayManager c;
    public volatile long d = C.TIME_UNSET;
    public volatile long e = C.TIME_UNSET;

    public /* synthetic */ vpk(Choreographer choreographer, DisplayManager displayManager, int i) {
        this.a = i;
        this.b = choreographer;
        this.c = displayManager;
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
