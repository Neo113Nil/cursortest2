package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NewsfeedDiscoverLazyLoadDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDiscoverLazyLoadDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDiscoverLazyLoadDto> CREATOR = new a();

    @pmi0("lives")
    private final Boolean lives;

    @pmi0("stories")
    private final Boolean stories;

    /* compiled from: NewsfeedDiscoverLazyLoadDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDiscoverLazyLoadDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDiscoverLazyLoadDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedDiscoverLazyLoadDto(valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDiscoverLazyLoadDto[] newArray(int i) {
            return new NewsfeedDiscoverLazyLoadDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedDiscoverLazyLoadDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDiscoverLazyLoadDto)) {
            return false;
        }
        NewsfeedDiscoverLazyLoadDto newsfeedDiscoverLazyLoadDto = (NewsfeedDiscoverLazyLoadDto) obj;
        return epx.f(this.stories, newsfeedDiscoverLazyLoadDto.stories) && epx.f(this.lives, newsfeedDiscoverLazyLoadDto.lives);
    }

    public final int hashCode() {
        Boolean bool = this.stories;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.lives;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDiscoverLazyLoadDto(stories=");
        sb.append(this.stories);
        sb.append(", lives=");
        return tn.a(sb, this.lives, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.stories;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.lives;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public NewsfeedDiscoverLazyLoadDto(Boolean bool, Boolean bool2) {
        this.stories = bool;
        this.lives = bool2;
    }

    public /* synthetic */ NewsfeedDiscoverLazyLoadDto(Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
