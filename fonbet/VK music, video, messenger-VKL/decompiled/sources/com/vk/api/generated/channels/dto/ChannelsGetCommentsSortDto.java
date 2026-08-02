package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetCommentsSortDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetCommentsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetCommentsSortDto[] $VALUES;

    @pmi0("asc")
    public static final ChannelsGetCommentsSortDto ASC;
    public static final Parcelable.Creator<ChannelsGetCommentsSortDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final ChannelsGetCommentsSortDto DESC;
    private final String value;

    /* compiled from: ChannelsGetCommentsSortDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetCommentsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentsSortDto createFromParcel(Parcel parcel) {
            return ChannelsGetCommentsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentsSortDto[] newArray(int i) {
            return new ChannelsGetCommentsSortDto[i];
        }
    }

    static {
        ChannelsGetCommentsSortDto channelsGetCommentsSortDto = new ChannelsGetCommentsSortDto("ASC", 0, "asc");
        ASC = channelsGetCommentsSortDto;
        ChannelsGetCommentsSortDto channelsGetCommentsSortDto2 = new ChannelsGetCommentsSortDto("DESC", 1, CampaignEx.JSON_KEY_DESC);
        DESC = channelsGetCommentsSortDto2;
        ChannelsGetCommentsSortDto[] channelsGetCommentsSortDtoArr = {channelsGetCommentsSortDto, channelsGetCommentsSortDto2};
        $VALUES = channelsGetCommentsSortDtoArr;
        $ENTRIES = new asp(channelsGetCommentsSortDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetCommentsSortDto valueOf(String str) {
        return (ChannelsGetCommentsSortDto) Enum.valueOf(ChannelsGetCommentsSortDto.class, str);
    }

    public static ChannelsGetCommentsSortDto[] values() {
        return (ChannelsGetCommentsSortDto[]) $VALUES.clone();
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
