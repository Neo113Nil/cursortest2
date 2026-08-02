package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: QuestionTargetDto.kt */
/* loaded from: classes17.dex */
public final class QuestionTargetDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionTargetDto> CREATOR = new a();
    public final String b;
    public final List<String> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionTargetDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionTargetDto a(Serializer serializer) {
            return new QuestionTargetDto(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionTargetDto[i];
        }
    }

    public QuestionTargetDto(String str, List<String> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.l0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionTargetDto)) {
            return false;
        }
        QuestionTargetDto questionTargetDto = (QuestionTargetDto) obj;
        return epx.f(this.b, questionTargetDto.b) && epx.f(this.c, questionTargetDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionTargetDto(nextQuestionCode=");
        sb.append(this.b);
        sb.append(", values=");
        return ms9.a(')', sb, this.c);
    }

    public QuestionTargetDto(Serializer serializer, zcl zclVar) {
        this(serializer.H(), com.vk.core.serialize.a.a(serializer));
    }
}
