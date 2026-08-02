package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: QuestionnaireDto.kt */
/* loaded from: classes17.dex */
public final class QuestionnaireDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionnaireDto> CREATOR = new a();
    public final String b;
    public final String c;
    public final QuestionRootLayoutDto d;
    public final List<QuestionDto> e;
    public final List<QuestionnaireTriggerDto> f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionnaireDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionnaireDto a(Serializer serializer) {
            return new QuestionnaireDto(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionnaireDto[i];
        }
    }

    public QuestionnaireDto(String str, String str2, QuestionRootLayoutDto questionRootLayoutDto, List<QuestionDto> list, List<QuestionnaireTriggerDto> list2) {
        this.b = str;
        this.c = str2;
        this.d = questionRootLayoutDto;
        this.e = list;
        this.f = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.W(this.e);
        serializer.W(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionnaireDto)) {
            return false;
        }
        QuestionnaireDto questionnaireDto = (QuestionnaireDto) obj;
        return epx.f(this.b, questionnaireDto.b) && epx.f(this.c, questionnaireDto.c) && epx.f(this.d, questionnaireDto.d) && epx.f(this.e, questionnaireDto.e) && epx.f(this.f, questionnaireDto.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        QuestionRootLayoutDto questionRootLayoutDto = this.d;
        return this.f.hashCode() + fw3.a((a2 + (questionRootLayoutDto == null ? 0 : questionRootLayoutDto.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionnaireDto(id=");
        sb.append(this.b);
        sb.append(", startQuestionCode=");
        sb.append(this.c);
        sb.append(", layout=");
        sb.append(this.d);
        sb.append(", questions=");
        sb.append(this.e);
        sb.append(", triggers=");
        return ms9.a(')', sb, this.f);
    }

    public QuestionnaireDto(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), (QuestionRootLayoutDto) serializer.G(QuestionRootLayoutDto.class.getClassLoader()), serializer.k(QuestionDto.class), serializer.k(QuestionnaireTriggerDto.class));
    }
}
