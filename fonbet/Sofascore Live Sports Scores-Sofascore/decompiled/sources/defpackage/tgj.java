package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.compose.runtime.d;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.UniqueTournamentIndividualAwardType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.DoubleUnaryOperator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tgj {
    public static final tc3 a = new tc3(-680242508, new ed3(22), false);
    public static final tc3 b = new tc3(1148034904, new pd3(17), false);
    public static final tc3 c = new tc3(743923976, new pd3(18), false);
    public static final tc3 d = new tc3(-51920999, new pd3(19), false);
    public static final tc3 e = new tc3(-774858208, new pd3(20), false);
    public static final Object f = new Object();
    public static final byte[] g = {112, 114, 111, 0};
    public static final byte[] h = {112, 114, 109, 0};
    public static final Object i = new Object();
    public static volatile wo0 j;
    public static volatile wo0 k;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    public static void A(String str, Throwable th) {
        synchronized (f) {
            r(str, th);
        }
    }

    public static q4c B(re4 re4Var, String str, byte[] bArr, Map map) {
        xe4 xe4Var;
        ue4 ue4Var;
        Map map2;
        List list;
        tei teiVar = new tei(re4Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        z1a.y(parse, "The uri must be set.");
        xe4 xe4Var2 = new xe4(parse, 0L, 2, bArr, map, 0L, -1L, null, 1);
        xe4 xe4Var3 = xe4Var2;
        int i2 = 0;
        while (true) {
            try {
                ue4 ue4Var2 = new ue4(teiVar, xe4Var3);
                try {
                    byte[] b2 = tb2.b(ue4Var2);
                    try {
                        xe4Var = xe4Var2;
                        ue4Var = ue4Var2;
                        try {
                            try {
                                lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, SystemClock.elapsedRealtime(), 0L, b2.length);
                                wj9 wj9Var = new wj9(b2);
                                wj9Var.c = lfbVar;
                                q4c q4cVar = new q4c(wj9Var);
                                nik.h(ue4Var);
                                return q4cVar;
                            } catch (si9 e2) {
                                e = e2;
                                int i3 = e.c;
                                String str2 = null;
                                if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                    str2 = (String) list.get(0);
                                }
                                if (str2 == null) {
                                    throw e;
                                }
                                i2++;
                                ve4 a2 = xe4Var3.a();
                                a2.a = Uri.parse(str2);
                                xe4Var3 = a2.a();
                                try {
                                    nik.h(ue4Var);
                                    xe4Var2 = xe4Var;
                                } catch (Exception e3) {
                                    e = e3;
                                    throw new r4c(xe4Var, teiVar.c, teiVar.a.getResponseHeaders(), teiVar.b, e);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            nik.h(ue4Var);
                            throw th;
                        }
                    } catch (si9 e4) {
                        e = e4;
                        xe4Var = xe4Var2;
                        ue4Var = ue4Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        ue4Var = ue4Var2;
                        nik.h(ue4Var);
                        throw th;
                    }
                } catch (si9 e5) {
                    e = e5;
                    xe4Var = xe4Var2;
                    ue4Var = ue4Var2;
                } catch (Throwable th3) {
                    th = th3;
                    ue4Var = ue4Var2;
                }
                xe4Var2 = xe4Var;
            } catch (Exception e6) {
                e = e6;
                xe4Var = xe4Var2;
            }
        }
    }

    public static ol4 C() {
        return new ol4(new qh0(4));
    }

    public static final void D(View view, long j2, Interpolator interpolator, Float f2, boolean z) {
        view.getClass();
        if (z) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        view.animate().alpha(f2 != null ? f2.floatValue() : 1.0f).setDuration(j2).setInterpolator(interpolator).withStartAction(new rj4(1, view));
    }

    public static /* synthetic */ void E(View view, long j2, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i2) {
        if ((i2 & 1) != 0) {
            j2 = 250;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            accelerateDecelerateInterpolator = null;
        }
        D(view, j3, accelerateDecelerateInterpolator, null, (i2 & 8) == 0);
    }

    public static final void F(View view, long j2, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        view.getClass();
        view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j2).setInterpolator(accelerateDecelerateInterpolator).withEndAction(new rj4(2, view));
    }

    public static /* synthetic */ void G(View view, long j2, int i2) {
        if ((i2 & 1) != 0) {
            j2 = 250;
        }
        F(view, j2, null);
    }

    public static final Object H(hc2 hc2Var, sq3 sq3Var) {
        hc2Var.getClass();
        Throwable b2 = hc2Var.b();
        if (b2 != null) {
            throw b2;
        }
        w52 d2 = hc2Var.d();
        d2.getClass();
        if (((int) d2.c) < 1048576) {
            return Unit.a;
        }
        Object c2 = hc2Var.c(sq3Var);
        return c2 == lu3.a ? c2 : Unit.a;
    }

    public static String I(String str, String str2, byte[] bArr) {
        byte[] bArr2 = tol.i;
        byte[] bArr3 = tol.j;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return mz1.o(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static String J(Context context, String str) {
        context.getClass();
        if (str != null) {
            switch (str.hashCode()) {
                case -1434231425:
                    if (str.equals(FootballShotmapItem.BODY_PART_RIGHT_FOOT)) {
                        str = context.getString(R.string.type_of_shot_right_footed);
                        break;
                    }
                    break;
                case 3198432:
                    if (str.equals("head")) {
                        str = context.getString(R.string.type_of_shot_head);
                        break;
                    }
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        str = context.getString(R.string.football_type_of_shot_other_body_part);
                        break;
                    }
                    break;
                case 1695382132:
                    if (str.equals(FootballShotmapItem.BODY_PART_LEFT_FOOT)) {
                        str = context.getString(R.string.type_of_shot_left_footed);
                        break;
                    }
                    break;
            }
            str.getClass();
            return str;
        }
        if (str == null) {
            str = "-";
        }
        str.getClass();
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static String K(Context context, String str, boolean z) {
        context.getClass();
        if (z) {
            return "-";
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2117555613:
                    if (str.equals(FootballShotmapItem.GOAL_LOW_RIGHT)) {
                        String string = context.getString(R.string.goal_zone_low_right);
                        string.getClass();
                        return string;
                    }
                    break;
                case -2108089257:
                    if (str.equals(FootballShotmapItem.GOAL_CLOSE_HIGH)) {
                        String string2 = context.getString(R.string.goal_zone_close_high);
                        string2.getClass();
                        return string2;
                    }
                    break;
                case -2107973956:
                    if (str.equals(FootballShotmapItem.GOAL_CLOSE_LEFT)) {
                        String string3 = context.getString(R.string.goal_zone_close_left);
                        string3.getClass();
                        return string3;
                    }
                    break;
                case -2060050330:
                    if (str.equals(FootballShotmapItem.GOAL_HIGH_CENTRE)) {
                        String string4 = context.getString(R.string.goal_zone_high_centre);
                        string4.getClass();
                        return string4;
                    }
                    break;
                case -1869606176:
                    if (str.equals(FootballShotmapItem.GOAL_LOW_LEFT)) {
                        String string5 = context.getString(R.string.goal_zone_low_left);
                        string5.getClass();
                        return string5;
                    }
                    break;
                case -1652625804:
                    if (str.equals(FootballShotmapItem.GOAL_LOW_CENTRE)) {
                        String string6 = context.getString(R.string.goal_zone_low_centre);
                        string6.getClass();
                        return string6;
                    }
                    break;
                case -1437961679:
                    if (str.equals(FootballShotmapItem.GOAL_HIGH_RIGHT)) {
                        String string7 = context.getString(R.string.goal_zone_high_right);
                        string7.getClass();
                        return string7;
                    }
                    break;
                case -917022201:
                    if (str.equals(FootballShotmapItem.GOAL_CLOSE_RIGHT)) {
                        String string8 = context.getString(R.string.goal_zone_close_right);
                        string8.getClass();
                        return string8;
                    }
                    break;
                case -739305134:
                    if (str.equals(FootballShotmapItem.GOAL_HIGH_LEFT)) {
                        String string9 = context.getString(R.string.goal_zone_high_left);
                        string9.getClass();
                        return string9;
                    }
                    break;
                case 3202466:
                    if (str.equals(FootballShotmapItem.GOAL_HIGH)) {
                        String string10 = context.getString(R.string.football_goal_zone_high);
                        string10.getClass();
                        return string10;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        String string11 = context.getString(R.string.goal_zone_left);
                        string11.getClass();
                        return string11;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        String string12 = context.getString(R.string.goal_zone_right);
                        string12.getClass();
                        return string12;
                    }
                    break;
                case 395580710:
                    if (str.equals(FootballShotmapItem.GOAL_CLOSE_HIGH_RIGHT)) {
                        String string13 = context.getString(R.string.goal_zone_close_right_and_high);
                        string13.getClass();
                        return string13;
                    }
                    break;
                case 1813693373:
                    if (str.equals(FootballShotmapItem.GOAL_CLOSE_HIGH_LEFT)) {
                        String string14 = context.getString(R.string.goal_zone_close_left_and_high);
                        string14.getClass();
                        return string14;
                    }
                    break;
            }
        }
        return str == null ? "-" : str;
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
    public static String L(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -1349960621:
                if (str.equals(FootballShotmapItem.SHOT_TYPE_BLOCKED_OFF_LINE)) {
                    str = context.getString(R.string.football_shot_outcome_blocked_off_line);
                    break;
                }
                break;
            case 3178259:
                if (str.equals("goal")) {
                    str = context.getString(Intrinsics.c(str2, FootballShotmapItem.GOAL_TYPE_OWN) ? R.string.football_own_goal : R.string.football_goal);
                    break;
                }
                break;
            case 3351804:
                if (str.equals(FootballShotmapItem.SHOT_TYPE_MISS)) {
                    str = context.getString(R.string.football_outcome_missed);
                    break;
                }
                break;
            case 3446944:
                if (str.equals(FootballShotmapItem.SHOT_TYPE_POST)) {
                    str = context.getString(R.string.football_shot_outcome_post);
                    break;
                }
                break;
            case 3522941:
                if (str.equals(FootballShotmapItem.SHOT_TYPE_SAVE)) {
                    str = context.getString(R.string.football_outcome_saved);
                    break;
                }
                break;
            case 93832333:
                if (str.equals("block")) {
                    str = context.getString(R.string.football_outcome_blocked);
                    break;
                }
                break;
        }
        str.getClass();
        return str;
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
    public static String M(Context context, String str) {
        context.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -1354665387:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_CORNER)) {
                    str = context.getString(R.string.football_situation_from_corner);
                    break;
                }
                break;
            case -682674039:
                if (str.equals("penalty")) {
                    str = context.getString(R.string.football_shot_situation_penalty);
                    break;
                }
                break;
            case -502462013:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_SET_PIECE)) {
                    str = context.getString(R.string.football_situation_set_piece);
                    break;
                }
                break;
            case -479893241:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_FREE_KICK)) {
                    str = context.getString(R.string.football_shot_situation_free_kick);
                    break;
                }
                break;
            case -415073587:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_SCRAMBLE)) {
                    str = context.getString(R.string.shot_situation_scramble);
                    break;
                }
                break;
            case -369518392:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_ASSISTED)) {
                    str = context.getString(R.string.football_situation_assisted);
                    break;
                }
                break;
            case -345259313:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_SHOOTOUT)) {
                    str = context.getString(R.string.football_shootout);
                    break;
                }
                break;
            case 544010914:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_THROW_IN)) {
                    str = context.getString(R.string.football_shot_situation_throw_in);
                    break;
                }
                break;
            case 1086463900:
                if (str.equals("regular")) {
                    str = context.getString(R.string.football_situation_open_play);
                    break;
                }
                break;
            case 1611117818:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_OWN_GOAL)) {
                    str = context.getString(R.string.football_own_goal);
                    break;
                }
                break;
            case 2014285902:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_FAST_BREAK)) {
                    str = context.getString(R.string.football_situation_fast_break);
                    break;
                }
                break;
        }
        str.getClass();
        return str;
    }

    public static boolean N(Status status, Time time) {
        StatusTime statusTime;
        status.getClass();
        String type = status.getType();
        if (Intrinsics.c(type, StatusKt.STATUS_FINISHED)) {
            return true;
        }
        if (!Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS)) {
            return false;
        }
        if (time == null || (statusTime = time.getStatusTime()) == null) {
            return true;
        }
        long initial = ((statusTime.getInitial() + (System.currentTimeMillis() / 1000)) + xe6.c().b) - statusTime.getTimestamp();
        long max = statusTime.getMax();
        if (initial > max) {
            initial = max;
        }
        return ((float) Math.ceil((double) (((float) initial) / 60.0f))) > 24.0f;
    }

    public static void O(String str) {
        synchronized (f) {
            r(str, null);
        }
    }

    public static final xtc P(wla wlaVar, final Function1 function1, of3 of3Var) {
        wlaVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = e.d(0L);
            av8Var.n0(O);
        }
        final boh bohVar = (boh) O;
        Unit unit = Unit.a;
        boolean g2 = av8Var.g(function1);
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            final int i2 = 0;
            O2 = new Function1() { // from class: tv
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    boh bohVar2 = bohVar;
                    Function1 function12 = function1;
                    switch (i3) {
                        case 0:
                            a7b a7bVar = (a7b) obj;
                            a7bVar.getClass();
                            return new ov(a7bVar, function12, bohVar2, 1);
                        default:
                            if (((Boolean) obj).booleanValue()) {
                                bohVar2.i(yaa.v());
                            } else if (bohVar2.h() != 0) {
                                function12.invoke(Long.valueOf(yaa.v() - bohVar2.h()));
                                bohVar2.i(0L);
                            }
                            return Unit.a;
                    }
                }
            };
            av8Var.n0(O2);
        }
        jca.c(unit, null, (Function1) O2, av8Var, 6);
        boolean g3 = av8Var.g(function1);
        Object O3 = av8Var.O();
        if (g3 || O3 == a99Var) {
            final int i3 = 1;
            O3 = new Function1() { // from class: tv
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    boh bohVar2 = bohVar;
                    Function1 function12 = function1;
                    switch (i32) {
                        case 0:
                            a7b a7bVar = (a7b) obj;
                            a7bVar.getClass();
                            return new ov(a7bVar, function12, bohVar2, 1);
                        default:
                            if (((Boolean) obj).booleanValue()) {
                                bohVar2.i(yaa.v());
                            } else if (bohVar2.h() != 0) {
                                function12.invoke(Long.valueOf(yaa.v() - bohVar2.h()));
                                bohVar2.i(0L);
                            }
                            return Unit.a;
                    }
                }
            };
            av8Var.n0(O3);
        }
        return s02.V(utc.a, 500L, 0.5f, wlaVar, (Function1) O3);
    }

    public static boolean Q(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean R(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static final xtc S(xtc xtcVar, wla wlaVar, String str, List list, Function0 function0, av8 av8Var, int i2) {
        xtcVar.getClass();
        wlaVar.getClass();
        list.getClass();
        function0.getClass();
        boolean i3 = ((((i2 & 896) ^ 384) > 256 && av8Var.g(str)) || (i2 & 384) == 256) | av8Var.i(list) | av8Var.g(function0);
        Object O = av8Var.O();
        if (i3 || O == nf3.a) {
            O = new fa(3, list, str, function0);
            av8Var.n0(O);
        }
        return s02.V(xtcVar, 500L, 1.0f, wlaVar, (Function1) O);
    }

    public static int[] T(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) zm2.E(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static d15[] U(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, d15[] d15VarArr) {
        byte[] bArr3 = tol.k;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, tol.l)) {
                a70.r("Unsupported meta version");
                return null;
            }
            int E = (int) zm2.E(fileInputStream, 2);
            byte[] D = zm2.D(fileInputStream, (int) zm2.E(fileInputStream, 4), (int) zm2.E(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                a70.r("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(D);
            try {
                d15[] W = W(byteArrayInputStream, bArr2, E, d15VarArr);
                byteArrayInputStream.close();
                return W;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(tol.f, bArr2)) {
            a70.r("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            a70.r("Unsupported meta version");
            return null;
        }
        int E2 = (int) zm2.E(fileInputStream, 1);
        byte[] D2 = zm2.D(fileInputStream, (int) zm2.E(fileInputStream, 4), (int) zm2.E(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            a70.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(D2);
        try {
            d15[] V = V(byteArrayInputStream2, E2, d15VarArr);
            byteArrayInputStream2.close();
            return V;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static d15[] V(ByteArrayInputStream byteArrayInputStream, int i2, d15[] d15VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new d15[0];
        }
        if (i2 != d15VarArr.length) {
            a70.r("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int E = (int) zm2.E(byteArrayInputStream, 2);
            iArr[i3] = (int) zm2.E(byteArrayInputStream, 2);
            strArr[i3] = new String(zm2.C(byteArrayInputStream, E), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            d15 d15Var = d15VarArr[i4];
            if (!d15Var.b.equals(strArr[i4])) {
                a70.r("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            d15Var.e = i5;
            d15Var.h = T(byteArrayInputStream, i5);
        }
        return d15VarArr;
    }

    public static d15[] W(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, d15[] d15VarArr) {
        d15 d15Var;
        if (byteArrayInputStream.available() == 0) {
            return new d15[0];
        }
        if (i2 != d15VarArr.length) {
            a70.r("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            zm2.E(byteArrayInputStream, 2);
            String str = new String(zm2.C(byteArrayInputStream, (int) zm2.E(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long E = zm2.E(byteArrayInputStream, 4);
            int E2 = (int) zm2.E(byteArrayInputStream, 2);
            if (d15VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < d15VarArr.length; i4++) {
                    if (d15VarArr[i4].b.equals(substring)) {
                        d15Var = d15VarArr[i4];
                        break;
                    }
                }
            }
            d15Var = null;
            if (d15Var == null) {
                a70.r("Missing profile key: ".concat(str));
                return null;
            }
            d15Var.d = E;
            int[] T = T(byteArrayInputStream, E2);
            if (Arrays.equals(bArr, tol.j)) {
                d15Var.e = E2;
                d15Var.h = T;
            }
        }
        return d15VarArr;
    }

    public static d15[] X(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, tol.g)) {
            a70.r("Unsupported version");
            return null;
        }
        int E = (int) zm2.E(fileInputStream, 1);
        byte[] D = zm2.D(fileInputStream, (int) zm2.E(fileInputStream, 4), (int) zm2.E(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            a70.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(D);
        try {
            d15[] Y = Y(byteArrayInputStream, str, E);
            byteArrayInputStream.close();
            return Y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static d15[] Y(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new d15[0];
        }
        d15[] d15VarArr = new d15[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int E = (int) zm2.E(byteArrayInputStream, 2);
            int E2 = (int) zm2.E(byteArrayInputStream, 2);
            d15VarArr[i4] = new d15(str, new String(zm2.C(byteArrayInputStream, E), StandardCharsets.UTF_8), zm2.E(byteArrayInputStream, 4), E2, (int) zm2.E(byteArrayInputStream, 4), (int) zm2.E(byteArrayInputStream, 4), new int[E2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            d15 d15Var = d15VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = d15Var.f;
            int i7 = d15Var.g;
            TreeMap treeMap = d15Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) zm2.E(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int E3 = (int) zm2.E(byteArrayInputStream, 2);
                while (E3 > 0) {
                    zm2.E(byteArrayInputStream, 2);
                    int E4 = (int) zm2.E(byteArrayInputStream, 1);
                    if (E4 != 6 && E4 != 7) {
                        while (E4 > 0) {
                            zm2.E(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int E5 = (int) zm2.E(byteArrayInputStream, 1); E5 > 0; E5--) {
                                zm2.E(byteArrayInputStream, 2);
                            }
                            E4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    E3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                a70.r("Read too much data during profile line parse");
                return null;
            }
            d15Var.h = T(byteArrayInputStream, d15Var.e);
            BitSet valueOf = BitSet.valueOf(zm2.C(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return d15VarArr;
    }

    public static void Z(View view) {
        e6b b2;
        g6b t = qea.t(view);
        if (t != null && (b2 = t.b()) != null && b2.compareTo(e6b.e) >= 0) {
            D(view, 250L, null, null, false);
            return;
        }
        view.animate().cancel();
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    public static final void a(int i2, int i3, int i4, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1284164863);
        int i5 = i4 | (av8Var.e(i2) ? 4 : 2) | (av8Var.e(i3) ? 32 : 16) | 384;
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            float f2 = i2 / i3;
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new wl2(17);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = ml4.b(((Boolean) e1dVar.getValue()).booleanValue() ? f2 : 0.0f);
                av8Var.n0(O2);
            }
            q50 q50Var = (q50) O2;
            Unit unit = Unit.a;
            boolean g2 = av8Var.g(e1dVar) | av8Var.i(q50Var) | av8Var.d(f2);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                O3 = new pv2(q50Var, f2, e1dVar, null, 0);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, unit, (Function2) O3);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc l2 = bkh.l(utcVar, 56.0f);
            long D = lz.D(R.color.on_color_primary, av8Var);
            long D2 = lz.D(R.color.on_color_highlight_2, av8Var);
            boolean i6 = av8Var.i(q50Var);
            Object O4 = av8Var.O();
            if (i6 || O4 == a99Var) {
                O4 = new yj1(q50Var, 21);
                av8Var.n0(O4);
            }
            ncf.b((Function0) O4, l2, D, 4.0f, D2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 3120, 64);
            context.getClass();
            String g3 = fc6.g(i2, i3, hkg.c0(context) ? "\\" : "/");
            yf8 yf8Var = xth.a;
            udj.c(g3, l98.d0(bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, 1), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i2, i3, xtcVar2, i4, 1);
        }
    }

    public static void a0(View view) {
        e6b b2;
        g6b t = qea.t(view);
        if (t != null && (b2 = t.b()) != null && b2.compareTo(e6b.e) >= 0) {
            F(view, 250L, null);
            return;
        }
        view.animate().cancel();
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(8);
    }

    public static final void b(int i2, of3 of3Var, xtc xtcVar, Integer num, String str) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-152635825);
        int i3 = i2 | (av8Var.g(num) ? 4 : 2) | (av8Var.g(str) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            td4.i(num, bkh.l(utcVar, 16.0f), av8Var, 48 | (i3 & 14));
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, (i3 >> 3) & 14, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mw6(num, str, xtcVar, i2);
        }
    }

    public static final q9k b0(UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType) {
        int i2;
        switch (ww0.a[uniqueTournamentIndividualAwardType.ordinal()]) {
            case 1:
                i2 = R.string.defensive_player_of_the_year_award;
                break;
            case 2:
                i2 = R.string.most_improved_player_award;
                break;
            case 3:
                i2 = R.string.rookie_of_the_year_award;
                break;
            case 4:
                i2 = R.string.sixth_man_of_the_year_award;
                break;
            case 5:
                i2 = R.string.coach_of_the_year_award;
                break;
            case 6:
                i2 = R.string.mvp_award;
                break;
            case 7:
                i2 = R.string.finals_mvp_award;
                break;
            case 8:
                i2 = R.string.clutch_player_of_the_year_award;
                break;
            case 9:
                i2 = R.string.sportsmanship_award;
                break;
            case 10:
                i2 = R.string.teammate_of_the_year_award;
                break;
            case 11:
                i2 = R.string.hustle_award;
                break;
            case 12:
                i2 = R.string.social_justice_champion_award;
                break;
            default:
                zzl.b();
                return null;
        }
        return new q9k(i2);
    }

    public static final void c(int i2, int i3, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(789673884);
        int i4 = (av8Var2.e(i2) ? 4 : 2) | i3;
        if (av8Var2.T(i4 & 1, (i4 & 3) != 2)) {
            String valueOf = String.valueOf(i2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            q5a.w(valueOf, l98.d0(n9e.q(utc.a, lz.D(R.color.surface_1, av8Var2), o7g.a), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.b(), av8Var, 0, 0, 130040);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i2, i3, 3);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean c0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, d15[] d15VarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = tol.j;
        byte[] bArr3 = tol.i;
        byte[] bArr4 = tol.f;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = tol.g;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] v = v(d15VarArr, bArr5);
                zm2.O(byteArrayOutputStream, d15VarArr.length, 1);
                zm2.O(byteArrayOutputStream, v.length, 4);
                byte[] o2 = zm2.o(v);
                zm2.O(byteArrayOutputStream, o2.length, 4);
                byteArrayOutputStream.write(o2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                zm2.O(byteArrayOutputStream, d15VarArr.length, 1);
                for (d15 d15Var : d15VarArr) {
                    int size = d15Var.i.size() * 4;
                    String I = I(d15Var.a, d15Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    zm2.P(byteArrayOutputStream, I.getBytes(charset).length);
                    zm2.P(byteArrayOutputStream, d15Var.h.length);
                    zm2.O(byteArrayOutputStream, size, 4);
                    zm2.O(byteArrayOutputStream, d15Var.c, 4);
                    byteArrayOutputStream.write(I.getBytes(charset));
                    Iterator it = d15Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        zm2.P(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        zm2.P(byteArrayOutputStream, 0);
                    }
                    for (int i4 : d15Var.h) {
                        zm2.P(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = tol.h;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] v2 = v(d15VarArr, bArr6);
                zm2.O(byteArrayOutputStream, d15VarArr.length, 1);
                zm2.O(byteArrayOutputStream, v2.length, 4);
                byte[] o3 = zm2.o(v2);
                zm2.O(byteArrayOutputStream, o3.length, 4);
                byteArrayOutputStream.write(o3);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            zm2.P(byteArrayOutputStream, d15VarArr.length);
            for (d15 d15Var2 : d15VarArr) {
                String str = d15Var2.a;
                TreeMap treeMap = d15Var2.i;
                String I2 = I(str, d15Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                zm2.P(byteArrayOutputStream, I2.getBytes(charset2).length);
                zm2.P(byteArrayOutputStream, treeMap.size());
                zm2.P(byteArrayOutputStream, d15Var2.h.length);
                zm2.O(byteArrayOutputStream, d15Var2.c, 4);
                byteArrayOutputStream.write(I2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    zm2.P(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : d15Var2.h) {
                    zm2.P(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            zm2.P(byteArrayOutputStream2, d15VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (d15 d15Var3 : d15VarArr) {
                zm2.O(byteArrayOutputStream2, d15Var3.c, 4);
                zm2.O(byteArrayOutputStream2, d15Var3.d, 4);
                zm2.O(byteArrayOutputStream2, d15Var3.g, 4);
                String I3 = I(d15Var3.a, d15Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = I3.getBytes(charset3).length;
                zm2.P(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(I3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            dml dmlVar = new dml(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList.add(dmlVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < d15VarArr.length) {
                try {
                    d15 d15Var4 = d15VarArr[i8];
                    zm2.P(byteArrayOutputStream3, i8);
                    zm2.P(byteArrayOutputStream3, d15Var4.e);
                    i9 = i9 + 4 + (d15Var4.e * i6);
                    int[] iArr = d15Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        zm2.P(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            dml dmlVar2 = new dml(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList.add(dmlVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < d15VarArr.length; i14++) {
                try {
                    d15 d15Var5 = d15VarArr[i14];
                    Iterator it3 = d15Var5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        h0(byteArrayOutputStream4, i15, d15Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            i0(byteArrayOutputStream4, d15Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            zm2.P(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            zm2.O(byteArrayOutputStream3, length4, 4);
                            zm2.P(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            dml dmlVar3 = new dml(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList.add(dmlVar3);
            long size2 = 12 + (arrayList.size() * 16);
            zm2.O(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                dml dmlVar4 = (dml) arrayList.get(i17);
                int i18 = dmlVar4.a;
                byte[] bArr7 = dmlVar4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                zm2.O(byteArrayOutputStream, j2, 4);
                zm2.O(byteArrayOutputStream, size2, 4);
                if (dmlVar4.c) {
                    long length5 = bArr7.length;
                    byte[] o4 = zm2.o(bArr7);
                    arrayList2.add(o4);
                    zm2.O(byteArrayOutputStream, o4.length, 4);
                    zm2.O(byteArrayOutputStream, length5, 4);
                    length = o4.length;
                } else {
                    arrayList2.add(bArr7);
                    zm2.O(byteArrayOutputStream, bArr7.length, 4);
                    zm2.O(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final void d(boolean z, Function2 function2, String str, String str2, xtc xtcVar, qug qugVar, boolean z2, of3 of3Var, int i2) {
        av8 av8Var;
        Function2 function22;
        xtc xtcVar2;
        xtc xtcVar3;
        Object l84Var;
        utc utcVar;
        int i3;
        ce8 ce8Var;
        e1d e1dVar;
        e1d e1dVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1186168518);
        int i4 = i2 | (av8Var2.h(z) ? 4 : 2) | (av8Var2.i(function2) ? 32 : 16) | (av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(str2) ? a.o : 1024) | 24576 | (av8Var2.g(qugVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            av8Var2.Y();
            int i5 = i2 & 1;
            utc utcVar2 = utc.a;
            if (i5 == 0 || av8Var2.B()) {
                xtcVar3 = utcVar2;
            } else {
                av8Var2.W();
                xtcVar3 = xtcVar;
            }
            av8Var2.t();
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new ce8();
                av8Var2.n0(O);
            }
            ce8 ce8Var2 = (ce8) O;
            mvh mvhVar = (mvh) av8Var2.k(dh3.q);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = e.f(str);
                av8Var2.n0(O2);
            }
            e1d e1dVar3 = (e1d) O2;
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = e.f(str2);
                av8Var2.n0(O3);
            }
            e1d e1dVar4 = (e1d) O3;
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                O4 = goh.b(new fu5(qugVar, 4));
                av8Var2.n0(O4);
            }
            cdi cdiVar = (cdi) O4;
            Object O5 = av8Var2.O();
            if (O5 == a99Var) {
                O5 = goh.b(new m61(str, str2, e1dVar3, e1dVar4));
                av8Var2.n0(O5);
            }
            cdi cdiVar2 = (cdi) O5;
            Boolean valueOf = Boolean.valueOf(z2);
            boolean g2 = ((i4 & 3670016) == 1048576) | av8Var2.g(mvhVar);
            Object O6 = av8Var2.O();
            if (g2 || O6 == a99Var) {
                utcVar = utcVar2;
                i3 = 0;
                ce8Var = ce8Var2;
                e1dVar = e1dVar4;
                e1dVar2 = e1dVar3;
                l84Var = new l84(z2, ce8Var, mvhVar, (rq3) null, 4);
                av8Var2.n0(l84Var);
            } else {
                utcVar = utcVar2;
                e1dVar2 = e1dVar3;
                ce8Var = ce8Var2;
                e1dVar = e1dVar4;
                l84Var = O6;
                i3 = 0;
            }
            hz8.o(av8Var2, valueOf, (Function2) l84Var);
            xtc o2 = tol.o(bkh.d(xtcVar3, 1.0f));
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, i3);
            utc utcVar3 = utcVar;
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, o2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            xtc xtcVar4 = xtcVar3;
            f50 f50Var3 = hf3.d;
            e1d e1dVar5 = e1dVar;
            ce8 ce8Var3 = ce8Var;
            xtc d0 = l98.d0(hkg.u0(ljg.g(av8Var2, C, f50Var3, 1.0f, false), qugVar, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            xtc d02 = l98.d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String str3 = (String) e1dVar2.getValue();
            String v = oea.v(R.string.fantasy_league_name, av8Var2);
            String v2 = oea.v(R.string.fantasy_league_name_restriction, av8Var2);
            t28 C3 = r4a.C(30);
            Object O7 = av8Var2.O();
            if (O7 == a99Var) {
                O7 = new w30(28, e1dVar2);
                av8Var2.n0(O7);
            }
            e1d e1dVar6 = e1dVar2;
            q5a.r(str3, d02, null, (Function1) O7, null, null, null, v, null, v2, null, false, C3, 0L, 0, 0, null, 0L, 0L, 6, false, false, false, av8Var2, 3120, 384, 6, 15723892);
            xtc d03 = l98.d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            xtc G = lz.G(utcVar3, ce8Var3);
            String str4 = (String) e1dVar5.getValue();
            String v3 = oea.v(R.string.fantasy_league_description, av8Var2);
            String v4 = oea.v(R.string.fantasy_league_description_restriction, av8Var2);
            t28 C4 = r4a.C(1000);
            Object O8 = av8Var2.O();
            if (O8 == a99Var) {
                O8 = new w30(29, e1dVar5);
                av8Var2.n0(O8);
            }
            q5a.r(str4, d03, G, (Function1) O8, null, null, null, v3, null, v4, null, false, C4, 0L, 0, 0, null, 0L, 0L, 0, false, false, false, av8Var2, 3120, 384, 384, 12578160);
            w1l.s(utcVar3, 48.0f, av8Var2, true);
            String v5 = oea.v(R.string.save_changes, av8Var2);
            boolean booleanValue = ((Boolean) cdiVar2.getValue()).booleanValue();
            xtc b0 = l98.b0(n9e.q(d2a.E(bkh.d(utcVar3, 1.0f), ((Boolean) cdiVar.getValue()).booleanValue() ? 8.0f : 0.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var2), oyn.e), 16.0f);
            boolean z3 = (i4 & 112) == 32;
            Object O9 = av8Var2.O();
            if (z3 || O9 == a99Var) {
                function22 = function2;
                O9 = new mi(25, function22, e1dVar6, e1dVar5);
                av8Var2.n0(O9);
            } else {
                function22 = function2;
            }
            mha.h(v5, (Function0) O9, b0, null, null, booleanValue, z, false, 0L, 0, 0, av8Var2, (i4 << 18) & 3670016, 0, 1944);
            av8Var = av8Var2;
            av8Var.s(true);
            xtcVar2 = xtcVar4;
        } else {
            av8Var = av8Var2;
            function22 = function2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ri4(z, function22, str, str2, xtcVar2, qugVar, z2, i2);
        }
    }

    public static void d0(String str) {
        synchronized (f) {
            r(str, null);
        }
    }

    public static final void e(q67 q67Var, boolean z, xtc xtcVar, mei meiVar, Function1 function1, Function1 function12, qug qugVar, boolean z2, Function1 function13, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        av8 av8Var;
        Function1 function14;
        xtc xtcVar3;
        boolean z3;
        Function1 function15;
        boolean z4;
        int i5;
        Context context;
        long c2;
        am3 am3Var;
        e1d e1dVar;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel;
        pm3 pm3Var;
        boolean z5;
        int i6;
        int i7;
        q67Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(671691348);
        int i8 = (av8Var2.g(q67Var) ? 4 : 2) | i2 | (av8Var2.h(z) ? 32 : 16);
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 = i8 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i8 | (av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i10 = i4 | (av8Var2.e(meiVar == null ? -1 : meiVar.ordinal()) ? a.o : 1024);
        if ((i2 & 24576) == 0) {
            i10 |= av8Var2.i(function1) ? 16384 : 8192;
        }
        int i11 = i10 | (av8Var2.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(qugVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 918552576;
        if (av8Var2.T(i11 & 1, (306783379 & i11) != 306783378)) {
            av8Var2.Y();
            int i12 = i2 & 1;
            int i13 = 3;
            Object obj = nf3.a;
            if (i12 == 0 || av8Var2.B()) {
                if (i9 != 0) {
                    xtcVar2 = utc.a;
                }
                Object O = av8Var2.O();
                if (O == obj) {
                    O = new yt6(i13);
                    av8Var2.n0(O);
                }
                function15 = (Function1) O;
                z4 = true;
            } else {
                av8Var2.W();
                z4 = z2;
                function15 = function13;
            }
            av8Var2.t();
            Context context2 = (Context) av8Var2.k(nz.b);
            View view = (View) av8Var2.k(nz.f);
            cdi P = z1a.P(qugVar, av8Var2);
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = q67Var.a;
            yy6 yy6Var = fantasyRoundPlayerUiModel2.c;
            int i14 = yy6Var == null ? -1 : tw6.a[yy6Var.ordinal()];
            if (i14 == 1 || i14 == 2) {
                i5 = i11;
                av8Var2.d0(1250317063);
                context = context2;
                c2 = r13.c(lz.D(R.color.error, av8Var2), 0.15f);
                av8Var2.s(false);
            } else {
                if (i14 == 3 || i14 == 4) {
                    i5 = i11;
                    z5 = false;
                    i6 = 1250319393;
                    i7 = R.color.surface_0;
                } else {
                    i6 = 1250320385;
                    i7 = R.color.surface_1;
                    i5 = i11;
                    z5 = false;
                }
                c2 = ljg.f(av8Var2, i6, i7, av8Var2, z5);
                context = context2;
            }
            xtc q = n9e.q(bkh.d(xtcVar2, 1.0f), c2, oyn.e);
            boolean z6 = (function1 == null || fantasyRoundPlayerUiModel2.e) ? false : true;
            boolean g2 = ((i5 & 57344) == 16384) | av8Var2.g(fantasyRoundPlayerUiModel2);
            Object O2 = av8Var2.O();
            if (g2 || O2 == obj) {
                O2 = new lw6(function1, fantasyRoundPlayerUiModel2, 0);
                av8Var2.n0(O2);
            }
            xtc y = tol.y(q, z6, false, false, 0L, null, (Function0) O2, av8Var2, 30);
            av8Var2.d0(-1003410150);
            av8Var2.d0(212064437);
            av8Var2.s(false);
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = new t1c(kx4Var);
                av8Var2.n0(O3);
            }
            t1c t1cVar = (t1c) O3;
            Object O4 = av8Var2.O();
            if (O4 == obj) {
                O4 = new am3();
                av8Var2.n0(O4);
            }
            am3 am3Var2 = (am3) O4;
            Object O5 = av8Var2.O();
            if (O5 == obj) {
                O5 = e.f(Boolean.FALSE);
                av8Var2.n0(O5);
            }
            e1d e1dVar2 = (e1d) O5;
            Object O6 = av8Var2.O();
            if (O6 == obj) {
                O6 = new pm3(am3Var2);
                av8Var2.n0(O6);
            }
            pm3 pm3Var2 = (pm3) O6;
            Object O7 = av8Var2.O();
            if (O7 == obj) {
                am3Var = am3Var2;
                O7 = e.e(Unit.a, f7a.k);
                av8Var2.n0(O7);
            } else {
                am3Var = am3Var2;
            }
            e1d e1dVar3 = (e1d) O7;
            boolean i15 = av8Var2.i(t1cVar) | av8Var2.e(257);
            Object O8 = av8Var2.O();
            if (i15 || O8 == obj) {
                O8 = new kd3(e1dVar3, t1cVar, pm3Var2, e1dVar2, 1);
                e1dVar = e1dVar2;
                fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel2;
                pm3Var = pm3Var2;
                av8Var2.n0(O8);
            } else {
                fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel2;
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
            }
            k1c k1cVar = (k1c) O8;
            Object O9 = av8Var2.O();
            if (O9 == obj) {
                O9 = new ld3(e1dVar, pm3Var, 1);
                av8Var2.n0(O9);
            }
            Function0 function0 = (Function0) O9;
            boolean i16 = av8Var2.i(t1cVar);
            Object O10 = av8Var2.O();
            if (i16 || O10 == obj) {
                O10 = new md3(t1cVar, 1);
                av8Var2.n0(O10);
            }
            xtc a2 = o3h.a(y, false, (Function1) O10);
            av8Var = av8Var2;
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = fantasyRoundPlayerUiModel;
            xtc xtcVar4 = xtcVar2;
            s6a.h(a2, yqo.H(1200550679, av8Var, new ow6(e1dVar3, am3Var, function0, fantasyRoundPlayerUiModel3, function12, z, q67Var, context, P, qugVar, z4, view, function15, meiVar)), k1cVar, av8Var, 48);
            av8Var.s(false);
            z3 = z4;
            function14 = function15;
            xtcVar3 = xtcVar4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            function14 = function13;
            xtcVar3 = xtcVar2;
            z3 = z2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new a05(q67Var, z, xtcVar3, meiVar, function1, function12, qugVar, z3, function14, i2, i3);
        }
    }

    public static void e0(String str, Throwable th) {
        synchronized (f) {
            r(str, th);
        }
    }

    public static final void f(il8 il8Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        il8Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(697508164);
        int i3 = i2 | (av8Var.e(il8Var.ordinal()) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtcVar2 = xtcVar;
            xtc l2 = bkh.l(xtcVar2, 48.0f);
            t3e t3eVar = new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            n7g a2 = o7g.a(12.0f);
            t3e t3eVar2 = q72.a;
            iz8.e(function0, l2, false, a2, q72.a(lz.D(R.color.surface_1, av8Var), lz.D(R.color.n_lv_1, av8Var), 0L, 0L, av8Var, 12), null, null, t3eVar, null, yqo.H(252770132, av8Var, new s16(il8Var, 11)), av8Var, ((i3 >> 3) & 14) | 817889280, 356);
            av8Var = av8Var;
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(il8Var, function0, xtcVar2, i2, 4);
        }
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, d15 d15Var) {
        i0(byteArrayOutputStream, d15Var);
        int i2 = d15Var.g;
        int[] iArr = d15Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            zm2.P(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : d15Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String str, String str2, xtc xtcVar, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        xtc xtcVar2;
        boolean z5;
        boolean z6;
        eqf u;
        long f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1819795571);
        int i6 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(str2) ? 32 : 16);
        int i7 = i6 | 384;
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 = i6 | 3456;
        } else if ((i2 & 3072) == 0) {
            z3 = z;
            i7 |= av8Var.h(z3) ? a.o : 1024;
            i4 = i3 & 16;
            if (i4 == 0) {
                i5 = i7 | 24576;
                z4 = z2;
            } else {
                z4 = z2;
                i5 = i7 | (av8Var.h(z4) ? 16384 : 8192);
            }
            if (av8Var.T(i5 & 1, (i5 & 9363) == 9362)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                z5 = z3;
                z6 = z4;
            } else {
                if (i8 != 0) {
                    z3 = false;
                }
                z6 = i4 != 0 ? false : z4;
                if (z3) {
                    f2 = z6 ? ljg.f(av8Var, -771845449, R.color.error, av8Var, false) : ljg.f(av8Var, -771844574, R.color.neutral_highlight, av8Var, false);
                } else {
                    av8Var.d0(-771846536);
                    av8Var.s(false);
                    f2 = r13.h;
                }
                long f3 = (z3 && z6) ? ljg.f(av8Var, -771841349, R.color.on_color_primary, av8Var, false) : ljg.f(av8Var, -771840362, R.color.n_lv_1, av8Var, false);
                ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                lv1 lv1Var = uxf.m;
                utc utcVar = utc.a;
                xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, d0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                long D = lz.D(R.color.n_lv_1, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(str, new goa(1.0f, true), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, i5 & 14, 24960, 110584);
                udj.c(str2, l98.c0(n9e.q(utcVar, f2, o7g.a(16.0f)), 12.0f, 4.0f), f3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, (i5 >> 3) & 14, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(true);
                z5 = z3;
                xtcVar2 = utcVar;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new e82(str, str2, xtcVar2, z5, z6, i2, i3, 4);
                return;
            }
            return;
        }
        z3 = z;
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        if (av8Var.T(i5 & 1, (i5 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, d15 d15Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        zm2.P(byteArrayOutputStream, str.getBytes(charset).length);
        zm2.P(byteArrayOutputStream, d15Var.e);
        zm2.O(byteArrayOutputStream, d15Var.f, 4);
        zm2.O(byteArrayOutputStream, d15Var.c, 4);
        zm2.O(byteArrayOutputStream, d15Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void h(final int i2, final int i3, final int i4, final double d2, final xtc xtcVar, of3 of3Var, final int i5) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1262317929);
        int i6 = i5 | (av8Var.e(i2) ? 4 : 2) | (av8Var.e(i3) ? 32 : 16) | (av8Var.e(i4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.c(d2) ? a.o : 1024);
        if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            final Context context = (Context) av8Var.k(nz.b);
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(80196407, av8Var, new ct8() { // from class: on7
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((v23) obj).getClass();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        kv1 kv1Var = uxf.p;
                        utc utcVar = utc.a;
                        xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                        u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, f0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a2, hf3.g);
                        waa.K(av8Var2, m2, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C, hf3.d);
                        rha.b(oea.v(R.string.overview, av8Var2), null, 0L, av8Var2, 0, 6);
                        tgj.g(bf3.g(16.0f, R.string.free_transfers_used, av8Var2, av8Var2, utcVar), String.valueOf(i2), null, false, false, av8Var2, 0, 28);
                        String v = oea.v(R.string.additional_transfers_used, av8Var2);
                        Context context2 = context;
                        context2.getClass();
                        int i7 = i4;
                        String valueOf = String.valueOf(i7);
                        valueOf.getClass();
                        String string = context2.getString(R.string.n_points, valueOf);
                        string.getClass();
                        tgj.g(v, i3 + " (" + string + ")", null, true, i7 < 0, av8Var2, 3072, 4);
                        String v2 = oea.v(R.string.left_in_the_bank, av8Var2);
                        Locale d3 = dla.d();
                        Set set = o84.a;
                        tgj.g(v2, String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context2), Double.valueOf(d2)}, 2)), null, false, false, av8Var2, 0, 28);
                        av8Var2.s(true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i2, i3, i4, d2, xtcVar, i5) { // from class: pn7
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ double d;
                public final /* synthetic */ xtc e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(24577);
                    tgj.h(this.a, this.b, this.c, this.d, this.e, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, int i2, d15 d15Var) {
        int i3 = d15Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : d15Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final Function0 function0, xtc xtcVar, final int i2, boolean z, long j2, float f2, of3 of3Var, int i3, int i4) {
        int i5;
        boolean z2;
        long j3;
        final float f3;
        boolean z3;
        float f4;
        long j4;
        xtc xtcVar2;
        eqf u;
        final long j5;
        final boolean z4;
        int i6;
        int i7;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1507387232);
        if ((i3 & 6) == 0) {
            i5 = (av8Var.i(function0) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i8 = i5 | 48;
        if ((i3 & 384) == 0) {
            i8 |= av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                z2 = z;
                if (av8Var.h(z2)) {
                    i7 = a.o;
                    i8 |= i7;
                }
            } else {
                z2 = z;
            }
            i7 = 1024;
            i8 |= i7;
        } else {
            z2 = z;
        }
        if ((i3 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                j3 = j2;
                if (av8Var.f(j3)) {
                    i6 = 16384;
                    i8 |= i6;
                }
            } else {
                j3 = j2;
            }
            i6 = 8192;
            i8 |= i6;
        } else {
            j3 = j2;
        }
        int i9 = i4 & 32;
        if (i9 != 0) {
            i8 |= 196608;
        } else if ((196608 & i3) == 0) {
            f3 = f2;
            i8 |= av8Var.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            boolean z5 = false;
            if (av8Var.T(i8 & 1, (74899 & i8) == 74898)) {
                av8Var.W();
                z3 = z2;
                f4 = f3;
                j4 = j3;
                xtcVar2 = xtcVar;
            } else {
                av8Var.Y();
                if ((i3 & 1) == 0 || av8Var.B()) {
                    if ((i4 & 8) == 0) {
                        z5 = z2;
                    } else if (i2 > 0) {
                        z5 = true;
                    }
                    long D = (i4 & 16) != 0 ? lz.D(R.color.surface_1, av8Var) : j3;
                    xtcVar = utc.a;
                    if (i9 != 0) {
                        j5 = D;
                        f3 = 2.0f;
                    } else {
                        j5 = D;
                    }
                    z4 = z5;
                } else {
                    av8Var.W();
                    j5 = j3;
                    z4 = z2;
                }
                final xtc xtcVar3 = xtcVar;
                av8Var.t();
                tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(-1439110176, av8Var, new Function2() { // from class: r28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j6;
                        of3 of3Var2 = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                            k1c c2 = e12.c(uxf.c, false);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C = fqj.C(av8Var2, xtc.this);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, c2, hf3.g);
                            waa.K(av8Var2, m2, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C, hf3.d);
                            xtc e2 = bkh.e(utc.a, 32.0f);
                            n7g a2 = o7g.a(16.0f);
                            t3e t3eVar = q72.a;
                            boolean z6 = z4;
                            if (z6) {
                                j6 = ljg.f(av8Var2, -214816989, R.color.n_lv_1, av8Var2, false);
                            } else {
                                av8Var2.d0(-214816503);
                                av8Var2.s(false);
                                j6 = j5;
                            }
                            iz8.e(function0, e2, false, a2, q72.a(j6, 0L, 0L, 0L, av8Var2, 14), q72.b(f3, 30), null, new t3e(8.0f, 8.0f, 12.0f, 8.0f), null, yqo.H(1746134698, av8Var2, new s28(z6, i2)), av8Var2, 805306416, 324);
                            av8Var2.s(true);
                        } else {
                            av8Var2.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, 56);
                f4 = f3;
                j4 = j5;
                z3 = z4;
                xtcVar2 = xtcVar3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new zs1(function0, xtcVar2, i2, z3, j4, f4, i3, i4);
                return;
            }
            return;
        }
        f3 = f2;
        boolean z52 = false;
        if (av8Var.T(i8 & 1, (74899 & i8) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, d15 d15Var) {
        int i2 = 0;
        for (Map.Entry entry : d15Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                zm2.P(byteArrayOutputStream, intValue - i2);
                zm2.P(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final void j(FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, xtc xtcVar, of3 of3Var, int i2) {
        zg3 zg3Var;
        r13 r13Var;
        boolean z;
        long j2;
        ry ryVar;
        f50 f50Var;
        kv1 kv1Var;
        f50 f50Var2;
        ff3 ff3Var;
        float f2;
        utc utcVar;
        f50 f50Var3;
        zg3 zg3Var2;
        Unit unit;
        boolean z2;
        String str;
        boolean z3;
        ImageVector N;
        o68 o68Var;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1823142542);
        int i3 = i2 | (av8Var.g(fantasyPlayerFixtureUiModel2) ? 4 : 2);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            kv1 kv1Var2 = uxf.p;
            av8Var.d0(-2032396964);
            utc utcVar2 = utc.a;
            xtc A = wnn.A(bkh.l(utcVar2, 48.0f), o7g.a(4.0f));
            Integer valueOf2 = (fantasyPlayerFixtureUiModel2 == null || (o68Var = fantasyPlayerFixtureUiModel2.p) == null) ? null : Integer.valueOf(o68Var.a);
            if (valueOf2 == null) {
                av8Var.d0(1420140348);
                av8Var.s(false);
                z = false;
                zg3Var = zg3Var3;
                r13Var = null;
            } else {
                av8Var.d0(1420140349);
                zg3Var = zg3Var3;
                r13Var = new r13(lz.D(valueOf2.intValue(), av8Var));
                z = false;
                av8Var.s(false);
            }
            if (r13Var == null) {
                j2 = ljg.f(av8Var, -2032398087, R.color.rating_00, av8Var, z);
            } else {
                av8Var.d0(-2032400164);
                av8Var.s(z);
                j2 = r13Var.a;
            }
            xtc q = n9e.q(A, j2, oyn.e);
            if (fantasyPlayerFixtureUiModel2 != null) {
                boolean i4 = av8Var.i(context) | ((i3 & 14) == 4);
                Object O = av8Var.O();
                if (i4 || O == nf3.a) {
                    O = new h84(26, (Object) context, (Object) fantasyPlayerFixtureUiModel2);
                    av8Var.n0(O);
                }
                f50Var = f50Var5;
                kv1Var = kv1Var2;
                ff3Var = ff3Var2;
                f2 = 4.0f;
                ryVar = ryVar2;
                f50Var3 = f50Var6;
                f50Var2 = f50Var4;
                xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                av8Var = av8Var;
                utcVar = utcVar2;
                q = q.z(y);
            } else {
                ryVar = ryVar2;
                f50Var = f50Var5;
                kv1Var = kv1Var2;
                f50Var2 = f50Var4;
                ff3Var = ff3Var2;
                f2 = 4.0f;
                utcVar = utcVar2;
                f50Var3 = f50Var6;
            }
            av8Var.s(false);
            xtc b0 = l98.b0(q, f2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var2 = zg3Var;
                av8Var.l(zg3Var2);
            } else {
                zg3Var2 = zg3Var;
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var2);
            waa.K(av8Var, m3, ff3Var);
            f50 f50Var7 = f50Var;
            bf3.s(hashCode2, av8Var, f50Var7, av8Var, ryVar);
            f50 f50Var8 = f50Var3;
            waa.K(av8Var, C2, f50Var8);
            xtc b02 = l98.b0(n9e.q(bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var), o7g.a(f2)), 2.0f);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var2);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var7, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var8);
            Integer valueOf3 = fantasyPlayerFixtureUiModel != null ? Integer.valueOf(fantasyPlayerFixtureUiModel.g) : null;
            if (valueOf3 == null) {
                av8Var.d0(-1323400422);
                av8Var.s(false);
                unit = null;
            } else {
                av8Var.d0(-1323400421);
                td4.u(valueOf3.intValue(), 48, av8Var, bkh.c);
                Unit unit2 = Unit.a;
                av8Var.s(false);
                unit = Unit.a;
            }
            if (unit == null) {
                av8Var.d0(-1323210856);
                kq9.b(s6a.N(R.drawable.ic_more_horiz, 6, av8Var), null, bkh.c, lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                Unit unit3 = Unit.a;
                z2 = false;
                av8Var.s(false);
            } else {
                z2 = false;
                av8Var.d0(-873974662);
                av8Var.s(false);
            }
            bf3.t(av8Var, true, utcVar, f2, av8Var);
            kg0 kg0Var = ww9.f;
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var7, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var8);
            fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
            if (fantasyPlayerFixtureUiModel2 == null || (str = fantasyPlayerFixtureUiModel2.h) == null) {
                str = "-";
            }
            long D = lz.D(R.color.on_color_primary, av8Var);
            yf8 yf8Var = xth.a;
            boolean z4 = z2;
            av8 av8Var2 = av8Var;
            utc utcVar3 = utcVar;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 110586);
            av8Var = av8Var2;
            p68 p68Var = fantasyPlayerFixtureUiModel2 != null ? fantasyPlayerFixtureUiModel2.o : null;
            if (p68Var == null) {
                av8Var.d0(1488035581);
                av8Var.s(z4);
                z3 = true;
            } else {
                ljg.r(f2, 1488035582, av8Var, av8Var, utcVar3);
                xtc l2 = bkh.l(utcVar3, 12.0f);
                long D2 = lz.D(R.color.on_color_primary, av8Var);
                int ordinal = p68Var.ordinal();
                if (ordinal != 0) {
                    z3 = true;
                    if (ordinal != 1) {
                        throw dmi.h(av8Var, 1753456262, z4);
                    }
                    av8Var.d0(1753462374);
                    N = s6a.N(R.drawable.ic_away, 6, av8Var);
                    av8Var.s(z4);
                } else {
                    z3 = true;
                    av8Var.d0(1753458918);
                    N = s6a.N(R.drawable.ic_home, 6, av8Var);
                    av8Var.s(z4);
                }
                kq9.b(N, null, l2, D2, av8Var, 432, 0);
                Unit unit4 = Unit.a;
                av8Var.s(z4);
            }
            ljg.t(av8Var, z3, z3, z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(fantasyPlayerFixtureUiModel2, xtcVar, i2, 28);
        }
    }

    public static a10 k(int i2, int i3, int i4, int i5) {
        ColorSpace colorSpace;
        b5g b5gVar;
        int i6;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace rgb;
        int i7 = (i5 & 4) != 0 ? 0 : i4;
        b5g b5gVar2 = l23.e;
        c6o.f0(i7);
        Bitmap.Config f0 = c6o.f0(i7);
        if (Intrinsics.c(b5gVar2, b5gVar2)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.c(b5gVar2, l23.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.c(b5gVar2, l23.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.c(b5gVar2, l23.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.c(b5gVar2, l23.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.c(b5gVar2, l23.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.c(b5gVar2, l23.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.c(b5gVar2, l23.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.c(b5gVar2, l23.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.c(b5gVar2, l23.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.c(b5gVar2, l23.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.c(b5gVar2, l23.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.c(b5gVar2, l23.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.c(b5gVar2, l23.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.c(b5gVar2, l23.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (Intrinsics.c(b5gVar2, l23.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else if (Build.VERSION.SDK_INT < 34 || (colorSpace = q9.w(b5gVar2)) == null) {
            if (b5gVar2 != null) {
                String str = b5gVar2.a;
                float[] a2 = b5gVar2.d.a();
                kvj kvjVar = b5gVar2.g;
                if (kvjVar != null) {
                    b5gVar = b5gVar2;
                    i6 = 0;
                    transferParameters = new ColorSpace.Rgb.TransferParameters(kvjVar.b, kvjVar.c, kvjVar.d, kvjVar.e, kvjVar.f, kvjVar.g, kvjVar.a);
                } else {
                    b5gVar = b5gVar2;
                    i6 = 0;
                    transferParameters = null;
                }
                b5g b5gVar3 = b5gVar;
                float[] fArr = b5gVar3.i;
                if (transferParameters != null) {
                    ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(str, b5gVar3.h, a2, transferParameters);
                    if (Float.isNaN(fArr[i6]) || Arrays.equals(rgb2.getTransform(), fArr)) {
                        rgb = rgb2;
                    } else {
                        colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                    }
                } else {
                    float[] fArr2 = b5gVar3.h;
                    final a5g a5gVar = b5gVar3.l;
                    final int i8 = i6;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: k23
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            int i9 = i8;
                            Function1 function1 = a5gVar;
                            switch (i9) {
                            }
                            return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    };
                    final a5g a5gVar2 = b5gVar3.o;
                    final int i9 = 1;
                    rgb = new ColorSpace.Rgb(str, fArr2, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: k23
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            int i92 = i9;
                            Function1 function1 = a5gVar2;
                            switch (i92) {
                            }
                            return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    }, b5gVar3.e, b5gVar3.f);
                }
                return new a10(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, f0, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        rgb = colorSpace;
        return new a10(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, f0, true, rgb));
    }

    public static final void l(Double d2, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1699717684);
        int i3 = 4;
        int i4 = (av8Var.g(d2) ? 4 : 2) | i2;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            ry ryVar = ry.v;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new yt6(i3);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean z = (i4 & 14) == 4;
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new x16(d2, 11);
                av8Var.n0(O2);
            }
            td4.b(function1, null, ryVar, null, (Function1) O2, av8Var, 6, 10);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nw6(d2, xtcVar, i2, i5);
        }
    }

    public static final void m(j22 j22Var, Context context, c14 c14Var) {
        context.getClass();
        int i2 = 0;
        for (Object obj : b.j(j22Var.d, j22Var.e, j22Var.f, (TextView) j22Var.g, (TextView) j22Var.h, (TextView) j22Var.i, (TextView) j22Var.j)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            TextView textView = (TextView) obj;
            g04 g04Var = (g04) CollectionsKt.a0(i2, c14Var.c);
            if (g04Var != null) {
                textView.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.getClass();
                ((tl3) layoutParams).H = g04Var.b;
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                layoutParams2.getClass();
                ((tl3) layoutParams2).P = ao2.s(g04Var.c, context);
            } else {
                textView.setVisibility(8);
            }
            i2 = i3;
        }
    }

    public static final void n(j22 j22Var, boolean z) {
        int i2;
        ConstraintLayout constraintLayout = j22Var.b;
        constraintLayout.getClass();
        sea.v(constraintLayout, false, z, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) j22Var.o;
        constraintLayout2.getClass();
        if (z) {
            Context context = constraintLayout2.getContext();
            context.getClass();
            i2 = ao2.s(8, context);
        } else {
            i2 = 0;
        }
        constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), i2);
    }

    public static final void o(View view, long j2, BaseInterpolator baseInterpolator) {
        view.getClass();
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(j2);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(baseInterpolator);
        alphaAnimation.setAnimationListener(new vg2(view, 1));
        view.startAnimation(alphaAnimation);
    }

    public static /* synthetic */ void p(View view, long j2, int i2) {
        if ((i2 & 1) != 0) {
            j2 = 250;
        }
        o(view, j2, new AccelerateDecelerateInterpolator());
    }

    public static void q(View view, m1 m1Var, int i2) {
        long j2 = (i2 & 1) != 0 ? 250L : 400L;
        if ((i2 & 8) != 0) {
            m1Var = null;
        }
        view.getClass();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(j2);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setAnimationListener(new an6(view, m1Var));
        view.startAnimation(alphaAnimation);
    }

    public static void r(String str, Throwable th) {
        String replace;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (f) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    } finally {
                    }
                }
            }
            str2 = replace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static xtc s(xtc xtcVar, int i2, int i3, int i4, a70 a70Var, float f2, int i5) {
        if ((i5 & 4) != 0) {
            i3 = InterfaceC4060ee.c.d;
        }
        int i6 = i3;
        int i7 = (i5 & 8) != 0 ? i6 : i4;
        hvb hvbVar = a70Var;
        if ((i5 & 16) != 0) {
            hvbVar = wkn.i;
        }
        hvb hvbVar2 = hvbVar;
        if ((i5 & 32) != 0) {
            float f3 = wkn.j;
            f2 = 30.0f;
        }
        return xtcVar.z(new fvb(i2, i6, i7, hvbVar2, f2));
    }

    public static final float t(ol4 ol4Var, float f2, float f3) {
        y78 y78Var = ol4Var.a;
        f80 f80Var = new f80(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int b2 = f80Var.b();
        int i2 = 0;
        while (i2 < b2) {
            f80Var.e(y78Var.w(i2 == 0 ? f2 : 0.0f, i2 == 0 ? f3 : 0.0f), i2);
            i2++;
        }
        return f80Var.a;
    }

    public static String u(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static byte[] v(d15[] d15VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (d15 d15Var : d15VarArr) {
            i3 += ((((d15Var.g * 2) + 7) & (-8)) / 8) + (d15Var.e * 2) + I(d15Var.a, d15Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + d15Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, tol.h)) {
            int length = d15VarArr.length;
            while (i2 < length) {
                d15 d15Var2 = d15VarArr[i2];
                g0(byteArrayOutputStream, d15Var2, I(d15Var2.a, d15Var2.b, bArr));
                f0(byteArrayOutputStream, d15Var2);
                i2++;
            }
        } else {
            for (d15 d15Var3 : d15VarArr) {
                g0(byteArrayOutputStream, d15Var3, I(d15Var3.a, d15Var3.b, bArr));
            }
            int length2 = d15VarArr.length;
            while (i2 < length2) {
                f0(byteArrayOutputStream, d15VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final xbl w(Context context, ti3 ti3Var) {
        f6g w;
        context.getClass();
        zbl zblVar = new zbl(ti3Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        n5h n5hVar = zblVar.a;
        n5hVar.getClass();
        bgf bgfVar = ti3Var.d;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            w = new f6g(applicationContext, WorkDatabase.class, null);
            w.i = true;
        } else {
            w = i9a.w(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            w.h = new yf0(applicationContext);
        }
        w.f = n5hVar;
        w.d.add(new dw2());
        w.a(ojc.h);
        w.a(new t0g(applicationContext, 2, 3));
        w.a(ojc.i);
        w.a(ojc.j);
        w.a(new t0g(applicationContext, 5, 6));
        w.a(ojc.k);
        w.a(ojc.l);
        w.a(ojc.m);
        w.a(new t0g(applicationContext));
        w.a(new t0g(applicationContext, 10, 11));
        w.a(ojc.d);
        w.a(ojc.e);
        w.a(ojc.f);
        w.a(ojc.g);
        w.a(new t0g(applicationContext, 21, 22));
        w.o = false;
        w.p = true;
        w.q = true;
        WorkDatabase workDatabase = (WorkDatabase) w.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        nuj nujVar = new nuj(applicationContext2, zblVar);
        g8f g8fVar = new g8f(context.getApplicationContext(), ti3Var, zblVar, workDatabase);
        return new xbl(context.getApplicationContext(), ti3Var, zblVar, workDatabase, (List) ybl.b.invoke(context, ti3Var, zblVar, workDatabase, nujVar, g8fVar), g8fVar, nujVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x(ug3 ug3Var, d dVar) {
        if (!((wtc) ug3Var).a.n) {
            r3a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        aee aeeVar = (aee) c6o.c0(ug3Var).B;
        aeeVar.getClass();
        return ktm.I(aeeVar, dVar);
    }

    public static void y(String str) {
        synchronized (f) {
            r(str, null);
        }
    }

    public static void z(String str) {
        synchronized (f) {
            r(str, null);
        }
    }
}
