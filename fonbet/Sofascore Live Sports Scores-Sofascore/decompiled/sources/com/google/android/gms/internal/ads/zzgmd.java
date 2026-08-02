package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import defpackage.me4;
import java.io.File;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgmd {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final zzinq d;
    public final zzgrh e;

    public zzgmd(Context context, SharedPreferences sharedPreferences, zzinq zzinqVar, zzgrh zzgrhVar) {
        this.c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfzt.d(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfzt.d(dir2, true);
        this.b = dir2;
        this.d = zzinqVar;
        this.e = zzgrhVar;
    }

    public final void a(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        String D = zzggtVar.D().D();
        boolean isEmpty = TextUtils.isEmpty(D);
        zzgrh zzgrhVar = this.e;
        if (!isEmpty && bArr2.length != 0) {
            File file = this.b;
            zzfzt.e(file);
            file.mkdirs();
            File c = zzfzt.c(file, D);
            c.getClass();
            c.mkdirs();
            File a = zzfzt.a(file, D, "pcam.jar");
            a.getClass();
            if (bArr == null || bArr.length <= 0 || zzfzt.b(a, bArr)) {
                File a2 = zzfzt.a(file, D, "pcbc");
                a2.getClass();
                if (zzfzt.b(a2, bArr2)) {
                    String D2 = zzggtVar.D().D();
                    if (!TextUtils.isEmpty(D2)) {
                        File a3 = zzfzt.a(file, D2, "pcam.jar");
                        a3.getClass();
                        File a4 = zzfzt.a(file, D2, "pcbc");
                        a4.getClass();
                        File a5 = zzfzt.a(c(), D2, "pcam.jar");
                        a5.getClass();
                        File a6 = zzfzt.a(c(), D2, "pcbc");
                        a6.getClass();
                        if (a3.exists() && !a3.renameTo(a5)) {
                            zzgrhVar.b(15318);
                        } else if (a4.exists() && a4.renameTo(a6)) {
                            zzggt b = b(1);
                            SharedPreferences.Editor edit = this.c.edit();
                            if (b != null && !zzggtVar.D().D().equals(b.D().D())) {
                                edit.putString(d(), Hex.a(b.d()));
                            }
                            edit.putString(e(), Hex.a(zzggtVar.d()));
                            if (!edit.commit()) {
                                zzgrhVar.b(15320);
                            }
                        } else {
                            zzgrhVar.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    zzggt b2 = b(1);
                    if (b2 != null) {
                        hashSet.add(b2.D().D());
                    }
                    zzggt b3 = b(2);
                    if (b3 != null) {
                        hashSet.add(b3.D().D());
                    }
                    File[] listFiles = c().listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File c2 = zzfzt.c(c(), name);
                                c2.getClass();
                                zzfzt.e(c2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        zzgrhVar.b(15316);
    }

    public final zzggt b(int i) {
        SharedPreferences sharedPreferences = this.c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] c = Hex.c(string);
                zzggt H = zzggt.H(zziei.B(0, c.length, c));
                String D = H.D().D();
                File a = zzfzt.a(c(), D, "pcam.jar");
                if (a == null) {
                    throw null;
                }
                if (!a.exists() && (a = zzfzt.a(c(), D, "pcam")) == null) {
                    throw null;
                }
                File a2 = zzfzt.a(c(), D, "pcbc");
                if (a2 == null) {
                    throw null;
                }
                if (a.exists() && a2.exists()) {
                    return H;
                }
            } catch (zzige unused) {
                this.e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.a, Integer.toString(((zzbei) this.d.zzb()).a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((zzbei) this.d.zzb()).a;
        return me4.g(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((zzbei) this.d.zzb()).a;
        return me4.g(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}
