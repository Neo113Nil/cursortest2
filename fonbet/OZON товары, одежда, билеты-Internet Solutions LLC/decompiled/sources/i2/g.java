package i2;

/* loaded from: classes8.dex */
public final class g extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final String f65762a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65763b;

    public g(String str, C6999b c6999b) {
        super(str);
        this.f65762a = str;
        this.f65763b = c6999b.f();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CLParsingException (");
        sb2.append(hashCode());
        sb2.append(") : ");
        sb2.append(this.f65762a + " (" + this.f65763b + " at line 0)");
        return sb2.toString();
    }
}
