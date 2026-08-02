package com.google.android.gms.auth.api.accounttransfer;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import y9.C6860a;

/* loaded from: classes2.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new C6860a();

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f32026f;

    /* renamed from: a, reason: collision with root package name */
    public final Set f32027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32028b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f32029c;

    /* renamed from: d, reason: collision with root package name */
    public int f32030d;

    /* renamed from: e, reason: collision with root package name */
    public zzs f32031e;

    static {
        HashMap hashMap = new HashMap();
        f32026f = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.i("authenticatorData", 2, zzu.class));
        hashMap.put(ReactProgressBarViewManager.PROP_PROGRESS, FastJsonResponse.Field.h(ReactProgressBarViewManager.PROP_PROGRESS, 4, zzs.class));
    }

    public zzo(Set set, int i10, ArrayList arrayList, int i11, zzs zzsVar) {
        this.f32027a = set;
        this.f32028b = i10;
        this.f32029c = arrayList;
        this.f32030d = i11;
        this.f32031e = zzsVar;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int m10 = field.m();
        if (m10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(m10), arrayList.getClass().getCanonicalName()));
        }
        this.f32029c = arrayList;
        this.f32027a.add(Integer.valueOf(m10));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int m10 = field.m();
        if (m10 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m10), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f32031e = (zzs) fastJsonResponse;
        this.f32027a.add(Integer.valueOf(m10));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f32026f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int m10 = field.m();
        if (m10 == 1) {
            return Integer.valueOf(this.f32028b);
        }
        if (m10 == 2) {
            return this.f32029c;
        }
        if (m10 == 4) {
            return this.f32031e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.m());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f32027a.contains(Integer.valueOf(field.m()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        Set set = this.f32027a;
        if (set.contains(1)) {
            b.u(parcel, 1, this.f32028b);
        }
        if (set.contains(2)) {
            b.J(parcel, 2, this.f32029c, true);
        }
        if (set.contains(3)) {
            b.u(parcel, 3, this.f32030d);
        }
        if (set.contains(4)) {
            b.D(parcel, 4, this.f32031e, i10, true);
        }
        b.b(parcel, a10);
    }
}
