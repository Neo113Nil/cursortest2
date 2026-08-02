package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appsflyer.internal.i;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeParticipant;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.CupTreeView;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l84 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l84(Object obj, Object obj2, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.s = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new l84((CupTreeView) this.t, (List) obj2, this.s, rq3Var, 0);
            case 1:
                l84 l84Var = new l84((String) obj2, this.s, rq3Var);
                l84Var.t = obj;
                return l84Var;
            case 2:
                return new l84((ai4) this.t, (List) obj2, this.s, rq3Var, 2);
            case 3:
                return new l84((pu6) this.t, this.s, (ho7) obj2, rq3Var, 3);
            case 4:
                return new l84(this.s, (ce8) this.t, (mvh) obj2, rq3Var, 4);
            case 5:
                l84 l84Var2 = new l84((FantasyWalkthroughCreateTeamFragment) this.t, (View) obj2, rq3Var);
                l84Var2.s = ((Boolean) obj).booleanValue();
                return l84Var2;
            case 6:
                return new l84((ViewGroup) this.t, (fcg) obj2, this.s, rq3Var, 6);
            case 7:
                return new l84((fcg) this.t, (FrameLayout) obj2, this.s, rq3Var, 7);
            case 8:
                return new l84(this.s, (Function0) this.t, (e1d) obj2, rq3Var, 8);
            default:
                return new l84((String) this.t, this.s, (e1d) obj2, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((l84) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.View, j84] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.sofascore.model.mvvm.model.Team] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.sofascore.model.cuptree.CupTreeParticipant, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Throwable] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        boolean z;
        ?? r14;
        CupTreeBlock cupTreeBlock;
        String i;
        String str;
        int i2 = this.r;
        int i3 = 4;
        int i4 = 2;
        ?? r7 = 0;
        r7 = false;
        boolean z2 = false;
        boolean z3 = true;
        Object obj2 = this.u;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                CupTreeView cupTreeView = (CupTreeView) this.t;
                z82 z82Var = cupTreeView.d;
                ((LinearLayout) z82Var.f).removeAllViews();
                ((LinearLayout) z82Var.c).removeAllViews();
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    CupTreeParticipant cupTreeParticipant = null;
                    if (!it.hasNext()) {
                        if (this.s) {
                            ((GraphicLarge) z82Var.e).setVisibility(0);
                        } else {
                            ((GraphicLarge) z82Var.e).setVisibility(8);
                            if (cupTreeView.o) {
                                Context context = cupTreeView.getContext();
                                context.getClass();
                                ?? r1 = (LinearLayout) z82Var.c;
                                Drawable drawable2 = context.getDrawable(R.drawable.ic_sofascore_logo_watermark);
                                if (drawable2 != null) {
                                    drawable2.mutate().setTintList(eq3.q(R.color.neutral_default, context));
                                    drawable = drawable2;
                                } else {
                                    drawable = null;
                                }
                                ImageView imageView = new ImageView(context);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ao2.s(80, context), -2);
                                layoutParams.gravity = 8388613;
                                layoutParams.topMargin = ao2.s(8, context);
                                layoutParams.setMarginEnd(ao2.s(16, context));
                                imageView.setLayoutParams(layoutParams);
                                imageView.setImageDrawable(drawable);
                                r1.addView(imageView);
                            }
                        }
                        return Unit.a;
                    }
                    Object next = it.next();
                    if (next instanceof Pair) {
                        Pair pair = (Pair) next;
                        Object obj3 = pair.a;
                        if ((obj3 instanceof List) && (pair.b instanceof j94)) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : (List) obj3) {
                                if (obj4 instanceof View) {
                                    arrayList.add(obj4);
                                }
                            }
                            ?? linearLayout = new LinearLayout(cupTreeView.getContext());
                            linearLayout.setDividerDrawable(linearLayout.getContext().getDrawable(R.drawable.divider_8dp));
                            linearLayout.setShowDividers(i4);
                            linearLayout.setClipToPadding(r7);
                            linearLayout.setClipChildren(r7);
                            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            linearLayout.setOrientation(r7);
                            linearLayout.setGravity(17);
                            ((LinearLayout) z82Var.c).addView(linearLayout);
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                View view = (View) it2.next();
                                linearLayout.addView(view);
                                if (!(view instanceof j84) || (cupTreeBlock = (r14 = (j84) view).e) == null) {
                                    z = z3;
                                } else {
                                    CupTreeParticipant homeParticipant = cupTreeBlock.getHomeParticipant();
                                    CupTreeParticipant awayParticipant = cupTreeBlock.getAwayParticipant();
                                    if (homeParticipant == null && awayParticipant == null) {
                                        r14.a(cupTreeParticipant, cupTreeParticipant);
                                        z = z3;
                                    } else {
                                        Object team = homeParticipant != null ? homeParticipant.getTeam() : cupTreeParticipant;
                                        ?? teamSeed = homeParticipant != null ? homeParticipant.getTeamSeed() : cupTreeParticipant;
                                        sc scVar = r14.a;
                                        if (scVar == null) {
                                            ?? r72 = cupTreeParticipant;
                                            Intrinsics.i("binding");
                                            throw r72;
                                        }
                                        TextView textView = scVar.i;
                                        if (scVar == null) {
                                            ?? r73 = cupTreeParticipant;
                                            Intrinsics.i("binding");
                                            throw r73;
                                        }
                                        ?? r37 = cupTreeParticipant;
                                        TextView textView2 = scVar.j;
                                        if (scVar == null) {
                                            Intrinsics.i("binding");
                                            throw r37;
                                        }
                                        r14.b(team, teamSeed, textView, textView2, scVar.e);
                                        Team team2 = awayParticipant != null ? awayParticipant.getTeam() : r37;
                                        String teamSeed2 = awayParticipant != null ? awayParticipant.getTeamSeed() : r37;
                                        sc scVar2 = r14.a;
                                        if (scVar2 == null) {
                                            Intrinsics.i("binding");
                                            throw r37;
                                        }
                                        TextView textView3 = scVar2.d;
                                        if (scVar2 == null) {
                                            Intrinsics.i("binding");
                                            throw r37;
                                        }
                                        TextView textView4 = scVar2.h;
                                        if (scVar2 == null) {
                                            Intrinsics.i("binding");
                                            throw r37;
                                        }
                                        r14.b(team2, teamSeed2, textView3, textView4, scVar2.c);
                                        if (!cupTreeBlock.isEnabled()) {
                                            z = z3;
                                            r14.a(homeParticipant, awayParticipant);
                                        } else if (homeParticipant == null || awayParticipant == null) {
                                            z = z3;
                                            r14.a(homeParticipant, r37);
                                        } else {
                                            sc scVar3 = r14.a;
                                            if (scVar3 == null) {
                                                Intrinsics.i("binding");
                                                throw r37;
                                            }
                                            haa.C((TextView) scVar3.n);
                                            if (cupTreeBlock.getHomeTeamScore() == null || cupTreeBlock.getAwayTeamScore() == null) {
                                                long seriesStartDateTimestamp = cupTreeBlock.getSeriesStartDateTimestamp();
                                                sc scVar4 = r14.a;
                                                if (scVar4 == null) {
                                                    Intrinsics.i("binding");
                                                    throw r37;
                                                }
                                                ((TextView) scVar4.m).setText("");
                                                sc scVar5 = r14.a;
                                                if (scVar5 == null) {
                                                    Intrinsics.i("binding");
                                                    throw r37;
                                                }
                                                ((TextView) scVar5.k).setText("");
                                                long currentTimeMillis = (System.currentTimeMillis() / 1000) - 86400;
                                                if (seriesStartDateTimestamp == 0 || seriesStartDateTimestamp <= currentTimeMillis) {
                                                    sc scVar6 = r14.a;
                                                    if (scVar6 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    ((TextView) scVar6.n).setText("");
                                                } else {
                                                    sc scVar7 = r14.a;
                                                    if (scVar7 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.D((TextView) scVar7.n);
                                                    sc scVar8 = r14.a;
                                                    if (scVar8 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    TextView textView5 = (TextView) scVar8.n;
                                                    if (fc6.B(fc6.t(Instant.ofEpochSecond(seriesStartDateTimestamp)))) {
                                                        Context context2 = r14.getContext();
                                                        context2.getClass();
                                                        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context2) ? "Hm" : "hm");
                                                        bestPattern.getClass();
                                                        i = fc6.i(seriesStartDateTimestamp, hk4.a(bestPattern));
                                                    } else {
                                                        bi4 bi4Var = bi4.PATTERN_DMM;
                                                        ConcurrentHashMap concurrentHashMap = hk4.a;
                                                        i = fc6.i(seriesStartDateTimestamp, hk4.a(bi4Var.d()));
                                                    }
                                                    textView5.setText(i);
                                                }
                                            } else {
                                                String homeTeamScore = cupTreeBlock.getHomeTeamScore();
                                                String awayTeamScore = cupTreeBlock.getAwayTeamScore();
                                                if (!cupTreeBlock.getFinished()) {
                                                    boolean eventInProgress = cupTreeBlock.getEventInProgress();
                                                    sc scVar9 = r14.a;
                                                    if (eventInProgress) {
                                                        if (scVar9 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.B((TextView) scVar9.m);
                                                        sc scVar10 = r14.a;
                                                        if (scVar10 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.B((TextView) scVar10.n);
                                                        sc scVar11 = r14.a;
                                                        if (scVar11 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.B((TextView) scVar11.k);
                                                    } else {
                                                        if (scVar9 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.H((TextView) scVar9.m);
                                                        sc scVar12 = r14.a;
                                                        if (scVar12 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.H((TextView) scVar12.n);
                                                        sc scVar13 = r14.a;
                                                        if (scVar13 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.H((TextView) scVar13.k);
                                                    }
                                                } else if (awayParticipant.getWinner()) {
                                                    sc scVar14 = r14.a;
                                                    if (scVar14 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.D(scVar14.i);
                                                    sc scVar15 = r14.a;
                                                    if (scVar15 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.C(scVar15.d);
                                                    sc scVar16 = r14.a;
                                                    if (scVar16 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.D((TextView) scVar16.m);
                                                    sc scVar17 = r14.a;
                                                    if (scVar17 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.C((TextView) scVar17.k);
                                                } else {
                                                    boolean winner = homeParticipant.getWinner();
                                                    sc scVar18 = r14.a;
                                                    if (winner) {
                                                        if (scVar18 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.C(scVar18.i);
                                                        sc scVar19 = r14.a;
                                                        if (scVar19 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.D(scVar19.d);
                                                        sc scVar20 = r14.a;
                                                        if (scVar20 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.C((TextView) scVar20.m);
                                                        sc scVar21 = r14.a;
                                                        if (scVar21 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.D((TextView) scVar21.k);
                                                    } else {
                                                        if (scVar18 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.D(scVar18.i);
                                                        sc scVar22 = r14.a;
                                                        if (scVar22 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.D(scVar22.d);
                                                        sc scVar23 = r14.a;
                                                        if (scVar23 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.D((TextView) scVar23.m);
                                                        sc scVar24 = r14.a;
                                                        if (scVar24 == null) {
                                                            Intrinsics.i("binding");
                                                            throw r37;
                                                        }
                                                        haa.D((TextView) scVar24.k);
                                                    }
                                                }
                                                sc scVar25 = r14.a;
                                                if (scVar25 == null) {
                                                    Intrinsics.i("binding");
                                                    throw r37;
                                                }
                                                ((TextView) scVar25.m).setText(homeTeamScore);
                                                sc scVar26 = r14.a;
                                                if (scVar26 == null) {
                                                    Intrinsics.i("binding");
                                                    throw r37;
                                                }
                                                ((TextView) scVar26.n).setText(":");
                                                sc scVar27 = r14.a;
                                                if (scVar27 == null) {
                                                    Intrinsics.i("binding");
                                                    throw r37;
                                                }
                                                ((TextView) scVar27.k).setText(awayTeamScore);
                                            }
                                            String result = cupTreeBlock.getResult();
                                            if (result != null) {
                                                Locale locale = Locale.US;
                                                str = i.k(locale, result, locale);
                                            } else {
                                                str = r37;
                                            }
                                            if (Intrinsics.c(str, CupTreeBlock.BLOCK_RESULT_WALKOVER)) {
                                                String string = r14.getContext().getString(R.string.tennis_walkover_short);
                                                string.getClass();
                                                r14.d(homeParticipant, awayParticipant, string);
                                            } else if (Intrinsics.c(str, CupTreeBlock.BLOCK_RESULT_RETIRED)) {
                                                String string2 = r14.getContext().getString(R.string.tennis_retired_short);
                                                string2.getClass();
                                                r14.d(homeParticipant, awayParticipant, string2);
                                            } else {
                                                z = true;
                                                if (cupTreeBlock.getEventInProgress()) {
                                                    sc scVar28 = r14.a;
                                                    if (scVar28 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.B(scVar28.i);
                                                    sc scVar29 = r14.a;
                                                    if (scVar29 == null) {
                                                        Intrinsics.i("binding");
                                                        throw r37;
                                                    }
                                                    haa.B(scVar29.d);
                                                }
                                            }
                                            z = true;
                                        }
                                    }
                                }
                                ImageView imageView2 = (ImageView) view.findViewById(R.id.tournament_image);
                                if (imageView2 != null) {
                                    Integer num = cupTreeView.m;
                                    Integer num2 = cupTreeView.n;
                                    as9.q(imageView2, num, num2 != null ? num2.intValue() : 0, null);
                                    cupTreeParticipant = null;
                                    z3 = z;
                                } else {
                                    z3 = z;
                                    cupTreeParticipant = null;
                                }
                            }
                        }
                    }
                    z3 = z3;
                    i4 = 2;
                    r7 = 0;
                }
                break;
            case 1:
                p0d p0dVar = (p0d) this.t;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                e5f e5fVar = new e5f((String) obj2);
                Boolean valueOf = Boolean.valueOf(this.s);
                p0dVar.getClass();
                p0dVar.f(e5fVar, valueOf);
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return mx9.u(((ai4) this.t).i(), (List) obj2, null, null, false, false, false, this.s, new z16(4), 5116);
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                pu6 pu6Var = (pu6) this.t;
                pu6Var.x(hu6.a(pu6Var.l(), null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, null, 16646143));
                if (pu6Var.r() == null || this.s) {
                    pu6Var.s(((ho7) obj2).a);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                if (this.s) {
                    ce8.a((ce8) this.t);
                    mvh mvhVar = (mvh) obj2;
                    if (mvhVar != null) {
                        ((lw4) mvhVar).b();
                    }
                }
                return Unit.a;
            case 5:
                boolean z4 = this.s;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment = (FantasyWalkthroughCreateTeamFragment) this.t;
                fantasyWalkthroughCreateTeamFragment.t((View) obj2, new sx0(fantasyWalkthroughCreateTeamFragment, z4, i4));
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                ViewGroup viewGroup = (ViewGroup) this.t;
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                Rect rect = new Rect();
                viewGroup.getGlobalVisibleRect(rect);
                fcg fcgVar = (fcg) obj2;
                int[] iArr = new int[2];
                fcgVar.getLocationInWindow(iArr);
                int[] iArr2 = {iArr[0], iArr[1], fcgVar.getWidth(), fcgVar.getHeight()};
                AnimatorSet b = fcg.b(fcgVar.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, iArr2[0] - rect.left, iArr2[1] - rect.top, iArr2[2], iArr2[3], this.s ? fcgVar.e : 0L);
                b.addListener(new i6(i3, viewGroup, fcgVar));
                fcgVar.l.setPadding(0, 0, 0, 0);
                b.start();
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                fcg fcgVar2 = (fcg) this.t;
                int[] iArr3 = new int[2];
                fcgVar2.getLocationInWindow(iArr3);
                int[] iArr4 = {iArr3[0], iArr3[1], fcgVar2.getWidth(), fcgVar2.getHeight()};
                int i5 = iArr4[0];
                int i6 = iArr4[1];
                int i7 = iArr4[2];
                int i8 = iArr4[3];
                FrameLayout frameLayout = (FrameLayout) obj2;
                int width2 = frameLayout.getWidth();
                int height2 = frameLayout.getHeight();
                RelativeLayout relativeLayout = fcgVar2.l;
                fcgVar2.removeView(relativeLayout);
                frameLayout.addView(relativeLayout);
                frameLayout.getGlobalVisibleRect(new Rect());
                AnimatorSet b2 = fcg.b(fcgVar2.l, i5 - r2.left, i6 - r2.top, i7, i8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, height2, this.s ? fcgVar2.e : 0L);
                b2.addListener(new j6(fcgVar2, 6));
                b2.start();
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                if (this.s) {
                    ((e1d) obj2).setValue(Boolean.TRUE);
                } else {
                    ((Function0) this.t).invoke();
                }
                return Unit.a;
            default:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                e1d e1dVar = (e1d) obj2;
                if (((String) this.t) != null && !this.s) {
                    z2 = true;
                }
                int i9 = z5l.a;
                e1dVar.setValue(Boolean.valueOf(z2));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l84(FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment, View view, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.t = fantasyWalkthroughCreateTeamFragment;
        this.u = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l84(Object obj, boolean z, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.s = z;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l84(String str, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.u = str;
        this.s = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l84(boolean z, Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = z;
        this.t = obj;
        this.u = obj2;
    }
}
