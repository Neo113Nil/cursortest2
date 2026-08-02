package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.tn;

/* compiled from: StickersBonusResult.kt */
/* loaded from: classes18.dex */
public final class StickersBonusResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusResult> CREATOR = new b();
    public final boolean b;
    public final StickersBonusBalance c;
    public final List<StickersBonus> d;
    public final Boolean e;

    /* compiled from: StickersBonusResult.kt */
    public static final class a {
        public static StickersBonusResult a(JSONObject jSONObject) {
            ArrayList arrayList;
            boolean optBoolean = jSONObject.optBoolean("is_enabled");
            Serializer.c<StickersBonusBalance> cVar = StickersBonusBalance.CREATOR;
            StickersBonusBalance a = StickersBonusBalance.a.a(jSONObject.getJSONObject("balance"));
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new StickersBonus(optJSONObject.getInt("value"), Long.valueOf(optJSONObject.optLong("expire_period") * 1000)));
                    }
                }
            } else {
                arrayList = null;
            }
            return new StickersBonusResult(optBoolean, a, arrayList, f370.q(jSONObject, "is_enabled_checkbox_value"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickersBonusResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusResult a(Serializer serializer) {
            return new StickersBonusResult(serializer.m(), (StickersBonusBalance) serializer.G(StickersBonusBalance.class.getClassLoader()), serializer.k(StickersBonus.class), serializer.n());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusResult[i];
        }
    }

    public StickersBonusResult(boolean z, StickersBonusBalance stickersBonusBalance, List<StickersBonus> list, Boolean bool) {
        this.b = z;
        this.c = stickersBonusBalance;
        this.d = list;
        this.e = bool;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.i0(this.c);
        serializer.o0(this.d);
        serializer.J(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusResult)) {
            return false;
        }
        StickersBonusResult stickersBonusResult = (StickersBonusResult) obj;
        return this.b == stickersBonusResult.b && epx.f(this.c, stickersBonusResult.c) && epx.f(this.d, stickersBonusResult.d) && epx.f(this.e, stickersBonusResult.e);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31, this.d);
        Boolean bool = this.e;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusResult(isEnabled=");
        sb.append(this.b);
        sb.append(", balance=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", isEnabledCheckboxValue=");
        return tn.a(sb, this.e, ')');
    }
}
