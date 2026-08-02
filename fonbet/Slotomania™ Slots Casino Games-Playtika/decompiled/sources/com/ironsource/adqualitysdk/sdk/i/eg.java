package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class eg extends ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f1953 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1954 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1955 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f1956 = {-117, -117};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1957 = 118;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1958 = -104521376;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1959 = -544748679;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ef[] f1960;

    public eg(List<ef> list) {
        ef[] efVarArr = new ef[list.size()];
        this.f1960 = efVarArr;
        list.toArray(efVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ef[] efVarArr = this.f1960;
        int length = efVarArr.length;
        int i2 = f1955 + 111;
        f1954 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f1954 + 95;
            f1955 = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.add(efVarArr[i4].m7721(eeVar, clVar).m7684());
                i4 += 66;
            } else {
                arrayList.add(efVarArr[i4].m7721(eeVar, clVar).m7684());
                i4++;
            }
        }
        return new ea(arrayList);
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7723((short) TextUtils.getCapsMode("", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 104521467, (-120) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Color.alpha(0) + 544748679, (byte) ((-29) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern()).append(m7720(this.f1960)).append(m7723((short) TextUtils.getTrimmedLength(""), 104521470 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - 167, 544748680 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 64)).intern()).toString();
        int i2 = f1954 + 13;
        f1955 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1954;
        int i3 = i2 + 11;
        f1955 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i4 = i2 + 73;
        f1955 = i4 % 128;
        if (i4 % 2 == 0) {
            obj.getClass();
            throw null;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1960, ((eg) obj).f1960);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1954 + 1;
        f1955 = i2 % 128;
        int i3 = i2 % 2;
        int hashCode = Arrays.hashCode(this.f1960);
        int i4 = f1954 + 51;
        f1955 = i4 % 128;
        int i5 = i4 % 2;
        return hashCode;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7723(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1957;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1956;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1959 + i3] + i4);
                } else {
                    i5 = (short) (f1953[f1959 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f1959 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f1958);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f1956;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f1953;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
