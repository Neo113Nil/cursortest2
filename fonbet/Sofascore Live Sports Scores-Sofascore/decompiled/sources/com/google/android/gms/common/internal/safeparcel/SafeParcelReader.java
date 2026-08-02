package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.me4;
import defpackage.w1l;
import defpackage.wt3;
import defpackage.x5n;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SafeParcelReader {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ParseException(String str, Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
            w1l.q(dataPosition, str, " Parcel: pos=", " size=", sb);
            sb.append(dataSize);
        }
    }

    private SafeParcelReader() {
    }

    public static void A(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + z(parcel, i));
    }

    public static int B(Parcel parcel) {
        int readInt = parcel.readInt();
        int z = z(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = z + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new ParseException(x5n.n(new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length()), dataPosition, "Size read is invalid start=", i, " end="), parcel);
    }

    public static void C(Parcel parcel, int i, int i2) {
        int z = z(parcel, i);
        if (z == i2) {
            return;
        }
        String hexString = Integer.toHexString(z);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(z).length() + 4 + 1);
        me4.r(sb, "Expected size ", i2, " got ", z);
        throw new ParseException(wt3.m(" (0x", hexString, sb, ")"), parcel);
    }

    public static void D(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        me4.r(sb, "Expected size ", i2, " got ", i);
        throw new ParseException(wt3.m(" (0x", hexString, sb, ")"), parcel);
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + z);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle b(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + z);
        return readBundle;
    }

    public static byte[] c(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + z);
        return createByteArray;
    }

    public static byte[][] d(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + z);
        return bArr;
    }

    public static int[] e(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + z);
        return createIntArray;
    }

    public static ArrayList f(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + z);
        return arrayList;
    }

    public static long[] g(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + z);
        return createLongArray;
    }

    public static Parcelable h(Parcel parcel, int i, Parcelable.Creator creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + z);
        return parcelable;
    }

    public static String i(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + z);
        return readString;
    }

    public static String[] j(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + z);
        return createStringArray;
    }

    public static ArrayList k(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + z);
        return createStringArrayList;
    }

    public static Object[] l(Parcel parcel, int i, Parcelable.Creator creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + z);
        return createTypedArray;
    }

    public static ArrayList m(Parcel parcel, int i, Parcelable.Creator creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + z);
        return createTypedArrayList;
    }

    public static void n(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException(me4.g(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static boolean o(Parcel parcel, int i) {
        C(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean p(Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        D(parcel, z, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte q(Parcel parcel, int i) {
        C(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double r(Parcel parcel, int i) {
        C(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double s(Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        D(parcel, z, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float t(Parcel parcel, int i) {
        C(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder u(Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + z);
        return readStrongBinder;
    }

    public static int v(Parcel parcel, int i) {
        C(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer w(Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        D(parcel, z, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x(Parcel parcel, int i) {
        C(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long y(Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        D(parcel, z, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int z(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }
}
