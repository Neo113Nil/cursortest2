package io.sentry.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.util.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4845c {
    private static final String[] EMPTY_STRINGS = new String[0];

    public static List a(List list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static Map b(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static Map c(Map map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public static ListIterator d(CopyOnWriteArrayList copyOnWriteArrayList) {
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(copyOnWriteArrayList);
        return copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
    }

    public static int e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
        }
        return i10;
    }

    public static String[] f(Enumeration enumeration, int i10) {
        String[] strArr = i10 == 0 ? EMPTY_STRINGS : new String[i10];
        int i11 = 0;
        while (enumeration.hasMoreElements()) {
            if (i11 == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            }
            strArr[i11] = (String) enumeration.nextElement();
            i11++;
        }
        if (i11 != strArr.length) {
            strArr = (String[]) Arrays.copyOf(strArr, i11);
        }
        Arrays.sort(strArr);
        return strArr;
    }
}
