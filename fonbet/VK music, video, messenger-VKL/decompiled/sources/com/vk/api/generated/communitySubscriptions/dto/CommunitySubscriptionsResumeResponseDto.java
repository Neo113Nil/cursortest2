package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommunitySubscriptionsResumeResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsResumeResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsResumeResponseDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: CommunitySubscriptionsResumeResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsResumeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsResumeResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsResumeResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsResumeResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsResumeResponseDto[i];
        }
    }

    public CommunitySubscriptionsResumeResponseDto(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunitySubscriptionsResumeResponseDto)) {
            return false;
        }
        CommunitySubscriptionsResumeResponseDto communitySubscriptionsResumeResponseDto = (CommunitySubscriptionsResumeResponseDto) obj;
        return epx.f(this.title, communitySubscriptionsResumeResponseDto.title) && epx.f(this.description, communitySubscriptionsResumeResponseDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunitySubscriptionsResumeResponseDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
