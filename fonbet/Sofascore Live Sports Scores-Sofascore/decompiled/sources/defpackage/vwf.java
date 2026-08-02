package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vwf implements qdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ yke b;
    public final /* synthetic */ yke c;

    public /* synthetic */ vwf(yke ykeVar, yke ykeVar2, int i) {
        this.a = i;
        this.b = ykeVar;
        this.c = ykeVar2;
    }

    @Override // defpackage.qdb
    public final void invoke(Object obj) {
        int i = this.a;
        yke ykeVar = this.c;
        yke ykeVar2 = this.b;
        wke wkeVar = (wke) obj;
        switch (i) {
            case 0:
                wkeVar.onPositionDiscontinuity(4);
                wkeVar.onPositionDiscontinuity(ykeVar2, ykeVar, 4);
                break;
            case 1:
                wkeVar.onPositionDiscontinuity(0);
                wkeVar.onPositionDiscontinuity(ykeVar2, ykeVar, 0);
                break;
            default:
                wkeVar.onPositionDiscontinuity(1);
                wkeVar.onPositionDiscontinuity(ykeVar2, ykeVar, 1);
                break;
        }
    }
}
