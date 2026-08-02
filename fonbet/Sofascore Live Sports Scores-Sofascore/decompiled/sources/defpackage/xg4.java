package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xg4 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");

    public static final lu8 a(Long l) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        calendar.getClass();
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        int i2 = calendar.get(13);
        int i3 = calendar.get(12);
        int i4 = calendar.get(11);
        int i5 = (calendar.get(7) + 5) % 7;
        m2l.a.getClass();
        m2l m2lVar = (m2l) m2l.c.get(i5);
        int i6 = calendar.get(5);
        int i7 = calendar.get(6);
        uxf uxfVar = zuc.a;
        int i8 = calendar.get(2);
        uxfVar.getClass();
        return new lu8(i2, i3, i4, m2lVar, i6, i7, (zuc) zuc.c.get(i8), calendar.get(1), calendar.getTimeInMillis() + i);
    }
}
