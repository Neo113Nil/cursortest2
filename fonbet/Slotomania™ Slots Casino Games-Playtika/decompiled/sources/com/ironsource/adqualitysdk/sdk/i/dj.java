package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class dj extends cw implements ch {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f1733 = 0;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static int f1734 = 629220665;

    /* renamed from: טּ, reason: contains not printable characters */
    private static byte[] f1735 = {97, 33, 77, 68, 78, 55, 73, 82, 100, Ascii.NAK, 85, 56, -14, -12, 34, -29, 4, -5, 5, -18, 0, 9, Ascii.ESC, -52, Ascii.FF, -5, -83, 105, -97, -124, -100, -121, -108, -97, -127, -92, -75, 95, -95, -112, 5, -61, -27, -16, -25, Ascii.NAK, -67, -7, -24, -76, 110, -102, -89, -119, -99, -91, -84, 119, -88, -117, Byte.MAX_VALUE, 57, 101, 114, 84, 104, 112, 119, 66, 115, 98, -4, -70, -34, Ascii.DLE, -79, -16, -33, 40, -15, -4, Ascii.SUB, 2, 32, 9, 0, 60, -32, 10, 60, -35, Ascii.FS, -1, -47, -111, -67, -76, -66, -89, -71, -62, -44, -119, -77, -27, -122, -59, -88, 122, 89, 109, 87, 100, 97, -106, 67, 95, -117, 50, 115, 98, Ascii.NAK, 33, -22, -11, 19, -5, Ascii.EM, 2, -7, 53, 100, Ascii.EM, 82, 100, 81, 108, 85, -86, Ascii.CAN, 76, 106, 82, 112, 80, -85, 10, 108, 120, 65, 76, 106, 82, 112, 89, 80, -116, Byte.MIN_VALUE, Ascii.SYN, 86, 98, 82, 92, 111, 91, 74, 112, -94, Ascii.CAN, 86, 96, 94, 78, -76, Ascii.VT, 96, 90, 93, -118, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: סּ, reason: contains not printable characters */
    private static short[] f1736 = null;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f1737 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1738 = 171;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1739 = 60;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1740 = -1826880390;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private String f1741;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private String f1742;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f1743;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String f1744;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String f1745;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String f1746;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f1747;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1748;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1749;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1750;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1751;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1752;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7548(String str) {
        int i = 2 % 2;
        int i2 = f1737 + 113;
        f1733 = i2 % 128;
        int i3 = i2 % 2;
        this.f1748 = str;
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m7552() {
        int i = 2 % 2;
        int i2 = f1737 + 7;
        f1733 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1748;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7556(String str) {
        int i = 2 % 2;
        int i2 = f1737 + 33;
        int i3 = i2 % 128;
        f1733 = i3;
        int i4 = i2 % 2;
        this.f1749 = str;
        int i5 = i3 + 1;
        f1737 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m7547() {
        int i = 2 % 2;
        int i2 = f1737 + 7;
        int i3 = i2 % 128;
        f1733 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1749;
        int i4 = i3 + 59;
        f1737 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7551(String str) {
        int i = 2 % 2;
        int i2 = f1733 + 21;
        int i3 = i2 % 128;
        f1737 = i3;
        int i4 = i2 % 2;
        this.f1751 = str;
        int i5 = i3 + 23;
        f1733 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m7549() {
        int i = 2 % 2;
        int i2 = f1733 + 73;
        int i3 = i2 % 128;
        f1737 = i3;
        int i4 = i2 % 2;
        String str = this.f1751;
        int i5 = i3 + 85;
        f1733 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7546(String str) {
        int i = 2 % 2;
        int i2 = f1737 + 41;
        int i3 = i2 % 128;
        f1733 = i3;
        int i4 = i2 % 2;
        this.f1750 = str;
        int i5 = i3 + 81;
        f1737 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Object m7545() {
        int i = 2 % 2;
        int i2 = f1733 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1737 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1750;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7553(String str) {
        int i = 2 % 2;
        int i2 = f1733;
        int i3 = i2 + 69;
        f1737 = i3 % 128;
        int i4 = i3 % 2;
        this.f1752 = str;
        int i5 = i2 + 27;
        f1737 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m7554() {
        String str;
        int i = 2 % 2;
        int i2 = f1733 + 113;
        int i3 = i2 % 128;
        f1737 = i3;
        if (i2 % 2 == 0) {
            str = this.f1752;
            int i4 = 84 / 0;
        } else {
            str = this.f1752;
        }
        int i5 = i3 + 25;
        f1733 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m7540(String str) {
        int i = 2 % 2;
        int i2 = f1737;
        int i3 = i2 + 55;
        f1733 = i3 % 128;
        int i4 = i3 % 2;
        this.f1743 = str;
        int i5 = i2 + 3;
        f1733 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m7535() {
        int i = 2 % 2;
        int i2 = f1737;
        int i3 = i2 + 15;
        f1733 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1743;
        int i5 = i2 + 11;
        f1733 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m7542(String str) {
        int i = 2 % 2;
        int i2 = f1737 + 111;
        int i3 = i2 % 128;
        f1733 = i3;
        int i4 = i2 % 2;
        this.f1746 = str;
        int i5 = i3 + 83;
        f1737 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m7537() {
        String str;
        int i = 2 % 2;
        int i2 = f1737;
        int i3 = i2 + 57;
        f1733 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.f1746;
            int i4 = 26 / 0;
        } else {
            str = this.f1746;
        }
        int i5 = i2 + 87;
        f1733 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m7538(String str) {
        int i = 2 % 2;
        int i2 = f1737;
        int i3 = i2 + 57;
        f1733 = i3 % 128;
        int i4 = i3 % 2;
        this.f1745 = str;
        if (i4 != 0) {
            int i5 = 6 / 0;
        }
        int i6 = i2 + 71;
        f1733 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m7539() {
        int i = 2 % 2;
        int i2 = f1737 + 101;
        int i3 = i2 % 128;
        f1733 = i3;
        int i4 = i2 % 2;
        String str = this.f1745;
        int i5 = i3 + 5;
        f1737 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m7544(String str) {
        int i = 2 % 2;
        int i2 = f1733 + 11;
        f1737 = i2 % 128;
        int i3 = i2 % 2;
        this.f1747 = str;
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m7543() {
        int i = 2 % 2;
        int i2 = f1733 + 7;
        int i3 = i2 % 128;
        f1737 = i3;
        int i4 = i2 % 2;
        String str = this.f1747;
        int i5 = i3 + 17;
        f1733 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m7536(String str) {
        int i = 2 % 2;
        int i2 = f1733 + 21;
        f1737 = i2 % 128;
        int i3 = i2 % 2;
        this.f1744 = str;
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m7541() {
        int i = 2 % 2;
        int i2 = f1733 + 101;
        f1737 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1744;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private void m7534(String str) {
        int i = 2 % 2;
        int i2 = f1733 + 85;
        int i3 = i2 % 128;
        f1737 = i3;
        int i4 = i2 % 2;
        this.f1741 = str;
        int i5 = i3 + 41;
        f1733 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private Object m7530() {
        int i = 2 % 2;
        int i2 = f1733;
        int i3 = i2 + 55;
        f1737 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1741;
        int i5 = i2 + 47;
        f1737 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private void m7532(String str) {
        int i = 2 % 2;
        int i2 = f1733 + 113;
        f1737 = i2 % 128;
        int i3 = i2 % 2;
        this.f1742 = str;
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private Object m7533() {
        int i = 2 % 2;
        int i2 = f1737;
        int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1733 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1742;
        int i5 = i2 + 33;
        f1733 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m7531() {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.putOpt(is.f2605, this.f1748);
            jsonObjectInit.putOpt(is.f2607, this.f1749);
            jsonObjectInit.putOpt(is.f2609, this.f1751);
            jsonObjectInit.putOpt(is.f2612, this.f1752);
            jsonObjectInit.putOpt(is.f2608, this.f1743);
            jsonObjectInit.putOpt(is.f2603, this.f1746);
            jsonObjectInit.putOpt(is.f2604, this.f1745);
            jsonObjectInit.putOpt(is.f2606, this.f1747);
            jsonObjectInit.putOpt(is.f2601, this.f1744);
            int i2 = f1737 + 109;
            f1733 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 4;
            }
        } catch (JSONException unused) {
        }
        return jsonObjectInit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0576 A[Catch: Exception -> 0x056e, TRY_ENTER, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x057a A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x057f A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0584 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0591 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0596 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05a3 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05a8 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05b5 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05ba A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05c7 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x05cc A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05d9 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05de A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05eb A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05f0 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05fd A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0602 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x060f A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0614 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0621 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0626 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0633 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0638 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0645 A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x064a A[Catch: Exception -> 0x056e, TryCatch #0 {Exception -> 0x056e, blocks: (B:19:0x0576, B:20:0x0657, B:24:0x057a, B:26:0x057f, B:28:0x0584, B:30:0x0591, B:32:0x0596, B:34:0x05a3, B:36:0x05a8, B:38:0x05b5, B:40:0x05ba, B:42:0x05c7, B:44:0x05cc, B:46:0x05d9, B:48:0x05de, B:50:0x05eb, B:52:0x05f0, B:54:0x05fd, B:56:0x0602, B:58:0x060f, B:60:0x0614, B:62:0x0621, B:64:0x0626, B:66:0x0633, B:68:0x0638, B:70:0x0645, B:72:0x064a, B:165:0x0099, B:79:0x00b0, B:82:0x00dd, B:85:0x0116, B:88:0x0142, B:91:0x017e, B:98:0x01b8, B:101:0x01dd, B:104:0x021c, B:108:0x0255, B:112:0x029d, B:115:0x02c4, B:118:0x02f9, B:121:0x0331, B:125:0x035d, B:128:0x0388, B:132:0x03c2, B:135:0x03ec, B:140:0x0429, B:144:0x0464, B:148:0x0497, B:152:0x04c0, B:155:0x04ef, B:159:0x0529), top: B:14:0x0039 }] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        char c;
        char c2;
        int i = 2 % 2;
        int i2 = f1737 + 105;
        f1733 = i2 % 128;
        cl clVar2 = i2 % 2;
        try {
            if (clVar2 != 0) {
                str.hashCode();
                throw null;
            }
            try {
                try {
                    switch (str.hashCode()) {
                        case -2118395364:
                            c = 65535;
                            if (str.equals(m7555((short) (View.resolveSizeAndState(0, 0, 0) + 110), (-629220562) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 46, 1826880416 - View.MeasureSpec.getMode(0), (byte) (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                                int i3 = f1737 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                                f1733 = i3 % 128;
                                int i4 = i3 % 2;
                                c2 = 7;
                                switch (c2) {
                                    case 0:
                                        m7548((String) m7365(list, 0, String.class));
                                        return null;
                                    case 1:
                                        return m7552();
                                    case 2:
                                        m7551((String) m7365(list, 0, String.class));
                                        return null;
                                    case 3:
                                        return m7549();
                                    case 4:
                                        m7546((String) m7365(list, 0, String.class));
                                        return null;
                                    case 5:
                                        return m7545();
                                    case 6:
                                        m7556((String) m7365(list, 0, String.class));
                                        return null;
                                    case 7:
                                        return m7547();
                                    case '\b':
                                        m7553((String) m7365(list, 0, String.class));
                                        return null;
                                    case '\t':
                                        return m7554();
                                    case '\n':
                                        m7540((String) m7365(list, 0, String.class));
                                        return null;
                                    case 11:
                                        return m7535();
                                    case '\f':
                                        m7542((String) m7365(list, 0, String.class));
                                        return null;
                                    case '\r':
                                        return m7537();
                                    case 14:
                                        m7538((String) m7365(list, 0, String.class));
                                        return null;
                                    case 15:
                                        return m7539();
                                    case 16:
                                        m7544((String) m7365(list, 0, String.class));
                                        return null;
                                    case 17:
                                        return m7543();
                                    case 18:
                                        m7536((String) m7365(list, 0, String.class));
                                        return null;
                                    case 19:
                                        return m7541();
                                    case 20:
                                        m7534((String) m7365(list, 0, String.class));
                                        return null;
                                    case 21:
                                        return m7530();
                                    case 22:
                                        m7532((String) m7365(list, 0, String.class));
                                        return null;
                                    case 23:
                                        return m7533();
                                    case 24:
                                        return m7531();
                                    default:
                                        new ds(clVar, eeVar, m7555((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 7), ((Process.getThreadPriority(0) + 20) >> 6) - 629220598, ExpandableListView.getPackedPositionType(0L) - 49, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1826880511, (byte) Color.red(0)).intern(), str).m7593(clVar.m7203());
                                        return null;
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -2061646392:
                            c = 65535;
                            if (!str.equals(m7555((short) (((Process.getThreadPriority(0) + 20) >> 6) + 103), (-629220550) - Color.argb(0, 0, 0, 0), (-48) - (Process.myTid() >> 22), 1826880439 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                                c2 = c;
                                switch (c2) {
                                }
                            } else {
                                c2 = '\f';
                                switch (c2) {
                                }
                            }
                        case -1670022962:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 270, "\uffff\u0001\u000f\u0001\u0010\uffde\u0005\u0000￬\u000e\u0005", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2).intern())) {
                                c2 = 20;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -1616003519:
                            c = 65535;
                            if (!str.equals(m7550(TextUtils.indexOf("", "") + 13, false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 270, "\u0004\u000b￦\u0001\u0004\u0002\u0011￠\ufffe\n\r\ufffe\u0006", 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                                c2 = c;
                                switch (c2) {
                                }
                            } else {
                                c2 = 3;
                                switch (c2) {
                                }
                            }
                        case -1585083924:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getPressedStateDuration() >> 16) + 15, false, 274 - View.MeasureSpec.getSize(0), "\rￜ\ufffa\u0006\t\ufffa\u0002\u0000\u0007￭\u0012\t\ufffe\f\ufffe", (ViewConfiguration.getTapTimeout() >> 16) + 13).intern())) {
                                int i5 = f1733 + 105;
                                f1737 = i5 % 128;
                                int i6 = i5 % 2;
                                c2 = 4;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -1581443134:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getPressedStateDuration() >> 16) + 11, true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 269, "\u0006\u000f￭\u0001\u0006\uffdf\u0011\u0002\u0004\u0002\u0000", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8).intern())) {
                                int i7 = f1733 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                                f1737 = i7 % 128;
                                int i8 = i7 % 2;
                                c2 = 21;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -1448564938:
                            c = 65535;
                            if (!(!str.equals(m7550((Process.myTid() >> 22) + 16, true, (ViewConfiguration.getScrollBarSize() >> 8) + 270, "\ufffe￠\r\u0010￡\u0011\u0002\u0004\u0001￦\u000b\u0004\u0006\ufffe\r\n", TextUtils.lastIndexOf("", '0') + 9).intern()))) {
                                int i9 = f1733 + 77;
                                f1737 = i9 % 128;
                                int i10 = i9 % 2;
                                c2 = 19;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -1295434132:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, true, 274 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\ufffe\u000b\u000b\u000eￜ�\u0002ￛ\r\ufffe\f\u0012￼\u0007", KeyEvent.normalizeMetaState(0) + 11).intern())) {
                                c2 = 22;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -1207642840:
                            c = 65535;
                            if (str.equals(m7550(15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, 275 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\ufffe\f�￢\u000b\ufffe\f\u0002\r\u000b\ufffe\u000f�ￚ\r", 2 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                                int i11 = f1737 + 99;
                                f1733 = i11 % 128;
                                int i12 = i11 % 2;
                                c2 = 6;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -1027873480:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, true, 274 - View.MeasureSpec.makeMeasureSpec(0, 0), "\r\ufffe\f�￢\t\u000e\b\u000b￠", 2 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                                c2 = '\n';
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -869156349:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, true, 277 - View.combineMeasuredStates(0, 0), "\n\u0004\u0005\t￠\u0005", AndroidCharacter.getMirror('0') - '/').intern())) {
                                c2 = 24;
                                switch (c2) {
                                }
                            } else {
                                c2 = c;
                                switch (c2) {
                                }
                            }
                        case -841872307:
                            c = 65535;
                            if (str.equals(m7555((short) (View.MeasureSpec.getMode(0) - 70), (-629220550) - View.MeasureSpec.getMode(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 47, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1826880390, (byte) KeyEvent.normalizeMetaState(0)).intern())) {
                                c2 = 2;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -587837303:
                            c = 65535;
                            if (str.equals(m7555((short) ((-13) - Drawable.resolveOpacity(0, 0)), (-629220550) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 44, 1826880467 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                                c2 = 16;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case -75693804:
                            c = 65535;
                            if (str.equals(m7550(7 - (ViewConfiguration.getTouchSlop() >> 8), false, 265 - TextUtils.indexOf("", "", 0), "\t\u0007\u0016￣\u0006￫\u0006", 7 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                                c2 = 1;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 476302072:
                            c = 65535;
                            if (str.equals(m7555((short) ((-99) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-629220562) - View.resolveSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 47, 1826880498 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) TextUtils.indexOf("", "", 0)).intern())) {
                                int i13 = f1737 + 109;
                                f1733 = i13 % 128;
                                int i14 = i13 % 2;
                                c2 = 23;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 684328276:
                            c = 65535;
                            if (str.equals(m7555((short) ((-100) - (ViewConfiguration.getEdgeSlop() >> 16)), Color.green(0) - 629220562, (-47) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1810103234 - Color.rgb(0, 0, 0), (byte) View.getDefaultSize(0, 0)).intern())) {
                                c2 = '\r';
                                switch (c2) {
                                }
                            } else {
                                c2 = c;
                                switch (c2) {
                                }
                            }
                        case 1014959530:
                            c = 65535;
                            if (str.equals(m7555((short) ((ViewConfiguration.getTapTimeout() >> 16) + 74), (-629220549) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-44) - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1826880483, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern())) {
                                c2 = 18;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1076166944:
                            c = 65535;
                            if (str.equals(m7550(ExpandableListView.getPackedPositionType(0L) + 13, false, View.MeasureSpec.getMode(0) + 271, "\u0001￥\u0000\u0003\u0001\u0010\uffdf\u000e\u0001�\u0010\u0005\u0012", 3 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                                c2 = '\t';
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1243605525:
                            c = 65535;
                            if (str.equals(m7550(16 - View.getDefaultSize(0, 0), true, (ViewConfiguration.getLongPressTimeout() >> 16) + 271, "\u0005\u0010�\u0001\u000e\uffdf\f\u000f￠\u0010\u0001\u0003\u0000￥\u0001\u0012", MotionEvent.axisFromString("") + 13).intern())) {
                                int i15 = f1733 + 101;
                                f1737 = i15 % 128;
                                c2 = i15 % 2 == 0 ? 'A' : (char) 17;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1330288580:
                            c = 65535;
                            if (str.equals(m7555((short) (TextUtils.indexOf("", "", 0) + 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 629220563, (ViewConfiguration.getTouchSlop() >> 8) - 50, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1826880430, (byte) (MotionEvent.axisFromString("") + 1)).intern())) {
                                c2 = 11;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1390601082:
                            c = 65535;
                            if (str.equals(m7550(7 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 271 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u000f\f￥\u0000\u000f\u0001\u0010￠", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4).intern())) {
                                c2 = 14;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1799130848:
                            c = 65535;
                            if (str.equals(m7555((short) (3 - View.resolveSizeAndState(0, 0, 0)), ExpandableListView.getPackedPositionChild(0L) - 629220561, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 45, 1826880402 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                                c2 = 5;
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1850298156:
                            c = 65535;
                            if (str.equals(m7550((ViewConfiguration.getScrollBarSize() >> 8) + 13, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 272, "\u0000￼\u000f\u0004\u0011\u0000￤\uffff\u000e\u0000\u000f\uffde\r", 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                                c2 = '\b';
                                switch (c2) {
                                }
                            }
                            c2 = c;
                            switch (c2) {
                            }
                        case 1951713542:
                            try {
                                c = 65535;
                                if (str.equals(m7555((short) (31 - View.MeasureSpec.getMode(0)), Drawable.resolveOpacity(0, 0) - 629220562, (-52) - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1826880461, (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern())) {
                                    c2 = 15;
                                    switch (c2) {
                                    }
                                }
                                c2 = c;
                                switch (c2) {
                                }
                            } catch (Exception e) {
                                e = e;
                                clVar2 = clVar;
                                cn.m7268(clVar2.m7203(), new StringBuilder().append(m7555((short) (AndroidCharacter.getMirror('0') - 141), (ViewConfiguration.getJumpTapTimeout() >> 16) - 629220596, (-11) - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 1826880522, (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()).append(str).append(m7550(-ImageFormat.getBitsPerPixel(0), true, 211 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, '1' - AndroidCharacter.getMirror('0')).intern()).toString(), e);
                                return null;
                            }
                        case 1984415776:
                            c2 = str.equals(m7550(7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 265, "\u0005￪\u0005￢\u0015\u0006\u0014", 7 - Color.red(0)).intern()) ? (char) 0 : (char) 65535;
                            switch (c2) {
                            }
                        default:
                            c = 65535;
                            c2 = c;
                            switch (c2) {
                            }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                clVar2 = clVar;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7550(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f1738);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7555(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1739;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1735;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1740 + i3] + i4);
                } else {
                    i5 = (short) (f1736[f1740 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f1740 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f1734);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f1735;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f1736;
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
