package defpackage;

import com.google.android.gms.internal.ads.zzgry;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ago extends zzgry {
    public final String a;
    public final String b;

    public /* synthetic */ ago(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgry
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgry
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgry)) {
            return false;
        }
        zzgry zzgryVar = (zzgry) obj;
        String str = this.a;
        if (str == null) {
            if (zzgryVar.a() != null) {
                return false;
            }
        } else if (!str.equals(zzgryVar.a())) {
            return false;
        }
        String str2 = this.b;
        return str2 == null ? zzgryVar.b() == null : str2.equals(zzgryVar.b());
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        bf3.v(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
