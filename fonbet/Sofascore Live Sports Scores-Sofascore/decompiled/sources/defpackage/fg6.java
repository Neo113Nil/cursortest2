package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fg6 implements pdb, qdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ fg6(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.pdb
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((vke) obj).onShuffleModeEnabledChanged(z);
                break;
            case 1:
                int i2 = vg6.r0;
                ((wke) obj).onShuffleModeEnabledChanged(z);
                break;
            case 2:
                ((vke) obj).onSkipSilenceEnabledChanged(z);
                break;
            case 3:
                ((wke) obj).onSkipSilenceEnabledChanged(z);
                break;
            default:
                ((wke) obj).onIsPlayingChanged(z);
                break;
        }
    }
}
