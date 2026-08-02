package defpackage;

import com.google.android.gms.internal.wearable.zzk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x6o extends zzk {
    public final String b;
    public final int c;
    public final int d;

    public /* synthetic */ x6o(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.wearable.zzk
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.wearable.zzk
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.wearable.zzk
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzk)) {
                return false;
            }
            zzk zzkVar = (zzk) obj;
            if (!this.b.equals(zzkVar.a())) {
                return false;
            }
            int b = zzkVar.b();
            int i = this.c;
            if (i == 0) {
                throw null;
            }
            if (i != b) {
                return false;
            }
            int c = zzkVar.c();
            if (this.d == 0) {
                throw null;
            }
            if (c != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.d != 0) {
            return (i2 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + mz1.d(fn0.c(73, str3), 52, str) + 1);
        bf3.v(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return wt3.m(", multipleProductIdGroupsResolver=null, filePurpose=", str2, sb, "}");
    }
}
