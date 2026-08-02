package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class r99 extends fm3 implements hm6 {
    public final zci k0;
    public final int l0;
    public final ArrayList m0;

    public r99(zci zciVar, int i) {
        super(zciVar);
        this.m0 = new ArrayList();
        this.k0 = zciVar;
        this.l0 = i;
    }

    @Override // defpackage.fm3, defpackage.gtf
    public final wm3 a() {
        return s();
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.m0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public t99 s() {
        return null;
    }

    @Override // defpackage.fm3, defpackage.gtf, defpackage.hm6
    public void apply() {
    }
}
