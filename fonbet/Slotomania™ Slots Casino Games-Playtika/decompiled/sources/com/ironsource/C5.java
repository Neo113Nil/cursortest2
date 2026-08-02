package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public interface C5<T> {

    public static final class a<T> implements C5<T> {
        private final ArrayList<T> a;
        private final ArrayList<T> b;

        public a(ArrayList<T> a, ArrayList<T> b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            this.a = a;
            this.b = b;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.a.contains(t) || this.b.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.a.size() + this.b.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return CollectionsKt.plus((Collection) this.a, (Iterable) this.b);
        }
    }

    public static final class b<T> implements C5<T> {
        private final C5<T> a;
        private final Comparator<T> b;

        public b(C5<T> collection, Comparator<T> comparator) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.a = collection;
            this.b = comparator;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.a.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.a.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return CollectionsKt.sortedWith(this.a.value(), this.b);
        }
    }

    public static final class c<T> implements C5<T> {
        private final int a;
        private final List<T> b;

        public c(C5<T> collection, int i) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            this.a = i;
            this.b = collection.value();
        }

        public final List<T> a() {
            int size = this.b.size();
            int i = this.a;
            if (size <= i) {
                return CollectionsKt.emptyList();
            }
            List<T> list = this.b;
            return list.subList(i, list.size());
        }

        public final List<T> b() {
            List<T> list = this.b;
            return list.subList(0, RangesKt.coerceAtMost(list.size(), this.a));
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.b.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.b.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return this.b;
        }
    }

    boolean contains(T t);

    int size();

    List<T> value();
}
