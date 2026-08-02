package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: QuestionValueDto.kt */
/* loaded from: classes17.dex */
public final class QuestionValueDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionValueDto> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionValueDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionValueDto a(Serializer serializer) {
            return new QuestionValueDto(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionValueDto[i];
        }
    }

    public QuestionValueDto(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionValueDto)) {
            return false;
        }
        QuestionValueDto questionValueDto = (QuestionValueDto) obj;
        return epx.f(this.b, questionValueDto.b) && epx.f(this.c, questionValueDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionValueDto(value=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }

    public QuestionValueDto(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H());
    }
}
