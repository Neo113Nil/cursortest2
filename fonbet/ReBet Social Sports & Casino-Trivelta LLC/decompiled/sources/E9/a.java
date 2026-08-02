package E9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: E9.a$a, reason: collision with other inner class name */
    public static class C0068a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0068a(String str, Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(dataPosition);
            sb2.append(" size=");
            sb2.append(dataSize);
        }
    }

    public static double A(Parcel parcel, int i10) {
        O(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double B(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        if (L10 == 0) {
            return null;
        }
        P(parcel, i10, L10, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float C(Parcel parcel, int i10) {
        O(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float D(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        if (L10 == 0) {
            return null;
        }
        P(parcel, i10, L10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int E(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder F(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + L10);
        return readStrongBinder;
    }

    public static int G(Parcel parcel, int i10) {
        O(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer H(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        if (L10 == 0) {
            return null;
        }
        P(parcel, i10, L10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long I(Parcel parcel, int i10) {
        O(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long J(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        if (L10 == 0) {
            return null;
        }
        P(parcel, i10, L10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short K(Parcel parcel, int i10) {
        O(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int L(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void M(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + L(parcel, i10));
    }

    public static int N(Parcel parcel) {
        int E10 = E(parcel);
        int L10 = L(parcel, E10);
        int w10 = w(E10);
        int dataPosition = parcel.dataPosition();
        if (w10 != 20293) {
            throw new C0068a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(E10))), parcel);
        }
        int i10 = L10 + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new C0068a(sb2.toString(), parcel);
    }

    public static void O(Parcel parcel, int i10, int i11) {
        int L10 = L(parcel, i10);
        if (L10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(L10);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(L10).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(L10);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C0068a(sb2.toString(), parcel);
    }

    public static void P(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C0068a(sb2.toString(), parcel);
    }

    public static BigDecimal a(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + L10);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + L10);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + L10);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + L10);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + L10);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + L10);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + L10);
        return createByteArray;
    }

    public static byte[][] h(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + L10);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + L10);
        return createDoubleArray;
    }

    public static float[] j(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + L10);
        return createFloatArray;
    }

    public static int[] k(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + L10);
        return createIntArray;
    }

    public static ArrayList l(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + L10);
        return arrayList;
    }

    public static long[] m(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + L10);
        return createLongArray;
    }

    public static Parcel n(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, L10);
        parcel.setDataPosition(dataPosition + L10);
        return obtain;
    }

    public static Parcel[] o(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + L10);
        return parcelArr;
    }

    public static Parcelable p(Parcel parcel, int i10, Parcelable.Creator creator) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + L10);
        return parcelable;
    }

    public static String q(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + L10);
        return readString;
    }

    public static String[] r(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + L10);
        return createStringArray;
    }

    public static ArrayList s(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + L10);
        return createStringArrayList;
    }

    public static Object[] t(Parcel parcel, int i10, Parcelable.Creator creator) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + L10);
        return createTypedArray;
    }

    public static ArrayList u(Parcel parcel, int i10, Parcelable.Creator creator) {
        int L10 = L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (L10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + L10);
        return createTypedArrayList;
    }

    public static void v(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new C0068a(sb2.toString(), parcel);
    }

    public static int w(int i10) {
        return (char) i10;
    }

    public static boolean x(Parcel parcel, int i10) {
        O(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean y(Parcel parcel, int i10) {
        int L10 = L(parcel, i10);
        if (L10 == 0) {
            return null;
        }
        P(parcel, i10, L10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte z(Parcel parcel, int i10) {
        O(parcel, i10, 4);
        return (byte) parcel.readInt();
    }
}
