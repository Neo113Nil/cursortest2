package com.vk.sdk.api.classifieds.dto;

import ru.ok.android.utils.Logger;
import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: ClassifiedsYoulaItemOnClickOptionsDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemOnClickOptionsDto {

    @pmi0(Logger.METHOD_W)
    private final String w;

    public ClassifiedsYoulaItemOnClickOptionsDto(String str) {
        this.w = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassifiedsYoulaItemOnClickOptionsDto) && epx.f(this.w, ((ClassifiedsYoulaItemOnClickOptionsDto) obj).w);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return zr.a("ClassifiedsYoulaItemOnClickOptionsDto(w=", this.w, ")");
    }
}
