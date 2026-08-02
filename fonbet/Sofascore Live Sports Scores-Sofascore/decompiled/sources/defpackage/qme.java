package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qme extends BaseAdapter implements Filterable {
    public final Context a;
    public final mqi b = ypa.b(new xxb(this, 27));
    public ArrayList c = new ArrayList();

    public qme(Context context) {
        this.a = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new cl2(4);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((Player) this.c.get(i)).getName();
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
        ImageView imageView = ss9Var.g;
        TextView textView = ss9Var.f;
        ConstraintLayout constraintLayout = ss9Var.a;
        if (constraintLayout.getTag() == null) {
            constraintLayout.setTag(ss9Var);
        }
        Object obj = this.c.get(i);
        obj.getClass();
        Player player = (Player) obj;
        aba.I(constraintLayout);
        as9.l(ss9Var.c, player.getId(), null);
        ss9Var.e.setText(tba.t(player));
        Team team = player.getTeam();
        if (team != null) {
            imageView.setVisibility(0);
            as9.o(imageView, team.getId());
            textView.setVisibility(0);
            textView.setText(tba.p(this.a, team));
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(8);
        }
        ss9Var.b.setVisibility(8);
        return constraintLayout;
    }
}
