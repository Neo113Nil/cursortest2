package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.bzk0;
import xsna.enx0;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppShowcasePromoWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcasePromoWidget extends SuperAppWidget implements enx0 {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;
    public final WebImage p;
    public final WebAction q;

    /* compiled from: SuperAppShowcasePromoWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcasePromoWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcasePromoWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcasePromoWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcasePromoWidget[] newArray(int i) {
            return new SuperAppShowcasePromoWidget[i];
        }
    }

    public SuperAppShowcasePromoWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppShowcasePromoWidget i(SuperAppShowcasePromoWidget superAppShowcasePromoWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcasePromoWidget.j;
        String str = superAppShowcasePromoWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcasePromoWidget.l;
        QueueSettings queueSettings = superAppShowcasePromoWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcasePromoWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcasePromoWidget.o;
        }
        return new SuperAppShowcasePromoWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, WidgetSettings.a(this.n, z), null, 47);
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
        if (!(obj instanceof SuperAppShowcasePromoWidget)) {
            return false;
        }
        SuperAppShowcasePromoWidget superAppShowcasePromoWidget = (SuperAppShowcasePromoWidget) obj;
        return epx.f(this.j, superAppShowcasePromoWidget.j) && epx.f(this.k, superAppShowcasePromoWidget.k) && this.l == superAppShowcasePromoWidget.l && epx.f(this.m, superAppShowcasePromoWidget.m) && epx.f(this.n, superAppShowcasePromoWidget.n) && epx.f(this.o, superAppShowcasePromoWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcasePromoWidget ? i(this, null, ((SuperAppShowcasePromoWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcasePromoWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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

    /* compiled from: SuperAppShowcasePromoWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final WebImage b;
        public final WebAction c;
        public final WidgetBasePayload d;

        /* compiled from: SuperAppShowcasePromoWidget.kt */
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

        public Payload(WebImage webImage, WebAction webAction, WidgetBasePayload widgetBasePayload) {
            this.b = webImage;
            this.c = webAction;
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
            WebImage webImage = this.b;
            int hashCode = (webImage == null ? 0 : webImage.b.hashCode()) * 31;
            WebAction webAction = this.c;
            return this.d.hashCode() + ((hashCode + (webAction != null ? webAction.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(image=");
            sb.append(this.b);
            sb.append(", action=");
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

        public Payload(Parcel parcel) {
            this((WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcasePromoWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.d;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
        this.p = payload.b;
        this.q = payload.c;
    }
}
