package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new I9.b();

    /* renamed from: a, reason: collision with root package name */
    public final int f32813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32814b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32815c;

    public zal(int i10, String str, ArrayList arrayList) {
        this.f32813a = i10;
        this.f32814b = str;
        this.f32815c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32813a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.F(parcel, 2, this.f32814b, false);
        E9.b.J(parcel, 3, this.f32815c, false);
        E9.b.b(parcel, a10);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f32813a = 1;
        this.f32814b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f32815c = arrayList;
    }
}
