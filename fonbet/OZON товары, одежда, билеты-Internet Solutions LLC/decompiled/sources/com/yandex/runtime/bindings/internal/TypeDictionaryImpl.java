package com.yandex.runtime.bindings.internal;

import B0.A0;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.TypeDictionary;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class TypeDictionaryImpl<T> implements TypeDictionary<T> {
    private Map<String, T> map;
    private NativeObject nativeObject;

    private TypeDictionaryImpl(NativeObject nativeObject) {
        this.map = new ConcurrentHashMap();
        this.nativeObject = nativeObject;
    }

    private <U extends T> U getItemByKey(String str) {
        U u11;
        T t2 = this.map.get(str);
        return (t2 != null || this.nativeObject == null || (t2 = (U) getItemNative(str)) == null || (u11 = (U) this.map.putIfAbsent(str, t2)) == null) ? t2 : u11;
    }

    private native Object getItemNative(String str);

    private native List<String> getKeys();

    private <U> String keyForClass(Class<U> cls) {
        try {
            return (String) cls.getMethod("getNativeName", new Class[0]).invoke(null, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e11) {
            throw new IllegalArgumentException(A0.b("Objects of class ", cls.getName(), " cannot be stored in com.yandex.runtime.bindings.internal.TypeDictionaryImpl"), e11);
        }
    }

    @Override // com.yandex.runtime.TypeDictionary
    public Map<String, T> getAllItems() {
        if (this.nativeObject != null) {
            Iterator<String> it = getKeys().iterator();
            while (it.hasNext()) {
                getItemByKey(it.next());
            }
        }
        return this.map;
    }

    @Override // com.yandex.runtime.TypeDictionary
    public <U extends T> U getItem(Class<U> cls) {
        String keyForClass = keyForClass(cls);
        if (keyForClass == null) {
            return null;
        }
        return (U) getItemByKey(keyForClass);
    }

    TypeDictionaryImpl(Map<String, T> map) {
        new ConcurrentHashMap();
        this.map = map;
    }
}
