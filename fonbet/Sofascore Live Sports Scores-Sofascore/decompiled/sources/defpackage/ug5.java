package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.firebase.components.ComponentRegistrar;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class ug5 implements u02, ixd, lx2, zzyh, zzqp, xfc, gn5, op3, k3f {
    public static final ug5 a = new ug5();
    public static final ug5 b = new ug5();
    public static final ug5 c = new ug5();
    public static final ug5 d = new ug5();
    public static final ug5 e = new ug5();
    public static final ug5 f = new ug5();
    public static final ug5 g = new ug5();
    public static final ug5 h = new ug5();
    public static final ug5 i = new ug5();
    public static final ug5 j = new ug5();
    public static final ug5 k = new ug5();
    public static final ug5 l = new ug5();

    public static ArrayList A(List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProviderOdds providerOdds = (ProviderOdds) it.next();
            if (providerOdds.getMarketId() == 127) {
                Stage stage = providerOdds.getStage();
                if ((stage != null ? stage.getType() : null) == ServerType.STAGE) {
                    providerOdds = ProviderOdds.copy$default(providerOdds, 0, null, false, null, null, 0, 129, null, null, null, null, null, null, 8127, null);
                    arrayList.add(providerOdds);
                }
            }
            if (providerOdds.getMarketId() == 127) {
                providerOdds = ProviderOdds.copy$default(providerOdds, 0, null, false, null, null, 0, 101, null, null, null, null, null, null, 8127, null);
            }
            arrayList.add(providerOdds);
        }
        return arrayList;
    }

    public static String C(long j2) {
        long j3 = j2 / 60;
        long j4 = j3 / 60;
        String y = dmi.y(String.valueOf(j3 % 60), InneractiveMediationDefs.GENDER_MALE);
        if (j4 < 1) {
            return y;
        }
        return j4 + "h " + y;
    }

    public static LocalDate D(long j2) {
        return fc6.t(Instant.ofEpochSecond(j2));
    }

    public static qf4 a(c6h c6hVar, e3c e3cVar, ad2 ad2Var, Function0 function0) {
        km5 km5Var = km5.a;
        int i2 = 0;
        rq3 rq3Var = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            km5Var.getClass();
            return new qf4(new l18(c6hVar, new mnc(ad2Var, 9), function0), a.c(new ce4(km5Var, rq3Var, i2)), e3cVar, ad2Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            km5Var.getClass();
            return new qf4(new l18(c6hVar, new gl7(11), function0), a.c(new ce4(km5Var, rq3Var, i2)), e3cVar, ad2Var);
        }
    }

    public static ProviderOdds d(int i2, ArrayList arrayList, boolean z) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            ProviderOdds providerOdds = (ProviderOdds) obj2;
            if (providerOdds.getMarketId() == i2 && (z || !providerOdds.isLive())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                char c2 = ((ProviderOdds) next).isLive() == z ? (char) 1 : (char) 0;
                do {
                    Object next2 = it.next();
                    char c3 = ((ProviderOdds) next2).isLive() == z ? (char) 1 : (char) 0;
                    if (c2 < c3) {
                        next = next2;
                        c2 = c3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (ProviderOdds) obj;
    }

    public static r9k l(ProviderOdds providerOdds) {
        Team team;
        providerOdds.getClass();
        Integer valueOf = Integer.valueOf(providerOdds.getMarketId());
        OddsChoice oddsChoice = (OddsChoice) CollectionsKt.firstOrNull(providerOdds.getChoices());
        return m(valueOf, (oddsChoice == null || (team = oddsChoice.getTeam()) == null) ? null : team.getGender(), providerOdds.getStage());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r2 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r9k m(Integer num, Gender gender, Stage stage) {
        gv9 gv9Var;
        if ((num != null && num.intValue() == 127) || (num != null && num.intValue() == 101)) {
            return new n9k(R.string.cycling_odds_race_winner, gender);
        }
        if (num == null || num.intValue() != 129) {
            return r(6, num, false);
        }
        if (stage != null) {
            Integer sequence = stage.getSequence();
            if (sequence == null) {
                DayOfWeek dayOfWeek = hwc.a;
                sequence = (Integer) hwc.e(stage.getDescription()).b;
            }
            if (sequence != null) {
                gv9Var = l6g.K(Integer.valueOf(sequence.intValue()));
            }
        }
        gv9Var = rlh.b;
        return new n9k(R.string.cycling_odds_stage_winner, gender, gv9Var);
    }

    public static int n(long j2, long j3) {
        return (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(j2)), vxd.o(Instant.ofEpochMilli(j3)));
    }

    public static int p(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        String string = sharedPreferences.getString("PREF_FIRST_DAY_OF_WEEK", "MONDAY");
        if (string == null) {
            return 2;
        }
        int hashCode = string.hashCode();
        if (hashCode != -2015173360) {
            return hashCode != -1837857328 ? (hashCode == -1331574855 && string.equals("SATURDAY")) ? 7 : 2 : !string.equals("SUNDAY") ? 2 : 1;
        }
        string.equals("MONDAY");
        return 2;
    }

    public static q9k q(Integer num, boolean z, boolean z2) {
        if ((num != null && num.intValue() == 127) || (num != null && num.intValue() == 101)) {
            return new q9k(R.string.winner);
        }
        if (num != null && num.intValue() == 103) {
            return new q9k(R.string.motorsport_odds_race_top_finish, l6g.K(3));
        }
        if (num != null && num.intValue() == 104) {
            return new q9k(R.string.motorsport_odds_race_top_finish, l6g.K(Integer.valueOf(z ? 8 : 10)));
        }
        if (num != null && num.intValue() == 120) {
            return new q9k(R.string.motorsport_odds_race_top_finish, l6g.K(6));
        }
        if ((num != null && num.intValue() == 124) || ((num != null && num.intValue() == 125) || (num != null && num.intValue() == 126))) {
            return new q9k(z ? R.string.motorsport_odds_fastest_sprint_qualifier : R.string.motorsport_odds_fastest_in_qualifying, l6g.K(Integer.valueOf(num.intValue() - Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)));
        }
        if ((num != null && num.intValue() == 121) || ((num != null && num.intValue() == 122) || (num != null && num.intValue() == 123))) {
            return new q9k(R.string.motorsport_odds_fastest_in_free_practice, l6g.K(Integer.valueOf(num.intValue() - 120)));
        }
        if (num != null && num.intValue() == 105) {
            return new q9k(R.string.motorsport_odds_fastest_qualifier);
        }
        if (num != null && num.intValue() == 102) {
            return new q9k(R.string.motorsport_odds_winning_car);
        }
        if (num != null && num.intValue() == 106) {
            return new q9k(R.string.formula_fastest_lap);
        }
        if (num != null && num.intValue() == 107) {
            return new q9k(R.string.motorsport_odds_safety_car);
        }
        if (num != null && num.intValue() == 112) {
            return z2 ? new q9k(R.string.motorsport_odds_both_cars_points) : new q9k(R.string.motorsport_odds_both_in_points);
        }
        if (num != null && num.intValue() == 113) {
            return new q9k(R.string.motorsport_odds_qualifying_winning_car);
        }
        if (num != null && num.intValue() == 115) {
            return z2 ? new q9k(R.string.motorsport_odds_both_cars_podium) : new q9k(R.string.motorsport_odds_double_podium);
        }
        if ((num != null && num.intValue() == 118) || (num != null && num.intValue() == 119)) {
            return new q9k(R.string.motorsport_odds_championship_winner);
        }
        return null;
    }

    public static /* synthetic */ q9k r(int i2, Integer num, boolean z) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return q(num, z, (i2 & 4) == 0);
    }

    public static boolean s(LocalDateTime localDateTime) {
        localDateTime.getClass();
        LocalDateTime now = LocalDateTime.now();
        now.getClass();
        WeekFields of = WeekFields.of(Locale.getDefault());
        return now.get(of.weekOfWeekBasedYear()) == localDateTime.get(of.weekOfWeekBasedYear()) && now.get(of.weekBasedYear()) == localDateTime.get(of.weekBasedYear());
    }

    public static boolean t(String str) {
        if (str != null) {
            int value = Year.now().getValue();
            int i2 = value + 1;
            List j2 = b.j(String.valueOf(value), String.valueOf(i2), ljg.j(value % 100, "/"), ljg.j(i2 % 100, "/"));
            if (j2 == null || !j2.isEmpty()) {
                Iterator it = j2.iterator();
                while (it.hasNext()) {
                    if (Boolean.valueOf(StringsKt.J(str, (String) it.next(), false)).equals(Boolean.TRUE)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean u(long j2) {
        return fc6.B(D(j2));
    }

    public static boolean v(long j2) {
        return D(j2).isEqual(LocalDate.now(ZoneId.systemDefault()).plusDays(1L));
    }

    public static boolean w(long j2) {
        return D(j2).isEqual(LocalDate.now(ZoneId.systemDefault()).minusDays(1L));
    }

    public static void y(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && Intrinsics.c(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            is8.e(fc6.k(parentFile, "Failed to delete conflicting file: "));
        } else {
            if (parentFile.isDirectory()) {
                return;
            }
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
            } catch (Exception e2) {
                cp4.i(fc6.k(parentFile, "Failed to create directory: "), e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0082 -> B:13:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0085 -> B:13:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(List list, cf4 cf4Var, sq3 sq3Var) {
        de4 de4Var;
        int i2;
        List list2;
        Iterator it;
        fsf fsfVar;
        Throwable th;
        if (sq3Var instanceof de4) {
            de4Var = (de4) sq3Var;
            int i3 = de4Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                de4Var.v = i3 - Integer.MIN_VALUE;
                Object obj = de4Var.t;
                Object obj2 = lu3.a;
                i2 = de4Var.v;
                if (i2 != 0) {
                    ArrayList u = fc6.u(obj);
                    jk jkVar = new jk(list, u, (rq3) null);
                    de4Var.r = u;
                    de4Var.v = 1;
                    if (cf4Var.a(jkVar, de4Var) != obj2) {
                        list2 = u;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = de4Var.s;
                    fsfVar = (fsf) de4Var.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th2) {
                        Object obj3 = fsfVar.a;
                        if (obj3 == null) {
                            fsfVar.a = th2;
                        } else {
                            de6.a((Throwable) obj3, th2);
                        }
                    }
                    while (it.hasNext()) {
                        Function1 function1 = (Function1) it.next();
                        de4Var.r = fsfVar;
                        de4Var.s = it;
                        de4Var.v = 2;
                        if (function1.invoke(de4Var) == obj2) {
                            return obj2;
                        }
                    }
                    th = (Throwable) fsfVar.a;
                    if (th == null) {
                        return Unit.a;
                    }
                    throw th;
                }
                list2 = (List) de4Var.r;
                y6a.M(obj);
                fsf fsfVar2 = new fsf();
                it = list2.iterator();
                fsfVar = fsfVar2;
                while (it.hasNext()) {
                }
                th = (Throwable) fsfVar.a;
                if (th == null) {
                }
            }
        }
        de4Var = new de4(this, sq3Var);
        Object obj4 = de4Var.t;
        Object obj22 = lu3.a;
        i2 = de4Var.v;
        if (i2 != 0) {
        }
        fsf fsfVar22 = new fsf();
        it = list2.iterator();
        fsfVar = fsfVar22;
        while (it.hasNext()) {
        }
        th = (Throwable) fsfVar.a;
        if (th == null) {
        }
    }

    public boolean E(sm8 sm8Var) {
        String str = sm8Var.l;
        return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public g7a c(sm8 sm8Var) {
        String str = sm8Var.l;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new be0();
                case "application/x-icy":
                    return new qq9();
                case "application/id3":
                    return new wq9(null);
                case "application/x-emsg":
                    return new t36();
                case "application/x-scte35":
                    return new zxh();
            }
        }
        a70.p(dmi.q("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.op3
    public long e(long j2, long j3) {
        float max = Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        int i2 = mrg.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.u02
    public Rect f(Activity activity) {
        DisplayCutout o;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            u02.h7.getClass();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (o = c90.o(defaultDisplay)) != null) {
            if (rect.left == c90.L(o)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c90.M(o)) {
                rect.right = c90.M(o) + rect.right;
            }
            if (rect.top == c90.N(o)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c90.K(o)) {
                rect.bottom = c90.K(o) + rect.bottom;
            }
        }
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        vh9Var.e.f(rj9.i, new vpf((ct8) hoiVar, null, 1));
    }

    @Override // defpackage.gn5
    public boolean i(Object obj, File file, uvd uvdVar) {
        try {
            ha2.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean j() {
        return this instanceof zub;
    }

    @Override // defpackage.xfc
    public boolean k(vec vecVar) {
        return false;
    }

    public void o(float f2, float f3, float f4, sbh sbhVar) {
        sbhVar.c(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|14|(1:16)|17|(2:20|18)|21|22|23))|34|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        r6 = defpackage.qna.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        r6 = defpackage.qna.m();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[LOOP:0: B:18:0x007f->B:20:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(Context context, int i2, sq3 sq3Var) {
        bma bmaVar;
        int i3;
        int c2;
        if (sq3Var instanceof bma) {
            bmaVar = (bma) sq3Var;
            int i4 = bmaVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bmaVar.v = i4 - Integer.MIN_VALUE;
                Object obj = bmaVar.t;
                lu3 lu3Var = lu3.a;
                i3 = bmaVar.v;
                if (i3 != 0) {
                    y6a.M(obj);
                    bmaVar.r = context;
                    bmaVar.s = i2;
                    bmaVar.v = 1;
                    obj = dz8.a.c(context, doa.b, "appWidgetLayout-" + i2, bmaVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bmaVar.s;
                    context = bmaVar.r;
                    y6a.M(obj);
                }
                qna m = (qna) obj;
                Context context2 = context;
                int i5 = i2;
                s7a<sna> n = m.n();
                c2 = sub.c(k13.r(n, 10));
                if (c2 < 16) {
                    c2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
                for (sna snaVar : n) {
                    linkedHashMap.put(snaVar.k(), new Integer(snaVar.l()));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                return new cma(context2, linkedHashMap2, m.o(), i5, CollectionsKt.V0(linkedHashMap2.values()));
            }
        }
        bmaVar = new bma(this, sq3Var);
        Object obj2 = bmaVar.t;
        lu3 lu3Var2 = lu3.a;
        i3 = bmaVar.v;
        if (i3 != 0) {
        }
        qna m2 = (qna) obj2;
        Context context22 = context;
        int i52 = i2;
        s7a<sna> n2 = m2.n();
        c2 = sub.c(k13.r(n2, 10));
        if (c2 < 16) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c2);
        while (r7.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(linkedHashMap3);
        return new cma(context22, linkedHashMap22, m2.o(), i52, CollectionsKt.V0(linkedHashMap22.values()));
    }

    public List z(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (kb3 kb3Var : componentRegistrar.getComponents()) {
            String str = kb3Var.a;
            if (str != null) {
                kb3Var = new kb3(str, kb3Var.b, kb3Var.c, kb3Var.d, kb3Var.e, new o3(4, str, kb3Var), kb3Var.g);
            }
            arrayList.add(kb3Var);
        }
        return arrayList;
    }

    @Override // defpackage.xfc
    public void b(vec vecVar, boolean z) {
    }
}
