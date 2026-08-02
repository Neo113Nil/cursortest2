package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gg6 implements qdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ etj b;

    public /* synthetic */ gg6(etj etjVar, int i) {
        this.a = i;
        this.b = etjVar;
    }

    @Override // defpackage.qdb
    public final void invoke(Object obj) {
        int i = this.a;
        etj etjVar = this.b;
        wke wkeVar = (wke) obj;
        switch (i) {
            case 0:
                int i2 = vg6.r0;
                wkeVar.onTrackSelectionParametersChanged(etjVar);
                break;
            default:
                wkeVar.onTrackSelectionParametersChanged(etjVar);
                break;
        }
    }
}
