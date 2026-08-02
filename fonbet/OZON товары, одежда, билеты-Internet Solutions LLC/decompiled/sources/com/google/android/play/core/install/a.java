package com.google.android.play.core.install;

import C.o0;

/* loaded from: classes9.dex */
final class a extends InstallState {

    /* renamed from: a, reason: collision with root package name */
    private final int f58863a;

    /* renamed from: b, reason: collision with root package name */
    private final long f58864b;

    /* renamed from: c, reason: collision with root package name */
    private final long f58865c;

    /* renamed from: d, reason: collision with root package name */
    private final int f58866d;

    /* renamed from: e, reason: collision with root package name */
    private final String f58867e;

    a(int i11, String str, long j11, long j12, int i12) {
        this.f58863a = i11;
        this.f58864b = j11;
        this.f58865c = j12;
        this.f58866d = i12;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f58867e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f58864b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.f58866d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f58863a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f58867e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.f58865c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallState)) {
            return false;
        }
        InstallState installState = (InstallState) obj;
        return this.f58863a == installState.c() && this.f58864b == installState.a() && this.f58865c == installState.e() && this.f58866d == installState.b() && this.f58867e.equals(installState.d());
    }

    public final int hashCode() {
        int i11 = this.f58863a ^ 1000003;
        long j11 = this.f58864b;
        long j12 = this.f58865c;
        return (((((((i11 * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f58866d) * 1000003) ^ this.f58867e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallState{installStatus=");
        sb2.append(this.f58863a);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f58864b);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f58865c);
        sb2.append(", installErrorCode=");
        sb2.append(this.f58866d);
        sb2.append(", packageName=");
        return o0.c(sb2, this.f58867e, "}");
    }
}
