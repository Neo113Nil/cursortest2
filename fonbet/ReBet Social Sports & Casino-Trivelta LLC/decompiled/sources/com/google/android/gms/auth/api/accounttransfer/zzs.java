package com.google.android.gms.auth.api.accounttransfer;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y9.C6862c;
import z.C6900a;

/* loaded from: classes2.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new C6862c();

    /* renamed from: g, reason: collision with root package name */
    public static final C6900a f32032g;

    /* renamed from: a, reason: collision with root package name */
    public final int f32033a;

    /* renamed from: b, reason: collision with root package name */
    public List f32034b;

    /* renamed from: c, reason: collision with root package name */
    public List f32035c;

    /* renamed from: d, reason: collision with root package name */
    public List f32036d;

    /* renamed from: e, reason: collision with root package name */
    public List f32037e;

    /* renamed from: f, reason: collision with root package name */
    public List f32038f;

    static {
        C6900a c6900a = new C6900a();
        f32032g = c6900a;
        c6900a.put("registered", FastJsonResponse.Field.l("registered", 2));
        c6900a.put("in_progress", FastJsonResponse.Field.l("in_progress", 3));
        c6900a.put("success", FastJsonResponse.Field.l("success", 4));
        c6900a.put("failed", FastJsonResponse.Field.l("failed", 5));
        c6900a.put("escrowed", FastJsonResponse.Field.l("escrowed", 6));
    }

    public zzs(int i10, List list, List list2, List list3, List list4, List list5) {
        this.f32033a = i10;
        this.f32034b = list;
        this.f32035c = list2;
        this.f32036d = list3;
        this.f32037e = list4;
        this.f32038f = list5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return f32032g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.m()) {
            case 1:
                return Integer.valueOf(this.f32033a);
            case 2:
                return this.f32034b;
            case 3:
                return this.f32035c;
            case 4:
                return this.f32036d;
            case 5:
                return this.f32037e;
            case 6:
                return this.f32038f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + field.m());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int m10 = field.m();
        if (m10 == 2) {
            this.f32034b = arrayList;
            return;
        }
        if (m10 == 3) {
            this.f32035c = arrayList;
            return;
        }
        if (m10 == 4) {
            this.f32036d = arrayList;
        } else if (m10 == 5) {
            this.f32037e = arrayList;
        } else {
            if (m10 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(m10)));
            }
            this.f32038f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32033a);
        b.H(parcel, 2, this.f32034b, false);
        b.H(parcel, 3, this.f32035c, false);
        b.H(parcel, 4, this.f32036d, false);
        b.H(parcel, 5, this.f32037e, false);
        b.H(parcel, 6, this.f32038f, false);
        b.b(parcel, a10);
    }
}
