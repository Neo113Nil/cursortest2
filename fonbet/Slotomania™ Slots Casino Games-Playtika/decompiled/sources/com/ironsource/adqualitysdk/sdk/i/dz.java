package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.kj;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class dz {

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f1890 = 1;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1893 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1895 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1897 = 177;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f1898 = true;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f1899 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int f1901 = -1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String[] f1902;

    /* renamed from: ｋ, reason: contains not printable characters */
    private gb f1903;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1904;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final dz f1905;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1900 = {274, 291, 280, 292, 246, 288, 209, 289, 282, 287, 286, 278, 293, 281, 277, 216, 235, 295, 284, 294, 275, 276, 217, 218};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1896 = -1334917051;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1894 = 33;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1891 = 1128404214;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static byte[] f1892 = {-29, Ascii.NAK, -11, Ascii.CR, -23, -69, -9, 5, -3, 76, -84, 19, 65, -7, -10, Ascii.NAK, -11, Ascii.CR, 66, -76, 0, -9, 7, 78, -83, Ascii.DC2, -7, 72, -68, -11, 7, -12, Ascii.SI, -8, 77, -26, 19, -16, -68, -1, -15, 17, -2, -11, -8, 19, 69, -68, -11, 7, -12, Ascii.SI, -8, 77, -32, -24, -78, -1, 6, -11, 17, -11, -7, Ascii.SI, -31, -12, -30, 93, -91};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m7672() {
        int i = 2 % 2;
        int i2 = f1890 + 105;
        int i3 = i2 % 128;
        f1893 = i3;
        int i4 = i2 % 2;
        String str = this.f1904;
        int i5 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1890 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public dz(String str, String str2, String str3, JSONObject jSONObject, dz dzVar) {
        String str4;
        this.f1904 = eb.m7685(str3);
        this.f1905 = dzVar;
        List m8423 = kj.m8423(jSONObject.optJSONArray(m7667(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0084\u0083\u0082\u0081").intern()), new kj.e<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final /* synthetic */ String mo6110(JSONArray jSONArray, int i) {
                return eb.m7685(jSONArray.optString(i));
            }
        });
        String[] strArr = new String[m8423.size()];
        this.f1902 = strArr;
        m8423.toArray(strArr);
        try {
            try {
                try {
                    str4 = str3;
                    try {
                        this.f1903 = new dx().m7657(dv.m7608(str, str4, jSONObject.optString(m7669((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-1128404116) - KeyEvent.normalizeMetaState(0), (-34) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), AndroidCharacter.getMirror('0') + 14219, (byte) TextUtils.getCapsMode("", 0, 0)).intern())));
                    } catch (Throwable th) {
                        th = th;
                        String obj = new StringBuilder().append(m7667(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u0090\u0087\u008f\u0086\u008e\u008d\u008c\u008b\u0087\u0083\u008a\u0089\u0084\u0082\u0081\u0088\u0087\u0082\u0086\u0082\u0082\u0085").intern()).append(this.f1904).append(m7667(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u0087\u0091\u0090").intern()).append(th.getMessage()).toString();
                        cn.m7269(str, obj, th, new Cdo(str, str2, str4, m7670(), obj));
                    }
                } catch (ed e) {
                    e = e;
                    ed edVar = e;
                    new Cdo(str, str2, str3, m7670(), new StringBuilder().append(m7667(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u0090\u0087\u008f\u0086\u008e\u008d\u008c\u008b\u0087\u0083\u008a\u0089\u0084\u0082\u0081\u0088\u0087\u0082\u0086\u0082\u0082\u0085").intern()).append(this.f1904).append(m7669((short) View.MeasureSpec.getMode(0), (-1128404175) - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 34, (ViewConfiguration.getTapTimeout() >> 16) + 1334917055, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern()).append(m7670() + edVar.m7701()).append(m7667(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0087\u0091").intern()).append(edVar.getMessage()).toString(), edVar).m7593(str);
                }
            } catch (ed e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            str4 = str3;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ea m7671(ee eeVar, cl clVar, List<Object> list) {
        int i = 2 % 2;
        ee eeVar2 = new ee(m7668(clVar, list, Arrays.asList(this.f1902)), eeVar.m7709(), this, eeVar);
        gb gbVar = this.f1903;
        Object obj = null;
        if (gbVar == null) {
            new dr(clVar, eeVar2, new StringBuilder().append(m7667(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u0090\u0087\u008f\u0086\u008e\u008d\u008c\u008b\u0087\u0083\u008a\u0089\u0093\u0086\u0092\u008a\u0089\u0087\u0082\u0086\u0082\u0082\u0085").intern()).append(this.f1904).append(m7669((short) Color.argb(0, 0, 0, 0), (-1128404175) - (ViewConfiguration.getLongPressTimeout() >> 16), (-34) - (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1334917065, (byte) TextUtils.indexOf("", "", 0, 0)).intern()).toString()).m7593(clVar.m7203());
            return null;
        }
        int i2 = f1890 + 59;
        f1893 = i2 % 128;
        if (i2 % 2 == 0) {
            ea m7788 = gbVar.m7788(eeVar2, clVar);
            int i3 = f1893 + 41;
            f1890 = i3 % 128;
            if (i3 % 2 != 0) {
                return m7788;
            }
            super.hashCode();
            throw null;
        }
        gbVar.m7788(eeVar2, clVar);
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, Object> m7668(cl clVar, List<Object> list, List<String> list2) {
        int i = 2 % 2;
        int i2 = f1890 + 17;
        f1893 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        if (list.size() != list2.size()) {
            cn.m7273(clVar.m7203(), new StringBuilder().append(this.f1904).append(m7669((short) ((-1) - TextUtils.lastIndexOf("", '0')), (-1128404182) - View.getDefaultSize(0, 0), (-35) - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionGroup(0L) + 1334917088, (byte) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).append(list2.size()).append(m7667(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, "\u0087\u008f\u008c\u0092\u0089\u008c\u0096\u008c\u0082\u0087\u008d\u0094\u0095\u0087\u0084\u008d\u008a\u008c\u008b\u0094\u0083\u0082\u0081\u0087").intern()).append(list.size()).toString());
            return null;
        }
        HashMap hashMap = new HashMap();
        while (i4 < list.size()) {
            int i5 = f1890 + 99;
            f1893 = i5 % 128;
            if (i5 % 2 != 0) {
                hashMap.put(list2.get(i4), list.get(i4));
                i4 += 81;
            } else {
                hashMap.put(list2.get(i4), list.get(i4));
                i4++;
            }
        }
        return hashMap;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m7670() {
        int i = 2 % 2;
        int i2 = f1893;
        int i3 = i2 + 53;
        f1890 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f1901 == -1) {
            int i5 = i2 + 99;
            f1890 = i5 % 128;
            int i6 = i5 % 2;
            dz dzVar = this.f1905;
            if (dzVar == null) {
                this.f1901 = 1;
            } else {
                this.f1901 = dzVar.m7670() + this.f1905.m7666() + 1;
                int i7 = f1893 + 83;
                f1890 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 4;
                }
            }
        }
        int i9 = this.f1901;
        int i10 = f1890 + 21;
        f1893 = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int m7666() {
        int i = 2 % 2;
        int i2 = f1890 + 49;
        f1893 = i2 % 128;
        int i3 = i2 % 2;
        int length = toString().split(m7669((short) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getTrimmedLength("") - 1128404204, (-34) - TextUtils.getTrimmedLength(""), 1334917105 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (MotionEvent.axisFromString("") + 1)).intern()).length;
        int i4 = f1893 + 5;
        f1890 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return length;
    }

    public String toString() {
        String intern;
        int i = 2 % 2;
        Object obj = null;
        StringBuilder append = new StringBuilder().append(m7669((short) KeyEvent.normalizeMetaState(0), (-1128404112) - (Process.myTid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) - 33, AndroidCharacter.getMirror('0') + 14274, (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()).append(this.f1904).append(m7667(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0097").intern()).append(UByte$$ExternalSyntheticBackport0.m(m7669((short) (Process.getGidForName("") + 1), (ViewConfiguration.getScrollBarSize() >> 8) - 1128404170, (-33) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1334917114, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), this.f1902)).append(m7667(null, 127 - Color.green(0), null, "\u0087\u0098").intern());
        gb gbVar = this.f1903;
        if (gbVar != null) {
            int i2 = f1890 + 15;
            f1893 = i2 % 128;
            int i3 = i2 % 2;
            intern = gbVar.toString();
        } else {
            intern = m7669((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1128404092) - TextUtils.indexOf((CharSequence) "", '0'), (-34) - Color.argb(0, 0, 0, 0), 1334917117 - View.combineMeasuredStates(0, 0), (byte) (Process.myTid() >> 22)).intern();
        }
        String obj2 = append.append(intern).toString();
        int i4 = f1893 + 33;
        f1890 = i4 % 128;
        if (i4 % 2 != 0) {
            return obj2;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7667(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f1900;
            int i2 = f1897;
            if (f1899) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f1898) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7669(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1894;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1892;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1896 + i3] + i4);
                } else {
                    i5 = (short) (f1895[f1896 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f1896 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f1891);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f1892;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f1895;
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
