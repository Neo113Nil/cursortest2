package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: StickersBonusRewardTerms.kt */
/* loaded from: classes18.dex */
public final class StickersBonusRewardTerms extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusRewardTerms> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersBonusRewardTerms> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusRewardTerms a(Serializer serializer) {
            return new StickersBonusRewardTerms(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusRewardTerms[i];
        }
    }

    public StickersBonusRewardTerms(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusRewardTerms)) {
            return false;
        }
        StickersBonusRewardTerms stickersBonusRewardTerms = (StickersBonusRewardTerms) obj;
        return epx.f(this.b, stickersBonusRewardTerms.b) && epx.f(this.c, stickersBonusRewardTerms.c);
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusRewardTerms(title=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
