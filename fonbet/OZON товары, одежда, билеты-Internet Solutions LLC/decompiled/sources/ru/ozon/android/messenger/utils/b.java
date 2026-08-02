package ru.ozon.android.messenger.utils;

import Sc.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    @NotNull
    public static final LinkedHashMap a(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <T> T b(@NotNull List<? extends T> list, int i11, int i12, @NotNull Function1<? super T, Boolean> predicate) {
        Object a11;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Iterator<T> it = list.subList(i11, i12).iterator();
            while (true) {
                if (!it.hasNext()) {
                    a11 = null;
                    break;
                }
                a11 = it.next();
                if (predicate.invoke(a11).booleanValue()) {
                    break;
                }
            }
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.w(b11);
        }
        if (a11 instanceof r.b) {
            return null;
        }
        return (T) a11;
    }

    public static final Object c(@NotNull List list, int i11, @NotNull Function1 predicate) {
        Object a11;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        try {
            r.Companion companion = Sc.r.INSTANCE;
            List subList = list.subList(0, i11);
            ListIterator listIterator = subList.listIterator(subList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a11 = null;
                    break;
                }
                a11 = listIterator.previous();
                if (((Boolean) predicate.invoke(a11)).booleanValue()) {
                    break;
                }
            }
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.w(b11);
        }
        if (a11 instanceof r.b) {
            return null;
        }
        return a11;
    }

    @NotNull
    public static final LinkedHashMap d(@NotNull Map map, @NotNull Function1 mapper) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object invoke = mapper.invoke(entry.getValue());
            if (invoke != null) {
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final ArrayList e(@NotNull List list, Object obj, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Object obj2 : list2) {
            if (((Boolean) block.invoke(obj2)).booleanValue()) {
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList f(@NotNull List list, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList W02 = C7714v.W0(list);
        block.invoke(W02);
        return W02;
    }
}
