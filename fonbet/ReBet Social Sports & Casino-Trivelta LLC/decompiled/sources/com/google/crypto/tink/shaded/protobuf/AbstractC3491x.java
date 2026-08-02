package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3469a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3473e;
import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3491x extends AbstractC3469a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC3491x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l0 unknownFields = l0.c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    public static abstract class a extends AbstractC3469a.AbstractC0520a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC3491x f37477a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC3491x f37478b;

        public a(AbstractC3491x abstractC3491x) {
            this.f37477a = abstractC3491x;
            if (abstractC3491x.x()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f37478b = k();
        }

        public static void j(Object obj, Object obj2) {
            a0.a().d(obj).mergeFrom(obj, obj2);
        }

        private AbstractC3491x k() {
            return this.f37477a.D();
        }

        public final AbstractC3491x c() {
            AbstractC3491x d10 = d();
            if (d10.v()) {
                return d10;
            }
            throw AbstractC3469a.AbstractC0520a.b(d10);
        }

        public AbstractC3491x d() {
            if (!this.f37478b.x()) {
                return this.f37478b;
            }
            this.f37478b.y();
            return this.f37478b;
        }

        public a e() {
            a B10 = h().B();
            B10.f37478b = d();
            return B10;
        }

        public final void f() {
            if (this.f37478b.x()) {
                return;
            }
            g();
        }

        public void g() {
            AbstractC3491x k10 = k();
            j(k10, this.f37478b);
            this.f37478b = k10;
        }

        public AbstractC3491x h() {
            return this.f37477a;
        }

        public a i(AbstractC3491x abstractC3491x) {
            if (h().equals(abstractC3491x)) {
                return this;
            }
            f();
            j(this.f37478b, abstractC3491x);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    public static class b extends AbstractC3470b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC3491x f37479b;

        public b(AbstractC3491x abstractC3491x) {
            this.f37479b = abstractC3491x;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    public static class c extends AbstractC3482n {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC3493z.d A(AbstractC3493z.d dVar) {
        int size = dVar.size();
        return dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object C(O o10, String str, Object[] objArr) {
        return new c0(o10, str, objArr);
    }

    public static AbstractC3491x E(AbstractC3491x abstractC3491x, AbstractC3476h abstractC3476h, C3484p c3484p) {
        return f(H(abstractC3491x, abstractC3476h, c3484p));
    }

    public static AbstractC3491x F(AbstractC3491x abstractC3491x, InputStream inputStream, C3484p c3484p) {
        return f(I(abstractC3491x, AbstractC3477i.f(inputStream), c3484p));
    }

    public static AbstractC3491x G(AbstractC3491x abstractC3491x, byte[] bArr, C3484p c3484p) {
        return f(J(abstractC3491x, bArr, 0, bArr.length, c3484p));
    }

    public static AbstractC3491x H(AbstractC3491x abstractC3491x, AbstractC3476h abstractC3476h, C3484p c3484p) {
        AbstractC3477i n10 = abstractC3476h.n();
        AbstractC3491x I10 = I(abstractC3491x, n10, c3484p);
        try {
            n10.a(0);
            return I10;
        } catch (A e10) {
            throw e10.k(I10);
        }
    }

    public static AbstractC3491x I(AbstractC3491x abstractC3491x, AbstractC3477i abstractC3477i, C3484p c3484p) {
        AbstractC3491x D10 = abstractC3491x.D();
        try {
            e0 d10 = a0.a().d(D10);
            d10.b(D10, C3478j.f(abstractC3477i), c3484p);
            d10.makeImmutable(D10);
            return D10;
        } catch (A e10) {
            e = e10;
            if (e.a()) {
                e = new A(e);
            }
            throw e.k(D10);
        } catch (j0 e11) {
            throw e11.a().k(D10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof A) {
                throw ((A) e12.getCause());
            }
            throw new A(e12).k(D10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof A) {
                throw ((A) e13.getCause());
            }
            throw e13;
        }
    }

    public static AbstractC3491x J(AbstractC3491x abstractC3491x, byte[] bArr, int i10, int i11, C3484p c3484p) {
        AbstractC3491x D10 = abstractC3491x.D();
        try {
            e0 d10 = a0.a().d(D10);
            d10.a(D10, bArr, i10, i10 + i11, new AbstractC3473e.a(c3484p));
            d10.makeImmutable(D10);
            return D10;
        } catch (A e10) {
            A a10 = e10;
            if (a10.a()) {
                a10 = new A(a10);
            }
            throw a10.k(D10);
        } catch (j0 e11) {
            throw e11.a().k(D10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof A) {
                throw ((A) e12.getCause());
            }
            throw new A(e12).k(D10);
        } catch (IndexOutOfBoundsException unused) {
            throw A.m().k(D10);
        }
    }

    public static void K(Class cls, AbstractC3491x abstractC3491x) {
        abstractC3491x.z();
        defaultInstanceMap.put(cls, abstractC3491x);
    }

    public static AbstractC3491x f(AbstractC3491x abstractC3491x) {
        if (abstractC3491x == null || abstractC3491x.v()) {
            return abstractC3491x;
        }
        throw abstractC3491x.d().a().k(abstractC3491x);
    }

    public static AbstractC3493z.d o() {
        return b0.c();
    }

    public static AbstractC3491x p(Class cls) {
        AbstractC3491x abstractC3491x = defaultInstanceMap.get(cls);
        if (abstractC3491x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3491x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC3491x != null) {
            return abstractC3491x;
        }
        AbstractC3491x q10 = ((AbstractC3491x) o0.k(cls)).q();
        if (q10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, q10);
        return q10;
    }

    public static Object u(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean w(AbstractC3491x abstractC3491x, boolean z10) {
        byte byteValue = ((Byte) abstractC3491x.l(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = a0.a().d(abstractC3491x).isInitialized(abstractC3491x);
        if (z10) {
            abstractC3491x.m(d.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? abstractC3491x : null);
        }
        return isInitialized;
    }

    public final a B() {
        return (a) l(d.NEW_BUILDER);
    }

    public AbstractC3491x D() {
        return (AbstractC3491x) l(d.NEW_MUTABLE_INSTANCE);
    }

    public void L(int i10) {
        this.memoizedHashCode = i10;
    }

    public void M(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public final a N() {
        return ((a) l(d.NEW_BUILDER)).i(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public void a(AbstractC3479k abstractC3479k) {
        a0.a().d(this).c(this, C3480l.g(abstractC3479k));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3469a
    public int b(e0 e0Var) {
        if (!x()) {
            if (s() != Integer.MAX_VALUE) {
                return s();
            }
            int j10 = j(e0Var);
            M(j10);
            return j10;
        }
        int j11 = j(e0Var);
        if (j11 >= 0) {
            return j11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + j11);
    }

    public Object e() {
        return l(d.BUILD_MESSAGE_INFO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a0.a().d(this).equals(this, (AbstractC3491x) obj);
        }
        return false;
    }

    public void g() {
        this.memoizedHashCode = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public int getSerializedSize() {
        return b(null);
    }

    public void h() {
        M(Integer.MAX_VALUE);
    }

    public int hashCode() {
        if (x()) {
            return i();
        }
        if (t()) {
            L(i());
        }
        return r();
    }

    public int i() {
        return a0.a().d(this).hashCode(this);
    }

    public final int j(e0 e0Var) {
        return e0Var == null ? a0.a().d(this).getSerializedSize(this) : e0Var.getSerializedSize(this);
    }

    public final a k() {
        return (a) l(d.NEW_BUILDER);
    }

    public Object l(d dVar) {
        return n(dVar, null, null);
    }

    public Object m(d dVar, Object obj) {
        return n(dVar, obj, null);
    }

    public abstract Object n(d dVar, Object obj, Object obj2);

    public final AbstractC3491x q() {
        return (AbstractC3491x) l(d.GET_DEFAULT_INSTANCE);
    }

    public int r() {
        return this.memoizedHashCode;
    }

    public int s() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean t() {
        return r() == 0;
    }

    public String toString() {
        return Q.f(this, super.toString());
    }

    public final boolean v() {
        return w(this, true);
    }

    public boolean x() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void y() {
        a0.a().d(this).makeImmutable(this);
        z();
    }

    public void z() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }
}
