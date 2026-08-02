package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class id5 extends g7 {
    public final int l;
    public final int m;
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id5(Context context) {
        super(context);
        context.getClass();
        this.l = context.getColor(R.color.alert);
        this.m = context.getColor(R.color.value);
        this.n = context.getColor(R.color.live);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 8);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((td6) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = hkg.S(this.b).inflate(R.layout.viewholder_dropping_odds, viewGroup, false);
        int i2 = R.id.date;
        TextView textView = (TextView) nq8.B(R.id.date, inflate);
        if (textView != null) {
            i2 = R.id.drop;
            if (((TextView) nq8.B(R.id.drop, inflate)) != null) {
                i2 = R.id.drop_value;
                TextView textView2 = (TextView) nq8.B(R.id.drop_value, inflate);
                if (textView2 != null) {
                    i2 = R.id.first_team_name;
                    TextView textView3 = (TextView) nq8.B(R.id.first_team_name, inflate);
                    if (textView3 != null) {
                        i2 = R.id.initial_value_1;
                        TextView textView4 = (TextView) nq8.B(R.id.initial_value_1, inflate);
                        if (textView4 != null) {
                            i2 = R.id.initial_value_2;
                            TextView textView5 = (TextView) nq8.B(R.id.initial_value_2, inflate);
                            if (textView5 != null) {
                                i2 = R.id.initial_value_x;
                                TextView textView6 = (TextView) nq8.B(R.id.initial_value_x, inflate);
                                if (textView6 != null) {
                                    i2 = R.id.one;
                                    if (((TextView) nq8.B(R.id.one, inflate)) != null) {
                                        i2 = R.id.second_team_name;
                                        TextView textView7 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                        if (textView7 != null) {
                                            i2 = R.id.tournament_details;
                                            View B = nq8.B(R.id.tournament_details, inflate);
                                            if (B != null) {
                                                zl d = zl.d(B);
                                                i2 = R.id.two;
                                                if (((TextView) nq8.B(R.id.two, inflate)) != null) {
                                                    i2 = R.id.value_1;
                                                    TextView textView8 = (TextView) nq8.B(R.id.value_1, inflate);
                                                    if (textView8 != null) {
                                                        i2 = R.id.value_1_container;
                                                        if (((LinearLayout) nq8.B(R.id.value_1_container, inflate)) != null) {
                                                            i2 = R.id.value_2;
                                                            TextView textView9 = (TextView) nq8.B(R.id.value_2, inflate);
                                                            if (textView9 != null) {
                                                                i2 = R.id.value_2_container;
                                                                if (((LinearLayout) nq8.B(R.id.value_2_container, inflate)) != null) {
                                                                    i2 = R.id.value_x;
                                                                    TextView textView10 = (TextView) nq8.B(R.id.value_x, inflate);
                                                                    if (textView10 != null) {
                                                                        i2 = R.id.value_x_container;
                                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.value_x_container, inflate);
                                                                        if (linearLayout != null) {
                                                                            i2 = R.id.x;
                                                                            TextView textView11 = (TextView) nq8.B(R.id.x, inflate);
                                                                            if (textView11 != null) {
                                                                                return new vh(this, new js2((LinearLayout) inflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, d, textView8, textView9, textView10, linearLayout, textView11));
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
