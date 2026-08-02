package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.vu5;

/* compiled from: QuestionInfo.kt */
/* loaded from: classes18.dex */
public final class QuestionInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionInfo> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionInfo a(Serializer serializer) {
            return new QuestionInfo(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionInfo[i];
        }
    }

    public QuestionInfo(int i, UserId userId, int i2) {
        this.b = i;
        this.c = userId;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.S(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionInfo)) {
            return false;
        }
        QuestionInfo questionInfo = (QuestionInfo) obj;
        return this.b == questionInfo.b && epx.f(this.c, questionInfo.c) && this.d == questionInfo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionInfo(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", storyId=");
        return vu5.b(sb, this.d, ')');
    }

    public final String zb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.b);
        sb.append('_');
        sb.append(this.d);
        sb.append('_');
        sb.append(this.b);
        return sb.toString();
    }
}
