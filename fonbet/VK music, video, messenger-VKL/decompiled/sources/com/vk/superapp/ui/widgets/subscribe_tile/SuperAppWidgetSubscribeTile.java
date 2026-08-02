package com.vk.superapp.ui.widgets.subscribe_tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
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

/* compiled from: SuperAppWidgetSubscribeTile.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetSubscribeTile extends SuperAppWidget implements enx0 {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppWidgetSubscribeTile.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetSubscribeTile> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetSubscribeTile createFromParcel(Parcel parcel) {
            return new SuperAppWidgetSubscribeTile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetSubscribeTile[] newArray(int i) {
            return new SuperAppWidgetSubscribeTile[i];
        }
    }

    public SuperAppWidgetSubscribeTile(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppWidgetSubscribeTile i(SuperAppWidgetSubscribeTile superAppWidgetSubscribeTile, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppWidgetSubscribeTile.j;
        String str = superAppWidgetSubscribeTile.k;
        SuperAppWidgetSize superAppWidgetSize = superAppWidgetSubscribeTile.l;
        QueueSettings queueSettings = superAppWidgetSubscribeTile.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppWidgetSubscribeTile.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppWidgetSubscribeTile.o;
        }
        return new SuperAppWidgetSubscribeTile(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppWidgetSubscribeTile)) {
            return false;
        }
        SuperAppWidgetSubscribeTile superAppWidgetSubscribeTile = (SuperAppWidgetSubscribeTile) obj;
        return epx.f(this.j, superAppWidgetSubscribeTile.j) && epx.f(this.k, superAppWidgetSubscribeTile.k) && this.l == superAppWidgetSubscribeTile.l && epx.f(this.m, superAppWidgetSubscribeTile.m) && epx.f(this.n, superAppWidgetSubscribeTile.n) && epx.f(this.o, superAppWidgetSubscribeTile.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppWidgetSubscribeTile ? i(this, null, ((SuperAppWidgetSubscribeTile) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppWidgetSubscribeTile(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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

    /* compiled from: SuperAppWidgetSubscribeTile.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final SubscribeTileIcon b;
        public final WebAction c;
        public final WebAction d;
        public final WebImage e;
        public final List<TileBottomContent> f;
        public final WidgetBasePayload g;

        /* compiled from: SuperAppWidgetSubscribeTile.kt */
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

        public Payload(SubscribeTileIcon subscribeTileIcon, WebAction webAction, WebAction webAction2, WebImage webImage, List<TileBottomContent> list, WidgetBasePayload widgetBasePayload) {
            this.b = subscribeTileIcon;
            this.c = webAction;
            this.d = webAction2;
            this.e = webImage;
            this.f = list;
            this.g = widgetBasePayload;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && epx.f(this.e, payload.e) && epx.f(this.f, payload.f) && epx.f(this.g, payload.g);
        }

        public final int hashCode() {
            SubscribeTileIcon subscribeTileIcon = this.b;
            int hashCode = (subscribeTileIcon == null ? 0 : subscribeTileIcon.hashCode()) * 31;
            WebAction webAction = this.c;
            int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
            WebAction webAction2 = this.d;
            int hashCode3 = (hashCode2 + (webAction2 == null ? 0 : webAction2.hashCode())) * 31;
            WebImage webImage = this.e;
            return this.g.hashCode() + fw3.a((hashCode3 + (webImage != null ? webImage.b.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(icon=");
            sb.append(this.b);
            sb.append(", webAction=");
            sb.append(this.c);
            sb.append(", buttonAction=");
            sb.append(this.d);
            sb.append(", background=");
            sb.append(this.e);
            sb.append(", bottomContent=");
            sb.append(this.f);
            sb.append(", basePayload=");
            return gq.f(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeList(this.f);
            parcel.writeParcelable(this.g, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Payload(Parcel parcel) {
            this(r2, r3, r4, r5, r6, (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
            SubscribeTileIcon subscribeTileIcon = (SubscribeTileIcon) parcel.readParcelable(SubscribeTileIcon.class.getClassLoader());
            WebAction webAction = (WebAction) parcel.readParcelable(WebAction.class.getClassLoader());
            WebAction webAction2 = (WebAction) parcel.readParcelable(WebAction.class.getClassLoader());
            WebImage webImage = (WebImage) parcel.readParcelable(WebImage.class.getClassLoader());
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, TileBottomContent.class.getClassLoader());
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppWidgetSubscribeTile(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
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
