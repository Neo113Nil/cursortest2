package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallPostSourceTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallPostSourceTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallPostSourceTypeDto[] $VALUES;

    @pmi0("api")
    public static final WallPostSourceTypeDto API;
    public static final Parcelable.Creator<WallPostSourceTypeDto> CREATOR;

    @pmi0("mvk")
    public static final WallPostSourceTypeDto MVK;

    @pmi0("rss")
    public static final WallPostSourceTypeDto RSS;

    @pmi0("sms")
    public static final WallPostSourceTypeDto SMS;

    @pmi0("vk")
    public static final WallPostSourceTypeDto VK;

    @pmi0("widget")
    public static final WallPostSourceTypeDto WIDGET;
    private final String value;

    /* compiled from: WallPostSourceTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallPostSourceTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostSourceTypeDto createFromParcel(Parcel parcel) {
            return WallPostSourceTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostSourceTypeDto[] newArray(int i) {
            return new WallPostSourceTypeDto[i];
        }
    }

    static {
        WallPostSourceTypeDto wallPostSourceTypeDto = new WallPostSourceTypeDto("VK", 0, "vk");
        VK = wallPostSourceTypeDto;
        WallPostSourceTypeDto wallPostSourceTypeDto2 = new WallPostSourceTypeDto("WIDGET", 1, "widget");
        WIDGET = wallPostSourceTypeDto2;
        WallPostSourceTypeDto wallPostSourceTypeDto3 = new WallPostSourceTypeDto("API", 2, "api");
        API = wallPostSourceTypeDto3;
        WallPostSourceTypeDto wallPostSourceTypeDto4 = new WallPostSourceTypeDto("RSS", 3, "rss");
        RSS = wallPostSourceTypeDto4;
        WallPostSourceTypeDto wallPostSourceTypeDto5 = new WallPostSourceTypeDto("SMS", 4, "sms");
        SMS = wallPostSourceTypeDto5;
        WallPostSourceTypeDto wallPostSourceTypeDto6 = new WallPostSourceTypeDto("MVK", 5, "mvk");
        MVK = wallPostSourceTypeDto6;
        WallPostSourceTypeDto[] wallPostSourceTypeDtoArr = {wallPostSourceTypeDto, wallPostSourceTypeDto2, wallPostSourceTypeDto3, wallPostSourceTypeDto4, wallPostSourceTypeDto5, wallPostSourceTypeDto6};
        $VALUES = wallPostSourceTypeDtoArr;
        $ENTRIES = new asp(wallPostSourceTypeDtoArr);
        CREATOR = new a();
    }

    private WallPostSourceTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallPostSourceTypeDto valueOf(String str) {
        return (WallPostSourceTypeDto) Enum.valueOf(WallPostSourceTypeDto.class, str);
    }

    public static WallPostSourceTypeDto[] values() {
        return (WallPostSourceTypeDto[]) $VALUES.clone();
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
