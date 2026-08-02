package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class eo extends ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f1995 = {-1950274443, 260841018, -1308905395, -2019037849, 1359289274, 1808404289, -1482803707, -1433526023, 370191769, 466910818, -74858936, 244814092, 1686132250, -1397659285, -500863803, -782780702, -452616171, 1892221877};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1996 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1997 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f1998;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ef[] f1999;

    public eo(String str, List<ef> list) {
        this.f1998 = eb.m7685(str);
        ef[] efVarArr = new ef[list.size()];
        this.f1999 = efVarArr;
        list.toArray(efVarArr);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final String m7740() {
        int i = 2 % 2;
        int i2 = f1997 + 109;
        int i3 = i2 % 128;
        f1996 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f1998;
        int i4 = i3 + 69;
        f1997 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final ef[] m7739() {
        int i = 2 % 2;
        int i2 = f1996;
        int i3 = i2 + 11;
        f1997 = i3 % 128;
        int i4 = i3 % 2;
        ef[] efVarArr = this.f1999;
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1997 = i5 % 128;
        if (i5 % 2 != 0) {
            return efVarArr;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f1996 + 91;
        f1997 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> m7741 = m7741(eeVar, clVar);
        if (m7740().equals(m7738(new int[]{1317854043, 294719011}, TextUtils.indexOf("", "", 0) + 3).intern())) {
            cn.m7273(m7738(new int[]{-138726707, -1647842024, -278252784, -1886572812}, 7 - View.MeasureSpec.getMode(0)).intern(), new StringBuilder().append(clVar.m7203()).append(m7738(new int[]{-909841598, -786800315}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern()).append(m7741.get(0)).toString());
            return new ea(null);
        }
        try {
            ea eaVar = new ea(((dz) eeVar.m7710(m7740())).m7671(eeVar, clVar, m7741));
            int i4 = f1997 + 51;
            f1996 = i4 % 128;
            int i5 = i4 % 2;
            return eaVar;
        } catch (Exception unused) {
            if (clVar.m7210().m7933(m7740()) != null) {
                return clVar.m7210().m7933(m7740()).m7671(eeVar, clVar, m7741).m7681(false);
            }
            return new ea(clVar.m7201().mo6381(clVar, m7740(), m7741, clVar.m7205(), eeVar));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final List<Object> m7741(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ef[] efVarArr = this.f1999;
        int length = efVarArr.length;
        int i2 = f1997 + 7;
        f1996 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f1996 + 65;
            f1997 = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.add(efVarArr[i4].m7721(eeVar, clVar).m7684());
                i4 += 126;
            } else {
                arrayList.add(efVarArr[i4].m7721(eeVar, clVar).m7684());
                i4++;
            }
        }
        return arrayList;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = f1996 + 47;
        f1997 = i2 % 128;
        int i3 = i2 % 2;
        String mo7732 = mo7732(this.f1999);
        int i4 = f1997 + 69;
        f1996 = i4 % 128;
        int i5 = i4 % 2;
        return mo7732;
    }

    /* renamed from: ﻐ */
    String mo7732(Object[] objArr) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1998).append(m7738(new int[]{85573933, -119711068}, 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()).append(m7720(objArr)).append(m7738(new int[]{538786288, -1910047425}, View.resolveSize(0, 0) + 1).intern()).toString();
        int i2 = f1997 + 5;
        f1996 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return java.util.Arrays.equals(r5.f1999, r6.f1999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.eo.f1996 + 1;
        com.ironsource.adqualitysdk.sdk.i.eo.f1997 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r6 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (getClass() == r6.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.eo) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r5.f1998.equals(r6.f1998) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1996 + 115;
        f1997 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    public int hashCode() {
        int hashCode;
        int i = 2 % 2;
        int i2 = f1996;
        int i3 = i2 + 45;
        f1997 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1998;
        int i5 = 0;
        if (str != null) {
            int i6 = i2 + 21;
            f1997 = i6 % 128;
            if (i6 % 2 == 0) {
                hashCode = str.hashCode();
                int i7 = 96 / 0;
            } else {
                hashCode = str.hashCode();
            }
            i5 = hashCode;
        }
        return (i5 * 31) + Arrays.hashCode(this.f1999);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7738(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1995.clone();
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
