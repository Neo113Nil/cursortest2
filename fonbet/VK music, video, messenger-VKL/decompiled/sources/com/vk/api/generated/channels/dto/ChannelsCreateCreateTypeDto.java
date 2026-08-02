package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.BuildConfig;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsCreateCreateTypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCreateCreateTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsCreateCreateTypeDto[] $VALUES;

    @pmi0("brand")
    public static final ChannelsCreateCreateTypeDto BRAND;

    @pmi0("business")
    public static final ChannelsCreateCreateTypeDto BUSINESS;
    public static final Parcelable.Creator<ChannelsCreateCreateTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final ChannelsCreateCreateTypeDto EVENT;

    @pmi0("interests")
    public static final ChannelsCreateCreateTypeDto INTERESTS;

    @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
    public static final ChannelsCreateCreateTypeDto PUBLIC;

    @pmi0("thematic")
    public static final ChannelsCreateCreateTypeDto THEMATIC;
    private final String value;

    /* compiled from: ChannelsCreateCreateTypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCreateCreateTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateCreateTypeDto createFromParcel(Parcel parcel) {
            return ChannelsCreateCreateTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateCreateTypeDto[] newArray(int i) {
            return new ChannelsCreateCreateTypeDto[i];
        }
    }

    static {
        ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto = new ChannelsCreateCreateTypeDto("BRAND", 0, "brand");
        BRAND = channelsCreateCreateTypeDto;
        ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto2 = new ChannelsCreateCreateTypeDto("BUSINESS", 1, "business");
        BUSINESS = channelsCreateCreateTypeDto2;
        ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto3 = new ChannelsCreateCreateTypeDto("EVENT", 2, NotificationCompat.CATEGORY_EVENT);
        EVENT = channelsCreateCreateTypeDto3;
        ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto4 = new ChannelsCreateCreateTypeDto("INTERESTS", 3, "interests");
        INTERESTS = channelsCreateCreateTypeDto4;
        ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto5 = new ChannelsCreateCreateTypeDto(Privacy.PUBLIC, 4, BuildConfig.SDK_BUILD_FLAVOR);
        PUBLIC = channelsCreateCreateTypeDto5;
        ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto6 = new ChannelsCreateCreateTypeDto("THEMATIC", 5, "thematic");
        THEMATIC = channelsCreateCreateTypeDto6;
        ChannelsCreateCreateTypeDto[] channelsCreateCreateTypeDtoArr = {channelsCreateCreateTypeDto, channelsCreateCreateTypeDto2, channelsCreateCreateTypeDto3, channelsCreateCreateTypeDto4, channelsCreateCreateTypeDto5, channelsCreateCreateTypeDto6};
        $VALUES = channelsCreateCreateTypeDtoArr;
        $ENTRIES = new asp(channelsCreateCreateTypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsCreateCreateTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsCreateCreateTypeDto valueOf(String str) {
        return (ChannelsCreateCreateTypeDto) Enum.valueOf(ChannelsCreateCreateTypeDto.class, str);
    }

    public static ChannelsCreateCreateTypeDto[] values() {
        return (ChannelsCreateCreateTypeDto[]) $VALUES.clone();
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
