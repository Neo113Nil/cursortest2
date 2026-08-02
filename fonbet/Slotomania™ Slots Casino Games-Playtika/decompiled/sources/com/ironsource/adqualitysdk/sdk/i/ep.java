package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public abstract class ep extends ef {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2000 = {-50486115, -590264943, 495603973, -1033030740, 1003810489, 417954084, -952837201, -1688647808, -553572528, -1379793208, -373760291, 592255946, -520668039, 1318711261, 799061236, -11029440, -1741024584, -101475859};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2001 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2002 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ef f2003;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final ef f2004;

    ep(ef efVar, ef efVar2) {
        this.f2004 = efVar;
        this.f2003 = efVar2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final ef m7743() {
        ef efVar;
        int i = 2 % 2;
        int i2 = f2001;
        int i3 = i2 + 21;
        f2002 = i3 % 128;
        if (i3 % 2 == 0) {
            efVar = this.f2004;
            int i4 = 68 / 0;
        } else {
            efVar = this.f2004;
        }
        int i5 = i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2002 = i5 % 128;
        int i6 = i5 % 2;
        return efVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final ef m7744() {
        int i = 2 % 2;
        int i2 = f2001;
        int i3 = i2 + 99;
        f2002 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ef efVar = this.f2003;
        int i4 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2002 = i4 % 128;
        int i5 = i4 % 2;
        return efVar;
    }

    public String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7743().toString()).append(m7742(new int[]{-118634384, 117275144}, -ExpandableListView.getPackedPositionChild(0L)).intern()).append(m7744().toString()).append(m7742(new int[]{-1152826568, 700467051}, 1 - ExpandableListView.getPackedPositionType(0L)).intern()).toString();
        int i2 = f2002 + 83;
        f2001 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r3.equals(r7.f2004) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r3 = r6.f2003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ep.f2002 + 107;
        com.ironsource.adqualitysdk.sdk.i.ep.f2001 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return r3.equals(r7.f2003);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7.f2003 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ep.f2001 + 59;
        com.ironsource.adqualitysdk.sdk.i.ep.f2002 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r7.f2004 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ep epVar = (ep) obj;
            ef efVar = this.f2004;
            if (efVar != null) {
                int i2 = f2001 + 111;
                f2002 = i2 % 128;
                if (i2 % 2 == 0) {
                    efVar.equals(epVar.f2004);
                    throw null;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f2002;
        int i4 = i3 + 37;
        f2001 = i4 % 128;
        int i5 = i4 % 2;
        ef efVar = this.f2004;
        int i6 = 0;
        if (efVar != null) {
            int i7 = i3 + 89;
            f2001 = i7 % 128;
            int i8 = i7 % 2;
            i = efVar.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        ef efVar2 = this.f2003;
        if (efVar2 != null) {
            i6 = efVar2.hashCode();
        } else {
            int i10 = f2001 + 11;
            f2002 = i10 % 128;
            int i11 = i10 % 2;
        }
        return i9 + i6;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7742(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2000.clone();
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
