package com.ironsource;

import defpackage.km5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface A5<T> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a<T> implements A5<T> {

        @NotNull
        private final ArrayList<T> a;

        @NotNull
        private final ArrayList<T> b;

        public a(@NotNull ArrayList<T> arrayList, @NotNull ArrayList<T> arrayList2) {
            arrayList.getClass();
            arrayList2.getClass();
            this.a = arrayList;
            this.b = arrayList2;
        }

        @Override // com.ironsource.A5
        public boolean contains(T t) {
            return this.a.contains(t) || this.b.contains(t);
        }

        @Override // com.ironsource.A5
        public int size() {
            return this.b.size() + this.a.size();
        }

        @Override // com.ironsource.A5
        @NotNull
        public List<T> value() {
            return CollectionsKt.w0(this.b, this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b<T> implements A5<T> {

        @NotNull
        private final A5<T> a;

        @NotNull
        private final Comparator<T> b;

        public b(@NotNull A5<T> a5, @NotNull Comparator<T> comparator) {
            a5.getClass();
            comparator.getClass();
            this.a = a5;
            this.b = comparator;
        }

        @Override // com.ironsource.A5
        public boolean contains(T t) {
            return this.a.contains(t);
        }

        @Override // com.ironsource.A5
        public int size() {
            return this.a.size();
        }

        @Override // com.ironsource.A5
        @NotNull
        public List<T> value() {
            return CollectionsKt.H0(this.a.value(), this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c<T> implements A5<T> {
        private final int a;

        @NotNull
        private final List<T> b;

        public c(@NotNull A5<T> a5, int i) {
            a5.getClass();
            this.a = i;
            this.b = a5.value();
        }

        @NotNull
        public final List<T> a() {
            int size = this.b.size();
            int i = this.a;
            if (size <= i) {
                return km5.a;
            }
            List<T> list = this.b;
            return list.subList(i, list.size());
        }

        @NotNull
        public final List<T> b() {
            List<T> list = this.b;
            int size = list.size();
            int i = this.a;
            if (size > i) {
                size = i;
            }
            return list.subList(0, size);
        }

        @Override // com.ironsource.A5
        public boolean contains(T t) {
            return this.b.contains(t);
        }

        @Override // com.ironsource.A5
        public int size() {
            return this.b.size();
        }

        @Override // com.ironsource.A5
        @NotNull
        public List<T> value() {
            return this.b;
        }
    }

    boolean contains(T t);

    int size();

    @NotNull
    List<T> value();
}
