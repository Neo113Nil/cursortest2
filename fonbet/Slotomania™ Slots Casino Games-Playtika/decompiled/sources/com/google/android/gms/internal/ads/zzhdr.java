package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhdr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhdq zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzhdq zzhdqVar = (zzhdq) it.next();
            if (zzhdqVar.zza()) {
                return zzhdqVar;
            }
        }
        String.valueOf(str);
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
