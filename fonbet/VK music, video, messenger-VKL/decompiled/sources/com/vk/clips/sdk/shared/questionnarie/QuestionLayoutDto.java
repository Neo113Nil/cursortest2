package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: QuestionLayoutDto.kt */
/* loaded from: classes17.dex */
public final class QuestionLayoutDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionLayoutDto> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionLayoutDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionLayoutDto a(Serializer serializer) {
            return new QuestionLayoutDto(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionLayoutDto[i];
        }
    }

    public QuestionLayoutDto(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionLayoutDto)) {
            return false;
        }
        QuestionLayoutDto questionLayoutDto = (QuestionLayoutDto) obj;
        return epx.f(this.b, questionLayoutDto.b) && epx.f(this.c, questionLayoutDto.c) && epx.f(this.d, questionLayoutDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionLayoutDto(text=");
        sb.append(this.b);
        sb.append(", like=");
        sb.append(this.c);
        sb.append(", dislike=");
        return ho8.a(sb, this.d, ')');
    }

    public QuestionLayoutDto(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H());
    }
}
