package defpackage;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfm;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pii {
    public Object a;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pii(Object obj) {
        this.h = obj;
    }

    public void a() {
        long j;
        c40 c40Var = (c40) this.h;
        zqi zqiVar = (zqi) c40Var.g;
        vg6 vg6Var = (vg6) c40Var.b;
        if (vg6Var.getPlaybackState() != 2 || !vg6Var.getPlayWhenReady() || vg6Var.m() != 0) {
            if (this.f) {
                zqiVar.f(1);
            }
            this.f = false;
            return;
        }
        mij currentTimeline = vg6Var.getCurrentTimeline();
        Object l = currentTimeline.p() ? null : currentTimeline.l(vg6Var.getCurrentPeriodIndex());
        int currentAdGroupIndex = vg6Var.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = vg6Var.getCurrentAdIndexInAdGroup();
        long bufferedPosition = vg6Var.getBufferedPosition();
        long max = Math.max(0L, vg6Var.c() - Math.max(0L, bufferedPosition - vg6Var.getCurrentPosition()));
        if (l != null && currentAdGroupIndex == -1) {
            bufferedPosition -= nik.h0(currentTimeline.g(l, (iij) c40Var.f).e);
        }
        ((tqi) c40Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f && Objects.equals(l, this.a) && currentAdGroupIndex == this.b && currentAdIndexInAdGroup == this.c) {
            j = TTAdConstant.AD_MAX_EVENT_TIME;
            if (bufferedPosition == this.d && max == this.e) {
                if (elapsedRealtime - this.g >= TTAdConstant.AD_MAX_EVENT_TIME) {
                    ((mg6) c40Var.d).a(new sii(1, 600000));
                    return;
                }
                return;
            }
        } else {
            j = TTAdConstant.AD_MAX_EVENT_TIME;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.a = l;
        this.b = currentAdGroupIndex;
        this.c = currentAdIndexInAdGroup;
        this.d = bufferedPosition;
        this.e = max;
        zqiVar.f(1);
        zqiVar.a.sendEmptyMessageDelayed(1, j);
    }

    public void b() {
        Object obj;
        zzfd zzfdVar = (zzfd) this.h;
        cwo cwoVar = zzfdVar.a;
        zzea zzeaVar = zzfdVar.e;
        if (cwoVar.zzh() != 2 || !cwoVar.zzk() || cwoVar.zzi() != 0) {
            if (this.f) {
                zzeaVar.d(1);
            }
            this.f = false;
            return;
        }
        zzbf zzq = cwoVar.zzq();
        Object f = zzq.g() ? null : zzq.f(cwoVar.q());
        int w = cwoVar.w();
        int x = cwoVar.x();
        long t = cwoVar.t();
        long max = Math.max(0L, cwoVar.u() - Math.max(0L, t - cwoVar.s()));
        if (f != null && w == -1) {
            zzq.o(f, zzfdVar.d);
            t -= zzfm.t(0L);
            w = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f && Objects.equals(f, this.a) && w == this.b && x == this.c) {
            obj = f;
            if (t == this.d && max == this.e) {
                if (elapsedRealtime - this.g >= TTAdConstant.AD_MAX_EVENT_TIME) {
                    zzfdVar.c.g(new zzfe(1, 600000));
                    return;
                }
                return;
            }
        } else {
            obj = f;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.a = obj;
        this.b = w;
        this.c = x;
        this.d = t;
        this.e = max;
        zzeaVar.d(1);
        zzeaVar.e(1, 600000);
    }
}
