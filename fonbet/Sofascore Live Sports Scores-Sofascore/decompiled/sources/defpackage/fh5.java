package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fh5 extends ArrayAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh5(Context context) {
        super(context, R.layout.simple_list_item_1, new ArrayList());
        context.getClass();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new cl2(1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        nfc b = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
        ImageView imageView = b.b;
        ConstraintLayout constraintLayout = b.a;
        Team team = (Team) getItem(i);
        if (team == null) {
            constraintLayout.getClass();
            return constraintLayout;
        }
        Context context = getContext();
        context.getClass();
        String p = tba.p(context, team);
        if (qea.y(team)) {
            p = wv8.i(p, " ", getContext().getString(com.sofascore.results.R.string.female_team));
        }
        b.c.setText(p);
        imageView.setVisibility(0);
        as9.o(imageView, team.getId());
        constraintLayout.getClass();
        return constraintLayout;
    }
}
