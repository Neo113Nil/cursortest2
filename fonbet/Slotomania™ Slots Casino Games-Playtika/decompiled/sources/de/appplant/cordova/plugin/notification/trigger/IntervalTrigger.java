package de.appplant.cordova.plugin.notification.trigger;

import de.appplant.cordova.plugin.notification.trigger.DateTrigger;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes4.dex */
public class IntervalTrigger extends DateTrigger {
    private final int ticks;
    final DateTrigger.Unit unit;

    public IntervalTrigger(int i, DateTrigger.Unit unit) {
        this.ticks = i;
        this.unit = unit;
    }

    @Override // de.appplant.cordova.plugin.notification.trigger.DateTrigger
    public Date getNextTriggerDate(Date date) {
        Calendar cal = getCal(date);
        addInterval(cal);
        incOccurrence();
        return cal.getTime();
    }

    /* renamed from: de.appplant.cordova.plugin.notification.trigger.IntervalTrigger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit;

        static {
            int[] iArr = new int[DateTrigger.Unit.values().length];
            $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit = iArr;
            try {
                iArr[DateTrigger.Unit.SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.MINUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.QUARTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    void addInterval(Calendar calendar) {
        switch (AnonymousClass1.$SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[this.unit.ordinal()]) {
            case 1:
                calendar.add(13, this.ticks);
                break;
            case 2:
                calendar.add(12, this.ticks);
                break;
            case 3:
                calendar.add(11, this.ticks);
                break;
            case 4:
                calendar.add(6, this.ticks);
                break;
            case 5:
                calendar.add(3, this.ticks);
                break;
            case 6:
                calendar.add(2, this.ticks);
                break;
            case 7:
                calendar.add(2, this.ticks * 3);
                break;
            case 8:
                calendar.add(1, this.ticks);
                break;
        }
    }
}
