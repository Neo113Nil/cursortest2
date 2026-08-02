package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayer;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.player.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class v9g {
    public static final tc3 a = new tc3(-2032873366, new ed3(15), false);
    public static final tc3 b = new tc3(-2092647999, new ed3(16), false);
    public static final tc3 c = new tc3(-856968062, new ed3(17), false);
    public static final tc3 d = new tc3(1278263218, new gd3(2), false);
    public static final tc3 e = new tc3(839651458, new ud3(8), false);
    public static final tc3 f = new tc3(-73760085, new ud3(9), false);
    public static final b1f g = new b1f(14);
    public static final ad3 h = new ad3(2);
    public static final dff i = new dff(18);
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static ImageVector m;
    public static ImageVector n;

    public static void A(s18 s18Var, uae uaeVar) {
        if (s18Var.k(uaeVar)) {
            return;
        }
        try {
            s18Var.H(uaeVar, false).close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void B(s18 s18Var, uae uaeVar) {
        try {
            IOException iOException = null;
            for (uae uaeVar2 : s18Var.m(uaeVar)) {
                try {
                    if (s18Var.n(uaeVar2).c) {
                        B(s18Var, uaeVar2);
                    }
                    s18Var.i(uaeVar2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void C(Drawable drawable, Canvas canvas) {
        drawable.getClass();
        canvas.getClass();
        int save = canvas.save();
        canvas.scale(-1.0f, 1.0f, (drawable.getBounds().width() / 2.0f) + drawable.getBounds().left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final Integer D(ilh ilhVar, mg3 mg3Var, int i2, int i3) {
        Integer D;
        int[] iArr = ilhVar.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (ilhVar.j(i2) && ilhVar.i(i2) == 206 && Intrinsics.c(ilhVar.p(i2, iArr), sf3.e)) {
                Object h2 = ilhVar.h(i2, 0);
                ev8 ev8Var = h2 instanceof ev8 ? (ev8) h2 : null;
                Object obj = ev8Var != null ? ev8Var.a : null;
                yu8 yu8Var = obj instanceof yu8 ? (yu8) obj : null;
                if (yu8Var != null && yu8Var.a == mg3Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (ilhVar.d(i2) && (D = D(ilhVar, mg3Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(D.intValue());
            }
            i2 = i4;
        }
    }

    public static final String E(long j2, of3 of3Var) {
        wd5 wd5Var = xd5.b;
        be5 be5Var = be5.MINUTES;
        long R = wkn.R(15, be5Var);
        be5 be5Var2 = be5.SECONDS;
        long k2 = (xd5.k(wkn.R(15, be5Var), be5Var2) + j2) - ((Number) hda.N(xd5.k(R, be5Var2) + j2, of3Var, 0).getValue()).longValue();
        if (k2 <= 0) {
            av8 av8Var = (av8) of3Var;
            return ljg.k(av8Var, -1591677384, R.string.second_half_starting_soon, av8Var, false);
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-1591847946);
        if (k2 < 0) {
            k2 = 0;
        }
        int i2 = (int) k2;
        int i3 = i2 / 60;
        String w = oea.w(R.string.time_until_second_half, new Object[]{String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2 - (i3 * 60))}, 2))}, av8Var2);
        av8Var2.s(false);
        return w;
    }

    public static final xtc F(xtc xtcVar, i10 i10Var, q5b q5bVar, tbj tbjVar) {
        return xtcVar.z(new j5b(i10Var, q5bVar, tbjVar));
    }

    public static final List G(Context context, List list) {
        list.getClass();
        context.getClass();
        return CollectionsKt.H0(list, tv3.b(context));
    }

    public static void H(Fragment fragment, Integer num, int i2) {
        rq3 rq3Var = null;
        Integer num2 = (i2 & 1) != 0 ? null : num;
        e87 e87Var = new e87(0);
        FragmentActivity requireActivity = fragment.requireActivity();
        requireActivity.getClass();
        xw3.L(wca.x(requireActivity.getLifecycle()), null, null, new rh4(e87Var, num2, requireActivity, rq3Var, 29), 3);
    }

    public static final void I(fk4 fk4Var, String str, Function1 function1) {
        fk4Var.getClass();
        if (!(fk4Var instanceof e3)) {
            a70.r("impossible");
            return;
        }
        e3 e3Var = (e3) fk4Var;
        i5k.e(1, function1);
        ef0 e2 = e3Var.e();
        e3 l2 = e3Var.l();
        function1.invoke(l2);
        Unit unit = Unit.a;
        e2.a(new mvd(str, new oh3(l2.e().a)));
    }

    public static final void J(Drawable drawable, int i2) {
        Drawable mutate;
        Drawable mutate2;
        itc itcVar = itc.a;
        if (Build.VERSION.SDK_INT < 29) {
            if (drawable == null || (mutate = drawable.mutate()) == null) {
                return;
            }
            mutate.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            return;
        }
        if (drawable == null || (mutate2 = drawable.mutate()) == null) {
            return;
        }
        by1.i();
        mutate2.setColorFilter(by1.a(i2, itcVar.d()));
    }

    public static /* synthetic */ void K(Drawable drawable, int i2) {
        itc itcVar = itc.a;
        J(drawable, i2);
    }

    public static final void L(Drawable drawable, boolean z) {
        drawable.getClass();
        drawable.setAlpha(z ? 255 : 0);
    }

    public static final void M(Drawable drawable, int i2, int i3) {
        Drawable findDrawableByLayerId;
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable == null || (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(i2)) == null) {
            return;
        }
        findDrawableByLayerId.setTint(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [gof, t01] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList N(ilh ilhVar, int i2, Integer num) {
        ?? gofVar = new gof(ilhVar);
        int q = ilhVar.q(i2);
        vu8 a2 = ilhVar.a(i2);
        while (i2 >= 0) {
            gofVar.E(ilhVar.i(i2), ilhVar.k(i2) ? ilhVar.p(i2, ilhVar.b) : nf3.a, ilhVar.a.p(i2), num);
            if (q >= 0) {
                vu8 vu8Var = a2;
                a2 = ilhVar.a(q);
                i2 = q;
                q = ilhVar.q(q);
                num = vu8Var;
            } else {
                i2 = q;
                num = a2;
            }
        }
        return (ArrayList) gofVar.b;
    }

    public static final void a(gv9 gv9Var, int i2, of3 of3Var, int i3, int i4) {
        int i5;
        int i6;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1996734215);
        int i7 = (av8Var.g(gv9Var) ? 4 : 2) | i3;
        int i8 = i4 & 2;
        if (i8 != 0) {
            i6 = i7 | 48;
            i5 = i2;
        } else {
            i5 = i2;
            i6 = i7 | (av8Var.e(i5) ? 32 : 16);
        }
        int i9 = 0;
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            int i10 = i8 != 0 ? -1 : i5;
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            int i11 = i10 < 0 ? 0 : i10;
            xtc f0 = l98.f0(bkh.e(bkh.d(utc.a, 1.0f), 124.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            lv1 lv1Var = uxf.m;
            int i12 = i11;
            ng0 ng0Var = new ng0(24.0f, true, new a70(6));
            t3e C = l98.C(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            boolean z = (i6 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new uo(i9, gv9Var);
                av8Var.n0(O);
            }
            v8a.c(f0, a2, C, ng0Var, lv1Var, null, false, null, (Function1) O, av8Var, 221574, 456);
            Unit unit = Unit.a;
            boolean g2 = av8Var.g(a2) | av8Var.e(i12);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new wo(a2, i12, (rq3) null, 0);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, unit, (Function2) O2);
            i5 = i10;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vo(gv9Var, i5, i3, i4);
        }
    }

    public static final void b(nm0 nm0Var, int i2, String str, int i3, String str2, xtc xtcVar, qug qugVar, of3 of3Var, int i4) {
        xtc xtcVar2;
        nm0Var.getClass();
        str.getClass();
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2037399229);
        int i5 = i4 | (av8Var.e(nm0Var.ordinal()) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i3) ? a.o : 1024) | (av8Var.g(str2) ? 16384 : 8192) | 196608 | (av8Var.g(qugVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            av8Var.Y();
            int i6 = i4 & 1;
            utc utcVar = utc.a;
            if (i6 == 0 || av8Var.B()) {
                xtcVar2 = utcVar;
            } else {
                av8Var.W();
                xtcVar2 = xtcVar;
            }
            av8Var.t();
            boolean z = ((Configuration) av8Var.k(nz.a)).getLayoutDirection() == 1;
            xtc f0 = l98.f0(l98.d0(hkg.u0(xtcVar2, qugVar, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            q9k q9kVar = nm0Var.b;
            List list = nm0Var.c;
            String a3 = q9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            xtcVar = xtcVar2;
            udj.c(a3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            udj.c(oea.w(R.string.attack_momentum_first, new Object[]{str}, av8Var), null, lz.D(R.color.secondary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            l8g a4 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            td4.G(i2, bkh.l(utcVar, 24.0f), false, 0L, av8Var, ((i5 >> 3) & 14) | 48, 12);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            td4.G(i3, bkh.l(utcVar, 24.0f), false, 0L, av8Var, ((i5 >> 9) & 14) | 48, 12);
            i.o(av8Var, true, utcVar, 12.0f, av8Var);
            wkn.k(haa.t(R.drawable.ic_attack_momentum_dialog, 0, av8Var), null, f6a.D(utcVar, z ? -1.0f : 1.0f, 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
            av8Var.s(true);
            udj.c(oea.w(R.string.attack_momentum_away, new Object[]{str2}, av8Var), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            if (list.isEmpty()) {
                av8Var.d0(-981776485);
                av8Var.s(false);
            } else {
                bf3.r(8.0f, -982198364, av8Var, av8Var, utcVar);
                udj.c(oea.v(R.string.commentary_key_events, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    q((mm0) it.next(), null, av8Var, 0);
                }
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        xtc xtcVar3 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ei(nm0Var, i2, str, i3, str2, xtcVar3, qugVar, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final xtc xtcVar, Function2 function2, tc3 tc3Var, ct8 ct8Var, float f2, float f3, float f4, Integer num, ct8 ct8Var2, String str, String str2, final Function0 function0, of3 of3Var, final int i2, final int i3) {
        int i4;
        Function2 function22;
        int i5;
        ct8 ct8Var3;
        int i6;
        float f5;
        int i7;
        int i8;
        final float f6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        av8 av8Var;
        tc3 tc3Var2;
        final float f7;
        final Integer num2;
        final String str3;
        final Function2 function23;
        final ct8 ct8Var4;
        final float f8;
        final ct8 ct8Var5;
        final String str4;
        eqf u;
        ff3 ff3Var;
        int i16;
        boolean z;
        boolean z2;
        String str5;
        boolean z3;
        ct8 ct8Var6;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(622866096);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function22 = function2;
            i4 |= av8Var2.i(function22) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= av8Var2.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                ct8Var3 = ct8Var;
                i4 |= av8Var2.i(ct8Var3) ? a.o : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    f5 = f2;
                    i4 |= av8Var2.d(f5) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i4 |= av8Var2.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        f6 = f4;
                    } else {
                        f6 = f4;
                        if ((i2 & 1572864) == 0) {
                            i4 |= av8Var2.d(f6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= av8Var2.g(num) ? 8388608 : 4194304;
                    }
                    int i18 = i4;
                    i10 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i10 == 0) {
                        i18 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i11 = i10;
                        i18 |= av8Var2.i(ct8Var2) ? 67108864 : 33554432;
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i13 = i12;
                            i14 = i18 | 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i13 = i12;
                                i18 |= av8Var2.g(str) ? 536870912 : 268435456;
                            } else {
                                i13 = i12;
                            }
                            i14 = i18;
                        }
                        int i19 = i3 & 1024;
                        i15 = (i19 != 0 ? 6 : av8Var2.g(str2) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16);
                        if (av8Var2.T(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 19) != 18)) {
                            if (i17 != 0) {
                                function22 = null;
                            }
                            if (i5 != 0) {
                                ct8Var3 = null;
                            }
                            float f9 = i6 != 0 ? 16.0f : f5;
                            float f10 = i7 != 0 ? 16.0f : f3;
                            if (i8 != 0) {
                                f6 = 16.0f;
                            }
                            Integer num3 = i9 != 0 ? null : num;
                            ct8 ct8Var7 = i11 != 0 ? null : ct8Var2;
                            String str6 = i13 != 0 ? null : str;
                            String str7 = i19 == 0 ? str2 : null;
                            float f11 = f9;
                            xtc A = wnn.A(n9e.q(l98.d0(bkh.d(bkh.e(xtcVar, 300.0f), 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var2), o7g.a(16.0f)), o7g.a(16.0f));
                            Object O = av8Var2.O();
                            if (O == nf3.a) {
                                O = new hdd();
                                av8Var2.n0(O);
                            }
                            xtc w = oyn.w(A, false, null, (hdd) O, function0, 7);
                            mv1 mv1Var = uxf.c;
                            k1c c2 = e12.c(mv1Var, false);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C = fqj.C(av8Var2, w);
                            if3.k7.getClass();
                            String str8 = str7;
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var);
                            } else {
                                av8Var2.q0();
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var2, c2, f50Var);
                            ff3 ff3Var2 = hf3.f;
                            waa.K(av8Var2, m2, ff3Var2);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var2, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var2, ryVar);
                            Integer num4 = num3;
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var2, C, f50Var3);
                            n12 n12Var = n12.a;
                            if (num4 != null) {
                                av8Var2.d0(-608298048);
                                ff3Var = ff3Var2;
                                wkn.k(haa.t(num4.intValue(), (i14 >> 21) & 14, av8Var2), null, u6h.C(bkh.c, 0.4f), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 25016, 104);
                                av8Var = av8Var2;
                                i16 = 0;
                                av8Var.s(false);
                                Unit unit = Unit.a;
                            } else {
                                av8Var = av8Var2;
                                ff3Var = ff3Var2;
                                i16 = 0;
                                av8Var.d0(-607980701);
                                if (ct8Var7 == null) {
                                    av8Var.d0(-607980702);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(-607980701);
                                    ct8Var7.invoke(n12Var, av8Var, Integer.valueOf(6 | ((i14 >> 21) & 112)));
                                    Unit unit2 = Unit.a;
                                    av8Var.s(false);
                                }
                                av8Var.s(false);
                            }
                            g28 g28Var = bkh.c;
                            xtc f0 = l98.f0(g28Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5);
                            ct8 ct8Var8 = ct8Var7;
                            p4h p4hVar = ww9.d;
                            ct8 ct8Var9 = ct8Var3;
                            kv1 kv1Var = uxf.o;
                            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, i16);
                            int hashCode2 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C2 = fqj.C(av8Var, f0);
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
                            utc utcVar = utc.a;
                            if (function22 == null) {
                                av8Var.d0(-490016227);
                                z2 = false;
                                av8Var.s(false);
                                z = true;
                            } else {
                                av8Var.d0(-490016226);
                                xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                k1c c3 = e12.c(mv1Var, false);
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
                                z = true;
                                me4.l((i14 >> 3) & 14, function22, av8Var, true);
                                Unit unit3 = Unit.a;
                                z2 = false;
                                av8Var.s(false);
                            }
                            x23 x23Var = x23.a;
                            xtc e0 = l98.e0(x23Var.a(1.0f, g28Var, z), f6, 8.0f, f6, f10);
                            k1c c4 = e12.c(uxf.g, z2);
                            int hashCode4 = Long.hashCode(av8Var.T);
                            aee m5 = av8Var.m();
                            xtc C4 = fqj.C(av8Var, e0);
                            av8Var.h0();
                            float f12 = f6;
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, c4, f50Var);
                            waa.K(av8Var, m5, ff3Var);
                            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C4, f50Var3);
                            tc3Var2 = tc3Var;
                            tc3Var2.invoke(n12Var, av8Var, Integer.valueOf(6 | ((i14 >> 3) & 112)));
                            av8Var.s(true);
                            xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
                            Function2 function24 = function22;
                            float f13 = f10;
                            int hashCode5 = Long.hashCode(av8Var.T);
                            aee m6 = av8Var.m();
                            xtc C5 = fqj.C(av8Var, d02);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a3, f50Var);
                            waa.K(av8Var, m6, ff3Var);
                            bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C5, f50Var3);
                            if (str6 == null || str6.length() == 0) {
                                str5 = str6;
                                av8Var.d0(-1557135292);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-1557315557);
                                yf8 yf8Var = xth.a;
                                String str9 = str6;
                                udj.c(str9, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, (i14 >> 27) & 14, 0, 131066);
                                str5 = str9;
                                av8Var.s(false);
                            }
                            if (str8 == null || str8.length() == 0) {
                                z3 = false;
                                av8Var.d0(-1556675004);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-1557052274);
                                xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (str5 == null || str5.length() == 0) ? 16.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
                                yf8 yf8Var2 = xth.a;
                                udj.c(str8, f02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, i15 & 14, 0, 131064);
                                z3 = false;
                                av8Var.s(false);
                            }
                            av8Var.s(true);
                            if (ct8Var9 == null) {
                                av8Var.d0(-488484703);
                                av8Var.s(z3);
                                ct8Var6 = ct8Var9;
                            } else {
                                av8Var.d0(-488484702);
                                ct8Var6 = ct8Var9;
                                ct8Var6.invoke(x23Var, av8Var, Integer.valueOf(6 | ((i14 >> 6) & 112)));
                                Unit unit4 = Unit.a;
                                av8Var.s(z3);
                            }
                            av8Var.s(true);
                            av8Var.s(true);
                            ct8Var4 = ct8Var6;
                            str3 = str5;
                            f7 = f13;
                            str4 = str8;
                            num2 = num4;
                            f8 = f11;
                            f6 = f12;
                            ct8Var5 = ct8Var8;
                            function23 = function24;
                        } else {
                            av8Var = av8Var2;
                            tc3Var2 = tc3Var;
                            av8Var.W();
                            f7 = f3;
                            num2 = num;
                            str3 = str;
                            function23 = function22;
                            ct8Var4 = ct8Var3;
                            f8 = f5;
                            ct8Var5 = ct8Var2;
                            str4 = str2;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            final tc3 tc3Var3 = tc3Var2;
                            u.d = new Function2() { // from class: y61
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int K = aba.K(i2 | 1);
                                    v9g.c(xtc.this, function23, tc3Var3, ct8Var4, f8, f7, f6, num2, ct8Var5, str3, str4, function0, (of3) obj, K, i3);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    int i192 = i3 & 1024;
                    i15 = (i192 != 0 ? 6 : av8Var2.g(str2) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16);
                    if (av8Var2.T(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 19) != 18)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                f5 = f2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                int i182 = i4;
                i10 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                int i1922 = i3 & 1024;
                i15 = (i1922 != 0 ? 6 : av8Var2.g(str2) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16);
                if (av8Var2.T(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 19) != 18)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            ct8Var3 = ct8Var;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            f5 = f2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            int i1822 = i4;
            i10 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            int i19222 = i3 & 1024;
            i15 = (i19222 != 0 ? 6 : av8Var2.g(str2) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16);
            if (av8Var2.T(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 19) != 18)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        function22 = function2;
        if ((i2 & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        ct8Var3 = ct8Var;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        f5 = f2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        int i18222 = i4;
        i10 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        int i192222 = i3 & 1024;
        i15 = (i192222 != 0 ? 6 : av8Var2.g(str2) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16);
        if (av8Var2.T(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 19) != 18)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void d(bt1 bt1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1205632486);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(bt1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.c(0);
                av8Var2.n0(O);
            }
            znh znhVar = (znh) O;
            Unit unit = Unit.a;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new at1(znhVar, null, i5);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, unit, (Function2) O2);
            String str = bt1Var.h;
            String str2 = bt1Var.i;
            tc3 H = yqo.H(-1416712507, av8Var2, new ws1(bt1Var, znhVar, i5));
            Integer valueOf = Integer.valueOf(R.drawable.media_card_rating_background);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object O3 = av8Var2.O();
            if (z || O3 == a99Var) {
                O3 = new xs1(function1, bt1Var, i4);
                av8Var2.n0(O3);
            }
            av8Var = av8Var2;
            c(xtcVar, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, valueOf, null, str, str2, (Function0) O3, av8Var, ((i3 >> 6) & 14) | 384, 378);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ys1(bt1Var, function1, xtcVar, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(boolean z, Function1 function1, q80 q80Var, xtc xtcVar, dfj dfjVar, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        dfj dfjVar2;
        dfj dfjVar3;
        xtc xtcVar3;
        eqf u;
        xtc xtcVar4;
        dfj g2;
        int i5;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1382342353);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(q80Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? a.o : 1024;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    dfjVar2 = dfjVar;
                    if (av8Var.g(dfjVar2)) {
                        i5 = 16384;
                        i4 |= i5;
                    }
                } else {
                    dfjVar2 = dfjVar;
                }
                i5 = 8192;
                i4 |= i5;
            } else {
                dfjVar2 = dfjVar;
            }
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                av8Var.W();
                dfjVar3 = dfjVar2;
                xtcVar3 = xtcVar2;
            } else {
                av8Var.Y();
                if ((i2 & 1) == 0 || av8Var.B()) {
                    xtc xtcVar5 = i6 != 0 ? utc.a : xtcVar2;
                    if ((i3 & 16) != 0) {
                        yf8 yf8Var = xth.a;
                        xtcVar4 = xtcVar5;
                        g2 = xth.g();
                        av8Var.t();
                        tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(1259398255, av8Var, new f70(xtcVar4, z, function1, q80Var, g2, 1)), av8Var, 56);
                        xtcVar3 = xtcVar4;
                        dfjVar3 = g2;
                    } else {
                        xtcVar4 = xtcVar5;
                    }
                } else {
                    av8Var.W();
                    xtcVar4 = xtcVar2;
                }
                g2 = dfjVar2;
                av8Var.t();
                tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(1259398255, av8Var, new f70(xtcVar4, z, function1, q80Var, g2, 1)), av8Var, 56);
                xtcVar3 = xtcVar4;
                dfjVar3 = g2;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(z, function1, q80Var, xtcVar3, dfjVar3, i2, i3);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 24576) != 0) {
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if ((r35 & 8) != 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final String str, xtc xtcVar, long j2, long j3, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        long j4;
        int i4;
        long j5;
        int i5;
        int i6;
        final xtc xtcVar3;
        final long j6;
        final long j7;
        eqf u;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1210112811);
        int i7 = i2 | (av8Var.g(str) ? 4 : 2);
        int i8 = i3 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i3 & 4) != 0) {
                j4 = j2;
                if (av8Var.f(j4)) {
                    i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                    int i9 = i7 | i4;
                    if ((i3 & 8) == 0) {
                        j5 = j3;
                        if (av8Var.f(j5)) {
                            i5 = a.o;
                            i6 = i9 | i5;
                            if (av8Var.T(i6 & 1, (i6 & 1171) == 1170)) {
                                av8Var.W();
                                xtcVar3 = xtcVar2;
                                j6 = j4;
                                j7 = j5;
                            } else {
                                av8Var.Y();
                                int i10 = i2 & 1;
                                utc utcVar = utc.a;
                                if (i10 == 0 || av8Var.B()) {
                                    if (i8 != 0) {
                                        xtcVar2 = utcVar;
                                    }
                                    if ((i3 & 4) != 0) {
                                        j4 = lz.D(R.color.n_lv_1, av8Var);
                                        i6 &= -897;
                                    }
                                    if ((i3 & 8) != 0) {
                                        j5 = lz.D(R.color.primary_default, av8Var);
                                        i6 &= -7169;
                                    }
                                    int i11 = i6;
                                    xtc xtcVar4 = xtcVar2;
                                    long j8 = j4;
                                    long j9 = j5;
                                    av8Var.t();
                                    xtc d2 = bkh.d(xtcVar4, 1.0f);
                                    l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
                                    waa.K(av8Var, a2, hf3.g);
                                    waa.K(av8Var, m2, hf3.f);
                                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                    waa.J(av8Var, hf3.k);
                                    waa.K(av8Var, C, hf3.d);
                                    kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark, 6, av8Var), null, bkh.l(utcVar, 16.0f), j9, av8Var, (i11 & 7168) | 432, 0);
                                    yf8 yf8Var = xth.a;
                                    udj.c(str, null, j8, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, i11 & 910, 0, 131066);
                                    av8Var = av8Var;
                                    av8Var.s(true);
                                    j6 = j8;
                                    j7 = j9;
                                    xtcVar3 = xtcVar4;
                                } else {
                                    av8Var.W();
                                    if ((i3 & 4) != 0) {
                                        i6 &= -897;
                                    }
                                }
                            }
                            u = av8Var.u();
                            if (u == null) {
                                u.d = new Function2() { // from class: es5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        v9g.f(str, xtcVar3, j6, j7, (of3) obj, aba.K(i2 | 1), i3);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    } else {
                        j5 = j3;
                    }
                    i5 = 1024;
                    i6 = i9 | i5;
                    if (av8Var.T(i6 & 1, (i6 & 1171) == 1170)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
            } else {
                j4 = j2;
            }
            i4 = 128;
            int i92 = i7 | i4;
            if ((i3 & 8) == 0) {
            }
            i5 = 1024;
            i6 = i92 | i5;
            if (av8Var.T(i6 & 1, (i6 & 1171) == 1170)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i3 & 4) != 0) {
        }
        i4 = 128;
        int i922 = i7 | i4;
        if ((i3 & 8) == 0) {
        }
        i5 = 1024;
        i6 = i922 | i5;
        if (av8Var.T(i6 & 1, (i6 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(im imVar, em emVar, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        Double d2;
        ff3 ff3Var;
        cu cuVar;
        Double d3;
        Double d4;
        ry ryVar;
        a99 a99Var;
        Context context;
        zg3 zg3Var;
        f50 f50Var;
        boolean z2;
        boolean z3;
        f50 f50Var2;
        NumberFormat numberFormat;
        ff3 ff3Var2;
        FragmentActivity fragmentActivity;
        Double d5;
        int i3;
        f50 f50Var3;
        utc utcVar;
        cu cuVar2;
        Double d6;
        boolean z4;
        String t;
        ry ryVar2;
        zg3 zg3Var2;
        f50 f50Var4;
        cu cuVar3;
        f50 f50Var5;
        ff3 ff3Var3;
        f50 f50Var6;
        a99 a99Var2;
        float f2;
        boolean z5;
        int i4;
        zg3 zg3Var3;
        Double d7;
        NumberFormat numberFormat2;
        String str;
        Double d8 = imVar.e;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2121366764);
        int i5 = i2 | (av8Var.i(imVar) ? 4 : 2) | (av8Var.g(emVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | 24576;
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            Context context2 = (Context) av8Var.k(nz.b);
            Object k2 = av8Var.k(ngb.a);
            FragmentActivity fragmentActivity2 = k2 instanceof FragmentActivity ? (FragmentActivity) k2 : null;
            cu cuVar4 = imVar.d;
            Double d9 = imVar.c;
            Double d10 = imVar.a;
            Double d11 = d8 == null ? (Intrinsics.b(d9, d10) || Intrinsics.a(d9, 0.0d)) ? d10 : d9 : d8;
            Object O = av8Var.O();
            a99 a99Var3 = nf3.a;
            if (O == a99Var3) {
                if (d11 == null || (str = imVar.b) == null) {
                    O = null;
                } else {
                    Currency currency = Currency.getInstance(str);
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                    currencyInstance.setCurrency(currency);
                    O = currencyInstance;
                }
                av8Var.n0(O);
            }
            NumberFormat numberFormat3 = (NumberFormat) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var3) {
                AnalystOfferRemoteConfig analystOfferRemoteConfig = imVar.h;
                d2 = d8;
                O2 = Integer.valueOf((analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getOfferLength() : 7) - ((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(((Number) n9e.x(context2, new kz3(imVar, 19))).longValue())), vxd.o(Instant.ofEpochMilli(System.currentTimeMillis())))));
                av8Var.n0(O2);
            } else {
                d2 = d8;
            }
            int intValue = ((Number) O2).intValue();
            utc utcVar2 = utc.a;
            FragmentActivity fragmentActivity3 = fragmentActivity2;
            xtc f0 = l98.f0(hkg.u0(bkh.d(utcVar2, 1.0f), hkg.o0(av8Var), false, 14), 16.0f, 40.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            Double d12 = d11;
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var4 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var4);
            } else {
                av8Var.q0();
            }
            f50 f50Var7 = hf3.g;
            waa.K(av8Var, a2, f50Var7);
            ff3 ff3Var4 = hf3.f;
            waa.K(av8Var, m2, ff3Var4);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var8 = hf3.j;
            waa.K(av8Var, valueOf, f50Var8);
            ry ryVar3 = hf3.k;
            waa.J(av8Var, ryVar3);
            f50 f50Var9 = hf3.d;
            waa.K(av8Var, C, f50Var9);
            if (z) {
                av8Var.d0(-302563547);
                ff3Var = ff3Var4;
                cuVar = cuVar4;
                d4 = d10;
                d3 = d9;
                ryVar = ryVar3;
                uaa.k(54, 4, av8Var, null, true, false);
                av8Var = av8Var;
                z3 = false;
                av8Var.s(false);
                a99Var = a99Var3;
                f50Var = f50Var8;
                zg3Var = zg3Var4;
                context = context2;
                z2 = true;
            } else {
                ff3Var = ff3Var4;
                cuVar = cuVar4;
                d3 = d9;
                d4 = d10;
                ryVar = ryVar3;
                av8Var.d0(-302407183);
                a99Var = a99Var3;
                context = context2;
                zg3Var = zg3Var4;
                f50Var = f50Var8;
                z2 = true;
                kq9.b(s6a.N(emVar.a, 6, av8Var), null, bkh.l(utcVar2, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                z3 = false;
                av8Var.s(false);
            }
            if (z) {
                av8Var.d0(-302123471);
                String w = oea.w(R.string.percent_off, new Object[]{yid.r(30)}, av8Var);
                long D = lz.D(R.color.surface_1, av8Var);
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                fragmentActivity = fragmentActivity3;
                i3 = i5;
                cuVar2 = cuVar;
                d6 = d4;
                f50Var2 = f50Var9;
                numberFormat = numberFormat3;
                ff3Var2 = ff3Var;
                d5 = d12;
                f50Var3 = f50Var7;
                udj.c(w, l98.c0(n9e.q(utcVar2, lz.D(R.color.success, av8Var), o7g.a(2.0f)), 6.0f, 2.0f), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131064);
                av8Var = av8Var2;
                av8Var.s(false);
                utcVar = utcVar2;
                z4 = true;
            } else {
                boolean z6 = z3;
                f50Var2 = f50Var9;
                numberFormat = numberFormat3;
                ff3Var2 = ff3Var;
                fragmentActivity = fragmentActivity3;
                d5 = d12;
                i3 = i5;
                f50Var3 = f50Var7;
                cu cuVar5 = cuVar;
                if (Intrinsics.c(cuVar5 != null ? Boolean.valueOf(cuVar5.c) : null, Boolean.TRUE)) {
                    av8Var.d0(-301662501);
                    xtc c0 = l98.c0(n9e.q(utcVar2, lz.D(R.color.success, av8Var), o7g.a(2.0f)), 6.0f, 2.0f);
                    if (intValue == 1) {
                        t = ljg.k(av8Var, -301452290, R.string.last_day, av8Var, z6);
                    } else {
                        av8Var.d0(-301364095);
                        t = oea.t(R.plurals.days_left, intValue, new Object[]{Integer.valueOf(intValue)}, av8Var);
                        av8Var.s(z6);
                    }
                    yf8 yf8Var2 = xth.a;
                    av8 av8Var3 = av8Var;
                    utcVar = utcVar2;
                    cuVar2 = cuVar5;
                    z4 = true;
                    String str2 = t;
                    d6 = d4;
                    udj.c(str2, c0, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var3, 0, 0, 131064);
                    av8Var = av8Var3;
                    av8Var.s(z6);
                } else {
                    utcVar = utcVar2;
                    cuVar2 = cuVar5;
                    d6 = d4;
                    z4 = true;
                    av8Var.d0(-301021204);
                    av8Var.s(z6);
                }
            }
            utc utcVar3 = utcVar;
            xtc f02 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String v = oea.v(emVar.b, av8Var);
            yf8 yf8Var3 = xth.a;
            av8 av8Var4 = av8Var;
            utc utcVar4 = utcVar3;
            udj.c(v, f02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var4, 48, 0, 131064);
            av8 av8Var5 = av8Var4;
            NumberFormat numberFormat4 = numberFormat;
            if (numberFormat4 != null) {
                av8Var5.d0(-300732439);
                l8g a3 = k8g.a(new ng0(4.0f, z4, new a70(6)), uxf.l, av8Var5, 6);
                int hashCode2 = Long.hashCode(av8Var5.T);
                aee m3 = av8Var5.m();
                xtc C2 = fqj.C(av8Var5, utcVar4);
                av8Var5.h0();
                if (av8Var5.S) {
                    zg3Var3 = zg3Var;
                    av8Var5.l(zg3Var3);
                } else {
                    zg3Var3 = zg3Var;
                    av8Var5.q0();
                }
                f50 f50Var10 = f50Var3;
                waa.K(av8Var5, a3, f50Var10);
                ff3 ff3Var5 = ff3Var2;
                waa.K(av8Var5, m3, ff3Var5);
                ry ryVar4 = ryVar;
                f50 f50Var11 = f50Var;
                bf3.s(hashCode2, av8Var5, f50Var11, av8Var5, ryVar4);
                f50 f50Var12 = f50Var2;
                waa.K(av8Var5, C2, f50Var12);
                v8j v8jVar = v8j.d;
                if (d2 != null) {
                    av8Var5.d0(727538746);
                    if (d6 != null) {
                        d3 = d6;
                    }
                    String format = numberFormat4.format(d3 != null ? Double.valueOf(d3.doubleValue() * 6.0d) : null);
                    format.getClass();
                    udj.c(format, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.l(), 0L, 0L, null, null, 0L, v8jVar, 0, 0, 0L, null, null, 0, 16773119), av8Var5, 0, 0, 131066);
                    av8Var5 = av8Var5;
                    av8Var5.s(false);
                    ryVar2 = ryVar4;
                    zg3Var2 = zg3Var3;
                    f50Var4 = f50Var11;
                    f50Var5 = f50Var10;
                    d7 = d5;
                    numberFormat2 = numberFormat4;
                    ff3Var3 = ff3Var5;
                    f50Var6 = f50Var12;
                } else {
                    zg3 zg3Var5 = zg3Var3;
                    Double d13 = d5;
                    if (Intrinsics.b(d13, d6) || d6 == null) {
                        d7 = d13;
                        numberFormat2 = numberFormat4;
                        ff3Var3 = ff3Var5;
                        ryVar2 = ryVar4;
                        zg3Var2 = zg3Var5;
                        f50Var4 = f50Var11;
                        f50Var5 = f50Var10;
                        f50Var6 = f50Var12;
                        av8Var5.d0(728233859);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(727965182);
                        String format2 = numberFormat4.format(d6.doubleValue());
                        format2.getClass();
                        d7 = d13;
                        ryVar2 = ryVar4;
                        zg3Var2 = zg3Var5;
                        f50Var4 = f50Var11;
                        f50Var5 = f50Var10;
                        numberFormat2 = numberFormat4;
                        ff3Var3 = ff3Var5;
                        f50Var6 = f50Var12;
                        udj.c(format2, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.l(), 0L, 0L, null, null, 0L, v8jVar, 0, 0, 0L, null, null, 0, 16773119), av8Var5, 0, 0, 131066);
                        av8Var5 = av8Var5;
                        av8Var5.s(false);
                    }
                }
                av8Var5.d0(300588012);
                o80 o80Var = new o80();
                cu cuVar6 = cuVar2;
                int g2 = o80Var.g(new pwh(Intrinsics.c(cuVar2 != null ? Boolean.valueOf(cuVar6.c) : null, Boolean.TRUE) ? ljg.f(av8Var5, 931464838, R.color.success, av8Var5, false) : ljg.f(av8Var5, 931465411, R.color.n_lv_1, av8Var5, false), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                try {
                    String format3 = numberFormat2.format(d7);
                    format3.getClass();
                    o80Var.d(format3);
                    Unit unit = Unit.a;
                    o80Var.f(g2);
                    o80Var.d(emVar.g);
                    q80 h2 = o80Var.h();
                    av8Var5.s(false);
                    av8 av8Var6 = av8Var5;
                    cuVar3 = cuVar6;
                    udj.d(h2, null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xth.l(), av8Var6, 0, 0, 262138);
                    av8Var5 = av8Var6;
                    av8Var5.s(true);
                    av8Var5.s(false);
                } catch (Throwable th) {
                    o80Var.f(g2);
                    throw th;
                }
            } else {
                ryVar2 = ryVar;
                zg3Var2 = zg3Var;
                f50Var4 = f50Var;
                cuVar3 = cuVar2;
                f50Var5 = f50Var3;
                ff3Var3 = ff3Var2;
                f50Var6 = f50Var2;
                av8Var5.d0(-299376468);
                av8Var5.s(false);
            }
            av8 av8Var7 = av8Var5;
            udj.c(oea.v(emVar.c, av8Var5), l98.b0(bkh.d(utcVar4, 1.0f), 8.0f), lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var7, 48, 0, 131064);
            av8 av8Var8 = av8Var7;
            xtc d0 = l98.d0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            int i6 = 6;
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(i6)), uxf.o, av8Var8, 6);
            int hashCode3 = Long.hashCode(av8Var8.T);
            aee m4 = av8Var8.m();
            xtc C3 = fqj.C(av8Var8, d0);
            av8Var8.h0();
            if (av8Var8.S) {
                av8Var8.l(zg3Var2);
            } else {
                av8Var8.q0();
            }
            waa.K(av8Var8, a4, f50Var5);
            waa.K(av8Var8, m4, ff3Var3);
            bf3.s(hashCode3, av8Var8, f50Var4, av8Var8, ryVar2);
            waa.K(av8Var8, C3, f50Var6);
            av8Var8.d0(1915516933);
            Iterator<E> it = emVar.e.iterator();
            while (it.hasNext()) {
                av8 av8Var9 = av8Var8;
                f((String) it.next(), null, 0L, 0L, av8Var9, 0, 14);
                av8Var8 = av8Var9;
            }
            av8Var8.s(false);
            if (emVar.h) {
                av8Var8.d0(-748372511);
                long D2 = lz.D(R.color.n_lv_4, av8Var8);
                Object O3 = av8Var8.O();
                a99 a99Var4 = a99Var;
                if (O3 == a99Var4) {
                    O3 = mz1.e(av8Var8);
                }
                wzc wzcVar = (wzc) O3;
                Object[] objArr = new Object[0];
                Object O4 = av8Var8.O();
                if (O4 == a99Var4) {
                    O4 = b74.g;
                    av8Var8.n0(O4);
                }
                av8 av8Var10 = av8Var8;
                a99Var2 = a99Var4;
                xtc d02 = l98.d0(tol.y(utcVar4, true, true, true, D2, wzcVar, new pi(i6, (boh) o3a.N(objArr, (Function0) O4, av8Var8, 48), fragmentActivity), av8Var10, 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                l8g a5 = k8g.a(ww9.b, uxf.m, av8Var10, 48);
                int hashCode4 = Long.hashCode(av8Var10.T);
                aee m5 = av8Var10.m();
                xtc C4 = fqj.C(av8Var10, d02);
                if3.k7.getClass();
                zg3 zg3Var6 = hf3.b;
                av8Var10.h0();
                if (av8Var10.S) {
                    av8Var10.l(zg3Var6);
                } else {
                    av8Var10.q0();
                }
                waa.K(av8Var10, a5, hf3.g);
                waa.K(av8Var10, m5, hf3.f);
                waa.K(av8Var10, Integer.valueOf(hashCode4), hf3.j);
                waa.J(av8Var10, hf3.k);
                waa.K(av8Var10, C4, hf3.d);
                f2 = 16.0f;
                kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var10), null, bkh.l(utcVar4, 16.0f), lz.D(R.color.primary_default, av8Var10), av8Var10, 432, 0);
                String f3 = fc6.f(8.0f, R.string.learn_more_button, av8Var10, av8Var10, utcVar4);
                yf8 yf8Var4 = xth.a;
                utcVar4 = utcVar4;
                udj.c(f3, null, lz.D(R.color.primary_default, av8Var10), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var10, 0, 0, 131066);
                av8Var8 = av8Var10;
                nq8.h(av8Var8, bkh.p(utcVar4, 8.0f));
                z5 = true;
                av8Var8.s(true);
                av8Var8.s(false);
            } else {
                a99Var2 = a99Var;
                f2 = 16.0f;
                z5 = true;
                av8Var8.d0(-747141470);
                av8Var8.s(false);
            }
            av8Var8.s(z5);
            av8 av8Var11 = av8Var8;
            mha.h(oea.v(emVar.d, av8Var8), function0, bkh.d(l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var11, ((i3 >> 6) & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            av8Var = av8Var11;
            if (Intrinsics.c(cuVar3 != null ? Boolean.valueOf(cuVar3.d) : null, Boolean.TRUE)) {
                av8Var.d0(-297239824);
                xtc d14 = bkh.d(utcVar4, 1.0f);
                String v2 = oea.v(R.string.view_subscription_plans, av8Var);
                Context context3 = context;
                boolean i7 = av8Var.i(context3);
                Object O5 = av8Var.O();
                if (i7 || O5 == a99Var2) {
                    O5 = new c6(context3, 18);
                    av8Var.n0(O5);
                }
                mha.h(v2, (Function0) O5, d14, gqh.a, null, false, false, false, 0L, 0, 0, av8Var, 3456, 0, 2032);
                av8Var = av8Var;
                i4 = 0;
                av8Var.s(false);
            } else {
                i4 = 0;
                av8Var.d0(-296926228);
                av8Var.s(false);
            }
            mha.j(i4, av8Var, null);
            av8Var.s(true);
            xtcVar2 = utcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(imVar, emVar, z, function0, xtcVar2, i2, 2);
        }
    }

    public static final void h(z39 z39Var, wla wlaVar, ct8 ct8Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        wlaVar.getClass();
        ct8Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1402885420);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(z39Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(ct8Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
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
            xtc f0 = l98.f0(utc.a, 16.0f, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, 4);
            boolean z = z39Var.n;
            z8e.l(z ? R.drawable.ic_menu_list_whats_new : R.drawable.ic_replay, z ? R.string.creator_spotlight : R.string.videos_for_you, 384, av8Var2, f0);
            boolean z2 = (i3 & 14) == 4;
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new h63(z39Var, 28);
                av8Var2.n0(O);
            }
            f6a.a(c6e.b(0, (Function0) O, av8Var2, 6, 2), null, l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), null, 0, 8.0f, null, null, false, null, null, null, yqo.H(1777453155, av8Var2, new c61(i4, wlaVar, z39Var, ct8Var)), av8Var2, 196992, 27648, 8154);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i2, 12, z39Var, wlaVar, ct8Var, xtcVar);
        }
    }

    public static final void i(il6 il6Var, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1313605449);
        int i3 = i2 | (av8Var2.g(il6Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc A = wnn.A(qx9.p(bkh.d(xtcVar, 1.0f), 1.7777778f), o7g.a(12.0f));
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new h84(19, function1, il6Var);
                av8Var2.n0(O);
            }
            un0.a(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var2, 31), o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var2), av8Var2, 0), rd0.u(2.0f, 62), null, yqo.H(1718125481, av8Var2, new hl6(i4, (Object) il6Var, (Object) function12)), av8Var2, 196608, 16);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 15, il6Var, function1, function12, xtcVar);
        }
    }

    public static final void j(FantasyPlayerUiModel fantasyPlayerUiModel, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        fantasyPlayerUiModel.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1007493473);
        int i3 = (av8Var.g(fantasyPlayerUiModel) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtcVar2 = xtcVar;
            un0.a(xtcVar2, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(2060956975, av8Var, new qm4(19, fantasyPlayerUiModel, (Context) av8Var.k(nz.b))), av8Var, ((i3 >> 3) & 14) | 196608, 24);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(fantasyPlayerUiModel, xtcVar2, i2, 12);
        }
    }

    public static final void k(FantasyTransferPlayers fantasyTransferPlayers, final int i2, FantasyCompetitionType fantasyCompetitionType, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        final int i4;
        xtc xtcVar2;
        f50 f50Var;
        ff3 ff3Var;
        ry ryVar;
        String str;
        a99 a99Var;
        Context context;
        zg3 zg3Var;
        boolean z2;
        String str2;
        fantasyTransferPlayers.getClass();
        fantasyCompetitionType.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1860985296);
        int i5 = (av8Var.g(fantasyTransferPlayers) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i5 |= av8Var.e(fantasyCompetitionType.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i5 | (av8Var.h(z) ? a.o : 1024) | 24576;
        if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            final Context context2 = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            long D = lz.D(R.color.surface_2, av8Var);
            n7g a2 = o7g.a(32.0f);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(utcVar, D, a2), 8.0f);
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a3, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            av8Var.d0(808438538);
            final FantasyTransferPlayer fantasyTransferPlayer = fantasyTransferPlayers.b;
            av8Var.d0(808438374);
            o80 o80Var = new o80();
            if (z) {
                o80Var.d(fantasyTransferPlayer.e + " · ");
            }
            int[] iArr = wm7.a;
            int i7 = iArr[fantasyCompetitionType.ordinal()];
            String str3 = null;
            if (i7 == 1) {
                f50Var = f50Var3;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                av8Var.d0(933850903);
                av8Var.s(false);
                float f2 = fantasyTransferPlayer.f;
                context2.getClass();
                Locale d2 = dla.d();
                Set set = o84.a;
                o80Var.d(String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context2), Float.valueOf(f2)}, 2)));
                Unit unit = Unit.a;
            } else {
                if (i7 != 2) {
                    throw dmi.h(av8Var, 445764111, false);
                }
                av8Var.d0(934018520);
                int g2 = o80Var.g(new pwh(lz.D(R.color.error, av8Var), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                try {
                    Float f3 = fantasyTransferPlayer.h;
                    if (f3 != null) {
                        float floatValue = f3.floatValue();
                        context2.getClass();
                        f50Var = f50Var3;
                        ff3Var = ff3Var2;
                        ryVar = ryVar2;
                        str2 = String.format(dla.d(), "%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(floatValue), context2.getString(R.string.fantasy_expected_fantasy_points_short)}, 2));
                    } else {
                        f50Var = f50Var3;
                        ff3Var = ff3Var2;
                        ryVar = ryVar2;
                        str2 = null;
                    }
                    o80Var.c(str2);
                    Unit unit2 = Unit.a;
                    o80Var.f(g2);
                    av8Var.s(false);
                } finally {
                }
            }
            q80 h2 = o80Var.h();
            av8Var.s(false);
            p8g p8gVar = p8g.a;
            xtc a4 = p8gVar.a(1.0f, utcVar, true);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, a4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var2);
            ff3 ff3Var3 = ff3Var;
            waa.K(av8Var, m3, ff3Var3);
            ry ryVar3 = ryVar;
            f50 f50Var5 = f50Var;
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar3);
            waa.K(av8Var, C2, f50Var4);
            int i8 = fantasyTransferPlayer.c;
            int i9 = fantasyTransferPlayer.d;
            String str4 = fantasyTransferPlayer.g.b;
            xtc l2 = bkh.l(utcVar, 40.0f);
            int i10 = i6 & 112;
            boolean i11 = av8Var.i(context2) | av8Var.g(fantasyTransferPlayer) | (i10 == 32);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (i11 || O == a99Var2) {
                str = str4;
                a99Var = a99Var2;
                final int i12 = 0;
                O = new Function0() { // from class: um7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i13 = i12;
                        int i14 = i2;
                        FantasyTransferPlayer fantasyTransferPlayer2 = fantasyTransferPlayer;
                        switch (i13) {
                            case 0:
                                Context context3 = context2;
                                nv.A(context3, "open_player", null);
                                int i15 = PlayerActivity.Z;
                                jle.q(context3, fantasyTransferPlayer2.b, 0, null, null, false, Integer.valueOf(i14), null, 444);
                                break;
                            default:
                                int i16 = PlayerActivity.Z;
                                jle.q(context2, fantasyTransferPlayer2.b, 0, null, null, false, Integer.valueOf(i14), null, 444);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            } else {
                str = str4;
                a99Var = a99Var2;
            }
            int i13 = ((i6 >> 3) & 896) | 3072;
            wnn.l(i8, i9, z, l2, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (Function0) O, av8Var, i13, 96);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            xtc a6 = p8gVar.a(1.0f, utcVar, true);
            p4h p4hVar = ww9.d;
            u23 a7 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, a6);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a7, f50Var2);
            waa.K(av8Var, m4, ff3Var3);
            bf3.s(hashCode3, av8Var, f50Var5, av8Var, ryVar3);
            waa.K(av8Var, C3, f50Var4);
            String str5 = fantasyTransferPlayer.a;
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            a99 a99Var3 = a99Var;
            udj.c(str5, null, D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            udj.d(h2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.b(), av8Var, 0, 24960, 241658);
            ljg.t(av8Var, true, true, false);
            kq9.a(haa.t(R.drawable.ic_transfer_swap, 0, av8Var), null, bkh.l(l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, 440, 0);
            av8Var.d0(808519261);
            final FantasyTransferPlayer fantasyTransferPlayer2 = fantasyTransferPlayers.a;
            av8Var.d0(808519110);
            o80 o80Var2 = new o80();
            int i14 = iArr[fantasyCompetitionType.ordinal()];
            if (i14 == 1) {
                context = context2;
                av8Var.d0(1076577134);
                av8Var.s(false);
                float f4 = fantasyTransferPlayer2.f;
                context.getClass();
                Locale d3 = dla.d();
                Set set2 = o84.a;
                o80Var2.d(String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(f4)}, 2)));
            } else {
                if (i14 != 2) {
                    throw dmi.h(av8Var, 1558746840, false);
                }
                av8Var.d0(1076744751);
                int g3 = o80Var2.g(new pwh(lz.D(R.color.error, av8Var), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                try {
                    Float f5 = fantasyTransferPlayer2.h;
                    if (f5 != null) {
                        float floatValue2 = f5.floatValue();
                        context2.getClass();
                        context = context2;
                        str3 = String.format(dla.d(), "%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(floatValue2), context.getString(R.string.fantasy_expected_fantasy_points_short)}, 2));
                    } else {
                        context = context2;
                    }
                    o80Var2.c(str3);
                    o80Var2.f(g3);
                    av8Var.s(false);
                } finally {
                }
            }
            if (z) {
                o80Var2.d(" · " + fantasyTransferPlayer2.e);
            }
            q80 h3 = o80Var2.h();
            av8Var.s(false);
            xtc a8 = p8gVar.a(1.0f, utcVar, true);
            l8g a9 = k8g.a(ww9.c, lv1Var, av8Var, 54);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, a8);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a9, f50Var2);
            waa.K(av8Var, m5, ff3Var3);
            bf3.s(hashCode4, av8Var, f50Var5, av8Var, ryVar3);
            waa.K(av8Var, C4, f50Var4);
            kv1 kv1Var = uxf.q;
            xtc a10 = p8gVar.a(1.0f, utcVar, true);
            u23 a11 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C5 = fqj.C(av8Var, a10);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a11, f50Var2);
            waa.K(av8Var, m6, ff3Var3);
            bf3.s(hashCode5, av8Var, f50Var5, av8Var, ryVar3);
            waa.K(av8Var, C5, f50Var4);
            final Context context3 = context;
            udj.c(fantasyTransferPlayer2.a, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            udj.d(h3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.b(), av8Var, 0, 24960, 241658);
            av8Var = av8Var;
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            int i15 = fantasyTransferPlayer2.c;
            int i16 = fantasyTransferPlayer2.d;
            String str6 = fantasyTransferPlayer2.g.b;
            xtc l3 = bkh.l(utcVar, 40.0f);
            boolean i17 = av8Var.i(context3) | av8Var.g(fantasyTransferPlayer2) | (i10 == 32);
            Object O2 = av8Var.O();
            if (i17 || O2 == a99Var3) {
                i4 = i2;
                z2 = true;
                final char c2 = 1 == true ? 1 : 0;
                O2 = new Function0() { // from class: um7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i132 = c2;
                        int i142 = i4;
                        FantasyTransferPlayer fantasyTransferPlayer22 = fantasyTransferPlayer2;
                        switch (i132) {
                            case 0:
                                Context context32 = context3;
                                nv.A(context32, "open_player", null);
                                int i152 = PlayerActivity.Z;
                                jle.q(context32, fantasyTransferPlayer22.b, 0, null, null, false, Integer.valueOf(i142), null, 444);
                                break;
                            default:
                                int i162 = PlayerActivity.Z;
                                jle.q(context3, fantasyTransferPlayer22.b, 0, null, null, false, Integer.valueOf(i142), null, 444);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            } else {
                i4 = i2;
                z2 = true;
            }
            wnn.l(i15, i16, z, l3, str6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (Function0) O2, av8Var, i13, 96);
            ljg.t(av8Var, z2, false, z2);
            xtcVar2 = utcVar;
        } else {
            i4 = i2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vm7(fantasyTransferPlayers, i4, fantasyCompetitionType, z, xtcVar2, i3);
        }
    }

    public static final void l(final c9b c9bVar, final r8b r8bVar, final bnf bnfVar, final boolean z, final Function1 function1, final Function0 function0, final xtc xtcVar, final boolean z2, of3 of3Var, final int i2) {
        c9bVar.getClass();
        r8bVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-388110632);
        int i3 = i2 | (av8Var.g(c9bVar) ? 4 : 2) | (av8Var.e(r8bVar.ordinal()) ? 32 : 16) | (av8Var.e(bnfVar == null ? -1 : bnfVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String str = c9bVar.o;
            if (str == null) {
                av8Var.d0(-2086307216);
                av8Var.s(false);
            } else {
                av8Var.d0(-2086307215);
                rha.b(str, null, 0L, av8Var, 0, 6);
                av8Var.s(false);
            }
            int i4 = i3 << 21;
            int i5 = 24576 | (i4 & 234881024) | (i4 & 1879048192);
            int i6 = 48 | ((i3 >> 3) & 57344);
            u6h.m(c9bVar.a, c9bVar.c, c9bVar.r, c9bVar.q, z, c9bVar.i, c9bVar.m, c9bVar.g, r8bVar, bnfVar, null, z2, c9bVar.t, c9bVar.p, function0, av8Var, i5, i6);
            tol.b(dh3.n.a(ema.a), yqo.H(320805474, av8Var, new t51(c9bVar, r8bVar, bnfVar, z, z2, function1)), av8Var, 56);
            u6h.m(c9bVar.b, c9bVar.d, c9bVar.s, c9bVar.q, z, c9bVar.j, c9bVar.n, c9bVar.h, r8bVar, bnfVar, null, z2, c9bVar.t, c9bVar.p, function0, av8Var, i5, i6);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(r8bVar, bnfVar, z, function1, function0, xtcVar, z2, i2) { // from class: vj8
                public final /* synthetic */ r8b b;
                public final /* synthetic */ bnf c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ xtc g;
                public final /* synthetic */ boolean h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(12585985);
                    v9g.l(c9b.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(c9b c9bVar, r8b r8bVar, bnf bnfVar, boolean z, xtc xtcVar, boolean z2, Function1 function1, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(470944941);
        int i3 = i2 | (av8Var.g(c9bVar) ? 4 : 2) | (av8Var.e(r8bVar.ordinal()) ? 32 : 16) | (av8Var.e(bnfVar == null ? -1 : bnfVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | 24576 | (av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            gv9 gv9Var = c9bVar.k;
            gv9 gv9Var2 = c9bVar.l;
            utc utcVar = utc.a;
            if (gv9Var == null || gv9Var2 == null) {
                av8Var.d0(-1735896971);
                av8Var.s(false);
            } else {
                av8Var.d0(-1737023263);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
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
                int i4 = i3 << 3;
                n(c9bVar.e, c9bVar.k, r8bVar, bnfVar, z, l98.f0(bkh.e(utcVar, 422.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), z2, function1, av8Var, (29360128 & i4) | (i4 & 896) | 196608 | (i4 & 7168) | (57344 & i4) | (3670016 & i4));
                n(c9bVar.f, c9bVar.l, r8bVar, bnfVar, z, l98.f0(bkh.e(utcVar, 422.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gv9Var2.size() < 5 ? 24.0f : 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), z2, function1, av8Var, i4 & 33095552);
                av8Var.s(true);
                av8Var.s(false);
            }
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ri4(c9bVar, r8bVar, bnfVar, z, xtcVar2, z2, function1, i2);
        }
    }

    public static final void n(gv9 gv9Var, gv9 gv9Var2, r8b r8bVar, bnf bnfVar, boolean z, xtc xtcVar, boolean z2, Function1 function1, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-29752698);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(gv9Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.e(r8bVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.e(bnfVar == null ? -1 : bnfVar.ordinal()) ? a.o : 1024;
        }
        boolean z3 = z;
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        boolean z4 = z2;
        if ((1572864 & i2) == 0) {
            i3 |= av8Var2.h(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        Function1 function12 = function1;
        if ((12582912 & i2) == 0) {
            i3 |= av8Var2.i(function12) ? 8388608 : 4194304;
        }
        if (av8Var2.T(i3 & 1, (4793491 & i3) != 4793490)) {
            int i4 = ((Configuration) av8Var2.k(nz.a)).screenWidthDp - 16;
            u23 a2 = t23.a(ww9.h, uxf.o, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
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
            Iterator p = ljg.p(av8Var2, C, hf3.d, 1633394065, gv9Var2);
            int i5 = 0;
            while (p.hasNext()) {
                int intValue = ((Number) p.next()).intValue();
                int min = Math.min(i4 / intValue, 112);
                xtc d2 = bkh.d(utc.a, 1.0f);
                int i6 = i3;
                l8g a3 = k8g.a(ww9.g, uxf.l, av8Var2, 6);
                int i7 = i4;
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, d2);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a3, hf3.g);
                waa.K(av8Var2, m3, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C2, hf3.d);
                av8Var2.d0(489865363);
                int i8 = 0;
                while (i8 < intValue) {
                    av8 av8Var3 = av8Var2;
                    int i9 = intValue;
                    int i10 = min;
                    b9b.c((n8b) gv9Var.get(i5), i10, r8bVar, bnfVar, z3, null, z4, function12, av8Var3, i6 & 33095552);
                    min = i10;
                    i8++;
                    intValue = i9;
                    av8Var2 = av8Var3;
                    z3 = z;
                    z4 = z2;
                    function12 = function1;
                    i5++;
                }
                av8 av8Var4 = av8Var2;
                av8Var4.s(false);
                av8Var4.s(true);
                z3 = z;
                z4 = z2;
                function12 = function1;
                i3 = i6;
                i4 = i7;
            }
            av8Var = av8Var2;
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ft3(gv9Var, gv9Var2, r8bVar, bnfVar, z, xtcVar, z2, function1, i2);
        }
    }

    public static final void o(long j2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1325191130);
        int i3 = i2 | (av8Var.f(j2) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            String E = E(j2, av8Var);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 8.0f, 8.0f, 8.0f, 4.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
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
            kq9.b(s6a.N(R.drawable.ic_half_time, 6, av8Var), null, bkh.l(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f), lz.D(R.color.live, av8Var), av8Var, 432, 0);
            xtc b0 = l98.b0(n9e.q(new goa(1.0f, true), lz.D(R.color.surface_1, av8Var), o7g.a(12.0f)), 8.0f);
            yf8 yf8Var = xth.a;
            udj.c(E, b0, lz.D(R.color.live, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wz(i2, 2, j2, xtcVar2);
        }
    }

    public static final void p(long j2, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1487724861);
        int i3 = i2 | (av8Var2.f(j2) ? 4 : 2) | 48;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            String E = E(j2, av8Var2);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 16.0f, 16.0f, 8.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, e0);
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
            yf8 yf8Var = xth.a;
            udj.c(E, l98.d0(n9e.q(utcVar, lz.D(R.color.surface_2, av8Var2), o7g.a(12.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130040);
            av8Var = av8Var2;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wz(i2, 3, j2, xtcVar2);
        }
    }

    public static final void q(mm0 mm0Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(980484508);
        int i3 = (av8Var.g(mm0Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
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
            kq9.b(s6a.N(mm0Var.a, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            String a3 = mm0Var.b.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(mm0Var, xtcVar2, i2, 4);
        }
    }

    public static final void r(gv9 gv9Var, Integer num, Long l2, Function1 function1, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        Function1 function12;
        xtc xtcVar2;
        cdi M;
        boolean z;
        Pair pair;
        f50 f50Var;
        mte mteVar;
        kv1 kv1Var;
        p4h p4hVar;
        float f2;
        lv1 lv1Var;
        wxf wxfVar;
        ry ryVar;
        f50 f50Var2;
        zg3 zg3Var;
        f50 f50Var3;
        ff3 ff3Var;
        boolean z2;
        jf9 jf9Var;
        mte mteVar2;
        f50 f50Var4;
        ry ryVar2;
        int i3;
        p4h p4hVar2;
        boolean z3;
        jf9 jf9Var2 = oyn.e;
        kv1 kv1Var2 = uxf.o;
        p4h p4hVar3 = ww9.d;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1178600241);
        int i4 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.g(l2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? 16384 : 8192) | 196608;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 74899) != 74898)) {
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            int i6 = 14;
            Object obj = nf3.a;
            if (O == obj) {
                O = new qt5(i6);
                av8Var.n0(O);
            }
            znh znhVar = (znh) o3a.N(objArr, (Function0) O, av8Var, 48);
            if (l2 == null) {
                av8Var.d0(322475150);
                av8Var.s(false);
                M = null;
            } else {
                av8Var.d0(322475151);
                M = hda.M(l2.longValue(), av8Var, 0);
                av8Var.s(false);
            }
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = goh.b(new m56(M, i5));
                av8Var.n0(O2);
            }
            cdi cdiVar = (cdi) O2;
            g28 g28Var = bkh.c;
            u23 a2 = t23.a(p4hVar3, kv1Var2, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var5 = hf3.g;
            waa.K(av8Var, a2, f50Var5);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var6 = hf3.j;
            waa.K(av8Var, valueOf, f50Var6);
            ry ryVar3 = hf3.k;
            waa.J(av8Var, ryVar3);
            f50 f50Var7 = hf3.d;
            jf9 jf9Var3 = jf9Var2;
            xtc u0 = hkg.u0(ljg.g(av8Var, C, f50Var7, 1.0f, true), hkg.o0(av8Var), false, 14);
            u23 a3 = t23.a(p4hVar3, kv1Var2, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var5);
            waa.K(av8Var, m3, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var6, av8Var, ryVar3);
            Iterator p = ljg.p(av8Var, C2, f50Var7, -1272709361, gv9Var);
            int i7 = 0;
            while (true) {
                boolean hasNext = p.hasNext();
                utc utcVar = utc.a;
                if (hasNext) {
                    Object next = p.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        b.q();
                        throw null;
                    }
                    mte mteVar3 = (mte) next;
                    boolean z4 = num != null && num.intValue() == mteVar3.a;
                    boolean z5 = znhVar.h() == mteVar3.a;
                    if (z4) {
                        av8Var.d0(-1587757058);
                        pair = new Pair(new r13(lz.D(R.color.surface_2, av8Var)), new r13(r13.i));
                        av8Var.s(false);
                    } else if (z5) {
                        av8Var.d0(-1587655564);
                        pair = new Pair(new r13(lz.D(R.color.primary_highlight, av8Var)), new r13(lz.D(R.color.primary_default, av8Var)));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1587566470);
                        av8Var.s(false);
                        long j2 = r13.i;
                        pair = new Pair(new r13(j2), new r13(j2));
                    }
                    xtc A = wnn.A(yso.o(n9e.q(l98.c0(bkh.d(utcVar, 1.0f), 8.0f, 4.0f), ((r13) pair.a).a, o7g.a(8.0f)), 1.0f, ((r13) pair.b).a, o7g.a(8.0f)), o7g.a(8.0f));
                    boolean z6 = num == null;
                    long D = lz.D(R.color.n_lv_4, av8Var);
                    Object O3 = av8Var.O();
                    if (O3 == obj) {
                        O3 = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) O3;
                    Object[] objArr2 = new Object[0];
                    Object O4 = av8Var.O();
                    if (O4 == obj) {
                        O4 = b74.w;
                        av8Var.n0(O4);
                    }
                    Iterator it = p;
                    av8 av8Var2 = av8Var;
                    gi giVar = new gi(9, (boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), mteVar3, znhVar);
                    Object obj2 = obj;
                    znh znhVar2 = znhVar;
                    av8 av8Var3 = av8Var2;
                    xtc b0 = l98.b0(tol.y(A, z6, true, true, D, wzcVar, giVar, av8Var2, 0), 8.0f);
                    lv1 lv1Var2 = uxf.m;
                    wxf wxfVar2 = ww9.b;
                    l8g a4 = k8g.a(wxfVar2, lv1Var2, av8Var3, 48);
                    int hashCode3 = Long.hashCode(av8Var3.T);
                    aee m4 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, b0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var3);
                    } else {
                        av8Var3.q0();
                    }
                    f50 f50Var8 = hf3.g;
                    waa.K(av8Var3, a4, f50Var8);
                    ff3 ff3Var3 = hf3.f;
                    waa.K(av8Var3, m4, ff3Var3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    f50 f50Var9 = hf3.j;
                    waa.K(av8Var3, valueOf2, f50Var9);
                    ry ryVar4 = hf3.k;
                    waa.J(av8Var3, ryVar4);
                    f50 f50Var10 = hf3.d;
                    waa.K(av8Var3, C3, f50Var10);
                    if (num != null) {
                        av8Var3.d0(-1852601887);
                        String e2 = yid.e(3, null, Integer.valueOf(i8));
                        long D2 = lz.D(R.color.n_lv_1, av8Var3);
                        yf8 yf8Var = xth.a;
                        lv1Var = lv1Var2;
                        f2 = 8.0f;
                        p4hVar = p4hVar3;
                        ff3Var = ff3Var3;
                        f50Var = f50Var10;
                        kv1Var = kv1Var2;
                        ryVar = ryVar4;
                        zg3Var = zg3Var3;
                        wxfVar = wxfVar2;
                        f50Var3 = f50Var8;
                        mteVar = mteVar3;
                        f50Var2 = f50Var9;
                        q5a.w(e2, bkh.p(utcVar, 16.0f), D2, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.e(), av8Var3, 48, 0, 130040);
                        av8Var3 = av8Var3;
                        z2 = false;
                        av8Var3.s(false);
                    } else {
                        f50Var = f50Var10;
                        mteVar = mteVar3;
                        kv1Var = kv1Var2;
                        p4hVar = p4hVar3;
                        f2 = 8.0f;
                        lv1Var = lv1Var2;
                        wxfVar = wxfVar2;
                        ryVar = ryVar4;
                        f50Var2 = f50Var9;
                        zg3Var = zg3Var3;
                        f50Var3 = f50Var8;
                        ff3Var = ff3Var3;
                        z2 = false;
                        av8Var3.d0(-1852261972);
                        av8Var3.s(false);
                    }
                    nq8.h(av8Var3, bkh.p(utcVar, 2.0f));
                    k1c c2 = e12.c(uxf.c, z2);
                    int hashCode4 = Long.hashCode(av8Var3.T);
                    aee m5 = av8Var3.m();
                    xtc C4 = fqj.C(av8Var3, utcVar);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c2, f50Var3);
                    waa.K(av8Var3, m5, ff3Var);
                    bf3.s(hashCode4, av8Var3, f50Var2, av8Var3, ryVar);
                    f50 f50Var11 = f50Var;
                    waa.K(av8Var3, C4, f50Var11);
                    mte mteVar4 = mteVar;
                    td4.C(mteVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 48, 12);
                    Double d2 = mteVar4.c;
                    if (d2 == null) {
                        av8Var3.d0(2037509146);
                        av8Var3.s(false);
                        mteVar2 = mteVar4;
                        f50Var4 = f50Var11;
                        jf9Var = jf9Var3;
                        ryVar2 = ryVar;
                        i3 = 0;
                    } else {
                        av8Var3.d0(2037509147);
                        double doubleValue = d2.doubleValue();
                        String valueOf3 = doubleValue > 9.999d ? "10" : String.valueOf(yid.c("%.1f", Double.valueOf(doubleValue)));
                        xtc q = n9e.q(bkh.l(n12.a.a(utcVar, uxf.k), 16.0f), kpg.x(doubleValue, av8Var3), jf9Var3);
                        yf8 yf8Var2 = xth.a;
                        av8 av8Var4 = av8Var3;
                        jf9Var = jf9Var3;
                        mteVar2 = mteVar4;
                        f50Var4 = f50Var11;
                        ryVar2 = ryVar;
                        i3 = 0;
                        q5a.w(valueOf3, q, lz.D(R.color.on_color_primary, av8Var3), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.n(), av8Var4, 0, 0, 130040);
                        av8Var3 = av8Var4;
                        Unit unit = Unit.a;
                        av8Var3.s(false);
                    }
                    av8Var3.s(true);
                    nq8.h(av8Var3, bkh.p(utcVar, 16.0f));
                    goa goaVar = new goa(1.0f, true);
                    kv1 kv1Var3 = kv1Var;
                    p4h p4hVar4 = p4hVar;
                    u23 a5 = t23.a(p4hVar4, kv1Var3, av8Var3, i3);
                    int hashCode5 = Long.hashCode(av8Var3.T);
                    aee m6 = av8Var3.m();
                    xtc C5 = fqj.C(av8Var3, goaVar);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a5, f50Var3);
                    waa.K(av8Var3, m6, ff3Var);
                    ry ryVar5 = ryVar2;
                    bf3.s(hashCode5, av8Var3, f50Var2, av8Var3, ryVar5);
                    f50 f50Var12 = f50Var4;
                    waa.K(av8Var3, C5, f50Var12);
                    mte mteVar5 = mteVar2;
                    String str = mteVar5.b;
                    long D3 = lz.D(R.color.n_lv_1, av8Var3);
                    yf8 yf8Var3 = xth.a;
                    av8 av8Var5 = av8Var3;
                    udj.c(str, null, D3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var5, 0, 24960, 110586);
                    nq8.h(av8Var5, bkh.e(utcVar, 4.0f));
                    l8g a6 = k8g.a(wxfVar, lv1Var, av8Var5, 48);
                    int hashCode6 = Long.hashCode(av8Var5.T);
                    aee m7 = av8Var5.m();
                    xtc C6 = fqj.C(av8Var5, utcVar);
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a6, f50Var3);
                    waa.K(av8Var5, m7, ff3Var);
                    bf3.s(hashCode6, av8Var5, f50Var2, av8Var5, ryVar5);
                    waa.K(av8Var5, C6, f50Var12);
                    td4.G(mteVar5.f, bkh.l(utcVar, 16.0f), false, 0L, av8Var5, 48, 12);
                    nq8.h(av8Var5, bkh.p(utcVar, 4.0f));
                    f50 f50Var13 = f50Var2;
                    udj.c(mteVar5.g, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var5, 0, 24960, 110586);
                    av8Var = av8Var5;
                    if (mteVar5.i == null) {
                        av8Var.d0(777728140);
                        av8Var.s(false);
                    } else {
                        ljg.r(4.0f, 777728141, av8Var, av8Var, utcVar);
                        udj.c(mteVar5.i, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                        av8Var = av8Var;
                        Unit unit2 = Unit.a;
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    av8Var.s(true);
                    if (num != null) {
                        av8Var.d0(-1849289072);
                        if (z4) {
                            av8Var.d0(-1849249268);
                            av8 av8Var6 = av8Var;
                            c5n.a(16.0f, 390, 26, 0L, 0L, av8Var6, l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10));
                            av8Var = av8Var6;
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-1849038964);
                            av8Var.s(false);
                        }
                        u23 a7 = t23.a(p4hVar4, uxf.q, av8Var, 48);
                        int hashCode7 = Long.hashCode(av8Var.T);
                        aee m8 = av8Var.m();
                        xtc C7 = fqj.C(av8Var, utcVar);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a7, f50Var3);
                        waa.K(av8Var, m8, ff3Var);
                        bf3.s(hashCode7, av8Var, f50Var13, av8Var, ryVar5);
                        waa.K(av8Var, C7, f50Var12);
                        Double d3 = mteVar5.d;
                        double doubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
                        av8 av8Var7 = av8Var;
                        p4hVar2 = p4hVar4;
                        udj.c(yid.q((float) doubleValue2, 1), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var7, 0, 0, 131066);
                        av8Var = av8Var7;
                        Integer num2 = mteVar5.e;
                        if (num2 == null || num2.intValue() <= 0) {
                            num2 = null;
                        }
                        if (num2 == null) {
                            av8Var.d0(279529787);
                            z3 = false;
                            av8Var.s(false);
                        } else {
                            av8Var.d0(279529788);
                            udj.c(uxf.E(num2.intValue(), 62, false), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
                            av8Var = av8Var;
                            Unit unit3 = Unit.a;
                            z3 = false;
                            av8Var.s(false);
                        }
                        av8Var.s(true);
                        av8Var.s(z3);
                    } else {
                        float f3 = f2;
                        p4hVar2 = p4hVar4;
                        if (z5) {
                            av8Var.d0(-1848119597);
                            kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                            av8Var.s(false);
                        } else {
                            ljg.r(16.0f, -1847696385, av8Var, av8Var, utcVar);
                            av8Var.s(false);
                        }
                    }
                    av8Var.s(true);
                    znhVar = znhVar2;
                    p4hVar3 = p4hVar2;
                    i7 = i8;
                    p = it;
                    obj = obj2;
                    jf9Var3 = jf9Var;
                    kv1Var2 = kv1Var3;
                } else {
                    kv1 kv1Var4 = kv1Var2;
                    p4h p4hVar5 = p4hVar3;
                    znh znhVar3 = znhVar;
                    Object obj3 = obj;
                    jf9 jf9Var4 = jf9Var3;
                    av8Var.s(false);
                    av8Var.s(true);
                    if (num == null) {
                        av8Var.d0(-1904098202);
                        xtc b02 = l98.b0(n9e.q(d2a.E(utcVar, 4.0f, null, false, 0L, 30), lz.D(R.color.surface_1, av8Var), jf9Var4), 16.0f);
                        u23 a8 = t23.a(p4hVar5, kv1Var4, av8Var, 0);
                        int hashCode8 = Long.hashCode(av8Var.T);
                        aee m9 = av8Var.m();
                        xtc C8 = fqj.C(av8Var, b02);
                        if3.k7.getClass();
                        zg3 zg3Var4 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var4);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a8, hf3.g);
                        waa.K(av8Var, m9, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode8), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C8, hf3.d);
                        String v = oea.v(R.string.vote, av8Var);
                        xtc d4 = bkh.d(utcVar, 1.0f);
                        boolean z7 = znhVar3.h() != -1 && ((Boolean) cdiVar.getValue()).booleanValue();
                        boolean g2 = ((i4 & 14) == 4) | av8Var.g(znhVar3);
                        Object O5 = av8Var.O();
                        if (g2 || O5 == obj3) {
                            function12 = function1;
                            O5 = new n56(gv9Var, function12, znhVar3);
                            av8Var.n0(O5);
                        } else {
                            function12 = function1;
                        }
                        av8 av8Var8 = av8Var;
                        mha.h(v, (Function0) O5, d4, null, null, z7, false, false, 0L, 0, 0, av8Var8, 384, 0, 2008);
                        mha.h(bf3.g(8.0f, R.string.close, av8Var8, av8Var8, utcVar), function0, bkh.d(utcVar, 1.0f), gqh.a, null, false, false, false, 0L, 0, 0, av8Var8, ((i4 >> 9) & 112) | 3456, 0, 2032);
                        av8Var = av8Var8;
                        z = true;
                        av8Var.s(true);
                        av8Var.s(false);
                    } else {
                        z = true;
                        function12 = function1;
                        av8Var.d0(-1903266937);
                        av8Var.s(false);
                    }
                    av8Var.s(z);
                    xtcVar2 = utcVar;
                }
            }
        } else {
            function12 = function1;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44((Object) gv9Var, (Object) num, (Object) l2, function12, function0, xtcVar2, i2, 2);
        }
    }

    public static final void s(String str, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(106095297);
        int i3 = 4;
        int i4 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 3072;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            long u = ((kx4) av8Var.k(dh3.h)).u(16.0f);
            av8Var.d0(-1121624979);
            o80 o80Var = new o80();
            o80Var.d(oea.w(R.string.confirm_vote_body, new Object[]{str}, av8Var));
            o80Var.d(" ");
            n80 n80Var = new n80(new ohi("potmBadge"), o80Var.a.length(), i5, i3);
            ArrayList arrayList = o80Var.b;
            arrayList.add(n80Var);
            o80Var.c.add(n80Var);
            arrayList.size();
            o80Var.d("[badge]");
            o80Var.e();
            q80 h2 = o80Var.h();
            av8Var.s(false);
            boolean f2 = av8Var.f(u);
            Object O = av8Var.O();
            if (f2 || O == nf3.a) {
                O = sub.d(new Pair("potmBadge", new x3a(new the(u, u), new tc3(-1043462434, new ud3(24), true))));
                av8Var.n0(O);
            }
            Map map = (Map) O;
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(wnn.A(l98.b0(utcVar, 16.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String v = oea.v(R.string.confirm_vote_title, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            udj.d(h2, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, map, null, xth.f(), av8Var, 48, 0, 196600);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            lv1 lv1Var = uxf.m;
            uxf uxfVar = ww9.c;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(uxfVar, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
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
            String v2 = oea.v(R.string.button_go_back, av8Var);
            dph dphVar = dph.a;
            aph aphVar = aph.a;
            yfa.e(v2, function02, null, dphVar, aphVar, null, false, false, 0L, av8Var, 27696, 996);
            yfa.e(fc6.f(16.0f, R.string.confirm_button, av8Var, av8Var, utcVar), function0, null, eph.a, aphVar, null, false, false, 0L, av8Var, (i4 & 112) | 27648, 996);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ace(i2, 13, str, function0, function02, xtcVar2);
        }
    }

    public static final void t(String str, String str2, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1317086940);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
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
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 109562);
            udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.j(), av8Var2, (i3 >> 3) & 14, 24960, 109562);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar, i2, 3);
        }
    }

    public static final xtc u(xtc xtcVar, Function2 function2) {
        return xtcVar.z(new oh(function2));
    }

    public static final void v(fk4 fk4Var, Function1[] function1Arr, Function1 function1) {
        fk4Var.getClass();
        if (!(fk4Var instanceof e3)) {
            a70.r("impossible");
            return;
        }
        e3 e3Var = (e3) fk4Var;
        Function1[] function1Arr2 = (Function1[]) Arrays.copyOf(function1Arr, function1Arr.length);
        i5k.e(1, function1);
        Function1 function12 = function1;
        ArrayList arrayList = new ArrayList(function1Arr2.length);
        for (Function1 function13 : function1Arr2) {
            e3 l2 = e3Var.l();
            function13.invoke(l2);
            arrayList.add(new oh3(l2.e().a));
        }
        e3 l3 = e3Var.l();
        function12.invoke(l3);
        e3Var.e().a(new dp(new oh3(l3.e().a), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gof, t01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [vu8] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List w(mlh mlhVar, Integer num, int i2, Integer num2) {
        int i3;
        int r;
        l0d l0dVar;
        if (mlhVar.w || mlhVar.o() == 0) {
            return km5.a;
        }
        ?? gofVar = new gof(mlhVar);
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = mlhVar.v;
            if (i3 < 0) {
                i3 = mlhVar.F(i2, mlhVar.b);
            }
        }
        if (num == 0) {
            int O = mlhVar.i - mlhVar.O(mlhVar.q(i2), mlhVar.b);
            uzc uzcVar = mlhVar.s;
            num = Integer.valueOf(O + ((uzcVar == null || (l0dVar = (l0d) uzcVar.b(i2)) == null) ? 0 : l0dVar.b));
        }
        int q = mlhVar.q(i2) * 5;
        int[] iArr = mlhVar.b;
        if (q < iArr.length) {
            r = mlhVar.r(i2);
        } else {
            int F = i3 >= 0 ? mlhVar.F(i3, iArr) : i3;
            r = mlhVar.r(i3);
            int i4 = i3;
            i3 = F;
            i2 = i4;
        }
        while (i2 >= 0) {
            gofVar.E(r, (mlhVar.b[(mlhVar.q(i2) * 5) + 1] & 536870912) != 0 ? mlhVar.s(i2) : nf3.a, mlhVar.P(i2), num);
            num = mlhVar.b(i2);
            if (i3 >= 0) {
                int F2 = mlhVar.F(i3, mlhVar.b);
                r = mlhVar.r(i3);
                int i5 = i3;
                i3 = F2;
                i2 = i5;
            } else {
                i2 = i3;
            }
        }
        return (ArrayList) gofVar.b;
    }

    public static final void x(fk4 fk4Var, char c2) {
        fk4Var.getClass();
        fk4Var.b(String.valueOf(c2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d1 -> B:12:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(db2 db2Var, FileChannel fileChannel, long j2, sq3 sq3Var) {
        pb2 pb2Var;
        int i2;
        esf esfVar;
        Function1 pz1Var;
        long j3;
        Throwable b2;
        db2 db2Var2;
        long j4;
        if (sq3Var instanceof pb2) {
            pb2Var = (pb2) sq3Var;
            int i3 = pb2Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pb2Var.x = i3 - Integer.MIN_VALUE;
                pb2 pb2Var2 = pb2Var;
                Object obj = pb2Var2.w;
                lu3 lu3Var = lu3.a;
                i2 = pb2Var2.x;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (j2 < 0) {
                        ogj.h(vxd.l(j2, "Limit shouldn't be negative: "));
                        return null;
                    }
                    if (db2Var.h()) {
                        Throwable b3 = db2Var.b();
                        if (b3 == null) {
                            return new Long(0L);
                        }
                        throw b3;
                    }
                    esfVar = new esf();
                    pz1Var = new pz1(j2, esfVar, fileChannel, 1);
                    j3 = j2;
                    if (esfVar.a < j3) {
                    }
                    b2 = db2Var.b();
                    if (b2 != null) {
                    }
                } else if (i2 == 1) {
                    j4 = pb2Var2.v;
                    db2 db2Var3 = pb2Var2.u;
                    pz1Var = pb2Var2.t;
                    esfVar = pb2Var2.s;
                    db2Var2 = pb2Var2.r;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        StringBuilder sb = new StringBuilder("Not enough bytes available: required 0 but ");
                        db2Var3.getClass();
                        w52 f2 = db2Var3.f();
                        f2.getClass();
                        throw new EOFException(fc6.h((int) f2.c, " available", sb));
                    }
                    u6h.P(db2Var3.f(), pz1Var);
                    j3 = j4;
                    db2Var = db2Var2;
                    if (esfVar.a < j3) {
                    }
                    b2 = db2Var.b();
                    if (b2 != null) {
                    }
                } else {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = pb2Var2.v;
                    db2 db2Var4 = pb2Var2.u;
                    pz1Var = pb2Var2.t;
                    esfVar = pb2Var2.s;
                    db2Var2 = pb2Var2.r;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        u6h.P(db2Var4.f(), pz1Var);
                    }
                    j3 = j4;
                    db2Var = db2Var2;
                    if (esfVar.a < j3 || db2Var.h()) {
                        b2 = db2Var.b();
                        if (b2 != null) {
                            return new Long(esfVar.a);
                        }
                        throw b2;
                    }
                    pb2Var2.r = db2Var;
                    pb2Var2.s = esfVar;
                    pb2Var2.t = pz1Var;
                    pb2Var2.u = db2Var;
                    pb2Var2.v = j3;
                    pb2Var2.x = 2;
                    Object g2 = db2Var.g(1, pb2Var2);
                    if (g2 == lu3Var) {
                        return lu3Var;
                    }
                    db2Var2 = db2Var;
                    long j5 = j3;
                    db2Var4 = db2Var2;
                    obj = g2;
                    j4 = j5;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    j3 = j4;
                    db2Var = db2Var2;
                    if (esfVar.a < j3) {
                    }
                    b2 = db2Var.b();
                    if (b2 != null) {
                    }
                }
            }
        }
        pb2Var = new pb2(sq3Var);
        pb2 pb2Var22 = pb2Var;
        Object obj2 = pb2Var22.w;
        lu3 lu3Var2 = lu3.a;
        i2 = pb2Var22.x;
        if (i2 != 0) {
        }
    }

    public static final Rect z(Drawable drawable) {
        return drawable != null ? new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) : new Rect();
    }
}
