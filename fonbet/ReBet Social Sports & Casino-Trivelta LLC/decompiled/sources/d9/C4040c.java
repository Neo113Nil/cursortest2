package d9;

/* renamed from: d9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4040c {

    /* renamed from: a, reason: collision with root package name */
    public final String f45158a;

    public C4040c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f45158a = str;
    }

    public static C4040c b(String str) {
        return new C4040c(str);
    }

    public String a() {
        return this.f45158a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4040c) {
            return this.f45158a.equals(((C4040c) obj).f45158a);
        }
        return false;
    }

    public int hashCode() {
        return this.f45158a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f45158a + "\"}";
    }
}
