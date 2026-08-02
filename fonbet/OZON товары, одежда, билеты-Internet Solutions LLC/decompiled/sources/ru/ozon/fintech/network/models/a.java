package ru.ozon.fintech.network.models;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: ru.ozon.fintech.network.models.a$a, reason: collision with other inner class name */
    public static final class C2102a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final Exception f96628a;

        public C2102a() {
            this(null);
        }

        public final Exception a() {
            return this.f96628a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2102a) && Intrinsics.d(this.f96628a, ((C2102a) obj).f96628a);
        }

        public final int hashCode() {
            Exception exc = this.f96628a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(e=" + this.f96628a + ")";
        }

        public C2102a(Exception exc) {
            super(0);
            this.f96628a = exc;
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f96629a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -951298123;
        }

        @NotNull
        public final String toString() {
            return "Idle";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f96630a = new c(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -697368178;
        }

        @NotNull
        public final String toString() {
            return "Progress";
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
