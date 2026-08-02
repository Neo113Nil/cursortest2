package com.vk.ecomm.market.good.ui.holder.goodquickmessages;

import com.vk.api.generated.market.dto.MarketItemCardQuickMessageDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.epx;
import xsna.hfz;
import xsna.urd0;

/* compiled from: GoodQuickMessagesHolder.kt */
/* loaded from: classes18.dex */
public final class QuickMessageItem extends Serializer.StreamParcelableAdapter implements hfz {
    public static final Serializer.c<QuickMessageItem> CREATOR = new c();
    public final String b;
    public final String c;
    public final String d;
    public final UserId e;
    public final boolean f;

    /* compiled from: GoodQuickMessagesHolder.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<QuickMessageItem> {
        @Override // xsna.aay
        public final QuickMessageItem a(JSONObject jSONObject) {
            return new QuickMessageItem(jSONObject.optString("title"), jSONObject.optString("message"), jSONObject.optString("message_id"), new UserId(jSONObject.optLong("contact_id")), epx.f(jSONObject.optString("type"), MarketItemCardQuickMessageDto.TypeDto.CHATBUTTON.i()));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<QuickMessageItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuickMessageItem a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            return new QuickMessageItem(H, H2, H3 != null ? H3 : "", (UserId) serializer.A(UserId.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuickMessageItem[i];
        }
    }

    static {
        new b();
    }

    public QuickMessageItem(String str, String str2, String str3, UserId userId, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = userId;
        this.f = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickMessageItem)) {
            return false;
        }
        QuickMessageItem quickMessageItem = (QuickMessageItem) obj;
        return epx.f(this.b, quickMessageItem.b) && epx.f(this.c, quickMessageItem.c) && epx.f(this.d, quickMessageItem.d) && epx.f(this.e, quickMessageItem.e) && this.f == quickMessageItem.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + bh10.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickMessageItem(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", contactId=");
        sb.append(this.e);
        sb.append(", isChatButton=");
        return q0.a(sb, this.f, ')');
    }
}
