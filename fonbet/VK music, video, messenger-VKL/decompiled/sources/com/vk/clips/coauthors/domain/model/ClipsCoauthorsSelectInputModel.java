package com.vk.clips.coauthors.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ClipsCoauthorsSelectInputModel.kt */
/* loaded from: classes16.dex */
public final class ClipsCoauthorsSelectInputModel implements Parcelable {
    public static final Parcelable.Creator<ClipsCoauthorsSelectInputModel> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final boolean e;
    public final CoauthorType f;

    /* compiled from: ClipsCoauthorsSelectInputModel.kt */
    public static final class a implements Parcelable.Creator<ClipsCoauthorsSelectInputModel> {
        @Override // android.os.Parcelable.Creator
        public final ClipsCoauthorsSelectInputModel createFromParcel(Parcel parcel) {
            return new ClipsCoauthorsSelectInputModel((UserId) parcel.readParcelable(ClipsCoauthorsSelectInputModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, CoauthorType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsCoauthorsSelectInputModel[] newArray(int i) {
            return new ClipsCoauthorsSelectInputModel[i];
        }
    }

    public ClipsCoauthorsSelectInputModel(UserId userId, String str, String str2, boolean z, CoauthorType coauthorType) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = coauthorType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsCoauthorsSelectInputModel)) {
            return false;
        }
        ClipsCoauthorsSelectInputModel clipsCoauthorsSelectInputModel = (ClipsCoauthorsSelectInputModel) obj;
        return epx.f(this.b, clipsCoauthorsSelectInputModel.b) && epx.f(this.c, clipsCoauthorsSelectInputModel.c) && epx.f(this.d, clipsCoauthorsSelectInputModel.d) && this.e == clipsCoauthorsSelectInputModel.e && this.f == clipsCoauthorsSelectInputModel.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ClipsCoauthorsSelectInputModel(userId=" + this.b + ", name=" + this.c + ", avatar=" + this.d + ", canSetStatus=" + this.e + ", type=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
    }
}
