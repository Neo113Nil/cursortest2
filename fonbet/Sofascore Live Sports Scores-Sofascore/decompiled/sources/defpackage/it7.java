package defpackage;

import android.graphics.PointF;
import android.util.Patterns;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.Fc;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.RemoteAdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class it7 implements c1l, lkk, lx2, ycn, zzqp, zzyh, SuccessContinuation, lad, kic {
    public static Map c;
    public static Map d;
    public static Map e;
    public static JSONObject f;
    public static boolean g;
    public static RemoteAdConfig i;
    public final /* synthetic */ int a;
    public static final it7 b = new it7(0);
    public static final it7 h = new it7(1);
    public static final a70 j = new a70(29);
    public static final it7 k = new it7(3);
    public static final String[] l = new String[0];
    public static final it7 m = new it7(5);
    public static final it7 n = new it7(6);
    public static final it7 o = new it7(7);
    public static final ilg p = new ilg(27);
    public static final ilg q = new ilg(28);
    public static final it7 r = new it7(9);
    public static final it7 s = new it7(10);
    public static final it7 t = new it7(11);
    public static final it7 u = new it7(12);
    public static final it7 v = new it7(13);
    public static final it7 w = new it7(14);
    public static final it7 x = new it7(15);

    public it7(dh2 dh2Var) {
        this.a = 18;
    }

    public static ox9 e() {
        Class x2 = qx9.x("com.android.billingclient.api.SkuDetailsParams");
        Class x3 = qx9.x("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (x2 == null || x3 == null) {
            return null;
        }
        Method z = qx9.z(x2, "newBuilder", new Class[0]);
        Method z2 = qx9.z(x3, "setType", String.class);
        Method z3 = qx9.z(x3, "setSkusList", List.class);
        Method z4 = qx9.z(x3, "build", new Class[0]);
        if (z == null || z2 == null || z3 == null || z4 == null) {
            return null;
        }
        ox9 ox9Var = new ox9(x2, x3, z, z2, z3, z4);
        if (!cw3.a.contains(ox9.class)) {
            try {
                ox9.i = ox9Var;
            } catch (Throwable th) {
                cw3.a(ox9.class, th);
            }
        }
        if (cw3.a.contains(ox9.class)) {
            return null;
        }
        try {
            return ox9.i;
        } catch (Throwable th2) {
            cw3.a(ox9.class, th2);
            return null;
        }
    }

    public static final float[] g(String str, JSONObject jSONObject) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        it7 it7Var;
        JSONObject m2;
        if (!cw3.a.contains(it7.class)) {
            try {
                str.getClass();
                if (g) {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    try {
                        lowerCase = str.toLowerCase();
                        lowerCase.getClass();
                        jSONObject2 = new JSONObject(jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).toString());
                        optString = jSONObject.optString("screenname");
                        jSONArray = new JSONArray();
                        it7Var = b;
                        it7Var.u(jSONArray, jSONObject2);
                        it7Var.y(fArr, it7Var.t(jSONObject2));
                        m2 = it7Var.m(jSONObject2);
                    } catch (JSONException unused) {
                    }
                    if (m2 != null) {
                        optString.getClass();
                        String jSONObject3 = jSONObject2.toString();
                        jSONObject3.getClass();
                        it7Var.y(fArr, it7Var.s(m2, jSONArray, optString, jSONObject3, lowerCase));
                        return fArr;
                    }
                }
            } catch (Throwable th) {
                cw3.a(it7.class, th);
                return null;
            }
        }
        return null;
    }

    public static r5a j(jfb jfbVar, yz1 yz1Var) {
        IOException iOException = (IOException) yz1Var.c;
        if (!(iOException instanceof si9)) {
            return null;
        }
        int i2 = ((si9) iOException).c;
        if (i2 != 403 && i2 != 404 && i2 != 410 && i2 != 416 && i2 != 500 && i2 != 503) {
            return null;
        }
        if (jfbVar.a(1)) {
            return new r5a(1, 300000L);
        }
        if (jfbVar.a(2)) {
            return new r5a(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    public static long o(yz1 yz1Var) {
        for (Throwable th = (IOException) yz1Var.c; th != null; th = th.getCause()) {
            if ((th instanceof s9e) || (th instanceof FileNotFoundException) || (th instanceof mi9) || (th instanceof cgb)) {
                return C.TIME_UNSET;
            }
            if ((th instanceof te4) && ((te4) th).a == 2008) {
                return C.TIME_UNSET;
            }
        }
        return Math.min((yz1Var.b - 1) * 1000, 5000);
    }

    public static final String p(String str, String str2, String str3) {
        if (cw3.a.contains(it7.class)) {
            return null;
        }
        try {
            str.getClass();
            str2.getClass();
            str3.getClass();
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th) {
            cw3.a(it7.class, th);
            return null;
        }
    }

    public static final void q(File file) {
        if (cw3.a.contains(it7.class)) {
            return;
        }
        try {
            try {
                f = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f = new JSONObject(new String(bArr, Charsets.UTF_8));
                c = tub.h(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                d = tub.h(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", CampaignEx.CLICKMODE_ON), new Pair("PURCHASE", "6"), new Pair("LEAD", Fc.e), new Pair("COMPLETE_REGISTRATION", "8"));
                e = tub.h(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                g = true;
            } catch (Throwable th) {
                cw3.a(it7.class, th);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean x(BrandingFantasyCompetition brandingFantasyCompetition, un6 un6Var, boolean z) {
        if (brandingFantasyCompetition == null) {
            return false;
        }
        int brandingType = brandingFantasyCompetition.getBrandingType();
        if (!z) {
            it7 it7Var = un6.b;
            if (brandingType > 2) {
                brandingType = 2;
            }
        }
        return brandingType >= un6Var.a;
    }

    @Override // defpackage.ycn
    public boolean a(Class cls) {
        return zzadu.class.isAssignableFrom(cls);
    }

    @Override // defpackage.ycn
    public ndn b(Class cls) {
        if (!zzadu.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (ndn) zzadu.s(cls.asSubclass(zzadu.class)).x(3);
        } catch (Exception e2) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.lad
    public boolean c() {
        return true;
    }

    @Override // defpackage.c1l
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.kic
    public String d(Object obj) {
        return (String) obj;
    }

    public synchronized AdConfig f(AdType adType) {
        AdConfig adConfig;
        Map<AdType, AdConfig> placements;
        try {
            adType.getClass();
            RemoteAdConfig remoteAdConfig = i;
            if (remoteAdConfig == null) {
                yea yeaVar = j58.a;
                remoteAdConfig = j58.b();
                i = remoteAdConfig;
            }
            adConfig = (remoteAdConfig == null || (placements = remoteAdConfig.getPlacements()) == null) ? null : placements.get(adType);
        } catch (Throwable th) {
            throw th;
        }
        return adConfig != null ? adConfig : null;
    }

    @Override // defpackage.c1l
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.c1l
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.c1l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        ct8 ct8Var = (ct8) hoiVar;
        a99 a99Var = tk9.b;
        pm0 pm0Var = ji9.a;
        xh3 xh3Var = (xh3) vh9Var.i.d(ji9.a);
        rq3 rq3Var = null;
        Object d2 = xh3Var != null ? xh3Var.d(tk9.c) : null;
        if (d2 != null) {
            ((tk9) d2).a.add(new c37(ct8Var, vh9Var, rq3Var, 8));
            return;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(a99Var);
        pm0 pm0Var2 = tk9.c;
        sb.append(" is not installed. Consider using `install(");
        sb.append(pm0Var2);
        sb.append(")` in client config first.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        int Z = wgaVar.Z();
        if (Z == 1) {
            return nha.b(wgaVar, f2);
        }
        if (Z == 3) {
            return nha.b(wgaVar, f2);
        }
        if (Z != 7) {
            a70.p("Cannot convert json to point. Next token is ".concat(wv8.y(Z)));
            return null;
        }
        PointF pointF = new PointF(((float) wgaVar.H()) * f2, ((float) wgaVar.H()) * f2);
        while (wgaVar.t()) {
            wgaVar.g0();
        }
        return pointF;
    }

    @Override // defpackage.c1l
    public String[] l() {
        return l;
    }

    public JSONObject m(JSONObject jSONObject) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            cw3.a(this, th);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            jSONObject2.getClass();
            JSONObject m2 = m(jSONObject2);
            if (m2 != null) {
                return m2;
            }
        }
        return null;
    }

    public int n(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    public boolean r(String[] strArr, String[] strArr2) {
        if (!cw3.a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (StringsKt.J(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return false;
            }
        }
        return false;
    }

    public float[] s(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        float f2;
        float[] fArr2 = null;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i2 = 0;
            while (true) {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i2 >= 30) {
                    break;
                }
                fArr3[i2] = 0.0f;
                i2++;
            }
            int length = jSONArray.length();
            boolean z = true;
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i3 = 0;
                while (i3 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            jSONObject2.getClass();
                            boolean z2 = z;
                            if (!cw3.a.contains(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    cw3.a(this, th);
                                }
                            }
                            i3++;
                            fArr2 = fArr;
                            z = z2;
                        } catch (JSONException unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cw3.a(this, th);
                        return fArr;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            z(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr3[15] = w("COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[16] = w("COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr3[17] = w("COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr3[18] = StringsKt.J(str2, "password", false) ? 1.0f : 0.0f;
            fArr3[19] = v("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr3[20] = v("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr3[21] = v("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr3[22] = w("PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[24] = w("PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr3[25] = v("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr3[27] = v("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr3[28] = w("LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            if (w("LEAD", "PAGE_TITLE", str4)) {
                f2 = 1.0f;
            }
            fArr3[29] = f2;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = null;
        }
    }

    public float[] t(JSONObject jSONObject) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            optString.getClass();
            String lowerCase = optString.toLowerCase();
            lowerCase.getClass();
            String optString2 = jSONObject.optString("hint");
            optString2.getClass();
            String lowerCase2 = optString2.toLowerCase();
            lowerCase2.getClass();
            String optString3 = jSONObject.optString("classname");
            optString3.getClass();
            String lowerCase3 = optString3.toLowerCase();
            lowerCase3.getClass();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (r(new String[]{"$", "amount", "price", U3.i.l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (r(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (r(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (r(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 2 || optInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.J(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (r(new String[]{CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.J(lowerCase3, "radio", false) && StringsKt.J(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    jSONObject2.getClass();
                    y(fArr, t(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public boolean u(JSONArray jSONArray, JSONObject jSONObject) {
        boolean z;
        if (!cw3.a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (optJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = optJSONArray.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        jSONArray.put(optJSONArray.getJSONObject(i3));
                    }
                    return z2;
                }
                int length3 = optJSONArray.length();
                for (int i4 = 0; i4 < length3; i4++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                    jSONObject2.getClass();
                    if (u(jSONArray, jSONObject2)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        }
        return false;
    }

    public boolean v(String str, String str2) {
        if (cw3.a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            cw3.a(this, th);
            return false;
        }
    }

    public boolean w(String str, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (!cw3.a.contains(this)) {
            try {
                JSONObject jSONObject = f;
                String str4 = null;
                if (jSONObject == null) {
                    Intrinsics.i("rules");
                    throw null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject3 != null) {
                    Map map = c;
                    if (map == null) {
                        Intrinsics.i("languageInfo");
                        throw null;
                    }
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject((String) map.get("ENGLISH"));
                    if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        Map map2 = d;
                        if (map2 == null) {
                            Intrinsics.i("eventInfo");
                            throw null;
                        }
                        JSONObject optJSONObject5 = optJSONObject.optJSONObject((String) map2.get(str));
                        if (optJSONObject5 != null && (optJSONObject2 = optJSONObject5.optJSONObject("positiveRules")) != null) {
                            Map map3 = e;
                            if (map3 == null) {
                                Intrinsics.i("textTypeInfo");
                                throw null;
                            }
                            str4 = optJSONObject2.optString((String) map3.get(str2));
                        }
                    }
                }
                if (str4 != null) {
                    return v(str4, str3);
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return false;
            }
        }
        return false;
    }

    public void y(float[] fArr, float[] fArr2) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr[i2] + fArr2[i2];
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public void z(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            optString.getClass();
            String lowerCase = optString.toLowerCase();
            lowerCase.getClass();
            String optString2 = jSONObject.optString("hint", "");
            optString2.getClass();
            String lowerCase2 = optString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    z(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public /* synthetic */ it7(int i2) {
        this.a = i2;
    }

    @Override // defpackage.lad
    public void shutdown() {
    }

    @Override // defpackage.kic
    public Object k(String str) {
        return str;
    }
}
