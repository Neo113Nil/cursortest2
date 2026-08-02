package com.sofascore.results.view.graph.networkanimation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.ShirtColor;
import com.sofascore.model.newNetwork.commentary.AnimatedGoalType;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.newNetwork.commentary.SegmentEventType;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a08;
import defpackage.abe;
import defpackage.ao2;
import defpackage.g9i;
import defpackage.hkg;
import defpackage.jae;
import defpackage.lae;
import defpackage.m09;
import defpackage.m41;
import defpackage.mhe;
import defpackage.mz1;
import defpackage.mz7;
import defpackage.o1j;
import defpackage.ppa;
import defpackage.pw8;
import defpackage.qha;
import defpackage.r09;
import defpackage.s2;
import defpackage.u6b;
import defpackage.ujf;
import defpackage.v30;
import defpackage.v9g;
import defpackage.va5;
import defpackage.vda;
import defpackage.wa5;
import defpackage.wba;
import defpackage.wca;
import defpackage.wzb;
import defpackage.xa5;
import defpackage.xbb;
import defpackage.xw3;
import defpackage.ybe;
import defpackage.zae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/sofascore/results/view/graph/networkanimation/PassingNetworkAnimationView;", "Landroid/view/View;", "", CampaignEx.JSON_KEY_AD_K, "F", "getPitchHorizontalPadding", "()F", "setPitchHorizontalPadding", "(F)V", "pitchHorizontalPadding", "getInnerPaddingHorizontal", "innerPaddingHorizontal", "wba", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PassingNetworkAnimationView extends View {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Drawable e;
    public final RectF f;
    public final RectF g;
    public final Rect h;
    public m41 i;
    public final float j;

    /* renamed from: k, reason: from kotlin metadata */
    public float pitchHorizontalPadding;
    public final String l;
    public g9i m;
    public Function0 n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PassingNetworkAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Drawable mutate;
        Drawable drawable = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.a = ao2.u(272, context);
        float u = ao2.u(4, context);
        this.b = u;
        float u2 = ao2.u(8, context);
        this.c = u2;
        this.d = u + u2;
        Drawable drawable2 = context.getDrawable(R.drawable.ic_football_assist_16);
        if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
            mutate.setTint(context.getColor(R.color.n_lv_1));
            drawable = mutate;
        }
        this.e = drawable;
        this.f = new RectF();
        this.g = new RectF();
        this.h = v9g.z(drawable);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.l, 0, 0);
        this.j = obtainStyledAttributes.getDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.pitchHorizontalPadding = obtainStyledAttributes.getDimension(2, u2);
        this.l = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    public static int d(TeamShirtColors teamShirtColors, String str) {
        String fancyNumber;
        String fancyNumber2;
        Integer num = null;
        if (Intrinsics.c(str, "G")) {
            ShirtColor goalkeeperColor = teamShirtColors != null ? teamShirtColors.getGoalkeeperColor() : null;
            if (goalkeeperColor != null && (fancyNumber2 = goalkeeperColor.getFancyNumber()) != null) {
                num = Integer.valueOf(Color.parseColor(fancyNumber2));
            }
        } else {
            ShirtColor playerColor = teamShirtColors != null ? teamShirtColors.getPlayerColor() : null;
            if (playerColor != null && (fancyNumber = playerColor.getFancyNumber()) != null) {
                num = Integer.valueOf(Color.parseColor(fancyNumber));
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return -16777216;
    }

    private final float getInnerPaddingHorizontal() {
        return this.pitchHorizontalPadding + this.b;
    }

    public final void a() {
        m41 m41Var = this.i;
        if (m41Var != null) {
            ValueAnimator valueAnimator = (ValueAnimator) m41Var.d;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        g9i g9iVar = this.m;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
    }

    public final m09 b(a08 a08Var, int i, Point2D point2D, Point2D point2D2, Point2D point2D3, SegmentEventType segmentEventType) {
        int i2 = m09.t;
        Context context = getContext();
        context.getClass();
        float f = i == 0 ? 3.0f : (i * 8.0f) + 2.0f + 3.0f;
        ArrayList arrayList = new ArrayList();
        o1j.r(arrayList, wa5.c, 5.0f);
        o1j.r(arrayList, wa5.e, 5.0f);
        o1j.r(arrayList, wa5.b, 3.0f);
        return new m09(context, a08Var, f, arrayList, point2D3, point2D2, point2D, segmentEventType);
    }

    public final r09 c(a08 a08Var, int i) {
        int i2 = r09.m;
        Context context = getContext();
        context.getClass();
        boolean z = i == 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = z ? 0.0f : (i * 8.0f) + 2.0f;
        ArrayList arrayList = new ArrayList();
        if (z) {
            wa5 wa5Var = wa5.d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f += ((va5) it.next()).c;
            }
            arrayList.add(new va5(wa5Var, f, 19.0f));
        } else {
            o1j.r(arrayList, wa5.a, 3.0f);
            o1j.r(arrayList, wa5.d, 13.0f);
            o1j.r(arrayList, wa5.b, 3.0f);
        }
        return new r09(context, a08Var, f2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(List list, int i, boolean z, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2, v30 v30Var) {
        Object obj;
        Context context;
        boolean z2;
        Context context2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        float f;
        float I;
        int i2;
        Point2D goalShotCoordinates;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        Context context3;
        Player player;
        Player player2;
        Player player3;
        List<FootballPassingNetworkSegment> list2 = list;
        list2.getClass();
        this.n = v30Var;
        FootballPassingNetworkSegment footballPassingNetworkSegment = (FootballPassingNetworkSegment) CollectionsKt.j0(list2);
        Point2D playerCoordinates = footballPassingNetworkSegment != null ? footballPassingNetworkSegment.getPlayerCoordinates() : null;
        Point2D goalShotCoordinates2 = footballPassingNetworkSegment != null ? footballPassingNetworkSegment.getGoalShotCoordinates() : null;
        Point2D goalMouthCoordinates = footballPassingNetworkSegment != null ? footballPassingNetworkSegment.getGoalMouthCoordinates() : null;
        if (playerCoordinates == null || goalShotCoordinates2 == null || goalMouthCoordinates == null) {
            return;
        }
        Context context4 = getContext();
        context4.getClass();
        boolean c0 = z ^ hkg.c0(context4);
        RectF rectF = this.f;
        rectF.getClass();
        RectF rectF2 = this.g;
        rectF2.getClass();
        a08 a08Var = new a08();
        a08Var.c = rectF;
        a08Var.d = rectF2;
        a08Var.a = c0;
        a08Var.b = !c0;
        Point2D point2D = goalShotCoordinates2;
        Point2D point2D2 = goalMouthCoordinates;
        SegmentEventType eventType = footballPassingNetworkSegment.getEventType();
        AnimatedGoalType goalType = footballPassingNetworkSegment.getGoalType();
        if (goalType == AnimatedGoalType.PENALTY || goalType == null) {
            r09 c = c(a08Var, 0);
            m09 b = b(a08Var, 0, point2D, playerCoordinates, point2D2, eventType);
            xbb b2 = a.b();
            b2.add(c);
            b2.add(b);
            Unit unit = Unit.a;
            this.i = new m41(this, a.a(b2), c.d);
            return;
        }
        xbb b3 = a.b();
        for (FootballPassingNetworkSegment footballPassingNetworkSegment2 : list2) {
            b3.add(footballPassingNetworkSegment2.getPlayerCoordinates());
            Point2D v = wba.v(footballPassingNetworkSegment2);
            if (v != null) {
                b3.add(v);
            }
        }
        xbb a = a.a(b3);
        int size = a.size();
        ListIterator listIterator = list2.listIterator(list2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (Intrinsics.c(((FootballPassingNetworkSegment) obj).isAssist(), Boolean.TRUE)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        FootballPassingNetworkSegment footballPassingNetworkSegment3 = (FootballPassingNetworkSegment) obj;
        int i4 = mhe.r;
        Context context5 = getContext();
        context5.getClass();
        float f2 = this.pitchHorizontalPadding;
        RectF rectF3 = (RectF) a08Var.c;
        RectF rectF4 = (RectF) a08Var.d;
        ArrayList arrayList = new ArrayList();
        wa5 wa5Var = wa5.d;
        Point2D point2D3 = playerCoordinates;
        float f3 = 8.0f;
        o1j.r(arrayList, wa5Var, (size * 8.0f) + 2.0f);
        wa5 wa5Var2 = wa5.b;
        o1j.r(arrayList, wa5Var2, 3.0f);
        o1j.r(arrayList, wa5.f, 13.0f);
        o1j.r(arrayList, wa5.a, 3.0f);
        mhe mheVar = new mhe(context5, rectF3, rectF4, arrayList, this.j, f2);
        int i5 = ybe.m;
        Context context6 = getContext();
        context6.getClass();
        int size2 = a.size();
        ArrayList arrayList2 = new ArrayList();
        o1j.r(arrayList2, wa5Var, 2.0f);
        o1j.r(arrayList2, wa5.c, size2 * 8.0f);
        o1j.r(arrayList2, wa5Var2, 1.5f);
        ybe ybeVar = new ybe(context6, a08Var, a, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        pw8 pw8Var = null;
        int i6 = 0;
        int i7 = 0;
        for (Object obj2 : list2) {
            int i8 = i6 + 1;
            if (i6 < 0) {
                b.q();
                throw null;
            }
            FootballPassingNetworkSegment footballPassingNetworkSegment4 = (FootballPassingNetworkSegment) obj2;
            FootballPassingNetworkSegment footballPassingNetworkSegment5 = (FootballPassingNetworkSegment) CollectionsKt.a0(i8, list2);
            mhe mheVar2 = mheVar;
            int i9 = i6 + i7;
            boolean c2 = Intrinsics.c(footballPassingNetworkSegment4, footballPassingNetworkSegment3);
            SegmentEventType eventType2 = footballPassingNetworkSegment4.getEventType();
            int i10 = vda.w;
            Context context7 = getContext();
            context7.getClass();
            FootballPassingNetworkSegment footballPassingNetworkSegment6 = (FootballPassingNetworkSegment) CollectionsKt.a0(i6 - 1, list2);
            FootballPassingNetworkSegment footballPassingNetworkSegment7 = (FootballPassingNetworkSegment) CollectionsKt.a0(i8, list2);
            if (!Intrinsics.c(footballPassingNetworkSegment5, footballPassingNetworkSegment3) || footballPassingNetworkSegment5 == null || (player3 = footballPassingNetworkSegment5.getPlayer()) == null || player3.getId() != footballPassingNetworkSegment4.getPlayer().getId()) {
                context = context7;
                z2 = false;
            } else {
                context = context7;
                z2 = true;
            }
            Integer valueOf = Integer.valueOf(footballPassingNetworkSegment4.getPlayer().getId());
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                Player player4 = footballPassingNetworkSegment4.getPlayer();
                context2 = context;
                z3 = c0;
                boolean c3 = Intrinsics.c(footballPassingNetworkSegment4.isHome(), Boolean.TRUE);
                Context context8 = getContext();
                context8.getClass();
                lae laeVar = new lae(context8, player4, i, c3, c3 ? d(teamShirtColors, player4.getPosition()) : d(teamShirtColors2, player4.getPosition()));
                linkedHashMap.put(valueOf, laeVar);
                obj3 = laeVar;
            } else {
                context2 = context;
                z3 = c0;
            }
            Drawable drawable3 = (Drawable) obj3;
            Rect rect = this.h;
            rect.getClass();
            Player player5 = footballPassingNetworkSegment4.getPlayer();
            Point2D playerCoordinates2 = footballPassingNetworkSegment4.getPlayerCoordinates();
            boolean z10 = footballPassingNetworkSegment4.getEventType() == SegmentEventType.GOAL;
            if (footballPassingNetworkSegment6 == null || (player2 = footballPassingNetworkSegment6.getPlayer()) == null) {
                z4 = z10;
            } else {
                z4 = z10;
                if (player5.getId() == player2.getId()) {
                    z5 = true;
                    if (footballPassingNetworkSegment7 != null || (player = footballPassingNetworkSegment7.getPlayer()) == null) {
                        z6 = z5;
                    } else {
                        z6 = z5;
                        if (player5.getId() == player.getId()) {
                            z7 = true;
                            boolean z11 = i9 <= 1 && !z6;
                            z8 = (!z4 || z7 || c2) ? false : true;
                            pw8 pw8Var2 = pw8Var;
                            ArrayList arrayList5 = new ArrayList();
                            z9 = z7;
                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (i9 == 0) {
                                o1j.r(arrayList5, wa5.d, 2.0f);
                            } else if (i9 != 1 || z6) {
                                if (z11) {
                                    o1j.r(arrayList5, wa5.a, 1.5f);
                                    o1j.r(arrayList5, wa5.d, 5.0f);
                                    f = (i9 * f3) + 2.0f;
                                    I = o1j.I(arrayList5);
                                } else {
                                    f = (i9 * f3) + 2.0f;
                                    I = o1j.I(arrayList5);
                                }
                                f4 = f - I;
                            } else {
                                o1j.r(arrayList5, wa5.d, 10.0f);
                            }
                            if (z9) {
                                o1j.r(arrayList5, wa5.c, 3.0f);
                                o1j.r(arrayList5, wa5.e, 5.0f);
                            } else {
                                o1j.r(arrayList5, wa5.d, f3);
                            }
                            if (z8) {
                                o1j.r(arrayList5, wa5.b, 1.5f);
                            } else if (z4 || c2) {
                                wa5 wa5Var3 = wa5.d;
                                float f5 = ybeVar.d - f4;
                                o1j.r(arrayList5, wa5Var3, (f5 - 1.5f) - o1j.I(arrayList5));
                                o1j.r(arrayList5, wa5.b, f5 - o1j.I(arrayList5));
                            }
                            Point2D playerCoordinates3 = footballPassingNetworkSegment6 != null ? footballPassingNetworkSegment6.getPlayerCoordinates() : null;
                            Point2D playerCoordinates4 = footballPassingNetworkSegment7 != null ? footballPassingNetworkSegment7.getPlayerCoordinates() : null;
                            FootballPassingNetworkSegment footballPassingNetworkSegment8 = footballPassingNetworkSegment3;
                            ybe ybeVar2 = ybeVar;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            Context context9 = context2;
                            boolean z12 = z3;
                            arrayList3.add(new vda(context9, a08Var, f4, arrayList5, playerCoordinates2, playerCoordinates3, playerCoordinates4, c2, z2, drawable3, rect, z12));
                            if (c2) {
                                int i11 = pw8.g;
                                float f6 = ((((i9 + 1) * 8.0f) + 2.0f) - 1.5f) - 5.0f;
                                ArrayList arrayList6 = new ArrayList();
                                o1j.r(arrayList6, wa5.a, 1.5f);
                                o1j.r(arrayList6, wa5.e, ((((a.size() * 8.0f) + 2.0f) - f6) - 1.5f) - o1j.I(arrayList6));
                                o1j.r(arrayList6, wa5.b, 1.5f);
                                pw8Var2 = new pw8(this.e, rect, f6, arrayList6);
                            }
                            i2 = eventType2 == null ? -1 : jae.a[eventType2.ordinal()];
                            if ((i2 != 1 || i2 == 2) && (goalShotCoordinates = footballPassingNetworkSegment4.getGoalShotCoordinates()) != null) {
                                int i12 = abe.q;
                                Context context10 = getContext();
                                context10.getClass();
                                eventType2.getClass();
                                float f7 = ((((i9 + 1) * 8.0f) + 2.0f) - 1.5f) - 5.0f;
                                i3 = zae.a[eventType2.ordinal()];
                                if (i3 == 1) {
                                    drawable = context10.getDrawable(R.drawable.ic_football_glove);
                                } else if (i3 != 2) {
                                    context3 = context10;
                                    drawable2 = null;
                                    ArrayList arrayList7 = new ArrayList();
                                    o1j.r(arrayList7, wa5.a, 1.5f);
                                    o1j.r(arrayList7, wa5.d, 5.0f);
                                    o1j.r(arrayList7, wa5.c, 1.5f);
                                    o1j.r(arrayList7, wa5.e, 6.5f);
                                    o1j.r(arrayList7, wa5.b, 1.5f);
                                    arrayList4.add(new abe(context3, a08Var, f7, arrayList7, goalShotCoordinates, drawable2));
                                } else {
                                    drawable = context10.getDrawable(R.drawable.ic_football_woodwork);
                                }
                                drawable2 = drawable;
                                context3 = context10;
                                ArrayList arrayList72 = new ArrayList();
                                o1j.r(arrayList72, wa5.a, 1.5f);
                                o1j.r(arrayList72, wa5.d, 5.0f);
                                o1j.r(arrayList72, wa5.c, 1.5f);
                                o1j.r(arrayList72, wa5.e, 6.5f);
                                o1j.r(arrayList72, wa5.b, 1.5f);
                                arrayList4.add(new abe(context3, a08Var, f7, arrayList72, goalShotCoordinates, drawable2));
                            }
                            if (wba.v(footballPassingNetworkSegment4) != null) {
                                i7++;
                            }
                            list2 = list;
                            i6 = i8;
                            footballPassingNetworkSegment3 = footballPassingNetworkSegment8;
                            ybeVar = ybeVar2;
                            c0 = z12;
                            mheVar = mheVar2;
                            linkedHashMap = linkedHashMap2;
                            pw8Var = pw8Var2;
                            f3 = 8.0f;
                        }
                    }
                    z7 = false;
                    if (i9 <= 1) {
                    }
                    if (!z4) {
                    }
                    pw8 pw8Var22 = pw8Var;
                    ArrayList arrayList52 = new ArrayList();
                    z9 = z7;
                    float f42 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (i9 == 0) {
                    }
                    if (z9) {
                    }
                    if (z8) {
                    }
                    if (footballPassingNetworkSegment6 != null) {
                    }
                    if (footballPassingNetworkSegment7 != null) {
                    }
                    FootballPassingNetworkSegment footballPassingNetworkSegment82 = footballPassingNetworkSegment3;
                    ybe ybeVar22 = ybeVar;
                    LinkedHashMap linkedHashMap22 = linkedHashMap;
                    Context context92 = context2;
                    boolean z122 = z3;
                    arrayList3.add(new vda(context92, a08Var, f42, arrayList52, playerCoordinates2, playerCoordinates3, playerCoordinates4, c2, z2, drawable3, rect, z122));
                    if (c2) {
                    }
                    if (eventType2 == null) {
                    }
                    if (i2 != 1) {
                    }
                    int i122 = abe.q;
                    Context context102 = getContext();
                    context102.getClass();
                    eventType2.getClass();
                    float f72 = ((((i9 + 1) * 8.0f) + 2.0f) - 1.5f) - 5.0f;
                    i3 = zae.a[eventType2.ordinal()];
                    if (i3 == 1) {
                    }
                    drawable2 = drawable;
                    context3 = context102;
                    ArrayList arrayList722 = new ArrayList();
                    o1j.r(arrayList722, wa5.a, 1.5f);
                    o1j.r(arrayList722, wa5.d, 5.0f);
                    o1j.r(arrayList722, wa5.c, 1.5f);
                    o1j.r(arrayList722, wa5.e, 6.5f);
                    o1j.r(arrayList722, wa5.b, 1.5f);
                    arrayList4.add(new abe(context3, a08Var, f72, arrayList722, goalShotCoordinates, drawable2));
                    if (wba.v(footballPassingNetworkSegment4) != null) {
                    }
                    list2 = list;
                    i6 = i8;
                    footballPassingNetworkSegment3 = footballPassingNetworkSegment82;
                    ybeVar = ybeVar22;
                    c0 = z122;
                    mheVar = mheVar2;
                    linkedHashMap = linkedHashMap22;
                    pw8Var = pw8Var22;
                    f3 = 8.0f;
                }
            }
            z5 = false;
            if (footballPassingNetworkSegment7 != null) {
            }
            z6 = z5;
            z7 = false;
            if (i9 <= 1) {
            }
            if (!z4) {
            }
            pw8 pw8Var222 = pw8Var;
            ArrayList arrayList522 = new ArrayList();
            z9 = z7;
            float f422 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i9 == 0) {
            }
            if (z9) {
            }
            if (z8) {
            }
            if (footballPassingNetworkSegment6 != null) {
            }
            if (footballPassingNetworkSegment7 != null) {
            }
            FootballPassingNetworkSegment footballPassingNetworkSegment822 = footballPassingNetworkSegment3;
            ybe ybeVar222 = ybeVar;
            LinkedHashMap linkedHashMap222 = linkedHashMap;
            Context context922 = context2;
            boolean z1222 = z3;
            arrayList3.add(new vda(context922, a08Var, f422, arrayList522, playerCoordinates2, playerCoordinates3, playerCoordinates4, c2, z2, drawable3, rect, z1222));
            if (c2) {
            }
            if (eventType2 == null) {
            }
            if (i2 != 1) {
            }
            int i1222 = abe.q;
            Context context1022 = getContext();
            context1022.getClass();
            eventType2.getClass();
            float f722 = ((((i9 + 1) * 8.0f) + 2.0f) - 1.5f) - 5.0f;
            i3 = zae.a[eventType2.ordinal()];
            if (i3 == 1) {
            }
            drawable2 = drawable;
            context3 = context1022;
            ArrayList arrayList7222 = new ArrayList();
            o1j.r(arrayList7222, wa5.a, 1.5f);
            o1j.r(arrayList7222, wa5.d, 5.0f);
            o1j.r(arrayList7222, wa5.c, 1.5f);
            o1j.r(arrayList7222, wa5.e, 6.5f);
            o1j.r(arrayList7222, wa5.b, 1.5f);
            arrayList4.add(new abe(context3, a08Var, f722, arrayList7222, goalShotCoordinates, drawable2));
            if (wba.v(footballPassingNetworkSegment4) != null) {
            }
            list2 = list;
            i6 = i8;
            footballPassingNetworkSegment3 = footballPassingNetworkSegment822;
            ybeVar = ybeVar222;
            c0 = z1222;
            mheVar = mheVar2;
            linkedHashMap = linkedHashMap222;
            pw8Var = pw8Var222;
            f3 = 8.0f;
        }
        mhe mheVar3 = mheVar;
        ybe ybeVar3 = ybeVar;
        pw8 pw8Var3 = pw8Var;
        int i13 = mz7.k;
        Context context11 = getContext();
        context11.getClass();
        int size3 = a.size();
        ArrayList arrayList8 = new ArrayList();
        o1j.r(arrayList8, wa5.d, 2.0f);
        o1j.r(arrayList8, wa5.c, size3 * 8.0f);
        o1j.r(arrayList8, wa5.b, 1.5f);
        mz7 mz7Var = new mz7(context11, a08Var, a, arrayList8);
        r09 c4 = c(a08Var, a.size());
        m09 b4 = b(a08Var, a.size(), point2D, point2D3, point2D2, SegmentEventType.GOAL);
        xbb b5 = a.b();
        b5.add(mheVar3);
        b5.add(ybeVar3);
        b5.addAll(arrayList3);
        b5.addAll(arrayList4);
        if (pw8Var3 != null) {
            b5.add(pw8Var3);
        }
        b5.add(mz7Var);
        b5.add(c4);
        b5.add(b4);
        Unit unit2 = Unit.a;
        this.i = new m41(this, a.a(b5), mheVar3.d);
    }

    public final void f() {
        m41 m41Var = this.i;
        if (m41Var != null) {
            ValueAnimator valueAnimator = (ValueAnimator) m41Var.d;
            valueAnimator.addUpdateListener(new s2(m41Var, 9));
            valueAnimator.start();
            if (this.l != null) {
                g9i g9iVar = this.m;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                u6b w = qha.w(this);
                this.m = w != null ? xw3.L(wca.x(w.getLifecycle()), null, null, new ppa(this, r1, 22), 3) : null;
            }
        }
    }

    public final float getPitchHorizontalPadding() {
        return this.pitchHorizontalPadding;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Function0 function0 = this.n;
        if (function0 != null) {
            function0.invoke();
        }
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        m41 m41Var = this.i;
        if (m41Var != null) {
            canvas.getClass();
            for (xa5 xa5Var : (List) m41Var.a) {
                float f = xa5Var.a;
                float f2 = xa5Var.d + f;
                float f3 = m41Var.b;
                if (f <= f3 && f3 <= f2) {
                    xa5Var.c = f3 - f;
                    xa5Var.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int b;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824 && size < (b = wzb.b(this.a))) {
            size = b;
        }
        float f = size;
        int b2 = wzb.b((2.0f * this.c) + mz1.c(this.pitchHorizontalPadding, 2.0f, f, 1.4782609f));
        if (mode2 == Integer.MIN_VALUE ? b2 <= size2 : mode2 != 1073741824) {
            size2 = b2;
        }
        float f2 = size2;
        this.f.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        float innerPaddingHorizontal = getInnerPaddingHorizontal();
        float innerPaddingHorizontal2 = f - getInnerPaddingHorizontal();
        float f3 = this.d;
        this.g.set(innerPaddingHorizontal, f3, innerPaddingHorizontal2, f2 - f3);
        setMeasuredDimension(size, size2);
    }

    public final void setPitchHorizontalPadding(float f) {
        this.pitchHorizontalPadding = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PassingNetworkAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
