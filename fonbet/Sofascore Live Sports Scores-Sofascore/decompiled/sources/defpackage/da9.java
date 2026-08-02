package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.model.network.response.bettingtips.EventStreak;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class da9 extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 16);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((EventStreak) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.betting_tips_high_value_streaks_item, viewGroup, false);
        int i2 = R.id.end_divider;
        if (((MaterialDivider) nq8.B(R.id.end_divider, inflate)) != null) {
            i2 = R.id.first_team_logo;
            ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
            if (imageView != null) {
                i2 = R.id.middle_divider;
                if (((MaterialDivider) nq8.B(R.id.middle_divider, inflate)) != null) {
                    i2 = R.id.second_team_logo;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                    if (imageView2 != null) {
                        i2 = R.id.streak_name;
                        TextView textView = (TextView) nq8.B(R.id.streak_name, inflate);
                        if (textView != null) {
                            i2 = R.id.streak_team_logo_1;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.streak_team_logo_1, inflate);
                            if (imageView3 != null) {
                                i2 = R.id.streak_team_logo_2;
                                ImageView imageView4 = (ImageView) nq8.B(R.id.streak_team_logo_2, inflate);
                                if (imageView4 != null) {
                                    i2 = R.id.streak_value;
                                    TextView textView2 = (TextView) nq8.B(R.id.streak_value, inflate);
                                    if (textView2 != null) {
                                        i2 = R.id.time;
                                        TextView textView3 = (TextView) nq8.B(R.id.time, inflate);
                                        if (textView3 != null) {
                                            return new wh(new nr1((ConstraintLayout) inflate, imageView, imageView2, textView, imageView3, imageView4, textView2, textView3, 2), (byte) 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
