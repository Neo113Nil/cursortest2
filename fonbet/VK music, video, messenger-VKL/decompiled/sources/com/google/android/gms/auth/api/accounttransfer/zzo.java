package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import xsna.lhg;
import xsna.ozg0;
import xsna.pn01;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new pn01();
    public static final HashMap g;
    public final HashSet b;
    public final int c;
    public ArrayList d;
    public final int e;
    public zzs f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, new FastJsonResponse.Field(11, false, 11, false, NotificationCompat.CATEGORY_PROGRESS, 4, zzs.class));
    }

    public zzo() {
        this.b = new HashSet(1);
        this.c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int i = field.h;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.d = arrayList;
        this.b.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int i = field.h;
        if (i != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f = (zzs) fastJsonResponse;
        this.b.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return g;
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
        if (i == 4) {
            return this.f;
        }
        throw new IllegalStateException(lhg.a(field.h, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.b.contains(Integer.valueOf(field.h));
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
            ozg0.u(parcel, 2, this.d, true);
        }
        if (hashSet.contains(3)) {
            ozg0.v(parcel, 3, 4);
            parcel.writeInt(this.e);
        }
        if (hashSet.contains(4)) {
            ozg0.p(parcel, 4, this.f, i, true);
        }
        ozg0.x(w, parcel);
    }

    public zzo(HashSet hashSet, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.b = hashSet;
        this.c = i;
        this.d = arrayList;
        this.e = i2;
        this.f = zzsVar;
    }
}
