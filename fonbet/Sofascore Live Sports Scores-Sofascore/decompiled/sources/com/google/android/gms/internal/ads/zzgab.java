package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dalvik.system.DexClassLoader;
import defpackage.n72;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgab {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final zzgac b;
    public final zzfyi c;
    public final zzfyd d;
    public final boolean e;
    public n72 f;
    public final Object g = new Object();

    public zzgab(Context context, zzgac zzgacVar, zzfyi zzfyiVar, zzfyd zzfydVar, boolean z) {
        this.a = context;
        this.b = zzgacVar;
        this.c = zzfyiVar;
        this.d = zzfydVar;
        this.e = z;
    }

    public final boolean a(zzfzr zzfzrVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                n72 n72Var = new n72(c(zzfzrVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", zzfzrVar.a(), null, new Bundle(), 2), zzfzrVar, this.b, this.c, this.e);
                if (!n72Var.A()) {
                    throw new zzgaa(4000, "init failed");
                }
                int C = n72Var.C();
                if (C != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 4);
                    sb.append("ci: ");
                    sb.append(C);
                    throw new zzgaa(4001, sb.toString());
                }
                synchronized (this.g) {
                    n72 n72Var2 = this.f;
                    if (n72Var2 != null) {
                        try {
                            n72Var2.B();
                        } catch (zzgaa e) {
                            this.c.c(e.a, -1L, e);
                        }
                    }
                    this.f = n72Var;
                }
                this.c.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzgaa(2004, e2);
            }
        } catch (zzgaa e3) {
            this.c.c(e3.a, System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.c(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final n72 b() {
        n72 n72Var;
        synchronized (this.g) {
            n72Var = this.f;
        }
        return n72Var;
    }

    public final synchronized Class c(zzfzr zzfzrVar) {
        try {
            zzber zzberVar = zzfzrVar.a;
            if (zzberVar == null) {
                throw new zzgaa(4010, "mc");
            }
            String D = zzberVar.D();
            HashMap hashMap = h;
            Class cls = (Class) hashMap.get(D);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.d.a(zzfzrVar.b)) {
                    throw new zzgaa(2026, "VM did not pass signature verification");
                }
                try {
                    File file = zzfzrVar.c;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfzrVar.b.getAbsolutePath(), file.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(D, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzgaa(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzgaa(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzgaa(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzgaa(2026, e4);
            }
        } finally {
        }
    }
}
