package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bzk0;
import xsna.en;
import xsna.epx;
import xsna.gq;
import xsna.urd0;
import xsna.xq;
import xsna.zrp;

/* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseExpandableServiceMenu extends SuperAppWidget {
    public static final Parcelable.Creator<SuperAppShowcaseExpandableServiceMenu> CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new a();
        public final List<MenuItem> b;
        public final WidgetBasePayload c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
        public static final class ExpandableMenuItemType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ExpandableMenuItemType[] $VALUES;
            public static final ExpandableMenuItemType DEFAULT_ITEM;
            public static final ExpandableMenuItemType MORE_ITEM;

            static {
                ExpandableMenuItemType expandableMenuItemType = new ExpandableMenuItemType("MORE_ITEM", 0);
                MORE_ITEM = expandableMenuItemType;
                ExpandableMenuItemType expandableMenuItemType2 = new ExpandableMenuItemType("DEFAULT_ITEM", 1);
                DEFAULT_ITEM = expandableMenuItemType2;
                ExpandableMenuItemType[] expandableMenuItemTypeArr = {expandableMenuItemType, expandableMenuItemType2};
                $VALUES = expandableMenuItemTypeArr;
                $ENTRIES = new asp(expandableMenuItemTypeArr);
            }

            public ExpandableMenuItemType() {
                throw null;
            }

            public static ExpandableMenuItemType valueOf(String str) {
                return (ExpandableMenuItemType) Enum.valueOf(ExpandableMenuItemType.class, str);
            }

            public static ExpandableMenuItemType[] values() {
                return (ExpandableMenuItemType[]) $VALUES.clone();
            }
        }

        /* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
        public static final class MenuItem implements Parcelable {
            public static final Parcelable.Creator<MenuItem> CREATOR = new a();
            public final ExpandableMenuItemType b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final WebImage g;
            public final String h;
            public final WebAction i;
            public final BadgeInfo j;

            /* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
            public static final class a implements Parcelable.Creator<MenuItem> {
                @Override // android.os.Parcelable.Creator
                public final MenuItem createFromParcel(Parcel parcel) {
                    return new MenuItem(ExpandableMenuItemType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (WebImage) parcel.readParcelable(MenuItem.class.getClassLoader()), parcel.readString(), (WebAction) parcel.readParcelable(MenuItem.class.getClassLoader()), (BadgeInfo) parcel.readParcelable(MenuItem.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final MenuItem[] newArray(int i) {
                    return new MenuItem[i];
                }
            }

            public MenuItem(ExpandableMenuItemType expandableMenuItemType, String str, String str2, String str3, String str4, WebImage webImage, String str5, WebAction webAction, BadgeInfo badgeInfo) {
                this.b = expandableMenuItemType;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.g = webImage;
                this.h = str5;
                this.i = webAction;
                this.j = badgeInfo;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MenuItem)) {
                    return false;
                }
                MenuItem menuItem = (MenuItem) obj;
                return this.b == menuItem.b && epx.f(this.c, menuItem.c) && epx.f(this.d, menuItem.d) && epx.f(this.e, menuItem.e) && epx.f(this.f, menuItem.f) && epx.f(this.g, menuItem.g) && epx.f(this.h, menuItem.h) && epx.f(this.i, menuItem.i) && epx.f(this.j, menuItem.j);
            }

            public final int hashCode() {
                int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
                String str = this.d;
                int a3 = urd0.a(urd0.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
                WebImage webImage = this.g;
                int hashCode = (a3 + (webImage == null ? 0 : webImage.b.hashCode())) * 31;
                String str2 = this.h;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                WebAction webAction = this.i;
                int hashCode3 = (hashCode2 + (webAction == null ? 0 : webAction.hashCode())) * 31;
                BadgeInfo badgeInfo = this.j;
                return hashCode3 + (badgeInfo != null ? badgeInfo.hashCode() : 0);
            }

            public final String toString() {
                return "MenuItem(type=" + this.b + ", uid=" + this.c + ", name=" + this.d + ", trackCode=" + this.e + ", title=" + this.f + ", imageUrl=" + this.g + ", imageId=" + this.h + ", webAction=" + this.i + ", badgeInfo=" + this.j + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
                parcel.writeString(this.c);
                parcel.writeString(this.d);
                parcel.writeString(this.e);
                parcel.writeString(this.f);
                parcel.writeParcelable(this.g, i);
                parcel.writeString(this.h);
                parcel.writeParcelable(this.i, i);
                parcel.writeParcelable(this.j, i);
            }
        }

        /* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MenuItem.CREATOR, parcel, arrayList, i, 1);
                }
                return new Payload(arrayList, (WidgetBasePayload) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(List<MenuItem> list, WidgetBasePayload widgetBasePayload) {
            this.b = list;
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
            StringBuilder sb = new StringBuilder("Payload(items=");
            sb.append(this.b);
            sb.append(", basePayload=");
            return gq.f(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((MenuItem) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: SuperAppShowcaseExpandableServiceMenu.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseExpandableServiceMenu> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseExpandableServiceMenu createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseExpandableServiceMenu((WidgetIds) parcel.readParcelable(SuperAppShowcaseExpandableServiceMenu.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.valueOf(parcel.readString()), (QueueSettings) parcel.readParcelable(SuperAppShowcaseExpandableServiceMenu.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(SuperAppShowcaseExpandableServiceMenu.class.getClassLoader()), Payload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseExpandableServiceMenu[] newArray(int i) {
            return new SuperAppShowcaseExpandableServiceMenu[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseExpandableServiceMenu(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.c;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    public static SuperAppShowcaseExpandableServiceMenu i(SuperAppShowcaseExpandableServiceMenu superAppShowcaseExpandableServiceMenu, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseExpandableServiceMenu.j;
        String str = superAppShowcaseExpandableServiceMenu.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseExpandableServiceMenu.l;
        QueueSettings queueSettings = superAppShowcaseExpandableServiceMenu.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseExpandableServiceMenu.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseExpandableServiceMenu.o;
        }
        superAppShowcaseExpandableServiceMenu.getClass();
        return new SuperAppShowcaseExpandableServiceMenu(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppShowcaseExpandableServiceMenu)) {
            return false;
        }
        SuperAppShowcaseExpandableServiceMenu superAppShowcaseExpandableServiceMenu = (SuperAppShowcaseExpandableServiceMenu) obj;
        return epx.f(this.j, superAppShowcaseExpandableServiceMenu.j) && epx.f(this.k, superAppShowcaseExpandableServiceMenu.k) && this.l == superAppShowcaseExpandableServiceMenu.l && epx.f(this.m, superAppShowcaseExpandableServiceMenu.m) && epx.f(this.n, superAppShowcaseExpandableServiceMenu.n) && epx.f(this.o, superAppShowcaseExpandableServiceMenu.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseExpandableServiceMenu ? i(this, null, ((SuperAppShowcaseExpandableServiceMenu) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcaseExpandableServiceMenu(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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
