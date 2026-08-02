package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VkRunCreateUserChallengeResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkRunCreateUserChallengeResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkRunCreateUserChallengeResponseDto> CREATOR = new a();

    @pmi0("challenge_id")
    private final String challengeId;

    @pmi0("friend_ids")
    private final List<Integer> friendIds;

    @pmi0("slug")
    private final String slug;

    /* compiled from: VkRunCreateUserChallengeResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkRunCreateUserChallengeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunCreateUserChallengeResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new VkRunCreateUserChallengeResponseDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunCreateUserChallengeResponseDto[] newArray(int i) {
            return new VkRunCreateUserChallengeResponseDto[i];
        }
    }

    public VkRunCreateUserChallengeResponseDto(String str, String str2, List<Integer> list) {
        this.challengeId = str;
        this.slug = str2;
        this.friendIds = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunCreateUserChallengeResponseDto)) {
            return false;
        }
        VkRunCreateUserChallengeResponseDto vkRunCreateUserChallengeResponseDto = (VkRunCreateUserChallengeResponseDto) obj;
        return epx.f(this.challengeId, vkRunCreateUserChallengeResponseDto.challengeId) && epx.f(this.slug, vkRunCreateUserChallengeResponseDto.slug) && epx.f(this.friendIds, vkRunCreateUserChallengeResponseDto.friendIds);
    }

    public final int hashCode() {
        return this.friendIds.hashCode() + urd0.a(this.challengeId.hashCode() * 31, 31, this.slug);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunCreateUserChallengeResponseDto(challengeId=");
        sb.append(this.challengeId);
        sb.append(", slug=");
        sb.append(this.slug);
        sb.append(", friendIds=");
        return ms9.a(')', sb, this.friendIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.challengeId);
        parcel.writeString(this.slug);
        Iterator a2 = ao.a(parcel, this.friendIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
