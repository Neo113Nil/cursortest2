package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import java.util.ArrayList;
import java.util.List;
import xsna.bzk0;
import xsna.enx0;
import xsna.epx;
import xsna.fw3;
import xsna.gq;
import xsna.s3q0;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppWidgetTile.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetTile extends SuperAppWidget implements enx0 {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppWidgetTile.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetTile> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetTile createFromParcel(Parcel parcel) {
            return new SuperAppWidgetTile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetTile[] newArray(int i) {
            return new SuperAppWidgetTile[i];
        }
    }

    public SuperAppWidgetTile(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppWidgetTile i(SuperAppWidgetTile superAppWidgetTile, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppWidgetTile.j;
        String str = superAppWidgetTile.k;
        SuperAppWidgetSize superAppWidgetSize = superAppWidgetTile.l;
        QueueSettings queueSettings = superAppWidgetTile.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppWidgetTile.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppWidgetTile.o;
        }
        return new SuperAppWidgetTile(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppWidgetTile)) {
            return false;
        }
        SuperAppWidgetTile superAppWidgetTile = (SuperAppWidgetTile) obj;
        return epx.f(this.j, superAppWidgetTile.j) && epx.f(this.k, superAppWidgetTile.k) && this.l == superAppWidgetTile.l && epx.f(this.m, superAppWidgetTile.m) && epx.f(this.n, superAppWidgetTile.n) && epx.f(this.o, superAppWidgetTile.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppWidgetTile ? i(this, null, ((SuperAppWidgetTile) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppWidgetTile(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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

    /* compiled from: SuperAppWidgetTile.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final TileBackground b;
        public final List<TileBottomContent> c;
        public final TileBadgeInfo d;
        public final WebAction e;
        public final WidgetBasePayload f;

        /* compiled from: SuperAppWidgetTile.kt */
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

        public Payload(TileBackground tileBackground, List<TileBottomContent> list, TileBadgeInfo tileBadgeInfo, WebAction webAction, WidgetBasePayload widgetBasePayload) {
            this.b = tileBackground;
            this.c = list;
            this.d = tileBadgeInfo;
            this.e = webAction;
            this.f = widgetBasePayload;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && epx.f(this.e, payload.e) && epx.f(this.f, payload.f);
        }

        public final int hashCode() {
            TileBackground tileBackground = this.b;
            int a2 = fw3.a((tileBackground == null ? 0 : tileBackground.hashCode()) * 31, 31, this.c);
            TileBadgeInfo tileBadgeInfo = this.d;
            int hashCode = (a2 + (tileBadgeInfo == null ? 0 : tileBadgeInfo.hashCode())) * 31;
            WebAction webAction = this.e;
            return this.f.hashCode() + ((hashCode + (webAction != null ? webAction.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(background=");
            sb.append(this.b);
            sb.append(", bottomContent=");
            sb.append(this.c);
            sb.append(", badgeInfo=");
            sb.append(this.d);
            sb.append(", webAction=");
            sb.append(this.e);
            sb.append(", basePayload=");
            return gq.f(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeList(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Payload(Parcel parcel) {
            this(r2, r3, (TileBadgeInfo) parcel.readParcelable(TileBadgeInfo.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
            TileBackground tileBackground = (TileBackground) parcel.readParcelable(TileBackground.class.getClassLoader());
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, TileBottomContent.class.getClassLoader());
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppWidgetTile(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.f;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }
}
