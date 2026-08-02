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
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new a(16);

    /* renamed from: a, reason: collision with root package name */
    public final long f5749a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5752d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5753e;

    public SleepSegmentEvent(int i5, int i10, int i11, long j, long j6) {
        v.a("endTimeMillis must be greater than or equal to startTimeMillis", j <= j6);
        this.f5749a = j;
        this.f5750b = j6;
        this.f5751c = i5;
        this.f5752d = i10;
        this.f5753e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f5749a == sleepSegmentEvent.f5749a && this.f5750b == sleepSegmentEvent.f5750b && this.f5751c == sleepSegmentEvent.f5751c && this.f5752d == sleepSegmentEvent.f5752d && this.f5753e == sleepSegmentEvent.f5753e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5749a), Long.valueOf(this.f5750b), Integer.valueOf(this.f5751c)});
    }

    public final String toString() {
        long j = this.f5749a;
        int length = String.valueOf(j).length();
        long j6 = this.f5750b;
        int length2 = String.valueOf(j6).length();
        int i5 = this.f5751c;
        StringBuilder sb2 = new StringBuilder(length + 24 + length2 + 9 + String.valueOf(i5).length());
        sb2.append("startMillis=");
        sb2.append(j);
        sb2.append(", endMillis=");
        sb2.append(j6);
        sb2.append(", status=");
        sb2.append(i5);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 8);
        parcel.writeLong(this.f5749a);
        b.U(parcel, 2, 8);
        parcel.writeLong(this.f5750b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5751c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f5752d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f5753e);
        b.W(parcel, V);
    }
}
