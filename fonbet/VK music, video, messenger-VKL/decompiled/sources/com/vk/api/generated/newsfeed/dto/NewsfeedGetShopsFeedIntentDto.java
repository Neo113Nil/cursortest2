package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.data.DataBufferUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetShopsFeedIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetShopsFeedIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetShopsFeedIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetShopsFeedIntentDto> CREATOR;

    @pmi0("feed_block")
    public static final NewsfeedGetShopsFeedIntentDto FEED_BLOCK;

    @pmi0("initial")
    public static final NewsfeedGetShopsFeedIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetShopsFeedIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetShopsFeedIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetShopsFeedIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetShopsFeedIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetShopsFeedIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetShopsFeedIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetShopsFeedIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetShopsFeedIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetShopsFeedIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetShopsFeedIntentDto[] newArray(int i) {
            return new NewsfeedGetShopsFeedIntentDto[i];
        }
    }

    static {
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto = new NewsfeedGetShopsFeedIntentDto("FEED_BLOCK", 0, "feed_block");
        FEED_BLOCK = newsfeedGetShopsFeedIntentDto;
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto2 = new NewsfeedGetShopsFeedIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetShopsFeedIntentDto2;
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto3 = new NewsfeedGetShopsFeedIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetShopsFeedIntentDto3;
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto4 = new NewsfeedGetShopsFeedIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetShopsFeedIntentDto4;
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto5 = new NewsfeedGetShopsFeedIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetShopsFeedIntentDto5;
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto6 = new NewsfeedGetShopsFeedIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetShopsFeedIntentDto6;
        NewsfeedGetShopsFeedIntentDto newsfeedGetShopsFeedIntentDto7 = new NewsfeedGetShopsFeedIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "unknown");
        UNKNOWN = newsfeedGetShopsFeedIntentDto7;
        NewsfeedGetShopsFeedIntentDto[] newsfeedGetShopsFeedIntentDtoArr = {newsfeedGetShopsFeedIntentDto, newsfeedGetShopsFeedIntentDto2, newsfeedGetShopsFeedIntentDto3, newsfeedGetShopsFeedIntentDto4, newsfeedGetShopsFeedIntentDto5, newsfeedGetShopsFeedIntentDto6, newsfeedGetShopsFeedIntentDto7};
        $VALUES = newsfeedGetShopsFeedIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetShopsFeedIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetShopsFeedIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetShopsFeedIntentDto valueOf(String str) {
        return (NewsfeedGetShopsFeedIntentDto) Enum.valueOf(NewsfeedGetShopsFeedIntentDto.class, str);
    }

    public static NewsfeedGetShopsFeedIntentDto[] values() {
        return (NewsfeedGetShopsFeedIntentDto[]) $VALUES.clone();
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
