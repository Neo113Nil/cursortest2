package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import xsna.exc0;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public final class a {
    public final HashMap a = new HashMap();

    /* compiled from: com.google.mlkit:vision-common@@17.3.0 */
    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C0149a {
    }

    public a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0149a) it.next()).getClass();
            if (this.a.containsKey(null)) {
                Integer num = (Integer) hashMap.get(null);
                exc0.i(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(null, null);
            hashMap.put(null, 0);
        }
    }
}
