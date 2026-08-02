package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new a(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f5740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5742c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5744e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5745f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5746g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5747h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5748i;

    public SleepClassifyEvent(int i5, int i10, int i11, int i12, int i13, int i14, int i15, boolean z5, int i16) {
        this.f5740a = i5;
        this.f5741b = i10;
        this.f5742c = i11;
        this.f5743d = i12;
        this.f5744e = i13;
        this.f5745f = i14;
        this.f5746g = i15;
        this.f5747h = z5;
        this.f5748i = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.f5740a == sleepClassifyEvent.f5740a && this.f5741b == sleepClassifyEvent.f5741b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5740a), Integer.valueOf(this.f5741b)});
    }

    public final String toString() {
        int i5 = this.f5740a;
        int length = String.valueOf(i5).length();
        int i10 = this.f5741b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f5742c;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f5743d;
        StringBuilder sb2 = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i12).length());
        sb2.append(i5);
        sb2.append(" Conf:");
        sb2.append(i10);
        sb2.append(" Motion:");
        sb2.append(i11);
        sb2.append(" Light:");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5740a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5741b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5742c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f5743d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f5744e);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f5745f);
        b.U(parcel, 7, 4);
        parcel.writeInt(this.f5746g);
        b.U(parcel, 8, 4);
        parcel.writeInt(this.f5747h ? 1 : 0);
        b.U(parcel, 9, 4);
        parcel.writeInt(this.f5748i);
        b.W(parcel, V);
    }
}
