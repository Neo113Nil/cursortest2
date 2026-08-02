package com.vk.movika.sdk.base.data.converter;

import com.vk.movika.sdk.base.model.f;
import java.util.Comparator;
import xsna.jw5;

/* loaded from: classes3.dex */
public final class b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Long.valueOf(((f) t).c), Long.valueOf(((f) t2).c));
    }
}
