package com.google.common.collect;

import com.google.common.collect.B;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.common.collect.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3442w extends B implements Map {
    private static final long serialVersionUID = 912559;

    /* renamed from: com.google.common.collect.w$a */
    public static final class a extends B.a {
        public a() {
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC3442w a() {
            return c();
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC3442w c() {
            int i10 = this.f36668b;
            if (i10 == 0) {
                return AbstractC3442w.t();
            }
            if (this.f36667a != null) {
                if (this.f36669c) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, i10 * 2);
                }
                B.a.j(this.alternatingKeysAndValues, this.f36668b, this.f36667a);
            }
            this.f36669c = true;
            return new Y(this.alternatingKeysAndValues, this.f36668b);
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a f(Object obj, Object obj2) {
            super.f(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a g(Map.Entry entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a h(Iterable iterable) {
            super.h(iterable);
            return this;
        }

        @Override // com.google.common.collect.B.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a i(Map map) {
            super.i(map);
            return this;
        }

        public a(int i10) {
            super(i10);
        }
    }

    /* renamed from: com.google.common.collect.w$b */
    public static class b extends B.b {
        private static final long serialVersionUID = 0;

        public b(AbstractC3442w abstractC3442w) {
            super(abstractC3442w);
        }

        @Override // com.google.common.collect.B.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            return new a(i10);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static AbstractC3442w t() {
        return Y.f36741h;
    }

    @Override // com.google.common.collect.B
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final E h() {
        throw new AssertionError("should never be called");
    }

    public abstract AbstractC3442w s();

    @Override // com.google.common.collect.B, java.util.Map
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public E values() {
        return s().keySet();
    }

    @Override // com.google.common.collect.B
    public Object writeReplace() {
        return new b(this);
    }
}
