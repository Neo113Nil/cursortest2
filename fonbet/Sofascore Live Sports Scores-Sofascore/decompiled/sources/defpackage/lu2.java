package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lu2 extends RecyclerView.OnScrollListener {
    public final t21 a;
    public boolean b;
    public boolean c;
    public Integer d = Integer.MAX_VALUE;
    public Integer e;

    public lu2(t21 t21Var) {
        this.a = t21Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Integer num;
        Integer num2;
        recyclerView.getClass();
        n layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int itemCount = linearLayoutManager.getItemCount();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int childCount = linearLayoutManager.getChildCount();
        t21 t21Var = this.a;
        if (i2 < 0 && findFirstVisibleItemPosition <= 4 && (num2 = this.d) != null && this.c) {
            this.c = false;
            t21Var.invoke(num2, t6e.a);
        }
        boolean z = childCount + findFirstVisibleItemPosition >= itemCount - 4;
        if (i2 <= 0 || !z || (num = this.e) == null || !this.b) {
            return;
        }
        this.b = false;
        t21Var.invoke(num, t6e.b);
    }
}
