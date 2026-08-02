package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class LayoutParamsDto {
    public static final Companion Companion = new Companion();
    public final Double a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final String f;
    public final FontDto g;
    public final String h;

    public static final class Companion {
        public final KSerializer<LayoutParamsDto> serializer() {
            return LayoutParamsDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LayoutParamsDto(int i, Double d, Double d2, Double d3, Double d4, Double d5, String str, FontDto fontDto, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = fontDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutParamsDto)) {
            return false;
        }
        LayoutParamsDto layoutParamsDto = (LayoutParamsDto) obj;
        return epx.f(this.a, layoutParamsDto.a) && epx.f(this.b, layoutParamsDto.b) && epx.f(this.c, layoutParamsDto.c) && epx.f(this.d, layoutParamsDto.d) && epx.f(this.e, layoutParamsDto.e) && epx.f(this.f, layoutParamsDto.f) && epx.f(this.g, layoutParamsDto.g) && epx.f(this.h, layoutParamsDto.h);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.e;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        FontDto fontDto = this.g;
        int hashCode7 = (hashCode6 + (fontDto == null ? 0 : fontDto.hashCode())) * 31;
        String str2 = this.h;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsDto(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ", angle=" + this.e + ", alignment=" + this.f + ", font=" + this.g + ", innerSizesDependOn=" + this.h + ")";
    }

    public LayoutParamsDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
