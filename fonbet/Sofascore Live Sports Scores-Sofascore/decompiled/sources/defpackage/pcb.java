package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pcb implements AbsListView.OnScrollListener {
    public final /* synthetic */ qcb a;

    public pcb(qcb qcbVar) {
        this.a = qcbVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        qcb qcbVar = this.a;
        ocb ocbVar = qcbVar.r;
        ec0 ec0Var = qcbVar.z;
        if (i != 1 || ec0Var.getInputMethodMode() == 2 || ec0Var.getContentView() == null) {
            return;
        }
        qcbVar.v.removeCallbacks(ocbVar);
        ocbVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
