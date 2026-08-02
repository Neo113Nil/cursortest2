package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lei extends a8 {
    public final bv1 e;
    public final Gender f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final TextView j;
    public final View k;
    public final Guideline l;
    public final Guideline m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lei(bv1 bv1Var, String str, Gender gender) {
        super(r0, str);
        str.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.e = bv1Var;
        this.f = gender;
        this.g = (TextView) bv1Var.c;
        this.h = (TextView) bv1Var.d;
        this.i = (View) bv1Var.f;
        this.j = (TextView) bv1Var.g;
        this.k = (View) bv1Var.j;
        this.l = (Guideline) bv1Var.h;
        this.m = (Guideline) bv1Var.i;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String Q;
        String Q2;
        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj;
        eventStatisticsItem.getClass();
        String name = eventStatisticsItem.getName();
        String str = this.d;
        Context context = this.b;
        String D = yaa.D(context, name, str);
        TextView textView = this.g;
        textView.setText(D);
        View view = this.i;
        view.setVisibility(4);
        View view2 = this.k;
        view2.setVisibility(4);
        this.h.setText(EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null));
        boolean otherPlayerSelected = eventStatisticsItem.getOtherPlayerSelected();
        TextView textView2 = this.j;
        if (otherPlayerSelected) {
            textView2.setText(EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null));
            int compareCode$default = EventStatisticsItem.getCompareCode$default(eventStatisticsItem, null, 1, null);
            if (compareCode$default == 1) {
                view.setVisibility(0);
            } else if (compareCode$default == 2) {
                view2.setVisibility(0);
            }
        } else {
            textView2.setText("-");
        }
        bv1 bv1Var = this.e;
        ((View) bv1Var.e).setVisibility(!eventStatisticsItem.getHideDivider() ? 0 : 8);
        EventStatisticsItem.SpecialEventStatisticType specialStatisticType = eventStatisticsItem.getSpecialStatisticType();
        int i3 = specialStatisticType == null ? -1 : kei.a[specialStatisticType.ordinal()];
        Gender gender = this.f;
        if (i3 == 1) {
            String string = context.getString(R.string.football_expected_goals);
            string.getClass();
            Q = hkg.Q(context, R.string.football_expected_goals_player_info_text, gender, new Object[0]);
            d(string, Q);
            return;
        }
        if (i3 == 2) {
            String string2 = context.getString(R.string.football_expected_goals_on_target);
            string2.getClass();
            String string3 = context.getString(R.string.football_expected_goals_on_target_explained);
            string3.getClass();
            d(string2, string3);
            return;
        }
        if (i3 == 3) {
            String string4 = context.getString(R.string.football_goals_prevented);
            string4.getClass();
            Q2 = hkg.Q(context, R.string.goals_prevented_info_text, gender, new Object[0]);
            d(string4, Q2);
            return;
        }
        if (i3 != 4) {
            haa.C(textView);
            textView.setCompoundDrawablesRelative(null, null, null, null);
            ((ConstraintLayout) bv1Var.b).setEnabled(false);
        } else {
            String string5 = context.getString(R.string.football_key_passes);
            string5.getClass();
            String string6 = context.getString(R.string.football_key_passes_explained);
            string6.getClass();
            d(string5, string6);
        }
    }

    public final void d(String str, String str2) {
        Drawable drawable;
        TextView textView = this.g;
        haa.G(textView);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.e.b;
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setEnabled(true);
        constraintLayout.setOnClickListener(new qh(28, this, str, str2));
        Context context = this.b;
        int s = ao2.s(16, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_info);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.primary_default));
            drawable.setBounds(0, 0, s, s);
        }
        haa.K(textView, drawable, ua5.b, null, null);
        textView.setCompoundDrawablePadding(ao2.s(4, context));
    }
}
