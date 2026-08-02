package s7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* renamed from: s7.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9613h extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C9613h> CREATOR = new a();

    /* renamed from: s7.h$a */
    final class a implements Parcelable.ClassLoaderCreator<C9613h> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final C9613h createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new C9613h(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i11) {
            return new C9613h[i11];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new C9613h(parcel, null);
        }
    }

    public C9613h() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = keyAt(i12);
            parcelableArr[i12] = valueAt(i12);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i11);
    }

    public C9613h(@NonNull Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i11 = 0; i11 < readInt; i11++) {
            put(iArr[i11], readParcelableArray[i11]);
        }
    }
}
