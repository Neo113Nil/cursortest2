package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.U3;
import defpackage.ddb;
import defpackage.fhh;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdqr {
    public int a;
    public com.google.android.gms.ads.internal.client.zzea b;
    public zzbmo c;
    public View d;
    public List e;
    public zzew g;
    public Bundle h;
    public zzclm i;
    public zzclm j;
    public zzclm k;
    public zzeml l;
    public ddb m;
    public zzcgo n;
    public View o;
    public View p;
    public IObjectWrapper q;
    public double r;
    public zzbmv s;
    public zzbmv t;
    public String u;
    public float x;
    public String y;
    public final fhh v = new fhh(0);
    public final fhh w = new fhh(0);
    public List f = Collections.EMPTY_LIST;

    public static zzdqr l(zzbwj zzbwjVar) {
        zzdqq zzdqqVar;
        zzbwj zzbwjVar2;
        try {
            com.google.android.gms.ads.internal.client.zzea zzn = zzbwjVar.zzn();
            if (zzn == null) {
                zzbwjVar2 = zzbwjVar;
                zzdqqVar = null;
            } else {
                zzbwjVar2 = zzbwjVar;
                zzdqqVar = new zzdqq(zzn, zzbwjVar2);
            }
            return m(zzdqqVar, zzbwjVar2.zzo(), (View) n(zzbwjVar2.zzp()), zzbwjVar2.zze(), zzbwjVar2.zzf(), zzbwjVar2.zzg(), zzbwjVar2.zzs(), zzbwjVar2.zzi(), (View) n(zzbwjVar2.zzq()), zzbwjVar2.zzr(), zzbwjVar2.zzl(), zzbwjVar2.zzm(), zzbwjVar2.zzk(), zzbwjVar2.zzh(), zzbwjVar2.zzj(), zzbwjVar2.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdqr m(zzdqq zzdqqVar, zzbmo zzbmoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbmv zzbmvVar, String str6, float f) {
        zzdqr zzdqrVar = new zzdqr();
        zzdqrVar.a = 6;
        zzdqrVar.b = zzdqqVar;
        zzdqrVar.c = zzbmoVar;
        zzdqrVar.d = view;
        zzdqrVar.o("headline", str);
        zzdqrVar.e = list;
        zzdqrVar.o("body", str2);
        zzdqrVar.h = bundle;
        zzdqrVar.o("call_to_action", str3);
        zzdqrVar.o = view2;
        zzdqrVar.q = iObjectWrapper;
        zzdqrVar.o("store", str4);
        zzdqrVar.o("price", str5);
        zzdqrVar.r = d;
        zzdqrVar.s = zzbmvVar;
        zzdqrVar.o(U3.i.F0, str6);
        synchronized (zzdqrVar) {
            zzdqrVar.x = f;
        }
        return zzdqrVar;
    }

    public static Object n(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.Z1(iObjectWrapper);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final zzbmv b() {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.e.get(0);
        if (obj instanceof IBinder) {
            return zzbmu.E4((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        Bundle bundle;
        bundle = this.h;
        if (bundle == null) {
            bundle = new Bundle();
            this.h = bundle;
        }
        return bundle;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p(U3.i.F0);
    }

    public final synchronized String g() {
        return this.u;
    }

    public final synchronized zzclm h() {
        return this.i;
    }

    public final synchronized zzclm i() {
        return this.j;
    }

    public final synchronized zzclm j() {
        return this.k;
    }

    public final synchronized zzeml k() {
        return this.l;
    }

    public final synchronized void o(String str, String str2) {
        fhh fhhVar = this.w;
        if (str2 == null) {
            fhhVar.remove(str);
        } else {
            fhhVar.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.w.get(str);
    }

    public final synchronized int q() {
        return this.a;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea r() {
        return this.b;
    }

    public final synchronized zzbmo s() {
        return this.c;
    }
}
