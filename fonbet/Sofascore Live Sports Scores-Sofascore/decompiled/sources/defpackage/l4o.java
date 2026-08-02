package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzelr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l4o extends zzelr {
    public final Activity a;
    public final zzm b;
    public final String c;
    public final String d;

    public /* synthetic */ l4o(Activity activity, zzm zzmVar, String str, String str2) {
        this.a = activity;
        this.b = zzmVar;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    public final Activity a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    public final zzm b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzelr
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzelr)) {
            return false;
        }
        zzelr zzelrVar = (zzelr) obj;
        if (!this.a.equals(zzelrVar.a())) {
            return false;
        }
        zzm zzmVar = this.b;
        if (zzmVar == null) {
            if (zzelrVar.b() != null) {
                return false;
            }
        } else if (!zzmVar.equals(zzelrVar.b())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (zzelrVar.c() != null) {
                return false;
            }
        } else if (!str.equals(zzelrVar.c())) {
            return false;
        }
        String str2 = this.d;
        return str2 == null ? zzelrVar.d() == null : str2.equals(zzelrVar.d());
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        zzm zzmVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        int length2 = valueOf.length();
        String str = this.c;
        int length3 = String.valueOf(str).length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(fn0.b(length, 40, length2, 13, length3, 6, String.valueOf(str2).length()) + 1);
        bf3.v(sb, "OfflineUtilsParams{activity=", obj, ", adOverlay=", valueOf);
        bf3.v(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
