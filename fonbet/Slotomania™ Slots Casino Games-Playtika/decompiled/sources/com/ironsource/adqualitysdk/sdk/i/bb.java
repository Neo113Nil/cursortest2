package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bb {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f670 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f671 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f672 = 5584418390694236519L;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f673 = {1302521272, 1328578204, -305951023, -1426252163, 1527490970, 984547986, 348708330, 707422475, -814732127, -64878030, 1714697240, 629694034, -574248288, 376575334, 1120734284, 246271334, 1856105617, 1804700826};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Handler f675;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ai f676;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ISAdQualityAdListener f678;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Set<iv> f677 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Set<String> f674 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ai m6274(bb bbVar) {
        int i = 2 % 2;
        int i2 = f671 + 51;
        int i3 = i2 % 128;
        f670 = i3;
        int i4 = i2 % 2;
        ai aiVar = bbVar.f676;
        int i5 = i3 + 25;
        f671 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return aiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6275(bb bbVar, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f670 + 79;
        f671 = i2 % 128;
        int i3 = i2 % 2;
        bbVar.m6278(str, jSONObject);
        int i4 = f670 + 103;
        f671 = i4 % 128;
        int i5 = i4 % 2;
    }

    public bb(Handler handler, ai aiVar) {
        this.f676 = aiVar;
        this.f675 = handler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6292(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f670;
        int i3 = i2 + 87;
        f671 = i3 % 128;
        int i4 = i3 % 2;
        this.f678 = iSAdQualityAdListener;
        if (i4 == 0) {
            int i5 = 56 / 0;
        }
        int i6 = i2 + 87;
        f671 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m6291(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f671 + 93;
        f670 = i2 % 128;
        if (i2 % 2 == 0) {
            int optInt = jSONObject.optInt(is.f2634);
            ISAdQualityAdListener iSAdQualityAdListener = this.f678;
            if (iSAdQualityAdListener != null) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(is.f2637), ISAdQualityAdType.fromInt(optInt));
            }
            int i3 = f671 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f670 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        jSONObject.optInt(is.f2634);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m6290(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f671 + 13;
        int i3 = i2 % 128;
        f670 = i3;
        if (i2 % 2 == 0) {
            ISAdQualityAdListener iSAdQualityAdListener = this.f678;
            if (iSAdQualityAdListener != null) {
                int i4 = i3 + 33;
                f671 = i4 % 128;
                int i5 = i4 % 2;
                iSAdQualityAdListener.adClosed(jSONObject.optString(is.f2637), ISAdQualityAdType.fromInt(jSONObject.optInt(is.f2634)));
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m6288(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f671 + 11;
        f670 = i2 % 128;
        int i3 = i2 % 2;
        m6287(m6279("ᄆ\udcbf詥砉⟨ᖲ썠넛糋⪑ᡍ", 52667 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), jSONObject);
        int i4 = f671 + 71;
        f670 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6294(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f670 + 5;
        f671 = i2 % 128;
        m6287((i2 % 2 == 0 ? m6279("ᄆ䊋똍\ueb95弨냘\ue45c姼赫\ue105劕", 31529 % (ViewConfiguration.getJumpTapTimeout() * 126)) : m6279("ᄆ䊋똍\ueb95弨냘\ue45c姼赫\ue105劕", 21391 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern(), jSONObject);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m6286(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f670 + 107;
        f671 = i2 % 128;
        int i3 = i2 % 2;
        m6287(m6280(new int[]{1463691676, -1433123454, 1515867932, -941772575, -21102536, -1019882919}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 11).intern(), jSONObject);
        int i4 = f670 + 55;
        f671 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final void m6282(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f671 + 65;
        f670 = i2 % 128;
        int i3 = i2 % 2;
        m6287(m6279("ᄆ褭⅁\ud943熳\ue9cb臤㠋큊䡲", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38953).intern(), jSONObject);
        int i4 = f670 + 53;
        f671 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m6284(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f670 + 41;
        f671 = i2 % 128;
        m6287((i2 % 2 == 0 ? m6280(new int[]{1463691676, -1433123454, 1573067451, 194623582, 1921680150, -1693854297}, 7 >>> (ViewConfiguration.getDoubleTapTimeout() + 34)) : m6280(new int[]{1463691676, -1433123454, 1573067451, 194623582, 1921680150, -1693854297}, 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern(), jSONObject);
        int i3 = f670 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f671 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final void m6283(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f670 + 77;
        f671 = i2 % 128;
        m6287((i2 % 2 == 0 ? m6279("ᄆ맹䃩\uebcf닠巷\ue4ff迩囫\ue1dd裶双\ufada藊Ⳕ", TextUtils.indexOf("", "", 0, 1) * 43261) : m6279("ᄆ맹䃩\uebcf닠巷\ue4ff迩囫\ue1dd裶双\ufada藊Ⳕ", 43261 - TextUtils.indexOf("", "", 0, 0))).intern(), jSONObject);
        int i3 = f670 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f671 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final void m6281(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f671 + 85;
        f670 = i2 % 128;
        int i3 = i2 % 2;
        m6287(m6280(new int[]{1463691676, -1433123454, 1518705358, 1721844485, 1207824468, 1423158039, 27542611, -2053500104}, 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), jSONObject);
        int i4 = f670 + 41;
        f671 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m6287(final String str, final JSONObject jSONObject) {
        int i = 2 % 2;
        this.f675.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                bb.m6275(bb.this, str, jSONObject);
            }
        });
        int i2 = f671 + 3;
        f670 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m6278(final String str, JSONObject jSONObject) {
        int i = 2 % 2;
        m6277(str, jSONObject);
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(is.f2637, jSONObject.remove(is.f2637));
            jsonObjectInit.put(is.f2588, jSONObject.remove(is.f2588));
            int i2 = f671 + 35;
            f670 = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
        this.f676.m5955(str, jSONObject, jsonObjectInit, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (is.f2578.contains(str)) {
                    p.m8549(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            bb.m6274(bb.this).m5960();
                        }
                    });
                }
            }
        });
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6293(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f671 + 91;
        f670 = i2 % 128;
        if (i2 % 2 != 0) {
            m6285(str, str2, str3, str4, null, false);
        } else {
            m6285(str, str2, str3, str4, null, false);
        }
        int i3 = f671 + 49;
        f670 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m6285(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f674) {
            String obj = new StringBuilder().append(str3).append(m6280(new int[]{674719476, 1327972638}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern()).append(str2).toString();
            if (!this.f674.contains(obj) || z || ar.m6041().mo6074()) {
                this.f674.add(obj);
                if (Math.random() * 100.0d < m6276()) {
                    JSONObject m5928 = ai.m5928(str, str2, str3, str4, jSONObject);
                    m6277(m6280(new int[]{-1251734152, 2009335512, -323863104, -2083360039}, 8 - View.resolveSizeAndState(0, 0, 0)).intern(), m5928);
                    this.f676.m5959(m6280(new int[]{-1251734152, 2009335512, -323863104, -2083360039}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7).intern(), m5928);
                    return;
                }
                m.m8520(m6280(new int[]{-2085424400, 1115481503, 398542901, -313391963, 1626122443, -481508219}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern(), m6279("ᄣ甛\ud93e㴻腒\ue57c䥽궝ㆡ閽秊巴ꇫЩ栤찮偅둭ᡯ糈삦⒨裌\uecea烫흊㭨齰\ue34f䝯ꭵྂ鏠\uf7a6宍뿈ϲ昝쨊\u2e74뉛ᙒ穧\ude85⊈蚾\ueace仐틳", 25621 - KeyEvent.getDeadChar(0, 0)).intern());
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m6277(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        Iterator it = new HashSet(this.f677).iterator();
        while (!(!it.hasNext())) {
            int i2 = f670 + 25;
            f671 = i2 % 128;
            int i3 = i2 % 2;
            JSONObject mo6220 = ((iv) it.next()).mo6220(str, jSONObject);
            if (mo6220 != null) {
                int i4 = f670 + 99;
                f671 = i4 % 128;
                int i5 = i4 % 2;
                kj.m8425(jSONObject, mo6220);
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m6289(iv ivVar) {
        int i = 2 % 2;
        int i2 = f671 + 3;
        f670 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f677.add(ivVar);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f677.add(ivVar);
        int i3 = f670 + 85;
        f671 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static double m6276() {
        int i = 2 % 2;
        if (!ar.m6041().mo6059()) {
            int i2 = f671 + 19;
            f670 = i2 % 128;
            int i3 = i2 % 2;
            return ar.m6041().mo6061();
        }
        int i4 = f670 + 87;
        f671 = i4 % 128;
        int i5 = i4 % 2;
        return 100.0d;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6279(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f672);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6280(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f673.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
