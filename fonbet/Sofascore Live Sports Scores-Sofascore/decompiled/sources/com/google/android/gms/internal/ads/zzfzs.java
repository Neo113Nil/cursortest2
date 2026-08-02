package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import defpackage.me4;
import defpackage.ohn;
import java.io.File;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfzs {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final zzbei d;

    public zzfzs(Context context, zzbei zzbeiVar) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfzt.d(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfzt.d(dir2, true);
        this.b = dir2;
        this.d = zzbeiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(zzbek zzbekVar, ohn ohnVar) {
        boolean z;
        zzber b;
        zzber b2;
        String D = zzbekVar.D().D();
        byte[] d = zzbekVar.E().d();
        byte[] d2 = zzbekVar.F().d();
        if (!TextUtils.isEmpty(D) && d2.length != 0) {
            File file = this.b;
            zzfzt.e(file);
            file.mkdirs();
            zzfzt.c(file, D).mkdirs();
            File a = zzfzt.a(file, D, "pcam.jar");
            if ((d.length <= 0 || zzfzt.b(a, d)) && zzfzt.b(zzfzt.a(file, D, "pcbc"), d2)) {
                File a2 = zzfzt.a(file, zzbekVar.D().D(), "pcam.jar");
                if (!a2.exists() || ohnVar == null || ohnVar.a(a2)) {
                    String D2 = zzbekVar.D().D();
                    if (!TextUtils.isEmpty(D2)) {
                        File a3 = zzfzt.a(file, D2, "pcam.jar");
                        File a4 = zzfzt.a(file, D2, "pcbc");
                        File a5 = zzfzt.a(c(), D2, "pcam.jar");
                        File a6 = zzfzt.a(c(), D2, "pcbc");
                        if ((!a3.exists() || a3.renameTo(a5)) && a4.exists() && a4.renameTo(a6)) {
                            zzbeq K = zzber.K();
                            String D3 = zzbekVar.D().D();
                            K.n();
                            ((zzber) K.b).M(D3);
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
                            zzber zzberVar = (zzber) K.o();
                            zzber b3 = b(1);
                            SharedPreferences.Editor edit = this.c.edit();
                            if (b3 != null && !zzberVar.D().equals(b3.D())) {
                                edit.putString(d(), Hex.a(b3.d()));
                            }
                            edit.putString(e(), Hex.a(zzberVar.d()));
                            if (edit.commit()) {
                                z = true;
                                HashSet hashSet = new HashSet();
                                b = b(1);
                                if (b != null) {
                                    hashSet.add(b.D());
                                }
                                b2 = b(2);
                                if (b2 != null) {
                                    hashSet.add(b2.D());
                                }
                                for (File file2 : c().listFiles()) {
                                    String name = file2.getName();
                                    if (!hashSet.contains(name)) {
                                        zzfzt.e(zzfzt.c(c(), name));
                                    }
                                }
                                return z;
                            }
                        }
                    }
                    z = false;
                    HashSet hashSet2 = new HashSet();
                    b = b(1);
                    if (b != null) {
                    }
                    b2 = b(2);
                    if (b2 != null) {
                    }
                    while (r4 < r1) {
                    }
                    return z;
                }
            }
        }
        return false;
    }

    public final zzber b(int i) {
        SharedPreferences sharedPreferences = this.c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] c = Hex.c(string);
                zzber I = zzber.I(zziei.B(0, c.length, c));
                String D = I.D();
                File a = zzfzt.a(c(), D, "pcam.jar");
                if (!a.exists()) {
                    a = zzfzt.a(c(), D, "pcam");
                }
                File a2 = zzfzt.a(c(), D, "pcbc");
                if (a.exists()) {
                    if (a2.exists()) {
                        return I;
                    }
                }
            } catch (zzige unused) {
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.a, Integer.toString(this.d.a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = this.d.a;
        return me4.g(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = this.d.a;
        return me4.g(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}
