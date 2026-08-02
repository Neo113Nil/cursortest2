package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.ArrayList;
import java.util.List;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new b(16);
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public final String f5820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5821b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5822c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5823d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5824e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5825f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5826g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5827h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5828i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5829k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5830l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5831m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5832n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5833o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f5834p;
    public final long q;

    /* renamed from: r, reason: collision with root package name */
    public final List f5835r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5836s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5837t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5838u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5839v;

    /* renamed from: w, reason: collision with root package name */
    public final long f5840w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5841x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5842y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5843z;

    public zzr(String str, String str2, String str3, long j, String str4, long j6, long j10, String str5, boolean z5, boolean z7, String str6, long j11, int i5, boolean z10, boolean z11, Boolean bool, long j12, List list, String str7, String str8, String str9, boolean z12, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12) {
        v.e(str);
        this.f5820a = str;
        this.f5821b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f5822c = str3;
        this.j = j;
        this.f5823d = str4;
        this.f5824e = j6;
        this.f5825f = j10;
        this.f5826g = str5;
        this.f5827h = z5;
        this.f5828i = z7;
        this.f5829k = str6;
        this.f5830l = j11;
        this.f5831m = i5;
        this.f5832n = z10;
        this.f5833o = z11;
        this.f5834p = bool;
        this.q = j12;
        this.f5835r = list;
        this.f5836s = str7;
        this.f5837t = str8;
        this.f5838u = str9;
        this.f5839v = z12;
        this.f5840w = j13;
        this.f5841x = i10;
        this.f5842y = str10;
        this.f5843z = i11;
        this.A = j14;
        this.B = str11;
        this.C = str12;
        this.D = j15;
        this.E = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 2, this.f5820a, false);
        h8.b.O(parcel, 3, this.f5821b, false);
        h8.b.O(parcel, 4, this.f5822c, false);
        h8.b.O(parcel, 5, this.f5823d, false);
        h8.b.U(parcel, 6, 8);
        parcel.writeLong(this.f5824e);
        h8.b.U(parcel, 7, 8);
        parcel.writeLong(this.f5825f);
        h8.b.O(parcel, 8, this.f5826g, false);
        h8.b.U(parcel, 9, 4);
        parcel.writeInt(this.f5827h ? 1 : 0);
        h8.b.U(parcel, 10, 4);
        parcel.writeInt(this.f5828i ? 1 : 0);
        h8.b.U(parcel, 11, 8);
        parcel.writeLong(this.j);
        h8.b.O(parcel, 12, this.f5829k, false);
        h8.b.U(parcel, 14, 8);
        parcel.writeLong(this.f5830l);
        h8.b.U(parcel, 15, 4);
        parcel.writeInt(this.f5831m);
        h8.b.U(parcel, 16, 4);
        parcel.writeInt(this.f5832n ? 1 : 0);
        h8.b.U(parcel, 18, 4);
        parcel.writeInt(this.f5833o ? 1 : 0);
        Boolean bool = this.f5834p;
        if (bool != null) {
            h8.b.U(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        h8.b.U(parcel, 22, 8);
        parcel.writeLong(this.q);
        h8.b.P(parcel, 23, this.f5835r);
        h8.b.O(parcel, 25, this.f5836s, false);
        h8.b.O(parcel, 26, this.f5837t, false);
        h8.b.O(parcel, 27, this.f5838u, false);
        h8.b.U(parcel, 28, 4);
        parcel.writeInt(this.f5839v ? 1 : 0);
        h8.b.U(parcel, 29, 8);
        parcel.writeLong(this.f5840w);
        h8.b.U(parcel, 30, 4);
        parcel.writeInt(this.f5841x);
        h8.b.O(parcel, 31, this.f5842y, false);
        h8.b.U(parcel, 32, 4);
        parcel.writeInt(this.f5843z);
        h8.b.U(parcel, 34, 8);
        parcel.writeLong(this.A);
        h8.b.O(parcel, 35, this.B, false);
        h8.b.O(parcel, 36, this.C, false);
        h8.b.U(parcel, 37, 8);
        parcel.writeLong(this.D);
        h8.b.U(parcel, 38, 4);
        parcel.writeInt(this.E);
        h8.b.W(parcel, V);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j6, String str5, boolean z5, boolean z7, long j10, String str6, long j11, int i5, boolean z10, boolean z11, Boolean bool, long j12, ArrayList arrayList, String str7, String str8, String str9, boolean z12, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12) {
        this.f5820a = str;
        this.f5821b = str2;
        this.f5822c = str3;
        this.j = j10;
        this.f5823d = str4;
        this.f5824e = j;
        this.f5825f = j6;
        this.f5826g = str5;
        this.f5827h = z5;
        this.f5828i = z7;
        this.f5829k = str6;
        this.f5830l = j11;
        this.f5831m = i5;
        this.f5832n = z10;
        this.f5833o = z11;
        this.f5834p = bool;
        this.q = j12;
        this.f5835r = arrayList;
        this.f5836s = str7;
        this.f5837t = str8;
        this.f5838u = str9;
        this.f5839v = z12;
        this.f5840w = j13;
        this.f5841x = i10;
        this.f5842y = str10;
        this.f5843z = i11;
        this.A = j14;
        this.B = str11;
        this.C = str12;
        this.D = j15;
        this.E = i12;
    }
}
