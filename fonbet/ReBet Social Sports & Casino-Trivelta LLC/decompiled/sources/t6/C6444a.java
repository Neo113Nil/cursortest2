package t6;

import android.util.Patterns;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6444a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6444a f65686a = new C6444a();

    /* renamed from: b, reason: collision with root package name */
    public static Map f65687b;

    /* renamed from: c, reason: collision with root package name */
    public static Map f65688c;

    /* renamed from: d, reason: collision with root package name */
    public static Map f65689d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONObject f65690e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f65691f;

    public static final float[] a(JSONObject viewHierarchy, String appName) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        C6444a c6444a;
        JSONObject b10;
        if (Y7.a.d(C6444a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!f65691f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                screenName = viewHierarchy.optString("screenname");
                jSONArray = new JSONArray();
                c6444a = f65686a;
                c6444a.j(jSONObject, jSONArray);
                c6444a.m(fArr, c6444a.i(jSONObject));
                b10 = c6444a.b(jSONObject);
            } catch (JSONException unused) {
            }
            if (b10 == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            c6444a.m(fArr, c6444a.h(b10, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            Y7.a.b(th2, C6444a.class);
            return null;
        }
    }

    public static final String c(String buttonText, String activityName, String appName) {
        if (Y7.a.d(C6444a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            Y7.a.b(th2, C6444a.class);
            return null;
        }
    }

    public static final void d(File file) {
        if (Y7.a.d(C6444a.class)) {
            return;
        }
        try {
            try {
                f65690e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f65690e = new JSONObject(new String(bArr, Charsets.UTF_8));
                f65687b = MapsKt.mapOf(TuplesKt.to("ENGLISH", "1"), TuplesKt.to("GERMAN", "2"), TuplesKt.to("SPANISH", "3"), TuplesKt.to("JAPANESE", "4"));
                f65688c = MapsKt.mapOf(TuplesKt.to("VIEW_CONTENT", "0"), TuplesKt.to("SEARCH", "1"), TuplesKt.to("ADD_TO_CART", "2"), TuplesKt.to("ADD_TO_WISHLIST", "3"), TuplesKt.to("INITIATE_CHECKOUT", "4"), TuplesKt.to("ADD_PAYMENT_INFO", "5"), TuplesKt.to("PURCHASE", "6"), TuplesKt.to("LEAD", "7"), TuplesKt.to("COMPLETE_REGISTRATION", "8"));
                f65689d = MapsKt.mapOf(TuplesKt.to("BUTTON_TEXT", "1"), TuplesKt.to("PAGE_TITLE", "2"), TuplesKt.to("RESOLVED_DOCUMENT_LINK", "3"), TuplesKt.to("BUTTON_ID", "4"));
                f65691f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C6444a.class);
        }
    }

    public static final boolean f() {
        if (Y7.a.d(C6444a.class)) {
            return false;
        }
        try {
            return f65691f;
        } catch (Throwable th2) {
            Y7.a.b(th2, C6444a.class);
            return false;
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        int length;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject b10 = b(jSONObject2);
                if (b10 != null) {
                    return b10;
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return null;
    }

    public final boolean e(JSONObject jSONObject) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean g(String[] strArr, String[] strArr2) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f10;
        int length;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length2 = jSONArray.length();
            float f11 = 1.0f;
            fArr[3] = length2 > 1 ? length2 - 1.0f : 0.0f;
            try {
                length = jSONArray.length();
            } catch (JSONException unused) {
            }
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    f10 = f11;
                    try {
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + f10;
                        }
                        if (i12 >= length) {
                            break;
                        }
                        i11 = i12;
                        f11 = f10;
                    } catch (JSONException unused2) {
                    }
                }
                fArr[13] = -1.0f;
                fArr[14] = -1.0f;
                String str4 = str + '|' + str3;
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                n(jSONObject, sb3, sb2);
                String sb4 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "hintSB.toString()");
                String sb5 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb5, "textSB.toString()");
                fArr[15] = !l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5) ? f10 : 0.0f;
                fArr[16] = !l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? f10 : 0.0f;
                fArr[17] = !l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb4) ? f10 : 0.0f;
                fArr[18] = !StringsKt.contains$default((CharSequence) str2, (CharSequence) "password", false, 2, (Object) null) ? f10 : 0.0f;
                fArr[19] = !k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? f10 : 0.0f;
                fArr[20] = !k("(?i)(sign in)|login|signIn", str2) ? f10 : 0.0f;
                fArr[21] = !k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? f10 : 0.0f;
                fArr[22] = !l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb5) ? f10 : 0.0f;
                fArr[24] = !l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? f10 : 0.0f;
                fArr[25] = !k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5) ? f10 : 0.0f;
                fArr[27] = !k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? f10 : 0.0f;
                fArr[28] = !l("ENGLISH", "LEAD", "BUTTON_TEXT", sb5) ? f10 : 0.0f;
                fArr[29] = !l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? f10 : 0.0f;
                return fArr;
            }
            f10 = f11;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str42 = str + '|' + str3;
            StringBuilder sb22 = new StringBuilder();
            StringBuilder sb32 = new StringBuilder();
            n(jSONObject, sb32, sb22);
            String sb42 = sb22.toString();
            Intrinsics.checkNotNullExpressionValue(sb42, "hintSB.toString()");
            String sb52 = sb32.toString();
            Intrinsics.checkNotNullExpressionValue(sb52, "textSB.toString()");
            fArr[15] = !l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb52) ? f10 : 0.0f;
            fArr[16] = !l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str42) ? f10 : 0.0f;
            fArr[17] = !l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb42) ? f10 : 0.0f;
            fArr[18] = !StringsKt.contains$default((CharSequence) str2, (CharSequence) "password", false, 2, (Object) null) ? f10 : 0.0f;
            fArr[19] = !k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? f10 : 0.0f;
            fArr[20] = !k("(?i)(sign in)|login|signIn", str2) ? f10 : 0.0f;
            fArr[21] = !k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? f10 : 0.0f;
            fArr[22] = !l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb52) ? f10 : 0.0f;
            fArr[24] = !l("ENGLISH", "PURCHASE", "PAGE_TITLE", str42) ? f10 : 0.0f;
            fArr[25] = !k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb52) ? f10 : 0.0f;
            fArr[27] = !k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str42) ? f10 : 0.0f;
            fArr[28] = !l("ENGLISH", "LEAD", "BUTTON_TEXT", sb52) ? f10 : 0.0f;
            fArr[29] = !l("ENGLISH", "LEAD", "PAGE_TITLE", str42) ? f10 : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final float[] i(JSONObject jSONObject) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "radio", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        break;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            z10 = false;
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
                return z11;
            }
            int length3 = optJSONArray.length();
            if (length3 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    JSONObject child = optJSONArray.getJSONObject(i14);
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    if (j(child, jSONArray)) {
                        jSONArray2.put(child);
                        z11 = true;
                    }
                    if (i15 >= length3) {
                        break;
                    }
                    i14 = i15;
                }
            }
            jSONObject.put("childviews", jSONArray2);
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean k(String str, String str2) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:17:0x005d, B:19:0x0043, B:22:0x004c, B:24:0x0050, B:25:0x0064, B:26:0x0069, B:27:0x0029, B:30:0x0032, B:32:0x0036, B:33:0x006a, B:34:0x006f, B:35:0x0017, B:37:0x001b, B:38:0x0070, B:39:0x0075, B:40:0x0076, B:41:0x007b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:17:0x005d, B:19:0x0043, B:22:0x004c, B:24:0x0050, B:25:0x0064, B:26:0x0069, B:27:0x0029, B:30:0x0032, B:32:0x0036, B:33:0x006a, B:34:0x006f, B:35:0x0017, B:37:0x001b, B:38:0x0070, B:39:0x0075, B:40:0x0076, B:41:0x007b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:17:0x005d, B:19:0x0043, B:22:0x004c, B:24:0x0050, B:25:0x0064, B:26:0x0069, B:27:0x0029, B:30:0x0032, B:32:0x0036, B:33:0x006a, B:34:0x006f, B:35:0x0017, B:37:0x001b, B:38:0x0070, B:39:0x0075, B:40:0x0076, B:41:0x007b), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(String str, String str2, String str3, String str4) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        Map map;
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f65690e;
            String str5 = null;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rules");
                throw null;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
            if (optJSONObject5 == null) {
                optJSONObject = null;
            } else {
                Map map2 = f65687b;
                if (map2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    throw null;
                }
                optJSONObject = optJSONObject5.optJSONObject((String) map2.get(str));
            }
            if (optJSONObject != null && (optJSONObject2 = optJSONObject.optJSONObject("rulesForEvent")) != null) {
                Map map3 = f65688c;
                if (map3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                    throw null;
                }
                optJSONObject3 = optJSONObject2.optJSONObject((String) map3.get(str2));
                if (optJSONObject3 != null && (optJSONObject4 = optJSONObject3.optJSONObject("positiveRules")) != null) {
                    map = f65689d;
                    if (map != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                        throw null;
                    }
                    str5 = optJSONObject4.optString((String) map.get(str3));
                }
                if (str5 != null) {
                    return false;
                }
                return k(str5, str4);
            }
            optJSONObject3 = null;
            if (optJSONObject3 != null) {
                map = f65689d;
                if (map != null) {
                }
            }
            if (str5 != null) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final void m(float[] fArr, float[] fArr2) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                fArr[i10] = fArr[i10] + fArr2[i10];
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    n(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
