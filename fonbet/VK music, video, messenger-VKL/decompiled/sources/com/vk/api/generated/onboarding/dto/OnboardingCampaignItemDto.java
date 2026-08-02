package com.vk.api.generated.onboarding.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: OnboardingCampaignItemDto.kt */
/* loaded from: classes15.dex */
public final class OnboardingCampaignItemDto implements Parcelable {
    public static final Parcelable.Creator<OnboardingCampaignItemDto> CREATOR = new a();

    @pmi0("ab_group")
    private final int abGroup;

    @pmi0("has_active_banner")
    private final boolean hasActiveBanner;

    @pmi0("name")
    private final String name;

    @pmi0("quarantine_time")
    private final Integer quarantineTime;

    /* compiled from: OnboardingCampaignItemDto.kt */
    public static final class a implements Parcelable.Creator<OnboardingCampaignItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingCampaignItemDto createFromParcel(Parcel parcel) {
            return new OnboardingCampaignItemDto(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingCampaignItemDto[] newArray(int i) {
            return new OnboardingCampaignItemDto[i];
        }
    }

    public OnboardingCampaignItemDto(String str, int i, boolean z, Integer num) {
        this.name = str;
        this.abGroup = i;
        this.hasActiveBanner = z;
        this.quarantineTime = num;
    }

    public final int d() {
        return this.abGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.hasActiveBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingCampaignItemDto)) {
            return false;
        }
        OnboardingCampaignItemDto onboardingCampaignItemDto = (OnboardingCampaignItemDto) obj;
        return epx.f(this.name, onboardingCampaignItemDto.name) && this.abGroup == onboardingCampaignItemDto.abGroup && this.hasActiveBanner == onboardingCampaignItemDto.hasActiveBanner && epx.f(this.quarantineTime, onboardingCampaignItemDto.quarantineTime);
    }

    public final String f() {
        return this.name;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.abGroup, this.name.hashCode() * 31, 31), 31, this.hasActiveBanner);
        Integer num = this.quarantineTime;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingCampaignItemDto(name=");
        sb.append(this.name);
        sb.append(", abGroup=");
        sb.append(this.abGroup);
        sb.append(", hasActiveBanner=");
        sb.append(this.hasActiveBanner);
        sb.append(", quarantineTime=");
        return uqi.b(sb, this.quarantineTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.abGroup);
        parcel.writeInt(this.hasActiveBanner ? 1 : 0);
        Integer num = this.quarantineTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ OnboardingCampaignItemDto(String str, int i, boolean z, Integer num, int i2, zcl zclVar) {
        this(str, i, z, (i2 & 8) != 0 ? null : num);
    }
}
