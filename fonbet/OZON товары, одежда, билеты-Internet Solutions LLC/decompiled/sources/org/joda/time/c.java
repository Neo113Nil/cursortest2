package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<Map<String, DateTimeZone>> f79051a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f79052b = 0;

    public static final DateFormatSymbols a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final Map<String, DateTimeZone> b() {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = f79051a;
        Map<String, DateTimeZone> map = atomicReference.get();
        if (map == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            DateTimeZone dateTimeZone = DateTimeZone.f78989a;
            linkedHashMap.put("UT", dateTimeZone);
            linkedHashMap.put("UTC", dateTimeZone);
            linkedHashMap.put("GMT", dateTimeZone);
            d("EST", "America/New_York", linkedHashMap);
            d("EDT", "America/New_York", linkedHashMap);
            d("CST", "America/Chicago", linkedHashMap);
            d("CDT", "America/Chicago", linkedHashMap);
            d("MST", "America/Denver", linkedHashMap);
            d("MDT", "America/Denver", linkedHashMap);
            d("PST", "America/Los_Angeles", linkedHashMap);
            d("PDT", "America/Los_Angeles", linkedHashMap);
            map = Collections.unmodifiableMap(linkedHashMap);
            if (!J.d.e(atomicReference, map)) {
                return atomicReference.get();
            }
        }
        return map;
    }

    public static final long c(h hVar) {
        return hVar == null ? System.currentTimeMillis() : hVar.getMillis();
    }

    private static void d(String str, String str2, LinkedHashMap linkedHashMap) {
        try {
            linkedHashMap.put(str, DateTimeZone.d(str2));
        } catch (RuntimeException unused) {
        }
    }
}
