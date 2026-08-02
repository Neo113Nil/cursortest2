package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aal extends z9l {
    @Override // defpackage.z9l, defpackage.pea
    public final void B(boolean z) {
        this.g.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.z9l, defpackage.pea
    public final void C(boolean z) {
        this.g.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.z9l, defpackage.pea
    public final void D() {
        this.g.setSystemBarsBehavior(2);
    }

    @Override // defpackage.z9l, defpackage.pea
    public final boolean y() {
        return (this.g.getSystemBarsAppearance() & 8) != 0;
    }
}
