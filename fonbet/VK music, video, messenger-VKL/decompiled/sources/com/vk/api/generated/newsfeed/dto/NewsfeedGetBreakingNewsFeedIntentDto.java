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
/* compiled from: NewsfeedGetBreakingNewsFeedIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBreakingNewsFeedIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetBreakingNewsFeedIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetBreakingNewsFeedIntentDto> CREATOR;

    @pmi0("feed_block")
    public static final NewsfeedGetBreakingNewsFeedIntentDto FEED_BLOCK;

    @pmi0("initial")
    public static final NewsfeedGetBreakingNewsFeedIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetBreakingNewsFeedIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetBreakingNewsFeedIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetBreakingNewsFeedIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetBreakingNewsFeedIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetBreakingNewsFeedIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetBreakingNewsFeedIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBreakingNewsFeedIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsFeedIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetBreakingNewsFeedIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsFeedIntentDto[] newArray(int i) {
            return new NewsfeedGetBreakingNewsFeedIntentDto[i];
        }
    }

    static {
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto = new NewsfeedGetBreakingNewsFeedIntentDto("FEED_BLOCK", 0, "feed_block");
        FEED_BLOCK = newsfeedGetBreakingNewsFeedIntentDto;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto2 = new NewsfeedGetBreakingNewsFeedIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetBreakingNewsFeedIntentDto2;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto3 = new NewsfeedGetBreakingNewsFeedIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetBreakingNewsFeedIntentDto3;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto4 = new NewsfeedGetBreakingNewsFeedIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetBreakingNewsFeedIntentDto4;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto5 = new NewsfeedGetBreakingNewsFeedIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetBreakingNewsFeedIntentDto5;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto6 = new NewsfeedGetBreakingNewsFeedIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetBreakingNewsFeedIntentDto6;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto7 = new NewsfeedGetBreakingNewsFeedIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "unknown");
        UNKNOWN = newsfeedGetBreakingNewsFeedIntentDto7;
        NewsfeedGetBreakingNewsFeedIntentDto[] newsfeedGetBreakingNewsFeedIntentDtoArr = {newsfeedGetBreakingNewsFeedIntentDto, newsfeedGetBreakingNewsFeedIntentDto2, newsfeedGetBreakingNewsFeedIntentDto3, newsfeedGetBreakingNewsFeedIntentDto4, newsfeedGetBreakingNewsFeedIntentDto5, newsfeedGetBreakingNewsFeedIntentDto6, newsfeedGetBreakingNewsFeedIntentDto7};
        $VALUES = newsfeedGetBreakingNewsFeedIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetBreakingNewsFeedIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetBreakingNewsFeedIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetBreakingNewsFeedIntentDto valueOf(String str) {
        return (NewsfeedGetBreakingNewsFeedIntentDto) Enum.valueOf(NewsfeedGetBreakingNewsFeedIntentDto.class, str);
    }

    public static NewsfeedGetBreakingNewsFeedIntentDto[] values() {
        return (NewsfeedGetBreakingNewsFeedIntentDto[]) $VALUES.clone();
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
