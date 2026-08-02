package com.vk.api.generated.appWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.B5;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppWidgetsGetWidgetPreviewTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppWidgetsGetWidgetPreviewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppWidgetsGetWidgetPreviewTypeDto[] $VALUES;

    @pmi0("compact_list")
    public static final AppWidgetsGetWidgetPreviewTypeDto COMPACT_LIST;

    @pmi0("cover_list")
    public static final AppWidgetsGetWidgetPreviewTypeDto COVER_LIST;
    public static final Parcelable.Creator<AppWidgetsGetWidgetPreviewTypeDto> CREATOR;

    @pmi0("donation")
    public static final AppWidgetsGetWidgetPreviewTypeDto DONATION;

    @pmi0("list")
    public static final AppWidgetsGetWidgetPreviewTypeDto LIST;

    @pmi0("match")
    public static final AppWidgetsGetWidgetPreviewTypeDto MATCH;

    @pmi0("matches")
    public static final AppWidgetsGetWidgetPreviewTypeDto MATCHES;

    @pmi0(B5.R)
    public static final AppWidgetsGetWidgetPreviewTypeDto TABLE;

    @pmi0("text")
    public static final AppWidgetsGetWidgetPreviewTypeDto TEXT;

    @pmi0("tiles")
    public static final AppWidgetsGetWidgetPreviewTypeDto TILES;
    private final String value;

    /* compiled from: AppWidgetsGetWidgetPreviewTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppWidgetsGetWidgetPreviewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppWidgetsGetWidgetPreviewTypeDto createFromParcel(Parcel parcel) {
            return AppWidgetsGetWidgetPreviewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppWidgetsGetWidgetPreviewTypeDto[] newArray(int i) {
            return new AppWidgetsGetWidgetPreviewTypeDto[i];
        }
    }

    static {
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto = new AppWidgetsGetWidgetPreviewTypeDto("COMPACT_LIST", 0, "compact_list");
        COMPACT_LIST = appWidgetsGetWidgetPreviewTypeDto;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto2 = new AppWidgetsGetWidgetPreviewTypeDto("COVER_LIST", 1, "cover_list");
        COVER_LIST = appWidgetsGetWidgetPreviewTypeDto2;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto3 = new AppWidgetsGetWidgetPreviewTypeDto("DONATION", 2, "donation");
        DONATION = appWidgetsGetWidgetPreviewTypeDto3;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto4 = new AppWidgetsGetWidgetPreviewTypeDto("LIST", 3, "list");
        LIST = appWidgetsGetWidgetPreviewTypeDto4;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto5 = new AppWidgetsGetWidgetPreviewTypeDto("MATCH", 4, "match");
        MATCH = appWidgetsGetWidgetPreviewTypeDto5;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto6 = new AppWidgetsGetWidgetPreviewTypeDto("MATCHES", 5, "matches");
        MATCHES = appWidgetsGetWidgetPreviewTypeDto6;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto7 = new AppWidgetsGetWidgetPreviewTypeDto("TABLE", 6, B5.R);
        TABLE = appWidgetsGetWidgetPreviewTypeDto7;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto8 = new AppWidgetsGetWidgetPreviewTypeDto("TEXT", 7, "text");
        TEXT = appWidgetsGetWidgetPreviewTypeDto8;
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto9 = new AppWidgetsGetWidgetPreviewTypeDto("TILES", 8, "tiles");
        TILES = appWidgetsGetWidgetPreviewTypeDto9;
        AppWidgetsGetWidgetPreviewTypeDto[] appWidgetsGetWidgetPreviewTypeDtoArr = {appWidgetsGetWidgetPreviewTypeDto, appWidgetsGetWidgetPreviewTypeDto2, appWidgetsGetWidgetPreviewTypeDto3, appWidgetsGetWidgetPreviewTypeDto4, appWidgetsGetWidgetPreviewTypeDto5, appWidgetsGetWidgetPreviewTypeDto6, appWidgetsGetWidgetPreviewTypeDto7, appWidgetsGetWidgetPreviewTypeDto8, appWidgetsGetWidgetPreviewTypeDto9};
        $VALUES = appWidgetsGetWidgetPreviewTypeDtoArr;
        $ENTRIES = new asp(appWidgetsGetWidgetPreviewTypeDtoArr);
        CREATOR = new a();
    }

    private AppWidgetsGetWidgetPreviewTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppWidgetsGetWidgetPreviewTypeDto valueOf(String str) {
        return (AppWidgetsGetWidgetPreviewTypeDto) Enum.valueOf(AppWidgetsGetWidgetPreviewTypeDto.class, str);
    }

    public static AppWidgetsGetWidgetPreviewTypeDto[] values() {
        return (AppWidgetsGetWidgetPreviewTypeDto[]) $VALUES.clone();
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
