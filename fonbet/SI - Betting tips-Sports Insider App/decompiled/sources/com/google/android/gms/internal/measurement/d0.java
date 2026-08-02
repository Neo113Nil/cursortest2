package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4959b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4960a;

    public d0(int i5) {
        this.f4960a = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        int i5 = ((d0) obj).f4960a;
        int i10 = this.f4960a;
        if (i10 != 0) {
            return i10 == i5;
        }
        throw null;
    }

    public final int hashCode() {
        int i5 = this.f4960a;
        if (i5 != 0) {
            return ((i5 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i5 = this.f4960a;
        String str = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb2 = new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1);
        r4.k.s(sb2, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb2.append("}");
        return sb2.toString();
    }
}
