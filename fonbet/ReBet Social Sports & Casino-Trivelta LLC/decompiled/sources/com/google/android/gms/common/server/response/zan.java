package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new I9.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f32819a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f32820b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32821c;

    public zan(int i10, ArrayList arrayList, String str) {
        this.f32819a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zalVar = (zal) arrayList.get(i11);
            String str2 = zalVar.f32814b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) AbstractC3191o.m(zalVar.f32815c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zamVar = (zam) zalVar.f32815c.get(i12);
                hashMap2.put(zamVar.f32817b, zamVar.f32818c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f32820b = hashMap;
        this.f32821c = (String) AbstractC3191o.m(str);
        i();
    }

    public final String g() {
        return this.f32821c;
    }

    public final Map h(String str) {
        return (Map) this.f32820b.get(str);
    }

    public final void i() {
        Iterator it = this.f32820b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f32820b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).e0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f32820b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f32820b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, this.f32819a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f32820b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f32820b.get(str)));
        }
        E9.b.J(parcel, 2, arrayList, false);
        E9.b.F(parcel, 3, this.f32821c, false);
        E9.b.b(parcel, a10);
    }
}
