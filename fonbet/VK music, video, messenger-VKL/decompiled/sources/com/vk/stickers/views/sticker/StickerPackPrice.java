package com.vk.stickers.views.sticker;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;

/* compiled from: StickerPackPrice.kt */
/* loaded from: classes6.dex */
public final class StickerPackPrice extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerPackPrice> CREATOR = new a();
    public final int b;
    public final Integer c;
    public final Integer d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerPackPrice> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerPackPrice a(Serializer serializer) {
            return new StickerPackPrice(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerPackPrice[i];
        }
    }

    public StickerPackPrice(int i, Integer num, Integer num2) {
        this.b = i;
        this.c = num;
        this.d = num2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.V(this.c);
        serializer.V(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackPrice)) {
            return false;
        }
        StickerPackPrice stickerPackPrice = (StickerPackPrice) obj;
        return this.b == stickerPackPrice.b && epx.f(this.c, stickerPackPrice.c) && epx.f(this.d, stickerPackPrice.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackPrice(current=");
        sb.append(this.b);
        sb.append(", regular=");
        sb.append(this.c);
        sb.append(", discount=");
        return uqi.b(sb, this.d, ')');
    }

    public StickerPackPrice(Serializer serializer) {
        this(serializer.u(), serializer.v(), serializer.v());
    }
}
