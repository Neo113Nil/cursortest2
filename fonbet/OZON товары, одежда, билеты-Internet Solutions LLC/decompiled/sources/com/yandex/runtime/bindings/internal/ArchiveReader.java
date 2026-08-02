package com.yandex.runtime.bindings.internal;

import Sh.b;
import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ArchiveReader implements Archive {
    private final ByteBuffer data;

    public ArchiveReader(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(0);
        byteBuffer.order(ByteOrder.nativeOrder());
    }

    private static <T> T create(Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e11) {
            throw new RuntimeException(b.c("Cannot create an instance of class ", cls.getName(), ". ", e11.getMessage()));
        }
    }

    private boolean readOptionalFlag() {
        return add(false);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean add(boolean z11) {
        byte add = add((byte) 0);
        if (add == 1) {
            return true;
        }
        if (add == 0) {
            return false;
        }
        throw new RuntimeException(String.format("0x%02x is not valid boolean value", Byte.valueOf(add)));
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean isReader() {
        return true;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte add(byte b11) {
        return this.data.get();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public int add(int i11) {
        return this.data.getInt();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public long add(long j11) {
        return this.data.getLong();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public float add(float f7) {
        return this.data.getFloat();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public double add(double d11) {
        return this.data.getDouble();
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Boolean add(Boolean bool, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return Boolean.valueOf(add(false));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Byte add(Byte b11, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return Byte.valueOf(add((byte) 0));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Integer add(Integer num, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return Integer.valueOf(add(0));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Long add(Long l11, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return Long.valueOf(add(0L));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Float add(Float f7, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return Float.valueOf(add(0.0f));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Double add(Double d11, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return Double.valueOf(add(0.0d));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public ByteBuffer add(ByteBuffer byteBuffer) {
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte[] add(byte[] bArr, boolean z11) {
        if (z11 && !readOptionalFlag()) {
            return null;
        }
        byte[] bArr2 = new byte[add(0)];
        this.data.get(bArr2);
        return bArr2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public String add(String str, boolean z11) {
        if (z11 && !readOptionalFlag()) {
            return null;
        }
        try {
            byte[] bArr = new byte[add(0)];
            this.data.get(bArr);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Enum<T>> T add(T t2, boolean z11, Class<T> cls) {
        if (!z11 || readOptionalFlag()) {
            return cls.getEnumConstants()[add(0)];
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> List<T> add(List<T> list, boolean z11, ArchivingHandler<T> archivingHandler) {
        if (z11 && !readOptionalFlag()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int add = add(0);
        for (int i11 = 0; i11 < add; i11++) {
            arrayList.add(archivingHandler.add(null, this));
        }
        return arrayList;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z11, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2) {
        if (z11 && !readOptionalFlag()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int add = add(0);
        for (int i11 = 0; i11 < add; i11++) {
            hashMap.put(archivingHandler.add(null, this), archivingHandler2.add(null, this));
        }
        return hashMap;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Value> TypeDictionary<Value> add(TypeDictionary<Value> typeDictionary, boolean z11, ArchivingHandler<Value> archivingHandler) {
        if (!z11 || readOptionalFlag()) {
            return new TypeDictionaryImpl(add(null, false, new StringHandler(), archivingHandler));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Serializable> T add(T t2, boolean z11, Class<T> cls) {
        if (z11 && !readOptionalFlag()) {
            return null;
        }
        if (cls.isInterface()) {
            try {
                cls = (Class<T>) Class.forName(add((String) null, false));
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }
        T t11 = (T) create(cls);
        t11.serialize(this);
        return t11;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> T add(T t2, ArchivingHandler<T> archivingHandler) {
        return archivingHandler.add(t2, this);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public PointF add(PointF pointF, boolean z11) {
        if (!z11 || readOptionalFlag()) {
            return new PointF(add(0.0f), add(0.0f));
        }
        return null;
    }
}
