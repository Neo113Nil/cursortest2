package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;

/* compiled from: NewsfeedItemWallpostFeedbackAnswerDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemWallpostFeedbackAnswerDto {

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    public NewsfeedItemWallpostFeedbackAnswerDto(String str, String str2) {
        this.title = str;
        this.id = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemWallpostFeedbackAnswerDto)) {
            return false;
        }
        NewsfeedItemWallpostFeedbackAnswerDto newsfeedItemWallpostFeedbackAnswerDto = (NewsfeedItemWallpostFeedbackAnswerDto) obj;
        return epx.f(this.title, newsfeedItemWallpostFeedbackAnswerDto.title) && epx.f(this.id, newsfeedItemWallpostFeedbackAnswerDto.id);
    }

    public final int hashCode() {
        return this.id.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("NewsfeedItemWallpostFeedbackAnswerDto(title=", this.title, ", id=", this.id, ")");
    }
}
