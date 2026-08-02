package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vpa {
    public final String a;

    public vpa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vpa) {
            return this.a.equals(((vpa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return mz1.o(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
