package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.StrictMode;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.n;
import com.appsflyer.internal.i;
import com.blaze.blazesdk.features.shared.models.shared_models.PosterDto;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzagn;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.network.response.MediaHighlightedItemResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ranking.FifaRankingActivity;
import com.sofascore.results.ranking.RugbyRankingActivity;
import com.sofascore.results.ranking.TennisRankingsActivity;
import com.sofascore.results.ranking.TennisUtrRankingsActivity;
import com.sofascore.results.ranking.UefaRankingsActivity;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class jaa implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static AdError A(int i2, String str) {
        return new AdError(i2, str, "com.pangle.ads");
    }

    public static int B(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b5 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static Intent C(Context context, jmf jmfVar, Integer num) {
        Class cls;
        switch (jmfVar.ordinal()) {
            case 0:
            case 1:
                cls = TennisRankingsActivity.class;
                break;
            case 2:
                cls = UefaRankingsActivity.class;
                break;
            case 3:
                cls = RugbyRankingActivity.class;
                break;
            case 4:
                cls = FifaRankingActivity.class;
                break;
            case 5:
            case 6:
                cls = TennisUtrRankingsActivity.class;
                break;
            default:
                zzl.b();
                return null;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("category", jmfVar);
        intent.putExtra("INITIAL_ID", num);
        return intent;
    }

    public static final int D(long j) {
        int i2 = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i2 | 2 : i2;
    }

    public static boolean E(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = x5d.a;
            }
        } else {
            if (!(collection instanceof aw9)) {
                return false;
            }
            obj = ((aw9) collection).d;
        }
        return comparator.equals(obj);
    }

    public static int F(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean G() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        return requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || (n9e.I() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD);
    }

    public static long H(long... jArr) {
        z1a.s(jArr.length > 0);
        long j = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static final Pair I(jfj jfjVar) {
        List split$default;
        Integer num = jfjVar.b;
        String str = jfjVar.a;
        String obj = str != null ? StringsKt.l0(str).toString() : null;
        int i2 = 4;
        if (obj != null && StringsKt.J(obj, U3.j.c, false)) {
            split$default = StringsKt__StringsKt.split$default(obj, new String[]{U3.j.c}, false, 2, 2, null);
            return new Pair(new jfj(i2, StringsKt.l0((String) split$default.get(0)).toString(), num), new jfj(i2, StringsKt.l0((String) split$default.get(1)).toString(), num));
        }
        if (obj != null && StringsKt.J(obj, "(", false) && c.n(obj, ")", false)) {
            int P = StringsKt.P(obj, "(", 0, false, 6);
            return new Pair(new jfj(i2, StringsKt.l0(obj.substring(0, P)).toString(), num), new jfj(i2, StringsKt.l0(obj.substring(P)).toString(), num));
        }
        String str2 = "-";
        if (obj == null) {
            obj = "-";
        }
        return new Pair(new jfj(i2, obj, Integer.valueOf(num != null ? num.intValue() : R.color.n_lv_1)), new jfj(i2, str2, Integer.valueOf(R.color.n_lv_1)));
    }

    public static final jfj J(jfj jfjVar, boolean z, String str) {
        if (!z) {
            return jfjVar;
        }
        String str2 = jfjVar.a;
        return jfj.a(jfjVar, (str2 != null ? StringsKt.l0(str2).toString() : null) + str, null, 6);
    }

    public static n1k K(List list, kz2 kz2Var) {
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Point2D point2D = (Point2D) it.next();
            double doubleValue = Double.valueOf(point2D.getY()).doubleValue();
            if (doubleValue >= kz2Var.a && doubleValue <= kz2Var.b) {
                if (point2D.getX() <= 33.3d) {
                    i2++;
                } else if (point2D.getX() < 66.7d) {
                    i3++;
                } else {
                    i4++;
                }
            }
        }
        return new n1k(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static final j9d L(of3 of3Var) {
        View view = (View) ((av8) of3Var).k(nz.f);
        av8 av8Var = (av8) of3Var;
        hsk hskVar = (hsk) av8Var.k(dh3.t);
        boolean g2 = av8Var.g(view) | av8Var.g(hskVar);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            hskVar.c();
            O = new j9d(view);
            av8Var.n0(O);
        }
        return (j9d) O;
    }

    public static int M(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void N(Context context, jmf jmfVar, Integer num) {
        context.getClass();
        jmfVar.getClass();
        context.startActivity(C(context, jmfVar, num));
    }

    public static int[] O(Collection collection) {
        if (collection instanceof iaa) {
            iaa iaaVar = (iaa) collection;
            return Arrays.copyOfRange(iaaVar.a, iaaVar.b, iaaVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0 > r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r10 > r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10 < r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0 < r11) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long P(int i2, int i3, int[] iArr, long j) {
        float f2;
        float intBitsToFloat;
        float f3;
        float intBitsToFloat2;
        float intBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - (i2 * (-1.0f));
        float intBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & 4294967295L)) - (i3 * (-1.0f));
        int i4 = (int) (j >> 32);
        if (Float.intBitsToFloat(i4) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i4);
        } else {
            f2 = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i4);
        }
        int i5 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i5) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i5);
        } else {
            f3 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i5);
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static Integer Q(String str) {
        byte b2;
        Long valueOf;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    b2 = okb.a[charAt];
                } else {
                    byte[] bArr = okb.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            char charAt2 = str.charAt(i3);
                            if (charAt2 < 128) {
                                b3 = okb.a[charAt2];
                            } else {
                                byte[] bArr2 = okb.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b3;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i3 = i4;
                        } else if (i2 != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static Object R(py3 py3Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return py3Var.zzh();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static final void a(ot9 ot9Var, xtc xtcVar, op3 op3Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-941517612);
        int i3 = i2 & (-1879055361);
        bpf bpfVar = (bpf) av8Var.k(lhb.a);
        if (bpfVar == null) {
            bpfVar = f7a.t((Context) av8Var.k(nz.b));
        }
        int i4 = i3 << 3;
        gvd.a(ot9Var, bpfVar, xtcVar, op3Var, av8Var, (i2 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i4 & 7168) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 0);
        eqf u = av8Var.u();
        if (u == null) {
            return;
        }
        u.d = new e00(ot9Var, xtcVar, op3Var, i2, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0270, code lost:
    
        if (r14.h(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xtc xtcVar, qpa qpaVar, s39 s39Var, p3e p3eVar, p78 p78Var, boolean z, myd mydVar, pg0 pg0Var, lg0 lg0Var, Function1 function1, of3 of3Var, int i2, int i3) {
        int i4;
        int i5;
        qpa qpaVar2;
        av8 av8Var;
        boolean z2;
        boolean g2;
        Object dpaVar;
        qpa qpaVar3;
        tsa tsaVar;
        boolean z3;
        boolean z4;
        KProperty0 kProperty0;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(708740370);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(qpaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? av8Var2.g(s39Var) : av8Var2.i(s39Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.g(p3eVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var2.h(false) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= av8Var2.h(true) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= av8Var2.g(p78Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= av8Var2.h(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= av8Var2.g(mydVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= av8Var2.g(pg0Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (av8Var2.g(lg0Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.i(function1) ? 32 : 16;
        }
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            av8Var2.Y();
            if ((i2 & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            int i6 = i4 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i5 & 112);
            e1d g3 = e.g(function1, av8Var2);
            int i9 = i4;
            boolean z5 = (((i8 & 14) ^ 6) > 4 && av8Var2.g(qpaVar)) || (i8 & 6) == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z5 || O == a99Var) {
                p4h p4hVar = p4h.g;
                v30 v30Var = new v30(28, g3);
                l2a l2aVar = goh.a;
                O = new apa(0, 0, cdi.class, new ay4(new ij8(22, new ay4(v30Var, p4hVar), qpaVar), p4hVar), U3.i.X, "getValue()Ljava/lang/Object;");
                av8Var2.n0(O);
            }
            KProperty0 kProperty02 = (KProperty0) O;
            int i10 = i7 | ((i9 >> 9) & 112);
            boolean z6 = ((((i10 & 14) ^ 6) > 4 && av8Var2.g(qpaVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && av8Var2.h(false)) || (i10 & 48) == 32);
            Object O2 = av8Var2.O();
            if (z6 || O2 == a99Var) {
                O2 = new tsa(qpaVar);
                av8Var2.n0(O2);
            }
            tsa tsaVar2 = (tsa) O2;
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = hz8.G(g.a, av8Var2);
                av8Var2.n0(O3);
            }
            ku3 ku3Var = (ku3) O3;
            k29 k29Var = (k29) av8Var2.k(dh3.g);
            jle jleVar = !((Boolean) av8Var2.k(dh3.w)).booleanValue() ? gfi.a : null;
            int i11 = (i9 & 524272) | ((i5 << 18) & 3670016) | ((i9 >> 6) & 29360128);
            boolean z7 = ((((i11 & 896) ^ 384) > 256 && av8Var2.g(s39Var)) || (i11 & 384) == 256) | ((((i11 & 112) ^ 48) > 32 && av8Var2.g(qpaVar)) || (i11 & 48) == 32) | ((((i11 & 7168) ^ 3072) > 2048 && av8Var2.g(p3eVar)) || (i11 & 3072) == 2048);
            if (((57344 & i11) ^ 24576) <= 16384) {
            }
            if ((i11 & 24576) != 16384) {
                z2 = false;
                g2 = ((((i11 & 29360128) ^ 12582912) <= 8388608 && av8Var2.g(pg0Var)) || (i11 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i11) ^ 196608) <= 131072 && av8Var2.h(true)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) <= 1048576 && av8Var2.g(lg0Var)) || (i11 & 1572864) == 1048576) | av8Var2.g(k29Var);
                Object O4 = av8Var2.O();
                if (!g2 || O4 == a99Var) {
                    qpaVar3 = qpaVar;
                    tsaVar = tsaVar2;
                    z3 = false;
                    z4 = true;
                    dpaVar = new dpa(qpaVar3, p3eVar, kProperty02, s39Var, pg0Var, lg0Var, ku3Var, k29Var, jleVar);
                    kProperty0 = kProperty02;
                    av8Var2.n0(dpaVar);
                } else {
                    dpaVar = O4;
                    tsaVar = tsaVar2;
                    kProperty0 = kProperty02;
                    z3 = false;
                    z4 = true;
                    qpaVar3 = qpaVar;
                }
                vqa vqaVar = (vqa) dpaVar;
                ewd ewdVar = ewd.a;
                if (z) {
                    av8Var2.d0(27577840);
                    av8Var2.s(z3);
                    xtcVar2 = utc.a;
                } else {
                    av8Var2.d0(27281635);
                    if (((i7 ^ 6) <= 4 || !av8Var2.g(qpaVar3)) && (i6 & 6) != 4) {
                        z4 = z3;
                    }
                    Object O5 = av8Var2.O();
                    if (z4 || O5 == a99Var) {
                        O5 = new voa(qpaVar3);
                        av8Var2.n0(O5);
                    }
                    xtcVar2 = gvd.F((voa) O5, qpaVar3.n, ewdVar);
                    av8Var2.s(z3);
                }
                qpaVar2 = qpaVar3;
                av8Var = av8Var2;
                tba.b(kProperty0, kik.X(fkf.G(xtcVar.z(qpaVar3.k).z(qpaVar3.l), kProperty0, tsaVar, ewdVar, z).z(xtcVar2).z((xtc) qpaVar3.m.k), qpaVar3, ewdVar, mydVar, z, p78Var, qpaVar3.f, null), qpaVar2.o, vqaVar, av8Var, 0);
            }
            z2 = true;
            g2 = ((((i11 & 29360128) ^ 12582912) <= 8388608 && av8Var2.g(pg0Var)) || (i11 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i11) ^ 196608) <= 131072 && av8Var2.h(true)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) <= 1048576 && av8Var2.g(lg0Var)) || (i11 & 1572864) == 1048576) | av8Var2.g(k29Var);
            Object O42 = av8Var2.O();
            if (g2) {
            }
            qpaVar3 = qpaVar;
            tsaVar = tsaVar2;
            z3 = false;
            z4 = true;
            dpaVar = new dpa(qpaVar3, p3eVar, kProperty02, s39Var, pg0Var, lg0Var, ku3Var, k29Var, jleVar);
            kProperty0 = kProperty02;
            av8Var2.n0(dpaVar);
            vqa vqaVar2 = (vqa) dpaVar;
            ewd ewdVar2 = ewd.a;
            if (z) {
            }
            qpaVar2 = qpaVar3;
            av8Var = av8Var2;
            tba.b(kProperty0, kik.X(fkf.G(xtcVar.z(qpaVar3.k).z(qpaVar3.l), kProperty0, tsaVar, ewdVar2, z).z(xtcVar2).z((xtc) qpaVar3.m.k), qpaVar3, ewdVar2, mydVar, z, p78Var, qpaVar3.f, null), qpaVar2.o, vqaVar2, av8Var, 0);
        } else {
            qpaVar2 = qpaVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w72(xtcVar, qpaVar2, s39Var, p3eVar, p78Var, z, mydVar, pg0Var, lg0Var, function1, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final int i2, float f2, Integer num, Integer num2, int i3, String str, of3 of3Var, final int i4, final int i5) {
        float f3;
        int i6;
        Integer num3;
        int i7;
        int i8;
        Integer num4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        av8 av8Var;
        final Integer num5;
        final int i14;
        final String str3;
        eqf u;
        float f4;
        Integer num6;
        Integer num7;
        int i15;
        String str4;
        r13 r13Var;
        r13 r13Var2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1843603080);
        int i16 = i4 | (av8Var2.e(i2) ? 4 : 2);
        int i17 = i5 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i4 & 48) == 0) {
            f3 = f2;
            i16 |= av8Var2.d(f3) ? 32 : 16;
            i6 = i5 & 4;
            if (i6 == 0) {
                i7 = i16 | 384;
                num3 = num;
            } else {
                num3 = num;
                i7 = i16 | (av8Var2.g(num3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i9 = i7 | 3072;
                num4 = num2;
            } else {
                num4 = num2;
                i9 = i7 | (av8Var2.g(num4) ? a.o : 1024);
            }
            if ((i5 & 16) != 0) {
                i10 = i3;
                if (av8Var2.e(i10)) {
                    i11 = 16384;
                    i12 = i9 | i11;
                    i13 = i5 & 32;
                    if (i13 != 0) {
                        i12 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        str2 = str;
                        i12 |= av8Var2.g(str2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (av8Var2.T(i12 & 1, (74899 & i12) == 74898)) {
                            av8Var = av8Var2;
                            av8Var.W();
                            num5 = num3;
                            i14 = i10;
                            str3 = str2;
                        } else {
                            av8Var2.Y();
                            if ((i4 & 1) == 0 || av8Var2.B()) {
                                if (i17 != 0) {
                                    f3 = 1.0f;
                                }
                                if (i6 != 0) {
                                    num3 = null;
                                }
                                if (i8 != 0) {
                                    num4 = null;
                                }
                                if ((i5 & 16) != 0) {
                                    i10 = R.color.n_lv_1;
                                }
                                f4 = f3;
                                num6 = num3;
                                num7 = num4;
                                i15 = i10;
                                if (i13 != 0) {
                                    str4 = null;
                                    av8Var2.t();
                                    utc utcVar = utc.a;
                                    xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                                    int hashCode = Long.hashCode(av8Var2.T);
                                    aee m = av8Var2.m();
                                    xtc C = fqj.C(av8Var2, d0);
                                    if3.k7.getClass();
                                    zg3 zg3Var = hf3.b;
                                    av8Var2.h0();
                                    if (av8Var2.S) {
                                        av8Var2.q0();
                                    } else {
                                        av8Var2.l(zg3Var);
                                    }
                                    waa.K(av8Var2, a2, hf3.g);
                                    waa.K(av8Var2, m, hf3.f);
                                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                                    waa.J(av8Var2, hf3.k);
                                    waa.K(av8Var2, C, hf3.d);
                                    xtc p = bkh.p(utcVar, 40.0f);
                                    if (num6 != null) {
                                        av8Var2.d0(462865734);
                                        av8Var2.s(false);
                                        r13Var = null;
                                    } else {
                                        av8Var2.d0(462865735);
                                        r13Var = new r13(r13.c(lz.D(num6.intValue(), av8Var2), f4));
                                        av8Var2.s(false);
                                    }
                                    xtc q = n9e.q(p, r13Var == null ? r13Var.a : r13.h, o7g.a(4.0f));
                                    if (num7 != null) {
                                        av8Var2.d0(463114788);
                                        av8Var2.s(false);
                                        r13Var2 = null;
                                    } else {
                                        r13Var2 = new r13(wv8.b(av8Var2, 463114789, num7, av8Var2, false));
                                    }
                                    xtc d02 = l98.d0(yso.o(q, 1.0f, r13Var2 == null ? r13Var2.a : r13.h, o7g.a(4.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                                    String str5 = str4 != null ? "" : str4;
                                    yf8 yf8Var = xth.a;
                                    int i18 = i15;
                                    Integer num8 = num7;
                                    float f5 = f4;
                                    q5a.w(str5, d02, lz.D(i18, av8Var2), null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, xth.b(), av8Var2, 0, 24576, 113656);
                                    udj.c(oea.v(i2, av8Var2), bf3.d(utcVar, 8.0f, av8Var2, 1.0f, true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.g(), av8Var2, 0, 24576, 114680);
                                    av8Var = av8Var2;
                                    av8Var.s(true);
                                    f3 = f5;
                                    num5 = num6;
                                    str3 = str4;
                                    num4 = num8;
                                    i14 = i18;
                                }
                            } else {
                                av8Var2.W();
                                f4 = f3;
                                num6 = num3;
                                num7 = num4;
                                i15 = i10;
                            }
                            str4 = str2;
                            av8Var2.t();
                            utc utcVar2 = utc.a;
                            xtc d03 = l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                            l8g a22 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                            int hashCode2 = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C2 = fqj.C(av8Var2, d03);
                            if3.k7.getClass();
                            zg3 zg3Var2 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                            }
                            waa.K(av8Var2, a22, hf3.g);
                            waa.K(av8Var2, m2, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C2, hf3.d);
                            xtc p2 = bkh.p(utcVar2, 40.0f);
                            if (num6 != null) {
                            }
                            xtc q2 = n9e.q(p2, r13Var == null ? r13Var.a : r13.h, o7g.a(4.0f));
                            if (num7 != null) {
                            }
                            xtc d022 = l98.d0(yso.o(q2, 1.0f, r13Var2 == null ? r13Var2.a : r13.h, o7g.a(4.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                            if (str4 != null) {
                            }
                            yf8 yf8Var2 = xth.a;
                            int i182 = i15;
                            Integer num82 = num7;
                            float f52 = f4;
                            q5a.w(str5, d022, lz.D(i182, av8Var2), null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, xth.b(), av8Var2, 0, 24576, 113656);
                            udj.c(oea.v(i2, av8Var2), bf3.d(utcVar2, 8.0f, av8Var2, 1.0f, true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.g(), av8Var2, 0, 24576, 114680);
                            av8Var = av8Var2;
                            av8Var.s(true);
                            f3 = f52;
                            num5 = num6;
                            str3 = str4;
                            num4 = num82;
                            i14 = i182;
                        }
                        u = av8Var.u();
                        if (u == null) {
                            final float f6 = f3;
                            final Integer num9 = num4;
                            u.d = new Function2() { // from class: x5j
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jaa.c(i2, f6, num5, num9, i14, str3, (of3) obj, aba.K(i4 | 1), i5);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if (av8Var2.T(i12 & 1, (74899 & i12) == 74898)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
            } else {
                i10 = i3;
            }
            i11 = 8192;
            i12 = i9 | i11;
            i13 = i5 & 32;
            if (i13 != 0) {
            }
            str2 = str;
            if (av8Var2.T(i12 & 1, (74899 & i12) == 74898)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        f3 = f2;
        i6 = i5 & 4;
        if (i6 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        if ((i5 & 16) != 0) {
        }
        i11 = 8192;
        i12 = i9 | i11;
        i13 = i5 & 32;
        if (i13 != 0) {
        }
        str2 = str;
        if (av8Var2.T(i12 & 1, (74899 & i12) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void e(m4c m4cVar, Function0 function0, of3 of3Var, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        lv1 lv1Var = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2059048423);
        int i3 = i2 | (av8Var.g(m4cVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(l98.c0(bkh.d(kda.w(utcVar), 1.0f), 8.0f, 4.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e);
            int i4 = i3 & 112;
            boolean z5 = i4 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z5 || O == a99Var) {
                O = new ve7(19, function0);
                av8Var.n0(O);
            }
            xtc O2 = kda.O(l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 12.0f), "media_container", av8Var);
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O2);
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
            gv9 gv9Var = m4cVar.b;
            Integer num = m4cVar.d;
            k4c k4cVar = m4cVar.c;
            if (gv9Var.size() == 2) {
                av8Var.d0(-1793075445);
                xtc d2 = bkh.d(utcVar, 1.0f);
                l8g a3 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.l, av8Var, 6);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d2);
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
                p8g p8gVar = p8g.a;
                xtc O3 = kda.O(p8gVar.a(1.0f, utcVar, true), "media_text", av8Var);
                String str = m4cVar.a;
                yf8 yf8Var = xth.a;
                udj.c(str, O3, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, kda.O(bkh.l(utcVar, 24.0f), "media_cta", av8Var), lz.D(R.color.primary_default, av8Var), av8Var, 48, 0);
                av8Var.s(true);
                xtc Y = fz8.Y(bkh.d(utcVar, 1.0f), n9a.b);
                l8g a4 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, Y);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                f((l4c) gv9Var.get(0), kda.O(p8gVar.a(1.0f, utcVar, true), "highlight_item_1", av8Var), av8Var, 0);
                f((l4c) gv9Var.get(1), kda.O(p8gVar.a(1.0f, utcVar, true), "highlight_item_2", av8Var), av8Var, 0);
                if (num != null) {
                    av8Var.d0(-1608299796);
                    xtc O4 = kda.O(n9e.q(bkh.c(bkh.t(utcVar, 3), 1.0f), lz.D(R.color.neutral_highlight, av8Var), o7g.a(8.0f)), "highlight_more_items", av8Var);
                    k1c c2 = e12.c(uxf.g, false);
                    int hashCode4 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C4 = fqj.C(av8Var, O4);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C4, f50Var3);
                    z3 = false;
                    udj.c("+" + num, l98.b0(utcVar, 10.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 48, 0, 131064);
                    av8Var = av8Var;
                    z4 = true;
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    z3 = false;
                    z4 = true;
                    av8Var.d0(-1607589617);
                    av8Var.s(false);
                }
                av8Var.s(z4);
                av8Var.s(z3);
                z2 = true;
            } else {
                av8Var.d0(-1790651152);
                xtc d3 = bkh.d(utcVar, 1.0f);
                l8g a5 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, d3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, f50Var);
                waa.K(av8Var, m5, ff3Var);
                bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
                goa g2 = ljg.g(av8Var, C5, f50Var3, 1.0f, true);
                p4h p4hVar = ww9.d;
                u23 a6 = t23.a(p4hVar, kv1Var, av8Var, 0);
                int hashCode6 = Long.hashCode(av8Var.T);
                aee m6 = av8Var.m();
                xtc C6 = fqj.C(av8Var, g2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a6, f50Var);
                waa.K(av8Var, m6, ff3Var);
                bf3.s(hashCode6, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C6, f50Var3);
                xtc O5 = kda.O(utcVar, "media_text", av8Var);
                String str2 = m4cVar.a;
                yf8 yf8Var2 = xth.a;
                udj.c(str2, O5, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
                xtc O6 = kda.O(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "view_media_cta", av8Var);
                String v = oea.v(R.string.button_view_media, av8Var);
                bqh bqhVar = new bqh(s6a.N(R.drawable.ic_more_media, 6, av8Var), uxf.q);
                boolean z6 = i4 == 32;
                Object O7 = av8Var.O();
                if (z6 || O7 == a99Var) {
                    O7 = new ve7(20, function0);
                    av8Var.n0(O7);
                }
                mha.h(v, (Function0) O7, O6, tqh.a, bqhVar, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2016);
                av8Var = av8Var;
                i.o(av8Var, true, utcVar, 16.0f, av8Var);
                if (k4cVar instanceof h4c) {
                    av8Var.d0(-1549521875);
                    h4c h4cVar = (h4c) k4cVar;
                    if (h4cVar.c) {
                        av8Var.d0(-1549494006);
                        u23 a7 = t23.a(p4hVar, uxf.p, av8Var, 48);
                        int hashCode7 = Long.hashCode(av8Var.T);
                        aee m7 = av8Var.m();
                        xtc C7 = fqj.C(av8Var, utcVar);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a7, f50Var);
                        waa.K(av8Var, m7, ff3Var);
                        bf3.s(hashCode7, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C7, f50Var3);
                        td4.H(h4cVar.a, h4cVar.d, kda.O(utcVar, "home_logo", av8Var), false, null, null, h4cVar.e, h4cVar.f, null, null, false, true, 20.0f, true, av8Var, 0, V2.b.f, 1848);
                        td4.H(h4cVar.b, h4cVar.d, kda.O(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "away_logo", av8Var), false, null, null, h4cVar.g, h4cVar.h, null, null, false, true, 20.0f, true, av8Var, 0, V2.b.f, 1848);
                        av8Var = av8Var;
                        av8Var.s(true);
                        av8Var.s(false);
                        z = false;
                    } else {
                        av8Var.d0(-1547960932);
                        k1c c3 = e12.c(uxf.c, false);
                        int hashCode8 = Long.hashCode(av8Var.T);
                        aee m8 = av8Var.m();
                        xtc C8 = fqj.C(av8Var, utcVar);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c3, f50Var);
                        waa.K(av8Var, m8, ff3Var);
                        bf3.s(hashCode8, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C8, f50Var3);
                        td4.H(h4cVar.a, h4cVar.d, kda.O(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 10.0f, 3), "home_logo", av8Var), false, null, null, null, null, null, null, false, false, 28.0f, false, av8Var, 0, 384, 12280);
                        td4.H(h4cVar.b, h4cVar.d, kda.O(l98.f0(utcVar, 12.0f, 10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), "away_logo", av8Var), false, null, null, null, null, null, null, false, false, 28.0f, false, av8Var, 0, 384, 12280);
                        av8Var = av8Var;
                        av8Var.s(true);
                        z = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z);
                } else if (k4cVar instanceof i4c) {
                    av8Var.d0(1751217543);
                    td4.C(((i4c) k4cVar).a, kda.O(bkh.l(utcVar, 48.0f), "entity_logo", av8Var), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
                    z = false;
                    av8Var.s(false);
                } else if (k4cVar instanceof j4c) {
                    av8Var.d0(-1546491780);
                    j4c j4cVar = (j4c) k4cVar;
                    td4.H(j4cVar.a, j4cVar.b, kda.O(utcVar, "entity_logo", av8Var), false, null, null, null, null, null, null, false, false, 48.0f, false, av8Var, 0, 384, 12280);
                    av8Var = av8Var;
                    z = false;
                    av8Var.s(false);
                } else {
                    z = false;
                    av8Var.d0(1751238409);
                    av8Var.s(false);
                }
                z2 = true;
                av8Var.s(true);
                av8Var.s(z);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(m4cVar, function0, i2, 16);
        }
    }

    public static final void f(l4c l4cVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(51397472);
        int i3 = (av8Var2.g(l4cVar) ? 4 : 2) | i2 | (av8Var2.g(xtcVar) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
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
            utc utcVar = utc.a;
            td4.O(l4cVar.a, wnn.A(qx9.p(bkh.d(utcVar, 1.0f), 1.7777778f), o7g.a(8.0f)), 0L, false, false, av8Var2, 0, 28);
            kq9.b(s6a.N(l4cVar.b.equals(MediaHighlightedItemResponseKt.NEWS_ARTICLE) ? R.drawable.ic_menu_list_whats_new : R.drawable.ic_play_arrow, 6, av8Var2), null, n12.a.a(bkh.l(l98.b0(utcVar, 8.0f), 24.0f), uxf.i), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(l4cVar, xtcVar, i2, 17);
        }
    }

    public static final void g(bmd bmdVar, xtc xtcVar, of3 of3Var, int i2) {
        long f2;
        long f3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2101668294);
        int i3 = (av8Var.g(bmdVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            int i5 = ke0.c;
            Country country = zu3.d;
            if (country.hasMcc(Integer.valueOf(i5))) {
                av8Var.d0(-1068594881);
                av8Var.s(false);
                f2 = r13.b;
            } else {
                f2 = ljg.f(av8Var, -1068594525, R.color.n_lv_1, av8Var, false);
            }
            long j = f2;
            if (country.hasMcc(Integer.valueOf(i5))) {
                av8Var.d0(-1068591873);
                av8Var.s(false);
                f3 = r13.d;
            } else {
                f3 = ljg.f(av8Var, -1068591513, R.color.surface_2, av8Var, false);
            }
            un0.a(l98.f0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), o7g.a(16.0f), rd0.t(f3, av8Var, 0), rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(354050732, av8Var, new ahf(bmdVar, j, i4)), av8Var, 196608, 16);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(bmdVar, xtcVar, i2, 20);
        }
    }

    public static final void h(c3f c3fVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1449316461);
        int i3 = i2 | (av8Var2.i(c3fVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = Boolean.valueOf(zu3.C.hasMcc(Integer.valueOf(ke0.c)));
                av8Var2.n0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = Boolean.valueOf(zu3.k.hasMcc(Integer.valueOf(ke0.c)));
                av8Var2.n0(O2);
            }
            boolean booleanValue2 = ((Boolean) O2).booleanValue();
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = Boolean.valueOf(zu3.z.hasMcc(Integer.valueOf(ke0.c)));
                av8Var2.n0(O3);
            }
            boolean booleanValue3 = ((Boolean) O3).booleanValue();
            xtc A = wnn.A(xtcVar, o7g.a(16.0f));
            boolean i4 = av8Var2.i(c3fVar) | ((i3 & 112) == 32);
            Object O4 = av8Var2.O();
            if (i4 || O4 == a99Var) {
                O4 = new zbe(26, function1, c3fVar);
                av8Var2.n0(O4);
            }
            un0.a(tol.y(A, false, false, false, 0L, null, (Function0) O4, av8Var2, 31), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_2, av8Var2), av8Var2, 0), rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(1286508895, av8Var2, new y6g(c3fVar, booleanValue, booleanValue2, booleanValue3)), av8Var2, 196608, 16);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i2, 20, c3fVar, xtcVar, function1);
        }
    }

    public static final void i(e49 e49Var, wla wlaVar, Function1 function1, ct8 ct8Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        wlaVar.getClass();
        function1.getClass();
        ct8Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-593015942);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(e49Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var.g(wlaVar) : av8Var.i(wlaVar) ? 32 : 16;
        }
        int i4 = i3 | (av8Var.i(function1) ? 256 : 128) | (av8Var.i(ct8Var) ? a.o : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            String str = e49Var.q;
            String str2 = e49Var.r;
            tc3 H = yqo.H(535777195, av8Var, new t1d(e49Var, 27));
            tc3 H2 = yqo.H(1436845130, av8Var, new wbc(21, e49Var, wlaVar, ct8Var));
            boolean i5 = av8Var.i(e49Var) | ((i4 & 896) == 256);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new zbe(25, e49Var, function1);
                av8Var.n0(O);
            }
            rfo.a(H, H2, e49Var, xtcVar, str, str2, function1, (Function0) O, av8Var, ((i4 << 6) & 896) | 54 | ((i4 >> 3) & 7168) | ((i4 << 12) & 3670016));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(e49Var, wlaVar, function1, ct8Var, xtcVar, i2, 15);
        }
    }

    public static final void j(int i2, w31 w31Var, of3 of3Var, xtc xtcVar, Function1 function1) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(932910053);
        int i3 = (av8Var.g(w31Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (!av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var.W();
        } else if (w31Var instanceof c3f) {
            av8Var.d0(-1121597878);
            h((c3f) w31Var, function1, xtcVar, av8Var, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            av8Var.s(false);
        } else if (w31Var instanceof bmd) {
            av8Var.d0(-1121592362);
            g((bmd) w31Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        } else {
            av8Var.d0(-409498341);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x6g(w31Var, function1, xtcVar, i2);
        }
    }

    public static final void k(int i2, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-685548935);
        if (av8Var2.T(i2 & 1, i2 != 0)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 4.0f);
            String v = oea.v(R.string.insights_available_via, av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(v, c0, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.c(), av8Var, 48, 0, 130040);
            kq9.b(s6a.N(R.drawable.sofascore_analyst_logo, 6, av8Var), "", bkh.e(l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), 16.0f), lz.D(R.color.brand_tertiary_variant, av8Var), av8Var, 432, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new eee(i2);
        }
    }

    public static final void l(int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1720122143);
        if (av8Var.T(i2 & 1, i2 != 0)) {
            haa.f(ktm.e, av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new c8i(i2);
        }
    }

    public static final void m(final String str, final xtc xtcVar, final long j, final int i2, final int i3, Function1 function1, final dfj dfjVar, of3 of3Var, final int i4) {
        int i5;
        long j2;
        final Function1 function12;
        final Function1 function13;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1185162041);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.g(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            j2 = j;
            i5 |= av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            j2 = j;
        }
        int i6 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            i6 |= av8Var.e(i2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= av8Var.e(i3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i7 = i6 | 1572864;
        if ((12582912 & i4) == 0) {
            i7 |= av8Var.g(dfjVar) ? 8388608 : 4194304;
        }
        int i8 = i7;
        if (av8Var.T(i8 & 1, (4793491 & i8) != 4793490)) {
            av8Var.Y();
            if ((i4 & 1) == 0 || av8Var.B()) {
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = new qaj(9);
                    av8Var.n0(O);
                }
                function13 = (Function1) O;
            } else {
                av8Var.W();
                function13 = function1;
            }
            av8Var.t();
            final dsf dsfVar = new dsf();
            final long j3 = j2;
            rz8.r(xtcVar, new Function2() { // from class: rfj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    yji yjiVar = (yji) obj;
                    an3 an3Var = (an3) obj2;
                    yjiVar.getClass();
                    final String str2 = str;
                    final xtc xtcVar2 = xtcVar;
                    final long j4 = j3;
                    final int i9 = i2;
                    final int i10 = i3;
                    final dfj dfjVar2 = dfjVar;
                    tc3 tc3Var = new tc3(-632093416, new ct8() { // from class: tfj
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Function1 function14 = (Function1) obj3;
                            of3 of3Var2 = (of3) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            function14.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((av8) of3Var2).i(function14) ? 4 : 2;
                            }
                            av8 av8Var2 = (av8) of3Var2;
                            if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                                udj.c(str2, xtcVar2, j4, null, 0L, null, 0L, null, null, 0L, i9, false, i10, 0, function14, dfjVar2, av8Var2, 0, (intValue << 18) & 3670016, 44024);
                            } else {
                                av8Var2.W();
                            }
                            return Unit.a;
                        }
                    }, true);
                    dsf dsfVar2 = dsf.this;
                    ((g1c) CollectionsKt.Y(yjiVar.t("textMeasure", new tc3(-306895656, new s5h(27, tc3Var, dsfVar2), true)))).J(an3Var.a);
                    g1c g1cVar = (g1c) CollectionsKt.Y(yjiVar.t("text", new tc3(-1120666398, new s5h(28, tc3Var, function13), true)));
                    long j5 = an3Var.a;
                    int i11 = dsfVar2.a;
                    qhe J = g1cVar.J(an3.a(j5, i11, i11, 0, 0, 12));
                    return m1c.G0(yjiVar, dsfVar2.a, J.b, new b3(J, 21));
                }
            }, av8Var, (i8 >> 3) & 14, 0);
            function12 = function13;
        } else {
            av8Var.W();
            function12 = function1;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: sfj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jaa.m(str, xtcVar, j, i2, i3, function12, dfjVar, (of3) obj, aba.K(i4 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(edk edkVar, Function0 function0, of3 of3Var, int i2) {
        zg3 zg3Var;
        float f2;
        f50 f50Var;
        lv1 lv1Var;
        zg3 zg3Var2;
        boolean z;
        utc utcVar;
        f50 f50Var2;
        f50 f50Var3;
        ry ryVar;
        lv1 lv1Var2;
        edk edkVar2 = edkVar;
        edkVar2.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1602166143);
        int i3 = i2 | (av8Var.g(edkVar2) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new rsd(23, function0);
                av8Var.n0(O);
            }
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(l98.c0(n9e.q(fz8.Y(oyn.w(utcVar2, false, null, null, (Function0) O, 15), n9a.a), lz.D(R.color.surface_P, av8Var), oyn.e), 12.0f, 10.0f), 1.0f);
            wxf wxfVar = ww9.b;
            lv1 lv1Var3 = uxf.l;
            l8g a2 = k8g.a(wxfVar, lv1Var3, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            xtc c2 = bkh.c(utcVar2, 1.0f);
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var4);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            xtc b2 = bkh.b(utcVar2, 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            String str = edkVar2.b;
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, b2, D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
            udj.c(edkVar.c, bkh.b(utcVar2, 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
            av8Var.s(true);
            td4.N(bkh.p(l98.f0(bkh.c(utcVar2, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
            lv1 lv1Var4 = uxf.m;
            nok nokVar = new nok(lv1Var4);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc d0 = l98.d0(nokVar.z(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var3;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var3;
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var4);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C3, f50Var6);
            l8g a5 = k8g.a(wxfVar, lv1Var3, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var4);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C4, f50Var6);
            yj0 B = i9a.B(edkVar.d, edkVar.e, av8Var, edkVar.f);
            if (B == null) {
                av8Var.d0(619367878);
                av8Var.s(false);
                f50Var2 = f50Var6;
                f50Var3 = f50Var5;
                f50Var = f50Var4;
                ryVar = ryVar2;
                lv1Var = lv1Var4;
                zg3Var2 = zg3Var;
                f2 = 8.0f;
                utcVar = utcVar2;
                lv1Var2 = lv1Var3;
                z = false;
            } else {
                av8Var.d0(619367879);
                f2 = 8.0f;
                f50Var = f50Var4;
                lv1Var = lv1Var4;
                zg3Var2 = zg3Var;
                z = false;
                utcVar = utcVar2;
                f50Var2 = f50Var6;
                f50Var3 = f50Var5;
                ryVar = ryVar2;
                lv1Var2 = lv1Var3;
                wkn.k(B, "", bkh.l(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            utc utcVar3 = utcVar;
            zg3 zg3Var4 = zg3Var2;
            lv1 lv1Var5 = lv1Var;
            udj.c(edkVar.j, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 48, 24960, 110584);
            av8Var.s(true);
            l8g a6 = k8g.a(wxfVar, lv1Var2, av8Var, 0);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C5 = fqj.C(av8Var, utcVar3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var4);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var2);
            edkVar2 = edkVar;
            yj0 B2 = i9a.B(edkVar2.g, edkVar2.h, av8Var, edkVar2.i);
            if (B2 == null) {
                av8Var.d0(1628119727);
                av8Var.s(false);
            } else {
                av8Var.d0(1628119728);
                wkn.k(B2, "", bkh.l(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                Unit unit2 = Unit.a;
                av8Var.s(false);
            }
            udj.c(edkVar2.k, bkh.d(utcVar3, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 48, 24960, 110584);
            av8Var.s(true);
            av8Var.s(true);
            kq9.a(haa.t(R.drawable.ic_chevron_right, 0, av8Var), "", l98.f0(new nok(lv1Var5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.primary_default, av8Var), av8Var, 56, 0);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(edkVar2, function0, i2, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0293, code lost:
    
        if (r9 == com.sofascore.results.R.color.live) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x042e  */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Integer, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(y7l y7lVar, y21 y21Var, vy8 vy8Var, of3 of3Var, int i2) {
        av8 av8Var;
        vy8 vy8Var2;
        cxi cxiVar;
        Pair pair;
        int i3;
        int i4;
        boolean z;
        jfj jfjVar;
        int i5;
        boolean z2;
        TeamSides teamSides;
        int i6;
        boolean z3;
        jfj jfjVar2;
        int i7;
        Object obj;
        jfj jfjVar3;
        String str;
        String valueOf;
        Integer num;
        Status status;
        String str2;
        String string;
        Integer played;
        Integer periodLength;
        jfj jfjVar4;
        jfj jfjVar5;
        jfj jfjVar6;
        jfj jfjVar7;
        Integer num2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-151915684);
        int i8 = 4;
        int i9 = i2 | (av8Var2.e(y7lVar.ordinal()) ? 4 : 2) | (av8Var2.i(y21Var) ? 32 : 16) | (av8Var2.h(false) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var2.T(i9 & 1, (i9 & 1171) != 1170)) {
            Context context = (Context) av8Var2.k(bh3.b);
            boolean e2 = av8Var2.e(y21Var.d().getId());
            Object O = av8Var2.O();
            String str3 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            if (e2 || O == nf3.a) {
                n7l n7lVar = n7l.a;
                Team homeTeam$default = Event.getHomeTeam$default(y21Var.d(), null, 1, null);
                Team awayTeam$default = Event.getAwayTeam$default(y21Var.d(), null, 1, null);
                int type = homeTeam$default.getType();
                int i10 = 10;
                if (type != 0) {
                    int i11 = R.drawable.player_photo_placeholder;
                    if (type == 1) {
                        Bitmap a2 = n7l.a("player_" + homeTeam$default.getId());
                        Bitmap a3 = n7l.a("player_" + awayTeam$default.getId());
                        if (y21Var instanceof plc) {
                            i11 = qea.y(homeTeam$default) ? R.drawable.mma_women_placeholder : R.drawable.mma_men_placeholder;
                        }
                        cxiVar = new cxi(a2, a3, Integer.valueOf(i11), i10);
                    } else if (type != 2) {
                        O = new cxi(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 31);
                        av8Var2.n0(O);
                    } else {
                        SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                        Bitmap a4 = n7l.a("subteam_" + (subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null));
                        SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                        Bitmap a5 = n7l.a("subteam_" + (subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null));
                        SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                        Bitmap a6 = n7l.a("subteam_" + (subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null));
                        SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                        cxiVar = new cxi(a4, a5, a6, n7l.a("subteam_" + (subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null)), Integer.valueOf(R.drawable.player_photo_placeholder));
                    }
                } else {
                    cxiVar = new cxi(n7l.a("team_" + homeTeam$default.getId()), n7l.a("team_" + awayTeam$default.getId()), Integer.valueOf(R.drawable.team_logo_placeholder), i10);
                }
                O = cxiVar;
                av8Var2.n0(O);
            }
            cxi cxiVar2 = (cxi) O;
            boolean z4 = y7lVar == y7l.b;
            Set set = wyh.a;
            int a7 = wyh.a(y21Var.d().getSportSlug());
            boolean y = !wyh.e(y21Var.d().getSportSlug()) ? qea.y(Event.getHomeTeam$default(y21Var.d(), null, 1, null)) : false;
            boolean y2 = !wyh.e(y21Var.d().getSportSlug()) ? qea.y(Event.getAwayTeam$default(y21Var.d(), null, 1, null)) : false;
            String q = dmi.q(" ", context.getString(R.string.female_team));
            int ordinal = y7lVar.ordinal();
            if (ordinal == 0) {
                pair = new Pair(null, null);
            } else if (ordinal == 1) {
                pair = new Pair(J(y21Var.c, y, q), J(y21Var.d, y2, q));
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                pair = new Pair(J(y21Var.a, y, q), J(y21Var.b, y2, q));
            }
            jfj jfjVar8 = (jfj) pair.a;
            jfj jfjVar9 = (jfj) pair.b;
            jfj jfjVar10 = y21Var.e;
            int i12 = 7;
            if (jfjVar10 == null) {
                jfjVar10 = new jfj(i12, str3, (Integer) (objArr6 == true ? 1 : 0));
            }
            Integer num3 = jfjVar10.b;
            jfj jfjVar11 = y21Var.f;
            if (jfjVar11 == null) {
                jfjVar11 = new jfj(i12, (String) (objArr5 == true ? 1 : 0), (Integer) (objArr4 == true ? 1 : 0));
            }
            Integer num4 = jfjVar11.b;
            Status status2 = y21Var.d().getStatus();
            long startTimestamp = y21Var.d().getStartTimestamp();
            ZoneId systemDefault = ZoneId.systemDefault();
            boolean isAfter = Instant.ofEpochSecond(startTimestamp).atZone(systemDefault).toLocalDate().isAfter(LocalDate.now(systemDefault));
            jfj jfjVar12 = y21Var.h;
            if (jfjVar12 == null || (num2 = jfjVar12.b) == null) {
                i3 = R.color.n_lv_1;
            } else {
                int intValue = num2.intValue();
                i3 = R.color.n_lv_1;
                i4 = R.color.live;
            }
            i4 = i3;
            if (isAfter) {
                z = z4;
                jfj jfjVar13 = y21Var.h;
                jfjVar = new jfj(i8, jfjVar13 != null ? jfjVar13.a : null, Integer.valueOf(i4));
            } else {
                z = z4;
                jfjVar = new jfj(i8, y21Var.g.a, Integer.valueOf(i3));
            }
            jfj jfjVar14 = !isAfter ? y21Var.h : new jfj(6, "-", (Integer) null);
            if (y21Var instanceof j04) {
                av8Var2.d0(1177521331);
                Pair I = I(jfjVar10);
                jfj jfjVar15 = (jfj) I.a;
                jfj jfjVar16 = (jfj) I.b;
                Pair I2 = I(jfjVar11);
                jfj jfjVar17 = (jfj) I2.a;
                jfj jfjVar18 = (jfj) I2.b;
                int id = ((j04) y21Var).O.getId();
                Bitmap bitmap = cxiVar2.a;
                jfj jfjVar19 = jfjVar14;
                Bitmap bitmap2 = cxiVar2.c;
                Integer num5 = cxiVar2.e;
                String type2 = status2.getType();
                if (jfjVar19 == null) {
                    jfjVar5 = jfjVar8;
                    jfjVar6 = jfjVar;
                    jfjVar7 = jfjVar9;
                    jfjVar4 = new jfj(7, (String) null, (Integer) (0 == true ? 1 : 0));
                } else {
                    jfjVar4 = jfjVar19;
                    jfjVar5 = jfjVar8;
                    jfjVar6 = jfjVar;
                    jfjVar7 = jfjVar9;
                }
                waa.l(id, z, bitmap, bitmap2, num5, jfjVar5, jfjVar7, type2, jfjVar6, jfjVar4, jfjVar15, jfjVar16, jfjVar17, jfjVar18, a7, av8Var2, 0, 196608);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                jfj jfjVar20 = jfjVar14;
                jfj jfjVar21 = jfjVar;
                if (y21Var instanceof plc) {
                    av8Var2.d0(1178644895);
                    MmaEvent mmaEvent = ((plc) y21Var).O;
                    Integer finalRound = mmaEvent.getFinalRound();
                    String string2 = context.getString(R.string.mma_status_round, Integer.valueOf(finalRound != null ? finalRound.intValue() : 1));
                    string2.getClass();
                    Time time = mmaEvent.getTime();
                    int intValue2 = (time == null || (periodLength = time.getPeriodLength()) == null) ? 300 : periodLength.intValue();
                    if (time == null || (played = time.getPlayed()) == null) {
                        num = null;
                    } else {
                        int intValue3 = ((intValue2 - played.intValue()) / 60) + 1;
                        int i13 = intValue2 / 60;
                        if (intValue3 > i13) {
                            intValue3 = i13;
                        }
                        num = Integer.valueOf(intValue3);
                    }
                    String string3 = context.getString(R.string.mma_minutes_left_format, num);
                    string3.getClass();
                    String winType = mmaEvent.getWinType();
                    Integer winnerCode$default = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                    jfj a8 = jfj.a(jfjVar10, null, Integer.valueOf((winnerCode$default != null && winnerCode$default.intValue() == 1) ? R.color.n_lv_1 : R.color.n_lv_3), 5);
                    Integer winnerCode$default2 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                    jfj a9 = jfj.a(jfjVar11, null, Integer.valueOf((winnerCode$default2 != null && winnerCode$default2.intValue() == 2) ? R.color.n_lv_1 : R.color.n_lv_3), 5);
                    Integer winnerCode$default3 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                    if (winnerCode$default3 != null && winnerCode$default3.intValue() == 3) {
                        string = context.getString(R.string.draw);
                    } else if (winnerCode$default3 != null && winnerCode$default3.intValue() == 4) {
                        string = context.getString(R.string.no_contest_mma);
                    } else {
                        status = status2;
                        str2 = null;
                        jca.v(mmaEvent.getId(), z, cxiVar2.a, cxiVar2.c, cxiVar2.e, jfjVar8, jfjVar9, status.getType(), jfjVar21, jfjVar20 != null ? new jfj(7, (String) null, (Integer) (0 == true ? 1 : 0)) : jfjVar20, string2, string3, a8, a9, winType, str2, a7, av8Var2, 0, 12582912);
                        av8Var = av8Var2;
                        av8Var.s(false);
                    }
                    str2 = string;
                    status = status2;
                    jca.v(mmaEvent.getId(), z, cxiVar2.a, cxiVar2.c, cxiVar2.e, jfjVar8, jfjVar9, status.getType(), jfjVar21, jfjVar20 != null ? new jfj(7, (String) null, (Integer) (0 == true ? 1 : 0)) : jfjVar20, string2, string3, a8, a9, winType, str2, a7, av8Var2, 0, 12582912);
                    av8Var = av8Var2;
                    av8Var.s(false);
                } else {
                    av8Var2.d0(1180549442);
                    boolean isDoublesMatch = y21Var.d().isDoublesMatch();
                    jfj jfjVar22 = y21Var.y;
                    if (jfjVar22 == null) {
                        i5 = 7;
                        jfjVar22 = new jfj(i5, (String) null, (Integer) (0 == true ? 1 : 0));
                    } else {
                        i5 = 7;
                    }
                    jfj jfjVar23 = y21Var.z;
                    if (jfjVar23 == null) {
                        z2 = isDoublesMatch;
                        teamSides = null;
                        jfjVar23 = new jfj(i5, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0));
                    } else {
                        z2 = isDoublesMatch;
                        teamSides = null;
                    }
                    Integer penalties = Event.getHomeScore$default(y21Var.d(), teamSides, 1, teamSides).getPenalties();
                    String valueOf2 = penalties != null ? String.valueOf(penalties.intValue()) : teamSides;
                    Integer penalties2 = Event.getAwayScore$default(y21Var.d(), teamSides, 1, teamSides).getPenalties();
                    String valueOf3 = penalties2 != null ? String.valueOf(penalties2.intValue()) : null;
                    if (valueOf2 == null && valueOf3 == null) {
                        i6 = a7;
                        z3 = false;
                    } else {
                        i6 = a7;
                        z3 = true;
                    }
                    if (!z3) {
                        jfjVar2 = jfjVar23;
                        i7 = i6;
                        obj = null;
                        jfjVar3 = jfjVar22;
                    } else if (Intrinsics.c(status2.getType(), StatusKt.STATUS_FINISHED)) {
                        Integer display = Event.getHomeScore$default(y21Var.d(), null, 1, null).getDisplay();
                        String str4 = "0";
                        if (display == null || (str = String.valueOf(display.intValue())) == null) {
                            str = "0";
                        }
                        int i14 = 4;
                        jfjVar10 = new jfj(i14, str, Integer.valueOf(num3 != null ? num3.intValue() : R.color.n_lv_3));
                        jfj jfjVar24 = new jfj(i14, valueOf2, num3);
                        Integer display2 = Event.getAwayScore$default(y21Var.d(), null, 1, null).getDisplay();
                        if (display2 != null && (valueOf = String.valueOf(display2.intValue())) != null) {
                            str4 = valueOf;
                        }
                        int i15 = 4;
                        jfjVar11 = new jfj(i15, str4, Integer.valueOf(num4 != null ? num4.intValue() : R.color.n_lv_3));
                        jfjVar2 = new jfj(i15, valueOf3, num4);
                        i7 = i6;
                        obj = null;
                        jfjVar3 = jfjVar24;
                    } else {
                        jfjVar2 = jfjVar11;
                        jfjVar11 = jfjVar23;
                        i7 = i6;
                        obj = null;
                        jfjVar3 = jfjVar10;
                        jfjVar10 = jfjVar22;
                    }
                    int id2 = y21Var.d().getId();
                    boolean z5 = z;
                    jfj jfjVar25 = jfjVar11;
                    Bitmap bitmap3 = cxiVar2.a;
                    ?? r12 = obj;
                    Bitmap bitmap4 = cxiVar2.b;
                    Bitmap bitmap5 = cxiVar2.c;
                    jfj jfjVar26 = jfjVar20;
                    Bitmap bitmap6 = cxiVar2.d;
                    Integer num6 = cxiVar2.e;
                    jfj jfjVar27 = jfjVar10;
                    String type3 = status2.getType();
                    int code = status2.getCode();
                    if (jfjVar26 == null) {
                        jfjVar26 = new jfj(7, (String) r12, (Integer) r12);
                    }
                    yaa.i(id2, z5, bitmap3, bitmap4, bitmap5, bitmap6, z2, num6, jfjVar8, jfjVar9, type3, code, jfjVar21, jfjVar26, z3, jfjVar27, jfjVar3, jfjVar25, jfjVar2, i7, av8Var2, 0, 6);
                    av8Var = av8Var2;
                    av8Var.s(false);
                }
            }
            vy8Var2 = ty8.a;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(y7lVar, y21Var, vy8Var2, i2, 22);
        }
    }

    public static final void p(mjl mjlVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        boolean z;
        mjlVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1591519847);
        int i3 = i2 | (av8Var.g(mjlVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc A = wnn.A(l98.d0(bkh.d(xtcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f));
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
                O2 = wzj.y;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, mjlVar, 21), av8Var, 0);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
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
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            wkn.k(haa.t(R.drawable.fantasy_cta_background, 0, av8Var), null, n12Var.b(utcVar), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            int i4 = 6;
            wkn.l(s6a.N(R.drawable.ic_world_cup_trophy, 6, av8Var), bkh.l(n12Var.a(utcVar, uxf.g), 88.0f), null, null, 0.5f, new ay1(lz.D(R.color.on_color_secondary, av8Var), 5), av8Var, 196656, 24);
            xtc O3 = kda.O(l98.d0(n12Var.b(utcVar), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), "wc26_tournament_winner_card", av8Var);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(i4)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, O3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            td4.k(mjlVar.c, bkh.l(utcVar, 56.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(i4)), uxf.o, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
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
            String upperCase = oea.v(R.string.football_champions, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            udj.c(mjlVar.b, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.j(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
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
            av8Var.d0(1659021629);
            xjc xjcVar = mjlVar.d;
            int i5 = xjcVar.b;
            String str = xjcVar.f;
            int i6 = xjcVar.c;
            Integer num = xjcVar.d;
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = xjcVar.e;
            rha.d(i5, i6, intValue, num2 != null ? num2.intValue() : 0, xjcVar.g, null, lz.D(R.color.on_color_highlight_2, av8Var), lz.D(R.color.on_color_primary, av8Var), lz.D(R.color.on_color_secondary, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 0, 1568);
            av8Var = av8Var;
            if (str == null || str.length() == 0) {
                z = false;
                av8Var.d0(1894879002);
                av8Var.s(false);
            } else {
                av8Var.d0(1894646719);
                udj.c(l4a.O(str), null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                z = false;
                av8Var.s(false);
            }
            Unit unit = Unit.a;
            i.p(av8Var, z, true, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(mjlVar, function1, xtcVar, i2, 3);
        }
    }

    public static final trm q(PosterDto posterDto) {
        List a2 = com.blaze.blazesdk.features.shared.models.shared_models.c.a(posterDto != null ? posterDto.getRenditions() : null);
        if (a2.isEmpty()) {
            a2 = kotlin.collections.a.c(com.blaze.blazesdk.features.shared.models.shared_models.c.b(posterDto != null ? posterDto.getRendition() : null));
        }
        return new trm(a2, posterDto != null ? posterDto.getType() : null);
    }

    public static List r(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new iaa(0, iArr.length, iArr);
    }

    public static int s(long j) {
        int i2 = (int) j;
        z1a.p(j, ((long) i2) == j, "Out of range: %s");
        return i2;
    }

    public static final int t(float f2) {
        return wzb.b(f2) * (-1);
    }

    public static int u(qrf qrfVar, gwd gwdVar, View view, View view2, n nVar, boolean z) {
        if (nVar.getChildCount() == 0 || qrfVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1;
        }
        return Math.min(gwdVar.l(), gwdVar.b(view2) - gwdVar.e(view));
    }

    public static int v(qrf qrfVar, gwd gwdVar, View view, View view2, n nVar, boolean z, boolean z2) {
        if (nVar.getChildCount() == 0 || qrfVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (qrfVar.b() - Math.max(nVar.getPosition(view), nVar.getPosition(view2))) - 1) : Math.max(0, Math.min(nVar.getPosition(view), nVar.getPosition(view2)));
        if (z) {
            return Math.round((max * (Math.abs(gwdVar.b(view2) - gwdVar.e(view)) / (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1))) + (gwdVar.k() - gwdVar.e(view)));
        }
        return max;
    }

    public static int w(qrf qrfVar, gwd gwdVar, View view, View view2, n nVar, boolean z) {
        if (nVar.getChildCount() == 0 || qrfVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return qrfVar.b();
        }
        return (int) (((gwdVar.b(view2) - gwdVar.e(view)) / (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1)) * qrfVar.b());
    }

    public static long[] x(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i2 = (int) j;
        z1a.p(j, j == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i3, jArr4.length);
            i3 += jArr4.length;
        }
        return jArr3;
    }

    public static AdError y(int i2, String str) {
        return new AdError(i2, str, "com.google.ads.mediation.pangle");
    }

    public static AdError z() {
        return new AdError(103, "MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.", "com.google.ads.mediation.pangle");
    }
}
