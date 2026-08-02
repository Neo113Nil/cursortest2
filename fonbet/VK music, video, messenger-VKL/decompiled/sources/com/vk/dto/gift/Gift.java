package com.vk.dto.gift;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.Animation;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftBaseUrlConfig;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftTheme;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.t230;
import xsna.vu5;
import xsna.zk2;

/* loaded from: classes18.dex */
public class Gift extends t230 implements Parcelable, zk2 {
    public static final Parcelable.Creator<Gift> CREATOR = new a();
    public int c;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String f;

    @Nullable
    public Integer g;
    public Boolean h;
    public List<String> i;
    public GiftAnimation j;
    public List<GiftBackground> k;
    public GiftRarity l;

    @Nullable
    public GiftBaseUrlConfig m;
    public GiftType n;

    @Nullable
    public ImageStatus o;

    @Nullable
    public ImageStatusPack p;

    @Nullable
    public GiftCard q;

    public class a implements Parcelable.Creator<Gift> {
        @Override // android.os.Parcelable.Creator
        public final Gift createFromParcel(Parcel parcel) {
            Gift gift = new Gift();
            gift.h = Boolean.FALSE;
            gift.i = new ArrayList();
            gift.j = null;
            gift.k = Collections.EMPTY_LIST;
            gift.l = null;
            gift.m = null;
            gift.n = GiftType.REGULAR;
            gift.o = null;
            gift.p = null;
            gift.q = null;
            gift.c = parcel.readInt();
            gift.d = parcel.readString();
            gift.e = parcel.readString();
            gift.f = parcel.readString();
            gift.g = (Integer) parcel.readSerializable();
            parcel.readStringList(gift.i);
            return gift;
        }

        @Override // android.os.Parcelable.Creator
        public final Gift[] newArray(int i) {
            return new Gift[i];
        }
    }

    public Gift() {
        this.h = Boolean.FALSE;
        this.i = new ArrayList();
        this.j = null;
        this.k = Collections.EMPTY_LIST;
        this.l = null;
        this.m = null;
        this.n = GiftType.REGULAR;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // xsna.zk2
    public final boolean V0() {
        GiftAnimation giftAnimation = this.j;
        return giftAnimation != null && giftAnimation.V0();
    }

    @Override // xsna.zk2
    @NonNull
    public final String a(boolean z) {
        GiftAnimation giftAnimation = this.j;
        return giftAnimation != null ? giftAnimation.a(z) : "";
    }

    @Override // xsna.zk2
    @NonNull
    public final String b(boolean z) {
        GiftAnimation giftAnimation = this.j;
        if (giftAnimation != null) {
            return giftAnimation.b(z);
        }
        return "" + this.c;
    }

    @Nullable
    public final String d(boolean z) {
        GiftTheme giftTheme = z ? GiftTheme.DARK : GiftTheme.LIGHT;
        for (GiftBackground giftBackground : this.k) {
            if (giftBackground.d == giftTheme) {
                return giftBackground.b;
            }
        }
        for (GiftBackground giftBackground2 : this.k) {
            if (giftBackground2.d == GiftTheme.UNKNOWN) {
                return giftBackground2.b;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gift gift = (Gift) obj;
        if (this.c != gift.c) {
            return false;
        }
        Integer num = this.g;
        Integer num2 = gift.g;
        return num == null ? num2 == null : num.equals(num2);
    }

    public final int hashCode() {
        int i = this.c * 31;
        Integer num = this.g;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Gift{id="), this.c, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeStringList(this.i);
    }

    public Gift(@NonNull JSONObject jSONObject) {
        this.h = Boolean.FALSE;
        this.i = new ArrayList();
        this.j = null;
        this.k = Collections.EMPTY_LIST;
        this.l = null;
        this.m = null;
        this.n = GiftType.REGULAR;
        this.o = null;
        this.p = null;
        this.q = null;
        this.c = jSONObject.optInt("id");
        this.d = jSONObject.optString("thumb_48");
        this.e = jSONObject.optString("thumb_96");
        this.f = jSONObject.optString("thumb_256");
        String optString = jSONObject.optString("keywords");
        if (optString != null && !optString.isEmpty()) {
            this.i = Arrays.asList(optString.split(StringUtils.COMMA));
        }
        this.g = Integer.valueOf(jSONObject.optInt("stickers_product_id"));
        this.h = Boolean.valueOf(jSONObject.optBoolean("is_stickers_style", false));
        String optString2 = jSONObject.optString("type");
        GiftType.Companion.getClass();
        this.n = GiftType.a.a(optString2);
        Serializer.c<ImageStatus> cVar = ImageStatus.CREATOR;
        JSONObject optJSONObject = jSONObject.optJSONObject("image_status");
        this.o = optJSONObject != null ? new ImageStatus(optJSONObject.getString("url"), optJSONObject.getInt("pack_id"), optJSONObject.getInt("status_id")) : null;
        Serializer.c<ImageStatusPack> cVar2 = ImageStatusPack.CREATOR;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("image_status_pack");
        this.p = optJSONObject2 != null ? new ImageStatusPack(optJSONObject2.getString("url"), optJSONObject2.getInt("pack_id")) : null;
        Serializer.c<GiftCard> cVar3 = GiftCard.CREATOR;
        this.q = GiftCard.a.a(jSONObject.optJSONObject("gift_card"));
        Serializer.c<GiftBackground> cVar4 = GiftBackground.CREATOR;
        this.k = GiftBackground.a.b(jSONObject.optJSONArray("backgrounds"));
        Serializer.c<GiftBaseUrlConfig> cVar5 = GiftBaseUrlConfig.CREATOR;
        this.m = GiftBaseUrlConfig.a.a(jSONObject.optJSONObject("base_url_config"));
        Serializer.c<GiftRarity> cVar6 = GiftRarity.CREATOR;
        this.l = GiftRarity.a.a(jSONObject.optJSONObject("rarity"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("animation");
        if (optJSONObject3 != null) {
            Serializer.c<GiftAnimation> cVar7 = GiftAnimation.CREATOR;
            String valueOf = String.valueOf(this.c);
            Serializer.c<Animation> cVar8 = Animation.CREATOR;
            GiftAnimation giftAnimation = new GiftAnimation(valueOf, Animation.a.a(optJSONObject3), 0, 4, null);
            this.j = giftAnimation;
            Iterator<Animation> it = giftAnimation.c.iterator();
            while (it.hasNext() && it.next().c != GiftTheme.DARK) {
            }
        }
    }
}
