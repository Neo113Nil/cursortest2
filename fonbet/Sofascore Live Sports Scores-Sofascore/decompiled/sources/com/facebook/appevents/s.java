package com.facebook.appevents;

import defpackage.cw3;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s implements Serializable {
    public final HashMap a;

    public s(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            return new r(this.a);
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final void a(b bVar, List list) {
        HashMap hashMap = this.a;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            list.getClass();
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, new ArrayList(list));
                return;
            }
            List list2 = (List) hashMap.get(bVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public s() {
        this.a = new HashMap();
    }
}
