package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: NotificationsActionRedesignResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsActionRedesignResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsActionRedesignResponseDto> CREATOR = new a();

    @pmi0("api_call_result")
    private final NotificationsApiCallResultDto apiCallResult;

    /* compiled from: NotificationsActionRedesignResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsActionRedesignResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsActionRedesignResponseDto createFromParcel(Parcel parcel) {
            return new NotificationsActionRedesignResponseDto(NotificationsApiCallResultDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsActionRedesignResponseDto[] newArray(int i) {
            return new NotificationsActionRedesignResponseDto[i];
        }
    }

    public NotificationsActionRedesignResponseDto(NotificationsApiCallResultDto notificationsApiCallResultDto) {
        this.apiCallResult = notificationsApiCallResultDto;
    }

    public final NotificationsApiCallResultDto d() {
        return this.apiCallResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsActionRedesignResponseDto) && epx.f(this.apiCallResult, ((NotificationsActionRedesignResponseDto) obj).apiCallResult);
    }

    public final int hashCode() {
        return this.apiCallResult.hashCode();
    }

    public final String toString() {
        return "NotificationsActionRedesignResponseDto(apiCallResult=" + this.apiCallResult + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.apiCallResult.writeToParcel(parcel, i);
    }
}
