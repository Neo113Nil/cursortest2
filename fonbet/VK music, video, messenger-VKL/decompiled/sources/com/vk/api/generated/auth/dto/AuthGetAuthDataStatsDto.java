package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AuthGetAuthDataStatsDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataStatsDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataStatsDto> CREATOR = new a();

    @pmi0("flow_source")
    private final String flowSource;

    @pmi0("prev_screen")
    private final String prevScreen;

    @pmi0("session_id")
    private final String sessionId;

    @pmi0("type_carousel")
    private final String typeCarousel;

    @pmi0("vkme_flow_type")
    private final String vkmeFlowType;

    /* compiled from: AuthGetAuthDataStatsDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataStatsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataStatsDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataStatsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataStatsDto[] newArray(int i) {
            return new AuthGetAuthDataStatsDto[i];
        }
    }

    public AuthGetAuthDataStatsDto(String str, String str2, String str3, String str4, String str5) {
        this.sessionId = str;
        this.flowSource = str2;
        this.vkmeFlowType = str3;
        this.typeCarousel = str4;
        this.prevScreen = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataStatsDto)) {
            return false;
        }
        AuthGetAuthDataStatsDto authGetAuthDataStatsDto = (AuthGetAuthDataStatsDto) obj;
        return epx.f(this.sessionId, authGetAuthDataStatsDto.sessionId) && epx.f(this.flowSource, authGetAuthDataStatsDto.flowSource) && epx.f(this.vkmeFlowType, authGetAuthDataStatsDto.vkmeFlowType) && epx.f(this.typeCarousel, authGetAuthDataStatsDto.typeCarousel) && epx.f(this.prevScreen, authGetAuthDataStatsDto.prevScreen);
    }

    public final int hashCode() {
        return this.prevScreen.hashCode() + urd0.a(urd0.a(urd0.a(this.sessionId.hashCode() * 31, 31, this.flowSource), 31, this.vkmeFlowType), 31, this.typeCarousel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataStatsDto(sessionId=");
        sb.append(this.sessionId);
        sb.append(", flowSource=");
        sb.append(this.flowSource);
        sb.append(", vkmeFlowType=");
        sb.append(this.vkmeFlowType);
        sb.append(", typeCarousel=");
        sb.append(this.typeCarousel);
        sb.append(", prevScreen=");
        return ho8.a(sb, this.prevScreen, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        parcel.writeString(this.flowSource);
        parcel.writeString(this.vkmeFlowType);
        parcel.writeString(this.typeCarousel);
        parcel.writeString(this.prevScreen);
    }
}
