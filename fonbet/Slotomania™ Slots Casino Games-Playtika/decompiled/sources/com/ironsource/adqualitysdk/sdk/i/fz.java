package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public class fz extends gb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2151 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2152 = -1570867619190363659L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2153;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ef f2154;

    public fz(ef efVar) {
        this.f2154 = efVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final ef m7784() {
        int i = 2 % 2;
        int i2 = f2151 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f2153 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        ef efVar = this.f2154;
        int i4 = i3 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2151 = i4 % 128;
        if (i4 % 2 != 0) {
            return efVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ef efVar = this.f2154;
        Object obj = null;
        if (efVar != null) {
            int i2 = f2151 + 71;
            f2153 = i2 % 128;
            if (i2 % 2 == 0) {
                return efVar.m7721(eeVar, clVar);
            }
            efVar.m7721(eeVar, clVar);
            super.hashCode();
            throw null;
        }
        ea eaVar = new ea(null);
        int i3 = f2151 + 37;
        f2153 = i3 % 128;
        if (i3 % 2 == 0) {
            return eaVar;
        }
        super.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = f2151 + 115;
        f2153 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f2154 != null) {
                return new StringBuilder().append(this.f2154).append(m7783("뺀뺻䛤誆\ue08d", -TextUtils.lastIndexOf("", '0', 0, 0)).intern()).toString();
            }
            String intern = m7783("뺀뺻䛤誆\ue08d", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
            int i3 = f2153 + 53;
            f2151 = i3 % 128;
            int i4 = i3 % 2;
            return intern;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f2151 + 113;
        f2153 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i3 = f2151 + 105;
            f2153 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
            return false;
        }
        fz fzVar = (fz) obj;
        ef efVar = this.f2154;
        if (efVar != null) {
            int i5 = f2153 + 73;
            f2151 = i5 % 128;
            int i6 = i5 % 2;
            return efVar.equals(fzVar.f2154);
        }
        if (fzVar.f2154 != null) {
            return false;
        }
        int i7 = f2153 + 113;
        f2151 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = f2153 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i3 = i2 % 128;
        f2151 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        ef efVar = this.f2154;
        if (efVar != null) {
            int hashCode = efVar.hashCode();
            int i4 = f2153 + 113;
            f2151 = i4 % 128;
            int i5 = i4 % 2;
            return hashCode;
        }
        int i6 = i3 + 49;
        f2153 = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7783(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2152, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2152));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
