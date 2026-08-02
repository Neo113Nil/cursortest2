package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zpk {
    public final h68 a;
    public final Context b;
    public vpk c;
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
    public long r;
    public long s;

    public zpk(Context context) {
        this.b = context;
        h68 h68Var = new h68();
        h68Var.d = new g68(1);
        h68Var.e = new g68(1);
        h68Var.b = C.TIME_UNSET;
        this.a = h68Var;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        y9.r(this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
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
                    f2 = 0.1f;
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
        d(false);
    }

    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
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
                y9.r(this.e, f);
            }
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
        }
        this.h = f;
        y9.r(this.e, f);
    }
}
