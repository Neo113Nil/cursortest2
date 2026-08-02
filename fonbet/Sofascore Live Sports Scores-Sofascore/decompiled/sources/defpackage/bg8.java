package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bg8 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg8)) {
            return false;
        }
        bg8 bg8Var = (bg8) obj;
        return Objects.equals(this.a, bg8Var.a) && Objects.equals(this.b, bg8Var.b) && Objects.equals(this.c, bg8Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
