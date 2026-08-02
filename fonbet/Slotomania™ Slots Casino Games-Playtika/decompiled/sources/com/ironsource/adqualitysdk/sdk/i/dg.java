package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.kj;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class dg {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f1688 = 1;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static int f1689 = 0;

    /* renamed from: סּ, reason: contains not printable characters */
    private static short[] f1690 = null;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static byte[] f1691 = {-91, 92, -84, 91, 87, -75, -14, -28, Ascii.DLE, -16, 9, 7, 17, -37, Ascii.ETB, -12, 110, -112, -108, 110, -99, 89, 85, 91, -83, 80, -96, -76, 78, -113, 97, -114, 105, 96, 115, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1692 = -1557204094;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1693 = 79;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1694 = -1128222186;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static long f1695 = -2076026187363362820L;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Map<String, dl> f1696;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f1697;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private ee f1698;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private dp f1699;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String f1700;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f1701;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee f1702;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1703;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1704;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1705;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject f1706;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m7473(dg dgVar) {
        int i = 2 % 2;
        int i2 = f1689 + 113;
        f1688 = i2 % 128;
        int i3 = i2 % 2;
        String str = dgVar.f1704;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public dg(String str, ee eeVar) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            this.f1706 = jsonObjectInit;
            this.f1702 = eeVar;
            this.f1704 = jsonObjectInit.optString(m7474("繁䧟縯ṂЈ\ueaa2ꮝ\ued33", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            this.f1703 = this.f1706.optString(m7474("\uf065歎\uf001㳛\uef9e婔꿹\udcc3侄㩺俤䀕糿巐⾨", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern());
            this.f1705 = this.f1706.optString(m7475((short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 1128222304 - Gravity.getAbsoluteGravity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 72, (Process.myTid() >> 22) + 1557204094, (byte) (90 - (KeyEvent.getMaxKeyCode() >> 16))).intern());
            this.f1697 = this.f1706.optString(m7475((short) KeyEvent.keyCodeFromString(""), 1128222295 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 73, 1557204100 - Color.argb(0, 0, 0, 0), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 12)).intern());
            this.f1701 = this.f1706.optString(m7475((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1128222295 - View.combineMeasuredStates(0, 0), (-73) - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1557204104 - ExpandableListView.getPackedPositionChild(0L), (byte) ExpandableListView.getPackedPositionGroup(0L)).intern());
            if (this.f1706.has(m7474("ᲂ\ue0bc᳥뜬漀꩟䌓圼켼쩂ꌌ삗\uf713귉꼻橮", View.resolveSize(0, 0)).intern())) {
                m7476(this.f1706.optJSONObject(m7474("ᲂ\ue0bc᳥뜬漀꩟䌓圼켼쩂ꌌ삗\uf713귉꼻橮", Color.red(0)).intern()));
            }
        } catch (Throwable th) {
            cn.m7268(this.f1704, m7474("麩౻黬寵\ue952왅섫뮷䥓Ꙉℬ䛘ᯆ쇞⥴٣脗篐褰\ue679\ue106\udba9椎䘏䅺㮣줟☈ꄩ鮄꤯蘤şﮞष", ExpandableListView.getPackedPositionGroup(0L)).intern(), th);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7476(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1688 + 89;
        f1689 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> keys = jSONObject.keys();
        int i4 = f1689 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1688 = i4 % 128;
        int i5 = i4 % 2;
        while (keys.hasNext()) {
            int i6 = f1689 + 99;
            f1688 = i6 % 128;
            int i7 = i6 % 2;
            String next = keys.next();
            this.f1702.m7713(next, jSONObject.opt(next));
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m7484() {
        int i = 2 % 2;
        int i2 = f1688;
        int i3 = i2 + 45;
        f1689 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1704;
        int i5 = i2 + 57;
        f1689 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m7482() {
        int i = 2 % 2;
        int i2 = f1688 + 53;
        f1689 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1703;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m7481() {
        int i = 2 % 2;
        int i2 = f1689 + 97;
        int i3 = i2 % 128;
        f1688 = i3;
        int i4 = i2 % 2;
        String str = this.f1705;
        int i5 = i3 + 85;
        f1689 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7480() {
        int i = 2 % 2;
        int i2 = f1689 + 11;
        int i3 = i2 % 128;
        f1688 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1697;
        int i4 = i3 + 83;
        f1689 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m7485() {
        int i = 2 % 2;
        int i2 = f1689 + 41;
        int i3 = i2 % 128;
        f1688 = i3;
        int i4 = i2 % 2;
        String str = this.f1701;
        int i5 = i3 + 15;
        f1689 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final ee m7478() {
        int i = 2 % 2;
        int i2 = f1689 + 89;
        f1688 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f1698 == null) {
            ee eeVar = new ee(kj.m8424(this.f1706.optJSONObject(m7475((short) ExpandableListView.getPackedPositionType(0L), 1128222284 - TextUtils.lastIndexOf("", '0'), (-73) - View.MeasureSpec.getMode(0), 1557204110 - Color.alpha(0), (byte) (Color.rgb(0, 0, 0) + 16777105)).intern()), new kj.a<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.3

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static int f1708 = 0;

                /* renamed from: ｋ, reason: contains not printable characters */
                private static int f1709 = 1;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static long f1710 = -5362287174539414354L;

                @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                /* renamed from: ﻛ */
                public final Object mo6109(JSONObject jSONObject, String str) {
                    int i4 = 2 % 2;
                    int i5 = f1708 + 87;
                    f1709 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        String optString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            optString = new StringBuilder().append(m7486("劺劘臂\uf3b2ࣿ", View.combineMeasuredStates(0, 0)).intern()).append(optString).append(m7486("劺劘臂\uf3b2ࣿ", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern()).toString();
                            int i7 = f1708 + 51;
                            f1709 = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        ef m7656 = new dx().m7656(dv.m7608(dg.m7473(dg.this), optString, optString));
                        int i9 = f1709 + 7;
                        f1708 = i9 % 128;
                        int i10 = i9 % 2;
                        return m7656;
                    } catch (Throwable th) {
                        cn.m7268(dg.m7473(dg.this), new StringBuilder().append(m7486("錅鍀颭纟汱诞鞱䇏喻ꬷ⯕\ue518㘇\uf61cᤔ횯\ueb4a\u0087", Color.rgb(0, 0, 0) + 16777216).intern()).append(str).append(m7486("婯婏\uecb1K\u187c\uf439젙袤⩝\udf6e琷骿", ViewConfiguration.getDoubleTapTimeout() >> 16).intern()).append(jSONObject.optString(str)).toString(), th);
                        return null;
                    }
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m7486(String str, int i4) {
                    String str2;
                    char[] cArr = str;
                    if (str != null) {
                        cArr = str.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (g.f2155) {
                        char[] m7785 = g.m7785(f1710, cArr2, i4);
                        g.f2157 = 4;
                        while (g.f2157 < m7785.length) {
                            g.f2156 = g.f2157 - 4;
                            m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f1710));
                            g.f2157++;
                        }
                        str2 = new String(m7785, 4, m7785.length - 4);
                    }
                    return str2;
                }
            }), this.f1702, true);
            this.f1698 = eeVar;
            eeVar.m7717(kj.m8423(this.f1706.optJSONArray(m7475((short) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1128222294, (ViewConfiguration.getLongPressTimeout() >> 16) - 72, View.MeasureSpec.getSize(0) + 1557204115, (byte) (88 - View.getDefaultSize(0, 0))).intern()), new kj.e<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.1
                @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
                /* renamed from: ｋ */
                public final /* synthetic */ String mo6110(JSONArray jSONArray, int i4) {
                    return eb.m7685(jSONArray.optString(i4));
                }
            }));
            int i4 = f1688 + 111;
            f1689 = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.f1698;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r11.f1699 = new com.ironsource.adqualitysdk.sdk.i.dp(r11.f1706.optJSONObject(m7475((short) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 1128222305 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-70) - android.graphics.Color.blue(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 1557204120, (byte) ((-100) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0))).intern()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (r11.f1699 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r11.f1699 == null) goto L9;
     */
    /* renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp m7477() {
        int i = 2 % 2;
        int i2 = f1688 + 87;
        f1689 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        dp dpVar = this.f1699;
        int i4 = f1689 + 103;
        f1688 = i4 % 128;
        if (i4 % 2 != 0) {
            return dpVar;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Map<String, dl> m7479() {
        int i = 2 % 2;
        if (this.f1696 == null) {
            this.f1696 = kj.m8424(this.f1706.optJSONObject(m7474("힁ተퟭ䗥\uf367ဖ蠔ꗲ卡瀀栒峬ព", '0' - AndroidCharacter.getMirror('0')).intern()), new kj.a<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.2
                @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                /* renamed from: ﻛ */
                public final /* synthetic */ dl mo6109(JSONObject jSONObject, String str) {
                    return new dl(dg.m7473(dg.this), str, jSONObject.optJSONObject(str));
                }
            });
            int i2 = f1688 + 23;
            f1689 = i2 % 128;
            int i3 = i2 % 2;
        }
        Map<String, dl> map = this.f1696;
        int i4 = f1688 + 19;
        f1689 = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m7483(String str) {
        Map<String, String> m8413;
        int i = 2 % 2;
        int i2 = f1688 + 103;
        int i3 = i2 % 128;
        f1689 = i3;
        int i4 = i2 % 2;
        if (this.f1700 == null) {
            int i5 = i3 + 89;
            f1688 = i5 % 128;
            if (i5 % 2 != 0 ? (m8413 = kj.m8413(this.f1706.optJSONObject(m7474("껪퍶꺙蓮꙼䙟\uf175擛٠♾ᅤ৯쓞䇿晡虎녈\ua4c9왎晔텄ҹ", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()))) != null : (m8413 = kj.m8413(this.f1706.optJSONObject(m7474("껪퍶꺙蓮꙼䙟\uf175擛٠♾ᅤ৯쓞䇿晡虎녈\ua4c9왎晔텄ҹ", 1 % (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1))).intern()))) != null) {
                ArrayList<String> arrayList = new ArrayList(m8413.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.4
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str2, String str3) {
                        return kn.m8470(str2, str3);
                    }
                });
                String str2 = null;
                for (String str3 : arrayList) {
                    int i6 = f1689 + 91;
                    f1688 = i6 % 128;
                    int i7 = i6 % 2;
                    if (kn.m8470(str, str3) >= 0) {
                        str2 = m8413.get(str3);
                    }
                }
                this.f1700 = str2;
            }
        }
        return this.f1700;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7474(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f1695, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f1695));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7475(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1693;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1691;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1692 + i3] + i4);
                } else {
                    i5 = (short) (f1690[f1692 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f1692 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f1694);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f1691;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f1690;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
