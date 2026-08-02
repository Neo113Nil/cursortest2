package cc;

import C.o0;

/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5798a {

    /* renamed from: a, reason: collision with root package name */
    private final String f56892a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f56893b;

    /* renamed from: c, reason: collision with root package name */
    private final String f56894c;

    public C5798a(String str, boolean z11, String str2) {
        this.f56892a = str;
        this.f56893b = z11;
        this.f56894c = str2;
    }

    public final boolean a() {
        return this.f56893b;
    }

    public final String b() {
        return this.f56892a;
    }

    public final String c() {
        return this.f56894c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5798a.class == obj.getClass()) {
            C5798a c5798a = (C5798a) obj;
            if (this.f56893b != c5798a.f56893b) {
                return false;
            }
            String str = c5798a.f56892a;
            String str2 = this.f56892a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = c5798a.f56894c;
            String str4 = this.f56894c;
            if (str4 != null) {
                return str4.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f56892a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + (this.f56893b ? 1 : 0)) * 31;
        String str2 = this.f56894c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataUri{contentType='");
        sb2.append(this.f56892a);
        sb2.append("', base64=");
        sb2.append(this.f56893b);
        sb2.append(", data='");
        return o0.c(sb2, this.f56894c, "'}");
    }
}
