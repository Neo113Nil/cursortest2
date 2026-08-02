package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p66 extends g7 {
    public final mqi l;
    public final Set m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p66(Context context) {
        super(context);
        context.getClass();
        this.l = ypa.b(new c6(context, 20));
        o66[] o66VarArr = o66.a;
        this.m = ph0.a0(new Integer[]{1, 5, 7, 10});
    }

    public final LayoutInflater G() {
        return (LayoutInflater) this.l.getValue();
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        Integer valueOf = Integer.valueOf(R.id.card_container);
        o66[] o66VarArr = o66.a;
        if (i == 10) {
            return valueOf;
        }
        o66[] o66VarArr2 = o66.a;
        if (i == 7) {
            return valueOf;
        }
        o66[] o66VarArr3 = o66.a;
        if (i == 1) {
            return valueOf;
        }
        o66[] o66VarArr4 = o66.a;
        if (i == 5) {
            return valueOf;
        }
        o66[] o66VarArr5 = o66.a;
        if (i == 3) {
            return valueOf;
        }
        o66[] o66VarArr6 = o66.a;
        if (i == 2) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return this.m.contains(Integer.valueOf(i));
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 9);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof lt1) {
            o66[] o66VarArr = o66.a;
            return 1;
        }
        if (obj instanceof y02) {
            o66[] o66VarArr2 = o66.a;
            return 5;
        }
        if (obj instanceof pt1) {
            o66[] o66VarArr3 = o66.a;
            return 3;
        }
        if (obj instanceof it1) {
            o66[] o66VarArr4 = o66.a;
            return 2;
        }
        if (obj instanceof fae) {
            o66[] o66VarArr5 = o66.a;
            return 10;
        }
        if (obj instanceof c6l) {
            o66[] o66VarArr6 = o66.a;
            return 7;
        }
        if (obj instanceof vej) {
            o66[] o66VarArr7 = o66.a;
            return 8;
        }
        if (obj instanceof x04) {
            o66[] o66VarArr8 = o66.a;
            return 0;
        }
        if (obj instanceof y04) {
            o66[] o66VarArr9 = o66.a;
            return 4;
        }
        if (obj instanceof z04) {
            o66[] o66VarArr10 = o66.a;
            return 6;
        }
        if (obj instanceof b14) {
            o66[] o66VarArr11 = o66.a;
            return 9;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        o66[] o66VarArr = o66.a;
        if (i == 0) {
            return new wh(p12.d(G(), viewGroup));
        }
        if (i == 4) {
            return new wh(p12.d(G(), viewGroup));
        }
        if (i == 6) {
            return new wh(p12.d(G(), viewGroup));
        }
        if (i == 9) {
            return new wh(p12.d(G(), viewGroup));
        }
        if (i == 10) {
            return new gae(j22.c(G(), viewGroup), 0);
        }
        if (i == 7) {
            return new gae(j22.c(G(), viewGroup), 1);
        }
        if (i == 8) {
            View inflate = G().inflate(R.layout.scorecard_footer_layout, viewGroup, false);
            int i2 = R.id.footer_text;
            TextView textView = (TextView) nq8.B(R.id.footer_text, inflate);
            if (textView != null) {
                i2 = R.id.footer_title;
                TextView textView2 = (TextView) nq8.B(R.id.footer_title, inflate);
                if (textView2 != null) {
                    return new j8i(new z3f(5, textView2, (FrameLayout) inflate, textView));
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 3) {
            View inflate2 = G().inflate(R.layout.batsman_section_total, viewGroup, false);
            if (inflate2 != null) {
                TextView textView3 = (TextView) inflate2;
                return new wh(new mt1(textView3, textView3, 0));
            }
            yhk.s("rootView");
            return null;
        }
        if (i != 2) {
            if (i == 1) {
                return new vh(j22.c(G(), viewGroup));
            }
            if (i == 5) {
                return new z02(j22.c(G(), viewGroup));
            }
            ilg.c();
            return null;
        }
        View inflate3 = G().inflate(R.layout.batsman_section_extra, viewGroup, false);
        int i3 = R.id.bye;
        TextView textView4 = (TextView) nq8.B(R.id.bye, inflate3);
        if (textView4 != null) {
            LinearLayout linearLayout = (LinearLayout) inflate3;
            i3 = R.id.extra;
            TextView textView5 = (TextView) nq8.B(R.id.extra, inflate3);
            if (textView5 != null) {
                i3 = R.id.leg_bye;
                TextView textView6 = (TextView) nq8.B(R.id.leg_bye, inflate3);
                if (textView6 != null) {
                    i3 = R.id.no_ball;
                    TextView textView7 = (TextView) nq8.B(R.id.no_ball, inflate3);
                    if (textView7 != null) {
                        i3 = R.id.penalty;
                        TextView textView8 = (TextView) nq8.B(R.id.penalty, inflate3);
                        if (textView8 != null) {
                            i3 = R.id.wide;
                            TextView textView9 = (TextView) nq8.B(R.id.wide, inflate3);
                            if (textView9 != null) {
                                return new wh(new nr1(linearLayout, textView4, linearLayout, textView5, textView6, textView7, textView8, textView9, 1));
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
        return null;
    }
}
