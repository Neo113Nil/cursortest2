package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.a70;
import defpackage.gh0;
import defpackage.ljg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    public static final HashMap h;
    public final Set a;
    public final int b;
    public final String c;
    public final int d;
    public final byte[] e;
    public final PendingIntent f;
    public final DeviceMetaData g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw(HashSet hashSet, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = hashSet;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i = field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return Integer.valueOf(this.d);
        }
        if (i == 4) {
            return this.e;
        }
        a70.r(ljg.j(i, "Unknown SafeParcelable id="));
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        Set set = this.a;
        if (set.contains(1)) {
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.r(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (set.contains(4)) {
            SafeParcelWriter.c(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.l(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.l(parcel, 6, this.g, i, true);
        }
        SafeParcelWriter.t(parcel, s);
    }

    public zzw() {
        this.a = new gh0(3);
        this.b = 1;
    }
}
