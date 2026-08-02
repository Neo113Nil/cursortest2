package com.vk.superapp.ui.widgets.miniwidgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.qxm0;
import xsna.urd0;

/* compiled from: DefaultMiniWidget.kt */
/* loaded from: classes6.dex */
public final class DefaultMiniWidget extends MiniWidgetItem {
    public static final a CREATOR = new a();
    public final String h;
    public final WebAction i;
    public final WebImage j;
    public final MiniWidgetItem.HeaderIconAlign k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;

    /* compiled from: DefaultMiniWidget.kt */
    public static final class a implements Parcelable.Creator<DefaultMiniWidget> {
        @Override // android.os.Parcelable.Creator
        public final DefaultMiniWidget createFromParcel(Parcel parcel) {
            return new DefaultMiniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultMiniWidget[] newArray(int i) {
            return new DefaultMiniWidget[i];
        }
    }

    public DefaultMiniWidget(String str, WebAction webAction, WebImage webImage, MiniWidgetItem.HeaderIconAlign headerIconAlign, String str2, boolean z, boolean z2, String str3, String str4) {
        super(str, webAction, webImage, headerIconAlign, str2, z2, z);
        this.h = str;
        this.i = webAction;
        this.j = webImage;
        this.k = headerIconAlign;
        this.l = str2;
        this.m = z;
        this.n = z2;
        this.o = str3;
        this.p = str4;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final WebAction d() {
        return this.i;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final boolean e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMiniWidget)) {
            return false;
        }
        DefaultMiniWidget defaultMiniWidget = (DefaultMiniWidget) obj;
        return epx.f(this.h, defaultMiniWidget.h) && epx.f(this.i, defaultMiniWidget.i) && epx.f(this.j, defaultMiniWidget.j) && this.k == defaultMiniWidget.k && epx.f(this.l, defaultMiniWidget.l) && this.m == defaultMiniWidget.m && this.n == defaultMiniWidget.n && epx.f(this.o, defaultMiniWidget.o) && epx.f(this.p, defaultMiniWidget.p);
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final MiniWidgetItem.HeaderIconAlign f() {
        return this.k;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final String g() {
        return this.l;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final String getType() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        WebAction webAction = this.i;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        WebImage webImage = this.j;
        return this.p.hashCode() + urd0.a(qoy.b(qoy.b(urd0.a((this.k.hashCode() + ((hashCode2 + (webImage != null ? webImage.b.hashCode() : 0)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final boolean i() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultMiniWidget(type=");
        sb.append(this.h);
        sb.append(", action=");
        sb.append(this.i);
        sb.append(", image=");
        sb.append(this.j);
        sb.append(", headerIconAlign=");
        sb.append(this.k);
        sb.append(", uid=");
        sb.append(this.l);
        sb.append(", isEnabled=");
        sb.append(this.m);
        sb.append(", customImage=");
        sb.append(this.n);
        sb.append(", title=");
        sb.append(this.o);
        sb.append(", subtitle=");
        return ho8.a(sb, this.p, ')');
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k.ordinal());
        parcel.writeString(this.l);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultMiniWidget(Parcel parcel) {
        this(r1, r2, r3, r4, r5, qxm0.v(parcel), qxm0.v(parcel), r8, r9);
        String readString = parcel.readString();
        WebAction webAction = (WebAction) parcel.readParcelable(WebAction.class.getClassLoader());
        WebImage webImage = (WebImage) parcel.readParcelable(WebImage.class.getClassLoader());
        MiniWidgetItem.HeaderIconAlign headerIconAlign = MiniWidgetItem.HeaderIconAlign.values()[parcel.readInt()];
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
    }
}
