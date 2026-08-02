package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import g6.v;
import h8.b;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;
import m7.j;
import n6.a;
import p7.e;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new a(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f5683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5684b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5685c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5686d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5687e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5688f;

    /* renamed from: g, reason: collision with root package name */
    public final WorkSource f5689g;

    /* renamed from: h, reason: collision with root package name */
    public final ClientIdentity f5690h;

    public CurrentLocationRequest(long j, int i5, int i10, long j6, boolean z5, int i11, WorkSource workSource, ClientIdentity clientIdentity) {
        this.f5683a = j;
        this.f5684b = i5;
        this.f5685c = i10;
        this.f5686d = j6;
        this.f5687e = z5;
        this.f5688f = i11;
        this.f5689g = workSource;
        this.f5690h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.f5683a == currentLocationRequest.f5683a && this.f5684b == currentLocationRequest.f5684b && this.f5685c == currentLocationRequest.f5685c && this.f5686d == currentLocationRequest.f5686d && this.f5687e == currentLocationRequest.f5687e && this.f5688f == currentLocationRequest.f5688f && v.k(this.f5689g, currentLocationRequest.f5689g) && v.k(this.f5690h, currentLocationRequest.f5690h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5683a), Integer.valueOf(this.f5684b), Integer.valueOf(this.f5685c), Long.valueOf(this.f5686d)});
    }

    public final String toString() {
        String str;
        StringBuilder b10 = f.b("CurrentLocationRequest[");
        b10.append(e.b(this.f5685c));
        long j = this.f5683a;
        if (j != LongCompanionObject.MAX_VALUE) {
            b10.append(", maxAge=");
            j.a(j, b10);
        }
        long j6 = this.f5686d;
        if (j6 != LongCompanionObject.MAX_VALUE) {
            b10.append(", duration=");
            b10.append(j6);
            b10.append("ms");
        }
        int i5 = this.f5684b;
        if (i5 != 0) {
            b10.append(", ");
            b10.append(e.c(i5));
        }
        if (this.f5687e) {
            b10.append(", bypass");
        }
        int i10 = this.f5688f;
        if (i10 != 0) {
            b10.append(", ");
            if (i10 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i10 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            b10.append(str);
        }
        WorkSource workSource = this.f5689g;
        if (!q6.f.c(workSource)) {
            b10.append(", workSource=");
            b10.append(workSource);
        }
        ClientIdentity clientIdentity = this.f5690h;
        if (clientIdentity != null) {
            b10.append(", impersonation=");
            b10.append(clientIdentity);
        }
        b10.append(']');
        return b10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 8);
        parcel.writeLong(this.f5683a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5684b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5685c);
        b.U(parcel, 4, 8);
        parcel.writeLong(this.f5686d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f5687e ? 1 : 0);
        b.N(parcel, 6, this.f5689g, i5, false);
        b.U(parcel, 7, 4);
        parcel.writeInt(this.f5688f);
        b.N(parcel, 9, this.f5690h, i5, false);
        b.W(parcel, V);
    }
}
