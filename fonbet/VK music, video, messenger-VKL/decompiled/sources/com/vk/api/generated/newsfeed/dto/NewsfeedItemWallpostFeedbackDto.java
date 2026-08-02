package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedItemWallpostFeedbackDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemWallpostFeedbackDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemWallpostFeedbackDto> CREATOR = new a();

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

    /* compiled from: NewsfeedItemWallpostFeedbackDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemWallpostFeedbackDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostFeedbackDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            NewsfeedItemWallpostFeedbackTypeDto createFromParcel = NewsfeedItemWallpostFeedbackTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(NewsfeedItemWallpostFeedbackAnswerDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new NewsfeedItemWallpostFeedbackDto(createFromParcel, readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostFeedbackDto[] newArray(int i) {
            return new NewsfeedItemWallpostFeedbackDto[i];
        }
    }

    public NewsfeedItemWallpostFeedbackDto(NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto, String str, List<NewsfeedItemWallpostFeedbackAnswerDto> list, Integer num, List<String> list2, String str2, String str3) {
        this.type = newsfeedItemWallpostFeedbackTypeDto;
        this.question = str;
        this.answers = list;
        this.starsCount = num;
        this.descriptions = list2;
        this.gratitude = str2;
        this.trackCode = str3;
    }

    public final List<NewsfeedItemWallpostFeedbackAnswerDto> d() {
        return this.answers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.descriptions;
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

    public final String f() {
        return this.gratitude;
    }

    public final String g() {
        return this.question;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.question);
        List<NewsfeedItemWallpostFeedbackAnswerDto> list = this.answers;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.starsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.descriptions;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.gratitude;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Integer i() {
        return this.starsCount;
    }

    public final NewsfeedItemWallpostFeedbackTypeDto j() {
        return this.type;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemWallpostFeedbackDto(type=");
        sb.append(this.type);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", answers=");
        sb.append(this.answers);
        sb.append(", starsCount=");
        sb.append(this.starsCount);
        sb.append(", descriptions=");
        sb.append(this.descriptions);
        sb.append(", gratitude=");
        sb.append(this.gratitude);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.question);
        List<NewsfeedItemWallpostFeedbackAnswerDto> list = this.answers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NewsfeedItemWallpostFeedbackAnswerDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.starsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.descriptions);
        parcel.writeString(this.gratitude);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ NewsfeedItemWallpostFeedbackDto(NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto, String str, List list, Integer num, List list2, String str2, String str3, int i, zcl zclVar) {
        this(newsfeedItemWallpostFeedbackTypeDto, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
