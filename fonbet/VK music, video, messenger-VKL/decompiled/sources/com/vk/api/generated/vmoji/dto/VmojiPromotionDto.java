package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VmojiPromotionDto.kt */
/* loaded from: classes15.dex */
public final class VmojiPromotionDto implements Parcelable {
    public static final Parcelable.Creator<VmojiPromotionDto> CREATOR = new a();

    @pmi0("avatar_suggestion")
    private final VmojiAvatarSuggestionDto avatarSuggestion;

    @pmi0("constructor_new_items")
    private final VmojiConstructorNewItemsDto constructorNewItems;

    @pmi0("dot_color")
    private final DotColorDto dotColor;

    @pmi0("stickers_suggestions")
    private final VmojiStickersSuggestionsDto stickersSuggestions;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VmojiPromotionDto.kt */
    public static final class DotColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DotColorDto[] $VALUES;

        @pmi0("blue")
        public static final DotColorDto BLUE;
        public static final Parcelable.Creator<DotColorDto> CREATOR;

        @pmi0("gray")
        public static final DotColorDto GRAY;

        @pmi0("red")
        public static final DotColorDto RED;
        private final String value;

        /* compiled from: VmojiPromotionDto.kt */
        public static final class a implements Parcelable.Creator<DotColorDto> {
            @Override // android.os.Parcelable.Creator
            public final DotColorDto createFromParcel(Parcel parcel) {
                return DotColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DotColorDto[] newArray(int i) {
                return new DotColorDto[i];
            }
        }

        static {
            DotColorDto dotColorDto = new DotColorDto("BLUE", 0, "blue");
            BLUE = dotColorDto;
            DotColorDto dotColorDto2 = new DotColorDto("GRAY", 1, "gray");
            GRAY = dotColorDto2;
            DotColorDto dotColorDto3 = new DotColorDto("RED", 2, "red");
            RED = dotColorDto3;
            DotColorDto[] dotColorDtoArr = {dotColorDto, dotColorDto2, dotColorDto3};
            $VALUES = dotColorDtoArr;
            $ENTRIES = new asp(dotColorDtoArr);
            CREATOR = new a();
        }

        private DotColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DotColorDto valueOf(String str) {
            return (DotColorDto) Enum.valueOf(DotColorDto.class, str);
        }

        public static DotColorDto[] values() {
            return (DotColorDto[]) $VALUES.clone();
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

    /* compiled from: VmojiPromotionDto.kt */
    public static final class a implements Parcelable.Creator<VmojiPromotionDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiPromotionDto createFromParcel(Parcel parcel) {
            return new VmojiPromotionDto(parcel.readInt() == 0 ? null : VmojiConstructorNewItemsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DotColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VmojiAvatarSuggestionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VmojiStickersSuggestionsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiPromotionDto[] newArray(int i) {
            return new VmojiPromotionDto[i];
        }
    }

    public VmojiPromotionDto() {
        this(null, null, null, null, 15, null);
    }

    public final VmojiConstructorNewItemsDto d() {
        return this.constructorNewItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DotColorDto e() {
        return this.dotColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiPromotionDto)) {
            return false;
        }
        VmojiPromotionDto vmojiPromotionDto = (VmojiPromotionDto) obj;
        return epx.f(this.constructorNewItems, vmojiPromotionDto.constructorNewItems) && this.dotColor == vmojiPromotionDto.dotColor && epx.f(this.avatarSuggestion, vmojiPromotionDto.avatarSuggestion) && epx.f(this.stickersSuggestions, vmojiPromotionDto.stickersSuggestions);
    }

    public final VmojiStickersSuggestionsDto f() {
        return this.stickersSuggestions;
    }

    public final int hashCode() {
        VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto = this.constructorNewItems;
        int hashCode = (vmojiConstructorNewItemsDto == null ? 0 : vmojiConstructorNewItemsDto.hashCode()) * 31;
        DotColorDto dotColorDto = this.dotColor;
        int hashCode2 = (hashCode + (dotColorDto == null ? 0 : dotColorDto.hashCode())) * 31;
        VmojiAvatarSuggestionDto vmojiAvatarSuggestionDto = this.avatarSuggestion;
        int hashCode3 = (hashCode2 + (vmojiAvatarSuggestionDto == null ? 0 : vmojiAvatarSuggestionDto.hashCode())) * 31;
        VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto = this.stickersSuggestions;
        return hashCode3 + (vmojiStickersSuggestionsDto != null ? vmojiStickersSuggestionsDto.hashCode() : 0);
    }

    public final String toString() {
        return "VmojiPromotionDto(constructorNewItems=" + this.constructorNewItems + ", dotColor=" + this.dotColor + ", avatarSuggestion=" + this.avatarSuggestion + ", stickersSuggestions=" + this.stickersSuggestions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto = this.constructorNewItems;
        if (vmojiConstructorNewItemsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiConstructorNewItemsDto.writeToParcel(parcel, i);
        }
        DotColorDto dotColorDto = this.dotColor;
        if (dotColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dotColorDto.writeToParcel(parcel, i);
        }
        VmojiAvatarSuggestionDto vmojiAvatarSuggestionDto = this.avatarSuggestion;
        if (vmojiAvatarSuggestionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiAvatarSuggestionDto.writeToParcel(parcel, i);
        }
        VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto = this.stickersSuggestions;
        if (vmojiStickersSuggestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiStickersSuggestionsDto.writeToParcel(parcel, i);
        }
    }

    public VmojiPromotionDto(VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto, DotColorDto dotColorDto, VmojiAvatarSuggestionDto vmojiAvatarSuggestionDto, VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto) {
        this.constructorNewItems = vmojiConstructorNewItemsDto;
        this.dotColor = dotColorDto;
        this.avatarSuggestion = vmojiAvatarSuggestionDto;
        this.stickersSuggestions = vmojiStickersSuggestionsDto;
    }

    public /* synthetic */ VmojiPromotionDto(VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto, DotColorDto dotColorDto, VmojiAvatarSuggestionDto vmojiAvatarSuggestionDto, VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : vmojiConstructorNewItemsDto, (i & 2) != 0 ? null : dotColorDto, (i & 4) != 0 ? null : vmojiAvatarSuggestionDto, (i & 8) != 0 ? null : vmojiStickersSuggestionsDto);
    }
}
