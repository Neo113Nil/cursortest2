package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.internal.ads.zztd;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i7p implements zzqx {
    public final zzri a;
    public final /* synthetic */ zztw b;

    public /* synthetic */ i7p(zztw zztwVar, zzri zzriVar) {
        this.b = zztwVar;
        this.a = zzriVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void c(long j) {
        gmo gmoVar;
        zztw zztwVar = this.b;
        if (this == zztwVar.h && (gmoVar = zztwVar.l) != null) {
            zzuc zzucVar = (zzuc) gmoVar.b;
            zzucVar.K0 = true;
            zzry zzryVar = zzucVar.z0;
            Handler handler = zzryVar.a;
            if (handler != null) {
                handler.post(new i4p(zzryVar, j));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzb() {
        gmo gmoVar;
        zznd zzndVar;
        zztw zztwVar = this.b;
        if (this == zztwVar.h && (gmoVar = zztwVar.l) != null && zztwVar.N && (zzndVar = ((zzuc) gmoVar.b).H) != null) {
            zzndVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzc() {
        zztw zztwVar = this.b;
        if (this == zztwVar.h && zztwVar.L) {
            zztwVar.M = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzd() {
        long j;
        zztw zztwVar = this.b;
        if (this == zztwVar.h && zztwVar.l != null) {
            j0a j0aVar = zztwVar.n;
            int i = j0aVar.b;
            if (i != -1) {
                long j2 = ((zzri) j0aVar.e).d / i;
                zztd zztdVar = zztwVar.r;
                zztdVar.getClass();
                j = zzfm.v(zztdVar.a.getSampleRate(), j2);
            } else {
                j = C.TIME_UNSET;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - zztwVar.T;
            gmo gmoVar = zztwVar.l;
            int i2 = ((zzri) zztwVar.n.e).d;
            zzry zzryVar = ((zzuc) gmoVar.b).z0;
            long t = zzfm.t(j);
            Handler handler = zzryVar.a;
            if (handler != null) {
                handler.post(new i4p(zzryVar, i2, t, elapsedRealtime));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zze() {
        zztw.Y.getAndDecrement();
        gmo gmoVar = this.b.l;
        if (gmoVar != null) {
            int i = this.a.a;
            zzsc zzscVar = new zzsc();
            zzry zzryVar = ((zzuc) gmoVar.b).z0;
            Handler handler = zzryVar.a;
            if (handler != null) {
                handler.post(new i4p(zzryVar, zzscVar, 1));
            }
        }
    }
}
