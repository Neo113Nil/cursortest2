package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes12.dex */
public final class s implements Runnable {
    public final /* synthetic */ r.c b;
    public final /* synthetic */ r c;

    public s(r rVar, r.c cVar, int i) {
        this.c = rVar;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.c cVar = this.b;
        RecyclerView.e0 e0Var = cVar.f;
        r rVar = this.c;
        RecyclerView recyclerView = rVar.s;
        if (recyclerView == null || !recyclerView.isAttachedToWindow() || cVar.l || e0Var.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        RecyclerView.l itemAnimator = rVar.s.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.n()) {
            ArrayList arrayList = rVar.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((r.f) arrayList.get(i)).m) {
                }
            }
            rVar.n.p(e0Var);
            return;
        }
        rVar.s.post(this);
    }
}
