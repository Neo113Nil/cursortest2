package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallActionButtonTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallActionButtonTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallActionButtonTypeDto[] $VALUES;

    @pmi0("buy_ticket")
    public static final WallActionButtonTypeDto BUY_TICKET;
    public static final Parcelable.Creator<WallActionButtonTypeDto> CREATOR;

    @pmi0("donut_goal")
    public static final WallActionButtonTypeDto DONUT_GOAL;

    @pmi0("donut_level")
    public static final WallActionButtonTypeDto DONUT_LEVEL;

    @pmi0("donut_levels")
    public static final WallActionButtonTypeDto DONUT_LEVELS;

    @pmi0("donut_support")
    public static final WallActionButtonTypeDto DONUT_SUPPORT;

    @pmi0("message_to_channel")
    public static final WallActionButtonTypeDto MESSAGE_TO_CHANNEL;

    @pmi0("message_to_community")
    public static final WallActionButtonTypeDto MESSAGE_TO_COMMUNITY;

    @pmi0("online_booking")
    public static final WallActionButtonTypeDto ONLINE_BOOKING;

    @pmi0("open_market")
    public static final WallActionButtonTypeDto OPEN_MARKET;

    @pmi0("vk_ticket")
    public static final WallActionButtonTypeDto VK_TICKET;
    private final String value;

    /* compiled from: WallActionButtonTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallActionButtonTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallActionButtonTypeDto createFromParcel(Parcel parcel) {
            return WallActionButtonTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallActionButtonTypeDto[] newArray(int i) {
            return new WallActionButtonTypeDto[i];
        }
    }

    static {
        WallActionButtonTypeDto wallActionButtonTypeDto = new WallActionButtonTypeDto("OPEN_MARKET", 0, "open_market");
        OPEN_MARKET = wallActionButtonTypeDto;
        WallActionButtonTypeDto wallActionButtonTypeDto2 = new WallActionButtonTypeDto("BUY_TICKET", 1, "buy_ticket");
        BUY_TICKET = wallActionButtonTypeDto2;
        WallActionButtonTypeDto wallActionButtonTypeDto3 = new WallActionButtonTypeDto("VK_TICKET", 2, "vk_ticket");
        VK_TICKET = wallActionButtonTypeDto3;
        WallActionButtonTypeDto wallActionButtonTypeDto4 = new WallActionButtonTypeDto("MESSAGE_TO_COMMUNITY", 3, "message_to_community");
        MESSAGE_TO_COMMUNITY = wallActionButtonTypeDto4;
        WallActionButtonTypeDto wallActionButtonTypeDto5 = new WallActionButtonTypeDto("ONLINE_BOOKING", 4, "online_booking");
        ONLINE_BOOKING = wallActionButtonTypeDto5;
        WallActionButtonTypeDto wallActionButtonTypeDto6 = new WallActionButtonTypeDto("DONUT_LEVELS", 5, "donut_levels");
        DONUT_LEVELS = wallActionButtonTypeDto6;
        WallActionButtonTypeDto wallActionButtonTypeDto7 = new WallActionButtonTypeDto("DONUT_LEVEL", 6, "donut_level");
        DONUT_LEVEL = wallActionButtonTypeDto7;
        WallActionButtonTypeDto wallActionButtonTypeDto8 = new WallActionButtonTypeDto("DONUT_GOAL", 7, "donut_goal");
        DONUT_GOAL = wallActionButtonTypeDto8;
        WallActionButtonTypeDto wallActionButtonTypeDto9 = new WallActionButtonTypeDto("DONUT_SUPPORT", 8, "donut_support");
        DONUT_SUPPORT = wallActionButtonTypeDto9;
        WallActionButtonTypeDto wallActionButtonTypeDto10 = new WallActionButtonTypeDto("MESSAGE_TO_CHANNEL", 9, "message_to_channel");
        MESSAGE_TO_CHANNEL = wallActionButtonTypeDto10;
        WallActionButtonTypeDto[] wallActionButtonTypeDtoArr = {wallActionButtonTypeDto, wallActionButtonTypeDto2, wallActionButtonTypeDto3, wallActionButtonTypeDto4, wallActionButtonTypeDto5, wallActionButtonTypeDto6, wallActionButtonTypeDto7, wallActionButtonTypeDto8, wallActionButtonTypeDto9, wallActionButtonTypeDto10};
        $VALUES = wallActionButtonTypeDtoArr;
        $ENTRIES = new asp(wallActionButtonTypeDtoArr);
        CREATOR = new a();
    }

    private WallActionButtonTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<WallActionButtonTypeDto> i() {
        return $ENTRIES;
    }

    public static WallActionButtonTypeDto valueOf(String str) {
        return (WallActionButtonTypeDto) Enum.valueOf(WallActionButtonTypeDto.class, str);
    }

    public static WallActionButtonTypeDto[] values() {
        return (WallActionButtonTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
