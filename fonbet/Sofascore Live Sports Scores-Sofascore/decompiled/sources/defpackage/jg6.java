package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jg6 implements pdb, qdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ jg6(int i, boolean z, int i2) {
        this.a = i2;
        this.c = i;
        this.b = z;
    }

    @Override // defpackage.pdb
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((vke) obj).onDeviceVolumeChanged(i2, z);
                break;
            case 1:
                ((wke) obj).onPlayerStateChanged(z, i2);
                break;
            case 2:
                ((wke) obj).onDeviceVolumeChanged(i2, z);
                break;
            default:
                ((wke) obj).onPlayWhenReadyChanged(z, i2);
                break;
        }
    }

    public /* synthetic */ jg6(boolean z, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = i;
    }
}
