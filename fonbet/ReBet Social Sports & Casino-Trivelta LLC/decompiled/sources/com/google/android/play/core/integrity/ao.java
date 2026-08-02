package com.google.android.play.core.integrity;

/* loaded from: classes3.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f36557a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f36558b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f36559c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f36557a = str;
        this.f36558b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f36558b;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f36557a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f36558b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z10 = true;
                return ((obj instanceof ao) || !a()) ? z10 : z10;
            }
        }
        z10 = false;
        if (obj instanceof ao) {
        }
    }

    public final int hashCode() {
        int hashCode = this.f36557a.hashCode() ^ 1000003;
        Long l10 = this.f36558b;
        int hashCode2 = (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f36557a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f36557a + ", cloudProjectNumber=" + this.f36558b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
