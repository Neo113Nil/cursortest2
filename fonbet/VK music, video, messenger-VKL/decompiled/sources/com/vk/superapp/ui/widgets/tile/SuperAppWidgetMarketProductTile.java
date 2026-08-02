package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.market.MarketTileInfo;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import xsna.bzk0;
import xsna.enx0;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppWidgetMarketProductTile.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetMarketProductTile extends SuperAppWidget implements enx0 {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppWidgetMarketProductTile.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final WebAction b;
        public final WebImage c;
        public final MarketTileInfo d;
        public final boolean e;
        public final String f;
        public final WidgetBasePayload g;
        public final String h;

        /* compiled from: SuperAppWidgetMarketProductTile.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload((WebAction) parcel.readParcelable(Payload.class.getClassLoader()), (WebImage) parcel.readParcelable(Payload.class.getClassLoader()), (MarketTileInfo) parcel.readParcelable(Payload.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(WebAction webAction, WebImage webImage, MarketTileInfo marketTileInfo, boolean z, String str, WidgetBasePayload widgetBasePayload, String str2) {
            this.b = webAction;
            this.c = webImage;
            this.d = marketTileInfo;
            this.e = z;
            this.f = str;
            this.g = widgetBasePayload;
            this.h = str2;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && this.e == payload.e && epx.f(this.f, payload.f) && epx.f(this.g, payload.g) && epx.f(this.h, payload.h);
        }

        public final int hashCode() {
            WebAction webAction = this.b;
            int hashCode = (webAction == null ? 0 : webAction.hashCode()) * 31;
            WebImage webImage = this.c;
            int b = qoy.b((this.d.hashCode() + ((hashCode + (webImage == null ? 0 : webImage.b.hashCode())) * 31)) * 31, 31, this.e);
            String str = this.f;
            int hashCode2 = (this.g.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.h;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(webAction=");
            sb.append(this.b);
            sb.append(", image=");
            sb.append(this.c);
            sb.append(", info=");
            sb.append(this.d);
            sb.append(", isAdult=");
            sb.append(this.e);
            sb.append(", badgePrefix=");
            sb.append(this.f);
            sb.append(", basePayload=");
            sb.append(this.g);
            sb.append(", itemType=");
            return ho8.a(sb, this.h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeString(this.f);
            parcel.writeParcelable(this.g, i);
            parcel.writeString(this.h);
        }
    }

    /* compiled from: SuperAppWidgetMarketProductTile.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetMarketProductTile> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetMarketProductTile createFromParcel(Parcel parcel) {
            return new SuperAppWidgetMarketProductTile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetMarketProductTile[] newArray(int i) {
            return new SuperAppWidgetMarketProductTile[i];
        }
    }

    public SuperAppWidgetMarketProductTile(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppWidgetMarketProductTile i(SuperAppWidgetMarketProductTile superAppWidgetMarketProductTile, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppWidgetMarketProductTile.j;
        String str = superAppWidgetMarketProductTile.k;
        SuperAppWidgetSize superAppWidgetSize = superAppWidgetMarketProductTile.l;
        QueueSettings queueSettings = superAppWidgetMarketProductTile.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppWidgetMarketProductTile.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppWidgetMarketProductTile.o;
        }
        return new SuperAppWidgetMarketProductTile(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, new WidgetSettings(z, this.n.c, false, false, 12, null), null, 47);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.j;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetMarketProductTile)) {
            return false;
        }
        SuperAppWidgetMarketProductTile superAppWidgetMarketProductTile = (SuperAppWidgetMarketProductTile) obj;
        return epx.f(this.j, superAppWidgetMarketProductTile.j) && epx.f(this.k, superAppWidgetMarketProductTile.k) && this.l == superAppWidgetMarketProductTile.l && epx.f(this.m, superAppWidgetMarketProductTile.m) && epx.f(this.n, superAppWidgetMarketProductTile.n) && epx.f(this.o, superAppWidgetMarketProductTile.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppWidgetMarketProductTile ? i(this, null, ((SuperAppWidgetMarketProductTile) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppWidgetMarketProductTile(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.k);
        parcel.writeInt(this.l.ordinal());
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.o, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppWidgetMarketProductTile(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.g;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }
}
