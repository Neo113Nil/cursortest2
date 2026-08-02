package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1nSDK {
    public int valueOf;
    public int values;

    public static char[] AFInAppEventType(long j11, char[] cArr, int i11) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i12 = 0;
        int i13 = 4;
        for (int i14 = 0; i14 < cArr.length; i14++) {
            if (((j11 >>> i14) & 1) == i11 && i12 < 4) {
                cArr2[i12] = cArr[i14];
            } else if (i13 < length) {
                cArr2[i13] = cArr[i14];
                i13++;
            } else {
                cArr2[i12] = cArr[i14];
            }
            i12++;
        }
        return cArr2;
    }
}
