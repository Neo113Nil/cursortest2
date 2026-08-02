package net.time4j.tz;

import androidx.media3.extractor.ts.PsExtractor;
import com.tencent.mmkv.MMKV;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.time.TimeZones;
import org.chromium.net.NetError;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes10.dex */
public final class ZonalOffset implements Comparable<ZonalOffset>, TZID, Serializable {
    private static final BigDecimal DECIMAL_240;
    private static final BigDecimal DECIMAL_3600;
    private static final BigDecimal DECIMAL_60;
    private static final BigDecimal DECIMAL_NEG_180;
    private static final BigDecimal DECIMAL_POS_180;
    private static final BigDecimal MRD;
    private static final ConcurrentMap<Integer, ZonalOffset> OFFSET_CACHE;
    public static final ZonalOffset UTC;
    private static final long serialVersionUID = -1410512619471503090L;
    private final transient int fraction;
    private final transient String name;
    private final transient int total;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        OFFSET_CACHE = concurrentHashMap;
        DECIMAL_60 = new BigDecimal(60);
        DECIMAL_3600 = new BigDecimal(MMKV.ExpireInHour);
        DECIMAL_NEG_180 = new BigDecimal(NetError.ERR_TLS13_DOWNGRADE_DETECTED);
        DECIMAL_POS_180 = new BigDecimal(180);
        DECIMAL_240 = new BigDecimal(PsExtractor.VIDEO_STREAM_MASK);
        MRD = new BigDecimal(1000000000);
        ZonalOffset zonalOffset = new ZonalOffset(0, 0);
        UTC = zonalOffset;
        concurrentHashMap.put(0, zonalOffset);
    }

    private ZonalOffset(int i, int i2) {
        if (i2 != 0) {
            if (Math.abs(i2) > 999999999) {
                throw new IllegalArgumentException("Fraction out of range: " + i2);
            }
            if (i < -39600 || i > 39600) {
                throw new IllegalArgumentException("Total seconds out of range while fraction is non-zero: " + i);
            }
            if ((i < 0 && i2 > 0) || (i > 0 && i2 < 0)) {
                throw new IllegalArgumentException("Different signs: offset=" + i + ", fraction=" + i2);
            }
        } else if (i < -64800 || i > 64800) {
            throw new IllegalArgumentException("Total seconds out of range: " + i);
        }
        boolean z = i < 0 || i2 < 0;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? '-' : SignatureVisitor.EXTENDS);
        int abs = Math.abs(i);
        int i3 = abs / MMKV.ExpireInHour;
        int i4 = (abs / 60) % 60;
        int i5 = abs % 60;
        if (i3 < 10) {
            sb.append('0');
        }
        sb.append(i3);
        sb.append(AbstractJsonLexerKt.COLON);
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        if (i5 != 0 || i2 != 0) {
            sb.append(AbstractJsonLexerKt.COLON);
            if (i5 < 10) {
                sb.append('0');
            }
            sb.append(i5);
            if (i2 != 0) {
                sb.append('.');
                String valueOf = String.valueOf(Math.abs(i2));
                int length = 9 - valueOf.length();
                for (int i6 = 0; i6 < length; i6++) {
                    sb.append('0');
                }
                sb.append(valueOf);
            }
        }
        this.name = sb.toString();
        this.total = i;
        this.fraction = i2;
    }

    public static ZonalOffset atLongitude(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(DECIMAL_POS_180) > 0 || bigDecimal.compareTo(DECIMAL_NEG_180) < 0) {
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
        BigDecimal multiply = bigDecimal.multiply(DECIMAL_240);
        BigDecimal scale = multiply.setScale(0, RoundingMode.DOWN);
        BigDecimal multiply2 = multiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(MRD);
        int intValueExact = scale.intValueExact();
        int intValueExact2 = multiply2.intValueExact();
        if (intValueExact2 == 0) {
            return ofTotalSeconds(intValueExact);
        }
        if (intValueExact2 == 1000000000) {
            return ofTotalSeconds(intValueExact + 1);
        }
        if (intValueExact2 == -1000000000) {
            return ofTotalSeconds(intValueExact - 1);
        }
        return new ZonalOffset(intValueExact, intValueExact2);
    }

    public static ZonalOffset atLongitude(OffsetSign offsetSign, int i, int i2, double d) {
        if (offsetSign == null) {
            throw new NullPointerException("Missing sign.");
        }
        if (i < 0 || i > 180) {
            throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
        }
        if (i2 < 0 || i2 > 59) {
            throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
        }
        if (Double.compare(d, 0.0d) < 0 || Double.compare(d, 60.0d) >= 0) {
            throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
        }
        BigDecimal valueOf = BigDecimal.valueOf(i);
        if (i2 != 0) {
            valueOf = valueOf.add(BigDecimal.valueOf(i2).setScale(15, RoundingMode.UNNECESSARY).divide(DECIMAL_60, RoundingMode.HALF_UP));
        }
        if (d != 0.0d) {
            valueOf = valueOf.add(BigDecimal.valueOf(d).setScale(15, RoundingMode.FLOOR).divide(DECIMAL_3600, RoundingMode.HALF_UP));
        }
        if (offsetSign == OffsetSign.BEHIND_UTC) {
            valueOf = valueOf.negate();
        }
        return atLongitude(valueOf);
    }

    public static ZonalOffset ofHours(OffsetSign offsetSign, int i) {
        return ofHoursMinutes(offsetSign, i, 0);
    }

    public static ZonalOffset ofHoursMinutes(OffsetSign offsetSign, int i, int i2) {
        if (offsetSign == null) {
            throw new NullPointerException("Missing sign.");
        }
        if (i < 0 || i > 18) {
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + format(i, i2));
        }
        if (i2 < 0 || i2 > 59) {
            throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + format(i, i2));
        }
        if (i == 18 && i2 != 0) {
            throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + format(i, i2));
        }
        int i3 = (i * MMKV.ExpireInHour) + (i2 * 60);
        if (offsetSign == OffsetSign.BEHIND_UTC) {
            i3 = -i3;
        }
        return ofTotalSeconds(i3);
    }

    public static ZonalOffset ofTotalSeconds(int i) {
        return ofTotalSeconds(i, 0);
    }

    public static ZonalOffset ofTotalSeconds(int i, int i2) {
        if (i2 != 0) {
            return new ZonalOffset(i, i2);
        }
        if (i == 0) {
            return UTC;
        }
        if (i % 900 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap<Integer, ZonalOffset> concurrentMap = OFFSET_CACHE;
            ZonalOffset zonalOffset = concurrentMap.get(valueOf);
            if (zonalOffset != null) {
                return zonalOffset;
            }
            concurrentMap.putIfAbsent(valueOf, new ZonalOffset(i, 0));
            return concurrentMap.get(valueOf);
        }
        return new ZonalOffset(i, 0);
    }

    public OffsetSign getSign() {
        return (this.total < 0 || this.fraction < 0) ? OffsetSign.BEHIND_UTC : OffsetSign.AHEAD_OF_UTC;
    }

    public int getAbsoluteHours() {
        return Math.abs(this.total) / MMKV.ExpireInHour;
    }

    public int getAbsoluteMinutes() {
        return (Math.abs(this.total) / 60) % 60;
    }

    public int getAbsoluteSeconds() {
        return Math.abs(this.total) % 60;
    }

    public int getIntegralAmount() {
        return this.total;
    }

    public int getFractionalAmount() {
        return this.fraction;
    }

    @Override // java.lang.Comparable
    public int compareTo(ZonalOffset zonalOffset) {
        int i = this.total;
        int i2 = zonalOffset.total;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.fraction - zonalOffset.fraction;
        if (i3 < 0) {
            return -1;
        }
        return i3 == 0 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonalOffset) {
            ZonalOffset zonalOffset = (ZonalOffset) obj;
            if (this.total == zonalOffset.total && this.fraction == zonalOffset.fraction) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (~this.total) + (this.fraction % 64000);
    }

    public String toString() {
        return this.name;
    }

    @Override // net.time4j.tz.TZID
    public String canonical() {
        if (this.total == 0 && this.fraction == 0) {
            return "Z";
        }
        return "UTC" + this.name;
    }

    public static ZonalOffset parse(String str) {
        return parse(str, true);
    }

    public String getStdFormatPattern(Locale locale) {
        boolean z = this.total == 0 && this.fraction == 0;
        try {
            return Timezone.NAME_PROVIDER.getStdFormatPattern(z, locale);
        } catch (Throwable unused) {
            return z ? TimeZones.GMT_ID : "GMT±hh:mm";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static ZonalOffset parse(String str, boolean z) {
        String str2;
        OffsetSign offsetSign;
        int parse;
        int parse2;
        if (str.equals("Z")) {
            return UTC;
        }
        int length = str.length();
        if (length >= 3) {
            if (str.startsWith("UTC")) {
                str2 = str.substring(3);
                length -= 3;
                if (length >= 2) {
                    if (str2.charAt(0) == '-') {
                        offsetSign = OffsetSign.BEHIND_UTC;
                    } else {
                        offsetSign = str2.charAt(0) == '+' ? OffsetSign.AHEAD_OF_UTC : null;
                    }
                    int parse3 = parse(str2, 1, 2);
                    if (parse3 >= 0) {
                        if (length <= 3) {
                            return ofHours(offsetSign, parse3);
                        }
                        int i = str2.charAt(2) != ':' ? 4 : 3;
                        int parse4 = parse(str2, i, 2);
                        if (str2.charAt(i - 1) == ':' && parse4 >= 0) {
                            int i2 = i + 2;
                            if (length == i2) {
                                return ofHoursMinutes(offsetSign, parse3, parse4);
                            }
                            int i3 = i + 5;
                            if (length >= i3 && str2.charAt(i2) == ':' && (parse = parse(str2, i + 3, 2)) >= 0) {
                                int i4 = (parse3 * MMKV.ExpireInHour) + (parse4 * 60) + parse;
                                if (offsetSign == OffsetSign.BEHIND_UTC) {
                                    i4 = -i4;
                                }
                                if (length == i3) {
                                    return ofTotalSeconds(i4);
                                }
                                if (length == i + 15 && str2.charAt(i3) == '.' && (parse2 = parse(str2, i + 6, 9)) >= 0) {
                                    if (offsetSign == OffsetSign.BEHIND_UTC) {
                                        parse2 = -parse2;
                                    }
                                    return ofTotalSeconds(i4, parse2);
                                }
                            }
                        }
                    }
                }
                if (z) {
                    return null;
                }
                throw new IllegalArgumentException("No canonical zonal offset: " + str);
            }
            if (str.startsWith(TimeZones.GMT_ID)) {
                if (!z) {
                    return null;
                }
                throw new IllegalArgumentException("Use UTC-prefix for canonical offset instead: " + str);
            }
        }
        str2 = str;
        if (length >= 2) {
        }
        if (z) {
        }
    }

    SingleOffsetTimezone getModel() {
        return SingleOffsetTimezone.of(this);
    }

    private static int parse(String str, int i, int i2) {
        int min = Math.min(str.length() - i, i2);
        int i3 = -1;
        for (int i4 = 0; i4 < min; i4++) {
            char charAt = str.charAt(i + i4);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3 = i3 == -1 ? charAt - '0' : (i3 * 10) + (charAt - '0');
        }
        return i3;
    }

    private static String format(int i, int i2) {
        return "[hours=" + i + ",minutes=" + i2 + AbstractJsonLexerKt.END_LIST;
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }
}
