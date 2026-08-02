package com.vk.sdk.api.newsfeed.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;

/* compiled from: NewsfeedItemFeedbackPollPollDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFeedbackPollPollDto {

    @pmi0("gratitude")
    private final NewsfeedItemFeedbackPollGratitudeDto gratitude;

    @pmi0("questions")
    private final List<NewsfeedItemFeedbackPollQuestionDto> questions;

    @pmi0("title")
    private final String title;

    public NewsfeedItemFeedbackPollPollDto(String str, NewsfeedItemFeedbackPollGratitudeDto newsfeedItemFeedbackPollGratitudeDto, List<NewsfeedItemFeedbackPollQuestionDto> list) {
        this.title = str;
        this.gratitude = newsfeedItemFeedbackPollGratitudeDto;
        this.questions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollPollDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto = (NewsfeedItemFeedbackPollPollDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollPollDto.title) && epx.f(this.gratitude, newsfeedItemFeedbackPollPollDto.gratitude) && epx.f(this.questions, newsfeedItemFeedbackPollPollDto.questions);
    }

    public final int hashCode() {
        return this.questions.hashCode() + ((this.gratitude.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.title;
        NewsfeedItemFeedbackPollGratitudeDto newsfeedItemFeedbackPollGratitudeDto = this.gratitude;
        List<NewsfeedItemFeedbackPollQuestionDto> list = this.questions;
        StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollPollDto(title=");
        sb.append(str);
        sb.append(", gratitude=");
        sb.append(newsfeedItemFeedbackPollGratitudeDto);
        sb.append(", questions=");
        return vp.b(")", sb, list);
    }
}
