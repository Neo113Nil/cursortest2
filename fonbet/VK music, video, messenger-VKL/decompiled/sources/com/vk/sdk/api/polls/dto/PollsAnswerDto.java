package com.vk.sdk.api.polls.dto;

import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: PollsAnswerDto.kt */
/* loaded from: classes5.dex */
public final class PollsAnswerDto {

    @pmi0("id")
    private final long id;

    @pmi0("rate")
    private final float rate;

    @pmi0("text")
    private final String text;

    @pmi0("votes")
    private final int votes;

    public PollsAnswerDto(long j, float f, String str, int i) {
        this.id = j;
        this.rate = f;
        this.text = str;
        this.votes = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsAnswerDto)) {
            return false;
        }
        PollsAnswerDto pollsAnswerDto = (PollsAnswerDto) obj;
        return this.id == pollsAnswerDto.id && Float.compare(this.rate, pollsAnswerDto.rate) == 0 && epx.f(this.text, pollsAnswerDto.text) && this.votes == pollsAnswerDto.votes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.votes) + urd0.a(b.a(this.rate, Long.hashCode(this.id) * 31, 31), 31, this.text);
    }

    public final String toString() {
        return "PollsAnswerDto(id=" + this.id + ", rate=" + this.rate + ", text=" + this.text + ", votes=" + this.votes + ")";
    }
}
