package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.me4;
import defpackage.wt3;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbfw {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final zzbgl e;
    public final zzbgs f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public String o = "";
    public String p = "";
    public String q = "";

    public zzbfw(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new zzbgl(i4);
        this.f = new zzbgs(i5, i6, i7);
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a(String str, boolean z, float f, float f2, float f3, float f4) {
        c(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            try {
                if (this.m < 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzd("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                int i = this.k;
                int i2 = this.l;
                int i3 = this.b;
                if (!this.d) {
                    i3 = (i2 * i3) + (i * this.a);
                }
                if (i3 > this.n) {
                    this.n = i3;
                    if (!com.google.android.gms.ads.internal.zzt.zzh().g().zzc()) {
                        zzbgl zzbglVar = this.e;
                        this.o = zzbglVar.a(this.h);
                        this.p = zzbglVar.a(this.i);
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzh().g().zze()) {
                        this.q = this.f.a(this.i, this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.c) {
                return;
            }
            synchronized (this.g) {
                try {
                    this.h.add(str);
                    this.k += str.length();
                    if (z) {
                        this.i.add(str);
                        this.j.add(new zzbgh(f, f2, f3, f4, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbfw) obj).o;
        return str != null && str.equals(this.o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        int i = this.l;
        int i2 = this.n;
        int i3 = this.k;
        String d = d(this.h);
        String d2 = d(this.i);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = d.length();
        int length5 = d2.length();
        StringBuilder sb = new StringBuilder(wt3.h(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + String.valueOf(str).length(), 20, String.valueOf(str2).length(), 32, String.valueOf(str3).length()));
        me4.r(sb, "ActivityContent fetchId: ", i, " score:", i2);
        fn0.s(i3, " total_length:", "\n text: ", d, sb);
        bf3.v(sb, "\n viewableText", d2, "\n signture: ", str);
        return fc6.o(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
