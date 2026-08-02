package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzadn;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zznd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ban implements zzafa {
    public final /* synthetic */ zzadn b;

    public ban(zzadn zzadnVar) {
        this.b = zzadnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zza() {
        zznd zzndVar = this.b.H;
        if (zzndVar != null) {
            zzndVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzb() {
        zzadn zzadnVar = this.b;
        Surface surface = zzadnVar.Q0;
        if (surface != null) {
            zzaex zzaexVar = zzadnVar.A0;
            Handler handler = zzaexVar.a;
            if (handler != null) {
                handler.post(new jcn(zzaexVar, surface, SystemClock.elapsedRealtime()));
            }
            zzadnVar.T0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzc() {
        zzadn zzadnVar = this.b;
        if (zzadnVar.Q0 != null) {
            zzadnVar.x0(0, 1);
        }
    }
}
