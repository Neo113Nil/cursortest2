package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;
import com.blaze.blazesdk.widgets.models.ObjectPositioningRemoteDto;
import com.blaze.blazesdk.widgets.models.ObjectXPositionRemoteDto;
import com.blaze.blazesdk.widgets.models.ObjectYPositionRemoteDto;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.tasks.Task;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSeasonForm;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.results.R;
import com.sofascore.results.profile.ProfileActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class v8a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static Boolean b;
    public static final /* synthetic */ int c = 0;
    public static volatile boolean d;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static String A(Context context, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2108174532:
                    if (str.equals("First half winner")) {
                        return context.getString(R.string.first_half_winner);
                    }
                    break;
                case -2013101263:
                    if (str.equals("Losses")) {
                        return context.getString(R.string.streak_losses);
                    }
                    break;
                case -1956727856:
                    if (str.equals("First to concede")) {
                        return context.getString(R.string.first_to_concede);
                    }
                    break;
                case -1830730192:
                    if (str.equals("No losses")) {
                        return context.getString(R.string.no_losses);
                    }
                    break;
                case -1382765265:
                    if (str.equals("First set loser")) {
                        return context.getString(R.string.first_set_loser);
                    }
                    break;
                case -1254252605:
                    if (str.equals("First quarter winner")) {
                        return context.getString(R.string.first_quarter_winner);
                    }
                    break;
                case -1198246235:
                    if (str.equals("More than 2.5 goals")) {
                        return context.getResources().getQuantityString(R.plurals.over_goals, 2, "2.5");
                    }
                    break;
                case -971999074:
                    if (str.equals("No goals conceded")) {
                        return context.getString(R.string.no_goals_conceded);
                    }
                    break;
                case -578118922:
                    if (str.equals("No wins")) {
                        return context.getString(R.string.no_wins);
                    }
                    break;
                case -522282934:
                    if (str.equals("More than 4.5 cards")) {
                        return context.getResources().getQuantityString(R.plurals.over_cards, 4, "4.5");
                    }
                    break;
                case -472186911:
                    if (str.equals("Less than 2.5 goals")) {
                        return context.getResources().getQuantityString(R.plurals.under_goals, 2, "2.5");
                    }
                    break;
                case -355075744:
                    if (str.equals("First half loser")) {
                        return context.getString(R.string.first_half_loser);
                    }
                    break;
                case -175211439:
                    if (str.equals("No goals scored")) {
                        return context.getString(R.string.no_goals_scored);
                    }
                    break;
                case 2696247:
                    if (str.equals("Wins")) {
                        return context.getString(R.string.streak_wins);
                    }
                    break;
                case 66292623:
                    if (str.equals("Draws")) {
                        return context.getString(R.string.draws);
                    }
                    break;
                case 88112121:
                    if (str.equals("First quarter loser")) {
                        return context.getString(R.string.first_quarter_loser);
                    }
                    break;
                case 203776390:
                    if (str.equals("Less than 4.5 cards")) {
                        return context.getResources().getQuantityString(R.plurals.under_cards, 4, "4.5");
                    }
                    break;
                case 326057720:
                    if (str.equals("More than 10.5 corners")) {
                        return context.getResources().getQuantityString(R.plurals.over_corners, 10, "10.5");
                    }
                    break;
                case 393188685:
                    if (str.equals("First set winner")) {
                        return context.getString(R.string.first_set_winner);
                    }
                    break;
                case 598526358:
                    if (str.equals("Scored points average (Last 10)")) {
                        return context.getString(R.string.basketball_last_ten_avg_poinst_scored);
                    }
                    break;
                case 774636582:
                    if (str.equals("Both teams scoring")) {
                        return context.getString(R.string.both_teams_to_score);
                    }
                    break;
                case 904076348:
                    if (str.equals("Less than 10.5 corners")) {
                        return context.getResources().getQuantityString(R.plurals.under_corners, 10, "10.5");
                    }
                    break;
                case 1033011694:
                    if (str.equals("First period winner")) {
                        return context.getString(R.string.first_period_winner);
                    }
                    break;
                case 1129736144:
                    if (str.equals("More than 1.5 goals in first period")) {
                        return context.getString(R.string.more_than_goals_in_period, "1.5");
                    }
                    break;
                case 1496185959:
                    if (str.equals("Sets won")) {
                        return context.getString(R.string.sets_won);
                    }
                    break;
                case 1594505277:
                    if (str.equals("First to score")) {
                        return context.getString(R.string.first_to_score);
                    }
                    break;
                case 1708660048:
                    if (str.equals("Without clean sheet")) {
                        return context.getString(R.string.no_clean_sheet);
                    }
                    break;
                case 1936860598:
                    if (str.equals("Game points average (Last 10)")) {
                        return context.getString(R.string.basketball_last_ten_avg_game_total);
                    }
                    break;
                case 1963010158:
                    if (str.equals("First period loser")) {
                        return context.getString(R.string.first_period_loser);
                    }
                    break;
                case 1969324968:
                    if (str.equals("More than 5.5 goals")) {
                        return context.getResources().getQuantityString(R.plurals.over_goals, 5, "5.5");
                    }
                    break;
                case 2052523935:
                    if (str.equals("First period both scoring")) {
                        return context.getString(R.string.first_period_both_scoring);
                    }
                    break;
            }
        }
        return str;
    }

    public static final String B(int i, boolean z, Context context) {
        String string;
        context.getClass();
        qvj qvjVar = qvj.a;
        if (i == 1) {
            string = context.getString(R.string.transfer_loan);
        } else if (i == 3) {
            string = context.getString(R.string.transfer_fee);
            if (!z) {
                string = null;
            }
            if (string == null) {
                string = "";
            }
        } else {
            string = i == 2 ? context.getString(R.string.transfer_end_of_loan) : i == 4 ? context.getString(R.string.end_of_career) : i == 5 ? context.getString(R.string.player_draft) : i == 6 ? context.getString(R.string.released_from_team) : i == 7 ? context.getString(R.string.signed) : "-";
        }
        string.getClass();
        return string;
    }

    public static final String C(int i, Context context) {
        context.getClass();
        qvj qvjVar = qvj.a;
        if (i == 7) {
            String string = context.getString(R.string.free_transfer);
            string.getClass();
            return string;
        }
        if (i != 3) {
            return B(i, true, context);
        }
        String string2 = context.getString(R.string.transfer_transfer);
        string2.getClass();
        return string2;
    }

    public static final void D(Fragment fragment, v6d v6dVar) {
        String str;
        int i;
        u7d u7dVar;
        Bundle bundle;
        k7d A = yqo.A(fragment);
        k6d k6dVar = A.b;
        k6d k6dVar2 = A.b;
        s6d f2 = k6dVar.f();
        jp8 jp8Var = f2 instanceof jp8 ? (jp8) f2 : null;
        if (jp8Var != null) {
            str = jp8Var.g;
            if (str == null) {
                a70.r("Fragment class was not set");
                return;
            }
        } else {
            s6d f3 = k6dVar.f();
            s15 s15Var = f3 instanceof s15 ? (s15) f3 : null;
            if (s15Var != null) {
                str = s15Var.g;
                if (str == null) {
                    a70.r("DialogFragment class was not set");
                    return;
                }
            } else {
                str = null;
            }
        }
        if (Intrinsics.c(str, fragment.getClass().getName())) {
            int a2 = v6dVar.a();
            Bundle arguments = v6dVar.getArguments();
            fl5 fl5Var = A.c;
            s6d s6dVar = k6dVar.f.isEmpty() ? k6dVar.c : ((d6d) k6dVar.f.last()).b;
            if (s6dVar == null) {
                throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + A + '.');
            }
            y5d e2 = s6dVar.e(a2);
            if (e2 != null) {
                u7dVar = e2.b;
                i = e2.a;
                Bundle bundle2 = e2.c;
                if (bundle2 != null) {
                    lm5.a.getClass();
                    bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    bundle.putAll(bundle2);
                } else {
                    bundle = null;
                }
            } else {
                i = a2;
                u7dVar = null;
                bundle = null;
            }
            if (arguments != null) {
                if (bundle == null) {
                    lm5.a.getClass();
                    bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                bundle.putAll(arguments);
            }
            if (i == 0 && u7dVar != null) {
                boolean z = u7dVar.d;
                int i2 = u7dVar.c;
                if (i2 != -1) {
                    if (i2 == -1 || !k6dVar2.m(i2, z, false)) {
                        return;
                    }
                    k6dVar2.b();
                    return;
                }
            }
            if (i == 0) {
                a70.p("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                return;
            }
            s6d c2 = k6dVar2.c(i, null);
            if (c2 != null) {
                k6dVar.k(c2, bundle, u7dVar);
                return;
            }
            int i3 = s6d.f;
            String q = l4a.q(fl5Var, i);
            if (e2 == null) {
                yhk.m("Navigation action/destination ", q, " cannot be found from the current destination ", s6dVar);
                return;
            }
            StringBuilder q2 = wt3.q("Navigation destination ", q, " referenced from action ");
            q2.append(l4a.q(fl5Var, a2));
            q2.append(" cannot be found from the current destination ");
            q2.append(s6dVar);
            throw new IllegalArgumentException(q2.toString().toString());
        }
    }

    public static final long E(long j, float f2) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f2) & 4294967295L);
        mfj[] mfjVarArr = lfj.b;
        return floatToRawIntBits;
    }

    public static Object F(Function0 function0, sq3 sq3Var) {
        return xw3.R(g.a, new qa7(function0, (rq3) null, 17), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(jvg jvgVar, float f2, sq3 sq3Var) {
        cug cugVar;
        int i;
        csf csfVar;
        if (sq3Var instanceof cug) {
            cugVar = (cug) sq3Var;
            int i2 = cugVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cugVar.t = i2 - Integer.MIN_VALUE;
                Object obj = cugVar.s;
                Object obj2 = lu3.a;
                i = cugVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    csf csfVar2 = new csf();
                    Function2 dugVar = new dug(csfVar2, f2, null);
                    cugVar.r = csfVar2;
                    cugVar.t = 1;
                    if (jvgVar.a(m1d.a, dugVar, cugVar) == obj2) {
                        return obj2;
                    }
                    csfVar = csfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    csfVar = cugVar.r;
                    y6a.M(obj);
                }
                return new Float(csfVar.a);
            }
        }
        cugVar = new cug(sq3Var);
        Object obj3 = cugVar.s;
        Object obj22 = lu3.a;
        i = cugVar.t;
        if (i != 0) {
        }
        return new Float(csfVar.a);
    }

    public static void H(Context context, String str, String str2) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) ProfileActivity.class);
        if (str == null) {
            str = "";
        }
        intent.putExtra("OPEN_PROFILE_ID", str);
        if (str2 != null) {
            intent.putExtra("OPEN_PROFILE_NAME", str2);
        }
        context.startActivity(intent);
    }

    public static final d2g I(d2g d2gVar) {
        d2gVar.getClass();
        b2g k = d2gVar.k();
        i2g i2gVar = d2gVar.g;
        k.g = new hck(i2gVar.contentType(), i2gVar.contentLength());
        return k.a();
    }

    public static boolean J(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(xtc xtcVar, ksa ksaVar, p3e p3eVar, pg0 pg0Var, fo foVar, p78 p78Var, boolean z, myd mydVar, Function1 function1, of3 of3Var, int i, int i2) {
        int i3;
        ksa ksaVar2;
        p3e p3eVar2;
        pg0 pg0Var2;
        int i4;
        fo foVar2;
        p78 p78Var2;
        int i5;
        boolean z2;
        myd mydVar2;
        int i6;
        av8 av8Var;
        xtc xtcVar2;
        ksa ksaVar3;
        p3e p3eVar3;
        pg0 pg0Var3;
        fo foVar3;
        p78 p78Var3;
        boolean z3;
        eqf u;
        int i7;
        p3e p3eVar4;
        pg0 pg0Var4;
        myd mydVar3;
        fo foVar4;
        p78 p78Var4;
        boolean z4;
        xtc xtcVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(53695811);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                ksaVar2 = ksaVar;
                if (av8Var2.g(ksaVar2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                ksaVar2 = ksaVar;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            ksaVar2 = ksaVar;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            p3eVar2 = p3eVar;
            i3 |= av8Var2.g(p3eVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= av8Var2.h(false) ? a.o : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    pg0Var2 = pg0Var;
                    if (av8Var2.g(pg0Var2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    pg0Var2 = pg0Var;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                pg0Var2 = pg0Var;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                foVar2 = foVar;
                i3 |= av8Var2.g(foVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        p78Var2 = p78Var;
                        if (av8Var2.g(p78Var2)) {
                            i9 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i3 |= i9;
                        }
                    } else {
                        p78Var2 = p78Var;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    p78Var2 = p78Var;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i3 |= av8Var2.h(z2) ? 8388608 : 4194304;
                    if ((i & 100663296) != 0) {
                        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                            mydVar2 = mydVar;
                            if (av8Var2.g(mydVar2)) {
                                i8 = 67108864;
                                i3 |= i8;
                            }
                        } else {
                            mydVar2 = mydVar;
                        }
                        i8 = 33554432;
                        i3 |= i8;
                    } else {
                        mydVar2 = mydVar;
                    }
                    if ((i & 805306368) != 0) {
                        i6 = i12;
                        i3 |= av8Var2.i(function1) ? 536870912 : 268435456;
                    } else {
                        i6 = i12;
                    }
                    if (av8Var2.T(i3 & 1, (i3 & 306783379) == 306783378)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        xtcVar2 = xtcVar;
                        ksaVar3 = ksaVar2;
                        p3eVar3 = p3eVar2;
                        pg0Var3 = pg0Var2;
                        foVar3 = foVar2;
                        p78Var3 = p78Var2;
                        z3 = z2;
                    } else {
                        av8Var2.Y();
                        if ((i & 1) == 0 || av8Var2.B()) {
                            xtc xtcVar4 = i6 != 0 ? utc.a : xtcVar;
                            if ((i2 & 2) != 0) {
                                i7 = -234881025;
                                i3 &= -113;
                                ksaVar2 = msa.a(0, 0, av8Var2, 0, 3);
                            } else {
                                i7 = -234881025;
                            }
                            if (i13 != 0) {
                                p3eVar2 = new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                pg0Var2 = ww9.d;
                            }
                            if (i4 != 0) {
                                foVar2 = uxf.o;
                            }
                            if ((i2 & 64) != 0) {
                                ol4 a2 = iyh.a(av8Var2);
                                boolean g2 = av8Var2.g(a2);
                                Object O = av8Var2.O();
                                if (g2 || O == nf3.a) {
                                    O = new jp4(a2);
                                    av8Var2.n0(O);
                                }
                                i3 &= -3670017;
                                p78Var2 = (jp4) O;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                i3 &= i7;
                                mydVar3 = nyd.b(av8Var2);
                                p3eVar4 = p3eVar2;
                                pg0Var4 = pg0Var2;
                            } else {
                                p3eVar4 = p3eVar2;
                                pg0Var4 = pg0Var2;
                                mydVar3 = mydVar2;
                            }
                            foVar4 = foVar2;
                            p78Var4 = p78Var2;
                            z4 = z2;
                            xtcVar3 = xtcVar4;
                        } else {
                            av8Var2.W();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                i3 &= -234881025;
                            }
                            p3eVar4 = p3eVar2;
                            pg0Var4 = pg0Var2;
                            mydVar3 = mydVar2;
                            foVar4 = foVar2;
                            p78Var4 = p78Var2;
                            z4 = z2;
                            xtcVar3 = xtcVar;
                        }
                        ksa ksaVar4 = ksaVar2;
                        av8Var2.t();
                        int i14 = i3 >> 3;
                        av8Var = av8Var2;
                        bea.b(xtcVar3, ksaVar4, p3eVar4, true, p78Var4, z4, mydVar3, foVar4, pg0Var4, null, null, function1, av8Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        xtcVar2 = xtcVar3;
                        ksaVar3 = ksaVar4;
                        p3eVar3 = p3eVar4;
                        p78Var3 = p78Var4;
                        z3 = z4;
                        mydVar2 = mydVar3;
                        foVar3 = foVar4;
                        pg0Var3 = pg0Var4;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new pm1(xtcVar2, ksaVar3, p3eVar3, pg0Var3, foVar3, p78Var3, z3, mydVar2, function1, i, i2, 3);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) != 0) {
                }
                if (av8Var2.T(i3 & 1, (i3 & 306783379) == 306783378)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            foVar2 = foVar;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) != 0) {
            }
            if (av8Var2.T(i3 & 1, (i3 & 306783379) == 306783378)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        p3eVar2 = p3eVar;
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        foVar2 = foVar;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if (av8Var2.T(i3 & 1, (i3 & 306783379) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(xtc xtcVar, ksa ksaVar, p3e p3eVar, pg0 pg0Var, fo foVar, p78 p78Var, boolean z, Function1 function1, of3 of3Var, int i) {
        p3e p3eVar2;
        pg0 pg0Var2;
        fo foVar2;
        p78 p78Var2;
        boolean z2;
        int i2;
        boolean z3;
        pg0 pg0Var3;
        fo foVar3;
        p78 p78Var3;
        p3e p3eVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-740714857);
        int i3 = i | (av8Var.g(ksaVar) ? 32 : 16) | 13315456 | (av8Var.i(function1) ? 67108864 : 33554432);
        if (av8Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                t3e t3eVar = new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                p4h p4hVar = ww9.d;
                kv1 kv1Var = uxf.o;
                ol4 a2 = iyh.a(av8Var);
                boolean g2 = av8Var.g(a2);
                Object O = av8Var.O();
                if (g2 || O == nf3.a) {
                    O = new jp4(a2);
                    av8Var.n0(O);
                }
                i2 = i3 & (-3727361);
                z3 = true;
                pg0Var3 = p4hVar;
                foVar3 = kv1Var;
                p78Var3 = (jp4) O;
                p3eVar3 = t3eVar;
            } else {
                av8Var.W();
                i2 = i3 & (-3727361);
                p3eVar3 = p3eVar;
                pg0Var3 = pg0Var;
                foVar3 = foVar;
                p78Var3 = p78Var;
                z3 = z;
            }
            av8Var.t();
            a(xtcVar, ksaVar, p3eVar3, pg0Var3, foVar3, p78Var3, z3, nyd.b(av8Var), function1, av8Var, (33554430 & i2) | ((i2 << 3) & 1879048192), 0);
            p3eVar2 = p3eVar3;
            pg0Var2 = pg0Var3;
            foVar2 = foVar3;
            p78Var2 = p78Var3;
            z2 = z3;
        } else {
            av8Var.W();
            p3eVar2 = p3eVar;
            pg0Var2 = pg0Var;
            foVar2 = foVar;
            p78Var2 = p78Var;
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hi4(xtcVar, ksaVar, p3eVar2, pg0Var2, foVar2, p78Var2, z2, function1, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(xtc xtcVar, ksa ksaVar, p3e p3eVar, lg0 lg0Var, lv1 lv1Var, p78 p78Var, boolean z, myd mydVar, Function1 function1, of3 of3Var, int i, int i2) {
        int i3;
        ksa ksaVar2;
        int i4;
        int i5;
        p3e p3eVar2;
        lg0 lg0Var2;
        int i6;
        lv1 lv1Var2;
        p78 p78Var2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        myd mydVar2;
        int i10;
        av8 av8Var;
        xtc xtcVar2;
        ksa ksaVar3;
        p3e p3eVar3;
        lg0 lg0Var3;
        lv1 lv1Var3;
        p78 p78Var3;
        boolean z3;
        myd mydVar3;
        eqf u;
        int i11;
        lg0 lg0Var4;
        p78 p78Var4;
        xtc xtcVar3;
        ksa ksaVar4;
        lg0 lg0Var5;
        lv1 lv1Var4;
        p78 p78Var5;
        boolean z4;
        myd mydVar4;
        p3e p3eVar4;
        int i12;
        int i13;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1884325601);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            ksaVar2 = ksaVar;
            if (av8Var2.g(ksaVar2)) {
                i4 = 32;
                int i15 = i3 | i4;
                i5 = i2 & 4;
                if (i5 == 0) {
                    i15 |= 384;
                } else if ((i & 384) == 0) {
                    p3eVar2 = p3eVar;
                    i15 |= av8Var2.g(p3eVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                    int i16 = i15 | 3072;
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            lg0Var2 = lg0Var;
                            if (av8Var2.g(lg0Var2)) {
                                i13 = 16384;
                                i16 |= i13;
                            }
                        } else {
                            lg0Var2 = lg0Var;
                        }
                        i13 = 8192;
                        i16 |= i13;
                    } else {
                        lg0Var2 = lg0Var;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        i16 |= 196608;
                    } else if ((196608 & i) == 0) {
                        lv1Var2 = lv1Var;
                        i16 |= av8Var2.g(lv1Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if ((i2 & 64) != 0) {
                            p78Var2 = p78Var;
                            if (av8Var2.g(p78Var2)) {
                                i7 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                int i17 = i16 | i7;
                                i8 = i2 & 128;
                                if (i8 != 0) {
                                    i9 = i17 | 12582912;
                                    z2 = z;
                                } else {
                                    z2 = z;
                                    i9 = i17 | (av8Var2.h(z2) ? 8388608 : 4194304);
                                }
                                if ((100663296 & i) == 0) {
                                    if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                                        mydVar2 = mydVar;
                                        if (av8Var2.g(mydVar2)) {
                                            i12 = 67108864;
                                            i9 |= i12;
                                        }
                                    } else {
                                        mydVar2 = mydVar;
                                    }
                                    i12 = 33554432;
                                    i9 |= i12;
                                } else {
                                    mydVar2 = mydVar;
                                }
                                i10 = i9 | (av8Var2.i(function1) ? 536870912 : 268435456);
                                if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                                    av8Var2.Y();
                                    if ((i & 1) == 0 || av8Var2.B()) {
                                        xtc xtcVar4 = i14 != 0 ? utc.a : xtcVar;
                                        if ((i2 & 2) != 0) {
                                            ksaVar2 = msa.a(0, 0, av8Var2, 0, 3);
                                            i11 = i10 & (-113);
                                        } else {
                                            i11 = i10;
                                        }
                                        p3e t3eVar = i5 != 0 ? new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : p3eVar2;
                                        if ((i2 & 16) != 0) {
                                            lg0Var4 = ww9.b;
                                            i11 &= -57345;
                                        } else {
                                            lg0Var4 = lg0Var2;
                                        }
                                        lv1 lv1Var5 = i6 != 0 ? uxf.l : lv1Var2;
                                        if ((i2 & 64) != 0) {
                                            ol4 a2 = iyh.a(av8Var2);
                                            boolean g2 = av8Var2.g(a2);
                                            Object O = av8Var2.O();
                                            if (g2 || O == nf3.a) {
                                                O = new jp4(a2);
                                                av8Var2.n0(O);
                                            }
                                            p78Var4 = (jp4) O;
                                            i11 &= -3670017;
                                        } else {
                                            p78Var4 = p78Var2;
                                        }
                                        if (i8 != 0) {
                                            z2 = true;
                                        }
                                        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                            i11 &= -234881025;
                                            xtcVar3 = xtcVar4;
                                            ksaVar4 = ksaVar2;
                                            lg0Var5 = lg0Var4;
                                            lv1Var4 = lv1Var5;
                                            p78Var5 = p78Var4;
                                            mydVar4 = nyd.b(av8Var2);
                                            z4 = z2;
                                        } else {
                                            xtcVar3 = xtcVar4;
                                            ksaVar4 = ksaVar2;
                                            lg0Var5 = lg0Var4;
                                            lv1Var4 = lv1Var5;
                                            p78Var5 = p78Var4;
                                            z4 = z2;
                                            mydVar4 = mydVar2;
                                        }
                                        p3eVar4 = t3eVar;
                                    } else {
                                        av8Var2.W();
                                        i11 = (i2 & 2) != 0 ? i10 & (-113) : i10;
                                        if ((i2 & 16) != 0) {
                                            i11 &= -57345;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i11 &= -3670017;
                                        }
                                        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                            i11 &= -234881025;
                                        }
                                        ksaVar4 = ksaVar2;
                                        lg0Var5 = lg0Var2;
                                        lv1Var4 = lv1Var2;
                                        p78Var5 = p78Var2;
                                        z4 = z2;
                                        mydVar4 = mydVar2;
                                        xtcVar3 = xtcVar;
                                        p3eVar4 = p3eVar2;
                                    }
                                    av8Var2.t();
                                    int i18 = i11 >> 3;
                                    av8Var = av8Var2;
                                    bea.b(xtcVar3, ksaVar4, p3eVar4, false, p78Var5, z4, mydVar4, null, null, lv1Var4, lg0Var5, function1, av8Var, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | 3072 | (458752 & i18) | (3670016 & i18) | (i18 & 29360128), ((i11 >> 12) & 112) | ((i11 >> 6) & 896) | ((i11 >> 18) & 7168), 1792);
                                    xtcVar2 = xtcVar3;
                                    ksaVar3 = ksaVar4;
                                    p3eVar3 = p3eVar4;
                                    p78Var3 = p78Var5;
                                    z3 = z4;
                                    mydVar3 = mydVar4;
                                    lv1Var3 = lv1Var4;
                                    lg0Var3 = lg0Var5;
                                } else {
                                    av8Var = av8Var2;
                                    av8Var.W();
                                    xtcVar2 = xtcVar;
                                    ksaVar3 = ksaVar2;
                                    p3eVar3 = p3eVar2;
                                    lg0Var3 = lg0Var2;
                                    lv1Var3 = lv1Var2;
                                    p78Var3 = p78Var2;
                                    z3 = z2;
                                    mydVar3 = mydVar2;
                                }
                                u = av8Var.u();
                                if (u != null) {
                                    u.d = new pm1(xtcVar2, ksaVar3, p3eVar3, lg0Var3, lv1Var3, p78Var3, z3, mydVar3, function1, i, i2, 4);
                                    return;
                                }
                                return;
                            }
                        } else {
                            p78Var2 = p78Var;
                        }
                        i7 = 524288;
                        int i172 = i16 | i7;
                        i8 = i2 & 128;
                        if (i8 != 0) {
                        }
                        if ((100663296 & i) == 0) {
                        }
                        i10 = i9 | (av8Var2.i(function1) ? 536870912 : 268435456);
                        if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                    lv1Var2 = lv1Var;
                    if ((i2 & 64) != 0) {
                    }
                    i7 = 524288;
                    int i1722 = i16 | i7;
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    if ((100663296 & i) == 0) {
                    }
                    i10 = i9 | (av8Var2.i(function1) ? 536870912 : 268435456);
                    if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                p3eVar2 = p3eVar;
                int i162 = i15 | 3072;
                if ((i & 24576) == 0) {
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                lv1Var2 = lv1Var;
                if ((i2 & 64) != 0) {
                }
                i7 = 524288;
                int i17222 = i162 | i7;
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                if ((100663296 & i) == 0) {
                }
                i10 = i9 | (av8Var2.i(function1) ? 536870912 : 268435456);
                if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            ksaVar2 = ksaVar;
        }
        i4 = 16;
        int i152 = i3 | i4;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        p3eVar2 = p3eVar;
        int i1622 = i152 | 3072;
        if ((i & 24576) == 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        lv1Var2 = lv1Var;
        if ((i2 & 64) != 0) {
        }
        i7 = 524288;
        int i172222 = i1622 | i7;
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if ((100663296 & i) == 0) {
        }
        i10 = i9 | (av8Var2.i(function1) ? 536870912 : 268435456);
        if (av8Var2.T(i10 & 1, (i10 & 306783379) != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(final zuh zuhVar, final Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        tc3 tc3Var;
        final int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1897303977);
        final int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(zuhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i7 = zuhVar.g;
            x43 x43Var = zuhVar.q;
            String str = zuhVar.h;
            String str2 = zuhVar.i;
            boolean z = zuhVar.e;
            tc3 H = yqo.H(1849195715, av8Var2, new ct8() { // from class: xuh
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i5;
                    zuh zuhVar2 = zuhVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = zuhVar2.k;
                                bx7 bx7Var = zuhVar2.l;
                                l98.r(str3, bx7Var != null ? bx7Var.c : null, bx7Var != null ? bx7Var.b : null, bx7Var != null ? bx7Var.d : null, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                ux7 ux7Var = zuhVar2.m;
                                int i9 = ux7Var.a;
                                String str4 = ux7Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                l98.o(i9, str4, d0, Integer.valueOf(zuhVar2.n.a), zuhVar2.p, oea.v(R.string.season_rating_graph_title, av8Var4), false, null, av8Var4, 384, PsExtractor.AUDIO_STREAM);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                boolean i10 = av8Var5.i(zuhVar2);
                                Object O = av8Var5.O();
                                if (i10 || O == nf3.a) {
                                    O = new qfg(zuhVar2, 25);
                                    av8Var5.n0(O);
                                }
                                td4.a((Function1) O, null, null, av8Var5, 0, 6);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(-890854455, av8Var2, new ct8() { // from class: xuh
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i6;
                    zuh zuhVar2 = zuhVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = zuhVar2.k;
                                bx7 bx7Var = zuhVar2.l;
                                l98.r(str3, bx7Var != null ? bx7Var.c : null, bx7Var != null ? bx7Var.b : null, bx7Var != null ? bx7Var.d : null, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                ux7 ux7Var = zuhVar2.m;
                                int i9 = ux7Var.a;
                                String str4 = ux7Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                l98.o(i9, str4, d0, Integer.valueOf(zuhVar2.n.a), zuhVar2.p, oea.v(R.string.season_rating_graph_title, av8Var4), false, null, av8Var4, 384, PsExtractor.AUDIO_STREAM);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                boolean i10 = av8Var5.i(zuhVar2);
                                Object O = av8Var5.O();
                                if (i10 || O == nf3.a) {
                                    O = new qfg(zuhVar2, 25);
                                    av8Var5.n0(O);
                                }
                                td4.a((Function1) O, null, null, av8Var5, 0, 6);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H3 = yqo.H(-1138822649, av8Var2, new ct8() { // from class: xuh
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i4;
                    zuh zuhVar2 = zuhVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = zuhVar2.k;
                                bx7 bx7Var = zuhVar2.l;
                                l98.r(str3, bx7Var != null ? bx7Var.c : null, bx7Var != null ? bx7Var.b : null, bx7Var != null ? bx7Var.d : null, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                ux7 ux7Var = zuhVar2.m;
                                int i9 = ux7Var.a;
                                String str4 = ux7Var.b;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                l98.o(i9, str4, d0, Integer.valueOf(zuhVar2.n.a), zuhVar2.p, oea.v(R.string.season_rating_graph_title, av8Var4), false, null, av8Var4, 384, PsExtractor.AUDIO_STREAM);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                boolean i10 = av8Var5.i(zuhVar2);
                                Object O = av8Var5.O();
                                if (i10 || O == nf3.a) {
                                    O = new qfg(zuhVar2, 25);
                                    av8Var5.n0(O);
                                }
                                td4.a((Function1) O, null, null, av8Var5, 0, 6);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            int i8 = i2 & 112;
            boolean i9 = (i8 == 32) | av8Var2.i(zuhVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i9 || O == a99Var) {
                tc3Var = H3;
                i3 = 0;
                O = new Function0() { // from class: yuh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i10 = i3;
                        zuh zuhVar2 = zuhVar;
                        Function1 function12 = function1;
                        switch (i10) {
                            case 0:
                                function12.invoke(new gw7(Integer.valueOf(zuhVar2.n.a), zuhVar2.m.a, 20, null));
                                break;
                            default:
                                function12.invoke(new yv7(zuhVar2));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i8 == 32) {
                i3 = 1;
            }
            int i10 = i3 | (av8Var2.i(zuhVar) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i10 != 0 || O2 == a99Var) {
                final int i11 = 1;
                O2 = new Function0() { // from class: yuh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i11;
                        zuh zuhVar2 = zuhVar;
                        Function1 function12 = function1;
                        switch (i102) {
                            case 0:
                                function12.invoke(new gw7(Integer.valueOf(zuhVar2.n.a), zuhVar2.m.a, 20, null));
                                break;
                            default:
                                function12.invoke(new yv7(zuhVar2));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, ((i2 << 15) & 3670016) | 24576, 46240);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(zuhVar, function1, xtcVar, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(int i, int i2, int i3, of3 of3Var, xtc xtcVar, Integer num, boolean z) {
        int i4;
        Integer num2;
        Integer num3;
        eqf u;
        ?? r2;
        long f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2132748381);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            num2 = num;
            i4 |= av8Var.g(num2) ? a.o : 1024;
            if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
                av8Var.W();
                num3 = num2;
            } else {
                Integer num4 = i5 != 0 ? null : num2;
                boolean z2 = num4 != null && i == num4.intValue() && num4.intValue() > 0;
                xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                int i6 = 6;
                u23 a2 = t23.a(new ng0(4.0f, true, new a70(i6)), uxf.p, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d0);
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
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                Integer num5 = num4;
                l8g a3 = k8g.a(new ng0(2.0f, true, new a70(i6)), uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                utc utcVar = utc.a;
                xtc C2 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                xtc l = bkh.l(utcVar, 24.0f);
                float f3 = z ? -1.0f : 1.0f;
                xtc D = f6a.D(l, f3, f3);
                ImageVector N = s6a.N(R.drawable.ic_section_arrow_up, 6, av8Var);
                if (z) {
                    r2 = 0;
                    f2 = ljg.f(av8Var, 1598770145, R.color.error, av8Var, false);
                } else {
                    r2 = 0;
                    f2 = ljg.f(av8Var, 1598770659, R.color.success, av8Var, false);
                }
                kq9.b(N, null, D, f2, av8Var, 48, 0);
                wkn.k(haa.t(R.drawable.ic_weekly_streak, r2, av8Var), null, bkh.l(utcVar, 32.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                String valueOf2 = String.valueOf(i);
                yf8 yf8Var = xth.a;
                udj.c(valueOf2, null, z ? ljg.f(av8Var, 1598783297, R.color.error, av8Var, r2) : ljg.f(av8Var, 1598783818, R.color.primary_default, av8Var, r2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var.s(true);
                udj.c(oea.v(z2 ? R.string.challenge_weekly_streak_restored : z ? R.string.weekly_streak_broken : R.string.challenge_weekly_streak_extended, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(true);
                num3 = num5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new is9(z, i, xtcVar, num3, i2, i3);
                return;
            }
            return;
        }
        num2 = num;
        if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(final iel ielVar, boolean z, Function1 function1, of3 of3Var, int i) {
        iel ielVar2;
        av8 av8Var;
        utc utcVar;
        f50 f50Var;
        int i2;
        ry ryVar;
        f50 f50Var2;
        ielVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1811131629);
        int i3 = (av8Var2.g(ielVar) ? 4 : 2) | i | (av8Var2.h(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            final long D = lz.D(R.color.on_color_highlight_1, av8Var2);
            final long D2 = lz.D(R.color.on_color_primary, av8Var2);
            final long D3 = lz.D(R.color.on_color_primary, av8Var2);
            final boolean c0 = hkg.c0((Context) av8Var2.k(nz.b));
            utc utcVar2 = utc.a;
            xtc A = wnn.A(l98.f0(bkh.d(utcVar2, 1.0f), 12.0f, 16.0f, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), o7g.a(8.0f));
            long D4 = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            int i4 = i3;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = wzj.v;
                av8Var2.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(A, true, true, true, D4, wzcVar, new uel(3, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), function1), av8Var2, 0), 4.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var2, a2, f50Var3);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var2, C, f50Var5);
            xtc d2 = bkh.d(utcVar2, 1.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var3);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var4, av8Var2, ryVar2);
            waa.K(av8Var2, C2, f50Var5);
            xtc e2 = bkh.e(utcVar2, 14.0f);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc z2 = e2.z(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            boolean h2 = av8Var2.h(c0) | ((i4 & 14) == 4) | av8Var2.f(D3) | av8Var2.f(D) | av8Var2.f(D2);
            Object O3 = av8Var2.O();
            if (h2 || O3 == a99Var) {
                utcVar = utcVar2;
                f50Var = f50Var5;
                i2 = 0;
                ryVar = ryVar2;
                f50Var2 = f50Var4;
                O3 = new Function1() { // from class: djl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        iel ielVar3;
                        List list;
                        List list2;
                        float floatValue;
                        long j = D2;
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        float H0 = ha5Var.H0(4.0f);
                        float H02 = ha5Var.H0(5.0f);
                        char c2 = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H0;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
                        float H03 = ha5Var.H0(6.0f);
                        float f2 = ((H03 / (2.0f * H0)) * H0) / 2.0f;
                        boolean z3 = c0;
                        iel ielVar4 = ielVar;
                        List B0 = z3 ? CollectionsKt.B0(ielVar4.h.a) : ielVar4.h.a;
                        int i5 = 0;
                        for (Object obj2 : B0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                b.q();
                                throw null;
                            }
                            float floatValue2 = ((Number) obj2).floatValue();
                            if (z3) {
                                floatValue2 = 1.0f - floatValue2;
                            }
                            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f4 = ((i5 != 0 || z3) && (!z3 || i5 == B0.size() + (-1))) ? 0.0f : H0;
                            float f5 = floatValue2 * intBitsToFloat;
                            float f6 = H0;
                            int i7 = i5;
                            List list3 = B0;
                            boolean z4 = z3;
                            float f7 = H02;
                            ha5.U(ha5Var, D3, f6, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(f5 + f4) << c2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                            if (i7 != list3.size() - 1) {
                                float f8 = f5 + f7 + f4;
                                if (z4) {
                                    float f9 = i7 == list3.size() + (-2) ? 0.0f : f6;
                                    list2 = list3;
                                    Float f10 = (Float) CollectionsKt.a0(i6, list2);
                                    floatValue = (((1.0f - (f10 != null ? f10.floatValue() : 1.0f)) * intBitsToFloat) - f7) + f9;
                                } else {
                                    list2 = list3;
                                    Float f11 = (Float) CollectionsKt.a0(i6, list2);
                                    floatValue = ((f11 != null ? f11.floatValue() : 1.0f) * intBitsToFloat) - f7;
                                }
                                float f12 = floatValue;
                                float f13 = H03 / 2.0f;
                                float f14 = intBitsToFloat2 - f13;
                                float f15 = intBitsToFloat2 + f13;
                                List list4 = list2;
                                b20 a4 = e20.a();
                                Path path = a4.a;
                                a4.g(f8, f14);
                                a4.f(f12, f14);
                                float f16 = f12 - f2;
                                long j2 = j;
                                float f17 = f12 + f2;
                                RectF rectF = a4.b;
                                if (rectF == null) {
                                    rectF = new RectF();
                                    a4.b = rectF;
                                }
                                rectF.set(f16, f14, f17, f15);
                                RectF rectF2 = a4.b;
                                rectF2.getClass();
                                ha5 ha5Var2 = ha5Var;
                                path.arcTo(rectF2, 270.0f, -180.0f, false);
                                a4.f(f12, f15);
                                a4.f(f8, f15);
                                float f18 = f8 - f2;
                                float f19 = f8 + f2;
                                RectF rectF3 = a4.b;
                                if (rectF3 == null) {
                                    rectF3 = new RectF();
                                    a4.b = rectF3;
                                }
                                rectF3.set(f18, f14, f19, f15);
                                RectF rectF4 = a4.b;
                                rectF4.getClass();
                                path.arcTo(rectF4, 90.0f, -180.0f, false);
                                a4.d();
                                list = list4;
                                ha5.X0(ha5Var2, a4, D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                if (z4) {
                                    Float f20 = (Float) CollectionsKt.a0(i7, CollectionsKt.B0(ielVar4.h.b));
                                    if (f20 != null) {
                                        f3 = f20.floatValue();
                                    }
                                } else {
                                    Float f21 = (Float) CollectionsKt.a0(i7, ielVar4.h.b);
                                    if (f21 != null) {
                                        f3 = f21.floatValue();
                                    }
                                }
                                Pair pair = z4 ? new Pair(Float.valueOf(f12 - ((f12 - f8) * f3)), Float.valueOf(f12)) : new Pair(Float.valueOf(f8), Float.valueOf(((f12 - f8) * f3) + f8));
                                float floatValue3 = ((Number) pair.a).floatValue();
                                float floatValue4 = ((Number) pair.b).floatValue();
                                sx2 L0 = ha5Var2.L0();
                                long D5 = L0.D();
                                L0.t().o();
                                try {
                                    ((hpo) L0.a).q(floatValue3, f14, floatValue4, f15, 1);
                                    ielVar3 = ielVar4;
                                    j = j2;
                                    ha5.X0(ha5Var2, a4, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                    ha5Var = ha5Var2;
                                } finally {
                                    mz1.v(L0, D5);
                                }
                            } else {
                                ielVar3 = ielVar4;
                                list = list3;
                            }
                            ielVar4 = ielVar3;
                            H0 = f6;
                            B0 = list;
                            i5 = i6;
                            z3 = z4;
                            H02 = f7;
                            c2 = ' ';
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O3);
            } else {
                utcVar = utcVar2;
                ryVar = ryVar2;
                f50Var2 = f50Var4;
                f50Var = f50Var5;
                i2 = 0;
            }
            lz.d(i2, av8Var2, z2, (Function1) O3);
            ielVar2 = ielVar;
            fz8.d(z, null, null, null, null, fcp.c, av8Var2, 1572870 | (i4 & 112), 30);
            av8Var2.s(true);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a4 = k8g.a(ww9.h, uxf.l, av8Var2, 6);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var3);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var);
            String str = ielVar2.d;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
            udj.c(ielVar2.e, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            ielVar2 = ielVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tel(ielVar2, z, function1, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(ObjectPositioningRemoteDto objectPositioningRemoteDto, BlazeObjectPositioning blazeObjectPositioning) {
        BlazeObjectXPosition xPosition;
        BlazeObjectYPosition yPosition;
        blazeObjectPositioning.getClass();
        ObjectXPositionRemoteDto xPosition2 = objectPositioningRemoteDto.getXPosition();
        if (xPosition2 != null) {
            switch (j5m.a[xPosition2.ordinal()]) {
                case 1:
                    xPosition = BlazeObjectXPosition.START_TO_START;
                    break;
                case 2:
                    xPosition = BlazeObjectXPosition.START_TO_END;
                    break;
                case 3:
                    xPosition = BlazeObjectXPosition.END_TO_START;
                    break;
                case 4:
                    xPosition = BlazeObjectXPosition.END_TO_END;
                    break;
                case 5:
                    xPosition = BlazeObjectXPosition.CENTER_X;
                    break;
                case 6:
                    xPosition = BlazeObjectXPosition.CENTER_TO_START;
                    break;
                case 7:
                    xPosition = BlazeObjectXPosition.CENTER_TO_END;
                    break;
                default:
                    zzl.b();
                    return;
            }
        }
        xPosition = blazeObjectPositioning.getXPosition();
        blazeObjectPositioning.setXPosition(xPosition);
        ObjectYPositionRemoteDto yPosition2 = objectPositioningRemoteDto.getYPosition();
        if (yPosition2 != null) {
            switch (k8m.a[yPosition2.ordinal()]) {
                case 1:
                    yPosition = BlazeObjectYPosition.BOTTOM_TO_TOP;
                    break;
                case 2:
                    yPosition = BlazeObjectYPosition.TOP_TO_TOP;
                    break;
                case 3:
                    yPosition = BlazeObjectYPosition.BOTTOM_TO_BOTTOM;
                    break;
                case 4:
                    yPosition = BlazeObjectYPosition.TOP_TO_BOTTOM;
                    break;
                case 5:
                    yPosition = BlazeObjectYPosition.CENTER_TO_TOP;
                    break;
                case 6:
                    yPosition = BlazeObjectYPosition.CENTER_Y;
                    break;
                case 7:
                    yPosition = BlazeObjectYPosition.CENTER_TO_BOTTOM;
                    break;
                default:
                    zzl.b();
                    return;
            }
        }
        yPosition = blazeObjectPositioning.getYPosition();
        blazeObjectPositioning.setYPosition(yPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(jvg jvgVar, float f2, j38 j38Var, sq3 sq3Var) {
        aug augVar;
        int i;
        csf csfVar;
        if (sq3Var instanceof aug) {
            augVar = (aug) sq3Var;
            int i2 = augVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                augVar.t = i2 - Integer.MIN_VALUE;
                Object obj = augVar.s;
                Object obj2 = lu3.a;
                i = augVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    csf csfVar2 = new csf();
                    Function2 bugVar = new bug(f2, j38Var, csfVar2, null);
                    augVar.r = csfVar2;
                    augVar.t = 1;
                    if (jvgVar.a(m1d.a, bugVar, augVar) == obj2) {
                        return obj2;
                    }
                    csfVar = csfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    csfVar = augVar.r;
                    y6a.M(obj);
                }
                return new Float(csfVar.a);
            }
        }
        augVar = new aug(sq3Var);
        Object obj3 = augVar.s;
        Object obj22 = lu3.a;
        i = augVar.t;
        if (i != 0) {
        }
        return new Float(csfVar.a);
    }

    public static final Object j(Task task, m5a m5aVar) {
        if (!task.isComplete()) {
            lj2 lj2Var = new lj2(1, z9a.b(m5aVar));
            lj2Var.t();
            task.addOnCompleteListener(g35.b, new l5a(lj2Var));
            Object q = lj2Var.q();
            lu3 lu3Var = lu3.a;
            return q;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static void k(gni gniVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                gniVar.s(i);
            } else if (obj instanceof byte[]) {
                gniVar.r(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                gniVar.J0(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                gniVar.J0(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                gniVar.q(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                gniVar.q(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                gniVar.q(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                gniVar.q(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                gniVar.m0(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                gniVar.q(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final void l(long j) {
        mfj[] mfjVarArr = lfj.b;
        if ((j & 1095216660480L) == 0) {
            t3a.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void m(long j, long j2) {
        mfj[] mfjVarArr = lfj.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            t3a.a("Cannot perform operation for Unspecified type.");
        }
        if (mfj.a(lfj.b(j), lfj.b(j2))) {
            return;
        }
        t3a.a("Cannot perform operation for " + ((Object) mfj.b(lfj.b(j))) + " and " + ((Object) mfj.b(lfj.b(j2))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final String n(Context context, Team team, String str) {
        String str2;
        String p;
        context.getClass();
        if (team == null || (str2 = team.getName()) == null) {
            str2 = str == null ? "" : str;
        }
        switch (str2.hashCode()) {
            case -1532195959:
                if (str2.equals("Retired")) {
                    String string = context.getString(R.string.retired_player);
                    string.getClass();
                    return string;
                }
                break;
            case -578212548:
                if (str2.equals("No team")) {
                    String string2 = context.getString(R.string.transfer_no_team);
                    string2.getClass();
                    return string2;
                }
                break;
            case -379795343:
                if (str2.equals("Free agent")) {
                    String string3 = context.getString(R.string.free_agent);
                    string3.getClass();
                    return string3;
                }
                break;
            case 66543:
                if (str2.equals("Ban")) {
                    String string4 = context.getString(R.string.transfer_ban);
                    string4.getClass();
                    return string4;
                }
                break;
        }
        return (team == null || (p = tba.p(context, team)) == null) ? str == null ? "" : str : p;
    }

    public static sjb o() {
        return juf.e == null ? new juf() : new sz8(9);
    }

    public static final j5g p(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof j5g) {
                return (j5g) childAt;
            }
        }
        j5g j5gVar = new j5g(viewGroup.getContext());
        viewGroup.addView(j5gVar);
        return j5gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup q(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                ogj.h(lnb.m(view, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                return null;
            }
            view = parent;
        }
        return (ViewGroup) view;
    }

    public static String r(TeamSeasonForm teamSeasonForm, Context context) {
        String g2;
        context.getClass();
        if (teamSeasonForm.getDraws() == null) {
            g2 = hkg.c0(context) ? null : fc6.g(yid.m(teamSeasonForm.getWins()), yid.m(teamSeasonForm.getLosses()), "-");
            return g2 == null ? fc6.g(yid.m(teamSeasonForm.getLosses()), yid.m(teamSeasonForm.getWins()), "-") : g2;
        }
        g2 = hkg.c0(context) ? null : yid.m(teamSeasonForm.getWins()) + "-" + yid.m(teamSeasonForm.getLosses()) + "-" + teamSeasonForm.getDraws();
        if (g2 != null) {
            return g2;
        }
        return yid.m(teamSeasonForm.getDraws()) + "-" + yid.m(teamSeasonForm.getLosses()) + "-" + teamSeasonForm.getWins();
    }

    public static final Rect s(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        eq3.z(textPaint2, charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            eq3.z(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final String t(Context context, Transfer transfer) {
        context.getClass();
        return n(context, transfer.getTransferFrom(), transfer.getFromTeamName()) + " - " + n(context, transfer.getTransferTo(), transfer.getToTeamName());
    }

    public static final long u(double d2) {
        return E(4294967296L, (float) d2);
    }

    public static final long v(int i) {
        return E(4294967296L, i);
    }

    public static String w(Context context, Team team) {
        context.getClass();
        String p = tba.p(context, team);
        if (qea.y(team) && team.getSport() != null) {
            Set set = wyh.a;
            if (!wyh.e(team.getSportSlug())) {
                return wv8.i(p, " ", context.getString(R.string.female_team));
            }
        }
        return p;
    }

    public static String x(Context context, Team team) {
        context.getClass();
        if (team != null) {
            Set set = wyh.a;
            if (!wyh.e(team.getSportSlug()) && qea.y(team)) {
                return wv8.i(tba.p(context, team), " ", context.getString(R.string.female_team));
            }
            String A = tba.A(context, team);
            if (A != null) {
                return A;
            }
        }
        return "";
    }

    public static final String y(Context context, String str) {
        context.getClass();
        if (str == null || str.equals("Unknown")) {
            str = context.getString(R.string.value_unknown);
        } else if (str.equals("Free")) {
            str = context.getString(R.string.transfer_free);
        }
        str.getClass();
        return str;
    }

    public static String z(Context context, String str) {
        context.getClass();
        str.getClass();
        if (StringsKt.J(str, "(", false)) {
            String substring = str.substring(StringsKt.P(str, "(", 0, false, 6) + 1, StringsKt.P(str, ")", 0, false, 6));
            String upperCase = substring.substring(0, 1).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String x = d2a.x(context, upperCase.concat(substring.substring(1)), false);
            if (x != null) {
                String substring2 = str.substring(0, StringsKt.P(str, " (", 0, false, 6));
                String A = A(context, substring2);
                if (A != null) {
                    substring2 = A;
                }
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = x.toLowerCase(locale);
                lowerCase.getClass();
                return fc6.n(substring2, " (", lowerCase, ")");
            }
        }
        return A(context, str);
    }
}
