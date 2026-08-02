package com.google.android.gms.internal.ads;

import defpackage.cho;
import defpackage.qjo;
import defpackage.rjo;
import defpackage.sjo;
import defpackage.v9h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgzw {
    public static qjo a(Set set, zzgxw zzgxwVar) {
        zzguk.h(set, "set1");
        zzguk.h(zzgxwVar, "set2");
        return new qjo(set, zzgxwVar);
    }

    public static rjo b(Set set, zzgul zzgulVar) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof rjo)) {
                return new sjo(collection, zzgulVar);
            }
            rjo rjoVar = (rjo) collection;
            return new sjo((SortedSet) rjoVar.a, new cho(Arrays.asList(rjoVar.b, zzgulVar)));
        }
        if (set instanceof rjo) {
            rjo rjoVar2 = (rjo) set;
            return new rjo((Set) rjoVar2.a, new cho(Arrays.asList(rjoVar2.b, zzgulVar)));
        }
        set.getClass();
        return new rjo(set, zzgulVar);
    }

    public static int c(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean e(v9h v9hVar, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgzd) {
            collection = ((zzgzd) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= v9hVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= v9hVar.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = v9hVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
