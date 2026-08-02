package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: StoryQuestionAnswer.kt */
/* loaded from: classes18.dex */
public final class StoryQuestionAnswer extends StoryQuestion {
    public static final Serializer.c<StoryQuestionAnswer> CREATOR = new a();
    public final Integer b;
    public final Owner c;
    public final String d;
    public final String e;
    public final boolean f;
    public final StoryOwner g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryQuestionAnswer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryQuestionAnswer a(Serializer serializer) {
            return new StoryQuestionAnswer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryQuestionAnswer[i];
        }
    }

    public /* synthetic */ StoryQuestionAnswer(Integer num, Owner owner, String str, String str2, boolean z, StoryOwner storyOwner, int i, zcl zclVar) {
        this(num, owner, str, str2, z, (i & 32) != 0 ? null : storyOwner);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.i0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryQuestionAnswer)) {
            return false;
        }
        StoryQuestionAnswer storyQuestionAnswer = (StoryQuestionAnswer) obj;
        return epx.f(this.b, storyQuestionAnswer.b) && epx.f(this.c, storyQuestionAnswer.c) && epx.f(this.d, storyQuestionAnswer.d) && epx.f(this.e, storyQuestionAnswer.e) && this.f == storyQuestionAnswer.f && epx.f(this.g, storyQuestionAnswer.g);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Owner owner = this.c;
        int hashCode2 = (hashCode + (owner == null ? 0 : owner.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b = qoy.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        StoryOwner storyOwner = this.g;
        return b + (storyOwner != null ? storyOwner.hashCode() : 0);
    }

    public final String toString() {
        return "StoryQuestionAnswer(questionId=" + this.b + ", user=" + this.c + ", question=" + this.d + ", answer=" + this.e + ", isAnonymousQuestion=" + this.f + ", owner=" + this.g + ')';
    }

    public StoryQuestionAnswer(Integer num, Owner owner, String str, String str2, boolean z, StoryOwner storyOwner) {
        super(null);
        this.b = num;
        this.c = owner;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = storyOwner;
    }

    public StoryQuestionAnswer(Serializer serializer) {
        this(serializer.v(), (Owner) serializer.G(Owner.class.getClassLoader()), serializer.H(), serializer.H(), serializer.m(), (StoryOwner) serializer.G(StoryOwner.class.getClassLoader()));
    }
}
