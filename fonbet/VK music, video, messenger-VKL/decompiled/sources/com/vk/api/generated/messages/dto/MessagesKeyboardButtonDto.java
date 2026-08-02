package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesKeyboardButtonDto.kt */
/* loaded from: classes15.dex */
public final class MessagesKeyboardButtonDto implements Parcelable {
    public static final Parcelable.Creator<MessagesKeyboardButtonDto> CREATOR = new a();

    @pmi0("action")
    private final MessagesKeyboardButtonPropertyActionDto action;

    @pmi0("color")
    private final ColorDto color;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesKeyboardButtonDto.kt */
    public static final class ColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorDto[] $VALUES;
        public static final Parcelable.Creator<ColorDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final ColorDto DEFAULT;

        @pmi0("negative")
        public static final ColorDto NEGATIVE;

        @pmi0("positive")
        public static final ColorDto POSITIVE;

        @pmi0("primary")
        public static final ColorDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final ColorDto SECONDARY;
        private final String value;

        /* compiled from: MessagesKeyboardButtonDto.kt */
        public static final class a implements Parcelable.Creator<ColorDto> {
            @Override // android.os.Parcelable.Creator
            public final ColorDto createFromParcel(Parcel parcel) {
                return ColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ColorDto[] newArray(int i) {
                return new ColorDto[i];
            }
        }

        static {
            ColorDto colorDto = new ColorDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = colorDto;
            ColorDto colorDto2 = new ColorDto("POSITIVE", 1, "positive");
            POSITIVE = colorDto2;
            ColorDto colorDto3 = new ColorDto("NEGATIVE", 2, "negative");
            NEGATIVE = colorDto3;
            ColorDto colorDto4 = new ColorDto("PRIMARY", 3, "primary");
            PRIMARY = colorDto4;
            ColorDto colorDto5 = new ColorDto("SECONDARY", 4, X3.i.Y);
            SECONDARY = colorDto5;
            ColorDto[] colorDtoArr = {colorDto, colorDto2, colorDto3, colorDto4, colorDto5};
            $VALUES = colorDtoArr;
            $ENTRIES = new asp(colorDtoArr);
            CREATOR = new a();
        }

        private ColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ColorDto valueOf(String str) {
            return (ColorDto) Enum.valueOf(ColorDto.class, str);
        }

        public static ColorDto[] values() {
            return (ColorDto[]) $VALUES.clone();
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

    /* compiled from: MessagesKeyboardButtonDto.kt */
    public static final class a implements Parcelable.Creator<MessagesKeyboardButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardButtonDto createFromParcel(Parcel parcel) {
            return new MessagesKeyboardButtonDto(MessagesKeyboardButtonPropertyActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardButtonDto[] newArray(int i) {
            return new MessagesKeyboardButtonDto[i];
        }
    }

    public MessagesKeyboardButtonDto(MessagesKeyboardButtonPropertyActionDto messagesKeyboardButtonPropertyActionDto, ColorDto colorDto) {
        this.action = messagesKeyboardButtonPropertyActionDto;
        this.color = colorDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardButtonDto)) {
            return false;
        }
        MessagesKeyboardButtonDto messagesKeyboardButtonDto = (MessagesKeyboardButtonDto) obj;
        return epx.f(this.action, messagesKeyboardButtonDto.action) && this.color == messagesKeyboardButtonDto.color;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        ColorDto colorDto = this.color;
        return hashCode + (colorDto == null ? 0 : colorDto.hashCode());
    }

    public final String toString() {
        return "MessagesKeyboardButtonDto(action=" + this.action + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        ColorDto colorDto = this.color;
        if (colorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            colorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesKeyboardButtonDto(MessagesKeyboardButtonPropertyActionDto messagesKeyboardButtonPropertyActionDto, ColorDto colorDto, int i, zcl zclVar) {
        this(messagesKeyboardButtonPropertyActionDto, (i & 2) != 0 ? null : colorDto);
    }
}
