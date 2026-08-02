package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qrd implements wke {
    public final /* synthetic */ tra a;
    public final /* synthetic */ tra b;
    public final /* synthetic */ vg6 c;

    public qrd(tra traVar, tra traVar2, vg6 vg6Var) {
        this.a = traVar;
        this.b = traVar2;
        this.c = vg6Var;
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        if (i == 3) {
            this.b.invoke();
            this.c.z(this);
        }
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        this.a.invoke();
    }
}
