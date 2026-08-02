package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.kj;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class dl {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f1767 = true;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1768 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1769 = 0;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1770 = {193, 195, 190, 179, 192, 175, Typography.degree, 194, Typography.plusMinus, 187, 196, 188, Typography.paragraph, Typography.half, 178, 'X'};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1771 = 78;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1772 = true;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Map<String, dz> f1773;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, dh> f1774;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1775;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1776;

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<dm> f1777;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1778;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f1779;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7576(dl dlVar) {
        int i = 2 % 2;
        int i2 = f1768 + 81;
        int i3 = i2 % 128;
        f1769 = i3;
        int i4 = i2 % 2;
        String str = dlVar.f1775;
        int i5 = i3 + 39;
        f1768 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public dl(final String str, String str2, JSONObject jSONObject) {
        this.f1775 = eb.m7685(str2);
        this.f1776 = eb.m7685(jSONObject.optString(m7573(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0085\u0084\u0083\u0082\u0081").intern()));
        this.f1778 = jSONObject.optBoolean(m7573(null, 127 - Color.red(0), null, "\u0088\u0089\u0086\u0085\u0088\u0081\u0087\u0086").intern());
        this.f1779 = m7575(kj.m8423(jSONObject.optJSONArray(m7573(null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, "\u0081\u0085\u0084\u0087\u008a\u0084\u008a").intern()), new kj.e<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final /* synthetic */ String mo6110(JSONArray jSONArray, int i) {
                return eb.m7685(jSONArray.optString(i));
            }
        }));
        this.f1777 = m7575(kj.m8423(jSONObject.optJSONArray(m7573(null, View.combineMeasuredStates(0, 0) + 127, null, "\u0083\u0082\u0088\u0084\u0081").intern()), new kj.e<dm>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* renamed from: ｋ */
            public final /* synthetic */ dm mo6110(JSONArray jSONArray, int i) {
                return new dm(jSONArray.optJSONObject(i));
            }
        }));
        this.f1774 = m7574(kj.m8424(jSONObject.optJSONObject(m7573(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u0081\u0088\u008c\u0084\u008b\u0084").intern()), new kj.a<dh>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* renamed from: ﻛ */
            public final /* synthetic */ dh mo6109(JSONObject jSONObject2, String str3) {
                return new dh(jSONObject2.optJSONObject(str3));
            }
        }));
        final dz[] dzVarArr = {null};
        this.f1773 = m7574(kj.m8424(jSONObject.optJSONObject(m7573(null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, "\u0081\u008f\u008e\u008d\u0088\u0084\u008a").intern()), new kj.a<dz>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* renamed from: ﻛ */
            public final /* synthetic */ dz mo6109(JSONObject jSONObject2, String str3) {
                dz dzVar = new dz(str, dl.m7576(dl.this), str3, jSONObject2.optJSONObject(str3), dzVarArr[0]);
                dzVarArr[0] = dzVar;
                return dzVar;
            }
        }));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> List<T> m7575(List<T> list) {
        int i = 2 % 2;
        int i2 = f1768 + 21;
        f1769 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = f1768 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1769 = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <K, V> Map<K, V> m7574(Map<K, V> map) {
        int i = 2 % 2;
        int i2 = f1768 + 5;
        int i3 = i2 % 128;
        f1769 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (map != null) {
            int i4 = i3 + 83;
            f1768 = i4 % 128;
            int i5 = i4 % 2;
            return map;
        }
        HashMap hashMap = new HashMap();
        int i6 = f1769 + 15;
        f1768 = i6 % 128;
        if (i6 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m7580() {
        int i = 2 % 2;
        int i2 = f1768;
        int i3 = i2 + 29;
        f1769 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1775;
        int i5 = i2 + 33;
        f1769 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7579() {
        int i = 2 % 2;
        int i2 = f1768 + 109;
        int i3 = i2 % 128;
        f1769 = i3;
        int i4 = i2 % 2;
        String str = this.f1776;
        int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1768 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7582() {
        int i = 2 % 2;
        int i2 = f1769 + 105;
        f1768 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1778;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m7581() {
        List<String> list;
        int i = 2 % 2;
        int i2 = f1768 + 101;
        int i3 = i2 % 128;
        f1769 = i3;
        if (i2 % 2 != 0) {
            list = this.f1779;
            int i4 = 79 / 0;
        } else {
            list = this.f1779;
        }
        int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1768 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Map<String, dz> m7583() {
        int i = 2 % 2;
        int i2 = f1768 + 105;
        int i3 = i2 % 128;
        f1769 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        Map<String, dz> map = this.f1773;
        int i4 = i3 + 97;
        f1768 = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final List<dm> m7578() {
        int i = 2 % 2;
        int i2 = f1769 + 57;
        f1768 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1777;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Map<String, dh> m7577() {
        int i = 2 % 2;
        int i2 = f1768 + 21;
        int i3 = i2 % 128;
        f1769 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<String, dh> map = this.f1774;
        int i4 = i3 + 9;
        f1768 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return map;
    }

    public final String toString() {
        int lastIndexOf;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(this.f1773.values());
        Collections.sort(arrayList, new Comparator<dz>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.3
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(dz dzVar, dz dzVar2) {
                return dzVar.m7670() - dzVar2.m7670();
            }
        });
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = f1769 + 7;
            f1768 = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(((dz) it.next()).toString());
                lastIndexOf = 15957 >> TextUtils.lastIndexOf("", (char) 31);
            } else {
                sb.append(((dz) it.next()).toString());
                lastIndexOf = TextUtils.lastIndexOf("", '0') + 128;
            }
            sb.append(m7573(null, lastIndexOf, null, "\u0090\u0090").intern());
            int i3 = f1768 + 115;
            f1769 = i3 % 128;
            int i4 = i3 % 2;
        }
        return sb.toString();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7573(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f1770;
            int i2 = f1771;
            if (f1767) {
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
            if (f1772) {
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
}
