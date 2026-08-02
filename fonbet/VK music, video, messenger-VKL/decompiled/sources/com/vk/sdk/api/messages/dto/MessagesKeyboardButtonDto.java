package com.vk.sdk.api.messages.dto;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesKeyboardButtonDto.kt */
/* loaded from: classes5.dex */
public final class MessagesKeyboardButtonDto {

    @pmi0("action")
    private final MessagesKeyboardButtonPropertyActionDto action;

    @pmi0("color")
    private final ColorDto color;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesKeyboardButtonDto.kt */
    public static final class ColorDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorDto[] $VALUES;

        @pmi0(BuildConfig.FLAVOR)
        public static final ColorDto DEFAULT;

        @pmi0("negative")
        public static final ColorDto NEGATIVE;

        @pmi0("positive")
        public static final ColorDto POSITIVE;

        @pmi0("primary")
        public static final ColorDto PRIMARY;
        private final String value;

        static {
            ColorDto colorDto = new ColorDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = colorDto;
            ColorDto colorDto2 = new ColorDto("POSITIVE", 1, "positive");
            POSITIVE = colorDto2;
            ColorDto colorDto3 = new ColorDto("NEGATIVE", 2, "negative");
            NEGATIVE = colorDto3;
            ColorDto colorDto4 = new ColorDto("PRIMARY", 3, "primary");
            PRIMARY = colorDto4;
            ColorDto[] colorDtoArr = {colorDto, colorDto2, colorDto3, colorDto4};
            $VALUES = colorDtoArr;
            $ENTRIES = new asp(colorDtoArr);
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
    }

    public MessagesKeyboardButtonDto(MessagesKeyboardButtonPropertyActionDto messagesKeyboardButtonPropertyActionDto, ColorDto colorDto) {
        this.action = messagesKeyboardButtonPropertyActionDto;
        this.color = colorDto;
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
        return "MessagesKeyboardButtonDto(action=" + this.action + ", color=" + this.color + ")";
    }

    public /* synthetic */ MessagesKeyboardButtonDto(MessagesKeyboardButtonPropertyActionDto messagesKeyboardButtonPropertyActionDto, ColorDto colorDto, int i, zcl zclVar) {
        this(messagesKeyboardButtonPropertyActionDto, (i & 2) != 0 ? null : colorDto);
    }
}
