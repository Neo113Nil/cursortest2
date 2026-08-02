package com.vk.clips.internal.nps.api.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: QuestionsTexts.kt */
/* loaded from: classes16.dex */
public final class QuestionsTexts extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionsTexts> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionsTexts> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionsTexts a(Serializer serializer) {
            return new QuestionsTexts(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionsTexts[i];
        }
    }

    public QuestionsTexts(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof QuestionsTexts)) {
            return false;
        }
        QuestionsTexts questionsTexts = (QuestionsTexts) obj;
        return epx.f(this.b, questionsTexts.b) && epx.f(this.c, questionsTexts.c) && epx.f(this.d, questionsTexts.d) && epx.f(this.e, questionsTexts.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionsTexts(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", completionTitle=");
        sb.append(this.d);
        sb.append(", completionMessage=");
        return ho8.a(sb, this.e, ')');
    }

    public QuestionsTexts(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
