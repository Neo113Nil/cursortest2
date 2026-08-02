package com.vk.sdk.api.photos.dto;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
/* loaded from: classes5.dex */
public final class PhotosTagsSuggestionItemButtonDto {

    @pmi0("action")
    private final ActionDto action;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
    public static final class ActionDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;

        @pmi0("confirm")
        public static final ActionDto CONFIRM;

        @pmi0("decline")
        public static final ActionDto DECLINE;

        @pmi0("show_tags")
        public static final ActionDto SHOW_TAGS;
        private final String value;

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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosTagsSuggestionItemButtonDto.kt */
    public static final class StyleDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("primary")
        public static final StyleDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final StyleDto SECONDARY;
        private final String value;

        static {
            StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
            PRIMARY = styleDto;
            StyleDto styleDto2 = new StyleDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = styleDto2;
            StyleDto[] styleDtoArr = {styleDto, styleDto2};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
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
    }

    public PhotosTagsSuggestionItemButtonDto() {
        this(null, null, null, 7, null);
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
        return "PhotosTagsSuggestionItemButtonDto(title=" + this.title + ", action=" + this.action + ", style=" + this.style + ")";
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
