package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uih extends p8 {
    public final h04 c;
    public final boolean d;
    public final boolean e;
    public final Gender f;

    public /* synthetic */ uih(h04 h04Var, Gender gender, int i) {
        this(h04Var, (i & 2) == 0, (i & 4) == 0, gender);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String Q;
        String Q2;
        jei jeiVar = (jei) obj;
        jeiVar.getClass();
        h04 h04Var = this.c;
        TextView textView = h04Var.d;
        ConstraintLayout constraintLayout = h04Var.b;
        textView.setText(jeiVar.a);
        TextView textView2 = h04Var.c;
        textView2.setVisibility(0);
        textView2.setText(jeiVar.b);
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType = jeiVar.c;
        int i3 = specialEventStatisticType == null ? -1 : tih.a[specialEventStatisticType.ordinal()];
        Gender gender = this.f;
        Context context = this.b;
        if (i3 == 1) {
            String string = context.getString(R.string.football_expected_goals);
            string.getClass();
            Q = hkg.Q(context, R.string.football_expected_goals_player_info_text, gender, new Object[0]);
            d(string, Q);
        } else if (i3 == 2) {
            String string2 = context.getString(R.string.football_expected_goals_on_target);
            string2.getClass();
            String string3 = context.getString(R.string.football_expected_goals_on_target_explained);
            string3.getClass();
            d(string2, string3);
        } else if (i3 == 3) {
            String string4 = context.getString(R.string.football_goals_prevented);
            string4.getClass();
            Q2 = hkg.Q(context, R.string.goals_prevented_info_text, gender, new Object[0]);
            d(string4, Q2);
        } else if (i3 != 4) {
            haa.C(textView);
            textView.setCompoundDrawablesRelative(null, null, null, null);
            constraintLayout.setEnabled(false);
        } else {
            String string5 = context.getString(R.string.football_key_passes);
            string5.getClass();
            String string6 = context.getString(R.string.football_key_passes_explained);
            string6.getClass();
            d(string5, string6);
        }
        boolean z = this.d;
        if (z) {
            constraintLayout.getClass();
            aba.I(constraintLayout);
        }
        if (this.e) {
            constraintLayout.setMinimumHeight(ao2.s(jeiVar.d ? 40 : 32, context));
            sea.v(constraintLayout, false, jeiVar.d, 0, 0, context.getColor(z ? R.color.surface_P : R.color.surface_1), null, 92);
            constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), jeiVar.d ? ao2.s(16, context) : 0);
        }
    }

    public final void d(String str, String str2) {
        Drawable drawable;
        h04 h04Var = this.c;
        TextView textView = h04Var.d;
        TextView textView2 = h04Var.d;
        haa.G(textView);
        ConstraintLayout constraintLayout = h04Var.b;
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setEnabled(true);
        constraintLayout.setOnClickListener(new qh(26, this, str, str2));
        Context context = this.b;
        int s = ao2.s(16, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_info);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.primary_default));
            drawable.setBounds(0, 0, s, s);
        }
        haa.K(textView2, drawable, ua5.b, null, null);
        textView2.setCompoundDrawablePadding(ao2.s(4, context));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uih(h04 h04Var, boolean z, boolean z2, Gender gender) {
        super(r0);
        ConstraintLayout constraintLayout = h04Var.b;
        constraintLayout.getClass();
        this.c = h04Var;
        this.d = z;
        this.e = z2;
        this.f = gender;
    }
}
