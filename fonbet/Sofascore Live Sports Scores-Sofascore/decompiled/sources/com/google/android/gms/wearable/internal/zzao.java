package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import defpackage.bf3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzao extends AbstractSafeParcelable implements CapabilityInfo {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();
    public final String b;
    public final List c;
    public final Object a = new Object();
    public HashSet d = null;

    public zzao(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
        Preconditions.i(str);
        Preconditions.i(arrayList);
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final Set T() {
        HashSet hashSet;
        synchronized (this.a) {
            try {
                hashSet = this.d;
                if (hashSet == null) {
                    hashSet = new HashSet(this.c);
                    this.d = hashSet;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzao.class != obj.getClass()) {
            return false;
        }
        zzao zzaoVar = (zzao) obj;
        String str = zzaoVar.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list = zzaoVar.c;
        List list2 = this.c;
        return list2 == null ? list == null : list2.equals(list);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        List list = this.c;
        return ((hashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + valueOf.length() + 1);
        bf3.v(sb, "CapabilityInfo{", str, ", ", valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.q(parcel, 3, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
