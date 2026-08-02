package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.a;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.m;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.czi;
import xsna.la20;
import xsna.lhg;
import xsna.m8h0;
import xsna.oa20;
import xsna.v8e0;
import xsna.w5q0;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected f0 unknownFields = f0.f;

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

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0027a<MessageType, BuilderType> {
        public final MessageType b;
        public MessageType c;

        public a(MessageType messagetype) {
            this.b = messagetype;
            if (messagetype.j()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.c = (MessageType) messagetype.l();
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.b.f(MethodToInvoke.NEW_BUILDER);
            aVar.c = i();
            return aVar;
        }

        public final MessageType e() {
            MessageType i = i();
            i.getClass();
            if (GeneratedMessageLite.i(i, true)) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType i() {
            if (!this.c.j()) {
                return this.c;
            }
            MessageType messagetype = this.c;
            messagetype.getClass();
            v8e0 v8e0Var = v8e0.c;
            v8e0Var.getClass();
            v8e0Var.a(messagetype.getClass()).d(messagetype);
            messagetype.k();
            return this.c;
        }

        public final void j() {
            if (this.c.j()) {
                return;
            }
            MessageType messagetype = (MessageType) this.b.l();
            MessageType messagetype2 = this.c;
            v8e0 v8e0Var = v8e0.c;
            v8e0Var.getClass();
            v8e0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.c = messagetype;
        }
    }

    /* loaded from: classes12.dex */
    public static class b<T extends GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
        public b(T t) {
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements oa20 {
        protected m<d> extensions = m.d;

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, xsna.oa20
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) f(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, xsna.la20
        public final a newBuilderForType() {
            return (a) f(MethodToInvoke.NEW_BUILDER);
        }
    }

    /* loaded from: classes12.dex */
    public static final class d implements m.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.m.b
        public final WireFormat$JavaType getLiteJavaType() {
            throw null;
        }
    }

    /* loaded from: classes12.dex */
    public static class e<ContainingType extends la20, Type> extends czi {
        public static void r() {
            throw null;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T g(Class<T> cls) {
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
        T t2 = (T) ((GeneratedMessageLite) w5q0.d(cls)).f(MethodToInvoke.GET_DEFAULT_INSTANCE);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Object h(Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
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

    public static final <T extends GeneratedMessageLite<T, ?>> boolean i(T t, boolean z) {
        byte byteValue = ((Byte) t.f(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        v8e0 v8e0Var = v8e0.c;
        v8e0Var.getClass();
        boolean c2 = v8e0Var.a(t.getClass()).c(t);
        if (z) {
            t.f(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c2;
    }

    public static <T extends GeneratedMessageLite<?, ?>> void m(Class<T> cls, T t) {
        t.k();
        defaultInstanceMap.put(cls, t);
    }

    @Override // xsna.oa20
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) f(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // xsna.la20
    public final void b(CodedOutputStream codedOutputStream) throws IOException {
        v8e0 v8e0Var = v8e0.c;
        v8e0Var.getClass();
        m8h0 a2 = v8e0Var.a(getClass());
        h hVar = codedOutputStream.c;
        if (hVar == null) {
            hVar = new h(codedOutputStream);
        }
        a2.h(this, hVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int d(m8h0 m8h0Var) {
        int e2;
        int e3;
        if (j()) {
            if (m8h0Var == null) {
                v8e0 v8e0Var = v8e0.c;
                v8e0Var.getClass();
                e3 = v8e0Var.a(getClass()).e(this);
            } else {
                e3 = m8h0Var.e(this);
            }
            if (e3 >= 0) {
                return e3;
            }
            throw new IllegalStateException(lhg.a(e3, "serialized size must be non-negative, was "));
        }
        if (c() != Integer.MAX_VALUE) {
            return c();
        }
        if (m8h0Var == null) {
            v8e0 v8e0Var2 = v8e0.c;
            v8e0Var2.getClass();
            e2 = v8e0Var2.a(getClass()).e(this);
        } else {
            e2 = m8h0Var.e(this);
        }
        e(e2);
        return e2;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException(lhg.a(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v8e0 v8e0Var = v8e0.c;
        v8e0Var.getClass();
        return v8e0Var.a(getClass()).g(this, (GeneratedMessageLite) obj);
    }

    public abstract Object f(MethodToInvoke methodToInvoke);

    @Override // xsna.la20
    public final int getSerializedSize() {
        return d(null);
    }

    public final int hashCode() {
        if (j()) {
            v8e0 v8e0Var = v8e0.c;
            v8e0Var.getClass();
            return v8e0Var.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            v8e0 v8e0Var2 = v8e0.c;
            v8e0Var2.getClass();
            this.memoizedHashCode = v8e0Var2.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MessageType l() {
        return (MessageType) f(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    @Override // xsna.la20
    public a newBuilderForType() {
        return (a) f(MethodToInvoke.NEW_BUILDER);
    }

    public final String toString() {
        return w.d(this, super.toString());
    }
}
