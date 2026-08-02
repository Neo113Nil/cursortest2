package com.yandex.runtime.bindings;

import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ClassHandler<T extends Serializable> implements ArchivingHandler<T> {
    private final boolean isOptional;
    private Class<T> itemClass;

    public ClassHandler(Class<T> cls) {
        this(false, cls);
    }

    public ClassHandler(boolean z11, Class<T> cls) {
        this.isOptional = z11;
        this.itemClass = cls;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public T add(T t2, Archive archive) {
        return (T) archive.add((Archive) t2, this.isOptional, (Class<Archive>) this.itemClass);
    }
}
