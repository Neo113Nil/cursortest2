package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s8g implements w8g {
    public final uyj a;

    public s8g(uyj uyjVar) {
        this.a = uyjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8g) && this.a.equals(((s8g) obj).a);
    }

    @Override // defpackage.w8g
    public final String getKey() {
        return ljg.j(this.a.a(), "l:");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Large(item=" + this.a + ")";
    }
}
