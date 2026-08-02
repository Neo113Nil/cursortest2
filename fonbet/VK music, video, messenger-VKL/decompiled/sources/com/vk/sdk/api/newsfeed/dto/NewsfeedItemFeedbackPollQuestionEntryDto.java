package com.vk.sdk.api.newsfeed.dto;

import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemFeedbackPollQuestionEntryDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFeedbackPollQuestionEntryDto {

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final NewsfeedNewsfeedItemDto item;

    @pmi0("title")
    private final String title;

    public NewsfeedItemFeedbackPollQuestionEntryDto(NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, String str) {
        this.item = newsfeedNewsfeedItemDto;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionEntryDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionEntryDto newsfeedItemFeedbackPollQuestionEntryDto = (NewsfeedItemFeedbackPollQuestionEntryDto) obj;
        return epx.f(this.item, newsfeedItemFeedbackPollQuestionEntryDto.item) && epx.f(this.title, newsfeedItemFeedbackPollQuestionEntryDto.title);
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NewsfeedItemFeedbackPollQuestionEntryDto(item=" + this.item + ", title=" + this.title + ")";
    }

    public /* synthetic */ NewsfeedItemFeedbackPollQuestionEntryDto(NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, String str, int i, zcl zclVar) {
        this(newsfeedNewsfeedItemDto, (i & 2) != 0 ? null : str);
    }
}
