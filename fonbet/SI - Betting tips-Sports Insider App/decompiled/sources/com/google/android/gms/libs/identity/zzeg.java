package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import g6.j;
import g6.v;
import h8.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.LongCompanionObject;
import p7.e;
import q6.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new j(20);

    /* renamed from: a, reason: collision with root package name */
    public final LocationRequest f4873a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzeg(LocationRequest locationRequest, ArrayList arrayList, boolean z5, boolean z7, boolean z10, boolean z11, long j) {
        long j6;
        boolean z12;
        int i5;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z14;
        int i14 = locationRequest.f5714a;
        long j10 = locationRequest.f5715b;
        v.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
        e.a(i14);
        long j11 = locationRequest.f5716c;
        v.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j11 == -1 || j11 >= 0);
        long j12 = locationRequest.f5717d;
        v.a("maxUpdateDelayMillis must be greater than or equal to 0", j12 >= 0);
        long j13 = locationRequest.f5718e;
        v.a("durationMillis must be greater than 0", j13 > 0);
        int i15 = locationRequest.f5719f;
        v.a("maxUpdates must be greater than 0", i15 > 0);
        float f6 = locationRequest.f5720g;
        v.a("minUpdateDistanceMeters must be greater than or equal to 0", f6 >= 0.0f);
        boolean z15 = locationRequest.f5721h;
        long j14 = locationRequest.f5722i;
        if (j14 == -1 || j14 >= 0) {
            j6 = 0;
            z12 = true;
        } else {
            j6 = 0;
            z12 = false;
        }
        v.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z12);
        int i16 = locationRequest.j;
        if (i16 != 0) {
            i5 = 1;
            if (i16 != 1) {
                if (i16 == 2) {
                    i10 = 2;
                    z13 = 1;
                } else {
                    i10 = i16;
                    z13 = 0;
                }
                Object[] objArr = new Object[i5];
                objArr[0] = Integer.valueOf(i10);
                v.c(z13, "granularity %d must be a Granularity.GRANULARITY_* constant", objArr);
                i11 = locationRequest.f5723k;
                if (i11 == 0) {
                    i12 = 1;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            i13 = i11;
                            z14 = 0;
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = Integer.valueOf(i13);
                            v.c(z14, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2);
                            boolean z16 = locationRequest.f5724l;
                            WorkSource workSource = locationRequest.f5725m;
                            ClientIdentity clientIdentity = locationRequest.f5726n;
                            v.b(clientIdentity != null || clientIdentity.f4867f == null);
                            if (arrayList != null) {
                            }
                            ClientIdentity clientIdentity2 = clientIdentity;
                            boolean z17 = z16;
                            if (z5) {
                            }
                            if (!z7) {
                            }
                            if (z10) {
                            }
                            if (z11) {
                            }
                            if (j != LongCompanionObject.MAX_VALUE) {
                            }
                            if (j11 != -1) {
                            }
                            this.f4873a = new LocationRequest(i14, j10, j11, Math.max(j12, j10), LongCompanionObject.MAX_VALUE, j13, i15, f6, z15, j14 != -1 ? j10 : j14, i16, r4, z17, new WorkSource(workSource), clientIdentity2);
                        }
                        i13 = 2;
                        z14 = i12;
                        Object[] objArr22 = new Object[i12];
                        objArr22[0] = Integer.valueOf(i13);
                        v.c(z14, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr22);
                        boolean z162 = locationRequest.f5724l;
                        WorkSource workSource2 = locationRequest.f5725m;
                        ClientIdentity clientIdentity3 = locationRequest.f5726n;
                        v.b(clientIdentity3 != null || clientIdentity3.f4867f == null);
                        if (arrayList != null) {
                            if (arrayList.isEmpty()) {
                                workSource2 = null;
                            } else {
                                workSource2 = new WorkSource();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ClientIdentity clientIdentity4 = clientIdentity3;
                                    ClientIdentity clientIdentity5 = (ClientIdentity) it.next();
                                    f.a(workSource2, clientIdentity5.f4495a, clientIdentity5.f4496b);
                                    clientIdentity3 = clientIdentity4;
                                    z162 = z162;
                                }
                            }
                        }
                        ClientIdentity clientIdentity22 = clientIdentity3;
                        boolean z172 = z162;
                        i16 = z5 ? 1 : i16;
                        int i17 = !z7 ? 2 : i11;
                        z172 = z10 ? true : z172;
                        z15 = z11 ? true : z15;
                        if (j != LongCompanionObject.MAX_VALUE) {
                            v.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j == -1 || j >= j6);
                            j14 = j;
                        }
                        if (j11 != -1) {
                            j11 = j10;
                        } else if (i14 != 105) {
                            j11 = Math.min(j11, j10);
                        }
                        this.f4873a = new LocationRequest(i14, j10, j11, Math.max(j12, j10), LongCompanionObject.MAX_VALUE, j13, i15, f6, z15, j14 != -1 ? j10 : j14, i16, i17, z172, new WorkSource(workSource2), clientIdentity22);
                    }
                } else {
                    i12 = 1;
                }
                i13 = i11;
                z14 = i12;
                Object[] objArr222 = new Object[i12];
                objArr222[0] = Integer.valueOf(i13);
                v.c(z14, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr222);
                boolean z1622 = locationRequest.f5724l;
                WorkSource workSource22 = locationRequest.f5725m;
                ClientIdentity clientIdentity32 = locationRequest.f5726n;
                v.b(clientIdentity32 != null || clientIdentity32.f4867f == null);
                if (arrayList != null) {
                }
                ClientIdentity clientIdentity222 = clientIdentity32;
                boolean z1722 = z1622;
                if (z5) {
                }
                if (!z7) {
                }
                if (z10) {
                }
                if (z11) {
                }
                if (j != LongCompanionObject.MAX_VALUE) {
                }
                if (j11 != -1) {
                }
                this.f4873a = new LocationRequest(i14, j10, j11, Math.max(j12, j10), LongCompanionObject.MAX_VALUE, j13, i15, f6, z15, j14 != -1 ? j10 : j14, i16, i17, z1722, new WorkSource(workSource22), clientIdentity222);
            }
        } else {
            i5 = 1;
        }
        z13 = i5;
        i10 = i16;
        Object[] objArr3 = new Object[i5];
        objArr3[0] = Integer.valueOf(i10);
        v.c(z13, "granularity %d must be a Granularity.GRANULARITY_* constant", objArr3);
        i11 = locationRequest.f5723k;
        if (i11 == 0) {
        }
        i13 = i11;
        z14 = i12;
        Object[] objArr2222 = new Object[i12];
        objArr2222[0] = Integer.valueOf(i13);
        v.c(z14, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2222);
        boolean z16222 = locationRequest.f5724l;
        WorkSource workSource222 = locationRequest.f5725m;
        ClientIdentity clientIdentity322 = locationRequest.f5726n;
        v.b(clientIdentity322 != null || clientIdentity322.f4867f == null);
        if (arrayList != null) {
        }
        ClientIdentity clientIdentity2222 = clientIdentity322;
        boolean z17222 = z16222;
        if (z5) {
        }
        if (!z7) {
        }
        if (z10) {
        }
        if (z11) {
        }
        if (j != LongCompanionObject.MAX_VALUE) {
        }
        if (j11 != -1) {
        }
        this.f4873a = new LocationRequest(i14, j10, j11, Math.max(j12, j10), LongCompanionObject.MAX_VALUE, j13, i15, f6, z15, j14 != -1 ? j10 : j14, i16, i17, z17222, new WorkSource(workSource222), clientIdentity2222);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return v.k(this.f4873a, ((zzeg) obj).f4873a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4873a.hashCode();
    }

    public final String toString() {
        return this.f4873a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4873a, i5, false);
        b.W(parcel, V);
    }
}
