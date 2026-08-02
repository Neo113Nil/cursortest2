package org.joda.time.tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Locale, Map<String, Map<String, Object>>> f79401a = c();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<Locale, Map<String, Map<Boolean, Object>>> f79402b = c();

    private static HashMap c() {
        return new HashMap(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    private synchronized String[] e(String str, String str2, boolean z11, Locale locale) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == null) {
            return null;
        }
        try {
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = this.f79402b.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> hashMap = this.f79402b;
                HashMap c11 = c();
                hashMap.put(locale, c11);
                map = c11;
            }
            ?? r22 = (Map) map.get(str);
            if (r22 == 0) {
                r22 = c();
                map.put(str, r22);
                String[][] zoneStrings = org.joda.time.c.a(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i11];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i11++;
                }
                String[][] zoneStrings2 = org.joda.time.c.a(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length2) {
                        String[] strArr3 = zoneStrings2[i12];
                        if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                            strArr2 = strArr3;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    r22.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    r22.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) r22.get(Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    private synchronized String[] f(Locale locale, String str, String str2) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == 0) {
            return null;
        }
        try {
            Map map = this.f79401a.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<String, Object>>> hashMap = this.f79401a;
                HashMap c11 = c();
                hashMap.put(locale, c11);
                map = c11;
            }
            ?? r22 = (Map) map.get(str);
            if (r22 == 0) {
                r22 = c();
                map.put(str, r22);
                String[][] zoneStrings = org.joda.time.c.a(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i11];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i11++;
                }
                String[][] zoneStrings2 = org.joda.time.c.a(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length2) {
                        String[] strArr3 = zoneStrings2[i12];
                        if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                            strArr2 = strArr3;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    r22.put(strArr[2], new String[]{strArr2[2], strArr2[1]});
                    if (strArr[2].equals(strArr[4])) {
                        r22.put(strArr[4] + "-Summer", new String[]{strArr2[4], strArr2[3]});
                    } else {
                        r22.put(strArr[4], new String[]{strArr2[4], strArr2[3]});
                    }
                }
            }
            return (String[]) r22.get(str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.joda.time.tz.b
    public final String a(Locale locale, String str, String str2) {
        String[] f7 = f(locale, str, str2);
        if (f7 == null) {
            return null;
        }
        return f7[0];
    }

    @Override // org.joda.time.tz.b
    public final String b(Locale locale, String str, String str2) {
        String[] f7 = f(locale, str, str2);
        if (f7 == null) {
            return null;
        }
        return f7[1];
    }

    public final String d(String str, String str2, boolean z11, Locale locale) {
        String[] e11 = e(str, str2, z11, locale);
        if (e11 == null) {
            return null;
        }
        return e11[1];
    }

    public final String g(String str, String str2, boolean z11, Locale locale) {
        String[] e11 = e(str, str2, z11, locale);
        if (e11 == null) {
            return null;
        }
        return e11[0];
    }
}
