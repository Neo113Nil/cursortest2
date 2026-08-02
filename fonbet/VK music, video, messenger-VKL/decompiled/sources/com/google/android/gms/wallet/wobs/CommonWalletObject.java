package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import xsna.ozg0;
import xsna.r101;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
@KeepName
/* loaded from: classes13.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new r101();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    @Deprecated
    public String i;
    public int j;
    public TimeInterval l;

    @Deprecated
    public String n;

    @Deprecated
    public String o;
    public boolean q;
    public ArrayList<WalletObjectMessage> k = new ArrayList<>();
    public ArrayList<LatLng> m = new ArrayList<>();
    public ArrayList<LabelValueRow> p = new ArrayList<>();
    public ArrayList<UriData> r = new ArrayList<>();
    public ArrayList<TextModuleData> s = new ArrayList<>();
    public ArrayList<UriData> t = new ArrayList<>();

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
        int i2 = this.j;
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(i2);
        ozg0.u(parcel, 11, this.k, false);
        ozg0.p(parcel, 12, this.l, i, false);
        ozg0.u(parcel, 13, this.m, false);
        ozg0.q(parcel, 14, this.n, false);
        ozg0.q(parcel, 15, this.o, false);
        ozg0.u(parcel, 16, this.p, false);
        boolean z = this.q;
        ozg0.v(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.u(parcel, 18, this.r, false);
        ozg0.u(parcel, 19, this.s, false);
        ozg0.u(parcel, 20, this.t, false);
        ozg0.x(w, parcel);
    }
}
