package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.SportVariant;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageDiscipline;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l5i {
    public static final joa a;
    public static final joa b;
    public static final joa c;

    static {
        b1i b1iVar = new b1i(9);
        ysa ysaVar = ysa.c;
        a = ypa.a(ysaVar, b1iVar);
        b = ypa.a(ysaVar, new b1i(10));
        c = ypa.a(ysaVar, new b1i(11));
    }

    public static final List a() {
        return (List) a.getValue();
    }

    public static i5i b(Stage stage) {
        Object obj;
        stage.getClass();
        Iterator<E> it = i5i.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i5i) obj).a.equals(stage.getSlug())) {
                break;
            }
        }
        return (i5i) obj;
    }

    public static String c(Context context, int i, String str) {
        boolean z = (i & 8) == 0;
        context.getClass();
        str.getClass();
        List list = (List) c.getValue();
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c.o((String) it.next(), str, true)) {
                    String string = context.getString(z ? R.string.stage_riders_bikes : R.string.motorsport_rider);
                    string.getClass();
                    return string;
                }
            }
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (StringsKt.J(lowerCase, Sports.CYCLING, false)) {
            return new n9k(R.string.cycling_rider, null).b(context);
        }
        String string2 = context.getString(z ? R.string.formula_drivers : R.string.formula_driver);
        string2.getClass();
        return string2;
    }

    public static Stage d(List list) {
        Object obj;
        list.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (b.j(StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_FINISHED, StatusKt.STATUS_PRELIMINARY).contains(((Stage) obj).getStatusType())) {
                break;
            }
        }
        Stage stage = (Stage) obj;
        return stage == null ? (Stage) CollectionsKt.firstOrNull(list) : stage;
    }

    public static Stage e(List list) {
        Object obj;
        Object obj2;
        long abs;
        long abs2;
        list.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.c(((Stage) obj2).getStatusType(), StatusKt.STATUS_IN_PROGRESS)) {
                break;
            }
        }
        Stage stage = (Stage) obj2;
        if (stage != null) {
            return stage;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            Stage stage2 = (Stage) obj3;
            String statusType = stage2.getStatusType();
            if (Intrinsics.c(statusType, StatusKt.STATUS_FINISHED)) {
                Long endDateTimestamp = stage2.getEndDateTimestamp();
                if ((endDateTimestamp != null ? endDateTimestamp.longValue() : 0L) != 0) {
                    arrayList.add(obj3);
                }
            } else if (Intrinsics.c(statusType, StatusKt.STATUS_NOT_STARTED) && stage2.getStartDateTimestamp() != 0) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.c(((Stage) next).getStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                    obj = next;
                    break;
                }
            }
            Stage stage3 = (Stage) obj;
            return stage3 != null ? stage3 : (Stage) CollectionsKt.j0(list);
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            yhk.d();
            return null;
        }
        Object next2 = it3.next();
        if (it3.hasNext()) {
            Stage stage4 = (Stage) next2;
            if (Intrinsics.c(stage4.getStatusType(), StatusKt.STATUS_FINISHED)) {
                Long endDateTimestamp2 = stage4.getEndDateTimestamp();
                abs = Math.abs(currentTimeMillis - (endDateTimestamp2 != null ? endDateTimestamp2.longValue() : 0L));
            } else {
                abs = Math.abs(currentTimeMillis - stage4.getStartDateTimestamp());
            }
            do {
                Object next3 = it3.next();
                Stage stage5 = (Stage) next3;
                if (Intrinsics.c(stage5.getStatusType(), StatusKt.STATUS_FINISHED)) {
                    Long endDateTimestamp3 = stage5.getEndDateTimestamp();
                    abs2 = Math.abs(currentTimeMillis - (endDateTimestamp3 != null ? endDateTimestamp3.longValue() : 0L));
                } else {
                    abs2 = Math.abs(currentTimeMillis - stage5.getStartDateTimestamp());
                }
                if (abs > abs2) {
                    next2 = next3;
                    abs = abs2;
                }
            } while (it3.hasNext());
        }
        return (Stage) next2;
    }

    public static boolean f(Stage stage) {
        stage.getClass();
        UniqueStage uniqueStage = stage.getUniqueStage();
        return Intrinsics.c(uniqueStage != null ? Boolean.valueOf(g(uniqueStage)) : null, Boolean.TRUE);
    }

    public static boolean g(UniqueStage uniqueStage) {
        uniqueStage.getClass();
        return Intrinsics.c(uniqueStage.getCategory().getSport().getSlug(), Sports.CYCLING);
    }

    public static boolean h(Team team) {
        Category category = team.getCategory();
        if (category == null ? SportVariant.INSTANCE.fromId(team.getSportVariant()) != SportVariant.MotorsportMoto : !c.o(category.getSlug(), "bikes", true) && !c.v(category.getSlug(), "moto", true)) {
            if (!Intrinsics.c(team.getSportSlug(), Sports.CYCLING)) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(Stage stage) {
        UniqueStage uniqueStage;
        stage.getClass();
        UniqueStage uniqueStage2 = stage.getUniqueStage();
        if (uniqueStage2 != null && uniqueStage2.getId() == 36) {
            return true;
        }
        StageSeason stageSeason = stage.getStageSeason();
        return (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null || uniqueStage.getId() != 36) ? false : true;
    }

    public static String j(Stage stage) {
        String alpha2;
        Object obj;
        stage.getClass();
        String shortName = stage.getShortName();
        if (shortName != null) {
            return shortName;
        }
        Country country = stage.getCountry();
        String str = null;
        if (country != null && (alpha2 = country.getAlpha2()) != null) {
            Iterator it = zu3.y0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((com.sofascore.model.Country) obj).getIso2Alpha(), alpha2)) {
                    break;
                }
            }
            com.sofascore.model.Country country2 = (com.sofascore.model.Country) obj;
            if (country2 != null) {
                str = country2.getIso3Alpha();
            }
        }
        if (str != null) {
            return str;
        }
        String upperCase = iii.H(3, stage.getDescription()).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static void k(Context context, int i, int i2) {
        context.getClass();
        if (i == 0) {
            int i3 = StageConstructorActivity.R;
            dff.g(i2, context);
        } else {
            int i4 = StageDriverActivity.R;
            pff.g(i2, context);
        }
    }

    public static void l(Stage stage) {
        stage.getClass();
        Stage stageParent = stage.getStageParent();
        if (stageParent != null) {
            m(stageParent);
            stage.setStageEvent(stageParent);
        }
        if (stage.getType() == ServerType.EVENT) {
            m(stage);
        }
    }

    public static void m(Stage stage) {
        Stage stageParent = stage.getStageParent();
        if (stageParent != null) {
            if (stageParent.getId() == stage.getId()) {
                stageParent = null;
            }
            if (stageParent == null) {
                return;
            }
            ServerType type = stageParent.getType();
            int i = type == null ? -1 : k5i.a[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                stage.setStageSeason(n(stageParent));
            } else {
                StageDiscipline stageDiscipline = new StageDiscipline(stageParent.getDescription(), stageParent.getId());
                Stage stageParent2 = stageParent.getStageParent();
                if (stageParent2 != null) {
                    stageDiscipline.setStageSeason(n(stageParent2));
                }
                stage.setStageDiscipline(stageDiscipline);
            }
        }
    }

    public static StageSeason n(Stage stage) {
        return new StageSeason(stage.getUniqueStage(), stage.getDescription(), stage.getSlug(), stage.getYear(), stage.getId(), Long.valueOf(stage.getStartDateTimestamp()), stage.getEndDateTimestamp());
    }
}
