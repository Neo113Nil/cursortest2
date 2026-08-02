package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class di extends cw implements ch {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1719 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1721;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private hv f1725;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private hv f1726;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1723 = {'g', 14638, 29410, 43954, 58691, 7682, 22448, 37230, 51773, 1014, 15516, 30293, 45047, 'g', 14638, 29410, 43959, 58693, 7699, 22439, 37218, 51725, 977, 15490, 30282, 53680, 59641, 41781, 31349, 13449, 53189, 34420, 16558, 7142, 53762, 60764, 42938, 32298, 14696, 62376, 'g', 14638, 29410, 43940, 58690, 7699, 22401, 37228, 51754, 967, 15533, 30283, 45025, 59566, 8814, 23308, 38086, 52638, 1810, 16616, 31148, 45890, 'a', 14639, 29426, 43954, 58691, 7682, 22448, 37230, 51773, 1014, 15516, 30293, 'a', 14639, 29426, 43954, 58691, 7682, 22448, 37230, 51773, 1014, 15516, 30293, 45047, 46036, 35482, 49479, 6173, 22260, 44451, 58384, 8925, 31160, 45156, 36663, 50687, 61413, 54955, 40310, 17440, 2758, 61847, 47109, 32488, 9646, 60483, 54079, 39375, 16492, 17949, 32595, 13454, 60884, 41779, 22628, 4560, 55076, 35926, 17843, 17180, 31314, 12687, 59605, 42546, 23909, 5329, 53797, 35159, 16562, 32736, GMTDateParser.SECONDS, 14638, 29410, 43954, 58691, 7682, 22448, 37230, 51773, 1014, 15516, 30293, 45015, 59552, 8815, 23319, 38099, 52638, 'g', 14638, 29410, 43944, 58689, 7702, 22437, 37224, 51725, 977, 15490, 30314, 45035, 59578, 8808, 23302, 38101, 19912, 29845, 16217, 58892, 43262, 21416, 6684, 56537, 34742, 20074, 28985, 15313, 57936, 42241, 28627, 5821, 55662, 'g', 14638, 29410, 43959, 58693, 7699, 22439, 37218, 51725, 977, 15490, 30314, 45035, 59578, 8808, 23302, 38101, GMTDateParser.SECONDS, 14638, 29410, 43944, 58703, 7704, 22444, 37208, 51754, 975, 15549, 30294, 45041, 59581, 8825, 23296, 11716, 5261, 24385, 34315, 51436, 13243, 31247, 48379, 59273, 11884, 4382, 23541, 33362, 50462, 4058, 30371, 'g', 14638, 29410, 43938, 58718, 7698, 22435, 37241, 51761, 981, 15499, 30314, 45035, 59578, 8808, 23302, 38101, 52657, 1845, 16638, 31154, 24754, 23035, 4663, 52080, 34186, 32466, GMTDateParser.SECONDS, 14638, 29410, 43941, 58719, 7687, GMTDateParser.HOURS, 14634, 29413, 43938, 58718, 7698, 22435, 37241, 51761, 981, 15499, 30320, 45034, 59561, 8821, 64630, 50444, 36550, 22453, 6509, 57899, 43905, 27997, 13860, 65528, 49341, 35427, 51422, 61858, 47743, 25365, 11717, 54988, 40750, 23038, 682, 52052, 62480, 48770, 26490, 8236, 60132, 37789, 23646, 1300, 53172, 34916, 45344, 31644, 9386, 60756, 38902, 20649, 6513, 49691, 36057, 46465, 32280, 14560, 57757, 43615, 21325, 7604, 50806, 36664, 18896, 29312, 15174, 58808, 44728, 22375, 4107, 56028, 33678, 19514, 30379, 16359, '\''};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static long f1724 = 2573948819950614859L;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f1720 = 5;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1722 = {'g', 'e', 't', 'I', GMTDateParser.MINUTES, 'a', 'U', 'r', 'l', GMTDateParser.SECONDS, 'c', 'o', 'n', 'E', GMTDateParser.DAY_OF_MONTH, 'C', 'V', 'i', 'v', 'T', 'y', 'p', 'S', AbstractJsonLexerKt.UNICODE_ESC, 'J'};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1728 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1730 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1731 = new ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1732 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1729 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject f1727 = IronSourceNetworkBridge.jsonObjectInit();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m7527() {
        int i = 2 % 2;
        int i2 = f1721 + 3;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.f1728;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return list;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m7520() {
        int i = 2 % 2;
        int i2 = f1719 + 25;
        int i3 = i2 % 128;
        f1721 = i3;
        int i4 = i2 % 2;
        List<String> list = this.f1730;
        int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1719 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m7508() {
        List<String> list;
        int i = 2 % 2;
        int i2 = f1719 + 47;
        int i3 = i2 % 128;
        f1721 = i3;
        if (i2 % 2 != 0) {
            list = this.f1731;
            int i4 = 74 / 0;
        } else {
            list = this.f1731;
        }
        int i5 = i3 + 37;
        f1719 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return list;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m7512() {
        int i = 2 % 2;
        int i2 = f1719 + 79;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.f1732;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return list;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> m7515() {
        int i = 2 % 2;
        int i2 = f1719 + 13;
        f1721 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1729;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private hv m7502() {
        int i = 2 % 2;
        int i2 = f1719;
        int i3 = i2 + 83;
        f1721 = i3 % 128;
        int i4 = i3 % 2;
        hv hvVar = this.f1725;
        int i5 = i2 + 3;
        f1721 = i5 % 128;
        if (i5 % 2 == 0) {
            return hvVar;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private hv m7506() {
        int i = 2 % 2;
        int i2 = f1719 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f1721 = i3;
        int i4 = i2 % 2;
        hv hvVar = this.f1726;
        int i5 = i3 + 85;
        f1719 = i5 % 128;
        int i6 = i5 % 2;
        return hvVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7509(String str) {
        int i = 2 % 2;
        int i2 = f1721 + 77;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        m7510(str, this.f1728);
        int i4 = f1719 + 87;
        f1721 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7529(List<String> list) {
        int i = 2 % 2;
        int i2 = f1719 + 31;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        m7524(list, this.f1728);
        int i4 = f1721 + 1;
        f1719 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7513(String str) {
        int i = 2 % 2;
        int i2 = f1719 + 31;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        m7510(str, this.f1730);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7514(List<String> list) {
        int i = 2 % 2;
        int i2 = f1719 + 103;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        m7524(list, this.f1730);
        int i4 = f1719 + 13;
        f1721 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7517(String str) {
        int i = 2 % 2;
        int i2 = f1719 + 61;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        m7510(str, this.f1731);
        int i4 = f1721 + 5;
        f1719 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7523(List<String> list) {
        int i = 2 % 2;
        int i2 = f1719 + 109;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        m7524(list, this.f1731);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7522(String str) {
        int i = 2 % 2;
        int i2 = f1721 + 13;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        m7510(str, this.f1732);
        int i4 = f1719 + 113;
        f1721 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7518(List<String> list) {
        int i = 2 % 2;
        int i2 = f1721 + 29;
        f1719 = i2 % 128;
        if (i2 % 2 == 0) {
            m7524(list, this.f1732);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        m7524(list, this.f1732);
        int i3 = f1721 + 51;
        f1719 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7528(String str) {
        int i = 2 % 2;
        int i2 = f1721 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1719 = i2 % 128;
        if (i2 % 2 == 0) {
            m7510(str, this.f1729);
            throw null;
        }
        m7510(str, this.f1729);
        int i3 = f1721 + 89;
        f1719 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7511(List<String> list) {
        int i = 2 % 2;
        int i2 = f1719 + 107;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        m7524(list, this.f1729);
        int i4 = f1721 + 65;
        f1719 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7521(hv hvVar) {
        int i = 2 % 2;
        int i2 = f1721 + 71;
        int i3 = i2 % 128;
        f1719 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (hvVar != null) {
            this.f1725 = hvVar;
        }
        int i4 = i3 + 19;
        f1721 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7516(hv hvVar) {
        int i = 2 % 2;
        int i2 = f1721 + 15;
        int i3 = i2 % 128;
        f1719 = i3;
        int i4 = i2 % 2;
        if (hvVar != null) {
            int i5 = i3 + 41;
            f1721 = i5 % 128;
            int i6 = i5 % 2;
            this.f1726 = hvVar;
        }
        int i7 = i3 + 91;
        f1721 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m7504() {
        int i = 2 % 2;
        int i2 = f1721 + 35;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1727;
        if (i3 != 0) {
            return jSONObject.optString(is.f2617);
        }
        int i4 = 58 / 0;
        return jSONObject.optString(is.f2617);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m7505(String str) {
        int i = 2 % 2;
        int i2 = f1721 + 5;
        f1719 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1727.put(is.f2617, str);
                int i3 = 46 / 0;
            } else {
                this.f1727.put(is.f2617, str);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m7498() {
        int i = 2 % 2;
        int i2 = f1719 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1727;
        if (i3 == 0) {
            return jSONObject.optString(is.f2613);
        }
        int i4 = 46 / 0;
        return jSONObject.optString(is.f2613);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m7501(String str) {
        int i = 2 % 2;
        int i2 = f1721 + 57;
        f1719 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f1727.put(is.f2613, str);
                int i3 = f1721 + 75;
                f1719 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.f1727.put(is.f2613, str);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m7500() {
        int i = 2 % 2;
        int i2 = f1721 + 47;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        String optString = this.f1727.optString(is.f2610);
        int i4 = f1719 + 1;
        f1721 = i4 % 128;
        int i5 = i4 % 2;
        return optString;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m7503(String str) {
        int i = 2 % 2;
        int i2 = f1721 + 103;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1727.put(is.f2610, str);
            int i4 = f1721 + 39;
            f1719 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private String m7495() {
        int i = 2 % 2;
        int i2 = f1721 + 9;
        f1719 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1727.optString(is.f2614);
            throw null;
        }
        String optString = this.f1727.optString(is.f2614);
        int i3 = f1721 + 85;
        f1719 = i3 % 128;
        int i4 = i3 % 2;
        return optString;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m7507(String str) {
        int i = 2 % 2;
        int i2 = f1719 + 87;
        f1721 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1727.put(is.f2614, str);
                int i3 = f1721 + 111;
                f1719 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 99 / 0;
                    return;
                }
                return;
            }
            this.f1727.put(is.f2614, str);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private String m7494() {
        int i = 2 % 2;
        int i2 = f1721 + 3;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        String optString = this.f1727.optString(is.f2611);
        int i4 = f1721 + 79;
        f1719 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return optString;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m7499(String str) {
        int i = 2 % 2;
        int i2 = f1719 + 83;
        f1721 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1727.put(is.f2611, str);
                return;
            }
            this.f1727.put(is.f2611, str);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m7492() {
        int i = 2 % 2;
        int i2 = f1719 + 1;
        f1721 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1727;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7525(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1721 + 41;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        this.f1727 = kj.m8417(jSONObject);
        int i4 = f1719 + 97;
        f1721 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m7496(String str) {
        int i = 2 % 2;
        int i2 = f1721 + 13;
        f1719 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1727.put(is.f2604, str);
            int i4 = f1719 + 23;
            f1721 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private String m7497() {
        String optString;
        int i = 2 % 2;
        int i2 = f1719 + 27;
        f1721 = i2 % 128;
        if (i2 % 2 != 0) {
            optString = this.f1727.optString(is.f2604);
            int i3 = 97 / 0;
        } else {
            optString = this.f1727.optString(is.f2604);
        }
        int i4 = f1721 + 103;
        f1719 = i4 % 128;
        int i5 = i4 % 2;
        return optString;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m7510(String str, List<String> list) {
        int i = 2 % 2;
        int i2 = f1719 + 97;
        int i3 = i2 % 128;
        f1721 = i3;
        int i4 = i2 % 2;
        if (list != null) {
            int i5 = i3 + 21;
            f1719 = i5 % 128;
            if (i5 % 2 == 0) {
                TextUtils.isEmpty(str);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (TextUtils.isEmpty(str) || list.contains(str)) {
                return;
            }
            list.add(str);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m7524(List<String> list, List<String> list2) {
        int i = 2 % 2;
        int i2 = f1719 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1721 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (!(!it.hasNext())) {
                int i3 = f1719 + 31;
                f1721 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7510(it.next(), list2);
                    super.hashCode();
                    throw null;
                }
                m7510(it.next(), list2);
            }
        }
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Object m7493() {
        boolean z;
        int i = 2 % 2;
        int i2 = f1719 + 33;
        f1721 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1728.size();
            throw null;
        }
        if (this.f1728.size() <= 0 && this.f1730.size() <= 0) {
            int i3 = f1721 + 91;
            f1719 = i3 % 128;
            int i4 = i3 % 2;
            if (this.f1729.size() <= 0) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private JSONObject m7491() {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (this.f1725 != null) {
                int i2 = f1719 + 85;
                f1721 = i2 % 128;
                if (i2 % 2 != 0) {
                    jsonObjectInit.put(is.f2621, this.f1725.m7862());
                    throw null;
                }
                jsonObjectInit.put(is.f2621, this.f1725.m7862());
            }
            if (this.f1726 != null) {
                jsonObjectInit.put(is.f2615, this.f1726.m7862());
                int i3 = f1719 + 103;
                f1721 = i3 % 128;
                int i4 = i3 % 2;
            }
            if (this.f1728.size() > 0) {
                jsonObjectInit.put(is.f2617, new JSONArray((Collection) this.f1728));
            }
            if (this.f1730.size() > 0) {
                jsonObjectInit.put(is.f2610, new JSONArray((Collection) this.f1730));
                int i5 = f1719 + 9;
                f1721 = i5 % 128;
                int i6 = i5 % 2;
            }
            if (this.f1731.size() > 0) {
                jsonObjectInit.put(is.f2611, new JSONArray((Collection) this.f1731));
            }
            if (this.f1732.size() > 0) {
                jsonObjectInit.put(is.f2614, new JSONArray((Collection) this.f1732));
            }
            if (this.f1729.size() > 0) {
                jsonObjectInit.put(is.f2613, new JSONArray((Collection) this.f1729));
            }
            if (this.f1727.length() > 0) {
                jsonObjectInit.putOpt(is.f2616, this.f1727.toString());
            }
        } catch (JSONException unused) {
        }
        return jsonObjectInit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        cl clVar2;
        int i = 2 % 2;
        try {
            char c = 20;
            try {
                switch (str.hashCode()) {
                    case -1836320845:
                        if (str.equals(m7526((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 62 - KeyEvent.normalizeMetaState(0), 12 - Color.argb(0, 0, 0, 0)).intern())) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1833890347:
                        if (str.equals(m7519(Drawable.resolveOpacity(0, 0) + 11, "\t\n\r\u0004\u0000\t\u0001\u0002\u0007\by", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13)).intern())) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1803337567:
                        if (str.equals(m7519(TextUtils.indexOf("", "") + 19, "\u0006\u0004\u0003\f\r\n\u0014\n\t\f\u0007\b\u0007\u0017\r\u0015\u0005\fÐ", (byte) (106 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern())) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1712168770:
                        if (str.equals(m7526((char) (ImageFormat.getBitsPerPixel(0) + 17278), 121 - ExpandableListView.getPackedPositionChild(0L), Process.getGidForName("") + 12).intern())) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1409157227:
                        if (str.equals(m7526((char) (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getMinimumFlingVelocity() >> 16, Color.alpha(0) + 13).intern())) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1362450249:
                        if (str.equals(m7526((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.red(0) + 267, 14 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1273813711:
                        if (str.equals(m7526((char) (19900 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 168, Process.getGidForName("") + 18).intern())) {
                            int i2 = f1721 + 61;
                            f1719 = i2 % 128;
                            int i3 = i2 % 2;
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1249364341:
                        if (str.equals(m7526((char) (24789 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 255, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6).intern())) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1245993915:
                        if (str.equals(m7526((char) Drawable.resolveOpacity(0, 0), 151 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1190960472:
                        if (str.equals(m7526((char) Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 234, 21 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                            int i4 = f1719 + 7;
                            f1721 = i4 % 128;
                            int i5 = i4 % 2;
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1099149698:
                        if (str.equals(m7526((char) (Color.rgb(0, 0, 0) + 16777216), ExpandableListView.getPackedPositionType(0L) + 40, 21 - Process.getGidForName("")).intern())) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1091371232:
                        if (str.equals(m7526((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 75, 13 - Color.alpha(0)).intern())) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1016025794:
                        if (str.equals(m7526((char) (46005 - View.resolveSizeAndState(0, 0, 0)), 88 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 12).intern())) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -924327250:
                        if (str.equals(m7519(14 - View.combineMeasuredStates(0, 0), "\t\n\n\u000e\r\n\u0014\n\t\f\u0007\b\t\u0005", (byte) (86 - TextUtils.lastIndexOf("", '0'))).intern())) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -905814529:
                        if (str.equals(m7526((char) TextUtils.getCapsMode("", 0, 0), TextUtils.getTrimmedLength("") + 261, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6).intern())) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -890333697:
                        if (str.equals(m7526((char) (53719 - Color.alpha(0)), Color.alpha(0) + 25, View.MeasureSpec.getSize(0) + 15).intern())) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -887729623:
                        if (str.equals(m7519((ViewConfiguration.getScrollBarSize() >> 8) + 12, "\u0001\u0002\u0003\u0004\u0000\t\u0001\u0002\u0007\b\t\u0005", (byte) (13 - TextUtils.indexOf("", "", 0, 0))).intern())) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -869156349:
                        if (str.equals(m7519(6 - Gravity.getAbsoluteGravity(0, 0), "\u0001\f\u0004\u000e\f\r", (byte) (View.resolveSizeAndState(0, 0, 0) + 102)).intern())) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case -747967915:
                        if (str.equals(m7526((char) (18045 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 113, 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -333660891:
                        if (str.equals(m7526((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 185, 17 - TextUtils.indexOf("", "", 0)).intern())) {
                            int i6 = f1721 + 19;
                            f1719 = i6 % 128;
                            int i7 = i6 % 2;
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -259609707:
                        if (!str.equals(m7519(19 - Color.blue(0), "\u0001\u0002\u0003\f\r\n\u0014\n\t\f\u0007\b\u0007\u0017\r\u0015\u0005\f§", (byte) (66 - ExpandableListView.getPackedPositionType(0L))).intern())) {
                            c = 65535;
                            break;
                        } else {
                            c = 28;
                            break;
                        }
                    case -140869031:
                        if (str.equals(m7519((ViewConfiguration.getJumpTapTimeout() >> 16) + 18, "\u0001\u0002\u0007\u0002\r\u0015\u0005\f\u0006\u000b\b\t\u0015\f\u0016\b\u000b\u0000", (byte) (60 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            int i8 = f1719 + 75;
                            f1721 = i8 % 128;
                            int i9 = i8 % 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 20418827:
                        if (str.equals(m7519(16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0006\u0004\u0000\u0011\u0006\u0002\u0007\u0000\u0012\u0013\u0004\u0010\u0015\u0016\u0091", (byte) ('\\' - AndroidCharacter.getMirror('0'))).intern())) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108267695:
                        if (str.equals(m7526((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 202, (-16777200) - Color.rgb(0, 0, 0)).intern())) {
                            int i10 = f1721 + 13;
                            f1719 = i10 % 128;
                            int i11 = i10 % 2;
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 177098421:
                        if (str.equals(m7519(KeyEvent.keyCodeFromString("") + 11, "\t\n\u000b\u0013\u0013\f\u0006\u0010\u0007\bÜ", (byte) (TextUtils.indexOf("", "", 0) + 112)).intern())) {
                            int i12 = f1721 + 53;
                            f1719 = i12 % 128;
                            int i13 = i12 % 2;
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 213978610:
                        if (str.equals(m7519(22 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0006\u0004\u0003\f\r\n\u0014\n\t\f\u0011\u0005\u0000\u0006\u0007\u0016\u0010\u0003\u000f\u0018\u0001\u0006", (byte) (18 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 779164621:
                        if (str.equals(m7526((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.green(0) + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, TextUtils.indexOf((CharSequence) "", '0', 0) + 19).intern())) {
                            c = 19;
                            break;
                        } else {
                            c = 65535;
                            break;
                        }
                    case 801466981:
                        if (str.equals(m7526((char) (Drawable.resolveOpacity(0, 0) + 61316), 99 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern())) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1195083870:
                        if (str.equals(m7519(12 - View.MeasureSpec.makeMeasureSpec(0, 0), "\t\n\u000b\u0013\u0013\f\u0006\u0010\u0007\b\t\u0005", (byte) (43 - ImageFormat.getBitsPerPixel(0))).intern())) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1323380041:
                        if (str.equals(m7526((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 13 - Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13).intern())) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1340011123:
                        if (str.equals(m7519(TextUtils.getCapsMode("", 0, 0) + 11, "\u0001\u0002\u0003\u0004\u000b\f\u000b\u0007\b\tÊ", (byte) (View.resolveSizeAndState(0, 0, 0) + 87)).intern())) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1345250484:
                        if (str.equals(m7519(21 - View.getDefaultSize(0, 0), "\u0006\u0004\u0000\u0011\u0006\u0002\u0007\u0000\u0012\u0013\u0002\u0015\r\u0015\u0005\f\u0004\u0015\u0006\u000e¢", (byte) (53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1939710523:
                        if (str.equals(m7526((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11683), TextUtils.indexOf((CharSequence) "", '0', 0) + Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 16 - View.combineMeasuredStates(0, 0)).intern())) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2108820561:
                        if (str.equals(m7519((KeyEvent.getMaxKeyCode() >> 16) + 17, "\u0006\u0004\u0003\u0004\u0000\t\u0001\u0002\u0007\b\u0007\u0017\r\u0015\u0005\f³", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 79)).intern())) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2109208793:
                        if (str.equals(m7519(14 - KeyEvent.normalizeMetaState(0), "\u0001\u0002\u0003\f\r\n\u0014\n\t\f\u0007\b\t\u0005", (byte) (TextUtils.lastIndexOf("", '0', 0) + 12)).intern())) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        return m7527();
                    case 1:
                        return m7520();
                    case 2:
                        return m7515();
                    case 3:
                        return m7512();
                    case 4:
                        return m7508();
                    case 5:
                        return Integer.valueOf(m7502().m7862());
                    case 6:
                        return Integer.valueOf(m7506().m7862());
                    case 7:
                        m7509((String) m7365(list, 0, String.class));
                        return null;
                    case '\b':
                        m7529((List<String>) m7365(list, 0, List.class));
                        return null;
                    case '\t':
                        m7513((String) m7365(list, 0, String.class));
                        return null;
                    case '\n':
                        m7514((List<String>) m7365(list, 0, List.class));
                        return null;
                    case 11:
                        m7517((String) m7365(list, 0, String.class));
                        return null;
                    case '\f':
                        m7523((List<String>) m7365(list, 0, List.class));
                        return null;
                    case '\r':
                        m7522((String) m7365(list, 0, String.class));
                        return null;
                    case 14:
                        m7518((List<String>) m7365(list, 0, List.class));
                        return null;
                    case 15:
                        m7528((String) m7365(list, 0, String.class));
                        return null;
                    case 16:
                        m7511((List<String>) m7365(list, 0, List.class));
                        return null;
                    case 17:
                        m7521(hv.m7859(((Integer) m7365(list, 0, Integer.class)).intValue()));
                        return null;
                    case 18:
                        m7516(hv.m7859(((Integer) m7365(list, 0, Integer.class)).intValue()));
                        return null;
                    case 19:
                        m7505((String) m7365(list, 0, String.class));
                        int i14 = f1721 + 9;
                        f1719 = i14 % 128;
                        int i15 = i14 % 2;
                        return null;
                    case 20:
                        return m7504();
                    case 21:
                        m7503((String) m7365(list, 0, String.class));
                        return null;
                    case 22:
                        return m7500();
                    case 23:
                        m7501((String) m7365(list, 0, String.class));
                        return null;
                    case 24:
                        return m7498();
                    case 25:
                        m7507((String) m7365(list, 0, String.class));
                        return null;
                    case 26:
                        return m7495();
                    case 27:
                        m7499((String) m7365(list, 0, String.class));
                        return null;
                    case 28:
                        return m7494();
                    case 29:
                        return m7492();
                    case 30:
                        m7525((JSONObject) m7365(list, 0, JSONObject.class));
                        return null;
                    case 31:
                        return m7497();
                    case ' ':
                        m7496((String) m7365(list, 0, String.class));
                        return null;
                    case '!':
                        return m7493();
                    case '\"':
                        return m7491();
                    default:
                        clVar2 = clVar;
                        try {
                            new ds(clVar2, eeVar, m7526((char) (64565 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.getTrimmedLength("") + 282, 12 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m7593(clVar2.m7203());
                            return null;
                        } catch (Exception e) {
                            e = e;
                            break;
                        }
                }
            } catch (Exception e2) {
                e = e2;
                clVar2 = clVar;
            }
        } catch (Exception e3) {
            e = e3;
            clVar2 = clVar;
        }
        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7526((char) (51355 - View.combineMeasuredStates(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 294, 50 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()).append(str).append(m7526((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 343, (Process.myPid() >> 22) + 1).intern()).toString(), e);
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7526(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1723[c.f1198 + i] ^ (c.f1198 * f1724)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7519(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1722;
            char c = f1720;
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
