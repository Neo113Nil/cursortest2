package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
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
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppWidgetHalfTile.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetHalfTile extends SuperAppWidget implements enx0 {
    public static final Parcelable.Creator<SuperAppWidgetHalfTile> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppWidgetHalfTile.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final WebAction b;
        public final HalfTileContent c;
        public final WidgetBasePayload d;

        /* compiled from: SuperAppWidgetHalfTile.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload((WebAction) parcel.readParcelable(Payload.class.getClassLoader()), (HalfTileContent) parcel.readParcelable(Payload.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(WebAction webAction, HalfTileContent halfTileContent, WidgetBasePayload widgetBasePayload) {
            this.b = webAction;
            this.c = halfTileContent;
            this.d = widgetBasePayload;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(action=");
            sb.append(this.b);
            sb.append(", content=");
            sb.append(this.c);
            sb.append(", basePayload=");
            return gq.f(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* compiled from: SuperAppWidgetHalfTile.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetHalfTile> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetHalfTile createFromParcel(Parcel parcel) {
            return new SuperAppWidgetHalfTile((WidgetIds) parcel.readParcelable(SuperAppWidgetHalfTile.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppWidgetHalfTile.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppWidgetHalfTile.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetHalfTile[] newArray(int i) {
            return new SuperAppWidgetHalfTile[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppWidgetHalfTile(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.d;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppWidgetHalfTile i(SuperAppWidgetHalfTile superAppWidgetHalfTile, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppWidgetHalfTile.j;
        String str = superAppWidgetHalfTile.k;
        SuperAppWidgetSize superAppWidgetSize = superAppWidgetHalfTile.l;
        QueueSettings queueSettings = superAppWidgetHalfTile.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppWidgetHalfTile.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppWidgetHalfTile.o;
        }
        return new SuperAppWidgetHalfTile(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, WidgetSettings.a(this.n, z), null, 47);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.j;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetHalfTile)) {
            return false;
        }
        SuperAppWidgetHalfTile superAppWidgetHalfTile = (SuperAppWidgetHalfTile) obj;
        return epx.f(this.j, superAppWidgetHalfTile.j) && epx.f(this.k, superAppWidgetHalfTile.k) && this.l == superAppWidgetHalfTile.l && epx.f(this.m, superAppWidgetHalfTile.m) && epx.f(this.n, superAppWidgetHalfTile.n) && epx.f(this.o, superAppWidgetHalfTile.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppWidgetHalfTile ? i(this, null, ((SuperAppWidgetHalfTile) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppWidgetHalfTile(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.k);
        parcel.writeString(this.l.name());
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
        this.o.writeToParcel(parcel, i);
    }
}
