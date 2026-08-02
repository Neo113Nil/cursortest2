package z7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.Z;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10996a extends O2.a {
    public static final Parcelable.Creator<C10996a> CREATOR = new C2325a();

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Z<String, Bundle> f107308c;

    /* renamed from: z7.a$a, reason: collision with other inner class name */
    final class C2325a implements Parcelable.ClassLoaderCreator<C10996a> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final C10996a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new C10996a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i11) {
            return new C10996a[i11];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new C10996a(parcel, null);
        }
    }

    public C10996a(Parcelable parcelable) {
        super(parcelable);
        this.f107308c = new Z<>();
    }

    @NonNull
    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f107308c + "}";
    }

    @Override // O2.a, android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        Z<String, Bundle> z11 = this.f107308c;
        int size = z11.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i12 = 0; i12 < size; i12++) {
            strArr[i12] = z11.j(i12);
            bundleArr[i12] = z11.n(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    C10996a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f107308c = new Z<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f107308c.put(strArr[i11], bundleArr[i11]);
        }
    }
}
