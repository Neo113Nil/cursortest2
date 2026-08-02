package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.data.DataBufferUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetFeedExpIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetFeedExpIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetFeedExpIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetFeedExpIntentDto> CREATOR;

    @pmi0("fresh")
    public static final NewsfeedGetFeedExpIntentDto FRESH;

    @pmi0("initial")
    public static final NewsfeedGetFeedExpIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetFeedExpIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetFeedExpIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetFeedExpIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetFeedExpIntentDto RELOAD;
    private final String value;

    /* compiled from: NewsfeedGetFeedExpIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetFeedExpIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedExpIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetFeedExpIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedExpIntentDto[] newArray(int i) {
            return new NewsfeedGetFeedExpIntentDto[i];
        }
    }

    static {
        NewsfeedGetFeedExpIntentDto newsfeedGetFeedExpIntentDto = new NewsfeedGetFeedExpIntentDto("FRESH", 0, "fresh");
        FRESH = newsfeedGetFeedExpIntentDto;
        NewsfeedGetFeedExpIntentDto newsfeedGetFeedExpIntentDto2 = new NewsfeedGetFeedExpIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetFeedExpIntentDto2;
        NewsfeedGetFeedExpIntentDto newsfeedGetFeedExpIntentDto3 = new NewsfeedGetFeedExpIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetFeedExpIntentDto3;
        NewsfeedGetFeedExpIntentDto newsfeedGetFeedExpIntentDto4 = new NewsfeedGetFeedExpIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetFeedExpIntentDto4;
        NewsfeedGetFeedExpIntentDto newsfeedGetFeedExpIntentDto5 = new NewsfeedGetFeedExpIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetFeedExpIntentDto5;
        NewsfeedGetFeedExpIntentDto newsfeedGetFeedExpIntentDto6 = new NewsfeedGetFeedExpIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetFeedExpIntentDto6;
        NewsfeedGetFeedExpIntentDto[] newsfeedGetFeedExpIntentDtoArr = {newsfeedGetFeedExpIntentDto, newsfeedGetFeedExpIntentDto2, newsfeedGetFeedExpIntentDto3, newsfeedGetFeedExpIntentDto4, newsfeedGetFeedExpIntentDto5, newsfeedGetFeedExpIntentDto6};
        $VALUES = newsfeedGetFeedExpIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetFeedExpIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetFeedExpIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetFeedExpIntentDto valueOf(String str) {
        return (NewsfeedGetFeedExpIntentDto) Enum.valueOf(NewsfeedGetFeedExpIntentDto.class, str);
    }

    public static NewsfeedGetFeedExpIntentDto[] values() {
        return (NewsfeedGetFeedExpIntentDto[]) $VALUES.clone();
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
