package com.vk.sdk.api.newsfeed.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.vq;
import xsna.xe9;
import xsna.zcl;

/* compiled from: NewsfeedItemFeedbackPollQuestionDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFeedbackPollQuestionDto {

    @pmi0("answers")
    private final List<NewsfeedItemFeedbackPollQuestionAnswerDto> answers;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("entries")
    private final List<NewsfeedItemFeedbackPollQuestionEntryDto> entries;

    @pmi0("next_button_text")
    private final String nextButtonText;

    @pmi0("text")
    private final String text;

    public NewsfeedItemFeedbackPollQuestionDto(String str, String str2, List<NewsfeedItemFeedbackPollQuestionAnswerDto> list, List<NewsfeedItemFeedbackPollQuestionEntryDto> list2, String str3) {
        this.text = str;
        this.nextButtonText = str2;
        this.answers = list;
        this.entries = list2;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionDto newsfeedItemFeedbackPollQuestionDto = (NewsfeedItemFeedbackPollQuestionDto) obj;
        return epx.f(this.text, newsfeedItemFeedbackPollQuestionDto.text) && epx.f(this.nextButtonText, newsfeedItemFeedbackPollQuestionDto.nextButtonText) && epx.f(this.answers, newsfeedItemFeedbackPollQuestionDto.answers) && epx.f(this.entries, newsfeedItemFeedbackPollQuestionDto.entries) && epx.f(this.buttonText, newsfeedItemFeedbackPollQuestionDto.buttonText);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(urd0.a(this.text.hashCode() * 31, 31, this.nextButtonText), 31, this.answers), 31, this.entries);
        String str = this.buttonText;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.text;
        String str2 = this.nextButtonText;
        List<NewsfeedItemFeedbackPollQuestionAnswerDto> list = this.answers;
        List<NewsfeedItemFeedbackPollQuestionEntryDto> list2 = this.entries;
        String str3 = this.buttonText;
        StringBuilder a = xe9.a("NewsfeedItemFeedbackPollQuestionDto(text=", str, ", nextButtonText=", str2, ", answers=");
        vq.d(a, list, ", entries=", list2, ", buttonText=");
        return i5s.a(a, str3, ")");
    }

    public /* synthetic */ NewsfeedItemFeedbackPollQuestionDto(String str, String str2, List list, List list2, String str3, int i, zcl zclVar) {
        this(str, str2, list, list2, (i & 16) != 0 ? null : str3);
    }
}
