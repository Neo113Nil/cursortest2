package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.blaze.blazesdk.widgets.models.OverridableValueRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemBadgeStateStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemTextStyleRemoteDto;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.interactivemedia.v3.internal.zzoo;
import com.google.android.gms.internal.ads.zzagn;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.TennisPowerItem;
import com.sofascore.model.newNetwork.TennisPowerResponse;
import com.sofascore.results.R;
import com.sofascore.results.service.WidgetFavoriteWorker;
import com.unity3d.services.UnityAdsConstants;
import java.net.ProtocolException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class aba implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static long b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static long A(long j, e7a e7aVar, j3h j3hVar) {
        long g2;
        int i = pej.c;
        long a2 = e7aVar.a((int) (j >> 32), true);
        long a3 = pej.d(j) ? a2 : e7aVar.a((int) (j & 4294967295L), true);
        l2l l2lVar = null;
        l2l l2lVar2 = j3hVar != null ? j3hVar.a : null;
        if (pej.d(j)) {
            l2lVar = l2lVar2;
        } else if (j3hVar != null) {
            l2lVar = j3hVar.b;
        }
        if (l2lVar2 != null && !pej.d(a2)) {
            int ordinal = l2lVar2.ordinal();
            if (ordinal == 0) {
                int i2 = (int) (a2 >> 32);
                a2 = t6a.g(i2, i2);
            } else {
                if (ordinal != 1) {
                    zzl.b();
                    return 0L;
                }
                int i3 = (int) (a2 & 4294967295L);
                a2 = t6a.g(i3, i3);
            }
        }
        if (l2lVar != null && !pej.d(a3)) {
            int ordinal2 = l2lVar.ordinal();
            if (ordinal2 == 0) {
                int i4 = (int) (a3 >> 32);
                g2 = t6a.g(i4, i4);
            } else {
                if (ordinal2 != 1) {
                    zzl.b();
                    return 0L;
                }
                int i5 = (int) (a3 & 4294967295L);
                g2 = t6a.g(i5, i5);
            }
            a3 = g2;
        }
        int min = Math.min(pej.g(a2), pej.g(a3));
        int max = Math.max(pej.f(a2), pej.f(a3));
        return pej.h(j) ? t6a.g(max, min) : t6a.g(min, max);
    }

    public static bt3 B(v9e v9eVar, CharSequence charSequence, bt3 bt3Var) {
        String sb;
        charSequence.getClass();
        bt3Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList l = b.l(new o9e(bt3Var, v9eVar, 0));
        while (true) {
            o9e o9eVar = (o9e) o13.E(l);
            if (o9eVar == null) {
                if (arrayList.size() > 1) {
                    n13.u(new wpb(11), arrayList);
                }
                if (arrayList.size() == 1) {
                    sb = "Position " + ((l9e) arrayList.get(0)).a + ": " + ((String) ((l9e) arrayList.get(0)).b.invoke());
                } else {
                    StringBuilder sb2 = new StringBuilder(arrayList.size() * 33);
                    CollectionsKt.e0(arrayList, sb2, ", ", "Errors: ", null, new etd(16), 56);
                    sb = sb2.toString();
                }
                throw new m9e(sb);
            }
            bt3 bt3Var2 = (bt3) ((bt3) o9eVar.a).copy();
            int i = o9eVar.c;
            v9e v9eVar2 = o9eVar.b;
            List list = v9eVar2.a;
            List list2 = v9eVar2.b;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object a2 = ((u9e) v9eVar2.a.get(i2)).a(bt3Var2, charSequence, i);
                    if (a2 instanceof Integer) {
                        i = ((Number) a2).intValue();
                        i2++;
                    } else {
                        if (!(a2 instanceof l9e)) {
                            cp4.g(a2, "Unexpected parse result: ");
                            return null;
                        }
                        arrayList.add((l9e) a2);
                    }
                } else if (!list2.isEmpty()) {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            l.add(new o9e(bt3Var2, (v9e) list2.get(size2), i));
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                } else {
                    if (i == charSequence.length()) {
                        return bt3Var2;
                    }
                    arrayList.add(new l9e(i, jxa.E));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l1c C(g8g g8gVar, int i, int i2, int i3, int i4, int i5, m1c m1cVar, List list, qhe[] qheVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f2;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List list2 = list;
        long j = i5;
        int i17 = i7 - i6;
        int[] iArr2 = new int[i17];
        int i18 = i6;
        int i19 = 0;
        int i20 = 0;
        boolean z2 = false;
        int i21 = 0;
        int i22 = 0;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (i18 < i7) {
            g1c g1cVar = (g1c) list2.get(i18);
            long j2 = j;
            h8g B = yaa.B(g1cVar);
            float E = yaa.E(B);
            if (!z2) {
                c5n c5nVar = B != null ? B.c : null;
                if (!(c5nVar != null ? c5nVar instanceof w14 : false)) {
                    z2 = false;
                    if (E <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f3 += E;
                        i20++;
                        i14 = i18;
                    } else {
                        int i23 = i3 - i21;
                        qhe qheVar = qheVarArr[i18];
                        if (qheVar == null) {
                            if (i3 == Integer.MAX_VALUE) {
                                i14 = i18;
                                i15 = i20;
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i14 = i18;
                                i15 = i20;
                                i16 = i23 < 0 ? 0 : i23;
                            }
                            qheVar = g1cVar.J(g8gVar.g(0, i16, i4, false));
                        } else {
                            i14 = i18;
                            i15 = i20;
                        }
                        int f4 = g8gVar.f(qheVar);
                        int e2 = g8gVar.e(qheVar);
                        iArr2[i14 - i6] = f4;
                        int i24 = i23 - f4;
                        if (i24 < 0) {
                            i24 = 0;
                        }
                        i22 = Math.min(i5, i24);
                        i21 += f4 + i22;
                        i19 = Math.max(i19, e2);
                        qheVarArr[i14] = qheVar;
                        i20 = i15;
                    }
                    i18 = i14 + 1;
                    j = j2;
                }
            }
            z2 = true;
            if (E <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            i18 = i14 + 1;
            j = j2;
        }
        long j3 = j;
        boolean z3 = true;
        if (i20 == 0) {
            i21 -= i22;
            i9 = 0;
        } else {
            long j4 = (r24 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i21) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f5 = j5 / f3;
            int i25 = i6;
            while (i25 < i7) {
                j5 -= Math.round(yaa.E(yaa.B((g1c) list2.get(i25))) * f5);
                i25++;
                j4 = j4;
            }
            long j6 = j4;
            int i26 = i6;
            int i27 = 0;
            while (i26 < i7) {
                if (qheVarArr[i26] == null) {
                    g1c g1cVar2 = (g1c) list2.get(i26);
                    h8g B2 = yaa.B(g1cVar2);
                    float E2 = yaa.E(B2);
                    if (E2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        p3a.b("All weights <= 0 should have placeables");
                    }
                    i10 = i26;
                    int signum = Long.signum(j5);
                    f2 = f5;
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f2 * E2) + signum);
                    if ((B2 != null ? B2.b : z3) && max != Integer.MAX_VALUE) {
                        i11 = max;
                        z = z3;
                        qhe J = g1cVar2.J(g8gVar.g(i11, max, i4, z));
                        int f6 = g8gVar.f(J);
                        int e3 = g8gVar.e(J);
                        iArr2[i10 - i6] = f6;
                        i27 += f6;
                        int max2 = Math.max(i19, e3);
                        qheVarArr[i10] = J;
                        i19 = max2;
                    }
                    i11 = 0;
                    z = z3;
                    qhe J2 = g1cVar2.J(g8gVar.g(i11, max, i4, z));
                    int f62 = g8gVar.f(J2);
                    int e32 = g8gVar.e(J2);
                    iArr2[i10 - i6] = f62;
                    i27 += f62;
                    int max22 = Math.max(i19, e32);
                    qheVarArr[i10] = J2;
                    i19 = max22;
                } else {
                    i10 = i26;
                    f2 = f5;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i26 = i10 + 1;
                f5 = f2;
            }
            i9 = (int) (i27 + j6);
            int i28 = i3 - i21;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i28) {
                i9 = i28;
            }
        }
        if (z2) {
            int i29 = 0;
            i12 = 0;
            for (int i30 = i6; i30 < i7; i30++) {
                qhe qheVar2 = qheVarArr[i30];
                qheVar2.getClass();
                Object h = qheVar2.h();
                h8g h8gVar = h instanceof h8g ? (h8g) h : null;
                c5n c5nVar2 = h8gVar != null ? h8gVar.c : null;
                Integer v = c5nVar2 != null ? c5nVar2.v(qheVar2) : null;
                if (v != null) {
                    int intValue = v.intValue();
                    int e4 = g8gVar.e(qheVar2);
                    i29 = Math.max(i29, intValue != Integer.MIN_VALUE ? v.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = e4;
                    }
                    i12 = Math.max(i12, e4 - intValue);
                }
            }
            i13 = i29;
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i31 = i21 + i9;
        int max3 = Math.max(i31 < 0 ? 0 : i31, i);
        int max4 = Math.max(i19, Math.max(i2, i12 + i13));
        int[] iArr3 = new int[i17];
        g8gVar.b(max3, iArr2, iArr3, m1cVar);
        return g8gVar.c(qheVarArr, m1cVar, i13, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static b10 D(String str) {
        qff qffVar;
        int i;
        String str2;
        if (c.v(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                qffVar = qff.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                qffVar = qff.HTTP_1_1;
            }
        } else if (c.v(str, "ICY ", false)) {
            qffVar = qff.HTTP_1_0;
            i = 4;
        } else {
            if (!c.v(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            qffVar = qff.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer intOrNull = StringsKt.toIntOrNull(str.substring(i, i2));
        if (intOrNull == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int intValue = intOrNull.intValue();
        if (str.length() <= i2) {
            str2 = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            str2 = str.substring(i + 4);
        }
        return new b10((Object) qffVar, str2, intValue, 16);
    }

    public static void E(Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "REFRESH_WIDGET_FAVORITES")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        ktd g2 = vxd.g(WidgetFavoriteWorker.class, l);
        if (Build.VERSION.SDK_INT >= 31) {
            pwd pwdVar = pwd.a;
            g2.e();
        }
        vxd.h(context).b("WidgetFavoriteWorker-".concat(mha.o(l)), nf6.a, (ltd) g2.a());
    }

    public static final void F(View view) {
        view.getClass();
        view.setBackgroundColor(view.getContext().getColor(R.color.surface_0));
    }

    public static final void G(View view) {
        view.getClass();
        view.setBackgroundColor(view.getContext().getColor(R.color.surface_1));
    }

    public static final void H(View view) {
        view.getClass();
        view.setBackgroundColor(view.getContext().getColor(R.color.surface_2));
    }

    public static final void I(View view) {
        view.getClass();
        view.setBackgroundColor(view.getContext().getColor(R.color.surface_P));
    }

    public static boolean J(long j, long j2, long j3) {
        ZoneId systemDefault = ZoneId.systemDefault();
        LocalDate localDate = Instant.ofEpochSecond(j).atZone(systemDefault).toLocalDate();
        LocalDate localDate2 = Instant.ofEpochSecond(j3).atZone(systemDefault).toLocalDate();
        if (localDate.getYear() >= localDate2.getYear() && (localDate.getYear() > localDate2.getYear() || localDate.getDayOfYear() > localDate2.getDayOfYear())) {
            return false;
        }
        if (j2 > 0) {
            j = j2 - 1;
        }
        ZoneId systemDefault2 = ZoneId.systemDefault();
        LocalDate localDate3 = Instant.ofEpochSecond(j).atZone(systemDefault2).toLocalDate();
        LocalDate localDate4 = Instant.ofEpochSecond(j3).atZone(systemDefault2).toLocalDate();
        if (localDate3.getYear() < localDate4.getYear()) {
            return false;
        }
        return localDate3.getYear() > localDate4.getYear() || localDate3.getDayOfYear() >= localDate4.getDayOfYear();
    }

    public static final int K(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static zzoo L(Context context, int i, String str, String str2, en0 en0Var) {
        zzoo zzooVar;
        hzo hzoVar = new hzo(context, i, str, str2, en0Var);
        try {
            zzooVar = (zzoo) hzoVar.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            hzoVar.b(2009, hzoVar.g, e2);
            zzooVar = null;
        }
        hzoVar.b(3004, hzoVar.g, null);
        if (zzooVar != null) {
            if (zzooVar.c == 7) {
                en0.f = 3;
            } else {
                en0.f = 2;
            }
        }
        return zzooVar == null ? new zzoo() : zzooVar;
    }

    public static final void a(long j, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-958411922);
        int i2 = (av8Var2.f(j) ? 4 : 2) | i | (av8Var2.i(function0) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(new dnd(0L));
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Configuration configuration = (Configuration) av8Var2.k(nz.a);
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = Integer.valueOf(kx4Var.e0(configuration.screenWidthDp));
                av8Var2.n0(O2);
            }
            int intValue = ((Number) O2).intValue();
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = Integer.valueOf(kx4Var.e0(20.0f));
                av8Var2.n0(O3);
            }
            int intValue2 = ((Number) O3).intValue();
            zl0 zl0Var = new zl0(j, intValue2, intValue);
            g2f g2fVar = new g2f(25);
            tc3 H = yqo.H(672749712, av8Var2, new bo7(function0, j, e1dVar, intValue2));
            av8Var = av8Var2;
            t20.a(zl0Var, null, g2fVar, H, av8Var, 3456, 2);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o47(j, function0, i, 1);
        }
    }

    public static final void b(plb plbVar, xtc xtcVar, int i, hmb hmbVar, of3 of3Var, int i2, int i3, int i4) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1331239405);
        hmb hmbVar2 = (i4 & 16384) != 0 ? null : hmbVar;
        mv1 mv1Var = uxf.g;
        av8Var.e0(683659508);
        olb olbVar = olb.a;
        if (i <= 0) {
            ogj.h(lnb.k(i, "Iterations must be a positive number (", ")."));
            return;
        }
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is 1.0.").toString());
        }
        flb N = yaa.N(av8Var);
        av8Var.e0(-180606964);
        Object O = av8Var.O();
        Object obj = nf3.a;
        if (O == obj) {
            O = e.f(true);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        av8Var.s(false);
        av8Var.e0(-180606834);
        Context context = (Context) av8Var.k(nz.b);
        Matrix matrix = vik.a;
        float f2 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        av8Var.s(false);
        hz8.r(new Object[]{plbVar, true, null, Float.valueOf(f2), Integer.valueOf(i)}, new c60(N, plbVar, i, f2, olbVar, e1dVar, null), av8Var);
        av8Var.s(false);
        av8Var.e0(185157769);
        boolean g2 = av8Var.g(N);
        Object O2 = av8Var.O();
        if (g2 || O2 == obj) {
            O2 = new hv7(N, 21);
            av8Var.n0(O2);
        }
        av8Var.s(false);
        hmb hmbVar3 = hmbVar2;
        c(plbVar, (Function0) O2, xtcVar, false, false, true, false, myf.a, false, hmbVar3, mv1Var, mp3.b, true, false, null, bl0.a, false, av8Var, 1073742216, 32768, 0);
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qs9(plbVar, xtcVar, i, hmbVar3, i2, i3, i4);
        }
    }

    public static final void c(plb plbVar, Function0 function0, xtc xtcVar, boolean z, boolean z2, boolean z3, boolean z4, myf myfVar, boolean z5, hmb hmbVar, io ioVar, op3 op3Var, boolean z6, boolean z7, Map map, bl0 bl0Var, boolean z8, of3 of3Var, int i, int i2, int i3) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(382909894);
        boolean z9 = (i3 & 8) != 0 ? false : z;
        boolean z10 = (i3 & 16) != 0 ? false : z2;
        boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        myf myfVar2 = (i3 & 128) != 0 ? myf.a : myfVar;
        boolean z13 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z5;
        hmb hmbVar2 = (i3 & 512) != 0 ? null : hmbVar;
        io ioVar2 = (i3 & 1024) != 0 ? uxf.g : ioVar;
        op3 op3Var2 = (i3 & a.o) != 0 ? mp3.b : op3Var;
        boolean z14 = (i3 & 4096) != 0 ? true : z6;
        boolean z15 = (i3 & 8192) != 0 ? false : z7;
        Map map2 = (i3 & 16384) != 0 ? null : map;
        bl0 bl0Var2 = (32768 & i3) != 0 ? bl0.a : bl0Var;
        boolean z16 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z8;
        av8Var.e0(185152185);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = new gmb();
            av8Var.n0(O);
        }
        gmb gmbVar = (gmb) O;
        av8Var.s(false);
        av8Var.e0(185152232);
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = new Matrix();
            av8Var.n0(O2);
        }
        Matrix matrix = (Matrix) O2;
        av8Var.s(false);
        av8Var.e0(185152312);
        boolean g2 = av8Var.g(plbVar);
        Object O3 = av8Var.O();
        if (g2 || O3 == a99Var) {
            O3 = e.f(null);
            av8Var.n0(O3);
        }
        e1d e1dVar = (e1d) O3;
        av8Var.s(false);
        av8Var.e0(185152364);
        if (plbVar == null || plbVar.b() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean z17 = z13;
            bl0 bl0Var3 = bl0Var2;
            boolean z18 = z12;
            myf myfVar3 = myfVar2;
            io ioVar3 = ioVar2;
            boolean z19 = z10;
            boolean z20 = z15;
            hmb hmbVar3 = hmbVar2;
            op3 op3Var3 = op3Var2;
            boolean z21 = z14;
            boolean z22 = z16;
            e12.a((i >> 6) & 14, av8Var, xtcVar);
            av8Var.s(false);
            eqf u = av8Var.u();
            if (u != null) {
                u.d = new glb(plbVar, function0, xtcVar, z9, z19, z11, z18, myfVar3, z17, hmbVar3, ioVar3, op3Var3, z21, z20, map2, bl0Var3, z22, i, i2, i3, 0);
                return;
            }
            return;
        }
        av8Var.s(false);
        io ioVar4 = ioVar2;
        hmb hmbVar4 = hmbVar2;
        Rect rect = plbVar.k;
        Context context = (Context) av8Var.k(nz.b);
        int width = rect.width();
        int height = rect.height();
        xtcVar.getClass();
        xtc z23 = xtcVar.z(new ilb(width, height));
        op3 op3Var4 = op3Var2;
        Map map3 = map2;
        boolean z24 = z9;
        boolean z25 = z11;
        boolean z26 = z12;
        myf myfVar4 = myfVar2;
        bl0 bl0Var4 = bl0Var2;
        boolean z27 = z16;
        hlb hlbVar = new hlb(rect, op3Var4, ioVar4, matrix, gmbVar, z26, z27, myfVar4, bl0Var4, plbVar, map3, hmbVar4, z24, z10, z25, z13, z14, z15, context, function0, e1dVar);
        boolean z28 = z13;
        boolean z29 = z10;
        boolean z30 = z14;
        boolean z31 = z15;
        lz.d(0, av8Var, z23, hlbVar);
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new glb(plbVar, function0, xtcVar, z24, z29, z25, z26, myfVar4, z28, hmbVar4, ioVar4, op3Var4, z30, z31, map3, bl0Var4, z27, i, i2, i3, 1);
        }
    }

    public static final void e(r5c r5cVar, Function1 function1, xtc xtcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        xtc xtcVar3;
        zg3 zg3Var;
        jf9 jf9Var;
        float f2;
        f50 f50Var;
        n12 n12Var;
        f50 f50Var2;
        int i4;
        boolean z;
        boolean z2;
        r5c r5cVar2;
        ry ryVar;
        ff3 ff3Var;
        f50 f50Var3;
        f50 f50Var4;
        n12 n12Var2;
        utc utcVar;
        boolean z3;
        boolean z4;
        jf9 jf9Var2 = oyn.e;
        r5cVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1385594927);
        int i5 = i | (av8Var.g(r5cVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i5 | (av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar2 = utc.a;
            xtc xtcVar4 = i6 != 0 ? utcVar2 : xtcVar2;
            xtc A = wnn.A(bkh.d(xtcVar4, 1.0f), o7g.a(12.0f));
            boolean z5 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z5 || O == nf3.a) {
                O = new ixa(12, function1, r5cVar);
                av8Var.n0(O);
            }
            xtc xtcVar5 = xtcVar4;
            xtc O2 = kda.O(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), "media_highlight_card", av8Var);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var5 = hf3.g;
            waa.K(av8Var, c2, f50Var5);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var6 = hf3.j;
            waa.K(av8Var, valueOf, f50Var6);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var7 = hf3.d;
            waa.K(av8Var, C, f50Var7);
            xtc p = qx9.p(bkh.d(utcVar2, 1.0f), 1.7777778f);
            Highlight highlight = r5cVar.a;
            f50 f50Var8 = f50Var6;
            haa.b(highlight.getThumbnailUrl(), null, p, haa.t(2131232755, 0, av8Var), haa.t(2131232755, 0, av8Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31712);
            av8Var = av8Var;
            n12 n12Var3 = n12.a;
            xtc b2 = n12Var3.b(utcVar2);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b2);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var5);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var8, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var7);
            xtc e2 = fn0.e(1.0f, bkh.d(utcVar2, 1.0f), true);
            mv1 mv1Var2 = uxf.g;
            zg3 zg3Var3 = zg3Var;
            int i7 = 6;
            kq9.b(s6a.N(R.drawable.ic_highlights_white, 6, av8Var), null, kda.O(bkh.l(bkh.s(e2, 2), 48.0f), "play_button", av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            if (highlight.getKeyHighlight() || (highlight.getTitle().length() <= 0 && highlight.getSubtitle().length() <= 0)) {
                jf9Var = jf9Var2;
                f2 = 4.0f;
                f50Var = f50Var5;
                n12Var = n12Var3;
                f50Var2 = f50Var7;
                i4 = R.color.on_color_primary;
                z = true;
                av8Var.d0(-4118579);
                av8Var.s(false);
            } else {
                av8Var.d0(-5414007);
                xtc c0 = l98.c0(n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.darken_overlay_3, av8Var), jf9Var2), 16.0f, 8.0f);
                u23 a3 = t23.a(new ng0(4.0f, true, new a70(i7)), kv1Var, av8Var, 6);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var3);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var5);
                waa.K(av8Var, m3, ff3Var2);
                bf3.s(hashCode3, av8Var, f50Var8, av8Var, ryVar2);
                waa.K(av8Var, C3, f50Var7);
                if (highlight.getTitle().length() > 0) {
                    av8Var.d0(2054947460);
                    xtc O3 = kda.O(utcVar2, "title", av8Var);
                    String title = highlight.getTitle();
                    yf8 yf8Var = xth.a;
                    dfj l = xth.l();
                    long D = lz.D(R.color.on_color_primary, av8Var);
                    f50Var8 = f50Var8;
                    f2 = 4.0f;
                    f50Var = f50Var5;
                    n12Var = n12Var3;
                    f50Var2 = f50Var7;
                    jf9Var = jf9Var2;
                    i4 = R.color.on_color_primary;
                    udj.c(title, O3, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l, av8Var, 0, 24960, 110584);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    jf9Var = jf9Var2;
                    f50Var2 = f50Var7;
                    f50Var8 = f50Var8;
                    f50Var = f50Var5;
                    n12Var = n12Var3;
                    i4 = R.color.on_color_primary;
                    f2 = 4.0f;
                    av8Var.d0(2055332542);
                    av8Var.s(false);
                }
                if (highlight.getSubtitle().length() > 0) {
                    av8Var.d0(2055433850);
                    xtc O4 = kda.O(utcVar2, "subtitle", av8Var);
                    String subtitle = highlight.getSubtitle();
                    yf8 yf8Var2 = xth.a;
                    av8 av8Var2 = av8Var;
                    udj.c(subtitle, O4, lz.D(i4, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.b(), av8Var2, 0, 24960, 110584);
                    av8Var = av8Var2;
                    z4 = false;
                    av8Var.s(false);
                } else {
                    z4 = false;
                    av8Var.d0(2055828542);
                    av8Var.s(false);
                }
                z = true;
                av8Var.s(true);
                av8Var.s(z4);
            }
            av8Var.s(z);
            if (highlight.getKeyHighlight()) {
                av8Var.d0(-2074961762);
                xtc O5 = kda.O(l98.c0(n9e.q(l98.b0(n12Var.a(utcVar2, uxf.e), 8.0f), lz.D(R.color.darken_overlay_3, av8Var), o7g.a(f2)), 8.0f, f2), "highlight_label", av8Var);
                l8g a4 = k8g.a(ww9.b, uxf.l, av8Var, 0);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, O5);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var3);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m4, ff3Var2);
                bf3.s(hashCode4, av8Var, f50Var8, av8Var, ryVar2);
                f50 f50Var9 = f50Var2;
                waa.K(av8Var, C4, f50Var9);
                f50Var3 = f50Var8;
                f50Var4 = f50Var9;
                kq9.b(s6a.N(R.drawable.ic_checkmark, 6, av8Var), null, kda.O(bkh.l(utcVar2, 14.0f), "highlights_label", av8Var), lz.D(i4, av8Var), av8Var, 48, 0);
                long D2 = lz.D(i4, av8Var);
                z3 = z;
                xtc O6 = kda.O(l98.f0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "highlights_label_text", av8Var);
                String v = oea.v(r5cVar.f ? R.string.race_highlights : R.string.match_highlights_title, av8Var);
                yf8 yf8Var3 = xth.a;
                av8 av8Var3 = av8Var;
                r5cVar2 = r5cVar;
                ryVar = ryVar2;
                utcVar = utcVar2;
                ff3Var = ff3Var2;
                n12Var2 = n12Var;
                udj.c(v, O6, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131064);
                av8Var = av8Var3;
                av8Var.s(z3);
                z2 = false;
                av8Var.s(false);
            } else {
                z2 = false;
                r5cVar2 = r5cVar;
                ryVar = ryVar2;
                ff3Var = ff3Var2;
                f50Var3 = f50Var8;
                f50Var4 = f50Var2;
                n12Var2 = n12Var;
                utcVar = utcVar2;
                z3 = z;
                av8Var.d0(-2073769161);
                av8Var.s(false);
            }
            if (r5cVar2.c) {
                av8Var.d0(-2073724862);
                xtc q = n9e.q(n12Var2.b(utcVar), lz.D(R.color.darken_overlay_2, av8Var), jf9Var);
                k1c c3 = e12.c(mv1Var, z2);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, q);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var3);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c3, f50Var);
                waa.K(av8Var, m5, ff3Var);
                bf3.s(hashCode5, av8Var, f50Var3, av8Var, ryVar);
                waa.K(av8Var, C5, f50Var4);
                xtc a5 = n12Var2.a(utcVar, mv1Var2);
                String v2 = oea.v(R.string.now_playing, av8Var);
                yf8 yf8Var4 = xth.a;
                av8 av8Var4 = av8Var;
                udj.c(v2, a5, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var4, 0, 0, 131064);
                av8Var = av8Var4;
                av8Var.s(z3);
                av8Var.s(false);
            } else {
                av8Var.d0(-2073274153);
                av8Var.s(z2);
            }
            av8Var.s(z3);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(i, i2, 19, r5cVar, function1, xtcVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final unj unjVar, vmj vmjVar, final String str, xtc xtcVar, final Function2 function2, Integer num, float f2, final Function2 function22, tc3 tc3Var, of3 of3Var, final int i, final int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        int i5;
        float f3;
        Function2 function23;
        int i6;
        av8 av8Var;
        final Integer num2;
        xtc xtcVar3;
        final float f4;
        eqf u;
        xtc xtcVar4;
        utc utcVar;
        boolean z;
        float f5;
        av8 av8Var2;
        int i7;
        float f6;
        utc utcVar2;
        zg3 zg3Var;
        f50 f50Var;
        float f7;
        ry ryVar;
        f50 f50Var2;
        f50 f50Var3;
        boolean z2;
        utc utcVar3;
        List list;
        boolean z3;
        String u2;
        final vmj vmjVar2 = vmjVar;
        final tc3 tc3Var2 = tc3Var;
        unjVar.getClass();
        str.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1073973283);
        if ((i & 6) == 0) {
            i3 = (av8Var3.g(unjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var3.g(vmjVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var3.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var3.g(xtcVar2) ? a.o : 1024;
            if ((i & 24576) == 0) {
                i3 |= av8Var3.i(function2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                i3 |= av8Var3.g(num) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    f3 = f2;
                    i3 |= av8Var3.d(f3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if ((12582912 & i) != 0) {
                        function23 = function22;
                        i3 |= av8Var3.i(function23) ? 8388608 : 4194304;
                    } else {
                        function23 = function22;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= av8Var3.i(tc3Var2) ? 67108864 : 33554432;
                    }
                    i6 = i3;
                    if (av8Var3.T(i6 & 1, (i6 & 38347923) == 38347922)) {
                        av8Var = av8Var3;
                        av8Var.W();
                        num2 = num;
                        xtcVar3 = xtcVar2;
                        f4 = f3;
                    } else {
                        utc utcVar4 = utc.a;
                        xtc xtcVar5 = i8 != 0 ? utcVar4 : xtcVar2;
                        Unit unit = null;
                        Integer num3 = i4 != 0 ? null : num;
                        if (i5 != 0) {
                            f3 = 8.0f;
                        }
                        Context context = (Context) av8Var3.k(nz.b);
                        av8Var3.d0(-1296155589);
                        xtc d2 = bkh.d(xtcVar5, 1.0f);
                        if (dti.e(str)) {
                            long D = lz.D(R.color.n_lv_4, av8Var3);
                            Object O = av8Var3.O();
                            a99 a99Var = nf3.a;
                            if (O == a99Var) {
                                O = mz1.e(av8Var3);
                            }
                            wzc wzcVar = (wzc) O;
                            Object[] objArr = new Object[0];
                            Object O2 = av8Var3.O();
                            if (O2 == a99Var) {
                                O2 = mce.e;
                                av8Var3.n0(O2);
                            }
                            boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var3, 48);
                            xtcVar3 = xtcVar5;
                            z = false;
                            i7 = 48;
                            f5 = f3;
                            xtc y = tol.y(utcVar4, true, true, true, D, wzcVar, new b32(bohVar, vmjVar2, context, unjVar, function23), av8Var3, 0);
                            utcVar = utcVar4;
                            av8Var2 = av8Var3;
                            xtcVar4 = d2.z(y);
                        } else {
                            xtcVar3 = xtcVar5;
                            xtcVar4 = d2;
                            utcVar = utcVar4;
                            z = false;
                            f5 = f3;
                            av8Var2 = av8Var3;
                            i7 = 48;
                        }
                        av8Var2.s(z);
                        xtc e0 = l98.e0(xtcVar4, f5, 8.0f, 16.0f, 8.0f);
                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, i7);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, e0);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var2);
                        } else {
                            av8Var2.q0();
                        }
                        f50 f50Var4 = hf3.g;
                        waa.K(av8Var2, a2, f50Var4);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var2, m, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var5 = hf3.j;
                        waa.K(av8Var2, valueOf, f50Var5);
                        ry ryVar2 = hf3.k;
                        waa.J(av8Var2, ryVar2);
                        f50 f50Var6 = hf3.d;
                        waa.K(av8Var2, C, f50Var6);
                        if (num3 == null) {
                            av8Var2.d0(-345372940);
                            av8Var2.s(z);
                            z2 = z;
                            f50Var2 = f50Var4;
                            f50Var3 = f50Var5;
                            f6 = f5;
                            zg3Var = zg3Var2;
                            ryVar = ryVar2;
                            f50Var = f50Var6;
                            utcVar2 = utcVar;
                            f7 = 16.0f;
                        } else {
                            av8Var2.d0(-345372939);
                            String valueOf2 = String.valueOf(num3.intValue() + 1);
                            yf8 yf8Var = xth.a;
                            f6 = f5;
                            utcVar2 = utcVar;
                            zg3Var = zg3Var2;
                            f50Var = f50Var6;
                            f7 = 16.0f;
                            ryVar = ryVar2;
                            f50Var2 = f50Var4;
                            av8 av8Var4 = av8Var2;
                            f50Var3 = f50Var5;
                            udj.c(valueOf2, bkh.p(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var4, 48, 0, 130040);
                            av8Var2 = av8Var4;
                            Unit unit2 = Unit.a;
                            z2 = false;
                            av8Var2.s(false);
                            unit = Unit.a;
                        }
                        if (unit == null) {
                            utcVar3 = utcVar2;
                            ljg.r(8.0f, -345040154, av8Var2, av8Var2, utcVar3);
                            Unit unit3 = Unit.a;
                            av8Var2.s(z2);
                        } else {
                            utcVar3 = utcVar2;
                            av8Var2.d0(-426783329);
                            av8Var2.s(z2);
                        }
                        av8 av8Var5 = av8Var2;
                        int i9 = unjVar.a;
                        znj znjVar = unjVar.f;
                        utc utcVar5 = utcVar3;
                        td4.C(i9, bkh.l(utcVar3, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var5, 48, 12);
                        xtc d0 = l98.d0(new goa(1.0f, true), f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var5, 6);
                        int hashCode2 = Long.hashCode(av8Var5.T);
                        aee m2 = av8Var5.m();
                        xtc C2 = fqj.C(av8Var5, d0);
                        av8Var5.h0();
                        if (av8Var5.S) {
                            av8Var5.l(zg3Var);
                        } else {
                            av8Var5.q0();
                        }
                        waa.K(av8Var5, a3, f50Var2);
                        waa.K(av8Var5, m2, ff3Var);
                        bf3.s(hashCode2, av8Var5, f50Var3, av8Var5, ryVar);
                        waa.K(av8Var5, C2, f50Var);
                        String str2 = unjVar.b;
                        yf8 yf8Var2 = xth.a;
                        udj.c(str2, kda.O(utcVar5, "primary_label", av8Var5), lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var5, 0, 0, 131064);
                        av8Var = av8Var5;
                        if (vmjVar == null) {
                            av8Var.d0(441015598);
                            if (znjVar == null || (list = kotlin.collections.a.c(Integer.valueOf(znjVar.a))) == null) {
                                list = unjVar.h;
                            }
                            if (!str.equals(Sports.HANDBALL) || znjVar == null) {
                                z3 = false;
                                u2 = dti.u(context, unjVar.d, str, unjVar.c, false);
                            } else {
                                u2 = znjVar.b;
                                z3 = false;
                            }
                            r(list, u2, function2, av8Var, (i6 >> 6) & 896);
                            av8Var.s(z3);
                            vmjVar2 = vmjVar;
                        } else {
                            av8Var.d0(441755103);
                            vmjVar2 = vmjVar;
                            znj znjVar2 = vmjVar2.b;
                            int i10 = znjVar2.a;
                            Integer num4 = znjVar2.c;
                            int intValue = num4 != null ? num4.intValue() : 0;
                            znj znjVar3 = vmjVar2.c;
                            int i11 = znjVar3.a;
                            Integer num5 = znjVar3.c;
                            q(i10, intValue, i11, num5 != null ? num5.intValue() : 0, null, av8Var, 0);
                            av8Var = av8Var;
                            av8Var.s(false);
                        }
                        av8Var.s(true);
                        tc3Var2 = tc3Var;
                        fc6.v((i6 >> 24) & 14, tc3Var2, av8Var, true);
                        f4 = f6;
                        num2 = num3;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        final xtc xtcVar6 = xtcVar3;
                        u.d = new Function2() { // from class: cve
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aba.f(unj.this, vmjVar2, str, xtcVar6, function2, num2, f4, function22, tc3Var2, (of3) obj, aba.K(i | 1), i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                f3 = f2;
                if ((12582912 & i) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i6 = i3;
                if (av8Var3.T(i6 & 1, (i6 & 38347923) == 38347922)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            f3 = f2;
            if ((12582912 & i) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i3;
            if (av8Var3.T(i6 & 1, (i6 & 38347923) == 38347922)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        f3 = f2;
        if ((12582912 & i) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i3;
        if (av8Var3.T(i6 & 1, (i6 & 38347923) == 38347922)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final kjh g(int i, int i2) {
        t25.a(i);
        t25 t25Var = new t25(i);
        t25.a(i2);
        return new kjh(t25Var, new t25(i2));
    }

    public static final void h(uqa uqaVar, Object obj, int i, Object obj2, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1439843069);
        int i3 = (av8Var.g(uqaVar) ? 4 : 2) | i2 | (av8Var.g(obj) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(obj2) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ((mpg) obj).b(obj2, yqo.H(980966366, av8Var, new lj(i, uqaVar, obj2)), av8Var, 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(uqaVar, obj, i, obj2, i2);
        }
    }

    public static final void i(vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1380468206);
        if ((((av8Var.g(vy8Var) ? 4 : 2) | i) & 3) == 2 && av8Var.D()) {
            av8Var.W();
        } else {
            owh owhVar = owh.b;
            av8Var.e0(-1115894518);
            av8Var.e0(1886828752);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(new gj0(1, owhVar));
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, vy8Var, ned.K);
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new z2(vy8Var, i, 9);
        }
    }

    public static final void j(qvi qviVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(907785283);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(qviVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtcVar2 = xtcVar;
            xtc b0 = l98.b0(v(xtcVar, qviVar.b, false, false, lz.D(R.color.surface_2, av8Var), av8Var, 6), 4.0f);
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
            n(qviVar.a, lz.D(R.color.n_lv_3, av8Var), null, false, null, av8Var, 3456, 16);
            av8Var.s(true);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(qviVar, xtcVar2, i, i3);
        }
    }

    public static final void k(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-434738110);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            e12.a(0, av8Var, n9e.q(xtcVar, lz.D(R.color.surface_2, av8Var), o7g.a(4.0f)));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 28);
        }
    }

    public static final void l(tvi tviVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        boolean z;
        svi sviVar = tviVar.h;
        boolean z2 = tviVar.c;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-715493990);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(tviVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            svi sviVar2 = svi.a;
            long x = x(z2, sviVar == sviVar2, av8Var);
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc A = wnn.A(xtcVar, o7g.a(4.0f));
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
                O2 = nuh.j;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(v(tol.y(A, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, tviVar, i3), av8Var, 0), tviVar.j, tviVar.c, sviVar == sviVar2, 0L, av8Var, 8), 4.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 54);
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
            utc utcVar = utc.a;
            n(tviVar.a, x, Integer.valueOf(tviVar.e), !z2, bkh.d(utcVar, 1.0f), av8Var, 24576, 0);
            td4.G(tviVar.d, bkh.l(new goa(1.0f, true), 24.0f), false, 0L, av8Var, 0, 12);
            av8Var = av8Var;
            if (tviVar.f != null) {
                av8Var.d0(1787738941);
                m(tviVar.f, tviVar.h, tviVar.i, null, av8Var, 0);
                av8Var.s(false);
                z = true;
            } else {
                av8Var.d0(1788028605);
                mv1 mv1Var = uxf.g;
                xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), 16.0f);
                k1c c2 = e12.c(mv1Var, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, e2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String str = tviVar.g;
                yf8 yf8Var = xth.a;
                udj.c(str, null, x, new es0(v8a.v(6), v8a.v(12), v8a.u(0.25d)), 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.b(), av8Var, 0, 24576, 113650);
                av8Var = av8Var;
                z = true;
                av8Var.s(true);
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(tviVar, function1, xtcVar, i, 6);
        }
    }

    public static final void m(String str, svi sviVar, boolean z, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        int i2;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1202933931);
        int i4 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.e(sviVar == null ? -1 : sviVar.ordinal()) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            long v = z ? v8a.v(8) : v8a.v(12);
            long v2 = z ? v8a.v(12) : v8a.v(16);
            int i5 = sviVar != null ? xvi.a[sviVar.ordinal()] : -1;
            if (i5 == 1) {
                i2 = 673317236;
                i3 = R.color.n_lv_1;
            } else if (i5 == 2) {
                i2 = 673319159;
                i3 = R.color.success;
            } else if (i5 == 3) {
                i2 = 673321205;
                i3 = R.color.error;
            } else if (i5 != 4) {
                i2 = 673324340;
                i3 = R.color.n_lv_3;
            } else {
                i2 = 673323198;
                i3 = R.color.neutral_default;
            }
            long f2 = ljg.f(av8Var2, i2, i3, av8Var2, false);
            mv1 mv1Var = uxf.g;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 16.0f), f2, o7g.a(12.0f)), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.surface_1, av8Var2), new es0(v8a.v(6), v, v8a.u(0.25d)), 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, dfj.a(xth.b(), 0L, v, null, null, 0L, null, 0, 0, v2, null, null, 0, 16646141), av8Var2, i4 & 14, 24576, 114674);
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
            u.d = new p81(str, sviVar, z, xtcVar2, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final int i, final long j, final Integer num, final boolean z, xtc xtcVar, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        final xtc xtcVar3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2030647249);
        int i4 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.f(j) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.h(z) ? a.o : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 16384 : 8192;
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtcVar3 = i5 != 0 ? utcVar : xtcVar2;
                Context context = (Context) av8Var.k(nz.b);
                lv1 lv1Var = uxf.m;
                kg0 kg0Var = ww9.h;
                xtc d2 = bkh.d(xtcVar3, 1.0f);
                l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
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
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                String valueOf = String.valueOf(i);
                yf8 yf8Var = xth.a;
                udj.c(valueOf, null, j, new es0(v8a.v(6), v8a.v(10), v8a.u(0.25d)), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, (i4 << 3) & 896, 0, 131058);
                av8Var = av8Var;
                Integer num2 = (num != null && num.intValue() == 0) ? null : num;
                if (num2 == null) {
                    av8Var.d0(-1653291341);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1653291340);
                    td4.y(num2.intValue(), 48, 4, av8Var, bkh.l(utcVar, 12.0f), null, hkg.b0(context) ^ z);
                    av8Var.s(false);
                }
                av8Var.s(true);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: wvi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aba.n(i, j, num, z, xtcVar3, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void o(uvi uviVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        boolean z = uviVar.c;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-348077276);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (av8Var.g(uviVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            long x = x(z, uviVar.d, av8Var);
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc A = wnn.A(xtcVar, o7g.a(4.0f));
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
                O2 = nuh.k;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, uviVar, i2), av8Var, 0);
            av8 av8Var2 = av8Var;
            xtc b0 = l98.b0(v(y, uviVar.i, uviVar.c, uviVar.d, 0L, av8Var2, 8), 4.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var2, 54);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            n(uviVar.a, x, Integer.valueOf(uviVar.f), !z, bkh.d(utcVar, 1.0f), av8Var2, 24576, 0);
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.h;
            xtc e2 = fn0.e(1.0f, bkh.d(utcVar, 1.0f), true);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, e2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            av8Var2.d0(-1600323965);
            int i4 = 0;
            for (Object obj : uviVar.e) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                int intValue = ((Number) obj).intValue();
                mv1 mv1Var = i4 == 0 ? uxf.f : uxf.h;
                goa goaVar = new goa(1.0f, true);
                k1c c2 = e12.c(mv1Var, false);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, goaVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c2, hf3.g);
                waa.K(av8Var2, m3, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode3), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C3, hf3.d);
                av8 av8Var3 = av8Var2;
                td4.G(intValue, bkh.l(utcVar, 16.0f), false, 0L, av8Var3, 48, 12);
                av8Var2 = av8Var3;
                av8Var2.s(true);
                i4 = i5;
            }
            av8Var2.s(false);
            av8Var2.s(true);
            mv1 mv1Var2 = uxf.g;
            xtc e3 = bkh.e(bkh.d(utcVar, 1.0f), 16.0f);
            k1c c3 = e12.c(mv1Var2, false);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, e3);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c3, hf3.g);
            waa.K(av8Var2, m4, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode4), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C4, hf3.d);
            int i6 = uviVar.g;
            String t = oea.t(R.plurals.number_of_events, i6, new Object[]{Integer.valueOf(i6)}, av8Var2);
            yf8 yf8Var = xth.a;
            av8 av8Var4 = av8Var2;
            udj.c(t, null, x, new es0(v8a.v(6), v8a.v(12), v8a.u(0.25d)), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var4, 0, 24960, 110578);
            av8Var = av8Var4;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(uviVar, function1, xtcVar, i, 5);
        }
    }

    public static final void p(mhj mhjVar, long j, dfj dfjVar, long j2, of3 of3Var, int i) {
        int i2;
        dfj dfjVar2;
        long j3;
        av8 av8Var;
        mhjVar.getClass();
        dfjVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2061063212);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(mhjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            dfjVar2 = dfjVar;
            i2 |= av8Var2.g(dfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            dfjVar2 = dfjVar;
        }
        if ((i & 3072) == 0) {
            j3 = j2;
            i2 |= av8Var2.f(j3) ? a.o : 1024;
        } else {
            j3 = j2;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var2.d0(701827537);
            o80 o80Var = new o80();
            o80Var.d(StringsKt.U(2, String.valueOf(mhjVar.a)));
            av8Var2.d0(701830476);
            int g2 = o80Var.g(new pwh(0L, j3, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65533));
            try {
                String upperCase = oea.v(mhjVar.b, av8Var2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                o80Var.d(upperCase);
                Unit unit = Unit.a;
                o80Var.f(g2);
                av8Var2.s(false);
                q80 h = o80Var.h();
                av8Var2.s(false);
                av8Var = av8Var2;
                udj.d(h, null, j, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, null, null, dfjVar2, av8Var, (i2 << 3) & 896, (i2 << 18) & 234881024, 261114);
            } catch (Throwable th) {
                o80Var.f(g2);
                throw th;
            }
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u64(mhjVar, j, dfjVar, j2, i);
        }
    }

    public static final void q(final int i, final int i2, final int i3, final int i4, xtc xtcVar, of3 of3Var, final int i5) {
        final xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1184124247);
        int i6 = i5 | (av8Var.e(i) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i4) ? a.o : 1024) | 24576;
        if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            long D = lz.D(R.color.surface_2, av8Var);
            n7g a2 = o7g.a(4.0f);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(utcVar, D, a2), 8.0f, 4.0f);
            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.G(i, bkh.l(utcVar, 16.0f), false, 0L, av8Var, (i6 & 14) | 48, 12);
            String w = oea.w(R.string.toolbar_subtitle_template, new Object[]{String.valueOf(i2), String.valueOf(i4)}, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(w, kda.O(utcVar, "tertiary_label", av8Var), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            td4.G(i3, bkh.l(utcVar, 16.0f), false, 0L, av8Var, ((i6 >> 6) & 14) | 48, 12);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, i2, i3, i4, xtcVar2, i5) { // from class: dve
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ xtc e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    aba.q(this.a, this.b, this.c, this.d, this.e, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(List list, String str, Function2 function2, of3 of3Var, int i) {
        int i2;
        String str2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1980403369);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= av8Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (function2 == null) {
                av8Var.d0(-1856608948);
                av8Var.s(false);
            } else {
                av8Var.d0(217204053);
                me4.l((i2 >> 6) & 14, function2, av8Var, false);
            }
            if (list == null) {
                av8Var.d0(-1856576522);
                av8Var.s(false);
            } else {
                av8Var.d0(-1856576521);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    av8Var.a0(21432949, Integer.valueOf(intValue));
                    td4.G(intValue, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
            yf8 yf8Var = xth.a;
            String str3 = str2;
            udj.c(str3, kda.O(utcVar, "secondary_label", av8Var), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, (i2 >> 3) & 14, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(list, str, function2, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto, BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle) {
        String text;
        int backgroundColor;
        String borderColor;
        int borderColor2;
        Integer rgbaToColorInt$default;
        sgm sgmVar;
        blazeWidgetItemBadgeStateStyle.getClass();
        OverridableValueRemoteDto<String> backgroundImage = widgetItemBadgeStateStyleRemoteDto.getBackgroundImage();
        if (backgroundImage != null) {
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            String value = backgroundImage.getValue();
            if (value != null) {
                if (application$blazesdk_release != null) {
                    int identifier = application$blazesdk_release.getResources().getIdentifier(value, "drawable", application$blazesdk_release.getPackageName());
                    Integer valueOf = identifier == 0 ? null : Integer.valueOf(identifier);
                    if (valueOf != null) {
                        sgmVar = new sgm(Integer.valueOf(valueOf.intValue()), null);
                    }
                }
                sgmVar = new sgm(null, value);
            } else {
                sgmVar = null;
            }
            if (sgmVar != null) {
                blazeWidgetItemBadgeStateStyle.setBackgroundImageResId(sgmVar.a);
                blazeWidgetItemBadgeStateStyle.setBackgroundImageUrl$blazesdk_release(sgmVar.b);
            }
        }
        OverridableValueRemoteDto<Float> cornerRadiusRatio = widgetItemBadgeStateStyleRemoteDto.getCornerRadiusRatio();
        if (cornerRadiusRatio != null) {
            blazeWidgetItemBadgeStateStyle.setCornerRadiusRatio(cornerRadiusRatio.getValue());
        }
        Integer width = widgetItemBadgeStateStyleRemoteDto.getWidth();
        blazeWidgetItemBadgeStateStyle.setWidth(width != null ? new BlazeDp(width.intValue()) : blazeWidgetItemBadgeStateStyle.getWidth());
        Integer height = widgetItemBadgeStateStyleRemoteDto.getHeight();
        blazeWidgetItemBadgeStateStyle.setHeight(height != null ? new BlazeDp(height.intValue()) : blazeWidgetItemBadgeStateStyle.getHeight());
        WidgetItemTextStyleRemoteDto textStyle = widgetItemBadgeStateStyleRemoteDto.getTextStyle();
        BlazeWidgetItemTextStyle textStyle2 = blazeWidgetItemBadgeStateStyle.getTextStyle();
        if (textStyle != null) {
            bea.l(textStyle, textStyle2);
        }
        blazeWidgetItemBadgeStateStyle.setTextStyle(textStyle2);
        OverridableValueRemoteDto<String> text2 = widgetItemBadgeStateStyleRemoteDto.getText();
        if (text2 == null || (text = text2.getValue()) == null) {
            text = blazeWidgetItemBadgeStateStyle.getText();
        }
        blazeWidgetItemBadgeStateStyle.setText(text);
        String backgroundColor2 = widgetItemBadgeStateStyleRemoteDto.getBackgroundColor();
        if (backgroundColor2 != null) {
            Application application$blazesdk_release2 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            Integer b2 = application$blazesdk_release2 != null ? cnb.b(application$blazesdk_release2, backgroundColor2) : null;
            if (b2 != null) {
                backgroundColor = b2.intValue();
                blazeWidgetItemBadgeStateStyle.setBackgroundColor(backgroundColor);
                Float cornerRadius = widgetItemBadgeStateStyleRemoteDto.getCornerRadius();
                blazeWidgetItemBadgeStateStyle.setCornerRadius(cornerRadius == null ? new BlazeDp(wzb.b(cornerRadius.floatValue())) : blazeWidgetItemBadgeStateStyle.getCornerRadius());
                borderColor = widgetItemBadgeStateStyleRemoteDto.getBorderColor();
                if (borderColor != null) {
                    Application application$blazesdk_release3 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    if (application$blazesdk_release3 == null || (rgbaToColorInt$default = cnb.b(application$blazesdk_release3, borderColor)) == null) {
                        rgbaToColorInt$default = ipl.rgbaToColorInt$default(ipl.a, borderColor, null, 2, null);
                    }
                    if (rgbaToColorInt$default != null) {
                        borderColor2 = rgbaToColorInt$default.intValue();
                        blazeWidgetItemBadgeStateStyle.setBorderColor(borderColor2);
                        Integer borderWidth = widgetItemBadgeStateStyleRemoteDto.getBorderWidth();
                        blazeWidgetItemBadgeStateStyle.setBorderWidth(borderWidth != null ? new BlazeDp(borderWidth.intValue()) : blazeWidgetItemBadgeStateStyle.getBorderWidth());
                        Boolean isVisible = widgetItemBadgeStateStyleRemoteDto.isVisible();
                        blazeWidgetItemBadgeStateStyle.setVisible(isVisible != null ? isVisible.booleanValue() : blazeWidgetItemBadgeStateStyle.isVisible());
                    }
                }
                borderColor2 = blazeWidgetItemBadgeStateStyle.getBorderColor();
                blazeWidgetItemBadgeStateStyle.setBorderColor(borderColor2);
                Integer borderWidth2 = widgetItemBadgeStateStyleRemoteDto.getBorderWidth();
                blazeWidgetItemBadgeStateStyle.setBorderWidth(borderWidth2 != null ? new BlazeDp(borderWidth2.intValue()) : blazeWidgetItemBadgeStateStyle.getBorderWidth());
                Boolean isVisible2 = widgetItemBadgeStateStyleRemoteDto.isVisible();
                blazeWidgetItemBadgeStateStyle.setVisible(isVisible2 != null ? isVisible2.booleanValue() : blazeWidgetItemBadgeStateStyle.isVisible());
            }
        }
        backgroundColor = blazeWidgetItemBadgeStateStyle.getBackgroundColor();
        blazeWidgetItemBadgeStateStyle.setBackgroundColor(backgroundColor);
        Float cornerRadius2 = widgetItemBadgeStateStyleRemoteDto.getCornerRadius();
        blazeWidgetItemBadgeStateStyle.setCornerRadius(cornerRadius2 == null ? new BlazeDp(wzb.b(cornerRadius2.floatValue())) : blazeWidgetItemBadgeStateStyle.getCornerRadius());
        borderColor = widgetItemBadgeStateStyleRemoteDto.getBorderColor();
        if (borderColor != null) {
        }
        borderColor2 = blazeWidgetItemBadgeStateStyle.getBorderColor();
        blazeWidgetItemBadgeStateStyle.setBorderColor(borderColor2);
        Integer borderWidth22 = widgetItemBadgeStateStyleRemoteDto.getBorderWidth();
        blazeWidgetItemBadgeStateStyle.setBorderWidth(borderWidth22 != null ? new BlazeDp(borderWidth22.intValue()) : blazeWidgetItemBadgeStateStyle.getBorderWidth());
        Boolean isVisible22 = widgetItemBadgeStateStyleRemoteDto.isVisible();
        blazeWidgetItemBadgeStateStyle.setVisible(isVisible22 != null ? isVisible22.booleanValue() : blazeWidgetItemBadgeStateStyle.isVisible());
    }

    public static final void t(View view) {
        view.getClass();
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static final void u(View view) {
        view.getClass();
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        view.setForeground(view.getContext().getDrawable(typedValue.resourceId));
    }

    public static final xtc v(xtc xtcVar, boolean z, boolean z2, boolean z3, long j, of3 of3Var, int i) {
        long j2;
        int i2;
        int i3;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1691908388);
            if (z3) {
                av8Var.d0(2093521679);
                j2 = r13.c(lz.D(R.color.live, av8Var), ((Number) i2a.q(i2a.F("live_background", av8Var, 0), 0.4f, 1.0f, s02.P(s02.h0(TTAdConstant.STYLE_SIZE_RADIO_3_2, 0, jg5.d, 2), bzf.b, 0L, 4), "live_background_alpha", av8Var, 29112, 0).getValue()).floatValue());
                av8Var.s(false);
            } else {
                av8Var.d0(2094005062);
                av8Var.s(false);
                if (z2) {
                    i2 = 1868665321;
                    i3 = R.color.surface_1;
                } else {
                    i2 = 1868664837;
                    i3 = R.color.n_lv_1;
                }
                j2 = ljg.f(av8Var, i2, i3, av8Var, false);
            }
            av8Var.s(false);
        } else {
            j2 = j;
        }
        n7g a2 = o7g.a(4.0f);
        boolean z4 = z && !z3;
        boolean z5 = (!z2 || z3 || z4) ? false : true;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(1612352089);
        av8Var2.d0(1612348291);
        utc utcVar = utc.a;
        if (z5) {
            xtcVar = xtcVar.z(yso.o(utcVar, 1.0f, lz.D(R.color.n_lv_4, av8Var2), a2));
        }
        av8Var2.s(false);
        xtc q = n9e.q(xtcVar, j2, a2);
        if (z4) {
            q = q.z(yso.o(n9e.q(utcVar, lz.D(R.color.bg_primary_tonal, av8Var2), a2), 2.0f, lz.D(R.color.primary_default, av8Var2), a2));
        }
        av8Var2.s(false);
        return q;
    }

    public static final boolean w(oqf oqfVar, float f2, float f3) {
        float f4 = oqfVar.a;
        if (f2 > oqfVar.c || f4 > f2) {
            return false;
        }
        return f3 <= oqfVar.d && oqfVar.b <= f3;
    }

    public static final long x(boolean z, boolean z2, of3 of3Var) {
        av8 av8Var;
        int i;
        int i2;
        if (!z || z2) {
            av8Var = (av8) of3Var;
            i = R.color.surface_1;
            i2 = -442357720;
        } else {
            av8Var = (av8) of3Var;
            i = R.color.n_lv_1;
            i2 = -442357116;
        }
        return ljg.f(av8Var, i2, i, av8Var, false);
    }

    public static void y(View view, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = view.getContext().getColor(R.color.n_lv_4);
        }
        boolean z = (i2 & 2) != 0;
        view.getClass();
        if (view.getBackground() instanceof RippleDrawable) {
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Drawable drawable = null;
        Drawable background = z ? view.getBackground() : null;
        if (z && (drawable = view.getBackground()) == null) {
            drawable = view.getContext().getDrawable(R.drawable.ripple_mask);
        }
        view.setBackground(new RippleDrawable(valueOf, background, drawable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n6j z(TennisPowerResponse tennisPowerResponse, Event event) {
        tennisPowerResponse.getClass();
        event.getClass();
        TeamSides teamSides = null;
        if (tennisPowerResponse.getTennisPowerRankings().isEmpty()) {
            return null;
        }
        List<TennisPowerItem> sortedList = tennisPowerResponse.getSortedList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        boolean z = true;
        for (TennisPowerItem tennisPowerItem : sortedList) {
            if (tennisPowerItem.getSet() > i3) {
                Integer scoreByPeriodName = Event.getHomeScore$default(event, teamSides, 1, teamSides).getScoreByPeriodName("period" + i3);
                int intValue = scoreByPeriodName != null ? scoreByPeriodName.intValue() : 0;
                Integer scoreByPeriodName2 = Event.getAwayScore$default(event, teamSides, 1, teamSides).getScoreByPeriodName("period" + i3);
                int intValue2 = scoreByPeriodName2 != null ? scoreByPeriodName2.intValue() : 0;
                if (intValue != i || intValue2 != i2) {
                    z = false;
                }
                Integer tieBreakByPeriodName = Event.getHomeScore$default(event, teamSides, 1, teamSides).getTieBreakByPeriodName("period" + i3);
                int intValue3 = tieBreakByPeriodName != null ? tieBreakByPeriodName.intValue() : 0;
                Integer tieBreakByPeriodName2 = Event.getAwayScore$default(event, teamSides, 1, teamSides).getTieBreakByPeriodName("period" + i3);
                arrayList.add(new s6j(i, i2, intValue3, tieBreakByPeriodName2 != null ? tieBreakByPeriodName2.intValue() : 0, l6g.W(arrayList2)));
                arrayList2.clear();
                i3++;
                i = 0;
                i2 = 0;
            }
            ArrayList arrayList3 = arrayList;
            double value = tennisPowerItem.getValue() * ((event.shouldReverseTeams() ? teamSides : 1) != 0 ? r8.intValue() : -1);
            if (value > 0.0d) {
                i++;
            } else {
                i2++;
            }
            arrayList2.add(new w5j(tennisPowerItem.getBreakOccurred(), (int) value));
            arrayList = arrayList3;
            teamSides = null;
        }
        ArrayList arrayList4 = arrayList;
        Integer tieBreakByPeriodName3 = Event.getHomeScore$default(event, teamSides, 1, teamSides).getTieBreakByPeriodName("period" + i3);
        int intValue4 = tieBreakByPeriodName3 != null ? tieBreakByPeriodName3.intValue() : 0;
        Integer tieBreakByPeriodName4 = Event.getAwayScore$default(event, teamSides, 1, teamSides).getTieBreakByPeriodName("period" + i3);
        arrayList4.add(new s6j(i, i2, intValue4, tieBreakByPeriodName4 != null ? tieBreakByPeriodName4.intValue() : 0, l6g.W(arrayList2)));
        if (z) {
            return new n6j(l6g.W(arrayList4));
        }
        return null;
    }
}
