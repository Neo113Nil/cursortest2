package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sr9 {
    public final String a;

    public sr9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sr9)) {
            return false;
        }
        String str = ((sr9) obj).a;
        String str2 = this.a;
        return str2.hashCode() == str.hashCode() && str2.equals(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
