package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.results.f;
import com.ironsource.U3;
import com.ironsource.W3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.newNetwork.commentary.SegmentEventType;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class wba {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static volatile String e;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.equals("OTL") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r3 = r2.getString(com.sofascore.results.R.string.any_sport_losses_short);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r3.equals("L") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A(Context context, String str) {
        context.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 68) {
            if (hashCode != 76) {
                if (hashCode != 87) {
                    if (hashCode == 78599) {
                    }
                } else if (str.equals("W")) {
                    str = context.getString(R.string.any_sport_wins_short);
                }
            }
        } else if (str.equals("D")) {
            str = context.getString(R.string.any_sport_draws_short);
        }
        str.getClass();
        return str;
    }

    public static final int B(a1h a1hVar, byte b2, int i, int i2) {
        if (i < 0 || i >= a1hVar.a()) {
            ogj.h(String.valueOf(i));
            return 0;
        }
        if (i > i2 || i2 > a1hVar.a()) {
            ogj.h(String.valueOf(i2));
            return 0;
        }
        int i3 = a1hVar.b;
        byte[] bArr = a1hVar.a;
        while (i < i2) {
            if (bArr[i3 + i] == b2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List C(mlh mlhVar, int i, mlh mlhVar2, boolean z, boolean z2, boolean z3) {
        km5 km5Var;
        boolean z4;
        int i2;
        int i3;
        int t = mlhVar.t(i);
        int i4 = i + t;
        int f = mlhVar.f(mlhVar.q(i), mlhVar.b);
        int f2 = mlhVar.f(mlhVar.q(i4), mlhVar.b);
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (mlhVar.b[(mlhVar.q(i) * 5) + 1] & 201326592) != 0;
        mlhVar2.v(t);
        mlhVar2.w(i5, mlhVar2.t);
        if (mlhVar.g < i4) {
            mlhVar.A(i4);
        }
        if (mlhVar.k < f2) {
            mlhVar.B(f2, i4);
        }
        int[] iArr = mlhVar2.b;
        int i6 = mlhVar2.t;
        int i7 = i6 * 5;
        mh0.e(i7, i * 5, mlhVar.b, iArr, i4 * 5);
        Object[] objArr = mlhVar2.c;
        int i8 = mlhVar2.i;
        System.arraycopy(mlhVar.c, f, objArr, i8, i5);
        int i9 = mlhVar2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + t;
        int f3 = i8 - mlhVar2.f(i6, iArr);
        int i12 = mlhVar2.m;
        int i13 = mlhVar2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int f4 = mlhVar2.f(i15, iArr) + f3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = mlhVar2.k;
            }
            iArr2[(i15 * 5) + 4] = mlh.h(f4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        mlhVar2.m = i14;
        int b2 = llh.b(mlhVar.d, i, mlhVar.o());
        int b3 = llh.b(mlhVar.d, i4, mlhVar.o());
        if (b2 < b3) {
            ArrayList arrayList = mlhVar.d;
            ArrayList arrayList2 = new ArrayList(b3 - b2);
            for (int i17 = b2; i17 < b3; i17++) {
                vu8 vu8Var = (vu8) arrayList.get(i17);
                vu8Var.a += i10;
                arrayList2.add(vu8Var);
            }
            mlhVar2.d.addAll(llh.b(mlhVar2.d, mlhVar2.t, mlhVar2.o()), arrayList2);
            arrayList.subList(b2, b3).clear();
            km5Var = arrayList2;
        } else {
            km5Var = km5.a;
        }
        if (!km5Var.isEmpty()) {
            HashMap hashMap = mlhVar.e;
            HashMap hashMap2 = mlhVar2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = km5Var.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = mlhVar2.v;
        mlhVar2.P(i9);
        int F = mlhVar.F(i, mlhVar.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = F >= 0;
            if (z7) {
                mlhVar.Q();
                mlhVar.a(F - mlhVar.t);
                mlhVar.Q();
            }
            mlhVar.a(i - mlhVar.t);
            boolean I = mlhVar.I();
            if (z7) {
                mlhVar.N();
                mlhVar.i();
                mlhVar.N();
                mlhVar.i();
            }
            z4 = I;
        } else {
            boolean J = mlhVar.J(i, t);
            mlhVar.K(f, i5, i - 1);
            z4 = J;
        }
        if (z4) {
            sf3.a("Unexpectedly removed anchors");
        }
        int i20 = mlhVar2.o;
        int i21 = iArr3[i7 + 1];
        mlhVar2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            mlhVar2.t = i11;
            mlhVar2.i = i8 + i5;
        }
        if (z6) {
            mlhVar2.V(i9);
        }
        return km5Var;
    }

    public static final void H(evd evdVar, int i, Object obj) {
        evdVar.g[(evdVar.h - evdVar.c[evdVar.d - 1].b) + i] = obj;
    }

    public static final void I(evd evdVar, int i, Object obj, int i2, Object obj2) {
        int i3 = evdVar.h - evdVar.c[evdVar.d - 1].b;
        Object[] objArr = evdVar.g;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void J(evd evdVar, Object obj, Object obj2, Object obj3) {
        int i = evdVar.h - evdVar.c[evdVar.d - 1].b;
        Object[] objArr = evdVar.g;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final Object K(sij sijVar, Function2 function2) {
        bea.A(sijVar, true, new u55(n4o.E(sijVar.e.getContext()).g(sijVar.f, sijVar, sijVar.d)));
        return y6a.L(sijVar, false, sijVar, function2);
    }

    public static final TennisTeamSeasonStatistics L(List list) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer matches = ((TennisTeamSeasonStatistics) it.next()).getMatches();
            i += matches != null ? matches.intValue() : 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Integer wins = ((TennisTeamSeasonStatistics) it2.next()).getWins();
            i2 += wins != null ? wins.intValue() : 0;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        Iterator it3 = list.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Integer awardedMatches = ((TennisTeamSeasonStatistics) it3.next()).getAwardedMatches();
            i3 += awardedMatches != null ? awardedMatches.intValue() : 0;
        }
        Integer valueOf3 = Integer.valueOf(i3);
        Iterator it4 = list.iterator();
        int i4 = 0;
        while (it4.hasNext()) {
            Integer aces = ((TennisTeamSeasonStatistics) it4.next()).getAces();
            i4 += aces != null ? aces.intValue() : 0;
        }
        Integer valueOf4 = Integer.valueOf(i4);
        Iterator it5 = list.iterator();
        int i5 = 0;
        while (it5.hasNext()) {
            Integer breakPointsScored = ((TennisTeamSeasonStatistics) it5.next()).getBreakPointsScored();
            i5 += breakPointsScored != null ? breakPointsScored.intValue() : 0;
        }
        Integer valueOf5 = Integer.valueOf(i5);
        Iterator it6 = list.iterator();
        int i6 = 0;
        while (it6.hasNext()) {
            Integer breakPointsTotal = ((TennisTeamSeasonStatistics) it6.next()).getBreakPointsTotal();
            i6 += breakPointsTotal != null ? breakPointsTotal.intValue() : 0;
        }
        Integer valueOf6 = Integer.valueOf(i6);
        Iterator it7 = list.iterator();
        int i7 = 0;
        while (it7.hasNext()) {
            Integer opponentBreakPointsScored = ((TennisTeamSeasonStatistics) it7.next()).getOpponentBreakPointsScored();
            i7 += opponentBreakPointsScored != null ? opponentBreakPointsScored.intValue() : 0;
        }
        Integer valueOf7 = Integer.valueOf(i7);
        Iterator it8 = list.iterator();
        int i8 = 0;
        while (it8.hasNext()) {
            Integer opponentBreakPointsTotal = ((TennisTeamSeasonStatistics) it8.next()).getOpponentBreakPointsTotal();
            i8 += opponentBreakPointsTotal != null ? opponentBreakPointsTotal.intValue() : 0;
        }
        Integer valueOf8 = Integer.valueOf(i8);
        Iterator it9 = list.iterator();
        int i9 = 0;
        while (it9.hasNext()) {
            Integer firstServePointsScored = ((TennisTeamSeasonStatistics) it9.next()).getFirstServePointsScored();
            i9 += firstServePointsScored != null ? firstServePointsScored.intValue() : 0;
        }
        Integer valueOf9 = Integer.valueOf(i9);
        Iterator it10 = list.iterator();
        int i10 = 0;
        while (it10.hasNext()) {
            Integer firstServePointsTotal = ((TennisTeamSeasonStatistics) it10.next()).getFirstServePointsTotal();
            i10 += firstServePointsTotal != null ? firstServePointsTotal.intValue() : 0;
        }
        Integer valueOf10 = Integer.valueOf(i10);
        Iterator it11 = list.iterator();
        int i11 = 0;
        while (it11.hasNext()) {
            Integer firstServeTotal = ((TennisTeamSeasonStatistics) it11.next()).getFirstServeTotal();
            i11 += firstServeTotal != null ? firstServeTotal.intValue() : 0;
        }
        Integer valueOf11 = Integer.valueOf(i11);
        Iterator it12 = list.iterator();
        int i12 = 0;
        while (it12.hasNext()) {
            Integer secondServePointsScored = ((TennisTeamSeasonStatistics) it12.next()).getSecondServePointsScored();
            i12 += secondServePointsScored != null ? secondServePointsScored.intValue() : 0;
        }
        Integer valueOf12 = Integer.valueOf(i12);
        Iterator it13 = list.iterator();
        int i13 = 0;
        while (it13.hasNext()) {
            Integer secondServePointsTotal = ((TennisTeamSeasonStatistics) it13.next()).getSecondServePointsTotal();
            i13 += secondServePointsTotal != null ? secondServePointsTotal.intValue() : 0;
        }
        Integer valueOf13 = Integer.valueOf(i13);
        Iterator it14 = list.iterator();
        int i14 = 0;
        while (it14.hasNext()) {
            Integer secondServeTotal = ((TennisTeamSeasonStatistics) it14.next()).getSecondServeTotal();
            i14 += secondServeTotal != null ? secondServeTotal.intValue() : 0;
        }
        Integer valueOf14 = Integer.valueOf(i14);
        Iterator it15 = list.iterator();
        int i15 = 0;
        while (it15.hasNext()) {
            Integer tiebreakLosses = ((TennisTeamSeasonStatistics) it15.next()).getTiebreakLosses();
            i15 += tiebreakLosses != null ? tiebreakLosses.intValue() : 0;
        }
        Integer valueOf15 = Integer.valueOf(i15);
        Iterator it16 = list.iterator();
        int i16 = 0;
        while (it16.hasNext()) {
            Integer tiebreaksWon = ((TennisTeamSeasonStatistics) it16.next()).getTiebreaksWon();
            i16 += tiebreaksWon != null ? tiebreaksWon.intValue() : 0;
        }
        Integer valueOf16 = Integer.valueOf(i16);
        Iterator it17 = list.iterator();
        int i17 = 0;
        while (it17.hasNext()) {
            Integer totalServeAttempts = ((TennisTeamSeasonStatistics) it17.next()).getTotalServeAttempts();
            i17 += totalServeAttempts != null ? totalServeAttempts.intValue() : 0;
        }
        Integer valueOf17 = Integer.valueOf(i17);
        Iterator it18 = list.iterator();
        int i18 = 0;
        while (it18.hasNext()) {
            Integer doubleFaults = ((TennisTeamSeasonStatistics) it18.next()).getDoubleFaults();
            i18 += doubleFaults != null ? doubleFaults.intValue() : 0;
        }
        Integer valueOf18 = Integer.valueOf(i18);
        String groundType = ((TennisTeamSeasonStatistics) CollectionsKt.Y(list)).getGroundType();
        Iterator it19 = list.iterator();
        int i19 = 0;
        while (it19.hasNext()) {
            Integer tournamentsWon = ((TennisTeamSeasonStatistics) it19.next()).getTournamentsWon();
            i19 += tournamentsWon != null ? tournamentsWon.intValue() : 0;
        }
        Integer valueOf19 = Integer.valueOf(i19);
        Iterator it20 = list.iterator();
        int i20 = 0;
        while (it20.hasNext()) {
            Integer tournamentsPlayed = ((TennisTeamSeasonStatistics) it20.next()).getTournamentsPlayed();
            i20 += tournamentsPlayed != null ? tournamentsPlayed.intValue() : 0;
        }
        return new TennisTeamSeasonStatistics(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, groundType, valueOf19, Integer.valueOf(i20));
    }

    public static final Rect M(x6a x6aVar) {
        return new Rect(x6aVar.a, x6aVar.b, x6aVar.c, x6aVar.d);
    }

    public static final RectF N(oqf oqfVar) {
        return new RectF(oqfVar.a, oqfVar.b, oqfVar.c, oqfVar.d);
    }

    public static final oqf O(Rect rect) {
        return new oqf(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final oqf P(RectF rectF) {
        return new oqf(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final nna Q(z25 z25Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o7l.a.a(z25Var);
        }
        Map map = aoa.a;
        if (z25Var instanceof q25) {
            return nna.EXACT;
        }
        if (z25Var instanceof x25) {
            return nna.WRAP;
        }
        if (z25Var instanceof s25) {
            return nna.FILL;
        }
        if (z25Var instanceof r25) {
            return nna.EXPAND;
        }
        a70.r("After resolution, no other type should be present");
        return null;
    }

    public static final wna R(int i) {
        if (i == 0) {
            return wna.TOP;
        }
        if (i == 1) {
            return wna.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return wna.BOTTOM;
        }
        pvd.z(go.b(i), "unknown vertical alignment ");
        return null;
    }

    public static final ona S(int i) {
        if (i == 0) {
            return ona.START;
        }
        if (i == 1) {
            return ona.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return ona.END;
        }
        pvd.z(eo.b(i), "unknown horizontal alignment ");
        return null;
    }

    public static final Object U(long j, Function2 function2, sq3 sq3Var) {
        if (j <= 0) {
            throw new qij("Timed out immediately", null);
        }
        Object K = K(new sij(j, sq3Var), function2);
        lu3 lu3Var = lu3.a;
        return K;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(long j, Function2 function2, rq3 rq3Var) {
        tij tijVar;
        int i;
        fsf fsfVar;
        if (rq3Var instanceof tij) {
            tijVar = (tij) rq3Var;
            int i2 = tijVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tijVar.t = i2 - Integer.MIN_VALUE;
                Object obj = tijVar.s;
                lu3 lu3Var = lu3.a;
                i = tijVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    if (j > 0) {
                        fsf fsfVar2 = new fsf();
                        try {
                            tijVar.r = fsfVar2;
                            tijVar.t = 1;
                            sij sijVar = new sij(j, tijVar);
                            fsfVar2.a = sijVar;
                            Object K = K(sijVar, function2);
                            return K == lu3Var ? lu3Var : K;
                        } catch (qij e2) {
                            e = e2;
                            fsfVar = fsfVar2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fsfVar = tijVar.r;
                try {
                    y6a.M(obj);
                    return obj;
                } catch (qij e3) {
                    e = e3;
                }
                if (e.a != fsfVar.a) {
                    throw e;
                }
                return null;
            }
        }
        tijVar = new tij(rq3Var);
        Object obj2 = tijVar.s;
        lu3 lu3Var2 = lu3.a;
        i = tijVar.t;
        if (i != 0) {
        }
        if (e.a != fsfVar.a) {
        }
        return null;
    }

    public static final Object W(long j, Function2 function2, sq3 sq3Var) {
        return V(n4o.R(j), function2, sq3Var);
    }

    public static void X(Object obj, Object obj2) {
        if (obj == null) {
            yhk.s("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            yhk.s(lnb.o("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static boolean Y(String str) {
        return str == null || str.isEmpty();
    }

    public static final void a(boolean z, Function1 function1, of3 of3Var, int i) {
        int i2;
        boolean z2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1965482380);
        int i3 = i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc c0 = l98.c0(n9e.q(bkh.d(utc.a, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                av8Var.d0(2040043631);
                String v = oea.v(R.string.mma_career_stats, av8Var);
                long D = lz.D(R.color.n_lv_1, av8Var);
                yf8 yf8Var = xth.a;
                z2 = true;
                udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                nq8.h(av8Var, new goa(1.0f, true));
                i2 = 0;
                av8Var.s(false);
            } else {
                z2 = true;
                i2 = 0;
                av8Var.d0(2040354034);
                av8Var.s(false);
            }
            tba.c(function1, av8Var, (i3 >> 3) & 14);
            av8Var.s(z2);
        } else {
            i2 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new krc(z, function1, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(hwi hwiVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        int i3;
        long j;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1129821067);
        int i4 = i | (av8Var.g(hwiVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            n7g a2 = o7g.a(16.0f);
            boolean z = hwiVar.d;
            boolean z2 = hwiVar.c;
            if (z) {
                i2 = 868688072;
                i3 = R.color.bg_primary_tonal;
            } else if (z2) {
                av8Var.d0(868689728);
                av8Var.s(false);
                j = r13.h;
                long f = !z ? ljg.f(av8Var, 868693032, R.color.primary_default, av8Var, false) : z2 ? ljg.f(av8Var, 868694494, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, 868695326, R.color.n_lv_4, av8Var, false);
                if (!z) {
                    j2 = ljg.f(av8Var, 868697672, R.color.primary_default, av8Var, false);
                } else if (z2) {
                    j2 = ljg.f(av8Var, 868699134, R.color.n_lv_4, av8Var, false);
                } else {
                    av8Var.d0(868700160);
                    av8Var.s(false);
                    j2 = r13.h;
                }
                mv1 mv1Var = uxf.g;
                xtc d0 = l98.d0(tol.y(yso.o(n9e.q(wnn.A(bkh.e(xtcVar, 60.0f), a2), j, a2), 1.0f, j2, a2), hwiVar.c, false, false, 0L, null, function0, av8Var, 30), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                k1c c2 = e12.c(mv1Var, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.q0();
                } else {
                    av8Var.l(zg3Var);
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                String str = hwiVar.b;
                yf8 yf8Var = xth.a;
                udj.c(str, null, f, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(true);
            } else {
                i2 = 868690626;
                i3 = R.color.surface_2;
            }
            j = ljg.f(av8Var, i2, i3, av8Var, false);
            if (!z) {
            }
            if (!z) {
            }
            mv1 mv1Var2 = uxf.g;
            xtc d02 = l98.d0(tol.y(yso.o(n9e.q(wnn.A(bkh.e(xtcVar, 60.0f), a2), j, a2), 1.0f, j2, a2), hwiVar.c, false, false, 0L, null, function0, av8Var, 30), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c22 = e12.c(mv1Var2, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d02);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, c22, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            String str2 = hwiVar.b;
            yf8 yf8Var2 = xth.a;
            udj.c(str2, null, f, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(hwiVar, function0, xtcVar, i, 4);
        }
    }

    public static final void c(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2089478234);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            int i4 = 6;
            s02.n(xtcVar, new ng0(8.0f, true, new a70(i4)), new ng0(8.0f, true, new a70(i4)), null, 4, 0, yqo.H(238352289, av8Var, new sr6(gv9Var, function1, i3)), av8Var, 1597878, 40);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(gv9Var, function1, xtcVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final int i, final String str, final String str2, final Long l, final NewsProvider newsProvider, final Function2 function2, xtc xtcVar, String str3, of3 of3Var, final int i2, final int i3) {
        int i4;
        String str4;
        final xtc xtcVar2;
        final String str5;
        eqf u;
        function2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1003943153);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.g(l) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.i(newsProvider) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = 1572864 | i4;
        int i6 = i3 & 128;
        if (i6 != 0) {
            i5 = 14155776 | i4;
        } else if ((12582912 & i2) == 0) {
            str4 = str3;
            i5 |= av8Var.g(str4) ? 8388608 : 4194304;
            if (av8Var.T(i5 & 1, (4793491 & i5) == 4793490)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                str5 = str4;
            } else {
                if (i6 != 0) {
                    str4 = null;
                }
                final String str6 = str4;
                utc utcVar = utc.a;
                un0.a(kda.O(utcVar, "news_card", av8Var), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-1162486271, av8Var, new ct8() { // from class: acd
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        utc utcVar2;
                        float f;
                        of3 of3Var2 = (of3) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((v23) obj).getClass();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                            utc utcVar3 = utc.a;
                            xtc d2 = bkh.d(utcVar3, 1.0f);
                            Object obj4 = Function2.this;
                            boolean g = av8Var2.g(obj4);
                            int i7 = i;
                            boolean e2 = g | av8Var2.e(i7);
                            NewsProvider newsProvider2 = newsProvider;
                            boolean i8 = e2 | av8Var2.i(newsProvider2);
                            Object O = av8Var2.O();
                            if (i8 || O == nf3.a) {
                                O = new hp5(obj4, i7, newsProvider2, 8);
                                av8Var2.n0(O);
                            }
                            xtc y = tol.y(d2, false, false, false, 0L, null, (Function0) O, av8Var2, 31);
                            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m = av8Var2.m();
                            xtc C = fqj.C(av8Var2, y);
                            if3.k7.getClass();
                            Function0 function0 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(function0);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, a2, hf3.g);
                            waa.K(av8Var2, m, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C, hf3.d);
                            haa.b(str, null, n9e.q(bkh.e(bkh.d(utcVar3, 1.0f), 156.0f), lz.D(R.color.n_lv_4, av8Var2), oyn.e), null, wv8.c(lz.D(R.color.n_lv_3, av8Var2), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var2), 12), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 32816, 6, 31720);
                            xtc f0 = l98.f0(utcVar3, 16.0f, 8.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                            String str7 = str2;
                            if (str7 == null) {
                                str7 = "";
                            }
                            long D = lz.D(R.color.n_lv_1, av8Var2);
                            yf8 yf8Var = xth.a;
                            udj.c(str7, f0, D, null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.j(), av8Var2, 0, 24960, 110584);
                            av8 av8Var3 = av8Var2;
                            String str8 = str6;
                            if (str8 != null) {
                                av8Var3.d0(133657240);
                                utcVar2 = utcVar3;
                                f = 16.0f;
                                udj.c(str8, l98.f0(utcVar3, 16.0f, 4.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.b(), av8Var3, 0, 24960, 110584);
                                av8Var3 = av8Var3;
                                av8Var3.s(false);
                            } else {
                                utcVar2 = utcVar3;
                                f = 16.0f;
                                av8Var3.d0(133996907);
                                av8Var3.s(false);
                            }
                            Long l2 = l;
                            av8 av8Var4 = av8Var3;
                            jca.n(newsProvider2, l2 != null ? l2.longValue() : 0L, l98.e0(bkh.d(utcVar2, 1.0f), f, 8.0f, f, f), false, 0L, 0L, av8Var4, 0, 56);
                            av8Var4.s(true);
                        } else {
                            av8Var2.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, 196608, 24);
                xtcVar2 = utcVar;
                str5 = str6;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: bcd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wba.d(i, str, str2, l, newsProvider, function2, xtcVar2, str5, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        str4 = str3;
        if (av8Var.T(i5 & 1, (4793491 & i5) == 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x036b, code lost:
    
        if (r13.e(r4) == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final xtc xtcVar, a6e a6eVar, final p3e p3eVar, final ewd ewdVar, gnh gnhVar, final boolean z, final myd mydVar, int i, final float f, final e5e e5eVar, e9d e9dVar, final fo foVar, final lv1 lv1Var, final lnh lnhVar, final tc3 tc3Var, of3 of3Var, final int i2, final int i3) {
        int i4;
        int i5;
        Object obj;
        e9d e9dVar2;
        int i6;
        av8 av8Var;
        gnh gnhVar2;
        a6e a6eVar2;
        int i7;
        boolean z2;
        boolean g;
        Object q5eVar;
        ewd ewdVar2;
        ku3 ku3Var;
        int i8;
        KProperty0 kProperty0;
        boolean z3;
        boolean h;
        Object O;
        boolean z4;
        Object O2;
        boolean g2;
        Object O3;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-572816025);
        if ((i2 & 6) == 0) {
            i4 = i2 | (av8Var2.g(xtcVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(a6eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(p3eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.h(false) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var2.e(ewdVar.ordinal()) ? 16384 : 8192;
        }
        int i9 = i2 & 196608;
        int i10 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i9 == 0) {
            i4 |= av8Var2.g(gnhVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= av8Var2.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= av8Var2.g(mydVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= av8Var2.e(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= av8Var2.d(f) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (av8Var2.g(e5eVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.i(e9dVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= av8Var2.i(null) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= av8Var2.g(foVar) ? a.o : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= av8Var2.g(lv1Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (av8Var2.g(lnhVar)) {
                i10 = 131072;
            }
            i5 |= i10;
        }
        if ((i3 & 1572864) == 0) {
            obj = tc3Var;
            i5 |= av8Var2.i(obj) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            obj = tc3Var;
        }
        int i11 = i5;
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true)) {
            if (i < 0) {
                u3a.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i);
            }
            int i12 = i4 & 112;
            boolean z5 = i12 == 32;
            Object O4 = av8Var2.O();
            Object obj2 = nf3.a;
            if (z5 || O4 == obj2) {
                O4 = new jt7(a6eVar, 1);
                av8Var2.n0(O4);
            }
            Object obj3 = (Function0) O4;
            int i13 = i4 >> 3;
            int i14 = i13 & 14;
            int i15 = i11 >> 15;
            int i16 = i14 | (i15 & 112) | (i11 & 896);
            Object g3 = e.g(obj, av8Var2);
            Object g4 = e.g(null, av8Var2);
            boolean g5 = ((((i16 & 14) ^ 6) > 4 && av8Var2.g(a6eVar)) || (i16 & 6) == 4) | av8Var2.g(g3) | av8Var2.g(g4) | av8Var2.g(obj3);
            Object O5 = av8Var2.O();
            int i17 = 10;
            if (g5 || O5 == obj2) {
                p4h p4hVar = p4h.g;
                l97 l97Var = new l97(i17, g3, g4, obj3);
                l2a l2aVar = goh.a;
                O5 = new apa(0, 1, cdi.class, new ay4(new ij8(23, new ay4(l97Var, p4hVar), a6eVar), p4hVar), U3.i.X, "getValue()Ljava/lang/Object;");
                av8Var2.n0(O5);
            }
            KProperty0 kProperty02 = (KProperty0) O5;
            Object O6 = av8Var2.O();
            if (O6 == obj2) {
                O6 = hz8.G(g.a, av8Var2);
                av8Var2.n0(O6);
            }
            ku3 ku3Var2 = (ku3) O6;
            boolean z6 = i12 == 32;
            Object O7 = av8Var2.O();
            if (z6 || O7 == obj2) {
                O7 = new jt7(a6eVar, 2);
                av8Var2.n0(O7);
            }
            Function0 function0 = (Function0) O7;
            int i18 = i4 >> 9;
            int i19 = (i4 & 65520) | (i18 & 458752) | (i18 & 3670016) | ((i11 << 21) & 29360128);
            int i20 = i11 << 15;
            int i21 = i19 | (i20 & 234881024) | (i20 & 1879048192);
            boolean g6 = ((((i21 & 896) ^ 384) > 256 && av8Var2.g(p3eVar)) || (i21 & 384) == 256) | ((((i21 & 112) ^ 48) > 32 && av8Var2.g(a6eVar)) || (i21 & 48) == 32) | ((((i21 & 7168) ^ 3072) > 2048 && av8Var2.h(false)) || (i21 & 3072) == 2048) | ((((57344 & i21) ^ 24576) > 16384 && av8Var2.e(ewdVar.ordinal())) || (i21 & 24576) == 16384) | ((((i21 & 234881024) ^ 100663296) > 67108864 && av8Var2.g(foVar)) || (i21 & 100663296) == 67108864) | ((((i21 & 1879048192) ^ 805306368) > 536870912 && av8Var2.g(lv1Var)) || (i21 & 805306368) == 536870912) | ((((i21 & 3670016) ^ 1572864) > 1048576 && av8Var2.d(f)) || (i21 & 1572864) == 1048576) | ((((i21 & 29360128) ^ 12582912) > 8388608 && av8Var2.g(e5eVar)) || (i21 & 12582912) == 8388608) | ((((i15 & 14) ^ 6) > 4 && av8Var2.g(lnhVar)) || (i15 & 6) == 4) | av8Var2.g(function0);
            if (((i21 & 458752) ^ 196608) > 131072) {
                i7 = i;
            } else {
                i7 = i;
            }
            if ((i21 & 196608) != 131072) {
                z2 = false;
                g = g6 | z2 | av8Var2.g(ku3Var2);
                Object O8 = av8Var2.O();
                if (!g || O8 == obj2) {
                    i6 = i7;
                    av8Var = av8Var2;
                    ewdVar2 = ewdVar;
                    ku3Var = ku3Var2;
                    i8 = 4;
                    q5eVar = new q5e(a6eVar, ewdVar2, p3eVar, f, e5eVar, kProperty02, function0, lv1Var, foVar, i6, lnhVar, ku3Var);
                    kProperty0 = kProperty02;
                    av8Var.n0(q5eVar);
                } else {
                    ku3Var = ku3Var2;
                    kProperty0 = kProperty02;
                    q5eVar = O8;
                    av8Var = av8Var2;
                    i8 = 4;
                    i6 = i7;
                    ewdVar2 = ewdVar;
                }
                vqa vqaVar = (vqa) q5eVar;
                ewd ewdVar3 = ewd.a;
                z3 = ewdVar2 != ewdVar3;
                h = (((i14 ^ 6) <= i8 && av8Var.g(a6eVar)) || (i13 & 6) == i8) | av8Var.h(z3);
                O = av8Var.O();
                if (!h || O == obj2) {
                    O = new jra(a6eVar, z3);
                    av8Var.n0(O);
                }
                ira iraVar = (ira) O;
                z4 = (i12 != 32) | ((i4 & 458752) != 131072);
                O2 = av8Var.O();
                if (!z4 || O2 == obj2) {
                    gnhVar2 = gnhVar;
                    O2 = new e6e(gnhVar2, a6eVar);
                    av8Var.n0(O2);
                } else {
                    gnhVar2 = gnhVar;
                }
                e6e e6eVar = (e6e) O2;
                a42 a42Var = (a42) av8Var.k(d42.a);
                ema emaVar = (ema) av8Var.k(dh3.n);
                av8Var.d0(-853904960);
                g2 = (i12 != 32) | av8Var.g(a42Var) | av8Var.e(emaVar.ordinal());
                O3 = av8Var.O();
                if (!g2 || O3 == obj2) {
                    O3 = new i5e(a6eVar, a42Var, emaVar);
                    av8Var.n0(O3);
                }
                i5e i5eVar = (i5e) O3;
                av8Var.s(false);
                utc utcVar = utc.a;
                if (z) {
                    av8Var.d0(-853054661);
                    av8Var.s(false);
                    xtcVar2 = utcVar;
                } else {
                    av8Var.d0(-853484445);
                    int i22 = i14 | ((i4 >> 21) & 112);
                    boolean z7 = ((((i22 & 112) ^ 48) > 32 && av8Var.e(i6)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) > 4 && av8Var.g(a6eVar)) || (i22 & 6) == 4);
                    Object O9 = av8Var.O();
                    if (z7 || O9 == obj2) {
                        O9 = new h5e(a6eVar, i6);
                        av8Var.n0(O9);
                    }
                    xtcVar2 = gvd.F((h5e) O9, a6eVar.u, ewdVar2);
                    av8Var.s(false);
                }
                xtc G = fkf.G(xtcVar.z(a6eVar.x).z(a6eVar.v), kProperty0, iraVar, ewdVar2, z);
                xtc X = kik.X((!z ? G.z(o3h.a(utcVar, false, new gk(ewdVar2 != ewdVar3, a6eVar, ku3Var, 10))) : G.z(utcVar)).z(xtcVar2), a6eVar, ewdVar, mydVar, z, e6eVar, a6eVar.p, i5eVar);
                a6eVar2 = a6eVar;
                xtc z8 = X.z(koi.a(utcVar, a6eVar2, new m00(a6eVar2, 1)));
                e9dVar2 = e9dVar;
                tba.b(kProperty0, lz.J(z8, e9dVar2, null), a6eVar2.s, vqaVar, av8Var, 0);
            }
            z2 = true;
            g = g6 | z2 | av8Var2.g(ku3Var2);
            Object O82 = av8Var2.O();
            if (g) {
            }
            i6 = i7;
            av8Var = av8Var2;
            ewdVar2 = ewdVar;
            ku3Var = ku3Var2;
            i8 = 4;
            q5eVar = new q5e(a6eVar, ewdVar2, p3eVar, f, e5eVar, kProperty02, function0, lv1Var, foVar, i6, lnhVar, ku3Var);
            kProperty0 = kProperty02;
            av8Var.n0(q5eVar);
            vqa vqaVar2 = (vqa) q5eVar;
            ewd ewdVar32 = ewd.a;
            if (ewdVar2 != ewdVar32) {
            }
            h = (((i14 ^ 6) <= i8 && av8Var.g(a6eVar)) || (i13 & 6) == i8) | av8Var.h(z3);
            O = av8Var.O();
            if (!h) {
            }
            O = new jra(a6eVar, z3);
            av8Var.n0(O);
            ira iraVar2 = (ira) O;
            z4 = (i12 != 32) | ((i4 & 458752) != 131072);
            O2 = av8Var.O();
            if (z4) {
            }
            gnhVar2 = gnhVar;
            O2 = new e6e(gnhVar2, a6eVar);
            av8Var.n0(O2);
            e6e e6eVar2 = (e6e) O2;
            a42 a42Var2 = (a42) av8Var.k(d42.a);
            ema emaVar2 = (ema) av8Var.k(dh3.n);
            av8Var.d0(-853904960);
            g2 = (i12 != 32) | av8Var.g(a42Var2) | av8Var.e(emaVar2.ordinal());
            O3 = av8Var.O();
            if (!g2) {
            }
            O3 = new i5e(a6eVar, a42Var2, emaVar2);
            av8Var.n0(O3);
            i5e i5eVar2 = (i5e) O3;
            av8Var.s(false);
            utc utcVar2 = utc.a;
            if (z) {
            }
            xtc G2 = fkf.G(xtcVar.z(a6eVar.x).z(a6eVar.v), kProperty0, iraVar2, ewdVar2, z);
            xtc X2 = kik.X((!z ? G2.z(o3h.a(utcVar2, false, new gk(ewdVar2 != ewdVar32, a6eVar, ku3Var, 10))) : G2.z(utcVar2)).z(xtcVar2), a6eVar, ewdVar, mydVar, z, e6eVar2, a6eVar.p, i5eVar2);
            a6eVar2 = a6eVar;
            xtc z82 = X2.z(koi.a(utcVar2, a6eVar2, new m00(a6eVar2, 1)));
            e9dVar2 = e9dVar;
            tba.b(kProperty0, lz.J(z82, e9dVar2, null), a6eVar2.s, vqaVar2, av8Var, 0);
        } else {
            e9dVar2 = e9dVar;
            i6 = i;
            av8Var = av8Var2;
            gnhVar2 = gnhVar;
            a6eVar2 = a6eVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final e9d e9dVar3 = e9dVar2;
            final a6e a6eVar3 = a6eVar2;
            final int i23 = i6;
            final gnh gnhVar3 = gnhVar2;
            u.d = new Function2() { // from class: zqa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int K = aba.K(i2 | 1);
                    int K2 = aba.K(i3);
                    wba.e(xtc.this, a6eVar3, p3eVar, ewdVar, gnhVar3, z, mydVar, i23, f, e5eVar, e9dVar3, foVar, lv1Var, lnhVar, tc3Var, (of3) obj4, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i, long j, String str, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        zg3 zg3Var;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1536945871);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.f(j) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | 24576;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            long D = lz.D(R.color.surface_P, av8Var);
            jf9 jf9Var = oyn.e;
            utc utcVar = utc.a;
            xtc b0 = l98.b0(bkh.d(n9e.q(utcVar, D, jf9Var), 1.0f), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            yf8 yf8Var = xth.a;
            dfj e2 = xth.e();
            String string = context.getString(R.string.streak_restore_text);
            string.getClass();
            udj.c(string, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, av8Var, 0, 0, 131066);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc c0 = l98.c0(n9e.q(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f)), 16.0f, 24.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.a(haa.t(R.drawable.ic_weekly_streak, 0, av8Var), null, bkh.l(utcVar, 24.0f), r13.i, av8Var, 3512, 0);
            xtc f02 = l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            dfj e3 = xth.e();
            String string2 = context.getString(R.string.streak_restore_details, Integer.valueOf(i));
            string2.getClass();
            udj.c(string2, f02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e3, av8Var, 48, 0, 131064);
            w1l.o(1.0f, true, av8Var);
            udj.c(str, l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, ((i3 >> 6) & 14) | 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            xtc a4 = n12.a.a(utcVar, uxf.d);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new u9i(29);
                av8Var.n0(O);
            }
            Function0 function02 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new egi(0);
                av8Var.n0(O2);
            }
            jca.u(a4, j, function02, (Function0) O2, av8Var, (i3 & 112) | 3456);
            av8Var.s(true);
            xtc f03 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String string3 = context.getString(R.string.button_restore);
            string3.getClass();
            ww9.q(f03, string3, true, false, function0, av8Var, ((i3 << 3) & 57344) | 3462, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fgi(i, j, str, function0, xtcVar2, i2);
        }
    }

    public static final void g(iwi iwiVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1735768015);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(iwiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        int i3 = i & 384;
        utc utcVar = utc.a;
        if (i3 == 0) {
            i2 |= av8Var.g(utcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = 1;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i5 = i2 & 14;
            int i6 = i2 & 112;
            i(iwiVar, function1, l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, i5 | 384 | i6);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new rfi(21);
                av8Var.n0(O);
            }
            Function1 function12 = (Function1) O;
            Object O2 = av8Var.O();
            int i7 = 22;
            if (O2 == obj) {
                O2 = new rfi(i7);
                av8Var.n0(O2);
            }
            l98.b(iwiVar, null, function12, null, "month_grid_slide", (Function1) O2, yqo.H(381031989, av8Var, new cb7(i4, function1)), av8Var, i5 | 1794432, 10);
            if (iwiVar.d) {
                bf3.r(16.0f, 1517037409, av8Var, av8Var, utcVar);
                we9 we9Var = new we9(uxf.p);
                String v = oea.v(R.string.today, av8Var);
                bqh bqhVar = new bqh(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), uxf.q);
                boolean z2 = i6 == 32;
                Object O3 = av8Var.O();
                if (z2 || O3 == obj) {
                    O3 = new vbc(22, function1);
                    av8Var.n0(O3);
                }
                z = true;
                mha.h(v, (Function0) O3, we9Var, oqh.a, bqhVar, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2016);
                av8Var.s(false);
            } else {
                z = true;
                av8Var.d0(1517587101);
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(iwiVar, function1, i);
        }
    }

    public static final void h(jwi jwiVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(3368254);
        int i2 = (av8Var.i(jwiVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            ktm.t((vnb) rfo.x(jwiVar.f, av8Var, 0).getValue(), null, false, null, null, yqo.H(-1722100121, av8Var, new e6i(function1, jwiVar)), av8Var, 196608, 30);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(jwiVar, function1, xtcVar2, i, 5);
        }
    }

    public static final void i(iwi iwiVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        ry ryVar;
        boolean z;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1870057560);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(iwiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            gv9 gv9Var = iwiVar.b;
            int i3 = iwiVar.a;
            boolean g = av8Var.g(gv9Var);
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (g || O == obj2) {
                List B0 = CollectionsKt.B0(gv9Var);
                ArrayList arrayList = new ArrayList(k13.r(B0, 10));
                Iterator it = B0.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    arrayList.add(new oxh(Integer.valueOf(intValue), String.valueOf(intValue), null, null, null, false, 252));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            l8g a2 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            Integer num = (Integer) CollectionsKt.firstOrNull(gv9Var);
            if (i3 > (num != null ? num.intValue() : i3)) {
                ryVar = ryVar2;
                z = true;
            } else {
                ryVar = ryVar2;
                z = false;
            }
            int i4 = i2 & 112;
            boolean z2 = i4 == 32;
            Object O2 = av8Var.O();
            if (z2 || O2 == obj2) {
                O2 = new vbc(23, function1);
                av8Var.n0(O2);
            }
            ry ryVar3 = ryVar;
            j(R.drawable.ic_chevron_left, z, (Function0) O2, null, av8Var, 0);
            goa goaVar = new goa(1.0f, true);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar3);
            waa.K(av8Var, C2, f50Var3);
            Iterator<E> it2 = gv9Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((Number) ((oxh) obj).a).intValue() == i3) {
                        break;
                    }
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean z3 = i4 == 32;
            Object O3 = av8Var.O();
            if (z3 || O3 == obj2) {
                O3 = new k1e(17, function1);
                av8Var.n0(O3);
            }
            r4a.j(gv9Var2, oxhVar, (Function1) O3, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
            av8Var = av8Var;
            av8Var.s(true);
            Integer num2 = (Integer) CollectionsKt.j0(gv9Var);
            boolean z4 = i3 < (num2 != null ? num2.intValue() : i3);
            boolean z5 = i4 == 32;
            Object O4 = av8Var.O();
            if (z5 || O4 == obj2) {
                O4 = new vbc(24, function1);
                av8Var.n0(O4);
            }
            j(R.drawable.ic_chevron_right, z4, (Function0) O4, null, av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(iwiVar, function1, xtcVar, i, 7);
        }
    }

    public static final void j(int i, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1448565949);
        int i3 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            if (z) {
                av8Var2.d0(1603363170);
                av8Var = av8Var2;
                xtc b0 = l98.b0(tol.y(n9e.q(wnn.A(utcVar, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var2), oyn.e), false, false, false, 0L, null, function0, av8Var, 31), 4.0f);
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, b0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                kq9.b(s6a.N(i, ((i3 << 3) & 112) | 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                av8Var.d0(1603829224);
                nq8.h(av8Var, bkh.l(utcVar, 32.0f));
                av8Var.s(false);
            }
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i30(i, i2, xtcVar2, function0, z);
        }
    }

    public static gfm k(String str) {
        if (str != null) {
            try {
                String[] iSOCountries = Locale.getISOCountries();
                iSOCountries.getClass();
                for (String str2 : iSOCountries) {
                    if (!c.o(str2, str, true)) {
                    }
                }
                throw new IllegalArgumentException("Invalid geo location code -> ".concat(str).toString());
            } catch (Exception e2) {
                j1m j1mVar = j1m.a;
                f fVar = new f();
                fVar.f = e2;
                j1m.a(fVar);
                return fVar;
            }
        }
        e = str;
        return new ihm(Boolean.TRUE);
    }

    public static gfm l(List list) {
        String str;
        if (list != null) {
            try {
                if (!list.isEmpty() && (str = e) != null && str.length() != 0) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (c.o((String) it.next(), e, true)) {
                                return new ihm(Boolean.TRUE);
                            }
                        }
                    }
                    j1m j1mVar = j1m.a;
                    f fVar = new f();
                    j1m.a(fVar);
                    return fVar;
                }
            } catch (Exception e2) {
                j1m j1mVar2 = j1m.a;
                f fVar2 = new f();
                fVar2.f = e2;
                j1m.a(fVar2);
                return fVar2;
            }
        }
        return new ihm(Boolean.TRUE);
    }

    public static void m(vy1 vy1Var, int i, int i2) {
        LinearLayout linearLayout = vy1Var.b;
        h04 d2 = h04.d(LayoutInflater.from(linearLayout.getContext()), linearLayout);
        ConstraintLayout constraintLayout = d2.b;
        d2.d.setText(i);
        d2.c.setText(i2);
        linearLayout.addView(constraintLayout);
    }

    public static void n(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static kb3 q(String str, String str2) {
        nu0 nu0Var = new nu0(str, str2);
        jb3 b2 = kb3.b(nu0.class);
        b2.e = 1;
        b2.f = new ib3(nu0Var, 0);
        return b2.b();
    }

    public static final una r(mk5 mk5Var) {
        vna vnaVar;
        mna mnaVar;
        tna m = una.m();
        tyd tydVar = tyd.m;
        if (mk5Var instanceof nk5) {
            vnaVar = vna.BOX;
        } else if (mk5Var instanceof uk5) {
            vnaVar = ((uk5) mk5Var).d.c(tydVar) ? vna.RADIO_ROW : vna.ROW;
        } else if (mk5Var instanceof pk5) {
            vnaVar = ((pk5) mk5Var).d.c(tydVar) ? vna.RADIO_COLUMN : vna.COLUMN;
        } else if (mk5Var instanceof xk5) {
            vnaVar = vna.TEXT;
        } else if (mk5Var instanceof tk5) {
            vnaVar = vna.LIST_ITEM;
        } else if (mk5Var instanceof sk5) {
            vnaVar = vna.LAZY_COLUMN;
        } else if (mk5Var instanceof wk5) {
            vnaVar = vna.SPACER;
        } else if (mk5Var instanceof rk5) {
            vnaVar = vna.IMAGE;
        } else if (mk5Var instanceof ok5) {
            vnaVar = vna.CIRCULAR_PROGRESS_INDICATOR;
        } else if (mk5Var instanceof eyf) {
            vnaVar = vna.REMOTE_VIEWS_ROOT;
        } else {
            if (!(mk5Var instanceof vk5)) {
                zzl.i(mk5Var.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            vnaVar = vna.SIZE_BOX;
        }
        m.c();
        ((una) m.b).u(vnaVar);
        a8l a8lVar = (a8l) mk5Var.b().a(null, tdj.o);
        z25 z25Var = x25.a;
        nna Q = Q(a8lVar != null ? a8lVar.a : z25Var);
        m.c();
        ((una) m.b).w(Q);
        q99 q99Var = (q99) mk5Var.b().a(null, tdj.p);
        if (q99Var != null) {
            z25Var = q99Var.a;
        }
        nna Q2 = Q(z25Var);
        m.c();
        ((una) m.b).q(Q2);
        boolean z = mk5Var.b().a(null, tdj.m) != null;
        m.c();
        ((una) m.b).n(z);
        if (mk5Var.b().a(null, tdj.n) != null) {
            m.c();
            ((una) m.b).s();
        }
        if (mk5Var instanceof rk5) {
            rk5 rk5Var = (rk5) mk5Var;
            int i = rk5Var.d;
            if (i == 1) {
                mnaVar = mna.FIT;
            } else if (i == 0) {
                mnaVar = mna.CROP;
            } else {
                if (i != 2) {
                    pvd.z(np3.a(rk5Var.d), "Unknown content scale ");
                    return null;
                }
                mnaVar = mna.FILL_BOUNDS;
            }
            m.c();
            ((una) m.b).t(mnaVar);
            boolean z2 = !c5n.I(rk5Var);
            m.c();
            ((una) m.b).p(z2);
            boolean z3 = rk5Var.c != null;
            m.c();
            ((una) m.b).o(z3);
        } else if (mk5Var instanceof pk5) {
            ona S = S(((pk5) mk5Var).f);
            m.c();
            ((una) m.b).r(S);
        } else if (mk5Var instanceof uk5) {
            wna R = R(((uk5) mk5Var).f);
            m.c();
            ((una) m.b).v(R);
        } else if (mk5Var instanceof nk5) {
            nk5 nk5Var = (nk5) mk5Var;
            ona S2 = S(nk5Var.e.a);
            m.c();
            ((una) m.b).r(S2);
            wna R2 = R(nk5Var.e.b);
            m.c();
            ((una) m.b).v(R2);
        } else if (mk5Var instanceof sk5) {
            ona S3 = S(((sk5) mk5Var).e);
            m.c();
            ((una) m.b).r(S3);
        }
        if ((mk5Var instanceof yk5) && !(mk5Var instanceof sk5)) {
            ArrayList arrayList = ((yk5) mk5Var).c;
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(r((mk5) it.next()));
            }
            m.c();
            ((una) m.b).k(arrayList2);
        }
        return (una) m.a();
    }

    public static final t8e s(v8e v8eVar) {
        v8e v8eVar2 = new v8e(8);
        for (String str : ((Map) v8eVar.b).keySet()) {
            List u = v8eVar.u(str);
            if (u == null) {
                u = km5.a;
            }
            String d2 = xz2.d(0, 0, 15, str);
            ArrayList arrayList = new ArrayList(k13.r(u, 10));
            Iterator it = u.iterator();
            while (it.hasNext()) {
                arrayList.add(xz2.d(0, 0, 11, (String) it.next()));
            }
            v8eVar2.r(d2, arrayList);
        }
        return new w8e((Map) v8eVar2.b);
    }

    public static final y8g t(ku3 ku3Var, XmlPullParser xmlPullParser) {
        boolean z;
        boolean z2;
        String str;
        String h;
        ku3Var.getClass();
        boolean z3 = false;
        qn2 qn2Var = new qn2(0);
        z8g z8gVar = (z8g) qn2Var.b;
        x8g x8gVar = (x8g) qn2Var.a;
        pca pcaVar = (pca) qn2Var.d;
        int eventType = xmlPullParser.getEventType();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (eventType != 1 && s9a.w(ku3Var)) {
            boolean z10 = (!z4 || z5 || z6) ? z3 : true;
            if (eventType == 2) {
                if (yfa.k(xmlPullParser, d9g.p)) {
                    z7 = true;
                } else if (yfa.k(xmlPullParser, d9g.z)) {
                    z4 = true;
                } else {
                    if (yfa.k(xmlPullParser, d9g.Q)) {
                        if (z4) {
                            z5 = true;
                        }
                        z = z4;
                        z2 = z5;
                    } else if (yfa.k(xmlPullParser, d9g.R)) {
                        if (z4) {
                            z6 = true;
                        }
                        z = z4;
                        z2 = z5;
                    } else if (yfa.k(xmlPullParser, d9g.t)) {
                        z9 = true;
                    } else {
                        if (yfa.k(xmlPullParser, d9g.r)) {
                            if (z7) {
                                x8gVar.e = yfa.w(xmlPullParser);
                            }
                        } else if (!yfa.k(xmlPullParser, d9g.q)) {
                            d9g d9gVar = d9g.g;
                            if (yfa.k(xmlPullParser, d9gVar)) {
                                if (z8) {
                                    z8gVar.b = yfa.w(xmlPullParser);
                                }
                            } else if (yfa.k(xmlPullParser, d9g.s)) {
                                if (z7 && (h = yfa.h(xmlPullParser, d9g.y)) != null && h.length() != 0) {
                                    pcaVar.b.add(h);
                                }
                            } else if (yfa.k(xmlPullParser, d9g.w)) {
                                if (z7) {
                                    pcaVar.k = yfa.w(xmlPullParser);
                                }
                            } else if (yfa.k(xmlPullParser, d9g.x)) {
                                if (z7) {
                                    pcaVar.g = yfa.w(xmlPullParser);
                                }
                            } else if (yfa.k(xmlPullParser, d9g.A)) {
                                if (z4) {
                                    ((b9g) qn2Var.c).c = yfa.w(xmlPullParser);
                                }
                            } else if (yfa.k(xmlPullParser, d9g.B)) {
                                if (z4) {
                                    b9g b9gVar = (b9g) qn2Var.c;
                                    String w = yfa.w(xmlPullParser);
                                    if (b9gVar.e == null) {
                                        b9gVar.e = w;
                                    }
                                }
                            } else if (yfa.k(xmlPullParser, d9g.C)) {
                                if (z4) {
                                    b9g b9gVar2 = (b9g) qn2Var.c;
                                    String w2 = yfa.w(xmlPullParser);
                                    if (w2 != null) {
                                        b9gVar2.m.add(w2);
                                    }
                                }
                            } else if (!yfa.k(xmlPullParser, d9g.D)) {
                                z = z4;
                                if (yfa.k(xmlPullParser, d9g.E)) {
                                    if (z) {
                                        String h2 = yfa.h(xmlPullParser, d9gVar);
                                        String h3 = yfa.h(xmlPullParser, d9g.J);
                                        String h4 = yfa.h(xmlPullParser, d9g.P);
                                        z2 = z5;
                                        ((hnf) qn2Var.j).a = h2;
                                        ((hnf) qn2Var.j).b = h3;
                                        ((hnf) qn2Var.j).c = h4;
                                        if (h4 == null || StringsKt.R(h4)) {
                                            if (h3 != null && !StringsKt.R(h3)) {
                                                if (StringsKt.J(h3, "image", true)) {
                                                    ((b9g) qn2Var.c).a(h2);
                                                } else if (StringsKt.J(h3, "audio", true)) {
                                                    b9g b9gVar3 = (b9g) qn2Var.c;
                                                    if (b9gVar3.i == null) {
                                                        b9gVar3.i = h2;
                                                    }
                                                } else if (StringsKt.J(h3, "video", true)) {
                                                    b9g b9gVar4 = (b9g) qn2Var.c;
                                                    if (b9gVar4.j == null) {
                                                        b9gVar4.j = h2;
                                                    }
                                                }
                                            }
                                        } else if (h4.equalsIgnoreCase("image")) {
                                            ((b9g) qn2Var.c).a(h2);
                                        } else if (h4.equalsIgnoreCase("audio")) {
                                            b9g b9gVar5 = (b9g) qn2Var.c;
                                            if (b9gVar5.i == null) {
                                                b9gVar5.i = h2;
                                            }
                                        } else if (h4.equalsIgnoreCase("video")) {
                                            b9g b9gVar6 = (b9g) qn2Var.c;
                                            if (b9gVar6.j == null) {
                                                b9gVar6.j = h2;
                                            }
                                        }
                                    }
                                    z2 = z5;
                                } else {
                                    z2 = z5;
                                    if (yfa.k(xmlPullParser, d9g.F)) {
                                        if (z) {
                                            String h5 = yfa.h(xmlPullParser, d9g.J);
                                            String h6 = yfa.h(xmlPullParser, d9gVar);
                                            String h7 = yfa.h(xmlPullParser, d9g.K);
                                            if (h6 == null) {
                                                h6 = yfa.w(xmlPullParser);
                                            }
                                            ((fnf) qn2Var.i).b = h7 != null ? StringsKt.k0(h7) : null;
                                            ((fnf) qn2Var.i).c = h5;
                                            ((fnf) qn2Var.i).a = h6;
                                            if (h5 != null && StringsKt.J(h5, "image", true)) {
                                                ((b9g) qn2Var.c).a(h6);
                                            } else if (h5 != null && StringsKt.J(h5, "audio", true)) {
                                                b9g b9gVar7 = (b9g) qn2Var.c;
                                                if (b9gVar7.i == null) {
                                                    b9gVar7.i = h6;
                                                }
                                            } else if (h5 != null && StringsKt.J(h5, "video", true)) {
                                                b9g b9gVar8 = (b9g) qn2Var.c;
                                                if (b9gVar8.j == null) {
                                                    b9gVar8.j = h6;
                                                }
                                            } else if (h5 == null && h6 != null) {
                                                ((b9g) qn2Var.c).a(h6);
                                            }
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.M)) {
                                        if (z) {
                                            String h8 = yfa.h(xmlPullParser, d9gVar);
                                            ((b9g) qn2Var.c).k = xmlPullParser.nextText();
                                            ((b9g) qn2Var.c).l = h8;
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.I)) {
                                        if (z) {
                                            ((b9g) qn2Var.c).e = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.L)) {
                                        if (z) {
                                            ((b9g) qn2Var.c).a = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.G)) {
                                        if (z) {
                                            String w3 = yfa.w(xmlPullParser);
                                            ((b9g) qn2Var.c).g = w3;
                                            qn2Var.n(w3);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.H)) {
                                        if (z) {
                                            if (xmlPullParser.next() == 4) {
                                                b9g b9gVar9 = (b9g) qn2Var.c;
                                                String text = xmlPullParser.getText();
                                                text.getClass();
                                                b9gVar9.e = StringsKt.l0(text).toString();
                                            }
                                            z5 = z2;
                                            z4 = z;
                                            z3 = false;
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.S)) {
                                        if (z) {
                                            ((b9g) qn2Var.c).a(yfa.w(xmlPullParser));
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.T)) {
                                        if (z) {
                                            ((rca) qn2Var.e).c = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.V)) {
                                        if (z) {
                                            ((rca) qn2Var.e).d = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.U)) {
                                        if (z) {
                                            ((rca) qn2Var.e).j = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.N)) {
                                        if (z) {
                                            ((b9g) qn2Var.c).o = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.O)) {
                                        if (z) {
                                            ((b9g) qn2Var.c).a(yfa.w(xmlPullParser));
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.u)) {
                                        if (z9) {
                                            ((tca) qn2Var.f).a = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.v)) {
                                        if (z9) {
                                            ((tca) qn2Var.f).b = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.d)) {
                                        if (z7 && !z) {
                                            z8 = true;
                                        } else if (z) {
                                            xmlPullParser.next();
                                            String text2 = xmlPullParser.getText();
                                            String obj = text2 != null ? StringsKt.l0(text2).toString() : null;
                                            if (obj == null || obj.length() == 0) {
                                                xmlPullParser.next();
                                                if (yfa.k(xmlPullParser, d9g.e)) {
                                                    ((b9g) qn2Var.c).a(yfa.w(xmlPullParser));
                                                }
                                            } else {
                                                ((b9g) qn2Var.c).a(obj);
                                            }
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.c)) {
                                        if (z7) {
                                            if (z8) {
                                                z8gVar.a = yfa.w(xmlPullParser);
                                            } else if (z10) {
                                                ((b9g) qn2Var.c).b = yfa.w(xmlPullParser);
                                            } else if (!z) {
                                                x8gVar.a = yfa.w(xmlPullParser);
                                            }
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.e)) {
                                        if (z7) {
                                            if (z8) {
                                                z8gVar.c = yfa.w(xmlPullParser);
                                            } else if (z10) {
                                                ((b9g) qn2Var.c).b(yfa.w(xmlPullParser), null);
                                            } else if (!z) {
                                                x8gVar.b = yfa.w(xmlPullParser);
                                            }
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.h)) {
                                        if (z7) {
                                            if (z10) {
                                                String w4 = yfa.w(xmlPullParser);
                                                ((b9g) qn2Var.c).f = w4;
                                                qn2Var.n(w4);
                                            } else if (z8) {
                                                z8gVar.d = yfa.w(xmlPullParser);
                                            } else if (!z) {
                                                x8gVar.c = yfa.w(xmlPullParser);
                                            }
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.i)) {
                                        if (z) {
                                            ((rca) qn2Var.e).a = yfa.w(xmlPullParser);
                                        } else if (z7) {
                                            pcaVar.a = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.j)) {
                                        if (z) {
                                            ((rca) qn2Var.e).b = yfa.w(xmlPullParser);
                                        } else if (z7) {
                                            pcaVar.c = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.k)) {
                                        String w5 = yfa.w(xmlPullParser);
                                        if (z) {
                                            List h9 = qn2.h(w5);
                                            if (!h9.isEmpty()) {
                                                ((rca) qn2Var.e).g = h9;
                                            }
                                        } else if (z7) {
                                            List h10 = qn2.h(w5);
                                            if (!h10.isEmpty()) {
                                                pcaVar.f = h10;
                                            }
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.l)) {
                                        if (z) {
                                            ((rca) qn2Var.e).f = yfa.h(xmlPullParser, d9g.f);
                                        } else if (z7) {
                                            pcaVar.e = yfa.h(xmlPullParser, d9g.f);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.m)) {
                                        if (z) {
                                            ((rca) qn2Var.e).e = yfa.w(xmlPullParser);
                                        } else if (z7) {
                                            pcaVar.d = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.n)) {
                                        if (z) {
                                            ((rca) qn2Var.e).h = yfa.w(xmlPullParser);
                                        } else if (z7) {
                                            pcaVar.i = yfa.w(xmlPullParser);
                                        }
                                    } else if (yfa.k(xmlPullParser, d9g.o)) {
                                        if (z) {
                                            ((rca) qn2Var.e).i = yfa.w(xmlPullParser);
                                        } else if (z7) {
                                            pcaVar.j = yfa.w(xmlPullParser);
                                        }
                                    }
                                }
                            } else if (z4) {
                                ((b9g) qn2Var.c).a(yfa.h(xmlPullParser, d9gVar));
                            }
                        } else if (z7) {
                            x8gVar.f = yfa.w(xmlPullParser);
                        }
                        z = z4;
                        z2 = z5;
                    }
                    z5 = z2;
                    z4 = z;
                }
                eventType = xmlPullParser.next();
                z3 = false;
            } else {
                z = z4;
                z2 = z5;
                if (eventType == 3 && yfa.k(xmlPullParser, d9g.z)) {
                    qn2Var.b();
                    z5 = z2;
                    z4 = false;
                } else if (eventType == 3 && yfa.k(xmlPullParser, d9g.Q)) {
                    z4 = z;
                    z5 = false;
                } else if (eventType == 3 && yfa.k(xmlPullParser, d9g.R)) {
                    z5 = z2;
                    z4 = z;
                    z6 = false;
                } else if (eventType == 3 && yfa.k(xmlPullParser, d9g.p)) {
                    z5 = z2;
                    z4 = z;
                    z7 = false;
                } else if (eventType == 3 && yfa.k(xmlPullParser, d9g.d)) {
                    z5 = z2;
                    z4 = z;
                    z8 = false;
                } else {
                    if (eventType == 3 && yfa.k(xmlPullParser, d9g.t)) {
                        tca tcaVar = (tca) qn2Var.f;
                        String str2 = tcaVar.a;
                        pcaVar.h = ((str2 == null || StringsKt.R(str2)) && ((str = tcaVar.b) == null || StringsKt.R(str))) ? null : new uca(tcaVar.a, tcaVar.b);
                        qn2Var.f = new tca();
                        z5 = z2;
                        z4 = z;
                        z9 = false;
                    }
                    z5 = z2;
                    z4 = z;
                }
                eventType = xmlPullParser.next();
                z3 = false;
            }
        }
        return qn2Var.a();
    }

    public static kb3 u(String str, hg6 hg6Var) {
        jb3 b2 = kb3.b(nu0.class);
        b2.e = 1;
        b2.a(qx4.c(Context.class));
        b2.f = new ow9(1, str, hg6Var);
        return b2.b();
    }

    public static Point2D v(FootballPassingNetworkSegment footballPassingNetworkSegment) {
        SegmentEventType eventType = footballPassingNetworkSegment.getEventType();
        int i = eventType == null ? -1 : iae.a[eventType.ordinal()];
        if (i == 1 || i == 2) {
            return footballPassingNetworkSegment.getGoalShotCoordinates();
        }
        if (i != 3) {
            return null;
        }
        Point2D gkCoordinates = footballPassingNetworkSegment.getGkCoordinates();
        return gkCoordinates == null ? footballPassingNetworkSegment.getGoalShotCoordinates() : gkCoordinates;
    }

    public static r9k w(String str) {
        r9k x = x(str, true);
        if (x == null) {
            if (str == null) {
                str = "";
            }
            x = new m9k(str);
        }
        return x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{" "}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q9k x(String str, boolean z) {
        String str2;
        List split$default;
        String str3;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (Intrinsics.c(str2, "third-placed teams")) {
            return new q9k(z ? R.string.third_placed_teams_short : R.string.third_placed_teams_long);
        }
        if (str == null || split$default == null || (str3 = (String) CollectionsKt.a0(1, split$default)) == null) {
            return null;
        }
        return new q9k(R.string.competition_group_name, l6g.K(str3));
    }

    public abstract void E(int i);

    public abstract void F(View view, int i, int i2);

    public abstract void G(View view, float f, float f2);

    public abstract boolean T(int i, View view);

    public abstract int o(int i, View view);

    public abstract int p(int i, View view);

    public int y(View view) {
        return 0;
    }

    public int z() {
        return 0;
    }

    public void D(int i, View view) {
    }
}
