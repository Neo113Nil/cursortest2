package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import java.util.List;
import xsna.bzk0;
import xsna.epx;
import xsna.qoy;
import xsna.qxm0;
import xsna.urd0;
import xsna.xq;
import xsna.zjh0;

/* compiled from: SuperAppWidgetOnboardingPanel.kt */
/* loaded from: classes6.dex */
public final class SuperAppWidgetOnboardingPanel extends SuperAppWidget {
    public static final a CREATOR = new a();
    public final WidgetIds j;
    public final String k;
    public final QueueSettings l;
    public final WidgetSettings m;
    public final String n;
    public final double o;
    public final WebImage p;
    public final String q;
    public final List<String> r;
    public final String s;
    public final boolean t;
    public final WebAction u;

    /* compiled from: SuperAppWidgetOnboardingPanel.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetOnboardingPanel> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetOnboardingPanel createFromParcel(Parcel parcel) {
            return new SuperAppWidgetOnboardingPanel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetOnboardingPanel[] newArray(int i) {
            return new SuperAppWidgetOnboardingPanel[i];
        }
    }

    public SuperAppWidgetOnboardingPanel(WidgetIds widgetIds, String str, QueueSettings queueSettings, WidgetSettings widgetSettings, String str2, double d, WebImage webImage, String str3, List<String> list, String str4, boolean z, WebAction webAction) {
        super(widgetIds, str, str2, SuperAppWidgetSize.REGULAR, queueSettings, widgetSettings, d, null, null, 384, null);
        this.j = widgetIds;
        this.k = str;
        this.l = queueSettings;
        this.m = widgetSettings;
        this.n = str2;
        this.o = d;
        this.p = webImage;
        this.q = str3;
        this.r = list;
        this.s = str4;
        this.t = z;
        this.u = webAction;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return new SuperAppWidgetOnboardingPanel(this.j, this.k, this.l, new WidgetSettings(z, this.m.c, false, false, 12, null), this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.j;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetOnboardingPanel)) {
            return false;
        }
        SuperAppWidgetOnboardingPanel superAppWidgetOnboardingPanel = (SuperAppWidgetOnboardingPanel) obj;
        return epx.f(this.j, superAppWidgetOnboardingPanel.j) && epx.f(this.k, superAppWidgetOnboardingPanel.k) && epx.f(this.l, superAppWidgetOnboardingPanel.l) && epx.f(this.m, superAppWidgetOnboardingPanel.m) && epx.f(this.n, superAppWidgetOnboardingPanel.n) && Double.compare(this.o, superAppWidgetOnboardingPanel.o) == 0 && epx.f(this.p, superAppWidgetOnboardingPanel.p) && epx.f(this.q, superAppWidgetOnboardingPanel.q) && epx.f(this.r, superAppWidgetOnboardingPanel.r) && epx.f(this.s, superAppWidgetOnboardingPanel.s) && this.t == superAppWidgetOnboardingPanel.t && epx.f(this.u, superAppWidgetOnboardingPanel.u);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final double f() {
        return this.o;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.k;
    }

    public final int hashCode() {
        int b = zjh0.b(this.o, urd0.a(xq.b(this.m, bzk0.a(this.l, urd0.a(this.j.hashCode() * 31, 31, this.k), 31), 31), 31, this.n), 31);
        WebImage webImage = this.p;
        int a2 = urd0.a((b + (webImage == null ? 0 : webImage.b.hashCode())) * 31, 31, this.q);
        List<String> list = this.r;
        int b2 = qoy.b(urd0.a((a2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.s), 31, this.t);
        WebAction webAction = this.u;
        return b2 + (webAction != null ? webAction.hashCode() : 0);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String r() {
        return this.n;
    }

    public final String toString() {
        return "SuperAppWidgetOnboardingPanel(ids=" + this.j + ", type=" + this.k + ", queueSettings=" + this.l + ", settings=" + this.m + ", trackCode=" + this.n + ", weight=" + this.o + ", icon=" + this.p + ", title=" + this.q + ", iconColor=" + this.r + ", subtitle=" + this.s + ", hasCloseButton=" + this.t + ", action=" + this.u + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.l, i);
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeDouble(this.o);
        parcel.writeParcelable(this.p, i);
        parcel.writeStringList(this.r);
        parcel.writeString(this.q);
        parcel.writeString(this.s);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.u, i);
    }

    public SuperAppWidgetOnboardingPanel(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), parcel.readString(), parcel.readDouble(), (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), qxm0.v(parcel), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
