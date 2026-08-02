package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcp;
import com.google.android.gms.internal.fitness.zzcq;
import java.util.Arrays;
import java.util.List;
import xsna.bzz0;
import xsna.dq70;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class SessionReadRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SessionReadRequest> CREATOR = new bzz0();
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final List j;

    @Nullable
    public final zzcq k;
    public final boolean l;
    public final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionReadRequest(SessionReadRequest sessionReadRequest, zzcq zzcqVar) {
        this(sessionReadRequest.b, sessionReadRequest.c, sessionReadRequest.d, sessionReadRequest.e, sessionReadRequest.f, sessionReadRequest.g, sessionReadRequest.h, sessionReadRequest.i, sessionReadRequest.j, zzcqVar, sessionReadRequest.l, sessionReadRequest.m);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadRequest)) {
            return false;
        }
        SessionReadRequest sessionReadRequest = (SessionReadRequest) obj;
        return dq70.b(this.b, sessionReadRequest.b) && this.c.equals(sessionReadRequest.c) && this.d == sessionReadRequest.d && this.e == sessionReadRequest.e && dq70.b(this.f, sessionReadRequest.f) && dq70.b(this.g, sessionReadRequest.g) && this.h == sessionReadRequest.h && this.j.equals(sessionReadRequest.j) && this.i == sessionReadRequest.i && this.l == sessionReadRequest.l && this.m == sessionReadRequest.m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "sessionName");
        aVar.a(this.c, "sessionId");
        aVar.a(Long.valueOf(this.d), "startTimeMillis");
        aVar.a(Long.valueOf(this.e), "endTimeMillis");
        aVar.a(this.f, "dataTypes");
        aVar.a(this.g, "dataSources");
        aVar.a(Boolean.valueOf(this.h), "sessionsFromAllApps");
        aVar.a(this.j, "excludedPackages");
        aVar.a(Boolean.valueOf(this.i), "useServer");
        aVar.a(Boolean.valueOf(this.l), "activitySessionsIncluded");
        aVar.a(Boolean.valueOf(this.m), "sleepSessionsIncluded");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.u(parcel, 5, this.f, false);
        ozg0.u(parcel, 6, this.g, false);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ozg0.s(parcel, this.j, 9);
        zzcq zzcqVar = this.k;
        ozg0.h(parcel, 10, zzcqVar == null ? null : zzcqVar.asBinder());
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(this.l ? 1 : 0);
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(this.m ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public SessionReadRequest(String str, String str2, long j, long j2, List list, List list2, boolean z, boolean z2, List list3, @Nullable IBinder iBinder, boolean z3, boolean z4) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = z;
        this.i = z2;
        this.j = list3;
        this.k = iBinder == null ? null : zzcp.zzb(iBinder);
        this.l = z3;
        this.m = z4;
    }
}
