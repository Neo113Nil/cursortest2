package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a63 extends p8 {
    public final /* synthetic */ int c;
    public final z82 d;
    public final /* synthetic */ c63 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a63(c63 c63Var, z82 z82Var, int i) {
        super(r1);
        this.c = i;
        switch (i) {
            case 1:
                this.e = c63Var;
                ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = z82Var;
                break;
            default:
                this.e = c63Var;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) z82Var.b;
                constraintLayout2.getClass();
                this.d = z82Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x016a, code lost:
    
        if (r4 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String string;
        String str;
        int i3 = this.c;
        c63 c63Var = this.e;
        z82 z82Var = this.d;
        switch (i3) {
            case 0:
                Player player = (Player) obj;
                player.getClass();
                TextView textView = (TextView) z82Var.d;
                ImageView imageView = (ImageView) z82Var.e;
                TextView textView2 = (TextView) z82Var.c;
                textView.setText(tba.t(player));
                ImageView imageView2 = (ImageView) z82Var.g;
                as9.l(imageView2, player.getId(), null);
                if (player.getDeceased()) {
                    as9.a(imageView2);
                } else {
                    imageView2.setColorFilter((ColorFilter) null);
                }
                Context context = ((ConstraintLayout) z82Var.b).getContext();
                Team team = player.getTeam();
                if (team != null) {
                    context.getClass();
                    string = tba.p(context, team);
                    if (qea.y(team) && team.getSport() != null) {
                        Set set = wyh.a;
                        if (!wyh.e(team.getSportSlug())) {
                            string = wv8.i(string, " ", context.getString(R.string.female_team));
                            break;
                        }
                    }
                }
                string = context.getString(R.string.transfer_no_team);
                string.getClass();
                textView2.setText(string);
                Team team2 = player.getTeam();
                String R = pco.R(team2 != null ? team2.getId() : 0);
                ua5 ua5Var = ua5.a;
                Integer valueOf = Integer.valueOf(c63Var.h);
                Context context2 = textView2.getContext();
                context2.getClass();
                apf a = ajh.a(context2);
                Context context3 = textView2.getContext();
                context3.getClass();
                ht9 ht9Var = new ht9(context3);
                ht9Var.c = R;
                ht9Var.d = new pfj(textView2, ua5Var, valueOf);
                vt9.e(ht9Var, R.drawable.ic_no_team);
                vt9.a(ht9Var, R.drawable.ic_no_team);
                a.a(ht9Var.a());
                imageView.setVisibility(player.getIsRecent() ? 0 : 8);
                imageView.setOnClickListener(new cn(18, c63Var, player));
                break;
            default:
                Team team3 = (Team) obj;
                team3.getClass();
                TextView textView3 = (TextView) z82Var.d;
                ImageView imageView3 = (ImageView) z82Var.e;
                TextView textView4 = (TextView) z82Var.c;
                Context context4 = this.b;
                context4.getClass();
                String p = tba.p(context4, team3);
                if (qea.y(team3) && team3.getSport() != null) {
                    Set set2 = wyh.a;
                    if (!wyh.e(team3.getSportSlug())) {
                        p = wv8.i(p, " ", context4.getString(R.string.female_team));
                    }
                }
                textView3.setText(p);
                as9.o((ImageView) z82Var.g, team3.getId());
                Country country = team3.getCountry();
                if (!team3.getNational()) {
                    if ((country != null ? country.getName() : null) != null) {
                        textView4.setVisibility(0);
                        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            break;
                        } else {
                            tl3 tl3Var = (tl3) layoutParams;
                            tl3Var.k = ((Guideline) z82Var.f).getId();
                            tl3Var.i = -1;
                            tl3Var.l = -1;
                            textView3.setLayoutParams(tl3Var);
                            textView4.setText(tv3.c(context4, country.getName()));
                            String alpha2 = country.getAlpha2();
                            if (alpha2 != null) {
                                str = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
                            } else {
                                str = "";
                            }
                            ua5 ua5Var2 = ua5.a;
                            int i4 = c63Var.h;
                            t25.a(i4);
                            haa.q(textView4, str, ua5Var2, new t25(i4));
                            imageView3.setVisibility(team3.getIsRecent() ? 0 : 8);
                            imageView3.setOnClickListener(new cn(19, c63Var, team3));
                            break;
                        }
                    }
                }
                textView4.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    break;
                } else {
                    tl3 tl3Var2 = (tl3) layoutParams2;
                    tl3Var2.k = -1;
                    tl3Var2.i = 0;
                    tl3Var2.l = 0;
                    textView3.setLayoutParams(tl3Var2);
                    imageView3.setVisibility(team3.getIsRecent() ? 0 : 8);
                    imageView3.setOnClickListener(new cn(19, c63Var, team3));
                }
                break;
        }
    }
}
