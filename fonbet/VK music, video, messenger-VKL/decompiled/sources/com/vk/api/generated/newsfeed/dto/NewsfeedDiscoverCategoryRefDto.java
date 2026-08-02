package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: NewsfeedDiscoverCategoryRefDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDiscoverCategoryRefDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDiscoverCategoryRefDto> CREATOR = new a();

    @pmi0("compact")
    private final String compact;

    @pmi0("full")
    private final String full;

    @pmi0("post")
    private final String post;

    /* compiled from: NewsfeedDiscoverCategoryRefDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDiscoverCategoryRefDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDiscoverCategoryRefDto createFromParcel(Parcel parcel) {
            return new NewsfeedDiscoverCategoryRefDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDiscoverCategoryRefDto[] newArray(int i) {
            return new NewsfeedDiscoverCategoryRefDto[i];
        }
    }

    public NewsfeedDiscoverCategoryRefDto(String str, String str2, String str3) {
        this.compact = str;
        this.full = str2;
        this.post = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDiscoverCategoryRefDto)) {
            return false;
        }
        NewsfeedDiscoverCategoryRefDto newsfeedDiscoverCategoryRefDto = (NewsfeedDiscoverCategoryRefDto) obj;
        return epx.f(this.compact, newsfeedDiscoverCategoryRefDto.compact) && epx.f(this.full, newsfeedDiscoverCategoryRefDto.full) && epx.f(this.post, newsfeedDiscoverCategoryRefDto.post);
    }

    public final int hashCode() {
        return this.post.hashCode() + urd0.a(this.compact.hashCode() * 31, 31, this.full);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDiscoverCategoryRefDto(compact=");
        sb.append(this.compact);
        sb.append(", full=");
        sb.append(this.full);
        sb.append(", post=");
        return ho8.a(sb, this.post, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.compact);
        parcel.writeString(this.full);
        parcel.writeString(this.post);
    }
}
