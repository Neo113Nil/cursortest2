package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2126a;
import androidx.datastore.preferences.protobuf.AbstractC2149y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2147w extends AbstractC2126a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2147w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.c();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends AbstractC2126a.AbstractC0371a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2147w f19680a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC2147w f19681b;

        public a(AbstractC2147w abstractC2147w) {
            this.f19680a = abstractC2147w;
            if (abstractC2147w.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f19681b = l();
        }

        public static void k(Object obj, Object obj2) {
            b0.a().d(obj).mergeFrom(obj, obj2);
        }

        private AbstractC2147w l() {
            return this.f19680a.E();
        }

        public final AbstractC2147w e() {
            AbstractC2147w buildPartial = buildPartial();
            if (buildPartial.w()) {
                return buildPartial;
            }
            throw AbstractC2126a.AbstractC0371a.d(buildPartial);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC2147w buildPartial() {
            if (!this.f19681b.y()) {
                return this.f19681b;
            }
            this.f19681b.z();
            return this.f19681b;
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.f19681b = buildPartial();
            return newBuilderForType;
        }

        public final void h() {
            if (this.f19681b.y()) {
                return;
            }
            i();
        }

        public void i() {
            AbstractC2147w l10 = l();
            k(l10, this.f19681b);
            this.f19681b = l10;
        }

        @Override // androidx.datastore.preferences.protobuf.Q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC2147w getDefaultInstanceForType() {
            return this.f19680a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static class b extends AbstractC2127b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC2147w f19682b;

        public b(AbstractC2147w abstractC2147w) {
            this.f19682b = abstractC2147w;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends AbstractC2138m {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC2149y.b B(AbstractC2149y.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object D(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    public static AbstractC2147w F(AbstractC2147w abstractC2147w, InputStream inputStream) {
        return g(G(abstractC2147w, AbstractC2133h.g(inputStream), C2140o.b()));
    }

    public static AbstractC2147w G(AbstractC2147w abstractC2147w, AbstractC2133h abstractC2133h, C2140o c2140o) {
        AbstractC2147w E10 = abstractC2147w.E();
        try {
            f0 d10 = b0.a().d(E10);
            d10.a(E10, C2134i.f(abstractC2133h), c2140o);
            d10.makeImmutable(E10);
            return E10;
        } catch (l0 e10) {
            throw e10.a().k(E10);
        } catch (C2150z e11) {
            e = e11;
            if (e.a()) {
                e = new C2150z(e);
            }
            throw e.k(E10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2150z) {
                throw ((C2150z) e12.getCause());
            }
            throw new C2150z(e12).k(E10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C2150z) {
                throw ((C2150z) e13.getCause());
            }
            throw e13;
        }
    }

    public static void H(Class cls, AbstractC2147w abstractC2147w) {
        abstractC2147w.A();
        defaultInstanceMap.put(cls, abstractC2147w);
    }

    public static AbstractC2147w g(AbstractC2147w abstractC2147w) {
        if (abstractC2147w == null || abstractC2147w.w()) {
            return abstractC2147w;
        }
        throw abstractC2147w.d().a().k(abstractC2147w);
    }

    public static AbstractC2149y.b p() {
        return c0.c();
    }

    public static AbstractC2147w q(Class cls) {
        AbstractC2147w abstractC2147w = defaultInstanceMap.get(cls);
        if (abstractC2147w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2147w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2147w != null) {
            return abstractC2147w;
        }
        AbstractC2147w defaultInstanceForType = ((AbstractC2147w) p0.i(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object v(Method method, Object obj, Object... objArr) {
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

    public static final boolean x(AbstractC2147w abstractC2147w, boolean z10) {
        byte byteValue = ((Byte) abstractC2147w.m(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = b0.a().d(abstractC2147w).isInitialized(abstractC2147w);
        if (z10) {
            abstractC2147w.n(d.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? abstractC2147w : null);
        }
        return isInitialized;
    }

    public void A() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) m(d.NEW_BUILDER);
    }

    public AbstractC2147w E() {
        return (AbstractC2147w) m(d.NEW_MUTABLE_INSTANCE);
    }

    public void I(int i10) {
        this.memoizedHashCode = i10;
    }

    public void J(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public void a(AbstractC2135j abstractC2135j) {
        b0.a().d(this).b(this, C2136k.g(abstractC2135j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2126a
    public int c(f0 f0Var) {
        if (!y()) {
            if (t() != Integer.MAX_VALUE) {
                return t();
            }
            int k10 = k(f0Var);
            J(k10);
            return k10;
        }
        int k11 = k(f0Var);
        if (k11 >= 0) {
            return k11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + k11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).equals(this, (AbstractC2147w) obj);
        }
        return false;
    }

    public Object f() {
        return m(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public int getSerializedSize() {
        return c(null);
    }

    public void h() {
        this.memoizedHashCode = 0;
    }

    public int hashCode() {
        if (y()) {
            return j();
        }
        if (u()) {
            I(j());
        }
        return s();
    }

    public void i() {
        J(Integer.MAX_VALUE);
    }

    public int j() {
        return b0.a().d(this).hashCode(this);
    }

    public final int k(f0 f0Var) {
        return f0Var == null ? b0.a().d(this).getSerializedSize(this) : f0Var.getSerializedSize(this);
    }

    public final a l() {
        return (a) m(d.NEW_BUILDER);
    }

    public Object m(d dVar) {
        return o(dVar, null, null);
    }

    public Object n(d dVar, Object obj) {
        return o(dVar, obj, null);
    }

    public abstract Object o(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.Q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC2147w getDefaultInstanceForType() {
        return (AbstractC2147w) m(d.GET_DEFAULT_INSTANCE);
    }

    public int s() {
        return this.memoizedHashCode;
    }

    public int t() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public String toString() {
        return S.f(this, super.toString());
    }

    public boolean u() {
        return s() == 0;
    }

    public final boolean w() {
        return x(this, true);
    }

    public boolean y() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void z() {
        b0.a().d(this).makeImmutable(this);
        A();
    }
}
