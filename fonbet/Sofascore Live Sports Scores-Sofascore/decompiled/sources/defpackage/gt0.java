package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gt0 {
    public fx3 a;
    public List b;
    public List c;
    public Boolean d;
    public gx3 e;
    public List f;
    public int g;
    public byte h;

    public final ht0 a() {
        fx3 fx3Var;
        if (this.h == 1 && (fx3Var = this.a) != null) {
            return new ht0(fx3Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
