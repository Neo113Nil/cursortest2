package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecDescriptionContentTypeDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecDescriptionContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecDescriptionContentTypeDto[] $VALUES;
    public static final Parcelable.Creator<FriendsRecDescriptionContentTypeDto> CREATOR;

    @pmi0("icon")
    public static final FriendsRecDescriptionContentTypeDto ICON;

    @pmi0("images")
    public static final FriendsRecDescriptionContentTypeDto IMAGES;

    @pmi0("text")
    public static final FriendsRecDescriptionContentTypeDto TEXT;
    private final String value;

    /* compiled from: FriendsRecDescriptionContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecDescriptionContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecDescriptionContentTypeDto createFromParcel(Parcel parcel) {
            return FriendsRecDescriptionContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecDescriptionContentTypeDto[] newArray(int i) {
            return new FriendsRecDescriptionContentTypeDto[i];
        }
    }

    static {
        FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto = new FriendsRecDescriptionContentTypeDto("IMAGES", 0, "images");
        IMAGES = friendsRecDescriptionContentTypeDto;
        FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto2 = new FriendsRecDescriptionContentTypeDto("TEXT", 1, "text");
        TEXT = friendsRecDescriptionContentTypeDto2;
        FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto3 = new FriendsRecDescriptionContentTypeDto(NativeAdContent.ViewTag.AD_ICON, 2, "icon");
        ICON = friendsRecDescriptionContentTypeDto3;
        FriendsRecDescriptionContentTypeDto[] friendsRecDescriptionContentTypeDtoArr = {friendsRecDescriptionContentTypeDto, friendsRecDescriptionContentTypeDto2, friendsRecDescriptionContentTypeDto3};
        $VALUES = friendsRecDescriptionContentTypeDtoArr;
        $ENTRIES = new asp(friendsRecDescriptionContentTypeDtoArr);
        CREATOR = new a();
    }

    private FriendsRecDescriptionContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecDescriptionContentTypeDto valueOf(String str) {
        return (FriendsRecDescriptionContentTypeDto) Enum.valueOf(FriendsRecDescriptionContentTypeDto.class, str);
    }

    public static FriendsRecDescriptionContentTypeDto[] values() {
        return (FriendsRecDescriptionContentTypeDto[]) $VALUES.clone();
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
