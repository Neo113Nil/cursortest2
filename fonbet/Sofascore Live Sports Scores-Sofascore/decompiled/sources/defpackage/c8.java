package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.ESportCharacter;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.results.R;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class c8 extends p8 {
    public final Object c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c8(bv1 bv1Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.c = bv1Var;
    }

    public void d(bu1 bu1Var, int i, Event event) {
        int i2;
        String i3;
        String w;
        ImageView imageView = (ImageView) bu1Var.j;
        ImageView imageView2 = (ImageView) bu1Var.d;
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        Score homeScore$default = Event.getHomeScore$default(event, null, 1, null);
        Score awayScore$default = Event.getAwayScore$default(event, null, 1, null);
        Sport sport = homeTeam$default.getSport();
        if (sport == null) {
            sport = awayTeam$default.getSport();
        }
        ImageView imageView3 = (ImageView) bu1Var.k;
        TextView textView = (TextView) bu1Var.h;
        imageView2.setVisibility(event.getIsRecent() ? 0 : 8);
        imageView2.setOnClickListener(new u5(this, i, event, 2));
        TextView textView2 = (TextView) bu1Var.g;
        Context context = this.b;
        textView2.setText(tba.A(context, homeTeam$default));
        ((TextView) bu1Var.i).setText(qea.K(tba.A(context, awayTeam$default), event.shouldReverseTeams()));
        ((TextView) bu1Var.b).setVisibility(!event.shouldReverseTeams() ? 0 : 8);
        if (homeScore$default.getDisplay() == null || awayScore$default.getDisplay() == null) {
            i2 = 8;
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            Locale d = dla.d();
            String string = context.getString(R.string.match_result_template);
            string.getClass();
            me4.s(new Object[]{homeScore$default.getDisplay(), awayScore$default.getDisplay()}, 2, d, string, textView);
            if (me4.t(StatusKt.STATUS_IN_PROGRESS, event)) {
                haa.B(textView);
            } else {
                haa.C(textView);
            }
            i2 = 8;
        }
        imageView3.setVisibility(sport != null ? 0 : i2);
        if (sport != null) {
            Set set = wyh.a;
            imageView3.setImageDrawable(context.getDrawable(wyh.a(sport.getSlug())));
        }
        TextView textView3 = (TextView) bu1Var.e;
        if (ug5.w(event.getStartTimestamp())) {
            i3 = context.getString(R.string.yesterday);
        } else if (ug5.u(event.getStartTimestamp())) {
            i3 = context.getString(R.string.today);
        } else if (ug5.v(event.getStartTimestamp())) {
            i3 = context.getString(R.string.tomorrow);
        } else {
            long startTimestamp = event.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            i3 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
        }
        textView3.setText(i3);
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        if ((uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null) != null) {
            UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
            as9.q(imageView, uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null, event.getTournament().getId(), null);
        } else {
            aik.Q(imageView).a();
            as9.c(imageView, event.getTournament().getCategory().getAlpha2(), false, null, 6);
        }
        TextView textView4 = (TextView) bu1Var.f;
        UniqueTournament uniqueTournament3 = event.getTournament().getUniqueTournament();
        if (uniqueTournament3 == null || (w = tba.x(uniqueTournament3)) == null) {
            w = tba.w(event.getTournament());
        }
        textView4.setText(w);
    }

    public void e(ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData) {
        tq5 tq5Var = (tq5) this.c;
        ImageView imageView = tq5Var.k;
        ImageView imageView2 = tq5Var.f;
        tq5Var.g.setText(tba.t(eSportsGamePlayerStatisticsRowData.getFirstTeamData().getPlayer()));
        tq5Var.l.setText(tba.t(eSportsGamePlayerStatisticsRowData.getSecondTeamData().getPlayer()));
        View view = tq5Var.h;
        Integer firstTeamColor = eSportsGamePlayerStatisticsRowData.getFirstTeamColor();
        view.setBackgroundColor(firstTeamColor != null ? firstTeamColor.intValue() : 0);
        View view2 = tq5Var.m;
        Integer secondTeamColor = eSportsGamePlayerStatisticsRowData.getSecondTeamColor();
        view2.setBackgroundColor(secondTeamColor != null ? secondTeamColor.intValue() : 0);
        View view3 = tq5Var.b;
        Integer num = eSportsGamePlayerStatisticsRowData.getHideDivider() ? 4 : null;
        view3.setVisibility(num != null ? num.intValue() : 0);
        ESportCharacter character = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getCharacter();
        String y = character != null ? pco.y(character.getId()) : pco.M(eSportsGamePlayerStatisticsRowData.getFirstTeamData().getPlayer().getId());
        Boolean alive = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getAlive();
        Boolean bool = Boolean.FALSE;
        imageView2.setAlpha(Intrinsics.c(alive, bool) ? 0.5f : 1.0f);
        as9.e(imageView2, y, Intrinsics.c(eSportsGamePlayerStatisticsRowData.getFirstTeamData().getAlive(), bool));
        ESportCharacter character2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getCharacter();
        String y2 = character2 != null ? pco.y(character2.getId()) : pco.M(eSportsGamePlayerStatisticsRowData.getSecondTeamData().getPlayer().getId());
        imageView.setAlpha(Intrinsics.c(eSportsGamePlayerStatisticsRowData.getSecondTeamData().getAlive(), bool) ? 0.5f : 1.0f);
        as9.e(imageView, y2, Intrinsics.c(eSportsGamePlayerStatisticsRowData.getSecondTeamData().getAlive(), bool));
        TextView textView = tq5Var.e;
        Integer level = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getLevel();
        textView.setText(level != null ? String.valueOf(level.intValue()) : null);
        TextView textView2 = tq5Var.j;
        Integer level2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getLevel();
        textView2.setText(level2 != null ? String.valueOf(level2.intValue()) : null);
    }

    public void f(Stage stage) {
        bv1 bv1Var = (bv1) this.c;
        ImageView imageView = (ImageView) bv1Var.f;
        boolean z = as9.a;
        Context context = imageView.getContext();
        context.getClass();
        as9.n(imageView, stage, hkg.b0(context));
        ((TextView) bv1Var.g).setText(stage.getDescription());
        ((TextView) bv1Var.d).setText(rik.r(stage.getEndDateTimestamp(), stage.getStartDateTimestamp()));
        TextView textView = (TextView) bv1Var.c;
        StageSeason stageSeason = stage.getStageSeason();
        textView.setText(stageSeason != null ? stageSeason.getDescription() : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(View view, Function2 function2) {
        super(view);
        view.getClass();
        function2.getClass();
        this.c = function2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c8(tq5 tq5Var) {
        super(r0);
        ConstraintLayout constraintLayout = tq5Var.a;
        constraintLayout.getClass();
        this.c = tq5Var;
    }
}
