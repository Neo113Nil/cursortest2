package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.f;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f59550a;

    /* renamed from: b, reason: collision with root package name */
    private final long f59551b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59552c;

    /* renamed from: com.google.firebase.installations.a$a, reason: collision with other inner class name */
    static final class C0906a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59553a;

        /* renamed from: b, reason: collision with root package name */
        private Long f59554b;

        /* renamed from: c, reason: collision with root package name */
        private Long f59555c;

        public final f a() {
            String str = this.f59553a == null ? " token" : "";
            if (this.f59554b == null) {
                str = str.concat(" tokenExpirationTimestamp");
            }
            if (this.f59555c == null) {
                str = U7.d.e(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                return new a(this.f59553a, this.f59554b.longValue(), this.f59555c.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f59553a = str;
            return this;
        }

        public final f.a c(long j11) {
            this.f59555c = Long.valueOf(j11);
            return this;
        }

        public final f.a d(long j11) {
            this.f59554b = Long.valueOf(j11);
            return this;
        }
    }

    a(String str, long j11, long j12) {
        this.f59550a = str;
        this.f59551b = j11;
        this.f59552c = j12;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public final String a() {
        return this.f59550a;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public final long b() {
        return this.f59552c;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public final long c() {
        return this.f59551b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f59550a.equals(fVar.a()) && this.f59551b == fVar.c() && this.f59552c == fVar.b();
    }

    public final int hashCode() {
        int hashCode = (this.f59550a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f59551b;
        long j12 = this.f59552c;
        return ((hashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f59550a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f59551b);
        sb2.append(", tokenCreationTimestamp=");
        return P4.f.a(this.f59552c, "}", sb2);
    }
}
