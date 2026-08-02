package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
/* loaded from: classes15.dex */
public final class PhotosTagsSuggestionItemButtonDto implements Parcelable {
    public static final Parcelable.Creator<PhotosTagsSuggestionItemButtonDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;

        @pmi0("confirm")
        public static final ActionDto CONFIRM;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("decline")
        public static final ActionDto DECLINE;

        @pmi0("show_tags")
        public static final ActionDto SHOW_TAGS;
        private final String value;

        /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
        public static final class a implements Parcelable.Creator<ActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionDto createFromParcel(Parcel parcel) {
                return ActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionDto[] newArray(int i) {
                return new ActionDto[i];
            }
        }

        static {
            ActionDto actionDto = new ActionDto("CONFIRM", 0, "confirm");
            CONFIRM = actionDto;
            ActionDto actionDto2 = new ActionDto("DECLINE", 1, "decline");
            DECLINE = actionDto2;
            ActionDto actionDto3 = new ActionDto("SHOW_TAGS", 2, "show_tags");
            SHOW_TAGS = actionDto3;
            ActionDto[] actionDtoArr = {actionDto, actionDto2, actionDto3};
            $VALUES = actionDtoArr;
            $ENTRIES = new asp(actionDtoArr);
            CREATOR = new a();
        }

        private ActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("primary")
        public static final StyleDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final StyleDto SECONDARY;
        private final String value;

        /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
            PRIMARY = styleDto;
            StyleDto styleDto2 = new StyleDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = styleDto2;
            StyleDto[] styleDtoArr = {styleDto, styleDto2};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
    public static final class a implements Parcelable.Creator<PhotosTagsSuggestionItemButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosTagsSuggestionItemButtonDto createFromParcel(Parcel parcel) {
            return new PhotosTagsSuggestionItemButtonDto(parcel.readString(), parcel.readInt() == 0 ? null : ActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosTagsSuggestionItemButtonDto[] newArray(int i) {
            return new PhotosTagsSuggestionItemButtonDto[i];
        }
    }

    public PhotosTagsSuggestionItemButtonDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemButtonDto)) {
            return false;
        }
        PhotosTagsSuggestionItemButtonDto photosTagsSuggestionItemButtonDto = (PhotosTagsSuggestionItemButtonDto) obj;
        return epx.f(this.title, photosTagsSuggestionItemButtonDto.title) && this.action == photosTagsSuggestionItemButtonDto.action && this.style == photosTagsSuggestionItemButtonDto.style;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ActionDto actionDto = this.action;
        int hashCode2 = (hashCode + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        StyleDto styleDto = this.style;
        return hashCode2 + (styleDto != null ? styleDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosTagsSuggestionItemButtonDto(title=" + this.title + ", action=" + this.action + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        ActionDto actionDto = this.action;
        if (actionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionDto.writeToParcel(parcel, i);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
    }

    public PhotosTagsSuggestionItemButtonDto(String str, ActionDto actionDto, StyleDto styleDto) {
        this.title = str;
        this.action = actionDto;
        this.style = styleDto;
    }

    public /* synthetic */ PhotosTagsSuggestionItemButtonDto(String str, ActionDto actionDto, StyleDto styleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : actionDto, (i & 4) != 0 ? null : styleDto);
    }
}
