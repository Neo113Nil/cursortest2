package com.vk.stickers.bridge;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.Collection;
import xsna.epx;
import xsna.j5g;

/* compiled from: StickersBridge.kt */
/* loaded from: classes5.dex */
public final class GiftData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GiftData> CREATOR = new a();
    public static final GiftData d = new GiftData(null, false);
    public final Collection<UserId> b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GiftData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftData a(Serializer serializer) {
            return new GiftData(serializer.B(UserId.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftData[i];
        }
    }

    public GiftData(Collection<UserId> collection, boolean z) {
        this.b = collection;
        this.c = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Collection<UserId> collection = this.b;
        serializer.f0(collection != null ? j5g.O0(collection) : null);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftData)) {
            return false;
        }
        GiftData giftData = (GiftData) obj;
        return epx.f(this.b, giftData.b) && this.c == giftData.c;
    }

    public final int hashCode() {
        Collection<UserId> collection = this.b;
        return Boolean.hashCode(this.c) + ((collection == null ? 0 : collection.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftData(giftUserIds=");
        sb.append(this.b);
        sb.append(", needToCheckAvailability=");
        return q0.a(sb, this.c, ')');
    }
}
