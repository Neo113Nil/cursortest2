package com.vk.photos.ui.editalbum.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: CreateAlbumEntryPoint.kt */
/* loaded from: classes3.dex */
public final class CreateAlbumEntryPoint implements Parcelable {
    public static final Parcelable.Creator<CreateAlbumEntryPoint> CREATOR = new a();
    public final MobileOfficialAppsCoreNavStat$EventScreen b;

    /* compiled from: CreateAlbumEntryPoint.kt */
    public static final class a implements Parcelable.Creator<CreateAlbumEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final CreateAlbumEntryPoint createFromParcel(Parcel parcel) {
            return new CreateAlbumEntryPoint(MobileOfficialAppsCoreNavStat$EventScreen.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreateAlbumEntryPoint[] newArray(int i) {
            return new CreateAlbumEntryPoint[i];
        }
    }

    public CreateAlbumEntryPoint(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateAlbumEntryPoint) && this.b == ((CreateAlbumEntryPoint) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreateAlbumEntryPoint(eventScreen=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
    }
}
