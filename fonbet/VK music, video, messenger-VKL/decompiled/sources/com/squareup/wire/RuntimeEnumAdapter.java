package com.squareup.wire;

import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.lang.reflect.Method;
import xsna.dcy;
import xsna.epx;
import xsna.fpf0;
import xsna.zcl;

/* compiled from: RuntimeEnumAdapter.kt */
/* loaded from: classes14.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    public static final Companion Companion = new Companion(null);
    private Method fromValueMethod;
    private final Class<E> javaType;

    /* compiled from: RuntimeEnumAdapter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> cls) {
            return new RuntimeEnumAdapter<>(cls, ProtoAdapter.Companion.get(cls).getSyntax());
        }

        private Companion() {
        }
    }

    public RuntimeEnumAdapter(Class<E> cls) {
        this(cls, Syntax.PROTO_2);
    }

    public static final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> cls) {
        return Companion.create(cls);
    }

    private final Method getFromValueMethod() {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        Method method2 = this.javaType.getMethod("fromValue", Integer.TYPE);
        this.fromValueMethod = method2;
        return method2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && epx.f(((RuntimeEnumAdapter) obj).getType(), getType());
    }

    @Override // com.squareup.wire.EnumAdapter
    public E fromValue(int i) {
        Object invoke = getFromValueMethod().invoke(null, Integer.valueOf(i));
        if (invoke != null) {
            return (E) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type E of com.squareup.wire.RuntimeEnumAdapter");
    }

    public int hashCode() {
        dcy<?> type = getType();
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }

    public RuntimeEnumAdapter(Class<E> cls, Syntax syntax) {
        super(fpf0.a(cls), syntax, Internal.getIdentityOrNull(cls));
        this.javaType = cls;
    }
}
