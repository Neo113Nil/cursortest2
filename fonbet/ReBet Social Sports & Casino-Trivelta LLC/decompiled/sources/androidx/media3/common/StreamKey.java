package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import e1.Z;

/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final String f20469d = Z.K0(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f20470e = Z.K0(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f20471f = Z.K0(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f20472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20474c;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f20472a = i10;
        this.f20473b = i11;
        this.f20474c = i12;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f20472a - streamKey.f20472a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f20473b - streamKey.f20473b;
        return i11 == 0 ? this.f20474c - streamKey.f20474c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f20472a == streamKey.f20472a && this.f20473b == streamKey.f20473b && this.f20474c == streamKey.f20474c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20472a * 31) + this.f20473b) * 31) + this.f20474c;
    }

    public String toString() {
        return this.f20472a + "." + this.f20473b + "." + this.f20474c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20472a);
        parcel.writeInt(this.f20473b);
        parcel.writeInt(this.f20474c);
    }

    public StreamKey(Parcel parcel) {
        this.f20472a = parcel.readInt();
        this.f20473b = parcel.readInt();
        this.f20474c = parcel.readInt();
    }
}
