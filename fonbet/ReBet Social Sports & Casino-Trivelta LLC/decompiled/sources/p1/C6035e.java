package p1;

import java.util.Objects;

/* renamed from: p1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6035e {

    /* renamed from: a, reason: collision with root package name */
    public final String f62926a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62927b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62928c;

    public C6035e(String str, String str2, String str3) {
        this.f62926a = str;
        this.f62927b = str2;
        this.f62928c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6035e.class == obj.getClass()) {
            C6035e c6035e = (C6035e) obj;
            if (Objects.equals(this.f62926a, c6035e.f62926a) && Objects.equals(this.f62927b, c6035e.f62927b) && Objects.equals(this.f62928c, c6035e.f62928c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f62926a.hashCode() * 31;
        String str = this.f62927b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f62928c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
