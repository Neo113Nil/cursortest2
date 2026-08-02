package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4605a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4606b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4607c;

    public zan(int i5, String str, ArrayList arrayList) {
        this.f4605a = i5;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zal zalVar = (zal) arrayList.get(i10);
            String str2 = zalVar.f4600b;
            ArrayList arrayList2 = zalVar.f4601c;
            HashMap hashMap2 = new HashMap();
            v.h(arrayList2);
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                zam zamVar = (zam) arrayList2.get(i11);
                hashMap2.put(zamVar.f4603b, zamVar.f4604c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f4606b = hashMap;
        v.h(str);
        this.f4607c = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map.get((String) it2.next())).j = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = this.f4606b;
        for (String str : hashMap.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) hashMap.get(str);
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
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4605a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f4606b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zal(str, (Map) hashMap.get(str)));
        }
        b.R(parcel, 2, arrayList, false);
        b.O(parcel, 3, this.f4607c, false);
        b.W(parcel, V);
    }
}
