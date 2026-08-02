package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class kj {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3030 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f3031 = 6;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3032 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3033 = {'J', 'S', 'O', 'N', 'U', 't', 'i', 'l', GMTDateParser.SECONDS, 'E', 'r', 'o', ' ', 'v', 'a', GMTDateParser.DAY_OF_MONTH, 'n', 'g', 'j', '.', '(', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'e', ')', 'x', 'y', 'T', GMTDateParser.HOURS, 'K', 'L', GMTDateParser.MONTH, 'P', 'Q', 'R', 'V'};

    public interface a<T> {
        /* renamed from: ﻛ */
        T mo6109(JSONObject jSONObject, String str);
    }

    public interface e<T> {
        /* renamed from: ｋ */
        T mo6110(JSONArray jSONArray, int i);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m8417(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3030 + 35;
        f3032 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8418 = m8418(jSONObject, false);
        int i4 = f3032 + 9;
        f3030 = i4 % 128;
        if (i4 % 2 == 0) {
            return m8418;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m8418(JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f3032 + 37;
        f3030 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject != null) {
            try {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.toString());
                if (z) {
                    int i4 = f3030 + 83;
                    f3032 = i4 % 128;
                    int i5 = i4 % 2;
                    jsonObjectInit.remove(is.f2629);
                }
                return jsonObjectInit;
            } catch (JSONException unused) {
            }
        }
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        int i6 = f3032 + 73;
        f3030 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return jsonObjectInit2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8425(JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f3030 + 105;
        f3032 = i2 % 128;
        int i3 = i2 % 2;
        m8412(jSONObject, jSONObject2, false);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8412(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        int i = 2 % 2;
        int i2 = f3030 + 3;
        f3032 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(is.f2629);
            int i3 = f3032 + 1;
            f3030 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m8409(JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f3030 + 95;
        int i3 = i2 % 128;
        f3032 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (jSONArray != null) {
            return m8411(jSONArray);
        }
        int i4 = i3 + 83;
        f3030 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static <T> List<T> m8411(JSONArray jSONArray) {
        int i = 2 % 2;
        List<T> m8423 = m8423(jSONArray, new e<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final T mo6110(JSONArray jSONArray2, int i2) {
                return (T) jSONArray2.opt(i2);
            }
        });
        int i2 = f3030 + 111;
        f3032 = i2 % 128;
        if (i2 % 2 != 0) {
            return m8423;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> List<T> m8423(JSONArray jSONArray, e<T> eVar) {
        int i = 2 % 2;
        int i2 = f3030 + 113;
        f3032 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            T mo6110 = eVar.mo6110(jSONArray, i4);
            if (mo6110 != null) {
                int i5 = f3032 + 89;
                f3030 = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList.add(mo6110);
                    throw null;
                }
                arrayList.add(mo6110);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m8416(JSONObject jSONObject, String str, List<String> list) {
        int i = 2 % 2;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            int i2 = f3032 + 105;
            f3030 = i2 % 128;
            int i3 = i2 % 2;
            return list;
        }
        List<String> m8409 = m8409(optJSONArray);
        int i4 = f3030 + 83;
        f3032 = i4 % 128;
        int i5 = i4 % 2;
        return m8409;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8420(JSONObject jSONObject, int i) {
        int i2 = 2 % 2;
        int i3 = f3032 + 63;
        f3030 = i3 % 128;
        int i4 = i3 % 2;
        m8421(jSONObject, i, (List<String>) null);
        if (i4 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8421(JSONObject jSONObject, int i, List<String> list) {
        int i2;
        int i3 = 2 % 2;
        try {
            JSONArray names = jSONObject.names();
            if (names != null) {
                for (0; i2 < names.length(); i2 + 1) {
                    int i4 = f3030 + 9;
                    f3032 = i4 % 128;
                    int i5 = i4 % 2;
                    String optString = names.optString(i2);
                    if (list != null) {
                        int i6 = f3030 + 77;
                        f3032 = i6 % 128;
                        int i7 = i6 % 2;
                        i2 = list.contains(optString) ? i2 + 1 : 0;
                    }
                    m8415(jSONObject, optString, i);
                }
            }
        } catch (JSONException e2) {
            m.m8535(m8408(9 - TextUtils.getOffsetBefore("", 0), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\bÁ", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 79)).intern(), m8408(21 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\n\u000b\u000b\u0006\u0006\u0010\u000e\u000f\b\u0007\u0010\u000f\u0000\u000b\u0011\f\u0012\u0018\t\u0006\u008f", (byte) (32 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), e2);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8415(JSONObject jSONObject, String str, int i) throws JSONException {
        String m8422;
        int i2 = 2 % 2;
        int i3 = f3030 + 79;
        f3032 = i3 % 128;
        if (i3 % 2 == 0) {
            m8422 = m8422(jSONObject.opt(str), i);
            int i4 = 8 / 0;
            if (m8422 == null) {
                return;
            }
        } else {
            m8422 = m8422(jSONObject.opt(str), i);
            if (m8422 == null) {
                return;
            }
        }
        int i5 = f3032 + 47;
        f3030 = i5 % 128;
        int i6 = i5 % 2;
        if (m8422.equals("")) {
            m8422 = null;
        }
        jSONObject.put(str, m8422);
        int i7 = f3032 + 91;
        f3030 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8419(JSONArray jSONArray, int i) throws JSONException {
        int i2 = 2 % 2;
        int i3 = f3032 + 45;
        f3030 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < jSONArray.length()) {
            int i6 = f3030 + 47;
            f3032 = i6 % 128;
            if (i6 % 2 == 0) {
                m8410(jSONArray, i5, i);
                i5 += 112;
            } else {
                m8410(jSONArray, i5, i);
                i5++;
            }
            int i7 = f3030 + 77;
            f3032 = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = f3032 + 83;
        f3030 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m8410(JSONArray jSONArray, int i, int i2) throws JSONException {
        int i3 = 2 % 2;
        int i4 = f3032 + 35;
        f3030 = i4 % 128;
        if (i4 % 2 == 0) {
            String m8422 = m8422(jSONArray.opt(i), i2);
            if (m8422 != null) {
                jSONArray.put(i, m8422);
            }
            int i5 = f3032 + 31;
            f3030 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        m8422(jSONArray.opt(i), i2);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8422(Object obj, int i) throws JSONException {
        int i2 = 2 % 2;
        if (obj instanceof JSONObject) {
            m8420((JSONObject) obj, i);
            int i3 = f3032 + 1;
            f3030 = i3 % 128;
            int i4 = i3 % 2;
        } else if (obj instanceof JSONArray) {
            int i5 = f3032 + 31;
            f3030 = i5 % 128;
            if (i5 % 2 != 0) {
                m8419((JSONArray) obj, i);
                int i6 = 16 / 0;
            } else {
                m8419((JSONArray) obj, i);
            }
        } else if (obj instanceof String) {
            int i7 = f3030 + 111;
            f3032 = i7 % 128;
            if (i7 % 2 == 0) {
                ((String) obj).length();
                throw null;
            }
            String str = (String) obj;
            if (str.length() > i) {
                return new StringBuilder().append(str.substring(0, i)).append(m8408(14 - View.resolveSizeAndState(0, 0, 0), "\u008d\u008d\u0014\u0015\u0004\u000b\u0016\u000f\u0014\u0010\u000b\u001d\f\u001b", (byte) (96 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()).toString();
            }
            int i8 = f3032 + 65;
            f3030 = i8 % 128;
            int i9 = i8 % 2;
            return str;
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Map<String, String> m8413(JSONObject jSONObject) {
        int i = 2 % 2;
        Map<String, String> m8424 = m8424(jSONObject, new a<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* renamed from: ﻛ */
            public final /* synthetic */ String mo6109(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i2 = f3030 + 3;
        f3032 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return m8424;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> Map<String, T> m8424(JSONObject jSONObject, a<T> aVar) {
        int i = 2 % 2;
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        int i2 = f3032 + 7;
        f3030 = i2 % 128;
        int i3 = i2 % 2;
        while (!(!keys.hasNext())) {
            int i4 = f3032 + 99;
            f3030 = i4 % 128;
            if (i4 % 2 == 0) {
                String next = keys.next();
                hashMap.put(next, aVar.mo6109(jSONObject, next));
            } else {
                String next2 = keys.next();
                hashMap.put(next2, aVar.mo6109(jSONObject, next2));
                throw null;
            }
        }
        return hashMap;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static JSONObject m8414(int i, int i2, long j, long j2) {
        int i3 = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (j <= -1) {
                jsonObjectInit.put(m8408(TextUtils.getOffsetAfter("", 0) + 1, "½", (byte) (69 - Color.argb(0, 0, 0, 0))).intern(), -1);
                jsonObjectInit.put(m8408(-TextUtils.indexOf((CharSequence) "", '0', 0), "ß", (byte) (101 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), -1);
                jsonObjectInit.put(m8408(-TextUtils.lastIndexOf("", '0', 0, 0), "æ", (byte) (114 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), -1);
                jsonObjectInit.put(m8408((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, "\u008a", (byte) (MotionEvent.axisFromString("") + 22)).intern(), -1);
                return jsonObjectInit;
            }
            int i4 = f3030 + 65;
            f3032 = i4 % 128;
            int i5 = i4 % 2;
            jsonObjectInit.put(m8408(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "½", (byte) (70 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), i);
            jsonObjectInit.put(m8408(1 - TextUtils.indexOf("", "", 0), "ß", (byte) (Process.getGidForName("") + 103)).intern(), i2);
            jsonObjectInit.put(m8408(ExpandableListView.getPackedPositionGroup(0L) + 1, "æ", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 115)).intern(), j);
            jsonObjectInit.put(m8408(1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u008a", (byte) (Gravity.getAbsoluteGravity(0, 0) + 21)).intern(), j2);
            int i6 = f3032 + 75;
            f3030 = i6 % 128;
            int i7 = i6 % 2;
            return jsonObjectInit;
        } catch (JSONException e2) {
            m.m8535(m8408((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\bÁ", (byte) (78 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), m8408(29 - ExpandableListView.getPackedPositionGroup(0L), "\n\u000b\u000b\u0006\u0006\u0010\u001c\u0010\u0014\u0011\u0000\u000b\u0011\f\r\u0006\u0014\u000e\u0003\u001d\t\u0017\u001c\"\u0012\u0018\t\u0006À", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 82)).intern(), e2);
            return jsonObjectInit;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8408(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f3033;
            char c = f3031;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
