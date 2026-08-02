package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: NewsfeedUserTopicSourceDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedUserTopicSourceDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedUserTopicSourceDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    /* compiled from: NewsfeedUserTopicSourceDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedUserTopicSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedUserTopicSourceDto createFromParcel(Parcel parcel) {
            return new NewsfeedUserTopicSourceDto((UserId) parcel.readParcelable(NewsfeedUserTopicSourceDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedUserTopicSourceDto[] newArray(int i) {
            return new NewsfeedUserTopicSourceDto[i];
        }
    }

    public NewsfeedUserTopicSourceDto(UserId userId) {
        this.id = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedUserTopicSourceDto) && epx.f(this.id, ((NewsfeedUserTopicSourceDto) obj).id);
    }

    public final int hashCode() {
        return Long.hashCode(this.id.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("NewsfeedUserTopicSourceDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
    }
}
