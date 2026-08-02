package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ShortVideoFeedQuestionnaireDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFeedQuestionnaireDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFeedQuestionnaireDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("questions")
    private final List<ShortVideoQuestionnaireQuestionDto> questions;

    @pmi0("start_question_code")
    private final String startQuestionCode;

    /* compiled from: ShortVideoFeedQuestionnaireDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFeedQuestionnaireDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedQuestionnaireDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoFeedQuestionnaireDto.class, parcel, arrayList, i, 1);
            }
            return new ShortVideoFeedQuestionnaireDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedQuestionnaireDto[] newArray(int i) {
            return new ShortVideoFeedQuestionnaireDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoFeedQuestionnaireDto(String str, String str2, List<? extends ShortVideoQuestionnaireQuestionDto> list) {
        this.id = str;
        this.startQuestionCode = str2;
        this.questions = list;
    }

    public final List<ShortVideoQuestionnaireQuestionDto> d() {
        return this.questions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.startQuestionCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoFeedQuestionnaireDto)) {
            return false;
        }
        ShortVideoFeedQuestionnaireDto shortVideoFeedQuestionnaireDto = (ShortVideoFeedQuestionnaireDto) obj;
        return epx.f(this.id, shortVideoFeedQuestionnaireDto.id) && epx.f(this.startQuestionCode, shortVideoFeedQuestionnaireDto.startQuestionCode) && epx.f(this.questions, shortVideoFeedQuestionnaireDto.questions);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.questions.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.startQuestionCode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoFeedQuestionnaireDto(id=");
        sb.append(this.id);
        sb.append(", startQuestionCode=");
        sb.append(this.startQuestionCode);
        sb.append(", questions=");
        return ms9.a(')', sb, this.questions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.startQuestionCode);
        Iterator a2 = ao.a(parcel, this.questions);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
