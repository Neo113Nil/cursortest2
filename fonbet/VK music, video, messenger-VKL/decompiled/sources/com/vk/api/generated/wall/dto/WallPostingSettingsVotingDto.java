package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: WallPostingSettingsVotingDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsVotingDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsVotingDto> CREATOR = new a();

    @pmi0("answer_max_length")
    private final Integer answerMaxLength;

    @pmi0("answers_limit")
    private final Integer answersLimit;

    @pmi0("question_max_length")
    private final Integer questionMaxLength;

    /* compiled from: WallPostingSettingsVotingDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsVotingDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsVotingDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsVotingDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsVotingDto[] newArray(int i) {
            return new WallPostingSettingsVotingDto[i];
        }
    }

    public WallPostingSettingsVotingDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.answerMaxLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.answersLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsVotingDto)) {
            return false;
        }
        WallPostingSettingsVotingDto wallPostingSettingsVotingDto = (WallPostingSettingsVotingDto) obj;
        return epx.f(this.questionMaxLength, wallPostingSettingsVotingDto.questionMaxLength) && epx.f(this.answerMaxLength, wallPostingSettingsVotingDto.answerMaxLength) && epx.f(this.answersLimit, wallPostingSettingsVotingDto.answersLimit);
    }

    public final Integer f() {
        return this.questionMaxLength;
    }

    public final int hashCode() {
        Integer num = this.questionMaxLength;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.answerMaxLength;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.answersLimit;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingSettingsVotingDto(questionMaxLength=");
        sb.append(this.questionMaxLength);
        sb.append(", answerMaxLength=");
        sb.append(this.answerMaxLength);
        sb.append(", answersLimit=");
        return uqi.b(sb, this.answersLimit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.questionMaxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.answerMaxLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.answersLimit;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public WallPostingSettingsVotingDto(Integer num, Integer num2, Integer num3) {
        this.questionMaxLength = num;
        this.answerMaxLength = num2;
        this.answersLimit = num3;
    }

    public /* synthetic */ WallPostingSettingsVotingDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
