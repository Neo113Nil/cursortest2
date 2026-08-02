package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zr9 implements rq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6b b;
    public final /* synthetic */ fsf c;

    public /* synthetic */ zr9(g6b g6bVar, fsf fsfVar, int i) {
        this.a = i;
        this.b = g6bVar;
        this.c = fsfVar;
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        int i = this.a;
        fsf fsfVar = this.c;
        g6b g6bVar = this.b;
        switch (i) {
            case 0:
                g6bVar.d(this);
                yda ydaVar = (yda) fsfVar.a;
                if (ydaVar != null) {
                    ydaVar.e(null);
                    break;
                }
                break;
            default:
                g6bVar.d(this);
                yda ydaVar2 = (yda) fsfVar.a;
                if (ydaVar2 != null) {
                    ydaVar2.e(null);
                    break;
                }
                break;
        }
    }
}
