package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5895a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5904j;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x.a;
import com.google.crypto.tink.shaded.protobuf.C5899e;
import com.google.crypto.tink.shaded.protobuf.C5913t;
import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5917x<MessageType extends AbstractC5917x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5895a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC5917x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.b();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    public static abstract class a<MessageType extends AbstractC5917x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5895a.AbstractC0905a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f59475a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f59476b;

        protected a(MessageType messagetype) {
            this.f59475a = messagetype;
            if (messagetype.r()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f59476b = (MessageType) messagetype.w();
        }

        private static <MessageType> void h(MessageType messagetype, MessageType messagetype2) {
            c0 a11 = c0.a();
            a11.getClass();
            a11.b(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
        }

        public final MessageType b() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.p()) {
                return buildPartial;
            }
            throw new l0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.S.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MessageType buildPartial() {
            if (!this.f59476b.r()) {
                return this.f59476b;
            }
            this.f59476b.s();
            return this.f59476b;
        }

        @Override // 
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final BuilderType clone() {
            BuilderType buildertype = (BuilderType) this.f59475a.newBuilderForType();
            buildertype.f59476b = buildPartial();
            return buildertype;
        }

        protected final void e() {
            if (this.f59476b.r()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f59475a.w();
            h(messagetype, this.f59476b);
            this.f59476b = messagetype;
        }

        public final MessageType f() {
            return this.f59475a;
        }

        public final void g(AbstractC5917x abstractC5917x) {
            if (this.f59475a.equals(abstractC5917x)) {
                return;
            }
            e();
            h(this.f59476b, abstractC5917x);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.T
        public AbstractC5917x getDefaultInstanceForType() {
            return this.f59475a;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    protected static class b<T extends AbstractC5917x<T, ?>> extends AbstractC5896b<T> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    /* loaded from: classes9.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC5917x<MessageType, BuilderType> implements T {
        protected C5913t<d> extensions = C5913t.d();

        final C5913t<d> D() {
            if (this.extensions.i()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.x] */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
        public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.S
        public final /* bridge */ /* synthetic */ a newBuilderForType() {
            return newBuilderForType();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    /* loaded from: classes9.dex */
    static final class d implements C5913t.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C5913t.b
        public final s0 getLiteJavaType() {
            throw null;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$e */
    /* loaded from: classes9.dex */
    public static class e<ContainingType extends S, Type> extends Lf.a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$f */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f BUILD_MESSAGE_INFO;
        public static final f GET_DEFAULT_INSTANCE;
        public static final f GET_MEMOIZED_IS_INITIALIZED;
        public static final f GET_PARSER;
        public static final f NEW_BUILDER;
        public static final f NEW_MUTABLE_INSTANCE;
        public static final f SET_MEMOIZED_IS_INITIALIZED;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            NEW_BUILDER = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = fVar6;
            f fVar7 = new f("GET_PARSER", 6);
            GET_PARSER = fVar7;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        }

        private f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    static <T extends AbstractC5917x<T, ?>> T A(T t2, AbstractC5904j abstractC5904j, C5910p c5910p) throws A {
        T t11 = (T) t2.w();
        try {
            c0 a11 = c0.a();
            a11.getClass();
            f0 b11 = a11.b(t11.getClass());
            b11.b(t11, C5905k.a(abstractC5904j), c5910p);
            b11.makeImmutable(t11);
            return t11;
        } catch (A e11) {
            e = e11;
            if (e.a()) {
                e = new A(e.getMessage(), e);
            }
            e.j(t11);
            throw e;
        } catch (l0 e12) {
            A a12 = new A(e12.getMessage());
            a12.j(t11);
            throw a12;
        } catch (IOException e13) {
            if (e13.getCause() instanceof A) {
                throw ((A) e13.getCause());
            }
            A a13 = new A(e13.getMessage(), e13);
            a13.j(t11);
            throw a13;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof A) {
                throw ((A) e14.getCause());
            }
            throw e14;
        }
    }

    protected static <T extends AbstractC5917x<?, ?>> void B(Class<T> cls, T t2) {
        t2.t();
        defaultInstanceMap.put(cls, t2);
    }

    private static void g(AbstractC5917x abstractC5917x) throws A {
        if (abstractC5917x == null || q(abstractC5917x, true)) {
            return;
        }
        A a11 = new A(new l0().getMessage());
        a11.j(abstractC5917x);
        throw a11;
    }

    protected static <E> C5919z.d<E> k() {
        return d0.b();
    }

    static <T extends AbstractC5917x<?, ?>> T l(Class<T> cls) {
        T t2 = (T) defaultInstanceMap.get(cls);
        if (t2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t2 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (t2 != null) {
            return t2;
        }
        T t11 = (T) ((AbstractC5917x) p0.k(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    static Object o(Method method, S s11, Object... objArr) {
        try {
            return method.invoke(s11, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    private static final <T extends AbstractC5917x<T, ?>> boolean q(T t2, boolean z11) {
        byte byteValue = ((Byte) t2.j(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        c0 a11 = c0.a();
        a11.getClass();
        boolean isInitialized = a11.b(t2.getClass()).isInitialized(t2);
        if (z11) {
            t2.j(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return isInitialized;
    }

    protected static Object v(S s11, String str, Object[] objArr) {
        return new e0(s11, str, objArr);
    }

    protected static <T extends AbstractC5917x<T, ?>> T x(T t2, AbstractC5903i abstractC5903i, C5910p c5910p) throws A {
        AbstractC5904j h11 = abstractC5903i.h();
        T t11 = (T) A(t2, h11, c5910p);
        try {
            h11.a(0);
            g(t11);
            return t11;
        } catch (A e11) {
            e11.j(t11);
            throw e11;
        }
    }

    protected static AbstractC5917x y(AbstractC5917x abstractC5917x, ByteArrayInputStream byteArrayInputStream, C5910p c5910p) throws A {
        AbstractC5917x A11 = A(abstractC5917x, new AbstractC5904j.b(byteArrayInputStream), c5910p);
        g(A11);
        return A11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.crypto.tink.shaded.protobuf.S, com.google.crypto.tink.shaded.protobuf.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.crypto.tink.shaded.protobuf.A, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.crypto.tink.shaded.protobuf.A, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.crypto.tink.shaded.protobuf.A, java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.crypto.tink.shaded.protobuf.A, java.io.IOException, java.lang.Throwable] */
    protected static <T extends AbstractC5917x<T, ?>> T z(T t2, byte[] bArr, C5910p c5910p) throws A {
        int length = bArr.length;
        if (length != 0) {
            ?? w11 = t2.w();
            try {
                c0 a11 = c0.a();
                a11.getClass();
                f0 b11 = a11.b(w11.getClass());
                b11.a(w11, bArr, 0, length, new C5899e.a(c5910p));
                b11.makeImmutable(w11);
                t2 = w11;
            } catch (A e11) {
                A a12 = e11;
                boolean a13 = a12.a();
                ?? r62 = a12;
                if (a13) {
                    r62 = new A(a12.getMessage(), a12);
                }
                r62.j(w11);
                throw r62;
            } catch (l0 e12) {
                ?? a14 = new A(e12.getMessage());
                a14.j(w11);
                throw a14;
            } catch (IOException e13) {
                if (e13.getCause() instanceof A) {
                    throw ((A) e13.getCause());
                }
                ?? a15 = new A(e13.getMessage(), e13);
                a15.j(w11);
                throw a15;
            } catch (IndexOutOfBoundsException unused) {
                ?? l11 = A.l();
                l11.j(w11);
                throw l11;
            }
        }
        g(t2);
        return t2;
    }

    public final BuilderType C() {
        BuilderType buildertype = (BuilderType) j(f.NEW_BUILDER);
        buildertype.g(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final void a(AbstractC5906l abstractC5906l) throws IOException {
        c0 a11 = c0.a();
        a11.getClass();
        a11.b(getClass()).f(this, C5907m.a(abstractC5906l));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5895a
    final int b() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5895a
    final int c(f0 f0Var) {
        int e11;
        int e12;
        if (r()) {
            if (f0Var == null) {
                c0 a11 = c0.a();
                a11.getClass();
                e12 = a11.b(getClass()).e(this);
            } else {
                e12 = f0Var.e(this);
            }
            if (e12 >= 0) {
                return e12;
            }
            throw new IllegalStateException(Ej.b.a(e12, "serialized size must be non-negative, was "));
        }
        if (b() != Integer.MAX_VALUE) {
            return b();
        }
        if (f0Var == null) {
            c0 a12 = c0.a();
            a12.getClass();
            e11 = a12.b(getClass()).e(this);
        } else {
            e11 = f0Var.e(this);
        }
        e(e11);
        return e11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5895a
    final void e(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(Ej.b.a(i11, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c0 a11 = c0.a();
        a11.getClass();
        return a11.b(getClass()).c(this, (AbstractC5917x) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final int getSerializedSize() {
        return c(null);
    }

    protected final <MessageType2 extends AbstractC5917x<MessageType2, BuilderType2>, BuilderType2 extends a<MessageType2, BuilderType2>> BuilderType2 h() {
        return (BuilderType2) j(f.NEW_BUILDER);
    }

    public final int hashCode() {
        if (r()) {
            c0 a11 = c0.a();
            a11.getClass();
            return a11.b(getClass()).d(this);
        }
        if (this.memoizedHashCode == 0) {
            c0 a12 = c0.a();
            a12.getClass();
            this.memoizedHashCode = a12.b(getClass()).d(this);
        }
        return this.memoizedHashCode;
    }

    protected final a i(f8.G g10) {
        a h11 = h();
        h11.g(g10);
        return h11;
    }

    protected abstract Object j(f fVar);

    @Override // com.google.crypto.tink.shaded.protobuf.T
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) j(f.GET_DEFAULT_INSTANCE);
    }

    public final a0<MessageType> n() {
        return (a0) j(f.GET_PARSER);
    }

    public final boolean p() {
        return q(this, true);
    }

    final boolean r() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected final void s() {
        c0 a11 = c0.a();
        a11.getClass();
        a11.b(getClass()).makeImmutable(this);
        t();
    }

    final void t() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return U.d(this, super.toString());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) j(f.NEW_BUILDER);
    }

    final MessageType w() {
        return (MessageType) j(f.NEW_MUTABLE_INSTANCE);
    }
}
