package com.vk.sdk.api.polls.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PollsFieldsVotersDto.kt */
/* loaded from: classes5.dex */
public final class PollsFieldsVotersDto {

    @pmi0("answer_id")
    private final Long answerId;

    @pmi0("answer_offset")
    private final String answerOffset;

    @pmi0("users")
    private final PollsVotersFieldsUsersDto users;

    public PollsFieldsVotersDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsFieldsVotersDto)) {
            return false;
        }
        PollsFieldsVotersDto pollsFieldsVotersDto = (PollsFieldsVotersDto) obj;
        return epx.f(this.answerId, pollsFieldsVotersDto.answerId) && epx.f(this.users, pollsFieldsVotersDto.users) && epx.f(this.answerOffset, pollsFieldsVotersDto.answerOffset);
    }

    public final int hashCode() {
        Long l = this.answerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto = this.users;
        int hashCode2 = (hashCode + (pollsVotersFieldsUsersDto == null ? 0 : pollsVotersFieldsUsersDto.hashCode())) * 31;
        String str = this.answerOffset;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Long l = this.answerId;
        PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto = this.users;
        String str = this.answerOffset;
        StringBuilder sb = new StringBuilder("PollsFieldsVotersDto(answerId=");
        sb.append(l);
        sb.append(", users=");
        sb.append(pollsVotersFieldsUsersDto);
        sb.append(", answerOffset=");
        return i5s.a(sb, str, ")");
    }

    public PollsFieldsVotersDto(Long l, PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto, String str) {
        this.answerId = l;
        this.users = pollsVotersFieldsUsersDto;
        this.answerOffset = str;
    }

    public /* synthetic */ PollsFieldsVotersDto(Long l, PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : pollsVotersFieldsUsersDto, (i & 4) != 0 ? null : str);
    }
}
