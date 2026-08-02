package com.vk.api.generated.questions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: QuestionsQuestionDto.kt */
/* loaded from: classes15.dex */
public final class QuestionsQuestionDto implements Parcelable {
    public static final Parcelable.Creator<QuestionsQuestionDto> CREATOR = new a();

    @pmi0("can_send_message")
    private final Boolean canSendMessage;

    @pmi0("date")
    private final Integer date;

    @pmi0("id")
    private final int id;

    @pmi0("is_anonymous")
    private final Boolean isAnonymous;

    @pmi0("is_author_blocked")
    private final Boolean isAuthorBlocked;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("message_sended")
    private final Integer messageSended;

    @pmi0("processed")
    private final Boolean processed;

    @pmi0("story")
    private final StoriesStoryDto story;

    @pmi0("text")
    private final String text;

    @pmi0("user_id_from")
    private final UserId userIdFrom;

    @pmi0("user_id_to")
    private final UserId userIdTo;

    /* compiled from: QuestionsQuestionDto.kt */
    public static final class a implements Parcelable.Creator<QuestionsQuestionDto> {
        @Override // android.os.Parcelable.Creator
        public final QuestionsQuestionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(QuestionsQuestionDto.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(QuestionsQuestionDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QuestionsQuestionDto(readInt, userId, userId2, readString, valueOf, valueOf2, valueOf6, valueOf3, valueOf4, valueOf5, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (StoriesStoryDto) parcel.readParcelable(QuestionsQuestionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionsQuestionDto[] newArray(int i) {
            return new QuestionsQuestionDto[i];
        }
    }

    public QuestionsQuestionDto(int i, UserId userId, UserId userId2, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, StoriesStoryDto storiesStoryDto) {
        this.id = i;
        this.userIdFrom = userId;
        this.userIdTo = userId2;
        this.text = str;
        this.isAnonymous = bool;
        this.canSendMessage = bool2;
        this.date = num;
        this.processed = bool3;
        this.isNew = bool4;
        this.isAuthorBlocked = bool5;
        this.messageSended = num2;
        this.story = storiesStoryDto;
    }

    public static QuestionsQuestionDto a(QuestionsQuestionDto questionsQuestionDto, Boolean bool) {
        int i = questionsQuestionDto.id;
        UserId userId = questionsQuestionDto.userIdFrom;
        UserId userId2 = questionsQuestionDto.userIdTo;
        String str = questionsQuestionDto.text;
        Boolean bool2 = questionsQuestionDto.isAnonymous;
        Boolean bool3 = questionsQuestionDto.canSendMessage;
        Integer num = questionsQuestionDto.date;
        Boolean bool4 = questionsQuestionDto.processed;
        Boolean bool5 = questionsQuestionDto.isNew;
        Integer num2 = questionsQuestionDto.messageSended;
        StoriesStoryDto storiesStoryDto = questionsQuestionDto.story;
        questionsQuestionDto.getClass();
        return new QuestionsQuestionDto(i, userId, userId2, str, bool2, bool3, num, bool4, bool5, bool, num2, storiesStoryDto);
    }

    public final Integer d() {
        return this.messageSended;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StoriesStoryDto e() {
        return this.story;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionsQuestionDto)) {
            return false;
        }
        QuestionsQuestionDto questionsQuestionDto = (QuestionsQuestionDto) obj;
        return this.id == questionsQuestionDto.id && epx.f(this.userIdFrom, questionsQuestionDto.userIdFrom) && epx.f(this.userIdTo, questionsQuestionDto.userIdTo) && epx.f(this.text, questionsQuestionDto.text) && epx.f(this.isAnonymous, questionsQuestionDto.isAnonymous) && epx.f(this.canSendMessage, questionsQuestionDto.canSendMessage) && epx.f(this.date, questionsQuestionDto.date) && epx.f(this.processed, questionsQuestionDto.processed) && epx.f(this.isNew, questionsQuestionDto.isNew) && epx.f(this.isAuthorBlocked, questionsQuestionDto.isAuthorBlocked) && epx.f(this.messageSended, questionsQuestionDto.messageSended) && epx.f(this.story, questionsQuestionDto.story);
    }

    public final String f() {
        return this.text;
    }

    public final UserId g() {
        return this.userIdFrom;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.userIdFrom.b), 31, this.userIdTo.b);
        String str = this.text;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAnonymous;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canSendMessage;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.date;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.processed;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNew;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isAuthorBlocked;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num2 = this.messageSended;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StoriesStoryDto storiesStoryDto = this.story;
        return hashCode8 + (storiesStoryDto != null ? storiesStoryDto.hashCode() : 0);
    }

    public final UserId i() {
        return this.userIdTo;
    }

    public final Boolean j() {
        return this.isAnonymous;
    }

    public final Boolean k() {
        return this.isAuthorBlocked;
    }

    public final Boolean l() {
        return this.isNew;
    }

    public final String toString() {
        return "QuestionsQuestionDto(id=" + this.id + ", userIdFrom=" + this.userIdFrom + ", userIdTo=" + this.userIdTo + ", text=" + this.text + ", isAnonymous=" + this.isAnonymous + ", canSendMessage=" + this.canSendMessage + ", date=" + this.date + ", processed=" + this.processed + ", isNew=" + this.isNew + ", isAuthorBlocked=" + this.isAuthorBlocked + ", messageSended=" + this.messageSended + ", story=" + this.story + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.userIdFrom, i);
        parcel.writeParcelable(this.userIdTo, i);
        parcel.writeString(this.text);
        Boolean bool = this.isAnonymous;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canSendMessage;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool3 = this.processed;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isNew;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isAuthorBlocked;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Integer num2 = this.messageSended;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.story, i);
    }

    public /* synthetic */ QuestionsQuestionDto(int i, UserId userId, UserId userId2, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, StoriesStoryDto storiesStoryDto, int i2, zcl zclVar) {
        this(i, userId, userId2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : bool4, (i2 & 512) != 0 ? null : bool5, (i2 & 1024) != 0 ? null : num2, (i2 & 2048) != 0 ? null : storiesStoryDto);
    }
}
