package com.vk.dto.reactions;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.vu5;

/* compiled from: ReactionMeta.kt */
/* loaded from: classes18.dex */
public final class SimpleReactionMeta extends ReactionMeta implements Serializer.StreamParcelable {
    public static final Serializer.c<SimpleReactionMeta> CREATOR = new a();
    public final int f;
    public final String g;
    public final ReactionAsset h;
    public final int i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SimpleReactionMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SimpleReactionMeta a(Serializer serializer) {
            return new SimpleReactionMeta(serializer.u(), serializer.H(), (ReactionAsset) serializer.G(ReactionAsset.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleReactionMeta[i];
        }
    }

    public SimpleReactionMeta(int i, String str, ReactionAsset reactionAsset, int i2) {
        super(i, str, reactionAsset, i2, null);
        this.f = i;
        this.g = str;
        this.h = reactionAsset;
        this.i = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.S(this.i);
    }

    @Override // com.vk.dto.reactions.ReactionMeta
    public final ReactionAsset d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleReactionMeta)) {
            return false;
        }
        SimpleReactionMeta simpleReactionMeta = (SimpleReactionMeta) obj;
        return this.f == simpleReactionMeta.f && epx.f(this.g, simpleReactionMeta.g) && epx.f(this.h, simpleReactionMeta.h) && this.i == simpleReactionMeta.i;
    }

    @Override // com.vk.dto.reactions.ReactionMeta
    public final int f() {
        return this.i;
    }

    @Override // com.vk.dto.reactions.ReactionMeta
    public final int getId() {
        return this.f;
    }

    @Override // com.vk.dto.reactions.ReactionMeta
    public final String getTitle() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReactionAsset reactionAsset = this.h;
        return Integer.hashCode(this.i) + ((hashCode2 + (reactionAsset != null ? reactionAsset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleReactionMeta(id=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", asset=");
        sb.append(this.h);
        sb.append(", score=");
        return vu5.b(sb, this.i, ')');
    }
}
