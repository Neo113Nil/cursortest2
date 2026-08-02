package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.TyreType;
import com.sofascore.results.R;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hwc {
    public static final DayOfWeek a = DayOfWeek.TUESDAY;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5 > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, Stage stage) {
        context.getClass();
        long startDateTimestamp = stage.getStartDateTimestamp();
        Long valueOf = Long.valueOf(startDateTimestamp);
        if (startDateTimestamp <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            Stage stageParent = stage.getStageParent();
            if (stageParent != null) {
                long startDateTimestamp2 = stageParent.getStartDateTimestamp();
                valueOf = Long.valueOf(startDateTimestamp2);
            }
            valueOf = null;
        }
        if (valueOf != null) {
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return rik.q(valueOf.longValue(), context);
            }
        }
        return null;
    }

    public static int b(TyreType tyreType) {
        tyreType.getClass();
        int i = gwc.a[tyreType.ordinal()];
        if (i == 1) {
            return R.color.stayTyresHard;
        }
        if (i == 2) {
            return R.color.stayTyresMedium;
        }
        if (i == 3) {
            return R.color.stayTyresSoft;
        }
        if (i == 4) {
            return R.color.stayTyresWet;
        }
        if (i == 5) {
            return R.color.stayTyresIntermediate;
        }
        zzl.b();
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r4 = kotlin.text.StringsKt__StringsKt.split$default(r4, new java.lang.String[]{":", "."}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer c(StageStandingsItem stageStandingsItem) {
        List split$default;
        List B0;
        stageStandingsItem.getClass();
        String personalFastestLapTime = stageStandingsItem.getPersonalFastestLapTime();
        if (personalFastestLapTime != null && split$default != null) {
            if (split$default.size() < 2) {
                split$default = null;
            }
            if (split$default != null && (B0 = CollectionsKt.B0(split$default)) != null) {
                String str = (String) CollectionsKt.a0(0, B0);
                int m = yid.m(str != null ? StringsKt.toIntOrNull(str) : null);
                String str2 = (String) CollectionsKt.a0(1, B0);
                int m2 = (yid.m(str2 != null ? StringsKt.toIntOrNull(str2) : null) * 1000) + m;
                String str3 = (String) CollectionsKt.a0(2, B0);
                int m3 = (yid.m(str3 != null ? StringsKt.toIntOrNull(str3) : null) * 60000) + m2;
                String str4 = (String) CollectionsKt.a0(3, B0);
                return Integer.valueOf((yid.m(str4 != null ? StringsKt.toIntOrNull(str4) : null) * 3600000) + m3);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r1.equals("qualifying") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        r4 = r4.getString(com.sofascore.results.R.string.motorsport_qualifying);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f2, code lost:
    
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        if (r6 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        r5 = com.sofascore.results.R.string.motorsport_qualifying_stage_short;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        r4 = r4.getString(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        r5 = com.sofascore.results.R.string.motorsport_qualifying_number;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (r1.equals("qualification") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(Context context, String str, boolean z) {
        String string;
        context.getClass();
        str.getClass();
        Pair e = e(str);
        String str2 = (String) e.a;
        Integer num = (Integer) e.b;
        String lowerCase = StringsKt.l0(str2).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        int i = R.string.motorsport_free_practice_short;
        switch (hashCode) {
            case -1973208555:
                if (lowerCase.equals("super sunday")) {
                    String string2 = context.getString(R.string.motorsport_wrc_super_sunday_stages);
                    string2.getClass();
                    return string2;
                }
                return str;
            case -1405517509:
                if (lowerCase.equals("practice")) {
                    if (num == null) {
                        string = context.getString(z ? R.string.motorsport_practice_short : R.string.motorsport_practice);
                    } else {
                        if (!z) {
                            i = R.string.motorsport_practice_number;
                        }
                        string = context.getString(i, num);
                    }
                    string.getClass();
                    return string;
                }
                return str;
            case -1403757035:
                if (lowerCase.equals("sprint shootout")) {
                    String string3 = context.getString(R.string.motorsport_sprint_qualifying_stage_short, num);
                    string3.getClass();
                    return string3;
                }
                return str;
            case -1234171974:
                if (lowerCase.equals("after stage")) {
                    String string4 = context.getString(R.string.motorsport_follow_overall_results);
                    string4.getClass();
                    return string4;
                }
                return str;
            case -917781393:
                if (lowerCase.equals("free practice")) {
                    if (!z) {
                        i = R.string.free_practice_number;
                    }
                    String string5 = context.getString(i, num);
                    string5.getClass();
                    return string5;
                }
                return str;
            case -895679974:
                if (lowerCase.equals("sprint")) {
                    String string6 = context.getString(R.string.formula_sprint);
                    string6.getClass();
                    return string6;
                }
                return str;
            case -631333393:
                break;
            case -410355433:
                if (lowerCase.equals("sprint race")) {
                    String string7 = context.getString(R.string.motorsport_sprint_race);
                    string7.getClass();
                    return string7;
                }
                return str;
            case -30967435:
                break;
            case 99228:
                if (lowerCase.equals("day")) {
                    String string8 = context.getString(R.string.day_number, num);
                    string8.getClass();
                    return string8;
                }
                return str;
            case 3492561:
                if (lowerCase.equals("race")) {
                    String string9 = num == null ? context.getString(R.string.formula_race) : context.getString(R.string.motorsport_race, num);
                    string9.getClass();
                    return string9;
                }
                return str;
            case 109757182:
                if (lowerCase.equals("stage")) {
                    String string10 = context.getString(R.string.motorsport_stage_number, num);
                    string10.getClass();
                    return string10;
                }
                return str;
            case 333551941:
                if (lowerCase.equals("grand prix")) {
                    String string11 = context.getString(R.string.motorsport_grand_prix);
                    string11.getClass();
                    return string11;
                }
                return str;
            case 659970875:
                if (lowerCase.equals("sprint qualifying")) {
                    String string12 = context.getString(R.string.motorsport_sprint_qualifying);
                    string12.getClass();
                    return string12;
                }
                return str;
            default:
                return str;
        }
    }

    public static Pair e(String str) {
        str.getClass();
        txb b = new Regex("([a-zA-Z\\s]*)(\\d+)?").b(str);
        return b == null ? new Pair(str, null) : new Pair((String) ((sxb) b.a()).get(1), StringsKt.toIntOrNull((String) ((sxb) b.a()).get(2)));
    }

    public static boolean f(Stage stage) {
        stage.getClass();
        return Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_IN_PROGRESS);
    }
}
