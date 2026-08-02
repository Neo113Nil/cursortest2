package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class il2 extends l {
    public final PickerItem.Tournament a;
    public final ll2 b;
    public xk2 c;
    public final ArrayList d;
    public final joa e;
    public final joa f;

    public il2(List list, PickerItem.Tournament tournament, ll2 ll2Var) {
        wk2 wk2Var;
        wk2 wk2Var2;
        list.getClass();
        this.a = tournament;
        this.b = ll2Var;
        this.c = (tournament == null || (wk2Var2 = tournament.a) == null) ? xk2.b : wk2Var2.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String competitionType = ((UniqueTournament) it.next()).getCompetitionType();
            if (competitionType != null) {
                wk2.f.getClass();
                wk2Var = inb.r(competitionType);
            } else {
                wk2Var = null;
            }
            if (wk2Var != null) {
                arrayList.add(wk2Var);
            }
        }
        this.d = new ArrayList(CollectionsKt.H0(CollectionsKt.S0(CollectionsKt.V0(arrayList)), new qe8(22)));
        ix1 ix1Var = new ix1(16, list, this);
        ysa ysaVar = ysa.c;
        this.e = ypa.a(ysaVar, ix1Var);
        this.f = ypa.a(ysaVar, new el2(list, 0));
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return o().size();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        return ((PickerItem) o().get(i)).a();
    }

    public final List o() {
        return this.c == xk2.c ? (List) this.f.getValue() : (List) this.e.getValue();
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        gl2 gl2Var = (gl2) uVar;
        gl2Var.getClass();
        gl2Var.a((PickerItem) o().get(i));
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tournament_picker_category, viewGroup, false);
            int i2 = R.id.category_name_text;
            TextView textView = (TextView) nq8.B(R.id.category_name_text, inflate);
            if (textView != null) {
                i2 = R.id.dropdown_icon;
                ImageView imageView = (ImageView) nq8.B(R.id.dropdown_icon, inflate);
                if (imageView != null) {
                    return new fl2(this, new gh5((LinearLayout) inflate, textView, imageView, 2));
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tournament_picker_tournament, viewGroup, false);
        int i3 = R.id.icon;
        ImageView imageView2 = (ImageView) nq8.B(R.id.icon, inflate2);
        if (imageView2 != null) {
            i3 = R.id.name;
            TextView textView2 = (TextView) nq8.B(R.id.name, inflate2);
            if (textView2 != null) {
                return new hl2(this, new gh5((LinearLayout) inflate2, imageView2, textView2, 3));
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        return null;
    }
}
