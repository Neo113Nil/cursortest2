package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3200 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3201 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f3202 = 15605;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3203;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f3204;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, y> f3205 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, ac> f3207 = new HashMap();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, ad> f3206 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m8633(w wVar) {
        int i = 2 % 2;
        int i2 = f3200 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3201 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, ac> map = wVar.f3207;
        if (i3 != 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m8634(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3200 + 93;
        f3201 = i2 % 128;
        if (i2 % 2 != 0) {
            return m8632(jSONObject);
        }
        m8632(jSONObject);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m8635(w wVar) {
        int i = 2 % 2;
        int i2 = f3200 + 53;
        int i3 = i2 % 128;
        f3201 = i3;
        int i4 = i2 % 2;
        Map<String, y> map = wVar.f3205;
        int i5 = i3 + 73;
        f3200 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m8637(w wVar) {
        int i = 2 % 2;
        int i2 = f3200 + 19;
        f3201 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, ad> map = wVar.f3206;
        if (i3 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8643(final JSONObject jSONObject, final l lVar, final js jsVar, final ja jaVar) {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                String m8634 = w.m8634(jSONObject);
                y yVar = (y) w.m8635(w.this).get(m8634);
                if (yVar == null) {
                    yVar = new y(jSONObject, jaVar);
                    w.m8635(w.this).put(m8634, yVar);
                } else {
                    yVar.m8649(jaVar);
                    yVar.m8703(jSONObject);
                }
                yVar.m8631((t) lVar);
                yVar.m8704((jr) jsVar);
            }
        });
        int i2 = f3200 + 47;
        f3201 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8638() {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                ArrayList arrayList = new ArrayList(w.m8635(w.this).values());
                w.m8635(w.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).m8702();
                }
            }
        });
        int i2 = f3200 + 75;
        f3201 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8641(final JSONObject jSONObject, final v vVar) {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                String m8634 = w.m8634(jSONObject);
                ac acVar = (ac) w.m8633(w.this).get(m8634);
                if (acVar == null) {
                    acVar = new ac(jSONObject);
                    w.m8633(w.this).put(m8634, acVar);
                } else {
                    acVar.m5785(jSONObject);
                }
                acVar.m8631((t) vVar);
            }
        });
        int i2 = f3200 + 41;
        f3201 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8640() {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                ArrayList arrayList = new ArrayList(w.m8633(w.this).values());
                w.m8633(w.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ac) it.next()).m5786();
                }
            }
        });
        int i2 = f3200 + 107;
        f3201 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8639(JSONObject jSONObject, q qVar) {
        int i = 2 % 2;
        int i2 = f3201 + 91;
        f3200 = i2 % 128;
        int i3 = i2 % 2;
        m8644(jSONObject, qVar, null);
        int i4 = f3200 + 9;
        f3201 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8644(final JSONObject jSONObject, final q qVar, final jc jcVar) {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                String m8634 = w.m8634(jSONObject);
                ad adVar = (ad) w.m8637(w.this).get(m8634);
                if (adVar == null) {
                    adVar = new ad(jSONObject, jcVar);
                    w.m8637(w.this).put(m8634, adVar);
                } else {
                    adVar.m5817(jSONObject, jcVar);
                }
                adVar.m8631(qVar);
            }
        });
        int i2 = f3200 + 105;
        f3201 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8642() {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                ArrayList arrayList = new ArrayList(w.m8637(w.this).values());
                w.m8637(w.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ad) it.next()).m5819();
                }
            }
        });
        int i2 = f3200 + 37;
        f3201 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8632(JSONObject jSONObject) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(jSONObject.optString(m8636((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "\u181bꞤ턻䂫荄☐\uf494戨ꕑ輅̝ᨦ콰㣟", "\u0000\u0000\u0000\u0000", "ꒌᣄ襽쪣", (char) ((Process.myTid() >> 22) + 41865)).intern())).append(m8636((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1928956701, "◣", "\u0000\u0000\u0000\u0000", "ᴃ曆\ue072\uf419", (char) (View.getDefaultSize(0, 0) + 6624)).intern()).append(jSONObject.optString(m8636((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "ḫ霞ꪞ⎎厨㒀滿烩䊛磹蟦ﮚ嗦룄", "\u0000\u0000\u0000\u0000", "杋깞㛸옉", (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2358)).intern())).append(jSONObject.optString(m8636(KeyEvent.getDeadChar(0, 0) + 2088367807, "锠깙횧팿䉓뙸劘圈→쭉䗟ꬔ碧", "\u0000\u0000\u0000\u0000", "뼊秶쁼俻", (char) (64448 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())).append(jSONObject.optString(m8636((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1143083916, "듒懄ᙛ⦴귀즉⯮샇ᐫ濾酾阋奡䱚嶡", "\u0000\u0000\u0000\u0000", "畤\uddec㪻赹", (char) (ExpandableListView.getPackedPositionType(0L) + 31034)).intern())).toString();
        int i2 = f3201 + 59;
        f3200 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8636(int i, String str, String str2, String str3, char c) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr2.clone();
            char[] cArr8 = (char[]) cArr4.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr6.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr6[f.f2041]) ^ f3204) ^ f3203) ^ f3202);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
