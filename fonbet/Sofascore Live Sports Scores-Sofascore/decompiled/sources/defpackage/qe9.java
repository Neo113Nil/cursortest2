package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentKt;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentType;
import com.sofascore.results.R;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qe9 extends sd9 {
    public final sc h;
    public final Function2 i;
    public final joa j;
    public final joa k;
    public final joa l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qe9(sc scVar, g16 g16Var, Event event, sl6 sl6Var) {
        super(r0, event, sl6Var);
        g16Var.getClass();
        event.getClass();
        sl6Var.getClass();
        LinearLayout linearLayout = (LinearLayout) scVar.b;
        linearLayout.getClass();
        this.h = scVar;
        this.i = g16Var;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: oe9
            public final /* synthetic */ qe9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                qe9 qe9Var = this.b;
                switch (i2) {
                    case 0:
                        return qe9Var.b.getDrawable(R.drawable.ic_hockey_goalie_in);
                    case 1:
                        return qe9Var.b.getDrawable(R.drawable.ic_hockey_goalie_out);
                    default:
                        Context context = qe9Var.b;
                        Drawable drawable = context.getDrawable(R.drawable.ic_penalty_missed_16);
                        if (drawable == null) {
                            return null;
                        }
                        drawable.setTint(context.getColor(R.color.error));
                        return drawable;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.j = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.k = ypa.a(ysaVar, new Function0(this) { // from class: oe9
            public final /* synthetic */ qe9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                qe9 qe9Var = this.b;
                switch (i22) {
                    case 0:
                        return qe9Var.b.getDrawable(R.drawable.ic_hockey_goalie_in);
                    case 1:
                        return qe9Var.b.getDrawable(R.drawable.ic_hockey_goalie_out);
                    default:
                        Context context = qe9Var.b;
                        Drawable drawable = context.getDrawable(R.drawable.ic_penalty_missed_16);
                        if (drawable == null) {
                            return null;
                        }
                        drawable.setTint(context.getColor(R.color.error));
                        return drawable;
                }
            }
        });
        final int i3 = 2;
        this.l = ypa.a(ysaVar, new Function0(this) { // from class: oe9
            public final /* synthetic */ qe9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                qe9 qe9Var = this.b;
                switch (i22) {
                    case 0:
                        return qe9Var.b.getDrawable(R.drawable.ic_hockey_goalie_in);
                    case 1:
                        return qe9Var.b.getDrawable(R.drawable.ic_hockey_goalie_out);
                    default:
                        Context context = qe9Var.b;
                        Drawable drawable = context.getDrawable(R.drawable.ic_penalty_missed_16);
                        if (drawable == null) {
                            return null;
                        }
                        drawable.setTint(context.getColor(R.color.error));
                        return drawable;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        boolean z;
        int i3;
        final HockeyIncident hockeyIncident = (HockeyIncident) obj;
        hockeyIncident.getClass();
        super.g(hockeyIncident);
        sc scVar = this.h;
        ImageView imageView = (ImageView) scVar.o;
        ImageView imageView2 = scVar.e;
        ImageView imageView3 = (ImageView) scVar.p;
        TextView textView = scVar.d;
        Group group = (Group) scVar.m;
        TextView textView2 = scVar.i;
        ImageView imageView4 = scVar.c;
        MaterialCardView materialCardView = (MaterialCardView) scVar.l;
        TextView textView3 = scVar.j;
        Team team = this.e;
        as9.o(imageView, team != null ? team.getId() : 0);
        HockeyIncidentType type = hockeyIncident.getType();
        int[] iArr = pe9.a;
        int i4 = iArr[type.ordinal()];
        Context context = this.b;
        if (i4 == 1 || i4 == 2) {
            HockeyIncidentType type2 = hockeyIncident.getType();
            HockeyIncidentType hockeyIncidentType = HockeyIncidentType.GOALIE_IN;
            int i5 = type2 == hockeyIncidentType ? R.string.hockey_pbp_goalkeeper_back : R.string.hockey_pbp_goalkeeper_out;
            Drawable drawable = hockeyIncident.getType() == hockeyIncidentType ? (Drawable) this.j.getValue() : (Drawable) this.k.getValue();
            textView3.setText(context.getString(i5));
            imageView4.setImageDrawable(drawable);
            textView2.setText(e(hockeyIncident));
            group.setVisibility(8);
            materialCardView.setEnabled(hockeyIncident.getGoalkeeper() != null);
            if (hockeyIncident.getGoalkeeper() != null) {
                z = false;
                final boolean z2 = false ? 1 : 0;
                materialCardView.setOnClickListener(new View.OnClickListener(this) { // from class: ne9
                    public final /* synthetic */ qe9 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = z2;
                        HockeyIncident hockeyIncident2 = hockeyIncident;
                        qe9 qe9Var = this.b;
                        switch (i6) {
                            case 0:
                                qe9Var.i.invoke(qe9Var.h.j, a.c(new ge9(hockeyIncident2.getGoalkeeper(), hockeyIncident2.getIsHome())));
                                break;
                            default:
                                qe9Var.i.invoke(qe9Var.h.j, b.j(new ge9(hockeyIncident2.getPlayer(), hockeyIncident2.getIsHome()), new ge9(hockeyIncident2.getGoalkeeper(), hockeyIncident2.getIsHome() != null ? Boolean.valueOf(!r0.booleanValue()) : null)));
                                break;
                        }
                    }
                });
            } else {
                z = false;
            }
            Player goalkeeper = hockeyIncident.getGoalkeeper();
            if (goalkeeper != null) {
                textView.setText(sd9.d(goalkeeper, z));
                Team team2 = this.e;
                as9.o(imageView3, team2 != null ? team2.getId() : z);
                as9.l(imageView2, goalkeeper.getId(), null);
                return;
            }
            return;
        }
        if (i4 == 3 || i4 == 4) {
            i3 = 5;
        } else {
            i3 = 5;
            if (i4 != 5) {
                return;
            }
        }
        boolean c = Intrinsics.c(hockeyIncident.getPeriodName(), HockeyIncidentKt.PERIOD_SHOOTOUT);
        int i6 = iArr[hockeyIncident.getType().ordinal()];
        textView3.setText(context.getString((i6 == i3 && c) ? R.string.hockey_pbp_shootout_saved : i6 == i3 ? R.string.hockey_pbp_penalty_saved : (i6 == 4 && c) ? R.string.hockey_pbp_shootout_miss : i6 == 4 ? R.string.hockey_pbp_penalty_miss : i6 == 3 ? R.string.hockey_pbp_shootout_attempt_failed : R.string.ice_hockey_penalty_shot));
        imageView4.setImageDrawable((Drawable) this.l.getValue());
        textView2.setText(!c ? e(hockeyIncident) : "-");
        group.setVisibility(hockeyIncident.getGoalkeeper() != null ? 0 : 8);
        materialCardView.setEnabled(hockeyIncident.getPlayer() != null);
        if (hockeyIncident.getPlayer() != null) {
            final int i7 = 1;
            materialCardView.setOnClickListener(new View.OnClickListener(this) { // from class: ne9
                public final /* synthetic */ qe9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i62 = i7;
                    HockeyIncident hockeyIncident2 = hockeyIncident;
                    qe9 qe9Var = this.b;
                    switch (i62) {
                        case 0:
                            qe9Var.i.invoke(qe9Var.h.j, a.c(new ge9(hockeyIncident2.getGoalkeeper(), hockeyIncident2.getIsHome())));
                            break;
                        default:
                            qe9Var.i.invoke(qe9Var.h.j, b.j(new ge9(hockeyIncident2.getPlayer(), hockeyIncident2.getIsHome()), new ge9(hockeyIncident2.getGoalkeeper(), hockeyIncident2.getIsHome() != null ? Boolean.valueOf(!r0.booleanValue()) : null)));
                            break;
                    }
                }
            });
        }
        Player player = hockeyIncident.getPlayer();
        if (player != null) {
            textView.setText(sd9.d(player, false));
            Team team3 = this.e;
            as9.o(imageView3, team3 != null ? team3.getId() : 0);
            as9.l(imageView2, player.getId(), null);
        }
        Player goalkeeper2 = hockeyIncident.getGoalkeeper();
        if (goalkeeper2 != null) {
            scVar.h.setText("Saved by: ".concat(sd9.d(goalkeeper2, true)));
            ImageView imageView5 = (ImageView) scVar.g;
            Team team4 = this.f;
            as9.o(imageView5, team4 != null ? team4.getId() : 0);
            as9.l((ImageView) scVar.f, goalkeeper2.getId(), null);
        }
    }

    @Override // defpackage.sd9
    public final MaterialCardView f() {
        return (MaterialCardView) this.h.l;
    }
}
