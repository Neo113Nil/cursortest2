package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StoriesGetFeedSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetFeedSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetFeedSettingsResponseDto> CREATOR = new a();

    @pmi0("is_advices_visible")
    private final Boolean isAdvicesVisible;

    @pmi0("is_birthdays_visible")
    private final Boolean isBirthdaysVisible;

    @pmi0("is_discover_visible")
    private final Boolean isDiscoverVisible;

    /* compiled from: StoriesGetFeedSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetFeedSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetFeedSettingsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesGetFeedSettingsResponseDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetFeedSettingsResponseDto[] newArray(int i) {
            return new StoriesGetFeedSettingsResponseDto[i];
        }
    }

    public StoriesGetFeedSettingsResponseDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.isAdvicesVisible;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isDiscoverVisible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetFeedSettingsResponseDto)) {
            return false;
        }
        StoriesGetFeedSettingsResponseDto storiesGetFeedSettingsResponseDto = (StoriesGetFeedSettingsResponseDto) obj;
        return epx.f(this.isAdvicesVisible, storiesGetFeedSettingsResponseDto.isAdvicesVisible) && epx.f(this.isBirthdaysVisible, storiesGetFeedSettingsResponseDto.isBirthdaysVisible) && epx.f(this.isDiscoverVisible, storiesGetFeedSettingsResponseDto.isDiscoverVisible);
    }

    public final int hashCode() {
        Boolean bool = this.isAdvicesVisible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isBirthdaysVisible;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDiscoverVisible;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetFeedSettingsResponseDto(isAdvicesVisible=");
        sb.append(this.isAdvicesVisible);
        sb.append(", isBirthdaysVisible=");
        sb.append(this.isBirthdaysVisible);
        sb.append(", isDiscoverVisible=");
        return tn.a(sb, this.isDiscoverVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAdvicesVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBirthdaysVisible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isDiscoverVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public StoriesGetFeedSettingsResponseDto(Boolean bool, Boolean bool2, Boolean bool3) {
        this.isAdvicesVisible = bool;
        this.isBirthdaysVisible = bool2;
        this.isDiscoverVisible = bool3;
    }

    public /* synthetic */ StoriesGetFeedSettingsResponseDto(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
