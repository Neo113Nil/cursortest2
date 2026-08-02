package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowButton;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ns7 extends p8 {
    public final /* synthetic */ int c;
    public final z82 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ns7(z82 z82Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = z82Var;
                break;
            case 2:
                ConstraintLayout constraintLayout2 = (ConstraintLayout) z82Var.b;
                constraintLayout2.getClass();
                super(constraintLayout2);
                this.d = z82Var;
                break;
            case 3:
                ConstraintLayout constraintLayout3 = (ConstraintLayout) z82Var.b;
                constraintLayout3.getClass();
                super(constraintLayout3);
                this.d = z82Var;
                break;
            default:
                ConstraintLayout constraintLayout4 = (ConstraintLayout) z82Var.b;
                constraintLayout4.getClass();
                this.d = z82Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String slug;
        int i3 = this.c;
        Context context = this.b;
        z82 z82Var = this.d;
        switch (i3) {
            case 0:
                ((os7) obj).getClass();
                s02.R(z82Var, context);
                break;
            case 1:
                Player player = (Player) obj;
                player.getClass();
                ImageView imageView = (ImageView) z82Var.g;
                Set set = wyh.a;
                Integer valueOf = Integer.valueOf(wyh.a(player.getSportSlug()));
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = valueOf;
                fc6.w(ht9Var, imageView, a);
                ((TextView) z82Var.d).setText(tba.t(player));
                as9.l((ImageView) z82Var.e, player.getId(), null);
                FollowButton followButton = (FollowButton) z82Var.c;
                int i4 = FollowButton.i;
                followButton.e(player, null, null);
                break;
            case 2:
                Team team = (Team) obj;
                team.getClass();
                ImageView imageView2 = (ImageView) z82Var.g;
                ImageView imageView3 = (ImageView) z82Var.e;
                Set set2 = wyh.a;
                Sport sport = team.getSport();
                Integer valueOf2 = Integer.valueOf(wyh.a(sport != null ? sport.getSlug() : null));
                apf a2 = ajh.a(imageView2.getContext());
                ht9 ht9Var2 = new ht9(imageView2.getContext());
                ht9Var2.c = valueOf2;
                fc6.w(ht9Var2, imageView2, a2);
                TextView textView = (TextView) z82Var.d;
                context.getClass();
                String p = tba.p(context, team);
                if (qea.y(team) && team.getSport() != null && !wyh.e(team.getSportSlug())) {
                    p = wv8.i(p, " ", context.getString(R.string.female_team));
                }
                textView.setText(p);
                Sport sport2 = team.getSport();
                if (sport2 != null && (slug = sport2.getSlug()) != null) {
                    if (!slug.equals(Sports.MMA)) {
                        slug = null;
                    }
                    if (slug != null) {
                        as9.d(imageView3, team.getId(), team.getGender(), true);
                        FollowButton followButton2 = (FollowButton) z82Var.c;
                        int i5 = FollowButton.i;
                        followButton2.e(team, null, null);
                        break;
                    }
                }
                as9.o(imageView3, team.getId());
                FollowButton followButton22 = (FollowButton) z82Var.c;
                int i52 = FollowButton.i;
                followButton22.e(team, null, null);
                break;
            default:
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                ImageView imageView4 = (ImageView) z82Var.g;
                Set set3 = wyh.a;
                Integer valueOf3 = Integer.valueOf(wyh.a(uniqueTournament.getSportSlug()));
                apf a3 = ajh.a(imageView4.getContext());
                ht9 ht9Var3 = new ht9(imageView4.getContext());
                ht9Var3.c = valueOf3;
                fc6.w(ht9Var3, imageView4, a3);
                as9.q((ImageView) z82Var.e, Integer.valueOf(uniqueTournament.getId()), 0, null);
                String x = tba.x(uniqueTournament);
                if (uniqueTournament.isFemale() && Intrinsics.c(uniqueTournament.getSportSlug(), Sports.TENNIS)) {
                    x = wv8.i(x, " ", context.getString(R.string.female_team));
                }
                ((TextView) z82Var.d).setText(x);
                FollowButton followButton3 = (FollowButton) z82Var.c;
                int i6 = FollowButton.i;
                followButton3.e(uniqueTournament, null, null);
                break;
        }
    }
}
