package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto> CREATOR;

    @pmi0("friends_playing")
    public static final AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto FRIENDS_PLAYING;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto appsMiniappsCatalogItemPayloadFriendsPlayingTypeDto = new AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto("FRIENDS_PLAYING", 0, "friends_playing");
        FRIENDS_PLAYING = appsMiniappsCatalogItemPayloadFriendsPlayingTypeDto;
        AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto[] appsMiniappsCatalogItemPayloadFriendsPlayingTypeDtoArr = {appsMiniappsCatalogItemPayloadFriendsPlayingTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadFriendsPlayingTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadFriendsPlayingTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadFriendsPlayingTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
