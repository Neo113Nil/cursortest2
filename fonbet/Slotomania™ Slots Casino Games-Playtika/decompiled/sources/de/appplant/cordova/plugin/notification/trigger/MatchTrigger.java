package de.appplant.cordova.plugin.notification.trigger;

import de.appplant.cordova.plugin.notification.trigger.DateTrigger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes7.dex */
public class MatchTrigger extends IntervalTrigger {
    private static DateTrigger.Unit[] INTERVALS = {null, DateTrigger.Unit.MINUTE, DateTrigger.Unit.HOUR, DateTrigger.Unit.DAY, DateTrigger.Unit.MONTH, DateTrigger.Unit.YEAR};
    private static int[] WEEKDAYS = {0, 2, 3, 4, 5, 6, 7, 1};
    private static int[] WEEKDAYS_REV = {0, 7, 1, 2, 3, 4, 5, 6};
    private final List<Integer> matchers;
    private final List<Integer> specials;

    private static DateTrigger.Unit getUnit(List<Integer> list, List<Integer> list2) {
        DateTrigger.Unit unit = INTERVALS[list.indexOf(null) + 1];
        DateTrigger.Unit unit2 = list2.get(0) != null ? DateTrigger.Unit.WEEK : null;
        return (unit2 != null && unit.compareTo(unit2) < 0) ? unit2 : unit;
    }

    public MatchTrigger(List<Integer> list, List<Integer> list2) {
        super(1, getUnit(list, list2));
        if (list2.get(0) != null) {
            list2.set(0, Integer.valueOf(WEEKDAYS[list2.get(0).intValue()]));
        }
        this.matchers = list;
        this.specials = list2;
    }

    private Calendar getBaseTriggerDate(Date date) {
        Calendar cal = getCal(date);
        cal.set(13, 0);
        if (this.matchers.get(0) != null) {
            cal.set(12, this.matchers.get(0).intValue());
        } else {
            cal.set(12, 0);
        }
        if (this.matchers.get(1) != null) {
            cal.set(11, this.matchers.get(1).intValue());
        } else {
            cal.set(11, 0);
        }
        if (this.matchers.get(2) != null) {
            cal.set(5, this.matchers.get(2).intValue());
        }
        if (this.matchers.get(3) != null) {
            cal.set(2, this.matchers.get(3).intValue() - 1);
        }
        if (this.matchers.get(4) != null) {
            cal.set(1, this.matchers.get(4).intValue());
        }
        return cal;
    }

    private Date getTriggerDate(Date date) {
        Calendar baseTriggerDate = getBaseTriggerDate(date);
        Calendar cal = getCal(date);
        if (baseTriggerDate.compareTo(cal) >= 0) {
            return applySpecials(baseTriggerDate);
        }
        if (this.unit == null || baseTriggerDate.get(1) < cal.get(1)) {
            return null;
        }
        if (baseTriggerDate.get(2) < cal.get(2)) {
            int i = AnonymousClass1.$SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[this.unit.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                if (this.matchers.get(4) != null) {
                    return null;
                }
                addToDate(baseTriggerDate, cal, 1, 1);
            } else if (i == 5) {
                addToDate(baseTriggerDate, cal, 1, 1);
            }
        } else if (baseTriggerDate.get(6) < cal.get(6)) {
            int i2 = AnonymousClass1.$SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[this.unit.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (this.matchers.get(3) == null) {
                    addToDate(baseTriggerDate, cal, 2, 1);
                } else {
                    if (this.matchers.get(4) != null) {
                        return null;
                    }
                    addToDate(baseTriggerDate, cal, 1, 1);
                }
            } else if (i2 == 5) {
                addToDate(baseTriggerDate, cal, 1, 1);
            } else if (i2 == 6) {
                addToDate(baseTriggerDate, cal, 2, 1);
            }
        } else if (baseTriggerDate.get(11) < cal.get(11)) {
            switch (AnonymousClass1.$SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[this.unit.ordinal()]) {
                case 1:
                    if (this.matchers.get(2) == null) {
                        addToDate(baseTriggerDate, cal, 6, 1);
                        break;
                    } else {
                        if (this.matchers.get(3) != null) {
                            return null;
                        }
                        addToDate(baseTriggerDate, cal, 2, 1);
                        break;
                    }
                case 2:
                    if (baseTriggerDate.get(12) < cal.get(12)) {
                        addToDate(baseTriggerDate, cal, 11, 1);
                        break;
                    } else {
                        addToDate(baseTriggerDate, cal, 11, 0);
                        break;
                    }
                case 3:
                case 4:
                    addToDate(baseTriggerDate, cal, 6, 1);
                    break;
                case 5:
                    addToDate(baseTriggerDate, cal, 1, 1);
                    break;
                case 6:
                    addToDate(baseTriggerDate, cal, 2, 1);
                    break;
            }
        } else if (baseTriggerDate.get(12) < cal.get(12)) {
            switch (AnonymousClass1.$SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[this.unit.ordinal()]) {
                case 1:
                    addToDate(baseTriggerDate, cal, 12, 1);
                    break;
                case 2:
                    addToDate(baseTriggerDate, cal, 11, 1);
                    break;
                case 3:
                case 4:
                    addToDate(baseTriggerDate, cal, 6, 1);
                    break;
                case 5:
                    addToDate(baseTriggerDate, cal, 1, 1);
                    break;
                case 6:
                    addToDate(baseTriggerDate, cal, 2, 1);
                    break;
            }
        }
        return applySpecials(baseTriggerDate);
    }

