package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.api.StubTiles;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.bzk0;
import xsna.c5g;
import xsna.ctx0;
import xsna.dn;
import xsna.enx0;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppShowcaseSectionGridWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseSectionGridWidget extends SuperAppWidget implements ctx0<SuperAppShowcaseSectionGridWidget> {
    public static final Parcelable.Creator<SuperAppShowcaseSectionGridWidget> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseSectionGridWidget.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final String b;
        public final WebAction c;
        public final List<SuperAppWidget> d;
        public final StubTiles e;
        public final WidgetBasePayload f;

        /* compiled from: SuperAppShowcaseSectionGridWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                WebAction webAction = (WebAction) parcel.readParcelable(Payload.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(Payload.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Payload(readString, webAction, arrayList, parcel.readInt() != 0 ? StubTiles.CREATOR.createFromParcel(parcel) : null, (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(String str, WebAction webAction, List<? extends SuperAppWidget> list, StubTiles stubTiles, WidgetBasePayload widgetBasePayload) {
            this.b = str;
            this.c = webAction;
            this.d = list;
            this.e = stubTiles;
            this.f = widgetBasePayload;
        }

        public final List<SuperAppWidget> d() {
            return this.d;
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
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            WebAction webAction = this.c;
            int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
            List<SuperAppWidget> list = this.d;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            StubTiles stubTiles = this.e;
            return this.f.hashCode() + ((hashCode3 + (stubTiles != null ? stubTiles.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(title=");
            sb.append(this.b);
            sb.append(", action=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", stubs=");
            sb.append(this.e);
            sb.append(", basePayload=");
            return gq.f(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            List<SuperAppWidget> list = this.d;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            StubTiles stubTiles = this.e;
            if (stubTiles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stubTiles.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.f, i);
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionGridWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionGridWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseSectionGridWidget((WidgetIds) parcel.readParcelable(SuperAppShowcaseSectionGridWidget.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppShowcaseSectionGridWidget.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppShowcaseSectionGridWidget.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionGridWidget[] newArray(int i) {
            return new SuperAppShowcaseSectionGridWidget[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseSectionGridWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.f;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppShowcaseSectionGridWidget i(SuperAppShowcaseSectionGridWidget superAppShowcaseSectionGridWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseSectionGridWidget.j;
        String str = superAppShowcaseSectionGridWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseSectionGridWidget.l;
        QueueSettings queueSettings = superAppShowcaseSectionGridWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseSectionGridWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseSectionGridWidget.o;
        }
        return new SuperAppShowcaseSectionGridWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        r6 = (com.vk.superapp.ui.widgets.SuperAppWidget) r13.get(r8);
        r5 = true;
     */
    @Override // xsna.ctx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SuperAppShowcaseSectionGridWidget a(List list) {
        ArrayList arrayList;
        Payload payload = this.o;
        List<SuperAppWidget> list2 = payload.d;
        boolean z = false;
        if (list2 != null) {
            List<SuperAppWidget> list3 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            boolean z2 = false;
            for (SuperAppWidget superAppWidget : list3) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    enx0 enx0Var = (enx0) it.next();
                    if (((enx0Var instanceof SuperAppWidgetTile) && epx.f(((SuperAppWidgetTile) enx0Var).j.b, superAppWidget.d().b)) || (((enx0Var instanceof SuperAppShowcasePromoWidget) && epx.f(((SuperAppShowcasePromoWidget) enx0Var).j.b, superAppWidget.d().b)) || ((enx0Var instanceof SuperAppWidgetHalfTile) && epx.f(((SuperAppWidgetHalfTile) enx0Var).j.b, superAppWidget.d().b)))) {
                        break;
                    }
                    i++;
                }
                arrayList2.add(superAppWidget);
            }
            arrayList = arrayList2;
            z = z2;
        } else {
            arrayList = null;
        }
        return z ? i(this, null, new Payload(payload.b, payload.c, arrayList, payload.e, payload.f), 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, WidgetSettings.a(this.n, z), null, 47);
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
        if (!(obj instanceof SuperAppShowcaseSectionGridWidget)) {
            return false;
        }
        SuperAppShowcaseSectionGridWidget superAppShowcaseSectionGridWidget = (SuperAppShowcaseSectionGridWidget) obj;
        return epx.f(this.j, superAppShowcaseSectionGridWidget.j) && epx.f(this.k, superAppShowcaseSectionGridWidget.k) && this.l == superAppShowcaseSectionGridWidget.l && epx.f(this.m, superAppShowcaseSectionGridWidget.m) && epx.f(this.n, superAppShowcaseSectionGridWidget.n) && epx.f(this.o, superAppShowcaseSectionGridWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseSectionGridWidget ? i(this, null, ((SuperAppShowcaseSectionGridWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final Payload j() {
        return this.o;
    }

    public final String toString() {
        return "SuperAppShowcaseSectionGridWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
