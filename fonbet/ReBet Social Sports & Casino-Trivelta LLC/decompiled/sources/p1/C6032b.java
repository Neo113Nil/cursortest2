package p1;

import java.util.Objects;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6032b {

    /* renamed from: a, reason: collision with root package name */
    public final String f62896a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62897b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f62899d;

    public C6032b(String str, String str2, int i10, int i11) {
        this.f62896a = str;
        this.f62897b = str2;
        this.f62898c = i10;
        this.f62899d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6032b)) {
            return false;
        }
        C6032b c6032b = (C6032b) obj;
        return this.f62898c == c6032b.f62898c && this.f62899d == c6032b.f62899d && Objects.equals(this.f62896a, c6032b.f62896a) && Objects.equals(this.f62897b, c6032b.f62897b);
    }

    public int hashCode() {
        return Objects.hash(this.f62896a, this.f62897b, Integer.valueOf(this.f62898c), Integer.valueOf(this.f62899d));
    }
}
