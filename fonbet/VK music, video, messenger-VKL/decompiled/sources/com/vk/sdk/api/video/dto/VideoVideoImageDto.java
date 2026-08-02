package com.vk.sdk.api.video.dto;

import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.xy6;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoImageDto.kt */
/* loaded from: classes5.dex */
public final class VideoVideoImageDto {

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final String id;

    @pmi0("theme")
    private final ThemeDto theme;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    @pmi0("with_padding")
    private final BasePropertyExistsDto withPadding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoImageDto.kt */
    public static final class ThemeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        static {
            ThemeDto themeDto = new ThemeDto("LIGHT", 0, "light");
            LIGHT = themeDto;
            ThemeDto themeDto2 = new ThemeDto("DARK", 1, "dark");
            DARK = themeDto2;
            ThemeDto[] themeDtoArr = {themeDto, themeDto2};
            $VALUES = themeDtoArr;
            $ENTRIES = new asp(themeDtoArr);
        }

        private ThemeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ThemeDto valueOf(String str) {
            return (ThemeDto) Enum.valueOf(ThemeDto.class, str);
        }

        public static ThemeDto[] values() {
            return (ThemeDto[]) $VALUES.clone();
        }
    }

    public VideoVideoImageDto(String str, int i, int i2, BasePropertyExistsDto basePropertyExistsDto, String str2, ThemeDto themeDto) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.withPadding = basePropertyExistsDto;
        this.id = str2;
        this.theme = themeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoImageDto)) {
            return false;
        }
        VideoVideoImageDto videoVideoImageDto = (VideoVideoImageDto) obj;
        return epx.f(this.url, videoVideoImageDto.url) && this.width == videoVideoImageDto.width && this.height == videoVideoImageDto.height && this.withPadding == videoVideoImageDto.withPadding && epx.f(this.id, videoVideoImageDto.id) && this.theme == videoVideoImageDto.theme;
    }

    public final int hashCode() {
        int a = shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
        BasePropertyExistsDto basePropertyExistsDto = this.withPadding;
        int hashCode = (a + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemeDto themeDto = this.theme;
        return hashCode2 + (themeDto != null ? themeDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        int i = this.width;
        int i2 = this.height;
        BasePropertyExistsDto basePropertyExistsDto = this.withPadding;
        String str2 = this.id;
        ThemeDto themeDto = this.theme;
        StringBuilder b = xy6.b(i, "VideoVideoImageDto(url=", str, ", width=", ", height=");
        b.append(i2);
        b.append(", withPadding=");
        b.append(basePropertyExistsDto);
        b.append(", id=");
        b.append(str2);
        b.append(", theme=");
        b.append(themeDto);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ VideoVideoImageDto(String str, int i, int i2, BasePropertyExistsDto basePropertyExistsDto, String str2, ThemeDto themeDto, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : basePropertyExistsDto, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : themeDto);
    }
}
