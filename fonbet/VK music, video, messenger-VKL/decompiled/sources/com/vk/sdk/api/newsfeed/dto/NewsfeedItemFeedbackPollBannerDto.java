package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;

/* compiled from: NewsfeedItemFeedbackPollBannerDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFeedbackPollBannerDto {

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    public NewsfeedItemFeedbackPollBannerDto(String str, String str2, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollBannerDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollBannerDto newsfeedItemFeedbackPollBannerDto = (NewsfeedItemFeedbackPollBannerDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollBannerDto.title) && epx.f(this.subtitle, newsfeedItemFeedbackPollBannerDto.subtitle) && epx.f(this.buttonText, newsfeedItemFeedbackPollBannerDto.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return i5s.a(xe9.a("NewsfeedItemFeedbackPollBannerDto(title=", str, ", subtitle=", str2, ", buttonText="), this.buttonText, ")");
    }
}
