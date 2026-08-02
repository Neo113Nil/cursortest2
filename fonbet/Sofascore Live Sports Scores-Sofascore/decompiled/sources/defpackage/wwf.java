package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wwf implements qdb, sdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ hxf b;

    public /* synthetic */ wwf(hxf hxfVar, int i) {
        this.a = i;
        this.b = hxfVar;
    }

    @Override // defpackage.sdb
    public void a(Object obj, j78 j78Var) {
        ((wke) obj).onEvents(this.b, new uke(j78Var));
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = this.a;
        hxf hxfVar = this.b;
        wke wkeVar = (wke) obj;
        switch (i) {
            case 0:
                wkeVar.onMediaItemTransition(hxfVar.e(), 3);
                break;
            case 1:
                wkeVar.onMediaItemTransition(hxfVar.e(), 1);
                break;
            case 2:
                wkeVar.onMediaMetadataChanged(hxfVar.G);
                break;
            case 3:
                wkeVar.onAvailableCommandsChanged(hxfVar.y);
                break;
            default:
                wkeVar.onMediaMetadataChanged(hxfVar.G);
                break;
        }
    }
}
