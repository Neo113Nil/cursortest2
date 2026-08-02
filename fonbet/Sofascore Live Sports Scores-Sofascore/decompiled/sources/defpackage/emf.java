package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.ranking.RankingsActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class emf extends o8 {
    public final u79 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emf(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.button_first_team;
        View B = nq8.B(R.id.button_first_team, root);
        if (B != null) {
            i = R.id.button_second_team;
            View B2 = nq8.B(R.id.button_second_team, root);
            if (B2 != null) {
                i = R.id.guideline;
                if (((Guideline) nq8.B(R.id.guideline, root)) != null) {
                    i = R.id.image_first_team;
                    ImageView imageView = (ImageView) nq8.B(R.id.image_first_team, root);
                    if (imageView != null) {
                        i = R.id.image_second_team;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.image_second_team, root);
                        if (imageView2 != null) {
                            i = R.id.name_first_team;
                            TextView textView = (TextView) nq8.B(R.id.name_first_team, root);
                            if (textView != null) {
                                i = R.id.name_second_team;
                                TextView textView2 = (TextView) nq8.B(R.id.name_second_team, root);
                                if (textView2 != null) {
                                    i = R.id.ranking_first_team;
                                    TextView textView3 = (TextView) nq8.B(R.id.ranking_first_team, root);
                                    if (textView3 != null) {
                                        i = R.id.ranking_second_team;
                                        TextView textView4 = (TextView) nq8.B(R.id.ranking_second_team, root);
                                        if (textView4 != null) {
                                            i = R.id.title;
                                            TextView textView5 = (TextView) nq8.B(R.id.title, root);
                                            if (textView5 != null) {
                                                this.d = new u79((ConstraintLayout) root, B, B2, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.list_item_ranking;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        if (r6 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(final Team team, Integer num, ImageView imageView, TextView textView, TextView textView2, View view) {
        String string;
        Context context = getContext();
        context.getClass();
        textView.setText(tba.A(context, team));
        as9.o(imageView, team.getId());
        String sportSlug = team.getSportSlug();
        if (sportSlug != null) {
            int hashCode = sportSlug.hashCode();
            final int i = 0;
            if (hashCode == 108225) {
                if (sportSlug.equals(Sports.MMA)) {
                    haa.C(textView2);
                    if (num != null) {
                        string = num.intValue() == 0 ? getContext().getString(R.string.champion) : getContext().getString(R.string.hashtag_template, Integer.valueOf(num.intValue()));
                    }
                    string = getContext().getString(R.string.unranked);
                    string.getClass();
                    textView2.setText(string);
                    as9.d(imageView, team.getId(), team.getGender(), false);
                    return;
                }
                return;
            }
            if (hashCode != 108869083) {
                if (hashCode == 394668909 && sportSlug.equals(Sports.FOOTBALL) && num != null) {
                    textView2.setText("#" + num);
                    as9.o(imageView, team.getId());
                    view.setOnClickListener(new View.OnClickListener(this) { // from class: dmf
                        public final /* synthetic */ emf b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i2 = i;
                            Team team2 = team;
                            emf emfVar = this.b;
                            switch (i2) {
                                case 0:
                                    int i3 = RankingsActivity.O;
                                    Context context2 = emfVar.getContext();
                                    context2.getClass();
                                    jaa.N(context2, jmf.f, Integer.valueOf(team2.getId()));
                                    break;
                                default:
                                    int i4 = RankingsActivity.O;
                                    Context context3 = emfVar.getContext();
                                    context3.getClass();
                                    jaa.N(context3, jmf.e, Integer.valueOf(team2.getId()));
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (sportSlug.equals(Sports.RUGBY) && num != null) {
                textView2.setText("#" + num);
                as9.o(imageView, team.getId());
                final int i2 = 1;
                view.setOnClickListener(new View.OnClickListener(this) { // from class: dmf
                    public final /* synthetic */ emf b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i22 = i2;
                        Team team2 = team;
                        emf emfVar = this.b;
                        switch (i22) {
                            case 0:
                                int i3 = RankingsActivity.O;
                                Context context2 = emfVar.getContext();
                                context2.getClass();
                                jaa.N(context2, jmf.f, Integer.valueOf(team2.getId()));
                                break;
                            default:
                                int i4 = RankingsActivity.O;
                                Context context3 = emfVar.getContext();
                                context3.getClass();
                                jaa.N(context3, jmf.e, Integer.valueOf(team2.getId()));
                                break;
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setEvent(@NotNull Event event) {
        Integer ranking;
        Integer num;
        Integer ranking2;
        event.getClass();
        if (Intrinsics.c(ok3.s(event), Sports.MMA)) {
            ranking = event.getHomeTeamRanking();
        } else {
            ranking = Event.getHomeTeam$default(event, null, 1, null).getRanking();
            if (ranking == null || ranking.intValue() <= 0) {
                num = null;
                if (Intrinsics.c(ok3.s(event), Sports.MMA)) {
                    ranking2 = Event.getAwayTeam$default(event, null, 1, null).getRanking();
                    if (ranking2 == null || ranking2.intValue() <= 0) {
                        ranking2 = null;
                    }
                } else {
                    ranking2 = event.getAwayTeamRanking();
                }
                Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                u79 u79Var = this.d;
                j(homeTeam$default, num, u79Var.e, u79Var.g, u79Var.i, u79Var.c);
                j(Event.getAwayTeam$default(event, null, 1, null), ranking2, u79Var.f, u79Var.h, u79Var.j, u79Var.d);
            }
        }
        num = ranking;
        if (Intrinsics.c(ok3.s(event), Sports.MMA)) {
        }
        Team homeTeam$default2 = Event.getHomeTeam$default(event, null, 1, null);
        u79 u79Var2 = this.d;
        j(homeTeam$default2, num, u79Var2.e, u79Var2.g, u79Var2.i, u79Var2.c);
        j(Event.getAwayTeam$default(event, null, 1, null), ranking2, u79Var2.f, u79Var2.h, u79Var2.j, u79Var2.d);
    }
}
