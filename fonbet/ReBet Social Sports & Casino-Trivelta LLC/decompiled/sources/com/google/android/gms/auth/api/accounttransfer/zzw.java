package com.google.android.gms.auth.api.accounttransfer;

import E9.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import y9.C6864e;

/* loaded from: classes2.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new C6864e();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f32046g;

    /* renamed from: a, reason: collision with root package name */
    public final Set f32047a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32048b;

    /* renamed from: c, reason: collision with root package name */
    public String f32049c;

    /* renamed from: d, reason: collision with root package name */
    public int f32050d;

    /* renamed from: e, reason: collision with root package name */
    public PendingIntent f32051e;

    /* renamed from: f, reason: collision with root package name */
    public DeviceMetaData f32052f;
    private byte[] zzf;

    static {
        HashMap hashMap = new HashMap();
        f32046g = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.k("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.j("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.g("transferBytes", 4));
    }

    public zzw(Set set, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f32047a = set;
        this.f32048b = i10;
        this.f32049c = str;
        this.f32050d = i11;
        this.zzf = bArr;
        this.f32051e = pendingIntent;
        this.f32052f = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f32046g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int m10 = field.m();
        if (m10 == 1) {
            return Integer.valueOf(this.f32048b);
        }
        if (m10 == 2) {
            return this.f32049c;
        }
        if (m10 == 3) {
            return Integer.valueOf(this.f32050d);
        }
        if (m10 == 4) {
            return this.zzf;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.m());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f32047a.contains(Integer.valueOf(field.m()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        int m10 = field.m();
        if (m10 == 4) {
            this.zzf = bArr;
            this.f32047a.add(Integer.valueOf(m10));
        } else {
            throw new IllegalArgumentException("Field with id=" + m10 + " is not known to be a byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i10) {
        int m10 = field.m();
        if (m10 == 3) {
            this.f32050d = i10;
            this.f32047a.add(Integer.valueOf(m10));
        } else {
            throw new IllegalArgumentException("Field with id=" + m10 + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int m10 = field.m();
        if (m10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m10)));
        }
        this.f32049c = str2;
        this.f32047a.add(Integer.valueOf(m10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        Set set = this.f32047a;
        if (set.contains(1)) {
            b.u(parcel, 1, this.f32048b);
        }
        if (set.contains(2)) {
            b.F(parcel, 2, this.f32049c, true);
        }
        if (set.contains(3)) {
            b.u(parcel, 3, this.f32050d);
        }
        if (set.contains(4)) {
            b.l(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            b.D(parcel, 5, this.f32051e, i10, true);
        }
        if (set.contains(6)) {
            b.D(parcel, 6, this.f32052f, i10, true);
        }
        b.b(parcel, a10);
    }
}
