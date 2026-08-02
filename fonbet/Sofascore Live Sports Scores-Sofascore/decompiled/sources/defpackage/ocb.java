package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ocb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qcb b;

    public /* synthetic */ ocb(qcb qcbVar, int i) {
        this.a = i;
        this.b = qcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qcb qcbVar = this.b;
        switch (i) {
            case 0:
                qc5 qc5Var = qcbVar.c;
                if (qc5Var != null) {
                    qc5Var.setListSelectionHidden(true);
                    qc5Var.requestLayout();
                    break;
                }
                break;
            default:
                qc5 qc5Var2 = qcbVar.c;
                if (qc5Var2 != null && qc5Var2.isAttachedToWindow() && qcbVar.c.getCount() > qcbVar.c.getChildCount() && qcbVar.c.getChildCount() <= qcbVar.m) {
                    qcbVar.z.setInputMethodMode(2);
                    qcbVar.show();
                    break;
                }
                break;
        }
    }
}
