package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vg4 {
    public static final t3e a = l98.C(24.0f, 10.0f, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
    public static final float b = 16.0f;

    public static final void a(final Long l, final Function1 function1, final kg2 kg2Var, final IntRange intRange, final gi4 gi4Var, final di4 di4Var, final ci4 ci4Var, final ce8 ce8Var, of3 of3Var, final int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-432341251);
        int i3 = i | (av8Var.g(l) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(kg2Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(intRange) ? a.o : 1024) | (av8Var.g(gi4Var) ? 16384 : 8192) | (av8Var.g(di4Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(ci4Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(ce8Var) ? 8388608 : 4194304);
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean g = av8Var.g(kg2Var.a);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (g || O == obj) {
                Locale locale = kg2Var.a;
                String W = StringsKt.W(c.r(me4.h("y{1,4}", me4.h("M{1,2}", me4.h("d{1,2}", me4.h("[^dMy/\\-.]", DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale), ""), "dd"), "MM"), "yyyy"), "My", "M/y", false), ".");
                txb b2 = new Regex("[/\\-.]").b(W);
                b2.getClass();
                MatchGroup c = b2.c.c(0);
                c.getClass();
                O = new qg4(W, c.a.charAt(0));
                av8Var.n0(O);
            }
            qg4 qg4Var = (qg4) O;
            String B = cga.B(R.string.m3c_date_input_invalid_for_pattern, av8Var);
            String B2 = cga.B(R.string.m3c_date_input_invalid_year_range, av8Var);
            String B3 = cga.B(R.string.m3c_date_input_invalid_not_allowed, av8Var);
            boolean g2 = av8Var.g(qg4Var) | ((57344 & i3) == 16384);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                i2 = 0;
                Object wg4Var = new wg4(intRange, di4Var, qg4Var, gi4Var, B, B2, B3);
                av8Var.n0(wg4Var);
                O2 = wg4Var;
            } else {
                i2 = 0;
            }
            wg4 wg4Var2 = (wg4) O2;
            String upperCase = qg4Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String B4 = cga.B(R.string.m3c_date_input_label, av8Var);
            xtc a0 = l98.a0(bkh.d(utc.a, 1.0f), a);
            wg4Var2.getClass();
            Locale locale2 = kg2Var.a;
            tc3 H = yqo.H(-752164549, av8Var, new kp1(2, B4, upperCase));
            tc3 H2 = yqo.H(-1179434278, av8Var, new tg4(upperCase, i2));
            int i4 = i3 << 3;
            b(a0, l, function1, kg2Var, H, H2, wg4Var2, qg4Var, locale2, ci4Var, ce8Var, av8Var, (i4 & 7168) | (i4 & 112) | 1794054 | (i4 & 896), (i3 >> 18) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(l, function1, kg2Var, intRange, gi4Var, di4Var, ci4Var, ce8Var, i) { // from class: rg4
                public final /* synthetic */ Long a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ kg2 c;
                public final /* synthetic */ IntRange d;
                public final /* synthetic */ gi4 e;
                public final /* synthetic */ di4 f;
                public final /* synthetic */ ci4 g;
                public final /* synthetic */ ce8 h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(1);
                    vg4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj2, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    public static final void b(final xtc xtcVar, Long l, final Function1 function1, final kg2 kg2Var, final tc3 tc3Var, final tc3 tc3Var2, final wg4 wg4Var, final qg4 qg4Var, final Locale locale, ci4 ci4Var, final ce8 ce8Var, of3 of3Var, final int i, final int i2) {
        int i3;
        int i4;
        av8 av8Var;
        ci4 ci4Var2;
        Object[] objArr;
        int i5;
        int i6;
        e1d e1dVar;
        Object gjVar;
        Object obj;
        int i7;
        ?? r0;
        qg4 qg4Var2;
        e1d e1dVar2;
        final Long l2 = l;
        Object obj2 = kg2Var;
        Object obj3 = locale;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1456309913);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.g(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var2.i(obj2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var2.i(tc3Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= av8Var2.i(tc3Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i3 |= av8Var2.e(0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= av8Var2.g(wg4Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= av8Var2.g(qg4Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= av8Var2.i(obj3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (av8Var2.g(ci4Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(ce8Var) ? 32 : 16;
        }
        int i8 = i4;
        if (av8Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            Object[] objArr2 = new Object[0];
            Object O = av8Var2.O();
            Object obj4 = nf3.a;
            if (O == obj4) {
                O = new wc4(2);
                av8Var2.n0(O);
            }
            e1d e1dVar3 = (e1d) o3a.L(Arrays.copyOf(objArr2, 0), new y3g(9, new eee((byte) 0, 20), new osf(7)), null, (Function0) O, av8Var2, 3456, 0);
            Object[] objArr3 = {(wcj) e1dVar3.getValue()};
            boolean g = av8Var2.g(e1dVar3);
            int i9 = i3 & 29360128;
            int i10 = i3 & 234881024;
            int i11 = i3 & 3670016;
            boolean i12 = g | (i9 == 8388608) | av8Var2.i(obj2) | (i10 == 67108864) | av8Var2.i(obj3) | (i11 == 1048576);
            Object O2 = av8Var2.O();
            if (i12 || O2 == obj4) {
                objArr = objArr3;
                i5 = 67108864;
                i6 = i3;
                O2 = new l31(wg4Var, obj2, qg4Var, obj3, e1dVar3, 2);
                obj2 = obj2;
                e1dVar = e1dVar3;
                av8Var2.n0(O2);
            } else {
                objArr = objArr3;
                e1dVar = e1dVar3;
                i5 = 67108864;
                i6 = i3;
            }
            e1d e1dVar4 = (e1d) o3a.N(objArr, (Function0) O2, av8Var2, 0);
            boolean R = StringsKt.R((CharSequence) e1dVar4.getValue());
            float f = b;
            if (!R) {
                if (!((16.0f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (4.0f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (16.0f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    p3a.a("Padding must be non-negative");
                }
                f -= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + 4.0f;
            }
            float f2 = f;
            wcj wcjVar = (wcj) e1dVar.getValue();
            boolean g2 = (i9 == 8388608) | ((i6 & 896) == 256) | (i10 == i5) | av8Var2.g(e1dVar) | av8Var2.g(e1dVar4) | av8Var2.i(obj2) | av8Var2.i(obj3) | (i11 == 1048576);
            Object O3 = av8Var2.O();
            if (g2 || O3 == obj4) {
                e1d e1dVar5 = e1dVar;
                obj = obj4;
                i7 = i6;
                r0 = 0;
                Object obj5 = obj2;
                gjVar = new gj(qg4Var, e1dVar4, function1, obj5, obj3, wg4Var, e1dVar5, 1);
                qg4Var2 = qg4Var;
                obj2 = obj5;
                obj3 = obj3;
                e1dVar2 = e1dVar4;
                e1dVar = e1dVar5;
                av8Var2.n0(gjVar);
            } else {
                qg4Var2 = qg4Var;
                e1dVar2 = e1dVar4;
                obj = obj4;
                r0 = 0;
                gjVar = O3;
                i7 = i6;
            }
            Function1 function12 = (Function1) gjVar;
            av8Var = av8Var2;
            xtc f0 = l98.f0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
            boolean g3 = av8Var.g(e1dVar2);
            Object O4 = av8Var.O();
            if (g3 || O4 == obj) {
                O4 = new w30(17, e1dVar2);
                av8Var.n0(O4);
            }
            xtc a2 = o3h.a(f0, r0, (Function1) O4);
            xtc xtcVar2 = utc.a;
            if (ce8Var != null) {
                xtcVar2 = lz.G(xtcVar2, ce8Var);
            }
            int i13 = i7;
            ci4Var2 = ci4Var;
            ufa.a(wcjVar, function12, a2.z(xtcVar2), false, null, tc3Var, tc3Var2, yqo.H(-357881838, av8Var, new ug4(r0, e1dVar2)), !StringsKt.R((CharSequence) e1dVar2.getValue()), new vk4(qg4Var2), new kja(r0, 3, 7, 113), null, true, 0, 0, null, ci4Var2.y, av8Var, (i13 << 6) & 33030144);
            Unit unit = Unit.a;
            boolean z = (i8 & 112) == 32 ? true : r0;
            Object O5 = av8Var.O();
            if (z || O5 == obj) {
                O5 = new j44(ce8Var, null, 2);
                av8Var.n0(O5);
            }
            hz8.o(av8Var, unit, (Function2) O5);
            boolean i14 = ((i13 & 112) == 32 ? true : r0) | av8Var.i(obj2) | (i10 != 67108864 ? r0 : true) | av8Var.i(obj3) | av8Var.g(e1dVar);
            Object O6 = av8Var.O();
            if (i14 || O6 == obj) {
                Object w32Var = new w32(l, obj2, qg4Var, locale, e1dVar, null, 2);
                l2 = l;
                av8Var.n0(w32Var);
                O6 = w32Var;
            } else {
                l2 = l;
            }
            hz8.o(av8Var, l2, (Function2) O6);
        } else {
            av8Var = av8Var2;
            ci4Var2 = ci4Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final ci4 ci4Var3 = ci4Var2;
            u.d = new Function2() { // from class: sg4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int K = aba.K(i | 1);
                    int K2 = aba.K(i2);
                    vg4.b(xtc.this, l2, function1, kg2Var, tc3Var, tc3Var2, wg4Var, qg4Var, locale, ci4Var3, ce8Var, (of3) obj6, K, K2);
                    return Unit.a;
                }
            };
        }
    }
}
