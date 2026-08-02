package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vo9 extends ap9 {
    public final ro9 N;
    public final ro9 O;
    public final ro9 P;

    public vo9() {
        super("SHOTS_ON_GOAL", 5, new ro9(12), new ro9(13));
        this.N = new ro9(14);
        this.O = new ro9(15);
        this.P = new ro9(16);
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
