package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.network.response.serializers.EnumSerializerKt;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.BaseballPitchType;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.model.newNetwork.statistics.BaseballRunner;
import com.sofascore.model.newNetwork.statistics.PlayerHand;
import com.sofascore.results.R;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.view.SofascoreRatingView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class u6h {
    public static final tc3 a = new tc3(931843332, new qs2(16), false);
    public static final tc3 b = new tc3(515162633, new qs2(17), false);
    public static final tc3 c = new tc3(-1038497287, new qs2(18), false);
    public static final tc3 d = new tc3(197194487, new pd3(16), false);
    public static final re6 e = new re6(0);
    public static final xlh f = new xlh(2);
    public static final ylh g = new ylh(2);
    public static seh h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static a10 k;
    public static wx l;
    public static wj2 m;
    public static ImageVector n;
    public static ImageVector o;
    public static ImageVector p;

    public static final void A(final double d2, final boolean z, xtc xtcVar, of3 of3Var, final int i2) {
        int i3;
        final xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(17264441);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.c(d2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ry ryVar = ry.v;
            int i4 = i3 & 14;
            boolean z2 = ((i3 & 112) == 32) | (i4 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new zj8(z, d2);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean z3 = i4 == 4;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var) {
                O2 = new Function1() { // from class: ak8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) obj;
                        sofascoreRatingView.getClass();
                        sofascoreRatingView.n(d2);
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            td4.b(function1, xtcVar, ryVar, null, (Function1) O2, av8Var, (i3 >> 3) & 112, 8);
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: bk8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u6h.A(d2, z, xtcVar2, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void B(String str, float f2, Float f3, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        int i3;
        int i4;
        utc utcVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1610385986);
        int i5 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.d(f2) ? 32 : 16) | (av8Var.g(f3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            n9a n9aVar = n9a.a;
            utc utcVar2 = utc.a;
            xtc Y = fz8.Y(utcVar2, n9aVar);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
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
            String w = oea.w(R.string.baseball_team_win_probability, new Object[]{str}, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(w, new goa(1.0f, false), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110584);
            udj.c(yid.d("%.1f", Float.valueOf(f2)).concat("%"), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            Float f4 = null;
            if (f3 != null && Math.abs(f3.floatValue()) > 0.05f) {
                f4 = f3;
            }
            if (f4 == null) {
                av8Var.d0(-39218259);
                av8Var.s(false);
                utcVar = utcVar2;
            } else {
                av8Var.d0(-39218258);
                float floatValue = f4.floatValue();
                float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i3 = -1418041517;
                    i4 = R.color.success;
                } else {
                    i3 = -1418040943;
                    i4 = R.color.error;
                }
                long f6 = ljg.f(av8Var, i3, i4, av8Var, false);
                tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, bkh.c(utcVar2, 1.0f));
                udj.c(yid.d("%.1f", Float.valueOf(Math.abs(floatValue))), null, f6, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f5 = 180.0f;
                }
                utcVar = utcVar2;
                wkn.l(s6a.N(R.drawable.ic_position_arrow_up_8, 6, av8Var), haa.v(utcVar, f5), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(f6, 5), av8Var, 48, 56);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8b(str, f2, f3, xtcVar2, i2);
        }
    }

    public static final xtc C(xtc xtcVar, float f2) {
        return f2 == 1.0f ? xtcVar : s02.O(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 520187);
    }

    public static final q80 D(Pair pair, of3 of3Var) {
        int g2;
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-1273484728);
        o80 o80Var = new o80();
        i06 i06Var = (i06) pair.a;
        i06 i06Var2 = (i06) pair.b;
        if (i06Var != null) {
            av8Var.d0(267672052);
            av8Var.d0(-268459750);
            g2 = o80Var.g(K(av8Var));
            try {
                o80Var.d(oea.v(i06Var.a, av8Var));
                o80Var.d(" ");
                Unit unit = Unit.a;
                o80Var.f(g2);
                av8Var.s(false);
                g2 = o80Var.g(Y(0L, av8Var, 1));
                try {
                    o80Var.c(i06Var.b);
                    o80Var.f(g2);
                    av8Var.s(false);
                } finally {
                }
            } finally {
            }
        } else {
            av8Var.d0(267904614);
            av8Var.s(false);
        }
        if (i06Var2 != null) {
            av8Var.d0(267943457);
            av8Var.d0(-268450996);
            g2 = o80Var.g(K(av8Var));
            if (i06Var != null) {
                try {
                    o80Var.d(" • ");
                } catch (Throwable th) {
                    throw th;
                }
            }
            o80Var.d(oea.v(i06Var2.a, av8Var));
            o80Var.d(" ");
            Unit unit2 = Unit.a;
            o80Var.f(g2);
            av8Var.s(false);
            g2 = o80Var.g(Y(0L, av8Var, 1));
            try {
                o80Var.c(i06Var2.b);
                o80Var.f(g2);
                av8Var.s(false);
            } finally {
            }
        } else {
            av8Var.d0(268225030);
            av8Var.s(false);
        }
        q80 h2 = o80Var.h();
        av8Var.s(false);
        return h2;
    }

    public static final q80 E(String str, String str2, long j2, of3 of3Var, int i2) {
        if ((i2 & 4) != 0) {
            j2 = lz.D(R.color.n_lv_1, of3Var);
        }
        av8 av8Var = (av8) of3Var;
        av8Var.d0(1059520428);
        o80 o80Var = new o80();
        int g2 = o80Var.g(K(av8Var));
        try {
            o80Var.d(str + " • ");
            Unit unit = Unit.a;
            o80Var.f(g2);
            g2 = o80Var.g(Y(j2, av8Var, 0));
            try {
                o80Var.d(str2);
                o80Var.f(g2);
                q80 h2 = o80Var.h();
                av8Var.s(false);
                return h2;
            } finally {
            }
        } finally {
        }
    }

    public static void F(String str, boolean z) {
        if (!z) {
            throw r9e.a(str, null);
        }
    }

    public static xtc G(xtc xtcVar) {
        return xtcVar.z(new nt2(new b42(16)));
    }

    public static boolean H(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = H(file2) && z;
        }
        return z;
    }

    public static ImageVector I() {
        ImageVector imageVector = p;
        if (imageVector != null) {
            return imageVector;
        }
        fu9 fu9Var = new fu9("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        km5 km5Var = jmk.a;
        pvh pvhVar = new pvh(r13.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new ibe(7.0f, 10.0f));
        arrayList.add(new pbe(5.0f, 5.0f));
        arrayList.add(new pbe(5.0f, -5.0f));
        arrayList.add(ebe.c);
        fu9.a(fu9Var, arrayList, pvhVar);
        ImageVector b2 = fu9Var.b();
        p = b2;
        return b2;
    }

    public static Intent J(Context context, ev6 ev6Var, ho7 ho7Var, boolean z, boolean z2, boolean z3, gv9 gv9Var, double d2, int i2, Integer num) {
        context.getClass();
        ho7Var.getClass();
        gv9Var.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyTransfersActivity.class);
        intent.putExtra("competition", ev6Var);
        intent.putExtra("gameweek", ho7Var);
        intent.putExtra("tripleCaptain", z);
        intent.putExtra("wildcard", z2);
        intent.putExtra("freeHit", z3);
        intent.putExtra("balance", d2);
        intent.putExtra("joinedInRoundId", i2);
        intent.putParcelableArrayListExtra("squad", new ArrayList<>(gv9Var));
        if (num != null) {
            intent.putExtra("transferOutId", num.intValue());
        }
        return intent;
    }

    public static final pwh K(of3 of3Var) {
        return new pwh(lz.D(R.color.n_lv_3, of3Var), v8a.v(12), wg8.g, (rg8) null, (sg8) null, xth.a, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65496);
    }

    public static Set L(String str, Map map) {
        vei valueOf;
        List L = aik.L(str, map);
        if (L == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(vei.class);
        for (Object obj : L) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int intValue = d2.intValue();
                uaa.A(obj, "Status code %s is not integral", ((double) intValue) == d2.doubleValue());
                valueOf = xei.d(intValue).a;
                uaa.A(obj, "Status code %s is not valid", valueOf.a == d2.intValue());
            } else {
                if (!(obj instanceof String)) {
                    StringBuilder sb = new StringBuilder("Can not convert status code ");
                    sb.append(obj);
                    Class<?> cls = obj.getClass();
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(cls);
                    throw new fb3(sb.toString(), 14);
                }
                try {
                    valueOf = vei.valueOf((String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new fb3(14, lnb.m(obj, "Status code ", " is not valid"), (Throwable) e2);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List M(Map map) {
        String R;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List L = aik.L("loadBalancingConfig", map);
            if (L == null) {
                L = null;
            } else {
                aik.B(L);
            }
            arrayList.addAll(L);
        }
        if (arrayList.isEmpty() && (R = aik.R("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(R.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int N(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static final void O() {
        try {
            seh sehVar = h;
            if (sehVar == null) {
                sehVar = (seh) ((fc4) ((p58) r38.c().b(p58.class))).o.get();
                sehVar.getClass();
                h = sehVar;
            }
            if (sehVar == null) {
                Intrinsics.i("sharedSessionRepository");
                throw null;
            }
            if (sehVar.i) {
                if (sehVar != null) {
                    sehVar.a();
                } else {
                    Intrinsics.i("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void P(bwh bwhVar, Function1 function1) {
        bwhVar.getClass();
        function1.getClass();
        w52 u = bwhVar.u();
        if (u.w()) {
            a70.p("Buffer is empty");
            return;
        }
        a1h a1hVar = u.a;
        a1hVar.getClass();
        byte[] bArr = a1hVar.a;
        int i2 = a1hVar.b;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, a1hVar.c - i2);
        wrap.getClass();
        function1.invoke(wrap);
        int position = wrap.position() - i2;
        if (position != 0) {
            if (position < 0) {
                a70.r("Returned negative read bytes count");
            } else if (position <= a1hVar.a()) {
                u.skip(position);
            } else {
                a70.r("Returned too many bytes");
            }
        }
    }

    public static final d87 Q(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = hz8.G(g.a, av8Var);
            av8Var.n0(O);
        }
        ku3 ku3Var = (ku3) O;
        boolean g2 = av8Var.g(context) | av8Var.g(ku3Var);
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            ia0 ia0Var = ia0.q;
            y65 y65Var = ok3.p().o;
            if (y65Var == null) {
                Intrinsics.i("fantasyEntryPointCoordinator");
                throw null;
            }
            Object obj = y65Var.get();
            obj.getClass();
            O2 = new d87(context, ku3Var, (lx6) obj);
            av8Var.n0(O2);
        }
        return (d87) O2;
    }

    public static j3d R(List list, hfb hfbVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s6h s6hVar = (s6h) it.next();
            String str = s6hVar.a;
            gfb b2 = hfbVar.b(str);
            if (b2 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(u6h.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                j3d c2 = b2.c(s6hVar.b);
                return c2.a != null ? c2 : new j3d(new t6h(b2, c2.b));
            }
            arrayList.add(str);
        }
        return new j3d(xei.g.h("None of " + arrayList + " specified by Service Config are available."));
    }

    public static final xtc S(xtc xtcVar, kkj kkjVar, r3 r3Var, obj objVar, kt3 kt3Var) {
        return xtcVar.z(new t8j(kkjVar, r3Var, objVar, kt3Var));
    }

    public static final void T(int i2) {
        throw new v5h(ljg.j(i2, "An unknown field for index "));
    }

    public static Bitmap U(Drawable drawable, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if ((i4 & 2) != 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        drawable.getClass();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                a70.p("bitmap is null");
                return null;
            }
            if (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                bitmap.getClass();
                return bitmap;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            createScaledBitmap.getClass();
            return createScaledBitmap;
        }
        Rect bounds = drawable.getBounds();
        bounds.getClass();
        int i5 = bounds.left;
        int i6 = bounds.top;
        int i7 = bounds.right;
        int i8 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i5, i6, i7, i8);
        return createBitmap;
    }

    public static final oqf V(oqf oqfVar, dma dmaVar, dma dmaVar2) {
        if (!dmaVar.f() || !dmaVar2.f()) {
            return oqf.e;
        }
        return jca.r(dmaVar2.l(o6a.y(dmaVar), oqfVar.f()), oqfVar.e());
    }

    public static final boolean W(Throwable th, Function0 function0) {
        e15 e15Var;
        th.getClass();
        List b2 = gz8.d.b(th);
        int size = b2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) b2.get(i2)) instanceof e15) {
                return false;
            }
        }
        try {
            df3 df3Var = (df3) function0.invoke();
            if (df3Var != null) {
                boolean z2 = df3Var.b;
                List list = df3Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((ef3) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                df3Var.getClass();
                e15Var = new e15(df3Var);
            } else {
                e15Var = null;
            }
        } catch (Throwable th2) {
            e15Var = th2;
        }
        if (e15Var != null) {
            de6.a(th, e15Var);
        }
        return z;
    }

    public static List X(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new s6h(str, aik.P(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final pwh Y(long j2, of3 of3Var, int i2) {
        return new pwh((i2 & 1) != 0 ? lz.D(R.color.n_lv_1, of3Var) : j2, v8a.v(12), wg8.j, (rg8) null, (sg8) null, xth.a, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65496);
    }

    public static final void a(pl0 pl0Var, BaseballActionOutcome baseballActionOutcome, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        boolean z2;
        String str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1870171649);
        int i3 = i2 | (av8Var.g(pl0Var) ? 4 : 2) | (av8Var.e(baseballActionOutcome == null ? -1 : baseballActionOutcome.ordinal()) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i4 = pl0Var.a;
            xtc l2 = bkh.l(utcVar, 32.0f);
            boolean i5 = ((i3 & 14) == 4) | av8Var.i(context);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new j4(18, context, pl0Var);
                av8Var.n0(O);
            }
            td4.G(i4, tol.y(l2, false, false, false, 0L, null, (Function0) O, av8Var, 31), false, 0L, av8Var, 0, 12);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            String a4 = c91.a(pl0Var.c, context);
            yf8 yf8Var = xth.a;
            udj.c(a4, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, lz.D(R.color.n_lv_3, av8Var), 0L, av8Var, bkh.e(utcVar, 16.0f));
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            udj.c(fc6.g(pl0Var.f, pl0Var.g, " - "), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8 av8Var2 = av8Var;
            nq8.h(av8Var2, new goa(1.0f, true));
            xtc e0 = l98.e0(n9e.q(utcVar, lz.D(k53.k0(baseballActionOutcome, null), av8Var2), o7g.a(8.0f)), 4.0f, 2.0f, 8.0f, 2.0f);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, e0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            if (baseballActionOutcome == BaseballActionOutcome.Homerun) {
                av8Var2.d0(-684574997);
                kq9.b(s6a.N(R.drawable.baseball_homerun, 6, av8Var2), null, bkh.l(utcVar, 14.0f), lz.D(R.color.surface_1, av8Var2), av8Var2, 432, 0);
                av8Var2 = av8Var2;
                z2 = false;
                av8Var2.s(false);
            } else {
                z2 = false;
                av8Var2.d0(-684288061);
                av8Var2.s(false);
            }
            nq8.h(av8Var2, bkh.p(utcVar, 4.0f));
            if (baseballActionOutcome == null || (str = k53.r0(baseballActionOutcome, context)) == null) {
                str = "-";
            }
            boolean z3 = z2;
            av8 av8Var3 = av8Var2;
            udj.c(str, null, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131066);
            av8Var3.s(true);
            av8Var3.s(true);
            nq8.h(av8Var3, bkh.e(utcVar, 8.0f));
            udj.c(pl0Var.d, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var3, 0, 0, 131066);
            av8Var = av8Var3;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            if (z) {
                av8Var.d0(-1281934179);
                Float f2 = pl0Var.i;
                if (f2 == null) {
                    av8Var.d0(-1085253884);
                    av8Var.s(z3);
                } else {
                    av8Var.d0(-1085253883);
                    B(pl0Var.b, f2.floatValue(), pl0Var.j, null, av8Var, 0);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    Unit unit = Unit.a;
                    av8Var.s(z3);
                }
                av8Var.s(z3);
            } else {
                av8Var.d0(-1084930677);
                av8Var.s(z3);
            }
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(pl0Var, baseballActionOutcome, z, xtcVar2, i2, 0);
        }
    }

    public static final xh3 b() {
        return new xh3();
    }

    public static final void c(l81 l81Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2087518679);
        int i3 = (av8Var.i(l81Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            if (l81Var != null) {
                gv9 gv9Var = l81Var.b;
                av8Var.d0(-1857348394);
                xtc u0 = hkg.u0(l98.c0(n9e.q(bkh.c, lz.D(R.color.surface_1, av8Var), oyn.e), 16.0f, 8.0f), hkg.o0(av8Var), false, 14);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, u0);
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
                pl0 pl0Var = l81Var.a;
                BaseballPitch baseballPitch = (BaseballPitch) CollectionsKt.j0(gv9Var);
                a(pl0Var, baseballPitch != null ? baseballPitch.getOutcome() : null, l81Var.c, null, av8Var, 0);
                utc utcVar = utc.a;
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                o((BaseballPitch) CollectionsKt.h0(gv9Var), av8Var, 0);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                u(gv9Var, l81Var.a.h, av8Var, 0);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                av8Var.d0(-1056064712);
                ArrayList arrayList = new ArrayList();
                for (Object obj : gv9Var) {
                    BaseballPitch baseballPitch2 = (BaseballPitch) obj;
                    if (baseballPitch2.getPitchCode() != null && baseballPitch2.getPitchSpeed() != null) {
                        arrayList.add(obj);
                    }
                }
                av8Var.d0(-1056063207);
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    t((BaseballPitch) next, (BaseballPitch) CollectionsKt.a0(i4 - 1, arrayList), av8Var, 0);
                    i4 = i5;
                }
                i.p(av8Var, false, false, true, false);
            } else {
                av8Var.d0(-1856344149);
                av8Var.s(false);
            }
            s6a.a(l81Var == null, bkh.c, av8Var, 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(l81Var, i2, 16);
        }
    }

    public static final void d(q81 q81Var, of3 of3Var, int i2) {
        q81Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1918564027);
        int i3 = (av8Var.i(q81Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            c((l81) ((vnb) rfo.x(q81Var.n, av8Var, 0).getValue()).a(), av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(q81Var, i2, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Iterable] */
    public static final void e(BaseballPitch baseballPitch, of3 of3Var, int i2) {
        int i3;
        ?? r3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1803142946);
        int i4 = i2 | (av8Var.i(baseballPitch) ? 4 : 2);
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            List<BaseballRunner> runners = baseballPitch.getRunners();
            if (runners != null) {
                r3 = new ArrayList();
                Iterator it = runners.iterator();
                while (it.hasNext()) {
                    Integer endingBase = ((BaseballRunner) it.next()).getEndingBase();
                    if (endingBase != null) {
                        r3.add(endingBase);
                    }
                }
            } else {
                r3 = km5.a;
            }
            f5p.a(l6g.W(r3), ((kx4) av8Var.k(dh3.h)).H0(5.0f), lz.D(R.color.n_lv_4, av8Var), lz.D(R.color.value, av8Var), bkh.m(utcVar, 22.0f, 16.0f), av8Var, 24576, 0);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            String m3 = ljg.m(baseballPitch.getBalls(), baseballPitch.getStrikes(), " - ");
            if (hkg.c0(context)) {
                m3 = n9e.G(m3, " - ");
            }
            yf8 yf8Var = xth.a;
            i3 = 0;
            udj.c(m3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            s(yid.m(baseballPitch.getOuts()), 0, av8Var);
            av8Var.s(true);
        } else {
            i3 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n81(baseballPitch, i2, i3);
        }
    }

    public static final void f(boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        xtc xtcVar2;
        int i5;
        int i6;
        utc utcVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(253985752);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i7 = i3 | 48;
        if (av8Var.T(i7 & 1, (i7 & 19) != 18)) {
            if (z) {
                i5 = -732823356;
                i6 = R.color.success;
            } else {
                i5 = -732822767;
                i6 = R.color.brand_tertiary_default;
            }
            long f2 = ljg.f(av8Var, i5, i6, av8Var, false);
            float f3 = z ? 4.0f : 8.0f;
            mv1 mv1Var = uxf.g;
            utc utcVar2 = utc.a;
            xtc b0 = l98.b0(n9e.q(d2a.E(bkh.d(utcVar2, 1.0f), 2.0f, null, false, 0L, 30), f2, oyn.e), f3);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                av8Var.d0(1152895184);
                String v = oea.v(R.string.world_cup_special, av8Var);
                long D = lz.D(R.color.on_color_primary, av8Var);
                yf8 yf8Var = xth.a;
                utcVar = utcVar2;
                i4 = 0;
                udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                i4 = 0;
                utcVar = utcVar2;
                av8Var.d0(1153124584);
                kq9.b(s6a.N(R.drawable.sofascore_analyst_logo, 6, av8Var), null, null, lz.D(R.color.n_lv_2, av8Var), av8Var, 48, 4);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            i4 = 0;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs5(z, xtcVar2, i2, i4);
        }
    }

    public static final void g(int i2, of3 of3Var, vnb vnbVar, Function1 function1, boolean z, boolean z2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-729372899);
        int i3 = i2 | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 2048 : 1024);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = (i3 & 7168) == 2048;
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new ri(29, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(-1542807973, av8Var, new hs5(z2, function1, i4)), av8Var, (i3 & 14) | 100663296 | ((i3 << 3) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk(vnbVar, z, z2, function1, i2, 1);
        }
    }

    public static final void h(xs5 xs5Var, Function1 function1, Function1 function12, of3 of3Var, int i2) {
        xs5Var.getClass();
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-912101804);
        int i3 = i2 | (av8Var.i(xs5Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? 256 : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (O == a99Var) {
                yea yeaVar = j58.a;
                Boolean valueOf = Boolean.valueOf(j58.j());
                av8Var.n0(valueOf);
                obj = valueOf;
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            e1d x = rfo.x(xs5Var.f, av8Var, 0);
            e1d x2 = rfo.x(xs5Var.j, av8Var, 0);
            Activity activity = (Activity) av8Var.k(ngb.a);
            vnb vnbVar = (vnb) x.getValue();
            boolean g2 = ((i3 & 896) == 256) | av8Var.g(x);
            Object O2 = av8Var.O();
            Object obj2 = O2;
            if (g2 || O2 == a99Var) {
                y24 y24Var = new y24(function12, x, null, r10);
                av8Var.n0(y24Var);
                obj2 = y24Var;
            }
            hz8.o(av8Var, vnbVar, (Function2) obj2);
            vnb vnbVar2 = (vnb) x.getValue();
            boolean booleanValue2 = ((Boolean) x2.getValue()).booleanValue();
            int i4 = (av8Var.i(activity) ? 1 : 0) | ((i3 & 112) != 32 ? 0 : 1) | (av8Var.i(xs5Var) ? 1 : 0);
            Object O3 = av8Var.O();
            Object obj3 = O3;
            if (i4 != 0 || O3 == a99Var) {
                fa faVar = new fa(22, (Object) activity, (Object) xs5Var, function1);
                av8Var.n0(faVar);
                obj3 = faVar;
            }
            g(384, av8Var, vnbVar2, (Function1) obj3, booleanValue2, booleanValue);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(xs5Var, function1, function12, i2, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final lj7 lj7Var, final int i2, final boolean z, final Function0 function0, final boolean z2, xtc xtcVar, boolean z3, of3 of3Var, int i3, int i4) {
        boolean z4;
        boolean z5;
        eqf u;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1286665968);
        int i5 = i3 | (av8Var.g(lj7Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | (av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i6 = i4 & 64;
        if (i6 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            z4 = z3;
            i5 |= av8Var.h(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            if (av8Var.T(i5 & 1, (599187 & i5) == 599186)) {
                av8Var.W();
                z5 = z4;
            } else {
                final boolean z6 = i6 != 0 ? true : z4;
                final Context context = (Context) av8Var.k(nz.b);
                un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(-919220606, av8Var, new ct8() { // from class: l17
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float f2;
                        int i7;
                        int i8;
                        av8 av8Var2;
                        f50 f50Var;
                        zg3 zg3Var;
                        f50 f50Var2;
                        f50 f50Var3;
                        of3 of3Var2 = (of3) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((v23) obj).getClass();
                        av8 av8Var3 = (av8) of3Var2;
                        if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                            kg0 kg0Var = ww9.f;
                            kv1 kv1Var = uxf.p;
                            utc utcVar = utc.a;
                            float f3 = 1.0f;
                            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                            u23 a2 = t23.a(kg0Var, kv1Var, av8Var3, 54);
                            int hashCode = Long.hashCode(av8Var3.T);
                            aee m2 = av8Var3.m();
                            xtc C = fqj.C(av8Var3, f0);
                            if3.k7.getClass();
                            zg3 zg3Var2 = hf3.b;
                            av8Var3.h0();
                            if (av8Var3.S) {
                                av8Var3.l(zg3Var2);
                            } else {
                                av8Var3.q0();
                            }
                            f50 f50Var4 = hf3.g;
                            waa.K(av8Var3, a2, f50Var4);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var3, m2, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var5 = hf3.j;
                            waa.K(av8Var3, valueOf, f50Var5);
                            ry ryVar = hf3.k;
                            waa.J(av8Var3, ryVar);
                            f50 f50Var6 = hf3.d;
                            waa.K(av8Var3, C, f50Var6);
                            rha.b(oea.v(R.string.transfers, av8Var3), null, 0L, av8Var3, 0, 6);
                            nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                            lj7 lj7Var2 = lj7.this;
                            if (lj7Var2 == null) {
                                av8Var3.d0(-1946718458);
                                f2 = 16.0f;
                                j72.h(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), Integer.valueOf(R.drawable.match_shotmap), null, Integer.valueOf(!z6 ? R.string.fantasy_opponent_transfers_empty_text : !z ? R.string.fantasy_transfers_empty_text : R.string.fantasy_transfers_locked_empty_text), false, null, 0, 0L, av8Var3, 24582, 228);
                                av8Var2 = av8Var3;
                                av8Var2.s(false);
                                f50Var = f50Var5;
                                zg3Var = zg3Var2;
                                f50Var2 = f50Var4;
                                f50Var3 = f50Var6;
                            } else {
                                f2 = 16.0f;
                                float f4 = lj7Var2.d;
                                gv9 gv9Var = lj7Var2.f;
                                av8Var3.d0(-1946113679);
                                Throwable th = null;
                                m6k.i(0, av8Var3, null);
                                float f5 = 4.0f;
                                nq8.h(av8Var3, bkh.e(utcVar, 4.0f));
                                av8Var3.d0(1738340336);
                                int i9 = 0;
                                for (Object obj4 : gv9Var) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        Throwable th2 = th;
                                        b.q();
                                        throw th2;
                                    }
                                    float f6 = f5;
                                    int i11 = i9;
                                    Throwable th3 = th;
                                    v9g.k((FantasyTransferPlayers) obj4, i2, FantasyCompetitionType.SEASON, z2, null, av8Var3, 384);
                                    if (i11 != gv9Var.size() - 1) {
                                        bf3.r(f6, 1881334200, av8Var3, av8Var3, utcVar);
                                        av8Var3.s(false);
                                    } else {
                                        av8Var3.d0(1881418768);
                                        av8Var3.s(false);
                                    }
                                    th = th3;
                                    f5 = f6;
                                    i9 = i10;
                                }
                                float f7 = f5;
                                bf3.t(av8Var3, false, utcVar, 16.0f, av8Var3);
                                xtc d2 = bkh.d(utcVar, 1.0f);
                                l8g a3 = k8g.a(ww9.c, uxf.m, av8Var3, 54);
                                int hashCode2 = Long.hashCode(av8Var3.T);
                                aee m3 = av8Var3.m();
                                xtc C2 = fqj.C(av8Var3, d2);
                                if3.k7.getClass();
                                zg3 zg3Var3 = hf3.b;
                                av8Var3.h0();
                                if (av8Var3.S) {
                                    av8Var3.l(zg3Var3);
                                } else {
                                    av8Var3.q0();
                                }
                                f50 f50Var7 = hf3.g;
                                waa.K(av8Var3, a3, f50Var7);
                                ff3 ff3Var2 = hf3.f;
                                waa.K(av8Var3, m3, ff3Var2);
                                Integer valueOf2 = Integer.valueOf(hashCode2);
                                f50 f50Var8 = hf3.j;
                                waa.K(av8Var3, valueOf2, f50Var8);
                                ry ryVar2 = hf3.k;
                                waa.J(av8Var3, ryVar2);
                                f50 f50Var9 = hf3.d;
                                waa.K(av8Var3, C2, f50Var9);
                                String y = dmi.y(oea.v(R.string.fantasy_bank_change, av8Var3), ":");
                                yf8 yf8Var = xth.a;
                                udj.c(y, null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
                                nq8.h(av8Var3, bkh.p(utcVar, f7));
                                String T = ml4.T(context, f4);
                                dfj l2 = xth.l();
                                av8Var3.d0(24375646);
                                int compare = Double.compare(yid.s(f4, 1), 0.0d);
                                if (compare < 0) {
                                    i7 = 1213677078;
                                    i8 = R.color.error;
                                } else if (compare > 0) {
                                    i7 = 1213678776;
                                    i8 = R.color.success;
                                } else {
                                    i7 = 1213680469;
                                    i8 = R.color.n_lv_1;
                                }
                                long f8 = ljg.f(av8Var3, i7, i8, av8Var3, false);
                                av8Var3.s(false);
                                udj.c(T, null, f8, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l2, av8Var3, 0, 0, 131066);
                                av8Var2 = av8Var3;
                                av8Var2.s(true);
                                av8Var2.s(false);
                                ff3Var = ff3Var2;
                                f50Var = f50Var8;
                                zg3Var = zg3Var3;
                                f50Var2 = f50Var7;
                                ryVar = ryVar2;
                                f50Var3 = f50Var9;
                                f3 = 1.0f;
                            }
                            xtc f9 = vxd.f(utcVar, f2, av8Var2, utcVar, f3);
                            k1c c2 = e12.c(uxf.c, false);
                            int hashCode3 = Long.hashCode(av8Var2.T);
                            aee m4 = av8Var2.m();
                            xtc C3 = fqj.C(av8Var2, f9);
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, c2, f50Var2);
                            waa.K(av8Var2, m4, ff3Var);
                            bf3.s(hashCode3, av8Var2, f50Var, av8Var2, ryVar);
                            waa.K(av8Var2, C3, f50Var3);
                            String v = oea.v(R.string.fantasy_view_transfer_summary, av8Var2);
                            yf8 yf8Var2 = xth.a;
                            av8 av8Var4 = av8Var2;
                            bea.f(v, n12.a.a(utcVar, uxf.g), xth.l(), false, function0, null, av8Var4, 0, 40);
                            av8Var4.s(true);
                            av8Var4.s(true);
                        } else {
                            av8Var3.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, 196608 | ((i5 >> 15) & 14), 16);
                z5 = z6;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new m17(lj7Var, i2, z, function0, z2, xtcVar, z5, i3, i4);
                return;
            }
            return;
        }
        z4 = z3;
        if (av8Var.T(i5 & 1, (599187 & i5) == 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void j(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1169182765);
        int i3 = 2;
        int i4 = i2 | (av8Var.i(function0) ? 4 : 2) | 48;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            n7g a2 = o7g.a(32.0f);
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(utcVar, a2), lz.D(R.color.surface_2, av8Var), oyn.e);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.p;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(q, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), i3), av8Var, 0), 12.0f, 4.0f);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.fantasy_play_now_button, av8Var);
            yf8 yf8Var = xth.a;
            utc utcVar2 = utcVar;
            udj.c(v, null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), null, ljg.i(utcVar2, 2.0f, av8Var, utcVar2, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function0, xtcVar2, i2, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if ((r49 & 8) != 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(ae7 ae7Var, boolean z, xtc xtcVar, long j2, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        long j3;
        xtc xtcVar3;
        long j4;
        eqf u;
        long j5;
        int i5;
        ae7Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1760197470);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(ae7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.h(z) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    if (av8Var.f(j3)) {
                        i5 = a.o;
                        i4 |= i5;
                    }
                } else {
                    j3 = j2;
                }
                i5 = 1024;
                i4 |= i5;
            } else {
                j3 = j2;
            }
            if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                j4 = j3;
            } else {
                av8Var.Y();
                int i7 = i2 & 1;
                utc utcVar = utc.a;
                if (i7 == 0 || av8Var.B()) {
                    if (i6 != 0) {
                        xtcVar2 = utcVar;
                    }
                    if ((i3 & 8) != 0) {
                        j3 = lz.D(R.color.n_lv_1, av8Var);
                        i4 &= -7169;
                    }
                    int i8 = i4;
                    xtc xtcVar4 = xtcVar2;
                    long j6 = j3;
                    av8Var.t();
                    Context context = (Context) av8Var.k(nz.b);
                    lv1 lv1Var = uxf.m;
                    xtc c0 = l98.c0(bkh.d(xtcVar4, 1.0f), 16.0f, 8.0f);
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
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
                    waa.K(av8Var, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    String str = ae7Var.a;
                    int i9 = ae7Var.c;
                    String y = yaa.y(context, str);
                    yf8 yf8Var = xth.a;
                    udj.c(y, null, j6, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, (i8 >> 3) & 896, 24960, 110586);
                    nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                    av8Var.d0(1764242724);
                    av8Var.s(false);
                    w1l.o(1.0f, true, av8Var);
                    xtc q = bkh.q(utcVar, 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    k1c c2 = e12.c(uxf.g, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, q);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    ry ryVar2 = ry.v;
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = new e87(11);
                        av8Var.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    boolean z2 = (i8 & 14) == 4;
                    Object O2 = av8Var.O();
                    if (z2 || O2 == a99Var) {
                        O2 = new x16(ae7Var, 20);
                        av8Var.n0(O2);
                    }
                    td4.b(function1, null, ryVar2, null, (Function1) O2, av8Var, 6, 10);
                    i.o(av8Var, true, utcVar, 24.0f, av8Var);
                    xtc p2 = bkh.p(utcVar, 32.0f);
                    String valueOf2 = String.valueOf(i9);
                    dfj e2 = xth.e();
                    if (z) {
                        j5 = ljg.f(av8Var, -1605620409, R.color.live, av8Var, false);
                    } else if (i9 == 0) {
                        j5 = ljg.f(av8Var, -1605618777, R.color.n_lv_3, av8Var, false);
                    } else {
                        av8Var.d0(-1605617689);
                        av8Var.s(false);
                        j5 = j6;
                    }
                    udj.c(valueOf2, p2, j5, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, e2, av8Var, 48, 24960, 109560);
                    av8Var = av8Var;
                    av8Var.s(true);
                    j4 = j6;
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var.W();
                }
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new be7(ae7Var, z, xtcVar3, j4, i2, i3, 1);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 3072) != 0) {
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if ((r43 & 8) != 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(ae7 ae7Var, boolean z, xtc xtcVar, long j2, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        long j3;
        xtc xtcVar3;
        long j4;
        eqf u;
        av8 av8Var;
        String str;
        int i5;
        long j5;
        long j6;
        int i6;
        ae7Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2033790683);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(ae7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.h(z) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    if (av8Var2.f(j3)) {
                        i6 = a.o;
                        i4 |= i6;
                    }
                } else {
                    j3 = j2;
                }
                i6 = 1024;
                i4 |= i6;
            } else {
                j3 = j2;
            }
            if (av8Var2.T(i4 & 1, (i4 & 1171) == 1170)) {
                av8Var2.W();
                xtcVar3 = xtcVar2;
                j4 = j3;
            } else {
                av8Var2.Y();
                int i8 = i2 & 1;
                utc utcVar = utc.a;
                if (i8 == 0 || av8Var2.B()) {
                    if (i7 != 0) {
                        xtcVar2 = utcVar;
                    }
                    if ((i3 & 8) != 0) {
                        j3 = lz.D(R.color.n_lv_1, av8Var2);
                        i4 &= -7169;
                    }
                    int i9 = i4;
                    xtcVar3 = xtcVar2;
                    long j7 = j3;
                    av8Var2.t();
                    Context context = (Context) av8Var2.k(nz.b);
                    lv1 lv1Var = uxf.m;
                    xtc c0 = l98.c0(bkh.d(xtcVar3, 1.0f), 16.0f, 12.0f);
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C = fqj.C(av8Var2, c0);
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
                    goa g2 = ljg.g(av8Var2, C, hf3.d, 1.0f, true);
                    String str2 = ae7Var.a;
                    int i10 = ae7Var.c;
                    String y = yaa.y(context, str2);
                    yf8 yf8Var = xth.a;
                    udj.c(y, g2, j7, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, (i9 >> 3) & 896, 24960, 110584);
                    nq8.h(av8Var2, bkh.p(utcVar, 16.0f));
                    xtc q = bkh.q(utcVar, 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    String str3 = ae7Var.b;
                    dfj e2 = xth.e();
                    if (i10 == 0) {
                        long f2 = ljg.f(av8Var2, -1892281782, R.color.n_lv_3, av8Var2, false);
                        av8Var = av8Var2;
                        str = str3;
                        i5 = R.color.n_lv_3;
                        j5 = f2;
                    } else {
                        av8Var2.d0(-1892281302);
                        av8Var2.s(false);
                        av8Var = av8Var2;
                        str = str3;
                        i5 = R.color.n_lv_3;
                        j5 = j7;
                    }
                    int i11 = i5;
                    udj.c(str, q, j5, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, e2, av8Var, 48, 24960, 109560);
                    av8 av8Var3 = av8Var;
                    nq8.h(av8Var3, bkh.p(utcVar, 24.0f));
                    xtc p2 = bkh.p(utcVar, 32.0f);
                    String valueOf = String.valueOf(i10);
                    dfj e3 = xth.e();
                    if (i10 == 0) {
                        j6 = ljg.f(av8Var3, -1892264598, i11, av8Var3, false);
                    } else if (z) {
                        j6 = ljg.f(av8Var3, -1892263446, R.color.live, av8Var3, false);
                    } else {
                        av8Var3.d0(-1892262358);
                        av8Var3.s(false);
                        j6 = j7;
                    }
                    udj.c(valueOf, p2, j6, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, e3, av8Var3, 48, 24960, 109560);
                    av8Var2 = av8Var3;
                    av8Var2.s(true);
                    j4 = j7;
                } else {
                    av8Var2.W();
                }
            }
            u = av8Var2.u();
            if (u == null) {
                u.d = new be7(ae7Var, z, xtcVar3, j4, i2, i3, 0);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 3072) != 0) {
        }
        if (av8Var2.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u = av8Var2.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(final int i2, final String str, final double d2, final boolean z, final boolean z2, String str2, sda sdaVar, final k06 k06Var, r8b r8bVar, final bnf bnfVar, xtc xtcVar, final boolean z3, final TeamAverageRatingVersion teamAverageRatingVersion, final String str3, final Function0 function0, of3 of3Var, final int i3, final int i4) {
        int i5;
        final r8b r8bVar2;
        av8 av8Var;
        final xtc xtcVar2;
        boolean z4;
        q80 D;
        int i6;
        int i7;
        utc utcVar;
        final String str4 = str2;
        final sda sdaVar2 = sdaVar;
        j06 j06Var = k06Var.f;
        str.getClass();
        r8bVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1333158787);
        if ((i3 & 6) == 0) {
            i5 = (av8Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.g(str) ? 32 : 16;
        }
        int i8 = i5;
        if ((i3 & 384) == 0) {
            i8 |= av8Var2.c(d2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i8 |= av8Var2.h(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i8 |= av8Var2.g(str4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i3 & 1572864) == 0) {
            i8 |= av8Var2.g(sdaVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i8 |= av8Var2.g(k06Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i8 |= av8Var2.e(r8bVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i8 |= av8Var2.e(bnfVar == null ? -1 : bnfVar.ordinal()) ? 536870912 : 268435456;
        }
        int i9 = i8;
        int i10 = i4 | 6;
        if ((i4 & 48) == 0) {
            i10 |= av8Var2.h(z3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= av8Var2.e(teamAverageRatingVersion == null ? -1 : teamAverageRatingVersion.ordinal()) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= av8Var2.g(str3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i10 |= av8Var2.i(function0) ? 16384 : 8192;
        }
        int i11 = i10;
        if (av8Var2.T(i9 & 1, ((i9 & 306783379) == 306783378 && (i11 & 9363) == 9362) ? false : true)) {
            utc utcVar2 = utc.a;
            xtc x = gz8.x(l98.b0(bkh.g(utcVar2, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 8.0f), null, null, 3);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, x);
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
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            if (((Configuration) av8Var2.k(nz.a)).screenWidthDp >= 360) {
                av8Var2.d0(-793871077);
                td4.G(i2, l98.b0(bkh.l(utcVar2, 40.0f), 4.0f), false, 0L, av8Var2, (i9 & 14) | 48, 12);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                av8Var.d0(-793707397);
                av8Var.s(false);
            }
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(ww9.f, uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            w(i2, str, d2, z, z2, null, teamAverageRatingVersion, z3, av8Var, (i9 & 65534) | ((i11 << 12) & 3670016) | ((i11 << 18) & 29360128));
            boolean v = ph0.v(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, str3);
            switch (r8bVar.ordinal()) {
                case 0:
                    av8Var.d0(893997230);
                    int i12 = bnfVar != null ? ck8.a[bnfVar.ordinal()] : -1;
                    if (i12 == 1) {
                        z4 = false;
                        av8Var.d0(894113542);
                        Pair pair = j06Var != null ? j06Var.a : null;
                        if (pair == null) {
                            av8Var.d0(894113541);
                            av8Var.s(false);
                            D = null;
                        } else {
                            av8Var.d0(894113542);
                            D = D(pair, av8Var);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    } else if (i12 == 2) {
                        z4 = false;
                        av8Var.d0(894250438);
                        Pair pair2 = j06Var != null ? j06Var.b : null;
                        if (pair2 == null) {
                            av8Var.d0(894250437);
                            av8Var.s(false);
                            D = null;
                        } else {
                            av8Var.d0(894250438);
                            D = D(pair2, av8Var);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    } else if (i12 == 3) {
                        z4 = false;
                        av8Var.d0(894391302);
                        Pair pair3 = j06Var != null ? j06Var.c : null;
                        if (pair3 == null) {
                            av8Var.d0(894391301);
                            av8Var.s(false);
                            D = null;
                        } else {
                            av8Var.d0(894391302);
                            D = D(pair3, av8Var);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    } else if (i12 == 4) {
                        z4 = false;
                        av8Var.d0(894532166);
                        Pair pair4 = j06Var != null ? j06Var.d : null;
                        if (pair4 == null) {
                            av8Var.d0(894532165);
                            av8Var.s(false);
                            D = null;
                        } else {
                            av8Var.d0(894532166);
                            D = D(pair4, av8Var);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    } else if (i12 != 5) {
                        av8Var.d0(894735680);
                        z4 = false;
                        av8Var.s(false);
                        D = null;
                    } else {
                        z4 = false;
                        av8Var.d0(894676998);
                        Pair pair5 = j06Var != null ? j06Var.e : null;
                        if (pair5 == null) {
                            av8Var.d0(894676997);
                            av8Var.s(false);
                            D = null;
                        } else {
                            av8Var.d0(894676998);
                            D = D(pair5, av8Var);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    }
                    av8Var.s(z4);
                    if (D == null) {
                        av8Var.d0(895999365);
                        utcVar = utcVar2;
                        z(D, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var, 48);
                        av8Var.s(false);
                    } else {
                        utcVar = utcVar2;
                        av8Var.d0(896136261);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                        av8Var.d0(-790779323);
                        boolean z5 = (i11 & 57344) == 16384;
                        Object O = av8Var.O();
                        if (z5 || O == nf3.a) {
                            O = new ve7(8, function0);
                            av8Var.n0(O);
                        }
                        j(0, av8Var, null, (Function0) O);
                        av8Var.s(false);
                        str4 = str2;
                        sdaVar2 = sdaVar;
                    } else {
                        av8Var.d0(-790656036);
                        str4 = str2;
                        sdaVar2 = sdaVar;
                        n(str4, sdaVar2, null, av8Var, (i9 >> 15) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 1:
                    av8Var.d0(895844427);
                    String str5 = k06Var.e;
                    if (str5 == null) {
                        av8Var.d0(895844426);
                        av8Var.s(false);
                        D = null;
                    } else {
                        av8Var.d0(895844427);
                        D = E(oea.v(R.string.football_total_distance_run, av8Var), str5, 0L, av8Var, 4);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 2:
                    boolean z6 = false;
                    av8Var.d0(895430112);
                    String str6 = k06Var.d;
                    if (str6 == null) {
                        av8Var.d0(895430111);
                        av8Var.s(false);
                        D = null;
                    } else {
                        av8Var.d0(895430112);
                        String v2 = oea.v(v ? R.string.fantasy_average_fantasy_points : R.string.fantasy_points, av8Var);
                        if (Intrinsics.c(str3, StatusKt.STATUS_IN_PROGRESS)) {
                            i6 = -1767814158;
                            i7 = R.color.live;
                            z6 = false;
                        } else {
                            z6 = false;
                            i6 = -1767813678;
                            i7 = R.color.n_lv_1;
                        }
                        D = E(v2, str6, ljg.f(av8Var, i6, i7, av8Var, z6), av8Var, 0);
                        av8Var.s(z6);
                    }
                    av8Var.s(z6);
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 3:
                    av8Var.d0(894795200);
                    av8Var.s(false);
                    D = null;
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 4:
                    av8Var.d0(894842816);
                    av8Var.s(false);
                    D = null;
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 5:
                    av8Var.d0(894909281);
                    String str7 = k06Var.a;
                    if (str7 == null) {
                        av8Var.d0(894909280);
                        av8Var.s(false);
                        D = null;
                    } else {
                        av8Var.d0(894909281);
                        D = E(oea.v(R.string.football_lineups_starters_average_age, av8Var), str7, 0L, av8Var, 4);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 6:
                    av8Var.d0(895082106);
                    String str8 = k06Var.b;
                    if (str8 == null) {
                        av8Var.d0(895082105);
                        av8Var.s(false);
                        D = null;
                    } else {
                        av8Var.d0(895082106);
                        D = E(oea.v(R.string.football_lineups_starters_total_market_value, av8Var), str8, 0L, av8Var, 4);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                case 7:
                    av8Var.d0(895253598);
                    String str9 = k06Var.c;
                    if (str9 == null) {
                        av8Var.d0(895253597);
                        av8Var.s(false);
                        D = null;
                    } else {
                        av8Var.d0(895253598);
                        D = E(oea.v(R.string.football_lineups_starters_average_height, av8Var), str9, 0L, av8Var, 4);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                    if (D == null) {
                    }
                    av8Var.s(true);
                    r8bVar2 = r8bVar;
                    if (r8bVar2 != r8b.d) {
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    break;
                default:
                    throw dmi.h(av8Var, -248256862, false);
            }
        } else {
            r8bVar2 = r8bVar;
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: wj8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i3 | 1);
                    int K2 = aba.K(i4);
                    u6h.m(i2, str, d2, z, z2, str4, sdaVar2, k06Var, r8bVar2, bnfVar, xtcVar2, z3, teamAverageRatingVersion, str3, function0, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static final void n(String str, sda sdaVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        sda sdaVar2;
        xtc xtcVar2;
        av8 av8Var;
        utc utcVar;
        ?? r15;
        av8 av8Var2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1897072079);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var3.g(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var3.g(sdaVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var3.T(i4 & 1, (i4 & 147) != 146)) {
            u23 a2 = t23.a(ww9.f, uxf.p, av8Var3, 54);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var3, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m2, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            if (str == null) {
                av8Var3.d0(-406977664);
                av8Var3.s(false);
                av8Var2 = av8Var3;
                r15 = 0;
                utcVar = utcVar2;
            } else {
                av8Var3.d0(-406977663);
                yf8 yf8Var = xth.a;
                utcVar = utcVar2;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var3, i4 & 14, 0, 131066);
                av8 av8Var4 = av8Var3;
                r15 = 0;
                av8Var4.s(false);
                av8Var2 = av8Var4;
            }
            av8Var2.d0(-406782425);
            sdaVar2 = sdaVar;
            td4.x(sdaVar2.a, sdaVar2.b, l98.c0(n9e.q(bkh.l(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 32.0f), lz.D(R.color.neutral_highlight, av8Var2), o7g.a(8.0f)), 4.0f, 2.0f), av8Var2, r15);
            av8Var2.s(r15);
            av8Var2.s(true);
            xtcVar2 = utcVar;
            av8Var = av8Var2;
        } else {
            av8 av8Var5 = av8Var3;
            sdaVar2 = sdaVar;
            av8Var5.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var5;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(str, sdaVar2, xtcVar2, i2, 1);
        }
    }

    public static final void o(BaseballPitch baseballPitch, of3 of3Var, int i2) {
        int i3;
        double d2;
        float f2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(130750766);
        int i4 = (av8Var.i(baseballPitch) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            xtc d0 = l98.d0(bkh.d(utc.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                d2 = 0.0d;
                f2 = Float.MAX_VALUE;
            } else {
                d2 = 0.0d;
                f2 = 1.0f;
            }
            goa goaVar = new goa(f2, true);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            Player pitcher = baseballPitch.getPitcher();
            Team pitcherTeam = baseballPitch.getPitcherTeam();
            if (pitcher == null || pitcherTeam == null) {
                z = true;
                av8Var.d0(-1653989186);
                av8Var.s(false);
            } else {
                av8Var.d0(-1654192918);
                PlayerHand pitcherHand = baseballPitch.getPitcherHand();
                int id = pitcher.getId();
                Integer valueOf2 = Integer.valueOf(pitcherTeam.getId());
                String C3 = tba.C(pitcher);
                if (C3 == null) {
                    C3 = tba.t(pitcher);
                }
                z = true;
                v(new p91(id, valueOf2, C3, pitcher.getJerseyNumber(), pitcherHand, pitcher.getPosition()), true, av8Var, 48);
                av8Var.s(false);
            }
            av8Var.s(z);
            e(baseballPitch, av8Var, i4 & 14);
            if (1.0f <= d2) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, goaVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            Player hitter = baseballPitch.getHitter();
            Team hitterTeam = baseballPitch.getHitterTeam();
            if (hitter == null || hitterTeam == null) {
                av8Var.d0(1471265781);
                av8Var.s(false);
            } else {
                av8Var.d0(1471063971);
                PlayerHand hitterHand = baseballPitch.getHitterHand();
                int id2 = hitter.getId();
                Integer valueOf3 = Integer.valueOf(hitterTeam.getId());
                String C5 = tba.C(hitter);
                if (C5 == null) {
                    C5 = tba.t(hitter);
                }
                v(new p91(id2, valueOf3, C5, hitter.getJerseyNumber(), hitterHand, hitter.getPosition()), false, av8Var, 48);
                av8Var.s(false);
            }
            i3 = 1;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n81(baseballPitch, i2, i3);
        }
    }

    public static final void p(List list, e8g e8gVar, of3 of3Var, int i2, int i3) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-643237796);
        int i4 = (av8Var.i(list) ? 4 : 2) | i2 | (((i3 & 2) == 0 && av8Var.g(e8gVar)) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
                int i5 = i3 & 2;
            } else if ((i3 & 2) != 0) {
                e8gVar = f8h.f;
            }
            av8Var.t();
            dy0.b(bkh.c, uxf.g, yqo.H(-1178401870, av8Var, new hl6(7, list, e8gVar)), av8Var, 3126, 4);
        } else {
            av8Var.W();
        }
        e8g e8gVar2 = e8gVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(i2, i3, 0, list, e8gVar2);
        }
    }

    public static final void q(e9i e9iVar, v8b v8bVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1272272291);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(e9iVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(v8bVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(uxf.g, false);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d2 = bkh.d(bkh.c(utc.a, 0.6f), 1.0f);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            p(v8bVar.a, new by9(e9iVar), av8Var, 0, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(e9iVar, v8bVar, i2, 28);
        }
    }

    public static final void r(v23 v23Var, v8b v8bVar, of3 of3Var, int i2) {
        int i3;
        v8b v8bVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1144579260);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(v8bVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(v23Var.a(1.0f, utcVar, true), 1.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            g28 g28Var = bkh.c;
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g28Var);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            x23 x23Var = x23.a;
            nq8.h(av8Var, x23Var.a(32.0f, utcVar, true));
            String a3 = v8bVar.d.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, x23Var.a(58.0f, utcVar, true));
            xtc d0 = l98.d0(bkh.c(bkh.d(utcVar, 1.0f), 0.6f), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            v8bVar2 = v8bVar;
            p(v8bVar2.a, null, av8Var, 0, 2);
            av8Var.s(true);
            nq8.h(av8Var, x23Var.a(50.0f, utcVar, true));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            v8bVar2 = v8bVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(v23Var, v8bVar2, i2, 29);
        }
    }

    public static final void s(int i2, int i3, of3 of3Var) {
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(398951397);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            l8g a2 = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.l, av8Var, 6);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1049257409);
            int i6 = 0;
            while (i6 < 3) {
                xtc l2 = bkh.l(utcVar, 8.0f);
                n7g n7gVar = o7g.a;
                xtc A = wnn.A(l2, n7gVar);
                if (i6 < i2) {
                    j2 = ljg.f(av8Var, 1124370178, R.color.n_lv_1, av8Var, false);
                } else {
                    av8Var.d0(1124370852);
                    av8Var.s(false);
                    j2 = r13.h;
                }
                e12.a(0, av8Var, yso.o(n9e.q(A, j2, oyn.e), i6 < i2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 2.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar));
                i6++;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i2, i3, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable] */
    public static final void t(BaseballPitch baseballPitch, BaseballPitch baseballPitch2, of3 of3Var, int i2) {
        f50 f50Var;
        f50 f50Var2;
        ff3 ff3Var;
        ry ryVar;
        utc utcVar;
        f50 f50Var3;
        zg3 zg3Var;
        Context context;
        float f2;
        ?? r2;
        String str;
        ?? r22;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1524903664);
        int i4 = i2 | (av8Var.i(baseballPitch) ? 4 : 2) | (av8Var.i(baseballPitch2) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context2 = (Context) av8Var.k(nz.b);
            utc utcVar2 = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar2, 1.0f), 4.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            xtc q = n9e.q(bkh.l(utcVar2, 24.0f), lz.D(k53.k0(baseballPitch.getOutcome(), baseballPitch2 != null ? baseballPitch2.getStrikes() : null), av8Var), o7g.a);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var4);
            waa.K(av8Var, m3, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            if (baseballPitch.getPitchCode() != null) {
                av8Var.d0(1156072089);
                String valueOf2 = String.valueOf(baseballPitch.getPitchCount());
                yf8 yf8Var = xth.a;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                context = context2;
                f50Var = f50Var4;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var3 = f50Var5;
                r2 = 0;
                f2 = 8.0f;
                f50Var2 = f50Var6;
                udj.c(valueOf2, null, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                f50Var = f50Var4;
                f50Var2 = f50Var6;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var3 = f50Var5;
                zg3Var = zg3Var2;
                context = context2;
                f2 = 8.0f;
                r2 = 0;
                av8Var.d0(1156242620);
                av8Var.s(false);
            }
            av8Var.s(true);
            nq8.h(av8Var, bkh.p(utcVar, f2));
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, r2);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var2);
            BaseballActionOutcome outcome = baseballPitch.getOutcome();
            Context context3 = context;
            if (outcome == null || (str = k53.r0(outcome, context3)) == null) {
                str = "-";
            }
            yf8 yf8Var2 = xth.a;
            av8 av8Var2 = av8Var;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.e(), av8Var2, 0, 24576, 114682);
            av8 av8Var3 = av8Var2;
            av8Var3.d0(468926662);
            BaseballPitchType pitchCode = baseballPitch.getPitchCode();
            Double pitchSpeed = baseballPitch.getPitchSpeed();
            ?? r10 = av8Var3;
            r10 = av8Var3;
            if (pitchCode != null && pitchSpeed != null) {
                double doubleValue = pitchSpeed.doubleValue();
                switch (i81.a[pitchCode.ordinal()]) {
                    case 1:
                        i3 = R.string.baseball_pitch_fastball;
                        break;
                    case 2:
                        i3 = R.string.baseball_pitch_four_seam_fastball;
                        break;
                    case 3:
                        i3 = R.string.baseball_pitch_cutter;
                        break;
                    case 4:
                        i3 = R.string.baseball_pitch_sinker;
                        break;
                    case 5:
                        i3 = R.string.baseball_pitch_splitter;
                        break;
                    case 6:
                        i3 = R.string.baseball_pitch_forkball;
                        break;
                    case 7:
                        i3 = R.string.baseball_pitch_changeup;
                        break;
                    case 8:
                        i3 = R.string.baseball_pitch_screwball;
                        break;
                    case 9:
                        i3 = R.string.baseball_pitch_slider;
                        break;
                    case 10:
                        i3 = R.string.baseball_pitch_curveball;
                        break;
                    case 11:
                        i3 = R.string.baseball_pitch_slow_curve;
                        break;
                    case 12:
                        i3 = R.string.baseball_pitch_knuckle_curve;
                        break;
                    case 13:
                        i3 = R.string.baseball_pitch_slurve;
                        break;
                    case 14:
                        i3 = R.string.baseball_pitch_sweeper;
                        break;
                    case 15:
                        i3 = R.string.baseball_pitch_slutter;
                        break;
                    case 16:
                        i3 = R.string.baseball_pitch_gyroball;
                        break;
                    case 17:
                        i3 = R.string.baseball_pitch_knuckleball;
                        break;
                    case 18:
                        i3 = R.string.baseball_pitch_eephus;
                        break;
                    case 19:
                        i3 = R.string.baseball_pitch_intentional_ball;
                        break;
                    case 20:
                        i3 = R.string.baseball_pitch_pitchout;
                        break;
                    case 21:
                        i3 = R.string.baseball_pitch_automatic_ball;
                        break;
                    case 22:
                        i3 = R.string.baseball_pitch_automatic_strike;
                        break;
                    case 23:
                        i3 = R.string.baseball_pitch_no_pitch;
                        break;
                    case 24:
                        i3 = R.string.baseball_pitch_unknown;
                        break;
                    default:
                        zzl.b();
                        return;
                }
                udj.c(wv8.i(oea.v(i3, av8Var3), ", ", oea.w(R.string.miles_per_hour_format, new Object[]{rei.b(2, Double.valueOf((doubleValue * 1000.0d) / 1609.344d))}, av8Var3)), null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.g(), av8Var3, 0, 24576, 114682);
                r10 = av8Var3;
                Unit unit = Unit.a;
            }
            r10.s(r2);
            r10.s(true);
            nq8.h(r10, bkh.p(utcVar, f2));
            String m5 = ljg.m(baseballPitch.getBalls(), baseballPitch.getStrikes(), " - ");
            if (hkg.c0(context3)) {
                m5 = n9e.G(m5, " - ");
            }
            av8 av8Var4 = r10;
            udj.c(m5, null, lz.D(R.color.n_lv_1, r10), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var4, 0, 0, 131066);
            av8Var = av8Var4;
            nq8.h(av8Var, bkh.p(utcVar, f2));
            List<BaseballRunner> runners = baseballPitch.getRunners();
            if (runners != null) {
                r22 = new ArrayList();
                Iterator it = runners.iterator();
                while (it.hasNext()) {
                    Integer endingBase = ((BaseballRunner) it.next()).getEndingBase();
                    if (endingBase != null) {
                        r22.add(endingBase);
                    }
                }
            } else {
                r22 = km5.a;
            }
            f5p.a(l6g.W(r22), ((kx4) av8Var.k(dh3.h)).H0(5.0f), lz.D(R.color.n_lv_4, av8Var), lz.D(R.color.value, av8Var), bkh.m(utcVar, 22.0f, 16.0f), av8Var, 24576, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(baseballPitch, baseballPitch2, i2, 6);
        }
    }

    public static final void u(gv9 gv9Var, PlayerHand playerHand, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1715089633);
        int i3 = (av8Var.i(gv9Var) ? 4 : 2) | i2 | (av8Var.e(playerHand == null ? -1 : playerHand.ordinal()) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc q = n9e.q(bkh.d(bkh.e(utc.a, 250.0f), 1.0f), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f));
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q);
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
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new z71(26);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean i5 = av8Var.i(gv9Var);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new uo(i4, gv9Var);
                av8Var.n0(O2);
            }
            td4.a(function1, null, (Function1) O2, av8Var, 6, 2);
            wkn.l(s6a.N(R.drawable.batter_vector, 6, av8Var), rd0.N(wnn.A(f6a.D(bkh.c, playerHand == PlayerHand.Left ? 1.0f : -1.0f, 1.0f), o7g.a(8.0f)), hkg.c0(context) ? -133.0f : 133.0f, -24.0f), uxf.j, mp3.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 27696, 96);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(gv9Var, playerHand, i2, 7);
        }
    }

    public static final void v(p91 p91Var, boolean z, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(706555306);
        int i3 = (av8Var.g(p91Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc l2 = bkh.l(utcVar, 48.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, l2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i4 = p91Var.a;
            xtc l3 = bkh.l(utcVar, 48.0f);
            boolean i5 = av8Var.i(context) | ((i3 & 14) == 4);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new j4(19, context, p91Var);
                av8Var.n0(O);
            }
            td4.C(i4, tol.y(l3, false, false, false, 0L, null, (Function0) O, av8Var, 31), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
            Integer num = p91Var.b;
            av8Var.d0(-1102507308);
            td4.G(num.intValue(), bkh.l(n12.a.a(utcVar, z ? uxf.k : uxf.i), 20.0f), false, 0L, av8Var, 0, 12);
            Unit unit = Unit.a;
            av8Var.s(false);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            String str = p91Var.c;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
            String str2 = p91Var.f;
            String str3 = p91Var.d;
            PlayerHand playerHand = p91Var.e;
            udj.c(str2 + " | #" + str3 + " | " + (playerHand != null ? EnumSerializerKt.getSerialName(playerHand) : null), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(i2, 0, p91Var, z);
        }
    }

    public static final void w(final int i2, final String str, final double d2, final boolean z, final boolean z2, xtc xtcVar, final TeamAverageRatingVersion teamAverageRatingVersion, final boolean z3, of3 of3Var, final int i3) {
        int i4;
        av8 av8Var;
        final xtc xtcVar2;
        Object obj;
        f50 f50Var;
        utc utcVar;
        int i5;
        utc utcVar2;
        boolean z4;
        boolean z5;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1307279215);
        if ((i3 & 6) == 0) {
            i4 = (av8Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var2.c(d2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var2.h(z) ? a.o : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        int i6 = i4 | 196608;
        if ((1572864 & i3) == 0) {
            i6 |= av8Var2.e(teamAverageRatingVersion == null ? -1 : teamAverageRatingVersion.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i6 |= av8Var2.h(z3) ? 8388608 : 4194304;
        }
        if (av8Var2.T(i6 & 1, (4793491 & i6) != 4793490)) {
            final Context context = (Context) av8Var2.k(nz.b);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            utc utcVar3 = utc.a;
            xtc C = fqj.C(av8Var2, utcVar3);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var2, a2, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var4 = hf3.d;
            goa g2 = ljg.g(av8Var2, C, f50Var4, 1.0f, false);
            yf8 yf8Var = xth.a;
            jaa.m(str, g2, lz.D(R.color.n_lv_1, av8Var2), 2, 2, null, xth.j(), av8Var2, ((i6 >> 3) & 14) | 221184);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.p(utcVar3, 12.0f));
            if (d2 == 0.0d) {
                av8Var.d0(-97800849);
                av8Var.s(false);
                utcVar2 = utcVar3;
                z5 = true;
            } else {
                av8Var.d0(-99163547);
                xtc b2 = bkh.b(utcVar3, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                boolean i7 = ((i6 & 7168) == 2048) | av8Var.i(context) | ((i6 & 896) == 256) | ((i6 & 14) == 4) | ((3670016 & i6) == 1048576);
                Object O = av8Var.O();
                if (i7 || O == nf3.a) {
                    f50Var = f50Var3;
                    utcVar = utcVar3;
                    i5 = i6;
                    obj = new Function0() { // from class: xj8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            gvh gvhVar = z ? gvh.e : gvh.f;
                            TeamAverageRatingVersion teamAverageRatingVersion2 = teamAverageRatingVersion;
                            teamAverageRatingVersion2.getClass();
                            SofascoreRatingBottomSheetDialog sofascoreRatingBottomSheetDialog = new SofascoreRatingBottomSheetDialog();
                            Bundle f2 = bf3.f("sport_slug", Sports.FOOTBALL);
                            f2.putInt("rating_type", gvhVar.ordinal());
                            f2.putDouble(CampaignEx.JSON_KEY_STAR, d2);
                            f2.putInt("entity_id", i2);
                            f2.putString("avg_rating_version", teamAverageRatingVersion2.name());
                            sofascoreRatingBottomSheetDialog.setArguments(f2);
                            Context context2 = context;
                            context2.getClass();
                            if (context2 instanceof csk) {
                                context2 = ((csk) context2).getBaseContext();
                            }
                            rq3 rq3Var = null;
                            AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                            if (appCompatActivity != null) {
                                wca.x(appCompatActivity.getLifecycle()).b(new r1(sofascoreRatingBottomSheetDialog, appCompatActivity, rq3Var, 3));
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(obj);
                } else {
                    f50Var = f50Var3;
                    i5 = i6;
                    obj = O;
                    utcVar = utcVar3;
                }
                utc utcVar4 = utcVar;
                f50 f50Var5 = f50Var;
                xtc y = tol.y(b2, false, false, false, 0L, null, (Function0) obj, av8Var, 27);
                av8Var = av8Var;
                l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, y);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var2);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var4);
                A(d2, z2, gz8.x(utcVar4, null, null, 3), av8Var, ((i5 >> 6) & 14) | ((i5 >> 9) & 112));
                nq8.h(av8Var, bkh.p(utcVar4, 4.0f));
                if (z3) {
                    utcVar2 = utcVar4;
                    z4 = false;
                    z5 = true;
                    av8Var.d0(-1894359248);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1894655794);
                    utcVar2 = utcVar4;
                    z4 = false;
                    z5 = true;
                    kq9.b(s6a.N(R.drawable.ic_indicator_info_16, 6, av8Var), null, bkh.l(utcVar4, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                    av8Var.s(false);
                }
                av8Var.s(z5);
                av8Var.s(z4);
            }
            av8Var.s(z5);
            xtcVar2 = utcVar2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: yj8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    u6h.w(i2, str, d2, z, z2, xtcVar2, teamAverageRatingVersion, z3, (of3) obj2, aba.K(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void x(final si5 si5Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        g28 g28Var;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1054697976);
        int i3 = i2 | (av8Var.g(si5Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            final jej Q = h5a.Q(0, 0, 1, av8Var);
            final long D = lz.D(R.color.n_lv_3, av8Var);
            final long D2 = lz.D(R.color.n_lv_4, av8Var);
            final long D3 = lz.D(R.color.value, av8Var);
            final c20 r = f5p.r(new float[]{10.0f, 10.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            final c20 r2 = f5p.r(new float[]{20.0f, 20.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            final long D4 = lz.D(R.color.secondary_default, av8Var);
            final boolean c0 = hkg.c0((Context) av8Var.k(nz.b));
            if ((si5Var != null ? si5Var.d : 0) > 0) {
                av8Var.d0(1474361986);
                xtc q = n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, q);
                if3.k7.getClass();
                Function0 function02 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(function02);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, c2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m2, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                p4h p4hVar = ww9.d;
                utc utcVar = utc.a;
                xtc f0 = l98.f0(bkh.e(bkh.d(utcVar, 1.0f), 258.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                u23 a2 = t23.a(p4hVar, uxf.o, av8Var, 6);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(function02);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                xtc r3 = bkh.r(bkh.d(utcVar, 1.0f), null, 3);
                av8Var.d0(-1003410150);
                av8Var.d0(212064437);
                av8Var.s(false);
                kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                Object O = av8Var.O();
                Object obj = nf3.a;
                if (O == obj) {
                    O = new t1c(kx4Var);
                    av8Var.n0(O);
                }
                t1c t1cVar = (t1c) O;
                Object O2 = av8Var.O();
                if (O2 == obj) {
                    O2 = new am3();
                    av8Var.n0(O2);
                }
                am3 am3Var = (am3) O2;
                Object O3 = av8Var.O();
                if (O3 == obj) {
                    O3 = e.f(Boolean.FALSE);
                    av8Var.n0(O3);
                }
                e1d e1dVar = (e1d) O3;
                Object O4 = av8Var.O();
                if (O4 == obj) {
                    O4 = new pm3(am3Var);
                    av8Var.n0(O4);
                }
                pm3 pm3Var = (pm3) O4;
                Object O5 = av8Var.O();
                if (O5 == obj) {
                    O5 = e.e(Unit.a, f7a.k);
                    av8Var.n0(O5);
                }
                e1d e1dVar2 = (e1d) O5;
                boolean i4 = av8Var.i(t1cVar) | av8Var.e(257);
                Object O6 = av8Var.O();
                if (i4 || O6 == obj) {
                    O6 = new kd3(e1dVar2, t1cVar, pm3Var, e1dVar, 9);
                    av8Var.n0(O6);
                }
                k1c k1cVar = (k1c) O6;
                Object O7 = av8Var.O();
                int i5 = 9;
                if (O7 == obj) {
                    O7 = new ld3(e1dVar, pm3Var, 9);
                    av8Var.n0(O7);
                }
                Function0 function03 = (Function0) O7;
                boolean i6 = av8Var.i(t1cVar);
                Object O8 = av8Var.O();
                if (i6 || O8 == obj) {
                    O8 = new md3(t1cVar, i5);
                    av8Var.n0(O8);
                }
                s6a.h(o3h.a(r3, false, (Function1) O8), yqo.H(1200550679, av8Var, new d24(e1dVar2, am3Var, function03, function0, 1)), k1cVar, av8Var, 48);
                av8Var.s(false);
                g28 g28Var2 = bkh.c;
                boolean g2 = ((i3 & 14) == 4) | av8Var.g(Q) | av8Var.f(D) | av8Var.h(c0) | av8Var.f(D2) | av8Var.i(r) | av8Var.f(D4) | av8Var.f(D3) | av8Var.i(r2);
                Object O9 = av8Var.O();
                if (g2 || O9 == obj) {
                    g28Var = g28Var2;
                    Object obj2 = new Function1() { // from class: h9f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            jej jejVar;
                            long j2;
                            Throwable th;
                            boolean z;
                            float f2;
                            float f3;
                            float f4;
                            float intBitsToFloat;
                            float H0;
                            int i7;
                            int i8;
                            float intBitsToFloat2;
                            float H02;
                            float intBitsToFloat3;
                            float H03;
                            gv9 gv9Var;
                            Iterator it;
                            float intBitsToFloat4;
                            ha5 ha5Var = (ha5) obj3;
                            ha5Var.getClass();
                            int i9 = 1020;
                            float f5 = 7.0f;
                            si5 si5Var2 = si5.this;
                            jej jejVar2 = Q;
                            long j3 = D;
                            boolean z2 = c0;
                            if (si5Var2 == null || (gv9Var = si5Var2.b) == null) {
                                jejVar = jejVar2;
                                j2 = j3;
                                th = null;
                            } else {
                                Iterator it2 = gv9Var.iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    String str = (String) next;
                                    yf8 yf8Var = xth.a;
                                    long j4 = j3;
                                    aej a3 = jej.a(jejVar2, str, dfj.a(xth.c(), j4, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), i9);
                                    jej.a(jejVar2, str, dfj.a(xth.c(), j4, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), i9);
                                    if (z2) {
                                        it = it2;
                                        intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - (((Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / 7.0f) * i10) + ((Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / 7.0f) + ((int) (a3.c >> 32))));
                                    } else {
                                        it = it2;
                                        intBitsToFloat4 = ((Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / 7.0f) * i10) + (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / 7.0f);
                                    }
                                    o6a.u(ha5Var, jejVar2, new q80(str), (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(26.0f)) & 4294967295L), dfj.a(xth.c(), j4, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214));
                                    i10 = i11;
                                    it2 = it;
                                    j3 = j4;
                                    i9 = 1020;
                                }
                                jejVar = jejVar2;
                                j2 = j3;
                                th = null;
                                Unit unit = Unit.a;
                            }
                            float f6 = 4.0f;
                            float f7 = 42.0f;
                            float f8 = 16.0f;
                            if (si5Var2 != null) {
                                int i12 = 0;
                                for (Object obj4 : si5Var2.c) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        b.q();
                                        throw th;
                                    }
                                    String str2 = (String) obj4;
                                    long n2 = ha5Var.n();
                                    float f9 = i12;
                                    float f10 = f6;
                                    float f11 = f5;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(z2 ? Float.intBitsToFloat((int) (n2 >> 32)) - (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f5) : Float.intBitsToFloat((int) (n2 >> 32)) / f5) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(f7)) - ((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / f6) * f9)) & 4294967295L);
                                    long n3 = ha5Var.n();
                                    if (z2) {
                                        intBitsToFloat2 = Float.intBitsToFloat((int) (n3 >> 32));
                                        H02 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - ha5Var.H0(f8);
                                    } else {
                                        intBitsToFloat2 = Float.intBitsToFloat((int) (n3 >> 32));
                                        H02 = ha5Var.H0(f8);
                                    }
                                    boolean z3 = z2;
                                    float f12 = f8;
                                    ha5.W0(ha5Var, D2, floatToRawIntBits, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(f7)) - ((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / f10) * f9)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2 - H02) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, r, 472);
                                    yf8 yf8Var2 = xth.a;
                                    long j5 = jej.a(jejVar, str2, dfj.a(xth.c(), j2, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), 1020).c;
                                    long n4 = ha5Var.n();
                                    if (z3) {
                                        intBitsToFloat3 = Float.intBitsToFloat((int) (n4 >> 32));
                                        H03 = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f11) - ha5Var.H0(f12);
                                    } else {
                                        intBitsToFloat3 = (Float.intBitsToFloat((int) (n4 >> 32)) / f11) - ((int) (j5 >> 32));
                                        H03 = ha5Var.H0(f12);
                                    }
                                    float f13 = intBitsToFloat3 - H03;
                                    o6a.u(ha5Var, jejVar, new q80(str2), (Float.floatToRawIntBits(((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(42.0f)) - ((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / f10) * f9)) - (((int) (j5 & 4294967295L)) / 2)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32), dfj.a(xth.c(), j2, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214));
                                    f8 = f12;
                                    i12 = i13;
                                    f5 = f11;
                                    f6 = f10;
                                    z2 = z3;
                                    f7 = 42.0f;
                                }
                                z = z2;
                                f2 = f6;
                                f3 = f5;
                                f4 = f8;
                                Unit unit2 = Unit.a;
                            } else {
                                z = z2;
                                f2 = 4.0f;
                                f3 = 7.0f;
                                f4 = 16.0f;
                            }
                            if (si5Var2 != null) {
                                int i14 = si5Var2.e;
                                int i15 = si5Var2.d;
                                gv9 gv9Var2 = si5Var2.a;
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f3;
                                float intBitsToFloat6 = ((Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - ha5Var.H0(f4)) - (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f3)) / (gv9Var2.size() - 1);
                                float intBitsToFloat7 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(42.0f);
                                float intBitsToFloat8 = (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(42.0f)) - ((Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / f2) * 3.0f);
                                float f14 = intBitsToFloat7 - intBitsToFloat8;
                                int i16 = 0;
                                for (Object obj5 : gv9Var2) {
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        b.q();
                                        throw th;
                                    }
                                    ki5 ki5Var = (ki5) obj5;
                                    if (i16 >= gv9Var2.size() - 1 || ((ki5) gv9Var2.get(i16)).b == -1 || ((ki5) gv9Var2.get(i17)).b == -1) {
                                        i7 = i15;
                                        i8 = i17;
                                    } else {
                                        float f15 = i15;
                                        i8 = i17;
                                        i7 = i15;
                                        ha5.W0(ha5Var, D4, (Float.floatToRawIntBits(z ? Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - ((i16 * intBitsToFloat6) + intBitsToFloat5) : (i16 * intBitsToFloat6) + intBitsToFloat5) << 32) | (Float.floatToRawIntBits((((i15 - ki5Var.b) * f14) / f15) + intBitsToFloat8) & 4294967295L), (Float.floatToRawIntBits((((i15 - ((ki5) gv9Var2.get(i17)).b) * f14) / f15) + intBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(z ? Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - ((i17 * intBitsToFloat6) + intBitsToFloat5) : (i17 * intBitsToFloat6) + intBitsToFloat5) << 32), ha5Var.H0(2.0f), 1, null, 480);
                                    }
                                    i15 = i7;
                                    i16 = i8;
                                }
                                int i18 = i15;
                                float H04 = i14 > i18 ? intBitsToFloat8 - ha5Var.H0(8.0f) : ((f14 * (i18 - i14)) / i18) + intBitsToFloat8;
                                long n5 = ha5Var.n();
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(z ? Float.intBitsToFloat((int) (n5 >> 32)) - (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f3) : Float.intBitsToFloat((int) (n5 >> 32)) / f3) << 32) | (Float.floatToRawIntBits(H04) & 4294967295L);
                                if (z) {
                                    intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                                    H0 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - ha5Var.H0(16.0f);
                                } else {
                                    intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                                    H0 = ha5Var.H0(16.0f);
                                }
                                float H05 = ha5Var.H0(2.0f);
                                long j6 = D3;
                                ha5.W0(ha5Var, j6, floatToRawIntBits2, (Float.floatToRawIntBits(intBitsToFloat - H0) << 32) | (Float.floatToRawIntBits(H04) & 4294967295L), H05, 0, r2, 464);
                                String concat = "Avg. ".concat(uxf.E(i14, 62, false));
                                yf8 yf8Var3 = xth.a;
                                long j7 = jej.a(jejVar, concat, dfj.a(xth.b(), j6, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), 1020).c;
                                o6a.u(ha5Var, jejVar, new q80(concat), (Float.floatToRawIntBits(z ? Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)) - ((int) (j7 >> 32)) : Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)) - ha5Var.H0(2.0f)) - ((int) (j7 & 4294967295L))) & 4294967295L), dfj.a(xth.b(), j6, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214));
                                Unit unit3 = Unit.a;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(obj2);
                    O9 = obj2;
                } else {
                    g28Var = g28Var2;
                }
                lz.d(6, av8Var, g28Var, (Function1) O9);
                ljg.t(av8Var, true, true, false);
            } else {
                av8Var.d0(1482595834);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(si5Var, function0, xtcVar, i2, 13);
        }
    }

    public static final void y(float f2, List list, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-188112027);
        int i3 = (av8Var.d(f2) ? 4 : 2) | i2 | (av8Var.i(list) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ff5 ff5Var = dh3.n;
            tol.b(ff5Var.a(ema.a), yqo.H(-69228507, av8Var, new q8b(xtcVar, list, f2, (ema) av8Var.k(ff5Var))), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oc7(f2, list, xtcVar, i2);
        }
    }

    public static final void z(q80 q80Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2037083312);
        int i3 = i2 | (av8Var2.g(q80Var) ? 4 : 2);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.d(q80Var, xtcVar, 0L, null, 0L, 0L, null, 0L, 0, false, 2, 0, null, null, dfj.a(xth.g(), 0L, 0L, null, null, 0L, null, 0, 0, 0L, null, null, l7b.c, 14680063), av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 24576, 245756);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(q80Var, xtcVar, i2, 24);
        }
    }
}
