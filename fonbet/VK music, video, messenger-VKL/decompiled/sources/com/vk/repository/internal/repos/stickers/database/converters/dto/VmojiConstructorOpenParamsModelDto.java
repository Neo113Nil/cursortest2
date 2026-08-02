package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VmojiConstructorOpenParamsModelDto.kt */
/* loaded from: classes5.dex */
public final class VmojiConstructorOpenParamsModelDto {

    @pmi0("controlId")
    private final String controlId;

    @pmi0("controlItemValue")
    private final String controlItemValue;

    @pmi0("sectionId")
    private final String sectionId;

    public VmojiConstructorOpenParamsModelDto(String str, String str2, String str3) {
        this.sectionId = str;
        this.controlId = str2;
        this.controlItemValue = str3;
    }

    public final String a() {
        return this.controlId;
    }

    public final String b() {
        return this.controlItemValue;
    }

    public final String c() {
        return this.sectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiConstructorOpenParamsModelDto)) {
            return false;
        }
        VmojiConstructorOpenParamsModelDto vmojiConstructorOpenParamsModelDto = (VmojiConstructorOpenParamsModelDto) obj;
        return epx.f(this.sectionId, vmojiConstructorOpenParamsModelDto.sectionId) && epx.f(this.controlId, vmojiConstructorOpenParamsModelDto.controlId) && epx.f(this.controlItemValue, vmojiConstructorOpenParamsModelDto.controlItemValue);
    }

    public final int hashCode() {
        String str = this.sectionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.controlId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.controlItemValue;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiConstructorOpenParamsModelDto(sectionId=");
        sb.append(this.sectionId);
        sb.append(", controlId=");
        sb.append(this.controlId);
        sb.append(", controlItemValue=");
        return ho8.a(sb, this.controlItemValue, ')');
    }
}
