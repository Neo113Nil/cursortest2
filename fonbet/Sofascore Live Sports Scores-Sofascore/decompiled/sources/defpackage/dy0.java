package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.DateSection;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.newNetwork.commentary.SegmentEventType;
import com.sofascore.results.R;
import com.sofascore.results.event.commentary.CommentaryGoalModal;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class dy0 {
    public static ExecutorService a;
    public static final int[] b = {1, 2, 3, 6};
    public static final int[] c = {48000, 44100, 32000};
    public static final int[] d = {24000, 22050, 16000};
    public static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    public static final int[] g = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final tc3 h = new tc3(-825018959, new gd3(14), false);
    public static final tc3 i = new tc3(375818496, new pr1(8), false);
    public static final hg0 j = new hg0(1);
    public static final z k = new z(29);
    public static final long[] l = new long[0];
    public static final pff m = new pff(0, 5);
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;

    public static final xtc B(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new kqd(function1));
    }

    public static Task C(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        li3 li3Var = new li3(1, taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        hg0 hg0Var = j;
        task.continueWithTask(hg0Var, li3Var);
        task2.continueWithTask(hg0Var, li3Var);
        return taskCompletionSource.getTask();
    }

    public static final void D(mlh mlhVar, int i2, Object obj) {
        int g2 = mlhVar.g(i2);
        Object[] objArr = mlhVar.c;
        Object obj2 = objArr[g2];
        objArr[g2] = nf3.a;
        if (obj == obj2) {
            return;
        }
        sf3.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void E(List list, int i2, int i3) {
        int t = t(i2, list);
        if (t < 0) {
            t = -(t + 1);
        }
        while (t < list.size() && ((qaa) list.get(t)).b < i3) {
        }
    }

    public static void F(z41 z41Var, float f2) {
        f7g f7gVar = (f7g) z41Var.b;
        CardView cardView = (CardView) z41Var.c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != f7gVar.e || f7gVar.f != useCompatPadding || f7gVar.g != preventCornerOverlap) {
            f7gVar.e = f2;
            f7gVar.f = useCompatPadding;
            f7gVar.g = preventCornerOverlap;
            f7gVar.b(null);
            f7gVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            z41Var.z(0, 0, 0, 0);
            return;
        }
        f7g f7gVar2 = (f7g) z41Var.b;
        float f3 = f7gVar2.e;
        float f4 = f7gVar2.a;
        int ceil = (int) Math.ceil(g7g.a(f3, f4, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(g7g.b(f3, f4, cardView.getPreventCornerOverlap()));
        z41Var.z(ceil, ceil2, ceil, ceil2);
    }

    public static final void a(boolean z, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-431940892);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            zo5 e2 = uo5.e(s02.h0(400, 0, null, 6), 2);
            i4k h0 = s02.h0(400, 0, null, 6);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new dt(17);
                av8Var.n0(O);
            }
            zo5 a2 = e2.a(uo5.c(h0, (Function1) O, 4));
            of6 f2 = uo5.f(s02.h0(400, 0, null, 6), 2);
            i4k h02 = s02.h0(400, 0, null, 6);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new dt(18);
                av8Var.n0(O2);
            }
            of6 a3 = f2.a(uo5.k(h02, (Function1) O2, 4));
            int i4 = (i3 & 14) | 200112;
            utc utcVar = utc.a;
            fz8.e(z, utcVar, a2, a3, null, tc3Var, av8Var, i4, 16);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(z, xtcVar2, tc3Var, i2, 0);
        }
    }

    public static final void b(xtc xtcVar, io ioVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(380139498);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.g(ioVar) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i7 |= av8Var.i(tc3Var) ? 2048 : 1024;
        }
        if (av8Var.T(i7 & 1, (i7 & 1171) != 1170)) {
            if (i5 != 0) {
                xtcVar = utc.a;
            }
            if (i6 != 0) {
                ioVar = uxf.c;
            }
            k1c c2 = e12.c(ioVar, false);
            boolean g2 = av8Var.g(c2) | ((i7 & 7168) == 2048);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new vn6(19, c2, tc3Var);
                av8Var.n0(O);
            }
            rz8.r(xtcVar, (Function2) O, av8Var, i7 & 14, 0);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        io ioVar2 = ioVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(i2, i3, 0, xtcVar2, ioVar2, tc3Var);
        }
    }

    public static final void c(l64 l64Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        l64 l64Var2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2080396328);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(l64Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc h2 = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 16.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
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
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            utc utcVar = utc.a;
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
            String v = oea.v(R.string.status, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var);
            long D = lz.D(R.color.crowdsourcing, av8Var);
            xtc l2 = bkh.l(utcVar, 24.0f);
            boolean z2 = (i3 & 896) == 256;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new v61(15, function0);
                av8Var.n0(O);
            }
            kq9.b(N, null, oyn.w(l2, false, null, null, (Function0) O, 15), D, av8Var, 48, 0);
            av8Var = av8Var;
            bf3.t(av8Var, true, utcVar, 12.0f, av8Var);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            av8Var.d0(-1197465946);
            Iterator it = j34.d(l64Var, z).iterator();
            while (it.hasNext()) {
                un0.e((SuggestStatus) it.next(), l64Var == l64.b, z, false, av8Var, ((i3 << 3) & 896) | 3072);
            }
            l64Var2 = l64Var;
            ljg.t(av8Var, false, true, true);
        } else {
            l64Var2 = l64Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(l64Var2, z, function0, xtcVar, i2, 3);
        }
    }

    public static float d(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final void e(final String str, final String str2, final ev6 ev6Var, final boolean z, final boolean z2, final Function0 function0, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        xtc xtcVar3;
        str2.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1183448987);
        int i5 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(ev6Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i2 & 3072) == 0) {
            i5 |= av8Var.h(z) ? a.o : 1024;
        }
        if ((196608 & i2) == 0) {
            i5 |= av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 = i5 | 1572864;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            xtc xtcVar4 = i6 != 0 ? utc.a : xtcVar2;
            final f2a q2 = i2a.q(i2a.F("", av8Var, 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, s02.P(s02.h0(500, 0, jg5.d, 2), null, 0L, 6), "regenerate_rotation_animation", av8Var, 29112, 0);
            ek2 t = rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            xtc q3 = bkh.q(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 320.0f, 1);
            tc3 H = yqo.H(1981018601, av8Var, new ct8() { // from class: g47
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    utc utcVar;
                    int i7;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((v23) obj).getClass();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        utc utcVar2 = utc.a;
                        xtc A = wnn.A(l98.b0(utcVar2, 4.0f), o7g.a(16.0f));
                        k1c c2 = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, A);
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
                        wkn.k(haa.t(R.drawable.fantasy_background_tile, 0, av8Var2), null, n12.a.b(utcVar2), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
                        kv1 kv1Var = uxf.p;
                        xtc c0 = l98.c0(bkh.d(utcVar2, 1.0f), 8.0f, 12.0f);
                        u23 a3 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                        int hashCode2 = Long.hashCode(av8Var2.T);
                        aee m3 = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, c0);
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
                        l8g a4 = k8g.a(new ng0(32.0f, true, new a70(6)), uxf.l, av8Var2, 6);
                        int hashCode3 = Long.hashCode(av8Var2.T);
                        aee m4 = av8Var2.m();
                        xtc C3 = fqj.C(av8Var2, utcVar2);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a4, f50Var);
                        waa.K(av8Var2, m4, ff3Var);
                        bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C3, f50Var3);
                        ev6 ev6Var2 = ev6Var;
                        td4.q(ev6Var2.g, ev6Var2.a, ev6Var2.y, bkh.l(utcVar2, 32.0f), av8Var2, 3072);
                        td4.N(bkh.e(utcVar2, 32.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, av8Var2, 6, 6);
                        kq9.a(haa.t(R.drawable.ic_sofascore_logomark, 0, av8Var2), null, l98.b0(n9e.q(bkh.l(utcVar2, 32.0f), lz.D(R.color.rating_90, av8Var2), oyn.e), 6.0f), r13.d, av8Var2, 3128, 0);
                        bf3.t(av8Var2, true, utcVar2, 8.0f, av8Var2);
                        yf8 yf8Var = xth.a;
                        udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110586);
                        udj.c(bf3.g(24.0f, R.string.fantasy_league_code, av8Var2, av8Var2, utcVar2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                        nq8.h(av8Var2, bkh.e(utcVar2, 8.0f));
                        l8g a5 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                        int hashCode4 = Long.hashCode(av8Var2.T);
                        aee m5 = av8Var2.m();
                        xtc C4 = fqj.C(av8Var2, utcVar2);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a5, f50Var);
                        waa.K(av8Var2, m5, ff3Var);
                        bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C4, f50Var3);
                        dfj h2 = xth.h();
                        boolean z3 = z;
                        long f2 = z3 ? ljg.f(av8Var2, -833138213, R.color.n_lv_3, av8Var2, false) : ljg.f(av8Var2, -833137733, R.color.n_lv_1, av8Var2, false);
                        String str3 = str;
                        udj.c(str3, null, f2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, h2, av8Var2, 0, 24960, 110586);
                        av8 av8Var3 = av8Var2;
                        if (z2) {
                            av8Var3.d0(-57259175);
                            if (StringsKt.R(str3)) {
                                i7 = 0;
                                av8Var3.d0(-57159696);
                                av8Var3.s(false);
                            } else {
                                ljg.r(4.0f, -57240420, av8Var3, av8Var3, utcVar2);
                                i7 = 0;
                                av8Var3.s(false);
                            }
                            d7e t2 = haa.t(R.drawable.ic_refresh, i7, av8Var3);
                            long D = lz.D(R.color.primary_default, av8Var3);
                            av8Var3.d0(-833116304);
                            xtc l2 = bkh.l(utcVar2, 32.0f);
                            if (z3) {
                                utcVar = utcVar2;
                            } else {
                                xtc y = tol.y(utcVar2, false, false, false, 0L, null, function0, av8Var3, 29);
                                av8Var3 = av8Var3;
                                utcVar = utcVar2;
                                l2 = l2.z(y);
                            }
                            av8Var3.s(false);
                            xtc b0 = l98.b0(l2, 4.0f);
                            boolean h3 = av8Var3.h(z3);
                            cdi cdiVar = q2;
                            boolean g2 = h3 | av8Var3.g(cdiVar);
                            Object O = av8Var3.O();
                            if (g2 || O == nf3.a) {
                                O = new ju5(z3, cdiVar, 1);
                                av8Var3.n0(O);
                            }
                            kq9.a(t2, null, s02.M(b0, (Function1) O), D, av8Var3, 56, 0);
                            av8Var3.s(false);
                        } else {
                            utcVar = utcVar2;
                            av8Var3.d0(-56253008);
                            av8Var3.s(false);
                        }
                        av8Var3.s(true);
                        nq8.h(av8Var3, bkh.e(utcVar, 24.0f));
                        av8 av8Var4 = av8Var3;
                        udj.c("#SofascoreFantasy", null, lz.D(R.color.primary_default, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var4, 6, 24960, 110586);
                        av8Var4.s(true);
                        av8Var4.s(true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            });
            av8Var = av8Var;
            un0.a(q3, a2, t, null, null, H, av8Var, 196608, 24);
            xtcVar3 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new h47(str, str2, ev6Var, z, z2, function0, xtcVar3, i2, i3);
        }
    }

    public static final void f(k7d k7dVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-425038428);
        int i3 = i2 | 2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                k7dVar = q5a.N(new y8d[0], av8Var);
            } else {
                av8Var.W();
            }
            k7d k7dVar2 = k7dVar;
            av8Var.t();
            Context context = (Context) av8Var.k(nz.b);
            Object k2 = av8Var.k(ngb.a);
            k2.getClass();
            ComponentActivity componentActivity = (ComponentActivity) k2;
            wb7 wb7Var = (wb7) sea.A(duf.a.getOrCreateKotlinClass(wb7.class), componentActivity, kik.V(ufa.s(componentActivity), av8Var), ufa.r(componentActivity), av8Var);
            e1d x = rfo.x(wb7Var.k, av8Var, 0);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new dr6(wb7Var, componentActivity, context, 10);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean z = ((pb7) x.getValue()).v != null;
            boolean g2 = av8Var.g(x);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                O2 = new s91(x, function1, 6);
                av8Var.n0(O2);
            }
            tol.a(0, 0, av8Var, (Function0) O2, z);
            xa7 xa7Var = xa7.INSTANCE;
            boolean i4 = av8Var.i(k7dVar2) | av8Var.i(context) | av8Var.i(componentActivity);
            Object O3 = av8Var.O();
            if (i4 || O3 == obj) {
                Object l50Var = new l50(k7dVar2, context, function1, componentActivity, 17);
                av8Var.n0(l50Var);
                O3 = l50Var;
            }
            b6a.c(k7dVar2, xa7Var, null, null, null, null, null, null, null, (Function1) O3, av8Var, 48, 2044);
            k7dVar = k7dVar2;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jo6(k7dVar, i2, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, final il8 il8Var, final boolean z, final boolean z2, final Function1 function1, final boolean z3, xtc xtcVar, boolean z4, of3 of3Var, final int i2, final int i3) {
        int i4;
        boolean z5;
        final xtc xtcVar2;
        final boolean z6;
        eqf u;
        long f2;
        boolean z7;
        long f3;
        long j2;
        long f4;
        long f5;
        dfj a2;
        dfj dfjVar;
        int i5;
        FantasyPlayerUiModel fantasyPlayerUiModel;
        String str;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel;
        boolean z8;
        ImageVector N;
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo = fantasyRoundPlayerUiModel.C;
        boolean z9 = fantasyRoundPlayerUiModel.e;
        il8Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1552707883);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(fantasyRoundPlayerUiModel) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.e(il8Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.h(z2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i6 = 1572864 | i4;
        int i7 = i3 & 128;
        if (i7 != 0) {
            i6 = 14155776 | i4;
        } else if ((12582912 & i2) == 0) {
            z5 = z4;
            i6 |= av8Var.h(z5) ? 8388608 : 4194304;
            if (av8Var.T(i6 & 1, (i6 & 4793491) == 4793490)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                z6 = z5;
            } else {
                boolean z10 = i7 != 0 ? true : z5;
                yy6 yy6Var = fantasyRoundPlayerUiModel.c;
                int i8 = yy6Var == null ? -1 : sy6.a[yy6Var.ordinal()];
                if (i8 == 1 || i8 == 2) {
                    f2 = ljg.f(av8Var, -1798610306, R.color.n_lv_1, av8Var, false);
                } else if (i8 == 3 || i8 == 4) {
                    av8Var.d0(-1798608281);
                    f2 = r13.c(lz.D(R.color.on_color_primary, av8Var), 0.6f);
                    av8Var.s(false);
                } else {
                    f2 = ljg.f(av8Var, -1798607165, R.color.on_color_primary, av8Var, false);
                }
                if (z2 && fantasyRoundPlayerUiModel.w) {
                    z7 = z9;
                    f3 = ljg.f(av8Var, -1798604194, R.color.live, av8Var, false);
                } else {
                    z7 = z9;
                    f3 = ljg.f(av8Var, -1798603362, R.color.n_lv_1, av8Var, false);
                }
                long j3 = f3;
                if (yy6Var == yy6.AVAILABLE) {
                    f5 = ljg.f(av8Var, -1798600728, R.color.primary_default, av8Var, false);
                } else if (yy6Var == yy6.SUBSTITUTING_OUT) {
                    f5 = ljg.f(av8Var, -1798598689, R.color.alert, av8Var, false);
                } else if (yy6Var == yy6.TRANSFERRING_IN || yy6Var == yy6.SUBSTITUTING_IN) {
                    j2 = f2;
                    f4 = ljg.f(av8Var, -1798595838, R.color.surface_P, av8Var, false);
                    String str2 = (String) il8Var.e.invoke(fantasyRoundPlayerUiModel);
                    boolean z11 = il8Var != il8.g || (il8Var == il8.f && !fantasyRoundPlayerUiModel.v);
                    boolean z12 = !fantasyRoundPlayerUiModel.c() && z2 && il8Var == il8.f;
                    double doubleValue = ((Number) av8Var.k(thb.a)).doubleValue();
                    boolean z13 = z10;
                    float f6 = (float) (64.0d * doubleValue);
                    float f7 = (float) (68.0d * doubleValue);
                    int i9 = i6;
                    float f8 = (float) (4.0d * doubleValue);
                    float f9 = (float) (2.0d * doubleValue);
                    float f10 = (float) (14.0d * doubleValue);
                    float f11 = (yy6Var == null && yy6Var.a) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) (2.0d * doubleValue);
                    float f12 = (float) (12.0d * doubleValue);
                    yf8 yf8Var = xth.a;
                    dfj k2 = xth.k();
                    long j4 = xth.k().a.b;
                    v8a.l(j4);
                    boolean z14 = z12;
                    long E = v8a.E(j4 & 1095216660480L, (float) (lfj.c(j4) * doubleValue));
                    long j5 = xth.k().b.c;
                    v8a.l(j5);
                    dfj a3 = dfj.a(k2, 0L, E, null, null, 0L, null, 0, 0, v8a.E(j5 & 1095216660480L, (float) (lfj.c(j5) * doubleValue)), null, null, 0, 16646141);
                    dfj c2 = xth.c();
                    long j6 = xth.c().a.b;
                    v8a.l(j6);
                    long E2 = v8a.E(j6 & 1095216660480L, (float) (lfj.c(j6) * doubleValue));
                    long j7 = xth.c().b.c;
                    v8a.l(j7);
                    a2 = dfj.a(c2, 0L, E2, null, null, 0L, !z14 ? v8j.d : v8j.b, 0, 0, v8a.E(j7 & 1095216660480L, (float) (lfj.c(j7) * doubleValue)), null, null, 0, 16642045);
                    kv1 kv1Var = uxf.p;
                    av8Var.d0(-1798545311);
                    utc utcVar = utc.a;
                    xtc C = !z7 ? u6h.C(utcVar, 0.5f) : utcVar;
                    if (!z7 || function1 == null) {
                        dfjVar = a2;
                        i5 = 57344;
                    } else {
                        i5 = 57344;
                        dfjVar = a2;
                        boolean z15 = ((i9 & 57344) == 16384) | ((i9 & 14) == 4);
                        Object O = av8Var.O();
                        if (z15 || O == nf3.a) {
                            O = new lw6(function1, fantasyRoundPlayerUiModel, 1);
                            av8Var.n0(O);
                        }
                        C = C.z(tol.n(utcVar, 0.9f, (Function0) O, 2));
                    }
                    av8Var.s(false);
                    if (Intrinsics.c(yy6Var == null ? Boolean.valueOf(yy6Var.a) : null, Boolean.TRUE)) {
                        C = C.z(yso.o(utcVar, f9, f4, o7g.a(f8)));
                    }
                    xtc e2 = bkh.e(bkh.p(l98.b0(C, f9), f6), f7);
                    u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, e2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a4, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    int i10 = i9 >> 9;
                    h(fantasyRoundPlayerUiModel, z, z3, ljg.g(av8Var, C2, f50Var3, 1.0f, true), z13, av8Var, (i10 & i5) | (i10 & 896) | (i9 & 14) | ((i9 >> 3) & 112));
                    mv1 mv1Var = uxf.g;
                    xtc d0 = l98.d0(n9e.q(bkh.e(bkh.d(utcVar, 1.0f), f10), f4, o7g.c(f11, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    k1c c3 = e12.c(mv1Var, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, d0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, c3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
                    str = fantasyPlayerUiModel.h;
                    if (str == null && (str = fantasyPlayerUiModel.g) == null) {
                        str = fantasyPlayerUiModel.f;
                    }
                    udj.c(str, bkh.d(utcVar, 1.0f), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a3, av8Var, 48, 24960, 109560);
                    av8Var.s(true);
                    kg0 kg0Var = ww9.f;
                    lv1 lv1Var = uxf.m;
                    xtc d02 = l98.d0(n9e.q(bkh.e(bkh.d(utcVar, 1.0f), f12), lz.D(R.color.surface_P, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, f11, 3)), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a5 = k8g.a(kg0Var, lv1Var, av8Var, 54);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C4 = fqj.C(av8Var, d02);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, a5, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    fqj.a(str2, dfjVar, j3, ljg.g(av8Var, C4, f50Var3, 1.0f, false), null, av8Var, 0, 16);
                    av8Var = av8Var;
                    fantasyPlayerFixtureUiModel = fantasyRoundPlayerInfo.g;
                    if ((fantasyPlayerFixtureUiModel != null ? fantasyPlayerFixtureUiModel.o : null) == null && z11) {
                        ljg.r(4.0f, 666891451, av8Var, av8Var, utcVar);
                        xtc l2 = bkh.l(utcVar, f12);
                        int ordinal = fantasyRoundPlayerInfo.g.o.ordinal();
                        if (ordinal == 0) {
                            z8 = false;
                            av8Var.d0(-394118026);
                            N = s6a.N(R.drawable.ic_home, 6, av8Var);
                            av8Var.s(false);
                        } else {
                            if (ordinal != 1) {
                                throw dmi.h(av8Var, -394121527, false);
                            }
                            av8Var.d0(-394114698);
                            N = s6a.N(R.drawable.ic_away, 6, av8Var);
                            z8 = false;
                            av8Var.s(false);
                        }
                        kq9.b(N, null, l2, j3, av8Var, 48, 0);
                        av8Var.s(z8);
                    } else {
                        av8Var.d0(667437299);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                    z6 = z13;
                } else {
                    FantasyPlayerMissingData fantasyPlayerMissingData = fantasyRoundPlayerUiModel.l;
                    if ((fantasyPlayerMissingData != null ? fantasyPlayerMissingData.a : null) == sd7.d) {
                        f5 = ljg.f(av8Var, -1798593857, R.color.alert, av8Var, false);
                    } else {
                        f5 = (fantasyPlayerMissingData != null ? fantasyPlayerMissingData.a : null) == sd7.e ? ljg.f(av8Var, -1798592001, R.color.error, av8Var, false) : ljg.f(av8Var, -1798591128, R.color.primary_default, av8Var, false);
                    }
                }
                j2 = f2;
                f4 = f5;
                String str22 = (String) il8Var.e.invoke(fantasyRoundPlayerUiModel);
                if (il8Var != il8.g) {
                }
                if (fantasyRoundPlayerUiModel.c()) {
                }
                double doubleValue2 = ((Number) av8Var.k(thb.a)).doubleValue();
                boolean z132 = z10;
                float f62 = (float) (64.0d * doubleValue2);
                float f72 = (float) (68.0d * doubleValue2);
                int i92 = i6;
                float f82 = (float) (4.0d * doubleValue2);
                float f92 = (float) (2.0d * doubleValue2);
                float f102 = (float) (14.0d * doubleValue2);
                float f112 = (yy6Var == null && yy6Var.a) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) (2.0d * doubleValue2);
                float f122 = (float) (12.0d * doubleValue2);
                yf8 yf8Var2 = xth.a;
                dfj k22 = xth.k();
                long j42 = xth.k().a.b;
                v8a.l(j42);
                boolean z142 = z12;
                long E3 = v8a.E(j42 & 1095216660480L, (float) (lfj.c(j42) * doubleValue2));
                long j52 = xth.k().b.c;
                v8a.l(j52);
                dfj a32 = dfj.a(k22, 0L, E3, null, null, 0L, null, 0, 0, v8a.E(j52 & 1095216660480L, (float) (lfj.c(j52) * doubleValue2)), null, null, 0, 16646141);
                dfj c22 = xth.c();
                long j62 = xth.c().a.b;
                v8a.l(j62);
                long E22 = v8a.E(j62 & 1095216660480L, (float) (lfj.c(j62) * doubleValue2));
                long j72 = xth.c().b.c;
                v8a.l(j72);
                a2 = dfj.a(c22, 0L, E22, null, null, 0L, !z142 ? v8j.d : v8j.b, 0, 0, v8a.E(j72 & 1095216660480L, (float) (lfj.c(j72) * doubleValue2)), null, null, 0, 16642045);
                kv1 kv1Var2 = uxf.p;
                av8Var.d0(-1798545311);
                utc utcVar2 = utc.a;
                if (!z7) {
                }
                if (z7) {
                }
                dfjVar = a2;
                i5 = 57344;
                av8Var.s(false);
                if (Intrinsics.c(yy6Var == null ? Boolean.valueOf(yy6Var.a) : null, Boolean.TRUE)) {
                }
                xtc e22 = bkh.e(bkh.p(l98.b0(C, f92), f62), f72);
                u23 a42 = t23.a(ww9.d, kv1Var2, av8Var, 48);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m22 = av8Var.m();
                xtc C22 = fqj.C(av8Var, e22);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                f50 f50Var4 = hf3.g;
                waa.K(av8Var, a42, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var, m22, ff3Var2);
                Integer valueOf2 = Integer.valueOf(hashCode4);
                f50 f50Var22 = hf3.j;
                waa.K(av8Var, valueOf2, f50Var22);
                ry ryVar2 = hf3.k;
                waa.J(av8Var, ryVar2);
                f50 f50Var32 = hf3.d;
                int i102 = i92 >> 9;
                h(fantasyRoundPlayerUiModel, z, z3, ljg.g(av8Var, C22, f50Var32, 1.0f, true), z132, av8Var, (i102 & i5) | (i102 & 896) | (i92 & 14) | ((i92 >> 3) & 112));
                mv1 mv1Var2 = uxf.g;
                xtc d03 = l98.d0(n9e.q(bkh.e(bkh.d(utcVar2, 1.0f), f102), f4, o7g.c(f112, f112, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                k1c c32 = e12.c(mv1Var2, false);
                int hashCode22 = Long.hashCode(av8Var.T);
                aee m32 = av8Var.m();
                xtc C32 = fqj.C(av8Var, d03);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, c32, f50Var4);
                waa.K(av8Var, m32, ff3Var2);
                bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                waa.K(av8Var, C32, f50Var32);
                fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
                str = fantasyPlayerUiModel.h;
                if (str == null) {
                    str = fantasyPlayerUiModel.f;
                }
                udj.c(str, bkh.d(utcVar2, 1.0f), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a32, av8Var, 48, 24960, 109560);
                av8Var.s(true);
                kg0 kg0Var2 = ww9.f;
                lv1 lv1Var2 = uxf.m;
                xtc d022 = l98.d0(n9e.q(bkh.e(bkh.d(utcVar2, 1.0f), f122), lz.D(R.color.surface_P, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f112, f112, 3)), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                l8g a52 = k8g.a(kg0Var2, lv1Var2, av8Var, 54);
                int hashCode32 = Long.hashCode(av8Var.T);
                aee m42 = av8Var.m();
                xtc C42 = fqj.C(av8Var, d022);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a52, f50Var4);
                waa.K(av8Var, m42, ff3Var2);
                bf3.s(hashCode32, av8Var, f50Var22, av8Var, ryVar2);
                fqj.a(str22, dfjVar, j3, ljg.g(av8Var, C42, f50Var32, 1.0f, false), null, av8Var, 0, 16);
                av8Var = av8Var;
                fantasyPlayerFixtureUiModel = fantasyRoundPlayerInfo.g;
                if ((fantasyPlayerFixtureUiModel != null ? fantasyPlayerFixtureUiModel.o : null) == null) {
                }
                av8Var.d0(667437299);
                av8Var.s(false);
                av8Var.s(true);
                av8Var.s(true);
                xtcVar2 = utcVar2;
                z6 = z132;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: oy6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dy0.g(FantasyRoundPlayerUiModel.this, il8Var, z, z2, function1, z3, xtcVar2, z6, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z5 = z4;
        if (av8Var.T(i6 & 1, (i6 & 4793491) == 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void h(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, boolean z, boolean z2, xtc xtcVar, boolean z3, of3 of3Var, int i2) {
        int i3;
        boolean z4;
        xtc xtcVar2;
        Object kd3Var;
        pm3 pm3Var;
        e1d e1dVar;
        int i4;
        int i5;
        yy6 yy6Var = fantasyRoundPlayerUiModel.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-201737418);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(fantasyRoundPlayerUiModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z2;
            i3 |= av8Var.h(z4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            z4 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.h(z3) ? 16384 : 8192;
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            av8Var.d0(-596121939);
            if (Intrinsics.c(yy6Var != null ? Boolean.valueOf(yy6Var.a) : null, Boolean.TRUE)) {
                if (yy6Var == yy6.AVAILABLE) {
                    i4 = 854573524;
                    i5 = R.color.on_color_highlight_1;
                } else {
                    i4 = 854574252;
                    i5 = R.color.n_lv_4;
                }
                xtcVar2 = xtcVar.z(n9e.q(utc.a, ljg.f(av8Var, i4, i5, av8Var, false), oyn.e));
            } else {
                xtcVar2 = xtcVar;
            }
            av8Var.s(false);
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
            e1d e1dVar2 = (e1d) O3;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = new pm3(am3Var);
                av8Var.n0(O4);
            }
            pm3 pm3Var2 = (pm3) O4;
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = e.e(Unit.a, f7a.k);
                av8Var.n0(O5);
            }
            e1d e1dVar3 = (e1d) O5;
            boolean i6 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O6 = av8Var.O();
            if (i6 || O6 == obj) {
                kd3Var = new kd3(e1dVar3, t1cVar, pm3Var2, e1dVar2, 3);
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
                av8Var.n0(kd3Var);
            } else {
                kd3Var = O6;
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
            }
            k1c k1cVar = (k1c) kd3Var;
            Object O7 = av8Var.O();
            int i7 = 3;
            if (O7 == obj) {
                O7 = new ld3(e1dVar, pm3Var, i7);
                av8Var.n0(O7);
            }
            Function0 function0 = (Function0) O7;
            boolean i8 = av8Var.i(t1cVar);
            Object O8 = av8Var.O();
            if (i8 || O8 == obj) {
                O8 = new md3(t1cVar, i7);
                av8Var.n0(O8);
            }
            s6a.h(o3h.a(xtcVar2, false, (Function1) O8), yqo.H(1200550679, av8Var, new py6(e1dVar3, am3Var, function0, fantasyRoundPlayerUiModel, z4, z3, z)), k1cVar, av8Var, 48);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ny6(fantasyRoundPlayerUiModel, z, z2, xtcVar, z3, i2);
        }
    }

    public static final void i(ke9 ke9Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        ke9 ke9Var2 = ke9Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1194152212);
        int i3 = i2 | (av8Var.g(ke9Var2) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc b0 = l98.b0(tol.y(n9e.q(wnn.A(bkh.p(utcVar, 156.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31), 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
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
            int i4 = ke9Var2.e;
            n12 n12Var = n12.a;
            k(i4, 0, av8Var, n12Var.a(utcVar, mv1Var));
            xtc f0 = l98.f0(n12Var.a(utcVar, uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
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
            td4.C(ke9Var2.b, bkh.l(n12Var.a(utcVar, uxf.g), 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
            td4.G(ke9Var2.c, bkh.l(n12Var.a(utcVar, uxf.i), 16.0f), false, 0L, av8Var, 0, 12);
            j(0, av8Var, n12Var.a(utcVar, uxf.k), ke9Var2.d);
            av8Var.s(true);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            String str = ke9Var2.a;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc d3 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            ke9Var2 = ke9Var;
            le9 le9Var = ke9Var2.f;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            l(le9Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
            le9 le9Var2 = ke9Var2.g;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            l(le9Var2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(ke9Var2, function0, xtcVar2, i2, 23);
        }
    }

    public static final void j(int i2, of3 of3Var, xtc xtcVar, String str) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1801084036);
        int i5 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            mv1 mv1Var = uxf.g;
            xtc l2 = bkh.l(xtcVar, 16.0f);
            n7g n7gVar = o7g.a;
            if (str.equals("G")) {
                i3 = 30072646;
                i4 = R.color.value;
            } else if (str.equals("D")) {
                i3 = 30074447;
                i4 = R.color.primary_variant;
            } else {
                i3 = 30075973;
                i4 = R.color.live;
            }
            xtc q2 = n9e.q(l2, ljg.f(av8Var, i3, i4, av8Var, false), n7gVar);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
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
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, i5 & 14, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar, i2, 2);
        }
    }

    public static final void k(int i2, int i3, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1543016239);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
            kq9.b(s6a.N(R.drawable.ic_star_filled_16, 6, av8Var), null, bkh.l(utc.a, 16.0f), lz.D(R.color.value, av8Var), av8Var, 432, 0);
            String p2 = yid.p(i2);
            yf8 yf8Var = xth.a;
            udj.c(p2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar, i3, 10);
        }
    }

    public static final void l(le9 le9Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2042122672);
        int i3 = (av8Var.g(le9Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), o7g.a(8.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            String upperCase = le9Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            udj.c(le9Var.b, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(le9Var, xtcVar, i2, 28);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void m(int r46, defpackage.of3 r47, defpackage.gv9 r48, defpackage.xtc r49, kotlin.jvm.functions.Function0 r50, kotlin.jvm.functions.Function1 r51) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy0.m(int, of3, gv9, xtc, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(String str, String str2, Function0 function0, String str3, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        String str4;
        int i4;
        int i5;
        av8 av8Var;
        boolean z3;
        boolean z4;
        eqf u;
        int i6;
        boolean z5;
        boolean z6;
        str.getClass();
        str2.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-47923392);
        int i7 = (av8Var2.g(str) ? 4 : 2) | i2 | (av8Var2.g(str2) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i7 |= av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 8) == 0) {
            str4 = str3;
            if (av8Var2.g(str4)) {
                i4 = a.o;
                i5 = i7 | i4 | 316366848;
                if (av8Var2.T(i5 & 1, (306783379 & i5) == 306783378)) {
                    av8Var = av8Var2;
                    av8Var.W();
                    z3 = z;
                    z4 = z2;
                } else {
                    av8Var2.Y();
                    if ((i2 & 1) == 0 || av8Var2.B()) {
                        if ((i3 & 8) != 0) {
                            str4 = oea.v(R.string.got_it_button, av8Var2);
                            i5 &= -7169;
                        }
                        i6 = i5 & (-2113929217);
                        z5 = true;
                        z6 = true;
                    } else {
                        av8Var2.W();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        z6 = z2;
                        i6 = i5 & (-2113929217);
                        z5 = z;
                    }
                    av8Var2.t();
                    utc utcVar = utc.a;
                    xtc b0 = l98.b0(n9e.q(wnn.A(l98.b0(utcVar, 16.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var2), oyn.e), 16.0f);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
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
                    waa.K(av8Var2, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    yf8 yf8Var = xth.a;
                    boolean z7 = z6;
                    boolean z8 = z5;
                    int i8 = i6;
                    String str5 = str4;
                    udj.c(str, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.i(), av8Var2, (i6 & 14) | 48, 24576, 114680);
                    nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                    int i9 = i8 >> 3;
                    udj.c(str2, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, (i9 & 14) | 48, 0, 131064);
                    av8Var2.d0(1136514872);
                    av8Var2.s(false);
                    nq8.h(av8Var2, bkh.e(utcVar, 24.0f));
                    lv1 lv1Var = uxf.m;
                    uxf uxfVar = ww9.c;
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    l8g a3 = k8g.a(uxfVar, lv1Var, av8Var2, 54);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d2);
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
                    mha.h(str5, function0, null, gqh.a, null, z7, false, false, 0L, 0, 0, av8Var2, ((i8 >> 9) & 14) | 3072 | (i9 & 112), 0, 2004);
                    str4 = str5;
                    av8Var = av8Var2;
                    av8Var.d0(1063587460);
                    av8Var.s(false);
                    av8Var.s(true);
                    av8Var.s(true);
                    z3 = z8;
                    z4 = z7;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new g25(str, str2, function0, str4, z3, z4, i2, i3);
                    return;
                }
                return;
            }
        } else {
            str4 = str3;
        }
        i4 = 1024;
        i5 = i7 | i4 | 316366848;
        if (av8Var2.T(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static float o(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void p(ilh ilhVar, ArrayList arrayList, int i2) {
        boolean l2 = ilhVar.l(i2);
        int[] iArr = ilhVar.b;
        if (l2) {
            arrayList.add(ilhVar.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            p(ilhVar, arrayList, i4);
        }
    }

    public static final o63 q(z88 z88Var, z88 z88Var2, z88 z88Var3, z88 z88Var4, z88 z88Var5, gt8 gt8Var) {
        return new o63(8, new z88[]{z88Var, z88Var2, z88Var3, z88Var4, z88Var5}, gt8Var);
    }

    public static final o63 r(z88 z88Var, z88 z88Var2, z88 z88Var3, et8 et8Var) {
        return new o63(6, new z88[]{z88Var, z88Var2, z88Var3}, et8Var);
    }

    public static int s(float f2, int i2, int i3) {
        if (i2 == i3 || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = ((i3 >> 24) & 255) / 255.0f;
        float d2 = d(((i2 >> 16) & 255) / 255.0f);
        float d3 = d(((i2 >> 8) & 255) / 255.0f);
        float d4 = d((i2 & 255) / 255.0f);
        float d5 = d(((i3 >> 16) & 255) / 255.0f);
        float d6 = d(((i3 >> 8) & 255) / 255.0f);
        float d7 = d((i3 & 255) / 255.0f);
        float b2 = me4.b(f4, f3, f2, f3);
        float b3 = me4.b(d5, d2, f2, d2);
        float b4 = me4.b(d6, d3, f2, d3);
        float b5 = me4.b(d7, d4, f2, d4);
        float o2 = o(b3) * 255.0f;
        float o3 = o(b4) * 255.0f;
        return Math.round(o(b5) * 255.0f) | (Math.round(o2) << 16) | (Math.round(b2 * 255.0f) << 24) | (Math.round(o3) << 8);
    }

    public static final int t(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int d2 = Intrinsics.d(((qaa) list.get(i4)).b, i2);
            if (d2 < 0) {
                i3 = i4 + 1;
            } else {
                if (d2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static synchronized Executor u() {
        ExecutorService executorService;
        synchronized (dy0.class) {
            executorService = a;
            if (executorService == null) {
                String str = nik.a;
                executorService = Executors.newSingleThreadExecutor(new rh3("ExoPlayer:BackgroundExecutor", 2));
                a = executorService;
            }
        }
        return executorService;
    }

    public static int v(int i2, int i3) {
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

    public static xbb w(Context context, ys7 ys7Var, boolean z) {
        context.getClass();
        ys7Var.getClass();
        xbb b2 = kotlin.collections.a.b();
        List list = ys7Var.a;
        List list2 = ys7Var.b;
        if (!list.isEmpty()) {
            x(context, list, b2);
            if (list2.isEmpty() && z) {
                b2.add(pzh.d);
            }
        }
        x(context, list2, b2);
        if (z && !list2.isEmpty()) {
            if (!list2.isEmpty()) {
                for (Object obj : list2) {
                    if (!(obj instanceof Event ? ok3.C((Event) obj) : obj instanceof Stage ? Intrinsics.c(((Stage) obj).getStatusType(), StatusKt.STATUS_FINISHED) : false)) {
                        break;
                    }
                }
            }
            b2.add(pzh.d);
        }
        return kotlin.collections.a.a(b2);
    }

    public static void x(Context context, List list, xbb xbbVar) {
        Object uniqueStage;
        long startDateTimestamp;
        DateTimeFormatter withDecimalStyle;
        String i2;
        bi4 bi4Var = bi4.PATTERN_DAY_SHORT;
        long j2 = 0;
        boolean z = false;
        long j3 = 0;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Event) {
                uniqueStage = ((Event) obj2).getTournament();
            } else if (!(obj2 instanceof Stage)) {
                ilg.c();
                return;
            } else {
                StageSeason stageSeason = ((Stage) obj2).getStageSeason();
                uniqueStage = stageSeason != null ? stageSeason.getUniqueStage() : null;
            }
            if (uniqueStage == null) {
                return;
            }
            obj2.getClass();
            if (obj2 instanceof Event) {
                Event event = (Event) obj2;
                startDateTimestamp = event.getStartTimestamp();
                Long endTimestamp = event.getEndTimestamp();
                long longValue = (endTimestamp != null ? endTimestamp.longValue() : j2) - 1;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if (longValue > j2 && currentTimeMillis >= startDateTimestamp) {
                    startDateTimestamp = currentTimeMillis > longValue ? longValue : currentTimeMillis;
                }
            } else {
                if (!(obj2 instanceof Stage)) {
                    ilg.c();
                    return;
                }
                startDateTimestamp = ((Stage) obj2).getStartDateTimestamp();
            }
            if (!ug5.D(j3).isEqual(ug5.D(startDateTimestamp))) {
                if (ug5.w(startDateTimestamp)) {
                    i2 = context.getString(R.string.yesterday);
                } else {
                    if (ug5.u(startDateTimestamp)) {
                        i2 = context.getString(R.string.today);
                    } else if (ug5.v(startDateTimestamp)) {
                        i2 = context.getString(R.string.tomorrow);
                    } else {
                        ZoneId systemDefault = ZoneId.systemDefault();
                        if (Instant.ofEpochSecond(startDateTimestamp).atZone(systemDefault).toLocalDate().isBefore(LocalDate.now(systemDefault))) {
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            ZoneId systemDefault2 = ZoneId.systemDefault();
                            systemDefault2.getClass();
                            withDecimalStyle = DateTimeFormatter.ofPattern(bi4Var.d(), locale).withZone(systemDefault2).withDecimalStyle(DecimalStyle.of(locale));
                        } else if (z) {
                            Locale locale2 = Locale.getDefault();
                            locale2.getClass();
                            ZoneId systemDefault3 = ZoneId.systemDefault();
                            systemDefault3.getClass();
                            withDecimalStyle = DateTimeFormatter.ofPattern(bi4Var.d(), locale2).withZone(systemDefault3).withDecimalStyle(DecimalStyle.of(locale2));
                        } else {
                            i2 = context.getString(R.string.next);
                        }
                        i2 = fc6.i(startDateTimestamp, withDecimalStyle);
                    }
                    z = true;
                }
                xbbVar.add(new DateSection(startDateTimestamp, i2));
                obj = null;
                j3 = startDateTimestamp;
            }
            if (!uniqueStage.equals(obj)) {
                xbbVar.add(uniqueStage);
                obj = uniqueStage;
            }
            xbbVar.add(obj2);
            j2 = 0;
        }
    }

    public static CommentaryGoalModal y(List list, int i2, int i3, boolean z, String str, Gender gender) {
        Object obj;
        boolean z2;
        list.getClass();
        CommentaryGoalModal commentaryGoalModal = new CommentaryGoalModal();
        Bundle bundle = new Bundle();
        int i4 = z ? i2 : i3;
        int i5 = z ? i3 : i2;
        List B0 = CollectionsKt.B0(list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : B0) {
            if (hashSet.add(Integer.valueOf(((FootballPassingNetworkSegment) obj2).getPlayer().getId()))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (it.hasNext()) {
            FootballPassingNetworkSegment footballPassingNetworkSegment = (FootballPassingNetworkSegment) it.next();
            Player player = footballPassingNetworkSegment.getPlayer();
            if (footballPassingNetworkSegment.getEventType() == SegmentEventType.GOAL) {
                num = Integer.valueOf(player.getId());
                num3 = footballPassingNetworkSegment.getTime();
            }
            if (Intrinsics.c(footballPassingNetworkSegment.isAssist(), Boolean.TRUE) && num2 == null) {
                num2 = Integer.valueOf(player.getId());
            }
            arrayList2.add(player);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((FootballPassingNetworkSegment) obj).getGoalkeeper() != null) {
                break;
            }
        }
        FootballPassingNetworkSegment footballPassingNetworkSegment2 = (FootballPassingNetworkSegment) obj;
        Player goalkeeper = footballPassingNetworkSegment2 != null ? footballPassingNetworkSegment2.getGoalkeeper() : null;
        boolean z3 = true;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((FootballPassingNetworkSegment) it2.next()).getEventType() == SegmentEventType.SAVE) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean equals = Boolean.valueOf(z2).equals(Boolean.TRUE);
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((FootballPassingNetworkSegment) it3.next()).getEventType() == SegmentEventType.POST) {
                    break;
                }
            }
        }
        z3 = false;
        Boolean valueOf = Boolean.valueOf(z3);
        Boolean bool = Boolean.TRUE;
        boolean equals2 = valueOf.equals(bool);
        FootballPassingNetworkSegment footballPassingNetworkSegment3 = (FootballPassingNetworkSegment) CollectionsKt.j0(list);
        bundle.putSerializable("goalInfo", new g43(arrayList2, goalkeeper, num, num2, num3, i4, i5, equals, equals2, Intrinsics.c(footballPassingNetworkSegment3 != null ? Boolean.valueOf(CommentKt.isOwnGoal(footballPassingNetworkSegment3)) : null, bool)));
        bundle.putString("analyticsName", str);
        bundle.putSerializable("GENDER", gender);
        commentaryGoalModal.setArguments(bundle);
        return commentaryGoalModal;
    }

    public abstract void A(g7h g7hVar);

    public abstract void z(Throwable th);
}
