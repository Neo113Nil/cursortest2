package com.vk.dto.reactions;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: ReactionMeta.kt */
/* loaded from: classes18.dex */
public final class BadgeMeta extends ReactionMeta implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgeMeta> CREATOR = new a();
    public final int f;
    public final String g;
    public final Integer h;
    public final ReactionAsset i;
    public final int j;
    public final boolean k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgeMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgeMeta a(Serializer serializer) {
            return new BadgeMeta(serializer.u(), serializer.H(), null, (ReactionAsset) serializer.G(ReactionAsset.class.getClassLoader()), serializer.u(), serializer.m(), 4, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgeMeta[i];
        }
    }

    public /* synthetic */ BadgeMeta(int i, String str, Integer num, ReactionAsset reactionAsset, int i2, boolean z, int i3, zcl zclVar) {
        this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : reactionAsset, (i3 & 16) != 0 ? 1 : i2, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.i0(this.i);
        serializer.S(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.reactions.ReactionMeta
    public final ReactionAsset d() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeMeta)) {
            return false;
        }
        BadgeMeta badgeMeta = (BadgeMeta) obj;
        return this.f == badgeMeta.f && epx.f(this.g, badgeMeta.g) && epx.f(this.h, badgeMeta.h) && epx.f(this.i, badgeMeta.i) && this.j == badgeMeta.j && this.k == badgeMeta.k;
    }

    @Override // com.vk.dto.reactions.ReactionMeta
    public final int f() {
        return this.j;
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
        Integer num = this.h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ReactionAsset reactionAsset = this.i;
        return Boolean.hashCode(this.k) + shy.a(this.j, (hashCode3 + (reactionAsset != null ? reactionAsset.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgeMeta(id=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", titleResId=");
        sb.append(this.h);
        sb.append(", asset=");
        sb.append(this.i);
        sb.append(", score=");
        sb.append(this.j);
        sb.append(", isDisabled=");
        return q0.a(sb, this.k, ')');
    }

    public BadgeMeta(int i, String str, Integer num, ReactionAsset reactionAsset, int i2, boolean z) {
        super(i, str, reactionAsset, i2, null);
        this.f = i;
        this.g = str;
        this.h = num;
        this.i = reactionAsset;
        this.j = i2;
        this.k = z;
    }
}
