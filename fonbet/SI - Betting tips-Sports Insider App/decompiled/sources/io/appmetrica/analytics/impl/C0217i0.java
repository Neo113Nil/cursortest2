package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13915b;

    public C0217i0(String str, long j) {
        this.f13914a = str;
        this.f13915b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0217i0.class == obj.getClass()) {
            C0217i0 c0217i0 = (C0217i0) obj;
            if (this.f13915b != c0217i0.f13915b) {
                return false;
            }
            String str = this.f13914a;
            String str2 = c0217i0.f13914a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13914a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f13915b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
