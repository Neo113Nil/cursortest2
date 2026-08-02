package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vn9 extends ap9 {
    public final pn9 N;
    public final pn9 O;
    public final pn9 P;

    public vn9() {
        super("GOALIE_GOALS", 30, new pn9(22), new pn9(23));
        this.N = new pn9(24);
        this.O = new pn9(25);
        this.P = new pn9(26);
    }

    @Override // defpackage.lk2
    public final Function1 d() {
        return this.N;
    }

    @Override // defpackage.lk2
    public final Function1 g() {
        return this.P;
    }

    @Override // defpackage.lk2
    public final Function1 i() {
        return this.O;
    }
}
