package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import xsna.bzk0;
import xsna.enx0;
import xsna.epx;
import xsna.gq;
import xsna.shy;
import xsna.urd0;
import xsna.xq;

/* compiled from: SuperAppShowcaseConfirmNumberWidget.kt */
/* loaded from: classes6.dex */
public final class SuperAppShowcaseConfirmNumberWidget extends SuperAppWidget implements enx0 {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final SuperAppWidgetSize l;
    public final QueueSettings m;
    public final WidgetSettings n;
    public final Payload o;

    /* compiled from: SuperAppShowcaseConfirmNumberWidget.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseConfirmNumberWidget> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseConfirmNumberWidget createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseConfirmNumberWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseConfirmNumberWidget[] newArray(int i) {
            return new SuperAppShowcaseConfirmNumberWidget[i];
        }
    }

    public SuperAppShowcaseConfirmNumberWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), SuperAppWidgetSize.values()[parcel.readInt()], (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    public static SuperAppShowcaseConfirmNumberWidget i(SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget, WidgetSettings widgetSettings, Payload payload, int i) {
        WidgetIds widgetIds = superAppShowcaseConfirmNumberWidget.j;
        String str = superAppShowcaseConfirmNumberWidget.k;
        SuperAppWidgetSize superAppWidgetSize = superAppShowcaseConfirmNumberWidget.l;
        QueueSettings queueSettings = superAppShowcaseConfirmNumberWidget.m;
        if ((i & 16) != 0) {
            widgetSettings = superAppShowcaseConfirmNumberWidget.n;
        }
        WidgetSettings widgetSettings2 = widgetSettings;
        if ((i & 32) != 0) {
            payload = superAppShowcaseConfirmNumberWidget.o;
        }
        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str, superAppWidgetSize, queueSettings, widgetSettings2, payload);
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
        if (!(obj instanceof SuperAppShowcaseConfirmNumberWidget)) {
            return false;
        }
        SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget = (SuperAppShowcaseConfirmNumberWidget) obj;
        return epx.f(this.j, superAppShowcaseConfirmNumberWidget.j) && epx.f(this.k, superAppShowcaseConfirmNumberWidget.k) && this.l == superAppShowcaseConfirmNumberWidget.l && epx.f(this.m, superAppShowcaseConfirmNumberWidget.m) && epx.f(this.n, superAppShowcaseConfirmNumberWidget.n) && epx.f(this.o, superAppShowcaseConfirmNumberWidget.o);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget g(SuperAppWidget superAppWidget) {
        return superAppWidget instanceof SuperAppShowcaseConfirmNumberWidget ? i(this, null, ((SuperAppShowcaseConfirmNumberWidget) superAppWidget).o, 31) : this;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        return this.o.hashCode() + xq.b(this.n, bzk0.a(this.m, (this.l.hashCode() + urd0.a(this.j.hashCode() * 31, 31, this.k)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperAppShowcaseConfirmNumberWidget(ids=" + this.j + ", type=" + this.k + ", size=" + this.l + ", queueSettings=" + this.m + ", settings=" + this.n + ", payload=" + this.o + ')';
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuperAppShowcaseConfirmNumberWidget(WidgetIds widgetIds, String str, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, Payload payload) {
        super(widgetIds, str, r0.b, superAppWidgetSize, queueSettings, widgetSettings, r0.c, null, null, 384, null);
        WidgetBasePayload widgetBasePayload = payload.m;
        this.j = widgetIds;
        this.k = str;
        this.l = superAppWidgetSize;
        this.m = queueSettings;
        this.n = widgetSettings;
        this.o = payload;
    }

    /* compiled from: SuperAppShowcaseConfirmNumberWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final WidgetBasePayload m;

        /* compiled from: SuperAppShowcaseConfirmNumberWidget.kt */
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

        public Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, WidgetBasePayload widgetBasePayload) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = i;
            this.j = i2;
            this.k = i3;
            this.l = i4;
            this.m = widgetBasePayload;
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
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && epx.f(this.e, payload.e) && epx.f(this.f, payload.f) && epx.f(this.g, payload.g) && epx.f(this.h, payload.h) && this.i == payload.i && this.j == payload.j && this.k == payload.k && this.l == payload.l && epx.f(this.m, payload.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + shy.a(this.l, shy.a(this.k, shy.a(this.j, shy.a(this.i, urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(titleText=");
            sb.append(this.b);
            sb.append(", phoneNumberText=");
            sb.append(this.c);
            sb.append(", confirmButtonText=");
            sb.append(this.d);
            sb.append(", enterNewButtonText=");
            sb.append(this.e);
            sb.append(", successSnackbarText=");
            sb.append(this.f);
            sb.append(", failedSnackbarText=");
            sb.append(this.g);
            sb.append(", changePhoneNumberUrl=");
            sb.append(this.h);
            sb.append(", confirmNumberActionElementId=");
            sb.append(this.i);
            sb.append(", changeNumberActionElementId=");
            sb.append(this.j);
            sb.append(", successActionElementId=");
            sb.append(this.k);
            sb.append(", failedActionElementId=");
            sb.append(this.l);
            sb.append(", basePayload=");
            return gq.f(sb, this.m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeParcelable(this.m, i);
        }

        public Payload(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }
    }
}
