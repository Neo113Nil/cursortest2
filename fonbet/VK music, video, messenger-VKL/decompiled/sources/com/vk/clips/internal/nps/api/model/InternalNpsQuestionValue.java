package com.vk.clips.internal.nps.api.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: InternalNpsQuestionValue.kt */
/* loaded from: classes16.dex */
public final class InternalNpsQuestionValue extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<InternalNpsQuestionValue> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InternalNpsQuestionValue> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InternalNpsQuestionValue a(Serializer serializer) {
            return new InternalNpsQuestionValue(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalNpsQuestionValue[i];
        }
    }

    public InternalNpsQuestionValue(String str, String str2) {
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
        if (!(obj instanceof InternalNpsQuestionValue)) {
            return false;
        }
        InternalNpsQuestionValue internalNpsQuestionValue = (InternalNpsQuestionValue) obj;
        return epx.f(this.b, internalNpsQuestionValue.b) && epx.f(this.c, internalNpsQuestionValue.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalNpsQuestionValue(value=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }

    public InternalNpsQuestionValue(Serializer serializer) {
        this(serializer.H(), serializer.H());
    }
}
