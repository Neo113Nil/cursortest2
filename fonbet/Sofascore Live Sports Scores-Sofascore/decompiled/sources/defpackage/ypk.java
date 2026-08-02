package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ypk {
    public final h68 a;
    public final spk b;
    public final upk c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ypk(Context context) {
        spk spkVar;
        DisplayManager displayManager;
        h68 h68Var = new h68();
        h68Var.d = new g68(0);
        h68Var.e = new g68(0);
        h68Var.b = C.TIME_UNSET;
        this.a = h68Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            spkVar = (lik.a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService(U3.i.d)) == null) ? null : new tpk(displayManager);
            if (spkVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    spkVar = new e3c(windowManager, 19);
                }
            }
            this.b = spkVar;
            this.c = spkVar != null ? upk.e : null;
            this.k = C.TIME_UNSET;
            this.l = C.TIME_UNSET;
            this.f = -1.0f;
            this.i = 1.0f;
            this.j = 0;
        }
        spkVar = null;
        this.b = spkVar;
        this.c = spkVar != null ? upk.e : null;
        this.k = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (lik.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rpk.a(surface, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f;
        float f2;
        if (lik.a < 30 || this.e == null) {
            return;
        }
        h68 h68Var = this.a;
        if (!((g68) h68Var.d).a()) {
            f = this.f;
        } else if (((g68) h68Var.d).a()) {
            f = (float) (1.0E9d / (((g68) h68Var.d).f != 0 ? r2.g / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (((g68) h68Var.d).a()) {
                if ((((g68) h68Var.d).a() ? ((g68) h68Var.d).g : C.TIME_UNSET) >= 5000000000L) {
                    f2 = 0.02f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && h68Var.c < 30) {
            return;
        }
        this.g = f;
        c(false);
    }

    public final void c(boolean z) {
        Surface surface;
        float f;
        if (lik.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                rpk.a(surface, f);
            }
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
        }
        this.h = f;
        rpk.a(surface, f);
    }
}
