package defpackage;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzgbp;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q4o extends TimerTask {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Timer b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public q4o(zzfvy zzfvyVar, ohn ohnVar, Timer timer) {
        this.c = ohnVar;
        this.b = timer;
        Objects.requireNonNull(zzfvyVar);
        this.d = zzfvyVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.a;
        Timer timer = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                zzm zzmVar = (zzm) obj2;
                if (zzmVar != null) {
                    zzmVar.zza();
                    break;
                }
                break;
            default:
                v0l.d(((zzfvy) obj2).b, "omidJsSessionService");
                n nVar = ((zzcmi) ((ohn) obj).b).a;
                zzgbp zzgbpVar = zzs.zza;
                Objects.requireNonNull(nVar);
                zzgbpVar.post(new cun(nVar, 0));
                timer.cancel();
                break;
        }
    }

    public q4o(zzelp zzelpVar, AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.c = alertDialog;
        this.b = timer;
        this.d = zzmVar;
    }
}
