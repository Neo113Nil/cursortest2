package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class UnguessableToken extends TokenBase implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new a();

    final class a implements Parcelable.Creator<UnguessableToken> {
        @Override // android.os.Parcelable.Creator
        public final UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2);
        }

        @Override // android.os.Parcelable.Creator
        public final UnguessableToken[] newArray(int i11) {
            return new UnguessableToken[i11];
        }
    }

    @CalledByNative
    private UnguessableToken(long j11, long j12) {
        super(j11, j12);
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f78521a);
        parcel.writeLong(this.f78522b);
    }
}
