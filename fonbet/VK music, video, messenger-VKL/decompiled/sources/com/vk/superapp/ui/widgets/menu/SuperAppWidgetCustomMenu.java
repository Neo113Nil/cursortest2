package com.vk.superapp.ui.widgets.menu;

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
import xsna.bzk0;
import xsna.c5g;
import xsna.ctx0;
import xsna.enx0;
import xsna.epx;
import xsna.qoy;
import xsna.qxm0;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppWidgetCustomMenu.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetCustomMenu extends SuperAppWidget implements ctx0<SuperAppWidgetCustomMenu> {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;
    public final List<CustomMenuInfo> p;
    public final CustomMenuInfo q;

    /* compiled from: SuperAppWidgetCustomMenu.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetCustomMenu> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetCustomMenu createFromParcel(Parcel parcel) {
            return new SuperAppWidgetCustomMenu(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetCustomMenu[] newArray(int i) {
            return new SuperAppWidgetCustomMenu[i];
        }
    }

    public SuperAppWidgetCustomMenu(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppWidgetCustomMenu i(SuperAppWidgetCustomMenu superAppWidgetCustomMenu, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppWidgetCustomMenu.j;
        String str = superAppWidgetCustomMenu.k;
        SuperAppWidgetSize superAppWidgetSize = superAppWidgetCustomMenu.l;
        QueueSettings queueSettings = superAppWidgetCustomMenu.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppWidgetCustomMenu.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppWidgetCustomMenu.o;
        }
        superAppWidgetCustomMenu.getClass();
        return new SuperAppWidgetCustomMenu(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
    }

    @Override // xsna.ctx0
    public final SuperAppWidgetCustomMenu a(List list) {
        int i;
        CustomMenuInfo customMenuInfo;
        Payload payload = this.o;
        List<CustomMenuInfo> list2 = payload.b;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        int i2 = 0;
        boolean z = false;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                break;
            }
            CustomMenuInfo customMenuInfo2 = (CustomMenuInfo) it.next();
            Iterator it2 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                enx0 enx0Var = (enx0) it2.next();
                if ((enx0Var instanceof CustomMenuInfo) && epx.f(((CustomMenuInfo) enx0Var).d, customMenuInfo2.d)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i >= 0) {
                customMenuInfo2 = (CustomMenuInfo) list.get(i);
                z = true;
            }
            arrayList.add(customMenuInfo2);
        }
        Iterator it3 = list.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            customMenuInfo = this.q;
            if (!hasNext) {
                break;
            }
            enx0 enx0Var2 = (enx0) it3.next();
            if (enx0Var2 instanceof CustomMenuInfo) {
                if (epx.f(((CustomMenuInfo) enx0Var2).d, customMenuInfo != null ? customMenuInfo.d : null)) {
                    i = i2;
                    break;
                }
            }
            i2++;
        }
        if (i >= 0) {
            customMenuInfo = (CustomMenuInfo) list.get(i);
            z = true;
        }
        return z ? i(this, null, Payload.a(payload, arrayList, customMenuInfo, 6), 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return i(this, new WidgetSettings(z, this.n.c, false, false, 12, null), null, 47);
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
        if (!(obj instanceof SuperAppWidgetCustomMenu)) {
            return false;
        }
        SuperAppWidgetCustomMenu superAppWidgetCustomMenu = (SuperAppWidgetCustomMenu) obj;
        return epx.f(this.j, superAppWidgetCustomMenu.j) && epx.f(this.k, superAppWidgetCustomMenu.k) && this.l == superAppWidgetCustomMenu.l && epx.f(this.m, superAppWidgetCustomMenu.m) && epx.f(this.n, superAppWidgetCustomMenu.n) && epx.f(this.o, superAppWidgetCustomMenu.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppWidgetCustomMenu ? i(this, null, ((SuperAppWidgetCustomMenu) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final List<CustomMenuInfo> j() {
        return this.p;
    }

    public final String toString() {
        return "SuperAppWidgetCustomMenu(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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

    /* compiled from: SuperAppWidgetCustomMenu.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final List<CustomMenuInfo> b;
        public final boolean c;
        public final WidgetBasePayload d;
        public final CustomMenuInfo e;

        /* compiled from: SuperAppWidgetCustomMenu.kt */
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

        public Payload(List<CustomMenuInfo> list, boolean z, WidgetBasePayload widgetBasePayload, CustomMenuInfo customMenuInfo) {
            this.b = list;
            this.c = z;
            this.d = widgetBasePayload;
            this.e = customMenuInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Payload a(Payload payload, ArrayList arrayList, CustomMenuInfo customMenuInfo, int i) {
            List list = arrayList;
            if ((i & 1) != 0) {
                list = payload.b;
            }
            boolean z = payload.c;
            WidgetBasePayload widgetBasePayload = payload.d;
            if ((i & 8) != 0) {
                customMenuInfo = payload.e;
            }
            payload.getClass();
            return new Payload(list, z, widgetBasePayload, customMenuInfo);
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
            return epx.f(this.b, payload.b) && this.c == payload.c && epx.f(this.d, payload.d) && epx.f(this.e, payload.e);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31;
            CustomMenuInfo customMenuInfo = this.e;
            return hashCode + (customMenuInfo == null ? 0 : customMenuInfo.hashCode());
        }

        public final String toString() {
            return "Payload(menus=" + this.b + ", showMoreHasDot=" + this.c + ", basePayload=" + this.d + ", footerMenu=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.b);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }

        public Payload(Parcel parcel) {
            this(parcel.createTypedArrayList(CustomMenuInfo.CREATOR), qxm0.v(parcel), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()), (CustomMenuInfo) parcel.readParcelable(CustomMenuInfo.class.getClassLoader()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppWidgetCustomMenu(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.d;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
        this.p = payload.b;
        this.q = payload.e;
    }
}
