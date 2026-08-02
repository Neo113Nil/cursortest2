package com.google.firebase.auth.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaas;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zze;
import eb.C4196f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.AbstractC5239y;
import lb.C5431j;
import lb.C5432k;

/* loaded from: classes3.dex */
public final class zzal extends MultiFactorResolver {
    public static final Parcelable.Creator<zzal> CREATOR = new C5432k();

    /* renamed from: a, reason: collision with root package name */
    public final List f37688a;

    /* renamed from: b, reason: collision with root package name */
    public final zzam f37689b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37690c;

    /* renamed from: d, reason: collision with root package name */
    public final zze f37691d;

    /* renamed from: e, reason: collision with root package name */
    public final zzaf f37692e;

    /* renamed from: f, reason: collision with root package name */
    public final List f37693f;

    public zzal(List list, zzam zzamVar, String str, zze zzeVar, zzaf zzafVar, List list2) {
        this.f37688a = (List) AbstractC3191o.m(list);
        this.f37689b = (zzam) AbstractC3191o.m(zzamVar);
        this.f37690c = AbstractC3191o.g(str);
        this.f37691d = zzeVar;
        this.f37692e = zzafVar;
        this.f37693f = (List) AbstractC3191o.m(list2);
    }

    public static zzal k(zzaas zzaasVar, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        List<MultiFactorInfo> zzc = zzaasVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : zzc) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        List<MultiFactorInfo> zzc2 = zzaasVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (MultiFactorInfo multiFactorInfo2 : zzc2) {
            if (multiFactorInfo2 instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo2);
            }
        }
        return new zzal(arrayList, zzam.i(zzaasVar.zzc(), zzaasVar.zzb()), firebaseAuth.i().p(), zzaasVar.zza(), (zzaf) firebaseUser, arrayList2);
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final FirebaseAuth g() {
        return FirebaseAuth.getInstance(C4196f.o(this.f37690c));
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f37688a.iterator();
        while (it.hasNext()) {
            arrayList.add((PhoneMultiFactorInfo) it.next());
        }
        Iterator it2 = this.f37693f.iterator();
        while (it2.hasNext()) {
            arrayList.add((TotpMultiFactorInfo) it2.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final MultiFactorSession i() {
        return this.f37689b;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final Task j(AbstractC5239y abstractC5239y) {
        return g().a0(abstractC5239y, this.f37689b, this.f37692e).continueWithTask(new C5431j(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.J(parcel, 1, this.f37688a, false);
        b.D(parcel, 2, i(), i10, false);
        b.F(parcel, 3, this.f37690c, false);
        b.D(parcel, 4, this.f37691d, i10, false);
        b.D(parcel, 5, this.f37692e, i10, false);
        b.J(parcel, 6, this.f37693f, false);
        b.b(parcel, a10);
    }
}
