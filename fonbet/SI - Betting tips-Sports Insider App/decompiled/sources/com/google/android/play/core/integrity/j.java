package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f6045a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f6046b;

    public j(String str, Long l6) {
        this.f6045a = str;
        this.f6046b = l6;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f6046b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f6045a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z5;
        Long l6;
        if (obj != this) {
            if (obj instanceof IntegrityTokenRequest) {
                IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
                if (this.f6045a.equals(integrityTokenRequest.b()) && ((l6 = this.f6046b) != null ? l6.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                    z5 = true;
                    if (obj instanceof j) {
                        return z5;
                    }
                    if (!z5) {
                        return false;
                    }
                }
            }
            z5 = false;
            if (obj instanceof j) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f6045a.hashCode() ^ 1000003;
        Long l6 = this.f6046b;
        return ((hashCode * 1000003) ^ (l6 == null ? 0 : l6.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.f6045a + ", cloudProjectNumber=" + this.f6046b).concat(", network=null").concat("}");
    }
}
