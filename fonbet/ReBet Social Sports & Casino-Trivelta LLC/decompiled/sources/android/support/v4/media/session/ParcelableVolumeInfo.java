package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f16298a;

    /* renamed from: b, reason: collision with root package name */
    public int f16299b;

    /* renamed from: c, reason: collision with root package name */
    public int f16300c;

    /* renamed from: d, reason: collision with root package name */
    public int f16301d;

    /* renamed from: e, reason: collision with root package name */
    public int f16302e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f16298a = parcel.readInt();
        this.f16300c = parcel.readInt();
        this.f16301d = parcel.readInt();
        this.f16302e = parcel.readInt();
        this.f16299b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16298a);
        parcel.writeInt(this.f16300c);
        parcel.writeInt(this.f16301d);
        parcel.writeInt(this.f16302e);
        parcel.writeInt(this.f16299b);
    }
}
