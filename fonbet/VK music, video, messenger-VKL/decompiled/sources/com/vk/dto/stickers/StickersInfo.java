package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;

/* compiled from: StickersInfo.kt */
/* loaded from: classes18.dex */
public final class StickersInfo extends Serializer.StreamParcelableAdapter {
    public final long b;
    public final StickersBonusBalance c;
    public static final a d = new a();
    public static final Serializer.c<StickersInfo> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<StickersInfo> {
        @Override // xsna.aay
        public final StickersInfo a(JSONObject jSONObject) {
            StickersBonusBalance a;
            a aVar = StickersInfo.d;
            JSONObject optJSONObject = jSONObject.optJSONObject("bonus_balance");
            if (optJSONObject == null) {
                a = null;
            } else {
                Serializer.c<StickersBonusBalance> cVar = StickersBonusBalance.CREATOR;
                a = StickersBonusBalance.a.a(optJSONObject);
            }
            return new StickersInfo(jSONObject.optLong("id"), a);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickersInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersInfo a(Serializer serializer) {
            return new StickersInfo(serializer.w(), (StickersBonusBalance) serializer.G(StickersBonusBalance.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersInfo[i];
        }
    }

    public StickersInfo(long j, StickersBonusBalance stickersBonusBalance) {
        this.b = j;
        this.c = stickersBonusBalance;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersInfo)) {
            return false;
        }
        StickersInfo stickersInfo = (StickersInfo) obj;
        return this.b == stickersInfo.b && epx.f(this.c, stickersInfo.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        StickersBonusBalance stickersBonusBalance = this.c;
        return hashCode + (stickersBonusBalance == null ? 0 : stickersBonusBalance.hashCode());
    }

    public final String toString() {
        return "StickersInfo(id=" + this.b + ", bonusBalance=" + this.c + ')';
    }

    public final StickersBonusBalance zb() {
        return this.c;
    }
}
