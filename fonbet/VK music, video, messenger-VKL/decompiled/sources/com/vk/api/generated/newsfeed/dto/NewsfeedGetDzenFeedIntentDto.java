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
/* compiled from: NewsfeedGetDzenFeedIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetDzenFeedIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetDzenFeedIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetDzenFeedIntentDto> CREATOR;

    @pmi0("feed_block")
    public static final NewsfeedGetDzenFeedIntentDto FEED_BLOCK;

    @pmi0("initial")
    public static final NewsfeedGetDzenFeedIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetDzenFeedIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetDzenFeedIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetDzenFeedIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetDzenFeedIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetDzenFeedIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetDzenFeedIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetDzenFeedIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDzenFeedIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetDzenFeedIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDzenFeedIntentDto[] newArray(int i) {
            return new NewsfeedGetDzenFeedIntentDto[i];
        }
    }

    static {
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto = new NewsfeedGetDzenFeedIntentDto("FEED_BLOCK", 0, "feed_block");
        FEED_BLOCK = newsfeedGetDzenFeedIntentDto;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto2 = new NewsfeedGetDzenFeedIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetDzenFeedIntentDto2;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto3 = new NewsfeedGetDzenFeedIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetDzenFeedIntentDto3;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto4 = new NewsfeedGetDzenFeedIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetDzenFeedIntentDto4;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto5 = new NewsfeedGetDzenFeedIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetDzenFeedIntentDto5;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto6 = new NewsfeedGetDzenFeedIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetDzenFeedIntentDto6;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto7 = new NewsfeedGetDzenFeedIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "unknown");
        UNKNOWN = newsfeedGetDzenFeedIntentDto7;
        NewsfeedGetDzenFeedIntentDto[] newsfeedGetDzenFeedIntentDtoArr = {newsfeedGetDzenFeedIntentDto, newsfeedGetDzenFeedIntentDto2, newsfeedGetDzenFeedIntentDto3, newsfeedGetDzenFeedIntentDto4, newsfeedGetDzenFeedIntentDto5, newsfeedGetDzenFeedIntentDto6, newsfeedGetDzenFeedIntentDto7};
        $VALUES = newsfeedGetDzenFeedIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetDzenFeedIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetDzenFeedIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetDzenFeedIntentDto valueOf(String str) {
        return (NewsfeedGetDzenFeedIntentDto) Enum.valueOf(NewsfeedGetDzenFeedIntentDto.class, str);
    }

    public static NewsfeedGetDzenFeedIntentDto[] values() {
        return (NewsfeedGetDzenFeedIntentDto[]) $VALUES.clone();
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
