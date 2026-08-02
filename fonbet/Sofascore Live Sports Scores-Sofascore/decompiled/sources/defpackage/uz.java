package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uz {
    public final int a;

    public /* synthetic */ uz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uz) {
            return this.a == ((uz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.n("AndroidContentDataType(androidAutofillType=", this.a, ')');
    }
}
