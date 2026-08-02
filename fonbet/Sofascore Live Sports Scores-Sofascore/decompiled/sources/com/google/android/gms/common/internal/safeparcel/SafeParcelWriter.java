package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static void a(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        r(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeBundle(bundle);
        t(parcel, s);
    }

    public static void c(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                r(parcel, i, 0);
            }
        } else {
            int s = s(parcel, i);
            parcel.writeByteArray(bArr);
            t(parcel, s);
        }
    }

    public static void d(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        t(parcel, s);
    }

    public static void e(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        r(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void f(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeStrongBinder(iBinder);
        t(parcel, s);
    }

    public static void g(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeIntArray(iArr);
        t(parcel, s);
    }

    public static void h(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int s = s(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        t(parcel, s);
    }

    public static void i(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        r(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void j(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeLongArray(jArr);
        t(parcel, s);
    }

    public static void k(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        r(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void l(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                r(parcel, i, 0);
            }
        } else {
            int s = s(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            t(parcel, s);
        }
    }

    public static void m(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                r(parcel, i, 0);
            }
        } else {
            int s = s(parcel, i);
            parcel.writeString(str);
            t(parcel, s);
        }
    }

    public static void n(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeStringArray(strArr);
        t(parcel, s);
    }

    public static void o(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeStringList(list);
        t(parcel, s);
    }

    public static void p(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        t(parcel, s);
    }

    public static void q(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                r(parcel, i, 0);
                return;
            }
            return;
        }
        int s = s(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        t(parcel, s);
    }

    public static void r(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int s(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void t(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
