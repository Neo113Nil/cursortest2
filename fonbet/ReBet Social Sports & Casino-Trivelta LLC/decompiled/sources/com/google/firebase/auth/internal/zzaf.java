package com.google.firebase.auth.internal;

import E9.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.zze;
import eb.C4196f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kb.AbstractC5238x;
import kb.C5235u;
import kb.H;
import lb.C5427f;
import lb.C5430i;
import lb.F;

/* loaded from: classes3.dex */
public final class zzaf extends FirebaseUser {
    public static final Parcelable.Creator<zzaf> CREATOR = new C5427f();

    /* renamed from: a, reason: collision with root package name */
    public zzahv f37673a;

    /* renamed from: b, reason: collision with root package name */
    public zzab f37674b;

    /* renamed from: c, reason: collision with root package name */
    public String f37675c;

    /* renamed from: d, reason: collision with root package name */
    public String f37676d;

    /* renamed from: e, reason: collision with root package name */
    public List f37677e;

    /* renamed from: f, reason: collision with root package name */
    public List f37678f;

    /* renamed from: g, reason: collision with root package name */
    public String f37679g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f37680h;

    /* renamed from: i, reason: collision with root package name */
    public zzah f37681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37682j;

    /* renamed from: k, reason: collision with root package name */
    public zze f37683k;

    /* renamed from: l, reason: collision with root package name */
    public zzbj f37684l;

    /* renamed from: m, reason: collision with root package name */
    public List f37685m;

    public zzaf(C4196f c4196f, List list) {
        AbstractC3191o.m(c4196f);
        this.f37675c = c4196f.p();
        this.f37676d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f37679g = "2";
        m0(list);
    }

    public final zze A0() {
        return this.f37683k;
    }

    public final List B0() {
        zzbj zzbjVar = this.f37684l;
        return zzbjVar != null ? zzbjVar.zza() : new ArrayList();
    }

    public final List C0() {
        return this.f37677e;
    }

    public final boolean D0() {
        return this.f37682j;
    }

    @Override // com.google.firebase.auth.FirebaseUser, kb.H
    public final String a() {
        return this.f37674b.a();
    }

    @Override // com.google.firebase.auth.FirebaseUser, kb.H
    public final String b() {
        return this.f37674b.b();
    }

    @Override // kb.H
    public final boolean c() {
        return this.f37674b.c();
    }

    @Override // com.google.firebase.auth.FirebaseUser, kb.H
    public final String getDisplayName() {
        return this.f37674b.getDisplayName();
    }

    @Override // com.google.firebase.auth.FirebaseUser, kb.H
    public final String getEmail() {
        return this.f37674b.getEmail();
    }

    @Override // com.google.firebase.auth.FirebaseUser, kb.H
    public final Uri getPhotoUrl() {
        return this.f37674b.getPhotoUrl();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseUserMetadata i() {
        return this.f37681i;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ AbstractC5238x j() {
        return new C5430i(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List k() {
        return this.f37677e;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String l() {
        Map map;
        zzahv zzahvVar = this.f37673a;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) F.a(this.f37673a.zzc()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean m() {
        C5235u a10;
        Boolean bool = this.f37680h;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.f37673a;
            String str = "";
            if (zzahvVar != null && (a10 = F.a(zzahvVar.zzc())) != null) {
                str = a10.e();
            }
            boolean z10 = true;
            if (k().size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f37680h = Boolean.valueOf(z10);
        }
        return this.f37680h.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized FirebaseUser m0(List list) {
        try {
            AbstractC3191o.m(list);
            this.f37677e = new ArrayList(list.size());
            this.f37678f = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                H h10 = (H) list.get(i10);
                if (h10.n().equals("firebase")) {
                    this.f37674b = (zzab) h10;
                } else {
                    this.f37678f.add(h10.n());
                }
                this.f37677e.add((zzab) h10);
            }
            if (this.f37674b == null) {
                this.f37674b = (zzab) this.f37677e.get(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser, kb.H
    public final String n() {
        return this.f37674b.n();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final C4196f n0() {
        return C4196f.o(this.f37675c);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void o0(zzahv zzahvVar) {
        this.f37673a = (zzahv) AbstractC3191o.m(zzahvVar);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ FirebaseUser p0() {
        this.f37680h = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void q0(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f37685m = list;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzahv r0() {
        return this.f37673a;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void s0(List list) {
        this.f37684l = zzbj.g(list);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List t0() {
        return this.f37685m;
    }

    public final zzaf u0(String str) {
        this.f37679g = str;
        return this;
    }

    public final void v0(zzah zzahVar) {
        this.f37681i = zzahVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, r0(), i10, false);
        b.D(parcel, 2, this.f37674b, i10, false);
        b.F(parcel, 3, this.f37675c, false);
        b.F(parcel, 4, this.f37676d, false);
        b.J(parcel, 5, this.f37677e, false);
        b.H(parcel, 6, zzg(), false);
        b.F(parcel, 7, this.f37679g, false);
        b.i(parcel, 8, Boolean.valueOf(m()), false);
        b.D(parcel, 9, i(), i10, false);
        b.g(parcel, 10, this.f37682j);
        b.D(parcel, 11, this.f37683k, i10, false);
        b.D(parcel, 12, this.f37684l, i10, false);
        b.J(parcel, 13, t0(), false);
        b.b(parcel, a10);
    }

    public final void x0(zze zzeVar) {
        this.f37683k = zzeVar;
    }

    public final void y0(boolean z10) {
        this.f37682j = z10;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return r0().zzc();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.f37673a.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzg() {
        return this.f37678f;
    }

    public zzaf(zzahv zzahvVar, zzab zzabVar, String str, String str2, List list, List list2, String str3, Boolean bool, zzah zzahVar, boolean z10, zze zzeVar, zzbj zzbjVar, List list3) {
        this.f37673a = zzahvVar;
        this.f37674b = zzabVar;
        this.f37675c = str;
        this.f37676d = str2;
        this.f37677e = list;
        this.f37678f = list2;
        this.f37679g = str3;
        this.f37680h = bool;
        this.f37681i = zzahVar;
        this.f37682j = z10;
        this.f37683k = zzeVar;
        this.f37684l = zzbjVar;
        this.f37685m = list3;
    }
}