    /* renamed from: de.appplant.cordova.plugin.notification.trigger.MatchTrigger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit;

        static {
            int[] iArr = new int[DateTrigger.Unit.values().length];
            $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit = iArr;
            try {
                iArr[DateTrigger.Unit.MINUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$de$appplant$cordova$plugin$notification$trigger$DateTrigger$Unit[DateTrigger.Unit.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private Date applySpecials(Calendar calendar) {
        if (this.specials.get(2) != null && !setWeekOfMonth(calendar)) {
            return null;
        }
        if (this.specials.get(0) == null || setDayOfWeek(calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    @Override // de.appplant.cordova.plugin.notification.trigger.IntervalTrigger, de.appplant.cordova.plugin.notification.trigger.DateTrigger
    public Date getNextTriggerDate(Date date) {
        if (getOccurrence() > 1) {
            Calendar cal = getCal(date);
            addInterval(cal);
            date = cal.getTime();
        }
        incOccurrence();
        return getTriggerDate(date);
    }

    private void addToDate(Calendar calendar, Calendar calendar2, int i, int i2) {
        calendar.set(i, calendar2.get(i));
        calendar.add(i, i2);
    }

    private boolean setDayOfWeek(Calendar calendar) {
        calendar.setFirstDayOfWeek(2);
        int i = WEEKDAYS_REV[calendar.get(7)];
        int i2 = calendar.get(2);
        int i3 = calendar.get(1);
        int i4 = WEEKDAYS_REV[this.specials.get(0).intValue()];
        if (this.matchers.get(2) != null) {
            return false;
        }
        if (i > i4) {
            if (this.specials.get(2) == null) {
                calendar.add(3, 1);
            } else if (this.matchers.get(3) == null) {
                calendar.add(2, 1);
            } else {
                if (this.matchers.get(4) != null) {
                    return false;
                }
                calendar.add(1, 1);
            }
        }
        calendar.set(13, 0);
        calendar.set(7, this.specials.get(0).intValue());
        if (this.matchers.get(3) == null || calendar.get(2) == i2) {
            return this.matchers.get(4) == null || calendar.get(1) == i3;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r9.get(1) != r3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean setWeekOfMonth(Calendar calendar) {
        int i = calendar.get(4);
        int i2 = calendar.get(1);
        int intValue = this.specials.get(2).intValue();
        if (i > intValue) {
            if (this.matchers.get(3) == null) {
                calendar.add(2, 1);
            } else {
                if (this.matchers.get(4) == null) {
                    calendar.add(1, 1);
                }
                return false;
            }
            if (this.matchers.get(4) != null) {
            }
        }
        int i3 = calendar.get(2);
        calendar.set(4, intValue);
        if (calendar.get(2) != i3) {
            calendar.set(5, 1);
            calendar.set(2, i3);
        } else if (this.matchers.get(2) == null && i != intValue) {
            calendar.set(7, 2);
        }
        return true;
    }
}
