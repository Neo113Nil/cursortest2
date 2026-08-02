package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: StoryQuestionEntry.kt */
/* loaded from: classes18.dex */
public final class StoryQuestionEntry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryQuestionEntry> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final UserProfile g;
    public final boolean h;
    public final boolean i;
    public final int j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryQuestionEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryQuestionEntry a(Serializer serializer) {
            return new StoryQuestionEntry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryQuestionEntry[i];
        }
    }

    public StoryQuestionEntry(int i, UserId userId, String str, boolean z, boolean z2, UserProfile userProfile, boolean z3, boolean z4, int i2) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = userProfile;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static StoryQuestionEntry zb(StoryQuestionEntry storyQuestionEntry, boolean z) {
        int i = storyQuestionEntry.b;
        UserId userId = storyQuestionEntry.c;
        String str = storyQuestionEntry.d;
        boolean z2 = storyQuestionEntry.e;
        UserProfile userProfile = storyQuestionEntry.g;
        boolean z3 = storyQuestionEntry.h;
        boolean z4 = storyQuestionEntry.i;
        int i2 = storyQuestionEntry.j;
        storyQuestionEntry.getClass();
        return new StoryQuestionEntry(i, userId, str, z2, z, userProfile, z3, z4, i2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.S(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryQuestionEntry)) {
            return false;
        }
        StoryQuestionEntry storyQuestionEntry = (StoryQuestionEntry) obj;
        return this.b == storyQuestionEntry.b && epx.f(this.c, storyQuestionEntry.c) && epx.f(this.d, storyQuestionEntry.d) && this.e == storyQuestionEntry.e && this.f == storyQuestionEntry.f && epx.f(this.g, storyQuestionEntry.g) && this.h == storyQuestionEntry.h && this.i == storyQuestionEntry.i && this.j == storyQuestionEntry.j;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        UserId userId = this.c;
        int b = qoy.b(qoy.b(urd0.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.d), 31, this.e), 31, this.f);
        UserProfile userProfile = this.g;
        return Integer.hashCode(this.j) + qoy.b(qoy.b((b + (userProfile != null ? userProfile.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryQuestionEntry(questionId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", question=");
        sb.append(this.d);
        sb.append(", isAnonymous=");
        sb.append(this.e);
        sb.append(", isOwnerBlocked=");
        sb.append(this.f);
        sb.append(", profile=");
        sb.append(this.g);
        sb.append(", isPublished=");
        sb.append(this.h);
        sb.append(", withMention=");
        sb.append(this.i);
        sb.append(", date=");
        return vu5.b(sb, this.j, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryQuestionEntry(Serializer serializer) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r11 != null ? r11.intValue() : 0);
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        String str = H == null ? "" : H;
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        UserProfile userProfile = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        Integer v = serializer.v();
    }
}
