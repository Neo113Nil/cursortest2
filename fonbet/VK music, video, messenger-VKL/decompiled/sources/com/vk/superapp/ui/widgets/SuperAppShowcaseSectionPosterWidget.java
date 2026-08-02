package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bzk0;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.gq;
import xsna.ms9;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppShowcaseSectionPosterWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseSectionPosterWidget extends SuperAppWidget {
    public static final Parcelable.Creator<SuperAppShowcaseSectionPosterWidget> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseSectionPosterWidget.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final String b;
        public final WebAction c;
        public final WebImage d;
        public final BottomContent e;
        public final WidgetBasePayload f;

        /* compiled from: SuperAppShowcaseSectionPosterWidget.kt */
        public static final class BottomContent implements Parcelable {
            public static final Parcelable.Creator<BottomContent> CREATOR = new a();
            public final String b;
            public final List<ImageWithAction> c;

            /* compiled from: SuperAppShowcaseSectionPosterWidget.kt */
            public static final class a implements Parcelable.Creator<BottomContent> {
                @Override // android.os.Parcelable.Creator
                public final BottomContent createFromParcel(Parcel parcel) {
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(ImageWithAction.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new BottomContent(readString, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final BottomContent[] newArray(int i) {
                    return new BottomContent[i];
                }
            }

            public BottomContent(String str, List<ImageWithAction> list) {
                this.b = str;
                this.c = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BottomContent)) {
                    return false;
                }
                BottomContent bottomContent = (BottomContent) obj;
                return epx.f(this.b, bottomContent.b) && epx.f(this.c, bottomContent.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BottomContent(text=");
                sb.append(this.b);
                sb.append(", images=");
                return ms9.a(')', sb, this.c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                Iterator a2 = ao.a(parcel, this.c);
                while (a2.hasNext()) {
                    ((ImageWithAction) a2.next()).writeToParcel(parcel, i);
                }
            }
        }

        /* compiled from: SuperAppShowcaseSectionPosterWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload(parcel.readString(), (WebAction) parcel.readParcelable(Payload.class.getClassLoader()), (WebImage) parcel.readParcelable(Payload.class.getClassLoader()), parcel.readInt() == 0 ? null : BottomContent.CREATOR.createFromParcel(parcel), (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(String str, WebAction webAction, WebImage webImage, BottomContent bottomContent, WidgetBasePayload widgetBasePayload) {
            this.b = str;
            this.c = webAction;
            this.d = webImage;
            this.e = bottomContent;
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
            int a2 = fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d.b);
            BottomContent bottomContent = this.e;
            return this.f.hashCode() + ((a2 + (bottomContent == null ? 0 : bottomContent.hashCode())) * 31);
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
            sb.append(", basePayload=");
            return gq.f(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            BottomContent bottomContent = this.e;
            if (bottomContent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bottomContent.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.f, i);
        }
    }

    /* compiled from: SuperAppShowcaseSectionPosterWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionPosterWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionPosterWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseSectionPosterWidget((WidgetIds) parcel.readParcelable(SuperAppShowcaseSectionPosterWidget.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppShowcaseSectionPosterWidget.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppShowcaseSectionPosterWidget.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionPosterWidget[] newArray(int i) {
            return new SuperAppShowcaseSectionPosterWidget[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseSectionPosterWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.f;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppShowcaseSectionPosterWidget i(SuperAppShowcaseSectionPosterWidget superAppShowcaseSectionPosterWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseSectionPosterWidget.j;
        String str = superAppShowcaseSectionPosterWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseSectionPosterWidget.l;
        QueueSettings queueSettings = superAppShowcaseSectionPosterWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseSectionPosterWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseSectionPosterWidget.o;
        }
        return new SuperAppShowcaseSectionPosterWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppShowcaseSectionPosterWidget)) {
            return false;
        }
        SuperAppShowcaseSectionPosterWidget superAppShowcaseSectionPosterWidget = (SuperAppShowcaseSectionPosterWidget) obj;
        return epx.f(this.j, superAppShowcaseSectionPosterWidget.j) && epx.f(this.k, superAppShowcaseSectionPosterWidget.k) && this.l == superAppShowcaseSectionPosterWidget.l && epx.f(this.m, superAppShowcaseSectionPosterWidget.m) && epx.f(this.n, superAppShowcaseSectionPosterWidget.n) && epx.f(this.o, superAppShowcaseSectionPosterWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseSectionPosterWidget ? i(this, null, ((SuperAppShowcaseSectionPosterWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcaseSectionPosterWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
