package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.ljg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public static final HashMap g;
    public final HashSet a;
    public final int b;
    public final zzw c;
    public final String d;
    public final String e;
    public final String f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        hashMap.put(InAppPurchaseMetaData.KEY_SIGNATURE, new FastJsonResponse.Field(7, false, 7, false, InAppPurchaseMetaData.KEY_SIGNATURE, 3, null));
        hashMap.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu(HashSet hashSet, int i, zzw zzwVar, String str, String str2, String str3) {
        this.a = hashSet;
        this.b = i;
        this.c = zzwVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return g;
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
            return this.d;
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
            SafeParcelWriter.l(parcel, 2, this.c, i, true);
        }
        if (hashSet.contains(3)) {
            SafeParcelWriter.m(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            SafeParcelWriter.m(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            SafeParcelWriter.m(parcel, 5, this.f, true);
        }
        SafeParcelWriter.t(parcel, s);
    }

    public zzu() {
        this.a = new HashSet(3);
        this.b = 1;
    }
}
