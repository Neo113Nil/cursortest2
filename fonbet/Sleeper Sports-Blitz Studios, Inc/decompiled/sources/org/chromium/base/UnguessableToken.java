package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.errorprone.annotations.DoNotMock;
import internal.org.jni_zero.JNINamespace;

@DoNotMock("This is a simple value object.")
@JNINamespace("base::android")
/* loaded from: classes10.dex */
public final class UnguessableToken extends TokenBase implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new Parcelable.Creator<UnguessableToken>() { // from class: org.chromium.base.UnguessableToken.1
        @Override // android.os.Parcelable.Creator
        public UnguessableToken createFromParcel(Parcel source) {
            long readLong = source.readLong();
            long readLong2 = source.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2);
        }

        @Override // android.os.Parcelable.Creator
        public UnguessableToken[] newArray(int size) {
            return new UnguessableToken[size];
        }
    };
    private static int sCounterForTesting;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static UnguessableToken createForTesting() {
        int i = sCounterForTesting;
        long j = i + 1;
        int i2 = i + 2;
        sCounterForTesting = i2;
        return new UnguessableToken(j, i2);
    }

    private UnguessableToken(long high, long low) {
        super(high, low);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.mHigh);
        dest.writeLong(this.mLow);
    }

    public long getHighForTesting() {
        return this.mHigh;
    }

    public long getLowForTesting() {
        return this.mLow;
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public String toString() {
        return super.toString();
    }
}
