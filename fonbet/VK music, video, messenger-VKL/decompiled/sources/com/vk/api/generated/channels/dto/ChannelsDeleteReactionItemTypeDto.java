package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsDeleteReactionItemTypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsDeleteReactionItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsDeleteReactionItemTypeDto[] $VALUES;

    @pmi0("comment")
    public static final ChannelsDeleteReactionItemTypeDto COMMENT;
    public static final Parcelable.Creator<ChannelsDeleteReactionItemTypeDto> CREATOR;

    @pmi0("message")
    public static final ChannelsDeleteReactionItemTypeDto MESSAGE;
    private final String value;

    /* compiled from: ChannelsDeleteReactionItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsDeleteReactionItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsDeleteReactionItemTypeDto createFromParcel(Parcel parcel) {
            return ChannelsDeleteReactionItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsDeleteReactionItemTypeDto[] newArray(int i) {
            return new ChannelsDeleteReactionItemTypeDto[i];
        }
    }

    static {
        ChannelsDeleteReactionItemTypeDto channelsDeleteReactionItemTypeDto = new ChannelsDeleteReactionItemTypeDto("COMMENT", 0, "comment");
        COMMENT = channelsDeleteReactionItemTypeDto;
        ChannelsDeleteReactionItemTypeDto channelsDeleteReactionItemTypeDto2 = new ChannelsDeleteReactionItemTypeDto("MESSAGE", 1, "message");
        MESSAGE = channelsDeleteReactionItemTypeDto2;
        ChannelsDeleteReactionItemTypeDto[] channelsDeleteReactionItemTypeDtoArr = {channelsDeleteReactionItemTypeDto, channelsDeleteReactionItemTypeDto2};
        $VALUES = channelsDeleteReactionItemTypeDtoArr;
        $ENTRIES = new asp(channelsDeleteReactionItemTypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsDeleteReactionItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsDeleteReactionItemTypeDto valueOf(String str) {
        return (ChannelsDeleteReactionItemTypeDto) Enum.valueOf(ChannelsDeleteReactionItemTypeDto.class, str);
    }

    public static ChannelsDeleteReactionItemTypeDto[] values() {
        return (ChannelsDeleteReactionItemTypeDto[]) $VALUES.clone();
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
