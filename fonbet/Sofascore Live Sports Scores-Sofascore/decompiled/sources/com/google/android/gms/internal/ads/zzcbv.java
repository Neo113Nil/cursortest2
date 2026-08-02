package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbv> CREATOR = new zzcbw();
    public final Bundle a;
    public final VersionInfoParcel b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public zzfns i;
    public String j;
    public final boolean k;
    public final boolean l;
    public final Bundle m;

    public zzcbv(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, zzfns zzfnsVar, String str4, boolean z, boolean z2, Bundle bundle2) {
        this.a = bundle;
        this.b = versionInfoParcel;
        this.d = str;
        this.c = applicationInfo;
        this.e = arrayList;
        this.f = packageInfo;
        this.g = str2;
        this.h = str3;
        this.i = zzfnsVar;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.b(parcel, 1, this.a);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.o(parcel, 5, this.e);
        SafeParcelWriter.l(parcel, 6, this.f, i, false);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.m(parcel, 9, this.h, false);
        SafeParcelWriter.l(parcel, 10, this.i, i, false);
        SafeParcelWriter.m(parcel, 11, this.j, false);
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(this.k ? 1 : 0);
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(this.l ? 1 : 0);
        SafeParcelWriter.b(parcel, 14, this.m);
        SafeParcelWriter.t(parcel, s);
    }
}
