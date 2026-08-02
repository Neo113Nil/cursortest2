package E9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes2.dex */
public abstract class c {
    public static SafeParcelable a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC3191o.m(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static SafeParcelable b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static SafeParcelable c(String str, Parcelable.Creator creator) {
        return a(K9.c.a(str), creator);
    }

    public static byte[] d(SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static void e(SafeParcelable safeParcelable, Intent intent, String str) {
        intent.putExtra(str, d(safeParcelable));
    }

    public static String f(SafeParcelable safeParcelable) {
        return K9.c.d(d(safeParcelable));
    }
}
