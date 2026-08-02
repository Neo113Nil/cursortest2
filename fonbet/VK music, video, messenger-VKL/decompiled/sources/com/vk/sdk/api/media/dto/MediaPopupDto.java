package com.vk.sdk.api.media.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.vr;
import xsna.xe9;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaPopupDto.kt */
/* loaded from: classes5.dex */
public final class MediaPopupDto {

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("emoji_icons")
    private final String emojiIcons;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("id")
    private final String id;

    @pmi0("image_mode")
    private final ImageModeDto imageMode;

    @pmi0("music_subscription_event")
    private final String musicSubscriptionEvent;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPopupDto.kt */
    public static final class ImageModeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageModeDto[] $VALUES;

        @pmi0("big")
        public static final ImageModeDto BIG;

        @pmi0("emoji")
        public static final ImageModeDto EMOJI;

        @pmi0("round")
        public static final ImageModeDto ROUND;

        @pmi0("small")
        public static final ImageModeDto SMALL;
        private final String value;

        static {
            ImageModeDto imageModeDto = new ImageModeDto("ROUND", 0, "round");
            ROUND = imageModeDto;
            ImageModeDto imageModeDto2 = new ImageModeDto("SMALL", 1, "small");
            SMALL = imageModeDto2;
            ImageModeDto imageModeDto3 = new ImageModeDto("BIG", 2, "big");
            BIG = imageModeDto3;
            ImageModeDto imageModeDto4 = new ImageModeDto("EMOJI", 3, "emoji");
            EMOJI = imageModeDto4;
            ImageModeDto[] imageModeDtoArr = {imageModeDto, imageModeDto2, imageModeDto3, imageModeDto4};
            $VALUES = imageModeDtoArr;
            $ENTRIES = new asp(imageModeDtoArr);
        }

        private ImageModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ImageModeDto valueOf(String str) {
            return (ImageModeDto) Enum.valueOf(ImageModeDto.class, str);
        }

        public static ImageModeDto[] values() {
            return (ImageModeDto[]) $VALUES.clone();
        }
    }

    public MediaPopupDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List<BaseLinkButtonDto> list, List<BaseImageDto> list2, String str3, String str4, ImageModeDto imageModeDto, String str5) {
        this.title = str;
        this.id = str2;
        this.button = baseLinkButtonDto;
        this.buttons = list;
        this.icons = list2;
        this.musicSubscriptionEvent = str3;
        this.text = str4;
        this.imageMode = imageModeDto;
        this.emojiIcons = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPopupDto)) {
            return false;
        }
        MediaPopupDto mediaPopupDto = (MediaPopupDto) obj;
        return epx.f(this.title, mediaPopupDto.title) && epx.f(this.id, mediaPopupDto.id) && epx.f(this.button, mediaPopupDto.button) && epx.f(this.buttons, mediaPopupDto.buttons) && epx.f(this.icons, mediaPopupDto.icons) && epx.f(this.musicSubscriptionEvent, mediaPopupDto.musicSubscriptionEvent) && epx.f(this.text, mediaPopupDto.text) && this.imageMode == mediaPopupDto.imageMode && epx.f(this.emojiIcons, mediaPopupDto.emojiIcons);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode3 = (hashCode2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.icons;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.musicSubscriptionEvent;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageModeDto imageModeDto = this.imageMode;
        int hashCode8 = (hashCode7 + (imageModeDto == null ? 0 : imageModeDto.hashCode())) * 31;
        String str4 = this.emojiIcons;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.id;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        List<BaseLinkButtonDto> list = this.buttons;
        List<BaseImageDto> list2 = this.icons;
        String str3 = this.musicSubscriptionEvent;
        String str4 = this.text;
        ImageModeDto imageModeDto = this.imageMode;
        String str5 = this.emojiIcons;
        StringBuilder a = xe9.a("MediaPopupDto(title=", str, ", id=", str2, ", button=");
        a.append(baseLinkButtonDto);
        a.append(", buttons=");
        a.append(list);
        a.append(", icons=");
        vr.c(", musicSubscriptionEvent=", str3, ", text=", a, list2);
        a.append(str4);
        a.append(", imageMode=");
        a.append(imageModeDto);
        a.append(", emojiIcons=");
        return i5s.a(a, str5, ")");
    }

    public /* synthetic */ MediaPopupDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List list, List list2, String str3, String str4, ImageModeDto imageModeDto, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseLinkButtonDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : imageModeDto, (i & 256) != 0 ? null : str5);
    }
}
