package com.vk.sdk.api.friends.dto;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecBlockInfoCardTemplateDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockInfoCardTemplateDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecBlockInfoCardTemplateDto[] $VALUES;

    @pmi0(BuildConfig.FLAVOR)
    public static final FriendsRecBlockInfoCardTemplateDto DEFAULT;

    @pmi0("import")
    public static final FriendsRecBlockInfoCardTemplateDto IMPORT;

    @pmi0("import_photos")
    public static final FriendsRecBlockInfoCardTemplateDto IMPORT_PHOTOS;
    private final String value;

    static {
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto = new FriendsRecBlockInfoCardTemplateDto("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = friendsRecBlockInfoCardTemplateDto;
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto2 = new FriendsRecBlockInfoCardTemplateDto("IMPORT", 1, "import");
        IMPORT = friendsRecBlockInfoCardTemplateDto2;
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto3 = new FriendsRecBlockInfoCardTemplateDto("IMPORT_PHOTOS", 2, "import_photos");
        IMPORT_PHOTOS = friendsRecBlockInfoCardTemplateDto3;
        FriendsRecBlockInfoCardTemplateDto[] friendsRecBlockInfoCardTemplateDtoArr = {friendsRecBlockInfoCardTemplateDto, friendsRecBlockInfoCardTemplateDto2, friendsRecBlockInfoCardTemplateDto3};
        $VALUES = friendsRecBlockInfoCardTemplateDtoArr;
        $ENTRIES = new asp(friendsRecBlockInfoCardTemplateDtoArr);
    }

    private FriendsRecBlockInfoCardTemplateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecBlockInfoCardTemplateDto valueOf(String str) {
        return (FriendsRecBlockInfoCardTemplateDto) Enum.valueOf(FriendsRecBlockInfoCardTemplateDto.class, str);
    }

    public static FriendsRecBlockInfoCardTemplateDto[] values() {
        return (FriendsRecBlockInfoCardTemplateDto[]) $VALUES.clone();
    }
}
