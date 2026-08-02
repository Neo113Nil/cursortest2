package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public final class en extends ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1991 = 186;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1992 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1993 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final ef f1994;

    public en(ef efVar) {
        this.f1994 = efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f1993 + 115;
        f1992 = i2 % 128;
        int i3 = i2 % 2;
        ea m7721 = this.f1994.m7721(eeVar, clVar);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return m7721;
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7737(-TextUtils.lastIndexOf("", '0', 0), true, 225 - TextUtils.indexOf((CharSequence) "", '0', 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, -ExpandableListView.getPackedPositionChild(0L)).intern()).append(this.f1994).append(m7737((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).toString();
        int i2 = f1993 + 59;
        f1992 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f1992 + 1;
            f1993 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            en enVar = (en) obj;
            ef efVar = this.f1994;
            if (efVar != null) {
                int i4 = f1993 + 111;
                f1992 = i4 % 128;
                int i5 = i4 % 2;
                return efVar.equals(enVar.f1994);
            }
            if (enVar.f1994 == null) {
                int i6 = f1992 + 43;
                f1993 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1993 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i3 = i2 % 128;
        f1992 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ef efVar = this.f1994;
        if (efVar != null) {
            return efVar.hashCode();
        }
        int i4 = i3 + 47;
        f1993 = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7737(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f1991);
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
}
