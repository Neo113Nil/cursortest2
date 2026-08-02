package com.google.android.gms.internal.pal;

import defpackage.lnb;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxz {
    public static final Logger b = Logger.getLogger(zzxz.class.getName());
    public static final ArrayList c;
    public static final boolean d;
    public static final zzxz e;
    public final zzyh a;

    static {
        if (zznb.a()) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            d = false;
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            d = true;
        } else {
            c = new ArrayList();
            d = true;
        }
        e = new zzxz(new zzya());
        new zzye();
        new zzyg();
        new zzyf();
        new zzyb();
        new zzyd();
        new zzyc();
    }

    public zzxz(zzyh zzyhVar) {
        this.a = zzyhVar;
    }

    public static ArrayList b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", lnb.o("Provider ", str, " not available"));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Iterator it = c.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            zzyh zzyhVar = this.a;
            if (!hasNext) {
                if (d) {
                    return zzyhVar.a(str, null);
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
            }
            try {
                return zzyhVar.a(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
