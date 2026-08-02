package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import xsna.zcl;

/* compiled from: StoryAnswer.kt */
/* loaded from: classes18.dex */
public final class StoryAnswer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryAnswer> CREATOR = new a();
    public final UserId b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final UserProfile g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final StoryOwner k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryAnswer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryAnswer a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            int u = serializer.u();
            int u2 = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new StoryAnswer(userId, u, u2, H, H2 != null ? H2 : "", (UserProfile) serializer.G(UserProfile.class.getClassLoader()), serializer.u(), serializer.m(), serializer.m(), (StoryOwner) serializer.A(StoryOwner.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryAnswer[i];
        }
    }

    public /* synthetic */ StoryAnswer(UserId userId, int i, int i2, String str, String str2, UserProfile userProfile, int i3, boolean z, boolean z2, StoryOwner storyOwner, int i4, zcl zclVar) {
        this(userId, i, i2, str, str2, (i4 & 32) != 0 ? null : userProfile, i3, z, z2, (i4 & 512) != 0 ? null : storyOwner);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.S(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.e0(this.k);
    }

    public StoryAnswer(UserId userId, int i, int i2, String str, String str2, UserProfile userProfile, int i3, boolean z, boolean z2, StoryOwner storyOwner) {
        this.b = userId;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = userProfile;
        this.h = i3;
        this.i = z;
        this.j = z2;
        this.k = storyOwner;
    }
}
