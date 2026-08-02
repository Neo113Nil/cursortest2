package com.vk.profile.community.details.api.di.links.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: LinkItemModel.kt */
/* loaded from: classes5.dex */
public final class LinkItemModel implements Parcelable {
    public static final Parcelable.Creator<LinkItemModel> CREATOR = new a();
    public final UUID b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: LinkItemModel.kt */
    public static final class a implements Parcelable.Creator<LinkItemModel> {
        @Override // android.os.Parcelable.Creator
        public final LinkItemModel createFromParcel(Parcel parcel) {
            return new LinkItemModel((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkItemModel[] newArray(int i) {
            return new LinkItemModel[i];
        }
    }

    public LinkItemModel(UUID uuid, String str, String str2, String str3, String str4) {
        this.b = uuid;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkItemModel)) {
            return false;
        }
        LinkItemModel linkItemModel = (LinkItemModel) obj;
        return epx.f(this.b, linkItemModel.b) && epx.f(this.c, linkItemModel.c) && epx.f(this.d, linkItemModel.d) && epx.f(this.e, linkItemModel.e) && epx.f(this.f, linkItemModel.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkItemModel(uid=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", imageURL=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
