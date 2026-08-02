package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;

/* compiled from: NewsfeedItemFeedbackPollQuestionAnswerDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFeedbackPollQuestionAnswerDto {

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    public NewsfeedItemFeedbackPollQuestionAnswerDto(String str, String str2) {
        this.title = str;
        this.id = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionAnswerDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionAnswerDto newsfeedItemFeedbackPollQuestionAnswerDto = (NewsfeedItemFeedbackPollQuestionAnswerDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollQuestionAnswerDto.title) && epx.f(this.id, newsfeedItemFeedbackPollQuestionAnswerDto.id);
    }

    public final int hashCode() {
        return this.id.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("NewsfeedItemFeedbackPollQuestionAnswerDto(title=", this.title, ", id=", this.id, ")");
    }
}
