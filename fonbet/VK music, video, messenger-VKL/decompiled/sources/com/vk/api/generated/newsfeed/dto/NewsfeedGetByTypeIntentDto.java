package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.data.DataBufferUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetByTypeIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetByTypeIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetByTypeIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetByTypeIntentDto> CREATOR;

    @pmi0("fresh")
    public static final NewsfeedGetByTypeIntentDto FRESH;

    @pmi0("initial")
    public static final NewsfeedGetByTypeIntentDto INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final NewsfeedGetByTypeIntentDto NEXT_PAGE;

    @pmi0("preload")
    public static final NewsfeedGetByTypeIntentDto PRELOAD;

    @pmi0("ptr")
    public static final NewsfeedGetByTypeIntentDto PTR;

    @pmi0("reload")
    public static final NewsfeedGetByTypeIntentDto RELOAD;
    private final String value;

    /* compiled from: NewsfeedGetByTypeIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetByTypeIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetByTypeIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetByTypeIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetByTypeIntentDto[] newArray(int i) {
            return new NewsfeedGetByTypeIntentDto[i];
        }
    }

    static {
        NewsfeedGetByTypeIntentDto newsfeedGetByTypeIntentDto = new NewsfeedGetByTypeIntentDto("FRESH", 0, "fresh");
        FRESH = newsfeedGetByTypeIntentDto;
        NewsfeedGetByTypeIntentDto newsfeedGetByTypeIntentDto2 = new NewsfeedGetByTypeIntentDto("INITIAL", 1, "initial");
        INITIAL = newsfeedGetByTypeIntentDto2;
        NewsfeedGetByTypeIntentDto newsfeedGetByTypeIntentDto3 = new NewsfeedGetByTypeIntentDto("NEXT_PAGE", 2, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = newsfeedGetByTypeIntentDto3;
        NewsfeedGetByTypeIntentDto newsfeedGetByTypeIntentDto4 = new NewsfeedGetByTypeIntentDto("PRELOAD", 3, "preload");
        PRELOAD = newsfeedGetByTypeIntentDto4;
        NewsfeedGetByTypeIntentDto newsfeedGetByTypeIntentDto5 = new NewsfeedGetByTypeIntentDto("PTR", 4, "ptr");
        PTR = newsfeedGetByTypeIntentDto5;
        NewsfeedGetByTypeIntentDto newsfeedGetByTypeIntentDto6 = new NewsfeedGetByTypeIntentDto("RELOAD", 5, "reload");
        RELOAD = newsfeedGetByTypeIntentDto6;
        NewsfeedGetByTypeIntentDto[] newsfeedGetByTypeIntentDtoArr = {newsfeedGetByTypeIntentDto, newsfeedGetByTypeIntentDto2, newsfeedGetByTypeIntentDto3, newsfeedGetByTypeIntentDto4, newsfeedGetByTypeIntentDto5, newsfeedGetByTypeIntentDto6};
        $VALUES = newsfeedGetByTypeIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetByTypeIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetByTypeIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetByTypeIntentDto valueOf(String str) {
        return (NewsfeedGetByTypeIntentDto) Enum.valueOf(NewsfeedGetByTypeIntentDto.class, str);
    }

    public static NewsfeedGetByTypeIntentDto[] values() {
        return (NewsfeedGetByTypeIntentDto[]) $VALUES.clone();
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
