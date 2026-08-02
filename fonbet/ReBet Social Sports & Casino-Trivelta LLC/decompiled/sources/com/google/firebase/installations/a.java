package com.google.firebase.installations;

import com.google.firebase.installations.m;

/* loaded from: classes3.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f37788a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37789b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37790c;

    public static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        public String f37791a;

        /* renamed from: b, reason: collision with root package name */
        public long f37792b;

        /* renamed from: c, reason: collision with root package name */
        public long f37793c;

        /* renamed from: d, reason: collision with root package name */
        public byte f37794d;

        @Override // com.google.firebase.installations.m.a
        public m a() {
            String str;
            if (this.f37794d == 3 && (str = this.f37791a) != null) {
                return new a(str, this.f37792b, this.f37793c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f37791a == null) {
                sb2.append(" token");
            }
            if ((this.f37794d & 1) == 0) {
                sb2.append(" tokenExpirationTimestamp");
            }
            if ((this.f37794d & 2) == 0) {
                sb2.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.installations.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f37791a = str;
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a c(long j10) {
            this.f37793c = j10;
            this.f37794d = (byte) (this.f37794d | 2);
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a d(long j10) {
            this.f37792b = j10;
            this.f37794d = (byte) (this.f37794d | 1);
            return this;
        }
    }

    @Override // com.google.firebase.installations.m
    public String b() {
        return this.f37788a;
    }

    @Override // com.google.firebase.installations.m
    public long c() {
        return this.f37790c;
    }

    @Override // com.google.firebase.installations.m
    public long d() {
        return this.f37789b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f37788a.equals(mVar.b()) && this.f37789b == mVar.d() && this.f37790c == mVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f37788a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f37789b;
        long j11 = this.f37790c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f37788a + ", tokenExpirationTimestamp=" + this.f37789b + ", tokenCreationTimestamp=" + this.f37790c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f37788a = str;
        this.f37789b = j10;
        this.f37790c = j11;
    }
}
