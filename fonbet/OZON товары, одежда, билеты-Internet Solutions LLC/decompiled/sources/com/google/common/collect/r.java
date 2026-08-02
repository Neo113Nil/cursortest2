package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final r f59130a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final r f59131b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final r f59132c = new b(1);

    final class a extends r {
        static r j(int i11) {
            return i11 < 0 ? r.f59131b : i11 > 0 ? r.f59132c : r.f59130a;
        }

        @Override // com.google.common.collect.r
        public final r d(int i11, int i12) {
            return j(Integer.compare(i11, i12));
        }

        @Override // com.google.common.collect.r
        public final <T> r e(T t2, T t11, Comparator<T> comparator) {
            return j(comparator.compare(t2, t11));
        }

        @Override // com.google.common.collect.r
        public final r f(boolean z11, boolean z12) {
            return j(Boolean.compare(z11, z12));
        }

        @Override // com.google.common.collect.r
        public final r g(boolean z11, boolean z12) {
            return j(Boolean.compare(z12, z11));
        }

        @Override // com.google.common.collect.r
        public final int h() {
            return 0;
        }
    }

    private static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        final int f59133d;

        b(int i11) {
            this.f59133d = i11;
        }

        @Override // com.google.common.collect.r
        public final r d(int i11, int i12) {
            return this;
        }

        @Override // com.google.common.collect.r
        public final <T> r e(T t2, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.r
        public final r f(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.r
        public final r g(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.r
        public final int h() {
            return this.f59133d;
        }
    }

    public static r i() {
        return f59130a;
    }

    public abstract r d(int i11, int i12);

    public abstract <T> r e(T t2, T t11, Comparator<T> comparator);

    public abstract r f(boolean z11, boolean z12);

    public abstract r g(boolean z11, boolean z12);

    public abstract int h();
}
