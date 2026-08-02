package defpackage;

import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.play_billing.zzhr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fjo {
    public final zzhr a;
    public final zzgc b;
    public volatile zzfp c;
    public volatile zzhr d;

    public fjo(zzhr zzhrVar) {
        this.d = zzhrVar;
        this.a = zzhrVar.zzl();
        zzgc zzgcVar = zzgc.b;
        int i = o7o.a;
        this.b = zzgc.b;
        this.c = null;
    }

    public final zzhr a() {
        try {
            return this.d;
        } catch (zzhb unused) {
            zzgc zzgcVar = zzgc.b;
            return this.a;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjo)) {
            return a().equals(obj);
        }
        fjo fjoVar = (fjo) obj;
        if (this.c == null || fjoVar.c == null || this.b != fjoVar.b || !this.c.equals(fjoVar.c)) {
            return a().equals(fjoVar.a());
        }
        return true;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
