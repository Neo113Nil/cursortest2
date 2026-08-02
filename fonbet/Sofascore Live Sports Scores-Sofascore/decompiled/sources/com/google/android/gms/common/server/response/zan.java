package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    public final int a;
    public final HashMap b;
    public final String c;

    public zan(int i, String str, ArrayList arrayList) {
        this.a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.b;
            ArrayList arrayList2 = zalVar.c;
            HashMap hashMap2 = new HashMap();
            Preconditions.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) arrayList2.get(i3);
                hashMap2.put(zamVar.b, zamVar.c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.b = hashMap;
        Preconditions.i(str);
        this.c = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).j = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.b;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                wt3.A("  ", str2, sb, ": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zal(str, (Map) hashMap.get(str)));
        }
        SafeParcelWriter.q(parcel, 2, arrayList, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
