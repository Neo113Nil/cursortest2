package com.vk.sdk.api.newsfeed.dto;

import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.vr;
import xsna.zcl;

/* compiled from: NewsfeedItemWallpostFeedbackDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemWallpostFeedbackDto {

    @pmi0("answers")
    private final List<NewsfeedItemWallpostFeedbackAnswerDto> answers;

    @pmi0("descriptions")
    private final List<String> descriptions;

    @pmi0("gratitude")
    private final String gratitude;

    @pmi0("question")
    private final String question;

    @pmi0("stars_count")
    private final Integer starsCount;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final NewsfeedItemWallpostFeedbackTypeDto type;

    public NewsfeedItemWallpostFeedbackDto(NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto, String str, List<NewsfeedItemWallpostFeedbackAnswerDto> list, Integer num, List<String> list2, String str2, String str3) {
        this.type = newsfeedItemWallpostFeedbackTypeDto;
        this.question = str;
        this.answers = list;
        this.starsCount = num;
        this.descriptions = list2;
        this.gratitude = str2;
        this.trackCode = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemWallpostFeedbackDto)) {
            return false;
        }
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) obj;
        return this.type == newsfeedItemWallpostFeedbackDto.type && epx.f(this.question, newsfeedItemWallpostFeedbackDto.question) && epx.f(this.answers, newsfeedItemWallpostFeedbackDto.answers) && epx.f(this.starsCount, newsfeedItemWallpostFeedbackDto.starsCount) && epx.f(this.descriptions, newsfeedItemWallpostFeedbackDto.descriptions) && epx.f(this.gratitude, newsfeedItemWallpostFeedbackDto.gratitude) && epx.f(this.trackCode, newsfeedItemWallpostFeedbackDto.trackCode);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.question);
        List<NewsfeedItemWallpostFeedbackAnswerDto> list = this.answers;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.starsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.descriptions;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.gratitude;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto = this.type;
        String str = this.question;
        List<NewsfeedItemWallpostFeedbackAnswerDto> list = this.answers;
        Integer num = this.starsCount;
        List<String> list2 = this.descriptions;
        String str2 = this.gratitude;
        String str3 = this.trackCode;
        StringBuilder sb = new StringBuilder("NewsfeedItemWallpostFeedbackDto(type=");
        sb.append(newsfeedItemWallpostFeedbackTypeDto);
        sb.append(", question=");
        sb.append(str);
        sb.append(", answers=");
        sb.append(list);
        sb.append(", starsCount=");
        sb.append(num);
        sb.append(", descriptions=");
        vr.c(", gratitude=", str2, ", trackCode=", sb, list2);
        return i5s.a(sb, str3, ")");
    }

    public /* synthetic */ NewsfeedItemWallpostFeedbackDto(NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto, String str, List list, Integer num, List list2, String str2, String str3, int i, zcl zclVar) {
        this(newsfeedItemWallpostFeedbackTypeDto, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
