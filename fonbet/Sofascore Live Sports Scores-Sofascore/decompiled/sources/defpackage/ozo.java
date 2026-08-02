package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzok;
import com.google.android.gms.measurement.internal.zzpg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ozo extends skn {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozo(Object obj, iso isoVar, int i) {
        super(isoVar);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.skn
    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                c78 c78Var = (c78) obj;
                zzoc zzocVar = (zzoc) c78Var.e;
                zzocVar.Q();
                zzic zzicVar = (zzic) zzocVar.b;
                zzicVar.k.getClass();
                c78Var.q(SystemClock.elapsedRealtime(), false, false);
                zzd zzdVar = zzicVar.n;
                zzic.j(zzdVar);
                zzicVar.k.getClass();
                zzdVar.T(SystemClock.elapsedRealtime());
                break;
            case 1:
                zzok zzokVar = (zzok) obj;
                zzokVar.U();
                zzgu zzguVar = ((zzic) zzokVar.b).f;
                zzic.m(zzguVar);
                zzguVar.o.a("Starting upload from DelayedRunnable");
                zzokVar.c.q();
                break;
            default:
                zzpg zzpgVar = (zzpg) obj;
                zzpgVar.d().Q();
                String str = (String) zzpgVar.q.pollFirst();
                if (str != null) {
                    ((DefaultClock) zzpgVar.f()).getClass();
                    zzpgVar.I = SystemClock.elapsedRealtime();
                    zzpgVar.b().o.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    zzpg.S(zzpgVar.l.a, intent);
                }
                zzpgVar.H();
                break;
        }
    }
}
