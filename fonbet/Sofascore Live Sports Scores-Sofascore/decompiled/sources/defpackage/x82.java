package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamColors;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x82 extends o8 {
    public final boolean d;
    public final w82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(Context context, boolean z) {
        super(context, null, 0);
        Typeface typeface;
        Typeface typeface2;
        context.getClass();
        this.d = z;
        View root = getRoot();
        int i = R.id.driver_name;
        TextView textView = (TextView) nq8.B(R.id.driver_name, root);
        if (textView != null) {
            i = R.id.position_text;
            TextView textView2 = (TextView) nq8.B(R.id.position_text, root);
            if (textView2 != null) {
                i = R.id.team_color;
                ImageView imageView = (ImageView) nq8.B(R.id.team_color, root);
                if (imageView != null) {
                    this.e = new w82((ConstraintLayout) root, textView, textView2, imageView);
                    if (z) {
                        int s = ao2.s(2, context);
                        int s2 = ao2.s(14, context);
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.getClass();
                        tl3 tl3Var = (tl3) layoutParams;
                        ((ViewGroup.MarginLayoutParams) tl3Var).height = s2;
                        ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = s;
                        ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin = s;
                        try {
                            typeface = z1g.a(R.font.sofascore_sans_medium, context);
                        } catch (Exception unused) {
                            typeface = Typeface.DEFAULT;
                        }
                        textView.setTypeface(typeface);
                        this.e.d.setTextSize(2, 16.0f);
                        TextView textView3 = this.e.e;
                        try {
                            typeface2 = z1g.a(R.font.sofascore_sans_medium, context);
                        } catch (Exception unused2) {
                            typeface2 = Typeface.DEFAULT;
                        }
                        textView3.setTypeface(typeface2);
                        this.e.e.setTextSize(2, 16.0f);
                        return;
                    }
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public final boolean getCalledFromBuzzerFeed() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.buzzer_driver_row;
    }

    public final void j(Team team, boolean z, int i) {
        TeamColors teamColors;
        String primary;
        team.getClass();
        w82 w82Var = this.e;
        ImageView imageView = w82Var.c;
        Team parentTeam = team.getParentTeam();
        imageView.setBackgroundColor((parentTeam == null || (teamColors = parentTeam.getTeamColors()) == null || (primary = teamColors.getPrimary()) == null) ? 0 : Color.parseColor(primary));
        w82Var.d.setText(team.getNameCode());
        w82Var.e.setText(z ? "PP" : String.valueOf(i));
    }
}
