package com.yandex.runtime.bindings;

import android.graphics.PointF;
import com.yandex.runtime.TypeDictionary;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface Archive {
    byte add(byte b11);

    double add(double d11);

    float add(float f7);

    int add(int i11);

    long add(long j11);

    PointF add(PointF pointF, boolean z11);

    <T> TypeDictionary<T> add(TypeDictionary<T> typeDictionary, boolean z11, ArchivingHandler<T> archivingHandler);

    <T extends Serializable> T add(T t2, boolean z11, Class<T> cls);

    Boolean add(Boolean bool, boolean z11);

    Byte add(Byte b11, boolean z11);

    Double add(Double d11, boolean z11);

    <T extends Enum<T>> T add(T t2, boolean z11, Class<T> cls);

    Float add(Float f7, boolean z11);

    Integer add(Integer num, boolean z11);

    Long add(Long l11, boolean z11);

    <T> T add(T t2, ArchivingHandler<T> archivingHandler);

    String add(String str, boolean z11);

    ByteBuffer add(ByteBuffer byteBuffer);

    <T> List<T> add(List<T> list, boolean z11, ArchivingHandler<T> archivingHandler);

    <Key, Value> Map<Key, Value> add(Map<Key, Value> map, boolean z11, ArchivingHandler<Key> archivingHandler, ArchivingHandler<Value> archivingHandler2);

    boolean add(boolean z11);

    byte[] add(byte[] bArr, boolean z11);

    boolean isReader();
}
