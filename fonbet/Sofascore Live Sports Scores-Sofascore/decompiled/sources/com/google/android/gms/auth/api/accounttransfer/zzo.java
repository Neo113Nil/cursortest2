package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.a70;
import defpackage.ljg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    public static final HashMap f;
    public final HashSet a;
    public final int b;
    public final ArrayList c;
    public final int d;
    public final zzs e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, new FastJsonResponse.Field(11, false, 11, false, NotificationCompat.CATEGORY_PROGRESS, 4, zzs.class));
    }

    public zzo() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return f;
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
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (hashSet.contains(2)) {
            SafeParcelWriter.q(parcel, 2, this.c, true);
        }
        if (hashSet.contains(3)) {
            SafeParcelWriter.r(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (hashSet.contains(4)) {
            SafeParcelWriter.l(parcel, 4, this.e, i, true);
        }
        SafeParcelWriter.t(parcel, s);
    }

    public zzo(HashSet hashSet, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.a = hashSet;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = zzsVar;
    }
}
