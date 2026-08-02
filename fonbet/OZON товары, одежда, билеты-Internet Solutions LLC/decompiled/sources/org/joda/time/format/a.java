package org.joda.time.format;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.DateTime;
import org.maplibre.android.log.Logger;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, b> f79262a = new ConcurrentHashMap<>();

    static {
        new AtomicReferenceArray(25);
    }

    static void a(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        c(dateTimeFormatterBuilder, str);
    }

    public static b b(String str) {
        b putIfAbsent;
        if (str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification: Pattern is null or empty");
        }
        ConcurrentHashMap<String, b> concurrentHashMap = f79262a;
        b bVar = concurrentHashMap.get(str);
        if (bVar == null) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            c(dateTimeFormatterBuilder, str);
            bVar = dateTimeFormatterBuilder.toFormatter();
            if (concurrentHashMap.size() < 500 && (putIfAbsent = concurrentHashMap.putIfAbsent(str, bVar)) != null) {
                return putIfAbsent;
            }
        }
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e3, code lost:
    
        if (r5 <= 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0147, code lost:
    
        if (r14 <= 2) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z11;
        boolean z12;
        int length = str.length();
        int[] iArr = new int[1];
        int i11 = 0;
        while (i11 < length) {
            iArr[0] = i11;
            String d11 = d(str, iArr);
            int i12 = iArr[0];
            int length2 = d11.length();
            if (length2 == 0) {
                return;
            }
            char charAt = d11.charAt(0);
            if (charAt == '\'') {
                String substring = d11.substring(1);
                if (substring.length() == 1) {
                    dateTimeFormatterBuilder.appendLiteral(substring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.appendLiteral(new String(substring));
                }
            } else if (charAt == 'K') {
                dateTimeFormatterBuilder.appendHourOfHalfday(length2);
            } else if (charAt != 'M') {
                if (charAt == 'S') {
                    dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                } else if (charAt == 'a') {
                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                } else if (charAt == 'h') {
                    dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                } else if (charAt == 'k') {
                    dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                } else if (charAt == 'm') {
                    dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                } else if (charAt == 's') {
                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                } else if (charAt == 'G') {
                    dateTimeFormatterBuilder.appendEraText();
                } else if (charAt != 'H') {
                    if (charAt != 'Y') {
                        if (charAt != 'Z') {
                            if (charAt == 'd') {
                                dateTimeFormatterBuilder.appendDayOfMonth(length2);
                            } else if (charAt != 'e') {
                                switch (charAt) {
                                    case 'C':
                                        dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                        continue;
                                    case 'D':
                                        dateTimeFormatterBuilder.appendDayOfYear(length2);
                                        continue;
                                    case 'E':
                                        if (length2 < 4) {
                                            dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                            break;
                                        } else {
                                            dateTimeFormatterBuilder.appendDayOfWeekText();
                                            continue;
                                        }
                                    default:
                                        switch (charAt) {
                                            case 'w':
                                                dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                                break;
                                            case 'x':
                                            case 'y':
                                                break;
                                            case 'z':
                                                if (length2 < 4) {
                                                    dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                                    break;
                                                } else {
                                                    dateTimeFormatterBuilder.appendTimeZoneName();
                                                    continue;
                                                }
                                            default:
                                                throw new IllegalArgumentException("Illegal pattern component: ".concat(d11));
                                        }
                                }
                            } else {
                                dateTimeFormatterBuilder.appendDayOfWeek(length2);
                            }
                        } else if (length2 == 1) {
                            dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                        } else if (length2 == 2) {
                            dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                        } else {
                            dateTimeFormatterBuilder.appendTimeZoneId();
                        }
                    }
                    if (length2 == 2) {
                        if (i12 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            String d12 = d(str, iArr);
                            int length3 = d12.length();
                            if (length3 > 0) {
                                switch (d12.charAt(0)) {
                                    case 'C':
                                    case 'D':
                                    case 'F':
                                    case 'H':
                                    case 'K':
                                    case 'S':
                                    case 'W':
                                    case 'Y':
                                    case Logger.NONE /* 99 */:
                                    case 'd':
                                    case 'e':
                                    case 'h':
                                    case 'k':
                                    case 'm':
                                    case 's':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                        z12 = true;
                                        break;
                                    case 'M':
                                        break;
                                }
                                z11 = !z12;
                                iArr[0] = iArr[0] - 1;
                            }
                            z12 = false;
                            z11 = !z12;
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z11 = true;
                        }
                        if (charAt != 'x') {
                            DateTime dateTime = new DateTime();
                            dateTimeFormatterBuilder.appendTwoDigitYear(dateTime.getChronology().Y().d(dateTime.getMillis()) - 30, z11);
                        } else {
                            DateTime dateTime2 = new DateTime();
                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(dateTime2.getChronology().T().d(dateTime2.getMillis()) - 30, z11);
                        }
                    } else {
                        int i13 = 9;
                        if (i12 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            String d13 = d(str, iArr);
                            int length4 = d13.length();
                            if (length4 > 0) {
                                switch (d13.charAt(0)) {
                                    case 'M':
                                        break;
                                    case 'C':
                                    case 'D':
                                    case 'F':
                                    case 'H':
                                    case 'K':
                                    case 'S':
                                    case 'W':
                                    case 'Y':
                                    case Logger.NONE /* 99 */:
                                    case 'd':
                                    case 'e':
                                    case 'h':
                                    case 'k':
                                    case 'm':
                                    case 's':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                        i13 = length2;
                                        break;
                                }
                            }
                            iArr[0] = iArr[0] - 1;
                        }
                        if (charAt == 'Y') {
                            dateTimeFormatterBuilder.appendYearOfEra(length2, i13);
                        } else if (charAt == 'x') {
                            dateTimeFormatterBuilder.appendWeekyear(length2, i13);
                        } else if (charAt == 'y') {
                            dateTimeFormatterBuilder.appendYear(length2, i13);
                        }
                    }
                } else {
                    dateTimeFormatterBuilder.appendHourOfDay(length2);
                }
            } else if (length2 < 3) {
                dateTimeFormatterBuilder.appendMonthOfYear(length2);
            } else if (length2 >= 4) {
                dateTimeFormatterBuilder.appendMonthOfYearText();
            } else {
                dateTimeFormatterBuilder.appendMonthOfYearShortText();
            }
            i11 = i12 + 1;
        }
    }

    private static String d(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i11);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb2.append(charAt);
            while (true) {
                int i12 = i11 + 1;
                if (i12 >= length || str.charAt(i12) != charAt) {
                    break;
                }
                sb2.append(charAt);
                i11 = i12;
            }
        } else {
            sb2.append('\'');
            boolean z11 = false;
            while (i11 < length) {
                char charAt2 = str.charAt(i11);
                if (charAt2 != '\'') {
                    if (!z11 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i11--;
                        break;
                    }
                    sb2.append(charAt2);
                } else {
                    int i13 = i11 + 1;
                    if (i13 >= length || str.charAt(i13) != '\'') {
                        z11 = !z11;
                    } else {
                        sb2.append(charAt2);
                        i11 = i13;
                    }
                }
                i11++;
            }
        }
        iArr[0] = i11;
        return sb2.toString();
    }
}
