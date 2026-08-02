package com.vk.clips.internal.nps.api.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.urd0;

/* compiled from: InternalNpsQuestion.kt */
/* loaded from: classes16.dex */
public final class InternalNpsQuestion extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<InternalNpsQuestion> CREATOR = new a();
    public final QuestionType b;
    public final String c;
    public final InternalNpsQuestionLayout d;
    public final List<InternalNpsQuestionValue> e;
    public final List<InternalNpsQuestionTarget> f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InternalNpsQuestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InternalNpsQuestion a(Serializer serializer) {
            return new InternalNpsQuestion(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalNpsQuestion[i];
        }
    }

    public InternalNpsQuestion(QuestionType questionType, String str, InternalNpsQuestionLayout internalNpsQuestionLayout, List<InternalNpsQuestionValue> list, List<InternalNpsQuestionTarget> list2) {
        this.b = questionType;
        this.c = str;
        this.d = internalNpsQuestionLayout;
        this.e = list;
        this.f = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.name());
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.f0(this.e);
        serializer.f0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalNpsQuestion)) {
            return false;
        }
        InternalNpsQuestion internalNpsQuestion = (InternalNpsQuestion) obj;
        return this.b == internalNpsQuestion.b && epx.f(this.c, internalNpsQuestion.c) && epx.f(this.d, internalNpsQuestion.d) && epx.f(this.e, internalNpsQuestion.e) && epx.f(this.f, internalNpsQuestion.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.a((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalNpsQuestion(type=");
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

    public InternalNpsQuestion(Serializer serializer) {
        this(QuestionType.valueOf(serializer.H()), serializer.H(), (InternalNpsQuestionLayout) serializer.G(InternalNpsQuestionLayout.class.getClassLoader()), serializer.B(InternalNpsQuestionValue.class.getClassLoader()), serializer.B(InternalNpsQuestionTarget.class.getClassLoader()));
    }
}
