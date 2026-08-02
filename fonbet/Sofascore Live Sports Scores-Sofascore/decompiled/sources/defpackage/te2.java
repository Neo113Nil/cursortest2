package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class te2 implements kx4 {
    public r62 a = am5.a;
    public j0l b;

    public final j0l a(Function1 function1) {
        return b(new se2(0, function1));
    }

    public final j0l b(Function1 function1) {
        j0l j0lVar = new j0l(22, false);
        j0lVar.b = function1;
        this.b = j0lVar;
        return j0lVar;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.j().getFontScale();
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.j().j();
    }
}
