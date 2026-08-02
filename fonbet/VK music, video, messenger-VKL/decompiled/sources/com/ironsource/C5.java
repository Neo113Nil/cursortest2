package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j5g;

/* loaded from: classes13.dex */
public interface C5<T> {

    public static final class a<T> implements C5<T> {
        private final ArrayList<T> a;
        private final ArrayList<T> b;

        public a(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
            this.a = arrayList;
            this.b = arrayList2;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.a.contains(t) || this.b.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.b.size() + this.a.size();
        }

        @Override // com.ironsource.C5
        public List<T> value() {
            return j5g.u0(this.b, this.a);
        }
    }

    public static final class b<T> implements C5<T> {
        private final C5<T> a;
        private final Comparator<T> b;

        public b(C5<T> c5, Comparator<T> comparator) {
            this.a = c5;
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
            return j5g.D0(this.b, this.a.value());
        }
    }

    public static final class c<T> implements C5<T> {
        private final int a;
        private final List<T> b;

        public c(C5<T> c5, int i) {
            this.a = i;
            this.b = c5.value();
        }

        public final List<T> a() {
            int size = this.b.size();
            int i = this.a;
            if (size <= i) {
                return EmptyList.b;
            }
            List<T> list = this.b;
            return list.subList(i, list.size());
        }

        public final List<T> b() {
            List<T> list = this.b;
            int size = list.size();
            int i = this.a;
            if (size > i) {
                size = i;
            }
            return list.subList(0, size);
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
