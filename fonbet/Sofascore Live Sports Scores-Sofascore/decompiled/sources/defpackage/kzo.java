package defpackage;

import com.google.android.gms.internal.measurement.zznd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kzo {
    public final zznd a;
    public final uif b;

    public kzo(zznd zzndVar, uif uifVar) {
        this.a = zzndVar;
        this.b = uifVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kzo) {
            kzo kzoVar = (kzo) obj;
            zznd zzndVar = kzoVar.a;
            zznd zzndVar2 = this.a;
            if (zzndVar2 != null ? zzndVar2 == zzndVar : zzndVar == null) {
                return this.b == kzoVar.b;
            }
        }
        return false;
    }

    public final int hashCode() {
        zznd zzndVar = this.a;
        return this.b.hashCode() ^ (((zzndVar == null ? 0 : zzndVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        bf3.v(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
