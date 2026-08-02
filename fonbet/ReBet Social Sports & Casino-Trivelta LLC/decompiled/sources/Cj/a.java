package Cj;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f2320a;

    /* renamed from: b, reason: collision with root package name */
    public String f2321b;

    public a(String str, String str2) {
        this.f2320a = str;
        this.f2321b = str2;
    }

    public final int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public String b() {
        return this.f2320a;
    }

    public String c() {
        return this.f2321b;
    }

    public final boolean d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (aVar != this) {
            return d(this.f2320a, aVar.f2320a) && d(this.f2321b, aVar.f2321b);
        }
        return true;
    }

    public int hashCode() {
        return a(this.f2320a) + (a(this.f2321b) * 31);
    }
}
