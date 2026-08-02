package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecBlockInfoCardTemplateDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockInfoCardTemplateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecBlockInfoCardTemplateDto[] $VALUES;
    public static final Parcelable.Creator<FriendsRecBlockInfoCardTemplateDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final FriendsRecBlockInfoCardTemplateDto DEFAULT;

    @pmi0("import")
    public static final FriendsRecBlockInfoCardTemplateDto IMPORT;

    @pmi0("import_photos")
    public static final FriendsRecBlockInfoCardTemplateDto IMPORT_PHOTOS;
    private final String value;

    /* compiled from: FriendsRecBlockInfoCardTemplateDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockInfoCardTemplateDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockInfoCardTemplateDto createFromParcel(Parcel parcel) {
            return FriendsRecBlockInfoCardTemplateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockInfoCardTemplateDto[] newArray(int i) {
            return new FriendsRecBlockInfoCardTemplateDto[i];
        }
    }

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
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
