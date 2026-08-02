package com.facebook.hermes.intl;

import com.facebook.hermes.intl.IPlatformDateTimeFormatter;
import com.facebook.hermes.intl.OptionHelpers;
import com.twilio.voice.EventKeys;
import h8.InterfaceC4488a;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

@InterfaceC4488a
/* loaded from: classes2.dex */
public class DateTimeFormat {
    private String mCalendar;
    private IPlatformDateTimeFormatter.DateStyle mDateStyle;
    private IPlatformDateTimeFormatter.Day mDay;
    private IPlatformDateTimeFormatter.Era mEra;
    private IPlatformDateTimeFormatter.FormatMatcher mFormatMatcher;
    private IPlatformDateTimeFormatter.Hour mHour;
    private Object mHour12;
    private IPlatformDateTimeFormatter.HourCycle mHourCycle;
    private IPlatformDateTimeFormatter.Minute mMinute;
    private IPlatformDateTimeFormatter.Month mMonth;
    private String mNumberingSystem;
    private IPlatformDateTimeFormatter.Second mSecond;
    private IPlatformDateTimeFormatter.TimeStyle mTimeStyle;
    private IPlatformDateTimeFormatter.TimeZoneName mTimeZoneName;
    private IPlatformDateTimeFormatter.WeekDay mWeekDay;
    private IPlatformDateTimeFormatter.Year mYear;
    private boolean useDefaultCalendar;
    private boolean useDefaultNumberSystem;
    private ILocaleObject<?> mResolvedLocaleObject = null;
    private ILocaleObject<?> mResolvedLocaleObjectForResolvedOptions = null;
    private Object mTimeZone = null;
    IPlatformDateTimeFormatter mPlatformDateTimeFormatter = new PlatformDateTimeFormatterICU();

