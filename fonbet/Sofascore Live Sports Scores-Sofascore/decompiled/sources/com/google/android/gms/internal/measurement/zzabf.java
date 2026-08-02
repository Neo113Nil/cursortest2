package com.google.android.gms.internal.measurement;

import defpackage.a70;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum zzabf {
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY_PADDED('H'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY('k'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H_PADDED('I'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H('l'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_NANOS_OF_SECOND_PADDED('N'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_AM_PM('p'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_NUMERIC('z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_SHORT('Z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_SECONDS('s'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_MILLIS('Q'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_FULL('B'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT('b'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT_ALT('h'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_FULL('A'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_SHORT('a'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_CENTURY_PADDED('C'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_PADDED('Y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_YEAR_PADDED('j'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_PADDED('m'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH_PADDED('d'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH('e'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES('R'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_MONTH_DAY_YEAR('D'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_YEAR_MONTH_DAY('F'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_FULL('c');

    public static final Map b;
    public final char a;

    static {
        HashMap hashMap = new HashMap();
        for (zzabf zzabfVar : values()) {
            if (hashMap.put(Character.valueOf(zzabfVar.a), zzabfVar) != null) {
                a70.r("duplicate format character: ".concat(String.valueOf(zzabfVar)));
                return;
            }
        }
        b = Collections.unmodifiableMap(hashMap);
    }

    zzabf(char c2) {
        this.a = c2;
    }
}
