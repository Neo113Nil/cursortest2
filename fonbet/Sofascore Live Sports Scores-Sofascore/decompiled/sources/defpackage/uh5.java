package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uh5 extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new cl2(2);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.edit_player_team_row, viewGroup, false);
        }
        gh5 a = gh5.a(view);
        Manager manager = (Manager) getItem(i);
        if (manager != null) {
            a.d.setText(tba.s(manager));
            as9.g(a.c, manager.getId());
        }
        LinearLayout linearLayout = a.b;
        linearLayout.getClass();
        return linearLayout;
    }
}
