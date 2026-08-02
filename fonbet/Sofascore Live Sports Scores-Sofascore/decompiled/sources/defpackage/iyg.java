package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iyg {
    public static final joa a = ypa.a(ysa.c, new dtg(9));

    public static void a(z82 z82Var, q9k q9kVar, String str, String str2, int i, int i2, int i3, Boolean bool) {
        z82Var.getClass();
        TextView textView = (TextView) z82Var.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        TextView textView2 = (TextView) z82Var.e;
        Context context = constraintLayout.getContext();
        context.getClass();
        textView2.setText(q9kVar.b(context));
        textView2.setTextColor(constraintLayout.getContext().getColor(R.color.n_lv_1));
        ua5 ua5Var = ua5.b;
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        haa.L(textView2, null, ua5Var, Integer.valueOf(ao2.s(16, context2)));
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            constraintLayout.setBackgroundResource(R.drawable.bg_bottom_divider_surface_1);
        } else if (Intrinsics.c(bool, Boolean.FALSE)) {
            constraintLayout.setBackgroundResource(R.drawable.bg_bottom_divider_surface_1_8dp);
        } else {
            if (bool != null) {
                zzl.b();
                return;
            }
            constraintLayout.setBackgroundColor(constraintLayout.getContext().getColor(R.color.surface_1));
        }
        TextView textView3 = (TextView) z82Var.g;
        Regex regex = yid.a;
        if (str == null) {
            str = "-";
        }
        textView.setText(str);
        if (str2 == null) {
            str2 = "-";
        }
        textView3.setText(str2);
        Integer valueOf = Integer.valueOf(i2);
        if (i <= 0) {
            valueOf = null;
        }
        b(textView, valueOf);
        b(textView3, i < 0 ? Integer.valueOf(i3) : null);
        constraintLayout.getClass();
        jtd.a(constraintLayout, new a8p(21, constraintLayout, z82Var));
    }

    public static void b(TextView textView, Integer num) {
        Drawable mutate;
        Drawable drawable = null;
        if (num == null) {
            textView.setBackground(null);
            return;
        }
        Drawable background = textView.getBackground();
        if (background == null) {
            Context context = textView.getContext();
            context.getClass();
            Drawable drawable2 = context.getDrawable(R.drawable.rounded_surface_level_1);
            if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                mutate.setAlpha(rz8.E(0.3f));
                drawable = mutate;
            }
            background = drawable;
        }
        if (background != null) {
            background.setTint(num.intValue());
        }
        textView.setBackground(background);
    }

    public static void c(TextView textView, Team team, ua5 ua5Var) {
        int id = team.getId();
        Context context = textView.getContext();
        context.getClass();
        String p = tba.p(context, team);
        if (qea.y(team) && team.getSport() != null) {
            Set set = wyh.a;
            if (!wyh.e(team.getSportSlug())) {
                p = wv8.i(p, " ", context.getString(R.string.female_team));
            }
        }
        if (p == null) {
            p = "-";
        }
        if (Intrinsics.c(textView.getTag(), Integer.valueOf(id))) {
            return;
        }
        textView.setText(p);
        Context context2 = textView.getContext();
        context2.getClass();
        int s = ao2.s(24, context2);
        String R = pco.R(id);
        Integer valueOf = Integer.valueOf(s);
        Context context3 = textView.getContext();
        context3.getClass();
        apf a2 = ajh.a(context3);
        Context context4 = textView.getContext();
        context4.getClass();
        ht9 ht9Var = new ht9(context4);
        ht9Var.c = R;
        ht9Var.d = new pfj(textView, ua5Var, valueOf);
        ht9Var.n = new yx7(rfo.u((hyg) a.getValue()), 28);
        a2.a(ht9Var.a());
        if (id != 241802) {
            textView.setEnabled(true);
            textView.setOnClickListener(new l8(textView, id, 10));
        } else {
            textView.setEnabled(false);
            textView.setOnClickListener(null);
        }
        textView.setTag(Integer.valueOf(id));
    }
}
