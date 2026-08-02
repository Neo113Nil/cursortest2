package com.vk.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* loaded from: classes17.dex */
public class StringSparseArrayParceler implements Parcelable {
    public static final Parcelable.Creator<StringSparseArrayParceler> CREATOR = new a();
    public final SparseArray<String> b;

    public class a implements Parcelable.Creator<StringSparseArrayParceler> {
        @Override // android.os.Parcelable.Creator
        public final StringSparseArrayParceler createFromParcel(Parcel parcel) {
            return new StringSparseArrayParceler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StringSparseArrayParceler[] newArray(int i) {
            return new StringSparseArrayParceler[i];
        }
    }

    public StringSparseArrayParceler(@NonNull SparseArray<String> sparseArray) {
        this.b = sparseArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            parcel.writeInt(keyAt);
            parcel.writeString(sparseArray.get(keyAt));
        }
    }

    public StringSparseArrayParceler(Parcel parcel) {
        this.b = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.b.put(parcel.readInt(), parcel.readString());
        }
    }
}
