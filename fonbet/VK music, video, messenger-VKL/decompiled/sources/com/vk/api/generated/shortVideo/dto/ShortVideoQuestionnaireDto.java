package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ShortVideoQuestionnaireDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoQuestionnaireDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoQuestionnaireDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("questions")
    private final List<ShortVideoQuestionnaireQuestionDto> questions;

    @pmi0("start_question_code")
    private final String startQuestionCode;

    @pmi0("triggers")
    private final List<ShortVideoQuestionnaireTriggerDto> triggers;

    /* compiled from: ShortVideoQuestionnaireDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(ShortVideoQuestionnaireDto.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(ShortVideoQuestionnaireDto.class, parcel, arrayList2, i, 1);
            }
            return new ShortVideoQuestionnaireDto(readString, readString2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireDto[] newArray(int i) {
            return new ShortVideoQuestionnaireDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoQuestionnaireDto(String str, String str2, List<? extends ShortVideoQuestionnaireQuestionDto> list, List<? extends ShortVideoQuestionnaireTriggerDto> list2) {
        this.id = str;
        this.startQuestionCode = str2;
        this.questions = list;
        this.triggers = list2;
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
        if (!(obj instanceof ShortVideoQuestionnaireDto)) {
            return false;
        }
        ShortVideoQuestionnaireDto shortVideoQuestionnaireDto = (ShortVideoQuestionnaireDto) obj;
        return epx.f(this.id, shortVideoQuestionnaireDto.id) && epx.f(this.startQuestionCode, shortVideoQuestionnaireDto.startQuestionCode) && epx.f(this.questions, shortVideoQuestionnaireDto.questions) && epx.f(this.triggers, shortVideoQuestionnaireDto.triggers);
    }

    public final List<ShortVideoQuestionnaireTriggerDto> f() {
        return this.triggers;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.triggers.hashCode() + fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.startQuestionCode), 31, this.questions);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireDto(id=");
        sb.append(this.id);
        sb.append(", startQuestionCode=");
        sb.append(this.startQuestionCode);
        sb.append(", questions=");
        sb.append(this.questions);
        sb.append(", triggers=");
        return ms9.a(')', sb, this.triggers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.startQuestionCode);
        Iterator a2 = ao.a(parcel, this.questions);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.triggers);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
