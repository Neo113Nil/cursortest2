package com.vk.dto.user;

import com.vk.core.serialize.Serializer;
import com.vk.dto.reactions.ReactionMeta;
import org.json.JSONObject;

/* compiled from: ReactionUserProfile.kt */
/* loaded from: classes18.dex */
public final class ReactionUserProfile extends UserProfile {
    public static final Serializer.c<ReactionUserProfile> CREATOR = new a();
    public final ReactionMeta h0;
    public boolean i0;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ReactionUserProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ReactionUserProfile a(Serializer serializer) {
            return new ReactionUserProfile(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReactionUserProfile[i];
        }
    }

    public ReactionUserProfile(ReactionMeta reactionMeta) {
        this.h0 = reactionMeta;
    }

    @Override // com.vk.dto.user.UserProfile, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.h0);
        serializer.L(this.i0 ? (byte) 1 : (byte) 0);
    }

    public ReactionUserProfile(JSONObject jSONObject, ReactionMeta reactionMeta) {
        super(jSONObject);
        this.h0 = reactionMeta;
    }

    public ReactionUserProfile(Serializer serializer) {
        super(serializer);
        this.h0 = (ReactionMeta) serializer.G(ReactionMeta.class.getClassLoader());
        this.i0 = serializer.m();
    }
}
