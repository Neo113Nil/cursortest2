package com.vk.sdk.api.friends.dto;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecDescriptionContentTypeDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecDescriptionContentTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecDescriptionContentTypeDto[] $VALUES;

    @pmi0("icon")
    public static final FriendsRecDescriptionContentTypeDto ICON;

    @pmi0("images")
    public static final FriendsRecDescriptionContentTypeDto IMAGES;

    @pmi0("text")
    public static final FriendsRecDescriptionContentTypeDto TEXT;
    private final String value;

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
}
