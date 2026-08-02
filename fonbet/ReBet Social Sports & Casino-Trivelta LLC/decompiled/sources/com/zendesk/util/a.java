package com.zendesk.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kd.InterfaceC5251a;

/* loaded from: classes4.dex */
public abstract class a {
    static final long[] EMPTY_LONG_ARRAY = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC5251a f42385a = new C0605a();

    /* renamed from: com.zendesk.util.a$a, reason: collision with other inner class name */
    public static class C0605a implements InterfaceC5251a {
        @Override // kd.InterfaceC5251a
        public Object apply(Object obj) {
            return obj;
        }
    }

    public static List a(List list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Map b(Map map) {
        if (map == null) {
            return new HashMap();
        }
        Map synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    public static List c(List list) {
        return e(list) ? new ArrayList() : list;
    }

    public static List d(Collection collection, InterfaceC5251a interfaceC5251a) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (((Boolean) interfaceC5251a.apply(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean e(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean f(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static boolean g(Object[] objArr) {
        return !f(objArr);
    }
}
