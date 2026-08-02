package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z06 extends o8 {
    public final gh5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z06(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.arrow_icon;
        if (((ImageView) nq8.B(R.id.arrow_icon, root)) != null) {
            i = R.id.tournament_logo;
            ImageView imageView = (ImageView) nq8.B(R.id.tournament_logo, root);
            if (imageView != null) {
                i = R.id.tournament_name;
                TextView textView = (TextView) nq8.B(R.id.tournament_name, root);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) root;
                    this.d = new gh5(linearLayout, imageView, textView, 4);
                    o8.d(this, 0, 7);
                    linearLayout.getClass();
                    aba.y(linearLayout, 0, 3);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(final Event event) {
        gh5 gh5Var = this.d;
        TextView textView = gh5Var.d;
        Context context = getContext();
        context.getClass();
        textView.setText(ok3.t(context, event));
        TextView textView2 = gh5Var.d;
        textView2.setMaxLines(2);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        ImageView imageView = gh5Var.c;
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        final int i = 0;
        as9.q(imageView, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), event.getTournament().getId(), null);
        final LinearLayout linearLayout = gh5Var.b;
        final int i2 = 1;
        linearLayout.setClickable(true);
        if (Intrinsics.c(ok3.s(event), Sports.MMA)) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: y06
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    Event event2 = event;
                    LinearLayout linearLayout2 = linearLayout;
                    switch (i3) {
                        case 0:
                            int i4 = MmaFightNightActivity.R;
                            Context context2 = linearLayout2.getContext();
                            context2.getClass();
                            x2a.S(event2.getTournament().getId(), context2);
                            break;
                        default:
                            a99 a99Var = LeagueActivity.h0;
                            Context context3 = linearLayout2.getContext();
                            context3.getClass();
                            UniqueTournament uniqueTournament2 = event2.getTournament().getUniqueTournament();
                            Integer valueOf = Integer.valueOf(uniqueTournament2 != null ? uniqueTournament2.getId() : 0);
                            Integer valueOf2 = Integer.valueOf(event2.getTournament().getId());
                            Season season = event2.getSeason();
                            a99.A(a99Var, context3, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, null, null, null, 4080);
                            break;
                    }
                }
            });
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: y06
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    Event event2 = event;
                    LinearLayout linearLayout2 = linearLayout;
                    switch (i3) {
                        case 0:
                            int i4 = MmaFightNightActivity.R;
                            Context context2 = linearLayout2.getContext();
                            context2.getClass();
                            x2a.S(event2.getTournament().getId(), context2);
                            break;
                        default:
                            a99 a99Var = LeagueActivity.h0;
                            Context context3 = linearLayout2.getContext();
                            context3.getClass();
                            UniqueTournament uniqueTournament2 = event2.getTournament().getUniqueTournament();
                            Integer valueOf = Integer.valueOf(uniqueTournament2 != null ? uniqueTournament2.getId() : 0);
                            Integer valueOf2 = Integer.valueOf(event2.getTournament().getId());
                            Season season = event2.getSeason();
                            a99.A(a99Var, context3, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, null, null, null, 4080);
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.league_details_label;
    }
}
