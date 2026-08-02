package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class eg6 implements sdb, qdb {
    public final /* synthetic */ vg6 a;

    public /* synthetic */ eg6(vg6 vg6Var) {
        this.a = vg6Var;
    }

    @Override // defpackage.sdb
    public void a(Object obj, j78 j78Var) {
        int i = vg6.r0;
        ((wke) obj).onEvents(this.a.f, new uke(j78Var));
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = vg6.r0;
        ((wke) obj).onAvailableCommandsChanged(this.a.R);
    }
}
