package com.vk.superapp.ui.widgets.miniwidgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import xsna.asp;
import xsna.brm0;
import xsna.epx;
import xsna.ojp0;
import xsna.qoy;
import xsna.qxm0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ExchangeMiniWidget.kt */
/* loaded from: classes6.dex */
public final class ExchangeMiniWidget extends MiniWidgetItem {
    public static final a CREATOR = new a();
    public final String h;
    public final WebAction i;
    public final WebImage j;
    public final MiniWidgetItem.HeaderIconAlign k;
    public final String l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final double q;
    public final CurrencyTrend r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExchangeMiniWidget.kt */
    public static final class CurrencyTrend {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CurrencyTrend[] $VALUES;
        public static final CurrencyTrend NEGATIVE;
        public static final CurrencyTrend POSITIVE;
        public static final CurrencyTrend ZERO;

        static {
            CurrencyTrend currencyTrend = new CurrencyTrend("POSITIVE", 0);
            POSITIVE = currencyTrend;
            CurrencyTrend currencyTrend2 = new CurrencyTrend("NEGATIVE", 1);
            NEGATIVE = currencyTrend2;
            CurrencyTrend currencyTrend3 = new CurrencyTrend("ZERO", 2);
            ZERO = currencyTrend3;
            CurrencyTrend[] currencyTrendArr = {currencyTrend, currencyTrend2, currencyTrend3};
            $VALUES = currencyTrendArr;
            $ENTRIES = new asp(currencyTrendArr);
        }

        public CurrencyTrend() {
            throw null;
        }

        public static CurrencyTrend valueOf(String str) {
            return (CurrencyTrend) Enum.valueOf(CurrencyTrend.class, str);
        }

        public static CurrencyTrend[] values() {
            return (CurrencyTrend[]) $VALUES.clone();
        }
    }

    /* compiled from: ExchangeMiniWidget.kt */
    public static final class a implements Parcelable.Creator<ExchangeMiniWidget> {
        @Override // android.os.Parcelable.Creator
        public final ExchangeMiniWidget createFromParcel(Parcel parcel) {
            return new ExchangeMiniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ExchangeMiniWidget[] newArray(int i) {
            return new ExchangeMiniWidget[i];
        }
    }

    public ExchangeMiniWidget(String str, WebAction webAction, WebImage webImage, MiniWidgetItem.HeaderIconAlign headerIconAlign, String str2, boolean z, String str3, String str4, String str5, double d) {
        super(str, webAction, webImage, headerIconAlign, str2, false, z);
        this.h = str;
        this.i = webAction;
        this.j = webImage;
        this.k = headerIconAlign;
        this.l = str2;
        this.m = z;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = d;
        this.r = brm0.B(str4, "-", false) ? CurrencyTrend.NEGATIVE : CurrencyTrend.POSITIVE;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final WebAction d() {
        return this.i;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeMiniWidget)) {
            return false;
        }
        ExchangeMiniWidget exchangeMiniWidget = (ExchangeMiniWidget) obj;
        return epx.f(this.h, exchangeMiniWidget.h) && epx.f(this.i, exchangeMiniWidget.i) && epx.f(this.j, exchangeMiniWidget.j) && this.k == exchangeMiniWidget.k && epx.f(this.l, exchangeMiniWidget.l) && this.m == exchangeMiniWidget.m && epx.f(this.n, exchangeMiniWidget.n) && epx.f(this.o, exchangeMiniWidget.o) && epx.f(this.p, exchangeMiniWidget.p) && Double.compare(this.q, exchangeMiniWidget.q) == 0;
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
        return Double.hashCode(this.q) + urd0.a(urd0.a(urd0.a(qoy.b(urd0.a((this.k.hashCode() + ((hashCode2 + (webImage != null ? webImage.b.hashCode() : 0)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final boolean i() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangeMiniWidget(type=");
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
        sb.append(", currencyName=");
        sb.append(this.n);
        sb.append(", currencyDeltaPercent=");
        sb.append(this.o);
        sb.append(", currencyDefaultSymbol=");
        sb.append(this.p);
        sb.append(", currencyDefaultValue=");
        return ojp0.a(sb, this.q, ')');
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k.ordinal());
        parcel.writeString(this.l);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeDouble(this.q);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
    }

    public ExchangeMiniWidget(Parcel parcel) {
        this(parcel.readString(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), MiniWidgetItem.HeaderIconAlign.values()[parcel.readInt()], parcel.readString(), qxm0.v(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
    }
}
