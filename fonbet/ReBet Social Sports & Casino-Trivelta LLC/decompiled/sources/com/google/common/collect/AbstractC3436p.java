package com.google.common.collect;

import java.util.Comparator;

/* renamed from: com.google.common.collect.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3436p {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3436p f36854a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC3436p f36855b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC3436p f36856c = new b(1);

    /* renamed from: com.google.common.collect.p$a */
    public class a extends AbstractC3436p {
        public a() {
            super(null);
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        @Override // com.google.common.collect.AbstractC3436p
        public int i() {
            return 0;
        }

        public AbstractC3436p k(int i10) {
            return i10 < 0 ? AbstractC3436p.f36855b : i10 > 0 ? AbstractC3436p.f36856c : AbstractC3436p.f36854a;
        }
    }

    /* renamed from: com.google.common.collect.p$b */
    public static final class b extends AbstractC3436p {

        /* renamed from: d, reason: collision with root package name */
        public final int f36857d;

        public b(int i10) {
            super(null);
            this.f36857d = i10;
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p g(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3436p
        public AbstractC3436p h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3436p
        public int i() {
            return this.f36857d;
        }
    }

    public /* synthetic */ AbstractC3436p(a aVar) {
        this();
    }

    public static AbstractC3436p j() {
        return f36854a;
    }

    public abstract AbstractC3436p d(int i10, int i11);

    public abstract AbstractC3436p e(long j10, long j11);

    public abstract AbstractC3436p f(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC3436p g(boolean z10, boolean z11);

    public abstract AbstractC3436p h(boolean z10, boolean z11);

    public abstract int i();

    public AbstractC3436p() {
    }
}
