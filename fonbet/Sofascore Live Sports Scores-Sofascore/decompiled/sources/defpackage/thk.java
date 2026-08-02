package defpackage;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class thk {
    public static final mqi a = ypa.b(new khk(4));
    public static final mqi b = ypa.b(new khk(5));
    public static final mqi c = ypa.b(new khk(6));

    public static final nhk a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset ofHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                ofHoursMinutesSeconds.getClass();
                return new nhk(ofHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset ofHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                ofHoursMinutesSeconds2.getClass();
                return new nhk(ofHoursMinutesSeconds2);
            }
            ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            ofTotalSeconds.getClass();
            return new nhk(ofTotalSeconds);
        } catch (DateTimeException e) {
            ilg.k(e);
            return null;
        }
    }

    public static final nhk b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new nhk((ZoneOffset) dateTimeFormatter.parse(str, new shk()));
        } catch (DateTimeException e) {
            throw new gk4(e);
        }
    }
}
