package com.yandex.runtime.bindings;

import java.lang.Enum;

/* loaded from: classes9.dex */
public class EnumHandler<T extends Enum<T>> implements ArchivingHandler<T> {
    private Class<T> enumClass;
    private final boolean isOptional;

    public EnumHandler(Class<T> cls) {
        this(false, cls);
    }

    public EnumHandler(boolean z11, Class<T> cls) {
        this.isOptional = z11;
        this.enumClass = cls;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public T add(T t2, Archive archive) {
        return (T) archive.add((Archive) t2, this.isOptional, (Class<Archive>) this.enumClass);
    }
}
