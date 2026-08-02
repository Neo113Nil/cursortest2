package com.google.firebase.auth.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.C5434m;

/* loaded from: classes3.dex */
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new C5434m();

    /* renamed from: a, reason: collision with root package name */
    public String f37694a;

    /* renamed from: b, reason: collision with root package name */
    public String f37695b;

    /* renamed from: c, reason: collision with root package name */
    public List f37696c;

    /* renamed from: d, reason: collision with root package name */
    public List f37697d;

    /* renamed from: e, reason: collision with root package name */
    public zzaf f37698e;

    public zzam() {
    }

    public static zzam h(String str, zzaf zzafVar) {
        AbstractC3191o.g(str);
        zzam zzamVar = new zzam();
        zzamVar.f37694a = str;
        zzamVar.f37698e = zzafVar;
        return zzamVar;
    }

    public static zzam i(List list, String str) {
        AbstractC3191o.m(list);
        AbstractC3191o.g(str);
        zzam zzamVar = new zzam();
        zzamVar.f37696c = new ArrayList();
        zzamVar.f37697d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzamVar.f37696c.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else {
                if (!(multiFactorInfo instanceof TotpMultiFactorInfo)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + multiFactorInfo.h());
                }
                zzamVar.f37697d.add((TotpMultiFactorInfo) multiFactorInfo);
            }
        }
        zzamVar.f37695b = str;
        return zzamVar;
    }

    public final zzaf g() {
        return this.f37698e;
    }

    public final String j() {
        return this.f37694a;
    }

    public final boolean k() {
        return this.f37694a != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.f37694a, false);
        b.F(parcel, 2, this.f37695b, false);
        b.J(parcel, 3, this.f37696c, false);
        b.J(parcel, 4, this.f37697d, false);
        b.D(parcel, 5, this.f37698e, i10, false);
        b.b(parcel, a10);
    }

    public final String zzc() {
        return this.f37695b;
    }

    public zzam(String str, String str2, List list, List list2, zzaf zzafVar) {
        this.f37694a = str;
        this.f37695b = str2;
        this.f37696c = list;
        this.f37697d = list2;
        this.f37698e = zzafVar;
    }
}
