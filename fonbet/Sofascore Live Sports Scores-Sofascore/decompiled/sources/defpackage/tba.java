package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStateStyle;
import com.blaze.blazesdk.widgets.models.WidgetItemImageContainerBorderStateStyleRemoteDto;
import com.google.android.gms.common.util.IOUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class tba {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final float f = 72.0f;

    public static final String A(Context context, Team team) {
        String r;
        String str;
        String B;
        context.getClass();
        if (team == null) {
            return null;
        }
        if (!Boolean.valueOf(team.getNational()).equals(Boolean.TRUE) && !Intrinsics.c(team.getName(), "No team")) {
            FieldTranslations fieldTranslations = team.getFieldTranslations();
            if (fieldTranslations != null && (B = B(fieldTranslations)) != null) {
                return B;
            }
            FieldTranslations fieldTranslations2 = team.getFieldTranslations();
            r = fieldTranslations2 != null ? r(fieldTranslations2) : null;
            if (r != null) {
                return r;
            }
            String shortName = team.getShortName();
            return shortName == null ? team.getName() : shortName;
        }
        FieldTranslations fieldTranslations3 = team.getFieldTranslations();
        if (fieldTranslations3 == null || (str = B(fieldTranslations3)) == null) {
            FieldTranslations fieldTranslations4 = team.getFieldTranslations();
            r = fieldTranslations4 != null ? r(fieldTranslations4) : null;
            if (r == null) {
                str = team.getShortName();
                if (str == null) {
                    str = team.getName();
                }
            } else {
                str = r;
            }
        }
        return tv3.c(context, str);
    }

    public static final String B(FieldTranslations fieldTranslations) {
        Map<String, String> shortNameTranslation = fieldTranslations.getShortNameTranslation();
        if (shortNameTranslation != null) {
            return shortNameTranslation.get(dla.a());
        }
        return null;
    }

    public static final String C(Player player) {
        String B;
        player.getClass();
        FieldTranslations fieldTranslations = player.getFieldTranslations();
        return (fieldTranslations == null || (B = B(fieldTranslations)) == null) ? player.getShortName() : B;
    }

    public static final String D(SubTeam subTeam, Context context) {
        String str;
        context.getClass();
        if (subTeam == null) {
            return null;
        }
        FieldTranslations fieldTranslations = subTeam.getFieldTranslations();
        if (fieldTranslations == null || (str = B(fieldTranslations)) == null) {
            FieldTranslations fieldTranslations2 = subTeam.getFieldTranslations();
            String r = fieldTranslations2 != null ? r(fieldTranslations2) : null;
            if (r == null) {
                str = subTeam.getShortName();
                if (str == null) {
                    str = subTeam.getName();
                }
            } else {
                str = r;
            }
        }
        return tv3.c(context, str);
    }

    public static int[] E(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final ilj F(a3 a3Var, g6b g6bVar) {
        if (g6bVar.b().compareTo(e6b.a) <= 0) {
            i3c.k("Cannot configure ", a3Var, " to disposeComposition at Lifecycle ON_DESTROY: ", g6bVar, "is already destroyed");
            return null;
        }
        ga gaVar = new ga(a3Var, 7);
        g6bVar.a(gaVar);
        return new ilj(9, g6bVar, gaVar);
    }

    public static final boolean G(x52 x52Var) {
        x52Var.getClass();
        try {
            lof lofVar = new lof(new rce(x52Var));
            for (long j = 0; j < 16; j++) {
                if (lofVar.w()) {
                    return true;
                }
                lofVar.o(1L);
                x52 x52Var2 = lofVar.b;
                byte t = x52Var2.t(0L);
                if ((t & 224) == 192) {
                    lofVar.o(2L);
                } else if ((t & 240) == 224) {
                    lofVar.o(3L);
                } else if ((t & 248) == 240) {
                    lofVar.o(4L);
                }
                int H0 = x52Var2.H0();
                if (Character.isISOControl(H0) && !Character.isWhitespace(H0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static void H(lli lliVar, int i, wn3 wn3Var) {
        long eventTime = lliVar.getEventTime(i);
        List cues = lliVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == lliVar.getEventTimeCount() - 1) {
            zzl.s();
            return;
        }
        long eventTime2 = lliVar.getEventTime(i + 1) - lliVar.getEventTime(i);
        if (eventTime2 > 0) {
            wn3Var.accept(new q74(cues, eventTime, eventTime2));
        }
    }

    public static final void I(mlh mlhVar, qf0 qf0Var, int i) {
        while (true) {
            int i2 = mlhVar.v;
            if (i > i2 && i < mlhVar.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            mlhVar.N();
            if (mlhVar.x(mlhVar.v)) {
                qf0Var.A();
            }
            mlhVar.i();
        }
    }

    public static String J(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String K(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] E = E(str2);
        if (E[0] != -1) {
            sb.append(str2);
            J(sb, E[1], E[2]);
            return sb.toString();
        }
        int[] E2 = E(str);
        if (E[3] == 0) {
            sb.append((CharSequence) str, 0, E2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (E[2] == 0) {
            sb.append((CharSequence) str, 0, E2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = E[1];
        if (i != 0) {
            int i2 = E2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return J(sb, E[1] + i2, i2 + E[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, E2[1]);
            sb.append(str2);
            int i3 = E2[1];
            return J(sb, i3, E[2] + i3);
        }
        int i4 = E2[0] + 2;
        int i5 = E2[1];
        if (i4 >= i5 || i5 != E2[2]) {
            int lastIndexOf = str.lastIndexOf(47, E2[2] - 1);
            int i6 = lastIndexOf == -1 ? E2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return J(sb, E2[1], i6 + E[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = E2[1];
        return J(sb, i7, E[2] + i7 + 1);
    }

    public static Uri L(String str, String str2) {
        return Uri.parse(K(str, str2));
    }

    public static final v9e M(Integer num, Integer num2, Integer num3, bj0 bj0Var, String str, boolean z) {
        int i;
        int intValue = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            i = num2.intValue();
            if (z) {
                i++;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        int intValue2 = num3 != null ? num3.intValue() : 0;
        int min = Math.min(i, intValue2);
        if (intValue >= min) {
            return N(z, bj0Var, str, intValue, i);
        }
        v9e N = N(z, bj0Var, str, intValue, intValue);
        while (intValue < min) {
            km5 km5Var = km5.a;
            intValue++;
            N = new v9e(km5Var, b.j(N(z, bj0Var, str, intValue, intValue), nq8.v(b.j(new v9e(a.c(new zhe(" ")), km5Var), N))));
        }
        return intValue2 > i ? nq8.v(b.j(new v9e(a.c(new zhe(c.q(intValue2 - i, " "))), km5.a), N)) : intValue2 == i ? N : new v9e(km5.a, b.j(N(z, bj0Var, str, intValue2 + 1, i), N));
    }

    public static final v9e N(boolean z, bj0 bj0Var, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            a70.r("Check failed.");
            return null;
        }
        xbb b2 = a.b();
        if (z) {
            b2.add(new zhe("-"));
        }
        b2.add(new ajd(a.c(new xck(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), bj0Var, str, z))));
        return new v9e(a.a(b2), km5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void O(lli lliVar, yli yliVar, wn3 wn3Var) {
        int nextEventTimeIndex;
        boolean z;
        int i;
        long j = yliVar.b;
        if (j == C.TIME_UNSET) {
            nextEventTimeIndex = 0;
        } else {
            nextEventTimeIndex = lliVar.getNextEventTimeIndex(j);
            if (nextEventTimeIndex == -1) {
                nextEventTimeIndex = lliVar.getEventTimeCount();
            }
            if (nextEventTimeIndex > 0 && lliVar.getEventTime(nextEventTimeIndex - 1) == j) {
                nextEventTimeIndex--;
            }
        }
        if (j != C.TIME_UNSET && nextEventTimeIndex < lliVar.getEventTimeCount()) {
            List cues = lliVar.getCues(j);
            long eventTime = lliVar.getEventTime(nextEventTimeIndex);
            if (!cues.isEmpty()) {
                long j2 = yliVar.b;
                if (j2 < eventTime) {
                    wn3Var.accept(new q74(cues, j2, eventTime - j2));
                    z = true;
                    for (i = nextEventTimeIndex; i < lliVar.getEventTimeCount(); i++) {
                        H(lliVar, i, wn3Var);
                    }
                    if (yliVar.a) {
                        return;
                    }
                    if (z) {
                        nextEventTimeIndex--;
                    }
                    for (int i2 = 0; i2 < nextEventTimeIndex; i2++) {
                        H(lliVar, i2, wn3Var);
                    }
                    if (z) {
                        wn3Var.accept(new q74(lliVar.getCues(j), lliVar.getEventTime(nextEventTimeIndex), j - lliVar.getEventTime(nextEventTimeIndex)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < lliVar.getEventTimeCount()) {
        }
        if (yliVar.a) {
        }
    }

    public static final ExtractedText P(wcj wcjVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wcjVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = wcjVar.b;
        extractedText.selectionStart = pej.g(j);
        extractedText.selectionEnd = pej.f(j);
        extractedText.flags = !StringsKt.K(wcjVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static int Q(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static File R(File file, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(T(file, str), str2);
    }

    public static boolean S(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static File T(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        U(file2, false);
        return file2;
    }

    public static void U(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean V(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && V(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static final void a(oll ollVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        f50 f50Var3;
        int i3;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1201598439);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.i(ollVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
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
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            Bitmap bitmap = ollVar != null ? ollVar.b : null;
            if (bitmap != null) {
                av8Var.d0(-920879810);
                boolean g = av8Var.g(bitmap);
                Object O = av8Var.O();
                if (g || O == nf3.a) {
                    O = new cx1(new a10(bitmap));
                    av8Var.n0(O);
                }
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
                i3 = 6;
                ff3Var = ff3Var2;
                wkn.k((cx1) O, null, wnn.A(bkh.l(utcVar, 40.0f), o7g.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
                i3 = 6;
                av8Var.d0(-920554248);
                wkn.l(s6a.N(R.drawable.player_photo_placeholder, 6, av8Var), bkh.l(utcVar, 40.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 432, 120);
                av8Var = av8Var;
                av8Var.s(false);
            }
            jfj jfjVar = ollVar != null ? ollVar.c : null;
            if (jfjVar == null) {
                av8Var.d0(-920249674);
                av8Var.s(false);
                xtcVar = utcVar;
                z = true;
            } else {
                av8Var.d0(-920249673);
                mv1 mv1Var = uxf.k;
                n12 n12Var = n12.a;
                xtc a2 = n12Var.a(utcVar, mv1Var);
                Integer num = jfjVar.b;
                xtc q = n9e.q(a2, lz.D(num != null ? num.intValue() : R.color.rating_00, av8Var), oyn.e);
                k1c c3 = e12.c(uxf.g, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, q);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c3, f50Var2);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                kq9.b(s6a.N(R.drawable.ic_sofascore_logomark_one_top_start, i3, av8Var), null, bkh.e(bkh.p(n12Var.a(utcVar, pd0.a), 16.0f), 8.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                kq9.b(s6a.N(R.drawable.ic_sofascore_logomark_one_bottom_end, i3, av8Var), null, bkh.e(bkh.p(n12Var.a(utcVar, pd0.c), 16.0f), 8.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                String str = jfjVar.a;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                xtc b0 = l98.b0(utcVar, 2.0f);
                long D = lz.D(R.color.on_color_primary, av8Var);
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                xtcVar = utcVar;
                z = true;
                udj.c(str2, b0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 48, 0, 131064);
                av8Var = av8Var2;
                av8Var.s(true);
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(ollVar, xtcVar2, i, 24);
        }
    }

    public static final void b(Function0 function0, xtc xtcVar, era eraVar, vqa vqaVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1055276397);
        int i2 = (av8Var.i(function0) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.g(eraVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(vqaVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            pea.f(yqo.H(-933153643, av8Var, new er6(eraVar, xtcVar, vqaVar, e.g(function0, av8Var), 7)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(function0, xtcVar, eraVar, vqaVar, i);
        }
    }

    public static final void c(Function1 function1, of3 of3Var, int i) {
        int i2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(413607770);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(rrc.a);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
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
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new s91(function1, e1dVar, 8);
                av8Var.n0(O2);
            }
            qha.g(R.drawable.ic_graph_percent, (Function0) O2, null, null, ((rrc) e1dVar.getValue()) == rrc.a, false, false, av8Var, 0, 108);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            boolean z2 = i3 == 4;
            Object O3 = av8Var.O();
            if (z2 || O3 == a99Var) {
                O3 = new s91(function1, e1dVar, 9);
                av8Var.n0(O3);
            }
            qha.g(R.drawable.ic_xy, (Function0) O3, null, null, ((rrc) e1dVar.getValue()) == rrc.b, false, false, av8Var, 0, 108);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new erc(i, 0, function1);
        }
    }

    public static final void d(a6c a6cVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-651045713);
        int i2 = (av8Var.g(a6cVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            un0.a(kda.O(bkh.d(utcVar, 1.0f), "rss_news_card", av8Var), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(195943841, av8Var, new yya(20, function1, a6cVar)), av8Var, 196608, 16);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i, 22, a6cVar, xtcVar2, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(int i, int i2, of3 of3Var, xtc xtcVar, String str, String str2) {
        String str3;
        int i3;
        String str4;
        xtc xtcVar2;
        av8 av8Var;
        xtc xtcVar3;
        eqf u;
        str.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(59063422);
        if ((i & 6) == 0) {
            str3 = str;
            i3 = (av8Var2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i3 |= av8Var2.g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i4 != 0 ? utcVar : xtcVar2;
                xtc b0 = l98.b0(xtcVar4, 16.0f);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
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
                waa.K(av8Var2, a2, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                yf8 yf8Var = xth.a;
                xtc xtcVar5 = xtcVar4;
                String str5 = str3;
                udj.c(str5, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 0, 0, null, xth.j(), av8Var2, (i3 & 14) | 48, 384, 125944);
                nq8.h(av8Var2, bkh.e(utcVar, 4.0f));
                String str6 = str4;
                udj.c(str6, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 0, 0, null, xth.b(), av8Var2, ((i3 >> 3) & 14) | 48, 384, 125944);
                av8Var = av8Var2;
                av8Var.s(true);
                xtcVar3 = xtcVar5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r22(str, str2, xtcVar3, i, i2, 12);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void f(oll ollVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(606363517);
        int i2 = (av8Var.i(ollVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc b0 = l98.b0(n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.on_color_highlight_2, av8Var), oyn.e), 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            String v = oea.v(R.string.player_best, av8Var);
            long D = lz.D(R.color.on_color_secondary, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.c(), av8Var, 0, 24576, 114682);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utc.a, 8.0f));
            a(ollVar, null, av8Var, i2 & 14);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(ollVar, xtcVar, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(WidgetItemImageContainerBorderStateStyleRemoteDto widgetItemImageContainerBorderStateStyleRemoteDto, BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle) {
        int color;
        blazeWidgetItemImageContainerBorderStateStyle.getClass();
        Boolean isVisible = widgetItemImageContainerBorderStateStyleRemoteDto.isVisible();
        blazeWidgetItemImageContainerBorderStateStyle.setVisible(isVisible != null ? isVisible.booleanValue() : blazeWidgetItemImageContainerBorderStateStyle.isVisible());
        String color2 = widgetItemImageContainerBorderStateStyleRemoteDto.getColor();
        if (color2 != null) {
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            Integer b2 = application$blazesdk_release != null ? cnb.b(application$blazesdk_release, color2) : null;
            if (b2 != null) {
                color = b2.intValue();
                blazeWidgetItemImageContainerBorderStateStyle.setColor(color);
                Integer insets = widgetItemImageContainerBorderStateStyleRemoteDto.getInsets();
                blazeWidgetItemImageContainerBorderStateStyle.setMargin(insets == null ? new BlazeDp(insets.intValue()) : blazeWidgetItemImageContainerBorderStateStyle.getMargin());
                Integer width = widgetItemImageContainerBorderStateStyleRemoteDto.getWidth();
                blazeWidgetItemImageContainerBorderStateStyle.setWidth(width == null ? new BlazeDp(width.intValue()) : blazeWidgetItemImageContainerBorderStateStyle.getWidth());
            }
        }
        color = blazeWidgetItemImageContainerBorderStateStyle.getColor();
        blazeWidgetItemImageContainerBorderStateStyle.setColor(color);
        Integer insets2 = widgetItemImageContainerBorderStateStyleRemoteDto.getInsets();
        blazeWidgetItemImageContainerBorderStateStyle.setMargin(insets2 == null ? new BlazeDp(insets2.intValue()) : blazeWidgetItemImageContainerBorderStateStyle.getMargin());
        Integer width2 = widgetItemImageContainerBorderStateStyleRemoteDto.getWidth();
        blazeWidgetItemImageContainerBorderStateStyle.setWidth(width2 == null ? new BlazeDp(width2.intValue()) : blazeWidgetItemImageContainerBorderStateStyle.getWidth());
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static void i(View view, m35 m35Var, long j, int i) {
        if ((i & 2) != 0) {
            j = 300;
        }
        view.getClass();
        view.postDelayed(new jd(m35Var, j, view, 3), 0L);
    }

    public static void j(final View view, final n35 n35Var, long j, int i) {
        if ((i & 2) != 0) {
            j = 300;
        }
        final long j2 = j;
        final int i2 = (i & 8) == 0 ? 4 : 8;
        view.getClass();
        view.postDelayed(new Runnable() { // from class: blh
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                if (view2.getVisibility() == 0) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, n35Var.a);
                    translateAnimation.setDuration(j2);
                    translateAnimation.setFillAfter(false);
                    view2.startAnimation(translateAnimation);
                    view2.setVisibility(i2);
                }
            }
        }, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0302, code lost:
    
        if (r4.intValue() != 1) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xbb k(Context context, YearMonth yearMonth, int i, List list, int i2, String str) {
        DayOfWeek dayOfWeek;
        LinkedHashMap linkedHashMap;
        int i3;
        svi sviVar;
        svi sviVar2;
        boolean z;
        ZoneId systemDefault = ZoneId.systemDefault();
        switch (i) {
            case 1:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 7:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            default:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
        }
        ?? r4 = 1;
        DayOfWeek dayOfWeek2 = yearMonth.atDay(1).getDayOfWeek();
        int lengthOfMonth = yearMonth.lengthOfMonth();
        LocalDate now = LocalDate.now(systemDefault);
        Integer valueOf = Integer.valueOf(now.getDayOfMonth());
        if (!Intrinsics.c(YearMonth.from(now), yearMonth)) {
            valueOf = null;
        }
        int value = ((dayOfWeek2.getValue() - dayOfWeek.getValue()) + 7) % 7;
        int i4 = value + lengthOfMonth;
        int i5 = (7 - (i4 % 7)) % 7;
        int i6 = 10;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            arrayList.add(new Pair(event, Instant.ofEpochSecond(event.getStartTimestamp()).atZone(systemDefault).toLocalDate()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.c(YearMonth.from((LocalDate) ((Pair) next).b), yearMonth)) {
                arrayList2.add(next);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) it3.next();
            Integer valueOf2 = Integer.valueOf(((LocalDate) pair.b).getDayOfMonth());
            Object obj = linkedHashMap2.get(valueOf2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(valueOf2, obj);
            }
            ((List) obj).add((Event) pair.a);
        }
        xbb xbbVar = new xbb(i4 + i5);
        int i7 = 0;
        while (true) {
            rvi rviVar = rvi.a;
            if (i7 >= value) {
                int i8 = 0;
                while (i8 < lengthOfMonth) {
                    int i9 = i8 + 1;
                    boolean z2 = (valueOf != null && i9 == valueOf.intValue()) ? r4 : false;
                    List<Event> list2 = (List) linkedHashMap2.get(Integer.valueOf(i9));
                    if (list2 == null || list2.isEmpty()) {
                        linkedHashMap = linkedHashMap2;
                        i3 = r4;
                        xbbVar.add(new qvi(i9, z2));
                    } else if (list2.size() > r4) {
                        Event event2 = (Event) CollectionsKt.Y(list2);
                        ArrayList arrayList3 = new ArrayList(k13.r(list2, i6));
                        for (Event event3 : list2) {
                            TeamSides teamSides = TeamSides.ORIGINAL;
                            arrayList3.add(Integer.valueOf((event3.getHomeTeam(teamSides).getId() == i2 ? event3.getAwayTeam(teamSides) : event3.getHomeTeam(teamSides)).getId()));
                        }
                        List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList3));
                        ArrayList arrayList4 = new ArrayList(k13.r(list2, i6));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(Integer.valueOf(((Event) it4.next()).getId()));
                        }
                        gv9 W = l6g.W(arrayList4);
                        boolean z3 = event2.getHomeTeam(TeamSides.ORIGINAL).getId() == i2;
                        if (!list2.isEmpty()) {
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                if (ok3.D((Event) it5.next())) {
                                    z = true;
                                    gv9 W2 = l6g.W(S0.size() <= 2 ? CollectionsKt.L0(S0, 2) : CollectionsKt.L0(arrayList3, 2));
                                    UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                                    xbbVar.add(new uvi(i9, W, z3, z, W2, uniqueTournament == null ? uniqueTournament.getId() : 0, list2.size(), ok3.s(event2), z2));
                                    linkedHashMap = linkedHashMap2;
                                    i3 = 1;
                                }
                            }
                        }
                        z = false;
                        gv9 W22 = l6g.W(S0.size() <= 2 ? CollectionsKt.L0(S0, 2) : CollectionsKt.L0(arrayList3, 2));
                        UniqueTournament uniqueTournament2 = event2.getTournament().getUniqueTournament();
                        xbbVar.add(new uvi(i9, W, z3, z, W22, uniqueTournament2 == null ? uniqueTournament2.getId() : 0, list2.size(), ok3.s(event2), z2));
                        linkedHashMap = linkedHashMap2;
                        i3 = 1;
                    } else {
                        Event event4 = (Event) CollectionsKt.Y(list2);
                        TeamSides teamSides2 = TeamSides.ORIGINAL;
                        boolean z4 = event4.getHomeTeam(teamSides2).getId() == i2;
                        Team awayTeam = z4 ? event4.getAwayTeam(teamSides2) : event4.getHomeTeam(teamSides2);
                        Integer winnerCode = event4.getWinnerCode(teamSides2);
                        TeamSides teamSides3 = TeamSides.REVERSIBLE;
                        Integer display = event4.getHomeScore(teamSides3).getDisplay();
                        Integer display2 = event4.getAwayScore(teamSides3).getDisplay();
                        boolean z5 = (display == null || display2 == null) ? false : true;
                        int id = event4.getId();
                        linkedHashMap = linkedHashMap2;
                        boolean c2 = Intrinsics.c(str, Sports.BASKETBALL);
                        int id2 = awayTeam.getId();
                        UniqueTournament uniqueTournament3 = event4.getTournament().getUniqueTournament();
                        int id3 = uniqueTournament3 != null ? uniqueTournament3.getId() : 0;
                        String str2 = "-";
                        String m = z5 ? hkg.c0(context) ? ljg.m(display2, display, "-") : ljg.m(display, display2, "-") : null;
                        if (ok3.E(event4)) {
                            long startTimestamp = event4.getStartTimestamp();
                            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                            bestPattern.getClass();
                            str2 = fc6.i(startTimestamp, hk4.a(bestPattern));
                        }
                        String str3 = str2;
                        if (ok3.D(event4)) {
                            sviVar2 = svi.a;
                        } else if ((z4 && winnerCode != null && winnerCode.intValue() == 1) || !(z4 || winnerCode == null || winnerCode.intValue() != 2)) {
                            sviVar2 = svi.b;
                        } else if (winnerCode != null && winnerCode.intValue() == 3) {
                            sviVar2 = svi.c;
                        } else {
                            if (winnerCode == null) {
                                i3 = 1;
                            } else {
                                i3 = 1;
                            }
                            if (winnerCode == null || winnerCode.intValue() != 2) {
                                sviVar = null;
                                xbbVar.add(new tvi(i9, id, z4, id2, id3, m, str3, sviVar, c2, z2));
                            }
                            sviVar = svi.d;
                            xbbVar.add(new tvi(i9, id, z4, id2, id3, m, str3, sviVar, c2, z2));
                        }
                        sviVar = sviVar2;
                        i3 = 1;
                        xbbVar.add(new tvi(i9, id, z4, id2, id3, m, str3, sviVar, c2, z2));
                    }
                    r4 = i3;
                    i8 = i9;
                    linkedHashMap2 = linkedHashMap;
                    i6 = 10;
                }
                for (int i10 = 0; i10 < i5; i10++) {
                    xbbVar.add(rviVar);
                }
                return a.a(xbbVar);
            }
            xbbVar.add(rviVar);
            i7++;
        }
    }

    public static ArrayList l(int i) {
        DayOfWeek dayOfWeek;
        switch (i) {
            case 1:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 7:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            default:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
        }
        Locale d2 = dla.d();
        ArrayList arrayList = new ArrayList(7);
        for (int i2 = 0; i2 < 7; i2++) {
            arrayList.add(dayOfWeek.plus(i2).getDisplayName(TextStyle.SHORT, d2));
        }
        return arrayList;
    }

    public static final int m(float f2, float f3, float f4, int i) {
        float abs = Math.abs(f3 - f4);
        if (abs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return wzb.b(i * (Math.abs(f3 - f2) / abs));
    }

    public static final String n(float f2) {
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f2 / 60.0f)), Integer.valueOf((int) (f2 % 60.0f))}, 2));
    }

    public static final TennisTeamSeasonStatistics o(c73 c73Var) {
        d73 d73Var = c73Var.c;
        TeamSeasonStatistics teamSeasonStatistics = d73Var != null ? d73Var.g : null;
        if (teamSeasonStatistics instanceof TennisTeamSeasonStatistics) {
            return (TennisTeamSeasonStatistics) teamSeasonStatistics;
        }
        return null;
    }

    public static final String p(Context context, Team team) {
        String name;
        String r;
        context.getClass();
        if (team == null) {
            return "";
        }
        if (!Boolean.valueOf(team.getNational()).equals(Boolean.TRUE) && !Intrinsics.c(team.getName(), "No team")) {
            FieldTranslations fieldTranslations = team.getFieldTranslations();
            return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? team.getName() : r;
        }
        FieldTranslations fieldTranslations2 = team.getFieldTranslations();
        if (fieldTranslations2 == null || (name = r(fieldTranslations2)) == null) {
            name = team.getName();
        }
        return tv3.c(context, name);
    }

    public static final String q(Category category, Context context) {
        String r;
        category.getClass();
        context.getClass();
        FieldTranslations fieldTranslations = category.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? tv3.c(context, category.getName()) : r;
    }

    public static final String r(FieldTranslations fieldTranslations) {
        Map<String, String> nameTranslation = fieldTranslations.getNameTranslation();
        if (nameTranslation != null) {
            return nameTranslation.get(dla.a());
        }
        return null;
    }

    public static final String s(Manager manager) {
        String r;
        manager.getClass();
        FieldTranslations fieldTranslations = manager.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? manager.getName() : r;
    }

    public static final String t(Player player) {
        String r;
        player.getClass();
        FieldTranslations fieldTranslations = player.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? player.getName() : r;
    }

    public static final String u(Referee referee) {
        String r;
        FieldTranslations fieldTranslations = referee.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? referee.getName() : r;
    }

    public static final String v(SubTeam subTeam, Context context) {
        String name;
        FieldTranslations fieldTranslations;
        context.getClass();
        if (subTeam == null || (fieldTranslations = subTeam.getFieldTranslations()) == null || (name = r(fieldTranslations)) == null) {
            name = subTeam != null ? subTeam.getName() : null;
            if (name == null) {
                return "";
            }
        }
        return tv3.c(context, name);
    }

    public static final String w(Tournament tournament) {
        String r;
        tournament.getClass();
        FieldTranslations fieldTranslations = tournament.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? tournament.getName() : r;
    }

    public static final String x(UniqueTournament uniqueTournament) {
        String r;
        uniqueTournament.getClass();
        FieldTranslations fieldTranslations = uniqueTournament.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? uniqueTournament.getName() : r;
    }

    public static final String y(UniqueTournamentDetails uniqueTournamentDetails) {
        String r;
        uniqueTournamentDetails.getClass();
        FieldTranslations fieldTranslations = uniqueTournamentDetails.getFieldTranslations();
        return (fieldTranslations == null || (r = r(fieldTranslations)) == null) ? uniqueTournamentDetails.getName() : r;
    }

    public static final rv3 z(Category category, Context context) {
        String r;
        category.getClass();
        context.getClass();
        FieldTranslations fieldTranslations = category.getFieldTranslations();
        if (fieldTranslations != null && (r = r(fieldTranslations)) != null) {
            return new rv3(r, null);
        }
        List list = tv3.a;
        return tv3.a(context, category.getName());
    }
}
