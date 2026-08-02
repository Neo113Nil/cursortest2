package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes13.dex */
public final class a extends InstallationResponse {
    public final String a;
    public final String b;
    public final String c;
    public final TokenResult d;
    public final InstallationResponse.ResponseCode e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: com.google.firebase.installations.remote.a$a, reason: collision with other inner class name */
    public static final class C0139a extends InstallationResponse.a {
        public String a;
        public String b;
        public String c;
        public b d;
        public InstallationResponse.ResponseCode e;

        public final a a() {
            return new a(this.a, this.b, this.c, this.d, this.e);
        }

        public final C0139a b(b bVar) {
            this.d = bVar;
            return this;
        }

        public final C0139a c(String str) {
            this.b = str;
            return this;
        }

        public final C0139a d(String str) {
            this.c = str;
            return this;
        }

        public final C0139a e(InstallationResponse.ResponseCode responseCode) {
            this.e = responseCode;
            return this;
        }

        public final C0139a f(String str) {
            this.a = str;
            return this;
        }
    }

    public a(String str, String str2, String str3, b bVar, InstallationResponse.ResponseCode responseCode) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final TokenResult b() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String d() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final InstallationResponse.ResponseCode e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.a;
        if (str == null) {
            if (installationResponse.f() != null) {
                return false;
            }
        } else if (!str.equals(installationResponse.f())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (installationResponse.c() != null) {
                return false;
            }
        } else if (!str2.equals(installationResponse.c())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (installationResponse.d() != null) {
                return false;
            }
        } else if (!str3.equals(installationResponse.d())) {
            return false;
        }
        TokenResult tokenResult = this.d;
        if (tokenResult == null) {
            if (installationResponse.b() != null) {
                return false;
            }
        } else if (!tokenResult.equals(installationResponse.b())) {
            return false;
        }
        InstallationResponse.ResponseCode responseCode = this.e;
        return responseCode == null ? installationResponse.e() == null : responseCode.equals(installationResponse.e());
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ hashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
