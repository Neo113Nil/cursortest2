package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.format.DateFormat;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.google.android.gms.internal.pal.zzaby;
import com.google.protobuf.ByteString;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.CategoryWrapper;
import com.sofascore.model.newNetwork.DistinctEventSet;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.newNetwork.TimezoneEventsInfo;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class i2a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static dld A(Context context, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds, OddsChoice oddsChoice) {
        int i;
        zmd zmdVar;
        context.getClass();
        oddsCountryProvider.getClass();
        providerOdds.getClass();
        oddsChoice.getClass();
        boolean winning = oddsChoice.getWinning();
        String reversibleName$default = OddsChoice.getReversibleName$default(oddsChoice, null, 1, null);
        m9k m9kVar = reversibleName$default != null ? new m9k(reversibleName$default) : null;
        int change = oddsChoice.getChange();
        Integer valueOf = Integer.valueOf(change);
        if (change == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            String fractionalValue = oddsChoice.getFractionalValue();
            Double c2 = fractionalValue != null ? rld.c(fractionalValue) : null;
            String initialFractionalValue = oddsChoice.getInitialFractionalValue();
            Double c3 = initialFractionalValue != null ? rld.c(initialFractionalValue) : null;
            if (c2 != null && c3 != null) {
                if (c2.doubleValue() > c3.doubleValue()) {
                    i = 1;
                } else if (c2.doubleValue() < c3.doubleValue()) {
                    i = -1;
                }
            }
            i = 0;
        }
        m9k m9kVar2 = m9kVar;
        String fractionalValue2 = oddsChoice.getFractionalValue();
        String k = rld.k(context, oddsCountryProvider, providerOdds, oddsChoice);
        Team team = oddsChoice.getTeam();
        if (team != null) {
            int id = team.getId();
            String p = tba.p(context, team);
            Team parentTeam = team.getParentTeam();
            zmd A = parentTeam != null ? l4a.A(context, parentTeam) : null;
            Country country = team.getCountry();
            zmdVar = new zmd(id, p, A, country != null ? country.getAlpha2() : null, team.getType() == 1 ? ymd.b : ymd.a);
        } else {
            zmdVar = null;
        }
        return new dld(winning, m9kVar2, i, fractionalValue2, k, zmdVar);
    }

    public static final boolean B(float f, float f2, b20 b20Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        b20 a2 = e20.a();
        tae[] taeVarArr = tae.a;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            e20.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = a2.b;
        if (rectF == null) {
            rectF = new RectF();
            a2.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = a2.a;
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        b20 a3 = e20.a();
        a3.h(b20Var, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.i();
        a2.i();
        return !isEmpty;
    }

    public static final boolean C(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final ArrayList D(Map map, Function1 function1) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            a6d a6dVar = (a6d) entry.getValue();
            Boolean valueOf = a6dVar != null ? Boolean.valueOf(a6dVar.b) : null;
            valueOf.getClass();
            if (!valueOf.booleanValue() && !a6dVar.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void E(kse kseVar, int i) {
        LinearLayout linearLayout = kseVar.b;
        LinearLayout linearLayout2 = kseVar.a;
        ImageView imageView = kseVar.d;
        int width = linearLayout.getWidth() - kseVar.e.getWidth();
        ImageView imageView2 = kseVar.c;
        int i2 = 4;
        if (width <= 0) {
            imageView2.setVisibility(4);
            imageView.setVisibility(4);
            return;
        }
        Context context = linearLayout2.getContext();
        context.getClass();
        imageView2.setVisibility((!hkg.c0(context) ? i == 0 : i == width) ? 0 : 4);
        Context context2 = linearLayout2.getContext();
        context2.getClass();
        if (!hkg.c0(context2) ? i != width : i != 0) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    public static final h2a F(String str, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = new h2a();
            av8Var.n0(O);
        }
        h2a h2aVar = (h2a) O;
        h2aVar.a(0, av8Var);
        return h2aVar;
    }

    public static final e1d G(of3 of3Var) {
        WeakHashMap weakHashMap = cal.w;
        j50 j50Var = qea.p(of3Var).c;
        av8 av8Var = (av8) of3Var;
        return e.g(Boolean.valueOf(j50Var.e().d > 0), av8Var);
    }

    public static final ge3 H(e6b e6bVar, of3 of3Var) {
        u6b u6bVar = (u6b) ((av8) of3Var).k(mhb.a);
        av8 av8Var = (av8) of3Var;
        boolean g = av8Var.g(u6bVar);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g || O == a99Var) {
            O = new ge3();
            av8Var.n0(O);
        }
        ge3 ge3Var = (ge3) O;
        boolean i = av8Var.i(ge3Var) | av8Var.i(u6bVar);
        Object O2 = av8Var.O();
        if (i || O2 == a99Var) {
            O2 = new aaf(8, u6bVar, ge3Var);
            av8Var.n0(O2);
        }
        hz8.b(ge3Var, u6bVar, (Function1) O2, av8Var);
        boolean i2 = av8Var.i(ge3Var) | av8Var.e(e6bVar.ordinal());
        Object O3 = av8Var.O();
        if (i2 || O3 == a99Var) {
            O3 = new m1f(ge3Var, e6bVar, null, 4);
            av8Var.n0(O3);
        }
        hz8.q(ge3Var, e6bVar, (Function2) O3, av8Var);
        return ge3Var;
    }

    public static final ppg I(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(1967007413);
        Object[] objArr = new Object[0];
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = new u9g(27);
            av8Var.n0(O);
        }
        ppg ppgVar = (ppg) o3a.M(objArr, ppg.e, (Function0) O, av8Var, 384);
        ppgVar.c = (spg) av8Var.k(upg.a);
        av8Var.s(false);
        return ppgVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final m5i J(Context context, Stage stage) {
        long startDateTimestamp;
        String description;
        String str;
        Integer valueOf = Integer.valueOf(R.color.n_lv_3);
        Integer valueOf2 = Integer.valueOf(R.color.live);
        stage.getClass();
        context.getClass();
        jfj jfjVar = new jfj(7, (String) null, (Integer) null);
        jfj jfjVar2 = new jfj(7, (String) null, (Integer) null);
        jfj jfjVar3 = new jfj(7, (String) null, (Integer) null);
        jfj jfjVar4 = new jfj(7, (String) null, (Integer) null);
        m5i m5iVar = new m5i();
        m5iVar.a = stage;
        m5iVar.b = jfjVar;
        m5iVar.c = jfjVar2;
        m5iVar.d = jfjVar3;
        m5iVar.e = jfjVar4;
        m5iVar.f = null;
        m5iVar.g = false;
        m5iVar.h = false;
        Stage stageEvent = stage.getStageEvent();
        if (stage.getStartDateTimestamp() > 0) {
            startDateTimestamp = stage.getStartDateTimestamp();
        } else {
            if (stageEvent == null) {
                ilg.c();
                return null;
            }
            startDateTimestamp = stageEvent.getStartDateTimestamp();
        }
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        m5iVar.b = new jfj(6, fc6.i(startDateTimestamp, hk4.a(bestPattern)), (Integer) null);
        if (stageEvent != null) {
            description = stageEvent.getDescription();
            str = stage.getDescription();
        } else {
            description = stage.getDescription();
            str = "Race";
        }
        DayOfWeek dayOfWeek = hwc.a;
        String d = hwc.d(context, str, false);
        StageWinner winner = stage.getWinner();
        if (winner != null) {
            String name = winner.getName();
            d = ((Object) d) + " • " + (name == null ? "" : tv3.c(context, name));
        }
        m5iVar.d = new jfj(4, description, Integer.valueOf(R.color.n_lv_1));
        m5iVar.e = new jfj(4, d, valueOf);
        String statusType = stage.getStatusType();
        switch (statusType.hashCode()) {
            case -1411655086:
                if (statusType.equals(StatusKt.STATUS_IN_PROGRESS)) {
                    m5iVar.c = new jfj(4, context.getString(R.string.in_progress), valueOf2);
                    return m5iVar;
                }
                return m5iVar;
            case -673660814:
                if (statusType.equals(StatusKt.STATUS_FINISHED)) {
                    m5iVar.c = new jfj(4, context.getString(R.string.finished), valueOf);
                    return m5iVar;
                }
                return m5iVar;
            case -123173735:
                if (statusType.equals(StatusKt.STATUS_CANCELED)) {
                    m5iVar.c = new jfj(4, context.getString(R.string.canceled), valueOf2);
                    return m5iVar;
                }
                return m5iVar;
            case 2018521742:
                if (statusType.equals(StatusKt.STATUS_POSTPONED)) {
                    m5iVar.c = new jfj(4, context.getString(R.string.postponed), valueOf2);
                    return m5iVar;
                }
                return m5iVar;
            default:
                return m5iVar;
        }
    }

    public static final TotrSharePayload K(xxi xxiVar, String str, boolean z, int i, String str2, String str3) {
        TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData;
        Object obj;
        xxiVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        TournamentRoundWrapper tournamentRoundWrapper = xxiVar.d;
        if (tournamentRoundWrapper == null || (teamOfTheWeekFieldUIData = xxiVar.h) == null) {
            return null;
        }
        boolean c2 = Intrinsics.c(tournamentRoundWrapper.getTotwType(), TeamOfTheWeekRoundsResponseKt.TOTW_SEASON);
        Iterator<E> it = xxiVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k7g) obj).a.getId() == tournamentRoundWrapper.getId()) {
                break;
            }
        }
        k7g k7gVar = (k7g) obj;
        String str4 = k7gVar != null ? k7gVar.b : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = xxiVar.e;
        String o = c2 ? str5 : lnb.o(str5, " • ", str4);
        int i2 = xxiVar.b;
        rqj.a.getClass();
        return new TotrSharePayload(teamOfTheWeekFieldUIData, str5, str, o, i2, 0, pff.a(tournamentRoundWrapper, z), xxiVar.a, str2, str3, i, tournamentRoundWrapper.getId());
    }

    public static String L(zzaby zzabyVar) {
        StringBuilder sb = new StringBuilder(zzabyVar.m());
        for (int i = 0; i < zzabyVar.m(); i++) {
            byte c2 = zzabyVar.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
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
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static X509Certificate[][] M(String str) {
        RandomAccessFile randomAccessFile;
        Pair Q;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                Q = null;
            } else {
                Q = o6a.Q(randomAccessFile2, 0);
                if (Q == null) {
                    Q = o6a.Q(randomAccessFile2, 65535);
                }
            }
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (Q == null) {
                long length = randomAccessFile2.length();
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new f2o(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) Q.first;
            long longValue = ((Long) Q.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile2.seek(j);
                if (randomAccessFile2.readInt() == 1347094023) {
                    throw new f2o("ZIP64 APK not supported");
                }
            }
            o6a.R(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j2 >= longValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 82 + String.valueOf(longValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j2);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new f2o(sb2.toString());
            }
            o6a.R(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != longValue) {
                throw new f2o("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j2);
                throw new f2o(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile2.seek(j2 - allocate.capacity());
            randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new f2o("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = allocate.getLong(0);
            if (j3 < allocate.capacity() || j3 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j3);
                throw new f2o(sb4.toString());
            }
            int i = (int) (8 + j3);
            long j4 = j2 - i;
            if (j4 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j4);
                throw new f2o(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile2.seek(j4);
            long j5 = j2;
            randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j6 = allocate2.getLong(0);
            if (j6 != j3) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j6).length() + 63 + String.valueOf(j3).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j6);
                sb6.append(" vs ");
                sb6.append(j3);
                throw new f2o(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j4));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            randomAccessFile = randomAccessFile2;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < 8");
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i2 = 0;
                while (slice.hasRemaining()) {
                    i2++;
                    if (slice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(String.valueOf(i2).length() + 59);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i2);
                        throw new f2o(sb9.toString());
                    }
                    long j7 = slice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i2).length() + 45 + String.valueOf(j7).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i2);
                        sb10.append(" size out of range: ");
                        sb10.append(j7);
                        throw new f2o(sb10.toString());
                    }
                    int i3 = (int) j7;
                    int position2 = slice.position() + i3;
                    if (i3 > slice.remaining()) {
                        int remaining = slice.remaining();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(i2).length() + 45 + String.valueOf(i3).length() + 13 + String.valueOf(remaining).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i2);
                        sb11.append(" size out of range: ");
                        sb11.append(i3);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new f2o(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] N = N(randomAccessFile.getChannel(), new pjn(T(i3 - 4, slice), longValue2, j5, longValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return N;
                    }
                    long j8 = j5;
                    slice.position(position2);
                    j5 = j8;
                }
                throw new f2o("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static X509Certificate[][] N(FileChannel fileChannel, pjn pjnVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer U = U(pjnVar.a);
                int i = 0;
                while (U.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(O(U(U), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(fn0.k(i, "Failed to parse/verify signer #", " block", new StringBuilder(String.valueOf(i).length() + 37)), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = pjnVar.b;
                long j2 = pjnVar.c;
                long j3 = pjnVar.d;
                ByteBuffer byteBuffer = pjnVar.e;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                ojn ojnVar = new ojn(fileChannel, 0L, j, 1);
                ojn ojnVar2 = new ojn(fileChannel, j2, j3 - j2, 1);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                o6a.R(duplicate);
                int position = duplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    a70.p(x5n.m(j, "uint32 value of out range: ", new StringBuilder(String.valueOf(j).length() + 27)));
                    return null;
                }
                duplicate.putInt(duplicate.position() + position, (int) j);
                dpk dpkVar = new dpk(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] P = P(iArr, new zkn[]{ojnVar, ojnVar2, dpkVar});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), P[i3])) {
                            throw new SecurityException(R(i4).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            vp2.e("Failed to obtain X.509 CertificateFactory", e4);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = Q(r6);
        r12 = Q(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] O(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer U = U(byteBuffer);
        ByteBuffer U2 = U(byteBuffer);
        byte[] V = V(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        int i2 = 0;
        while (U2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer U3 = U(U2);
                if (U3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = U3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr = V(U3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(me4.g(i2, "Failed to parse signature record #", new StringBuilder(String.valueOf(i2).length() + 34)), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(me4.g(i2, "Failed to parse signature record #", new StringBuilder(String.valueOf(i2).length() + 34)), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    a70.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    a70.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(V));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(U);
            if (!signature.verify(bArr)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            U.clear();
            ByteBuffer U4 = U(U);
            ArrayList arrayList2 = new ArrayList();
            byte[] bArr2 = null;
            int i4 = 0;
            while (U4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer U5 = U(U4);
                    if (U5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = U5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArr2 = V(U5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    cp4.i(me4.g(i4, "Failed to parse digest record #", new StringBuilder(String.valueOf(i4).length() + 31)), e);
                    return null;
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    cp4.i(me4.g(i4, "Failed to parse digest record #", new StringBuilder(String.valueOf(i4).length() + 31)), e);
                    return null;
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int Q = Q(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(Q), bArr2);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr2)) {
                throw new SecurityException(R(Q).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer U6 = U(U);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (U6.hasRemaining()) {
                i6++;
                byte[] V2 = V(U6);
                try {
                    arrayList3.add(new qjn((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(V2)), V2, 1));
                } catch (CertificateException e5) {
                    throw new SecurityException(me4.g(i6, "Failed to decode certificate #", new StringBuilder(String.valueOf(i6).length() + 30)), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(V, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        }
    }

    public static byte[][] P(int[] iArr, zkn[] zknVarArr) {
        long j;
        int i;
        int length;
        char c2;
        byte[][] bArr;
        String str;
        int i2 = 0;
        long j2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j2 += (zknVarArr[i2].zza() + 1048575) / 1048576;
            i2++;
        }
        if (j2 >= 2097151) {
            throw new DigestException(x5n.m(j2, "Too many chunks: ", new StringBuilder(String.valueOf(j2).length() + 17)));
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c2 = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) j2;
            byte[] bArr3 = new byte[(S(iArr[i3]) * i4) + 5];
            bArr3[0] = 90;
            W(i4, bArr3);
            bArr2[i3] = bArr3;
            i3++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i5 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i5 >= iArr.length) {
                break;
            }
            String R = R(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(R);
                i5++;
            } catch (NoSuchAlgorithmException e) {
                vp2.e(R.concat(" digest not supported"), e);
                return null;
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            zkn zknVar = zknVarArr[i6];
            int i9 = i6;
            long zza = zknVar.zza();
            long j3 = 0;
            while (zza > 0) {
                byte[][] bArr5 = bArr;
                String str2 = str;
                int min = (int) Math.min(zza, j);
                W(min, bArr4);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr4);
                }
                try {
                    zknVar.a(messageDigestArr, j3, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr6 = bArr2[i11];
                        int S = S(i12);
                        char c3 = c2;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        zkn zknVar2 = zknVar;
                        int digest = messageDigest.digest(bArr6, (i7 * S) + 5, S);
                        if (digest != S) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb.append("Unexpected output size of ");
                            sb.append(algorithm);
                            sb.append(" digest: ");
                            sb.append(digest);
                            throw new RuntimeException(sb.toString());
                        }
                        i11++;
                        c2 = c3;
                        zknVar = zknVar2;
                    }
                    long j4 = min;
                    j3 += j4;
                    zza -= j4;
                    i7++;
                    bArr = bArr5;
                    str = str2;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(x5n.n(new StringBuilder(String.valueOf(i7).length() + 37 + String.valueOf(i8).length()), i7, "Failed to digest chunk #", i8, " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = 1048576;
        }
        byte[][] bArr7 = bArr;
        String str3 = str;
        byte[][] bArr8 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr9 = bArr2[i13];
            String R2 = R(i14);
            try {
                bArr8[i13] = MessageDigest.getInstance(R2).digest(bArr9);
            } catch (NoSuchAlgorithmException e3) {
                vp2.e(R2.concat(str3), e3);
                return bArr7;
            }
        }
        return bArr8;
    }

    public static int Q(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                a70.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    public static String R(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        a70.p(me4.g(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
        return null;
    }

    public static int S(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        a70.p(me4.g(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
        return 0;
    }

    public static ByteBuffer T(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer U(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            is8.e(me4.g(remaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(remaining).length() + 82)));
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            a70.p("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return T(i, byteBuffer);
        }
        int remaining2 = byteBuffer.remaining();
        is8.e(x5n.n(new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(remaining2).length()), i, "Length-prefixed field longer than remaining buffer. Field length: ", remaining2, ", remaining: "));
        return null;
    }

    public static byte[] V(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            is8.e("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        is8.e(x5n.n(new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(remaining).length()), i, "Underflow while reading length-prefixed value. Length: ", remaining, ", available: "));
        return null;
    }

    public static void W(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static final void a(final boolean z, final boolean z2, final xtc xtcVar, final long j, of3 of3Var, final int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-565405130);
        int i2 = (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | i | 1024;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                j = lz.D(R.color.n_lv_4, av8Var);
            } else {
                av8Var.W();
            }
            av8Var.t();
            boolean f = av8Var.f(j);
            Object O = av8Var.O();
            if (f || O == nf3.a) {
                O = new Function1() { // from class: adb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        te2 te2Var = (te2) obj;
                        te2Var.getClass();
                        final float j2 = te2Var.j() * 1.0f;
                        final float intBitsToFloat = Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L)) / 2.0f;
                        final long j3 = j;
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        return te2Var.a(new Function1() { // from class: cdb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long j4;
                                float f2;
                                ha5 ha5Var = (ha5) obj2;
                                ha5Var.getClass();
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
                                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
                                long j5 = j3;
                                float f3 = j2;
                                ha5.W0(ha5Var, j5, floatToRawIntBits, floatToRawIntBits2, f3, 0, null, 496);
                                boolean z5 = z3;
                                float f4 = intBitsToFloat;
                                if (z5) {
                                    float f5 = f3 / 2.0f;
                                    float intBitsToFloat5 = (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f) + f5;
                                    long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                                    float intBitsToFloat6 = (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f) + f4;
                                    j4 = 4294967295L;
                                    f2 = f4;
                                    ha5.W0(ha5Var, j5, floatToRawIntBits3, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L), f3, 0, null, 496);
                                } else {
                                    j4 = 4294967295L;
                                    f2 = f4;
                                }
                                if (z4) {
                                    float intBitsToFloat7 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                                    float f6 = f3 / 2.0f;
                                    float intBitsToFloat8 = (Float.intBitsToFloat((int) (ha5Var.n() & j4)) / 2.0f) + f6;
                                    long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat7 - f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & j4);
                                    float intBitsToFloat9 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f6;
                                    float intBitsToFloat10 = (Float.intBitsToFloat((int) (ha5Var.n() & j4)) / 2.0f) + f2;
                                    ha5.W0(ha5Var, j5, floatToRawIntBits4, (Float.floatToRawIntBits(intBitsToFloat9) << 32) | (Float.floatToRawIntBits(intBitsToFloat10) & j4), f3, 0, null, 496);
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                av8Var.n0(O);
            }
            nq8.h(av8Var, td4.Y(xtcVar, (Function1) O));
        } else {
            av8Var.W();
        }
        final long j2 = j;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(z, z2, xtcVar, j2, i) { // from class: bdb
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ xtc c;
                public final /* synthetic */ long d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(55);
                    i2a.a(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0603, code lost:
    
        if (r59.intValue() != 2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x066e, code lost:
    
        if (r14 == r9) goto L207;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0599 A[Catch: all -> 0x05a4, TryCatch #1 {all -> 0x05a4, blocks: (B:108:0x058e, B:111:0x05a7, B:245:0x0599, B:247:0x05a0), top: B:107:0x058e }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0044  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xel xelVar, boolean z, float f, of3 of3Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        float f2;
        boolean z3;
        float f3;
        av8 av8Var;
        eqf u;
        boolean z4;
        int i5;
        Object obj;
        r9k r9kVar;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        p4h p4hVar;
        Object obj2;
        Object obj3;
        String str;
        String str2;
        String str3;
        Integer num;
        utc utcVar;
        lv1 lv1Var;
        float f4;
        boolean z5;
        av8 av8Var2;
        f50 f50Var3;
        String str4;
        f50 f50Var4;
        boolean z6;
        long f5;
        String str5;
        String str6;
        p8g p8gVar;
        ry ryVar2;
        boolean z7;
        ry ryVar3;
        f50 f50Var5;
        ff3 ff3Var2;
        utc utcVar2;
        f50 f50Var6;
        float f6;
        String str7;
        Object obj4;
        f50 f50Var7;
        p8g p8gVar2;
        String str8;
        int i6;
        av8 av8Var3;
        wn1 wn1Var;
        String str9;
        boolean z8;
        ?? r15;
        long f7;
        av8 av8Var4;
        Object obj5;
        boolean z9;
        long f8;
        int i7;
        lv1 lv1Var2 = uxf.m;
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(-1591188343);
        if ((i & 6) == 0) {
            i3 = (av8Var5.g(xelVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= av8Var5.h(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f2 = f;
                i3 |= av8Var5.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                if (av8Var5.T(i3 & 1, (i3 & 147) != 146)) {
                    boolean z10 = i8 != 0 ? false : z2;
                    float f9 = i4 != 0 ? 16.0f : f2;
                    Context context = (Context) av8Var5.k(nz.b);
                    wn1 wn1Var2 = xelVar.a;
                    r9k r9kVar2 = xelVar.c;
                    boolean z11 = xelVar.f;
                    boolean z12 = xelVar.g;
                    boolean c2 = wn1Var2.c();
                    boolean z13 = z12 || z11;
                    boolean b2 = wn1Var2.b();
                    String str10 = wn1Var2.r;
                    String str11 = wn1Var2.s;
                    long j = wn1Var2.p;
                    Integer num2 = wn1Var2.k;
                    Integer num3 = wn1Var2.j;
                    String str12 = wn1Var2.h;
                    String str13 = wn1Var2.e;
                    String str14 = wn1Var2.q;
                    Integer num4 = wn1Var2.u;
                    k1c c3 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var5.T);
                    aee m = av8Var5.m();
                    utc utcVar3 = utc.a;
                    xtc C = fqj.C(av8Var5, utcVar3);
                    if3.k7.getClass();
                    Function0 function0 = hf3.b;
                    av8Var5.h0();
                    int i9 = i3;
                    if (av8Var5.S) {
                        av8Var5.l(function0);
                    } else {
                        av8Var5.q0();
                    }
                    f50 f50Var8 = hf3.g;
                    waa.K(av8Var5, c3, f50Var8);
                    ff3 ff3Var3 = hf3.f;
                    waa.K(av8Var5, m, ff3Var3);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var9 = hf3.j;
                    waa.K(av8Var5, valueOf, f50Var9);
                    ry ryVar4 = hf3.k;
                    waa.J(av8Var5, ryVar4);
                    f50 f50Var10 = hf3.d;
                    waa.K(av8Var5, C, f50Var10);
                    av8Var5.d0(387086013);
                    av8Var5.d0(387082099);
                    xtc A = wnn.A(bkh.d(utcVar3, 1.0f), o7g.a(f9));
                    long D = lz.D(R.color.surface_1, av8Var5);
                    jf9 jf9Var = oyn.e;
                    xtc q = n9e.q(A, D, jf9Var);
                    if (c2) {
                        z4 = z12;
                        q = q.z(n9e.q(utcVar3, r13.c(lz.D(R.color.live, av8Var5), 0.1f), jf9Var));
                    } else {
                        z4 = z12;
                    }
                    boolean z14 = false;
                    av8Var5.s(false);
                    if (c2 || z4) {
                        q = q.z(yso.o(utcVar3, 2.0f, c2 ? ljg.f(av8Var5, 393670179, R.color.live, av8Var5, false) : ljg.f(av8Var5, 393670660, R.color.value, av8Var5, false), o7g.a(f9)));
                        z14 = false;
                    }
                    av8Var5.s(z14);
                    boolean i10 = av8Var5.i(context) | ((i9 & 14) == 4);
                    Object O = av8Var5.O();
                    Object obj6 = nf3.a;
                    if (i10 || O == obj6) {
                        i5 = 0;
                        Object yelVar = new yel(context, xelVar, i5);
                        av8Var5.n0(yelVar);
                        obj = yelVar;
                    } else {
                        i5 = 0;
                        obj = O;
                    }
                    boolean z15 = i5;
                    boolean z16 = z4;
                    xtc y = tol.y(q, false, false, false, 0L, null, (Function0) obj, av8Var5, 31);
                    av8 av8Var6 = av8Var5;
                    xtc c0 = l98.c0(y, 16.0f, 8.0f);
                    p4h p4hVar2 = ww9.d;
                    u23 a2 = t23.a(p4hVar2, uxf.o, av8Var6, z15 ? 1 : 0);
                    int hashCode2 = Long.hashCode(av8Var6.T);
                    aee m2 = av8Var6.m();
                    xtc C2 = fqj.C(av8Var6, c0);
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(function0);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a2, f50Var8);
                    waa.K(av8Var6, m2, ff3Var3);
                    bf3.s(hashCode2, av8Var6, f50Var9, av8Var6, ryVar4);
                    waa.K(av8Var6, C2, f50Var10);
                    if (z13) {
                        av8Var6.d0(1062979244);
                        xtc f0 = l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                        l8g a3 = k8g.a(ww9.b, lv1Var2, av8Var6, 48);
                        int hashCode3 = Long.hashCode(av8Var6.T);
                        aee m3 = av8Var6.m();
                        xtc C3 = fqj.C(av8Var6, f0);
                        av8Var6.h0();
                        if (av8Var6.S) {
                            av8Var6.l(function0);
                        } else {
                            av8Var6.q0();
                        }
                        waa.K(av8Var6, a3, f50Var8);
                        waa.K(av8Var6, m3, ff3Var3);
                        bf3.s(hashCode3, av8Var6, f50Var9, av8Var6, ryVar4);
                        waa.K(av8Var6, C3, f50Var10);
                        long f10 = c2 ? ljg.f(av8Var6, 2094764109, R.color.n_lv_3, av8Var6, z15) : z16 ? ljg.f(av8Var6, 2094766062, R.color.value, av8Var6, z15) : ljg.f(av8Var6, 2094767447, R.color.pedestal_bronze, av8Var6, z15);
                        String a4 = r9kVar2.a(av8Var6);
                        yf8 yf8Var = xth.a;
                        long j2 = f10;
                        obj2 = num2;
                        obj3 = num3;
                        num = num4;
                        ryVar = ryVar4;
                        f50Var = f50Var9;
                        utcVar = utcVar3;
                        f50Var2 = f50Var10;
                        r9kVar = r9kVar2;
                        lv1Var = lv1Var2;
                        p4hVar = p4hVar2;
                        str = str12;
                        str2 = str13;
                        str3 = str14;
                        ff3Var = ff3Var3;
                        udj.c(a4, null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var6, 0, 0, 131066);
                        nq8.h(av8Var6, new goa(1.0f, true));
                        kq9.b(s6a.N(R.drawable.ic_location, 6, av8Var6), null, bkh.l(utcVar, 16.0f), j2, av8Var6, 432, 0);
                        f4 = 1.0f;
                        udj.c(xelVar.d, l98.f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var6, 48, 0, 131064);
                        av8 av8Var7 = av8Var6;
                        z5 = true;
                        av8Var7.s(true);
                        av8Var7.s(false);
                        av8Var2 = av8Var7;
                    } else {
                        r9kVar = r9kVar2;
                        ff3Var = ff3Var3;
                        ryVar = ryVar4;
                        f50Var = f50Var9;
                        f50Var2 = f50Var10;
                        p4hVar = p4hVar2;
                        obj2 = num2;
                        obj3 = num3;
                        str = str12;
                        str2 = str13;
                        str3 = str14;
                        num = num4;
                        utcVar = utcVar3;
                        lv1Var = lv1Var2;
                        f4 = 1.0f;
                        z5 = true;
                        av8Var6.d0(1064287165);
                        av8Var6.s(z15);
                        av8Var2 = av8Var6;
                    }
                    xtc d = bkh.d(utcVar, f4);
                    l8g a5 = k8g.a(new ng0(8.0f, z5, new a70(6)), lv1Var, av8Var2, 54);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m4 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, d);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a5, f50Var8);
                    ff3 ff3Var4 = ff3Var;
                    waa.K(av8Var2, m4, ff3Var4);
                    ry ryVar5 = ryVar;
                    f50 f50Var11 = f50Var;
                    bf3.s(hashCode4, av8Var2, f50Var11, av8Var2, ryVar5);
                    f50 f50Var12 = f50Var2;
                    waa.K(av8Var2, C4, f50Var12);
                    p8g p8gVar3 = p8g.a;
                    xtc a6 = p8gVar3.a(f4, utcVar, true);
                    k1c c4 = e12.c(uxf.f, false);
                    int hashCode5 = Long.hashCode(av8Var2.T);
                    aee m5 = av8Var2.m();
                    xtc C5 = fqj.C(av8Var2, a6);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c4, f50Var8);
                    waa.K(av8Var2, m5, ff3Var4);
                    bf3.s(hashCode5, av8Var2, f50Var11, av8Var2, ryVar5);
                    waa.K(av8Var2, C5, f50Var12);
                    int i11 = wn1Var2.b;
                    if (z10) {
                        f50Var3 = f50Var12;
                        str4 = wn1Var2.f;
                    } else {
                        f50Var3 = f50Var12;
                        str4 = str2;
                    }
                    boolean z17 = z16 || z11;
                    if (!b2 || (num != null && num.intValue() == 1)) {
                        f50Var4 = f50Var11;
                        z6 = false;
                        f5 = ljg.f(av8Var2, -2039959336, R.color.n_lv_1, av8Var2, false);
                    } else {
                        f50Var4 = f50Var11;
                        z6 = false;
                        f5 = ljg.f(av8Var2, -2039959816, R.color.n_lv_3, av8Var2, false);
                    }
                    f50 f50Var13 = f50Var3;
                    boolean z18 = z6;
                    f50 f50Var14 = f50Var4;
                    i(i11, str4, null, f5, null, z17, av8Var2, 0, 20);
                    if (z10) {
                        str5 = str;
                        av8Var2.d0(1185952275);
                        av8Var2.s(z18);
                    } else {
                        av8Var2.d0(1185847526);
                        str5 = str;
                        n(str5, av8Var2, z18 ? 1 : 0);
                        av8Var2.s(z18);
                    }
                    av8Var2.s(true);
                    xtc f02 = l98.f0(p8gVar3.b(utcVar, uxf.l), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !z13 ? 4.0f : 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    u23 a7 = t23.a(p4hVar, uxf.p, av8Var2, 48);
                    int hashCode6 = Long.hashCode(av8Var2.T);
                    aee m6 = av8Var2.m();
                    xtc C6 = fqj.C(av8Var2, f02);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a7, f50Var8);
                    waa.K(av8Var2, m6, ff3Var4);
                    bf3.s(hashCode6, av8Var2, f50Var14, av8Var2, ryVar5);
                    waa.K(av8Var2, C6, f50Var13);
                    av8Var2.d0(-1436368546);
                    o80 o80Var = new o80();
                    String str15 = str3;
                    if (Intrinsics.c(str15, StatusKt.STATUS_IN_PROGRESS) || Intrinsics.c(str15, StatusKt.STATUS_WILL_CONTINUE) || Intrinsics.c(str15, StatusKt.STATUS_SUSPENDED) || Intrinsics.c(str15, StatusKt.STATUS_INTERRUPTED)) {
                        str6 = str5;
                        p8gVar = p8gVar3;
                        av8Var2.d0(-1138993567);
                        int g = o80Var.g(new pwh(Intrinsics.c(str15, StatusKt.STATUS_IN_PROGRESS) ? ljg.f(av8Var2, 1071639940, R.color.live, av8Var2, false) : ljg.f(av8Var2, 1071640430, R.color.neutral_default, av8Var2, false), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                        ryVar2 = ryVar5;
                        try {
                            o80Var.d((obj3 == null ? "" : obj3) + " - " + (obj2 == null ? "" : obj2));
                            Unit unit = Unit.a;
                            o80Var.f(g);
                            z7 = false;
                            av8Var2.s(false);
                        } finally {
                        }
                    } else {
                        if (w9h.b(StatusKt.STATUS_FINISHED).contains(str15)) {
                            av8Var2.d0(-1138507301);
                            try {
                                if (num == null) {
                                    str6 = str5;
                                } else {
                                    str6 = str5;
                                    if (num.intValue() == 1) {
                                        p8gVar = p8gVar3;
                                        f8 = ljg.f(av8Var2, 1071655172, R.color.n_lv_1, av8Var2, false);
                                        int g2 = o80Var.g(new pwh(f8, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                        if (obj3 == null) {
                                            obj3 = "";
                                        }
                                        o80Var.d(String.valueOf(obj3));
                                        if (num != null) {
                                            i7 = 2;
                                        } else {
                                            i7 = 2;
                                            if (num.intValue() == 2) {
                                                o80Var.d(" - ");
                                            }
                                        }
                                        Unit unit2 = Unit.a;
                                        o80Var.f(g2);
                                        int g3 = o80Var.g(new pwh((num != null && num.intValue() == i7) ? ljg.f(av8Var2, 1071666116, R.color.n_lv_1, av8Var2, false) : ljg.f(av8Var2, 1071666596, R.color.n_lv_3, av8Var2, false), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                        if (num != null) {
                                            try {
                                            } finally {
                                            }
                                        }
                                        o80Var.d(" - ");
                                        if (obj2 == null) {
                                            obj2 = "";
                                        }
                                        o80Var.d(String.valueOf(obj2));
                                        o80Var.f(g3);
                                        z9 = false;
                                        av8Var2.s(false);
                                    }
                                }
                                o80Var.d(String.valueOf(obj3));
                                if (num != null) {
                                }
                                Unit unit22 = Unit.a;
                                o80Var.f(g2);
                                if (num != null) {
                                    int g32 = o80Var.g(new pwh((num != null && num.intValue() == i7) ? ljg.f(av8Var2, 1071666116, R.color.n_lv_1, av8Var2, false) : ljg.f(av8Var2, 1071666596, R.color.n_lv_3, av8Var2, false), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                    if (num != null) {
                                    }
                                    o80Var.d(" - ");
                                    if (obj2 == null) {
                                    }
                                    o80Var.d(String.valueOf(obj2));
                                    o80Var.f(g32);
                                    z9 = false;
                                    av8Var2.s(false);
                                }
                                int g322 = o80Var.g(new pwh((num != null && num.intValue() == i7) ? ljg.f(av8Var2, 1071666116, R.color.n_lv_1, av8Var2, false) : ljg.f(av8Var2, 1071666596, R.color.n_lv_3, av8Var2, false), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                if (num != null) {
                                }
                                o80Var.d(" - ");
                                if (obj2 == null) {
                                }
                                o80Var.d(String.valueOf(obj2));
                                o80Var.f(g322);
                                z9 = false;
                                av8Var2.s(false);
                            } finally {
                            }
                            p8gVar = p8gVar3;
                            f8 = ljg.f(av8Var2, 1071655652, R.color.n_lv_3, av8Var2, false);
                            int g22 = o80Var.g(new pwh(f8, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                            if (obj3 == null) {
                            }
                        } else {
                            str6 = str5;
                            p8gVar = p8gVar3;
                            if (Intrinsics.c(str15, StatusKt.STATUS_NOT_STARTED) || Intrinsics.c(str15, StatusKt.STATUS_CANCELED) || Intrinsics.c(str15, StatusKt.STATUS_POSTPONED) || Intrinsics.c(str15, StatusKt.STATUS_DELAYED)) {
                                av8Var2.d0(-1137703440);
                                boolean f11 = av8Var2.f(j);
                                Object O2 = av8Var2.O();
                                if (!f11) {
                                    obj5 = O2;
                                }
                                context.getClass();
                                String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                                bestPattern.getClass();
                                Object format = hk4.a(bestPattern).format(Instant.ofEpochSecond(j));
                                format.getClass();
                                av8Var2.n0(format);
                                obj5 = format;
                                String str16 = (String) obj5;
                                int g4 = o80Var.g(new pwh(lz.D(R.color.n_lv_1, av8Var2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                try {
                                    o80Var.d(str16);
                                    Unit unit3 = Unit.a;
                                    o80Var.f(g4);
                                    z7 = false;
                                    av8Var2.s(false);
                                    ryVar2 = ryVar5;
                                } finally {
                                }
                            } else {
                                av8Var2.d0(-1137255769);
                                z9 = false;
                                av8Var2.s(false);
                            }
                        }
                        ryVar2 = ryVar5;
                        z7 = z9;
                    }
                    q80 h = o80Var.h();
                    av8Var2.s(z7);
                    yf8 yf8Var2 = xth.a;
                    dfj l = !z13 ? xth.l() : xth.j();
                    if (h.b.length() > 0) {
                        av8Var2.d0(-1575635470);
                        long D2 = lz.D(R.color.n_lv_1, av8Var2);
                        av8 av8Var8 = av8Var2;
                        f6 = 0.0f;
                        str8 = str6;
                        ryVar3 = ryVar2;
                        f50Var5 = f50Var8;
                        ff3Var2 = ff3Var4;
                        obj4 = StatusKt.STATUS_NOT_STARTED;
                        f50Var7 = f50Var14;
                        f50Var6 = f50Var13;
                        p8gVar2 = p8gVar;
                        i6 = R.color.neutral_default;
                        utcVar2 = utcVar;
                        str7 = str15;
                        udj.d(h, bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 1), D2, new es0(v8a.v(6), l.a.b, v8a.u(0.25d)), 0L, 0L, null, 0L, 2, false, 1, 0, null, null, l, av8Var8, 48, 24960, 241648);
                        av8 av8Var9 = av8Var8;
                        av8Var9.s(false);
                        av8Var3 = av8Var9;
                    } else {
                        ryVar3 = ryVar2;
                        f50Var5 = f50Var8;
                        ff3Var2 = ff3Var4;
                        utcVar2 = utcVar;
                        f50Var6 = f50Var13;
                        f6 = 0.0f;
                        str7 = str15;
                        obj4 = StatusKt.STATUS_NOT_STARTED;
                        f50Var7 = f50Var14;
                        p8gVar2 = p8gVar;
                        str8 = str6;
                        i6 = R.color.neutral_default;
                        av8Var2.d0(-1575166781);
                        av8Var2.s(false);
                        av8Var3 = av8Var2;
                    }
                    av8Var3.d0(-1436282361);
                    o80 o80Var2 = new o80();
                    if (Intrinsics.c(str7, obj4) && !z13) {
                        av8Var3.d0(1100628354);
                        int g5 = o80Var2.g(new pwh(lz.D(i6, av8Var3), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                        try {
                            String a8 = xelVar.b.a(av8Var3);
                            str9 = a8.length() > 0 ? a8 : null;
                            if (str9 == null) {
                                av8Var3.d0(-1869113313);
                                str9 = r9kVar.a(av8Var3);
                                av8Var3.s(false);
                                z8 = false;
                            } else {
                                av8Var3.d0(-1869116010);
                                z8 = false;
                                av8Var3.s(false);
                            }
                            o80Var2.d(str9);
                            Unit unit4 = Unit.a;
                            o80Var2.f(g5);
                            av8Var3.s(z8);
                            wn1Var = wn1Var2;
                        } finally {
                        }
                    } else if (Intrinsics.c(str7, StatusKt.STATUS_IN_PROGRESS)) {
                        av8Var3.d0(-380126724);
                        int g6 = o80Var2.g(new pwh(lz.D(R.color.live, av8Var3), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                        try {
                            if (str11 != null) {
                                o80Var2.d(l4a.O(str11));
                                wn1Var = wn1Var2;
                            } else {
                                wn1Var = wn1Var2;
                                String str17 = wn1Var.t;
                                if (str17 != null) {
                                    o80Var2.d(l4a.O(str17));
                                } else {
                                    o80Var2.d(str10);
                                }
                            }
                            Unit unit5 = Unit.a;
                            o80Var2.f(g6);
                            z8 = false;
                            av8Var3.s(false);
                        } finally {
                        }
                    } else {
                        wn1Var = wn1Var2;
                        av8Var3.d0(-380109278);
                        int g7 = o80Var2.g(new pwh(lz.D(i6, av8Var3), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                        try {
                            if (str11 != null) {
                                o80Var2.d(l4a.O(str11));
                            } else {
                                str9 = str10.equals("-") ? null : str10;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                o80Var2.d(str9);
                            }
                            Unit unit6 = Unit.a;
                            o80Var2.f(g7);
                            z8 = false;
                            av8Var3.s(false);
                        } finally {
                        }
                    }
                    q80 h2 = o80Var2.h();
                    av8Var3.s(z8);
                    utc utcVar4 = utcVar2;
                    av8 av8Var10 = av8Var3;
                    udj.d(h2, l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !z13 ? 14.0f : f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, !z13 ? xth.c() : xth.g(), av8Var10, 0, 24960, 241660);
                    av8 av8Var11 = av8Var10;
                    av8Var11.s(true);
                    xtc a9 = p8gVar2.a(1.0f, utcVar4, true);
                    k1c c5 = e12.c(uxf.h, false);
                    int hashCode7 = Long.hashCode(av8Var11.T);
                    aee m7 = av8Var11.m();
                    xtc C7 = fqj.C(av8Var11, a9);
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(function0);
                    } else {
                        av8Var11.q0();
                    }
                    waa.K(av8Var11, c5, f50Var5);
                    waa.K(av8Var11, m7, ff3Var2);
                    bf3.s(hashCode7, av8Var11, f50Var7, av8Var11, ryVar3);
                    waa.K(av8Var11, C7, f50Var6);
                    int i12 = wn1Var.c;
                    String str18 = z10 ? wn1Var.i : str8;
                    kv1 kv1Var = uxf.q;
                    boolean z19 = z16 || z11;
                    if (!b2 || (num != null && num.intValue() == 2)) {
                        r15 = 0;
                        f7 = ljg.f(av8Var11, 2031485711, R.color.n_lv_1, av8Var11, false);
                    } else {
                        r15 = 0;
                        f7 = ljg.f(av8Var11, 2031485231, R.color.n_lv_3, av8Var11, false);
                    }
                    i(i12, str18, null, f7, kv1Var, z19, av8Var11, 24576, 4);
                    if (z10) {
                        av8Var11.d0(-1448271140);
                        av8Var11.s(r15);
                    } else {
                        av8Var11.d0(-1448374928);
                        n(str2, av8Var11, r15);
                        av8Var11.s(r15);
                    }
                    ljg.t(av8Var11, true, true, true);
                    if (z16) {
                        av8Var11.d0(-876556351);
                        wkn.l(s6a.N(R.drawable.ic_world_cup_trophy, 6, av8Var11), n12.a.b(utcVar4), null, null, 0.1f, null, av8Var11, 196656, 88);
                        av8 av8Var12 = av8Var11;
                        av8Var12.s(false);
                        av8Var4 = av8Var12;
                    } else {
                        av8Var11.d0(-876313869);
                        av8Var11.s(false);
                        av8Var4 = av8Var11;
                    }
                    av8Var4.s(true);
                    z3 = z10;
                    f3 = f9;
                    av8Var = av8Var4;
                } else {
                    av8Var5.W();
                    z3 = z2;
                    f3 = f2;
                    av8Var = av8Var5;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new s2f(xelVar, z3, f3, i, i2);
                    return;
                }
                return;
            }
            f2 = f;
            if (av8Var5.T(i3 & 1, (i3 & 147) != 146)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        if (av8Var5.T(i3 & 1, (i3 & 147) != 146)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void c(xel xelVar, of3 of3Var, int i) {
        xel xelVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1962961331);
        int i2 = (av8Var.g(xelVar) ? 32 : 16) | i;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, goaVar);
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
            xelVar2 = xelVar;
            b(xelVar2, true, 8.0f, av8Var, ((i2 >> 3) & 14) | 432, 0);
            av8Var.s(true);
        } else {
            xelVar2 = xelVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(xelVar2, i, 20);
        }
    }

    public static final void d(tee teeVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        String b2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1432940347);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(teeVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z || O == obj) {
                O = l6g.W(teeVar.keySet());
                av8Var.n0(O);
            }
            gv9 gv9Var = (gv9) O;
            boolean z2 = i5 == 4;
            Object O2 = av8Var.O();
            if (z2 || O2 == obj) {
                O2 = n9e.D(teeVar.entrySet(), new pcl(i3));
                av8Var.n0(O2);
            }
            Integer num = (Integer) O2;
            boolean z3 = i5 == 4;
            Object O3 = av8Var.O();
            if (z3 || O3 == obj) {
                O3 = n9e.D(teeVar.entrySet(), new pcl(5));
                av8Var.n0(O3);
            }
            Integer num2 = (Integer) O3;
            int intValue = num != null ? num.intValue() : num2 != null ? num2.intValue() : 0;
            boolean g = av8Var.g(gv9Var);
            Object O4 = av8Var.O();
            if (g || O4 == obj) {
                O4 = new b61(2, gv9Var);
                av8Var.n0(O4);
            }
            pr4 b3 = c6e.b(intValue, (Function0) O4, av8Var, 0, 2);
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
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
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            r9k r9kVar = (r9k) CollectionsKt.a0(b3.k(), gv9Var);
            if (r9kVar == null) {
                av8Var.d0(-1438242834);
                av8Var.s(false);
                b2 = null;
            } else {
                av8Var.d0(1200531059);
                b2 = r9kVar.b((Context) av8Var.k(nz.b));
                av8Var.s(false);
            }
            if (b2 == null) {
                b2 = "";
            }
            xtc O5 = kda.O(utcVar, "wc26_matches_date_row", av8Var);
            yf8 yf8Var = xth.a;
            udj.c(b2, O5, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            nq8.h(av8Var, new goa(1.0f, true));
            String v = oea.v(R.string.full_schedule, av8Var);
            boolean z4 = (i4 & 112) == 32;
            Object O6 = av8Var.O();
            if (z4 || O6 == obj) {
                O6 = new b4j(8, function1);
                av8Var.n0(O6);
            }
            tz9.s(0, 0, av8Var, kda.O(utcVar, "wc26_matches_full_schedule_cta", av8Var), v, (Function0) O6);
            av8Var.s(true);
            f6a.a(b3, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), n9e.t(b3, 16.0f), null, 0, 8.0f, uxf.l, null, false, null, null, null, yqo.H(1048225202, av8Var, new rsh(9, teeVar, gv9Var)), av8Var, 1769520, 24576, 16280);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(teeVar, function1, xtcVar2, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final int i, final ArrayList arrayList, final boolean z, xtc xtcVar, boolean z2, of3 of3Var, final int i2, final int i3) {
        boolean z3;
        final xtc xtcVar2;
        final boolean z4;
        eqf u;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(491440016);
        int i4 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.e(i) ? 32 : 16) | (av8Var.i(arrayList) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024);
        int i5 = i4 | 24576;
        int i6 = i3 & 32;
        if (i6 != 0) {
            i5 = 221184 | i4;
        } else if ((i2 & 196608) == 0) {
            z3 = z2;
            i5 |= av8Var.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (av8Var.T(i5 & 1, (74899 & i5) == 74898)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                z4 = z3;
            } else {
                boolean z5 = i6 != 0 ? false : z3;
                long f = z5 ? ljg.f(av8Var, -172537635, R.color.surface_2, av8Var, false) : ljg.f(av8Var, -172537027, R.color.surface_1, av8Var, false);
                n7g a2 = o7g.a(12.0f);
                utc utcVar = utc.a;
                xtc b0 = l98.b0(n9e.q(utcVar, f, a2), 8.0f);
                u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
                waa.K(av8Var, a3, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                int i7 = i5;
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                l8g a4 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
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
                int i8 = i7 >> 3;
                td4.i(Integer.valueOf(i), bkh.l(utcVar, 16.0f), av8Var, (i8 & 14) | 48);
                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                yf8 yf8Var = xth.a;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, i7 & 14, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(true);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                l8g a5 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.l, av8Var, 6);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                av8Var.d0(954767368);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jca.s((wn1) it.next(), z5 ? ljg.f(av8Var, 744314743, R.color.surface_1, av8Var, false) : ljg.f(av8Var, 744315351, R.color.surface_2, av8Var, false), z, null, av8Var, i8 & 896, 24);
                }
                ljg.t(av8Var, false, true, true);
                xtcVar2 = utcVar;
                z4 = z5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: axa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i2a.e(str, i, arrayList, z, xtcVar2, z4, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if (av8Var.T(i5 & 1, (74899 & i5) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void f(String str, xtc xtcVar, ImageVector imageVector, of3 of3Var, int i, int i2) {
        int i3;
        ImageVector imageVector2;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1360002847);
        int i4 = 4;
        int i5 = (av8Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
        } else {
            i3 = i5 | (av8Var.g(imageVector) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ImageVector imageVector3 = i6 != 0 ? null : imageVector;
            dy0.b(l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), null, yqo.H(-443042121, av8Var, new yya(i4, str, imageVector3)), av8Var, 3072, 6);
            imageVector2 = imageVector3;
        } else {
            av8Var.W();
            imageVector2 = imageVector;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(str, xtcVar, imageVector2, i, i2, 8);
        }
    }

    public static final void g(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1861699901);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            ff5 ff5Var = nz.b;
            Context context = (Context) av8Var.k(ff5Var);
            Configuration configuration = (Configuration) av8Var.k(nz.a);
            boolean g = av8Var.g(configuration);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                Configuration configuration2 = new Configuration(configuration);
                configuration2.uiMode = (configuration2.uiMode & (-49)) | 32;
                O = context.createConfigurationContext(configuration2);
                av8Var.n0(O);
            }
            Context context2 = (Context) O;
            boolean z = ((ema) av8Var.k(dh3.n)) == ema.b;
            ff5 ff5Var2 = udj.a;
            dfj a2 = dfj.a((dfj) av8Var.k(ff5Var2), 0L, 0L, null, null, 0L, null, 0, z ? 2 : 1, 0L, null, null, 0, 16711679);
            context2.getClass();
            tol.c(new gb0[]{ff5Var.a(context2), ff5Var2.a(a2)}, yqo.H(-633656445, av8Var, new b25(tc3Var, 8)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b25(i, 9, tc3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tc3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [tc3] */
    /* JADX WARN: Type inference failed for: r3v1, types: [av8, java.lang.Object, of3] */
    public static final void h(epi epiVar, xtc xtcVar, boolean z, boolean z2, boolean z3, Function1 function1, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        tc3 tc3Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        Function1 function12;
        Function1 function13;
        ?? r0 = fqj.e;
        ?? r3 = (av8) of3Var;
        r3.f0(-741495334);
        if ((i & 6) == 0) {
            i2 = (r3.i(epiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r3.i(r0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r3.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = i2 | 1797120;
        if ((12582912 & i) == 0) {
            i3 |= r3.i(tc3Var) ? 8388608 : 4194304;
        }
        if (r3.T(i3 & 1, (4793491 & i3) != 4793490)) {
            Object O = r3.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new rfi(8);
                r3.n0(O);
            }
            Function1 function14 = (Function1) O;
            dx dxVar = epiVar.a;
            dx dxVar2 = epiVar.a;
            ewd ewdVar = ewd.a;
            boolean z7 = ((fpi) ((eoh) ((e1d) dxVar.d)).getValue()) == fpi.c;
            r3.d0(-869685853);
            r3.s(false);
            xtc g = zm2.g(xtcVar, dxVar, z7);
            k1c c2 = e12.c(uxf.c, true);
            int G = z8e.G(r3);
            aee m = r3.m();
            xtc C = fqj.C(r3, g);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            r3.h0();
            if (r3.S) {
                r3.l(zg3Var);
            } else {
                r3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(r3, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(r3, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (r3.S || !Intrinsics.c(r3.O(), Integer.valueOf(G))) {
                mz1.t(G, r3, G, f50Var2);
            }
            f50 f50Var3 = hf3.d;
            waa.K(r3, C, f50Var3);
            xtc b2 = n12.a.b(utc.a);
            int i4 = (i3 << 6) & 7168;
            wxf wxfVar = ww9.b;
            lv1 lv1Var = uxf.l;
            l8g a2 = k8g.a(wxfVar, lv1Var, r3, 0);
            int G2 = z8e.G(r3);
            aee m2 = r3.m();
            xtc C2 = fqj.C(r3, b2);
            r3.h0();
            if (r3.S) {
                r3.l(zg3Var);
            } else {
                r3.q0();
            }
            waa.K(r3, a2, f50Var);
            waa.K(r3, m2, ff3Var);
            if (r3.S || !Intrinsics.c(r3.O(), Integer.valueOf(G2))) {
                mz1.t(G2, r3, G2, f50Var2);
            }
            waa.K(r3, C2, f50Var3);
            Integer valueOf = Integer.valueOf(((i4 >> 6) & 112) | 6);
            p8g p8gVar = p8g.a;
            r0.invoke(p8gVar, r3, valueOf);
            r3.s(true);
            boolean i5 = ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | r3.i(epiVar);
            Object O2 = r3.O();
            if (i5 || O2 == obj) {
                O2 = new q8i(epiVar, 3);
                r3.n0(O2);
            }
            xtc n = ok3.n(dxVar2, (Function2) O2);
            int i6 = (i3 >> 12) & 7168;
            l8g a3 = k8g.a(wxfVar, lv1Var, r3, 0);
            int G3 = z8e.G(r3);
            aee m3 = r3.m();
            xtc C3 = fqj.C(r3, n);
            r3.h0();
            int i7 = i3;
            if (r3.S) {
                r3.l(zg3Var);
            } else {
                r3.q0();
            }
            waa.K(r3, a3, f50Var);
            waa.K(r3, m3, ff3Var);
            if (r3.S || !Intrinsics.c(r3.O(), Integer.valueOf(G3))) {
                mz1.t(G3, r3, G3, f50Var2);
            }
            waa.K(r3, C3, f50Var3);
            ?? r2 = tc3Var;
            r2.invoke(p8gVar, r3, Integer.valueOf(((i6 >> 6) & 112) | 6));
            z4 = true;
            r3.s(true);
            r3.s(true);
            fpi fpiVar = (fpi) ((eoh) ((e1d) dxVar2.d)).getValue();
            boolean i8 = r3.i(epiVar) | ((i7 & 3670016) == 1048576);
            Object O3 = r3.O();
            if (i8 || O3 == obj) {
                function13 = function14;
                O3 = new m1f(epiVar, function13, null, 24);
                r3.n0(O3);
            } else {
                function13 = function14;
            }
            hz8.q(fpiVar, function13, (Function2) O3, r3);
            z5 = true;
            z6 = true;
            function12 = function13;
            tc3Var2 = r2;
        } else {
            tc3Var2 = tc3Var;
            r3.W();
            z4 = z;
            z5 = z2;
            z6 = z3;
            function12 = function1;
        }
        eqf u = r3.u();
        if (u != null) {
            u.d = new vy6(epiVar, xtcVar, z4, z5, z6, function12, tc3Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(int i, String str, xtc xtcVar, long j, fo foVar, boolean z, of3 of3Var, int i2, int i3) {
        fo foVar2;
        int i4;
        fo foVar3;
        xtc xtcVar2;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1875184549);
        int i5 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.g(str) ? 32 : 16) | 384 | (av8Var.f(j) ? a.o : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            foVar2 = foVar;
            i5 |= av8Var.g(foVar2) ? 16384 : 8192;
            i4 = i5 | (!av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                av8Var.W();
                foVar3 = foVar2;
                xtcVar2 = xtcVar;
            } else {
                fo foVar4 = i6 != 0 ? uxf.o : foVar2;
                u23 a2 = t23.a(ww9.d, !z ? foVar4 : uxf.p, av8Var, 0);
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
                td4.G(i, bkh.l(utcVar, !z ? 24.0f : 58.0f), false, 0L, av8Var, i4 & 14, 12);
                xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !z ? 8.0f : 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                String str2 = str == null ? "" : str;
                yf8 yf8Var = xth.a;
                udj.c(str2, f0, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, (i4 >> 3) & 896, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar2 = utcVar;
                foVar3 = foVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new x73(i, str, xtcVar2, j, foVar3, z, i2, i3);
                return;
            }
            return;
        }
        foVar2 = foVar;
        i4 = i5 | (!av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void j(o0 o0Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(912178020);
        int i2 = i | (av8Var.g(o0Var) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            long D = lz.D(o0Var.d, av8Var);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            kq9.b(s6a.N(o0Var.c, 6, av8Var), null, bkh.l(utcVar, 16.0f), o0Var.e ? D : r13.i, av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 2.0f));
            String a3 = o0Var.a.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            r9k r9kVar = o0Var.b;
            if (r9kVar == null) {
                av8Var.d0(1620889912);
                av8Var.s(false);
            } else {
                ljg.r(8.0f, 1620889913, av8Var, av8Var, utcVar);
                udj.c(r9kVar.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(o0Var, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x07a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(b2j b2jVar, boolean z, n1j n1jVar, String str, xtc xtcVar, of3 of3Var, int i) {
        n1j n1jVar2;
        b2j b2jVar2;
        float f;
        float f2;
        utc utcVar;
        utc utcVar2;
        float f3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f4;
        boolean z7;
        boolean z8;
        boolean z9;
        utc utcVar3;
        b2jVar.getClass();
        n1jVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-871123);
        int i2 = i | (av8Var.g(b2jVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.e(n1jVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc d = bkh.d(xtcVar, 1.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
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
            utc utcVar4 = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar4, 1.0f), 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4);
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            lv1 lv1Var = uxf.m;
            l8g a3 = k8g.a(ng0Var, lv1Var, av8Var, 54);
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
            int i3 = b2jVar.a;
            sui suiVar = b2jVar.e;
            av3 av3Var = b2jVar.f;
            td4.C(i3, bkh.l(utcVar4, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            goa goaVar = new goa(1.0f, true);
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
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
            String str2 = b2jVar.b;
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str2, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            l8g a5 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            switch (n1jVar.ordinal()) {
                case 0:
                    f = 4.0f;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-258293953);
                    av8Var.s(false);
                    Unit unit = Unit.a;
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                        av8Var.d0(1738807977);
                        Iterator<E> it = b2jVar2.g.iterator();
                        while (it.hasNext()) {
                            j((o0) it.next(), av8Var, 0);
                        }
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1738957893);
                        av8Var.s(false);
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                        av8Var.d0(465076216);
                        boolean i4 = av8Var.i(context) | ((i2 & 14) == 4 ? z9 : false) | ((i2 & 7168) == 2048 ? z9 : false);
                        Object O = av8Var.O();
                        if (i4 || O == nf3.a) {
                            O = new vsc(22, context, b2jVar2, str);
                            av8Var.n0(O);
                        }
                        utc utcVar5 = utcVar;
                        xtc f02 = l98.f0(utcVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                        utcVar3 = utcVar5;
                        av8 av8Var2 = av8Var;
                        td4.a((Function1) O, bkh.l(f02, 40.0f), null, av8Var2, 48, 4);
                        av8Var = av8Var2;
                        av8Var.s(false);
                    } else {
                        utcVar3 = utcVar;
                        ljg.r(f2, 465640478, av8Var, av8Var, utcVar3);
                        av8Var.s(false);
                    }
                    av8Var.s(z9);
                    if (z) {
                        av8Var.d0(993892234);
                        av8 av8Var3 = av8Var;
                        tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var3, l98.f0(utcVar3, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
                        av8Var = av8Var3;
                        av8Var.s(false);
                    } else {
                        av8Var.d0(993973919);
                        av8Var.s(false);
                    }
                    av8Var.s(z9);
                    break;
                case 1:
                    f = 4.0f;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    av8Var.d0(-258158080);
                    String str3 = b2jVar2.c;
                    if (str3 == null) {
                        av8Var.d0(-258174666);
                        av8Var.s(false);
                        utcVar2 = utcVar4;
                        f3 = 8.0f;
                        z2 = false;
                    } else {
                        av8Var.d0(-258174665);
                        utcVar2 = utcVar4;
                        f3 = 8.0f;
                        udj.c(str3, l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                        av8Var = av8Var;
                        Unit unit2 = Unit.a;
                        z2 = false;
                        av8Var.s(false);
                    }
                    String str4 = b2jVar2.d;
                    if (str4 == null) {
                        av8Var.d0(-257764970);
                        av8Var.s(z2);
                        utcVar = utcVar2;
                    } else {
                        av8Var.d0(-257764969);
                        utc utcVar6 = utcVar2;
                        utcVar = utcVar6;
                        av8 av8Var4 = av8Var;
                        udj.c(str4, l98.f0(utcVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var4, 48, 0, 131064);
                        av8Var = av8Var4;
                        Unit unit3 = Unit.a;
                        av8Var.s(false);
                    }
                    if (av3Var != null) {
                        av8Var.d0(-257288778);
                        av8 av8Var5 = av8Var;
                        td4.k(av3Var.a, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var5, 3120, 4);
                        av8Var = av8Var5;
                        String str5 = av3Var.b;
                        if (str5 == null) {
                            av8Var.d0(-256929458);
                            z3 = false;
                            av8Var.s(false);
                        } else {
                            ljg.r(4.0f, -256929457, av8Var, av8Var, utcVar);
                            udj.c(str5, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                            av8Var = av8Var;
                            Unit unit4 = Unit.a;
                            z3 = false;
                            av8Var.s(false);
                        }
                        av8Var.s(z3);
                    } else if (suiVar != null) {
                        av8Var.d0(-256417523);
                        td4.G(suiVar.a, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 432, 8);
                        nq8.h(av8Var, bkh.p(utcVar, 4.0f));
                        av8 av8Var6 = av8Var;
                        udj.c(suiVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var6, 0, 24960, 110586);
                        av8Var = av8Var6;
                        z3 = false;
                        av8Var.s(false);
                    } else {
                        z3 = false;
                        av8Var.d0(-255599743);
                        av8Var.s(false);
                    }
                    av8Var.s(z3);
                    Unit unit5 = Unit.a;
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 2:
                    f = 4.0f;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-255503178);
                    r9k r9kVar = b2jVar2.h;
                    if (r9kVar == null) {
                        av8Var.d0(-255469265);
                        av8Var.s(false);
                        z4 = false;
                    } else {
                        av8Var.d0(-255469264);
                        udj.c(r9kVar.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                        Unit unit6 = Unit.a;
                        z4 = false;
                        av8Var.s(false);
                    }
                    String str6 = b2jVar2.i;
                    if (str6 == null) {
                        av8Var.d0(-255054237);
                        av8Var.s(z4);
                        z5 = z4;
                    } else {
                        av8Var.d0(-255054236);
                        av8 av8Var7 = av8Var;
                        udj.c(str6, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var7, 0, 0, 131066);
                        av8Var = av8Var7;
                        Unit unit7 = Unit.a;
                        z5 = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z5);
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 3:
                    f = 4.0f;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-254646524);
                    String str7 = b2jVar2.j;
                    if (str7 == null) {
                        av8Var.d0(-254646525);
                        av8Var.s(false);
                        z6 = false;
                    } else {
                        av8Var.d0(-254646524);
                        udj.c(str7, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        Unit unit8 = Unit.a;
                        z6 = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z6);
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 4:
                    f = 4.0f;
                    boolean z10 = false;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-254228892);
                    String str8 = b2jVar2.k;
                    if (str8 == null) {
                        av8Var.d0(-254228893);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-254228892);
                        udj.c(str8, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        Unit unit9 = Unit.a;
                        z10 = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z10);
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 5:
                    f = 4.0f;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-253853048);
                    r9k r9kVar2 = b2jVar2.l;
                    if (r9kVar2 == null) {
                        av8Var.d0(-253812904);
                        av8Var.s(false);
                        z7 = false;
                        f4 = 8.0f;
                    } else {
                        av8Var.d0(-253812903);
                        f4 = 8.0f;
                        udj.c(r9kVar2.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        Unit unit10 = Unit.a;
                        z7 = false;
                        av8Var.s(false);
                    }
                    nq8.h(av8Var, bkh.p(utcVar, f4));
                    r9k r9kVar3 = b2jVar2.m;
                    if (r9kVar3 == null) {
                        av8Var.d0(-253401224);
                        av8Var.s(z7);
                        z8 = z7;
                    } else {
                        av8Var.d0(-253401223);
                        av8 av8Var8 = av8Var;
                        udj.c(r9kVar3.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var8, 0, 0, 131066);
                        av8Var = av8Var8;
                        Unit unit11 = Unit.a;
                        z8 = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z8);
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 6:
                    f = 4.0f;
                    boolean z11 = false;
                    f2 = 16.0f;
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-252956807);
                    String str9 = b2jVar2.o;
                    if (str9 == null) {
                        av8Var.d0(-252956808);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-252956807);
                        Integer num = b2jVar2.n;
                        td4.G(num != null ? num.intValue() : -1, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
                        nq8.h(av8Var, bkh.p(utcVar, 4.0f));
                        udj.c(str9, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        Unit unit12 = Unit.a;
                        z11 = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z11);
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 7:
                    b2jVar2 = b2jVar;
                    utcVar = utcVar4;
                    av8Var.d0(-252236863);
                    f2 = 16.0f;
                    kq9.b(s6a.N(R.drawable.ic_national_appearances, 6, av8Var), null, bkh.m(utcVar, 16.0f, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                    nq8.h(av8Var, bkh.p(utcVar, 4.0f));
                    f = 4.0f;
                    udj.c(b2jVar2.p, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                    kq9.b(s6a.N(R.drawable.ic_national_goals, 6, av8Var), null, bkh.m(utcVar, 16.0f, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                    nq8.h(av8Var, bkh.p(utcVar, 4.0f));
                    udj.c(b2jVar2.q, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(false);
                    Unit unit13 = Unit.a;
                    z9 = true;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                case 8:
                    av8Var.d0(-250700348);
                    b2jVar2 = b2jVar;
                    String str10 = b2jVar2.r;
                    if (str10 == null) {
                        av8Var.d0(-250700349);
                        av8Var.s(false);
                        utcVar = utcVar4;
                    } else {
                        av8Var.d0(-250700348);
                        utcVar = utcVar4;
                        udj.c(str10, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        Unit unit14 = Unit.a;
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                    z9 = true;
                    f = 4.0f;
                    f2 = 16.0f;
                    av8Var.s(z9);
                    n1jVar2 = n1jVar;
                    if (n1jVar2 == n1j.d) {
                    }
                    av8Var.s(z9);
                    if (b2jVar2.s) {
                    }
                    av8Var.s(z9);
                    if (z) {
                    }
                    av8Var.s(z9);
                    break;
                default:
                    throw dmi.h(av8Var, -2086536362, false);
            }
        } else {
            n1jVar2 = n1jVar;
            b2jVar2 = b2jVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(b2jVar2, z, n1jVar2, str, xtcVar, i, 15);
        }
    }

    public static final void l(int i, long j, of3 of3Var, xtc xtcVar, String str) {
        xtc xtcVar2;
        long j2;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(809432503);
        int i2 = (av8Var.g(str) ? 4 : 2) | i | 176;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                j = lz.D(R.color.error, av8Var);
                xtcVar = utc.a;
            } else {
                av8Var.W();
            }
            long j3 = j;
            xtc xtcVar3 = xtcVar;
            av8Var.t();
            m(new q80(str), xtcVar3, j3, av8Var, 48);
            xtcVar2 = xtcVar3;
            j2 = j3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            j2 = j;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l67(str, xtcVar2, j2, i);
        }
    }

    public static final void m(q80 q80Var, xtc xtcVar, long j, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(662330743);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(q80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            kg0 kg0Var = ww9.f;
            lv1 lv1Var = uxf.m;
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), j, oyn.e), 8.0f, 2.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
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
            utc utcVar = utc.a;
            kq9.a(haa.t(R.drawable.ic_warning, 0, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 440, 0);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            yf8 yf8Var = xth.a;
            udj.d(q80Var, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 2, false, 0, 0, null, null, xth.g(), av8Var, i2 & 14, 384, 258042);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bo7(q80Var, xtcVar, j, i, 2);
        }
    }

    public static final void n(String str, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1762463812);
        int i2 = (av8Var2.g(str) ? 4 : 2) | i;
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            xtc C = u6h.C(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            String str2 = str == null ? "" : str;
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str2, C, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.k(), av8Var, 48, 24576, 114684);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tk1(str, i, 15);
        }
    }

    public static final void o(tee teeVar, old oldVar, boolean z, wla wlaVar, xtc xtcVar, Function1 function1, of3 of3Var, int i) {
        Context context;
        boolean z2;
        int i2;
        boolean z3;
        teeVar.getClass();
        wlaVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1840456595);
        int i3 = i | (av8Var.g(teeVar) ? 4 : 2) | (av8Var.g(oldVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(wlaVar) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192) | (av8Var.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = ke0.c;
            boolean e = av8Var.e(i4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (e || O == a99Var) {
                O = Boolean.valueOf(zu3.v0.getMccList().contains(Integer.valueOf(ke0.c)) || zu3.k.getMccList().contains(Integer.valueOf(ke0.c)));
                av8Var.n0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            Context context2 = (Context) av8Var.k(nz.b);
            int i5 = i3 >> 12;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (booleanValue || oldVar != null) {
                av8Var.d0(1717822968);
                context = context2;
                x2a.c(teeVar, function1, wlaVar, null, av8Var, (i3 & 14) | (i5 & 112) | ((i3 >> 3) & 896));
                av8Var.s(false);
            } else {
                av8Var.d0(1718037209);
                d(teeVar, function1, null, av8Var, (i3 & 14) | (i5 & 112));
                av8Var.s(false);
                context = context2;
            }
            if (oldVar != null) {
                av8Var.d0(1718305979);
                utc utcVar = utc.a;
                if (z) {
                    av8Var.d0(1718336483);
                    xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    boolean i6 = av8Var.i(context) | ((i3 & 112) == 32);
                    Object O2 = av8Var.O();
                    if (i6 || O2 == a99Var) {
                        O2 = new fej(26, context, oldVar);
                        av8Var.n0(O2);
                    }
                    i2 = i4;
                    iu7.a(R.string.odds_cta_text_2, R.string.claim_your_bonus_button, (Function0) O2, d0, av8Var, 3072, 0);
                    z3 = false;
                    av8Var.s(false);
                } else {
                    i2 = i4;
                    z3 = false;
                    av8Var.d0(1719311371);
                    av8Var.s(false);
                }
                boolean z4 = z3;
                z2 = true;
                iu7.d(oea.v(R.string.odds_full_time, av8Var), oldVar, i2, vmd.FEATURED_TOURNAMENT, false, l98.c0(utcVar, 16.0f, 8.0f), false, null, "Full time", av8Var, 100887552 | (i3 & 112), PsExtractor.AUDIO_STREAM);
                av8Var = av8Var;
                ald h = rld.h(i2, true);
                if (h == null) {
                    av8Var.d0(1719809633);
                    av8Var.s(z4);
                } else {
                    av8Var.d0(1719809634);
                    qx9.a(h, l98.c0(utcVar, 16.0f, 8.0f), 0L, av8Var, 48, 4);
                    av8Var.s(z4);
                }
                av8Var.s(z4);
            } else {
                z2 = true;
                av8Var.d0(1720012715);
                av8Var.s(false);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x64(teeVar, oldVar, z, wlaVar, xtcVar, function1, i);
        }
    }

    public static final com.blaze.blazesdk.features.moments.models.ui.a p(BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        blazeMomentsPlaybackConfiguration.getClass();
        return new com.blaze.blazesdk.features.moments.models.ui.a(blazeMomentsPlaybackConfiguration.getLoopBehavior());
    }

    public static final f2a q(h2a h2aVar, float f, float f2, e2a e2aVar, String str, of3 of3Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return r(h2aVar, Float.valueOf(f), Float.valueOf(f2), lz.f, e2aVar, str, of3Var, (i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | 32768 | ((i << 3) & 458752), 0);
    }

    public static final f2a r(h2a h2aVar, Number number, Number number2, q4k q4kVar, e2a e2aVar, String str, of3 of3Var, int i, int i2) {
        h2a h2aVar2;
        Number number3;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            h2aVar2 = h2aVar;
            f2a f2aVar = new f2a(h2aVar2, number, number2, q4kVar, e2aVar);
            number3 = number2;
            av8Var.n0(f2aVar);
            O = f2aVar;
        } else {
            h2aVar2 = h2aVar;
            number3 = number2;
        }
        f2a f2aVar2 = (f2a) O;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && av8Var.i(number)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && av8Var.i(number3)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !av8Var.i(e2aVar)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object O2 = av8Var.O();
        if (z3 || O2 == a99Var) {
            m61 m61Var = new m61(number, f2aVar2, number3, e2aVar, 11);
            av8Var.n0(m61Var);
            O2 = m61Var;
        }
        hz8.t((Function0) O2, av8Var);
        boolean i3 = av8Var.i(h2aVar2);
        Object O3 = av8Var.O();
        if (i3 || O3 == a99Var) {
            O3 = new uf8(12, h2aVar2, f2aVar2);
            av8Var.n0(O3);
        }
        hz8.d(f2aVar2, (Function1) O3, av8Var);
        return f2aVar2;
    }

    public static String s(gc2 gc2Var, gc2[] gc2VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int h = gc2Var.h();
        int i5 = 0;
        while (i5 < h) {
            int i6 = (i5 + h) / 2;
            while (i6 > -1 && gc2Var.m(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (gc2Var.m(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte m = gc2VarArr[i10].m(i11);
                    byte[] bArr = wol.a;
                    int i13 = m & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    z = z2;
                    i3 = i13;
                }
                byte m2 = gc2Var.m(i7 + i12);
                byte[] bArr2 = wol.a;
                i4 = i3 - (m2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (gc2VarArr[i10].h() != i11) {
                    z2 = z;
                } else {
                    if (i10 == gc2VarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int h2 = gc2VarArr[i10].h() - i11;
                    int length = gc2VarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        h2 += gc2VarArr[i15].h();
                    }
                    if (h2 >= i14) {
                        if (h2 <= i14) {
                            return gc2Var.s(i7, i9 + i7).r(Charsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            h = i6;
        }
        return null;
    }

    public static final void t(Long l, long j, ij9 ij9Var) {
        ij9Var.getClass();
        if (l == null || l.longValue() < 0) {
            return;
        }
        ij9 ij9Var2 = ij9.b;
        if (Intrinsics.c(ij9Var, ij9.d) || l.longValue() == j) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l + " bytes, but received " + j + " bytes").toString());
    }

    public static void u(Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s("Cannot return null from a non-@Nullable component method");
    }

    public static void v(Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s("Cannot return null from a non-@Nullable @Provides method");
    }

    public static String w(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
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
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int x(oqb oqbVar, long j, boolean z) {
        oqbVar.getClass();
        return (!fc6.B(fc6.t(Instant.ofEpochSecond(j))) || z) ? oqbVar.d : oqbVar.c;
    }

    public static final DistinctEventSet y(CategoryWrapper categoryWrapper, String str) {
        Integer num;
        categoryWrapper.getClass();
        str.getClass();
        TimezoneEventsInfo timezoneDetail = categoryWrapper.getTimezoneDetail();
        if (timezoneDetail == null || (num = timezoneDetail.getTimezones().get(str)) == null) {
            return null;
        }
        return (DistinctEventSet) CollectionsKt.a0(num.intValue(), timezoneDetail.getEventSets());
    }

    public static final String z(oqb oqbVar, long j, boolean z) {
        oqbVar.getClass();
        return (!fc6.B(fc6.t(Instant.ofEpochSecond(j))) || z) ? oqbVar.b : oqbVar.a;
    }
}
