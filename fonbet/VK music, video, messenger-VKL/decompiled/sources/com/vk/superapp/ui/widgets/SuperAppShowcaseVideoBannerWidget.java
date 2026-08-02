package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bzk0;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppShowcaseVideoBannerWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseVideoBannerWidget extends SuperAppWidget {
    public static final Parcelable.Creator<SuperAppShowcaseVideoBannerWidget> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseVideoBannerWidget.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final String b;
        public final WebAction c;
        public final WebImage d;
        public final List<TileBottomContent> e;
        public final VideoVideoFullDto f;
        public final WidgetBasePayload g;

        /* compiled from: SuperAppShowcaseVideoBannerWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                WebAction webAction = (WebAction) parcel.readParcelable(Payload.class.getClassLoader());
                WebImage webImage = (WebImage) parcel.readParcelable(Payload.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(TileBottomContent.CREATOR, parcel, arrayList, i, 1);
                }
                return new Payload(readString, webAction, webImage, arrayList, (VideoVideoFullDto) parcel.readParcelable(Payload.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(String str, WebAction webAction, WebImage webImage, List<TileBottomContent> list, VideoVideoFullDto videoVideoFullDto, WidgetBasePayload widgetBasePayload) {
            this.b = str;
            this.c = webAction;
            this.d = webImage;
            this.e = list;
            this.f = videoVideoFullDto;
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
            int a2 = fw3.a(fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d.b), 31, this.e);
            VideoVideoFullDto videoVideoFullDto = this.f;
            return this.g.hashCode() + ((a2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(title=");
            sb.append(this.b);
            sb.append(", action=");
            sb.append(this.c);
            sb.append(", image=");
            sb.append(this.d);
            sb.append(", bottomContent=");
            sb.append(this.e);
            sb.append(", video=");
            sb.append(this.f);
            sb.append(", basePayload=");
            return gq.f(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            Iterator a2 = ao.a(parcel, this.e);
            while (a2.hasNext()) {
                ((TileBottomContent) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.f, i);
            parcel.writeParcelable(this.g, i);
        }
    }

    /* compiled from: SuperAppShowcaseVideoBannerWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseVideoBannerWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseVideoBannerWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseVideoBannerWidget((WidgetIds) parcel.readParcelable(SuperAppShowcaseVideoBannerWidget.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppShowcaseVideoBannerWidget.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppShowcaseVideoBannerWidget.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseVideoBannerWidget[] newArray(int i) {
            return new SuperAppShowcaseVideoBannerWidget[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseVideoBannerWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.g;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppShowcaseVideoBannerWidget i(SuperAppShowcaseVideoBannerWidget superAppShowcaseVideoBannerWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseVideoBannerWidget.j;
        String str = superAppShowcaseVideoBannerWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseVideoBannerWidget.l;
        QueueSettings queueSettings = superAppShowcaseVideoBannerWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseVideoBannerWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseVideoBannerWidget.o;
        }
        return new SuperAppShowcaseVideoBannerWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppShowcaseVideoBannerWidget)) {
            return false;
        }
        SuperAppShowcaseVideoBannerWidget superAppShowcaseVideoBannerWidget = (SuperAppShowcaseVideoBannerWidget) obj;
        return epx.f(this.j, superAppShowcaseVideoBannerWidget.j) && epx.f(this.k, superAppShowcaseVideoBannerWidget.k) && this.l == superAppShowcaseVideoBannerWidget.l && epx.f(this.m, superAppShowcaseVideoBannerWidget.m) && epx.f(this.n, superAppShowcaseVideoBannerWidget.n) && epx.f(this.o, superAppShowcaseVideoBannerWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseVideoBannerWidget ? i(this, null, ((SuperAppShowcaseVideoBannerWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcaseVideoBannerWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
