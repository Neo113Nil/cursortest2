package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: NewsfeedFeedPreloadingTypeConfigDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedFeedPreloadingTypeConfigDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedFeedPreloadingTypeConfigDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    /* compiled from: NewsfeedFeedPreloadingTypeConfigDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedFeedPreloadingTypeConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedFeedPreloadingTypeConfigDto createFromParcel(Parcel parcel) {
            return new NewsfeedFeedPreloadingTypeConfigDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedFeedPreloadingTypeConfigDto[] newArray(int i) {
            return new NewsfeedFeedPreloadingTypeConfigDto[i];
        }
    }

    public NewsfeedFeedPreloadingTypeConfigDto(boolean z) {
        this.enabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedFeedPreloadingTypeConfigDto) && this.enabled == ((NewsfeedFeedPreloadingTypeConfigDto) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return q0.a(new StringBuilder("NewsfeedFeedPreloadingTypeConfigDto(enabled="), this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
