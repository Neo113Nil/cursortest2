package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import xsna.dgn;
import xsna.k73;
import xsna.nyh0;
import xsna.pm0;
import xsna.tdj;
import xsna.z23;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    /* loaded from: classes12.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ParseException(@NonNull String str, @NonNull Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
            nyh0.a(dataPosition, str, " Parcel: pos=", " size=", sb);
            sb.append(dataSize);
        }
    }

    @NonNull
    public static Long A(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        if (B == 0) {
            return null;
        }
        F(parcel, B, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int B(@NonNull Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void C(@NonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + B(parcel, i));
    }

    public static int D(@NonNull Parcel parcel) {
        int readInt = parcel.readInt();
        int B = B(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = B + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    public static void E(Parcel parcel, int i, int i2) {
        int B = B(parcel, i);
        if (B == i2) {
            return;
        }
        String hexString = Integer.toHexString(B);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(B).length() + 4 + 1);
        dgn.a(i2, B, "Expected size ", " got ", sb);
        throw new ParseException(tdj.a(sb, " (0x", hexString, ")"), parcel);
    }

    public static void F(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        dgn.a(i2, i, "Expected size ", " got ", sb);
        throw new ParseException(tdj.a(sb, " (0x", hexString, ")"), parcel);
    }

    @NonNull
    public static BigDecimal a(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + B);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @NonNull
    public static Bundle b(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + B);
        return readBundle;
    }

    @NonNull
    public static byte[] c(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + B);
        return createByteArray;
    }

    @NonNull
    public static int[] d(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + B);
        return createIntArray;
    }

    @NonNull
    public static ArrayList<Integer> e(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            i2 = pm0.b(parcel, arrayList, i2, 1);
        }
        parcel.setDataPosition(dataPosition + B);
        return arrayList;
    }

    @NonNull
    public static long[] f(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + B);
        return createLongArray;
    }

    @NonNull
    public static ArrayList<Long> g(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            i2 = k73.b(parcel, arrayList, i2, 1);
        }
        parcel.setDataPosition(dataPosition + B);
        return arrayList;
    }

    @NonNull
    public static <T extends Parcelable> T h(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + B);
        return createFromParcel;
    }

    @NonNull
    public static String i(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + B);
        return readString;
    }

    @NonNull
    public static String[] j(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + B);
        return createStringArray;
    }

    @NonNull
    public static ArrayList<String> k(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + B);
        return createStringArrayList;
    }

    @NonNull
    public static <T> T[] l(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + B);
        return tArr;
    }

    @NonNull
    public static <T> ArrayList<T> m(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + B);
        return createTypedArrayList;
    }

    public static void n(@NonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException(z23.b(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static boolean o(@NonNull Parcel parcel, int i) {
        E(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    public static Boolean p(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        if (B == 0) {
            return null;
        }
        F(parcel, B, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte q(@NonNull Parcel parcel, int i) {
        E(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double r(@NonNull Parcel parcel, int i) {
        E(parcel, i, 8);
        return parcel.readDouble();
    }

    @NonNull
    public static Double s(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        if (B == 0) {
            return null;
        }
        F(parcel, B, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float t(@NonNull Parcel parcel, int i) {
        E(parcel, i, 4);
        return parcel.readFloat();
    }

    @NonNull
    public static Float u(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        if (B == 0) {
            return null;
        }
        F(parcel, B, 4);
        return Float.valueOf(parcel.readFloat());
    }

    @NonNull
    public static IBinder v(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + B);
        return readStrongBinder;
    }

    public static int w(@NonNull Parcel parcel, int i) {
        E(parcel, i, 4);
        return parcel.readInt();
    }

    @NonNull
    public static Integer x(@NonNull Parcel parcel, int i) {
        int B = B(parcel, i);
        if (B == 0) {
            return null;
        }
        F(parcel, B, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void y(@NonNull Parcel parcel, int i, @NonNull ArrayList arrayList, @NonNull ClassLoader classLoader) {
        int B = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return;
        }
        parcel.readList(arrayList, classLoader);
        parcel.setDataPosition(dataPosition + B);
    }

    public static long z(@NonNull Parcel parcel, int i) {
        E(parcel, i, 8);
        return parcel.readLong();
    }
}
