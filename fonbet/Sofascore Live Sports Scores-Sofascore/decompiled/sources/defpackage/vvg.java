package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vvg {
    public static final vvg b;
    public final vv9 a;

    static {
        bka bkaVar = new bka(18, false);
        bkaVar.b = vv9.w(1, 5);
        b = new vvg(bkaVar);
    }

    public vvg(bka bkaVar) {
        this.a = (vv9) bkaVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vvg) && this.a.equals(((vvg) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
