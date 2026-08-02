package rh;

import java.util.List;

/* renamed from: rh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6285c extends AbstractC6283a {

    /* renamed from: a, reason: collision with root package name */
    public final List f64391a;

    public C6285c(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f64391a = list;
    }

    @Override // rh.AbstractC6283a
    public List b() {
        return this.f64391a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6283a) {
            return this.f64391a.equals(((AbstractC6283a) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f64391a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ArrayBasedTraceState{entries=" + this.f64391a + "}";
    }
}
