package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: QuestionDto.kt */
/* loaded from: classes17.dex */
public final class QuestionDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionDto> CREATOR = new a();
    public final String b;
    public final String c;
    public final QuestionLayoutDto d;
    public final List<QuestionValueDto> e;
    public final List<QuestionTargetDto> f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionDto a(Serializer serializer) {
            return new QuestionDto(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionDto[i];
        }
    }

    public QuestionDto(String str, String str2, QuestionLayoutDto questionLayoutDto, List<QuestionValueDto> list, List<QuestionTargetDto> list2) {
        this.b = str;
        this.c = str2;
        this.d = questionLayoutDto;
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
        if (!(obj instanceof QuestionDto)) {
            return false;
        }
        QuestionDto questionDto = (QuestionDto) obj;
        return epx.f(this.b, questionDto.b) && epx.f(this.c, questionDto.c) && epx.f(this.d, questionDto.d) && epx.f(this.e, questionDto.e) && epx.f(this.f, questionDto.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31;
        List<QuestionValueDto> list = this.e;
        return this.f.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionDto(type=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", layout=");
        sb.append(this.d);
        sb.append(", values=");
        sb.append(this.e);
        sb.append(", targets=");
        return ms9.a(')', sb, this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QuestionDto(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r7 == null ? EmptyList.b : r7);
        String H = serializer.H();
        String H2 = serializer.H();
        QuestionLayoutDto questionLayoutDto = (QuestionLayoutDto) serializer.G(QuestionLayoutDto.class.getClassLoader());
        ArrayList k = serializer.k(QuestionValueDto.class);
        List k2 = serializer.k(QuestionTargetDto.class);
    }
}
