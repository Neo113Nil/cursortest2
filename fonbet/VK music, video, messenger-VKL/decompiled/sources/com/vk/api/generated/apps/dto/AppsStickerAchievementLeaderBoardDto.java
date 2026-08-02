package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: AppsStickerAchievementLeaderBoardDto.kt */
/* loaded from: classes14.dex */
public final class AppsStickerAchievementLeaderBoardDto implements Parcelable {
    public static final Parcelable.Creator<AppsStickerAchievementLeaderBoardDto> CREATOR = new a();

    @pmi0("opened_count")
    private final int openedCount;

    @pmi0("place")
    private final int place;

    @pmi0("user")
    private final UsersUserFullDto user;

    /* compiled from: AppsStickerAchievementLeaderBoardDto.kt */
    public static final class a implements Parcelable.Creator<AppsStickerAchievementLeaderBoardDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsStickerAchievementLeaderBoardDto createFromParcel(Parcel parcel) {
            return new AppsStickerAchievementLeaderBoardDto(parcel.readInt(), parcel.readInt(), (UsersUserFullDto) parcel.readParcelable(AppsStickerAchievementLeaderBoardDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsStickerAchievementLeaderBoardDto[] newArray(int i) {
            return new AppsStickerAchievementLeaderBoardDto[i];
        }
    }

    public AppsStickerAchievementLeaderBoardDto(int i, int i2, UsersUserFullDto usersUserFullDto) {
        this.openedCount = i;
        this.place = i2;
        this.user = usersUserFullDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsStickerAchievementLeaderBoardDto)) {
            return false;
        }
        AppsStickerAchievementLeaderBoardDto appsStickerAchievementLeaderBoardDto = (AppsStickerAchievementLeaderBoardDto) obj;
        return this.openedCount == appsStickerAchievementLeaderBoardDto.openedCount && this.place == appsStickerAchievementLeaderBoardDto.place && epx.f(this.user, appsStickerAchievementLeaderBoardDto.user);
    }

    public final int hashCode() {
        return this.user.hashCode() + shy.a(this.place, Integer.hashCode(this.openedCount) * 31, 31);
    }

    public final String toString() {
        return "AppsStickerAchievementLeaderBoardDto(openedCount=" + this.openedCount + ", place=" + this.place + ", user=" + this.user + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.openedCount);
        parcel.writeInt(this.place);
        parcel.writeParcelable(this.user, i);
    }
}
