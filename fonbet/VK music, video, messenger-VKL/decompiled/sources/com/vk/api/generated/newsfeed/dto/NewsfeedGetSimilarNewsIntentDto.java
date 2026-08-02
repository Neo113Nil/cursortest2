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
/* compiled from: NewsfeedGetSimilarNewsIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetSimilarNewsIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetSimilarNewsIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetSimilarNewsIntentDto> CREATOR;

    @pmi0("feed_block")
    public static final NewsfeedGetSimilarNewsIntentDto FEED_BLOCK;

    @pmi0("initial")
    public static final NewsfeedGetSimilarNewsIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetSimilarNewsIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetSimilarNewsIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetSimilarNewsIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetSimilarNewsIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetSimilarNewsIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetSimilarNewsIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetSimilarNewsIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetSimilarNewsIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetSimilarNewsIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetSimilarNewsIntentDto[] newArray(int i) {
            return new NewsfeedGetSimilarNewsIntentDto[i];
        }
    }

    static {
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto = new NewsfeedGetSimilarNewsIntentDto("FEED_BLOCK", 0, "feed_block");
        FEED_BLOCK = newsfeedGetSimilarNewsIntentDto;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto2 = new NewsfeedGetSimilarNewsIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetSimilarNewsIntentDto2;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto3 = new NewsfeedGetSimilarNewsIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetSimilarNewsIntentDto3;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto4 = new NewsfeedGetSimilarNewsIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetSimilarNewsIntentDto4;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto5 = new NewsfeedGetSimilarNewsIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetSimilarNewsIntentDto5;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto6 = new NewsfeedGetSimilarNewsIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetSimilarNewsIntentDto6;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto7 = new NewsfeedGetSimilarNewsIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "unknown");
        UNKNOWN = newsfeedGetSimilarNewsIntentDto7;
        NewsfeedGetSimilarNewsIntentDto[] newsfeedGetSimilarNewsIntentDtoArr = {newsfeedGetSimilarNewsIntentDto, newsfeedGetSimilarNewsIntentDto2, newsfeedGetSimilarNewsIntentDto3, newsfeedGetSimilarNewsIntentDto4, newsfeedGetSimilarNewsIntentDto5, newsfeedGetSimilarNewsIntentDto6, newsfeedGetSimilarNewsIntentDto7};
        $VALUES = newsfeedGetSimilarNewsIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetSimilarNewsIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetSimilarNewsIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetSimilarNewsIntentDto valueOf(String str) {
        return (NewsfeedGetSimilarNewsIntentDto) Enum.valueOf(NewsfeedGetSimilarNewsIntentDto.class, str);
    }

    public static NewsfeedGetSimilarNewsIntentDto[] values() {
        return (NewsfeedGetSimilarNewsIntentDto[]) $VALUES.clone();
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
