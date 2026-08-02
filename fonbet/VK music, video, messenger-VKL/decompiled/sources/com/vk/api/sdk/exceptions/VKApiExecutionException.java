package com.vk.api.sdk.exceptions;

import android.os.Bundle;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.c5g;
import xsna.epx;
import xsna.i5s;
import xsna.j5g;
import xsna.j9x;
import xsna.k9x;
import xsna.n6j;
import xsna.on00;
import xsna.swe0;
import xsna.tdj;

/* compiled from: VKApiExecutionException.kt */
/* loaded from: classes.dex */
public class VKApiExecutionException extends VKApiException {
    public static final /* synthetic */ int b = 0;
    public static final long serialVersionUID = 7524047853274172872L;
    private final String apiMethod;
    private final int code;
    private final String detailMessage;
    private final String errorMsg;
    private final List<VKApiExecutionException> executeErrors;
    private final Bundle extra;
    private final boolean hasLocalizedMessage;
    private final Map<String, String> requestParams;
    private final String responseContentType;
    private final int subcode;
    private final ApiErrorViewType viewType;

    /* compiled from: VKApiExecutionException.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
        
            if (r2 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
        
            r7 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        
            if (r2 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
        
            if (r2 == null) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static VKApiExecutionException a(JSONObject jSONObject, String str, Bundle bundle) {
            String str2;
            JSONArray jSONArray;
            String optString;
            String str3;
            String str4 = "";
            if (str == null) {
                String optString2 = jSONObject.optString("method");
                str2 = optString2 == null ? "" : optString2;
            } else {
                str2 = str;
            }
            int optInt = jSONObject.optInt("error_code", 1);
            int optInt2 = jSONObject.optInt("error_subcode", 1);
            String optString3 = jSONObject.optString(SharedKt.PARAM_ERROR_MSG);
            String str5 = optString3 == null ? "" : optString3;
            try {
                jSONArray = jSONObject.getJSONArray("request_params");
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            k9x q = swe0.q(0, jSONArray.length());
            int e = on00.e(c5g.u(q, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            j9x it = q.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(it.nextInt());
                Pair pair = new Pair(jSONObject2.getString("key"), jSONObject2.getString("value"));
                linkedHashMap.put(pair.i(), pair.j());
            }
            ApiErrorViewType.a aVar = ApiErrorViewType.Companion;
            String optString4 = jSONObject.optString(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (optString4 == null) {
                optString4 = "";
            }
            aVar.getClass();
            ApiErrorViewType a = ApiErrorViewType.a.a(optString4);
            if (jSONObject.has("error_text")) {
                optString = jSONObject.optString("error_text");
            } else if (jSONObject.has("error_description")) {
                optString = jSONObject.optString("error_description");
            } else {
                if (jSONObject.has("error_descr")) {
                    optString = jSONObject.optString("error_descr");
                } else {
                    String optString5 = jSONObject.has(SharedKt.PARAM_ERROR_MSG) ? jSONObject.optString(SharedKt.PARAM_ERROR_MSG) : jSONObject.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append(optString5);
                    sb.append(" (");
                    sb.append(optInt);
                    sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb.append(optInt2);
                    str4 = tdj.a(sb, ") | by [", str2, X3.j.e);
                }
                str3 = str4;
            }
            return new VKApiExecutionException(optInt, str2, jSONObject.has("error_text"), str3, bundle, null, str5, linkedHashMap, optInt2, a, null, null, 3104);
        }
    }

    public VKApiExecutionException() {
        throw null;
    }

    public VKApiExecutionException(int i, String str, boolean z, String str2) {
        this(i, str, z, str2, null, null, null, null, 0, null, null, null, 4080);
    }

    public final String A() {
        return this.responseContentType;
    }

    public final boolean B() {
        return this.code == 10 && this.subcode == 1152;
    }

    public final int C() {
        return this.subcode;
    }

    public final JSONObject D() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("user_ban_info")) == null) {
            return null;
        }
        return new JSONObject(string);
    }

    public final String E() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString("confirmation_text", "")) == null) ? "" : string;
    }

    public final String F() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString("validation_url", "")) == null) ? "" : string;
    }

    public final ApiErrorViewType G() {
        return this.viewType;
    }

    public final boolean H(int i) {
        if (this.code == i) {
            return true;
        }
        List<VKApiExecutionException> list = this.executeErrors;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((VKApiExecutionException) next).code == i) {
                    obj = next;
                    break;
                }
            }
            obj = (VKApiExecutionException) obj;
        }
        return obj != null;
    }

    public final boolean I() {
        Bundle bundle = this.extra;
        return (bundle == null || epx.f(bundle, Bundle.EMPTY)) ? false : true;
    }

    public final boolean J() {
        int i = this.code;
        return i == 15 || i == 30 || i == 203 || i == 1016 || i == 200 || i == 201;
    }

    public final boolean K() {
        return this.code == 1117;
    }

    public final boolean L() {
        return this.code == 1114;
    }

    public final boolean M() {
        return this.code == 1116;
    }

    public final boolean N() {
        return this.code == 35;
    }

    public final boolean O() {
        return this.code == 14;
    }

    public final boolean P() {
        return this.code == 917;
    }

    public final boolean Q() {
        return this.code == 927;
    }

    public final boolean R() {
        return this.code == Integer.MIN_VALUE;
    }

    public final boolean S() {
        return this.code == 34;
    }

    public final boolean T() {
        return this.code == 13300;
    }

    public final boolean U() {
        int i = this.code;
        return i == 1 || i == 10 || i == 13;
    }

    public final boolean V() {
        int i = this.code;
        return i == 4 || i == 5 || i == 3610;
    }

    public final boolean W() {
        return this.code == -2147483647;
    }

    public final boolean X() {
        return this.code == 104;
    }

    public final boolean Y() {
        return this.code == 33;
    }

    public final boolean Z() {
        int i = this.subcode;
        return i == 1112 || i == 1113;
    }

    public final boolean b0() {
        return this.code == 29;
    }

    public final boolean c0() {
        return this.code == 43;
    }

    public final String d() {
        Bundle bundle = this.extra;
        if (bundle != null) {
            return bundle.getString(SharedKt.PARAM_ACCESS_TOKEN, null);
        }
        return null;
    }

    public final boolean d0() {
        return this.code == 25;
    }

    public final boolean e0() {
        return this.code == 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiExecutionException)) {
            return false;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
        if (this.code != vKApiExecutionException.code) {
            return false;
        }
        Bundle bundle = this.extra;
        Bundle bundle2 = vKApiExecutionException.extra;
        return bundle == null ? bundle2 == null : epx.f(bundle, bundle2);
    }

    public final boolean f0() {
        return this.code == 24;
    }

    public final String g() {
        return this.apiMethod;
    }

    public final boolean g0() {
        return this.code == 31;
    }

    public final Integer h() {
        Bundle bundle = this.extra;
        if (bundle == null || !bundle.containsKey("captcha_attempt")) {
            return null;
        }
        return Integer.valueOf(this.extra.getInt("captcha_attempt", -1));
    }

    public final boolean h0() {
        return this.code == 17;
    }

    public final int hashCode() {
        int i = this.code * 31;
        Bundle bundle = this.extra;
        return i + (bundle != null ? bundle.hashCode() : 0);
    }

    public final int i() {
        Bundle bundle = this.extra;
        if (bundle != null) {
            return bundle.getInt("captcha_height", -1);
        }
        return -1;
    }

    public final String j() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString("captcha_img", "")) == null) ? "" : string;
    }

    public final boolean k() {
        Bundle bundle = this.extra;
        if (bundle == null || !bundle.containsKey("is_refresh_enabled")) {
            return false;
        }
        return this.extra.getBoolean("is_refresh_enabled", false);
    }

    public final Boolean l() {
        Bundle bundle = this.extra;
        boolean z = false;
        if (bundle != null && bundle.containsKey("is_sound_captcha_available")) {
            z = this.extra.getBoolean("is_sound_captcha_available", false);
        }
        return Boolean.valueOf(z);
    }

    public final double m() {
        Bundle bundle = this.extra;
        if (bundle != null) {
            return bundle.getDouble("captcha_ratio", -1.0d);
        }
        return -1.0d;
    }

    public final String n() {
        Bundle bundle = this.extra;
        if (bundle != null) {
            return bundle.getString("redirect_uri", null);
        }
        return null;
    }

    public final String o() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString("captcha_sid", "")) == null) ? "" : string;
    }

    public final Double p() {
        Bundle bundle = this.extra;
        if (bundle == null || !bundle.containsKey("captcha_ts")) {
            return null;
        }
        return Double.valueOf(this.extra.getDouble("captcha_ts", -1.0d));
    }

    public final String q() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString("captcha_track", "")) == null) ? "" : string;
    }

    public final int r() {
        Bundle bundle = this.extra;
        if (bundle != null) {
            return bundle.getInt("captcha_width", -1);
        }
        return -1;
    }

    public final int s() {
        return this.code;
    }

    public final String t() {
        return this.detailMessage;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = this.code;
        Bundle y = y();
        String str = this.apiMethod;
        List<VKApiExecutionException> list = this.executeErrors;
        String g0 = list != null ? j5g.g0(list, null, X3.j.d, X3.j.e, 0, null, 57) : null;
        String obj = super.toString();
        StringBuilder sb = new StringBuilder("VKApiExecutionException{code=");
        sb.append(i);
        sb.append(", extra=");
        sb.append(y);
        sb.append(", method=");
        n6j.b(sb, str, ", executeErrors=", g0, ", super=");
        return i5s.a(sb, obj, "}");
    }

    public final String u() {
        return this.errorMsg;
    }

    public final List<VKApiExecutionException> v() {
        return this.executeErrors;
    }

    public final Bundle w() {
        return this.extra;
    }

    public final boolean x() {
        return this.hasLocalizedMessage;
    }

    public final Bundle y() {
        Bundle bundle = this.extra;
        if (bundle == null || !bundle.containsKey(SharedKt.PARAM_ACCESS_TOKEN)) {
            return this.extra;
        }
        Bundle bundle2 = new Bundle(this.extra);
        bundle2.putString(SharedKt.PARAM_ACCESS_TOKEN, "hidden");
        return bundle2;
    }

    public final Map<String, String> z() {
        return this.requestParams;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VKApiExecutionException(int i, String str, boolean z, String str2, Bundle bundle, ArrayList arrayList, String str3, Map map, int i2, ApiErrorViewType apiErrorViewType, String str4, Throwable th, int i3) {
        super(str2, th == null ? new VKApiException(String.valueOf(arrayList)) : th);
        bundle = (i3 & 16) != 0 ? Bundle.EMPTY : bundle;
        arrayList = (i3 & 32) != 0 ? null : arrayList;
        str3 = (i3 & 64) != 0 ? null : str3;
        map = (i3 & 128) != 0 ? null : map;
        i2 = (i3 & 256) != 0 ? -1 : i2;
        apiErrorViewType = (i3 & 512) != 0 ? null : apiErrorViewType;
        str4 = (i3 & 1024) != 0 ? null : str4;
        th = (i3 & 2048) != 0 ? null : th;
        this.code = i;
        this.apiMethod = str;
        this.hasLocalizedMessage = z;
        this.detailMessage = str2;
        this.extra = bundle;
        this.executeErrors = arrayList;
        this.errorMsg = str3;
        this.requestParams = map;
        this.subcode = i2;
        this.viewType = apiErrorViewType;
        this.responseContentType = str4;
    }
}
