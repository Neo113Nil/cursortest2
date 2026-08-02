package net.time4j.tz.model;

import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.Moment;
import net.time4j.base.GregorianDate;
import net.time4j.base.GregorianMath;
import net.time4j.base.MathUtils;
import net.time4j.base.WallTime;
import net.time4j.engine.EpochDays;
import net.time4j.scale.TimeScale;
import net.time4j.tz.TransitionHistory;
import net.time4j.tz.ZonalOffset;
import net.time4j.tz.ZonalTransition;
import org.chromium.base.TimeUtils;

/* loaded from: classes10.dex */
public abstract class TransitionModel implements TransitionHistory, Serializable {
    static final String NEW_LINE = System.getProperty("line.separator");

    @Override // net.time4j.tz.TransitionHistory
    public boolean hasNegativeDST() {
        return false;
    }

    @Override // net.time4j.tz.TransitionHistory
    public boolean isEmpty() {
        return false;
    }

    TransitionModel() {
    }

    public static TransitionHistory of(List<ZonalTransition> list) {
        return new ArrayTransitionModel(list);
    }

    public static TransitionHistory of(ZonalOffset zonalOffset, List<DaylightSavingRule> list) {
        if (list.isEmpty()) {
            return new EmptyTransitionModel(zonalOffset);
        }
        return new RuleBasedTransitionModel(zonalOffset, list);
    }

    public static TransitionHistory of(ZonalOffset zonalOffset, List<ZonalTransition> list, List<DaylightSavingRule> list2) {
        return of(zonalOffset, list, list2, true, true);
    }

    static TransitionHistory of(ZonalOffset zonalOffset, List<ZonalTransition> list, List<DaylightSavingRule> list2, boolean z, boolean z2) {
        List<ZonalTransition> list3;
        List<DaylightSavingRule> list4;
        if (z) {
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list2);
            Collections.sort(arrayList);
            Collections.sort(arrayList2, RuleComparator.INSTANCE);
            list4 = arrayList2;
            list3 = arrayList;
        } else {
            list3 = list;
            list4 = list2;
        }
        int size = list3.size();
        if (size == 0) {
            if (list4.isEmpty()) {
                return new EmptyTransitionModel(zonalOffset);
            }
            return new RuleBasedTransitionModel(zonalOffset, list4, false);
        }
        ZonalOffset ofTotalSeconds = ZonalOffset.ofTotalSeconds(list3.get(0).getPreviousOffset());
        if (z2 && !zonalOffset.equals(ofTotalSeconds)) {
            throw new IllegalArgumentException("Initial offset " + zonalOffset + " not equal to previous offset of first transition: " + ofTotalSeconds);
        }
        if (list4.isEmpty()) {
            return new ArrayTransitionModel(list3, false, z2);
        }
        ZonalTransition zonalTransition = list3.get(size - 1);
        long posixTime = zonalTransition.getPosixTime() + 1;
        long futureMoment = getFutureMoment(1);
        if (posixTime < futureMoment) {
            List<DaylightSavingRule> list5 = list4;
            list4 = list5;
            list3.addAll(RuleBasedTransitionModel.getTransitions(zonalTransition, list5, posixTime, futureMoment));
        }
        return new CompositeTransitionModel(size, list3, list4, false, z2);
    }

    static List<ZonalOffset> toList(int i) {
        return Collections.singletonList(ZonalOffset.ofTotalSeconds(i));
    }

    static List<ZonalOffset> toList(int i, int i2) {
        ZonalOffset ofTotalSeconds = ZonalOffset.ofTotalSeconds(i);
        ZonalOffset ofTotalSeconds2 = ZonalOffset.ofTotalSeconds(i2);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(ofTotalSeconds);
        arrayList.add(ofTotalSeconds2);
        return Collections.unmodifiableList(arrayList);
    }

    static long toLocalSecs(GregorianDate gregorianDate, WallTime wallTime) {
        return MathUtils.safeMultiply(EpochDays.UNIX.transform(GregorianMath.toMJD(gregorianDate.getYear(), gregorianDate.getMonth(), gregorianDate.getDayOfMonth()), EpochDays.MODIFIED_JULIAN_DATE), TimeUtils.SECONDS_PER_DAY) + (wallTime.getHour() * MMKV.ExpireInHour) + (wallTime.getMinute() * 60) + wallTime.getSecond();
    }

    static void dump(ZonalTransition zonalTransition, Appendable appendable) throws IOException {
        appendable.append(">>> Transition at: ").append(Moment.of(zonalTransition.getPosixTime(), TimeScale.POSIX).toString());
        appendable.append(" from ").append(format(zonalTransition.getPreviousOffset()));
        appendable.append(" to ").append(format(zonalTransition.getTotalOffset()));
        appendable.append(", DST=");
        appendable.append(format(zonalTransition.getDaylightSavingOffset()));
        appendable.append(NEW_LINE);
    }

    static long getFutureMoment(int i) {
        return (System.currentTimeMillis() / 1000) + ((long) (i * 3.1556952E7d));
    }

    private static String format(int i) {
        return ZonalOffset.ofTotalSeconds(i).toString();
    }
}
