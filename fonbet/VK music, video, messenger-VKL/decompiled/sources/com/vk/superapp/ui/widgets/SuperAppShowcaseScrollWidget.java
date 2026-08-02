package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.subscribe_tile.SubIcon;
import java.util.List;
import xsna.asp;
import xsna.bzk0;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;
import xsna.zrp;

/* compiled from: SuperAppShowcaseScrollWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseScrollWidget extends SuperAppWidget {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseScrollWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseScrollWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseScrollWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseScrollWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseScrollWidget[] newArray(int i) {
            return new SuperAppShowcaseScrollWidget[i];
        }
    }

    public SuperAppShowcaseScrollWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppShowcaseScrollWidget i(SuperAppShowcaseScrollWidget superAppShowcaseScrollWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseScrollWidget.j;
        String str = superAppShowcaseScrollWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseScrollWidget.l;
        QueueSettings queueSettings = superAppShowcaseScrollWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseScrollWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseScrollWidget.o;
        }
        return new SuperAppShowcaseScrollWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppShowcaseScrollWidget)) {
            return false;
        }
        SuperAppShowcaseScrollWidget superAppShowcaseScrollWidget = (SuperAppShowcaseScrollWidget) obj;
        return epx.f(this.j, superAppShowcaseScrollWidget.j) && epx.f(this.k, superAppShowcaseScrollWidget.k) && this.l == superAppShowcaseScrollWidget.l && epx.f(this.m, superAppShowcaseScrollWidget.m) && epx.f(this.n, superAppShowcaseScrollWidget.n) && epx.f(this.o, superAppShowcaseScrollWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseScrollWidget ? i(this, null, ((SuperAppShowcaseScrollWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcaseScrollWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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

    /* compiled from: SuperAppShowcaseScrollWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final String b;
        public final List<ScrollItem> c;
        public final WebAction d;
        public final WidgetBasePayload e;

        /* compiled from: SuperAppShowcaseScrollWidget.kt */
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

        public Payload(String str, List<ScrollItem> list, WebAction webAction, WidgetBasePayload widgetBasePayload) {
            this.b = str;
            this.c = list;
            this.d = webAction;
            this.e = widgetBasePayload;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && epx.f(this.e, payload.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            List<ScrollItem> list = this.c;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            WebAction webAction = this.d;
            return this.e.hashCode() + ((hashCode2 + (webAction != null ? webAction.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(headerText=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", action=");
            sb.append(this.d);
            sb.append(", basePayload=");
            return gq.f(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeTypedList(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }

        public Payload(Parcel parcel) {
            this(parcel.readString(), parcel.createTypedArrayList(ScrollItem.CREATOR), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }

        /* compiled from: SuperAppShowcaseScrollWidget.kt */
        public static final class ScrollItem implements Parcelable {
            public static final a CREATOR = new a();
            public final String b;
            public final String c;
            public final WebImage d;
            public final WebAction e;
            public final ImageStyle f;
            public final SubIcon g;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: SuperAppShowcaseScrollWidget.kt */
            public static final class ImageStyle {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ ImageStyle[] $VALUES;
                public static final ImageStyle CIRCLE;
                public static final ImageStyle SQUARE;

                static {
                    ImageStyle imageStyle = new ImageStyle("CIRCLE", 0);
                    CIRCLE = imageStyle;
                    ImageStyle imageStyle2 = new ImageStyle("SQUARE", 1);
                    SQUARE = imageStyle2;
                    ImageStyle[] imageStyleArr = {imageStyle, imageStyle2};
                    $VALUES = imageStyleArr;
                    $ENTRIES = new asp(imageStyleArr);
                }

                public ImageStyle() {
                    throw null;
                }

                public static ImageStyle valueOf(String str) {
                    return (ImageStyle) Enum.valueOf(ImageStyle.class, str);
                }

                public static ImageStyle[] values() {
                    return (ImageStyle[]) $VALUES.clone();
                }
            }

            /* compiled from: SuperAppShowcaseScrollWidget.kt */
            public static final class a implements Parcelable.Creator<ScrollItem> {
                @Override // android.os.Parcelable.Creator
                public final ScrollItem createFromParcel(Parcel parcel) {
                    return new ScrollItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final ScrollItem[] newArray(int i) {
                    return new ScrollItem[i];
                }
            }

            public ScrollItem(String str, String str2, WebImage webImage, WebAction webAction, ImageStyle imageStyle, SubIcon subIcon) {
                this.b = str;
                this.c = str2;
                this.d = webImage;
                this.e = webAction;
                this.f = imageStyle;
                this.g = subIcon;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScrollItem)) {
                    return false;
                }
                ScrollItem scrollItem = (ScrollItem) obj;
                return epx.f(this.b, scrollItem.b) && epx.f(this.c, scrollItem.c) && epx.f(this.d, scrollItem.d) && epx.f(this.e, scrollItem.e) && this.f == scrollItem.f && epx.f(this.g, scrollItem.g);
            }

            public final int hashCode() {
                int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
                WebImage webImage = this.d;
                int hashCode = (a2 + (webImage == null ? 0 : webImage.b.hashCode())) * 31;
                WebAction webAction = this.e;
                int hashCode2 = (this.f.hashCode() + ((hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31)) * 31;
                SubIcon subIcon = this.g;
                return hashCode2 + (subIcon != null ? subIcon.hashCode() : 0);
            }

            public final String toString() {
                return "ScrollItem(uid=" + this.b + ", title=" + this.c + ", image=" + this.d + ", action=" + this.e + ", imageStyle=" + this.f + ", subIcon=" + this.g + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeString(this.c);
                parcel.writeParcelable(this.d, i);
                parcel.writeParcelable(this.e, i);
                parcel.writeInt(this.f.ordinal());
                parcel.writeParcelable(this.g, i);
            }

            public ScrollItem(Parcel parcel) {
                this(parcel.readString(), parcel.readString(), (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), ImageStyle.values()[parcel.readInt()], (SubIcon) parcel.readParcelable(SubIcon.class.getClassLoader()));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseScrollWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.e;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }
}
