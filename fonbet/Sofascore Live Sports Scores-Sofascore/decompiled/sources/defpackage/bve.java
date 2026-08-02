package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bve extends g7 {
    public final Gender l;
    public final LayoutInflater m;
    public final mqi n;
    public final mqi o;
    public final mqi p;
    public final mqi q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bve(FragmentActivity fragmentActivity, Gender gender) {
        super(fragmentActivity);
        fragmentActivity.getClass();
        this.l = gender;
        LayoutInflater from = LayoutInflater.from(fragmentActivity);
        from.getClass();
        this.m = from;
        this.n = ypa.b(new nzd(fragmentActivity, 14));
        this.o = ypa.b(new nzd(fragmentActivity, 15));
        this.p = ypa.b(new nzd(fragmentActivity, 16));
        this.q = ypa.b(new nzd(fragmentActivity, 17));
    }

    @Override // defpackage.g7
    public final void F(List list) {
        String Q;
        String Q2;
        String Q3;
        String Q4;
        String Q5;
        String Q6;
        String Q7;
        String Q8;
        String Q9;
        String Q10;
        String Q11;
        String Q12;
        ArrayList k = me4.k(list);
        Context context = this.b;
        Gender gender = this.l;
        Q = hkg.Q(context, R.string.football_striker, gender, new Object[0]);
        mqi mqiVar = this.n;
        k.add(new j2f("ST", Q, 1, ((Number) mqiVar.getValue()).intValue()));
        Q2 = hkg.Q(context, R.string.football_left_winger, gender, new Object[0]);
        k.add(new j2f("LW", Q2, 0, ((Number) mqiVar.getValue()).intValue()));
        Q3 = hkg.Q(context, R.string.football_right_winger, gender, new Object[0]);
        k.add(new j2f("RW", Q3, 2, ((Number) mqiVar.getValue()).intValue()));
        k.add(new CustomizableDivider(true, 0, false, null, 14, null));
        Q4 = hkg.Q(context, R.string.football_attacking_midfielder, gender, new Object[0]);
        k.add(new j2f("AM", Q4, 4, G()));
        Q5 = hkg.Q(context, R.string.football_left_midfielder, gender, new Object[0]);
        k.add(new j2f("ML", Q5, 6, G()));
        Q6 = hkg.Q(context, R.string.football_centre_midfielder, gender, new Object[0]);
        k.add(new j2f("MC", Q6, 7, G()));
        Q7 = hkg.Q(context, R.string.football_right_midfielder, gender, new Object[0]);
        k.add(new j2f("MR", Q7, 8, G()));
        Q8 = hkg.Q(context, R.string.football_defensive_midfielder, gender, new Object[0]);
        k.add(new j2f("DM", Q8, 10, G()));
        k.add(new CustomizableDivider(true, 0, false, null, 14, null));
        Q9 = hkg.Q(context, R.string.football_left_back, gender, new Object[0]);
        mqi mqiVar2 = this.p;
        k.add(new j2f(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN, Q9, 12, ((Number) mqiVar2.getValue()).intValue()));
        Q10 = hkg.Q(context, R.string.football_centre_back, gender, new Object[0]);
        k.add(new j2f("DC", Q10, 13, ((Number) mqiVar2.getValue()).intValue()));
        Q11 = hkg.Q(context, R.string.football_right_back, gender, new Object[0]);
        k.add(new j2f("DR", Q11, 14, ((Number) mqiVar2.getValue()).intValue()));
        k.add(new CustomizableDivider(true, 0, false, null, 14, null));
        Q12 = hkg.Q(context, R.string.goalkeeper, gender, new Object[0]);
        k.add(new j2f("GK", Q12, 14, ((Number) this.q.getValue()).intValue()));
        super.F(k);
    }

    public final int G() {
        return ((Number) this.o.getValue()).intValue();
    }

    @Override // defpackage.ysk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 3);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof j2f) {
            return 0;
        }
        if (obj instanceof CustomizableDivider) {
            return 1;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            return new ja9(h04.c(this.m, viewGroup));
        }
        if (i == 1) {
            return new wh(new SofaDivider(this.b, null, 6));
        }
        ilg.c();
        return null;
    }
}
