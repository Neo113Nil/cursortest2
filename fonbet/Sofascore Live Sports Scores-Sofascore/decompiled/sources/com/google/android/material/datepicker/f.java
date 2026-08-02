package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f extends RecyclerView.OnScrollListener {
    public final /* synthetic */ o a;
    public final /* synthetic */ MaterialCalendar b;

    public f(MaterialCalendar materialCalendar, o oVar) {
        this.b = materialCalendar;
        this.a = oVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        MaterialCalendar materialCalendar;
        androidx.recyclerview.widget.i iVar;
        int childAdapterPosition;
        if (i != 0 || (iVar = (materialCalendar = this.b).p) == null) {
            return;
        }
        View findSnapView = iVar.findSnapView((LinearLayoutManager) materialCalendar.i.getLayoutManager());
        if (findSnapView != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(findSnapView)) != -1) {
            o oVar = this.a;
            materialCalendar.e = oVar.o(childAdapterPosition);
            materialCalendar.n.setText(oVar.o(childAdapterPosition).d());
            materialCalendar.p(childAdapterPosition);
        }
        materialCalendar.o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.b;
        RecyclerView recyclerView2 = materialCalendar.i;
        int findFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).findLastVisibleItemPosition();
        androidx.recyclerview.widget.i iVar = materialCalendar.p;
        o oVar = this.a;
        if (iVar == null) {
            materialCalendar.e = oVar.o(findFirstVisibleItemPosition);
        }
        materialCalendar.n.setText(oVar.o(findFirstVisibleItemPosition).d());
        materialCalendar.p(findFirstVisibleItemPosition);
    }
}
