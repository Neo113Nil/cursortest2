package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzpg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o1p {
    public final zzpg a;
    public int b = 1;
    public long c = a();

    public o1p(zzpg zzpgVar) {
        this.a = zzpgVar;
    }

    public final long a() {
        zzpg zzpgVar = this.a;
        Preconditions.i(zzpgVar);
        long longValue = ((Long) zzfy.v.a(null)).longValue();
        long longValue2 = ((Long) zzfy.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        ((DefaultClock) zzpgVar.f()).getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
