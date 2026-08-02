package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n41 implements l41 {
    public final nja a;
    public float b = -1.0f;

    public n41(List list) {
        this.a = (nja) list.get(0);
    }

    @Override // defpackage.l41
    public final boolean h(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.l41
    public final nja i() {
        return this.a;
    }

    @Override // defpackage.l41
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.l41
    public final boolean j(float f) {
        return !this.a.c();
    }

    @Override // defpackage.l41
    public final float l() {
        return this.a.b();
    }

    @Override // defpackage.l41
    public final float n() {
        return this.a.a();
    }
}
