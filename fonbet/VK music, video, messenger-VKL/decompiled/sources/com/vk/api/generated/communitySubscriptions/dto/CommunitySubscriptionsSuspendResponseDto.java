package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommunitySubscriptionsSuspendResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsSuspendResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsSuspendResponseDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: CommunitySubscriptionsSuspendResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsSuspendResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsSuspendResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsSuspendResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsSuspendResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsSuspendResponseDto[i];
        }
    }

    public CommunitySubscriptionsSuspendResponseDto(String str, String str2) {
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
        if (!(obj instanceof CommunitySubscriptionsSuspendResponseDto)) {
            return false;
        }
        CommunitySubscriptionsSuspendResponseDto communitySubscriptionsSuspendResponseDto = (CommunitySubscriptionsSuspendResponseDto) obj;
        return epx.f(this.title, communitySubscriptionsSuspendResponseDto.title) && epx.f(this.description, communitySubscriptionsSuspendResponseDto.description);
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
        StringBuilder sb = new StringBuilder("CommunitySubscriptionsSuspendResponseDto(title=");
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
