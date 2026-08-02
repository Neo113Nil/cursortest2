package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class eq extends ef {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2005 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2006 = {-854411661, 1650379679, 984384893, 1514041568, 1323645678, 1211616645, -1147399038, -109255054, 623386414, -1149442323, -1904167916, -1678044187, -893586265, -1414627676, -1773667580, -392380361, -495043041, 1630850875};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2007 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f2008;

    public eq(String str) {
        this.f2008 = eb.m7685(str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m7746() {
        int i = 2 % 2;
        int i2 = f2005;
        int i3 = i2 + 21;
        f2007 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2008;
        int i5 = i2 + 103;
        f2007 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        try {
            ea eaVar = new ea(eeVar.m7710(m7746()));
            int i2 = f2007 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2005 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
            return eaVar;
        } catch (Exception unused) {
            dz m7209 = clVar.m7209(m7746());
            if (m7209 == null) {
                new dr(clVar, eeVar, new StringBuilder().append(m7745(new int[]{83126782, 1267375270, 228750692, 1230907608, 70674808, -570308804, 1390911756, -1080339288, 1796063890, -1330400200, -1594893762, -1586972912, -264616123, 2048674556, 1750982943, -1952138233}, 29 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()).append(this).append(m7745(new int[]{1750982943, -1952138233}, -TextUtils.lastIndexOf("", '0')).intern()).toString()).m7593(clVar.m7203());
                return new ea(null);
            }
            ea eaVar2 = new ea(m7209);
            int i4 = f2005 + 77;
            f2007 = i4 % 128;
            int i5 = i4 % 2;
            return eaVar2;
        }
    }

    public final String toString() {
        String m7746;
        int i = 2 % 2;
        int i2 = f2007 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2005 = i2 % 128;
        if (i2 % 2 != 0) {
            m7746 = m7746();
            int i3 = 58 / 0;
        } else {
            m7746 = m7746();
        }
        int i4 = f2007 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2005 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return m7746;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2005 + 77;
            f2007 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        Object obj2 = null;
        if (obj != null) {
            int i4 = f2007 + 55;
            f2005 = i4 % 128;
            if (i4 % 2 != 0) {
                obj.getClass();
                super.hashCode();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                return this.f2008.equals(((eq) obj).f2008);
            }
        }
        int i5 = f2007 + 21;
        f2005 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f2005 + 83;
        int i3 = i2 % 128;
        f2007 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f2008;
        if (str == null) {
            return 0;
        }
        int i4 = i3 + 31;
        f2005 = i4 % 128;
        int i5 = i4 % 2;
        int hashCode = str.hashCode();
        if (i5 != 0) {
            int i6 = 18 / 0;
        }
        return hashCode;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7745(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2006.clone();
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
