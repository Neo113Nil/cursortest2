package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.po0;
import defpackage.wt3;
import defpackage.wv8;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3551kh {
    public static int a = Integer.MIN_VALUE;
    public static Boolean b = null;
    public static String c = null;
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static int i = Integer.MIN_VALUE;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static Location n;

    public static HashMap a() {
        HashMap hashMap = new HashMap();
        int i2 = a;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            Context context = AbstractC3424fj.a;
            if (context == null) {
                i2 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                i2 = Pa.a(context, "user_info_store").a.getInt("user_age", Integer.MIN_VALUE);
            }
            a = i2;
        }
        if (i2 > 0) {
            hashMap.put("u-age", String.valueOf(i2));
        }
        int i4 = i;
        if (i4 == Integer.MIN_VALUE) {
            Context context2 = AbstractC3424fj.a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                i3 = Pa.a(context2, "user_info_store").a.getInt("user_yob", Integer.MIN_VALUE);
            }
            i = i3;
            i4 = i3;
        }
        if (i4 > 0) {
            hashMap.put("u-yearofbirth", String.valueOf(i4));
        }
        String str = f;
        String str2 = null;
        if (str == null) {
            Context context3 = AbstractC3424fj.a;
            if (context3 == null) {
                str = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = Qa.b;
                str = Pa.a(context3, "user_info_store").a.getString("user_city_code", null);
            }
            f = str;
        }
        String str3 = g;
        if (str3 == null) {
            Context context4 = AbstractC3424fj.a;
            if (context4 == null) {
                str3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = Qa.b;
                str3 = Pa.a(context4, "user_info_store").a.getString("user_state_code", null);
            }
            g = str3;
        }
        String str4 = h;
        if (str4 == null) {
            Context context5 = AbstractC3424fj.a;
            if (context5 == null) {
                str4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = Qa.b;
                str4 = Pa.a(context5, "user_info_store").a.getString("user_country_code", null);
            }
            h = str4;
        }
        String a2 = a(str, str3, str4);
        int length = a2.length() - 1;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            boolean z3 = Intrinsics.d(a2.charAt(!z2 ? i5 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i5++;
            } else {
                z2 = true;
            }
        }
        if (a2.subSequence(i5, length + 1).toString().length() > 0) {
            hashMap.put("u-location", a2);
        }
        String str5 = c;
        if (str5 == null) {
            Context context6 = AbstractC3424fj.a;
            if (context6 == null) {
                str5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = Qa.b;
                str5 = Pa.a(context6, "user_info_store").a.getString("user_age_group", null);
            }
            c = str5;
        }
        if (str5 != null) {
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            String lowerCase = str5.toLowerCase(locale);
            lowerCase.getClass();
            hashMap.put("u-agegroup", lowerCase);
        }
        String str6 = d;
        if (str6 == null) {
            Context context7 = AbstractC3424fj.a;
            if (context7 == null) {
                str6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = Qa.b;
                str6 = Pa.a(context7, "user_info_store").a.getString("user_area_code", null);
            }
            d = str6;
        }
        if (str6 != null) {
            hashMap.put("u-areacode", str6);
        }
        String str7 = e;
        if (str7 == null) {
            Context context8 = AbstractC3424fj.a;
            if (context8 == null) {
                str7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = Qa.b;
                str7 = Pa.a(context8, "user_info_store").a.getString("user_post_code", null);
            }
            e = str7;
        }
        if (str7 != null) {
            hashMap.put("u-postalcode", str7);
        }
        String str8 = j;
        if (str8 == null) {
            Context context9 = AbstractC3424fj.a;
            if (context9 == null) {
                str8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = Qa.b;
                str8 = Pa.a(context9, "user_info_store").a.getString("user_gender", null);
            }
            j = str8;
        }
        if (str8 != null) {
            hashMap.put("u-gender", str8);
        }
        String str9 = k;
        if (str9 == null) {
            Context context10 = AbstractC3424fj.a;
            if (context10 == null) {
                str9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = Qa.b;
                str9 = Pa.a(context10, "user_info_store").a.getString("user_education", null);
            }
            k = str9;
        }
        if (str9 != null) {
            hashMap.put("u-education", str9);
        }
        String str10 = l;
        if (str10 == null) {
            Context context11 = AbstractC3424fj.a;
            if (context11 == null) {
                str10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = Qa.b;
                str10 = Pa.a(context11, "user_info_store").a.getString("user_language", null);
            }
            l = str10;
        }
        if (str10 != null) {
            hashMap.put("u-language", str10);
        }
        String str11 = m;
        if (str11 == null) {
            Context context12 = AbstractC3424fj.a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = Qa.b;
                str2 = Pa.a(context12, "user_info_store").a.getString("user_interest", null);
            }
            m = str2;
            str11 = str2;
        }
        if (str11 != null) {
            hashMap.put("u-interests", str11);
        }
        Boolean bool = b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            Context context13 = AbstractC3424fj.a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = Qa.b;
                b = Boolean.valueOf(Pa.a(context13, "user_info_store").a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = b;
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
        }
        hashMap.put("u-age-restricted", z ? "1" : "0");
        return hashMap;
    }

    public static Location b() {
        Location location = n;
        if (location != null) {
            return location;
        }
        Context context = AbstractC3424fj.a;
        Location location2 = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            String string = Pa.a(context, "user_info_store").a.getString("user_location", null);
            if (string != null) {
                Location location3 = new Location("");
                try {
                    String[] strArr = (String[]) new Regex(BlazeDataSourcePersonalizedType.STRING_SEPARATOR).h(string).toArray(new String[0]);
                    location3.setLatitude(Double.parseDouble(strArr[0]));
                    location3.setLongitude(Double.parseDouble(strArr[1]));
                    location3.setAccuracy(Float.parseFloat(strArr[2]));
                    location3.setTime(Long.parseLong(strArr[3]));
                    location2 = location3;
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
                }
                n = location2;
                return location2;
            }
        }
        return null;
    }

    public static final void a(Context context, boolean z) {
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa.a(Pa.a(context, "user_info_store"), "user_age_restricted", z);
    }

    public static void a(boolean z) {
        b = Boolean.valueOf(z);
        Context context = AbstractC3424fj.a;
        if (context != null) {
            AbstractC3424fj.g.submit(new po0(context, z, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str, String str2, String str3) {
        String str4;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.d(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() > 0) {
                int length2 = str.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (i3 <= length2) {
                    boolean z4 = Intrinsics.d(str.charAt(!z3 ? i3 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i3++;
                    } else {
                        z3 = true;
                    }
                }
                str4 = str.subSequence(i3, length2 + 1).toString();
                if (str2 != null) {
                    int length3 = str2.length() - 1;
                    int i4 = 0;
                    boolean z5 = false;
                    while (i4 <= length3) {
                        boolean z6 = Intrinsics.d(str2.charAt(!z5 ? i4 : length3), 32) <= 0;
                        if (z5) {
                            if (!z6) {
                                break;
                            }
                            length3--;
                        } else if (z6) {
                            i4++;
                        } else {
                            z5 = true;
                        }
                    }
                    if (str2.subSequence(i4, length3 + 1).toString().length() > 0) {
                        int length4 = str2.length() - 1;
                        int i5 = 0;
                        boolean z7 = false;
                        while (i5 <= length4) {
                            boolean z8 = Intrinsics.d(str2.charAt(!z7 ? i5 : length4), 32) <= 0;
                            if (z7) {
                                if (!z8) {
                                    break;
                                }
                                length4--;
                            } else if (z8) {
                                i5++;
                            } else {
                                z7 = true;
                            }
                        }
                        str4 = wv8.i(str4, "-", str2.subSequence(i5, length4 + 1).toString());
                    }
                }
                if (str3 != null) {
                    return str4;
                }
                int length5 = str3.length() - 1;
                int i6 = 0;
                boolean z9 = false;
                while (i6 <= length5) {
                    boolean z10 = Intrinsics.d(str3.charAt(!z9 ? i6 : length5), 32) <= 0;
                    if (z9) {
                        if (!z10) {
                            break;
                        }
                        length5--;
                    } else if (z10) {
                        i6++;
                    } else {
                        z9 = true;
                    }
                }
                if (str3.subSequence(i6, length5 + 1).toString().length() <= 0) {
                    return str4;
                }
                int length6 = str3.length() - 1;
                int i7 = 0;
                boolean z11 = false;
                while (i7 <= length6) {
                    boolean z12 = Intrinsics.d(str3.charAt(!z11 ? i7 : length6), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        }
                        length6--;
                    } else if (z12) {
                        i7++;
                    } else {
                        z11 = true;
                    }
                }
                return wv8.i(str4, "-", str3.subSequence(i7, length6 + 1).toString());
            }
        }
        str4 = "";
        if (str2 != null) {
        }
        if (str3 != null) {
        }
    }

    public static String a(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        int accuracy = (int) location.getAccuracy();
        long time = location.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(latitude);
        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        sb.append(longitude);
        wt3.u(accuracy, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, sb);
        sb.append(time);
        return sb.toString();
    }
}
