package com.ironsource.adqualitysdk.sdk.i;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class gd extends gb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2172 = {1697331583, -1311653986, 952616796, 572417804, 340931791, -293053782, 1406183284, 1029199421, -1442316609, 11608158, -65815775, -323984906, -61604264, 1342996131, -1240516853, 1125413944, -870703791, -543701660};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2173 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2174 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final List<ef> f2175;

    public gd(List<ef> list) {
        this.f2175 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final ea mo7776(ee eeVar, cl clVar) {
        List<String> asList;
        int i = 2 % 2;
        Iterator<ef> it = this.f2175.iterator();
        int i2 = f2173 + 91;
        f2174 = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            eq eqVar = null;
            if (!it.hasNext()) {
                return new ea(null);
            }
            ef next = it.next();
            if (next instanceof eq) {
                eqVar = (eq) next;
                int i4 = f2173 + 107;
                f2174 = i4 % 128;
                int i5 = i4 % 2;
            } else if (next instanceof ej) {
                eqVar = ((ej) next).m7727();
            }
            if (eqVar != null) {
                int i6 = f2174 + 29;
                f2173 = i6 % 128;
                if (i6 % 2 != 0) {
                    String[] strArr = new String[0];
                    strArr[0] = eqVar.m7746();
                    asList = Arrays.asList(strArr);
                } else {
                    asList = Arrays.asList(eqVar.m7746());
                }
                eeVar.m7717(asList);
            }
            next.mo7722(eeVar, clVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        return new java.lang.StringBuilder().append(m7793(new int[]{-699068608, -66970291}, 3 - android.os.Process.getGidForName("")).intern()).append(android.text.TextUtils.join(m7793(new int[]{-1184852722, 1831500684}, android.view.View.combineMeasuredStates(0, 0) + 2).intern(), r8.f2175)).append(m7793(new int[]{1790102112, -1862692858}, android.graphics.Color.argb(0, 0, 0, 0) + 1).intern()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r8.f2175 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r8.f2175 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0080, code lost:
    
        r1 = m7793(new int[]{-699068608, -66970291, 1790102112, -1862692858}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6).intern();
        r2 = com.ironsource.adqualitysdk.sdk.i.gd.f2173 + 17;
        com.ironsource.adqualitysdk.sdk.i.gd.f2174 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009c, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        r0 = null;
        super.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i = 2 % 2;
        int i2 = f2173 + 67;
        f2174 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7793(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2172.clone();
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
