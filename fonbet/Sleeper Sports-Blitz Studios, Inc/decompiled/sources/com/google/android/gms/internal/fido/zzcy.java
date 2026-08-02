package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzcy {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
