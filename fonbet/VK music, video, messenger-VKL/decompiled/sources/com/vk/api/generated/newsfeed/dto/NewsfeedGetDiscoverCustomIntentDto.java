package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetDiscoverCustomIntentDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetDiscoverCustomIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetDiscoverCustomIntentDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetDiscoverCustomIntentDto> CREATOR;

    @pmi0("initial")
    public static final NewsfeedGetDiscoverCustomIntentDto INITIAL;

    @pmi0("preload")
    public static final NewsfeedGetDiscoverCustomIntentDto PRELOAD;

    @pmi0("reload")
    public static final NewsfeedGetDiscoverCustomIntentDto RELOAD;

    @pmi0("unknown")
    public static final NewsfeedGetDiscoverCustomIntentDto UNKNOWN;
    private final String value;

    /* compiled from: NewsfeedGetDiscoverCustomIntentDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetDiscoverCustomIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDiscoverCustomIntentDto createFromParcel(Parcel parcel) {
            return NewsfeedGetDiscoverCustomIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDiscoverCustomIntentDto[] newArray(int i) {
            return new NewsfeedGetDiscoverCustomIntentDto[i];
        }
    }

    static {
        NewsfeedGetDiscoverCustomIntentDto newsfeedGetDiscoverCustomIntentDto = new NewsfeedGetDiscoverCustomIntentDto("INITIAL", 0, "initial");
        INITIAL = newsfeedGetDiscoverCustomIntentDto;
        NewsfeedGetDiscoverCustomIntentDto newsfeedGetDiscoverCustomIntentDto2 = new NewsfeedGetDiscoverCustomIntentDto("PRELOAD", 1, "preload");
        PRELOAD = newsfeedGetDiscoverCustomIntentDto2;
        NewsfeedGetDiscoverCustomIntentDto newsfeedGetDiscoverCustomIntentDto3 = new NewsfeedGetDiscoverCustomIntentDto("RELOAD", 2, "reload");
        RELOAD = newsfeedGetDiscoverCustomIntentDto3;
        NewsfeedGetDiscoverCustomIntentDto newsfeedGetDiscoverCustomIntentDto4 = new NewsfeedGetDiscoverCustomIntentDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetDiscoverCustomIntentDto4;
        NewsfeedGetDiscoverCustomIntentDto[] newsfeedGetDiscoverCustomIntentDtoArr = {newsfeedGetDiscoverCustomIntentDto, newsfeedGetDiscoverCustomIntentDto2, newsfeedGetDiscoverCustomIntentDto3, newsfeedGetDiscoverCustomIntentDto4};
        $VALUES = newsfeedGetDiscoverCustomIntentDtoArr;
        $ENTRIES = new asp(newsfeedGetDiscoverCustomIntentDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetDiscoverCustomIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetDiscoverCustomIntentDto valueOf(String str) {
        return (NewsfeedGetDiscoverCustomIntentDto) Enum.valueOf(NewsfeedGetDiscoverCustomIntentDto.class, str);
    }

    public static NewsfeedGetDiscoverCustomIntentDto[] values() {
        return (NewsfeedGetDiscoverCustomIntentDto[]) $VALUES.clone();
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
