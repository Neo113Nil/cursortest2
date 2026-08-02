package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.abk0;
import xsna.epx;
import xsna.hg10;
import xsna.k0x;
import xsna.tgw;
import xsna.w65;
import xsna.zak0;

/* compiled from: SnapshotState.android.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableState<T> extends zak0<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    /* compiled from: SnapshotState.android.kt */
    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
            abk0 abk0Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                abk0Var = w65.e;
            } else if (readInt == 1) {
                abk0Var = k0x.c;
            } else {
                if (readInt != 2) {
                    throw new IllegalStateException(tgw.b(readInt, "Unsupported MutableState policy ", " was restored"));
                }
                abk0Var = hg10.g;
            }
            return new ParcelableSnapshotMutableState(readValue, abk0Var);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }
    }

    public ParcelableSnapshotMutableState(T t, abk0<T> abk0Var) {
        super(t, abk0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        w65 w65Var = w65.e;
        abk0<T> abk0Var = this.c;
        if (epx.f(abk0Var, w65Var)) {
            i2 = 0;
        } else if (epx.f(abk0Var, k0x.c)) {
            i2 = 1;
        } else {
            if (!epx.f(abk0Var, hg10.g)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
