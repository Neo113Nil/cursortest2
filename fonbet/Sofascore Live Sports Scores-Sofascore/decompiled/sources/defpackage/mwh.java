package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mwh implements AutoCloseable {
    public final l62 a;

    public /* synthetic */ mwh(l62 l62Var) {
        this.a = l62Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mwh) {
            return this.a.equals(((mwh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ")";
    }
}
