package com.vk.movika.sdk.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.izs;

/* loaded from: classes3.dex */
public final class b {
    public static final <T, R> Set<R> a(Collection<? extends T> collection, izs<? super T, ? extends R> izsVar) {
        if (collection.isEmpty()) {
            return EmptySet.b;
        }
        HashSet hashSet = new HashSet(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(izsVar.invoke(it.next()));
        }
        return hashSet;
    }
}
