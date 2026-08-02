package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cge extends dfb {
    public final /* synthetic */ int a;
    public final bfb b;

    public cge(bfb bfbVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                z1a.y(bfbVar, "result");
                this.b = bfbVar;
                break;
            default:
                z1a.y(bfbVar, "result");
                this.b = bfbVar;
                break;
        }
    }

    @Override // defpackage.dfb
    public final bfb a(kge kgeVar) {
        switch (this.a) {
        }
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        bfb bfbVar = this.b;
        switch (i) {
            case 0:
                en0 en0Var = new en0(cge.class.getSimpleName());
                en0Var.e(bfbVar, "result");
                return en0Var.toString();
            default:
                return "FixedResultPicker(" + bfbVar + ")";
        }
    }
}
