package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tto implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zzlj c;

    public tto(zzlj zzljVar, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = zzljVar;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(zzljVar);
                this.c = zzljVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        zzlj zzljVar = this.c;
        switch (i) {
            case 0:
                zzic zzicVar = (zzic) zzljVar.b;
                lmo lmoVar = zzicVar.e;
                zzic.k(lmoVar);
                lmoVar.l.b(j);
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.n.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                zzljVar.Q();
                zzljVar.R();
                zzic zzicVar2 = (zzic) zzljVar.b;
                zzgu zzguVar2 = zzicVar2.f;
                zzic.m(zzguVar2);
                zzguVar2.n.a("Resetting analytics data (FE)");
                zzoc zzocVar = zzicVar2.h;
                zzic.l(zzocVar);
                zzocVar.Q();
                c78 c78Var = zzocVar.g;
                ((ozo) c78Var.d).c();
                ((zzic) ((zzoc) c78Var.e).b).k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c78Var.b = elapsedRealtime;
                c78Var.c = elapsedRealtime;
                zzicVar2.q().V();
                boolean z = !zzicVar2.c();
                lmo lmoVar2 = zzicVar2.e;
                zzic.k(lmoVar2);
                lmoVar2.g.b(j);
                zzic zzicVar3 = (zzic) lmoVar2.b;
                lmo lmoVar3 = zzicVar3.e;
                zzic.k(lmoVar3);
                if (!TextUtils.isEmpty(lmoVar3.w.a())) {
                    lmoVar2.w.b(null);
                }
                lmoVar2.q.b(0L);
                lmoVar2.r.b(0L);
                if (!zzicVar3.d.e0()) {
                    lmoVar2.Y(z);
                }
                lmoVar2.x.b(null);
                lmoVar2.y.b(0L);
                lmoVar2.z.b(null);
                zznl o = zzicVar2.o();
                o.Q();
                o.R();
                zzr g0 = o.g0(false);
                o.c0();
                ((zzic) o.b).n().U();
                o.e0(new yuo(o, g0, false, 1));
                zzic.l(zzocVar);
                zzocVar.f.mo905zza();
                zzljVar.s = z;
                zzicVar2.o().U(new AtomicReference());
                break;
        }
    }
}
