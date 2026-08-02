package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
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
public class dd extends cw implements ch {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1677 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1678 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1679 = 5;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1680 = {'g', 'e', 't', 'A', GMTDateParser.DAY_OF_MONTH, 'v', 'r', 'i', GMTDateParser.SECONDS, 'I', 'D', 'U', 'l', 'F', 'n', 'a', 'S', 'o', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'J', 'f', '\'', GMTDateParser.HOURS, 'j'};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f1681 = -5930929904219618740L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1683;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1685;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private hs f1686;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1687;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final JSONObject f1684 = IronSourceNetworkBridge.jsonObjectInit();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final List<String> f1682 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m7451() {
        String str;
        int i = 2 % 2;
        int i2 = f1678;
        int i3 = i2 + 97;
        f1677 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.f1687;
            int i4 = 76 / 0;
        } else {
            str = this.f1687;
        }
        int i5 = i2 + 53;
        f1677 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7456(String str) {
        int i = 2 % 2;
        int i2 = f1678;
        int i3 = i2 + 85;
        f1677 = i3 % 128;
        int i4 = i3 % 2;
        this.f1687 = str;
        int i5 = i2 + 71;
        f1677 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private hs m7449() {
        int i = 2 % 2;
        int i2 = f1678 + 27;
        f1677 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1686;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7455(hs hsVar) {
        int i = 2 % 2;
        int i2 = f1678 + 13;
        int i3 = i2 % 128;
        f1677 = i3;
        int i4 = i2 % 2;
        this.f1686 = hsVar;
        int i5 = i3 + 53;
        f1678 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m7457() {
        int i = 2 % 2;
        int i2 = f1677 + 3;
        f1678 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1683;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7452(String str) {
        int i = 2 % 2;
        int i2 = f1677;
        int i3 = i2 + 39;
        f1678 = i3 % 128;
        int i4 = i3 % 2;
        this.f1683 = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1678 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m7453() {
        int i = 2 % 2;
        int i2 = f1677 + 37;
        f1678 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1685;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7458(String str) {
        int i = 2 % 2;
        int i2 = f1678 + 3;
        int i3 = i2 % 128;
        f1677 = i3;
        int i4 = i2 % 2;
        this.f1685 = str;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 31;
        f1678 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m7461() {
        int i = 2 % 2;
        int i2 = f1677;
        int i3 = i2 + 47;
        f1678 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1682;
        int i4 = i2 + 69;
        f1678 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7450(String str) {
        int i = 2 % 2;
        int i2 = f1677 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1678 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i3 = f1677 + 43;
            f1678 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f1682.contains(str);
                throw null;
            }
            if (!(!this.f1682.contains(str))) {
                return;
            }
            this.f1682.add(str);
            return;
        }
        TextUtils.isEmpty(str);
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7459(List<String> list) {
        int i = 2 % 2;
        int i2 = f1678 + 99;
        f1677 = i2 % 128;
        if (i2 % 2 != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i3 = f1677 + 107;
                f1678 = i3 % 128;
                int i4 = i3 % 2;
                m7450(it.next());
            }
            return;
        }
        list.iterator();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m7444() {
        int i = 2 % 2;
        int i2 = f1677 + 111;
        f1678 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = this.f1684;
        if (i3 == 0) {
            return jSONObject.optString(is.f2625);
        }
        jSONObject.optString(is.f2625);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7462(String str) {
        int i = 2 % 2;
        int i2 = f1677 + 31;
        f1678 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1684.put(is.f2625, str);
            } else {
                this.f1684.put(is.f2625, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m7447() {
        int i = 2 % 2;
        int i2 = f1678 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1677 = i2 % 128;
        int i3 = i2 % 2;
        String optString = this.f1684.optString(is.f2618);
        int i4 = f1677 + 5;
        f1678 = i4 % 128;
        if (i4 % 2 == 0) {
            return optString;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m7448(String str) {
        int i = 2 % 2;
        int i2 = f1677 + 29;
        f1678 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1684.put(is.f2618, str);
            } else {
                this.f1684.put(is.f2618, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Object m7442() {
        int i = 2 % 2;
        int i2 = f1678 + 73;
        f1677 = i2 % 128;
        int i3 = i2 % 2;
        String optString = this.f1684.optString(is.f2619);
        int i4 = f1678 + 75;
        f1677 = i4 % 128;
        int i5 = i4 % 2;
        return optString;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m7443(String str) {
        int i = 2 % 2;
        int i2 = f1677 + 9;
        f1678 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1684.put(is.f2619, str);
            int i4 = f1677 + 107;
            f1678 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m7445() {
        int i = 2 % 2;
        int i2 = f1677 + 89;
        f1678 = i2 % 128;
        int i3 = i2 % 2;
        String optString = this.f1684.optString(is.f2617);
        int i4 = f1677 + 103;
        f1678 = i4 % 128;
        int i5 = i4 % 2;
        return optString;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m7446(String str) {
        int i = 2 % 2;
        int i2 = f1678 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1677 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f1684.put(is.f2617, str);
            int i4 = f1678 + 59;
            f1677 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private JSONObject m7441() {
        int i = 2 % 2;
        int i2 = f1677;
        int i3 = i2 + 13;
        f1678 = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = this.f1684;
        int i5 = i2 + 39;
        f1678 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r5.f1682.size() <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.dd.f1677 + 31;
        com.ironsource.adqualitysdk.sdk.i.dd.f1678 = r1 % 128;
        r1 = r1 % 2;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.f1683) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r5.f1683)) != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.f1685) == false) goto L18;
     */
    /* renamed from: ﮉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object m7439() {
        int i = 2 % 2;
        boolean z = true;
        if (TextUtils.isEmpty(this.f1687)) {
            int i2 = f1678 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f1677 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
            }
            return Boolean.valueOf(z);
        }
        int i4 = f1678 + 75;
        f1677 = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(z);
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private JSONObject m7440() {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (this.f1687 != null && this.f1686 != null) {
                jsonObjectInit.putOpt(is.f2625, this.f1687);
                jsonObjectInit.putOpt(is.f2624, Integer.valueOf(this.f1686.m7854()));
            }
            jsonObjectInit.putOpt(is.f2618, this.f1683);
            jsonObjectInit.putOpt(is.f2619, this.f1685);
            if (this.f1682.size() > 0) {
                jsonObjectInit.putOpt(is.f2617, new JSONArray((Collection) this.f1682));
                int i2 = f1677 + 71;
                f1678 = i2 % 128;
                int i3 = i2 % 2;
            }
            if (this.f1684.length() > 0) {
                int i4 = f1677 + 35;
                f1678 = i4 % 128;
                int i5 = i4 % 2;
                jsonObjectInit.putOpt(is.f2627, this.f1684.toString());
            }
        } catch (JSONException unused) {
        }
        return jsonObjectInit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x017a, code lost:
    
        if (r27.equals(m7454(18 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0001\u0002\u0001\u0011\u0012\u0013\t\u0010\u0006\u0010\u0007\u000b\u0011\u0012\u0010\b\u0010\u0004", (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 56)).intern()) != false) goto L39;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        cl clVar2;
        char c = 2;
        int i = 2 % 2;
        char c2 = 17;
        int i2 = f1677 + 17;
        f1678 = i2 % 128;
        int i3 = i2 % 2;
        try {
            switch (str.hashCode()) {
                case -2118395364:
                    if (str.equals(m7454(Process.getGidForName("") + 16, "\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005¨", (byte) (68 - View.combineMeasuredStates(0, 0))).intern())) {
                        int i4 = f1677 + 51;
                        f1678 = i4 % 128;
                        int i5 = i4 % 2;
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1836320845:
                    if (str.equals(m7454(12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0013\u0000\u0001\u0013\u0012\u0013\t\u0010\u0006\u0010\u0007\u000b", (byte) (61 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern())) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1700761801:
                    if (str.equals(m7454(Color.blue(0) + 10, "\u0001\u0002\u0000\f\u0003\u0006\u0001\f\u0007\u000b", (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 114)).intern())) {
                        c = 4;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1409157227:
                    if (str.equals(m7454((ViewConfiguration.getEdgeSlop() >> 16) + 13, "\u0001\u0002\u0001\u0011\u0012\u0013\t\u0010\u0006\u0010\u0007\u000b³", (byte) (View.resolveSize(0, 0) + 64)).intern())) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1296571754:
                    if (str.equals(m7454((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16, "\u0006\u0003\u0003\f\t\f\u0011\n\u0010\u000b\u000b\u0011\u0012\u0013\t\u0010Î", (byte) (ExpandableListView.getPackedPositionChild(0L) + 106)).intern())) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1247838300:
                    if (str.equals(m7454(23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u000b\u0015\u0012\u0013\t\u0010\u0000\u0015\u0007\u0012¼", (byte) (77 - TextUtils.lastIndexOf("", '0'))).intern())) {
                        int i6 = f1678 + 93;
                        f1677 = i6 % 128;
                        int i7 = i6 % 2;
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1207642840:
                    if (str.equals(m7460("㛠\ued2a㚓漃䨈褪令ྏ㾴映䞥᥌⓴积岃ဋⴂ炿橄", View.resolveSizeAndState(0, 0, 0)).intern())) {
                        c = 1;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1091371232:
                    if (str.equals(m7460("◘ᢔ▹骼\udbcd는\udf31㐣ⲇ鎝홷⋣㟝豭쵇⮼㸻", View.combineMeasuredStates(0, 0)).intern())) {
                        int i8 = f1677 + 85;
                        f1678 = i8 % 128;
                        int i9 = i8 % 2;
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -869156349:
                    if (str.equals(m7460("殥㽬毑뵏辽\uf6f3譯灤拺둾", (-1) - ImageFormat.getBitsPerPixel(0)).intern())) {
                        int i10 = f1678 + 53;
                        f1677 = i10 % 128;
                        if (i10 % 2 != 0) {
                            c = 21;
                            break;
                        } else {
                            c = 'q';
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case -772930430:
                    if (str.equals(m7460("\udd19ɴ\udd6a聝枖贈捺\u0bad푍襾樻ᵮ켍隱焝ᐩ웻鿡䟚⼨裂ꔈ享", ViewConfiguration.getFadingEdgeLength() >> 16).intern())) {
                        c = 3;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -407028174:
                    if (str.equals(m7460("ꀕ\uef2eꁲ洇筇쮑羫䴱ꥀ搡盻寐눇篮淬劺믰犀嬌榀", Color.alpha(0)).intern())) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -356418934:
                    if (str.equals(m7454(17 - Color.blue(0), "\u0001\u0002\u0003\f\t\f\u0011\n\u0010\u000b\u000b\u0011\u0012\u0013\t\u0010r", (byte) (KeyEvent.getDeadChar(0, 0) + 13)).intern())) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -140869031:
                    break;
                case 205499235:
                    if (str.equals(m7454(21 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0006\u0003\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\u0001\u0013\u0012\u0013\t\u0010Æ", (byte) (97 - KeyEvent.getDeadChar(0, 0))).intern())) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 236043435:
                    if (str.equals(m7460("埬耉垟Ƞ嬶뫅忚㱥庹ଆ嚊⪄䗾ᓉ", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern())) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 770797430:
                    if (str.equals(m7460("\uf897⦉\uf8f0ꮠ꿐ﴓꬼ箶\uf1c3ꊃꉽ浵\uea83뵌륛搲\ue375된辜弳\udc2e軵蛭", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern())) {
                        break;
                    }
                    c = 65535;
                    break;
                case 779164621:
                    if (str.equals(m7460("▫讎◘ধ팴ꞌퟘ℻\u2cf4\u0087\ude8e㟻㞮ί얾㺤㹨ᘽ\uf369֊Ĉ⳧", ViewConfiguration.getKeyRepeatDelay() >> 16).intern())) {
                        int i11 = f1677 + 85;
                        f1678 = i11 % 128;
                        int i12 = i11 % 2;
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1308044955:
                    if (str.equals(m7460("緯༯綜贆곈촿ꠤ䮝璶落ꅡ嵇濚鯱멜", Color.argb(0, 0, 0, 0)).intern())) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1396624783:
                    if (str.equals(m7454(11 - TextUtils.getOffsetBefore("", 0), "\u0001\u0002\u0003\f\t\f\u0011\n\u0010\u000bÅ", (byte) (Color.blue(0) + 89)).intern())) {
                        int i13 = f1677 + 71;
                        f1678 = i13 % 128;
                        int i14 = i13 % 2;
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1924460979:
                    if (str.equals(m7460("苃닕芫ヸ礗భ緼誈讗㧟璺鱋郗☐澜锌餡⽀契긿Ꙭ", TextUtils.indexOf("", "", 0)).intern())) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 1964255575:
                    if (str.equals(m7454(21 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\u0001\u0013\u0012\u0013\t\u0010¯", (byte) (TextUtils.getOffsetAfter("", 0) + 74)).intern())) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 2056496294:
                    if (str.equals(m7460("܄欝ݷ\ue934껿ﮔꨓ紴๑\ue012ꍃ毕ᔖ\uffdd롔抿᳡\uf6b3躴妅", ViewConfiguration.getWindowTouchSlop() >> 8).intern())) {
                        int i15 = f1677 + 37;
                        int i16 = i15 % 128;
                        f1678 = i16;
                        c2 = i15 % 2 != 0 ? Ascii.MAX : (char) 14;
                        int i17 = i16 + 49;
                        f1677 = i17 % 128;
                        int i18 = i17 % 2;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        switch (c) {
            case 0:
                return m7451();
            case 1:
                m7456((String) m7365(list, 0, String.class));
                return null;
            case 2:
                if (m7449() != null) {
                    return Integer.valueOf(m7449().m7854());
                }
                return null;
            case 3:
                m7455(hs.m7853(((Integer) m7365(list, 0, Integer.class)).intValue()));
                return null;
            case 4:
                return m7457();
            case 5:
                m7452((String) m7365(list, 0, String.class));
                return null;
            case 6:
                return m7453();
            case 7:
                m7458((String) m7365(list, 0, String.class));
                return null;
            case '\b':
                return m7461();
            case '\t':
                m7450((String) m7365(list, 0, String.class));
                return null;
            case '\n':
                m7459((List<String>) m7365(list, 0, List.class));
                return null;
            case 11:
                return m7444();
            case '\f':
                m7462((String) m7365(list, 0, String.class));
                return null;
            case '\r':
                return m7447();
            case 14:
                m7448((String) m7365(list, 0, String.class));
                return null;
            case 15:
                return m7442();
            case 16:
                m7443((String) m7365(list, 0, String.class));
                return null;
            case 17:
                return m7445();
            case 18:
                m7446((String) m7365(list, 0, String.class));
                return null;
            case 19:
                return m7441();
            case 20:
                return m7439();
            case 21:
                return m7440();
            default:
                clVar2 = clVar;
                try {
                    new ds(clVar2, eeVar, m7454(14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0004\u0000\u0006\u0000\u0007\u0001\b\t\u0006\u000b\u000e\u0013\u0016\u0010", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18)).intern(), str).m7593(clVar2.m7203());
                } catch (Exception e2) {
                    e = e2;
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7460("碜뼫磙㴕ℌ羟◦樂燞㑷ⲡ\ueff3檙⯤㞁\ue6af捥⊙Ń\uddcb尝ᡃࠢ푞唞ལᏭ쬸俙ص\u1afd쇵㢪緘旄룅ㅽ璓潽꾍⩉毷瘩ꙮ⌈慯䄛鴿ᶬ塐", ViewConfiguration.getFadingEdgeLength() >> 16).intern()).append(str).append(m7454(1 - KeyEvent.keyCodeFromString(""), "`", (byte) (TextUtils.getOffsetAfter("", 0) + 57)).intern()).toString(), e);
                    return null;
                }
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7454(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1680;
            char c = f1679;
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7460(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f1681, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f1681));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
