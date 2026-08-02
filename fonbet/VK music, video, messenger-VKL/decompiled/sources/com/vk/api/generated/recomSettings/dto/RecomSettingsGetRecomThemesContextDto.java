package com.vk.api.generated.recomSettings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecomSettingsGetRecomThemesContextDto.kt */
/* loaded from: classes15.dex */
public final class RecomSettingsGetRecomThemesContextDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecomSettingsGetRecomThemesContextDto[] $VALUES;
    public static final Parcelable.Creator<RecomSettingsGetRecomThemesContextDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final RecomSettingsGetRecomThemesContextDto DEFAULT;

    @pmi0("short_video")
    public static final RecomSettingsGetRecomThemesContextDto SHORT_VIDEO;
    private final String value;

    /* compiled from: RecomSettingsGetRecomThemesContextDto.kt */
    public static final class a implements Parcelable.Creator<RecomSettingsGetRecomThemesContextDto> {
        @Override // android.os.Parcelable.Creator
        public final RecomSettingsGetRecomThemesContextDto createFromParcel(Parcel parcel) {
            return RecomSettingsGetRecomThemesContextDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecomSettingsGetRecomThemesContextDto[] newArray(int i) {
            return new RecomSettingsGetRecomThemesContextDto[i];
        }
    }

    static {
        RecomSettingsGetRecomThemesContextDto recomSettingsGetRecomThemesContextDto = new RecomSettingsGetRecomThemesContextDto("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = recomSettingsGetRecomThemesContextDto;
        RecomSettingsGetRecomThemesContextDto recomSettingsGetRecomThemesContextDto2 = new RecomSettingsGetRecomThemesContextDto("SHORT_VIDEO", 1, "short_video");
        SHORT_VIDEO = recomSettingsGetRecomThemesContextDto2;
        RecomSettingsGetRecomThemesContextDto[] recomSettingsGetRecomThemesContextDtoArr = {recomSettingsGetRecomThemesContextDto, recomSettingsGetRecomThemesContextDto2};
        $VALUES = recomSettingsGetRecomThemesContextDtoArr;
        $ENTRIES = new asp(recomSettingsGetRecomThemesContextDtoArr);
        CREATOR = new a();
    }

    private RecomSettingsGetRecomThemesContextDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static RecomSettingsGetRecomThemesContextDto valueOf(String str) {
        return (RecomSettingsGetRecomThemesContextDto) Enum.valueOf(RecomSettingsGetRecomThemesContextDto.class, str);
    }

    public static RecomSettingsGetRecomThemesContextDto[] values() {
        return (RecomSettingsGetRecomThemesContextDto[]) $VALUES.clone();
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
