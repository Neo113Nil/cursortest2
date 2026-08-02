package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.event.boxscore.legend.BoxScoreLegendModal;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class un0 {
    public static AudioManager a;
    public static final f8h j;
    public static final wxf l;
    public static final p4h m;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final int[] b = {1, 2, 3, 6};
    public static final int[] c = {48000, 44100, 32000};
    public static final int[] d = {24000, 22050, 16000};
    public static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    public static final int[] g = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final tc3 h = new tc3(-1977446254, new gd3(13), false);
    public static final tc3 i = new tc3(-571137793, new qd3(11), false);
    public static final gl5 k = new gl5(1);
    public static final e2f n = new e2f(2);
    public static final w9f o = new w9f(3);

    static {
        int i2 = 24;
        j = new f8h(i2);
        l = new wxf(i2);
        m = new p4h(i2);
    }

    public static final xtc A(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new cqd(function1));
    }

    public static r50 B(lha lhaVar, plb plbVar) {
        return new r50(qja.a(lhaVar, plbVar, 1.0f, uic.e, false), 0);
    }

    public static s50 C(wga wgaVar, plb plbVar, boolean z) {
        return new s50(qja.a(wgaVar, plbVar, z ? vik.c() : 1.0f, a99.d, false), 0);
    }

    public static r50 D(lha lhaVar, plb plbVar, int i2) {
        zid zidVar = new zid(6);
        zidVar.b = i2;
        ArrayList a2 = qja.a(lhaVar, plbVar, 1.0f, zidVar, false);
        for (int i3 = 0; i3 < a2.size(); i3++) {
            nja njaVar = (nja) a2.get(i3);
            x19 x19Var = (x19) njaVar.b;
            x19 x19Var2 = (x19) njaVar.c;
            if (x19Var != null && x19Var2 != null) {
                float[] fArr = x19Var.a;
                int length = fArr.length;
                float[] fArr2 = x19Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    njaVar = new nja(x19Var.b(copyOfRange), x19Var2.b(copyOfRange));
                }
            }
            a2.set(i3, njaVar);
        }
        return new r50(a2, 1);
    }

    public static r50 E(wga wgaVar, plb plbVar) {
        return new r50(qja.a(wgaVar, plbVar, 1.0f, inb.i, false), 2);
    }

    public static r50 F(lha lhaVar, plb plbVar) {
        return new r50(qja.a(lhaVar, plbVar, vik.c(), it7.n, true), 3);
    }

    public static final ndb G(int i2, int i3, of3 of3Var) {
        boolean z = (i3 & 4) != 0;
        av8 av8Var = (av8) of3Var;
        Object systemService = ((Context) av8Var.k(nz.b)).getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z2 = ((((i2 & 896) ^ 384) > 256 && av8Var.h(z)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && av8Var.h(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && av8Var.h(true)) || (i2 & 48) == 32);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (z2 || O == a99Var) {
            O = new ndb(true, true, z);
            av8Var.n0(O);
        }
        ndb ndbVar = (ndb) O;
        u6b u6bVar = (u6b) av8Var.k(mhb.a);
        boolean g2 = av8Var.g(ndbVar) | av8Var.i(accessibilityManager);
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            O2 = new s1(2, ndbVar, accessibilityManager);
            av8Var.n0(O2);
        }
        Function1 function1 = (Function1) O2;
        boolean g3 = av8Var.g(ndbVar) | av8Var.i(accessibilityManager);
        Object O3 = av8Var.O();
        if (g3 || O3 == a99Var) {
            O3 = new j4(3, ndbVar, accessibilityManager);
            av8Var.n0(O3);
        }
        q(u6bVar, function1, (Function0) O3, av8Var, 0);
        return ndbVar;
    }

    public static final hof H(z88 z88Var, ku3 ku3Var, xeh xehVar, int i2) {
        mbd w = w(z88Var, i2);
        aeh a2 = beh.a(i2, w.b, (a62) w.d);
        return new hof(a2, xw3.K(ku3Var, (CoroutineContext) w.e, xehVar.equals(weh.a) ? nu3.a : nu3.d, new va8(xehVar, (z88) w.c, a2, beh.a, (rq3) null)));
    }

    public static void I(Context context, String str, int i2, List list, String str2, String str3) {
        context.getClass();
        list.getClass();
        str2.getClass();
        BoxScoreLegendModal boxScoreLegendModal = new BoxScoreLegendModal();
        Bundle bundle = new Bundle();
        bundle.putString(SearchResponseKt.SPORT_ENTITY, str);
        bundle.putInt("title", i2);
        bundle.putString("analyticsName", str3);
        bundle.putSerializable("sections", new ArrayList(list));
        bundle.putString("section", str2);
        boxScoreLegendModal.setArguments(bundle);
        Unit unit = Unit.a;
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(boxScoreLegendModal, appCompatActivity, rq3Var, 3));
        }
    }

    public static void J(Context context, String str, String str2, boolean z) {
        context.getClass();
        str.getClass();
        BoxScoreLegendModal boxScoreLegendModal = new BoxScoreLegendModal();
        Bundle bundle = new Bundle();
        bundle.putString(SearchResponseKt.SPORT_ENTITY, str);
        bundle.putString("section", str2);
        bundle.putBoolean("hasRating", z);
        boxScoreLegendModal.setArguments(bundle);
        Unit unit = Unit.a;
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(boxScoreLegendModal, appCompatActivity, rq3Var, 3));
        }
    }

    public static final jof K(z88 z88Var, ku3 ku3Var, xeh xehVar, Object obj) {
        mbd w = w(z88Var, 1);
        fdi a2 = gdi.a(obj);
        return new jof(a2, xw3.K(ku3Var, (CoroutineContext) w.e, xehVar.equals(weh.a) ? nu3.a : nu3.d, new va8(xehVar, (z88) w.c, a2, obj, (rq3) null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(jof jofVar, iz2 iz2Var, sq3 sq3Var) {
        wa8 wa8Var;
        int i2;
        if (sq3Var instanceof wa8) {
            wa8Var = (wa8) sq3Var;
            int i3 = wa8Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wa8Var.s = i3 - Integer.MIN_VALUE;
                Object obj = wa8Var.r;
                lu3 lu3Var = lu3.a;
                i2 = wa8Var.s;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    mbd w = w(jofVar, 1);
                    qa3 qa3Var = new qa3((yda) iz2Var.a.get(uic.g));
                    xw3.L(iz2Var, (CoroutineContext) w.e, null, new va8((z88) w.c, qa3Var, rq3Var, 2), 2);
                    wa8Var.s = 1;
                    obj = qa3Var.w(wa8Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Object obj2 = ((w2g) obj).a;
                y6a.M(obj2);
                return obj2;
            }
        }
        wa8Var = new wa8(sq3Var);
        Object obj3 = wa8Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = wa8Var.s;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        Object obj22 = ((w2g) obj3).a;
        y6a.M(obj22);
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(xtc xtcVar, uah uahVar, ek2 ek2Var, gk2 gk2Var, qz1 qz1Var, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        uah uahVar2;
        ek2 ek2Var2;
        gk2 gk2Var2;
        qz1 qz1Var2;
        av8 av8Var;
        xtc xtcVar3;
        uah uahVar3;
        ek2 ek2Var3;
        gk2 gk2Var3;
        qz1 qz1Var3;
        eqf u;
        uah uahVar4;
        ek2 ek2Var4;
        xtc xtcVar4;
        gk2 gk2Var4;
        uah uahVar5;
        qz1 qz1Var4;
        int i5;
        int i6;
        int i7;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1359693790);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            xtcVar2 = xtcVar;
        } else if ((i2 & 6) == 0) {
            xtcVar2 = xtcVar;
            i4 = (av8Var2.g(xtcVar2) ? 4 : 2) | i2;
        } else {
            xtcVar2 = xtcVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                uahVar2 = uahVar;
                if (av8Var2.g(uahVar2)) {
                    i7 = 32;
                    i4 |= i7;
                }
            } else {
                uahVar2 = uahVar;
            }
            i7 = 16;
            i4 |= i7;
        } else {
            uahVar2 = uahVar;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                ek2Var2 = ek2Var;
                if (av8Var2.g(ek2Var2)) {
                    i6 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i4 |= i6;
                }
            } else {
                ek2Var2 = ek2Var;
            }
            i6 = 128;
            i4 |= i6;
        } else {
            ek2Var2 = ek2Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                gk2Var2 = gk2Var;
                if (av8Var2.g(gk2Var2)) {
                    i5 = a.o;
                    i4 |= i5;
                }
            } else {
                gk2Var2 = gk2Var;
            }
            i5 = 1024;
            i4 |= i5;
        } else {
            gk2Var2 = gk2Var;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            qz1Var2 = qz1Var;
            i4 |= av8Var2.g(qz1Var2) ? 16384 : 8192;
            if ((196608 & i2) == 0) {
                i4 |= av8Var2.i(tc3Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            if (av8Var2.T(i4 & 1, (74899 & i4) == 74898)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
                uahVar3 = uahVar2;
                ek2Var3 = ek2Var2;
                gk2Var3 = gk2Var2;
                qz1Var3 = qz1Var2;
            } else {
                av8Var2.Y();
                if ((i2 & 1) == 0 || av8Var2.B()) {
                    xtc xtcVar5 = i8 != 0 ? utc.a : xtcVar2;
                    if ((i3 & 2) != 0) {
                        uahVar4 = ech.b(j28.b, av8Var2);
                        i4 &= -113;
                    } else {
                        uahVar4 = uahVar2;
                    }
                    if ((i3 & 4) != 0) {
                        ek2Var4 = rd0.G((g23) av8Var2.k(i23.a));
                        i4 &= -897;
                    } else {
                        ek2Var4 = ek2Var2;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        gk2Var2 = rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 63);
                    }
                    if (i9 != 0) {
                        gk2 gk2Var5 = gk2Var2;
                        xtcVar4 = xtcVar5;
                        gk2Var4 = gk2Var5;
                        uahVar5 = uahVar4;
                        qz1Var4 = null;
                    } else {
                        gk2 gk2Var6 = gk2Var2;
                        xtcVar4 = xtcVar5;
                        gk2Var4 = gk2Var6;
                        uahVar5 = uahVar4;
                        qz1Var4 = qz1Var2;
                    }
                } else {
                    av8Var2.W();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    uahVar5 = uahVar2;
                    ek2Var4 = ek2Var2;
                    gk2Var4 = gk2Var2;
                    qz1Var4 = qz1Var2;
                    xtcVar4 = xtcVar2;
                }
                av8Var2.t();
                av8Var = av8Var2;
                uni.a(xtcVar4, uahVar5, ek2Var4.a, ek2Var4.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((p75) gk2Var4.a(true, null, av8Var2, ((i4 >> 3) & 896) | 54).getValue()).a, qz1Var4, yqo.H(-97109725, av8Var2, new ik2(tc3Var, 0)), av8Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
                ek2Var3 = ek2Var4;
                uahVar3 = uahVar5;
                qz1Var3 = qz1Var4;
                gk2Var3 = gk2Var4;
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new hk2(xtcVar3, uahVar3, ek2Var3, gk2Var3, qz1Var3, tc3Var, i2, i3);
                return;
            }
            return;
        }
        qz1Var2 = qz1Var;
        if ((196608 & i2) == 0) {
        }
        if (av8Var2.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(Function0 function0, xtc xtcVar, boolean z, uah uahVar, ek2 ek2Var, gk2 gk2Var, tc3 tc3Var, of3 of3Var, int i2) {
        tc3 tc3Var2;
        av8 av8Var;
        boolean z2;
        boolean z3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2136075085);
        int i3 = i2 | (av8Var2.i(function0) ? 4 : 2) | (av8Var2.g(xtcVar) ? 32 : 16) | 384 | (av8Var2.g(uahVar) ? a.o : 1024) | (av8Var2.g(ek2Var) ? 16384 : 8192) | (av8Var2.g(gk2Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 14155776;
        int i4 = 1;
        if (av8Var2.T(i3 & 1, (38347923 & i3) != 38347922)) {
            av8Var2.Y();
            if ((i2 & 1) == 0 || av8Var2.B()) {
                z3 = true;
            } else {
                av8Var2.W();
                z3 = z;
            }
            av8Var2.t();
            av8Var2.d0(1577885006);
            Object O = av8Var2.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            av8Var2.s(false);
            long j2 = z3 ? ek2Var.a : ek2Var.c;
            long j3 = z3 ? ek2Var.b : ek2Var.d;
            float f2 = ((p75) gk2Var.a(z3, wzcVar, av8Var2, ((i3 >> 9) & 896) | 6).getValue()).a;
            boolean z4 = z3;
            tc3Var2 = tc3Var;
            av8Var = av8Var2;
            uni.c(function0, xtcVar, z4, uahVar, j2, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, null, wzcVar, yqo.H(-1347531112, av8Var2, new ik2(tc3Var2, i4)), av8Var, (i3 & 8190) | 100663296, 64);
            z2 = z4;
        } else {
            tc3Var2 = tc3Var;
            av8Var = av8Var2;
            av8Var.W();
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc7(function0, xtcVar, z2, uahVar, ek2Var, gk2Var, tc3Var2, i2, 1);
        }
    }

    public static final void c(uv3 uv3Var, boolean z, long j2, long j3, r13 r13Var, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2101329384);
        int i3 = i2 | (av8Var.g(uv3Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j3) ? a.o : 1024) | (av8Var.g(r13Var) ? 16384 : 8192) | (av8Var.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean z2 = !z;
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 458752) == 131072);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z3 || O == obj) {
                O = new xq2(function1, uv3Var, 1);
                av8Var.n0(O);
            }
            xtc y = tol.y(d2, z2, false, false, 0L, null, (Function0) O, av8Var, 30);
            if (r13Var != null && z) {
                r13Var.getClass();
                y = y.z(n9e.q(utcVar, r13Var.a, oyn.e));
            }
            xtc c0 = l98.c0(y, 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 54);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String str = uv3Var.b;
            String str2 = uv3Var.a;
            td4.k(str, bkh.l(utcVar, 24.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 12.0f));
            boolean g2 = av8Var.g(str2);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                O2 = tv3.c(context, str2);
                av8Var.n0(O2);
            }
            yf8 yf8Var = xth.a;
            udj.c((String) O2, null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, i3 & 896, 0, 131066);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            int i4 = 1;
            nq8.h(av8Var, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            fz8.d(z, null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, yqo.H(-872668076, av8Var, new iv3(j3, i4)), av8Var, 1600518 | (i3 & 112), 18);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new g82(uv3Var, z, j2, j3, r13Var, function1, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0676 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final gv9 gv9Var, final uv3 uv3Var, Function1 function1, long j2, long j3, r13 r13Var, long j4, r13 r13Var2, long j5, long j6, xqh xqhVar, boolean z, of3 of3Var, final int i2, final int i3, final int i4) {
        int i5;
        long j7;
        r13 r13Var3;
        long j8;
        r13 r13Var4;
        int i6;
        int i7;
        int i8;
        xqh xqhVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        av8 av8Var;
        final long j9;
        final boolean z2;
        final xqh xqhVar3;
        final r13 r13Var5;
        long j10;
        final long j11;
        final r13 r13Var6;
        final long j12;
        final long j13;
        eqf u;
        long j14;
        long j15;
        boolean z3;
        xqh xqhVar4;
        long j16;
        r13 r13Var7;
        r13 r13Var8;
        long j17;
        long j18;
        long j19;
        int i13;
        ksa a2;
        cdi O;
        boolean z4;
        Object O2;
        Object obj;
        Object O3;
        e1d e1dVar;
        boolean z5;
        Object O4;
        boolean g2;
        Object O5;
        int i14;
        xtc xtcVar;
        ksa ksaVar;
        xtc xtcVar2;
        boolean g3;
        Object O6;
        e1d e1dVar2;
        r13 r13Var9;
        long j20;
        long j21;
        long j22;
        boolean z6;
        boolean z7;
        Object O7;
        long j23;
        r13 r13Var10;
        r13 r13Var11;
        boolean g4;
        Object O8;
        final Function1 function12 = function1;
        gv9Var.getClass();
        function12.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-552331699);
        if ((i2 & 6) == 0) {
            i5 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= av8Var2.g(uv3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            j7 = j2;
            i5 |= ((i4 & 8) == 0 && av8Var2.f(j7)) ? a.o : 1024;
        } else {
            j7 = j2;
        }
        if ((i2 & 24576) == 0) {
            i5 |= ((i4 & 16) == 0 && av8Var2.f(j3)) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            r13Var3 = r13Var;
            i5 |= ((i4 & 32) == 0 && av8Var2.g(r13Var3)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            r13Var3 = r13Var;
        }
        if ((i2 & 1572864) == 0) {
            j8 = j4;
            i5 |= ((i4 & 64) == 0 && av8Var2.f(j8)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            j8 = j4;
        }
        int i15 = i4 & 128;
        if (i15 != 0) {
            i5 |= 12582912;
        } else if ((12582912 & i2) == 0) {
            r13Var4 = r13Var2;
            i5 |= av8Var2.g(r13Var4) ? 8388608 : 4194304;
            i6 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i6 == 0) {
                i5 |= 100663296;
                i7 = i15;
            } else {
                i7 = i15;
                if ((i2 & 100663296) == 0) {
                    i5 |= av8Var2.f(j5) ? 67108864 : 33554432;
                }
            }
            if ((i2 & 805306368) == 0) {
                i5 |= ((i4 & 512) == 0 && av8Var2.f(j6)) ? 536870912 : 268435456;
            }
            i8 = i4 & 1024;
            if (i8 == 0) {
                i9 = i3 | 6;
                xqhVar2 = xqhVar;
            } else if ((i3 & 6) == 0) {
                xqhVar2 = xqhVar;
                i9 = i3 | (av8Var2.g(xqhVar2) ? 4 : 2);
            } else {
                xqhVar2 = xqhVar;
                i9 = i3;
            }
            i10 = i4 & a.o;
            if (i10 == 0) {
                i11 = i10;
                i12 = i9 | 48;
            } else {
                if ((i3 & 48) == 0) {
                    i11 = i10;
                    i9 |= av8Var2.h(z) ? 32 : 16;
                } else {
                    i11 = i10;
                }
                i12 = i9;
            }
            if (av8Var2.T(i5 & 1, (i5 & 306783379) == 306783378 || (i12 & 19) != 18)) {
                av8Var = av8Var2;
                av8Var.W();
                j9 = j3;
                z2 = z;
                xqhVar3 = xqhVar2;
                r13Var5 = r13Var3;
                j10 = j7;
                j11 = j6;
                r13Var6 = r13Var4;
                j12 = j8;
                j13 = j5;
            } else {
                av8Var2.Y();
                if ((i2 & 1) == 0 || av8Var2.B()) {
                    if ((i4 & 8) != 0) {
                        j7 = lz.D(R.color.n_lv_1, av8Var2);
                        i5 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        j14 = lz.D(R.color.primary_default, av8Var2);
                        i5 &= -57345;
                    } else {
                        j14 = j3;
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        r13Var3 = new r13(lz.D(R.color.surface_1, av8Var2));
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                        j8 = lz.D(R.color.n_lv_3, av8Var2);
                    }
                    if (i7 != 0) {
                        r13Var4 = null;
                    }
                    long j24 = i6 != 0 ? r13.i : j5;
                    if ((i4 & 512) != 0) {
                        j15 = lz.D(R.color.surface_2, av8Var2);
                        i5 &= -1879048193;
                    } else {
                        j15 = j6;
                    }
                    xqh xqhVar5 = i8 != 0 ? kqh.a : xqhVar2;
                    if (i11 != 0) {
                        xqhVar4 = xqhVar5;
                        j16 = j24;
                        r13Var7 = r13Var4;
                        r13Var8 = r13Var3;
                        j17 = j8;
                        j18 = j7;
                        j19 = j15;
                        i13 = 32;
                        z3 = true;
                        av8Var2.t();
                        Object obj2 = (Context) av8Var2.k(nz.b);
                        a2 = msa.a(0, 0, av8Var2, 0, 3);
                        O = z1a.O(a2, av8Var2);
                        z4 = (i5 & 112) != i13;
                        O2 = av8Var2.O();
                        obj = nf3.a;
                        if (!z4 || O2 == obj) {
                            O2 = e.f(uv3Var);
                            av8Var2.n0(O2);
                        }
                        final e1d e1dVar3 = (e1d) O2;
                        O3 = av8Var2.O();
                        if (O3 == obj) {
                            O3 = e.f("");
                            av8Var2.n0(O3);
                        }
                        e1dVar = (e1d) O3;
                        int i16 = i5 & 14;
                        z5 = i16 != 4;
                        O4 = av8Var2.O();
                        if (!z5 || O4 == obj) {
                            O4 = e.f(gv9Var);
                            av8Var2.n0(O4);
                        }
                        final e1d e1dVar4 = (e1d) O4;
                        String str = (String) e1dVar.getValue();
                        g2 = av8Var2.g(a2);
                        O5 = av8Var2.O();
                        if (!g2 || O5 == obj) {
                            O5 = new ck1(1, null, a2);
                            av8Var2.n0(O5);
                        }
                        hz8.o(av8Var2, str, (Function2) O5);
                        xtc u0 = hkg.u0(bkh.c, hkg.o0(av8Var2), false, 14);
                        kv1 kv1Var = uxf.p;
                        p4h p4hVar = ww9.d;
                        u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 54);
                        i14 = i5;
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, u0);
                        if3.k7.getClass();
                        Function0 function0 = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.q0();
                        } else {
                            av8Var2.l(function0);
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var2, a3, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var2, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var2, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var2, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var2, C, f50Var3);
                        String str2 = (String) e1dVar.getValue();
                        yf8 yf8Var = xth.a;
                        dfj a4 = dfj.a(xth.d(), j18, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                        long j25 = j18;
                        String v = oea.v(R.string.search, av8Var2);
                        utc utcVar = utc.a;
                        xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        av8Var2.d0(-820625623);
                        if (z3) {
                            xtcVar = d0;
                            ksaVar = a2;
                            xtcVar2 = utcVar;
                        } else {
                            Object O9 = av8Var2.O();
                            if (O9 == obj) {
                                O9 = new ce8();
                                av8Var2.n0(O9);
                            }
                            ce8 ce8Var = (ce8) O9;
                            Unit unit = Unit.a;
                            Object O10 = av8Var2.O();
                            if (O10 == obj) {
                                xtcVar = d0;
                                ksaVar = a2;
                                O10 = new ip1(ce8Var, null, 7);
                                av8Var2.n0(O10);
                            } else {
                                xtcVar = d0;
                                ksaVar = a2;
                            }
                            hz8.o(av8Var2, unit, (Function2) O10);
                            xtcVar2 = lz.G(utcVar, ce8Var);
                        }
                        av8Var2.s(false);
                        g3 = av8Var2.g(e1dVar4) | (i16 != 4) | av8Var2.i(obj2);
                        O6 = av8Var2.O();
                        if (!g3 || O6 == obj) {
                            O6 = new l50(gv9Var, obj2, e1dVar, e1dVar4, 7);
                            e1dVar2 = e1dVar;
                            av8Var2.n0(O6);
                        } else {
                            e1dVar2 = e1dVar;
                        }
                        int i17 = i14 >> 15;
                        long j26 = j14;
                        r13Var9 = r13Var8;
                        q5a.r(str2, xtcVar, xtcVar2, (Function1) O6, null, yqo.H(371832681, av8Var2, new kv3(j25)), yqo.H(-2043607992, av8Var2, new lv3(j25, gv9Var, e1dVar2, e1dVar4)), null, v, null, null, false, null, j19, 0, 0, a4, j17, j17, 0, false, false, false, av8Var2, 1769520, (i17 & 57344) | ((i14 << 6) & 234881024) | ((i14 << 9) & 1879048192), 3072, 7454352);
                        long j27 = j19;
                        nq8.h(av8Var2, bkh.e(utcVar, 12.0f));
                        if (((Boolean) O.getValue()).booleanValue()) {
                            j20 = j16;
                            av8Var2.d0(330840799);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(330770646);
                            long j28 = j16;
                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i17 & 7168, 7, 0L, j28, av8Var2, null);
                            j20 = j28;
                            av8Var2.s(false);
                        }
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        goa goaVar = new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                        t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                        boolean g5 = av8Var2.g(e1dVar4) | av8Var2.g(e1dVar3) | ((((i14 & 7168) ^ 3072) <= 2048 && av8Var2.f(j25)) || (i14 & 3072) == 2048);
                        if (((i14 & 57344) ^ 24576) <= 16384) {
                            j21 = j26;
                            if (av8Var2.f(j21)) {
                                j22 = j25;
                                z6 = true;
                                z7 = z6 | g5 | ((29360128 & i14) != 8388608);
                                O7 = av8Var2.O();
                                if (!z7 || O7 == obj) {
                                    final long j29 = j22;
                                    final long j30 = j21;
                                    final r13 r13Var12 = r13Var7;
                                    O7 = new Function1() { // from class: gv3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            esa esaVar = (esa) obj3;
                                            esaVar.getClass();
                                            e1d e1dVar5 = e1d.this;
                                            boolean isEmpty = ((gv9) e1dVar5.getValue()).isEmpty();
                                            long j31 = j29;
                                            if (isEmpty) {
                                                esa.d(esaVar, null, null, new tc3(842997244, new iv3(j31, 0), true), 3);
                                            } else {
                                                gv9 gv9Var2 = (gv9) e1dVar5.getValue();
                                                esaVar.a(gv9Var2.size(), new zi(12, new xt3(4), gv9Var2), new uk1(3, gv9Var2), new tc3(2039820996, new nv3(gv9Var2, j31, j30, r13Var12, e1dVar3, e1dVar5), true));
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    j10 = j29;
                                    j23 = j30;
                                    r13Var10 = r13Var12;
                                    av8Var2.n0(O7);
                                } else {
                                    j10 = j22;
                                    j23 = j21;
                                    r13Var10 = r13Var7;
                                }
                                v8a.a(goaVar, ksaVar, C2, null, null, null, false, null, (Function1) O7, av8Var2, 384, PglCryptUtils.BASE64_FAILED);
                                xtc E = d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30);
                                if (r13Var9 == null) {
                                    r13Var9.getClass();
                                    r13Var11 = r13Var9;
                                    E = E.z(n9e.q(utcVar, r13Var11.a, oyn.e));
                                } else {
                                    r13Var11 = r13Var9;
                                }
                                u23 a5 = t23.a(p4hVar, uxf.o, av8Var2, 0);
                                int hashCode2 = Long.hashCode(av8Var2.T);
                                aee m3 = av8Var2.m();
                                xtc C3 = fqj.C(av8Var2, E);
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.q0();
                                } else {
                                    av8Var2.l(function0);
                                }
                                waa.K(av8Var2, a5, f50Var);
                                waa.K(av8Var2, m3, ff3Var);
                                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                                waa.K(av8Var2, C3, f50Var3);
                                long j31 = j20;
                                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i17 & 7168, 7, 0L, j31, av8Var2, null);
                                String v2 = oea.v(R.string.confirm, av8Var2);
                                g4 = av8Var2.g(e1dVar3) | ((i14 & 896) != 256);
                                O8 = av8Var2.O();
                                if (!g4 || O8 == obj) {
                                    function12 = function1;
                                    O8 = new s91(e1dVar3, function12, 1);
                                    av8Var2.n0(O8);
                                } else {
                                    function12 = function1;
                                }
                                xqh xqhVar6 = xqhVar4;
                                mha.h(v2, (Function0) O8, l98.b0(bkh.d(utcVar, 1.0f), 16.0f), xqhVar6, null, ((uv3) e1dVar3.getValue()) == null && !((gv9) e1dVar4.getValue()).isEmpty(), false, false, 0L, 0, 0, av8Var2, ((i12 << 9) & 7168) | 384, 0, 2000);
                                av8Var = av8Var2;
                                av8Var.s(true);
                                av8Var.s(true);
                                r13Var6 = r13Var10;
                                r13Var5 = r13Var11;
                                xqhVar3 = xqhVar6;
                                j13 = j31;
                                j12 = j17;
                                j11 = j27;
                                z2 = z3;
                                j9 = j23;
                            }
                        } else {
                            j21 = j26;
                        }
                        j22 = j25;
                        if ((i14 & 24576) != 16384) {
                            z6 = false;
                            z7 = z6 | g5 | ((29360128 & i14) != 8388608);
                            O7 = av8Var2.O();
                            if (z7) {
                            }
                            final long j292 = j22;
                            final long j302 = j21;
                            final r13 r13Var122 = r13Var7;
                            O7 = new Function1() { // from class: gv3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    esa esaVar = (esa) obj3;
                                    esaVar.getClass();
                                    e1d e1dVar5 = e1d.this;
                                    boolean isEmpty = ((gv9) e1dVar5.getValue()).isEmpty();
                                    long j312 = j292;
                                    if (isEmpty) {
                                        esa.d(esaVar, null, null, new tc3(842997244, new iv3(j312, 0), true), 3);
                                    } else {
                                        gv9 gv9Var2 = (gv9) e1dVar5.getValue();
                                        esaVar.a(gv9Var2.size(), new zi(12, new xt3(4), gv9Var2), new uk1(3, gv9Var2), new tc3(2039820996, new nv3(gv9Var2, j312, j302, r13Var122, e1dVar3, e1dVar5), true));
                                    }
                                    return Unit.a;
                                }
                            };
                            j10 = j292;
                            j23 = j302;
                            r13Var10 = r13Var122;
                            av8Var2.n0(O7);
                            v8a.a(goaVar, ksaVar, C2, null, null, null, false, null, (Function1) O7, av8Var2, 384, PglCryptUtils.BASE64_FAILED);
                            xtc E2 = d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30);
                            if (r13Var9 == null) {
                            }
                            u23 a52 = t23.a(p4hVar, uxf.o, av8Var2, 0);
                            int hashCode22 = Long.hashCode(av8Var2.T);
                            aee m32 = av8Var2.m();
                            xtc C32 = fqj.C(av8Var2, E2);
                            av8Var2.h0();
                            if (av8Var2.S) {
                            }
                            waa.K(av8Var2, a52, f50Var);
                            waa.K(av8Var2, m32, ff3Var);
                            bf3.s(hashCode22, av8Var2, f50Var2, av8Var2, ryVar);
                            waa.K(av8Var2, C32, f50Var3);
                            long j312 = j20;
                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i17 & 7168, 7, 0L, j312, av8Var2, null);
                            String v22 = oea.v(R.string.confirm, av8Var2);
                            g4 = av8Var2.g(e1dVar3) | ((i14 & 896) != 256);
                            O8 = av8Var2.O();
                            if (g4) {
                            }
                            function12 = function1;
                            O8 = new s91(e1dVar3, function12, 1);
                            av8Var2.n0(O8);
                            xqh xqhVar62 = xqhVar4;
                            mha.h(v22, (Function0) O8, l98.b0(bkh.d(utcVar, 1.0f), 16.0f), xqhVar62, null, ((uv3) e1dVar3.getValue()) == null && !((gv9) e1dVar4.getValue()).isEmpty(), false, false, 0L, 0, 0, av8Var2, ((i12 << 9) & 7168) | 384, 0, 2000);
                            av8Var = av8Var2;
                            av8Var.s(true);
                            av8Var.s(true);
                            r13Var6 = r13Var10;
                            r13Var5 = r13Var11;
                            xqhVar3 = xqhVar62;
                            j13 = j312;
                            j12 = j17;
                            j11 = j27;
                            z2 = z3;
                            j9 = j23;
                        }
                        z6 = true;
                        z7 = z6 | g5 | ((29360128 & i14) != 8388608);
                        O7 = av8Var2.O();
                        if (z7) {
                        }
                        final long j2922 = j22;
                        final long j3022 = j21;
                        final r13 r13Var1222 = r13Var7;
                        O7 = new Function1() { // from class: gv3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                esa esaVar = (esa) obj3;
                                esaVar.getClass();
                                e1d e1dVar5 = e1d.this;
                                boolean isEmpty = ((gv9) e1dVar5.getValue()).isEmpty();
                                long j3122 = j2922;
                                if (isEmpty) {
                                    esa.d(esaVar, null, null, new tc3(842997244, new iv3(j3122, 0), true), 3);
                                } else {
                                    gv9 gv9Var2 = (gv9) e1dVar5.getValue();
                                    esaVar.a(gv9Var2.size(), new zi(12, new xt3(4), gv9Var2), new uk1(3, gv9Var2), new tc3(2039820996, new nv3(gv9Var2, j3122, j3022, r13Var1222, e1dVar3, e1dVar5), true));
                                }
                                return Unit.a;
                            }
                        };
                        j10 = j2922;
                        j23 = j3022;
                        r13Var10 = r13Var1222;
                        av8Var2.n0(O7);
                        v8a.a(goaVar, ksaVar, C2, null, null, null, false, null, (Function1) O7, av8Var2, 384, PglCryptUtils.BASE64_FAILED);
                        xtc E22 = d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30);
                        if (r13Var9 == null) {
                        }
                        u23 a522 = t23.a(p4hVar, uxf.o, av8Var2, 0);
                        int hashCode222 = Long.hashCode(av8Var2.T);
                        aee m322 = av8Var2.m();
                        xtc C322 = fqj.C(av8Var2, E22);
                        av8Var2.h0();
                        if (av8Var2.S) {
                        }
                        waa.K(av8Var2, a522, f50Var);
                        waa.K(av8Var2, m322, ff3Var);
                        bf3.s(hashCode222, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C322, f50Var3);
                        long j3122 = j20;
                        tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i17 & 7168, 7, 0L, j3122, av8Var2, null);
                        String v222 = oea.v(R.string.confirm, av8Var2);
                        g4 = av8Var2.g(e1dVar3) | ((i14 & 896) != 256);
                        O8 = av8Var2.O();
                        if (g4) {
                        }
                        function12 = function1;
                        O8 = new s91(e1dVar3, function12, 1);
                        av8Var2.n0(O8);
                        xqh xqhVar622 = xqhVar4;
                        mha.h(v222, (Function0) O8, l98.b0(bkh.d(utcVar, 1.0f), 16.0f), xqhVar622, null, ((uv3) e1dVar3.getValue()) == null && !((gv9) e1dVar4.getValue()).isEmpty(), false, false, 0L, 0, 0, av8Var2, ((i12 << 9) & 7168) | 384, 0, 2000);
                        av8Var = av8Var2;
                        av8Var.s(true);
                        av8Var.s(true);
                        r13Var6 = r13Var10;
                        r13Var5 = r13Var11;
                        xqhVar3 = xqhVar622;
                        j13 = j3122;
                        j12 = j17;
                        j11 = j27;
                        z2 = z3;
                        j9 = j23;
                    } else {
                        z3 = z;
                        xqhVar4 = xqhVar5;
                        j16 = j24;
                        r13Var7 = r13Var4;
                        r13Var8 = r13Var3;
                        j17 = j8;
                        j18 = j7;
                        j19 = j15;
                    }
                } else {
                    av8Var2.W();
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i4 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i4 & 512) != 0) {
                        i5 &= -1879048193;
                    }
                    j14 = j3;
                    j16 = j5;
                    j19 = j6;
                    z3 = z;
                    r13Var7 = r13Var4;
                    xqhVar4 = xqhVar2;
                    r13Var8 = r13Var3;
                    j17 = j8;
                    j18 = j7;
                }
                i13 = 32;
                av8Var2.t();
                Object obj22 = (Context) av8Var2.k(nz.b);
                a2 = msa.a(0, 0, av8Var2, 0, 3);
                O = z1a.O(a2, av8Var2);
                if ((i5 & 112) != i13) {
                }
                O2 = av8Var2.O();
                obj = nf3.a;
                if (!z4) {
                }
                O2 = e.f(uv3Var);
                av8Var2.n0(O2);
                final e1d e1dVar32 = (e1d) O2;
                O3 = av8Var2.O();
                if (O3 == obj) {
                }
                e1dVar = (e1d) O3;
                int i162 = i5 & 14;
                if (i162 != 4) {
                }
                O4 = av8Var2.O();
                if (!z5) {
                }
                O4 = e.f(gv9Var);
                av8Var2.n0(O4);
                final e1d e1dVar42 = (e1d) O4;
                String str3 = (String) e1dVar.getValue();
                g2 = av8Var2.g(a2);
                O5 = av8Var2.O();
                if (!g2) {
                }
                O5 = new ck1(1, null, a2);
                av8Var2.n0(O5);
                hz8.o(av8Var2, str3, (Function2) O5);
                xtc u02 = hkg.u0(bkh.c, hkg.o0(av8Var2), false, 14);
                kv1 kv1Var2 = uxf.p;
                p4h p4hVar2 = ww9.d;
                u23 a32 = t23.a(p4hVar2, kv1Var2, av8Var2, 54);
                i14 = i5;
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m22 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, u02);
                if3.k7.getClass();
                Function0 function02 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                }
                f50 f50Var4 = hf3.g;
                waa.K(av8Var2, a32, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var2, m22, ff3Var2);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                f50 f50Var22 = hf3.j;
                waa.K(av8Var2, valueOf2, f50Var22);
                ry ryVar2 = hf3.k;
                waa.J(av8Var2, ryVar2);
                f50 f50Var32 = hf3.d;
                waa.K(av8Var2, C4, f50Var32);
                String str22 = (String) e1dVar.getValue();
                yf8 yf8Var2 = xth.a;
                dfj a42 = dfj.a(xth.d(), j18, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                long j252 = j18;
                String v3 = oea.v(R.string.search, av8Var2);
                utc utcVar2 = utc.a;
                xtc d02 = l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                av8Var2.d0(-820625623);
                if (z3) {
                }
                av8Var2.s(false);
                g3 = av8Var2.g(e1dVar42) | (i162 != 4) | av8Var2.i(obj22);
                O6 = av8Var2.O();
                if (g3) {
                }
                O6 = new l50(gv9Var, obj22, e1dVar, e1dVar42, 7);
                e1dVar2 = e1dVar;
                av8Var2.n0(O6);
                int i172 = i14 >> 15;
                long j262 = j14;
                r13Var9 = r13Var8;
                q5a.r(str22, xtcVar, xtcVar2, (Function1) O6, null, yqo.H(371832681, av8Var2, new kv3(j252)), yqo.H(-2043607992, av8Var2, new lv3(j252, gv9Var, e1dVar2, e1dVar42)), null, v3, null, null, false, null, j19, 0, 0, a42, j17, j17, 0, false, false, false, av8Var2, 1769520, (i172 & 57344) | ((i14 << 6) & 234881024) | ((i14 << 9) & 1879048192), 3072, 7454352);
                long j272 = j19;
                nq8.h(av8Var2, bkh.e(utcVar2, 12.0f));
                if (((Boolean) O.getValue()).booleanValue()) {
                }
                if (1.0f <= 0.0d) {
                }
                goa goaVar2 = new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                t3e C22 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                boolean g52 = av8Var2.g(e1dVar42) | av8Var2.g(e1dVar32) | ((((i14 & 7168) ^ 3072) <= 2048 && av8Var2.f(j252)) || (i14 & 3072) == 2048);
                if (((i14 & 57344) ^ 24576) <= 16384) {
                }
                j22 = j252;
                if ((i14 & 24576) != 16384) {
                }
                z6 = true;
                z7 = z6 | g52 | ((29360128 & i14) != 8388608);
                O7 = av8Var2.O();
                if (z7) {
                }
                final long j29222 = j22;
                final long j30222 = j21;
                final r13 r13Var12222 = r13Var7;
                O7 = new Function1() { // from class: gv3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        esa esaVar = (esa) obj3;
                        esaVar.getClass();
                        e1d e1dVar5 = e1d.this;
                        boolean isEmpty = ((gv9) e1dVar5.getValue()).isEmpty();
                        long j31222 = j29222;
                        if (isEmpty) {
                            esa.d(esaVar, null, null, new tc3(842997244, new iv3(j31222, 0), true), 3);
                        } else {
                            gv9 gv9Var2 = (gv9) e1dVar5.getValue();
                            esaVar.a(gv9Var2.size(), new zi(12, new xt3(4), gv9Var2), new uk1(3, gv9Var2), new tc3(2039820996, new nv3(gv9Var2, j31222, j30222, r13Var12222, e1dVar32, e1dVar5), true));
                        }
                        return Unit.a;
                    }
                };
                j10 = j29222;
                j23 = j30222;
                r13Var10 = r13Var12222;
                av8Var2.n0(O7);
                v8a.a(goaVar2, ksaVar, C22, null, null, null, false, null, (Function1) O7, av8Var2, 384, PglCryptUtils.BASE64_FAILED);
                xtc E222 = d2a.E(bkh.d(utcVar2, 1.0f), 8.0f, null, false, 0L, 30);
                if (r13Var9 == null) {
                }
                u23 a5222 = t23.a(p4hVar2, uxf.o, av8Var2, 0);
                int hashCode2222 = Long.hashCode(av8Var2.T);
                aee m3222 = av8Var2.m();
                xtc C3222 = fqj.C(av8Var2, E222);
                av8Var2.h0();
                if (av8Var2.S) {
                }
                waa.K(av8Var2, a5222, f50Var4);
                waa.K(av8Var2, m3222, ff3Var2);
                bf3.s(hashCode2222, av8Var2, f50Var22, av8Var2, ryVar2);
                waa.K(av8Var2, C3222, f50Var32);
                long j31222 = j20;
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i172 & 7168, 7, 0L, j31222, av8Var2, null);
                String v2222 = oea.v(R.string.confirm, av8Var2);
                g4 = av8Var2.g(e1dVar32) | ((i14 & 896) != 256);
                O8 = av8Var2.O();
                if (g4) {
                }
                function12 = function1;
                O8 = new s91(e1dVar32, function12, 1);
                av8Var2.n0(O8);
                xqh xqhVar6222 = xqhVar4;
                mha.h(v2222, (Function0) O8, l98.b0(bkh.d(utcVar2, 1.0f), 16.0f), xqhVar6222, null, ((uv3) e1dVar32.getValue()) == null && !((gv9) e1dVar42.getValue()).isEmpty(), false, false, 0L, 0, 0, av8Var2, ((i12 << 9) & 7168) | 384, 0, 2000);
                av8Var = av8Var2;
                av8Var.s(true);
                av8Var.s(true);
                r13Var6 = r13Var10;
                r13Var5 = r13Var11;
                xqhVar3 = xqhVar6222;
                j13 = j31222;
                j12 = j17;
                j11 = j272;
                z2 = z3;
                j9 = j23;
            }
            u = av8Var.u();
            if (u == null) {
                final long j32 = j10;
                u.d = new Function2() { // from class: hv3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int K = aba.K(i2 | 1);
                        int K2 = aba.K(i3);
                        un0.d(gv9.this, uv3Var, function12, j32, j9, r13Var5, j12, r13Var6, j13, j11, xqhVar3, z2, (of3) obj3, K, K2, i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        r13Var4 = r13Var2;
        i6 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i6 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i8 = i4 & 1024;
        if (i8 == 0) {
        }
        i10 = i4 & a.o;
        if (i10 == 0) {
        }
        if (av8Var2.T(i5 & 1, (i5 & 306783379) == 306783378 || (i12 & 19) != 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void e(final SuggestStatus suggestStatus, final boolean z, final boolean z2, final boolean z3, of3 of3Var, final int i2) {
        int i3;
        char c2;
        int i4;
        int i5;
        suggestStatus.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1082589443);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(suggestStatus.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(z3) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
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
            kq9.b(s6a.N(j34.b(suggestStatus), 6, av8Var), null, bkh.l(utcVar, 24.0f), j34.f(suggestStatus, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            int[] iArr = n64.a;
            int i6 = iArr[suggestStatus.ordinal()];
            if (i6 == 1) {
                c2 = 4;
                i4 = R.string.crowdsourcing_submitted_status;
            } else if (i6 == 2) {
                c2 = 4;
                i4 = R.string.suggestion_pending;
            } else if (i6 != 3) {
                c2 = 4;
                if (i6 == 4) {
                    i4 = R.string.suggestion_unresolved;
                } else {
                    if (i6 != 5) {
                        zzl.b();
                        return;
                    }
                    i4 = R.string.suggestion_declined;
                }
            } else {
                c2 = 4;
                i4 = z2 ? R.string.suggestion_approved : R.string.crowdsourcing_accepted_status;
            }
            String v = oea.v(i4, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, z3 ? ljg.f(av8Var, 1624312306, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, 1624312786, R.color.n_lv_3, av8Var, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, z3 ? xth.l() : xth.g(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            if (z3) {
                bf3.r(12.0f, -2001436198, av8Var, av8Var, utcVar);
                l8g a4 = k8g.a(wxfVar, uxf.l, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C3 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                nq8.h(av8Var, bkh.p(utcVar, 32.0f));
                int i7 = iArr[suggestStatus.ordinal()];
                if (i7 == 1) {
                    i5 = R.string.crowdsourcing_submitted_status_description;
                } else if (i7 == 2) {
                    i5 = z ? R.string.crowdsourcing_checking_status_description : R.string.crowdsourcing_pending_status_description;
                } else if (i7 == 3) {
                    i5 = z2 ? R.string.crowdsourcing_approved_status_description : R.string.crowdsourcing_accepted_status_description;
                } else if (i7 == 4) {
                    i5 = R.string.crowdsourcing_unresolved_status_description;
                } else {
                    if (i7 != 5) {
                        zzl.b();
                        return;
                    }
                    i5 = R.string.crowdsourcing_declined_status_description;
                }
                udj.c(oea.v(i5, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(-2001041227);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: m64
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    un0.e(SuggestStatus.this, z, z2, z3, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(boolean z, Function0 function0, boolean z2, boolean z3, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z4;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1280018444);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function0) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i6 |= av8Var.i(tc3Var) ? 16384 : 8192;
        }
        if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            if (i5 != 0) {
                z2 = true;
            }
            if (z) {
                av8Var.d0(1985392450);
                oyn.b(function0, new z15(z2, z2), tc3Var, av8Var, ((i6 >> 6) & 896) | ((i6 >> 3) & 14));
                av8Var.s(false);
            } else {
                av8Var.d0(1985717454);
                av8Var.s(false);
            }
            z4 = true;
        } else {
            av8Var.W();
            z4 = z3;
        }
        boolean z5 = z2;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new a25(z, function0, z5, z4, tc3Var, i2, i3);
        }
    }

    public static final long g(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void h(long j2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-770784843);
        int i3 = i2 | (av8Var.f(j2) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            cdi M = hda.M(j2, av8Var, i3 & 14);
            mhj mhjVar = new mhj(((js8) M.getValue()).d, R.string.days_short);
            mhj mhjVar2 = new mhj(((js8) M.getValue()).e, R.string.hours_short);
            mhj mhjVar3 = new mhj(((js8) M.getValue()).f, R.string.minutes_short);
            mhj mhjVar4 = new mhj(((js8) M.getValue()).g, R.string.seconds_short);
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_2, av8Var), o7g.a(4.0f)), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.fantasy_next_round_starts_soon_countdown_timer, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            gvd.c(((js8) M.getValue()).d > 0 ? mhjVar : mhjVar2, ((js8) M.getValue()).d > 0 ? mhjVar2 : mhjVar3, ((js8) M.getValue()).d > 0 ? mhjVar3 : mhjVar4, lz.D(R.color.primary_default, av8Var), null, null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 240);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wz(i2, 1, j2, xtcVar2);
        }
    }

    public static final void i(ny5 ny5Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(927761521);
        int i3 = i2 | (av8Var.g(ny5Var) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc b0 = l98.b0(xtcVar, 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            String v = oea.v(R.string.trophies_won, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            r(ny5Var, av8Var, i3 & 14);
            xtc A = wnn.A(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.a(16.0f));
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
                O2 = b74.y;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(A, true, true, true, D, wzcVar, new kc6((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, ny5Var, i4), av8Var, 0), 8.0f, 4.0f);
            l8g a3 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
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
            udj.c(oea.v(ny5Var.f != null ? R.string.compare_trophies : R.string.compare, av8Var), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(ny5Var, xtcVar, i2, 17);
        }
    }

    public static final void j(ev6 ev6Var, Function1 function1, xtc xtcVar, boolean z, of3 of3Var, int i2) {
        ev6 ev6Var2;
        xtc xtcVar2;
        wxf wxfVar;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        zg3 zg3Var;
        int i3;
        f50 f50Var2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1810164896);
        int i4 = i2 | (av8Var.g(ev6Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384 | (av8Var.h(z) ? a.o : 1024);
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            long D = lz.D(R.color.surface_2, av8Var);
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc A = wnn.A(n9e.q(utcVar, D, a2), o7g.a(16.0f));
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new np6(function1, ev6Var, i5);
                av8Var.n0(O);
            }
            xtc y = tol.y(A, z, false, false, 0L, null, (Function0) O, av8Var, 30);
            av8 av8Var2 = av8Var;
            xtc b0 = l98.b0(y, 8.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar2 = ww9.b;
            l8g a3 = k8g.a(wxfVar2, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var2, a3, f50Var3);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var2, C, f50Var5);
            int i6 = op6.a[ev6Var.d.ordinal()];
            if (i6 == 1) {
                wxfVar = wxfVar2;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var4;
                zg3Var = zg3Var2;
                i3 = 0;
                f50Var2 = f50Var3;
                av8Var2.d0(-948516447);
                td4.q(ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar, 24.0f), av8Var2, 3072);
                av8Var2 = av8Var2;
                av8Var2.s(false);
                Unit unit = Unit.a;
            } else {
                if (i6 != 2) {
                    throw dmi.h(av8Var2, 1909062940, false);
                }
                av8Var2.d0(-948156413);
                wxfVar = wxfVar2;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var4;
                zg3Var = zg3Var2;
                kq9.b(s6a.N(R.drawable.ic_leagues, 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.value, av8Var2), av8Var2, 432, 0);
                i3 = 0;
                av8Var2.s(false);
                Unit unit2 = Unit.a;
                f50Var2 = f50Var3;
            }
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            u23 a4 = t23.a(ww9.d, uxf.o, av8Var2, i3);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var2);
            waa.K(av8Var2, m3, ff3Var);
            ry ryVar3 = ryVar;
            bf3.s(hashCode2, av8Var2, f50Var, av8Var2, ryVar3);
            waa.K(av8Var2, C2, f50Var5);
            String q2 = dmi.q(ev6Var.x ? "[A] " : "", ev6Var.e);
            yf8 yf8Var = xth.a;
            av8 av8Var3 = av8Var2;
            f50 f50Var6 = f50Var2;
            zg3 zg3Var3 = zg3Var;
            ff3 ff3Var3 = ff3Var;
            f50 f50Var7 = f50Var;
            udj.c(q2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
            nq8.h(av8Var3, bkh.e(utcVar, 4.0f));
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, utcVar);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var3);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a5, f50Var6);
            waa.K(av8Var3, m4, ff3Var3);
            bf3.s(hashCode3, av8Var3, f50Var7, av8Var3, ryVar3);
            waa.K(av8Var3, C3, f50Var5);
            kq9.b(s6a.N(R.drawable.ic_crowdsourcing, 6, av8Var3), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_3, av8Var3), av8Var3, 432, 0);
            nq8.h(av8Var3, bkh.p(utcVar, 4.0f));
            ev6Var2 = ev6Var;
            udj.c(uxf.E(ev6Var2.t, 58, false), null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 109562);
            av8Var = av8Var3;
            ljg.t(av8Var, true, true, true);
            xtcVar2 = utcVar;
        } else {
            ev6Var2 = ev6Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(ev6Var2, function1, xtcVar2, z, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final gv9 gv9Var, final ev6 ev6Var, final il8 il8Var, final boolean z, final boolean z2, final boolean z3, final Function1 function1, final Function0 function0, xtc xtcVar, boolean z4, boolean z5, of3 of3Var, final int i2, final int i3, final int i4) {
        gv9 gv9Var2;
        int i5;
        boolean z6;
        Function0 function02;
        xtc xtcVar2;
        int i6;
        boolean z7;
        int i7;
        int i8;
        av8 av8Var;
        final boolean z8;
        final xtc xtcVar3;
        final boolean z9;
        eqf u;
        gv9Var.getClass();
        il8Var.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1290630943);
        if ((i2 & 6) == 0) {
            gv9Var2 = gv9Var;
            i5 = (av8Var2.g(gv9Var2) ? 4 : 2) | i2;
        } else {
            gv9Var2 = gv9Var;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= av8Var2.g(ev6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= av8Var2.e(il8Var.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            z6 = z;
            i5 |= av8Var2.h(z6) ? a.o : 1024;
        } else {
            z6 = z;
        }
        if ((i2 & 24576) == 0) {
            i5 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= av8Var2.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i5 |= av8Var2.i(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            function02 = function0;
            i5 |= av8Var2.i(function02) ? 8388608 : 4194304;
        } else {
            function02 = function0;
        }
        int i9 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i9 != 0) {
            i5 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var2.g(xtcVar2) ? 67108864 : 33554432;
            i6 = i4 & 512;
            if (i6 == 0) {
                i5 |= 805306368;
                z7 = z4;
            } else {
                z7 = z4;
                if ((i2 & 805306368) == 0) {
                    i5 |= av8Var2.h(z7) ? 536870912 : 268435456;
                }
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
                i8 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i8 = i3 | (av8Var2.h(z5) ? 4 : 2);
            } else {
                i8 = i3;
            }
            if (av8Var2.T(i5 & 1, (i5 & 306783379) == 306783378 || (i8 & 3) != 2)) {
                av8Var = av8Var2;
                av8Var.W();
                z8 = z7;
                xtcVar3 = xtcVar2;
                z9 = z5;
            } else {
                xtc xtcVar4 = i9 != 0 ? utc.a : xtcVar2;
                final boolean z10 = i6 != 0 ? true : z7;
                boolean z11 = i7 == 0 ? z5 : true;
                final boolean c2 = Intrinsics.c(ev6Var != null ? Boolean.valueOf(ev6Var.A) : null, Boolean.TRUE);
                double doubleValue = ((Number) av8Var2.k(thb.a)).doubleValue();
                float f2 = (float) (6.0d * doubleValue);
                final float f3 = (float) (2.0d * doubleValue);
                final float f4 = (float) (doubleValue * 4.0d);
                cp cpVar = new cp(new v66(11), 13);
                ArrayList arrayList = new ArrayList();
                for (Object obj : gv9Var2) {
                    float f5 = f2;
                    xtc xtcVar5 = xtcVar4;
                    if (((FantasyRoundPlayerUiModel) obj).b == rz6.h) {
                        arrayList.add(obj);
                    }
                    xtcVar4 = xtcVar5;
                    f2 = f5;
                }
                final float f6 = f2;
                final xtc xtcVar6 = xtcVar4;
                List H0 = CollectionsKt.H0(arrayList, cpVar);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : gv9Var2) {
                    List list = H0;
                    if (((FantasyRoundPlayerUiModel) obj2).b == rz6.i) {
                        arrayList2.add(obj2);
                    }
                    H0 = list;
                }
                final List list2 = H0;
                List H02 = CollectionsKt.H0(arrayList2, cpVar);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : gv9Var2) {
                    List list3 = H02;
                    if (((FantasyRoundPlayerUiModel) obj3).b == rz6.j) {
                        arrayList3.add(obj3);
                    }
                    H02 = list3;
                }
                final List list4 = H02;
                List H03 = CollectionsKt.H0(arrayList3, cpVar);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : gv9Var2) {
                    List list5 = H03;
                    if (((FantasyRoundPlayerUiModel) obj4).b == rz6.k) {
                        arrayList4.add(obj4);
                    }
                    H03 = list5;
                }
                final List list6 = H03;
                final List H04 = CollectionsKt.H0(arrayList4, cpVar);
                final lmk J = o6a.J(s6a.N(R.drawable.fantasy_football_pitch, 6, av8Var2), av8Var2);
                final boolean z12 = z11;
                final boolean z13 = z6;
                final Function0 function03 = function02;
                av8Var = av8Var2;
                tol.b(dh3.n.a(ema.a), yqo.H(-2144171425, av8Var, new Function2() { // from class: ly6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i10;
                        float f7;
                        boolean z14;
                        boolean z15;
                        boolean z16;
                        boolean z17;
                        il8 il8Var2;
                        Function1 function12;
                        int i11;
                        of3 of3Var2 = (of3) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        lv1 lv1Var = uxf.l;
                        kv1 kv1Var = uxf.p;
                        av8 av8Var3 = (av8) of3Var2;
                        if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                            u23 a2 = t23.a(ww9.d, kv1Var, av8Var3, 48);
                            int hashCode = Long.hashCode(av8Var3.T);
                            aee m2 = av8Var3.m();
                            xtc C = fqj.C(av8Var3, xtc.this);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var3.h0();
                            if (av8Var3.S) {
                                av8Var3.l(zg3Var);
                            } else {
                                av8Var3.q0();
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var3, a2, f50Var);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var3, m2, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var3, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var3, ryVar);
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var3, C, f50Var3);
                            if (z12) {
                                av8Var3.d0(1056946526);
                                ev6 ev6Var2 = ev6Var;
                                if (ev6Var2 == null) {
                                    av8Var3.d0(-1594396061);
                                    av8Var3.s(false);
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    av8Var3.d0(-1594396060);
                                    o02.o(ev6Var2, null, av8Var3, 0);
                                    Unit unit = Unit.a;
                                    av8Var3.s(false);
                                }
                                av8Var3.s(false);
                            } else {
                                i10 = 2;
                                av8Var3.d0(-1594238983);
                                av8Var3.s(false);
                            }
                            k1c c3 = e12.c(uxf.c, false);
                            lv1 lv1Var2 = lv1Var;
                            int hashCode2 = Long.hashCode(av8Var3.T);
                            aee m3 = av8Var3.m();
                            utc utcVar = utc.a;
                            xtc C2 = fqj.C(av8Var3, utcVar);
                            av8Var3.h0();
                            boolean z18 = false;
                            if (av8Var3.S) {
                                av8Var3.l(zg3Var);
                            } else {
                                av8Var3.q0();
                            }
                            waa.K(av8Var3, c3, f50Var);
                            waa.K(av8Var3, m3, ff3Var);
                            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                            waa.K(av8Var3, C2, f50Var3);
                            xtc d2 = bkh.d(utcVar, 1.0f);
                            lmk lmkVar = J;
                            wkn.k(lmkVar, null, qx9.p(d2, Float.intBitsToFloat((int) (lmkVar.i() >> 32)) / Float.intBitsToFloat((int) (lmkVar.i() & 4294967295L))), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 24632, 104);
                            av8 av8Var4 = av8Var3;
                            ng0 ng0Var = new ng0(f6, true, new a70(6));
                            xtc f0 = l98.f0(qx9.p(bkh.d(utcVar, 1.0f), Float.intBitsToFloat((int) (lmkVar.i() >> 32)) / Float.intBitsToFloat((int) (lmkVar.i() & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            u23 a3 = t23.a(ng0Var, kv1Var, av8Var4, 48);
                            int hashCode3 = Long.hashCode(av8Var4.T);
                            aee m4 = av8Var4.m();
                            xtc C3 = fqj.C(av8Var4, f0);
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.l(zg3Var);
                            } else {
                                av8Var4.q0();
                            }
                            waa.K(av8Var4, a3, f50Var);
                            waa.K(av8Var4, m4, ff3Var);
                            bf3.s(hashCode3, av8Var4, f50Var2, av8Var4, ryVar);
                            waa.K(av8Var4, C3, f50Var3);
                            av8Var4.d0(-1764897804);
                            int i12 = 3;
                            List[] listArr = new List[3];
                            listArr[0] = list2;
                            listArr[1] = list4;
                            listArr[i10] = list6;
                            Iterator it = b.j(listArr).iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                f7 = f3;
                                il8 il8Var3 = il8Var;
                                z14 = z2;
                                z15 = z3;
                                Function1 function13 = function1;
                                z16 = c2;
                                z17 = z10;
                                il8Var2 = il8Var3;
                                function12 = function13;
                                if (!hasNext) {
                                    break;
                                }
                                List list7 = (List) it.next();
                                ng0 ng0Var2 = new ng0(f7, true, new l1(kv1Var, 5));
                                xtc d0 = l98.d0(gz8.x(bkh.t(utcVar, i12), null, null, i12), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10);
                                lv1 lv1Var3 = lv1Var2;
                                l8g a4 = k8g.a(ng0Var2, lv1Var3, av8Var4, z18 ? 1 : 0);
                                int hashCode4 = Long.hashCode(av8Var4.T);
                                aee m5 = av8Var4.m();
                                xtc C4 = fqj.C(av8Var4, d0);
                                if3.k7.getClass();
                                zg3 zg3Var2 = hf3.b;
                                av8Var4.h0();
                                if (av8Var4.S) {
                                    av8Var4.l(zg3Var2);
                                } else {
                                    av8Var4.q0();
                                }
                                waa.K(av8Var4, a4, hf3.g);
                                waa.K(av8Var4, m5, hf3.f);
                                waa.K(av8Var4, Integer.valueOf(hashCode4), hf3.j);
                                waa.J(av8Var4, hf3.k);
                                waa.K(av8Var4, C4, hf3.d);
                                av8Var4.d0(-822523414);
                                int size = list7.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) list7.get(i13);
                                    av8Var4.a0(421866310, Integer.valueOf(fantasyRoundPlayerUiModel.a));
                                    Function1 function14 = function12;
                                    il8 il8Var4 = il8Var2;
                                    av8 av8Var5 = av8Var4;
                                    boolean z19 = z17;
                                    dy0.g(fantasyRoundPlayerUiModel, il8Var4, z14, z15, function14, z16, null, z19, av8Var5, 0, 64);
                                    av8Var4 = av8Var5;
                                    av8Var4.s(false);
                                    i13++;
                                    il8Var2 = il8Var4;
                                    z14 = z14;
                                    function12 = function14;
                                    z17 = z19;
                                }
                                av8Var4.s(false);
                                av8Var4.s(true);
                                lv1Var2 = lv1Var3;
                                z18 = false;
                                i10 = 2;
                                i12 = 3;
                            }
                            lv1 lv1Var4 = lv1Var2;
                            boolean z20 = z15;
                            boolean z21 = z14;
                            boolean z22 = z18;
                            av8Var4.s(z22);
                            xtc d3 = bkh.d(utcVar, 1.0f);
                            k1c c4 = e12.c(uxf.k, z22);
                            int hashCode5 = Long.hashCode(av8Var4.T);
                            aee m6 = av8Var4.m();
                            xtc C5 = fqj.C(av8Var4, d3);
                            if3.k7.getClass();
                            zg3 zg3Var3 = hf3.b;
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.l(zg3Var3);
                            } else {
                                av8Var4.q0();
                            }
                            f50 f50Var4 = hf3.g;
                            waa.K(av8Var4, c4, f50Var4);
                            ff3 ff3Var2 = hf3.f;
                            waa.K(av8Var4, m6, ff3Var2);
                            Integer valueOf2 = Integer.valueOf(hashCode5);
                            f50 f50Var5 = hf3.j;
                            waa.K(av8Var4, valueOf2, f50Var5);
                            ry ryVar2 = hf3.k;
                            waa.J(av8Var4, ryVar2);
                            f50 f50Var6 = hf3.d;
                            waa.K(av8Var4, C5, f50Var6);
                            i4k h0 = s02.h0(250, 0, null, 6);
                            Object O = av8Var4.O();
                            int i14 = 12;
                            a99 a99Var = nf3.a;
                            if (O == a99Var) {
                                O = new yt6(i14);
                                av8Var4.n0(O);
                            }
                            zo5 m7 = uo5.m(h0, (Function1) O);
                            i4k h02 = s02.h0(250, 0, null, 6);
                            Object O2 = av8Var4.O();
                            if (O2 == a99Var) {
                                i11 = 12;
                                O2 = new yt6(i11);
                                av8Var4.n0(O2);
                            } else {
                                i11 = 12;
                            }
                            fz8.e(z13, null, m7, uo5.o(h02, (Function1) O2), null, yqo.H(-102851697, av8Var4, new qm4(i11, il8Var2, function03)), av8Var4, 196608, 18);
                            ng0 ng0Var3 = new ng0(f7, true, new l1(kv1Var, 5));
                            xtc d02 = l98.d0(n12.a.a(gz8.x(bkh.t(utcVar, 3), null, null, 3), uxf.g), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            l8g a5 = k8g.a(ng0Var3, lv1Var4, av8Var4, 0);
                            int hashCode6 = Long.hashCode(av8Var4.T);
                            aee m8 = av8Var4.m();
                            xtc C6 = fqj.C(av8Var4, d02);
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.l(zg3Var3);
                            } else {
                                av8Var4.q0();
                            }
                            waa.K(av8Var4, a5, f50Var4);
                            waa.K(av8Var4, m8, ff3Var2);
                            bf3.s(hashCode6, av8Var4, f50Var5, av8Var4, ryVar2);
                            waa.K(av8Var4, C6, f50Var6);
                            av8Var4.d0(-304859238);
                            List list8 = H04;
                            int size2 = list8.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) list8.get(i15);
                                av8Var4.a0(-383542347, Integer.valueOf(fantasyRoundPlayerUiModel2.a));
                                boolean z23 = z21;
                                boolean z24 = z20;
                                av8 av8Var6 = av8Var4;
                                dy0.g(fantasyRoundPlayerUiModel2, il8Var2, z23, z24, function12, z16, null, z17, av8Var6, 0, 64);
                                av8Var4 = av8Var6;
                                av8Var4.s(false);
                                i15++;
                                z21 = z23;
                                z20 = z24;
                            }
                            i.p(av8Var4, false, true, true, true);
                            av8Var4.s(true);
                            av8Var4.s(true);
                        } else {
                            av8Var3.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, 56);
                xtcVar3 = xtcVar6;
                z9 = z12;
                z8 = z10;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: my6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        ((Integer) obj6).getClass();
                        int K = aba.K(i2 | 1);
                        int K2 = aba.K(i3);
                        un0.k(gv9.this, ev6Var, il8Var, z, z2, z3, function1, function0, xtcVar3, z8, z9, (of3) obj5, K, K2, i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        i6 = i4 & 512;
        if (i6 == 0) {
        }
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        if (av8Var2.T(i5 & 1, (i5 & 306783379) == 306783378 || (i8 & 3) != 2)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void l(String str, String str2, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        str.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2039521796);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ek2 t = rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            tc3 H = yqo.H(1714462418, av8Var, new d67(21, (Object) str, (Object) str2, (Object) function1));
            xtcVar2 = utc.a;
            a(xtcVar2, a2, t, null, null, H, av8Var, 196614, 24);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 22, str, str2, function1, xtcVar2);
        }
    }

    public static final void m(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, mj7 mj7Var, ev6 ev6Var, Function1 function1, Function1 function12, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2;
        jz6 jz6Var;
        mj7Var.getClass();
        ev6Var.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(443461141);
        int i3 = (av8Var.g(xtcVar) ? 8388608 : 4194304) | i2 | (av8Var.g(fantasyRoundPlayerUiModel) ? 32 : 16) | (av8Var.g(mj7Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(ev6Var) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            qug o0 = hkg.o0(av8Var);
            dfh g2 = ctc.g(null, av8Var, 6, 2);
            ttk a2 = cib.a(av8Var);
            if (a2 == null) {
                a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            jz6 jz6Var2 = (jz6) sea.A(duf.a.getOrCreateKotlinClass(jz6.class), a2, kik.V(ufa.s(a2), av8Var), ufa.r(a2), av8Var);
            boolean i4 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | av8Var.i(jz6Var2);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                l50 l50Var = new l50(ev6Var, fantasyRoundPlayerUiModel, mj7Var, jz6Var2, 16);
                fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel;
                jz6Var = jz6Var2;
                av8Var.n0(l50Var);
                O2 = l50Var;
            } else {
                fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel;
                jz6Var = jz6Var2;
            }
            hz8.d(fantasyRoundPlayerUiModel2, (Function1) O2, av8Var);
            int i5 = i3 >> 15;
            tz9.k(true, function0, xtcVar, o0, g2, null, null, yqo.H(1933174327, av8Var, new er6(fantasyRoundPlayerUiModel2, ev6Var, context, mj7Var, 15)), yqo.H(-898154952, av8Var, new fth(function1, fantasyRoundPlayerUiModel, function12, jz6Var, ku3Var, g2, function0)), av8Var, (i5 & 112) | 113246214 | (i5 & 896), 96);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new el1(fantasyRoundPlayerUiModel, mj7Var, ev6Var, function1, function12, function0, xtcVar, i2, 2);
        }
    }

    public static final void n(final long j2, long j3, final long j4, final xtc xtcVar, of3 of3Var, final int i2) {
        final long j5;
        int i3;
        long D;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(317711112);
        int i4 = i2 | (av8Var.f(j2) ? 4 : 2) | 16 | (av8Var.f(j4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                i3 = i4 & (-113);
                D = lz.D(R.color.on_color_highlight_2, av8Var);
            } else {
                av8Var.W();
                i3 = i4 & (-113);
                D = j3;
            }
            av8Var.t();
            final cdi M = hda.M(j2, av8Var, i3 & 14);
            final mhj mhjVar = new mhj(((js8) M.getValue()).d, R.string.days_short);
            final mhj mhjVar2 = new mhj(((js8) M.getValue()).e, R.string.hours_short);
            final mhj mhjVar3 = new mhj(((js8) M.getValue()).f, R.string.minutes_short);
            final mhj mhjVar4 = new mhj(((js8) M.getValue()).g, R.string.seconds_short);
            final cdi b2 = a60.b(((js8) M.getValue()).b <= j2 ? j2 - ((js8) M.getValue()).b > 86400 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f - ((j2 - ((js8) M.getValue()).b) / 86400.0f) : 1.0f, null, "deadline_progress_animation", av8Var, 3072, 22);
            a(fz8.Y(xtcVar, n9a.b), o7g.a(12.0f), rd0.t(D, av8Var, 0), null, null, yqo.H(154903546, av8Var, new ct8() { // from class: tu8
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((v23) obj).getClass();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        utc utcVar = utc.a;
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        k1c c2 = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, d2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var2, c2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var2, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var2, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var2, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var2, C, f50Var3);
                        e12.a(0, av8Var2, n9e.q(bkh.c(bkh.d(utcVar, ((Number) cdi.this.getValue()).floatValue()), 1.0f), lz.D(R.color.sentiment_negative_highlight, av8Var2), oyn.e));
                        lv1 lv1Var = uxf.m;
                        xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
                        l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
                        int hashCode2 = Long.hashCode(av8Var2.T);
                        aee m3 = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, c0);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a2, f50Var);
                        waa.K(av8Var2, m3, ff3Var);
                        bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C2, f50Var3);
                        xtc l2 = bkh.l(utcVar, 24.0f);
                        ImageVector N = s6a.N(R.drawable.ic_timer, 6, av8Var2);
                        long j6 = j4;
                        kq9.b(N, null, l2, j6, av8Var2, 432, 0);
                        String f2 = fc6.f(8.0f, R.string.until_deadline, av8Var2, av8Var2, utcVar);
                        yf8 yf8Var = xth.a;
                        udj.c(f2, new goa(1.0f, true), j6, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110584);
                        nq8.h(av8Var2, bkh.p(utcVar, 4.0f));
                        cdi cdiVar = M;
                        int i5 = ((js8) cdiVar.getValue()).d;
                        mhj mhjVar5 = mhjVar2;
                        mhj mhjVar6 = i5 > 0 ? mhjVar : mhjVar5;
                        int i6 = ((js8) cdiVar.getValue()).d;
                        mhj mhjVar7 = mhjVar3;
                        mhj mhjVar8 = i6 > 0 ? mhjVar5 : mhjVar7;
                        if (((js8) cdiVar.getValue()).d <= 0) {
                            mhjVar7 = mhjVar4;
                        }
                        gvd.c(mhjVar6, mhjVar8, mhjVar7, j6, null, null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 240);
                        av8Var2.s(true);
                        av8Var2.s(true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 196608, 24);
            j5 = D;
        } else {
            av8Var.W();
            j5 = j3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(j2, j5, j4, xtcVar, i2) { // from class: uu8
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ xtc d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(3073);
                    un0.n(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final gk7 gk7Var, FantasyCompetitionType fantasyCompetitionType, final gv9 gv9Var, final Function1 function1, final Function1 function12, final Function0 function0, final boolean z, xtc xtcVar, Function2 function2, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        Function2 function22;
        int i5;
        av8 av8Var;
        xtc xtcVar3;
        Function2 function23;
        eqf u;
        FantasyCompetitionType fantasyCompetitionType2;
        e1d e1dVar;
        gk7Var.getClass();
        fantasyCompetitionType.getClass();
        gv9Var.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(574863232);
        int i6 = i2 | (av8Var2.i(gk7Var) ? 4 : 2) | (av8Var2.e(fantasyCompetitionType.ordinal()) ? 32 : 16) | (av8Var2.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | (av8Var2.i(function12) ? 16384 : 8192) | (av8Var2.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i7 = i3 & 128;
        if (i7 != 0) {
            i4 = i6 | 12582912;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i6 | (av8Var2.g(xtcVar2) ? 8388608 : 4194304);
        }
        int i8 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            function22 = function2;
            i4 |= av8Var2.i(function22) ? 67108864 : 33554432;
            i5 = i4;
            if (av8Var2.T(i5 & 1, (i5 & 38347923) == 38347922)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
                function23 = function22;
            } else {
                xtc xtcVar4 = i7 != 0 ? utc.a : xtcVar2;
                Function2 function24 = i8 != 0 ? m6k.a : function22;
                final Context context = (Context) av8Var2.k(nz.b);
                final osa a2 = rsa.a(gk7Var.t, av8Var2);
                final e1d x = rfo.x(gk7Var.A, av8Var2, 0);
                final e1d x2 = rfo.x(gk7Var.i, av8Var2, 0);
                e1d x3 = rfo.x(gk7Var.n, av8Var2, 0);
                final e1d x4 = rfo.x(gk7Var.o, av8Var2, 0);
                e1d x5 = rfo.x(gk7Var.p, av8Var2, 0);
                final e1d x6 = rfo.x(gk7Var.q, av8Var2, 0);
                final e1d x7 = rfo.x(gk7Var.r, av8Var2, 0);
                final e1d x8 = rfo.x(gk7Var.s, av8Var2, 0);
                Unit unit = Unit.a;
                boolean i9 = ((i5 & 112) == 32) | av8Var2.i(gk7Var);
                Object O = av8Var2.O();
                if (i9 || O == nf3.a) {
                    fantasyCompetitionType2 = fantasyCompetitionType;
                    e1dVar = x5;
                    O = new qa7(fantasyCompetitionType2, gk7Var, null, 4);
                    av8Var2.n0(O);
                } else {
                    fantasyCompetitionType2 = fantasyCompetitionType;
                    e1dVar = x5;
                }
                hz8.o(av8Var2, unit, (Function2) O);
                long j2 = r13.h;
                tc3 H = yqo.H(-1395942588, av8Var2, new uo6(gk7Var, function0, x3, 1));
                av8Var = av8Var2;
                final FantasyCompetitionType fantasyCompetitionType3 = fantasyCompetitionType2;
                final e1d e1dVar2 = e1dVar;
                xtc xtcVar5 = xtcVar4;
                Function2 function25 = function24;
                q5a.p(xtcVar5, H, function25, null, null, 0, j2, 0L, null, yqo.H(-1183623345, av8Var, new ct8() { // from class: fk7
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        rz6 rz6Var;
                        p3e p3eVar = (p3e) obj;
                        of3 of3Var2 = (of3) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        p3eVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((av8) of3Var2).g(p3eVar) ? 4 : 2;
                        }
                        av8 av8Var3 = (av8) of3Var2;
                        if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                            xtc a0 = l98.a0(utc.a, p3eVar);
                            q67 q67Var = (q67) x.getValue();
                            w28 w28Var = (w28) x2.getValue();
                            ho1 ho1Var = (ho1) x4.getValue();
                            Float f2 = (Float) e1dVar2.getValue();
                            String str = (String) x6.getValue();
                            if (str != null) {
                                rz6.g.getClass();
                                rz6Var = f7a.g(str);
                            } else {
                                rz6Var = null;
                            }
                            rz6 rz6Var2 = rz6Var;
                            gk7 gk7Var2 = gk7.this;
                            boolean z2 = gk7Var2.u == null && gk7Var2.v == null;
                            FantasyCompetitionType fantasyCompetitionType4 = FantasyCompetitionType.SEASON;
                            FantasyCompetitionType fantasyCompetitionType5 = fantasyCompetitionType3;
                            boolean z3 = fantasyCompetitionType5 == fantasyCompetitionType4;
                            boolean i10 = av8Var3.i(gk7Var2);
                            Object O2 = av8Var3.O();
                            a99 a99Var = nf3.a;
                            if (i10 || O2 == a99Var) {
                                O2 = new av6(0, gk7Var2, gk7.class, "clearFilters", "clearFilters()V", 0, 20);
                                av8Var3.n0(O2);
                            }
                            KFunction kFunction = (KFunction) O2;
                            cdi cdiVar = x7;
                            mei meiVar = (mei) cdiVar.getValue();
                            cdi cdiVar2 = x8;
                            nei neiVar = (nei) cdiVar2.getValue();
                            Function1 function13 = function1;
                            boolean g2 = av8Var3.g(function13);
                            Function0 function02 = function0;
                            boolean g3 = g2 | av8Var3.g(function02);
                            Object O3 = av8Var3.O();
                            if (g3 || O3 == a99Var) {
                                O3 = new xo6(function13, function02, 1);
                                av8Var3.n0(O3);
                            }
                            Function1 function14 = (Function1) O3;
                            boolean i11 = av8Var3.i(gk7Var2);
                            Object O4 = av8Var3.O();
                            if (i11 || O4 == a99Var) {
                                O4 = new wo6(gk7Var2, 4);
                                av8Var3.n0(O4);
                            }
                            Function1 function15 = (Function1) O4;
                            boolean i12 = av8Var3.i(gk7Var2);
                            Object O5 = av8Var3.O();
                            if (i12 || O5 == a99Var) {
                                O5 = new wo6(gk7Var2, 5);
                                av8Var3.n0(O5);
                            }
                            Function1 function16 = (Function1) O5;
                            boolean i13 = av8Var3.i(gk7Var2);
                            Object O6 = av8Var3.O();
                            if (i13 || O6 == a99Var) {
                                O6 = new wo6(gk7Var2, 6);
                                av8Var3.n0(O6);
                            }
                            Function1 function17 = (Function1) O6;
                            Function0 function03 = (Function0) kFunction;
                            Context context2 = context;
                            boolean i14 = av8Var3.i(context2) | av8Var3.g(cdiVar) | av8Var3.i(gk7Var2) | av8Var3.g(cdiVar2);
                            Object O7 = av8Var3.O();
                            if (i14 || O7 == a99Var) {
                                O7 = new yo6(context2, gk7Var2, cdiVar, cdiVar2, 1);
                                av8Var3.n0(O7);
                            }
                            c6o.g(a2, fantasyCompetitionType5, q67Var, w28Var, gv9Var, function14, function12, z2, z3, ho1Var, function15, f2, function16, rz6Var2, function17, function03, meiVar, neiVar, (Function1) O7, z, a0, av8Var3, 8);
                        } else {
                            av8Var3.W();
                        }
                        return Unit.a;
                    }
                }), av8Var, ((i5 >> 21) & 14) | 806879280 | ((i5 >> 18) & 896), 440);
                xtcVar3 = xtcVar5;
                function23 = function25;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new pm1(gk7Var, fantasyCompetitionType, gv9Var, function1, function12, function0, z, xtcVar3, function23, i2, i3);
                return;
            }
            return;
        }
        function22 = function2;
        i5 = i4;
        if (av8Var2.T(i5 & 1, (i5 & 38347923) == 38347922)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void p(boolean z, Function0 function0, z15 z15Var, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(763392312);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.i(tc3Var) ? a.o : 1024;
        }
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            z15Var = new z15(true, true);
            if (z) {
                av8Var.d0(368782381);
                oyn.b(function0, new z15(true, true, rzg.a, false), yqo.H(1593453930, av8Var, new b25(tc3Var, i5)), av8Var, ((i4 >> 3) & 14) | 384);
                av8Var.s(false);
            } else {
                av8Var.d0(370194090);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        z15 z15Var2 = z15Var;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(z, function0, z15Var2, tc3Var, i2, 6);
        }
    }

    public static final void q(u6b u6bVar, Function1 function1, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1868327245);
        int i3 = (av8Var.i(u6bVar) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            boolean i5 = ((i3 & 112) == 32) | av8Var.i(u6bVar) | ((i3 & 896) == 256);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new fa(i4, u6bVar, function1, function0);
                av8Var.n0(O);
            }
            hz8.d(u6bVar, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(u6bVar, function1, function0, i2, 2);
        }
    }

    public static final void r(ny5 ny5Var, of3 of3Var, int i2) {
        ny5 ny5Var2;
        av8 av8Var;
        utc utcVar;
        av8 av8Var2;
        boolean z;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-623177749);
        int i3 = i2 | (av8Var3.g(ny5Var) ? 4 : 2);
        int i4 = 1;
        if (av8Var3.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var3.k(nz.b);
            utc utcVar2 = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var3, 54);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var3, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            int i5 = ny5Var.a;
            Integer num = ny5Var.e;
            s(i5, ny5Var.c, true, av8Var3, 384);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var3, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            xtc A = wnn.A(utcVar2, o7g.a(16.0f));
            boolean z2 = num != null;
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
                O2 = b74.z;
                av8Var3.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(A, z2, true, true, D, wzcVar, new kc6((boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), context, ny5Var, i4), av8Var3, 0), 8.0f);
            u23 a3 = t23.a(ww9.d, uxf.p, av8Var3, 48);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, b0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var3);
            if (num == null) {
                av8Var3.d0(645405581);
                z = false;
                av8Var3.s(false);
                av8Var2 = av8Var3;
                utcVar = utcVar2;
            } else {
                av8Var3.d0(645405582);
                utcVar = utcVar2;
                av8Var2 = av8Var3;
                td4.y(num.intValue(), 48, 12, av8Var2, bkh.l(utcVar, 24.0f), null, false);
                z = false;
                av8Var2.s(false);
            }
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            ny5Var2 = ny5Var;
            String str = ny5Var2.f;
            if (str == null) {
                str = ljg.k(av8Var2, 1267754593, R.string.all_major_trophies, av8Var2, z);
            } else {
                av8Var2.d0(1267753849);
                av8Var2.s(z);
            }
            yf8 yf8Var = xth.a;
            av8 av8Var4 = av8Var2;
            udj.c(str, f0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var4, 48, 0, 131064);
            av8Var = av8Var4;
            av8Var.s(true);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            s(ny5Var2.b, ny5Var2.d, false, av8Var, 384);
            av8Var.s(true);
        } else {
            ny5Var2 = ny5Var;
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(ny5Var2, i2, 29);
        }
    }

    public static final void s(final int i2, final int i3, final boolean z, of3 of3Var, final int i4) {
        float f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1680661543);
        int i5 = (av8Var.e(i2) ? 4 : 2) | i4 | (av8Var.e(i3) ? 32 : 16);
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc l2 = bkh.l(utcVar, 64.0f);
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
                O2 = b74.A;
                av8Var.n0(O2);
            }
            xtc y = tol.y(l2, true, false, true, D, wzcVar, new lc6((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, i2), av8Var, 0);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc l3 = bkh.l(utcVar, 32.0f);
            if (!z) {
                mv1Var = uxf.e;
            }
            n12 n12Var = n12.a;
            td4.G(i2, n12Var.a(l3, mv1Var), false, 0L, av8Var, i5 & 14, 12);
            wkn.l(s6a.N(R.drawable.ic_trophy_bordered, 6, av8Var), n12Var.a(bkh.l(utcVar, 48.0f), z ? uxf.k : uxf.i), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 48, 120);
            float f3 = 16.0f;
            if (z) {
                f2 = 16.0f;
            } else {
                f2 = 16.0f;
                f3 = 0.0f;
            }
            xtc a2 = n12Var.a(bkh.o(n9e.q(l98.f0(utcVar, f3, 24.0f, z ? 0.0f : f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), lz.D(R.color.surface_1, av8Var), o7g.a), 20.0f, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), uxf.d);
            k1c c3 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, a2);
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
            String valueOf2 = String.valueOf(i3);
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
            u.d = new Function2(i2, i3, i4, z) { // from class: jc6
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;

                {
                    this.c = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(385);
                    un0.s(this.a, this.b, this.c, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final hof t(b1d b1dVar) {
        return new hof(b1dVar, null);
    }

    public static final jof u(f1d f1dVar) {
        return new jof(f1dVar, null);
    }

    public static final Object v(rq3 rq3Var, b98 b98Var, ct8 ct8Var, Function0 function0, z88[] z88VarArr) {
        a33 a33Var = new a33(null, b98Var, ct8Var, function0, z88VarArr);
        f98 f98Var = new f98(rq3Var, rq3Var.getContext());
        Object L = y6a.L(f98Var, true, f98Var, a33Var);
        return L == lu3.a ? L : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mbd w(z88 z88Var, int i2) {
        ln2.j7.getClass();
        int i3 = kn2.b;
        if (i2 >= i3) {
            i3 = i2;
        }
        int i4 = i3 - i2;
        if (z88Var instanceof rn2) {
            rn2 rn2Var = (rn2) z88Var;
            a62 a62Var = rn2Var.c;
            z88 i5 = rn2Var.i();
            if (i5 != null) {
                int i6 = rn2Var.b;
                if (i6 != -3 && i6 != -2 && i6 != 0) {
                    i4 = i6;
                } else if (a62Var != a62.a) {
                    if (i2 == 0) {
                        i4 = 1;
                    }
                    i4 = 0;
                }
                return new mbd(i4, a62Var, i5, rn2Var.a);
            }
        }
        return new mbd(i4, a62.a, z88Var, g.a);
    }

    public static int x(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = c[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + g[i4]) * 2;
        }
        int i6 = f[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static synchronized AudioManager y(Context context) {
        synchronized (un0.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    yh3 yh3Var = new yh3(0);
                    dy0.u().execute(new r0(13, applicationContext, yh3Var));
                    yh3Var.a();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final iz2 z(ltk ltkVar) {
        iz2 iz2Var;
        CoroutineContext coroutineContext;
        ltkVar.getClass();
        synchronized (o) {
            iz2Var = (iz2) ltkVar.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (iz2Var == null) {
                try {
                    try {
                        hs4 hs4Var = z45.a;
                        coroutineContext = rob.a.f;
                    } catch (ped unused) {
                        coroutineContext = g.a;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = g.a;
                }
                iz2 iz2Var2 = new iz2(coroutineContext.plus(tz9.o()));
                ltkVar.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", iz2Var2);
                iz2Var = iz2Var2;
            }
        }
        return iz2Var;
    }
}
