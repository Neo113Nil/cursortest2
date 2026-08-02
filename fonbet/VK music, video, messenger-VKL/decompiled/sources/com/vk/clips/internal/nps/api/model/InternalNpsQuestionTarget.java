package com.vk.clips.internal.nps.api.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: InternalNpsQuestionTarget.kt */
/* loaded from: classes16.dex */
public final class InternalNpsQuestionTarget extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<InternalNpsQuestionTarget> CREATOR = new a();
    public final String b;
    public final List<String> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InternalNpsQuestionTarget> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InternalNpsQuestionTarget a(Serializer serializer) {
            return new InternalNpsQuestionTarget(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalNpsQuestionTarget[i];
        }
    }

    public InternalNpsQuestionTarget(String str, List<String> list) {
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
        if (!(obj instanceof InternalNpsQuestionTarget)) {
            return false;
        }
        InternalNpsQuestionTarget internalNpsQuestionTarget = (InternalNpsQuestionTarget) obj;
        return epx.f(this.b, internalNpsQuestionTarget.b) && epx.f(this.c, internalNpsQuestionTarget.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalNpsQuestionTarget(nextQuestionCode=");
        sb.append(this.b);
        sb.append(", values=");
        return ms9.a(')', sb, this.c);
    }

    public InternalNpsQuestionTarget(Serializer serializer) {
        this(serializer.H(), com.vk.core.serialize.a.a(serializer));
    }
}
