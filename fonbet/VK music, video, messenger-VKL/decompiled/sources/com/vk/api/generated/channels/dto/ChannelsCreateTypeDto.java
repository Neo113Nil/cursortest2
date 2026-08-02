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
/* compiled from: ChannelsCreateTypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCreateTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsCreateTypeDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsCreateTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final ChannelsCreateTypeDto EVENT;

    @pmi0("group")
    public static final ChannelsCreateTypeDto GROUP;

    @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
    public static final ChannelsCreateTypeDto PUBLIC;
    private final String value;

    /* compiled from: ChannelsCreateTypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCreateTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateTypeDto createFromParcel(Parcel parcel) {
            return ChannelsCreateTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateTypeDto[] newArray(int i) {
            return new ChannelsCreateTypeDto[i];
        }
    }

    static {
        ChannelsCreateTypeDto channelsCreateTypeDto = new ChannelsCreateTypeDto("EVENT", 0, NotificationCompat.CATEGORY_EVENT);
        EVENT = channelsCreateTypeDto;
        ChannelsCreateTypeDto channelsCreateTypeDto2 = new ChannelsCreateTypeDto("GROUP", 1, "group");
        GROUP = channelsCreateTypeDto2;
        ChannelsCreateTypeDto channelsCreateTypeDto3 = new ChannelsCreateTypeDto(Privacy.PUBLIC, 2, BuildConfig.SDK_BUILD_FLAVOR);
        PUBLIC = channelsCreateTypeDto3;
        ChannelsCreateTypeDto[] channelsCreateTypeDtoArr = {channelsCreateTypeDto, channelsCreateTypeDto2, channelsCreateTypeDto3};
        $VALUES = channelsCreateTypeDtoArr;
        $ENTRIES = new asp(channelsCreateTypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsCreateTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsCreateTypeDto valueOf(String str) {
        return (ChannelsCreateTypeDto) Enum.valueOf(ChannelsCreateTypeDto.class, str);
    }

    public static ChannelsCreateTypeDto[] values() {
        return (ChannelsCreateTypeDto[]) $VALUES.clone();
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
