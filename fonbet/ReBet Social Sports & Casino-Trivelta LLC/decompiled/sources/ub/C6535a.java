package ub;

import java.util.List;

/* renamed from: ub.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6535a extends v {

    /* renamed from: a, reason: collision with root package name */
    public final String f66228a;

    /* renamed from: b, reason: collision with root package name */
    public final List f66229b;

    public C6535a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f66228a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f66229b = list;
    }

    @Override // ub.v
    public List b() {
        return this.f66229b;
    }

    @Override // ub.v
    public String c() {
        return this.f66228a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f66228a.equals(vVar.c()) && this.f66229b.equals(vVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f66228a.hashCode() ^ 1000003) * 1000003) ^ this.f66229b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f66228a + ", usedDates=" + this.f66229b + "}";
    }
}
