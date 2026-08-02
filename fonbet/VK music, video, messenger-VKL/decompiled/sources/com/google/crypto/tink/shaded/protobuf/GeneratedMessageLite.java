package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.a;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.g;
import com.google.crypto.tink.shaded.protobuf.n;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.b920;
import xsna.ka20;
import xsna.na20;
import xsna.t8e0;
import xsna.u5q0;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected f0 unknownFields = f0.f;
    protected int memoizedSerializedSize = -1;

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

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0135a<MessageType, BuilderType> {
        public final MessageType b;
        public MessageType c;
        public boolean d = false;

        public a(MessageType messagetype) {
            this.b = messagetype;
            this.c = (MessageType) messagetype.h(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        public static void n(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            t8e0 t8e0Var = t8e0.c;
            t8e0Var.getClass();
            t8e0Var.a(generatedMessageLite.getClass()).f(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.b.h(MethodToInvoke.NEW_BUILDER);
            MessageType k = k();
            aVar.l();
            n(aVar.c, k);
            return aVar;
        }

        public final MessageType j() {
            MessageType k = k();
            if (k.l()) {
                return k;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType k() {
            if (this.d) {
                return this.c;
            }
            MessageType messagetype = this.c;
            messagetype.getClass();
            t8e0 t8e0Var = t8e0.c;
            t8e0Var.getClass();
            t8e0Var.a(messagetype.getClass()).d(messagetype);
            this.d = true;
            return this.c;
        }

        public final void l() {
            if (this.d) {
                MessageType messagetype = (MessageType) this.c.h(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                n(messagetype, this.c);
                this.c = messagetype;
                this.d = false;
            }
        }

        public final void m(GeneratedMessageLite generatedMessageLite) {
            l();
            n(this.c, generatedMessageLite);
        }
    }

    /* loaded from: classes13.dex */
    public static class b<T extends GeneratedMessageLite<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {
        public b(T t) {
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements na20 {
        protected n<d> extensions = n.d;

        public final n<d> p() {
            n<d> nVar = this.extensions;
            if (nVar.b) {
                this.extensions = nVar.clone();
            }
            return this.extensions;
        }
    }

    /* loaded from: classes13.dex */
    public static final class d implements n.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n.b
        public final WireFormat$JavaType getLiteJavaType() {
            throw null;
        }
    }

    /* loaded from: classes13.dex */
    public static class e<ContainingType extends ka20, Type> extends b920 {
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
        T t2 = (T) ((GeneratedMessageLite) u5q0.a(cls)).h(MethodToInvoke.GET_DEFAULT_INSTANCE);
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

    public static <T extends GeneratedMessageLite<T, ?>> T m(T t, ByteString byteString, k kVar) throws InvalidProtocolBufferException {
        g.a i = byteString.i();
        T t2 = (T) t.h(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            t8e0 t8e0Var = t8e0.c;
            t8e0Var.getClass();
            a0 a2 = t8e0Var.a(t2.getClass());
            h hVar = i.c;
            if (hVar == null) {
                hVar = new h(i);
            }
            a2.e(t2, hVar, kVar);
            a2.d(t2);
            try {
                i.a(0);
                if (t2.l()) {
                    return t2;
                }
                InvalidProtocolBufferException d2 = new UninitializedMessageException().d();
                d2.k(t2);
                throw d2;
            } catch (InvalidProtocolBufferException e2) {
                e2.k(t2);
                throw e2;
            }
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
            invalidProtocolBufferException.k(t2);
            throw invalidProtocolBufferException;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T n(T t, byte[] bArr, k kVar) throws InvalidProtocolBufferException {
        int length = bArr.length;
        T t2 = (T) t.h(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            t8e0 t8e0Var = t8e0.c;
            t8e0Var.getClass();
            a0 a2 = t8e0Var.a(t2.getClass());
            a2.g(t2, bArr, 0, length, new d.a(kVar));
            a2.d(t2);
            if (t2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (t2.l()) {
                return t2;
            }
            InvalidProtocolBufferException d2 = new UninitializedMessageException().d();
            d2.k(t2);
            throw d2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.k(t2);
            throw invalidProtocolBufferException;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException l = InvalidProtocolBufferException.l();
            l.k(t2);
            throw l;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void o(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // xsna.na20
    public final GeneratedMessageLite a() {
        return (GeneratedMessageLite) h(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int b() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void d(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // xsna.ka20
    public final a e() {
        return (a) h(MethodToInvoke.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) h(MethodToInvoke.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        t8e0 t8e0Var = t8e0.c;
        t8e0Var.getClass();
        return t8e0Var.a(getClass()).h(this, (GeneratedMessageLite) obj);
    }

    @Override // xsna.ka20
    public final void f(CodedOutputStream.a aVar) throws IOException {
        t8e0 t8e0Var = t8e0.c;
        t8e0Var.getClass();
        a0 a2 = t8e0Var.a(getClass());
        i iVar = aVar.a;
        if (iVar == null) {
            iVar = new i(aVar);
        }
        a2.j(this, iVar);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType g() {
        return (BuilderType) h(MethodToInvoke.NEW_BUILDER);
    }

    @Override // xsna.ka20
    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            t8e0 t8e0Var = t8e0.c;
            t8e0Var.getClass();
            this.memoizedSerializedSize = t8e0Var.a(getClass()).i(this);
        }
        return this.memoizedSerializedSize;
    }

    public abstract Object h(MethodToInvoke methodToInvoke);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        t8e0 t8e0Var = t8e0.c;
        t8e0Var.getClass();
        int a2 = t8e0Var.a(getClass()).a(this);
        this.memoizedHashCode = a2;
        return a2;
    }

    @Override // xsna.ka20
    public final a i() {
        a aVar = (a) h(MethodToInvoke.NEW_BUILDER);
        aVar.m(this);
        return aVar;
    }

    public final boolean l() {
        byte byteValue = ((Byte) h(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        t8e0 t8e0Var = t8e0.c;
        t8e0Var.getClass();
        boolean c2 = t8e0Var.a(getClass()).c(this);
        h(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return c2;
    }

    public final String toString() {
        return v.d(this, super.toString());
    }
}
