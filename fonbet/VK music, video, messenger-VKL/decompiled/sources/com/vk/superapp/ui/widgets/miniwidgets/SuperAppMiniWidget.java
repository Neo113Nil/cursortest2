package com.vk.superapp.ui.widgets.miniwidgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bzk0;
import xsna.c5g;
import xsna.ctx0;
import xsna.enx0;
import xsna.epx;
import xsna.gq;
import xsna.p4g;
import xsna.urd0;
import xsna.xq;
import xsna.zrp;

/* compiled from: SuperAppMiniWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppMiniWidget extends SuperAppWidget implements ctx0<SuperAppMiniWidget> {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final QueueSettings l;
    public final WidgetSettings m;
    public final Payload n;
    public final WidgetSize o;
    public final ArrayList p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppMiniWidget.kt */
    public static final class WidgetSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WidgetSize[] $VALUES;
        public static final WidgetSize BIG;
        public static final WidgetSize SMALL;

        static {
            WidgetSize widgetSize = new WidgetSize("BIG", 0);
            BIG = widgetSize;
            WidgetSize widgetSize2 = new WidgetSize("SMALL", 1);
            SMALL = widgetSize2;
            WidgetSize[] widgetSizeArr = {widgetSize, widgetSize2};
            $VALUES = widgetSizeArr;
            $ENTRIES = new asp(widgetSizeArr);
        }

        public WidgetSize() {
            throw null;
        }

        public static WidgetSize valueOf(String str) {
            return (WidgetSize) Enum.valueOf(WidgetSize.class, str);
        }

        public static WidgetSize[] values() {
            return (WidgetSize[]) $VALUES.clone();
        }
    }

    /* compiled from: SuperAppMiniWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppMiniWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidget createFromParcel(Parcel parcel) {
            return new SuperAppMiniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidget[] newArray(int i) {
            return new SuperAppMiniWidget[i];
        }
    }

    public SuperAppMiniWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()), WidgetSize.values()[parcel.readInt()]);
    }

    public static SuperAppMiniWidget i(SuperAppMiniWidget superAppMiniWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppMiniWidget.j;
        String str = superAppMiniWidget.k;
        QueueSettings queueSettings = superAppMiniWidget.l;
        if ((i & 8) != 0) {
            widgetSettings = superAppMiniWidget.m;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 16) != 0) {
            payload = superAppMiniWidget.n;
        }
        WidgetSize widgetSize = superAppMiniWidget.o;
        superAppMiniWidget.getClass();
        return new SuperAppMiniWidget(widgetIds, str, queueSettings, widgetSettings2, payload, widgetSize);
    }

    @Override // xsna.ctx0
    public final SuperAppMiniWidget a(List list) {
        Payload payload = this.n;
        ArrayList<MiniWidgetItem> arrayList = payload.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        boolean z = false;
        for (MiniWidgetItem miniWidgetItem : arrayList) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                enx0 enx0Var = (enx0) it.next();
                if ((enx0Var instanceof MiniWidgetItem) && epx.f(((MiniWidgetItem) enx0Var).g(), miniWidgetItem.g())) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                miniWidgetItem = (MiniWidgetItem) list.get(i);
                z = true;
            }
            arrayList2.add(miniWidgetItem);
        }
        return z ? i(this, null, Payload.a(payload, p4g.q(arrayList2)), 47) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, new WidgetSettings(z, this.m.c, false, false, 12, null), null, 55);
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
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppMiniWidget)) {
            return false;
        }
        SuperAppMiniWidget superAppMiniWidget = (SuperAppMiniWidget) obj;
        return epx.f(this.j, superAppMiniWidget.j) && epx.f(this.k, superAppMiniWidget.k) && epx.f(this.l, superAppMiniWidget.l) && epx.f(this.m, superAppMiniWidget.m) && epx.f(this.n, superAppMiniWidget.n) && this.o == superAppMiniWidget.o;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppMiniWidget ? i(this, null, ((SuperAppMiniWidget) superAppWidget).n, 47) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + xq.b(this.m, bzk0.a(this.l, urd0.a(this.j.hashCode() * 31, 31, this.k), 31), 31)) * 31);
    }

    public final Payload j() {
        return this.n;
    }

    public final String toString() {
        return "SuperAppMiniWidget(ids=" + this.j + ", type=" + this.k + ", queueSettings=" + this.l + ", settings=" + this.m + ", payload=" + this.n + ", widgetSize=" + this.o + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.l, i);
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
        parcel.writeInt(this.o.ordinal());
    }

    /* compiled from: SuperAppMiniWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final ArrayList<MiniWidgetItem> b;
        public final WidgetBasePayload c;

        /* compiled from: SuperAppMiniWidget.kt */
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

        public Payload(ArrayList<MiniWidgetItem> arrayList, WidgetBasePayload widgetBasePayload) {
            this.b = arrayList;
            this.c = widgetBasePayload;
        }

        public static Payload a(Payload payload, ArrayList arrayList) {
            WidgetBasePayload widgetBasePayload = payload.c;
            payload.getClass();
            return new Payload(arrayList, widgetBasePayload);
        }

        public final ArrayList<MiniWidgetItem> d() {
            return this.b;
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
            StringBuilder sb = new StringBuilder("Payload(items=");
            sb.append(this.b);
            sb.append(", basePayload=");
            return gq.f(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeList(this.b);
            parcel.writeParcelable(this.c, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Payload(Parcel parcel) {
            this(r0, (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, MiniWidgetItem.class.getClassLoader());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppMiniWidget(WidgetIds widgetIds, String str, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload, WidgetSize widgetSize) {
        super(widgetIds, str, r0.b, SuperAppWidgetSize.REGULAR, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.c;
        this.j = widgetIds;
        this.k = str;
        this.l = queueSettings;
        this.m = widgetSettings;
        this.n = payload;
        this.o = widgetSize;
        this.p = payload.b;
    }
}
