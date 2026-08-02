package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;

/* compiled from: StickersBonusRewardsCatalog.kt */
/* loaded from: classes18.dex */
public final class StickersBonusRewardsCatalog extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusRewardsCatalog> CREATOR = new a();
    public final boolean b;
    public final List<StickersBonusReward> c;
    public final StickersBonusBalance d;
    public final StickerStockItemDiscounts e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersBonusRewardsCatalog> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusRewardsCatalog a(Serializer serializer) {
            boolean m = serializer.m();
            ArrayList k = serializer.k(StickersBonusReward.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new StickersBonusRewardsCatalog(m, k, (StickersBonusBalance) serializer.G(StickersBonusBalance.class.getClassLoader()), (StickerStockItemDiscounts) serializer.G(StickerStockItemDiscounts.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusRewardsCatalog[i];
        }
    }

    public StickersBonusRewardsCatalog(boolean z, List<StickersBonusReward> list, StickersBonusBalance stickersBonusBalance, StickerStockItemDiscounts stickerStockItemDiscounts, boolean z2) {
        this.b = z;
        this.c = list;
        this.d = stickersBonusBalance;
        this.e = stickerStockItemDiscounts;
        this.f = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.o0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusRewardsCatalog)) {
            return false;
        }
        StickersBonusRewardsCatalog stickersBonusRewardsCatalog = (StickersBonusRewardsCatalog) obj;
        return this.b == stickersBonusRewardsCatalog.b && epx.f(this.c, stickersBonusRewardsCatalog.c) && epx.f(this.d, stickersBonusRewardsCatalog.d) && epx.f(this.e, stickersBonusRewardsCatalog.e) && this.f == stickersBonusRewardsCatalog.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + fw3.a(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusRewardsCatalog(isEnabled=");
        sb.append(this.b);
        sb.append(", rewards=");
        sb.append(this.c);
        sb.append(", balance=");
        sb.append(this.d);
        sb.append(", userDiscounts=");
        sb.append(this.e);
        sb.append(", hasInactiveUserDiscounts=");
        return q0.a(sb, this.f, ')');
    }
}
