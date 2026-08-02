package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class u<K, T> implements t<K, T> {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f3191 = 37536;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3192 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3193 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f3194 = 55970;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3195 = 51213;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f3196 = -7908161712958246690L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3197 = 31722;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private t<K, T> f3198 = new t<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﻐ */
        public final void mo5820(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﻐ */
        public final void mo5821(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﻛ */
        public final void mo5822(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ｋ */
        public final void mo5823(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ｋ */
        public final void mo5824(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﾇ */
        public final void mo5825(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﾒ */
        public final void mo5826(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.t
        /* renamed from: ﾒ */
        public final void mo5827(JSONObject jSONObject, K k, Object obj, T t) {
        }
    };

    /* renamed from: ﻛ, reason: contains not printable characters */
    private t<K, T> f3199;

    /* renamed from: ﾒ */
    protected abstract String mo5818(T t);

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8631(t<K, T> tVar) {
        int i = 2 % 2;
        int i2 = f3193 + 51;
        f3192 = i2 % 128;
        int i3 = i2 % 2;
        this.f3199 = tVar;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private t<K, T> m8629() {
        int i = 2 % 2;
        int i2 = f3193;
        int i3 = i2 + 83;
        f3192 = i3 % 128;
        if (i3 % 2 == 0) {
            t<K, T> tVar = this.f3199;
            if (tVar != null) {
                int i4 = i2 + 11;
                f3192 = i4 % 128;
                if (i4 % 2 == 0) {
                    return tVar;
                }
                throw null;
            }
            return this.f3198;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public void mo5823(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f3193 + 33;
        f3192 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8626 = m8626(jSONObject, (JSONObject) t);
        m8627(m8630("炟\ueb71䝨ꏛᾛ穚홬㈿껧\u0a84敕섃㵠", 39883 - TextUtils.getTrimmedLength("")).intern(), m8626);
        m8629().mo5823(m8626, k, t);
        int i4 = f3193 + 31;
        f3192 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻐ */
    public void mo5820(JSONObject jSONObject, K k, T t) {
        JSONObject m8626;
        int i;
        int i2 = 2 % 2;
        int i3 = f3192 + 53;
        f3193 = i3 % 128;
        if (i3 % 2 == 0) {
            m8626 = m8626(jSONObject, (JSONObject) t);
            i = 60588 >> (ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1));
        } else {
            m8626 = m8626(jSONObject, (JSONObject) t);
            i = 60588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        }
        m8627(m8630("炟鰗ꦤ뚽숃\uefccﲠࠉᗗ⊲乹寕棢瑲臐꺉멼쟂퓎", i).intern(), m8626);
        m8629().mo5820(m8626, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻐ */
    public final void mo5821(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f3192 + 63;
        f3193 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8626 = m8626(jSONObject, (JSONObject) t);
        m8627(m8628("벂ㇽ篘涻㱛䨺⌉䃾韛⣹뾤椿", 11 - View.resolveSize(0, 0)).intern(), m8626);
        m8629().mo5821(m8626, k, obj, t);
        int i4 = f3193 + 25;
        f3192 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public final void mo5824(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f3192 + 71;
        f3193 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8626 = m8626(jSONObject, (JSONObject) t);
        m8627(m8630("炟櫷䑤㹚ᦆ\uf336\ued73좮ꋓ鰏矼凷䬰╘\u0085墳푤쾰ꦎ", 6732 - TextUtils.indexOf((CharSequence) "", '0')).intern(), m8626);
        m8629().mo5824(m8626, k, obj, t);
        int i4 = f3193 + 79;
        f3192 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻛ */
    public final void mo5822(JSONObject jSONObject, K k, T t) {
        JSONObject m8626;
        int indexOf;
        int i = 2 % 2;
        int i2 = f3192 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3193 = i2 % 128;
        if (i2 % 2 == 0) {
            m8626 = m8626(jSONObject, (JSONObject) t);
            indexOf = 115 >> TextUtils.indexOf("", "");
        } else {
            m8626 = m8626(jSONObject, (JSONObject) t);
            indexOf = TextUtils.indexOf("", "") + 9;
        }
        m8627(m8628("벂ㇽ篘涻ﰐ땥ည싹ꇒⶱ", indexOf).intern(), m8626);
        m8629().mo5822(m8626, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﾇ */
    public final void mo5825(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f3193 + 69;
        f3192 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8626 = m8626(jSONObject, (JSONObject) t);
        m8627(m8628("\uf7dd塵郇䅎늟\uedb1엪┾ꏢ\ud8d3ት酞竫瘪", 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m8626);
        m8629().mo5825(m8626, k, t);
        int i4 = f3192 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3193 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﾒ */
    public final void mo5827(JSONObject jSONObject, K k, Object obj, T t) {
        JSONObject m8626;
        int rgb;
        int i = 2 % 2;
        int i2 = f3193 + 57;
        f3192 = i2 % 128;
        if (i2 % 2 != 0) {
            m8626 = m8626(jSONObject, (JSONObject) t);
            rgb = (-16729359) << Color.rgb(0, 1, 1);
        } else {
            m8626 = m8626(jSONObject, (JSONObject) t);
            rgb = (-16729359) - Color.rgb(0, 0, 0);
        }
        m8627(m8630("炉쩌՟䀭魿혝ᄝ氧Ꜣ\ue29d", rgb).intern(), m8626);
        m8629().mo5827(m8626, k, obj, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﾒ */
    public final void mo5826(JSONObject jSONObject, K k, T t) {
        JSONObject m8626;
        String m8630;
        int i = 2 % 2;
        int i2 = f3192 + 57;
        f3193 = i2 % 128;
        if (i2 % 2 == 0) {
            m8626 = m8626(jSONObject, (JSONObject) t);
            m8630 = m8630("炝뿆\uee77ử䴅綒거\udb40ீ㩮櫲餅째", View.MeasureSpec.getSize(1) * 53101);
        } else {
            m8626 = m8626(jSONObject, (JSONObject) t);
            m8630 = m8630("炝뿆\uee77ử䴅綒거\udb40ீ㩮櫲餅째", 53101 - View.MeasureSpec.getSize(0));
        }
        m8627(m8630.intern(), m8626);
        m8629().mo5826(m8626, k, t);
        int i3 = f3192 + 25;
        f3193 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8627(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        m.m8524(m8628("벂ㇽ\u07bcᆭ\u0fdb\ue9df\ufb09モ겂鄰ǅ뮢\uf1f7㩘", 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), new StringBuilder().append(getClass().getName()).append(m8628("淧墅ᇸ侑", 3 - TextUtils.getOffsetBefore("", 0)).intern()).append(str).toString(), jSONObject);
        int i2 = f3192 + 5;
        f3193 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m8626(JSONObject jSONObject, T t) {
        int i = 2 % 2;
        int i2 = f3192 + 17;
        f3193 = i2 % 128;
        try {
        } catch (JSONException e) {
            m.m8535(m8628("벂ㇽ\u07bcᆭ\u0fdb\ue9df\ufb09モ겂鄰ǅ뮢\uf1f7㩘", KeyEvent.normalizeMetaState(0) + 14).intern(), m8628("膍￨ǅ뮢슛坊转㱗躻⍪דᴲᦄ蒫旝㮌뭾ࢯ〥ۤथꃲ텵淁鑎饵", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25).intern(), e);
        }
        if (i2 % 2 == 0) {
            jSONObject.has(is.f2636);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!jSONObject.has(is.f2636)) {
            jSONObject.put(is.f2636, mo5818(t));
        }
        if (!jSONObject.has(is.f2629)) {
            int i3 = f3193 + 103;
            f3192 = i3 % 128;
            if (i3 % 2 != 0) {
                jSONObject.put(is.f2629, ke.m8357());
                int i4 = 70 / 0;
            } else {
                jSONObject.put(is.f2629, ke.m8357());
            }
        }
        int i5 = f3193 + 17;
        f3192 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8630(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f3196);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8628(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3194)) ^ ((c2 >>> 5) + f3191)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3195) ^ ((c3 + i2) ^ ((c3 << 4) + f3197))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
