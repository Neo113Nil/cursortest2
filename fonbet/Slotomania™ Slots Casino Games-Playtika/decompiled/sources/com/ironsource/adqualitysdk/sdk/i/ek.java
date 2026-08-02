package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public final class ek extends ef {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1974 = 82;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1975 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1976 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f1977;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final ef f1978;

    public ek(ef efVar, String str) {
        this.f1978 = efVar;
        this.f1977 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(r4.getClass().getDeclaredField(r3.f1977).get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if ((r4 instanceof com.ironsource.adqualitysdk.sdk.i.cl) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if ((r4 instanceof com.ironsource.adqualitysdk.sdk.i.cl) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r5 = new com.ironsource.adqualitysdk.sdk.i.ea(((com.ironsource.adqualitysdk.sdk.i.cl) r4).m7209(r3.f1977));
        r4 = com.ironsource.adqualitysdk.sdk.i.ek.f1976 + 61;
        com.ironsource.adqualitysdk.sdk.i.ek.f1975 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        throw null;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ea mo7722(ee eeVar, cl clVar) {
        Object m7684;
        int i = 2 % 2;
        int i2 = f1976 + 79;
        f1975 = i2 % 128;
        if (i2 % 2 != 0) {
            m7684 = this.f1978.m7721(eeVar, clVar).m7684();
            int i3 = 68 / 0;
        } else {
            m7684 = this.f1978.m7721(eeVar, clVar).m7684();
        }
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1978.toString()).append(m7728((Process.myPid() >> 22) + 1, false, ExpandableListView.getPackedPositionType(0L) + 128, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()).append(this.f1977).toString();
        int i2 = f1976 + 111;
        f1975 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1976 + 25;
        f1975 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ek ekVar = (ek) obj;
            ef efVar = this.f1978;
            if (efVar == null ? ekVar.f1978 != null : !efVar.equals(ekVar.f1978)) {
                return false;
            }
            String str = this.f1977;
            if (str != null) {
                int i3 = f1976 + 59;
                f1975 = i3 % 128;
                int i4 = i3 % 2;
                return str.equals(ekVar.f1977);
            }
            if (ekVar.f1977 == null) {
                return true;
            }
            int i5 = f1975 + 7;
            f1976 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f1975;
        int i4 = i3 + 83;
        f1976 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        ef efVar = this.f1978;
        int i5 = 0;
        if (efVar != null) {
            int i6 = i3 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f1976 = i6 % 128;
            if (i6 % 2 == 0) {
                i = efVar.hashCode();
                int i7 = 92 / 0;
            } else {
                i = efVar.hashCode();
            }
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str = this.f1977;
        if (str != null) {
            int i9 = f1975 + 113;
            f1976 = i9 % 128;
            if (i9 % 2 == 0) {
                str.hashCode();
                super.hashCode();
                throw null;
            }
            i5 = str.hashCode();
            int i10 = f1975 + 57;
            f1976 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 3;
            }
        }
        return i8 + i5;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7728(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f1974);
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
