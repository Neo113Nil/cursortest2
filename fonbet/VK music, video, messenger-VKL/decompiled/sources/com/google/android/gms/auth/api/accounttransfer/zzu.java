package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import xsna.jr01;
import xsna.lhg;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new jr01();
    public static final HashMap h;
    public final HashSet b;
    public final int c;
    public zzw d;
    public String e;
    public String f;
    public final String g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        hashMap.put(InAppPurchaseMetaData.KEY_SIGNATURE, new FastJsonResponse.Field(7, false, 7, false, InAppPurchaseMetaData.KEY_SIGNATURE, 3, null));
        hashMap.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu() {
        this.b = new HashSet(3);
        this.c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int i = field.h;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.d = (zzw) fastJsonResponse;
        this.b.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int i = field.h;
        if (i == 1) {
            return Integer.valueOf(this.c);
        }
        if (i == 2) {
            return this.d;
        }
        if (i == 3) {
            return this.e;
        }
        if (i == 4) {
            return this.f;
        }
        throw new IllegalStateException(lhg.a(field.h, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.b.contains(Integer.valueOf(field.h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int i = field.h;
        if (i == 3) {
            this.e = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.f = str2;
        }
        this.b.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        HashSet hashSet = this.b;
        if (hashSet.contains(1)) {
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.c);
        }
        if (hashSet.contains(2)) {
            ozg0.p(parcel, 2, this.d, i, true);
        }
        if (hashSet.contains(3)) {
            ozg0.q(parcel, 3, this.e, true);
        }
        if (hashSet.contains(4)) {
            ozg0.q(parcel, 4, this.f, true);
        }
        if (hashSet.contains(5)) {
            ozg0.q(parcel, 5, this.g, true);
        }
        ozg0.x(w, parcel);
    }

    public zzu(HashSet hashSet, int i, zzw zzwVar, String str, String str2, String str3) {
        this.b = hashSet;
        this.c = i;
        this.d = zzwVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }
}
