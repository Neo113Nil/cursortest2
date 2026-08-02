package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedExpertCardWidgetRatingDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedExpertCardWidgetRatingDto {

    @pmi0("highlighted")
    private final Boolean highlighted;

    @pmi0("value")
    private final Float value;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedExpertCardWidgetRatingDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedExpertCardWidgetRatingDto)) {
            return false;
        }
        NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto = (NewsfeedExpertCardWidgetRatingDto) obj;
        return epx.f(this.value, newsfeedExpertCardWidgetRatingDto.value) && epx.f(this.highlighted, newsfeedExpertCardWidgetRatingDto.highlighted);
    }

    public final int hashCode() {
        Float f = this.value;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.highlighted;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedExpertCardWidgetRatingDto(value=" + this.value + ", highlighted=" + this.highlighted + ")";
    }

    public NewsfeedExpertCardWidgetRatingDto(Float f, Boolean bool) {
        this.value = f;
        this.highlighted = bool;
    }

    public /* synthetic */ NewsfeedExpertCardWidgetRatingDto(Float f, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : bool);
    }
}
