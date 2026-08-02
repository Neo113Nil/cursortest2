package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes13.dex */
public final class b extends TokenResult {
    public final String a;
    public final long b;
    public final TokenResult.ResponseCode c;

    /* compiled from: AutoValue_TokenResult.java */
    public static final class a extends TokenResult.a {
        public String a;
        public Long b;
        public TokenResult.ResponseCode c;

        public final b a() {
            if ("".isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(""));
        }

        public final a b(TokenResult.ResponseCode responseCode) {
            this.c = responseCode;
            return this;
        }

        public final a c(String str) {
            this.a = str;
            return this;
        }

        public final a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.a = str;
        this.b = j;
        this.c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final TokenResult.ResponseCode b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.a;
        if (str == null) {
            if (tokenResult.c() != null) {
                return false;
            }
        } else if (!str.equals(tokenResult.c())) {
            return false;
        }
        if (this.b != tokenResult.d()) {
            return false;
        }
        TokenResult.ResponseCode responseCode = this.c;
        return responseCode == null ? tokenResult.b() == null : responseCode.equals(tokenResult.b());
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
