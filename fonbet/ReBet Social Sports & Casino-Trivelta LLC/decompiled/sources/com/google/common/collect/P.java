package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class P {

    public class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36734a;

        public a(int i10) {
            this.f36734a = i10;
        }

        @Override // com.google.common.collect.P.e
        public Map c() {
            return X.c(this.f36734a);
        }
    }

    public class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f36735a;

        public b(Comparator comparator) {
            this.f36735a = comparator;
        }

        @Override // com.google.common.collect.P.e
        public Map c() {
            return new TreeMap(this.f36735a);
        }
    }

    public static final class c implements Ra.t, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f36736a;

        public c(int i10) {
            this.f36736a = AbstractC3431k.b(i10, "expectedValuesPerKey");
        }

        @Override // Ra.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f36736a);
        }
    }

    public static abstract class d extends P {
        public d() {
            super(null);
        }

        public abstract K e();
    }

    public static abstract class e {

        public class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36737a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f36738b;

            public a(e eVar, int i10) {
                this.f36737a = i10;
                this.f36738b = eVar;
            }

            @Override // com.google.common.collect.P.d
            public K e() {
                return Q.b(this.f36738b.c(), new c(this.f36737a));
            }
        }

        public d a() {
            return b(2);
        }

        public d b(int i10) {
            AbstractC3431k.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        public abstract Map c();
    }

    public /* synthetic */ P(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i10) {
        AbstractC3431k.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e c() {
        return d(W.h());
    }

    public static e d(Comparator comparator) {
        Ra.n.k(comparator);
        return new b(comparator);
    }

    public P() {
    }
}
