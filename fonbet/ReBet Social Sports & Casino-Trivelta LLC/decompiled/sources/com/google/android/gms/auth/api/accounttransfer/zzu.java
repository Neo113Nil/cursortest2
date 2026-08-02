package com.google.android.gms.auth.api.accounttransfer;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import y9.C6863d;

/* loaded from: classes2.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new C6863d();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f32039g;

    /* renamed from: a, reason: collision with root package name */
    public final Set f32040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32041b;

    /* renamed from: c, reason: collision with root package name */
    public zzw f32042c;

    /* renamed from: d, reason: collision with root package name */
    public String f32043d;

    /* renamed from: e, reason: collision with root package name */
    public String f32044e;

    /* renamed from: f, reason: collision with root package name */
    public String f32045f;

    static {
        HashMap hashMap = new HashMap();
        f32039g = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.h("authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", FastJsonResponse.Field.k("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.k("package", 4));
    }

    public zzu(Set set, int i10, zzw zzwVar, String str, String str2, String str3) {
        this.f32040a = set;
        this.f32041b = i10;
        this.f32042c = zzwVar;
        this.f32043d = str;
        this.f32044e = str2;
        this.f32045f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int m10 = field.m();
        if (m10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m10), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f32042c = (zzw) fastJsonResponse;
        this.f32040a.add(Integer.valueOf(m10));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f32039g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int m10 = field.m();
        if (m10 == 1) {
            return Integer.valueOf(this.f32041b);
        }
        if (m10 == 2) {
            return this.f32042c;
        }
        if (m10 == 3) {
            return this.f32043d;
        }
        if (m10 == 4) {
            return this.f32044e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.m());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f32040a.contains(Integer.valueOf(field.m()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int m10 = field.m();
        if (m10 == 3) {
            this.f32043d = str2;
        } else {
            if (m10 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m10)));
            }
            this.f32044e = str2;
        }
        this.f32040a.add(Integer.valueOf(m10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        Set set = this.f32040a;
        if (set.contains(1)) {
            b.u(parcel, 1, this.f32041b);
        }
        if (set.contains(2)) {
            b.D(parcel, 2, this.f32042c, i10, true);
        }
        if (set.contains(3)) {
            b.F(parcel, 3, this.f32043d, true);
        }
        if (set.contains(4)) {
            b.F(parcel, 4, this.f32044e, true);
        }
        if (set.contains(5)) {
            b.F(parcel, 5, this.f32045f, true);
        }
        b.b(parcel, a10);
    }
}
