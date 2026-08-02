package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cg6 implements qdb, pdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ cg6(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.qdb
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                int i4 = vg6.r0;
                ((wke) obj).onSurfaceSizeChanged(i3, i2);
                break;
            default:
                ((vke) obj).onSurfaceSizeChanged(i3, i2);
                break;
        }
    }
}