    @InterfaceC4488a
    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        initializeDateTimeFormat(list, map);
        this.mPlatformDateTimeFormatter.configure(this.mResolvedLocaleObject, this.useDefaultCalendar ? "" : this.mCalendar, this.useDefaultNumberSystem ? "" : this.mNumberingSystem, this.mFormatMatcher, this.mWeekDay, this.mEra, this.mYear, this.mMonth, this.mDay, this.mHour, this.mMinute, this.mSecond, this.mTimeZoneName, this.mHourCycle, this.mTimeZone, this.mDateStyle, this.mTimeStyle, this.mHour12);
    }

    private Object DefaultTimeZone() {
        return this.mPlatformDateTimeFormatter.getDefaultTimeZone(this.mResolvedLocaleObject);
    }

    private Object ToDateTimeOptions(Object obj, String str, String str2) {
        if (!JSObjects.isObject(obj)) {
            throw new JSRangeErrorException("Invalid options object !");
        }
        boolean z10 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i10 = 0; i10 < 4; i10++) {
                if (!JSObjects.isUndefined(JSObjects.Get(obj, strArr[i10]))) {
                    z10 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (!JSObjects.isUndefined(JSObjects.Get(obj, strArr2[i11]))) {
                    z10 = false;
                }
            }
        }
        if (!JSObjects.isUndefined(JSObjects.Get(obj, "dateStyle")) || !JSObjects.isUndefined(JSObjects.Get(obj, "timeStyle"))) {
            z10 = false;
        }
        if (z10 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i12 = 0; i12 < 3; i12++) {
                JSObjects.Put(obj, strArr3[i12], Constants.COLLATION_OPTION_NUMERIC);
            }
        }
        if (z10 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i13 = 0; i13 < 3; i13++) {
                JSObjects.Put(obj, strArr4[i13], Constants.COLLATION_OPTION_NUMERIC);
            }
        }
        return obj;
    }

    private void initializeDateTimeFormat(List<String> list, Map<String, Object> map) {
        List asList = Arrays.asList("ca", "nu", "hc");
        Object ToDateTimeOptions = ToDateTimeOptions(map, "any", "date");
        Object newObject = JSObjects.newObject();
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        JSObjects.Put(newObject, Constants.LOCALEMATCHER, OptionHelpers.GetOption(ToDateTimeOptions, Constants.LOCALEMATCHER, optionType, Constants.LOCALEMATCHER_POSSIBLE_VALUES, Constants.LOCALEMATCHER_BESTFIT));
        Object GetOption = OptionHelpers.GetOption(ToDateTimeOptions, "calendar", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (!JSObjects.isUndefined(GetOption) && !isLocaleIdType(JSObjects.getJavaString(GetOption))) {
            throw new JSRangeErrorException("Invalid calendar option !");
        }
        JSObjects.Put(newObject, "ca", GetOption);
        Object GetOption2 = OptionHelpers.GetOption(ToDateTimeOptions, "numberingSystem", optionType, JSObjects.Undefined(), JSObjects.Undefined());
        if (!JSObjects.isUndefined(GetOption2) && !isLocaleIdType(JSObjects.getJavaString(GetOption2))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        JSObjects.Put(newObject, "nu", GetOption2);
        Object GetOption3 = OptionHelpers.GetOption(ToDateTimeOptions, "hour12", OptionHelpers.OptionType.BOOLEAN, JSObjects.Undefined(), JSObjects.Undefined());
        Object GetOption4 = OptionHelpers.GetOption(ToDateTimeOptions, "hourCycle", optionType, new String[]{"h11", "h12", "h23", "h24"}, JSObjects.Undefined());
        if (!JSObjects.isUndefined(GetOption3)) {
            GetOption4 = JSObjects.Null();
        }
        JSObjects.Put(newObject, "hc", GetOption4);
        HashMap<String, Object> resolveLocale = LocaleResolver.resolveLocale(list, newObject, asList);
        ILocaleObject<?> iLocaleObject = (ILocaleObject) JSObjects.getJavaMap(resolveLocale).get(Constants.LOCALE);
        this.mResolvedLocaleObject = iLocaleObject;
        this.mResolvedLocaleObjectForResolvedOptions = iLocaleObject.cloneObject();
        Object Get = JSObjects.Get(resolveLocale, "ca");
        if (JSObjects.isNull(Get)) {
            this.useDefaultCalendar = true;
            this.mCalendar = this.mPlatformDateTimeFormatter.getDefaultCalendarName(this.mResolvedLocaleObject);
        } else {
            this.useDefaultCalendar = false;
            this.mCalendar = JSObjects.getJavaString(Get);
        }
        Object Get2 = JSObjects.Get(resolveLocale, "nu");
        if (JSObjects.isNull(Get2)) {
            this.useDefaultNumberSystem = true;
            this.mNumberingSystem = this.mPlatformDateTimeFormatter.getDefaultNumberingSystem(this.mResolvedLocaleObject);
        } else {
            this.useDefaultNumberSystem = false;
            this.mNumberingSystem = JSObjects.getJavaString(Get2);
        }
        Object Get3 = JSObjects.Get(resolveLocale, "hc");
        Object Get4 = JSObjects.Get(ToDateTimeOptions, "timeZone");
        this.mTimeZone = JSObjects.isUndefined(Get4) ? DefaultTimeZone() : normalizeTimeZone(Get4.toString());
        this.mFormatMatcher = (IPlatformDateTimeFormatter.FormatMatcher) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.FormatMatcher.class, JSObjects.getJavaString(OptionHelpers.GetOption(ToDateTimeOptions, "formatMatcher", optionType, new String[]{"basic", Constants.LOCALEMATCHER_BESTFIT}, Constants.LOCALEMATCHER_BESTFIT)));
        this.mWeekDay = (IPlatformDateTimeFormatter.WeekDay) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.WeekDay.class, OptionHelpers.GetOption(ToDateTimeOptions, "weekday", optionType, new String[]{"long", "short", "narrow"}, JSObjects.Undefined()));
        this.mEra = (IPlatformDateTimeFormatter.Era) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Era.class, OptionHelpers.GetOption(ToDateTimeOptions, "era", optionType, new String[]{"long", "short", "narrow"}, JSObjects.Undefined()));
        this.mYear = (IPlatformDateTimeFormatter.Year) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Year.class, OptionHelpers.GetOption(ToDateTimeOptions, "year", optionType, new String[]{Constants.COLLATION_OPTION_NUMERIC, "2-digit"}, JSObjects.Undefined()));
        this.mMonth = (IPlatformDateTimeFormatter.Month) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Month.class, OptionHelpers.GetOption(ToDateTimeOptions, "month", optionType, new String[]{Constants.COLLATION_OPTION_NUMERIC, "2-digit", "long", "short", "narrow"}, JSObjects.Undefined()));
        this.mDay = (IPlatformDateTimeFormatter.Day) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Day.class, OptionHelpers.GetOption(ToDateTimeOptions, "day", optionType, new String[]{Constants.COLLATION_OPTION_NUMERIC, "2-digit"}, JSObjects.Undefined()));
        Object GetOption5 = OptionHelpers.GetOption(ToDateTimeOptions, "hour", optionType, new String[]{Constants.COLLATION_OPTION_NUMERIC, "2-digit"}, JSObjects.Undefined());
        this.mHour = (IPlatformDateTimeFormatter.Hour) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Hour.class, GetOption5);
        this.mMinute = (IPlatformDateTimeFormatter.Minute) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Minute.class, OptionHelpers.GetOption(ToDateTimeOptions, "minute", optionType, new String[]{Constants.COLLATION_OPTION_NUMERIC, "2-digit"}, JSObjects.Undefined()));
        this.mSecond = (IPlatformDateTimeFormatter.Second) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.Second.class, OptionHelpers.GetOption(ToDateTimeOptions, "second", optionType, new String[]{Constants.COLLATION_OPTION_NUMERIC, "2-digit"}, JSObjects.Undefined()));
        this.mTimeZoneName = (IPlatformDateTimeFormatter.TimeZoneName) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.TimeZoneName.class, OptionHelpers.GetOption(ToDateTimeOptions, "timeZoneName", optionType, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, JSObjects.Undefined()));
        this.mDateStyle = (IPlatformDateTimeFormatter.DateStyle) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.DateStyle.class, OptionHelpers.GetOption(ToDateTimeOptions, "dateStyle", optionType, new String[]{"full", "long", "medium", "short"}, JSObjects.Undefined()));
        Object GetOption6 = OptionHelpers.GetOption(ToDateTimeOptions, "timeStyle", optionType, new String[]{"full", "long", "medium", "short"}, JSObjects.Undefined());
        this.mTimeStyle = (IPlatformDateTimeFormatter.TimeStyle) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.TimeStyle.class, GetOption6);
        if (JSObjects.isUndefined(GetOption5) && JSObjects.isUndefined(GetOption6)) {
            this.mHourCycle = IPlatformDateTimeFormatter.HourCycle.UNDEFINED;
        } else {
            IPlatformDateTimeFormatter.HourCycle defaultHourCycle = this.mPlatformDateTimeFormatter.getDefaultHourCycle(this.mResolvedLocaleObject);
            IPlatformDateTimeFormatter.HourCycle hourCycle = JSObjects.isNull(Get3) ? defaultHourCycle : (IPlatformDateTimeFormatter.HourCycle) OptionHelpers.searchEnum(IPlatformDateTimeFormatter.HourCycle.class, Get3);
            if (!JSObjects.isUndefined(GetOption3)) {
                if (JSObjects.getJavaBoolean(GetOption3)) {
                    hourCycle = IPlatformDateTimeFormatter.HourCycle.H11;
                    if (defaultHourCycle != hourCycle && defaultHourCycle != IPlatformDateTimeFormatter.HourCycle.H23) {
                        hourCycle = IPlatformDateTimeFormatter.HourCycle.H12;
                    }
                } else {
                    hourCycle = (defaultHourCycle == IPlatformDateTimeFormatter.HourCycle.H11 || defaultHourCycle == IPlatformDateTimeFormatter.HourCycle.H23) ? IPlatformDateTimeFormatter.HourCycle.H23 : IPlatformDateTimeFormatter.HourCycle.H24;
                }
            }
            this.mHourCycle = hourCycle;
        }
        this.mHour12 = GetOption3;
    }

    private boolean isLocaleIdType(String str) {
        return IntlTextUtils.isUnicodeExtensionKeyTypeItem(str, 0, str.length() - 1);
    }

    @InterfaceC4488a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String javaString = JSObjects.getJavaString(OptionHelpers.GetOption(map, Constants.LOCALEMATCHER, OptionHelpers.OptionType.STRING, Constants.LOCALEMATCHER_POSSIBLE_VALUES, Constants.LOCALEMATCHER_BESTFIT));
        String[] strArr = new String[list.size()];
        return javaString.equals(Constants.LOCALEMATCHER_BESTFIT) ? Arrays.asList(LocaleMatcher.bestFitSupportedLocales((String[]) list.toArray(strArr))) : Arrays.asList(LocaleMatcher.lookupSupportedLocales((String[]) list.toArray(strArr)));
    }

    @InterfaceC4488a
    public String format(double d10) {
        return this.mPlatformDateTimeFormatter.format(d10);
    }

    @InterfaceC4488a
    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator formatToParts = this.mPlatformDateTimeFormatter.formatToParts(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = formatToParts.first(); first != 65535; first = formatToParts.next()) {
            sb2.append(first);
            if (formatToParts.getIndex() + 1 == formatToParts.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = formatToParts.getAttributes().keySet().iterator();
                String fieldToString = it.hasNext() ? this.mPlatformDateTimeFormatter.fieldToString(it.next(), sb2.toString()) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", fieldToString);
                hashMap.put(EventKeys.VALUE_KEY, sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public String normalizeTimeZone(String str) {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (normalizeTimeZoneName(str2).equals(normalizeTimeZoneName(str))) {
                return str2;
            }
        }
        throw new JSRangeErrorException("Invalid timezone name!");
    }

    public String normalizeTimeZoneName(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 'A' || charAt > 'Z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt + ' '));
            }
        }
        return sb2.toString();
    }

    @InterfaceC4488a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.LOCALE, this.mResolvedLocaleObjectForResolvedOptions.toCanonicalTag());
        linkedHashMap.put("numberingSystem", this.mNumberingSystem);
        linkedHashMap.put("calendar", this.mCalendar);
        linkedHashMap.put("timeZone", this.mTimeZone);
        IPlatformDateTimeFormatter.HourCycle hourCycle = this.mHourCycle;
        if (hourCycle != IPlatformDateTimeFormatter.HourCycle.UNDEFINED) {
            linkedHashMap.put("hourCycle", hourCycle.toString());
            IPlatformDateTimeFormatter.HourCycle hourCycle2 = this.mHourCycle;
            if (hourCycle2 == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycle2 == IPlatformDateTimeFormatter.HourCycle.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        IPlatformDateTimeFormatter.WeekDay weekDay = this.mWeekDay;
        if (weekDay != IPlatformDateTimeFormatter.WeekDay.UNDEFINED) {
            linkedHashMap.put("weekday", weekDay.toString());
        }
        IPlatformDateTimeFormatter.Era era = this.mEra;
        if (era != IPlatformDateTimeFormatter.Era.UNDEFINED) {
            linkedHashMap.put("era", era.toString());
        }
        IPlatformDateTimeFormatter.Year year = this.mYear;
        if (year != IPlatformDateTimeFormatter.Year.UNDEFINED) {
            linkedHashMap.put("year", year.toString());
        }
        IPlatformDateTimeFormatter.Month month = this.mMonth;
        if (month != IPlatformDateTimeFormatter.Month.UNDEFINED) {
            linkedHashMap.put("month", month.toString());
        }
        IPlatformDateTimeFormatter.Day day = this.mDay;
        if (day != IPlatformDateTimeFormatter.Day.UNDEFINED) {
            linkedHashMap.put("day", day.toString());
        }
        IPlatformDateTimeFormatter.Hour hour = this.mHour;
        if (hour != IPlatformDateTimeFormatter.Hour.UNDEFINED) {
            linkedHashMap.put("hour", hour.toString());
        }
        IPlatformDateTimeFormatter.Minute minute = this.mMinute;
        if (minute != IPlatformDateTimeFormatter.Minute.UNDEFINED) {
            linkedHashMap.put("minute", minute.toString());
        }
        IPlatformDateTimeFormatter.Second second = this.mSecond;
        if (second != IPlatformDateTimeFormatter.Second.UNDEFINED) {
            linkedHashMap.put("second", second.toString());
        }
        IPlatformDateTimeFormatter.TimeZoneName timeZoneName = this.mTimeZoneName;
        if (timeZoneName != IPlatformDateTimeFormatter.TimeZoneName.UNDEFINED) {
            linkedHashMap.put("timeZoneName", timeZoneName.toString());
        }
        IPlatformDateTimeFormatter.DateStyle dateStyle = this.mDateStyle;
        if (dateStyle != IPlatformDateTimeFormatter.DateStyle.UNDEFINED) {
            linkedHashMap.put("dateStyle", dateStyle.toString());
        }
        IPlatformDateTimeFormatter.TimeStyle timeStyle = this.mTimeStyle;
        if (timeStyle != IPlatformDateTimeFormatter.TimeStyle.UNDEFINED) {
            linkedHashMap.put("timeStyle", timeStyle.toString());
        }
        return linkedHashMap;
    }
}
