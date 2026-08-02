package defpackage;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzfe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nc9 {
    public int a;
    public boolean b;
    public long c;
    public final Object d;

    public nc9(xc9 xc9Var, long j, int i) {
        this.d = xc9Var;
        this.c = j;
        this.a = i;
        this.b = (xc9Var instanceof uc9) && ((uc9) xc9Var).m;
    }

    public void a() {
        c40 c40Var = (c40) this.d;
        zqi zqiVar = (zqi) c40Var.g;
        vg6 vg6Var = (vg6) c40Var.b;
        int m = vg6Var.m();
        if (!vg6Var.getPlayWhenReady() || vg6Var.getPlaybackState() == 1 || vg6Var.getPlaybackState() == 4 || m == 0 || m == 1) {
            if (this.b) {
                zqiVar.f(4);
            }
            this.b = false;
            return;
        }
        ((tqi) c40Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b && this.a == m) {
            if (elapsedRealtime - this.c >= TTAdConstant.AD_MAX_EVENT_TIME) {
                ((mg6) c40Var.d).a(new sii(4, 600000));
            }
        } else {
            this.b = true;
            this.c = elapsedRealtime;
            this.a = m;
            zqiVar.f(4);
            zqiVar.a.sendEmptyMessageDelayed(4, TTAdConstant.AD_MAX_EVENT_TIME);
        }
    }

    public void b() {
        zzfd zzfdVar = (zzfd) this.d;
        cwo cwoVar = zzfdVar.a;
        zzea zzeaVar = zzfdVar.e;
        int zzi = cwoVar.zzi();
        if (!cwoVar.zzk() || cwoVar.zzh() == 1 || cwoVar.zzh() == 4 || zzi == 0 || zzi == 1) {
            if (this.b) {
                zzeaVar.d(4);
            }
            this.b = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b && this.a == zzi) {
            if (elapsedRealtime - this.c >= TTAdConstant.AD_MAX_EVENT_TIME) {
                zzfdVar.c.g(new zzfe(4, 600000));
            }
        } else {
            this.b = true;
            this.c = elapsedRealtime;
            this.a = zzi;
            zzeaVar.d(4);
            zzeaVar.e(4, 600000);
        }
    }

    public /* synthetic */ nc9(Object obj) {
        this.d = obj;
    }
}
