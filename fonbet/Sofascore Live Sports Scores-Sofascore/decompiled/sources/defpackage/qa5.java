package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qa5 {
    public static final qa5 a = new qa5();

    public static Drawable f(qa5 qa5Var, Context context, int i, Integer num, int i2) {
        Drawable mutate;
        if ((i2 & 2) != 0) {
            num = null;
        }
        qa5Var.getClass();
        context.getClass();
        Drawable drawable = context.getDrawable(i);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        if (num != null) {
            mutate.setTint(context.getColor(num.intValue()));
        }
        return mutate;
    }

    public static Drawable n(qa5 qa5Var, Context context) {
        qa5Var.getClass();
        return f(qa5Var, context, R.drawable.ic_var, Integer.valueOf(R.color.primary_default), 4);
    }

    public final Drawable a(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_extra_point_16, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable b(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_field_goal_16, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable c(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_touchdown_16, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable d(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_two_point_conversion_16, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable e(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_autogoal_16, Integer.valueOf(R.color.error), 4);
    }

    public final Drawable g(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_football_assist_16, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable h(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_goal_incidents, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable i(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_goal_incidents_with_padding, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable j(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_penalty_16, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable k(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_pak, Integer.valueOf(R.color.n_lv_1), 4);
    }

    public final Drawable l(Context context) {
        context.getClass();
        return f(this, context, R.drawable.ic_penalty_missed_16, Integer.valueOf(R.color.error), 4);
    }

    public final Drawable m(Context context) {
        context.getClass();
        return f(this, context, R.drawable.team_logo_placeholder, Integer.valueOf(R.color.neutral_default), 4);
    }
}
