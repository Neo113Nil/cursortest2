package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uka {
    public final String a;
    public final String b;

    static {
        nik.N(0);
        nik.N(1);
    }

    public uka(String str, String str2) {
        this.a = nik.U(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uka.class == obj.getClass()) {
            uka ukaVar = (uka) obj;
            if (Objects.equals(this.a, ukaVar.a) && Objects.equals(this.b, ukaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
