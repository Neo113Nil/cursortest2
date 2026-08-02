package io.sentry.featureflags;

import io.sentry.EnumC7225y1;
import io.sentry.W2;
import io.sentry.protocol.C7190f;
import io.sentry.protocol.C7191g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private volatile CopyOnWriteArrayList<C1113a> f67908a;

    /* renamed from: io.sentry.featureflags.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    private static class C1113a {
        @NotNull
        public static C7190f a() {
            return new C7190f(null, false);
        }
    }

    private a() {
        throw null;
    }

    @NotNull
    public static b a(@NotNull W2 w22) {
        if (w22.getMaxFeatureFlags() <= 0) {
            return c.a();
        }
        a aVar = new a();
        new io.sentry.util.a();
        aVar.f67908a = new CopyOnWriteArrayList<>();
        return aVar;
    }

    @NotNull
    public static b b(@NotNull W2 w22, b bVar, b bVar2, b bVar3) {
        EnumC7225y1 enumC7225y1;
        C1113a c1113a;
        int maxFeatureFlags = w22.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return c.a();
        }
        a aVar = bVar instanceof a ? (a) bVar : null;
        a aVar2 = bVar2 instanceof a ? (a) bVar2 : null;
        a aVar3 = bVar3 instanceof a ? (a) bVar3 : null;
        CopyOnWriteArrayList<C1113a> copyOnWriteArrayList = aVar == null ? null : aVar.f67908a;
        CopyOnWriteArrayList<C1113a> copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f67908a;
        CopyOnWriteArrayList<C1113a> copyOnWriteArrayList3 = aVar3 == null ? null : aVar3.f67908a;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return c.a();
        }
        int i11 = size - 1;
        int i12 = size2 - 1;
        int i13 = size3 - 1;
        C1113a c1113a2 = (copyOnWriteArrayList == null || i11 < 0) ? null : copyOnWriteArrayList.get(i11);
        C1113a c1113a3 = (copyOnWriteArrayList2 == null || i12 < 0) ? null : copyOnWriteArrayList2.get(i12);
        C1113a c1113a4 = (copyOnWriteArrayList3 == null || i13 < 0) ? null : copyOnWriteArrayList3.get(i13);
        LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
        while (linkedHashMap.size() < maxFeatureFlags && (c1113a2 != null || c1113a3 != null || c1113a4 != null)) {
            if (c1113a2 != null) {
                enumC7225y1 = EnumC7225y1.GLOBAL;
                c1113a = c1113a2;
            } else {
                enumC7225y1 = null;
                c1113a = null;
            }
            if (c1113a3 != null) {
                if (c1113a != null) {
                    throw null;
                }
                enumC7225y1 = EnumC7225y1.ISOLATION;
                c1113a = c1113a3;
            }
            if (c1113a4 != null) {
                if (c1113a != null) {
                    throw null;
                }
                enumC7225y1 = EnumC7225y1.CURRENT;
                c1113a = c1113a4;
            }
            if (c1113a == null) {
                break;
            }
            if (!linkedHashMap.containsKey(null)) {
                linkedHashMap.put(null, c1113a);
            }
            if (EnumC7225y1.CURRENT.equals(enumC7225y1)) {
                i13--;
                c1113a4 = (copyOnWriteArrayList3 == null || i13 < 0) ? null : copyOnWriteArrayList3.get(i13);
            } else if (EnumC7225y1.ISOLATION.equals(enumC7225y1)) {
                i12--;
                c1113a3 = (copyOnWriteArrayList2 == null || i12 < 0) ? null : copyOnWriteArrayList2.get(i12);
            } else if (EnumC7225y1.GLOBAL.equals(enumC7225y1)) {
                i11--;
                c1113a2 = (copyOnWriteArrayList == null || i11 < 0) ? null : copyOnWriteArrayList.get(i11);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        CopyOnWriteArrayList<C1113a> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>(arrayList);
        a aVar4 = new a();
        new io.sentry.util.a();
        aVar4.f67908a = copyOnWriteArrayList4;
        return aVar4;
    }

    @Override // io.sentry.featureflags.b
    public final C7191g getFeatureFlags() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1113a> it = this.f67908a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            arrayList.add(C1113a.a());
        }
        return new C7191g(arrayList);
    }

    @Override // io.sentry.featureflags.b
    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final b m62clone() {
        a aVar = new a();
        new io.sentry.util.a();
        aVar.f67908a = new CopyOnWriteArrayList<>(this.f67908a);
        return aVar;
    }
}
