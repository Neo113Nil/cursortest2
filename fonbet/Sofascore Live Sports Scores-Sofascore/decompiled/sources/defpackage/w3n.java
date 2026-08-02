package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w3n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zzd d;

    public /* synthetic */ w3n(zzd zzdVar, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        zzd zzdVar = this.d;
        switch (i) {
            case 0:
                zzdVar.Q();
                Preconditions.f(str);
                dh0 dh0Var = zzdVar.d;
                if (dh0Var.isEmpty()) {
                    zzdVar.e = j;
                }
                Integer num = (Integer) dh0Var.get(str);
                if (num == null) {
                    if (dh0Var.c < 100) {
                        dh0Var.put(str, 1);
                        zzdVar.c.put(str, Long.valueOf(j));
                        break;
                    } else {
                        zzgu zzguVar = ((zzic) zzdVar.b).f;
                        zzic.m(zzguVar);
                        zzguVar.j.a("Too many ads visible");
                        break;
                    }
                } else {
                    dh0Var.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                zzdVar.Q();
                Preconditions.f(str);
                dh0 dh0Var2 = zzdVar.d;
                Integer num2 = (Integer) dh0Var2.get(str);
                zzic zzicVar = (zzic) zzdVar.b;
                if (num2 == null) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    zzmb zzmbVar = zzicVar.l;
                    zzgu zzguVar3 = zzicVar.f;
                    zzic.l(zzmbVar);
                    zzlu U = zzmbVar.U(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        dh0Var2.put(str, Integer.valueOf(intValue));
                        break;
                    } else {
                        dh0Var2.remove(str);
                        dh0 dh0Var3 = zzdVar.c;
                        Long l = (Long) dh0Var3.get(str);
                        if (l == null) {
                            zzic.m(zzguVar3);
                            zzguVar3.g.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j - l.longValue();
                            dh0Var3.remove(str);
                            zzdVar.V(str, longValue, U);
                        }
                        if (dh0Var2.isEmpty()) {
                            long j2 = zzdVar.e;
                            if (j2 != 0) {
                                zzdVar.U(j - j2, U);
                                zzdVar.e = 0L;
                                break;
                            } else {
                                zzic.m(zzguVar3);
                                zzguVar3.g.a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
