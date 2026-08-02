package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile;
import com.vk.superapp.ui.widgets.tile.SuperAppMoreTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile;
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

/* compiled from: SuperAppShowcaseSectionScrollWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseSectionScrollWidget extends SuperAppWidget implements ctx0<SuperAppShowcaseSectionScrollWidget> {
    public static final Parcelable.Creator<SuperAppShowcaseSectionScrollWidget> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseSectionScrollWidget.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final String b;
        public final String c;
        public final WebAction d;
        public final AdInfo e;
        public final List<SuperAppWidget> f;
        public final WidgetBasePayload g;

        /* compiled from: SuperAppShowcaseSectionScrollWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                WebAction webAction = (WebAction) parcel.readParcelable(Payload.class.getClassLoader());
                AdInfo adInfo = (AdInfo) parcel.readParcelable(Payload.class.getClassLoader());
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
                return new Payload(readString, readString2, webAction, adInfo, arrayList, (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(String str, String str2, WebAction webAction, AdInfo adInfo, List<? extends SuperAppWidget> list, WidgetBasePayload widgetBasePayload) {
            this.b = str;
            this.c = str2;
            this.d = webAction;
            this.e = adInfo;
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
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            WebAction webAction = this.d;
            int hashCode3 = (hashCode2 + (webAction == null ? 0 : webAction.hashCode())) * 31;
            AdInfo adInfo = this.e;
            int hashCode4 = (hashCode3 + (adInfo == null ? 0 : adInfo.hashCode())) * 31;
            List<SuperAppWidget> list = this.f;
            return this.g.hashCode() + ((hashCode4 + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", action=");
            sb.append(this.d);
            sb.append(", adInfo=");
            sb.append(this.e);
            sb.append(", items=");
            sb.append(this.f);
            sb.append(", basePayload=");
            return gq.f(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            List<SuperAppWidget> list = this.f;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeParcelable(this.g, i);
        }
    }

    /* compiled from: SuperAppShowcaseSectionScrollWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionScrollWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionScrollWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseSectionScrollWidget((WidgetIds) parcel.readParcelable(SuperAppShowcaseSectionScrollWidget.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppShowcaseSectionScrollWidget.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppShowcaseSectionScrollWidget.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionScrollWidget[] newArray(int i) {
            return new SuperAppShowcaseSectionScrollWidget[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseSectionScrollWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.g;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppShowcaseSectionScrollWidget i(SuperAppShowcaseSectionScrollWidget superAppShowcaseSectionScrollWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseSectionScrollWidget.j;
        String str = superAppShowcaseSectionScrollWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseSectionScrollWidget.l;
        QueueSettings queueSettings = superAppShowcaseSectionScrollWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseSectionScrollWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseSectionScrollWidget.o;
        }
        return new SuperAppShowcaseSectionScrollWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r6 = (com.vk.superapp.ui.widgets.SuperAppWidget) r13.get(r8);
        r5 = true;
     */
    @Override // xsna.ctx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SuperAppShowcaseSectionScrollWidget a(List list) {
        ArrayList arrayList;
        Payload payload = this.o;
        List<SuperAppWidget> list2 = payload.f;
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
                    if (((enx0Var instanceof SuperAppWidgetSubscribeTile) && epx.f(((SuperAppWidgetSubscribeTile) enx0Var).j.b, superAppWidget.d().b)) || (((enx0Var instanceof SuperAppWidgetTile) && epx.f(((SuperAppWidgetTile) enx0Var).j.b, superAppWidget.d().b)) || (((enx0Var instanceof SuperAppWidgetMarketProductTile) && epx.f(((SuperAppWidgetMarketProductTile) enx0Var).j.b, superAppWidget.d().b)) || ((enx0Var instanceof SuperAppMoreTile) && epx.f(((SuperAppMoreTile) enx0Var).j.b, superAppWidget.d().b))))) {
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
        return z ? i(this, null, new Payload(payload.b, payload.c, payload.d, payload.e, arrayList, payload.g), 31) : this;
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
        if (!(obj instanceof SuperAppShowcaseSectionScrollWidget)) {
            return false;
        }
        SuperAppShowcaseSectionScrollWidget superAppShowcaseSectionScrollWidget = (SuperAppShowcaseSectionScrollWidget) obj;
        return epx.f(this.j, superAppShowcaseSectionScrollWidget.j) && epx.f(this.k, superAppShowcaseSectionScrollWidget.k) && this.l == superAppShowcaseSectionScrollWidget.l && epx.f(this.m, superAppShowcaseSectionScrollWidget.m) && epx.f(this.n, superAppShowcaseSectionScrollWidget.n) && epx.f(this.o, superAppShowcaseSectionScrollWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseSectionScrollWidget ? i(this, null, ((SuperAppShowcaseSectionScrollWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcaseSectionScrollWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
