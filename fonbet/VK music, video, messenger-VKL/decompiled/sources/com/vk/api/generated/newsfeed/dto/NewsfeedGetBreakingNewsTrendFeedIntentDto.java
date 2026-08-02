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
/* compiled from: NewsfeedGetBreakingNewsTrendFeedIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBreakingNewsTrendFeedIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetBreakingNewsTrendFeedIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetBreakingNewsTrendFeedIntentDto> CREATOR;

    @pmi0("feed_block")
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto FEED_BLOCK;

    @pmi0("initial")
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetBreakingNewsTrendFeedIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetBreakingNewsTrendFeedIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBreakingNewsTrendFeedIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsTrendFeedIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetBreakingNewsTrendFeedIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsTrendFeedIntentDto[] newArray(int i) {
            return new NewsfeedGetBreakingNewsTrendFeedIntentDto[i];
        }
    }

    static {
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto = new NewsfeedGetBreakingNewsTrendFeedIntentDto("FEED_BLOCK", 0, "feed_block");
        FEED_BLOCK = newsfeedGetBreakingNewsTrendFeedIntentDto;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto2 = new NewsfeedGetBreakingNewsTrendFeedIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetBreakingNewsTrendFeedIntentDto2;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto3 = new NewsfeedGetBreakingNewsTrendFeedIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetBreakingNewsTrendFeedIntentDto3;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto4 = new NewsfeedGetBreakingNewsTrendFeedIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetBreakingNewsTrendFeedIntentDto4;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto5 = new NewsfeedGetBreakingNewsTrendFeedIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetBreakingNewsTrendFeedIntentDto5;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto6 = new NewsfeedGetBreakingNewsTrendFeedIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetBreakingNewsTrendFeedIntentDto6;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto7 = new NewsfeedGetBreakingNewsTrendFeedIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "unknown");
        UNKNOWN = newsfeedGetBreakingNewsTrendFeedIntentDto7;
        NewsfeedGetBreakingNewsTrendFeedIntentDto[] newsfeedGetBreakingNewsTrendFeedIntentDtoArr = {newsfeedGetBreakingNewsTrendFeedIntentDto, newsfeedGetBreakingNewsTrendFeedIntentDto2, newsfeedGetBreakingNewsTrendFeedIntentDto3, newsfeedGetBreakingNewsTrendFeedIntentDto4, newsfeedGetBreakingNewsTrendFeedIntentDto5, newsfeedGetBreakingNewsTrendFeedIntentDto6, newsfeedGetBreakingNewsTrendFeedIntentDto7};
        $VALUES = newsfeedGetBreakingNewsTrendFeedIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetBreakingNewsTrendFeedIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetBreakingNewsTrendFeedIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetBreakingNewsTrendFeedIntentDto valueOf(String str) {
        return (NewsfeedGetBreakingNewsTrendFeedIntentDto) Enum.valueOf(NewsfeedGetBreakingNewsTrendFeedIntentDto.class, str);
    }

    public static NewsfeedGetBreakingNewsTrendFeedIntentDto[] values() {
        return (NewsfeedGetBreakingNewsTrendFeedIntentDto[]) $VALUES.clone();
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
