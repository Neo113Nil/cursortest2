package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Internal {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f60125a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f60126b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f60127c;

    /* loaded from: classes9.dex */
    public interface BooleanList extends e<Boolean> {
        void addBoolean(boolean z11);

        boolean getBoolean(int i11);

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.e
        /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        e<Boolean> mutableCopyWithCapacity2(int i11);

        boolean setBoolean(int i11, boolean z11);
    }

    /* loaded from: classes9.dex */
    public interface DoubleList extends e<Double> {
        void addDouble(double d11);

        double getDouble(int i11);

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.e
        /* renamed from: mutableCopyWithCapacity */
        e<Double> mutableCopyWithCapacity2(int i11);

        double setDouble(int i11, double d11);
    }

    /* loaded from: classes9.dex */
    public interface FloatList extends e<Float> {
        void addFloat(float f7);

        float getFloat(int i11);

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.e
        /* renamed from: mutableCopyWithCapacity */
        e<Float> mutableCopyWithCapacity2(int i11);

        float setFloat(int i11, float f7);
    }

    /* loaded from: classes9.dex */
    public interface IntList extends e<Integer> {
        void addInt(int i11);

        int getInt(int i11);

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.e
        /* renamed from: mutableCopyWithCapacity */
        e<Integer> mutableCopyWithCapacity2(int i11);

        int setInt(int i11, int i12);
    }

    /* loaded from: classes9.dex */
    public interface LongList extends e<Long> {
        void addLong(long j11);

        long getLong(int i11);

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.e
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.e
        /* renamed from: mutableCopyWithCapacity */
        e<Long> mutableCopyWithCapacity2(int i11);

        long setLong(int i11, long j11);
    }

    /* loaded from: classes9.dex */
    public interface a {
        int getNumber();
    }

    /* loaded from: classes9.dex */
    public interface b<T extends a> {
        T findValueByNumber(int i11);
    }

    /* loaded from: classes9.dex */
    public interface c {
        boolean isInRange(int i11);
    }

    /* loaded from: classes9.dex */
    public static class d<T> extends AbstractList<T> {

        /* renamed from: a, reason: collision with root package name */
        private final IntList f60128a;

        /* renamed from: b, reason: collision with root package name */
        private final a<T> f60129b;

        public interface a<T> {
            T convert(int i11);
        }

        public d(IntList intList, a<T> aVar) {
            this.f60128a = intList;
            this.f60129b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i11) {
            return this.f60129b.convert(this.f60128a.getInt(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f60128a.size();
        }
    }

    public interface e<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* renamed from: mutableCopyWithCapacity */
        e<E> mutableCopyWithCapacity2(int i11);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f60126b = bArr;
        f60127c = ByteBuffer.wrap(bArr);
        CodedInputStream.newInstance(bArr);
    }

    static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }
}
