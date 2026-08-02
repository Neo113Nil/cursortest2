package com.henninghall.date_picker.wheels;

import android.graphics.Paint;
import com.henninghall.date_picker.LocaleUtils;
import com.henninghall.date_picker.State;
import com.henninghall.date_picker.Utils;
import com.henninghall.date_picker.models.Mode;
import com.henninghall.date_picker.pickers.Picker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class DayWheel extends Wheel {
    private static int defaultNumberOfDays = Calendar.getInstance().getActualMaximum(6);
    private HashMap<String, String> displayValues;
    private String todayValue;

    @Override // com.henninghall.date_picker.wheels.Wheel
    public boolean wrapSelectorWheel() {
        return false;
    }

    public DayWheel(Picker picker, State state) {
        super(picker, state);
    }

    @Override // com.henninghall.date_picker.wheels.Wheel
    public ArrayList<String> getValues() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.displayValues = new HashMap<>();
        Calendar startCal = getStartCal();
        Calendar endCal = getEndCal();
        while (!startCal.after(endCal)) {
            String value = getValue(startCal);
            arrayList.add(value);
            this.displayValues.put(value, getDisplayValue(startCal));
            if (Utils.isToday(startCal)) {
                this.todayValue = value;
            }
            startCal.add(5, 1);
        }
        return arrayList;
    }

    private Calendar getStartCal() {
        Calendar maximumDate = this.state.getMaximumDate();
        Calendar minimumDate = this.state.getMinimumDate();
        if (minimumDate != null) {
            Calendar calendar = (Calendar) minimumDate.clone();
            resetToMidnight(calendar);
            return calendar;
        }
        if (maximumDate != null) {
            Calendar calendar2 = (Calendar) maximumDate.clone();
            resetToMidnight(calendar2);
            calendar2.add(5, (-calendar2.getActualMaximum(6)) / 2);
            return calendar2;
        }
        Calendar calendar3 = (Calendar) getInitialDate().clone();
        calendar3.add(5, (-defaultNumberOfDays) / 2);
        return calendar3;
    }

    private Calendar getEndCal() {
        Calendar maximumDate = this.state.getMaximumDate();
        Calendar minimumDate = this.state.getMinimumDate();
        if (maximumDate != null) {
            Calendar calendar = (Calendar) maximumDate.clone();
            resetToMidnight(calendar);
            return calendar;
        }
        if (minimumDate != null) {
            Calendar calendar2 = (Calendar) minimumDate.clone();
            resetToMidnight(calendar2);
            calendar2.add(5, calendar2.getActualMaximum(6) / 2);
            return calendar2;
        }
        Calendar calendar3 = (Calendar) getInitialDate().clone();
        calendar3.setTime(new Date());
        calendar3.add(5, defaultNumberOfDays / 2);
        return calendar3;
    }

    private void resetToMidnight(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    private String getValue(Calendar calendar) {
        return this.format.format(calendar.getTime());
    }

    private String getDisplayValue(Calendar calendar) {
        return getDisplayValueFormat().format(calendar.getTime());
    }

    private String getDisplayValueFormatPattern() {
        return LocaleUtils.getDay(this.state.getLocaleLanguageTag());
    }

    private SimpleDateFormat getDisplayValueFormat() {
        return new SimpleDateFormat(getDisplayValueFormatPattern(), this.state.getLocale());
    }

    @Override // com.henninghall.date_picker.wheels.Wheel
    public boolean visible() {
        return this.state.getMode() == Mode.datetime;
    }

    @Override // com.henninghall.date_picker.wheels.Wheel
    public String getFormatPattern() {
        return LocaleUtils.getDatePattern(this.state.getLocale()).replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // com.henninghall.date_picker.wheels.Wheel
    public String toDisplayValue(String str) {
        if (str.equals(this.todayValue)) {
            return toTodayString(str);
        }
        return this.displayValues.get(str);
    }

    @Override // com.henninghall.date_picker.wheels.Wheel
    public Paint.Align getTextAlign() {
        return Paint.Align.RIGHT;
    }

    private String toTodayString(String str) {
        String printToday = Utils.printToday(this.state.getLocale());
        return Character.isUpperCase(str.charAt(0)) ? Utils.capitalize(printToday) : printToday;
    }

    private Calendar getInitialDate() {
        Calendar calendar = Calendar.getInstance();
        int minuteInterval = this.state.getMinuteInterval();
        if (minuteInterval <= 1) {
            return calendar;
        }
        int intValue = Integer.valueOf(new SimpleDateFormat("mm", this.state.getLocale()).format(calendar.getTime())).intValue() % minuteInterval;
        int i = minuteInterval - intValue;
        int i2 = -intValue;
        if (minuteInterval / 2 > intValue) {
            i = i2;
        }
        calendar.add(12, i);
        return (Calendar) calendar.clone();
    }
}
