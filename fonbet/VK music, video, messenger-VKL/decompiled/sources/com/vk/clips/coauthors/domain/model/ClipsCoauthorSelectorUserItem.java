package com.vk.clips.coauthors.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.coauthors.domain.model.Restriction;
import com.vk.dto.common.id.UserId;
import xsna.bpn0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ClipsCoauthorSelectorUserItem.kt */
/* loaded from: classes16.dex */
public final class ClipsCoauthorSelectorUserItem implements Parcelable {
    public static final Parcelable.Creator<ClipsCoauthorSelectorUserItem> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final Restriction f;
    public final boolean g;
    public final CoauthorType h;
    public final bpn0 i = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 24));

    /* compiled from: ClipsCoauthorSelectorUserItem.kt */
    public static final class a implements Parcelable.Creator<ClipsCoauthorSelectorUserItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipsCoauthorSelectorUserItem createFromParcel(Parcel parcel) {
            return new ClipsCoauthorSelectorUserItem((UserId) parcel.readParcelable(ClipsCoauthorSelectorUserItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (Restriction) parcel.readParcelable(ClipsCoauthorSelectorUserItem.class.getClassLoader()), parcel.readInt() != 0, CoauthorType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsCoauthorSelectorUserItem[] newArray(int i) {
            return new ClipsCoauthorSelectorUserItem[i];
        }
    }

    static {
        new ClipsCoauthorSelectorUserItem(UserId.d, "", "", "", new Restriction.None(""), false, CoauthorType.Male);
    }

    public ClipsCoauthorSelectorUserItem(UserId userId, String str, String str2, String str3, Restriction restriction, boolean z, CoauthorType coauthorType) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = restriction;
        this.g = z;
        this.h = coauthorType;
    }

    public final String d() {
        return (String) this.i.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsCoauthorSelectorUserItem)) {
            return false;
        }
        ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem = (ClipsCoauthorSelectorUserItem) obj;
        return epx.f(this.b, clipsCoauthorSelectorUserItem.b) && epx.f(this.c, clipsCoauthorSelectorUserItem.c) && epx.f(this.d, clipsCoauthorSelectorUserItem.d) && epx.f(this.e, clipsCoauthorSelectorUserItem.e) && epx.f(this.f, clipsCoauthorSelectorUserItem.f) && this.g == clipsCoauthorSelectorUserItem.g && this.h == clipsCoauthorSelectorUserItem.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b((this.f.hashCode() + urd0.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        return "ClipsCoauthorSelectorUserItem(userId=" + this.b + ", firstName=" + this.c + ", lastName=" + this.d + ", avatar=" + this.e + ", restriction=" + this.f + ", canSetStatus=" + this.g + ", type=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h.name());
    }
}
