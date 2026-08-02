package com.google.common.cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public interface b<K, V> {
    ConcurrentMap<K, V> b();

    Object e(String str, Callable callable) throws ExecutionException;
}
