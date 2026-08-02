package de.appplant.cordova.plugin.notification.trigger;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes3.dex */
public abstract class DateTrigger {
    private int occurrence = 1;

    public enum Unit {
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK,
        MONTH,
        QUARTER,
        YEAR
    }

    public abstract Date getNextTriggerDate(Date date);

    public int getOccurrence() {
        return this.occurrence;
    }

    void incOccurrence() {
        this.occurrence++;
    }

    Calendar getCal(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}
