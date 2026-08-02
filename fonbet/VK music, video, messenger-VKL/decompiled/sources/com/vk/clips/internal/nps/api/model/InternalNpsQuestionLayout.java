package com.vk.clips.internal.nps.api.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: InternalNpsQuestionLayout.kt */
/* loaded from: classes16.dex */
public final class InternalNpsQuestionLayout extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<InternalNpsQuestionLayout> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InternalNpsQuestionLayout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InternalNpsQuestionLayout a(Serializer serializer) {
            return new InternalNpsQuestionLayout(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalNpsQuestionLayout[i];
        }
    }

    public InternalNpsQuestionLayout(String str, String str2, String str3) {
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
        if (!(obj instanceof InternalNpsQuestionLayout)) {
            return false;
        }
        InternalNpsQuestionLayout internalNpsQuestionLayout = (InternalNpsQuestionLayout) obj;
        return epx.f(this.b, internalNpsQuestionLayout.b) && epx.f(this.c, internalNpsQuestionLayout.c) && epx.f(this.d, internalNpsQuestionLayout.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalNpsQuestionLayout(text=");
        sb.append(this.b);
        sb.append(", like=");
        sb.append(this.c);
        sb.append(", dislike=");
        return ho8.a(sb, this.d, ')');
    }

    public InternalNpsQuestionLayout(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H());
    }
}
