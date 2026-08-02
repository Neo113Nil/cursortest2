package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bg6 implements qdb, pdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ bg6(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.qdb
    public final void invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                int i2 = vg6.r0;
                ((wke) obj).onVolumeChanged(f);
                break;
            case 1:
                ((vke) obj).onVolumeChanged(f);
                break;
            default:
                ((wke) obj).onVolumeChanged(f);
                break;
        }
    }
}
