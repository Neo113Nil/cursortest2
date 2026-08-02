package com.vk.sdk.api.classifieds.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;

/* compiled from: ClassifiedsYoulaItemStatusInfoDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemStatusInfoDto {

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    public ClassifiedsYoulaItemStatusInfoDto(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemStatusInfoDto)) {
            return false;
        }
        ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto = (ClassifiedsYoulaItemStatusInfoDto) obj;
        return epx.f(this.title, classifiedsYoulaItemStatusInfoDto.title) && epx.f(this.description, classifiedsYoulaItemStatusInfoDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("ClassifiedsYoulaItemStatusInfoDto(title=", this.title, ", description=", this.description, ")");
    }
}
