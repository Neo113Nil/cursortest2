package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;

/* compiled from: NewsfeedItemFeedbackPollGratitudeDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFeedbackPollGratitudeDto {

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    public NewsfeedItemFeedbackPollGratitudeDto(String str, String str2, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollGratitudeDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollGratitudeDto newsfeedItemFeedbackPollGratitudeDto = (NewsfeedItemFeedbackPollGratitudeDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollGratitudeDto.title) && epx.f(this.subtitle, newsfeedItemFeedbackPollGratitudeDto.subtitle) && epx.f(this.buttonText, newsfeedItemFeedbackPollGratitudeDto.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return i5s.a(xe9.a("NewsfeedItemFeedbackPollGratitudeDto(title=", str, ", subtitle=", str2, ", buttonText="), this.buttonText, ")");
    }
}
