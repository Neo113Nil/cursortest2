package ru.ozon.composer.ui.widget;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f94868a;

    /* loaded from: classes3.dex */
    public static final class a extends h {

        /* renamed from: b, reason: collision with root package name */
        private final int f94869b;

        public a(int i11) {
            super(i11);
            this.f94869b = i11;
        }

        @Override // ru.ozon.composer.ui.widget.h
        public final int a() {
            return this.f94869b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f94869b == ((a) obj).f94869b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f94869b);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f94869b, ")", new StringBuilder("Custom(spanSize="));
        }
    }

    public static final class b extends h {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f94870b = new b(600);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -598192345;
        }

        @NotNull
        public final String toString() {
            return "ProductLarge";
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends h {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f94871b = new c(400);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1332184823;
        }

        @NotNull
        public final String toString() {
            return "ProductMedium";
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends h {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f94872b = new d(300);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -591386381;
        }

        @NotNull
        public final String toString() {
            return "ProductSmall";
        }
    }

    public static final class e extends h {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f94873b = new e(-1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 400595004;
        }

        @NotNull
        public final String toString() {
            return "Unspecified";
        }
    }

    public static final class f extends h {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f94874b = new f(ru.ozon.composer.compose.widget.scrollable.m.f94768d);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1185709599;
        }

        @NotNull
        public final String toString() {
            return "Widget";
        }
    }

    public h(int i11) {
        this.f94868a = i11;
    }

    public int a() {
        return this.f94868a;
    }
}
