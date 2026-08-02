package defpackage;

import com.google.android.gms.internal.measurement.zzabr;
import com.google.android.gms.internal.measurement.zzyd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lep implements zzyd {
    public final zzyd a;
    public final Object b;

    public lep(zzyd zzydVar, Object obj) {
        zzabr.a(zzydVar, "log site key");
        this.a = zzydVar;
        zzabr.a(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lep)) {
            return false;
        }
        lep lepVar = (lep) obj;
        return this.a.equals(lepVar.a) && this.b.equals(lepVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        bf3.v(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
