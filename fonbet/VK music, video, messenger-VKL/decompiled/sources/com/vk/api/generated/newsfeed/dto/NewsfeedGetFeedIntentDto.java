package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.data.DataBufferUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetFeedIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetFeedIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetFeedIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetFeedIntentDto> CREATOR;

    @pmi0("fresh")
    public static final NewsfeedGetFeedIntentDto FRESH;

    @pmi0("initial")
    public static final NewsfeedGetFeedIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetFeedIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetFeedIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetFeedIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetFeedIntentDto RELOAD;
    private final String value;

    /* compiled from: NewsfeedGetFeedIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetFeedIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetFeedIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedIntentDto[] newArray(int i) {
            return new NewsfeedGetFeedIntentDto[i];
        }
    }

    static {
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto = new NewsfeedGetFeedIntentDto("FRESH", 0, "fresh");
        FRESH = newsfeedGetFeedIntentDto;
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto2 = new NewsfeedGetFeedIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetFeedIntentDto2;
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto3 = new NewsfeedGetFeedIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetFeedIntentDto3;
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto4 = new NewsfeedGetFeedIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetFeedIntentDto4;
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto5 = new NewsfeedGetFeedIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetFeedIntentDto5;
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto6 = new NewsfeedGetFeedIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetFeedIntentDto6;
        NewsfeedGetFeedIntentDto[] newsfeedGetFeedIntentDtoArr = {newsfeedGetFeedIntentDto, newsfeedGetFeedIntentDto2, newsfeedGetFeedIntentDto3, newsfeedGetFeedIntentDto4, newsfeedGetFeedIntentDto5, newsfeedGetFeedIntentDto6};
        $VALUES = newsfeedGetFeedIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetFeedIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetFeedIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetFeedIntentDto valueOf(String str) {
        return (NewsfeedGetFeedIntentDto) Enum.valueOf(NewsfeedGetFeedIntentDto.class, str);
    }

    public static NewsfeedGetFeedIntentDto[] values() {
        return (NewsfeedGetFeedIntentDto[]) $VALUES.clone();
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
