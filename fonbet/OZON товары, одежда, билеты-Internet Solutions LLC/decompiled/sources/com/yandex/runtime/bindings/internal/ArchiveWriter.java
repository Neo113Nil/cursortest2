package com.yandex.runtime.bindings.internal;

import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ArchiveWriter implements Archive {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DEFAULT_SIZE = 16384;
    private ByteBuffer data = allocate(DEFAULT_SIZE);

    private static ByteBuffer allocate(int i11) {
        return ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
    }

    private void ensureSize(int i11) {
        int position = this.data.position();
        int capacity = this.data.capacity();
        int i12 = i11 + position;
        if (i12 > capacity) {
            ByteBuffer allocate = allocate(Math.max((int) (capacity * 1.6d), i12));
            this.data.position(0);
            allocate.put(this.data);
            allocate.position(position);
            this.data = allocate;
        }
    }

    private <T> boolean writeOptionalFlag(boolean z11, T t2) {
        if (z11) {
            return add(t2 != null);
        }
        return true;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean add(boolean z11) {
        add(z11 ? (byte) 1 : (byte) 0);
        return z11;
    }

    public ByteBuffer data() {
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public boolean isReader() {
        return false;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte add(byte b11) {
        ensureSize(1);
        this.data.put(b11);
        return b11;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public int add(int i11) {
        ensureSize(4);
        this.data.putInt(i11);
        return i11;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public long add(long j11) {
        ensureSize(8);
        this.data.putLong(j11);
        return j11;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public float add(float f7) {
        ensureSize(4);
        this.data.putFloat(f7);
        return f7;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public double add(double d11) {
        ensureSize(8);
        this.data.putDouble(d11);
        return d11;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Boolean add(Boolean bool, boolean z11) {
        if (writeOptionalFlag(z11, bool)) {
            return Boolean.valueOf(add(bool.booleanValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Byte add(Byte b11, boolean z11) {
        if (writeOptionalFlag(z11, b11)) {
            return Byte.valueOf(add(b11.byteValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Integer add(Integer num, boolean z11) {
        if (writeOptionalFlag(z11, num)) {
            return Integer.valueOf(add(num.intValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Long add(Long l11, boolean z11) {
        if (writeOptionalFlag(z11, l11)) {
            return Long.valueOf(add(l11.longValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Float add(Float f7, boolean z11) {
        if (writeOptionalFlag(z11, f7)) {
            return Float.valueOf(add(f7.floatValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public Double add(Double d11, boolean z11) {
        if (writeOptionalFlag(z11, d11)) {
            return Double.valueOf(add(d11.doubleValue()));
        }
        return null;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public ByteBuffer add(ByteBuffer byteBuffer) {
        ensureSize(byteBuffer.capacity());
        this.data.put(byteBuffer);
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public byte[] add(byte[] bArr, boolean z11) {
        if (!writeOptionalFlag(z11, bArr)) {
            return null;
        }
        add(bArr.length);
        ensureSize(bArr.length);
        this.data.put(bArr);
        return bArr;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public String add(String str, boolean z11) {
        if (!writeOptionalFlag(z11, str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            add(bytes.length);
            ensureSize(bytes.length);
            this.data.put(bytes);
            return str;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Enum<T>> T add(T t2, boolean z11, Class<T> cls) {
        if (!writeOptionalFlag(z11, t2)) {
            return null;
        }
        add(t2.ordinal());
        return t2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> List<T> add(List<T> list, boolean z11, ArchivingHandler<T> archivingHandler) {
        if (!writeOptionalFlag(z11, list)) {
            return null;
        }
        add(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            archivingHandler.add(it.next(), this);
        }
        return list;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z11, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2) {
        if (!writeOptionalFlag(z11, map)) {
            return null;
        }
        add(map.size());
        for (Map.Entry<Key, Value> entry : map.entrySet()) {
            archivingHandler.add(entry.getKey(), this);
            archivingHandler2.add(entry.getValue(), this);
        }
        return map;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <Value> TypeDictionary<Value> add(TypeDictionary<Value> typeDictionary, boolean z11, ArchivingHandler<Value> archivingHandler) {
        if (!writeOptionalFlag(z11, typeDictionary)) {
            return null;
        }
        add(typeDictionary.getAllItems(), false, new StringHandler(), archivingHandler);
        return typeDictionary;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T extends Serializable> T add(T t2, boolean z11, Class<T> cls) {
        if (!writeOptionalFlag(z11, t2)) {
            return null;
        }
        if (cls.isInterface()) {
            add(t2.getClass().getName(), false);
        }
        t2.serialize(this);
        return t2;
    }

    @Override // com.yandex.runtime.bindings.Archive
    public <T> T add(T t2, ArchivingHandler<T> archivingHandler) {
        return archivingHandler.add(t2, this);
    }

    @Override // com.yandex.runtime.bindings.Archive
    public PointF add(PointF pointF, boolean z11) {
        if (!writeOptionalFlag(z11, pointF)) {
            return null;
        }
        add(pointF.x);
        add(pointF.y);
        return pointF;
    }
}
