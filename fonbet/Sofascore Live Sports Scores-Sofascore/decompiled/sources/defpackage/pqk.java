package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pqk implements wke {
    public final /* synthetic */ tra a;
    public final /* synthetic */ mth b;
    public final /* synthetic */ tra c;
    public final /* synthetic */ tra d;

    public pqk(tra traVar, mth mthVar, tra traVar2, tra traVar3) {
        this.a = traVar;
        this.b = mthVar;
        this.c = traVar2;
        this.d = traVar3;
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        if (i == 1) {
            this.c.invoke();
        } else if (i == 3) {
            this.b.invoke();
        } else {
            if (i != 4) {
                return;
            }
            this.d.invoke();
        }
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        this.a.invoke();
    }
}
