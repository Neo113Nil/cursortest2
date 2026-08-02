package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zzf();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public volatile String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final zzi o;
    public final boolean p;
    public final zzg q;
    public final int r;
    public final int s;
    public final boolean t;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, ArrayList arrayList, boolean z4, boolean z5, zzi zziVar, boolean z6, zzg zzgVar, int i4, int i5, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = arrayList;
        this.m = z4;
        this.n = z5;
        this.o = zziVar;
        this.p = z6;
        this.q = zzgVar;
        this.r = i4;
        this.s = i5;
        this.t = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return Objects.a(this.a, connectionConfiguration.a) && Objects.a(this.b, connectionConfiguration.b) && Objects.a(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && Objects.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && Objects.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && Objects.a(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h)) && Objects.a(Boolean.valueOf(this.m), Boolean.valueOf(connectionConfiguration.m)) && Objects.a(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Boolean.valueOf(this.m), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ Name=");
        sb.append(this.a);
        sb.append(", Address=");
        String str = this.b;
        String str2 = "{invalid address}";
        if (str != null && str.length() == 17) {
            str2 = "XX:XX:XX:XX:".concat(str.substring(12));
        }
        sb.append(str2);
        sb.append(", Type=");
        sb.append(this.c);
        sb.append(", Role=");
        sb.append(this.d);
        sb.append(", Enabled=");
        sb.append(this.e);
        sb.append(", IsConnected=");
        sb.append(this.f);
        sb.append(", PeerNodeId=");
        sb.append(this.g);
        sb.append(", BtlePriority=");
        sb.append(this.h);
        sb.append(", NodeId=");
        sb.append(this.i);
        sb.append(", PackageName=");
        sb.append(this.j);
        sb.append(", ConnectionRetryStrategy=");
        sb.append(this.k);
        sb.append(", allowedConfigPackages=");
        sb.append(this.l);
        sb.append(", Migrating=");
        sb.append(this.m);
        sb.append(", DataItemSyncEnabled=");
        sb.append(this.n);
        sb.append(", ConnectionRestrictions=");
        sb.append(this.o);
        sb.append(", removeConnectionWhenBondRemovedByUser=");
        sb.append(this.p);
        sb.append(", maxSupportedRemoteAndroidSdkVersion=");
        sb.append(this.r);
        sb.append(", runtimeType=");
        sb.append(this.s);
        sb.append(", skipConnectingIfDeviceNotBonded=");
        return wt3.p(sb, this.t, U3.j.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, str, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        int i2 = this.c;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(i3);
        boolean z = this.e;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        boolean z3 = this.h;
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m(parcel, 10, this.i, false);
        SafeParcelWriter.m(parcel, 11, this.j, false);
        int i4 = this.k;
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(i4);
        SafeParcelWriter.o(parcel, 13, this.l);
        boolean z4 = this.m;
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.n;
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeInt(z5 ? 1 : 0);
        SafeParcelWriter.l(parcel, 16, this.o, i, false);
        boolean z6 = this.p;
        SafeParcelWriter.r(parcel, 17, 4);
        parcel.writeInt(z6 ? 1 : 0);
        SafeParcelWriter.l(parcel, 18, this.q, i, false);
        int i5 = this.r;
        SafeParcelWriter.r(parcel, 19, 4);
        parcel.writeInt(i5);
        int i6 = this.s;
        SafeParcelWriter.r(parcel, 20, 4);
        parcel.writeInt(i6);
        boolean z7 = this.t;
        SafeParcelWriter.r(parcel, 21, 4);
        parcel.writeInt(z7 ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
