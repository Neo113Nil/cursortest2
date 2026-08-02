package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ovj {
    public final boolean a;
    public final pvj b;

    public ovj(boolean z, pvj pvjVar) {
        pvjVar.getClass();
        this.a = z;
        this.b = pvjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovj)) {
            return false;
        }
        ovj ovjVar = (ovj) obj;
        return this.a == ovjVar.a && this.b == ovjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TransferSort(isDescending=" + this.a + ", sortType=" + this.b + ")";
    }
}
