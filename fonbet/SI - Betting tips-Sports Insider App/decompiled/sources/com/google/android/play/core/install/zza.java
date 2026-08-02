package com.google.android.play.core.install;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a, reason: collision with root package name */
    public final int f6020a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6021b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6022c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6023d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6024e;

    public zza(int i5, long j, long j6, int i10, String str) {
        this.f6020a = i5;
        this.f6021b = j;
        this.f6022c = j6;
        this.f6023d = i10;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f6024e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f6020a == zzaVar.f6020a && this.f6021b == zzaVar.f6021b && this.f6022c == zzaVar.f6022c && this.f6023d == zzaVar.f6023d && this.f6024e.equals(zzaVar.f6024e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f6020a ^ 1000003;
        long j = this.f6021b;
        long j6 = this.f6022c;
        return (((((((i5 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f6023d) * 1000003) ^ this.f6024e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f6020a + ", bytesDownloaded=" + this.f6021b + ", totalBytesToDownload=" + this.f6022c + ", installErrorCode=" + this.f6023d + ", packageName=" + this.f6024e + "}";
    }
}
