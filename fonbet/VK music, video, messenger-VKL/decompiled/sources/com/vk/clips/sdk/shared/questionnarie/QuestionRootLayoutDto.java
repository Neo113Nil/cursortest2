package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: QuestionRootLayoutDto.kt */
/* loaded from: classes17.dex */
public final class QuestionRootLayoutDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionRootLayoutDto> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionRootLayoutDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionRootLayoutDto a(Serializer serializer) {
            return new QuestionRootLayoutDto(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionRootLayoutDto[i];
        }
    }

    public QuestionRootLayoutDto(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionRootLayoutDto)) {
            return false;
        }
        QuestionRootLayoutDto questionRootLayoutDto = (QuestionRootLayoutDto) obj;
        return epx.f(this.b, questionRootLayoutDto.b) && epx.f(this.c, questionRootLayoutDto.c) && epx.f(this.d, questionRootLayoutDto.d) && epx.f(this.e, questionRootLayoutDto.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionRootLayoutDto(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", completionTitle=");
        sb.append(this.d);
        sb.append(", completionText=");
        return ho8.a(sb, this.e, ')');
    }

    public QuestionRootLayoutDto(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
