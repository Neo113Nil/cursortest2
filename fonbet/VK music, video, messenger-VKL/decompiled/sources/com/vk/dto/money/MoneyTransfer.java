package com.vk.dto.money;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ho8;
import xsna.t230;
import xsna.z230;
import xsna.zr;

/* loaded from: classes18.dex */
public class MoneyTransfer extends t230 implements Parcelable {
    public static final Parcelable.Creator<MoneyTransfer> CREATOR = new a();
    public int c;
    public UserId d;
    public String e;
    public String f;
    public UserProfile g;
    public UserProfile h;
    public UserId i;
    public int j;
    public int k;
    public boolean l;
    public String m;
    public String n;
    public String o;
    public int p;
    public String q;
    public String r;
    public boolean s;
    public String t;

    public class a implements Parcelable.Creator<MoneyTransfer> {
        @Override // android.os.Parcelable.Creator
        public final MoneyTransfer createFromParcel(Parcel parcel) {
            MoneyTransfer moneyTransfer = new MoneyTransfer();
            moneyTransfer.c = 0;
            UserId userId = UserId.d;
            moneyTransfer.d = userId;
            moneyTransfer.e = "";
            moneyTransfer.f = "";
            moneyTransfer.g = null;
            moneyTransfer.h = null;
            moneyTransfer.i = userId;
            moneyTransfer.j = 0;
            moneyTransfer.k = 0;
            moneyTransfer.l = false;
            moneyTransfer.m = "";
            moneyTransfer.n = "";
            moneyTransfer.o = "";
            moneyTransfer.p = 0;
            moneyTransfer.q = "";
            moneyTransfer.r = "";
            moneyTransfer.s = false;
            moneyTransfer.t = null;
            moneyTransfer.c = parcel.readInt();
            moneyTransfer.d = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            moneyTransfer.i = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            moneyTransfer.j = parcel.readInt();
            moneyTransfer.k = parcel.readInt();
            moneyTransfer.l = parcel.readInt() == 1;
            moneyTransfer.m = parcel.readString();
            moneyTransfer.n = parcel.readString();
            moneyTransfer.o = parcel.readString();
            moneyTransfer.p = parcel.readInt();
            moneyTransfer.q = parcel.readString();
            moneyTransfer.r = parcel.readString();
            if (parcel.readInt() != 0) {
                moneyTransfer.g = (UserProfile) parcel.readParcelable(UserProfile.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                moneyTransfer.h = (UserProfile) parcel.readParcelable(UserProfile.class.getClassLoader());
            }
            moneyTransfer.e = parcel.readString();
            moneyTransfer.f = parcel.readString();
            moneyTransfer.s = parcel.readInt() == 1;
            moneyTransfer.t = parcel.readString();
            return moneyTransfer;
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyTransfer[] newArray(int i) {
            return new MoneyTransfer[i];
        }
    }

    public MoneyTransfer() {
        this.c = 0;
        UserId userId = UserId.d;
        this.d = userId;
        this.e = "";
        this.f = "";
        this.g = null;
        this.h = null;
        this.i = userId;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = 0;
        this.q = "";
        this.r = "";
        this.s = false;
        this.t = null;
    }

    public static String n(String str) {
        return zr.a("https://", str, "/support?act=faqs_pay&c=1");
    }

    public static String o(String str) {
        if (str == null) {
            str = "";
        }
        switch (str) {
            case "EUR":
                return "€";
            case "GPB":
                return "£";
            case "KZT":
                return "₸";
            case "RUB":
                return "₽";
            case "USD":
                return "$";
            default:
                return "";
        }
    }

    public final String d() {
        double d;
        try {
            d = Integer.parseInt(this.m) / 100.0d;
        } catch (Exception unused) {
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator((char) 160);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        int i = this.p;
        if (i == 643) {
            return "₽";
        }
        if (i == 398) {
            return "₸";
        }
        String str = this.q;
        return str == null ? "" : str;
    }

    public final UserProfile f() {
        return u() ? this.g : this.h;
    }

    public final String g() {
        String str;
        StringBuilder b = ho8.b(u() ? "+" : "−", " ");
        String e = e();
        if (e.isEmpty()) {
            str = d();
        } else {
            str = d() + " " + e;
        }
        b.append(str);
        return b.toString();
    }

    public final boolean u() {
        return Objects.equals(z230.b.c(), this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        if (this.g == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.g, i);
        }
        if (this.h == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.h, i);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeString(this.t);
    }

    public MoneyTransfer(JSONObject jSONObject) {
        this.c = 0;
        UserId userId = UserId.d;
        this.d = userId;
        this.e = "";
        this.f = "";
        this.g = null;
        this.h = null;
        this.i = userId;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = 0;
        this.q = "";
        this.r = "";
        this.s = false;
        this.t = null;
        try {
            this.c = jSONObject.getInt("id");
            this.e = jSONObject.optString("to_access_key", "");
            this.i = new UserId(jSONObject.optLong("to_id", 0L));
            this.f = jSONObject.optString("from_access_key", "");
            this.d = new UserId(jSONObject.optLong("from_id", 0L));
            this.j = jSONObject.getInt("status");
            this.k = jSONObject.getInt("date");
            this.l = jSONObject.optBoolean("is_anonymous", false);
            JSONObject jSONObject2 = jSONObject.getJSONObject("amount");
            this.m = jSONObject2.optString("amount");
            this.n = jSONObject2.optString("text");
            JSONObject optJSONObject = jSONObject2.optJSONObject(InAppPurchaseMetaData.KEY_CURRENCY);
            if (optJSONObject != null) {
                this.p = optJSONObject.getInt("id");
                this.q = optJSONObject.optString("name");
            }
            this.r = jSONObject.optString("accept_url");
            this.o = jSONObject.optString("comment");
            this.s = jSONObject.optBoolean("is_vkpay");
        } catch (Exception e) {
            L.B("vk", "Error parsing MoneyTransfer " + jSONObject, e);
        }
    }
}
