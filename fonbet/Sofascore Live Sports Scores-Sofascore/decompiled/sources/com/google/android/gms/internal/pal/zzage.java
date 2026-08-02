package com.google.android.gms.internal.pal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzage implements zzagd {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((zzagf) this).a;
        long zzd = ((zzagd) obj).zzd();
        if (j < zzd) {
            return -1;
        }
        return j > zzd ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzagd) && ((zzagf) this).a == ((zzagd) obj).zzd();
    }

    public final int hashCode() {
        long j = ((zzagf) this).a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = ((zzagf) this).a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        int i = zzagh.a;
        int i2 = (int) j;
        if (i2 == j) {
            if (i2 < 0) {
                stringBuffer.append('-');
                if (i2 != Integer.MIN_VALUE) {
                    i2 = -i2;
                } else {
                    stringBuffer.append("2147483648");
                }
            }
            if (i2 < 10) {
                stringBuffer.append((char) (i2 + 48));
            } else if (i2 < 100) {
                int i3 = ((i2 + 1) * 13421772) >> 27;
                stringBuffer.append((char) (i3 + 48));
                stringBuffer.append((char) (((i2 - (i3 << 3)) - (i3 + i3)) + 48));
            } else {
                stringBuffer.append(Integer.toString(i2));
            }
        } else {
            stringBuffer.append(Long.toString(j));
        }
        while (true) {
            if (stringBuffer.length() >= (j < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(j < 0 ? 3 : 2, "0");
        }
        if ((j / 1000) * 1000 == j) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
