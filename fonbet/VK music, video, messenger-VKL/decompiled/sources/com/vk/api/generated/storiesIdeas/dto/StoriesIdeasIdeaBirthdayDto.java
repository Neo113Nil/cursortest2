package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: StoriesIdeasIdeaBirthdayDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasIdeaBirthdayDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasIdeaBirthdayDto> CREATOR = new a();

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: StoriesIdeasIdeaBirthdayDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasIdeaBirthdayDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaBirthdayDto createFromParcel(Parcel parcel) {
            return new StoriesIdeasIdeaBirthdayDto((UserId) parcel.readParcelable(StoriesIdeasIdeaBirthdayDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaBirthdayDto[] newArray(int i) {
            return new StoriesIdeasIdeaBirthdayDto[i];
        }
    }

    public StoriesIdeasIdeaBirthdayDto(UserId userId) {
        this.userId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoriesIdeasIdeaBirthdayDto) && epx.f(this.userId, ((StoriesIdeasIdeaBirthdayDto) obj).userId);
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        return Long.hashCode(this.userId.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("StoriesIdeasIdeaBirthdayDto(userId="), this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
    }
}
