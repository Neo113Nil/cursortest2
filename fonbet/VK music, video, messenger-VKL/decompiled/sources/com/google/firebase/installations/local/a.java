package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.b;
import xsna.i5s;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes.dex */
public final class a extends b {
    public final String b;
    public final PersistedInstallation.RegistrationStatus c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: com.google.firebase.installations.local.a$a, reason: collision with other inner class name */
    public static final class C0138a extends b.a {
        public String a;
        public PersistedInstallation.RegistrationStatus b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public final a a() {
            String str = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final C0138a b(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = registrationStatus;
            return this;
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = registrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // com.google.firebase.installations.local.b
    @Nullable
    public final String a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.b
    public final long b() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.b
    @Nullable
    public final String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.b
    @Nullable
    public final String d() {
        return this.h;
    }

    @Override // com.google.firebase.installations.local.b
    @Nullable
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.b;
        if (str == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!str.equals(bVar.c())) {
            return false;
        }
        if (!this.c.equals(bVar.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(bVar.a())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!str3.equals(bVar.e())) {
            return false;
        }
        if (this.f != bVar.b() || this.g != bVar.g()) {
            return false;
        }
        String str4 = this.h;
        return str4 == null ? bVar.d() == null : str4.equals(bVar.d());
    }

    @Override // com.google.firebase.installations.local.b
    @NonNull
    public final PersistedInstallation.RegistrationStatus f() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.b
    public final long g() {
        return this.g;
    }

    public final C0138a h() {
        C0138a c0138a = new C0138a();
        c0138a.a = this.b;
        c0138a.b = this.c;
        c0138a.c = this.d;
        c0138a.d = this.e;
        c0138a.e = Long.valueOf(this.f);
        c0138a.f = Long.valueOf(this.g);
        c0138a.g = this.h;
        return c0138a;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return i5s.a(sb, this.h, "}");
    }
}
