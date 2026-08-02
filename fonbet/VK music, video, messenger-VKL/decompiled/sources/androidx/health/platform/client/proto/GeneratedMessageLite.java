package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.GeneratedMessageLite.a;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.d;
import androidx.health.platform.client.proto.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ja20;
import xsna.lhg;
import xsna.ma20;
import xsna.s8e0;
import xsna.t5q0;
import xsna.wn4;

/* loaded from: classes12.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.health.platform.client.proto.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected d1 unknownFields = d1.f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {
        private static final /* synthetic */ MethodToInvoke[] $VALUES;
        public static final MethodToInvoke BUILD_MESSAGE_INFO;
        public static final MethodToInvoke GET_DEFAULT_INSTANCE;
        public static final MethodToInvoke GET_MEMOIZED_IS_INITIALIZED;
        public static final MethodToInvoke GET_PARSER;
        public static final MethodToInvoke NEW_BUILDER;
        public static final MethodToInvoke NEW_MUTABLE_INSTANCE;
        public static final MethodToInvoke SET_MEMOIZED_IS_INITIALIZED;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            NEW_BUILDER = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            GET_PARSER = methodToInvoke7;
            $VALUES = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) $VALUES.clone();
        }
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0036a<MessageType, BuilderType> {
        public final MessageType b;
        public MessageType c;

        public a(MessageType messagetype) {
            this.b = messagetype;
            if (messagetype.m()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.c = (MessageType) messagetype.p();
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.b.i(MethodToInvoke.NEW_BUILDER);
            aVar.c = i();
            return aVar;
        }

        public final MessageType e() {
            MessageType i = i();
            i.getClass();
            if (GeneratedMessageLite.l(i, true)) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType i() {
            if (!this.c.m()) {
                return this.c;
            }
            this.c.n();
            return this.c;
        }

        public final void j() {
            if (this.c.m()) {
                return;
            }
            MessageType messagetype = (MessageType) this.b.p();
            MessageType messagetype2 = this.c;
            s8e0 s8e0Var = s8e0.c;
            s8e0Var.getClass();
            s8e0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.c = messagetype;
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends androidx.health.platform.client.proto.b<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements ma20 {
        protected y<d> extensions = y.d;

        @Override // androidx.health.platform.client.proto.GeneratedMessageLite, xsna.ma20
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) i(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.health.platform.client.proto.GeneratedMessageLite, xsna.ja20
        public final a newBuilderForType() {
            return (a) i(MethodToInvoke.NEW_BUILDER);
        }
    }

    public static final class d implements y.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // androidx.health.platform.client.proto.y.b
        public final WireFormat$JavaType getLiteJavaType() {
            throw null;
        }
    }

    public static class e<ContainingType extends ja20, Type> extends wn4 {
    }

    public static <T extends GeneratedMessageLite<?, ?>> T j(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) t5q0.b(cls)).i(MethodToInvoke.GET_DEFAULT_INSTANCE);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Object k(Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean l(T t, boolean z) {
        byte byteValue = ((Byte) t.i(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        s8e0 s8e0Var = s8e0.c;
        s8e0Var.getClass();
        boolean c2 = s8e0Var.a(t.getClass()).c(t);
        if (z) {
            t.i(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.health.platform.client.proto.GeneratedMessageLite, java.lang.Object, xsna.ja20] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.health.platform.client.proto.InvalidProtocolBufferException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.health.platform.client.proto.InvalidProtocolBufferException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.health.platform.client.proto.InvalidProtocolBufferException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.health.platform.client.proto.InvalidProtocolBufferException, java.lang.Throwable] */
    public static <T extends GeneratedMessageLite<T, ?>> T q(T t, byte[] bArr) throws InvalidProtocolBufferException {
        int length = bArr.length;
        v a2 = v.a();
        if (length != 0) {
            ?? p = t.p();
            try {
                s8e0 s8e0Var = s8e0.c;
                s8e0Var.getClass();
                w0 a3 = s8e0Var.a(p.getClass());
                a3.e(p, bArr, 0, length, new d.a(a2));
                a3.d(p);
                t = p;
            } catch (InvalidProtocolBufferException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = e2;
                boolean d2 = invalidProtocolBufferException.d();
                ?? r6 = invalidProtocolBufferException;
                if (d2) {
                    r6 = new InvalidProtocolBufferException(invalidProtocolBufferException);
                }
                r6.k(p);
                throw r6;
            } catch (UninitializedMessageException e3) {
                ?? invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException2.k(p);
                throw invalidProtocolBufferException2;
            } catch (IOException e4) {
                if (e4.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e4.getCause());
                }
                ?? invalidProtocolBufferException3 = new InvalidProtocolBufferException(e4);
                invalidProtocolBufferException3.k(p);
                throw invalidProtocolBufferException3;
            } catch (IndexOutOfBoundsException unused) {
                ?? l = InvalidProtocolBufferException.l();
                l.k(p);
                throw l;
            }
        }
        if (t == null || l(t, true)) {
            return t;
        }
        InvalidProtocolBufferException invalidProtocolBufferException4 = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        invalidProtocolBufferException4.k(t);
        throw invalidProtocolBufferException4;
    }

    public static <T extends GeneratedMessageLite<?, ?>> void r(Class<T> cls, T t) {
        t.o();
        defaultInstanceMap.put(cls, t);
    }

    @Override // xsna.ma20
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) i(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // xsna.ja20
    public final void b(CodedOutputStream codedOutputStream) throws IOException {
        s8e0 s8e0Var = s8e0.c;
        s8e0Var.getClass();
        w0 a2 = s8e0Var.a(getClass());
        h hVar = codedOutputStream.a;
        if (hVar == null) {
            hVar = new h(codedOutputStream);
        }
        a2.g(this, hVar);
    }

    @Override // androidx.health.platform.client.proto.a
    public final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.health.platform.client.proto.a
    public final int e(w0 w0Var) {
        int h;
        int h2;
        if (m()) {
            if (w0Var == null) {
                s8e0 s8e0Var = s8e0.c;
                s8e0Var.getClass();
                h2 = s8e0Var.a(getClass()).h(this);
            } else {
                h2 = w0Var.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            throw new IllegalStateException(lhg.a(h2, "serialized size must be non-negative, was "));
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        if (w0Var == null) {
            s8e0 s8e0Var2 = s8e0.c;
            s8e0Var2.getClass();
            h = s8e0Var2.a(getClass()).h(this);
        } else {
            h = w0Var.h(this);
        }
        g(h);
        return h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s8e0 s8e0Var = s8e0.c;
        s8e0Var.getClass();
        return s8e0Var.a(getClass()).i(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.health.platform.client.proto.a
    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException(lhg.a(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // xsna.ja20
    public final int getSerializedSize() {
        return e(null);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType h() {
        return (BuilderType) i(MethodToInvoke.NEW_BUILDER);
    }

    public final int hashCode() {
        if (m()) {
            s8e0 s8e0Var = s8e0.c;
            s8e0Var.getClass();
            return s8e0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            s8e0 s8e0Var2 = s8e0.c;
            s8e0Var2.getClass();
            this.memoizedHashCode = s8e0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(MethodToInvoke methodToInvoke);

    public final boolean m() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void n() {
        s8e0 s8e0Var = s8e0.c;
        s8e0Var.getClass();
        s8e0Var.a(getClass()).d(this);
        o();
    }

    @Override // xsna.ja20
    public a newBuilderForType() {
        return (a) i(MethodToInvoke.NEW_BUILDER);
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MessageType p() {
        return (MessageType) i(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = i0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        i0.c(this, sb, 0);
        return sb.toString();
    }
}
