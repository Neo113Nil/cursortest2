package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.calendar.MaterialCalendarView;
import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class czb extends l {
    public final /* synthetic */ MaterialCalendarView a;

    public czb(MaterialCalendarView materialCalendarView) {
        this.a = materialCalendarView;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        MaterialCalendarView materialCalendarView = this.a;
        return materialCalendarView.j + materialCalendarView.k + 1;
    }

    public final fg2 o() {
        MaterialCalendarView materialCalendarView = this.a;
        Calendar calendar = materialCalendarView.l;
        calendar.setTime(new Date());
        calendar.add(2, -materialCalendarView.j);
        calendar.getClass();
        return new fg2(calendar);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        bzb bzbVar = (bzb) uVar;
        bzbVar.getClass();
        azb azbVar = new azb(this.a, p(i));
        View view = bzbVar.itemView;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAlpha(1.0f);
        recyclerView.swapAdapter(azbVar, false);
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        viewGroup.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(7, 0));
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new bzb(recyclerView);
    }

    public final fg2 p(int i) {
        fg2 o = o();
        Calendar calendar = this.a.l;
        calendar.getClass();
        o.b(calendar);
        calendar.add(2, i);
        calendar.getClass();
        return new fg2(calendar);
    }
}
