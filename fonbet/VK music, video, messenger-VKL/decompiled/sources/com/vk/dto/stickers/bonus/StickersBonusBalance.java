package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.epx;
import xsna.f370;
import xsna.p1d0;
import xsna.shy;
import xsna.uqi;

/* compiled from: StickersBonusBalance.kt */
/* loaded from: classes18.dex */
public final class StickersBonusBalance extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusBalance> CREATOR = new b();
    public final int b;
    public final Long c;
    public final Integer d;
    public final int e;
    public final Integer f;
    public final bpn0 g = new bpn0(new p1d0(this, 15));

    /* compiled from: StickersBonusBalance.kt */
    public static final class a {
        public static StickersBonusBalance a(JSONObject jSONObject) {
            Long z = f370.z(jSONObject, "next_expire_timestamp");
            int optInt = jSONObject.optInt("value");
            Long valueOf = z == null ? null : Long.valueOf(z.longValue() * 1000);
            Integer x = f370.x(jSONObject, "next_expire_value");
            Integer x2 = f370.x(jSONObject, "rewards_total_price");
            return new StickersBonusBalance(optInt, valueOf, x, x2 != null ? x2.intValue() : 1000, f370.x(jSONObject, "rewards_min_price"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickersBonusBalance> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusBalance a(Serializer serializer) {
            return new StickersBonusBalance(serializer.u(), serializer.x(), serializer.v(), serializer.u(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusBalance[i];
        }
    }

    public StickersBonusBalance(int i, Long l, Integer num, int i2, Integer num2) {
        this.b = i;
        this.c = l;
        this.d = num;
        this.e = i2;
        this.f = num2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.b0(this.c);
        serializer.V(this.d);
        serializer.S(this.e);
        serializer.V(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusBalance)) {
            return false;
        }
        StickersBonusBalance stickersBonusBalance = (StickersBonusBalance) obj;
        return this.b == stickersBonusBalance.b && epx.f(this.c, stickersBonusBalance.c) && epx.f(this.d, stickersBonusBalance.d) && this.e == stickersBonusBalance.e && epx.f(this.f, stickersBonusBalance.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.d;
        int a2 = shy.a(this.e, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f;
        return a2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusBalance(value=");
        sb.append(this.b);
        sb.append(", nextExpireTimestamp=");
        sb.append(this.c);
        sb.append(", nextExpireValue=");
        sb.append(this.d);
        sb.append(", rewardsTotalPrice=");
        sb.append(this.e);
        sb.append(", rewardsMinPrice=");
        return uqi.b(sb, this.f, ')');
    }
}
