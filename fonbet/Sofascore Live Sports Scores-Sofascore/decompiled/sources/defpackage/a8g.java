package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a8g {
    public final List a;
    public final boolean b;

    public a8g(hbc hbcVar) {
        this.a = hbcVar.b;
        this.b = hbcVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8g)) {
            return false;
        }
        a8g a8gVar = (a8g) obj;
        return this.a.equals(a8gVar.a) && this.b == a8gVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), null);
    }
}
