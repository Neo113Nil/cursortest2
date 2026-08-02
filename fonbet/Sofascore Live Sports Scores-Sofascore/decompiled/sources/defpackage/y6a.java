package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.google.android.gms.internal.ads.zzamz;
import com.google.android.gms.internal.ads.zzas;
import com.google.gson.GsonBuilder;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class y6a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static final Class B(SerialDescriptor serialDescriptor) {
        String r = c.r(serialDescriptor.h(), "?", "", false);
        try {
            return Class.forName(r);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.J(r, ".", false)) {
                return Class.forName(me4.h("(\\.+)(?!.*\\.)", r, "\\$"));
            }
            String str = "Cannot find class with name \"" + serialDescriptor.h() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.getKind() instanceof p5h) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            a70.p(str);
            return null;
        }
    }

    public static final String C(Score score, boolean z) {
        score.getClass();
        if (z) {
            Integer num = (Integer) CollectionsKt.j0(ph0.x(new Integer[]{score.getPeriod1(), score.getPeriod2(), score.getPeriod3(), score.getPeriod4(), score.getPeriod5(), score.getPeriod6(), score.getPeriod7(), score.getPeriod8(), score.getPeriod9(), score.getPeriod10(), score.getPeriod11(), score.getPeriod12(), score.getPeriod13(), score.getOvertime()}));
            if (num != null) {
                return String.valueOf(num.intValue());
            }
            return null;
        }
        Integer display = score.getDisplay();
        if (display != null) {
            return String.valueOf(display.intValue());
        }
        return null;
    }

    public static final long D(aej aejVar, int i, boolean z, boolean z2) {
        eyc eycVar = aejVar.b;
        long j = aejVar.c;
        if (eycVar.d(i) >= eycVar.f) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(llf.b(aejVar.e(i, aejVar.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == aejVar.i(i)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(llf.b(eycVar.b(r3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j & 4294967295L))) & 4294967295L);
    }

    public static final void E(oma omaVar) {
        c6o.c0(omaVar).E();
    }

    public static final boolean F(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[3] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[4] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[5] == 1.0f && fArr[6] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[7] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[8] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[9] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[10] == 1.0f && fArr[11] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[12] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[13] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[14] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[15] == 1.0f;
    }

    public static final boolean G(a6e a6eVar, float f) {
        a6eVar.m().getClass();
        return !(((a6eVar.r() ? -f : z(a6eVar)) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : ((a6eVar.r() ? -f : z(a6eVar)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) > 0);
    }

    public static final void I(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            r3a.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float y = y(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * y);
                }
            }
            float sqrt = (float) Math.sqrt(y(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : y(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float y2 = y(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    y2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = y2 / fArr11[i14];
        }
    }

    public static final x6a J(oqf oqfVar) {
        return new x6a(Math.round(oqfVar.a), Math.round(oqfVar.b), Math.round(oqfVar.c), Math.round(oqfVar.d));
    }

    public static final z88 K(Function2 function2) {
        return k53.W(new pog(new p4f(function2, null, 9)), -2);
    }

    public static final Object L(btg btgVar, boolean z, Object obj, Function2 function2) {
        Object eb3Var;
        Object W;
        try {
            if (function2 instanceof h21) {
                i5k.e(2, function2);
                eb3Var = function2.invoke(obj, btgVar);
            } else {
                eb3Var = z9a.c(function2, obj, btgVar);
            }
        } catch (q45 e2) {
            Throwable th = e2.a;
            btgVar.V(new eb3(th, false));
            throw th;
        } catch (Throwable th2) {
            eb3Var = new eb3(th2, false);
        }
        lu3 lu3Var = lu3.a;
        if (eb3Var == lu3Var || (W = btgVar.W(eb3Var)) == lea.b) {
            return lu3Var;
        }
        btgVar.m0();
        if (!(W instanceof eb3)) {
            return lea.a(W);
        }
        if (!z) {
            Throwable th3 = ((eb3) W).a;
            if ((th3 instanceof qij) && ((qij) th3).a == btgVar) {
                if (eb3Var instanceof eb3) {
                    throw ((eb3) eb3Var).a;
                }
                return eb3Var;
            }
        }
        throw ((eb3) W).a;
    }

    public static final void M(Object obj) {
        if (obj instanceof u2g) {
            throw ((u2g) obj).a;
        }
    }

    public static final long N(LocalDate localDate) {
        localDate.getClass();
        return localDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    public static final long O(LocalDate localDate) {
        localDate.getClass();
        return N(localDate) / 1000;
    }

    public static Class P(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static String Q(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((zzamz) it.next()).a.g.o;
            if (zzas.b(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (zzas.a(str2)) {
                z = true;
            } else if (zzas.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }

    public static String R(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void a(d4j d4jVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1747279020);
        int i2 = (av8Var.e(d4jVar.ordinal()) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc b0 = l98.b0(bkh.d(xtcVar, 1.0f), 32.0f);
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.p, av8Var, 54);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_trophy_onboarding, 6, av8Var), null, bkh.l(utc.a, 96.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            String v = oea.v(d4jVar.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 130042);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(d4jVar, xtcVar, i, 21);
        }
    }

    public static final x6a b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new x6a(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void c(Boolean bool, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-533679178);
        int i2 = i | (av8Var.g(bool) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            tt2 tt2Var = null;
            int i3 = 252;
            boolean z = false;
            tc3 tc3Var = null;
            tc3 tc3Var2 = null;
            lrh lrhVar = null;
            b7 K = l6g.K(new vt2(Boolean.TRUE, oea.v(R.string.major_trophies, av8Var), z, tc3Var, tc3Var2, lrhVar, tt2Var, i3), new vt2(Boolean.FALSE, oea.v(R.string.all_trophies, av8Var), z, tc3Var, tc3Var2, lrhVar, tt2Var, i3));
            boolean z2 = (i2 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new k1e(24, function1);
                av8Var.n0(O);
            }
            trh.a(K, bool, (Function1) O, null, null, null, null, false, false, false, null, null, av8Var, (i2 << 3) & 112, 4088);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(bool, function1, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(boolean z, Function0 function0, xtc xtcVar, boolean z2, clf clfVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        boolean z3;
        xtc xtcVar3;
        eqf u;
        int i5;
        cdi cdiVar;
        Object g;
        int i6;
        int i7;
        xtc xtcVar4;
        xtc xtcVar5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(408580840);
        if ((i & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            int i9 = i3 | 3072;
            if ((i & 24576) == 0) {
                i9 |= av8Var.g(clfVar) ? 16384 : 8192;
            }
            i4 = i9 | 196608;
            if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                av8Var.W();
                z3 = z2;
                xtcVar3 = xtcVar2;
            } else {
                av8Var.Y();
                int i10 = i & 1;
                xtc xtcVar6 = utc.a;
                if (i10 == 0 || av8Var.B()) {
                    if (i8 != 0) {
                        xtcVar2 = xtcVar6;
                    }
                    i5 = 2;
                    z3 = true;
                } else {
                    av8Var.W();
                    i5 = 2;
                    z3 = z2;
                }
                av8Var.t();
                cdi a2 = a60.a(z ? 6.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ufa.I(bwc.b, av8Var), null, null, av8Var, 0, 12);
                long j = (z3 && z) ? clfVar.a : (!z3 || z) ? (z3 || !z) ? clfVar.d : clfVar.c : clfVar.b;
                if (z3) {
                    av8Var.d0(1194696477);
                    cdiVar = a2;
                    g = wih.a(j, ufa.I(bwc.c, av8Var), null, av8Var, 0, 12);
                    av8Var.s(false);
                } else {
                    cdiVar = a2;
                    av8Var.d0(1194874138);
                    g = e.g(new r13(j), av8Var);
                    av8Var.s(false);
                }
                int i11 = 3;
                if (function0 != null) {
                    i7 = i5;
                    i6 = 0;
                    xtcVar4 = xtcVar2;
                    xtcVar5 = pd0.H(xtcVar6, z, null, n5g.a(dlf.e / 2.0f, 4, 0L, false), z3, new u5g(3), function0);
                } else {
                    i6 = 0;
                    i7 = i5;
                    xtcVar4 = xtcVar2;
                    xtcVar5 = xtcVar6;
                }
                if (function0 != null) {
                    ye9 ye9Var = l7a.a;
                    xtcVar6 = yjc.a;
                }
                xtc i12 = bkh.i(l98.b0(bkh.s(xtcVar4.z(xtcVar6).z(xtcVar5), i7), 2.0f), dlf.c);
                cdi cdiVar2 = cdiVar;
                boolean g2 = av8Var.g(g) | av8Var.g(cdiVar2);
                Object O = av8Var.O();
                if (g2 || O == nf3.a) {
                    O = new aaf(i11, g, cdiVar2);
                    av8Var.n0(O);
                }
                lz.d(i6, av8Var, i12, (Function1) O);
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new e82(z, function0, xtcVar3, z3, clfVar, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        int i92 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        i4 = i92 | 196608;
        if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void e(guh guhVar, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        guh guhVar2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(426598767);
        int i2 = i | (av8Var.e(guhVar.ordinal()) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            xtc u0 = hkg.u0(bkh.d(ljg.g(av8Var, C, f50Var3, 1.0f, false), 1.0f), hkg.o0(av8Var), false, 14);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u0);
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
            k1c c2 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            wkn.k(haa.t(R.drawable.analyst_tennis_promo_modal_asset, 0, av8Var), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            e12.a(0, av8Var, n9e.q(n12.a.a(bkh.m(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 48.0f, 4.0f), uxf.d), lz.D(R.color.on_color_highlight_1, av8Var), o7g.a(20.0f)));
            av8Var.s(true);
            u6h.f(false, null, av8Var, 6);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a4 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_tennis, 6, av8Var), null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            guhVar2 = guhVar;
            String upperCase = oea.v(guhVar2.a, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            bf3.t(av8Var, true, utcVar, 4.0f, av8Var);
            udj.c(oea.v(guhVar2.b, av8Var), l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            udj.c(oea.v(guhVar2.c, av8Var), l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            w1l.s(utcVar, 8.0f, av8Var, true);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            mha.h(oea.v(guhVar2.d, av8Var), function0, l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), kqh.a, null, false, false, false, 0L, 0, 0, av8Var, (i2 & 112) | 3456, 0, 2032);
            mha.h(bf3.g(8.0f, R.string.maybe_later, av8Var, av8Var, utcVar), function02, l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), gqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i2 >> 3) & 112) | 3456, 0, 2032);
            av8Var = av8Var;
            w1l.s(utcVar, 16.0f, av8Var, true);
            xtcVar2 = utcVar;
        } else {
            guhVar2 = guhVar;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 14, guhVar2, function0, function02, xtcVar2);
        }
    }

    public static final void f(pil pilVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1957575778);
        int i2 = (av8Var.g(pilVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc e2 = bkh.e(l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 40.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e2);
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
            xtc f0 = l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (3.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc z = f0.z(new goa(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true));
            String v = oea.v(R.string.team, av8Var);
            yf8 yf8Var = xth.a;
            float f = 1.0f;
            udj.c(v, z, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.d0(367400861);
            for (r9k r9kVar : pilVar.a) {
                if (f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                goa goaVar = new goa(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, true);
                String upperCase = r9kVar.a(av8Var).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(upperCase, goaVar, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130040);
                av8Var = av8Var2;
                f = 1.0f;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(pilVar, xtcVar, i, 21);
        }
    }

    public static final void g(f4j f4jVar, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        utc utcVar;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1786735904);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(f4jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            n7g a2 = o7g.a(12.0f);
            av8Var2.d0(933727118);
            xtc A = wnn.A(n9e.q(xtcVar, lz.D(R.color.surface_2, av8Var2), a2), a2);
            utc utcVar2 = utc.a;
            a99 a99Var = nf3.a;
            if (f4jVar == null) {
                long D = lz.D(R.color.n_lv_4, av8Var2);
                Object O = av8Var2.O();
                if (O == a99Var) {
                    O = mz1.e(av8Var2);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var2.O();
                if (O2 == a99Var) {
                    O2 = nuh.q;
                    av8Var2.n0(O2);
                }
                xtc y = tol.y(utcVar2, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 15), av8Var2, 0);
                utcVar = utcVar2;
                av8Var = av8Var2;
                A = A.z(y);
            } else {
                utcVar = utcVar2;
                av8Var = av8Var2;
            }
            av8Var.s(false);
            xtc b0 = l98.b0(A, 8.0f);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
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
            if (f4jVar != null) {
                av8Var.d0(1140216914);
                xtc l = bkh.l(n12.a.a(utcVar, mv1Var), 24.0f);
                long D2 = lz.D(R.color.n_lv_4, av8Var);
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = mz1.e(av8Var);
                }
                wzc wzcVar2 = (wzc) O3;
                Object[] objArr2 = new Object[0];
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    O4 = nuh.r;
                    av8Var.n0(O4);
                }
                av8 av8Var3 = av8Var;
                kq9.b(s6a.N(R.drawable.ic_swap, 6, av8Var3), null, tol.y(l, true, false, true, D2, wzcVar2, new cyg(function0, (boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), 16), av8Var3, 0), lz.D(R.color.primary_default, av8Var3), av8Var3, 48, 0);
                av8Var = av8Var3;
                av8Var.s(false);
            } else {
                av8Var.d0(1140605468);
                av8Var.s(false);
            }
            av8Var2 = av8Var;
            wkn.a(f4jVar, null, null, null, yqo.H(-1243297707, av8Var, new r64(9, function02)), av8Var2, (i2 & 14) | 24576, 14);
            av8Var2.s(true);
        } else {
            av8Var2.W();
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new b1j(f4jVar, function0, function02, xtcVar, i, 1);
        }
    }

    public static final void h(qil qilVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1419578699);
        int i2 = (i & 6) == 0 ? (av8Var.g(qilVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(d2, D, jf9Var);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = wzj.t;
                av8Var.n0(O2);
            }
            xtc g = bkh.g(l98.d0(tol.y(q, true, true, true, D2, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, qilVar, 18), av8Var, 0), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 42.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            lv1 lv1Var = uxf.m;
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g);
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
            if (3.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc f0 = l98.f0(new goa(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
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
            av8Var.d0(1931160593);
            utc utcVar = utc.a;
            xtc p = bkh.p(bkh.e(utcVar, 40.0f), 2.0f);
            Integer num = qilVar.e;
            if (num != null) {
                p = p.z(n9e.q(utcVar, lz.D(num.intValue(), av8Var), jf9Var));
            }
            av8Var.s(false);
            nq8.h(av8Var, p);
            xtc q2 = bkh.q(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            String valueOf2 = String.valueOf(qilVar.a);
            yf8 yf8Var = xth.a;
            udj.c(valueOf2, q2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, 48, 0, 130040);
            td4.G(qilVar.b, bkh.l(utcVar, 24.0f), false, 0L, av8Var, 48, 12);
            udj.c(qilVar.c, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.d0(1318146137);
            for (String str : qilVar.d) {
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(str, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 130040);
                av8Var = av8Var2;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(qilVar, function1, xtcVar, i, 20);
        }
    }

    public static final void i(vnb vnbVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        cdi cdiVar;
        e4j e4jVar;
        e4j e4jVar2;
        Function1 function12 = function1;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-247820693);
        int i3 = (av8Var.g(vnbVar) ? 4 : 2) | i | (av8Var.i(function12) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Activity activity = (Activity) av8Var.k(ngb.a);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = goh.b(new deh(21, kx4Var, a2));
                av8Var.n0(O);
            }
            cdi cdiVar2 = (cdi) O;
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(R.string.trophy_comparison, av8Var);
            boolean i4 = av8Var.i(activity);
            Object O2 = av8Var.O();
            if (i4 || O2 == obj) {
                cdiVar = cdiVar2;
                O2 = new iq7(activity, 3);
                av8Var.n0(O2);
            } else {
                cdiVar = cdiVar2;
            }
            pea.k(v, (Function0) O2, null, 0L, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            xtc q = n9e.q(d2a.E(mha.G(utcVar, 1.0f), ((p75) cdiVar.getValue()).a, null, false, 0L, 30), lz.D(R.color.surface_1, av8Var), oyn.e);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            i4j i4jVar = (i4j) vnbVar.a();
            f4j f4jVar = (i4jVar == null || (e4jVar2 = i4jVar.a) == null) ? null : e4jVar2.a;
            i4j i4jVar2 = (i4j) vnbVar.a();
            function12 = function1;
            k(f4jVar, (i4jVar2 == null || (e4jVar = i4jVar2.b) == null) ? null : e4jVar.a, function12, av8Var, (i3 << 3) & 896);
            i4j i4jVar3 = (i4j) vnbVar.a();
            d4j d4jVar = i4jVar3 != null ? i4jVar3.e : null;
            fz8.b(x23.a, d4jVar == null || d4jVar == d4j.NoMajorTrophies, null, null, null, null, yqo.H(-476625105, av8Var, new e6i(6, vnbVar, function12)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object O3 = av8Var.O();
            if (z || O3 == obj) {
                O3 = new k4b(vnbVar, 2);
                av8Var.n0(O3);
            }
            i2 = 1;
            wkn.a(vnbVar, null, null, (Function1) O3, yqo.H(-1263716385, av8Var, new e6i(7, a2, function12)), av8Var, i5 | 24576, 6);
            av8Var.s(true);
        } else {
            i2 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new chd(vnbVar, function12, i, i2);
        }
    }

    public static final void j(l4j l4jVar, of3 of3Var, int i) {
        l4jVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1075775777);
        int i2 = (av8Var.i(l4jVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            vnb vnbVar = (vnb) rfo.x(l4jVar.f, av8Var, 0).getValue();
            boolean i3 = av8Var.i(context) | av8Var.i(l4jVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dvi(10, context, l4jVar);
                av8Var.n0(O);
            }
            i(vnbVar, (Function1) O, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(l4jVar, i, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final f4j f4jVar, final f4j f4jVar2, final Function1 function1, of3 of3Var, int i) {
        int i2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(223036928);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(f4jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(f4jVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc b0 = l98.b0(utc.a, 8.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i4 = i3 & 896;
            Object[] objArr = i4 == 256;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (objArr != false || O == a99Var) {
                O = new vbc(29, function1);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            int i5 = i3 & 14;
            boolean z2 = (i4 == 256) | (i5 == 4);
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new Function0() { // from class: a4j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = r3;
                        f4j f4jVar3 = f4jVar;
                        Function1 function12 = function1;
                        switch (i6) {
                            case 0:
                                function12.invoke(new t3j(yid.m(f4jVar3 != null ? Integer.valueOf(f4jVar3.a) : null)));
                                break;
                            default:
                                function12.invoke(new t3j(yid.m(f4jVar3 != null ? Integer.valueOf(f4jVar3.a) : null)));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            g(f4jVar, function0, (Function0) O2, goaVar, av8Var, i5);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z3 = i4 == 256;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                O3 = new b4j(r12, function1);
                av8Var.n0(O3);
            }
            Function0 function02 = (Function0) O3;
            int i6 = (i4 == 256 ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object O4 = av8Var.O();
            if (i6 != 0 || O4 == a99Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                O4 = new Function0() { // from class: a4j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = c2;
                        f4j f4jVar3 = f4jVar2;
                        Function1 function12 = function1;
                        switch (i62) {
                            case 0:
                                function12.invoke(new t3j(yid.m(f4jVar3 != null ? Integer.valueOf(f4jVar3.a) : null)));
                                break;
                            default:
                                function12.invoke(new t3j(yid.m(f4jVar3 != null ? Integer.valueOf(f4jVar3.a) : null)));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O4);
            } else {
                z = true;
            }
            g(f4jVar2, function02, (Function0) O4, goaVar2, av8Var, (i3 >> 3) & 14);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(f4jVar, f4jVar2, function1, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(i4j i4jVar, xtc xtcVar, of3 of3Var, int i) {
        Integer valueOf;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-947978813);
        int i2 = (av8Var.g(i4jVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc h = ljg.h(12.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_2, av8Var), 8.0f);
            l8g a2 = k8g.a(new ng0(10.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
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
            boolean z2 = i4jVar.d;
            e4j e4jVar = i4jVar.a;
            Integer num = null;
            if (z2) {
                if (e4jVar != null) {
                    valueOf = Integer.valueOf(e4jVar.c);
                    n(valueOf, av8Var, 0);
                    goa goaVar = new goa(1.0f, true);
                    String v = oea.v(R.string.trophies_won, av8Var);
                    yf8 yf8Var = xth.a;
                    udj.c(v, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 130040);
                    av8Var = av8Var;
                    z = i4jVar.d;
                    e4j e4jVar2 = i4jVar.b;
                    if (z) {
                        if (e4jVar2 != null) {
                            num = Integer.valueOf(e4jVar2.b);
                        }
                    } else if (e4jVar2 != null) {
                        num = Integer.valueOf(e4jVar2.c);
                    }
                    n(num, av8Var, 0);
                    av8Var.s(true);
                }
                valueOf = null;
                n(valueOf, av8Var, 0);
                goa goaVar2 = new goa(1.0f, true);
                String v2 = oea.v(R.string.trophies_won, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(v2, goaVar2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 130040);
                av8Var = av8Var;
                z = i4jVar.d;
                e4j e4jVar22 = i4jVar.b;
                if (z) {
                }
                n(num, av8Var, 0);
                av8Var.s(true);
            } else {
                if (e4jVar != null) {
                    valueOf = Integer.valueOf(e4jVar.b);
                    n(valueOf, av8Var, 0);
                    goa goaVar22 = new goa(1.0f, true);
                    String v22 = oea.v(R.string.trophies_won, av8Var);
                    yf8 yf8Var22 = xth.a;
                    udj.c(v22, goaVar22, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 130040);
                    av8Var = av8Var;
                    z = i4jVar.d;
                    e4j e4jVar222 = i4jVar.b;
                    if (z) {
                    }
                    n(num, av8Var, 0);
                    av8Var.s(true);
                }
                valueOf = null;
                n(valueOf, av8Var, 0);
                goa goaVar222 = new goa(1.0f, true);
                String v222 = oea.v(R.string.trophies_won, av8Var);
                yf8 yf8Var222 = xth.a;
                udj.c(v222, goaVar222, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 130040);
                av8Var = av8Var;
                z = i4jVar.d;
                e4j e4jVar2222 = i4jVar.b;
                if (z) {
                }
                n(num, av8Var, 0);
                av8Var.s(true);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(i4jVar, xtcVar, i, 20);
        }
    }

    public static final void m(h4j h4jVar, boolean z, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(652092739);
        int i3 = i & 6;
        p8g p8gVar = p8g.a;
        if (i3 == 0) {
            i2 = (av8Var.g(p8gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(h4jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function1) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            utc utcVar = utc.a;
            if (h4jVar != null) {
                av8Var.d0(357943002);
                xtc A = wnn.A(p8gVar.a(1.0f, utcVar, true), o7g.a(16.0f));
                boolean z2 = h4jVar.e;
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
                    O2 = nuh.t;
                    av8Var.n0(O2);
                }
                xtc c0 = l98.c0(tol.y(A, z2, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, h4jVar, 7), av8Var, 0), 8.0f, 8.0f);
                l8g a2 = k8g.a(new ng0(12.0f, true, new l1(z ? uxf.o : uxf.q, 5)), uxf.m, av8Var, 48);
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
                List j = b.j(yqo.H(895319147, av8Var, new q8i(h4jVar, 21)), yqo.H(777682378, av8Var, new m81(z, h4jVar, 14)));
                av8Var.d0(1074583444);
                if (!z) {
                    j = CollectionsKt.B0(j);
                }
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(av8Var, 0);
                }
                ljg.t(av8Var, false, true, false);
            } else {
                av8Var.d0(359616041);
                nq8.h(av8Var, p8gVar.a(1.0f, utcVar, true));
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(h4jVar, z, function1, i, 14);
        }
    }

    public static final void n(Integer num, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-961845347);
        int i2 = (av8Var.g(num) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            k1c c2 = e12.c(uxf.c, false);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_trophy_onboarding, 6, av8Var), null, bkh.l(utcVar, 48.0f), num != null ? ljg.f(av8Var, -2052967827, R.color.value, av8Var, false) : ljg.f(av8Var, -2052967306, R.color.neutral_default, av8Var, false), av8Var, 432, 0);
            xtc o = bkh.o(n9e.q(l98.f0(n12.a.a(utcVar, uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_1, av8Var), o7g.a), 20.0f, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            k1c c3 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, o);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String valueOf2 = num != null ? String.valueOf(num.intValue()) : null;
            Regex regex = yid.a;
            if (valueOf2 == null) {
                valueOf2 = "-";
            }
            yf8 yf8Var = xth.a;
            udj.c(valueOf2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(num, i, 22);
        }
    }

    public static final void o(Pair pair, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2017046907);
        int i2 = (av8Var.g(pair) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc o = bkh.o(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, o);
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
            int i3 = ((i2 << 6) & 7168) | 390;
            m((h4j) pair.a, true, function1, av8Var, i3);
            m((h4j) pair.b, false, function1, av8Var, i3);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(pair, function1, xtcVar, i, 10);
        }
    }

    public static final void p(sil silVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        boolean z;
        int i2;
        silVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-669287906);
        int i3 = i | (av8Var.g(silVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
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
            String v = oea.v(R.string.standings, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            String v2 = oea.v(R.string.full_view, av8Var);
            int i4 = i3 & 112;
            boolean z2 = (i4 == 32) | ((i3 & 14) == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                z = true;
                O = new ufl(1 == true ? 1 : 0, function1, silVar);
                av8Var.n0(O);
            } else {
                z = true;
            }
            tz9.s(0, 4, av8Var, null, v2, (Function0) O);
            av8Var.s(z);
            xtc O2 = kda.O(bkh.d(utcVar, 1.0f), "wc26_group_chip", av8Var);
            gv9 gv9Var = silVar.b;
            gv9 gv9Var2 = silVar.c;
            String str = silVar.a;
            jrh jrhVar = jrh.m;
            boolean z3 = i4 == 32;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                O3 = new fuj(12, function1);
                av8Var.n0(O3);
            }
            int i5 = i4;
            trh.a(gv9Var, str, (Function1) O3, O2, null, null, jrhVar, false, false, false, null, null, av8Var, 1572864, 4016);
            av8Var = av8Var;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            Iterator p = ljg.p(av8Var, C3, f50Var3, 1874198918, gv9Var2);
            int i6 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                ril rilVar = (ril) next;
                av8Var.a0(-339515375, rilVar.getKey());
                xtc F = u0a.F(utcVar, i6 == 0 ? icb.a : i6 == gv9Var2.size() + (-1) ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54);
                if (rilVar instanceof pil) {
                    av8Var.d0(-339499069);
                    f((pil) rilVar, F, av8Var, 0);
                    av8Var.s(false);
                    i2 = i5;
                } else {
                    if (!(rilVar instanceof qil)) {
                        throw dmi.h(av8Var, -339501629, false);
                    }
                    av8Var.d0(-1934293691);
                    i2 = i5;
                    h((qil) rilVar, function1, F, av8Var, i2);
                    av8Var.s(false);
                }
                av8Var.s(false);
                i5 = i2;
                i6 = i7;
            }
            ljg.t(av8Var, false, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(silVar, function1, xtcVar, i, 1);
        }
    }

    public static final String q(Object obj) {
        obj.getClass();
        GsonBuilder registerTypeHierarchyAdapter = new GsonBuilder().registerTypeHierarchyAdapter(EnumWithValue.class, new ppl());
        registerTypeHierarchyAdapter.getClass();
        try {
            return registerTypeHierarchyAdapter.setPrettyPrinting().create().toJson(obj);
        } catch (Exception e2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e2, null);
            return null;
        }
    }

    public static final void r(yia yiaVar, mze mzeVar, long j) {
        ou4 ou4Var = (ou4) yiaVar.b;
        xmk xmkVar = (xmk) ou4Var.c;
        xmk xmkVar2 = (xmk) ou4Var.b;
        boolean l = qea.l(mzeVar);
        long j2 = mzeVar.b;
        if (l) {
            mh0.m(0, r6.length, null, xmkVar2.d);
            xmkVar2.e = 0;
            mh0.m(0, r6.length, null, xmkVar.d);
            xmkVar.e = 0;
            ou4Var.a = 0L;
        }
        if (!qea.n(mzeVar)) {
            List list = mzeVar.m;
            if (list == null) {
                list = km5.a;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                gb9 gb9Var = (gb9) list.get(i);
                ou4Var.a(gb9Var.a, dnd.i(gb9Var.e, j));
                i++;
            }
            ou4Var.a(j2, dnd.i(mzeVar.n, j));
        }
        if (qea.n(mzeVar) && j2 - ou4Var.a > 40) {
            mh0.m(0, r0.length, null, xmkVar2.d);
            xmkVar2.e = 0;
            mh0.m(0, r2.length, null, xmkVar.d);
            xmkVar.e = 0;
            ou4Var.a = 0L;
        }
        ou4Var.a = j2;
    }

    public static final void s(rfe rfeVar, x9i x9iVar, boolean z) {
        int i;
        int i2;
        int i3;
        x9iVar.getClass();
        cai caiVar = x9iVar.h;
        String str = x9iVar.b;
        List list = x9iVar.c;
        List list2 = x9iVar.d;
        int ordinal = caiVar.ordinal();
        boolean z2 = true;
        List list3 = ordinal != 0 ? ordinal != 1 ? x9iVar.g : x9iVar.f : x9iVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            ((t9i) obj).a(str);
            arrayList.add(obj);
        }
        LinearLayout linearLayout = (LinearLayout) rfeVar.e;
        ImageView imageView = (ImageView) rfeVar.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) rfeVar.b;
        linearLayout.removeAllViews();
        int i4 = 8;
        boolean z3 = false;
        linearLayout.setVisibility((!x9iVar.i || (list2.isEmpty() && list.isEmpty() && arrayList.isEmpty())) ? 8 : 0);
        Iterator it = list2.iterator();
        int i5 = 0;
        while (true) {
            Throwable th = null;
            boolean z4 = z2;
            if (!it.hasNext()) {
                int i6 = 0;
                for (Object obj2 : list) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw null;
                    }
                    String str2 = (String) obj2;
                    View inflate = LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.standings_description_item_row, (ViewGroup) constraintLayout, false);
                    if (inflate == null) {
                        yhk.s("rootView");
                        return;
                    }
                    TextView textView = (TextView) inflate;
                    textView.setText(str2);
                    if (r19.size() - 1 != i6 || !arrayList.isEmpty()) {
                        Context context = textView.getContext();
                        context.getClass();
                        textView.setPaddingRelative(0, 0, 0, ao2.s(8, context));
                    }
                    linearLayout.addView(textView);
                    i6 = i7;
                }
                Iterator it2 = arrayList.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        Throwable th2 = th;
                        b.q();
                        throw th2;
                    }
                    t9i t9iVar = (t9i) next;
                    int intValue = t9iVar.a(str).intValue();
                    View inflate2 = LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.standings_statistics_legend_row, (ViewGroup) constraintLayout, false);
                    TextView textView2 = (TextView) nq8.B(R.id.full_name, inflate2);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) nq8.B(R.id.short_name, inflate2);
                        if (textView3 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) inflate2;
                            Throwable th3 = th;
                            textView3.setText(linearLayout2.getContext().getString(t9iVar.b(str)));
                            textView2.setText(linearLayout2.getContext().getString(intValue));
                            if (arrayList.size() - 1 == i8) {
                                Context context2 = linearLayout2.getContext();
                                context2.getClass();
                                int s = ao2.s(16, context2);
                                Context context3 = linearLayout2.getContext();
                                context3.getClass();
                                int s2 = ao2.s(4, context3);
                                Context context4 = linearLayout2.getContext();
                                context4.getClass();
                                int s3 = ao2.s(16, context4);
                                Context context5 = linearLayout2.getContext();
                                context5.getClass();
                                linearLayout2.setPaddingRelative(s, s2, s3, ao2.s(12, context5));
                            }
                            linearLayout.addView(linearLayout2);
                            i8 = i9;
                            th = th3;
                        } else {
                            i = R.id.short_name;
                        }
                    } else {
                        i = R.id.full_name;
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
                    return;
                }
                boolean z5 = x9iVar.i;
                if (z) {
                    z8e.s(imageView, z5);
                } else if (z5) {
                    imageView.setRotation(-180.0f);
                } else {
                    imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                constraintLayout.setOnClickListener(new qh(27, x9iVar, rfeVar, arrayList));
                return;
            }
            Object next2 = it.next();
            int i10 = i5 + 1;
            if (i5 < 0) {
                b.q();
                throw null;
            }
            fai faiVar = (fai) next2;
            pu1 b2 = pu1.b(LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.legend_item_row, constraintLayout, z3));
            LinearLayout linearLayout3 = b2.b;
            faiVar.getClass();
            Context context6 = linearLayout3.getContext();
            context6.getClass();
            int s4 = ao2.s(i4, context6);
            aba.H(linearLayout3);
            ImageView imageView2 = b2.c;
            imageView2.setPaddingRelative(s4, s4, s4, s4);
            imageView2.setImageResource(R.drawable.circle);
            List list4 = list;
            imageView2.setImageTintList(ColorStateList.valueOf(imageView2.getContext().getColor(faiVar.a)));
            b2.e.setVisibility(8);
            b2.d.setText(faiVar.b);
            linearLayout3.setBackgroundColor(0);
            if (list2.size() - 1 == i5 && list4.isEmpty() && arrayList.isEmpty()) {
                Context context7 = linearLayout3.getContext();
                context7.getClass();
                int s5 = ao2.s(8, context7);
                Context context8 = linearLayout3.getContext();
                context8.getClass();
                int s6 = ao2.s(8, context8);
                Context context9 = linearLayout3.getContext();
                context9.getClass();
                linearLayout3.setPaddingRelative(s5, 0, s6, ao2.s(16, context9));
            } else {
                if (list2.size() - 1 == i5) {
                    Context context10 = linearLayout3.getContext();
                    context10.getClass();
                    i2 = 8;
                    i3 = ao2.s(8, context10);
                } else {
                    i2 = 8;
                    i3 = 0;
                }
                Context context11 = linearLayout3.getContext();
                context11.getClass();
                int s7 = ao2.s(i2, context11);
                Context context12 = linearLayout3.getContext();
                context12.getClass();
                linearLayout3.setPaddingRelative(s7, 0, ao2.s(i2, context12), i3);
            }
            linearLayout.addView(linearLayout3);
            z2 = z4;
            i5 = i10;
            list = list4;
            i4 = 8;
            z3 = false;
        }
    }

    public static final void t(n9i n9iVar, wai waiVar, iai iaiVar, List list, boolean z) {
        int i;
        int i2;
        Integer valueOf;
        int i3;
        int i4;
        List<t9i> list2;
        int i5;
        CharSequence charSequence;
        Integer num;
        n9iVar.getClass();
        waiVar.getClass();
        boolean z2 = waiVar.h;
        iaiVar.getClass();
        list.getClass();
        ConstraintLayout constraintLayout = n9iVar.a;
        TextView textView = n9iVar.C;
        TextView textView2 = n9iVar.E;
        TextView textView3 = n9iVar.D;
        View view = n9iVar.r;
        Context context = constraintLayout.getContext();
        context.getClass();
        int s = ao2.s(52, context);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        int s2 = ao2.s(72, context2);
        Context context3 = constraintLayout.getContext();
        context3.getClass();
        int s3 = ao2.s(580, context3);
        View view2 = n9iVar.v;
        view2.setVisibility(0);
        n9iVar.s.setVisibility(8);
        View view3 = n9iVar.k;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        if (z) {
            Context context4 = constraintLayout.getContext();
            context4.getClass();
            i = ao2.s(4, context4);
        } else {
            i = 0;
        }
        tl3Var.setMarginStart(i);
        view3.setLayoutParams(tl3Var);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        if (z && z2) {
            Context context5 = constraintLayout.getContext();
            context5.getClass();
            i2 = ao2.s(4, context5);
        } else {
            i2 = 0;
        }
        tl3Var2.setMarginStart(i2);
        view2.setLayoutParams(tl3Var2);
        String str = waiVar.i;
        Integer num2 = waiVar.e;
        List list3 = waiVar.c;
        if (z2) {
            view3.setVisibility(8);
            view.setVisibility(8);
            haa.D(textView3);
            textView3.setVisibility(0);
            textView3.setText("#");
            textView2.setText(constraintLayout.getContext().getString(R.string.standings_team_rank));
            i4 = 0;
            i3 = 8;
        } else {
            view3.setVisibility(0);
            String str2 = waiVar.f;
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
            textView3.setVisibility(8);
            Integer num3 = waiVar.g;
            switch (num3 != null ? num3.intValue() : -1) {
                case 1:
                    valueOf = Integer.valueOf(R.color.prom_to_x);
                    break;
                case 2:
                    valueOf = Integer.valueOf(R.color.playoff_for_prom_to_x);
                    break;
                case 3:
                    valueOf = Integer.valueOf(R.color.prom_to_y);
                    break;
                case 4:
                    valueOf = Integer.valueOf(R.color.playoff_for_prom_to_y);
                    break;
                case 5:
                    valueOf = Integer.valueOf(R.color.other_prom_1);
                    break;
                case 6:
                    valueOf = Integer.valueOf(R.color.other_prom_2);
                    break;
                case 7:
                    valueOf = Integer.valueOf(R.color.other_prom_3);
                    break;
                case 8:
                    valueOf = Integer.valueOf(R.color.po_for_releg);
                    break;
                case 9:
                    valueOf = Integer.valueOf(R.color.releg);
                    break;
                default:
                    valueOf = null;
                    break;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                view.setVisibility(0);
                view3.setBackgroundColor(constraintLayout.getContext().getColor(intValue));
                view.setBackgroundColor(constraintLayout.getContext().getColor(intValue));
                i3 = 8;
            } else {
                view3.setBackground(null);
                i3 = 8;
                view.setVisibility(8);
            }
            i4 = 20;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setVisibility(i3);
        }
        int ordinal = waiVar.b.ordinal();
        if (ordinal == 0) {
            list2 = waiVar.d;
        } else if (ordinal != 1) {
            if (Intrinsics.c(str, Sports.BASKETBALL)) {
                t9i t9iVar = t9i.w;
                if (list3.contains(t9iVar)) {
                    list2 = kotlin.collections.a.c(t9iVar);
                }
            }
            list2 = km5.a;
        } else {
            list2 = list3;
        }
        int ordinal2 = waiVar.b.ordinal();
        if (ordinal2 == 0) {
            textView.setVisibility(8);
            i5 = 32;
        } else if (ordinal2 != 2) {
            textView.setVisibility(8);
            num = iaiVar.a < s3 ? null : 32;
            if (num != null) {
                i5 = num.intValue();
            }
            i5 = 0;
        } else {
            textView.setVisibility(!list3.isEmpty() ? 0 : 8);
            textView.setGravity(!list2.isEmpty() ? 17 : 8388613);
            num = iaiVar.a < s3 ? null : 32;
            if (num != null) {
                i5 = num.intValue();
            }
            i5 = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
        layoutParams3.getClass();
        int i6 = i5 + 108 + i4;
        Context context6 = constraintLayout.getContext();
        context6.getClass();
        ((tl3) layoutParams3).N = ao2.s(i6, context6);
        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(constraintLayout.getContext().getString(((t9i) it2.next()).b(str)));
        }
        int i7 = 0;
        for (t9i t9iVar2 : list2) {
            if (i7 < list.size()) {
                TextView textView4 = (TextView) list.get(i7);
                switch (t9iVar2.ordinal()) {
                    case 23:
                        if (num2 == null || (charSequence = String.valueOf(num2.intValue() - 2)) == null) {
                            Object obj = arrayList.get(i7);
                            obj.getClass();
                            charSequence = (String) obj;
                            break;
                        }
                        break;
                    case 24:
                        if (num2 == null || (charSequence = String.valueOf(num2.intValue() - 1)) == null) {
                            Object obj2 = arrayList.get(i7);
                            obj2.getClass();
                            charSequence = (String) obj2;
                            break;
                        }
                        break;
                    case 25:
                        if (num2 == null || (charSequence = String.valueOf(num2.intValue())) == null) {
                            Object obj3 = arrayList.get(i7);
                            obj3.getClass();
                            charSequence = (String) obj3;
                            break;
                        }
                        break;
                    default:
                        charSequence = (CharSequence) arrayList.get(i7);
                        break;
                }
                textView4.setText(charSequence);
                ((View) list.get(i7)).setVisibility(0);
                if (t9iVar2.c) {
                    ViewGroup.LayoutParams layoutParams4 = ((TextView) list.get(i7)).getLayoutParams();
                    layoutParams4.getClass();
                    ((tl3) layoutParams4).H = 1.5f;
                    ViewGroup.LayoutParams layoutParams5 = ((TextView) list.get(i7)).getLayoutParams();
                    layoutParams5.getClass();
                    ((tl3) layoutParams5).P = s2;
                } else {
                    ViewGroup.LayoutParams layoutParams6 = ((TextView) list.get(i7)).getLayoutParams();
                    layoutParams6.getClass();
                    ((tl3) layoutParams6).H = 1.0f;
                    ViewGroup.LayoutParams layoutParams7 = ((TextView) list.get(i7)).getLayoutParams();
                    layoutParams7.getClass();
                    ((tl3) layoutParams7).P = s;
                }
                i9a.H((TextView) list.get(i7), 8, 12);
                i7++;
            }
        }
        int size = list.size();
        while (i7 < size) {
            ((View) list.get(i7)).setVisibility(8);
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
    
        if (r8.equals("OTL") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0233, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0230, code lost:
    
        if (r8.equals("L") == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(n9i n9iVar, bbi bbiVar, iai iaiVar, List list, Map map, boolean z) {
        int i;
        int i2;
        int i3;
        Integer num;
        String obj;
        boolean z2;
        String str;
        int i4;
        int i5;
        int i6;
        bbiVar.getClass();
        boolean z3 = bbiVar.h;
        iaiVar.getClass();
        list.getClass();
        ConstraintLayout constraintLayout = n9iVar.a;
        TextView textView = n9iVar.D;
        TextView textView2 = n9iVar.E;
        View view = n9iVar.u;
        View view2 = n9iVar.s;
        ImageView imageView = n9iVar.F;
        int color = constraintLayout.getContext().getColor(R.color.success);
        int color2 = constraintLayout.getContext().getColor(R.color.error);
        int color3 = constraintLayout.getContext().getColor(R.color.neutral_default);
        int color4 = constraintLayout.getContext().getColor(R.color.n_lv_4);
        Context context = constraintLayout.getContext();
        context.getClass();
        int s = ao2.s(52, context);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        int s2 = ao2.s(72, context2);
        Context context3 = constraintLayout.getContext();
        context3.getClass();
        int s3 = ao2.s(580, context3);
        View view3 = n9iVar.k;
        view3.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        List<t9i> list2 = bbiVar.f;
        String str2 = bbiVar.b;
        int i7 = s;
        StandingsTableRow standingsTableRow = bbiVar.c;
        int i8 = s2;
        if (z3) {
            Context context4 = constraintLayout.getContext();
            context4.getClass();
            i = ao2.s(2, context4);
        } else {
            i = 0;
        }
        ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = i;
        if (z3) {
            Context context5 = constraintLayout.getContext();
            context5.getClass();
            i2 = ao2.s(2, context5);
        } else {
            i2 = 0;
        }
        ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin = i2;
        if (z) {
            Context context6 = constraintLayout.getContext();
            context6.getClass();
            i3 = ao2.s(4, context6);
        } else {
            i3 = 0;
        }
        tl3Var.setMarginStart(i3);
        view3.setLayoutParams(tl3Var);
        n9iVar.C.setVisibility(8);
        n9iVar.r.setVisibility(8);
        view2.setVisibility(bbiVar.i ? 0 : 8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setVisibility(8);
        }
        int ordinal = bbiVar.d.ordinal();
        if (ordinal == 0) {
            view.setBackgroundColor(view.getContext().getColor(R.color.home_primary_highlight));
        } else if (ordinal == 1) {
            view.setBackgroundColor(view.getContext().getColor(R.color.away_primary_highlight));
        } else if (ordinal != 2) {
            view.setBackground(null);
        } else {
            view.setBackgroundColor(view.getContext().getColor(R.color.neutral_highlight));
        }
        haa.C(textView);
        haa.C(textView2);
        textView.setText(String.valueOf(standingsTableRow.getPosition()));
        String shortName = standingsTableRow.getTeam().getShortName();
        if (shortName == null || shortName.length() == 0) {
            Team team = standingsTableRow.getTeam();
            Context context7 = constraintLayout.getContext();
            context7.getClass();
            textView2.setText(tba.p(context7, team));
        } else {
            Team team2 = standingsTableRow.getTeam();
            Context context8 = constraintLayout.getContext();
            context8.getClass();
            textView2.setText(tba.A(context8, team2));
        }
        as9.o(imageView, standingsTableRow.getTeam().getId());
        int ordinal2 = bbiVar.e.ordinal();
        if (ordinal2 == 0) {
            imageView.setVisibility(0);
            for (Map.Entry entry : map.entrySet()) {
                ((View) entry.getKey()).setVisibility(8);
                ((View) entry.getValue()).setVisibility(8);
            }
        } else if (ordinal2 == 1) {
            imageView.setVisibility(iaiVar.a >= s3 ? 0 : 8);
            for (Map.Entry entry2 : map.entrySet()) {
                ((View) entry2.getKey()).setVisibility(8);
                ((View) entry2.getValue()).setVisibility(8);
            }
        } else {
            if (ordinal2 != 2) {
                zzl.b();
                return;
            }
            imageView.setVisibility(iaiVar.a >= s3 ? 0 : 8);
            Iterator it2 = CollectionsKt.X0(map.entrySet()).iterator();
            while (true) {
                sc5 sc5Var = (sc5) it2;
                if (!sc5Var.b.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                int i9 = indexedValue.a;
                Map.Entry entry3 = (Map.Entry) indexedValue.b;
                TextView textView3 = (TextView) entry3.getKey();
                ImageView imageView2 = (ImageView) entry3.getValue();
                String str3 = (String) CollectionsKt.a0(i9, standingsTableRow.getForm());
                if (str3 == null) {
                    str3 = "";
                }
                textView3.setVisibility(0);
                Context context9 = constraintLayout.getContext();
                context9.getClass();
                textView3.setText(wba.A(context9, str3));
                String str4 = (String) CollectionsKt.a0(i9, standingsTableRow.getForm());
                if (str4 != null) {
                    int hashCode = str4.hashCode();
                    if (hashCode != 68) {
                        if (hashCode != 76) {
                            if (hashCode != 87) {
                                if (hashCode == 78599) {
                                }
                            } else if (str4.equals("W")) {
                                i6 = color;
                            }
                        }
                    } else if (str4.equals("D")) {
                        i6 = color3;
                    }
                    if (i9 != 0 || i9 == map.size() - 1) {
                        textView3.setBackgroundTintList(ColorStateList.valueOf(i6));
                    } else {
                        textView3.setBackgroundColor(i6);
                    }
                    imageView2.setVisibility(!str3.equals("OTL") ? 0 : 8);
                }
                i6 = color4;
                if (i9 != 0) {
                }
                textView3.setBackgroundTintList(ColorStateList.valueOf(i6));
                imageView2.setVisibility(!str3.equals("OTL") ? 0 : 8);
            }
        }
        int ordinal3 = bbiVar.e.ordinal();
        if (ordinal3 == 0) {
            list2 = bbiVar.g;
        } else if (ordinal3 != 1) {
            if (Intrinsics.c(str2, Sports.BASKETBALL)) {
                t9i t9iVar = t9i.w;
                if (list2.contains(t9iVar)) {
                    list2 = kotlin.collections.a.c(t9iVar);
                }
            }
            list2 = km5.a;
        }
        int i10 = 0;
        for (t9i t9iVar2 : list2) {
            if (i10 >= list.size()) {
                i5 = i7;
                i4 = i8;
            } else if (Intrinsics.c(str2, Sports.BASKETBALL) && t9iVar2 == t9i.w) {
                Object invoke = t9iVar2.d.invoke(standingsTableRow);
                int m = yid.m(invoke instanceof Integer ? (Integer) invoke : null);
                if (m > 0) {
                    obj = constraintLayout.getContext().getString(R.string.any_sport_wins_short) + m;
                } else {
                    if (m < 0) {
                        obj = constraintLayout.getContext().getString(R.string.any_sport_losses_short) + Math.abs(m);
                    }
                    obj = null;
                }
                Regex regex = yid.a;
                if (obj == null) {
                }
                ((TextView) list.get(i10)).setText(obj);
                z2 = t9iVar2.c;
                str = t9iVar2.b;
                if (z2) {
                }
                ((View) list.get(i10)).setVisibility(0);
                if (!str.equals(standingsTableRow.getLiveMatchWinnerCodeColumn())) {
                }
                haa.B((TextView) list.get(i10));
                i10++;
            } else {
                Object invoke2 = t9iVar2.d.invoke(standingsTableRow);
                if (invoke2 != null) {
                    obj = invoke2.toString();
                    Regex regex2 = yid.a;
                    if (obj == null) {
                        obj = "-";
                    }
                    ((TextView) list.get(i10)).setText(obj);
                    z2 = t9iVar2.c;
                    str = t9iVar2.b;
                    if (z2) {
                        ViewGroup.LayoutParams layoutParams2 = ((TextView) list.get(i10)).getLayoutParams();
                        layoutParams2.getClass();
                        ((tl3) layoutParams2).H = 1.5f;
                        ViewGroup.LayoutParams layoutParams3 = ((TextView) list.get(i10)).getLayoutParams();
                        layoutParams3.getClass();
                        i4 = i8;
                        ((tl3) layoutParams3).P = i4;
                        i5 = i7;
                    } else {
                        i4 = i8;
                        ViewGroup.LayoutParams layoutParams4 = ((TextView) list.get(i10)).getLayoutParams();
                        layoutParams4.getClass();
                        ((tl3) layoutParams4).H = 1.0f;
                        ViewGroup.LayoutParams layoutParams5 = ((TextView) list.get(i10)).getLayoutParams();
                        layoutParams5.getClass();
                        i5 = i7;
                        ((tl3) layoutParams5).P = i5;
                    }
                    ((View) list.get(i10)).setVisibility(0);
                    if (!str.equals(standingsTableRow.getLiveMatchWinnerCodeColumn())) {
                        igf igfVar = t9i.f;
                        if (!str.equals("points") || i10 != list2.size() - 1 || standingsTableRow.getLiveMatchWinnerCodeColumn() == null) {
                            haa.C((TextView) list.get(i10));
                            i10++;
                        }
                    }
                    haa.B((TextView) list.get(i10));
                    i10++;
                }
                obj = null;
                Regex regex22 = yid.a;
                if (obj == null) {
                }
                ((TextView) list.get(i10)).setText(obj);
                z2 = t9iVar2.c;
                str = t9iVar2.b;
                if (z2) {
                }
                ((View) list.get(i10)).setVisibility(0);
                if (!str.equals(standingsTableRow.getLiveMatchWinnerCodeColumn())) {
                }
                haa.B((TextView) list.get(i10));
                i10++;
            }
            i8 = i4;
            i7 = i5;
        }
        int size = list.size();
        while (i10 < size) {
            ((View) list.get(i10)).setVisibility(8);
            i10++;
        }
        if (standingsTableRow.getPromotion() != null) {
            switch (bbiVar.j) {
                case 1:
                    num = Integer.valueOf(R.color.prom_to_x);
                    break;
                case 2:
                    num = Integer.valueOf(R.color.playoff_for_prom_to_x);
                    break;
                case 3:
                    num = Integer.valueOf(R.color.prom_to_y);
                    break;
                case 4:
                    num = Integer.valueOf(R.color.playoff_for_prom_to_y);
                    break;
                case 5:
                    num = Integer.valueOf(R.color.other_prom_1);
                    break;
                case 6:
                    num = Integer.valueOf(R.color.other_prom_2);
                    break;
                case 7:
                    num = Integer.valueOf(R.color.other_prom_3);
                    break;
                case 8:
                    num = Integer.valueOf(R.color.po_for_releg);
                    break;
                case 9:
                    num = Integer.valueOf(R.color.releg);
                    break;
            }
            if (num != null) {
                view2.setBackground(null);
                view3.setBackground(null);
                return;
            } else {
                int color5 = constraintLayout.getContext().getColor(num.intValue());
                view2.setBackgroundColor(color5);
                view3.setBackgroundColor(color5);
                return;
            }
        }
        num = null;
        if (num != null) {
        }
    }

    public static final void v(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        fb3 w = w(function1, obj, null);
        if (w != null) {
            qx9.A(coroutineContext, w);
        }
    }

    public static final fb3 w(Function1 function1, Object obj, fb3 fb3Var) {
        try {
            function1.invoke(obj);
            return fb3Var;
        } catch (Throwable th) {
            if (fb3Var == null || fb3Var.getCause() == th) {
                return new fb3(13, mz1.m(obj, "Exception in undelivered element handler for "), th);
            }
            de6.a(fb3Var, th);
            return fb3Var;
        }
    }

    public static final u2g x(Throwable th) {
        th.getClass();
        return new u2g(th);
    }

    public static final float y(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final float z(a6e a6eVar) {
        return a6eVar.m().e == ewd.b ? Float.intBitsToFloat((int) (a6eVar.q() >> 32)) : Float.intBitsToFloat((int) (a6eVar.q() & 4294967295L));
    }

    public abstract Object A(KClass kClass);

    public abstract y6a H(KClass kClass, Object obj);
}
