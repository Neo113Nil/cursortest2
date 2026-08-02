package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import xsna.bzk0;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppTextWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppTextWidget extends SuperAppWidget {
    public static final Parcelable.Creator<SuperAppTextWidget> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppTextWidget.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final String b;
        public final WidgetBasePayload c;

        /* compiled from: SuperAppTextWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload(parcel.readString(), (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(String str, WidgetBasePayload widgetBasePayload) {
            this.b = str;
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
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(text=");
            sb.append(this.b);
            sb.append(", basePayload=");
            return gq.f(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: SuperAppTextWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppTextWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppTextWidget createFromParcel(Parcel parcel) {
            return new SuperAppTextWidget((WidgetIds) parcel.readParcelable(SuperAppTextWidget.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppTextWidget.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppTextWidget.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppTextWidget[] newArray(int i) {
            return new SuperAppTextWidget[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppTextWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.c;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppTextWidget i(SuperAppTextWidget superAppTextWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppTextWidget.j;
        String str = superAppTextWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppTextWidget.l;
        QueueSettings queueSettings = superAppTextWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppTextWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppTextWidget.o;
        }
        return new SuperAppTextWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, new WidgetSettings(z, this.n.c, false, false, 12, null), null, 47);
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
        if (!(obj instanceof SuperAppTextWidget)) {
            return false;
        }
        SuperAppTextWidget superAppTextWidget = (SuperAppTextWidget) obj;
        return epx.f(this.j, superAppTextWidget.j) && epx.f(this.k, superAppTextWidget.k) && this.l == superAppTextWidget.l && epx.f(this.m, superAppTextWidget.m) && epx.f(this.n, superAppTextWidget.n) && epx.f(this.o, superAppTextWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppTextWidget ? i(this, null, ((SuperAppTextWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppTextWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
