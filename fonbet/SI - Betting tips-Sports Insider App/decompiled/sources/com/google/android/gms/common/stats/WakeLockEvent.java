package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import h8.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import n6.a;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new a(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f4608a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4610c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4611d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4612e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4613f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4614g;

    /* renamed from: h, reason: collision with root package name */
    public final List f4615h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4616i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4617k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4618l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4619m;

    /* renamed from: n, reason: collision with root package name */
    public final long f4620n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4621o;

    public WakeLockEvent(int i5, long j, int i10, String str, int i11, ArrayList arrayList, String str2, long j6, int i12, String str3, String str4, float f6, long j10, String str5, boolean z5) {
        this.f4608a = i5;
        this.f4609b = j;
        this.f4610c = i10;
        this.f4611d = str;
        this.f4612e = str3;
        this.f4613f = str5;
        this.f4614g = i11;
        this.f4615h = arrayList;
        this.f4616i = str2;
        this.j = j6;
        this.f4617k = i12;
        this.f4618l = str4;
        this.f4619m = f6;
        this.f4620n = j10;
        this.f4621o = z5;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long c() {
        return this.f4609b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int l0() {
        return this.f4610c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String o0() {
        List list = this.f4615h;
        String join = list == null ? "" : TextUtils.join(StringUtils.COMMA, list);
        String str = this.f4611d;
        int length = String.valueOf(str).length();
        int i5 = this.f4614g;
        int length2 = String.valueOf(i5).length() + length + 2;
        int length3 = String.valueOf(join).length();
        int i10 = this.f4617k;
        int length4 = String.valueOf(i10).length() + length2 + 1 + length3 + 1;
        String str2 = this.f4612e;
        if (str2 == null) {
            str2 = "";
        }
        int length5 = str2.length() + length4 + 1 + 1;
        String str3 = this.f4618l;
        if (str3 == null) {
            str3 = "";
        }
        int length6 = str3.length() + length5 + 1;
        float f6 = this.f4619m;
        int length7 = String.valueOf(f6).length() + length6 + 1;
        String str4 = this.f4613f;
        String str5 = str4 != null ? str4 : "";
        int length8 = str5.length() + length7 + 1;
        boolean z5 = this.f4621o;
        StringBuilder sb2 = new StringBuilder(length8 + String.valueOf(z5).length());
        sb2.append("\t");
        sb2.append(str);
        sb2.append("\t");
        sb2.append(i5);
        sb2.append("\t");
        sb2.append(join);
        sb2.append("\t");
        sb2.append(i10);
        k.s(sb2, "\t", str2, "\t", str3);
        sb2.append("\t");
        sb2.append(f6);
        sb2.append("\t");
        sb2.append(str5);
        sb2.append("\t");
        sb2.append(z5);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4608a);
        b.U(parcel, 2, 8);
        parcel.writeLong(this.f4609b);
        b.O(parcel, 4, this.f4611d, false);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4614g);
        b.P(parcel, 6, this.f4615h);
        b.U(parcel, 8, 8);
        parcel.writeLong(this.j);
        b.O(parcel, 10, this.f4612e, false);
        b.U(parcel, 11, 4);
        parcel.writeInt(this.f4610c);
        b.O(parcel, 12, this.f4616i, false);
        b.O(parcel, 13, this.f4618l, false);
        b.U(parcel, 14, 4);
        parcel.writeInt(this.f4617k);
        b.U(parcel, 15, 4);
        parcel.writeFloat(this.f4619m);
        b.U(parcel, 16, 8);
        parcel.writeLong(this.f4620n);
        b.O(parcel, 17, this.f4613f, false);
        b.U(parcel, 18, 4);
        parcel.writeInt(this.f4621o ? 1 : 0);
        b.W(parcel, V);
    }
}
