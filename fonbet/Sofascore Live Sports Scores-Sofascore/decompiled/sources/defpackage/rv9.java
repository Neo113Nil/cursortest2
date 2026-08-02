package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rv9 implements Serializable {
    public final sv9 a;

    public rv9(sv9 sv9Var) {
        this.a = sv9Var;
    }

    public Object readResolve() {
        return this.a.s();
    }
}
