package com.vk.api.generated.explore.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.B5;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreWidgetTypesDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreWidgetTypesDto[] $VALUES;

    @pmi0("card")
    public static final ExploreWidgetTypesDto CARD;

    @pmi0("counter")
    public static final ExploreWidgetTypesDto COUNTER;
    public static final Parcelable.Creator<ExploreWidgetTypesDto> CREATOR;

    @pmi0("grid")
    public static final ExploreWidgetTypesDto GRID;

    @pmi0("informer")
    public static final ExploreWidgetTypesDto INFORMER;

    @pmi0("internal")
    public static final ExploreWidgetTypesDto INTERNAL;

    @pmi0("placeholder")
    public static final ExploreWidgetTypesDto PLACEHOLDER;

    @pmi0("scroll")
    public static final ExploreWidgetTypesDto SCROLL;

    @pmi0(B5.R)
    public static final ExploreWidgetTypesDto TABLE;
    private final String value;

    /* compiled from: ExploreWidgetTypesDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetTypesDto createFromParcel(Parcel parcel) {
            return ExploreWidgetTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetTypesDto[] newArray(int i) {
            return new ExploreWidgetTypesDto[i];
        }
    }

    static {
        ExploreWidgetTypesDto exploreWidgetTypesDto = new ExploreWidgetTypesDto("SCROLL", 0, "scroll");
        SCROLL = exploreWidgetTypesDto;
        ExploreWidgetTypesDto exploreWidgetTypesDto2 = new ExploreWidgetTypesDto("CARD", 1, "card");
        CARD = exploreWidgetTypesDto2;
        ExploreWidgetTypesDto exploreWidgetTypesDto3 = new ExploreWidgetTypesDto(SignalingProtocol.KEY_GRID, 2, "grid");
        GRID = exploreWidgetTypesDto3;
        ExploreWidgetTypesDto exploreWidgetTypesDto4 = new ExploreWidgetTypesDto("INTERNAL", 3, "internal");
        INTERNAL = exploreWidgetTypesDto4;
        ExploreWidgetTypesDto exploreWidgetTypesDto5 = new ExploreWidgetTypesDto("COUNTER", 4, "counter");
        COUNTER = exploreWidgetTypesDto5;
        ExploreWidgetTypesDto exploreWidgetTypesDto6 = new ExploreWidgetTypesDto("PLACEHOLDER", 5, "placeholder");
        PLACEHOLDER = exploreWidgetTypesDto6;
        ExploreWidgetTypesDto exploreWidgetTypesDto7 = new ExploreWidgetTypesDto("TABLE", 6, B5.R);
        TABLE = exploreWidgetTypesDto7;
        ExploreWidgetTypesDto exploreWidgetTypesDto8 = new ExploreWidgetTypesDto("INFORMER", 7, "informer");
        INFORMER = exploreWidgetTypesDto8;
        ExploreWidgetTypesDto[] exploreWidgetTypesDtoArr = {exploreWidgetTypesDto, exploreWidgetTypesDto2, exploreWidgetTypesDto3, exploreWidgetTypesDto4, exploreWidgetTypesDto5, exploreWidgetTypesDto6, exploreWidgetTypesDto7, exploreWidgetTypesDto8};
        $VALUES = exploreWidgetTypesDtoArr;
        $ENTRIES = new asp(exploreWidgetTypesDtoArr);
        CREATOR = new a();
    }

    private ExploreWidgetTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreWidgetTypesDto valueOf(String str) {
        return (ExploreWidgetTypesDto) Enum.valueOf(ExploreWidgetTypesDto.class, str);
    }

    public static ExploreWidgetTypesDto[] values() {
        return (ExploreWidgetTypesDto[]) $VALUES.clone();
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
