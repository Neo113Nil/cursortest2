package com.vk.superapp.ui.uniwidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.List;
import xsna.bzk0;
import xsna.epx;
import xsna.fw3;
import xsna.gq;
import xsna.j5g;
import xsna.ql3;
import xsna.urd0;
import xsna.xq;

/* compiled from: TableUniWidget.kt */
/* loaded from: classes6.dex */
public final class TableUniWidget extends UniversalWidget {
    public static final a CREATOR = new a();
    public final WidgetIds m;
    public final String n;
    public final QueueSettings o;
    public final WidgetSettings p;
    public final String q;
    public final Payload r;
    public final TableData s;

    /* compiled from: TableUniWidget.kt */
    public static final class a implements Parcelable.Creator<TableUniWidget> {
        @Override // android.os.Parcelable.Creator
        public final TableUniWidget createFromParcel(Parcel parcel) {
            return new TableUniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TableUniWidget[] newArray(int i) {
            return new TableUniWidget[i];
        }
    }

    /* compiled from: TableUniWidget.kt */
    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("Style(columns="), this.a);
        }
    }

    public TableUniWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), parcel.readString(), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return new TableUniWidget(this.m, this.n, this.o, new WidgetSettings(z, this.p.c, false, false, 12, null), this.q, this.r);
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
        if (!(obj instanceof TableUniWidget)) {
            return false;
        }
        TableUniWidget tableUniWidget = (TableUniWidget) obj;
        return epx.f(this.m, tableUniWidget.m) && epx.f(this.n, tableUniWidget.n) && epx.f(this.o, tableUniWidget.o) && epx.f(this.p, tableUniWidget.p) && epx.f(this.q, tableUniWidget.q) && epx.f(this.r, tableUniWidget.r);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.n;
    }

    public final int hashCode() {
        return this.r.hashCode() + urd0.a(xq.b(this.p, bzk0.a(this.o, urd0.a(this.m.hashCode() * 31, 31, this.n), 31), 31), 31, this.q);
    }

    public final String toString() {
        return "TableUniWidget(ids=" + this.m + ", type=" + this.n + ", queueSettings=" + this.o + ", settings=" + this.p + ", actionTitle=" + this.q + ", payload=" + this.r + ')';
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

    /* compiled from: TableUniWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final WebAction b;
        public final TableData c;
        public final WidgetBasePayload d;

        /* compiled from: TableUniWidget.kt */
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

        public Payload(WebAction webAction, TableData tableData, WidgetBasePayload widgetBasePayload) {
            this.b = webAction;
            this.c = tableData;
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
            sb.append(", tableData=");
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
            this((WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (TableData) parcel.readParcelable(TableData.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }
    }

    /* compiled from: TableUniWidget.kt */
    public static final class TableData implements Parcelable {
        public static final a CREATOR = new a();
        public final BaseBlock b;
        public final List<Integer> c;
        public final List<TableRow> d;
        public final BaseBlock e;
        public final ImageBlock f;

        /* compiled from: TableUniWidget.kt */
        public static final class a implements Parcelable.Creator<TableData> {
            @Override // android.os.Parcelable.Creator
            public final TableData createFromParcel(Parcel parcel) {
                return new TableData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final TableData[] newArray(int i) {
                return new TableData[i];
            }
        }

        public TableData(BaseBlock baseBlock, List<Integer> list, List<TableRow> list2, BaseBlock baseBlock2, ImageBlock imageBlock) {
            this.b = baseBlock;
            this.c = list;
            this.d = list2;
            this.e = baseBlock2;
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
            if (!(obj instanceof TableData)) {
                return false;
            }
            TableData tableData = (TableData) obj;
            return epx.f(this.b, tableData.b) && epx.f(this.c, tableData.c) && epx.f(this.d, tableData.d) && epx.f(this.e, tableData.e) && epx.f(this.f, tableData.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            return "TableData(header=" + this.b + ", sizes=" + this.c + ", rows=" + this.d + ", footer=" + this.e + ", additionalHeader=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeIntArray(j5g.N0(this.c));
            parcel.writeTypedList(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
        }

        public TableData(Parcel parcel) {
            this((BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), new ql3(parcel.createIntArray()), parcel.createTypedArrayList(TableRow.CREATOR), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TableUniWidget(WidgetIds widgetIds, String str, QueueSettings queueSettings, WidgetSettings widgetSettings, String str2, Payload payload) {
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
