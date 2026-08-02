package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gh extends RecyclerView.OnScrollListener {
    public final /* synthetic */ hh a;

    public gh(hh hhVar) {
        this.a = hhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        hh hhVar = this.a;
        if (i == 0) {
            hhVar.d();
        } else {
            if (i != 1) {
                return;
            }
            hhVar.e();
        }
    }
}
