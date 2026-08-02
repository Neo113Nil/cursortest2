package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoriesQuestionDto.kt */
/* loaded from: classes15.dex */
public final class StoriesQuestionDto implements Parcelable {
    public static final Parcelable.Creator<StoriesQuestionDto> CREATOR = new a();

    @pmi0("date")
    private final Integer date;

    @pmi0("id")
    private final int id;

    @pmi0("is_anonymous")
    private final boolean isAnonymous;

    @pmi0("is_owner_blocked")
    private final Boolean isOwnerBlocked;

    @pmi0("is_published")
    private final Boolean isPublished;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("question")
    private final String question;

    @pmi0("with_mention")
    private final Boolean withMention;

    /* compiled from: StoriesQuestionDto.kt */
    public static final class a implements Parcelable.Creator<StoriesQuestionDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesQuestionDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z2);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z2);
            }
            UserId userId = (UserId) parcel.readParcelable(StoriesQuestionDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() == 0 ? z2 : true);
            }
            return new StoriesQuestionDto(readInt, z, readString, valueOf, valueOf2, userId, valueOf3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesQuestionDto[] newArray(int i) {
            return new StoriesQuestionDto[i];
        }
    }

    public StoriesQuestionDto(int i, boolean z, String str, Boolean bool, Boolean bool2, UserId userId, Boolean bool3, Integer num) {
        this.id = i;
        this.isAnonymous = z;
        this.question = str;
        this.isPublished = bool;
        this.withMention = bool2;
        this.ownerId = userId;
        this.isOwnerBlocked = bool3;
        this.date = num;
    }

    public final Integer d() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.question;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesQuestionDto)) {
            return false;
        }
        StoriesQuestionDto storiesQuestionDto = (StoriesQuestionDto) obj;
        return this.id == storiesQuestionDto.id && this.isAnonymous == storiesQuestionDto.isAnonymous && epx.f(this.question, storiesQuestionDto.question) && epx.f(this.isPublished, storiesQuestionDto.isPublished) && epx.f(this.withMention, storiesQuestionDto.withMention) && epx.f(this.ownerId, storiesQuestionDto.ownerId) && epx.f(this.isOwnerBlocked, storiesQuestionDto.isOwnerBlocked) && epx.f(this.date, storiesQuestionDto.date);
    }

    public final Boolean f() {
        return this.withMention;
    }

    public final boolean g() {
        return this.isAnonymous;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(Integer.hashCode(this.id) * 31, 31, this.isAnonymous), 31, this.question);
        Boolean bool = this.isPublished;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.withMention;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool3 = this.isOwnerBlocked;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.date;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isOwnerBlocked;
    }

    public final Boolean j() {
        return this.isPublished;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesQuestionDto(id=");
        sb.append(this.id);
        sb.append(", isAnonymous=");
        sb.append(this.isAnonymous);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", isPublished=");
        sb.append(this.isPublished);
        sb.append(", withMention=");
        sb.append(this.withMention);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", isOwnerBlocked=");
        sb.append(this.isOwnerBlocked);
        sb.append(", date=");
        return uqi.b(sb, this.date, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.isAnonymous ? 1 : 0);
        parcel.writeString(this.question);
        Boolean bool = this.isPublished;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.withMention;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.ownerId, i);
        Boolean bool3 = this.isOwnerBlocked;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ StoriesQuestionDto(int i, boolean z, String str, Boolean bool, Boolean bool2, UserId userId, Boolean bool3, Integer num, int i2, zcl zclVar) {
        this(i, z, str, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : userId, (i2 & 64) != 0 ? null : bool3, (i2 & 128) != 0 ? null : num);
    }
}
