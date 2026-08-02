package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import defpackage.bf3;
import defpackage.g7h;
import defpackage.jcn;
import defpackage.wt3;
import defpackage.zjn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzats implements Comparable {
    public final zjn a;
    public final int b;
    public final String c;
    public final int d;
    public final Object e;
    public final zzatw f;
    public Integer g;
    public zzatv h;
    public boolean i;
    public zzatb j;
    public g7h k;
    public final zzatg l;

    public zzats(int i, String str, zzatw zzatwVar) {
        Uri parse;
        String host;
        this.a = zjn.c ? new zjn() : null;
        this.e = new Object();
        int i2 = 0;
        this.i = false;
        this.j = null;
        this.b = i;
        this.c = str;
        this.f = zzatwVar;
        this.l = new zzatg();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.d = i2;
    }

    public final void a(String str) {
        zzatv zzatvVar = this.h;
        if (zzatvVar != null) {
            HashSet hashSet = zzatvVar.b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = zzatvVar.i;
            synchronized (arrayList) {
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((zzatu) it.next()).zza();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzatvVar.c();
        }
        if (zjn.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new jcn(this, str, id));
                return;
            }
            zjn zjnVar = this.a;
            zjnVar.a(id, str);
            zjnVar.b(toString());
        }
    }

    public final void b() {
        zzatv zzatvVar = this.h;
        if (zzatvVar != null) {
            zzatvVar.c();
        }
    }

    public abstract zzaty c(zzato zzatoVar);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.g.intValue() - ((zzats) obj).g.intValue();
    }

    public abstract void d(Object obj);

    public final void e(zzaty zzatyVar) {
        g7h g7hVar;
        List list;
        synchronized (this.e) {
            g7hVar = this.k;
        }
        if (g7hVar != null) {
            zzatb zzatbVar = zzatyVar.b;
            if (zzatbVar != null) {
                if (zzatbVar.e >= System.currentTimeMillis()) {
                    String zzi = zzi();
                    synchronized (g7hVar) {
                        list = (List) ((HashMap) g7hVar.b).remove(zzi);
                    }
                    if (list != null) {
                        if (zzaue.a) {
                            zzaue.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzi);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((zzatj) g7hVar.e).a((zzats) it.next(), zzatyVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            g7hVar.C(this);
        }
    }

    public final void f() {
        g7h g7hVar;
        synchronized (this.e) {
            g7hVar = this.k;
        }
        if (g7hVar != null) {
            g7hVar.C(this);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.d));
        zzl();
        Integer num = this.g;
        String str = this.c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(concat.length() + length + 5 + 8 + length2);
        bf3.v(sb, "[ ] ", str, " ", concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.b;
    }

    public final int zzb() {
        return this.d;
    }

    public final void zzc(String str) {
        if (zjn.c) {
            this.a.a(Thread.currentThread().getId(), str);
        }
    }

    public final zzats zzf(zzatv zzatvVar) {
        this.h = zzatvVar;
        return this;
    }

    public final zzats zzg(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.c;
    }

    public final String zzi() {
        int i = this.b;
        String str = this.c;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return wt3.m(num, "-", new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length()), str);
    }

    public final zzats zzj(zzatb zzatbVar) {
        this.j = zzatbVar;
        return this;
    }

    @Nullable
    public final zzatb zzk() {
        return this.j;
    }

    public final boolean zzl() {
        synchronized (this.e) {
        }
        return false;
    }

    public Map zzm() throws zzata {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzata {
        return null;
    }

    public final int zzo() {
        return this.l.a;
    }

    public final void zzp() {
        synchronized (this.e) {
            this.i = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.e) {
            z = this.i;
        }
        return z;
    }

    public final void zzt(zzaub zzaubVar) {
        zzatw zzatwVar;
        synchronized (this.e) {
            zzatwVar = this.f;
        }
        zzatwVar.zza(zzaubVar);
    }

    public final zzatg zzy() {
        return this.l;
    }
}
