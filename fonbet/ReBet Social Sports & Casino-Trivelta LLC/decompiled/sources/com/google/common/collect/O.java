package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface O {
    Collection a();

    Map asMap();

    boolean b(Object obj, Object obj2);

    void clear();

    Collection get(Object obj);

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();
}
