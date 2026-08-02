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
/* compiled from: NewsfeedGetCustomIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetCustomIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetCustomIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetCustomIntentDto> CREATOR;

    @pmi0("feed_block")
    public static final NewsfeedGetCustomIntentDto FEED_BLOCK;

    @pmi0("initial")
    public static final NewsfeedGetCustomIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetCustomIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetCustomIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetCustomIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetCustomIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetCustomIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetCustomIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetCustomIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetCustomIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetCustomIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetCustomIntentDto[] newArray(int i) {
            return new NewsfeedGetCustomIntentDto[i];
        }
    }

    static {
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto = new NewsfeedGetCustomIntentDto("FEED_BLOCK", 0, "feed_block");
        FEED_BLOCK = newsfeedGetCustomIntentDto;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto2 = new NewsfeedGetCustomIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetCustomIntentDto2;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto3 = new NewsfeedGetCustomIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetCustomIntentDto3;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto4 = new NewsfeedGetCustomIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetCustomIntentDto4;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto5 = new NewsfeedGetCustomIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetCustomIntentDto5;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto6 = new NewsfeedGetCustomIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetCustomIntentDto6;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto7 = new NewsfeedGetCustomIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "unknown");
        UNKNOWN = newsfeedGetCustomIntentDto7;
        NewsfeedGetCustomIntentDto[] newsfeedGetCustomIntentDtoArr = {newsfeedGetCustomIntentDto, newsfeedGetCustomIntentDto2, newsfeedGetCustomIntentDto3, newsfeedGetCustomIntentDto4, newsfeedGetCustomIntentDto5, newsfeedGetCustomIntentDto6, newsfeedGetCustomIntentDto7};
        $VALUES = newsfeedGetCustomIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetCustomIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetCustomIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetCustomIntentDto valueOf(String str) {
        return (NewsfeedGetCustomIntentDto) Enum.valueOf(NewsfeedGetCustomIntentDto.class, str);
    }

    public static NewsfeedGetCustomIntentDto[] values() {
        return (NewsfeedGetCustomIntentDto[]) $VALUES.clone();
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
