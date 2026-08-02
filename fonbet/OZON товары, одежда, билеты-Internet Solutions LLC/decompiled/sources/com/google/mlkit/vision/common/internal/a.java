package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f60079a = new HashMap();

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C0914a {
    }

    a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0914a) it.next()).getClass();
            if (!this.f60079a.containsKey(null) || ((Integer) Preconditions.checkNotNull((Integer) hashMap.get(null))).intValue() <= 0) {
                this.f60079a.put(null, null);
                hashMap.put(null, 0);
            }
        }
    }
}
