package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dxe extends BaseAdapter implements Filterable {
    public final Context a;
    public final mqi b;
    public ArrayList c;

    public dxe(Context context) {
        context.getClass();
        this.a = context;
        this.b = ypa.b(new ate(this, 4));
        this.c = new ArrayList();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new cl2(5);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return dmi.r(((UniqueTournament) this.c.get(i)).getName(), " (", tba.q(((UniqueTournament) this.c.get(i)).getCategory(), this.a), ")");
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object b;
        viewGroup.getClass();
        if (view == null || (b = view.getTag()) == null) {
            b = ss9.b((LayoutInflater) this.b.getValue(), viewGroup);
        }
        ss9 ss9Var = (ss9) b;
        TextView textView = ss9Var.f;
        ConstraintLayout constraintLayout = ss9Var.a;
        if (constraintLayout.getTag() == null) {
            constraintLayout.setTag(ss9Var);
        }
        Object obj = this.c.get(i);
        obj.getClass();
        UniqueTournament uniqueTournament = (UniqueTournament) obj;
        aba.I(constraintLayout);
        as9.q(ss9Var.c, Integer.valueOf(uniqueTournament.getId()), uniqueTournament.getId(), null);
        ss9Var.e.setText(uniqueTournament.getName());
        textView.setVisibility(0);
        textView.setText(tba.q(uniqueTournament.getCategory(), this.a));
        ss9Var.b.setVisibility(8);
        return constraintLayout;
    }
}
