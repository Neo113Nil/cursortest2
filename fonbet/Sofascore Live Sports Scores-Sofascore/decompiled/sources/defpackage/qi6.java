package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qi6 extends ri6 {
    public final int a;

    public qi6(int i) {
        this.a = i;
    }

    @Override // defpackage.ri6
    public final String a() {
        Integer valueOf = Integer.valueOf(this.a);
        int intValue = valueOf.intValue();
        Object obj = valueOf;
        if (intValue <= 1) {
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        return mz1.m(obj, "treatment");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi6) && this.a == ((qi6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.k(this.a, "Treatment(level=", ")");
    }
}
