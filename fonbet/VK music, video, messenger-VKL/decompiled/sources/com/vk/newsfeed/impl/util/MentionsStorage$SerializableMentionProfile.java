package com.vk.newsfeed.impl.util;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.b420;

/* compiled from: MentionsStorage.kt */
/* loaded from: classes4.dex */
final class MentionsStorage$SerializableMentionProfile extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MentionsStorage$SerializableMentionProfile> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MentionsStorage$SerializableMentionProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MentionsStorage$SerializableMentionProfile a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            return new MentionsStorage$SerializableMentionProfile(userId, H, H2, H3 != null ? H3 : "", serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MentionsStorage$SerializableMentionProfile[i];
        }
    }

    public MentionsStorage$SerializableMentionProfile(b420 b420Var) {
        this(b420Var.a, b420Var.b, b420Var.d, b420Var.e, b420Var.f);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public MentionsStorage$SerializableMentionProfile(UserId userId, String str, String str2, String str3, boolean z) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }
}
