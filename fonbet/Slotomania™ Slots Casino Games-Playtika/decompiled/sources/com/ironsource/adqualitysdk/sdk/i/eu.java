package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;

/* loaded from: classes4.dex */
public abstract class eu extends ev {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2026 = {196, 226, 239, 240, 245, 161, 228, 238, 241, 243, 230, 229};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2027 = 129;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2028 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2029 = true;

    public eu(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ, reason: contains not printable characters */
    final boolean mo7753(String str, String str2) {
        int i = 2 % 2;
        throw new RuntimeException(new StringBuilder().append(m7751(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u0086\u008b\u008a\u0082\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern()).append(str).append(m7751(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0086\u008c\u0083\u0082\u0086").intern()).append(str2).toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ, reason: contains not printable characters */
    final boolean mo7752(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new RuntimeException(new StringBuilder().append(m7751(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0086\u008b\u008a\u0082\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern()).append(obj).append(m7751(null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, "\u0086\u008c\u0083\u0082\u0086").intern()).append(obj2).toString());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7751(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f2026;
            int i2 = f2027;
            if (f2029) {
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
            if (f2028) {
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
