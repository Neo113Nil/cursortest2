package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.LocationRequest;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeh implements Parcelable.Creator {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        long j;
        long j2;
        long j3;
        WorkSource workSource;
        int B = SafeParcelReader.B(parcel);
        long j4 = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList<ClientIdentity> arrayList = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.h(parcel, readInt, LocationRequest.CREATOR);
            } else if (c == 5) {
                arrayList = SafeParcelReader.m(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c == '\b') {
                z4 = SafeParcelReader.o(parcel, readInt);
            } else if (c != '\t') {
                switch (c) {
                    case 11:
                        z6 = SafeParcelReader.o(parcel, readInt);
                        break;
                    case '\f':
                        z7 = SafeParcelReader.o(parcel, readInt);
                        break;
                    case '\r':
                        SafeParcelReader.i(parcel, readInt);
                        break;
                    case 14:
                        j4 = SafeParcelReader.x(parcel, readInt);
                        break;
                    default:
                        SafeParcelReader.A(parcel, readInt);
                        break;
                }
            } else {
                z5 = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        zzeg zzegVar = new zzeg();
        int i6 = locationRequest.a;
        long j5 = locationRequest.b;
        LocationRequest.Builder builder = new LocationRequest.Builder();
        builder.a = 102;
        builder.c = -1L;
        builder.d = 0L;
        builder.e = Long.MAX_VALUE;
        builder.f = Integer.MAX_VALUE;
        builder.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        builder.h = true;
        builder.i = -1L;
        builder.j = 0;
        builder.k = 0;
        builder.l = false;
        builder.m = null;
        builder.n = null;
        Preconditions.a("intervalMillis must be greater than or equal to 0", j5 >= 0);
        builder.b = j5;
        if (i6 == 100 || i6 == 102 || i6 == 104) {
            i = i6;
        } else {
            if (i6 != 105) {
                i = i6;
                z = false;
                Preconditions.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
                builder.a = i6;
                long j6 = locationRequest.c;
                Preconditions.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j6 != -1 || j6 >= 0);
                builder.c = j6;
                long j7 = locationRequest.d;
                Preconditions.a("maxUpdateDelayMillis must be greater than or equal to 0", j7 < 0);
                builder.d = j7;
                long j8 = locationRequest.e;
                Preconditions.a("durationMillis must be greater than 0", j8 <= 0);
                builder.e = j8;
                int i7 = locationRequest.f;
                Preconditions.a("maxUpdates must be greater than 0", i7 <= 0);
                builder.f = i7;
                float f = locationRequest.g;
                Preconditions.a("minUpdateDistanceMeters must be greater than or equal to 0", f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                builder.g = f;
                builder.h = locationRequest.h;
                long j9 = locationRequest.i;
                Preconditions.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j9 != -1 || j9 >= 0);
                builder.i = j9;
                i2 = locationRequest.j;
                if (i2 != 0 || i2 == 1) {
                    i3 = i2;
                } else {
                    if (i2 != 2) {
                        i3 = i2;
                        z2 = false;
                        Preconditions.c(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i3));
                        builder.j = i2;
                        i4 = locationRequest.k;
                        if (i4 != 0 || i4 == 1) {
                            i5 = i4;
                        } else {
                            if (i4 != 2) {
                                i5 = i4;
                                z3 = false;
                                Preconditions.c(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i5));
                                builder.k = i4;
                                builder.l = locationRequest.l;
                                builder.m = locationRequest.m;
                                ClientIdentity clientIdentity = locationRequest.n;
                                Preconditions.b(clientIdentity != null || clientIdentity.f == null);
                                builder.n = clientIdentity;
                                if (arrayList != null) {
                                    if (arrayList.isEmpty()) {
                                        workSource = null;
                                    } else {
                                        workSource = new WorkSource();
                                        for (ClientIdentity clientIdentity2 : arrayList) {
                                            WorkSourceUtil.a(workSource, clientIdentity2.a, clientIdentity2.b);
                                        }
                                    }
                                    builder.m = workSource;
                                }
                                if (z4) {
                                    builder.j = 1;
                                }
                                if (z5) {
                                    builder.k = 2;
                                }
                                if (z6) {
                                    builder.l = true;
                                }
                                if (z7) {
                                    builder.h = true;
                                }
                                if (j4 != Long.MAX_VALUE) {
                                    Preconditions.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j4 == -1 || j4 >= 0);
                                    builder.i = j4;
                                }
                                int i8 = builder.a;
                                long j10 = builder.b;
                                j = builder.c;
                                if (j != -1) {
                                    j2 = j10;
                                } else {
                                    if (i8 != 105) {
                                        j = Math.min(j, j10);
                                    }
                                    j2 = j;
                                }
                                long max = Math.max(builder.d, builder.b);
                                long j11 = builder.e;
                                int i9 = builder.f;
                                float f2 = builder.g;
                                boolean z8 = builder.h;
                                j3 = builder.i;
                                if (j3 == -1) {
                                    j3 = builder.b;
                                }
                                zzegVar.a = new LocationRequest(i8, j10, j2, max, Long.MAX_VALUE, j11, i9, f2, z8, j3, builder.j, builder.k, builder.l, new WorkSource(builder.m), builder.n);
                                return zzegVar;
                            }
                            i5 = 2;
                        }
                        z3 = true;
                        Preconditions.c(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i5));
                        builder.k = i4;
                        builder.l = locationRequest.l;
                        builder.m = locationRequest.m;
                        ClientIdentity clientIdentity3 = locationRequest.n;
                        Preconditions.b(clientIdentity3 != null || clientIdentity3.f == null);
                        builder.n = clientIdentity3;
                        if (arrayList != null) {
                        }
                        if (z4) {
                        }
                        if (z5) {
                        }
                        if (z6) {
                        }
                        if (z7) {
                        }
                        if (j4 != Long.MAX_VALUE) {
                        }
                        int i82 = builder.a;
                        long j102 = builder.b;
                        j = builder.c;
                        if (j != -1) {
                        }
                        long max2 = Math.max(builder.d, builder.b);
                        long j112 = builder.e;
                        int i92 = builder.f;
                        float f22 = builder.g;
                        boolean z82 = builder.h;
                        j3 = builder.i;
                        if (j3 == -1) {
                        }
                        zzegVar.a = new LocationRequest(i82, j102, j2, max2, Long.MAX_VALUE, j112, i92, f22, z82, j3, builder.j, builder.k, builder.l, new WorkSource(builder.m), builder.n);
                        return zzegVar;
                    }
                    i3 = 2;
                }
                z2 = true;
                Preconditions.c(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i3));
                builder.j = i2;
                i4 = locationRequest.k;
                if (i4 != 0) {
                }
                i5 = i4;
                z3 = true;
                Preconditions.c(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i5));
                builder.k = i4;
                builder.l = locationRequest.l;
                builder.m = locationRequest.m;
                ClientIdentity clientIdentity32 = locationRequest.n;
                Preconditions.b(clientIdentity32 != null || clientIdentity32.f == null);
                builder.n = clientIdentity32;
                if (arrayList != null) {
                }
                if (z4) {
                }
                if (z5) {
                }
                if (z6) {
                }
                if (z7) {
                }
                if (j4 != Long.MAX_VALUE) {
                }
                int i822 = builder.a;
                long j1022 = builder.b;
                j = builder.c;
                if (j != -1) {
                }
                long max22 = Math.max(builder.d, builder.b);
                long j1122 = builder.e;
                int i922 = builder.f;
                float f222 = builder.g;
                boolean z822 = builder.h;
                j3 = builder.i;
                if (j3 == -1) {
                }
                zzegVar.a = new LocationRequest(i822, j1022, j2, max22, Long.MAX_VALUE, j1122, i922, f222, z822, j3, builder.j, builder.k, builder.l, new WorkSource(builder.m), builder.n);
                return zzegVar;
            }
            i = 105;
        }
        z = true;
        Preconditions.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
        builder.a = i6;
        long j62 = locationRequest.c;
        Preconditions.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j62 != -1 || j62 >= 0);
        builder.c = j62;
        long j72 = locationRequest.d;
        Preconditions.a("maxUpdateDelayMillis must be greater than or equal to 0", j72 < 0);
        builder.d = j72;
        long j82 = locationRequest.e;
        Preconditions.a("durationMillis must be greater than 0", j82 <= 0);
        builder.e = j82;
        int i72 = locationRequest.f;
        Preconditions.a("maxUpdates must be greater than 0", i72 <= 0);
        builder.f = i72;
        float f3 = locationRequest.g;
        Preconditions.a("minUpdateDistanceMeters must be greater than or equal to 0", f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        builder.g = f3;
        builder.h = locationRequest.h;
        long j92 = locationRequest.i;
        Preconditions.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j92 != -1 || j92 >= 0);
        builder.i = j92;
        i2 = locationRequest.j;
        if (i2 != 0) {
        }
        i3 = i2;
        z2 = true;
        Preconditions.c(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i3));
        builder.j = i2;
        i4 = locationRequest.k;
        if (i4 != 0) {
        }
        i5 = i4;
        z3 = true;
        Preconditions.c(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i5));
        builder.k = i4;
        builder.l = locationRequest.l;
        builder.m = locationRequest.m;
        ClientIdentity clientIdentity322 = locationRequest.n;
        Preconditions.b(clientIdentity322 != null || clientIdentity322.f == null);
        builder.n = clientIdentity322;
        if (arrayList != null) {
        }
        if (z4) {
        }
        if (z5) {
        }
        if (z6) {
        }
        if (z7) {
        }
        if (j4 != Long.MAX_VALUE) {
        }
        int i8222 = builder.a;
        long j10222 = builder.b;
        j = builder.c;
        if (j != -1) {
        }
        long max222 = Math.max(builder.d, builder.b);
        long j11222 = builder.e;
        int i9222 = builder.f;
        float f2222 = builder.g;
        boolean z8222 = builder.h;
        j3 = builder.i;
        if (j3 == -1) {
        }
        zzegVar.a = new LocationRequest(i8222, j10222, j2, max222, Long.MAX_VALUE, j11222, i9222, f2222, z8222, j3, builder.j, builder.k, builder.l, new WorkSource(builder.m), builder.n);
        return zzegVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeg[i];
    }
}
