package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAppTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAppTypeDto[] $VALUES;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final AppsAppTypeDto APP;

    @pmi0("community_app")
    public static final AppsAppTypeDto COMMUNITY_APP;
    public static final Parcelable.Creator<AppsAppTypeDto> CREATOR;

    @pmi0("game")
    public static final AppsAppTypeDto GAME;

    @pmi0("html5_game")
    public static final AppsAppTypeDto HTML5_GAME;

    @pmi0("mini_app")
    public static final AppsAppTypeDto MINI_APP;

    @pmi0("site")
    public static final AppsAppTypeDto SITE;

    @pmi0("standalone")
    public static final AppsAppTypeDto STANDALONE;

    @pmi0("vk_app")
    public static final AppsAppTypeDto VK_APP;
    private final String value;

    /* compiled from: AppsAppTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppTypeDto createFromParcel(Parcel parcel) {
            return AppsAppTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppTypeDto[] newArray(int i) {
            return new AppsAppTypeDto[i];
        }
    }

    static {
        AppsAppTypeDto appsAppTypeDto = new AppsAppTypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = appsAppTypeDto;
        AppsAppTypeDto appsAppTypeDto2 = new AppsAppTypeDto("GAME", 1, "game");
        GAME = appsAppTypeDto2;
        AppsAppTypeDto appsAppTypeDto3 = new AppsAppTypeDto("SITE", 2, "site");
        SITE = appsAppTypeDto3;
        AppsAppTypeDto appsAppTypeDto4 = new AppsAppTypeDto("STANDALONE", 3, "standalone");
        STANDALONE = appsAppTypeDto4;
        AppsAppTypeDto appsAppTypeDto5 = new AppsAppTypeDto("VK_APP", 4, "vk_app");
        VK_APP = appsAppTypeDto5;
        AppsAppTypeDto appsAppTypeDto6 = new AppsAppTypeDto("COMMUNITY_APP", 5, "community_app");
        COMMUNITY_APP = appsAppTypeDto6;
        AppsAppTypeDto appsAppTypeDto7 = new AppsAppTypeDto("HTML5_GAME", 6, "html5_game");
        HTML5_GAME = appsAppTypeDto7;
        AppsAppTypeDto appsAppTypeDto8 = new AppsAppTypeDto("MINI_APP", 7, "mini_app");
        MINI_APP = appsAppTypeDto8;
        AppsAppTypeDto[] appsAppTypeDtoArr = {appsAppTypeDto, appsAppTypeDto2, appsAppTypeDto3, appsAppTypeDto4, appsAppTypeDto5, appsAppTypeDto6, appsAppTypeDto7, appsAppTypeDto8};
        $VALUES = appsAppTypeDtoArr;
        $ENTRIES = new asp(appsAppTypeDtoArr);
        CREATOR = new a();
    }

    private AppsAppTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAppTypeDto valueOf(String str) {
        return (AppsAppTypeDto) Enum.valueOf(AppsAppTypeDto.class, str);
    }

    public static AppsAppTypeDto[] values() {
        return (AppsAppTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
