package com.google.common.collect;

import java.util.Iterator;

/* renamed from: com.google.common.collect.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3438s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Ra.k f36859a = Ra.k.a();

    /* renamed from: com.google.common.collect.s$a */
    public class a extends AbstractC3438s {
        final /* synthetic */ Iterable[] val$inputs;

        /* renamed from: com.google.common.collect.s$a$a, reason: collision with other inner class name */
        public class C0513a extends AbstractC3421a {
            public C0513a(int i10) {
                super(i10);
            }

            @Override // com.google.common.collect.AbstractC3421a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator a(int i10) {
                return a.this.val$inputs[i10].iterator();
            }
        }

        public a(Iterable[] iterableArr) {
            this.val$inputs = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return J.d(new C0513a(this.val$inputs.length));
        }
    }

    public static AbstractC3438s a(Iterable iterable, Iterable iterable2) {
        return b(iterable, iterable2);
    }

    public static AbstractC3438s b(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            Ra.n.k(iterable);
        }
        return new a(iterableArr);
    }

    public final Iterable c() {
        return (Iterable) this.f36859a.e(this);
    }

    public String toString() {
        return I.p(c());
    }
}
