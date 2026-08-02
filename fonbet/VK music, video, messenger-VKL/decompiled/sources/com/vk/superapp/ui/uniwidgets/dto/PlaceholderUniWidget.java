package com.vk.superapp.ui.uniwidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import xsna.bzk0;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: PlaceholderUniWidget.kt */
/* loaded from: classes6.dex */
public final class PlaceholderUniWidget extends UniversalWidget {
    public static final a CREATOR = new a();
    public final WidgetIds m;
    public final String n;
    public final QueueSettings o;
    public final WidgetSettings p;
    public final String q;
    public final Payload r;
    public final DataBlocks s;

    /* compiled from: PlaceholderUniWidget.kt */
    public static final class a implements Parcelable.Creator<PlaceholderUniWidget> {
        @Override // android.os.Parcelable.Creator
        public final PlaceholderUniWidget createFromParcel(Parcel parcel) {
            return new PlaceholderUniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaceholderUniWidget[] newArray(int i) {
            return new PlaceholderUniWidget[i];
        }
    }

    public PlaceholderUniWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), parcel.readString(), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return new PlaceholderUniWidget(this.m, this.n, this.o, new WidgetSettings(z, this.p.c, false, false, 12, null), this.q, this.r);
    }

    @Override // com.vk.superapp.ui.uniwidgets.dto.UniversalWidget, com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.m;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceholderUniWidget)) {
            return false;
        }
        PlaceholderUniWidget placeholderUniWidget = (PlaceholderUniWidget) obj;
        return epx.f(this.m, placeholderUniWidget.m) && epx.f(this.n, placeholderUniWidget.n) && epx.f(this.o, placeholderUniWidget.o) && epx.f(this.p, placeholderUniWidget.p) && epx.f(this.q, placeholderUniWidget.q) && epx.f(this.r, placeholderUniWidget.r);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.n;
    }

    public final int hashCode() {
        return this.r.hashCode() + urd0.a(xq.b(this.p, bzk0.a(this.o, urd0.a(this.m.hashCode() * 31, 31, this.n), 31), 31), 31, this.q);
    }

    public final String toString() {
        return "PlaceholderUniWidget(ids=" + this.m + ", type=" + this.n + ", queueSettings=" + this.o + ", settings=" + this.p + ", actionTitle=" + this.q + ", payload=" + this.r + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i);
    }

    /* compiled from: PlaceholderUniWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final WebAction b;
        public final DataBlocks c;
        public final WidgetBasePayload d;

        /* compiled from: PlaceholderUniWidget.kt */
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

        public Payload(WebAction webAction, DataBlocks dataBlocks, WidgetBasePayload widgetBasePayload) {
            this.b = webAction;
            this.c = dataBlocks;
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
            WebAction webAction = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((webAction == null ? 0 : webAction.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(action=");
            sb.append(this.b);
            sb.append(", blocks=");
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
            this((WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (DataBlocks) parcel.readParcelable(DataBlocks.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }
    }

    /* compiled from: PlaceholderUniWidget.kt */
    public static final class DataBlocks implements Parcelable {
        public static final a CREATOR = new a();
        public final BaseBlock b;
        public final TextBlock c;
        public final BaseBlock d;
        public final BaseBlock e;
        public final ImageBlock f;

        /* compiled from: PlaceholderUniWidget.kt */
        public static final class a implements Parcelable.Creator<DataBlocks> {
            @Override // android.os.Parcelable.Creator
            public final DataBlocks createFromParcel(Parcel parcel) {
                return new DataBlocks(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final DataBlocks[] newArray(int i) {
                return new DataBlocks[i];
            }
        }

        public DataBlocks(BaseBlock baseBlock, TextBlock textBlock, BaseBlock baseBlock2, BaseBlock baseBlock3, ImageBlock imageBlock) {
            this.b = baseBlock;
            this.c = textBlock;
            this.d = baseBlock2;
            this.e = baseBlock3;
            this.f = imageBlock;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataBlocks)) {
                return false;
            }
            DataBlocks dataBlocks = (DataBlocks) obj;
            return epx.f(this.b, dataBlocks.b) && epx.f(this.c, dataBlocks.c) && epx.f(this.d, dataBlocks.d) && epx.f(this.e, dataBlocks.e) && epx.f(this.f, dataBlocks.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DataBlocks(header=" + this.b + ", text=" + this.c + ", button=" + this.d + ", footer=" + this.e + ", additionalHeader=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
        }

        public DataBlocks(Parcel parcel) {
            this((BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaceholderUniWidget(WidgetIds widgetIds, String str, QueueSettings queueSettings, WidgetSettings widgetSettings, String str2, Payload payload) {
        super(widgetIds, str, r3, queueSettings, widgetSettings, r6, r8, r0 != null ? r0.c : null, str2);
        WidgetBasePayload widgetBasePayload = payload.d;
        String str3 = widgetBasePayload.b;
        double d = widgetBasePayload.c;
        WebAction webAction = payload.b;
        AdditionalHeaderIconBlock additionalHeaderIconBlock = widgetBasePayload.e;
        this.m = widgetIds;
        this.n = str;
        this.o = queueSettings;
        this.p = widgetSettings;
        this.q = str2;
        this.r = payload;
        this.s = payload.c;
    }
}
