package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.iq;

/* compiled from: StickersBonus.kt */
/* loaded from: classes18.dex */
public final class StickersBonus extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonus> CREATOR = new a();
    public final int b;
    public final Long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersBonus> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonus a(Serializer serializer) {
            return new StickersBonus(serializer.u(), serializer.x());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonus[i];
        }
    }

    public StickersBonus(int i, Long l) {
        this.b = i;
        this.c = l;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.b0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonus)) {
            return false;
        }
        StickersBonus stickersBonus = (StickersBonus) obj;
        return this.b == stickersBonus.b && epx.f(this.c, stickersBonus.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Long l = this.c;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonus(value=");
        sb.append(this.b);
        sb.append(", expirePeriod=");
        return iq.b(sb, this.c, ')');
    }
}
