package net.time4j.format;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import oi.AbstractC5909e;

/* loaded from: classes5.dex */
public abstract class d extends AbstractC5909e {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f57846a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("YEAR_OF_DISPLAY", "L_year");
        hashMap.put("MONTH_AS_NUMBER", "L_month");
        hashMap.put("HOUR_FROM_0_TO_24", "L_hour");
        hashMap.put("DAY_OF_MONTH", "L_day");
        hashMap.put("DAY_OF_DIVISION", "L_day");
        f57846a = Collections.unmodifiableMap(hashMap);
    }

    public d(String str) {
        super(str);
    }
}
