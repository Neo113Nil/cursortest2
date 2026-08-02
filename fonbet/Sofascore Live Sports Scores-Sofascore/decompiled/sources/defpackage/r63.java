package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r63 extends o8 {
    public final s63 d;
    public Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r63(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.compare_button;
        TextView textView = (TextView) nq8.B(R.id.compare_button, root);
        if (textView != null) {
            i = R.id.team_icon_1;
            ImageView imageView = (ImageView) nq8.B(R.id.team_icon_1, root);
            if (imageView != null) {
                i = R.id.team_icon_2;
                ImageView imageView2 = (ImageView) nq8.B(R.id.team_icon_2, root);
                if (imageView2 != null) {
                    this.d = new s63((ConstraintLayout) root, textView, imageView, imageView2);
                    setVisibility(8);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.compare_teams_button;
    }

    public final void setEventData(@NotNull final Event event) {
        event.getClass();
        Integer num = this.e;
        int id = event.getId();
        if (num != null && num.intValue() == id) {
            return;
        }
        this.e = Integer.valueOf(event.getId());
        final int id2 = Event.getHomeTeam$default(event, null, 1, null).getId();
        final int id3 = Event.getAwayTeam$default(event, null, 1, null).getId();
        s63 s63Var = this.d;
        ImageView imageView = s63Var.c;
        as9.o(imageView, id2);
        imageView.setOnClickListener(new l8(this, id2, 1));
        ImageView imageView2 = s63Var.e;
        as9.o(imageView2, id3);
        imageView2.setOnClickListener(new l8(this, id3, 1));
        s63Var.d.setOnClickListener(new View.OnClickListener() { // from class: q63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r63 r63Var = r63.this;
                Context context = r63Var.getContext();
                context.getClass();
                nv.z0(context, kv.CLICK, "compare_teams", "event_details");
                int i = SeasonComparisonActivity.L;
                Context context2 = r63Var.getContext();
                context2.getClass();
                Integer valueOf = Integer.valueOf(id3);
                Event event2 = event;
                UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                Integer valueOf2 = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                Season season = event2.getTournament().getSeason();
                pxg.d(context2, id2, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, event2.getSeasonStatisticsType(), ok3.s(event2), ok3.s(event2));
            }
        });
        setVisibility(0);
    }
}
