package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.me4;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzicn extends zzico implements Iterable {
    public final ArrayList a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zzico
    public final String c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzico) arrayList.get(0)).c();
        }
        a70.r(me4.g(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzicn) && ((zzicn) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
