package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n7j {
    public final String a;
    public final String b;

    public n7j(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n7j)) {
            return false;
        }
        n7j n7jVar = (n7j) obj;
        String str = n7jVar.a;
        if (hashCode() != n7jVar.hashCode()) {
            return false;
        }
        String str2 = this.a;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.b.equals(n7jVar.b);
    }

    public final int hashCode() {
        String str = this.b;
        String str2 = this.a;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }
}
