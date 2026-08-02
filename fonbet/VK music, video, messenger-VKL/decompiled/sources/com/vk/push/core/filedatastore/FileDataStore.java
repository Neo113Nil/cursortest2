package com.vk.push.core.filedatastore;

import xsna.izs;
import xsna.spj;

/* compiled from: FileDataStore.kt */
/* loaded from: classes.dex */
public interface FileDataStore<T> {
    Object clear(spj<? super Boolean> spjVar);

    Object edit(izs<? super T, ? extends T> izsVar, spj<? super Boolean> spjVar);

    Object read(spj<? super T> spjVar);

    Object write(T t, spj<? super Boolean> spjVar);
}
