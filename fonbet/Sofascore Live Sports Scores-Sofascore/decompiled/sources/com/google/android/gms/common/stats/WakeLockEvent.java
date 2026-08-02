package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import defpackage.mz1;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    public final int a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final String i;
    public final long j;
    public final int k;
    public final String l;
    public final float m;
    public final long n;
    public final boolean o;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, ArrayList arrayList, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.g = i3;
        this.h = arrayList;
        this.i = str2;
        this.j = j2;
        this.k = i4;
        this.l = str4;
        this.m = f;
        this.n = j3;
        this.o = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long Y0() {
        return this.b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int Z0() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String a1() {
        List list = this.h;
        String join = list == null ? "" : TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, list);
        String str = this.d;
        int length = String.valueOf(str).length();
        int i = this.g;
        int length2 = String.valueOf(i).length() + length + 2;
        int length3 = String.valueOf(join).length();
        int i2 = this.k;
        int length4 = String.valueOf(i2).length() + length2 + 1 + length3 + 1;
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        int d = mz1.d(length4 + 1, 1, str2);
        String str3 = this.l;
        if (str3 == null) {
            str3 = "";
        }
        int d2 = mz1.d(d, 1, str3);
        float f = this.m;
        int length5 = String.valueOf(f).length() + d2 + 1;
        String str4 = this.f;
        String str5 = str4 != null ? str4 : "";
        int d3 = mz1.d(length5, 1, str5);
        boolean z = this.o;
        StringBuilder sb = new StringBuilder(d3 + String.valueOf(z).length());
        wt3.t(i, "\t", str, "\t", sb);
        wt3.t(i2, "\t", join, "\t", sb);
        bf3.v(sb, "\t", str2, "\t", str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.g);
        SafeParcelWriter.o(parcel, 6, this.h);
        SafeParcelWriter.r(parcel, 8, 8);
        parcel.writeLong(this.j);
        SafeParcelWriter.m(parcel, 10, this.e, false);
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.m(parcel, 12, this.i, false);
        SafeParcelWriter.m(parcel, 13, this.l, false);
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(this.k);
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeFloat(this.m);
        SafeParcelWriter.r(parcel, 16, 8);
        parcel.writeLong(this.n);
        SafeParcelWriter.m(parcel, 17, this.f, false);
        SafeParcelWriter.r(parcel, 18, 4);
        parcel.writeInt(this.o ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
