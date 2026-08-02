package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.icu.text.MessageFormat;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayer;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.player.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class o1j {
    public static final tc3 a = new tc3(663746694, new qs2(19), false);
    public static final tc3 b = new tc3(790865995, new ud3(10), false);
    public static final tc3 c = new tc3(-679541694, new ud3(11), false);
    public static final tc3 d = new tc3(108346634, new ud3(12), false);
    public static final g35 e = new g35(2);
    public static final g35 f = new g35(3);
    public static final f7a g = new f7a(27);
    public static final k20 h = new k20(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
    public static final int[] i = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    public static final lf3 A(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (lf3) weakReference.get();
        }
        return null;
    }

    public static final FootballPlayerSeasonStatistics B(wyg wygVar) {
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = wygVar.a;
        if (abstractPlayerSeasonStatistics instanceof FootballPlayerSeasonStatistics) {
            return (FootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
        }
        return null;
    }

    public static int C(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final long D(bwh bwhVar) {
        bwhVar.getClass();
        return bwhVar.u().c;
    }

    public static Calendar E() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int F(String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String p = sjc.p(str);
        p.getClass();
        switch (p.hashCode()) {
            case -2123537834:
                if (p.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (p.equals("video/mp2p")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (p.equals("video/mp2t")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (p.equals("video/webm")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (p.equals(MimeTypes.AUDIO_AMR_WB)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487656890:
                if (p.equals("image/avif")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (p.equals("image/heic")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (p.equals("image/heif")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (p.equals("image/jpeg")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (p.equals("image/webp")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (p.equals(MimeTypes.APPLICATION_MP4)) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (p.equals("video/x-msvideo")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (p.equals(MimeTypes.TEXT_VTT)) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (p.equals("image/bmp")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (p.equals("image/png")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (p.equals("audio/x-matroska")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (p.equals(MimeTypes.APPLICATION_WEBM)) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (p.equals("video/x-flv")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (p.equals(MimeTypes.AUDIO_AC3)) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (p.equals("audio/ac4")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (p.equals("audio/amr")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (p.equals(MimeTypes.AUDIO_MP4)) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (p.equals("audio/ogg")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (p.equals("audio/wav")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (p.equals(MimeTypes.VIDEO_MP4)) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (p.equals(MimeTypes.AUDIO_AMR_NB)) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (p.equals(MimeTypes.AUDIO_E_AC3)) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (p.equals(MimeTypes.AUDIO_FLAC)) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (p.equals("audio/midi")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (p.equals(MimeTypes.AUDIO_MPEG)) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (p.equals(MimeTypes.AUDIO_WEBM)) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (p.equals("video/x-matroska")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return -1;
    }

    public static int G(Uri uri) {
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
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final int H(int i2, String str) {
        char charAt = str.charAt(i2);
        return (charAt << 7) + str.charAt(i2 + 1);
    }

    public static float I(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            f2 += ((va5) it.next()).c;
        }
        return f2;
    }

    public static final void a(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        tb tbVar;
        mv1 mv1Var;
        mv1 mv1Var2 = uxf.c;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(259805954);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            kx4Var.getClass();
            tb tbVar2 = new tb(R.color.surface_1, kx4Var.H0(5.0f), kx4Var.H0(1.0f));
            boolean g2 = av8Var.g(context);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                O = new wb(context, (Float.floatToRawIntBits(250.0f) << 32) | (Float.floatToRawIntBits(250.0f) & 4294967295L), null, tbVar2, null, 20);
                tbVar = tbVar2;
                av8Var.n0(O);
            } else {
                tbVar = tbVar2;
            }
            wb wbVar = (wb) O;
            xtc m = bkh.m(xtcVar, 298.0f, 298.0f);
            k1c c2 = e12.c(mv1Var2, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, m);
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
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            mv1 mv1Var3 = uxf.g;
            n12 n12Var = n12.a;
            utc utcVar2 = utcVar;
            n12 n12Var2 = n12Var;
            wkn.l(s6a.N(R.drawable.baseball_field, 6, av8Var), n12Var.a(f0, mv1Var3), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 48, 120);
            av8Var.d0(1736900404);
            w55 w55Var = new w55("410", 36, 0, v55.b);
            v55 v55Var = v55.a;
            w55 w55Var2 = new w55("387", 77, 45, v55Var);
            v55 v55Var2 = v55.c;
            for (w55 w55Var3 : b.j(w55Var, w55Var2, new w55("387", 77, 45, v55Var2), new w55("330", 129, 25, v55Var), new w55("330", 129, 25, v55Var2))) {
                v55 v55Var3 = w55Var3.d;
                int i4 = w55Var3.c;
                int ordinal = v55Var3.ordinal();
                if (ordinal == 0) {
                    mv1Var = mv1Var2;
                } else if (ordinal == 1) {
                    mv1Var = uxf.d;
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return;
                    }
                    mv1Var = uxf.e;
                }
                utc utcVar3 = utcVar2;
                n12 n12Var3 = n12Var2;
                xtc a2 = n12Var3.a(utcVar3, mv1Var);
                float f2 = w55Var3.b;
                Integer valueOf = Integer.valueOf(i4);
                Integer num = null;
                if (v55Var3 != v55.a) {
                    valueOf = null;
                }
                float m3 = yid.m(valueOf);
                Integer valueOf2 = Integer.valueOf(i4);
                if (v55Var3 == v55.c) {
                    num = valueOf2;
                }
                d(0, av8Var, l98.f0(a2, m3, f2, yid.m(num), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), w55Var3.a);
                utcVar2 = utcVar3;
                n12Var2 = n12Var3;
            }
            av8Var.s(false);
            g28 g28Var = bkh.c;
            boolean i5 = av8Var.i(tbVar) | ((i3 & 14) == 4) | av8Var.i(wbVar);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new fa(5, tbVar, gv9Var, wbVar);
                av8Var.n0(O2);
            }
            lz.d(6, av8Var, g28Var, (Function1) O2);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 0);
        }
    }

    public static final void b(final String str, final String str2, final Function0 function0, final Function0 function02, xtc xtcVar, boolean z, boolean z2, boolean z3, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        final boolean z6;
        final boolean z7;
        final xtc xtcVar3;
        final boolean z8;
        xtc xtcVar4;
        a99 a99Var;
        int i7;
        boolean z9;
        boolean z10;
        float f2;
        boolean z11;
        boolean z12;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1247761933);
        int i8 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128) | (av8Var.i(function02) ? a.o : 1024);
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = i8 | 24576;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i8 | (av8Var.g(xtcVar2) ? 16384 : 8192);
        }
        int i10 = 196608 | i4;
        int i11 = i3 & 64;
        if (i11 != 0) {
            i5 = i4 | 1769472;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i10 | (av8Var.h(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i6 = i5 | 12582912;
            z5 = z3;
        } else {
            z5 = z3;
            i6 = i5 | (av8Var.h(z5) ? 8388608 : 4194304);
        }
        if (av8Var.T(i6 & 1, (4793491 & i6) != 4793490)) {
            xtc xtcVar5 = i9 != 0 ? utc.a : xtcVar2;
            boolean z13 = i11 != 0 ? true : z4;
            boolean z14 = i12 != 0 ? false : z5;
            lv1 lv1Var = uxf.m;
            xtc b0 = l98.b0(bkh.d(xtcVar5, 1.0f), 16.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            a99 a99Var2 = nf3.a;
            if (str == null) {
                av8Var.d0(1448623782);
                av8Var.s(false);
                z10 = false;
                a99Var = a99Var2;
                xtcVar4 = xtcVar5;
                f2 = 1.0f;
                z9 = true;
                i7 = i6;
            } else {
                av8Var.d0(1448623783);
                boolean z15 = (i6 & 896) == 256;
                Object O = av8Var.O();
                if (z15 || O == a99Var2) {
                    O = new ve7(6, function0);
                    av8Var.n0(O);
                }
                xtcVar4 = xtcVar5;
                a99Var = a99Var2;
                i7 = i6;
                mha.h(str, (Function0) O, null, gqh.a, null, true, false, false, 0L, 0, 0, av8Var, 199680 | (i6 & 14), 0, 2004);
                z9 = true;
                z10 = false;
                av8Var.s(false);
                f2 = 1.0f;
            }
            boolean z16 = true;
            w1l.o(f2, true, av8Var);
            if (str2 == null) {
                av8Var.d0(1448924761);
                av8Var.s(z10);
                z11 = z13;
                z12 = z14;
            } else {
                av8Var.d0(1448924762);
                int i13 = i7;
                boolean z17 = (i13 & 7168) == 2048 ? true : z10;
                Object O2 = av8Var.O();
                if (z17 || O2 == a99Var) {
                    O2 = new ve7(7, function02);
                    av8Var.n0(O2);
                }
                z11 = z13;
                z12 = z14;
                mha.h(str2, (Function0) O2, null, null, null, z11, z12, false, 0L, 0, 0, av8Var, (i13 >> 3) & 4128768, 0, 1948);
                av8Var.s(false);
                z16 = true;
            }
            av8Var.s(z16);
            z7 = z11;
            z8 = z12;
            z6 = z9;
            xtcVar3 = xtcVar4;
        } else {
            av8Var.W();
            z6 = z;
            z7 = z4;
            xtcVar3 = xtcVar2;
            z8 = z5;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, str2, function0, function02, xtcVar3, z6, z7, z8, i2, i3) { // from class: gn7
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ xtc e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;

                {
                    this.i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    o1j.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K, this.i);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(js8 js8Var, long j2, long j3, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        mhj mhjVar;
        mhj mhjVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-805714856);
        int i3 = i2 | (av8Var2.g(js8Var) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | (av8Var2.f(j3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = js8Var.d;
            int i5 = js8Var.f;
            int i6 = js8Var.e;
            if (i4 > 0) {
                mhjVar2 = new mhj(i4, R.string.days_short);
                mhjVar = new mhj(i6, R.string.hours_short);
            } else if (i6 > 0) {
                mhj mhjVar3 = new mhj(i6, R.string.hours_short);
                mhjVar = new mhj(i5, R.string.minutes_short);
                mhjVar2 = mhjVar3;
            } else {
                mhj mhjVar4 = new mhj(i5, R.string.minutes_short);
                mhjVar = new mhj(js8Var.g, R.string.seconds_short);
                mhjVar2 = mhjVar4;
            }
            n7g a2 = o7g.a(8.0f);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(utcVar, j3, a2), 8.0f, 4.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String U = StringsKt.U(2, String.valueOf(mhjVar2.a));
            String v = oea.v(mhjVar2.b, av8Var2);
            Locale locale = Locale.ROOT;
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            String str = U + upperCase;
            yf8 yf8Var = xth.a;
            int i7 = (i3 << 3) & 896;
            xtcVar2 = utcVar;
            mhj mhjVar5 = mhjVar;
            udj.c(str, null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, i7, 0, 131066);
            udj.c(":", l98.d0(xtcVar2, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, i7 | 54, 0, 131064);
            String U2 = StringsKt.U(2, String.valueOf(mhjVar5.a));
            String upperCase2 = oea.v(mhjVar5.b, av8Var2).toUpperCase(locale);
            upperCase2.getClass();
            udj.c(dmi.y(U2, upperCase2), null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, i7, 0, 131066);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ov6(js8Var, j2, j3, xtcVar2, i2);
        }
    }

    public static final void d(int i2, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1367417075);
        int i3 = (av8Var2.g(xtcVar) ? 4 : 2) | i2 | (av8Var2.g(str) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            q5a.w(str, xtcVar, lz.D(R.color.neutral_default, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.k(), av8Var, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(xtcVar, str, i2);
        }
    }

    public static final void e(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(769742217);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            sha.a(48, 0, av8Var, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.result_probability, av8Var));
            av8Var.d0(458655330);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                ks5 ks5Var = (ks5) it.next();
                gv9 gv9Var2 = ks5Var.b;
                n9k n9kVar = ks5Var.a;
                if (gv9Var2.isEmpty()) {
                    av8Var.d0(-1215250974);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1215468160);
                    av8Var.a0(376433890, n9kVar);
                    rha.c(n9kVar.a(av8Var), null, null, av8Var, 0, 6);
                    q(ks5Var.b, null, av8Var, 0);
                    av8Var.s(false);
                    av8Var.s(false);
                }
            }
            bf3.t(av8Var, false, utcVar, 8.0f, av8Var);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 6);
        }
    }

    public static final void f(mj7 mj7Var, xtc xtcVar, of3 of3Var, int i2) {
        String w;
        int i3;
        int i4;
        long f2;
        mj7Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(126942170);
        int i5 = 2;
        int i6 = (av8Var.g(mj7Var) ? 4 : 2) | i2;
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            long j2 = mj7Var.d;
            int i7 = mj7Var.c;
            String str = mj7Var.b;
            cdi M = hda.M(j2, av8Var, 0);
            boolean f3 = av8Var.f(j2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (f3 || O == a99Var) {
                O = goh.b(new br6(mj7Var, M, i5));
                av8Var.n0(O);
            }
            cdi cdiVar = (cdi) O;
            boolean f4 = av8Var.f(j2);
            Object O2 = av8Var.O();
            if (f4 || O2 == a99Var) {
                O2 = goh.b(new br6(mj7Var, M, 3));
                av8Var.n0(O2);
            }
            cdi cdiVar2 = (cdi) O2;
            if (((Boolean) cdiVar.getValue()).booleanValue()) {
                w = ljg.k(av8Var, 1732361931, R.string.until_deadline, av8Var, false);
            } else if (((Boolean) cdiVar2.getValue()).booleanValue()) {
                av8Var.d0(1732364448);
                w = oea.w(R.string.transfer_deadline_closed_info, new Object[]{f5p.C(context, i7, str)}, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(1732369281);
                w = oea.w(R.string.transfer_deadline_closing_info, new Object[]{f5p.C(context, i7, str)}, av8Var);
                av8Var.s(false);
            }
            String str2 = w;
            if (((Boolean) cdiVar.getValue()).booleanValue()) {
                f2 = ljg.f(av8Var, 1732375463, R.color.surface_1, av8Var, false);
            } else {
                if (((Boolean) cdiVar2.getValue()).booleanValue()) {
                    i3 = 1732376740;
                    i4 = R.color.error;
                } else {
                    i3 = 1732377604;
                    i4 = R.color.alert;
                }
                f2 = ljg.f(av8Var, i3, i4, av8Var, false);
            }
            long j3 = f2;
            long f5 = ((Boolean) cdiVar.getValue()).booleanValue() ? ljg.f(av8Var, 1732380035, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, 1732380872, R.color.on_color_primary, av8Var, false);
            lv1 lv1Var = uxf.m;
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), o7g.a(16.0f)), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            ImageVector N = s6a.N(R.drawable.ic_timer, 6, av8Var);
            long D = lz.D(R.color.surface_1, av8Var);
            utc utcVar = utc.a;
            kq9.b(N, null, bkh.l(utcVar, 24.0f), D, av8Var, 432, 0);
            goa d2 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(str2, d2, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var, 0, 384, 126968);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            c((js8) M.getValue(), f5, j3, null, av8Var, 0);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(mj7Var, xtcVar, i2, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(FantasyTransferPlayers fantasyTransferPlayers, boolean z, xtc xtcVar, FantasyCompetitionType fantasyCompetitionType, Integer num, of3 of3Var, int i2, int i3) {
        int i4;
        Integer num2;
        xtc xtcVar2;
        FantasyCompetitionType fantasyCompetitionType2;
        Integer num3;
        eqf u;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        int i5;
        final Integer num4;
        int i6;
        Context context;
        zg3 zg3Var;
        final Integer num5;
        boolean z2;
        String str;
        fantasyTransferPlayers.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-70991128);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(fantasyTransferPlayers) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.h(z) ? 32 : 16;
        }
        int i7 = i4 | 384;
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i7 |= av8Var.e(fantasyCompetitionType == null ? -1 : fantasyCompetitionType.ordinal()) ? a.o : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i7 |= 24576;
        } else if ((i2 & 24576) == 0) {
            num2 = num;
            i7 |= av8Var.g(num2) ? 16384 : 8192;
            if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                fantasyCompetitionType2 = fantasyCompetitionType;
                num3 = num2;
            } else {
                FantasyCompetitionType fantasyCompetitionType3 = i8 != 0 ? FantasyCompetitionType.SEASON : fantasyCompetitionType;
                String str2 = null;
                Integer num6 = i9 != 0 ? null : num2;
                final Context context2 = (Context) av8Var.k(nz.b);
                utc utcVar = utc.a;
                xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                lv1 lv1Var = uxf.m;
                l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                f50 f50Var3 = hf3.g;
                waa.K(av8Var, a2, f50Var3);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var4 = hf3.j;
                waa.K(av8Var, valueOf, f50Var4);
                ry ryVar2 = hf3.k;
                waa.J(av8Var, ryVar2);
                f50 f50Var5 = hf3.d;
                waa.K(av8Var, C, f50Var5);
                av8Var.d0(-1523063438);
                final FantasyTransferPlayer fantasyTransferPlayer = fantasyTransferPlayers.b;
                av8Var.d0(-1523063670);
                int i10 = i7;
                o80 o80Var = new o80();
                if (z) {
                    o80Var.d(fantasyTransferPlayer.e + " · ");
                }
                int[] iArr = u17.a;
                int i11 = iArr[fantasyCompetitionType3.ordinal()];
                Integer num7 = num6;
                if (i11 == 1) {
                    ryVar = ryVar2;
                    f50Var = f50Var4;
                    f50Var2 = f50Var5;
                    av8Var.d0(480309695);
                    av8Var.s(false);
                    float f2 = fantasyTransferPlayer.f;
                    context2.getClass();
                    Locale d2 = dla.d();
                    Set set = o84.a;
                    o80Var.d(String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context2), Float.valueOf(f2)}, 2)));
                    Unit unit = Unit.a;
                } else {
                    if (i11 != 2) {
                        throw dmi.h(av8Var, 2093701747, false);
                    }
                    av8Var.d0(480477684);
                    int g2 = o80Var.g(new pwh(lz.D(R.color.success, av8Var), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    try {
                        Float f3 = fantasyTransferPlayer.h;
                        if (f3 != null) {
                            float floatValue = f3.floatValue();
                            context2.getClass();
                            f50Var2 = f50Var5;
                            ryVar = ryVar2;
                            f50Var = f50Var4;
                            str = String.format(dla.d(), "%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(floatValue), context2.getString(R.string.fantasy_expected_fantasy_points_short)}, 2));
                        } else {
                            ryVar = ryVar2;
                            f50Var = f50Var4;
                            f50Var2 = f50Var5;
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        o80Var.d(str);
                        Unit unit2 = Unit.a;
                        o80Var.f(g2);
                        av8Var.s(false);
                    } finally {
                    }
                }
                q80 h2 = o80Var.h();
                av8Var.s(false);
                ng0 ng0Var = new ng0(4.0f, true, new a70(6));
                p8g p8gVar = p8g.a;
                xtc a3 = p8gVar.a(1.0f, utcVar, true);
                l8g a4 = k8g.a(ng0Var, lv1Var, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, a3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var3);
                waa.K(av8Var, m2, ff3Var);
                ry ryVar3 = ryVar;
                bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar3);
                f50 f50Var6 = f50Var2;
                waa.K(av8Var, C2, f50Var6);
                int i12 = fantasyTransferPlayer.c;
                int i13 = fantasyTransferPlayer.d;
                String str3 = fantasyTransferPlayer.g.b;
                xtc l2 = bkh.l(utcVar, 40.0f);
                int i14 = i10 & 57344;
                boolean i15 = av8Var.i(context2) | av8Var.g(fantasyTransferPlayer) | (i14 == 16384);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (i15 || O == a99Var) {
                    i5 = i12;
                    num4 = num7;
                    i6 = i13;
                    final int i16 = 0;
                    O = new Function0() { // from class: t17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i17 = i16;
                            FantasyTransferPlayer fantasyTransferPlayer2 = fantasyTransferPlayer;
                            switch (i17) {
                                case 0:
                                    Context context3 = context2;
                                    nv.A(context3, "open_player", null);
                                    int i18 = PlayerActivity.Z;
                                    jle.q(context3, fantasyTransferPlayer2.b, 0, null, null, false, num4, null, 444);
                                    break;
                                default:
                                    int i19 = PlayerActivity.Z;
                                    jle.q(context2, fantasyTransferPlayer2.b, 0, null, null, false, num4, null, 444);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O);
                } else {
                    i5 = i12;
                    num4 = num7;
                    i6 = i13;
                }
                int i17 = ((i10 << 3) & 896) | 3072;
                int i18 = i6;
                Integer num8 = num4;
                wnn.l(i5, i18, z, l2, str3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (Function0) O, av8Var, i17, 96);
                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                xtc a5 = p8gVar.a(1.0f, utcVar, true);
                p4h p4hVar = ww9.d;
                u23 a6 = t23.a(p4hVar, uxf.o, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, a5);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a6, f50Var3);
                waa.K(av8Var, m3, ff3Var);
                f50 f50Var7 = f50Var;
                bf3.s(hashCode3, av8Var, f50Var7, av8Var, ryVar3);
                waa.K(av8Var, C3, f50Var6);
                String str4 = fantasyTransferPlayer.a;
                long D = lz.D(R.color.n_lv_1, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(str4, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                udj.d(h2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.b(), av8Var, 0, 24960, 241658);
                ljg.t(av8Var, true, true, false);
                kq9.a(haa.t(R.drawable.ic_transfer_swap, 0, av8Var), null, bkh.l(l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, 440, 0);
                av8Var.d0(-1522980223);
                final FantasyTransferPlayer fantasyTransferPlayer2 = fantasyTransferPlayers.a;
                av8Var.d0(-1522980374);
                o80 o80Var2 = new o80();
                int i19 = iArr[fantasyCompetitionType3.ordinal()];
                if (i19 == 1) {
                    context = context2;
                    av8Var.d0(2110032342);
                    av8Var.s(false);
                    float f4 = fantasyTransferPlayer2.f;
                    context.getClass();
                    Locale d3 = dla.d();
                    Set set2 = o84.a;
                    o80Var2.d(String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(f4)}, 2)));
                } else {
                    if (i19 != 2) {
                        throw dmi.h(av8Var, 760800124, false);
                    }
                    av8Var.d0(2110200331);
                    int g3 = o80Var2.g(new pwh(lz.D(R.color.success, av8Var), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    try {
                        Float f5 = fantasyTransferPlayer2.h;
                        if (f5 != null) {
                            float floatValue2 = f5.floatValue();
                            context2.getClass();
                            context = context2;
                            str2 = String.format(dla.d(), "%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(floatValue2), context.getString(R.string.fantasy_expected_fantasy_points_short)}, 2));
                        } else {
                            context = context2;
                        }
                        o80Var2.d(str2 == null ? "" : str2);
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
                xtc a7 = p8gVar.a(1.0f, utcVar, true);
                l8g a8 = k8g.a(ww9.c, lv1Var, av8Var, 54);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, a7);
                av8Var.h0();
                if (av8Var.S) {
                    zg3Var = zg3Var2;
                    av8Var.l(zg3Var);
                } else {
                    zg3Var = zg3Var2;
                    av8Var.q0();
                }
                waa.K(av8Var, a8, f50Var3);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode4, av8Var, f50Var7, av8Var, ryVar3);
                waa.K(av8Var, C4, f50Var6);
                kv1 kv1Var = uxf.q;
                xtc a9 = p8gVar.a(1.0f, utcVar, true);
                u23 a10 = t23.a(p4hVar, kv1Var, av8Var, 48);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, a9);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a10, f50Var3);
                waa.K(av8Var, m5, ff3Var);
                bf3.s(hashCode5, av8Var, f50Var7, av8Var, ryVar3);
                waa.K(av8Var, C5, f50Var6);
                final Context context3 = context;
                udj.c(fantasyTransferPlayer2.a, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                udj.d(h3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.b(), av8Var, 0, 24960, 241658);
                av8Var = av8Var;
                i.o(av8Var, true, utcVar, 8.0f, av8Var);
                int i20 = fantasyTransferPlayer2.c;
                int i21 = fantasyTransferPlayer2.d;
                String str5 = fantasyTransferPlayer2.g.b;
                xtc l3 = bkh.l(utcVar, 40.0f);
                boolean i22 = av8Var.i(context3) | av8Var.g(fantasyTransferPlayer2) | (i14 == 16384);
                Object O2 = av8Var.O();
                if (i22 || O2 == a99Var) {
                    num5 = num8;
                    z2 = true;
                    final char c2 = 1 == true ? 1 : 0;
                    O2 = new Function0() { // from class: t17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i172 = c2;
                            FantasyTransferPlayer fantasyTransferPlayer22 = fantasyTransferPlayer2;
                            switch (i172) {
                                case 0:
                                    Context context32 = context3;
                                    nv.A(context32, "open_player", null);
                                    int i182 = PlayerActivity.Z;
                                    jle.q(context32, fantasyTransferPlayer22.b, 0, null, null, false, num5, null, 444);
                                    break;
                                default:
                                    int i192 = PlayerActivity.Z;
                                    jle.q(context3, fantasyTransferPlayer22.b, 0, null, null, false, num5, null, 444);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O2);
                } else {
                    num5 = num8;
                    z2 = true;
                }
                wnn.l(i20, i21, z, l3, str5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (Function0) O2, av8Var, i17, 96);
                ljg.t(av8Var, z2, false, z2);
                xtcVar2 = utcVar;
                num3 = num5;
                fantasyCompetitionType2 = fantasyCompetitionType3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(fantasyTransferPlayers, z, xtcVar2, fantasyCompetitionType2, num3, i2, i3);
                return;
            }
            return;
        }
        num2 = num;
        if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void h(FantasyNewsArticle fantasyNewsArticle, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        fantasyNewsArticle.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-558679519);
        int i3 = i2 | (av8Var.i(fantasyNewsArticle) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            ek2 t = rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            gk2 u = rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62);
            utc utcVar = utc.a;
            xtc g2 = bkh.g(fz8.Y(bkh.d(utcVar, 1.0f), n9a.a), 260.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean i4 = av8Var.i(fantasyNewsArticle) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new f87(function1, fantasyNewsArticle, 0);
                av8Var.n0(O);
            }
            un0.b((Function0) O, g2, false, a2, t, u, yqo.H(-2129719348, av8Var, new qm4(15, fantasyNewsArticle, context)), av8Var, 100663296);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new g87(fantasyNewsArticle, function1, xtcVar2, i2, 0);
        }
    }

    public static final void i(cz6 cz6Var, rse rseVar, Function0 function0, ksa ksaVar, of3 of3Var, int i2) {
        int i3;
        ksa ksaVar2;
        av8 av8Var;
        boolean z;
        boolean z2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(840359293);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(cz6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(rseVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            ksaVar2 = ksaVar;
            i3 |= av8Var2.g(ksaVar2) ? a.o : 1024;
        } else {
            ksaVar2 = ksaVar;
        }
        int i4 = i3;
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            av8Var2.Y();
            if ((i2 & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            Context context = (Context) av8Var2.k(nz.b);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (O == a99Var) {
                koh kohVar = new koh();
                av8Var2.n0(kohVar);
                obj = kohVar;
            }
            koh kohVar2 = (koh) obj;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc xtcVar = utc.a;
            xtc C = fqj.C(av8Var2, xtcVar);
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
            tol.b(nyd.a.a(null), yqo.H(-2007486157, av8Var2, new ere(ksaVar2, cz6Var, context, rseVar, kohVar2)), av8Var2, 56);
            if (ksaVar.d()) {
                xtcVar = d2a.E(xtcVar, 8.0f, null, false, 0L, 30);
            }
            xtc b0 = l98.b0(n9e.q(xtcVar, lz.D(R.color.surface_P, av8Var2), oyn.e), 16.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, b0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (rseVar != null) {
                av8Var2.d0(-361505745);
                av8Var = av8Var2;
                z = true;
                wkn.g(function0, rseVar.a, rseVar.d, null, rseVar.b, rseVar.e, rseVar.c, rseVar.f, av8Var, (i4 >> 6) & 14);
                av8Var.s(false);
            } else {
                z = true;
                boolean z3 = true;
                av8Var2.d0(-361044310);
                int i5 = cz6Var.h;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = cz6Var.d;
                boolean z4 = fantasyRoundPlayerUiModel.m;
                boolean z5 = cz6Var.f;
                gv9 gv9Var = cz6Var.b;
                if (gv9Var == null || !gv9Var.isEmpty()) {
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        if (((qx6) it.next()).a.c()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                boolean c3 = fantasyRoundPlayerUiModel.c();
                boolean i6 = av8Var2.i(context) | ((i4 & 14) == 4);
                Object O2 = av8Var2.O();
                Object obj2 = O2;
                if (i6 || O2 == a99Var) {
                    fe7 fe7Var = new fe7(z3 ? 1 : 0, cz6Var, context);
                    av8Var2.n0(fe7Var);
                    obj2 = fe7Var;
                }
                ktm.o(i5, z4, z5, z2, c3, (Function0) obj2, null, av8Var2, 0, 64);
                av8Var = av8Var2;
                av8Var.s(false);
            }
            av8Var.s(z);
            av8Var.s(z);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i2, 16, cz6Var, rseVar, function0, ksaVar);
        }
    }

    public static final void j(ae7 ae7Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1754118067);
        int i3 = (av8Var.g(ae7Var) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (!av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var.W();
        } else if (Intrinsics.c(ae7Var.a, CampaignEx.JSON_KEY_STAR)) {
            av8Var.d0(64419957);
            u6h.k(ae7Var, z, xtcVar, 0L, av8Var, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, 8);
            av8Var.s(false);
        } else {
            av8Var.d0(64578491);
            u6h.l(ae7Var, z, xtcVar, 0L, av8Var, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, 8);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) ae7Var, z, xtcVar, i2, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final void k(az6 az6Var, rse rseVar, Function0 function0, qug qugVar, of3 of3Var, int i2) {
        az6 az6Var2;
        ev6 ev6Var;
        FantasyCompetitionType fantasyCompetitionType;
        Object obj;
        utc utcVar;
        int i3;
        float f2;
        Object obj2;
        Context context;
        float f3;
        utc utcVar2;
        boolean z;
        utc utcVar3;
        rse rseVar2 = rseVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1496134035);
        int i4 = (i2 & 6) == 0 ? (av8Var.g(az6Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(rseVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.g(qugVar) ? a.o : 1024;
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            Context context2 = (Context) av8Var.k(nz.b);
            mj7 mj7Var = az6Var.b;
            gv9<bd7> gv9Var = az6Var.e;
            ev6 ev6Var2 = az6Var.f;
            gv9 gv9Var2 = az6Var.g;
            String w = oea.w(gv9Var2.size() > 1 ? R.string.fantasy_player_upcoming_fixtures : R.string.fantasy_player_upcoming_fixture, new Object[]{f5p.C(context2, mj7Var.c, mj7Var.b)}, av8Var);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int i5 = i4;
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar4 = utc.a;
            xtc C = fqj.C(av8Var, utcVar4);
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
            Context context3 = context2;
            xtc u0 = hkg.u0(ljg.g(av8Var, C, f50Var3, 1.0f, false), qugVar, false, 14);
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
            fqj.j(az6Var.d, l98.c0(utcVar4, 16.0f, 8.0f), av8Var, 48);
            a07 a07Var = az6Var.c;
            Object obj3 = nf3.a;
            if (a07Var == null) {
                av8Var.d0(-1834216423);
                av8Var.s(false);
                obj = obj3;
                ev6Var = ev6Var2;
                i3 = 0;
                f2 = 0.0f;
                utcVar = utcVar4;
            } else {
                av8Var.d0(-1834216422);
                xtc d0 = l98.d0(utcVar4, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                a07 a07Var2 = az6Var.c;
                FantasyCompetitionType fantasyCompetitionType2 = ev6Var2.d;
                boolean z2 = ev6Var2.A;
                boolean i6 = av8Var.i(context3);
                ev6Var = ev6Var2;
                Object O = av8Var.O();
                if (i6 || O == obj3) {
                    fantasyCompetitionType = fantasyCompetitionType2;
                    O = new vt(context3, 4);
                    av8Var.n0(O);
                } else {
                    fantasyCompetitionType = fantasyCompetitionType2;
                }
                Function1 function1 = (Function1) O;
                obj = obj3;
                utcVar = utcVar4;
                FantasyCompetitionType fantasyCompetitionType3 = fantasyCompetitionType;
                i3 = 0;
                context3 = context3;
                z8e.h(a07Var2, fantasyCompetitionType3, function1, z2, d0, av8Var, 24576);
                av8Var = av8Var;
                Unit unit = Unit.a;
                av8Var.s(false);
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            i2a.f(w, l98.d0(utcVar, 16.0f, f2, 2), null, av8Var, 48, 4);
            int i7 = 6;
            if (gv9Var2.isEmpty()) {
                utc utcVar5 = utcVar;
                obj2 = obj;
                context = context3;
                f3 = 8.0f;
                av8Var.d0(-1830964150);
                utcVar2 = utcVar5;
                av8 av8Var2 = av8Var;
                j72.h(null, Integer.valueOf(R.drawable.match_shotmap), null, Integer.valueOf(R.string.fantasy_player_round_empty_state), false, null, 0, 0L, av8Var2, 0, 245);
                av8Var = av8Var2;
                av8Var.s(i3);
            } else {
                av8Var.d0(-1833371579);
                ng0 ng0Var = new ng0(8.0f, true, new a70(i7));
                xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
                u23 a4 = t23.a(ng0Var, kv1Var, av8Var, 6);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                Iterator p = ljg.p(av8Var, C3, f50Var3, 1257560097, gv9Var2);
                while (p.hasNext()) {
                    yso.e((wn1) p.next(), ev6Var.A, null, av8Var, i3);
                }
                av8Var.s(i3);
                av8Var.s(true);
                if (gv9Var2.size() > 1) {
                    av8Var.d0(-1832866279);
                    String v = oea.v(R.string.fantasy_combined_predictions, av8Var);
                    ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var);
                    long D = lz.D(R.color.n_lv_4, av8Var);
                    Object O2 = av8Var.O();
                    obj2 = obj;
                    if (O2 == obj2) {
                        O2 = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) O2;
                    Object[] objArr = new Object[i3];
                    Object O3 = av8Var.O();
                    if (O3 == obj2) {
                        O3 = o67.g;
                        av8Var.n0(O3);
                    }
                    he7 he7Var = new he7((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), context3, i3);
                    av8 av8Var3 = av8Var;
                    utc utcVar6 = utcVar;
                    context = context3;
                    f3 = 8.0f;
                    utcVar3 = utcVar6;
                    av8Var = av8Var3;
                    i2a.f(v, l98.d0(tol.y(utcVar6, true, true, true, D, wzcVar, he7Var, av8Var3, 0), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), N, av8Var, 0, 0);
                    av8Var.s(i3);
                } else {
                    utcVar3 = utcVar;
                    obj2 = obj;
                    context = context3;
                    f3 = 8.0f;
                    av8Var.d0(-1832010431);
                    av8Var.s(i3);
                }
                if (gv9Var.isEmpty()) {
                    av8Var.d0(-1830990655);
                    av8Var.s(i3);
                } else {
                    av8Var.d0(-1831919942);
                    for (bd7 bd7Var : gv9Var) {
                        boolean i8 = av8Var.i(context);
                        Object O4 = av8Var.O();
                        if (i8 || O4 == obj2) {
                            O4 = new vt(context, 5);
                            av8Var.n0(O4);
                        }
                        ww9.h(bd7Var, null, (Function1) O4, av8Var, i3);
                    }
                    av8Var.s(i3);
                }
                av8Var.s(i3);
                utcVar2 = utcVar3;
            }
            String v2 = oea.v(R.string.fantasy_learn_how_to_play, av8Var);
            long D2 = lz.D(R.color.surface_2, av8Var);
            xtc c02 = l98.c0(utcVar2, 16.0f, f3);
            boolean i9 = av8Var.i(context) | ((i5 & 14) == 4 ? true : i3);
            Object O5 = av8Var.O();
            if (i9 || O5 == obj2) {
                az6Var2 = az6Var;
                O5 = new n37(11, context, az6Var2);
                av8Var.n0(O5);
            } else {
                az6Var2 = az6Var;
            }
            av8 av8Var4 = av8Var;
            float f4 = f3;
            x2a.d(v2, c02, null, 0L, 0L, D2, (Function0) O5, l6g.a, null, f4, null, av8Var4, 817889328, 0, 1308);
            av8Var = av8Var4;
            av8Var.s(true);
            if (rseVar == null) {
                av8Var.d0(2119146246);
                av8Var.s(i3);
                rseVar2 = rseVar;
                z = true;
            } else {
                av8Var.d0(2119146247);
                xtc b0 = l98.b0(n9e.q(qugVar.d() ? d2a.E(utcVar2, f4, null, false, 0L, 30) : utcVar2, lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f);
                k1c c2 = e12.c(uxf.c, i3);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, b0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m4, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode4), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C4, hf3.d);
                rseVar2 = rseVar;
                wkn.g(function0, rseVar2.a, rseVar2.d, null, rseVar2.b, rseVar2.e, rseVar2.c, rseVar2.f, av8Var, (i5 >> 6) & 14);
                av8Var = av8Var;
                z = true;
                av8Var.s(true);
                Unit unit2 = Unit.a;
                av8Var.s(i3);
            }
            av8Var.s(z);
        } else {
            az6Var2 = az6Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i2, 17, az6Var2, rseVar2, function0, qugVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(jz6 jz6Var, rse rseVar, Function0 function0, qug qugVar, ksa ksaVar, boolean z, of3 of3Var, int i2, int i3) {
        ksa ksaVar2;
        int i4;
        int i5;
        int i6;
        boolean z2;
        qug qugVar2;
        boolean z3;
        ksa ksaVar3;
        eqf u;
        qug o0;
        ksa a2;
        boolean z4;
        Object O;
        jz6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2137616135);
        int i7 = i2 | (av8Var.i(jz6Var) ? 4 : 2) | (av8Var.g(rseVar) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (((i3 & 8) == 0 && av8Var.g(qugVar)) ? a.o : 1024);
        if ((i3 & 16) == 0) {
            ksaVar2 = ksaVar;
            if (av8Var.g(ksaVar2)) {
                i4 = 16384;
                i5 = i7 | i4;
                i6 = i3 & 32;
                if (i6 == 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    z2 = z;
                    i5 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
                        av8Var.Y();
                        if ((i2 & 1) == 0 || av8Var.B()) {
                            o0 = (i3 & 8) != 0 ? hkg.o0(av8Var) : qugVar;
                            a2 = (i3 & 16) != 0 ? msa.a(0, 0, av8Var, 0, 3) : ksaVar2;
                            if (i6 != 0) {
                                z4 = true;
                                av8Var.t();
                                dz6 dz6Var = (dz6) rfo.x(jz6Var.i, av8Var, 0).getValue();
                                xtc xtcVar = utc.a;
                                if (z4) {
                                    xtcVar = gz8.x(xtcVar, null, null, 3);
                                }
                                O = av8Var.O();
                                if (O == nf3.a) {
                                    O = new e87(12);
                                    av8Var.n0(O);
                                }
                                wkn.a(dz6Var, xtcVar, null, (Function1) O, yqo.H(-291391237, av8Var, new er6(rseVar, function0, o0, a2)), av8Var, 27648, 4);
                                qugVar2 = o0;
                                ksaVar3 = a2;
                                z3 = z4;
                            }
                        } else {
                            av8Var.W();
                            o0 = qugVar;
                            a2 = ksaVar2;
                        }
                        z4 = z2;
                        av8Var.t();
                        dz6 dz6Var2 = (dz6) rfo.x(jz6Var.i, av8Var, 0).getValue();
                        xtc xtcVar2 = utc.a;
                        if (z4) {
                        }
                        O = av8Var.O();
                        if (O == nf3.a) {
                        }
                        wkn.a(dz6Var2, xtcVar2, null, (Function1) O, yqo.H(-291391237, av8Var, new er6(rseVar, function0, o0, a2)), av8Var, 27648, 4);
                        qugVar2 = o0;
                        ksaVar3 = a2;
                        z3 = z4;
                    } else {
                        av8Var.W();
                        qugVar2 = qugVar;
                        z3 = z2;
                        ksaVar3 = ksaVar2;
                    }
                    u = av8Var.u();
                    if (u != null) {
                        u.d = new vr5(jz6Var, rseVar, function0, qugVar2, ksaVar3, z3, i2, i3);
                        return;
                    }
                    return;
                }
                z2 = z;
                if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            ksaVar2 = ksaVar;
        }
        i4 = 8192;
        i5 = i7 | i4;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void m(final double d2, final Integer num, xtc xtcVar, of3 of3Var, final int i2) {
        av8 av8Var;
        xtc xtcVar2;
        f50 f50Var;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var2;
        f50 f50Var3;
        lv1 lv1Var;
        String str;
        zg3 zg3Var;
        av8 av8Var2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1582871565);
        int i5 = i2 | (av8Var3.c(d2) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= av8Var3.g(num) ? 32 : 16;
        }
        int i6 = i5 | 384;
        if (av8Var3.T(i6 & 1, (i6 & 147) != 146)) {
            Context context = (Context) av8Var3.k(nz.b);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(l98.d0(ml4.f0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var3), oyn.e)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, d0);
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
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var3, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var3, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var3, C, f50Var6);
            wxf wxfVar = ww9.b;
            lv1 lv1Var2 = uxf.l;
            l8g a3 = k8g.a(wxfVar, lv1Var2, av8Var3, 0);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, utcVar);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, f50Var4);
            waa.K(av8Var3, m2, ff3Var2);
            bf3.s(hashCode2, av8Var3, f50Var5, av8Var3, ryVar2);
            waa.K(av8Var3, C2, f50Var6);
            p8g p8gVar = p8g.a;
            if (num == null) {
                av8Var3.d0(-1985749803);
                av8Var3.s(false);
                xtcVar2 = utcVar;
                lv1Var = lv1Var2;
                z2 = false;
                str = ":";
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var2 = f50Var5;
                f50Var = f50Var4;
                f50Var3 = f50Var6;
                z = true;
                av8Var2 = av8Var3;
                zg3Var = zg3Var2;
            } else {
                av8Var3.d0(-1985749802);
                xtc a4 = p8gVar.a(1.0f, utcVar, true);
                l8g a5 = k8g.a(wxfVar, lv1Var2, av8Var3, 6);
                int hashCode3 = Long.hashCode(av8Var3.T);
                aee m3 = av8Var3.m();
                xtc C3 = fqj.C(av8Var3, a4);
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var2);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, a5, f50Var4);
                waa.K(av8Var3, m3, ff3Var2);
                bf3.s(hashCode3, av8Var3, f50Var5, av8Var3, ryVar2);
                waa.K(av8Var3, C3, f50Var6);
                String y = dmi.y(oea.v(R.string.free_transfers, av8Var3), ":");
                yf8 yf8Var = xth.a;
                dfj b2 = xth.b();
                long D = lz.D(R.color.n_lv_3, av8Var3);
                f50Var = f50Var4;
                ff3Var = ff3Var2;
                xtcVar2 = utcVar;
                ryVar = ryVar2;
                f50Var2 = f50Var5;
                f50Var3 = f50Var6;
                lv1Var = lv1Var2;
                str = ":";
                zg3Var = zg3Var2;
                udj.c(y, p8gVar.c(utcVar), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var3, 0, 24960, 110584);
                nq8.h(av8Var3, bkh.p(xtcVar2, 4.0f));
                String infinity = num.intValue() == Integer.MAX_VALUE ? DecimalFormatSymbols.getInstance().getInfinity() : String.valueOf(num.intValue());
                infinity.getClass();
                udj.c(infinity, p8gVar.c(xtcVar2), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var3, 0, 24960, 110584);
                av8Var2 = av8Var3;
                z = true;
                av8Var2.s(true);
                Unit unit = Unit.a;
                z2 = false;
                av8Var2.s(false);
            }
            xtc a6 = p8gVar.a(1.0f, xtcVar2, z);
            l8g a7 = k8g.a(ww9.c, lv1Var, av8Var2, 6);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, a6);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a7, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C4, f50Var3);
            String y2 = dmi.y(oea.v(R.string.bank, av8Var2), str);
            yf8 yf8Var2 = xth.a;
            boolean z3 = z2;
            av8 av8Var4 = av8Var2;
            udj.c(y2, p8gVar.c(xtcVar2), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var4, 0, 24960, 110584);
            nq8.h(av8Var4, bkh.p(xtcVar2, 4.0f));
            context.getClass();
            Locale d3 = dla.d();
            Set set = o84.a;
            String format = String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Double.valueOf(d2)}, 2));
            dfj j2 = xth.j();
            if (d2 < 0.0d) {
                i3 = 928219227;
                i4 = R.color.error;
            } else {
                i3 = 928219738;
                i4 = R.color.n_lv_1;
            }
            udj.c(format, p8gVar.c(xtcVar2), ljg.f(av8Var4, i3, i4, av8Var4, z3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j2, av8Var4, 0, 24960, 110584);
            av8Var = av8Var4;
            ljg.t(av8Var, true, true, true);
        } else {
            av8Var = av8Var3;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final xtc xtcVar3 = xtcVar2;
            u.d = new Function2() { // from class: fn7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1j.m(d2, num, xtcVar3, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(q9f q9fVar, xtc xtcVar, of3 of3Var, int i2) {
        q9fVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1488538987);
        int i3 = (av8Var.i(q9fVar) ? 4 : 2) | i2 | 48;
        int i4 = 13;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            e1d x = rfo.x(q9fVar.f, av8Var, 0);
            xhf J = x2a.J(av8Var);
            pi5 pi5Var = (pi5) ((vnb) x.getValue()).a();
            boolean z = pi5Var != null && pi5Var.f;
            g28 g28Var = bkh.c;
            boolean i5 = av8Var.i(q9fVar);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new ate(q9fVar, i4);
                av8Var.n0(O);
            }
            x2a.h(z, (Function0) O, g28Var, J, null, yqo.H(1967183346, av8Var, new ak1(J, x, 5)), yqo.H(1622267601, av8Var, new zx0(x)), av8Var, 1769856);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(q9fVar, xtcVar, i2, i4);
        }
    }

    public static final void o(vnb vnbVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1857755216);
        int i3 = (av8Var.g(vnbVar) ? 4 : 2) | i2;
        utc utcVar = utc.a;
        int i4 = 16;
        int i5 = i3 | (av8Var.g(utcVar) ? 32 : 16);
        if (!av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            av8Var.W();
        } else if (Intrinsics.c(vnbVar, tnb.a)) {
            av8Var.d0(-562763387);
            xtc b0 = l98.b0(utcVar, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            lz.n(wnn.A(utcVar, o7g.a(16.0f)), 0, null, iz8.c, av8Var, 3072);
            av8Var.s(true);
            av8Var.s(false);
        } else if (vnbVar instanceof unb) {
            av8Var.d0(-561605227);
            Context context = (Context) av8Var.k(nz.b);
            pi5 pi5Var = (pi5) ((unb) vnbVar).a;
            t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 48.0f);
            boolean g2 = av8Var.g(pi5Var) | av8Var.i(context);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new ord(27, pi5Var, context);
                av8Var.n0(O);
            }
            v8a.a(null, null, t3eVar, null, null, null, false, null, (Function1) O, av8Var, 0, PglCryptUtils.UNKNOWN_ERR);
            av8Var = av8Var;
            av8Var.s(false);
        } else {
            if (!(vnbVar instanceof snb)) {
                throw dmi.h(av8Var, -1403622035, false);
            }
            av8Var.d0(-1403396268);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t1d(vnbVar, i2, i4);
        }
    }

    public static final void p(js5 js5Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1947732050);
        int i3 = i2 | (av8Var.g(js5Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            String a3 = js5Var.a.a(av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(a3, bkh.p(utcVar, 32.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var, 48, 0, 131064);
            long c2 = r13.c(lz.D(R.color.primary_default, av8Var), js5Var.c);
            long j2 = r13.h;
            xtc q = n9e.q(wnn.A(bkh.e(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2).z(new goa(1.0f, true)), 6.0f), o7g.a(8.0f)), lz.D(R.color.n_lv_5, av8Var), oyn.e);
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new h63(js5Var, 25);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new qz4(27);
                av8Var.n0(O2);
            }
            ncf.c(function0, q, c2, j2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O2, av8Var, 1772544);
            q5a.w(yid.q(js5Var.b, 1), bkh.p(utcVar, 44.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(6), 0L, 0, false, 1, 0, xth.e(), av8Var, 48, 24576, 113656);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(js5Var, xtcVar2, i2, 12);
        }
    }

    public static final void q(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1830131155);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            Iterator p = ljg.p(av8Var, C, hf3.d, -721076308, gv9Var);
            int i4 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                av8Var.a0(-786180183, Integer.valueOf(i4));
                p((js5) next, null, av8Var, 0);
                av8Var.s(false);
                i4 = i5;
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 7);
        }
    }

    public static void r(ArrayList arrayList, wa5 wa5Var, float f2) {
        arrayList.add(new va5(wa5Var, I(arrayList), f2));
    }

    public static void s(String str, boolean z) {
        if (!z) {
            throw s9e.a(null, str);
        }
    }

    public static final void t(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    dmi.z(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    de6.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    ilg.c();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Handler u(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c90.g(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            is8.h(cause);
            return null;
        }
    }

    public static t01 v(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new x84(new String((byte[]) obj, Charsets.UTF_8), 1, bundle) : new x84((String) obj, 1, bundle);
                        } catch (Exception unused) {
                            throw new lr8();
                        }
                    }
                    throw new lr8();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new cdd("The device does not contain a restore credential.");
                        }
                        x84 x84Var = new x84(bundle, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return x84Var;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new lr8();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string2.getClass();
                            string3.getClass();
                            return new x84(string3, 2, bundle);
                        } catch (Exception unused3) {
                            throw new lr8();
                        }
                    }
                    throw new lr8();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string4.getClass();
                            return new x84(string4, 3, bundle);
                        } catch (Exception unused4) {
                            throw new lr8();
                        }
                    }
                    throw new lr8();
                default:
                    throw new lr8();
            }
        } catch (lr8 unused5) {
            return new x84(str, 0, bundle);
        }
    }

    public static final int w(int i2, View view) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object r = mha.r(view);
            view = r instanceof View ? (View) r : null;
        }
        return i4;
    }

    public static final View x(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(w(R.id.view_tree_lifecycle_owner, view), w(R.id.view_tree_saved_state_registry_owner, view));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (A(view) == null) {
                i2++;
                Object r = mha.r(view);
                View view4 = view2;
                view2 = view;
                view = r instanceof View ? (View) r : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static String y(Context context, AmericanFootballDownDistance americanFootballDownDistance, Integer num, Integer num2, String str, String str2) {
        Integer currentDown;
        Integer currentYardsToFirstDown;
        Boolean isGoalPossession;
        if (americanFootballDownDistance != null && str != null && str2 != null && num != null && num2 != null && (currentDown = americanFootballDownDistance.getCurrentDown()) != null) {
            int intValue = currentDown.intValue();
            if (1 > intValue || intValue >= 5) {
                currentDown = null;
            }
            if (currentDown != null && (currentYardsToFirstDown = americanFootballDownDistance.getCurrentYardsToFirstDown()) != null) {
                int intValue2 = currentYardsToFirstDown.intValue();
                Integer currentYardline = americanFootballDownDistance.getCurrentYardline();
                if (currentYardline != null && (isGoalPossession = americanFootballDownDistance.isGoalPossession()) != null) {
                    boolean booleanValue = isGoalPossession.booleanValue();
                    String str3 = num.intValue() == 1 ? str : str2;
                    if (num2.intValue() != 1) {
                        str = str2;
                    }
                    String format = new MessageFormat("{0,ordinal}", Locale.US).format(new Integer[]{currentDown});
                    String string = booleanValue ? context.getString(R.string.american_football_goal) : intValue2 < 1 ? context.getString(R.string.american_football_inches) : String.valueOf(intValue2);
                    string.getClass();
                    return context.getString(R.string.american_football_yard_distance_template, str3, format, string, str, currentYardline);
                }
            }
        }
        return null;
    }

    public static final String z(Double d2) {
        double s = d2 != null ? yid.s(Math.abs(d2.doubleValue()), 2) : 0.0d;
        return (0.01d > s || s > 0.09d) ? yid.f(d2) : yid.g(d2);
    }
}
