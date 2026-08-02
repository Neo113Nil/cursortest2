package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bs7 extends wrj {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs7(zl zlVar, boolean z, int i, boolean z2, int i2, int i3) {
        super(zlVar, z, i, z2, i2);
        this.g = i3;
    }

    @Override // defpackage.wrj, defpackage.p8
    public final /* bridge */ /* synthetic */ void b(int i, int i2, Object obj) {
        switch (this.g) {
            case 0:
                b(i, i2, (lrj) obj);
                break;
            default:
                b(i, i2, (lrj) obj);
                break;
        }
    }

    @Override // defpackage.wrj
    /* renamed from: d */
    public final void b(int i, int i2, lrj lrjVar) {
        int i3 = this.g;
        lrjVar.getClass();
        switch (i3) {
            case 0:
                lrjVar.b = !lrjVar.k;
                lrjVar.l = false;
                super.b(i, i2, lrjVar);
                break;
            default:
                lrjVar.k = true;
                lrjVar.l = false;
                super.b(i, i2, lrjVar);
                break;
        }
    }
}
