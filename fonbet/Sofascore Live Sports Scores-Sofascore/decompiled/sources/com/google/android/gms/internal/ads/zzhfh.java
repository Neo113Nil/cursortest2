package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhfh {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzhfg a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            zzhfg zzhfgVar = (zzhfg) it.next();
            if (zzhfgVar.zza()) {
                return zzhfgVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
