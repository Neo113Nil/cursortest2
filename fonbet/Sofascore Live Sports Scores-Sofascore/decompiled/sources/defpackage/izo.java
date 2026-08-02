package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzoc;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class izo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zzoc c;

    public izo(zzoc zzocVar, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                Objects.requireNonNull(zzocVar);
                this.c = zzocVar;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(zzocVar);
                this.c = zzocVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r10.t.a() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        int i = this.a;
        zzoc zzocVar = this.c;
        switch (i) {
            case 0:
                c78 c78Var = zzocVar.g;
                zzocVar.Q();
                zzocVar.U();
                zzic zzicVar = (zzic) zzocVar.b;
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzgs zzgsVar = zzguVar.o;
                long j2 = this.b;
                zzgsVar.b(Long.valueOf(j2), "Activity resumed, time");
                zzal zzalVar = zzicVar.d;
                if (!zzalVar.b0(null, zzfy.S0)) {
                    if (!zzalVar.f0()) {
                        lmo lmoVar = zzicVar.e;
                        zzic.k(lmoVar);
                        break;
                    }
                    ((zzoc) c78Var.e).Q();
                    ((ozo) c78Var.d).c();
                    c78Var.b = j2;
                    c78Var.c = j2;
                } else if (zzalVar.f0() || zzocVar.e) {
                    ((zzoc) c78Var.e).Q();
                    ((ozo) c78Var.d).c();
                    c78Var.b = j2;
                    c78Var.c = j2;
                }
                gvo gvoVar = zzocVar.h;
                zzoc zzocVar2 = (zzoc) gvoVar.c;
                zzocVar2.Q();
                mzo mzoVar = (mzo) gvoVar.b;
                if (mzoVar != null) {
                    zzocVar2.d.removeCallbacks(mzoVar);
                }
                lmo lmoVar2 = ((zzic) zzocVar2.b).e;
                zzic.k(lmoVar2);
                lmoVar2.t.b(false);
                zzocVar2.Q();
                zzocVar2.e = false;
                muo muoVar = zzocVar.f;
                zzoc zzocVar3 = (zzoc) muoVar.b;
                zzocVar3.Q();
                zzic zzicVar2 = (zzic) zzocVar3.b;
                boolean c = zzicVar2.c();
                DefaultClock defaultClock = zzicVar2.k;
                if (c) {
                    defaultClock.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (zzicVar2.d.b0(null, zzfy.e1)) {
                        defaultClock.getClass();
                        j = SystemClock.elapsedRealtime();
                    } else {
                        j = 0;
                    }
                    muoVar.h(currentTimeMillis, j);
                    break;
                }
                break;
            default:
                zzocVar.Q();
                zzocVar.U();
                zzic zzicVar3 = (zzic) zzocVar.b;
                zzgu zzguVar2 = zzicVar3.f;
                zzic.m(zzguVar2);
                zzgs zzgsVar2 = zzguVar2.o;
                long j3 = this.b;
                zzgsVar2.b(Long.valueOf(j3), "Activity paused, time");
                gvo gvoVar2 = zzocVar.h;
                zzoc zzocVar4 = (zzoc) gvoVar2.c;
                ((zzic) zzocVar4.b).k.getClass();
                mzo mzoVar2 = new mzo(gvoVar2, System.currentTimeMillis(), j3);
                gvoVar2.b = mzoVar2;
                zzocVar4.d.postDelayed(mzoVar2, 2000L);
                if (zzicVar3.d.f0()) {
                    ((ozo) zzocVar.g.d).c();
                    break;
                }
                break;
        }
    }
}
