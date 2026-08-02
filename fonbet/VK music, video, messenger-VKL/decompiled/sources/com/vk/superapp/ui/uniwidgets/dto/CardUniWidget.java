package com.vk.superapp.ui.uniwidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.EmptyBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import org.json.JSONObject;
import xsna.bzk0;
import xsna.epx;
import xsna.qoy;
import xsna.qxm0;
import xsna.urd0;
import xsna.vu5;
import xsna.xq;

/* compiled from: CardUniWidget.kt */
/* loaded from: classes6.dex */
public final class CardUniWidget extends UniversalWidget {
    public static final a CREATOR = new a();
    public final WidgetIds m;
    public final String n;
    public final QueueSettings o;
    public final WidgetSettings p;
    public final String q;
    public final Payload r;
    public final CardData s;
    public final boolean t;

    /* compiled from: CardUniWidget.kt */
    public static final class a implements Parcelable.Creator<CardUniWidget> {
        public static final BaseBlock a(a aVar, JSONObject jSONObject, String str, TextBlock.Style style) {
            aVar.getClass();
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            String optString = optJSONObject != null ? optJSONObject.optString("value") : null;
            return (optString == null || optString.length() == 0) ? EmptyBlock.b : new TextBlock(optString, style);
        }

        @Override // android.os.Parcelable.Creator
        public final CardUniWidget createFromParcel(Parcel parcel) {
            return new CardUniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CardUniWidget[] newArray(int i) {
            return new CardUniWidget[i];
        }
    }

    public CardUniWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), parcel.readString(), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return new CardUniWidget(this.m, this.n, this.o, new WidgetSettings(z, this.p.c, false, false, 12, null), this.q, this.r);
    }

    @Override // com.vk.superapp.ui.uniwidgets.dto.UniversalWidget, com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.m;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUniWidget)) {
            return false;
        }
        CardUniWidget cardUniWidget = (CardUniWidget) obj;
        return epx.f(this.m, cardUniWidget.m) && epx.f(this.n, cardUniWidget.n) && epx.f(this.o, cardUniWidget.o) && epx.f(this.p, cardUniWidget.p) && epx.f(this.q, cardUniWidget.q) && epx.f(this.r, cardUniWidget.r);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.n;
    }

    public final int hashCode() {
        return this.r.hashCode() + urd0.a(xq.b(this.p, bzk0.a(this.o, urd0.a(this.m.hashCode() * 31, 31, this.n), 31), 31), 31, this.q);
    }

    public final String toString() {
        return "CardUniWidget(ids=" + this.m + ", type=" + this.n + ", queueSettings=" + this.o + ", settings=" + this.p + ", actionTitle=" + this.q + ", payload=" + this.r + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i);
    }

    /* compiled from: CardUniWidget.kt */
    public static final class Animation implements Parcelable {
        public static final a CREATOR = new a();
        public final String b;
        public final int c;

        /* compiled from: CardUniWidget.kt */
        public static final class a implements Parcelable.Creator<Animation> {
            @Override // android.os.Parcelable.Creator
            public final Animation createFromParcel(Parcel parcel) {
                return new Animation(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Animation[] newArray(int i) {
                return new Animation[i];
            }
        }

        public Animation(String str, int i) {
            this.b = str;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Animation)) {
                return false;
            }
            Animation animation = (Animation) obj;
            return epx.f(this.b, animation.b) && this.c == animation.c;
        }

        public final int hashCode() {
            String str = this.b;
            return Integer.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Animation(url=");
            sb.append(this.b);
            sb.append(", repeatCount=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }

        public Animation(Parcel parcel) {
            this(parcel.readString(), parcel.readInt());
        }
    }

    /* compiled from: CardUniWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final WebAction b;
        public final CardData c;
        public final boolean d;
        public final WidgetBasePayload e;
        public final Animation f;

        /* compiled from: CardUniWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(WebAction webAction, CardData cardData, boolean z, WidgetBasePayload widgetBasePayload, Animation animation) {
            this.b = webAction;
            this.c = cardData;
            this.d = z;
            this.e = widgetBasePayload;
            this.f = animation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && this.d == payload.d && epx.f(this.e, payload.e) && epx.f(this.f, payload.f);
        }

        public final int hashCode() {
            WebAction webAction = this.b;
            int hashCode = (this.e.hashCode() + qoy.b((this.c.hashCode() + ((webAction == null ? 0 : webAction.hashCode()) * 31)) * 31, 31, this.d)) * 31;
            Animation animation = this.f;
            return hashCode + (animation != null ? animation.hashCode() : 0);
        }

        public final String toString() {
            return "Payload(action=" + this.b + ", cardData=" + this.c + ", imagePadding=" + this.d + ", basePayload=" + this.e + ", animation=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
        }

        public Payload(Parcel parcel) {
            this((WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (CardData) parcel.readParcelable(CardData.class.getClassLoader()), qxm0.v(parcel), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()), (Animation) parcel.readParcelable(Animation.class.getClassLoader()));
        }
    }

    /* compiled from: CardUniWidget.kt */
    public static final class CardData implements Parcelable {
        public static final a CREATOR = new a();
        public final BaseBlock b;
        public final ImageBlock c;
        public final BaseBlock d;
        public final BaseBlock e;
        public final BaseBlock f;
        public final BaseBlock g;
        public final ImageBlock h;

        /* compiled from: CardUniWidget.kt */
        public static final class a implements Parcelable.Creator<CardData> {
            @Override // android.os.Parcelable.Creator
            public final CardData createFromParcel(Parcel parcel) {
                return new CardData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CardData[] newArray(int i) {
                return new CardData[i];
            }
        }

        public CardData(BaseBlock baseBlock, ImageBlock imageBlock, BaseBlock baseBlock2, BaseBlock baseBlock3, BaseBlock baseBlock4, BaseBlock baseBlock5, ImageBlock imageBlock2) {
            this.b = baseBlock;
            this.c = imageBlock;
            this.d = baseBlock2;
            this.e = baseBlock3;
            this.f = baseBlock4;
            this.g = baseBlock5;
            this.h = imageBlock2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardData)) {
                return false;
            }
            CardData cardData = (CardData) obj;
            return epx.f(this.b, cardData.b) && epx.f(this.c, cardData.c) && epx.f(this.d, cardData.d) && epx.f(this.e, cardData.e) && epx.f(this.f, cardData.f) && epx.f(this.g, cardData.g) && epx.f(this.h, cardData.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "CardData(header=" + this.b + ", imageBlock=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", secondSubtitle=" + this.f + ", footer=" + this.g + ", additionalHeader=" + this.h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeParcelable(this.g, i);
            parcel.writeParcelable(this.h, i);
        }

        public CardData(Parcel parcel) {
            this((BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardUniWidget(WidgetIds widgetIds, String str, QueueSettings queueSettings, WidgetSettings widgetSettings, String str2, Payload payload) {
        super(widgetIds, str, r3, queueSettings, widgetSettings, r6, r8, r0 != null ? r0.c : null, str2);
        WidgetBasePayload widgetBasePayload = payload.e;
        String str3 = widgetBasePayload.b;
        double d = widgetBasePayload.c;
        WebAction webAction = payload.b;
        AdditionalHeaderIconBlock additionalHeaderIconBlock = widgetBasePayload.e;
        this.m = widgetIds;
        this.n = str;
        this.o = queueSettings;
        this.p = widgetSettings;
        this.q = str2;
        this.r = payload;
        this.s = payload.c;
        this.t = payload.d;
    }
}
