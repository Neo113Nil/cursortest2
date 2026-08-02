package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMarkBadgeAsClickedResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsMarkBadgeAsClickedResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsMarkBadgeAsClickedResponseDto> CREATOR = new a();

    @pmi0("notification_badge_type")
    private final AppsAppNotificationBadgeTypeDto notificationBadgeType;

    /* compiled from: AppsMarkBadgeAsClickedResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsMarkBadgeAsClickedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMarkBadgeAsClickedResponseDto createFromParcel(Parcel parcel) {
            return new AppsMarkBadgeAsClickedResponseDto((AppsAppNotificationBadgeTypeDto) parcel.readParcelable(AppsMarkBadgeAsClickedResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMarkBadgeAsClickedResponseDto[] newArray(int i) {
            return new AppsMarkBadgeAsClickedResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsMarkBadgeAsClickedResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AppsAppNotificationBadgeTypeDto d() {
        return this.notificationBadgeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsMarkBadgeAsClickedResponseDto) && this.notificationBadgeType == ((AppsMarkBadgeAsClickedResponseDto) obj).notificationBadgeType;
    }

    public final int hashCode() {
        AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto = this.notificationBadgeType;
        if (appsAppNotificationBadgeTypeDto == null) {
            return 0;
        }
        return appsAppNotificationBadgeTypeDto.hashCode();
    }

    public final String toString() {
        return "AppsMarkBadgeAsClickedResponseDto(notificationBadgeType=" + this.notificationBadgeType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.notificationBadgeType, i);
    }

    public AppsMarkBadgeAsClickedResponseDto(AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto) {
        this.notificationBadgeType = appsAppNotificationBadgeTypeDto;
    }

    public /* synthetic */ AppsMarkBadgeAsClickedResponseDto(AppsAppNotificationBadgeTypeDto appsAppNotificationBadgeTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : appsAppNotificationBadgeTypeDto);
    }
}
