package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: WallPostingSettingsActionButtonVkTicketDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsActionButtonVkTicketDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsActionButtonVkTicketDto> CREATOR = new a();

    @pmi0("is_onboarding_enabled")
    private final Boolean isOnboardingEnabled;

    @pmi0("url")
    private final String url;

    /* compiled from: WallPostingSettingsActionButtonVkTicketDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsActionButtonVkTicketDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsActionButtonVkTicketDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallPostingSettingsActionButtonVkTicketDto(readString, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsActionButtonVkTicketDto[] newArray(int i) {
            return new WallPostingSettingsActionButtonVkTicketDto[i];
        }
    }

    public WallPostingSettingsActionButtonVkTicketDto(String str, Boolean bool) {
        this.url = str;
        this.isOnboardingEnabled = bool;
    }

    public final Boolean d() {
        return this.isOnboardingEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsActionButtonVkTicketDto)) {
            return false;
        }
        WallPostingSettingsActionButtonVkTicketDto wallPostingSettingsActionButtonVkTicketDto = (WallPostingSettingsActionButtonVkTicketDto) obj;
        return epx.f(this.url, wallPostingSettingsActionButtonVkTicketDto.url) && epx.f(this.isOnboardingEnabled, wallPostingSettingsActionButtonVkTicketDto.isOnboardingEnabled);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Boolean bool = this.isOnboardingEnabled;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingSettingsActionButtonVkTicketDto(url=");
        sb.append(this.url);
        sb.append(", isOnboardingEnabled=");
        return tn.a(sb, this.isOnboardingEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Boolean bool = this.isOnboardingEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ WallPostingSettingsActionButtonVkTicketDto(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
