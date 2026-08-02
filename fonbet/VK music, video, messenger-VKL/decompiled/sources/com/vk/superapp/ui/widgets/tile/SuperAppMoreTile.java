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
import xsna.bzk0;
import xsna.enx0;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppMoreTile.kt */
/* loaded from: classes6.dex */
public final class SuperAppMoreTile extends SuperAppWidget implements enx0 {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppMoreTile.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final WebAction b;
        public final WidgetBasePayload c;

        /* compiled from: SuperAppMoreTile.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload((WebAction) parcel.readParcelable(Payload.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(WebAction webAction, WidgetBasePayload widgetBasePayload) {
            this.b = webAction;
            this.c = widgetBasePayload;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c);
        }

        public final int hashCode() {
            WebAction webAction = this.b;
            return this.c.hashCode() + ((webAction == null ? 0 : webAction.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(webAction=");
            sb.append(this.b);
            sb.append(", basePayload=");
            return gq.f(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: SuperAppMoreTile.kt */
    public static final class a implements Parcelable.Creator<SuperAppMoreTile> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppMoreTile createFromParcel(Parcel parcel) {
            return new SuperAppMoreTile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppMoreTile[] newArray(int i) {
            return new SuperAppMoreTile[i];
        }
    }

    public SuperAppMoreTile(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppMoreTile i(SuperAppMoreTile superAppMoreTile, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppMoreTile.j;
        String str = superAppMoreTile.k;
        SuperAppWidgetSize superAppWidgetSize = superAppMoreTile.l;
        QueueSettings queueSettings = superAppMoreTile.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppMoreTile.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppMoreTile.o;
        }
        return new SuperAppMoreTile(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppMoreTile)) {
            return false;
        }
        SuperAppMoreTile superAppMoreTile = (SuperAppMoreTile) obj;
        return epx.f(this.j, superAppMoreTile.j) && epx.f(this.k, superAppMoreTile.k) && this.l == superAppMoreTile.l && epx.f(this.m, superAppMoreTile.m) && epx.f(this.n, superAppMoreTile.n) && epx.f(this.o, superAppMoreTile.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppMoreTile ? i(this, null, ((SuperAppMoreTile) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppMoreTile(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
    public SuperAppMoreTile(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.c;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }
}
