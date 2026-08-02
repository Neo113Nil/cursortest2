package o6;

import T7.A;
import T7.C1682w;
import T7.Y;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.devsupport.StackTraceHelper;
import g6.C4331C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5817b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f59350b;

    /* renamed from: c, reason: collision with root package name */
    public static JSONArray f59351c;

    /* renamed from: a, reason: collision with root package name */
    public static final C5817b f59349a = new C5817b();

    @NotNull
    private static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    public static final void a() {
        if (Y7.a.d(C5817b.class)) {
            return;
        }
        try {
            f59349a.g();
            if (f59351c != null) {
                f59350b = true;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x0049, B:16:0x005c, B:19:0x0072, B:22:0x0088, B:26:0x0042, B:29:0x002b), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Bundle params, String event) {
        String language;
        Locale I10;
        String country;
        String Q10;
        String str;
        String Q11;
        if (Y7.a.d(C5817b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString("event", event);
            StringBuilder sb2 = new StringBuilder();
            Y y10 = Y.f11042a;
            Locale I11 = y10.I();
            String str2 = "";
            if (I11 != null) {
                language = I11.getLanguage();
                if (language == null) {
                }
                sb2.append(language);
                sb2.append('_');
                I10 = y10.I();
                if (I10 != null) {
                    country = I10.getCountry();
                    if (country != null) {
                    }
                    sb2.append(country);
                    params.putString("_locale", sb2.toString());
                    Q10 = y10.Q();
                    if (Q10 == null) {
                        Q10 = "";
                    }
                    params.putString("_appVersion", Q10);
                    params.putString("_deviceOS", "ANDROID");
                    params.putString("_platform", "mobile");
                    str = Build.MODEL;
                    if (str == null) {
                        str = "";
                    }
                    params.putString("_deviceModel", str);
                    params.putString("_nativeAppID", C4331C.m());
                    Q11 = y10.Q();
                    if (Q11 != null) {
                        str2 = Q11;
                    }
                    params.putString("_nativeAppShortVersion", str2);
                    params.putString("_timezone", y10.D());
                    params.putString("_carrier", y10.y());
                    params.putString("_deviceOSTypeName", "ANDROID");
                    params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                    params.putLong("_remainingDiskGB", y10.w());
                }
                country = "";
                sb2.append(country);
                params.putString("_locale", sb2.toString());
                Q10 = y10.Q();
                if (Q10 == null) {
                }
                params.putString("_appVersion", Q10);
                params.putString("_deviceOS", "ANDROID");
                params.putString("_platform", "mobile");
                str = Build.MODEL;
                if (str == null) {
                }
                params.putString("_deviceModel", str);
                params.putString("_nativeAppID", C4331C.m());
                Q11 = y10.Q();
                if (Q11 != null) {
                }
                params.putString("_nativeAppShortVersion", str2);
                params.putString("_timezone", y10.D());
                params.putString("_carrier", y10.y());
                params.putString("_deviceOSTypeName", "ANDROID");
                params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                params.putLong("_remainingDiskGB", y10.w());
            }
            language = "";
            sb2.append(language);
            sb2.append('_');
            I10 = y10.I();
            if (I10 != null) {
            }
            country = "";
            sb2.append(country);
            params.putString("_locale", sb2.toString());
            Q10 = y10.Q();
            if (Q10 == null) {
            }
            params.putString("_appVersion", Q10);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            str = Build.MODEL;
            if (str == null) {
            }
            params.putString("_deviceModel", str);
            params.putString("_nativeAppID", C4331C.m());
            Q11 = y10.Q();
            if (Q11 != null) {
            }
            params.putString("_nativeAppShortVersion", str2);
            params.putString("_timezone", y10.D());
            params.putString("_carrier", y10.y());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", y10.w());
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
        }
    }

    public static final String c(JSONObject logic) {
        if (Y7.a.d(C5817b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys2 = logic.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
            return null;
        }
    }

    public static final String d(Bundle bundle) {
        String optString;
        if (Y7.a.d(C5817b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f59351c;
            if (jSONArray == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = f59351c;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String optString2 = jSONArray2.optString(i10);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong(StackTraceHelper.ID_KEY);
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && f(optString, bundle)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
            return null;
        }
    }

    public static final ArrayList e(JSONArray jSONArray) {
        if (Y7.a.d(C5817b.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(jSONArray.get(i10).toString());
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
            return null;
        }
    }

    public static final boolean f(String str, Bundle bundle) {
        int length;
        if (!Y7.a.d(C5817b.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String c10 = c(jSONObject);
                if (c10 == null) {
                    return false;
                }
                Object obj = jSONObject.get(c10);
                int hashCode = c10.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && c10.equals("not")) {
                            return !f(obj.toString(), bundle);
                        }
                    } else if (c10.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (!f(jSONArray.get(i10).toString(), bundle)) {
                                    return false;
                                }
                                if (i11 >= length2) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return true;
                    }
                } else if (c10.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (f(jSONArray2.get(i12).toString(), bundle)) {
                                return true;
                            }
                            if (i13 >= length) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return j(c10, jSONObject2, bundle);
            } catch (Throwable th2) {
                Y7.a.b(th2, C5817b.class);
            }
        }
        return false;
    }

    public static final void h(Bundle bundle, String event) {
        if (Y7.a.d(C5817b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!f59350b || bundle == null) {
                return;
            }
            try {
                b(bundle, event);
                bundle.putString("_audiencePropertyIds", d(bundle));
                bundle.putString("cs_maca", "1");
                i(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
        }
    }

    public static final void i(Bundle params) {
        if (Y7.a.d(C5817b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = keys;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                params.remove(str);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b5 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:31:0x0087, B:33:0x008d, B:35:0x0098, B:37:0x00a4, B:38:0x00a9, B:39:0x00aa, B:40:0x00af, B:41:0x00b0, B:44:0x00ba, B:48:0x00c6, B:53:0x0254, B:56:0x025b, B:57:0x025f, B:59:0x0265, B:61:0x026d, B:63:0x027c, B:69:0x028a, B:70:0x028f, B:72:0x0290, B:73:0x0295, B:76:0x00d0, B:79:0x00da, B:81:0x00e0, B:83:0x00eb, B:85:0x00f7, B:86:0x00fc, B:87:0x00fd, B:88:0x0102, B:89:0x0103, B:94:0x02a4, B:97:0x02ab, B:98:0x02af, B:100:0x02b5, B:102:0x02bd, B:104:0x02cc, B:110:0x02da, B:111:0x02df, B:113:0x02e0, B:114:0x02e5, B:117:0x010d, B:120:0x0117, B:122:0x011d, B:124:0x0128, B:126:0x0134, B:127:0x0139, B:128:0x013a, B:129:0x013f, B:130:0x0140, B:133:0x01f0, B:137:0x014a, B:140:0x01d4, B:144:0x0154, B:147:0x01ae, B:151:0x015e, B:154:0x0168, B:157:0x0235, B:161:0x0172, B:164:0x017c, B:169:0x0383, B:171:0x0186, B:174:0x0206, B:178:0x0190, B:181:0x019a, B:184:0x0222, B:186:0x01a4, B:189:0x01c0, B:192:0x01ca, B:195:0x01e6, B:198:0x01fc, B:201:0x0218, B:204:0x022b, B:207:0x0247, B:210:0x0297, B:213:0x02e7, B:216:0x02f1, B:218:0x02f7, B:220:0x0302, B:224:0x0311, B:225:0x0316, B:226:0x0317, B:227:0x031c, B:228:0x031d, B:231:0x0327, B:233:0x0330, B:238:0x036e, B:240:0x0339, B:243:0x0342, B:245:0x0350, B:248:0x0359, B:250:0x0362, B:253:0x0377, B:256:0x038c, B:258:0x0395, B:260:0x039b, B:262:0x03a6, B:266:0x03b5, B:267:0x03ba, B:268:0x03bb, B:269:0x03c0, B:271:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0382 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0383 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:31:0x0087, B:33:0x008d, B:35:0x0098, B:37:0x00a4, B:38:0x00a9, B:39:0x00aa, B:40:0x00af, B:41:0x00b0, B:44:0x00ba, B:48:0x00c6, B:53:0x0254, B:56:0x025b, B:57:0x025f, B:59:0x0265, B:61:0x026d, B:63:0x027c, B:69:0x028a, B:70:0x028f, B:72:0x0290, B:73:0x0295, B:76:0x00d0, B:79:0x00da, B:81:0x00e0, B:83:0x00eb, B:85:0x00f7, B:86:0x00fc, B:87:0x00fd, B:88:0x0102, B:89:0x0103, B:94:0x02a4, B:97:0x02ab, B:98:0x02af, B:100:0x02b5, B:102:0x02bd, B:104:0x02cc, B:110:0x02da, B:111:0x02df, B:113:0x02e0, B:114:0x02e5, B:117:0x010d, B:120:0x0117, B:122:0x011d, B:124:0x0128, B:126:0x0134, B:127:0x0139, B:128:0x013a, B:129:0x013f, B:130:0x0140, B:133:0x01f0, B:137:0x014a, B:140:0x01d4, B:144:0x0154, B:147:0x01ae, B:151:0x015e, B:154:0x0168, B:157:0x0235, B:161:0x0172, B:164:0x017c, B:169:0x0383, B:171:0x0186, B:174:0x0206, B:178:0x0190, B:181:0x019a, B:184:0x0222, B:186:0x01a4, B:189:0x01c0, B:192:0x01ca, B:195:0x01e6, B:198:0x01fc, B:201:0x0218, B:204:0x022b, B:207:0x0247, B:210:0x0297, B:213:0x02e7, B:216:0x02f1, B:218:0x02f7, B:220:0x0302, B:224:0x0311, B:225:0x0316, B:226:0x0317, B:227:0x031c, B:228:0x031d, B:231:0x0327, B:233:0x0330, B:238:0x036e, B:240:0x0339, B:243:0x0342, B:245:0x0350, B:248:0x0359, B:250:0x0362, B:253:0x0377, B:256:0x038c, B:258:0x0395, B:260:0x039b, B:262:0x03a6, B:266:0x03b5, B:267:0x03ba, B:268:0x03bb, B:269:0x03c0, B:271:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x036d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x036e A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:31:0x0087, B:33:0x008d, B:35:0x0098, B:37:0x00a4, B:38:0x00a9, B:39:0x00aa, B:40:0x00af, B:41:0x00b0, B:44:0x00ba, B:48:0x00c6, B:53:0x0254, B:56:0x025b, B:57:0x025f, B:59:0x0265, B:61:0x026d, B:63:0x027c, B:69:0x028a, B:70:0x028f, B:72:0x0290, B:73:0x0295, B:76:0x00d0, B:79:0x00da, B:81:0x00e0, B:83:0x00eb, B:85:0x00f7, B:86:0x00fc, B:87:0x00fd, B:88:0x0102, B:89:0x0103, B:94:0x02a4, B:97:0x02ab, B:98:0x02af, B:100:0x02b5, B:102:0x02bd, B:104:0x02cc, B:110:0x02da, B:111:0x02df, B:113:0x02e0, B:114:0x02e5, B:117:0x010d, B:120:0x0117, B:122:0x011d, B:124:0x0128, B:126:0x0134, B:127:0x0139, B:128:0x013a, B:129:0x013f, B:130:0x0140, B:133:0x01f0, B:137:0x014a, B:140:0x01d4, B:144:0x0154, B:147:0x01ae, B:151:0x015e, B:154:0x0168, B:157:0x0235, B:161:0x0172, B:164:0x017c, B:169:0x0383, B:171:0x0186, B:174:0x0206, B:178:0x0190, B:181:0x019a, B:184:0x0222, B:186:0x01a4, B:189:0x01c0, B:192:0x01ca, B:195:0x01e6, B:198:0x01fc, B:201:0x0218, B:204:0x022b, B:207:0x0247, B:210:0x0297, B:213:0x02e7, B:216:0x02f1, B:218:0x02f7, B:220:0x0302, B:224:0x0311, B:225:0x0316, B:226:0x0317, B:227:0x031c, B:228:0x031d, B:231:0x0327, B:233:0x0330, B:238:0x036e, B:240:0x0339, B:243:0x0342, B:245:0x0350, B:248:0x0359, B:250:0x0362, B:253:0x0377, B:256:0x038c, B:258:0x0395, B:260:0x039b, B:262:0x03a6, B:266:0x03b5, B:267:0x03ba, B:268:0x03bb, B:269:0x03c0, B:271:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0253 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0254 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:31:0x0087, B:33:0x008d, B:35:0x0098, B:37:0x00a4, B:38:0x00a9, B:39:0x00aa, B:40:0x00af, B:41:0x00b0, B:44:0x00ba, B:48:0x00c6, B:53:0x0254, B:56:0x025b, B:57:0x025f, B:59:0x0265, B:61:0x026d, B:63:0x027c, B:69:0x028a, B:70:0x028f, B:72:0x0290, B:73:0x0295, B:76:0x00d0, B:79:0x00da, B:81:0x00e0, B:83:0x00eb, B:85:0x00f7, B:86:0x00fc, B:87:0x00fd, B:88:0x0102, B:89:0x0103, B:94:0x02a4, B:97:0x02ab, B:98:0x02af, B:100:0x02b5, B:102:0x02bd, B:104:0x02cc, B:110:0x02da, B:111:0x02df, B:113:0x02e0, B:114:0x02e5, B:117:0x010d, B:120:0x0117, B:122:0x011d, B:124:0x0128, B:126:0x0134, B:127:0x0139, B:128:0x013a, B:129:0x013f, B:130:0x0140, B:133:0x01f0, B:137:0x014a, B:140:0x01d4, B:144:0x0154, B:147:0x01ae, B:151:0x015e, B:154:0x0168, B:157:0x0235, B:161:0x0172, B:164:0x017c, B:169:0x0383, B:171:0x0186, B:174:0x0206, B:178:0x0190, B:181:0x019a, B:184:0x0222, B:186:0x01a4, B:189:0x01c0, B:192:0x01ca, B:195:0x01e6, B:198:0x01fc, B:201:0x0218, B:204:0x022b, B:207:0x0247, B:210:0x0297, B:213:0x02e7, B:216:0x02f1, B:218:0x02f7, B:220:0x0302, B:224:0x0311, B:225:0x0316, B:226:0x0317, B:227:0x031c, B:228:0x031d, B:231:0x0327, B:233:0x0330, B:238:0x036e, B:240:0x0339, B:243:0x0342, B:245:0x0350, B:248:0x0359, B:250:0x0362, B:253:0x0377, B:256:0x038c, B:258:0x0395, B:260:0x039b, B:262:0x03a6, B:266:0x03b5, B:267:0x03ba, B:268:0x03bb, B:269:0x03c0, B:271:0x0055), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j(String variable, JSONObject values, Bundle bundle) {
        Object obj;
        if (Y7.a.d(C5817b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(values, "values");
            String c10 = c(values);
            if (c10 == null) {
                return false;
            }
            String obj2 = values.get(c10).toString();
            ArrayList<String> e10 = e(values.optJSONArray(c10));
            Boolean bool = null;
            if (Intrinsics.areEqual(c10, "exists")) {
                if (bundle != null) {
                    bool = Boolean.valueOf(bundle.containsKey(variable));
                }
                return Intrinsics.areEqual(bool, Boolean.valueOf(Boolean.parseBoolean(obj2)));
            }
            if (bundle == null) {
                obj = null;
            } else {
                String lowerCase = variable.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = bundle.get(lowerCase);
            }
            if (obj == null) {
                obj = bundle == null ? null : bundle.get(variable);
                if (obj == null) {
                    return false;
                }
            }
            switch (c10.hashCode()) {
                case -1729128927:
                    if (c10.equals("i_not_contains")) {
                        String obj3 = obj.toString();
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = obj3.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase3 = obj2.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        return !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase3, false, 2, (Object) null);
                    }
                    return false;
                case -1179774633:
                    if (!c10.equals("is_any")) {
                        return false;
                    }
                    if (e10 != null) {
                        return false;
                    }
                    return e10.contains(obj.toString());
                case -1039699439:
                    if (!c10.equals("not_in")) {
                        return false;
                    }
                    if (e10 != null) {
                        return false;
                    }
                    return e10.contains(obj.toString());
                case -969266188:
                    if (c10.equals("starts_with")) {
                        return StringsKt.startsWith$default(obj.toString(), obj2, false, 2, (Object) null);
                    }
                    return false;
                case -966353971:
                    if (c10.equals("regex_match")) {
                        return new Regex(obj2).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!c10.equals("is_not_any")) {
                        return false;
                    }
                    if (e10 != null) {
                    }
                    break;
                case -567445985:
                    if (c10.equals("contains")) {
                        return StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null);
                    }
                    return false;
                case -327990090:
                    if (!c10.equals("i_str_neq")) {
                        return false;
                    }
                    String obj4 = obj.toString();
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale2 = Locale.ROOT;
                    String lowerCase4 = obj4.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase5 = obj2.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return !Intrinsics.areEqual(lowerCase4, lowerCase5);
                case -159812115:
                    if (!c10.equals("i_is_any")) {
                        return false;
                    }
                    if (e10 != null || e10.isEmpty()) {
                        return false;
                    }
                    for (String str : e10) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        Locale locale3 = Locale.ROOT;
                        String lowerCase6 = str.toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        String obj5 = obj.toString();
                        if (obj5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase7 = obj5.toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                            return true;
                        }
                    }
                    return false;
                case -92753547:
                    if (!c10.equals("i_str_not_in")) {
                        return false;
                    }
                    if (e10 != null) {
                        return false;
                    }
                    if (e10.isEmpty()) {
                        return true;
                    }
                    for (String str2 : e10) {
                        if (str2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        Locale locale4 = Locale.ROOT;
                        String lowerCase8 = str2.toLowerCase(locale4);
                        Intrinsics.checkNotNullExpressionValue(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        String obj6 = obj.toString();
                        if (obj6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase9 = obj6.toLowerCase(locale4);
                        Intrinsics.checkNotNullExpressionValue(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase8, lowerCase9)) {
                            return false;
                        }
                    }
                    return true;
                case 60:
                    if (!c10.equals("<")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2);
                case 61:
                    if (!c10.equals("=")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 62:
                    if (!c10.equals(">")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2);
                case 1084:
                    if (!c10.equals("!=")) {
                        return false;
                    }
                    return !Intrinsics.areEqual(obj.toString(), obj2);
                case 1921:
                    if (!c10.equals("<=")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2);
                case 1952:
                    if (!c10.equals("==")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 1983:
                    if (!c10.equals(">=")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2);
                case 3244:
                    if (!c10.equals("eq")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 3294:
                    if (!c10.equals("ge")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3309:
                    if (!c10.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3365:
                    if (!c10.equals("in")) {
                        return false;
                    }
                    if (e10 != null) {
                    }
                    break;
                case 3449:
                    if (!c10.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3464:
                    if (!c10.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3511:
                    if (!c10.equals("ne")) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                    break;
                case 102680:
                    if (!c10.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                    }
                    break;
                case 107485:
                    if (!c10.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                    }
                    break;
                case 108954:
                    if (!c10.equals("neq")) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                    break;
                case 127966736:
                    if (!c10.equals("i_str_eq")) {
                        return false;
                    }
                    String obj7 = obj.toString();
                    if (obj7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale5 = Locale.ROOT;
                    String lowerCase10 = obj7.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase11 = obj2.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return Intrinsics.areEqual(lowerCase10, lowerCase11);
                case 127966857:
                    if (!c10.equals("i_str_in")) {
                        return false;
                    }
                    if (e10 != null) {
                        return false;
                    }
                    while (r9.hasNext()) {
                    }
                    return false;
                case 363990325:
                    if (!c10.equals("i_contains")) {
                        return false;
                    }
                    String obj8 = obj.toString();
                    if (obj8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale6 = Locale.ROOT;
                    String lowerCase12 = obj8.toLowerCase(locale6);
                    Intrinsics.checkNotNullExpressionValue(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase13 = obj2.toLowerCase(locale6);
                    Intrinsics.checkNotNullExpressionValue(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.contains$default((CharSequence) lowerCase12, (CharSequence) lowerCase13, false, 2, (Object) null);
                case 1091487233:
                    if (!c10.equals("i_is_not_any")) {
                        return false;
                    }
                    if (e10 != null) {
                    }
                    break;
                case 1918401035:
                    return c10.equals("not_contains") && !StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null);
                case 1961112862:
                    if (!c10.equals("i_starts_with")) {
                        return false;
                    }
                    String obj9 = obj.toString();
                    if (obj9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale7 = Locale.ROOT;
                    String lowerCase14 = obj9.toLowerCase(locale7);
                    Intrinsics.checkNotNullExpressionValue(lowerCase14, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase15 = obj2.toLowerCase(locale7);
                    Intrinsics.checkNotNullExpressionValue(lowerCase15, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.startsWith$default(lowerCase14, lowerCase15, false, 2, (Object) null);
                default:
                    return false;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5817b.class);
            return false;
        }
    }

    public final void g() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            A a10 = A.f10965a;
            C1682w q10 = A.q(C4331C.m(), false);
            if (q10 == null) {
                return;
            }
            f59351c = q10.g();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
