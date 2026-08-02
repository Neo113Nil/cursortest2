package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyGoalType;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentKt;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyPlayType;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ee9 extends sd9 {
    public final js2 h;
    public final Function2 i;
    public final joa j;
    public final joa k;
    public final joa l;
    public final joa m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ee9(js2 js2Var, g16 g16Var, Event event, sl6 sl6Var) {
        super(r0, event, sl6Var);
        g16Var.getClass();
        event.getClass();
        sl6Var.getClass();
        LinearLayout linearLayout = (LinearLayout) js2Var.i;
        linearLayout.getClass();
        this.h = js2Var;
        this.i = g16Var;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: ce9
            public final /* synthetic */ ee9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Drawable mutate;
                Drawable mutate2;
                Drawable mutate3;
                int i2 = i;
                ee9 ee9Var = this.b;
                switch (i2) {
                    case 0:
                        return qa5.a.k(ee9Var.b);
                    case 1:
                        Context context = ee9Var.b;
                        context.getClass();
                        Drawable drawable = context.getDrawable(R.drawable.ic_ice_hockey_shorthand_goal);
                        if (drawable == null || (mutate = drawable.mutate()) == null) {
                            return null;
                        }
                        return mutate;
                    case 2:
                        Context context2 = ee9Var.b;
                        context2.getClass();
                        Drawable drawable2 = context2.getDrawable(R.drawable.ic_ice_hockey_powerplay_goal);
                        if (drawable2 == null || (mutate2 = drawable2.mutate()) == null) {
                            return null;
                        }
                        return mutate2;
                    default:
                        Context context3 = ee9Var.b;
                        context3.getClass();
                        Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                        if ((4 & 2) != 0) {
                            valueOf = null;
                        }
                        Drawable drawable3 = context3.getDrawable(R.drawable.ic_hockey_penalty_goal);
                        if (drawable3 == null || (mutate3 = drawable3.mutate()) == null) {
                            return null;
                        }
                        if (valueOf != null) {
                            mutate3.setTint(context3.getColor(valueOf.intValue()));
                        }
                        return mutate3;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.j = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.k = ypa.a(ysaVar, new Function0(this) { // from class: ce9
            public final /* synthetic */ ee9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Drawable mutate;
                Drawable mutate2;
                Drawable mutate3;
                int i22 = i2;
                ee9 ee9Var = this.b;
                switch (i22) {
                    case 0:
                        return qa5.a.k(ee9Var.b);
                    case 1:
                        Context context = ee9Var.b;
                        context.getClass();
                        Drawable drawable = context.getDrawable(R.drawable.ic_ice_hockey_shorthand_goal);
                        if (drawable == null || (mutate = drawable.mutate()) == null) {
                            return null;
                        }
                        return mutate;
                    case 2:
                        Context context2 = ee9Var.b;
                        context2.getClass();
                        Drawable drawable2 = context2.getDrawable(R.drawable.ic_ice_hockey_powerplay_goal);
                        if (drawable2 == null || (mutate2 = drawable2.mutate()) == null) {
                            return null;
                        }
                        return mutate2;
                    default:
                        Context context3 = ee9Var.b;
                        context3.getClass();
                        Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                        if ((4 & 2) != 0) {
                            valueOf = null;
                        }
                        Drawable drawable3 = context3.getDrawable(R.drawable.ic_hockey_penalty_goal);
                        if (drawable3 == null || (mutate3 = drawable3.mutate()) == null) {
                            return null;
                        }
                        if (valueOf != null) {
                            mutate3.setTint(context3.getColor(valueOf.intValue()));
                        }
                        return mutate3;
                }
            }
        });
        final int i3 = 2;
        this.l = ypa.a(ysaVar, new Function0(this) { // from class: ce9
            public final /* synthetic */ ee9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Drawable mutate;
                Drawable mutate2;
                Drawable mutate3;
                int i22 = i3;
                ee9 ee9Var = this.b;
                switch (i22) {
                    case 0:
                        return qa5.a.k(ee9Var.b);
                    case 1:
                        Context context = ee9Var.b;
                        context.getClass();
                        Drawable drawable = context.getDrawable(R.drawable.ic_ice_hockey_shorthand_goal);
                        if (drawable == null || (mutate = drawable.mutate()) == null) {
                            return null;
                        }
                        return mutate;
                    case 2:
                        Context context2 = ee9Var.b;
                        context2.getClass();
                        Drawable drawable2 = context2.getDrawable(R.drawable.ic_ice_hockey_powerplay_goal);
                        if (drawable2 == null || (mutate2 = drawable2.mutate()) == null) {
                            return null;
                        }
                        return mutate2;
                    default:
                        Context context3 = ee9Var.b;
                        context3.getClass();
                        Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                        if ((4 & 2) != 0) {
                            valueOf = null;
                        }
                        Drawable drawable3 = context3.getDrawable(R.drawable.ic_hockey_penalty_goal);
                        if (drawable3 == null || (mutate3 = drawable3.mutate()) == null) {
                            return null;
                        }
                        if (valueOf != null) {
                            mutate3.setTint(context3.getColor(valueOf.intValue()));
                        }
                        return mutate3;
                }
            }
        });
        final int i4 = 3;
        this.m = ypa.a(ysaVar, new Function0(this) { // from class: ce9
            public final /* synthetic */ ee9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Drawable mutate;
                Drawable mutate2;
                Drawable mutate3;
                int i22 = i4;
                ee9 ee9Var = this.b;
                switch (i22) {
                    case 0:
                        return qa5.a.k(ee9Var.b);
                    case 1:
                        Context context = ee9Var.b;
                        context.getClass();
                        Drawable drawable = context.getDrawable(R.drawable.ic_ice_hockey_shorthand_goal);
                        if (drawable == null || (mutate = drawable.mutate()) == null) {
                            return null;
                        }
                        return mutate;
                    case 2:
                        Context context2 = ee9Var.b;
                        context2.getClass();
                        Drawable drawable2 = context2.getDrawable(R.drawable.ic_ice_hockey_powerplay_goal);
                        if (drawable2 == null || (mutate2 = drawable2.mutate()) == null) {
                            return null;
                        }
                        return mutate2;
                    default:
                        Context context3 = ee9Var.b;
                        context3.getClass();
                        Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                        if ((4 & 2) != 0) {
                            valueOf = null;
                        }
                        Drawable drawable3 = context3.getDrawable(R.drawable.ic_hockey_penalty_goal);
                        if (drawable3 == null || (mutate3 = drawable3.mutate()) == null) {
                            return null;
                        }
                        if (valueOf != null) {
                            mutate3.setTint(context3.getColor(valueOf.intValue()));
                        }
                        return mutate3;
                }
            }
        });
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Drawable drawable;
        HockeyIncident hockeyIncident = (HockeyIncident) obj;
        hockeyIncident.getClass();
        super.g(hockeyIncident);
        js2 js2Var = this.h;
        ImageView imageView = (ImageView) js2Var.e;
        ImageView imageView2 = (ImageView) js2Var.c;
        ImageView imageView3 = (ImageView) js2Var.b;
        TextView textView = js2Var.d;
        MaterialCardView materialCardView = (MaterialCardView) js2Var.l;
        HockeyGoalType goalType = hockeyIncident.getGoalType();
        int i3 = goalType == null ? -1 : de9.a[goalType.ordinal()];
        if (i3 == 1 || i3 == 2) {
            drawable = (Drawable) this.m.getValue();
        } else {
            HockeyPlayType playType = hockeyIncident.getPlayType();
            int i4 = playType == null ? -1 : de9.b[playType.ordinal()];
            drawable = i4 != 1 ? i4 != 2 ? (Drawable) this.j.getValue() : (Drawable) this.l.getValue() : (Drawable) this.k.getValue();
        }
        imageView.setImageDrawable(drawable);
        ((TextView) js2Var.n).setText(Intrinsics.c(hockeyIncident.getPeriodName(), HockeyIncidentKt.PERIOD_SHOOTOUT) ? "-" : e(hockeyIncident));
        TextView textView2 = (TextView) js2Var.o;
        HockeyGoalType goalType2 = hockeyIncident.getGoalType();
        int i5 = goalType2 != null ? de9.a[goalType2.ordinal()] : -1;
        Context context = this.b;
        textView2.setText(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? context.getString(R.string.hockey_pbp_goal) : context.getString(R.string.hockey_pbp_empty_net_goal) : context.getString(R.string.hockey_pbp_awarded_goal) : context.getString(R.string.hockey_pbp_penalty_goal) : context.getString(R.string.hockey_pbp_shootout_goal));
        materialCardView.setEnabled(hockeyIncident.getPlayer() != null);
        Player player = hockeyIncident.getPlayer();
        if (player != null) {
            materialCardView.setOnClickListener(new qh(20, this, js2Var, hockeyIncident));
            ((TextView) js2Var.m).setText(sd9.d(player, false));
            ImageView imageView4 = (ImageView) js2Var.g;
            Team team = this.e;
            as9.o(imageView4, team != null ? team.getId() : 0);
            as9.l((ImageView) js2Var.f, player.getId(), null);
            TextView textView3 = (TextView) js2Var.k;
            Team team2 = this.e;
            String nameCode = team2 != null ? team2.getNameCode() : null;
            textView3.setText(nameCode + " " + hockeyIncident.getScoreDisplay());
        }
        textView.setVisibility(hockeyIncident.getAssist1() != null ? 0 : 8);
        StringBuilder sb = new StringBuilder(hockeyIncident.getAssist2() != null ? "Assists: " : "Assist: ");
        Player assist1 = hockeyIncident.getAssist1();
        if (assist1 != null) {
            sb.append(sd9.d(assist1, true));
        }
        Player assist2 = hockeyIncident.getAssist2();
        if (assist2 != null) {
            sb.append(", ");
            sb.append(sd9.d(assist2, true));
        }
        textView.setText(sb.toString());
        imageView3.setVisibility(hockeyIncident.getAssist1() != null ? 0 : 8);
        Player assist12 = hockeyIncident.getAssist1();
        if (assist12 != null) {
            as9.l(imageView3, assist12.getId(), null);
        }
        imageView2.setVisibility(hockeyIncident.getAssist2() == null ? 8 : 0);
        Player assist22 = hockeyIncident.getAssist2();
        if (assist22 != null) {
            as9.l(imageView2, assist22.getId(), null);
        }
    }

    @Override // defpackage.sd9
    public final MaterialCardView f() {
        return (MaterialCardView) this.h.l;
    }
}
