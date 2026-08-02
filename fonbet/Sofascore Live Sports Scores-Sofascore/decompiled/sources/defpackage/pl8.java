package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pl8 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tl8 b;

    public /* synthetic */ pl8(tl8 tl8Var, int i) {
        this.a = i;
        this.b = tl8Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        final tl8 tl8Var = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = tl8Var.l;
                    bx7 bx7Var = tl8Var.k;
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
                    fy7 fy7Var = tl8Var.m;
                    bx7 bx7Var2 = tl8Var.k;
                    int i3 = fy7Var.a;
                    String str2 = fy7Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    fy7 fy7Var2 = bx7Var2.g;
                    Integer valueOf = fy7Var2 != null ? Integer.valueOf(fy7Var2.a) : null;
                    fy7 fy7Var3 = bx7Var2.h;
                    Integer valueOf2 = fy7Var3 != null ? Integer.valueOf(fy7Var3.a) : null;
                    Integer num = bx7Var2.m;
                    Integer num2 = bx7Var2.n;
                    Integer num3 = bx7Var2.q;
                    l98.v(i3, str3, valueOf, valueOf2, num, num2, num3 != null ? num3.intValue() : 0, tl8Var.s, av8Var2, 0, 0);
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
                    boolean i4 = av8Var3.i(tl8Var);
                    Object O = av8Var3.O();
                    if (i4 || O == a99Var) {
                        final int i5 = r4 ? 1 : 0;
                        O = new Function1() { // from class: sl8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i6 = i5;
                                tl8 tl8Var2 = tl8Var;
                                Context context = (Context) obj4;
                                switch (i6) {
                                    case 0:
                                        context.getClass();
                                        dd b = dd.b(LayoutInflater.from(context).inflate(R.layout.football_match_shotmap_container, (ViewGroup) null, false));
                                        ConstraintLayout constraintLayout = (ConstraintLayout) b.b;
                                        FootballShotmapView footballShotmapView = (FootballShotmapView) b.c;
                                        ViewGroup.LayoutParams layoutParams = footballShotmapView.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            break;
                                        } else {
                                            layoutParams.width = -1;
                                            footballShotmapView.setLayoutParams(layoutParams);
                                            constraintLayout.setBackgroundTintList(eq3.q(R.color.terrain_football, context));
                                            footballShotmapView.h(tl8Var2.n, tl8Var2.r, false, false, true);
                                            break;
                                        }
                                    default:
                                        context.getClass();
                                        dd b2 = dd.b(LayoutInflater.from(context).inflate(R.layout.football_match_shotmap_container, (ViewGroup) null, false));
                                        FootballShotmapView footballShotmapView2 = (FootballShotmapView) b2.c;
                                        footballShotmapView2.h = 0;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b2.b;
                                        constraintLayout2.setBackground(context.getDrawable(R.drawable.rounded_surface_level_1));
                                        z8e.V(context.getColor(R.color.terrain_football), constraintLayout2);
                                        ViewGroup.LayoutParams layoutParams2 = footballShotmapView2.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                            break;
                                        } else {
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                            marginLayoutParams.width = -2;
                                            footballShotmapView2.setLayoutParams(marginLayoutParams);
                                            footballShotmapView2.h(tl8Var2.n, tl8Var2.r, false, false, true);
                                            break;
                                        }
                                }
                                return null;
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
                    xtc A2 = wnn.A(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.a(12.0f));
                    boolean i6 = av8Var4.i(tl8Var);
                    Object O2 = av8Var4.O();
                    if (i6 || O2 == a99Var) {
                        O2 = new Function1() { // from class: sl8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i62 = i2;
                                tl8 tl8Var2 = tl8Var;
                                Context context = (Context) obj4;
                                switch (i62) {
                                    case 0:
                                        context.getClass();
                                        dd b = dd.b(LayoutInflater.from(context).inflate(R.layout.football_match_shotmap_container, (ViewGroup) null, false));
                                        ConstraintLayout constraintLayout = (ConstraintLayout) b.b;
                                        FootballShotmapView footballShotmapView = (FootballShotmapView) b.c;
                                        ViewGroup.LayoutParams layoutParams = footballShotmapView.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            break;
                                        } else {
                                            layoutParams.width = -1;
                                            footballShotmapView.setLayoutParams(layoutParams);
                                            constraintLayout.setBackgroundTintList(eq3.q(R.color.terrain_football, context));
                                            footballShotmapView.h(tl8Var2.n, tl8Var2.r, false, false, true);
                                            break;
                                        }
                                    default:
                                        context.getClass();
                                        dd b2 = dd.b(LayoutInflater.from(context).inflate(R.layout.football_match_shotmap_container, (ViewGroup) null, false));
                                        FootballShotmapView footballShotmapView2 = (FootballShotmapView) b2.c;
                                        footballShotmapView2.h = 0;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b2.b;
                                        constraintLayout2.setBackground(context.getDrawable(R.drawable.rounded_surface_level_1));
                                        z8e.V(context.getColor(R.color.terrain_football), constraintLayout2);
                                        ViewGroup.LayoutParams layoutParams2 = footballShotmapView2.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                            break;
                                        } else {
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                            marginLayoutParams.width = -2;
                                            footballShotmapView2.setLayoutParams(marginLayoutParams);
                                            footballShotmapView2.h(tl8Var2.n, tl8Var2.r, false, false, true);
                                            break;
                                        }
                                }
                                return null;
                            }
                        };
                        av8Var4.n0(O2);
                    }
                    td4.a((Function1) O2, A2, null, av8Var4, 0, 4);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
