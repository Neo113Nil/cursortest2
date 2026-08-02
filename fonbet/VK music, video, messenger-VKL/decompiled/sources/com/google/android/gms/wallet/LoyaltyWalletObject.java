package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import xsna.ozg0;
import xsna.ym01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new ym01();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    @Deprecated
    public String j;
    public String k;
    public int l;
    public TimeInterval n;

    @Deprecated
    public String p;

    @Deprecated
    public String q;
    public boolean s;
    public LoyaltyPoints w;
    public ArrayList<WalletObjectMessage> m = new ArrayList<>();
    public ArrayList<LatLng> o = new ArrayList<>();
    public ArrayList<LabelValueRow> r = new ArrayList<>();
    public ArrayList<UriData> t = new ArrayList<>();
    public ArrayList<TextModuleData> u = new ArrayList<>();
    public ArrayList<UriData> v = new ArrayList<>();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.q(parcel, 10, this.j, false);
        ozg0.q(parcel, 11, this.k, false);
        int i2 = this.l;
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(i2);
        ozg0.u(parcel, 13, this.m, false);
        ozg0.p(parcel, 14, this.n, i, false);
        ozg0.u(parcel, 15, this.o, false);
        ozg0.q(parcel, 16, this.p, false);
        ozg0.q(parcel, 17, this.q, false);
        ozg0.u(parcel, 18, this.r, false);
        boolean z = this.s;
        ozg0.v(parcel, 19, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.u(parcel, 20, this.t, false);
        ozg0.u(parcel, 21, this.u, false);
        ozg0.u(parcel, 22, this.v, false);
        ozg0.p(parcel, 23, this.w, i, false);
        ozg0.x(w, parcel);
    }
}
