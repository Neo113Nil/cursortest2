package ph;

/* renamed from: ph.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6075f implements oh.e {

    /* renamed from: a, reason: collision with root package name */
    public final oh.f f63213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63215c;
    private byte[] keyUtf8;

    public C6075f(oh.f fVar, String str) {
        if (fVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f63213a = fVar;
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f63214b = str;
        this.f63215c = d(fVar, str);
    }

    public static int d(oh.f fVar, String str) {
        return ((fVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static oh.e e(String str, oh.f fVar) {
        if (str == null) {
            str = "";
        }
        return new C6075f(fVar, str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6075f) {
            C6075f c6075f = (C6075f) obj;
            if (this.f63213a.equals(c6075f.f()) && this.f63214b.equals(c6075f.getKey())) {
                return true;
            }
        }
        return false;
    }

    public oh.f f() {
        return this.f63213a;
    }

    @Override // oh.e
    public String getKey() {
        return this.f63214b;
    }

    public int hashCode() {
        return this.f63215c;
    }

    public String toString() {
        return this.f63214b;
    }
}
