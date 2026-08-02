package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import defpackage.dpo;
import defpackage.mpo;
import defpackage.ohn;
import java.io.File;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfzz {
    public static final Object f = new Object();
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final zzfzg d;
    public final boolean e;

    public zzfzz(Context context, zzbei zzbeiVar, zzfzg zzfzgVar, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(zzbeiVar.a);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = zzfzgVar;
        this.e = z;
    }

    public static String d(zzbek zzbekVar) {
        zzbeq K = zzber.K();
        String D = zzbekVar.D().D();
        K.n();
        ((zzber) K.b).M(D);
        String E = zzbekVar.D().E();
        K.n();
        ((zzber) K.b).N(E);
        long G = zzbekVar.D().G();
        K.n();
        ((zzber) K.b).P(G);
        long H = zzbekVar.D().H();
        K.n();
        ((zzber) K.b).Q(H);
        long F = zzbekVar.D().F();
        K.n();
        ((zzber) K.b).O(F);
        return Hex.a(((zzber) K.o()).d());
    }

    public final boolean a(zzbek zzbekVar, ohn ohnVar) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                zzber f2 = f(1);
                String D = zzbekVar.D().D();
                if (f2 != null && f2.D().equals(D)) {
                    e(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File c = c(D);
                if (c.exists()) {
                    String str = true != c.isDirectory() ? "0" : "1";
                    String str2 = true != c.isFile() ? "0" : "1";
                    z = false;
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    this.d.zzb(4023, currentTimeMillis2, sb.toString());
                    e(4015, currentTimeMillis2);
                } else {
                    z = false;
                    if (!c.mkdirs()) {
                        this.d.zzb(4024, currentTimeMillis2, "cw:".concat(true != c.canWrite() ? "0" : "1"));
                        e(4015, currentTimeMillis2);
                        return false;
                    }
                }
                File c2 = c(D);
                File file = new File(c2, "pcam.jar");
                File file2 = new File(c2, "pcbc");
                if (!zzfzt.b(file, zzbekVar.E().d())) {
                    e(4016, currentTimeMillis);
                    return z;
                }
                if (!zzfzt.b(file2, zzbekVar.F().d())) {
                    e(4017, currentTimeMillis);
                    return z;
                }
                if (ohnVar != null && !ohnVar.a(file)) {
                    e(4018, currentTimeMillis);
                    zzfzt.e(c2);
                    return z;
                }
                String d = d(zzbekVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.b;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf(this.c)), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("LATMTD".concat(String.valueOf(this.c)), d);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf(this.c)), string);
                }
                if (!edit.commit()) {
                    e(4019, currentTimeMillis3);
                    return z;
                }
                HashSet hashSet = new HashSet();
                zzber f3 = f(1);
                if (f3 != null) {
                    hashSet.add(f3.D());
                }
                zzber f4 = f(2);
                if (f4 != null) {
                    hashSet.add(f4.D());
                }
                boolean z2 = z;
                File[] listFiles = new File(this.a.getDir("pccache", z2 ? 1 : 0), this.c).listFiles();
                int length = listFiles.length;
                for (int i = z2 ? 1 : 0; i < length; i++) {
                    File file3 = listFiles[i];
                    if (!hashSet.contains(file3.getName())) {
                        zzfzt.e(file3);
                    }
                }
                e(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(zzbek zzbekVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                if (!zzfzt.b(new File(c(zzbekVar.D().D()), "pcbc"), zzbekVar.F().d())) {
                    e(4020, currentTimeMillis);
                    return false;
                }
                String d = d(zzbekVar);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString("LATMTD".concat(String.valueOf(this.c)), d);
                boolean commit = edit.commit();
                if (commit) {
                    e(5015, currentTimeMillis);
                } else {
                    e(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final File c(String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    public final void e(int i, long j) {
        this.d.zza(i, j);
    }

    public final zzber f(int i) {
        zziew a;
        SharedPreferences sharedPreferences = this.b;
        String str = this.c;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] c = Hex.c(string);
                mpo B = zziei.B(0, c.length, c);
                if (this.e) {
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    a = zziew.c;
                } else {
                    a = zziew.a();
                }
                return zzber.J(B, a);
            } catch (zzige unused) {
            } catch (NullPointerException unused2) {
                this.e(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                this.e(2032, currentTimeMillis);
            }
        }
        return null;
    }
}
