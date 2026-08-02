package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.FootballGoalmapView;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ok8 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk8 b;

    public /* synthetic */ ok8(sk8 sk8Var, int i) {
        this.a = i;
        this.b = sk8Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        final sk8 sk8Var = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = sk8Var.l;
                    bx7 bx7Var = sk8Var.k;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Double d = sk8Var.r;
                    bx7 bx7Var2 = sk8Var.k;
                    ux7 ux7Var = sk8Var.m;
                    int i3 = ux7Var.a;
                    String str2 = ux7Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    fy7 fy7Var = sk8Var.n;
                    int i4 = fy7Var.a;
                    String str3 = fy7Var.b;
                    String str4 = str3 == null ? "" : str3;
                    fy7 fy7Var2 = bx7Var2.g;
                    Integer valueOf = fy7Var2 != null ? Integer.valueOf(fy7Var2.a) : null;
                    fy7 fy7Var3 = bx7Var2.h;
                    Integer valueOf2 = fy7Var3 != null ? Integer.valueOf(fy7Var3.a) : null;
                    Integer num = bx7Var2.m;
                    Integer num2 = bx7Var2.n;
                    Integer num3 = bx7Var2.q;
                    l98.p(i3, str2, Integer.valueOf(i4), valueOf, valueOf2, num, num2, num3 != null ? num3.intValue() : 0, str4, d, false, av8Var2, 0, 0, 1024);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    xtc A = wnn.A(bkh.d(utc.a, 1.0f), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3));
                    boolean i5 = av8Var3.i(sk8Var);
                    Object O = av8Var3.O();
                    if (i5 || O == a99Var) {
                        final int i6 = r4 ? 1 : 0;
                        O = new Function1() { // from class: rk8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i7 = i6;
                                sk8 sk8Var2 = sk8Var;
                                Context context = (Context) obj4;
                                switch (i7) {
                                    case 0:
                                        context.getClass();
                                        dd c = dd.c(LayoutInflater.from(context).inflate(R.layout.football_shot_graphs_layout, (ViewGroup) null, false));
                                        ((FootballGoalmapView) c.c).setVisibility(8);
                                        LinearLayout linearLayout = (LinearLayout) c.b;
                                        linearLayout.setBackground(context.getDrawable(R.drawable.rectangle_16dp_corners_bottom_no_fill));
                                        FootballShotmapView footballShotmapView = (FootballShotmapView) ((dd) c.d).c;
                                        ViewGroup.LayoutParams layoutParams = footballShotmapView.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            return null;
                                        }
                                        layoutParams.width = -1;
                                        footballShotmapView.setLayoutParams(layoutParams);
                                        footballShotmapView.F = null;
                                        footballShotmapView.h(sk8Var2.o, sk8Var2.p, true, (r10 & 8) != 0, false);
                                        return linearLayout;
                                    default:
                                        context.getClass();
                                        dd c2 = dd.c(LayoutInflater.from(context).inflate(R.layout.football_shot_graphs_layout, (ViewGroup) null, false));
                                        LinearLayout linearLayout2 = (LinearLayout) c2.b;
                                        linearLayout2.setClipToOutline(true);
                                        ((FootballGoalmapView) c2.c).setVisibility(8);
                                        dd ddVar = (dd) c2.d;
                                        FootballShotmapView footballShotmapView2 = (FootballShotmapView) ddVar.c;
                                        footballShotmapView2.h = 0;
                                        linearLayout2.setBackground(context.getDrawable(R.drawable.rounded_surface_level_1));
                                        z8e.V(context.getColor(R.color.terrain_football), linearLayout2);
                                        footballShotmapView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        ((ImageView) ddVar.d).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        footballShotmapView2.F = null;
                                        footballShotmapView2.h(sk8Var2.o, sk8Var2.p, true, (r10 & 8) != 0, false);
                                        return linearLayout2;
                                }
                            }
                        };
                        av8Var3.n0(O);
                    }
                    td4.a((Function1) O, A, null, av8Var3, 0, 4);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    boolean i7 = av8Var4.i(sk8Var);
                    Object O2 = av8Var4.O();
                    if (i7 || O2 == a99Var) {
                        O2 = new Function1() { // from class: rk8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i72 = i2;
                                sk8 sk8Var2 = sk8Var;
                                Context context = (Context) obj4;
                                switch (i72) {
                                    case 0:
                                        context.getClass();
                                        dd c = dd.c(LayoutInflater.from(context).inflate(R.layout.football_shot_graphs_layout, (ViewGroup) null, false));
                                        ((FootballGoalmapView) c.c).setVisibility(8);
                                        LinearLayout linearLayout = (LinearLayout) c.b;
                                        linearLayout.setBackground(context.getDrawable(R.drawable.rectangle_16dp_corners_bottom_no_fill));
                                        FootballShotmapView footballShotmapView = (FootballShotmapView) ((dd) c.d).c;
                                        ViewGroup.LayoutParams layoutParams = footballShotmapView.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            return null;
                                        }
                                        layoutParams.width = -1;
                                        footballShotmapView.setLayoutParams(layoutParams);
                                        footballShotmapView.F = null;
                                        footballShotmapView.h(sk8Var2.o, sk8Var2.p, true, (r10 & 8) != 0, false);
                                        return linearLayout;
                                    default:
                                        context.getClass();
                                        dd c2 = dd.c(LayoutInflater.from(context).inflate(R.layout.football_shot_graphs_layout, (ViewGroup) null, false));
                                        LinearLayout linearLayout2 = (LinearLayout) c2.b;
                                        linearLayout2.setClipToOutline(true);
                                        ((FootballGoalmapView) c2.c).setVisibility(8);
                                        dd ddVar = (dd) c2.d;
                                        FootballShotmapView footballShotmapView2 = (FootballShotmapView) ddVar.c;
                                        footballShotmapView2.h = 0;
                                        linearLayout2.setBackground(context.getDrawable(R.drawable.rounded_surface_level_1));
                                        z8e.V(context.getColor(R.color.terrain_football), linearLayout2);
                                        footballShotmapView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        ((ImageView) ddVar.d).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        footballShotmapView2.F = null;
                                        footballShotmapView2.h(sk8Var2.o, sk8Var2.p, true, (r10 & 8) != 0, false);
                                        return linearLayout2;
                                }
                            }
                        };
                        av8Var4.n0(O2);
                    }
                    td4.a((Function1) O2, f0, null, av8Var4, 48, 4);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
