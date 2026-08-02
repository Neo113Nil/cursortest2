package com.vk.sdk.api.classifieds.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;

/* compiled from: ClassifiedsYoulaItemAttributeDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemAttributeDto {

    @pmi0("slug")
    private final String slug;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("value")
    private final String value;

    public ClassifiedsYoulaItemAttributeDto(String str, String str2, String str3, String str4) {
        this.title = str;
        this.slug = str2;
        this.type = str3;
        this.value = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemAttributeDto)) {
            return false;
        }
        ClassifiedsYoulaItemAttributeDto classifiedsYoulaItemAttributeDto = (ClassifiedsYoulaItemAttributeDto) obj;
        return epx.f(this.title, classifiedsYoulaItemAttributeDto.title) && epx.f(this.slug, classifiedsYoulaItemAttributeDto.slug) && epx.f(this.type, classifiedsYoulaItemAttributeDto.type) && epx.f(this.value, classifiedsYoulaItemAttributeDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.slug), 31, this.type);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.slug;
        return h5s.d(xe9.a("ClassifiedsYoulaItemAttributeDto(title=", str, ", slug=", str2, ", type="), this.type, ", value=", this.value, ")");
    }
}
